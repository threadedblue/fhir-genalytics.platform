#!/usr/bin/env bash
# Build and package the d4m.acc.microservice Spring Boot fat jar.
# Usage: ./build-microservice.sh [-o OUTPUT_DIR] [-t] [-c]
#   -o  Output directory (default: ./dist)
#   -t  Run tests (default: skip tests)
#   -c  Clean before build

set -euo pipefail

# --- options ---
OUT_DIR="/Volumes/Samsung_T5/d4m-microservice"
RUN_TESTS=0
DO_CLEAN=0

while getopts ":o:tc" opt; do
  case "$opt" in
    o) OUT_DIR ;;
    t) RUN_TESTS=1 ;;
    c) DO_CLEAN=1 ;;
    \?)
      echo "Usage: $0 [-o OUTPUT_DIR] [-t] [-c]" >&2
      exit 1
      ;;
  
  esac
done

# --- repo root ---
SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
cd "$SCRIPT_DIR"

APP_MODULE="d4m.acc.microservice"
BUILD_DIR="$APP_MODULE/build/libs"

# --- sanity checks ---
if [[ ! -f "./settings.gradle" && ! -f "./settings.gradle.kts" ]]; then
  echo "❌ Please run from the Gradle project root (settings.gradle not found)." >&2
  exit 1
fi

if [[ ! -x "./gradlew" ]]; then
  echo "❌ ./gradlew not found or not executable." >&2
  echo "   Run: chmod +x gradlew" >&2
  exit 1
fi

if [[ ! -d "$APP_MODULE" ]]; then
  echo "❌ Module '$APP_MODULE' not found at repo root." >&2
  exit 1
fi

# --- build ---
echo "▶ Building $APP_MODULE (Spring Boot fat jar)…"
GRADLE_ARGS=()
(( DO_CLEAN )) && GRADLE_ARGS+=("clean")
GRADLE_ARGS+=(":$APP_MODULE:bootJar" "--no-daemon" "--console=plain")

if (( RUN_TESTS == 0 )); then
  GRADLE_ARGS+=("-x" "test")
fi

./gradlew "${GRADLE_ARGS[@]}"

# --- locate fat jar ---
if [[ ! -d "$BUILD_DIR" ]]; then
  echo "❌ Build output dir not found: $BUILD_DIR" >&2
  exit 1
fi

# Choose the first jar that contains BOOT-INF (i.e., a Boot fat jar)
FAT_JAR=""
while IFS= read -r -d '' J; do
  if jar tf "$J" | grep -q "^BOOT-INF/"; then
    FAT_JAR="$J"
    break
  fi
done < <(find "$BUILD_DIR" -maxdepth 1 -type f -name "*.jar" -print0 | sort -z)

if [[ -z "$FAT_JAR" ]]; then
  echo "❌ No Spring Boot fat jar found under $BUILD_DIR" >&2
  exit 1
fi

# --- verify manifest has Start-Class (extra safety) ---
if ! unzip -p "$FAT_JAR" META-INF/MANIFEST.MF | grep -q "^Start-Class:"; then
  echo "❌ Jar manifest missing Start-Class; not an executable Boot jar?: $FAT_JAR" >&2
  exit 1
fi

# --- stage to output dir ---
mkdir -p "$OUT_DIR"
BASENAME="$(basename "$FAT_JAR")"
TARGET_JAR="$OUT_DIR/$BASENAME"

cp -f "$FAT_JAR" "$TARGET_JAR"

# --- write relocatable run.sh next to the jar ---
RUN_SH="$OUT_DIR/run.sh"
cat > "$RUN_SH" <<'EOS'
#!/usr/bin/env bash
set -euo pipefail
DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"

# Pick the first jar in this folder (or set JAR explicitly)
JAR="$(ls -1 "$DIR"/*.jar 2>/dev/null | head -n 1 || true)"
if [[ -z "${JAR:-}" ]]; then
  echo "❌ No jar found next to run.sh" >&2
  exit 1
fi

# Example: override port or any Spring/Java opts at runtime
#   JAVA_OPTS="-Xms256m -Xmx1024m" SPRING_OPTS="--server.port=8888" ./run.sh
exec java ${JAVA_OPTS:-} -jar "$JAR" ${SPRING_OPTS:-} "$@"
EOS
chmod +x "$RUN_SH"

# --- report ---
echo "✅ Built fat jar:"
echo "   $TARGET_JAR"
echo
echo "▶ To run (relocatable):"
echo "   cd $(realpath "$OUT_DIR" 2>/dev/null || echo "$OUT_DIR")"
echo "   ./run.sh"
echo
echo "   (or) java -jar \"$BASENAME\""
