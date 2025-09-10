#!/usr/bin/env python

import argparse, mimetypes, os, sys, time
from pathlib import Path
import requests

def parse_headers(header_list):
    headers = {}
    for h in header_list or []:
        if ":" not in h:
            raise ValueError(f"Bad header (use 'Name: Value'): {h}")
        k, v = h.split(":", 1)
        headers[k.strip()] = v.strip()
    return headers

def iter_files(root: Path, pattern: str, recursive: bool):
    if recursive:
        yield from (p for p in root.rglob(pattern) if p.is_file())
    else:
        yield from (p for p in root.glob(pattern) if p.is_file())

def main():
    ap = argparse.ArgumentParser(description="POST files in a directory to a URL")
    ap.add_argument("--url", required=True, help="Destination URL")
    ap.add_argument("--dir", required=True, help="Directory containing files")
    ap.add_argument("--pattern", default="*", help="Glob (default: *)")
    ap.add_argument("--recursive", action="store_true", help="Recurse into subdirs")
    ap.add_argument("--method", default="POST", choices=["POST", "PUT"], help="HTTP method")
    ap.add_argument("-H", "--header", action="append", help="Custom header (repeatable): 'Name: Value'")
    ap.add_argument("--bearer", help="Bearer token (sets Authorization header)")
    ap.add_argument("--auth", help="Basic auth 'user:pass'")
    ap.add_argument("--content-type", help="Force Content-Type (raw body mode)")
    ap.add_argument("--multipart", action="store_true", help="Send file as multipart/form-data (field name 'file')")
    ap.add_argument("--field-name", default="file", help="Multipart field name (default: file)")
    ap.add_argument("--dry-run", action="store_true", help="Print what would happen, do not send")
    ap.add_argument("--retries", type=int, default=2, help="Retries per file on failure (default: 2)")
    ap.add_argument("--sleep", type=float, default=0.0, help="Sleep seconds between files")
    ap.add_argument("-v", "--verbose", action="store_true", help="Verbose output")
    ap.add_argument("--break-each", action="store_true", help="Drop into debugger before each POST")
    args = ap.parse_args()

    root = Path(args.dir).expanduser().resolve()
    if not root.is_dir():
        print(f"ERROR: not a directory: {root}", file=sys.stderr)
        sys.exit(2)

    headers = parse_headers(args.header)
    if args.bearer:
        headers.setdefault("Authorization", f"Bearer {args.bearer}")

    auth = None
    if args.auth:
        user, sep, pwd = args.auth.partition(":")
        if not sep:
            print("ERROR: --auth must be 'user:pass'", file=sys.stderr)
            sys.exit(2)
        auth = (user, pwd)

    files = list(iter_files(root, args.pattern, args.recursive))
    if not files:
        print("No files matched.", file=sys.stderr)
        sys.exit(1)

    sess = requests.Session()
    method = args.method.upper()
    ok = 0

    for i, p in enumerate(files, 1):
        if args.verbose:
            print(f"[{i}/{len(files)}] {p}")

        if args.dry_run:
            print(f"DRY RUN: {method} {args.url}  < {p.name}")
            continue

        if args.break-each:
            breakpoint()

        attempt = 0
        while True:
            attempt += 1
            try:
                if args.multipart:
                    # multipart/form-data
                    ct = args.content_type or (mimetypes.guess_type(p.name)[0] or "application/octet-stream")
                    with p.open("rb") as fh:
                        files_arg = {args.field_name: (p.name, fh, ct)}
                        r = sess.request(method, args.url, headers=headers, files=files_arg, auth=auth, timeout=60)
                else:
                    # raw body
                    data = p.read_bytes()
                    ct = args.content_type or (mimetypes.guess_type(p.name)[0] or "application/octet-stream")
                    h = dict(headers)
                    h.setdefault("Content-Type", ct)
                    r = sess.request(method, args.url, headers=h, data=data, auth=auth, timeout=60)

                if 200 <= r.status_code < 300:
                    ok += 1
                    if args.verbose:
                        print(f"✔ {p.name} -> {r.status_code}")
                    else:
                        print(f"{p.name}: {r.status_code}")
                    # optional short preview
                    body = (r.text or "")[:200].strip()
                    if body and args.verbose:
                        print(f"  resp: {body}")
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

    print(f"\nDone. Success: {ok}/{len(files)}")
    sys.exit(0 if ok == len(files) else 1)

if __name__ == "__main__":
    main()
