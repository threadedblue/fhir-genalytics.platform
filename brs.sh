#!/usr/bin/env zsh

DIR=`pwd`
git br
cd d4m.acc.access; git br
cd ../d4m.acc.microservice; git br
cd ../emfjson-jackson; git br
cd ../fhir.emf-4.3.0; git br
cd ../fhir.emf-5.0.0; git br
cd ../fhir.serdeser; git br
cd "$DIR"