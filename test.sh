#!/bin/zsh

# Run a specific JUnit test in the fhir.serdeser project and suppress warnings in output

echo "🔍 Running FHIRSerDeserTest.testLoad..."

./gradlew :fhir.serdeser:test --tests "FHIRSerDeserTest.testLoad" \
  | grep -v "warning:"

# Optional: check exit code and report result
if [[ $? -eq 0 ]]; then
  echo "✅ Test passed"
else
  echo "❌ Test failed"
  exit 1
fi
