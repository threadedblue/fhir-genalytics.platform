#!/bin/zsh

# Run a specific JUnit test in the stated project and suppress warnings in output

echo "🔍 Running AccumuloAccessTest.testCreate..."

./gradlew :d4m.acc.access:test --tests "AccumuloAccessTest.testCreate" \
  | grep -v "warning:"

# Optional: check exit code and report result
if [[ $? -eq 0 ]]; then
  echo "✅ Test passed"
else
  echo "❌ Test failed"
  exit 1
fi

echo "🔍 Running AccumuloAccessTest.testPost..."

./gradlew :d4m.acc.access:test --tests "AccumuloAccessTest.testPost" \
  | grep -v "warning:"

# Optional: check exit code and report result
if [[ $? -eq 0 ]]; then
  echo "✅ Test passed"
else
  echo "❌ Test failed"
  exit 1
fi

