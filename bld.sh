#!/usr/bin/env bash

clear

# Resolve module based on argument
case "$1" in
  m) module=":d4m.acc.microservice" ;;
  a) module=":d4m.acc.access" ;;
  s) module=":fhir.serdeser" ;;
  j) module=":emfjson-jackson" ;;
  f4) module=":fhir.emf-4.3.0" ;;
  f5) module=":fhir.emf-5.0.0" ;;
  *) module="all" ;;
esac

# Execute build
if [ "$module" = "all" ]; then
  ./gradlew clean build --warning-mode all
else
  ./gradlew ${module}:clean ${module}:build -x test --warning-mode all
fi
