#!/usr/bin/env zsh

DIR=`pwd`
echo "fhir-genalytice.platform"
git st
echo "d4m.acc.access"
cd d4m.acc.access; git st
echo "d4m.acc.microservice"
cd ../d4m.acc.microservice; git st
echo "emfjson-jackson"
cd ../emfjson-jackson; git st
echo "fhir.emf-4.0.1"
cd ../fhir.emf-4.0.1; git st
echo "fhir.emf-4.3.0"
cd ../fhir.emf-4.3.0; git st
echo "fhir.emf-5.0.0"
cd ../fhir.emf-5.0.0; git st
echo "fhir.serdeser"
cd ../fhir.serdeser; git st
cd "$DIR"