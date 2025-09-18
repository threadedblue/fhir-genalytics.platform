#!/usr/bin/env python3
from __future__ import annotations

import argparse
import mimetypes
import os
import sys
import time
from pathlib import Path
from typing import Dict, Iterable, Iterator, Optional, Tuple

import requests
import json
from json import JSONDecodeError


def parse_headers(header_list: Optional[Iterable[str]]) -> Dict[str, str]:
    headers: Dict[str, str] = {}
    for h in header_list or []:
        if ":" not in h:
            raise ValueError(f"Bad header (use 'Name: Value'): {h}")
        k, v = h.split(":", 1)
        headers[k.strip()] = v.strip()
    return headers


def iter_files(root: Path, pattern: str, recursive: bool) -> Iterator[Path]:
    if recursive:
        yield from (p for p in root.rglob(pattern) if p.is_file())
    else:
        yield from (p for p in root.glob(pattern) if p.is_file())


def main() -> None:
    ap = argparse.ArgumentParser(description="POST/PUT files in a directory to a URL")
    # Destination + query params
    ap.add_argument("--url", required=True, help="Destination URL (e.g. http://localhost:5102/ins)")
    ap.add_argument("--format", dest="format", default=None, help="Query param 'format', e.g. JSON")
    ap.add_argument("--table_name", dest="table_name", default=None, help="Query param 'tableName'")

    # Files to send
    ap.add_argument("--dir", required=True, help="Directory containing files")
    ap.add_argument("--pattern", default="*", help="Glob to match files (default: *)")
    ap.add_argument("--recursive", action="store_true", help="Recurse into subdirectories")

    # HTTP details
    ap.add_argument("--method", default="POST", choices=["POST", "PUT"], help="HTTP method (default: POST)")
    ap.add_argument("-H", "--header", action="append",
                    help="Custom header (repeatable). Example: -H 'X-Env: dev'")
    ap.add_argument("--bearer", help="Bearer token (sets Authorization: Bearer ...)")
    ap.add_argument("--auth", help="Basic auth as 'user:pass'")

    # Body modes
    ap.add_argument("--multipart", action="store_true",
                    help="Send file as multipart/form-data (field name via --field-name)")
    ap.add_argument("--field-name", default="file",
                    help="Multipart field name (default: file)")
    ap.add_argument("--content-type",
                    help="Force Content-Type (raw body mode; normally guessed from filename)")

    # Behavior
    ap.add_argument("--dry-run", action="store_true", help="Print what would happen; do not send")
    ap.add_argument("--retries", type=int, default=2, help="Retries per file on failure (default: 2)")
    ap.add_argument("--sleep", type=float, default=0.0, help="Sleep seconds between files")
    ap.add_argument("-v", "--verbose", action="store_true", help="Verbose output")
    ap.add_argument("--break-each", dest="break_each", action="store_true",
                    help="Drop into debugger before each request")
    args = ap.parse_args()

    root = Path(os.path.expanduser(args.dir)).resolve()
    if not root.is_dir():
        print(f"ERROR: not a directory: {root}", file=sys.stderr)
        sys.exit(2)

    headers = parse_headers(args.header)
    if args.bearer:
        headers.setdefault("Authorization", f"Bearer {args.bearer}")

    auth: Optional[Tuple[str, str]] = None
    if args.auth:
        user, sep, pwd = args.auth.partition(":")
        if not sep:
            print("ERROR: --auth must be 'user:pass'", file=sys.stderr)
            sys.exit(2)
        auth = (user, pwd)

    files_to_send = list(iter_files(root, args.pattern, args.recursive))
    if not files_to_send:
        print("No files matched.", file=sys.stderr)
        sys.exit(1)

    # Query params (Requests will append these to the URL)
    qparams: Dict[str, str] = {}
    if args.format:
        qparams["format"] = args.format
    if args.table_name:
        qparams["tableName"] = args.table_name  # note camelCase as your server expects

    sess = requests.Session()
    method = args.method.upper()
    ok = 0

    for i, p in enumerate(files_to_send, 1):
        if args.verbose:
            print(f"[{i}/{len(files_to_send)}] {p}")

        if args.dry_run:
            print(f"DRY RUN: {method} {args.url}  < {p.name}")
            continue

        if args.break_each:
            breakpoint()

        attempt = 0
        while True:
            attempt += 1
            try:
                if args.multipart:
                    # multipart/form-data
                    guessed_ct = args.content_type or (mimetypes.guess_type(p.name)[0] or "application/octet-stream")
                    with p.open("rb") as fh:
                        files_arg = {args.field_name: (p.name, fh, guessed_ct)}
                        r = sess.request(
                            method,
                            args.url,
                            params=qparams,
                            headers=headers,
                            files=files_arg,
                            auth=auth,
                            timeout=60,
                        )
                else:
                    # raw body
                    # raw body: server expects application/json envelope
                    # Parse the file content as JSON
                    try:
                        with p.open("r", encoding="utf-8") as fh:
                            file_json = json.load(fh)
                    except JSONDecodeError as e:
                        raise RuntimeError(f"{p.name} is not valid JSON: {e}") from e

                    # Build the envelope your Spring controller expects
                    # D4MRequest has tableName + payload; format stays in query params
                    if not args.table_name:
                        raise RuntimeError("Missing --table_name (or --table-name alias) required for envelope.")

                    envelope = {
                        "tableName": args.table_name,
                        "payload": file_json,
                    }

                    # Send JSON. Let requests set Content-Type: application/json
                    r = sess.request(
                        method,
                        args.url,
                        params=qparams,     # qparams already includes format/tableName if you want them in the URL
                        headers=headers,    # do NOT inject/override Content-Type here
                        json=envelope,      # <-- requests handles JSON serialization & header
                        auth=auth,
                        timeout=60,
                    )

                if 200 <= r.status_code < 300:
                    ok += 1
                    if args.verbose:
                        print(f"✔ {p.name} -> {r.status_code}")
                        body = (r.text or "")[:200].strip()
                        if body:
                            print(f"  resp: {body}")
                    else:
                        print(f"{p.name}: {r.status_code}")
                    break
                else:
                    print(f"✖ {p.name}: HTTP {r.status_code} — {r.text[:200]}", file=sys.stderr)
                    if attempt > args.retries:
                        break
                    time.sleep(min(2 ** attempt, 5))
            except Exception as e:
                print(f"✖ {p.name}: {e}", file=sys.stderr)
                if attempt > args.retries:
                    break
                time.sleep(min(2 ** attempt, 5))

        if args.sleep:
            time.sleep(args.sleep)

    print(f"\nDone. Success: {ok}/{len(files_to_send)}")
    sys.exit(0 if ok == len(files_to_send) else 1)


if __name__ == "__main__":
    main()
