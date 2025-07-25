#!/usr/bin/env zsh

DIR=`pwd`
echo "fhir-genalytice.platform"
git br
echo "d4m.acc.access"
cd d4m.acc.access; git br
echo "d4m.acc.microservice"
cd ../d4m.acc.microservice; git br
echo "emfjson-jackson"
cd ../emfjson-jackson; git br
echo "fhir.emf-4.0.1"
cd ../fhir.emf-4.0.1; git br
echo "fhir.emf-4.3.0"
cd ../fhir.emf-4.3.0; git br
echo "fhir.emf-5.0.0"
cd ../fhir.emf-5.0.0; git br
echo "fhir.serdeser"
cd ../fhir.serdeser; git br
cd "$DIR"