#!/bin/zsh

# Print usage
function usage() {
  echo "Usage: $0 [-a] [-b] [-c] [-d] [-e] [-f] [?]"
  echo "  -a  Build d4m.acc.access"
  echo "  -b  Build d4m.acc.microservice"
  echo "  -c  Build emfjson-jackson"
  echo "  -d  Build fhir.emf-4.3.0"
  echo "  -e  Build fhir.emf-5.0.0"
  echo "  -f  Build fhir.serdeser"
  echo "  ?   Show this help"
  exit 1
}

# Handle "?" or "-?" BEFORE globbing or getopts
if [[ "$1" == "?" || "$1" == "-?" ]]; then
  usage
fi

# Map options to subproject paths
typeset -A projects
projects=(
  a "d4m.acc.access"
  b "d4m.acc.microservice"
  c "emfjson-jackson"
  d "fhir.emf-4.3.0"
  e "fhir.emf-5.0.0"
  f "fhir.serdeser"
)

# Collect selected projects
selected_projects=()

# No args → build all
if [[ $# -eq 0 ]]; then
  selected_projects=(${(v)projects})
else
  while getopts "abcdef" opt; do
    selected_projects+=(${projects[$opt]})
  done
fi

# Exit if nothing selected (e.g., invalid arg)
if [[ ${#selected_projects[@]} -eq 0 ]]; then
  echo "❌ No valid projects selected."
  usage
fi

# Build loop
for project in "${selected_projects[@]}"; do
  echo "🔧 Building $project..."
  
  ./gradlew ":$project:build" -x test || {
    echo "❌ Build failed for $project"
    exit 1
  }

  ./gradlew ":$project:publishToMavenLocal" || {
    echo "❌ Publish to Maven Local failed for $project"
    exit 1
  }
done

echo "✅ Build complete for: ${selected_projects[*]}"