#!/usr/bin/env bash

clear; 
./gradlew :fhir.serdeser:clean :fhir.serdeser:test --tests org.hl7.fhir.emf.FHIRSerDeserTest.testLoad
