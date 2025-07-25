/**
 */
package org.hl7.fhir;

import java.lang.String;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getAccount <em>Account</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getActivityDefinition <em>Activity Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getAdverseEvent <em>Adverse Event</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getAllergyIntolerance <em>Allergy Intolerance</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getAppointment <em>Appointment</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getAppointmentResponse <em>Appointment Response</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getAuditEvent <em>Audit Event</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getBasic <em>Basic</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getBinary <em>Binary</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getBiologicallyDerivedProduct <em>Biologically Derived Product</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getBodyStructure <em>Body Structure</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getBundle <em>Bundle</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getCapabilityStatement <em>Capability Statement</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getCarePlan <em>Care Plan</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getCareTeam <em>Care Team</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getCatalogEntry <em>Catalog Entry</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getChargeItem <em>Charge Item</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getChargeItemDefinition <em>Charge Item Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getClaim <em>Claim</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getClaimResponse <em>Claim Response</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getClinicalImpression <em>Clinical Impression</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getCodeSystem <em>Code System</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getCommunication <em>Communication</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getCommunicationRequest <em>Communication Request</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getCompartmentDefinition <em>Compartment Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getComposition <em>Composition</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getConceptMap <em>Concept Map</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getConsent <em>Consent</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getContract <em>Contract</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getCoverageEligibilityRequest <em>Coverage Eligibility Request</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getCoverageEligibilityResponse <em>Coverage Eligibility Response</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getDetectedIssue <em>Detected Issue</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getDeviceDefinition <em>Device Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getDeviceMetric <em>Device Metric</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getDeviceRequest <em>Device Request</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getDeviceUseStatement <em>Device Use Statement</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getDiagnosticReport <em>Diagnostic Report</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getDocumentManifest <em>Document Manifest</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getDocumentReference <em>Document Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getEffectEvidenceSynthesis <em>Effect Evidence Synthesis</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getEnrollmentRequest <em>Enrollment Request</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getEnrollmentResponse <em>Enrollment Response</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getEpisodeOfCare <em>Episode Of Care</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getEventDefinition <em>Event Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getEvidenceVariable <em>Evidence Variable</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getExampleScenario <em>Example Scenario</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getExplanationOfBenefit <em>Explanation Of Benefit</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getFamilyMemberHistory <em>Family Member History</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getFlag <em>Flag</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getGoal <em>Goal</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getGraphDefinition <em>Graph Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getGroup <em>Group</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getGuidanceResponse <em>Guidance Response</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getHealthcareService <em>Healthcare Service</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getImagingStudy <em>Imaging Study</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getImmunization <em>Immunization</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getImmunizationEvaluation <em>Immunization Evaluation</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getImmunizationRecommendation <em>Immunization Recommendation</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getImplementationGuide <em>Implementation Guide</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getInsurancePlan <em>Insurance Plan</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getInvoice <em>Invoice</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getLinkage <em>Linkage</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getList <em>List</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getMeasureReport <em>Measure Report</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getMedia <em>Media</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getMedication <em>Medication</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getMedicationAdministration <em>Medication Administration</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getMedicationDispense <em>Medication Dispense</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getMedicationKnowledge <em>Medication Knowledge</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getMedicationRequest <em>Medication Request</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getMedicationStatement <em>Medication Statement</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getMedicinalProduct <em>Medicinal Product</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getMedicinalProductAuthorization <em>Medicinal Product Authorization</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getMedicinalProductContraindication <em>Medicinal Product Contraindication</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getMedicinalProductIndication <em>Medicinal Product Indication</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getMedicinalProductIngredient <em>Medicinal Product Ingredient</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getMedicinalProductInteraction <em>Medicinal Product Interaction</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getMedicinalProductManufactured <em>Medicinal Product Manufactured</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getMedicinalProductPackaged <em>Medicinal Product Packaged</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getMedicinalProductPharmaceutical <em>Medicinal Product Pharmaceutical</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getMedicinalProductUndesirableEffect <em>Medicinal Product Undesirable Effect</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getMessageDefinition <em>Message Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getMessageHeader <em>Message Header</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getMolecularSequence <em>Molecular Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getNamingSystem <em>Naming System</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getNutritionOrder <em>Nutrition Order</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getObservation <em>Observation</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getObservationDefinition <em>Observation Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getOperationDefinition <em>Operation Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getOperationOutcome <em>Operation Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getOrganizationAffiliation <em>Organization Affiliation</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getPaymentNotice <em>Payment Notice</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getPaymentReconciliation <em>Payment Reconciliation</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getPerson <em>Person</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getPlanDefinition <em>Plan Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getPractitioner <em>Practitioner</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getPractitionerRole <em>Practitioner Role</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getProvenance <em>Provenance</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getQuestionnaire <em>Questionnaire</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getQuestionnaireResponse <em>Questionnaire Response</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getRelatedPerson <em>Related Person</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getRequestGroup <em>Request Group</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getResearchDefinition <em>Research Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getResearchElementDefinition <em>Research Element Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getResearchStudy <em>Research Study</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getResearchSubject <em>Research Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getRiskAssessment <em>Risk Assessment</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getRiskEvidenceSynthesis <em>Risk Evidence Synthesis</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getSearchParameter <em>Search Parameter</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getServiceRequest <em>Service Request</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getSlot <em>Slot</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getSpecimen <em>Specimen</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getSpecimenDefinition <em>Specimen Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getStructureDefinition <em>Structure Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getStructureMap <em>Structure Map</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getSubscription <em>Subscription</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getSubstance <em>Substance</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getSubstanceNucleicAcid <em>Substance Nucleic Acid</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getSubstancePolymer <em>Substance Polymer</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getSubstanceProtein <em>Substance Protein</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getSubstanceReferenceInformation <em>Substance Reference Information</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getSubstanceSourceMaterial <em>Substance Source Material</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getSubstanceSpecification <em>Substance Specification</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getSupplyDelivery <em>Supply Delivery</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getSupplyRequest <em>Supply Request</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getTask <em>Task</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getTerminologyCapabilities <em>Terminology Capabilities</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getTestReport <em>Test Report</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getTestScript <em>Test Script</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getVerificationResult <em>Verification Result</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getVisionPrescription <em>Vision Prescription</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Account</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A financial tool for tracking value accrued for a particular purpose.  In the healthcare field, used to track charges for a patient, cost centers, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Account</em>' containment reference.
	 * @see #setAccount(Account)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Account()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Account' namespace='##targetNamespace'"
	 * @generated
	 */
	Account getAccount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getAccount <em>Account</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account</em>' containment reference.
	 * @see #getAccount()
	 * @generated
	 */
	void setAccount(Account value);

	/**
	 * Returns the value of the '<em><b>Activity Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This resource allows for the definition of some activity to be performed, independent of a particular patient, practitioner, or other performance context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Definition</em>' containment reference.
	 * @see #setActivityDefinition(ActivityDefinition)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_ActivityDefinition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ActivityDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	ActivityDefinition getActivityDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getActivityDefinition <em>Activity Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Definition</em>' containment reference.
	 * @see #getActivityDefinition()
	 * @generated
	 */
	void setActivityDefinition(ActivityDefinition value);

	/**
	 * Returns the value of the '<em><b>Adverse Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Actual or  potential/avoided event causing unintended physical injury resulting from or contributed to by medical care, a research study or other healthcare setting factors that requires additional monitoring, treatment, or hospitalization, or that results in death.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adverse Event</em>' containment reference.
	 * @see #setAdverseEvent(AdverseEvent)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_AdverseEvent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AdverseEvent' namespace='##targetNamespace'"
	 * @generated
	 */
	AdverseEvent getAdverseEvent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getAdverseEvent <em>Adverse Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adverse Event</em>' containment reference.
	 * @see #getAdverseEvent()
	 * @generated
	 */
	void setAdverseEvent(AdverseEvent value);

	/**
	 * Returns the value of the '<em><b>Allergy Intolerance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Risk of harmful or undesirable, physiological response which is unique to an individual and associated with exposure to a substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allergy Intolerance</em>' containment reference.
	 * @see #setAllergyIntolerance(AllergyIntolerance)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_AllergyIntolerance()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AllergyIntolerance' namespace='##targetNamespace'"
	 * @generated
	 */
	AllergyIntolerance getAllergyIntolerance();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getAllergyIntolerance <em>Allergy Intolerance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allergy Intolerance</em>' containment reference.
	 * @see #getAllergyIntolerance()
	 * @generated
	 */
	void setAllergyIntolerance(AllergyIntolerance value);

	/**
	 * Returns the value of the '<em><b>Appointment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Appointment</em>' containment reference.
	 * @see #setAppointment(Appointment)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Appointment()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Appointment' namespace='##targetNamespace'"
	 * @generated
	 */
	Appointment getAppointment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getAppointment <em>Appointment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appointment</em>' containment reference.
	 * @see #getAppointment()
	 * @generated
	 */
	void setAppointment(Appointment value);

	/**
	 * Returns the value of the '<em><b>Appointment Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Appointment Response</em>' containment reference.
	 * @see #setAppointmentResponse(AppointmentResponse)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_AppointmentResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AppointmentResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	AppointmentResponse getAppointmentResponse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getAppointmentResponse <em>Appointment Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appointment Response</em>' containment reference.
	 * @see #getAppointmentResponse()
	 * @generated
	 */
	void setAppointmentResponse(AppointmentResponse value);

	/**
	 * Returns the value of the '<em><b>Audit Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Audit Event</em>' containment reference.
	 * @see #setAuditEvent(AuditEvent)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_AuditEvent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AuditEvent' namespace='##targetNamespace'"
	 * @generated
	 */
	AuditEvent getAuditEvent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getAuditEvent <em>Audit Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audit Event</em>' containment reference.
	 * @see #getAuditEvent()
	 * @generated
	 */
	void setAuditEvent(AuditEvent value);

	/**
	 * Returns the value of the '<em><b>Basic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Basic is used for handling concepts not yet defined in FHIR, narrative-only resources that don't map to an existing resource, and custom resources not appropriate for inclusion in the FHIR specification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Basic</em>' containment reference.
	 * @see #setBasic(Basic)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Basic()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Basic' namespace='##targetNamespace'"
	 * @generated
	 */
	Basic getBasic();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getBasic <em>Basic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basic</em>' containment reference.
	 * @see #getBasic()
	 * @generated
	 */
	void setBasic(Basic value);

	/**
	 * Returns the value of the '<em><b>Binary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A resource that represents the data of a single raw artifact as digital content accessible in its native format.  A Binary resource can contain any content, whether text, image, pdf, zip archive, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binary</em>' containment reference.
	 * @see #setBinary(Binary)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Binary()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Binary' namespace='##targetNamespace'"
	 * @generated
	 */
	Binary getBinary();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getBinary <em>Binary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binary</em>' containment reference.
	 * @see #getBinary()
	 * @generated
	 */
	void setBinary(Binary value);

	/**
	 * Returns the value of the '<em><b>Biologically Derived Product</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A material substance originating from a biological entity intended to be transplanted or infused
	 * into another (possibly the same) biological entity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Biologically Derived Product</em>' containment reference.
	 * @see #setBiologicallyDerivedProduct(BiologicallyDerivedProduct)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_BiologicallyDerivedProduct()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BiologicallyDerivedProduct' namespace='##targetNamespace'"
	 * @generated
	 */
	BiologicallyDerivedProduct getBiologicallyDerivedProduct();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getBiologicallyDerivedProduct <em>Biologically Derived Product</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Biologically Derived Product</em>' containment reference.
	 * @see #getBiologicallyDerivedProduct()
	 * @generated
	 */
	void setBiologicallyDerivedProduct(BiologicallyDerivedProduct value);

	/**
	 * Returns the value of the '<em><b>Body Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Record details about an anatomical structure.  This resource may be used when a coded concept does not provide the necessary detail needed for the use case.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Structure</em>' containment reference.
	 * @see #setBodyStructure(BodyStructure)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_BodyStructure()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BodyStructure' namespace='##targetNamespace'"
	 * @generated
	 */
	BodyStructure getBodyStructure();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getBodyStructure <em>Body Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Structure</em>' containment reference.
	 * @see #getBodyStructure()
	 * @generated
	 */
	void setBodyStructure(BodyStructure value);

	/**
	 * Returns the value of the '<em><b>Bundle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for a collection of resources.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bundle</em>' containment reference.
	 * @see #setBundle(Bundle)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Bundle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Bundle' namespace='##targetNamespace'"
	 * @generated
	 */
	Bundle getBundle();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getBundle <em>Bundle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundle</em>' containment reference.
	 * @see #getBundle()
	 * @generated
	 */
	void setBundle(Bundle value);

	/**
	 * Returns the value of the '<em><b>Capability Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capability Statement</em>' containment reference.
	 * @see #setCapabilityStatement(CapabilityStatement)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_CapabilityStatement()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CapabilityStatement' namespace='##targetNamespace'"
	 * @generated
	 */
	CapabilityStatement getCapabilityStatement();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getCapabilityStatement <em>Capability Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability Statement</em>' containment reference.
	 * @see #getCapabilityStatement()
	 * @generated
	 */
	void setCapabilityStatement(CapabilityStatement value);

	/**
	 * Returns the value of the '<em><b>Care Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Care Plan</em>' containment reference.
	 * @see #setCarePlan(CarePlan)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_CarePlan()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CarePlan' namespace='##targetNamespace'"
	 * @generated
	 */
	CarePlan getCarePlan();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getCarePlan <em>Care Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Care Plan</em>' containment reference.
	 * @see #getCarePlan()
	 * @generated
	 */
	void setCarePlan(CarePlan value);

	/**
	 * Returns the value of the '<em><b>Care Team</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Care Team includes all the people and organizations who plan to participate in the coordination and delivery of care for a patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Care Team</em>' containment reference.
	 * @see #setCareTeam(CareTeam)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_CareTeam()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CareTeam' namespace='##targetNamespace'"
	 * @generated
	 */
	CareTeam getCareTeam();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getCareTeam <em>Care Team</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Care Team</em>' containment reference.
	 * @see #getCareTeam()
	 * @generated
	 */
	void setCareTeam(CareTeam value);

	/**
	 * Returns the value of the '<em><b>Catalog Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Catalog entries are wrappers that contextualize items included in a catalog.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Catalog Entry</em>' containment reference.
	 * @see #setCatalogEntry(CatalogEntry)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_CatalogEntry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CatalogEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	CatalogEntry getCatalogEntry();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getCatalogEntry <em>Catalog Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalog Entry</em>' containment reference.
	 * @see #getCatalogEntry()
	 * @generated
	 */
	void setCatalogEntry(CatalogEntry value);

	/**
	 * Returns the value of the '<em><b>Charge Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resource ChargeItem describes the provision of healthcare provider products for a certain patient, therefore referring not only to the product, but containing in addition details of the provision, like date, time, amounts and participating organizations and persons. Main Usage of the ChargeItem is to enable the billing process and internal cost allocation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Charge Item</em>' containment reference.
	 * @see #setChargeItem(ChargeItem)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_ChargeItem()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ChargeItem' namespace='##targetNamespace'"
	 * @generated
	 */
	ChargeItem getChargeItem();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getChargeItem <em>Charge Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge Item</em>' containment reference.
	 * @see #getChargeItem()
	 * @generated
	 */
	void setChargeItem(ChargeItem value);

	/**
	 * Returns the value of the '<em><b>Charge Item Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ChargeItemDefinition resource provides the properties that apply to the (billing) codes necessary to calculate costs and prices. The properties may differ largely depending on type and realm, therefore this resource gives only a rough structure and requires profiling for each type of billing code system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Charge Item Definition</em>' containment reference.
	 * @see #setChargeItemDefinition(ChargeItemDefinition)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_ChargeItemDefinition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ChargeItemDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	ChargeItemDefinition getChargeItemDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getChargeItemDefinition <em>Charge Item Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge Item Definition</em>' containment reference.
	 * @see #getChargeItemDefinition()
	 * @generated
	 */
	void setChargeItemDefinition(ChargeItemDefinition value);

	/**
	 * Returns the value of the '<em><b>Claim</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Claim</em>' containment reference.
	 * @see #setClaim(Claim)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Claim()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Claim' namespace='##targetNamespace'"
	 * @generated
	 */
	Claim getClaim();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getClaim <em>Claim</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim</em>' containment reference.
	 * @see #getClaim()
	 * @generated
	 */
	void setClaim(Claim value);

	/**
	 * Returns the value of the '<em><b>Claim Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This resource provides the adjudication details from the processing of a Claim resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Claim Response</em>' containment reference.
	 * @see #setClaimResponse(ClaimResponse)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_ClaimResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ClaimResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	ClaimResponse getClaimResponse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getClaimResponse <em>Claim Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim Response</em>' containment reference.
	 * @see #getClaimResponse()
	 * @generated
	 */
	void setClaimResponse(ClaimResponse value);

	/**
	 * Returns the value of the '<em><b>Clinical Impression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called "ClinicalImpression" rather than "ClinicalAssessment" to avoid confusion with the recording of assessment tools such as Apgar score.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clinical Impression</em>' containment reference.
	 * @see #setClinicalImpression(ClinicalImpression)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_ClinicalImpression()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ClinicalImpression' namespace='##targetNamespace'"
	 * @generated
	 */
	ClinicalImpression getClinicalImpression();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getClinicalImpression <em>Clinical Impression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clinical Impression</em>' containment reference.
	 * @see #getClinicalImpression()
	 * @generated
	 */
	void setClinicalImpression(ClinicalImpression value);

	/**
	 * Returns the value of the '<em><b>Code System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CodeSystem resource is used to declare the existence of and describe a code system or code system supplement and its key properties, and optionally define a part or all of its content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code System</em>' containment reference.
	 * @see #setCodeSystem(CodeSystem)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_CodeSystem()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CodeSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeSystem getCodeSystem();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getCodeSystem <em>Code System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code System</em>' containment reference.
	 * @see #getCodeSystem()
	 * @generated
	 */
	void setCodeSystem(CodeSystem value);

	/**
	 * Returns the value of the '<em><b>Communication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An occurrence of information being transmitted; e.g. an alert that was sent to a responsible provider, a public health agency that was notified about a reportable condition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Communication</em>' containment reference.
	 * @see #setCommunication(Communication)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Communication()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Communication' namespace='##targetNamespace'"
	 * @generated
	 */
	Communication getCommunication();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getCommunication <em>Communication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication</em>' containment reference.
	 * @see #getCommunication()
	 * @generated
	 */
	void setCommunication(Communication value);

	/**
	 * Returns the value of the '<em><b>Communication Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A request to convey information; e.g. the CDS system proposes that an alert be sent to a responsible provider, the CDS system proposes that the public health agency be notified about a reportable condition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Communication Request</em>' containment reference.
	 * @see #setCommunicationRequest(CommunicationRequest)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_CommunicationRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CommunicationRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	CommunicationRequest getCommunicationRequest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getCommunicationRequest <em>Communication Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Request</em>' containment reference.
	 * @see #getCommunicationRequest()
	 * @generated
	 */
	void setCommunicationRequest(CommunicationRequest value);

	/**
	 * Returns the value of the '<em><b>Compartment Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A compartment definition that defines how resources are accessed on a server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compartment Definition</em>' containment reference.
	 * @see #setCompartmentDefinition(CompartmentDefinition)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_CompartmentDefinition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CompartmentDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	CompartmentDefinition getCompartmentDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getCompartmentDefinition <em>Compartment Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compartment Definition</em>' containment reference.
	 * @see #getCompartmentDefinition()
	 * @generated
	 */
	void setCompartmentDefinition(CompartmentDefinition value);

	/**
	 * Returns the value of the '<em><b>Composition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of healthcare-related information that is assembled together into a single logical package that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. A Composition defines the structure and narrative content necessary for a document. However, a Composition alone does not constitute a document. Rather, the Composition must be the first entry in a Bundle where Bundle.type=document, and any other resources referenced from Composition must be included as subsequent entries in the Bundle (for example Patient, Practitioner, Encounter, etc.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Composition</em>' containment reference.
	 * @see #setComposition(Composition)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Composition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Composition' namespace='##targetNamespace'"
	 * @generated
	 */
	Composition getComposition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getComposition <em>Composition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composition</em>' containment reference.
	 * @see #getComposition()
	 * @generated
	 */
	void setComposition(Composition value);

	/**
	 * Returns the value of the '<em><b>Concept Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A statement of relationships from one set of concepts to one or more other concepts - either concepts in code systems, or data element/data element concepts, or classes in class models.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Concept Map</em>' containment reference.
	 * @see #setConceptMap(ConceptMap)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_ConceptMap()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ConceptMap' namespace='##targetNamespace'"
	 * @generated
	 */
	ConceptMap getConceptMap();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getConceptMap <em>Concept Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concept Map</em>' containment reference.
	 * @see #getConceptMap()
	 * @generated
	 */
	void setConceptMap(ConceptMap value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a level of concern.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Condition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Condition' namespace='##targetNamespace'"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Consent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A record of a healthcare consumer’s  choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consent</em>' containment reference.
	 * @see #setConsent(Consent)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Consent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Consent' namespace='##targetNamespace'"
	 * @generated
	 */
	Consent getConsent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getConsent <em>Consent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consent</em>' containment reference.
	 * @see #getConsent()
	 * @generated
	 */
	void setConsent(Consent value);

	/**
	 * Returns the value of the '<em><b>Contract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contract</em>' containment reference.
	 * @see #setContract(Contract)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Contract()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Contract' namespace='##targetNamespace'"
	 * @generated
	 */
	Contract getContract();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getContract <em>Contract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contract</em>' containment reference.
	 * @see #getContract()
	 * @generated
	 */
	void setContract(Contract value);

	/**
	 * Returns the value of the '<em><b>Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Financial instrument which may be used to reimburse or pay for health care products and services. Includes both insurance and self-payment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coverage</em>' containment reference.
	 * @see #setCoverage(Coverage)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Coverage()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Coverage' namespace='##targetNamespace'"
	 * @generated
	 */
	Coverage getCoverage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getCoverage <em>Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage</em>' containment reference.
	 * @see #getCoverage()
	 * @generated
	 */
	void setCoverage(Coverage value);

	/**
	 * Returns the value of the '<em><b>Coverage Eligibility Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CoverageEligibilityRequest provides patient and insurance coverage information to an insurer for them to respond, in the form of an CoverageEligibilityResponse, with information regarding whether the stated coverage is valid and in-force and optionally to provide the insurance details of the policy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coverage Eligibility Request</em>' containment reference.
	 * @see #setCoverageEligibilityRequest(CoverageEligibilityRequest)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_CoverageEligibilityRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CoverageEligibilityRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	CoverageEligibilityRequest getCoverageEligibilityRequest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getCoverageEligibilityRequest <em>Coverage Eligibility Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage Eligibility Request</em>' containment reference.
	 * @see #getCoverageEligibilityRequest()
	 * @generated
	 */
	void setCoverageEligibilityRequest(CoverageEligibilityRequest value);

	/**
	 * Returns the value of the '<em><b>Coverage Eligibility Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This resource provides eligibility and plan details from the processing of an CoverageEligibilityRequest resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coverage Eligibility Response</em>' containment reference.
	 * @see #setCoverageEligibilityResponse(CoverageEligibilityResponse)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_CoverageEligibilityResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CoverageEligibilityResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	CoverageEligibilityResponse getCoverageEligibilityResponse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getCoverageEligibilityResponse <em>Coverage Eligibility Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage Eligibility Response</em>' containment reference.
	 * @see #getCoverageEligibilityResponse()
	 * @generated
	 */
	void setCoverageEligibilityResponse(CoverageEligibilityResponse value);

	/**
	 * Returns the value of the '<em><b>Detected Issue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, Ineffective treatment frequency, Procedure-condition conflict, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detected Issue</em>' containment reference.
	 * @see #setDetectedIssue(DetectedIssue)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_DetectedIssue()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DetectedIssue' namespace='##targetNamespace'"
	 * @generated
	 */
	DetectedIssue getDetectedIssue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getDetectedIssue <em>Detected Issue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detected Issue</em>' containment reference.
	 * @see #getDetectedIssue()
	 * @generated
	 */
	void setDetectedIssue(DetectedIssue value);

	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A type of a manufactured item that is used in the provision of healthcare without being substantially changed through that activity. The device may be a medical or non-medical device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device</em>' containment reference.
	 * @see #setDevice(Device)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Device()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Device' namespace='##targetNamespace'"
	 * @generated
	 */
	Device getDevice();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getDevice <em>Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' containment reference.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(Device value);

	/**
	 * Returns the value of the '<em><b>Device Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The characteristics, operational status and capabilities of a medical-related component of a medical device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Definition</em>' containment reference.
	 * @see #setDeviceDefinition(DeviceDefinition)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_DeviceDefinition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeviceDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceDefinition getDeviceDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getDeviceDefinition <em>Device Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Definition</em>' containment reference.
	 * @see #getDeviceDefinition()
	 * @generated
	 */
	void setDeviceDefinition(DeviceDefinition value);

	/**
	 * Returns the value of the '<em><b>Device Metric</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes a measurement, calculation or setting capability of a medical device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Metric</em>' containment reference.
	 * @see #setDeviceMetric(DeviceMetric)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_DeviceMetric()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeviceMetric' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceMetric getDeviceMetric();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getDeviceMetric <em>Device Metric</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Metric</em>' containment reference.
	 * @see #getDeviceMetric()
	 * @generated
	 */
	void setDeviceMetric(DeviceMetric value);

	/**
	 * Returns the value of the '<em><b>Device Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents a request for a patient to employ a medical device. The device may be an implantable device, or an external assistive device, such as a walker.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Request</em>' containment reference.
	 * @see #setDeviceRequest(DeviceRequest)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_DeviceRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeviceRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceRequest getDeviceRequest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getDeviceRequest <em>Device Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Request</em>' containment reference.
	 * @see #getDeviceRequest()
	 * @generated
	 */
	void setDeviceRequest(DeviceRequest value);

	/**
	 * Returns the value of the '<em><b>Device Use Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A record of a device being used by a patient where the record is the result of a report from the patient or another clinician.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Use Statement</em>' containment reference.
	 * @see #setDeviceUseStatement(DeviceUseStatement)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_DeviceUseStatement()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeviceUseStatement' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceUseStatement getDeviceUseStatement();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getDeviceUseStatement <em>Device Use Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Use Statement</em>' containment reference.
	 * @see #getDeviceUseStatement()
	 * @generated
	 */
	void setDeviceUseStatement(DeviceUseStatement value);

	/**
	 * Returns the value of the '<em><b>Diagnostic Report</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The findings and interpretation of diagnostic  tests performed on patients, groups of patients, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting and provider information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation of diagnostic reports.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diagnostic Report</em>' containment reference.
	 * @see #setDiagnosticReport(DiagnosticReport)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_DiagnosticReport()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DiagnosticReport' namespace='##targetNamespace'"
	 * @generated
	 */
	DiagnosticReport getDiagnosticReport();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getDiagnosticReport <em>Diagnostic Report</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagnostic Report</em>' containment reference.
	 * @see #getDiagnosticReport()
	 * @generated
	 */
	void setDiagnosticReport(DiagnosticReport value);

	/**
	 * Returns the value of the '<em><b>Document Manifest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of documents compiled for a purpose together with metadata that applies to the collection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Manifest</em>' containment reference.
	 * @see #setDocumentManifest(DocumentManifest)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_DocumentManifest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DocumentManifest' namespace='##targetNamespace'"
	 * @generated
	 */
	DocumentManifest getDocumentManifest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getDocumentManifest <em>Document Manifest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Manifest</em>' containment reference.
	 * @see #getDocumentManifest()
	 * @generated
	 */
	void setDocumentManifest(DocumentManifest value);

	/**
	 * Returns the value of the '<em><b>Document Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a document of any kind for any purpose. Provides metadata about the document so that the document can be discovered and managed. The scope of a document is any seralized object with a mime-type, so includes formal patient centric documents (CDA), cliical notes, scanned paper, and non-patient specific documents like policy text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Reference</em>' containment reference.
	 * @see #setDocumentReference(DocumentReference)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_DocumentReference()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DocumentReference' namespace='##targetNamespace'"
	 * @generated
	 */
	DocumentReference getDocumentReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getDocumentReference <em>Document Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Reference</em>' containment reference.
	 * @see #getDocumentReference()
	 * @generated
	 */
	void setDocumentReference(DocumentReference value);

	/**
	 * Returns the value of the '<em><b>Effect Evidence Synthesis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The EffectEvidenceSynthesis resource describes the difference in an outcome between exposures states in a population where the effect estimate is derived from a combination of research studies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Effect Evidence Synthesis</em>' containment reference.
	 * @see #setEffectEvidenceSynthesis(EffectEvidenceSynthesis)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_EffectEvidenceSynthesis()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EffectEvidenceSynthesis' namespace='##targetNamespace'"
	 * @generated
	 */
	EffectEvidenceSynthesis getEffectEvidenceSynthesis();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getEffectEvidenceSynthesis <em>Effect Evidence Synthesis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect Evidence Synthesis</em>' containment reference.
	 * @see #getEffectEvidenceSynthesis()
	 * @generated
	 */
	void setEffectEvidenceSynthesis(EffectEvidenceSynthesis value);

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Encounter)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Encounter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Encounter getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Encounter value);

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The technical details of an endpoint that can be used for electronic services, such as for web services providing XDS.b or a REST endpoint for another FHIR server. This may include any security context information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endpoint</em>' containment reference.
	 * @see #setEndpoint(Endpoint)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Endpoint()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Endpoint' namespace='##targetNamespace'"
	 * @generated
	 */
	Endpoint getEndpoint();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getEndpoint <em>Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint</em>' containment reference.
	 * @see #getEndpoint()
	 * @generated
	 */
	void setEndpoint(Endpoint value);

	/**
	 * Returns the value of the '<em><b>Enrollment Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This resource provides the insurance enrollment details to the insurer regarding a specified coverage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enrollment Request</em>' containment reference.
	 * @see #setEnrollmentRequest(EnrollmentRequest)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_EnrollmentRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EnrollmentRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	EnrollmentRequest getEnrollmentRequest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getEnrollmentRequest <em>Enrollment Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enrollment Request</em>' containment reference.
	 * @see #getEnrollmentRequest()
	 * @generated
	 */
	void setEnrollmentRequest(EnrollmentRequest value);

	/**
	 * Returns the value of the '<em><b>Enrollment Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This resource provides enrollment and plan details from the processing of an EnrollmentRequest resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enrollment Response</em>' containment reference.
	 * @see #setEnrollmentResponse(EnrollmentResponse)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_EnrollmentResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EnrollmentResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	EnrollmentResponse getEnrollmentResponse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getEnrollmentResponse <em>Enrollment Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enrollment Response</em>' containment reference.
	 * @see #getEnrollmentResponse()
	 * @generated
	 */
	void setEnrollmentResponse(EnrollmentResponse value);

	/**
	 * Returns the value of the '<em><b>Episode Of Care</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Episode Of Care</em>' containment reference.
	 * @see #setEpisodeOfCare(EpisodeOfCare)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_EpisodeOfCare()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EpisodeOfCare' namespace='##targetNamespace'"
	 * @generated
	 */
	EpisodeOfCare getEpisodeOfCare();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getEpisodeOfCare <em>Episode Of Care</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Episode Of Care</em>' containment reference.
	 * @see #getEpisodeOfCare()
	 * @generated
	 */
	void setEpisodeOfCare(EpisodeOfCare value);

	/**
	 * Returns the value of the '<em><b>Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The EventDefinition resource provides a reusable description of when a particular event can occur.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event Definition</em>' containment reference.
	 * @see #setEventDefinition(EventDefinition)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_EventDefinition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EventDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	EventDefinition getEventDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getEventDefinition <em>Event Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Definition</em>' containment reference.
	 * @see #getEventDefinition()
	 * @generated
	 */
	void setEventDefinition(EventDefinition value);

	/**
	 * Returns the value of the '<em><b>Evidence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Evidence resource describes the conditional state (population and any exposures being compared within the population) and outcome (if specified) that the knowledge (evidence, assertion, recommendation) is about.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Evidence</em>' containment reference.
	 * @see #setEvidence(Evidence)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Evidence()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Evidence' namespace='##targetNamespace'"
	 * @generated
	 */
	Evidence getEvidence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getEvidence <em>Evidence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evidence</em>' containment reference.
	 * @see #getEvidence()
	 * @generated
	 */
	void setEvidence(Evidence value);

	/**
	 * Returns the value of the '<em><b>Evidence Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The EvidenceVariable resource describes a "PICO" element that knowledge (evidence, assertion, recommendation) is about.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Evidence Variable</em>' containment reference.
	 * @see #setEvidenceVariable(EvidenceVariable)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_EvidenceVariable()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EvidenceVariable' namespace='##targetNamespace'"
	 * @generated
	 */
	EvidenceVariable getEvidenceVariable();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getEvidenceVariable <em>Evidence Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evidence Variable</em>' containment reference.
	 * @see #getEvidenceVariable()
	 * @generated
	 */
	void setEvidenceVariable(EvidenceVariable value);

	/**
	 * Returns the value of the '<em><b>Example Scenario</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Example of workflow instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Example Scenario</em>' containment reference.
	 * @see #setExampleScenario(ExampleScenario)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_ExampleScenario()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExampleScenario' namespace='##targetNamespace'"
	 * @generated
	 */
	ExampleScenario getExampleScenario();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getExampleScenario <em>Example Scenario</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example Scenario</em>' containment reference.
	 * @see #getExampleScenario()
	 * @generated
	 */
	void setExampleScenario(ExampleScenario value);

	/**
	 * Returns the value of the '<em><b>Explanation Of Benefit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Explanation Of Benefit</em>' containment reference.
	 * @see #setExplanationOfBenefit(ExplanationOfBenefit)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_ExplanationOfBenefit()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExplanationOfBenefit' namespace='##targetNamespace'"
	 * @generated
	 */
	ExplanationOfBenefit getExplanationOfBenefit();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getExplanationOfBenefit <em>Explanation Of Benefit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Explanation Of Benefit</em>' containment reference.
	 * @see #getExplanationOfBenefit()
	 * @generated
	 */
	void setExplanationOfBenefit(ExplanationOfBenefit value);

	/**
	 * Returns the value of the '<em><b>Family Member History</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Significant health conditions for a person related to the patient relevant in the context of care for the patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Family Member History</em>' containment reference.
	 * @see #setFamilyMemberHistory(FamilyMemberHistory)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_FamilyMemberHistory()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FamilyMemberHistory' namespace='##targetNamespace'"
	 * @generated
	 */
	FamilyMemberHistory getFamilyMemberHistory();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getFamilyMemberHistory <em>Family Member History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family Member History</em>' containment reference.
	 * @see #getFamilyMemberHistory()
	 * @generated
	 */
	void setFamilyMemberHistory(FamilyMemberHistory value);

	/**
	 * Returns the value of the '<em><b>Flag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Prospective warnings of potential issues when providing care to the patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flag</em>' containment reference.
	 * @see #setFlag(Flag)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Flag()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Flag' namespace='##targetNamespace'"
	 * @generated
	 */
	Flag getFlag();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getFlag <em>Flag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flag</em>' containment reference.
	 * @see #getFlag()
	 * @generated
	 */
	void setFlag(Flag value);

	/**
	 * Returns the value of the '<em><b>Goal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Goal</em>' containment reference.
	 * @see #setGoal(Goal)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Goal()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Goal' namespace='##targetNamespace'"
	 * @generated
	 */
	Goal getGoal();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getGoal <em>Goal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal</em>' containment reference.
	 * @see #getGoal()
	 * @generated
	 */
	void setGoal(Goal value);

	/**
	 * Returns the value of the '<em><b>Graph Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A formal computable definition of a graph of resources - that is, a coherent set of resources that form a graph by following references. The Graph Definition resource defines a set and makes rules about the set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Graph Definition</em>' containment reference.
	 * @see #setGraphDefinition(GraphDefinition)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_GraphDefinition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GraphDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	GraphDefinition getGraphDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getGraphDefinition <em>Graph Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph Definition</em>' containment reference.
	 * @see #getGraphDefinition()
	 * @generated
	 */
	void setGraphDefinition(GraphDefinition value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents a defined collection of entities that may be discussed or acted upon collectively but which are not expected to act collectively, and are not formally or legally recognized; i.e. a collection of entities that isn't an Organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' containment reference.
	 * @see #setGroup(Group)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Group()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Group' namespace='##targetNamespace'"
	 * @generated
	 */
	Group getGroup();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getGroup <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' containment reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(Group value);

	/**
	 * Returns the value of the '<em><b>Guidance Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A guidance response is the formal response to a guidance request, including any output parameters returned by the evaluation, as well as the description of any proposed actions to be taken.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Guidance Response</em>' containment reference.
	 * @see #setGuidanceResponse(GuidanceResponse)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_GuidanceResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GuidanceResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	GuidanceResponse getGuidanceResponse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getGuidanceResponse <em>Guidance Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guidance Response</em>' containment reference.
	 * @see #getGuidanceResponse()
	 * @generated
	 */
	void setGuidanceResponse(GuidanceResponse value);

	/**
	 * Returns the value of the '<em><b>Healthcare Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The details of a healthcare service available at a location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Healthcare Service</em>' containment reference.
	 * @see #setHealthcareService(HealthcareService)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_HealthcareService()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HealthcareService' namespace='##targetNamespace'"
	 * @generated
	 */
	HealthcareService getHealthcareService();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getHealthcareService <em>Healthcare Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Healthcare Service</em>' containment reference.
	 * @see #getHealthcareService()
	 * @generated
	 */
	void setHealthcareService(HealthcareService value);

	/**
	 * Returns the value of the '<em><b>Imaging Study</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context.  A series is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imaging Study</em>' containment reference.
	 * @see #setImagingStudy(ImagingStudy)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_ImagingStudy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ImagingStudy' namespace='##targetNamespace'"
	 * @generated
	 */
	ImagingStudy getImagingStudy();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getImagingStudy <em>Imaging Study</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imaging Study</em>' containment reference.
	 * @see #getImagingStudy()
	 * @generated
	 */
	void setImagingStudy(ImagingStudy value);

	/**
	 * Returns the value of the '<em><b>Immunization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the event of a patient being administered a vaccine or a record of an immunization as reported by a patient, a clinician or another party.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Immunization</em>' containment reference.
	 * @see #setImmunization(Immunization)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Immunization()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Immunization' namespace='##targetNamespace'"
	 * @generated
	 */
	Immunization getImmunization();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getImmunization <em>Immunization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Immunization</em>' containment reference.
	 * @see #getImmunization()
	 * @generated
	 */
	void setImmunization(Immunization value);

	/**
	 * Returns the value of the '<em><b>Immunization Evaluation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes a comparison of an immunization event against published recommendations to determine if the administration is "valid" in relation to those  recommendations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Immunization Evaluation</em>' containment reference.
	 * @see #setImmunizationEvaluation(ImmunizationEvaluation)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_ImmunizationEvaluation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ImmunizationEvaluation' namespace='##targetNamespace'"
	 * @generated
	 */
	ImmunizationEvaluation getImmunizationEvaluation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getImmunizationEvaluation <em>Immunization Evaluation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Immunization Evaluation</em>' containment reference.
	 * @see #getImmunizationEvaluation()
	 * @generated
	 */
	void setImmunizationEvaluation(ImmunizationEvaluation value);

	/**
	 * Returns the value of the '<em><b>Immunization Recommendation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A patient's point-in-time set of recommendations (i.e. forecasting) according to a published schedule with optional supporting justification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Immunization Recommendation</em>' containment reference.
	 * @see #setImmunizationRecommendation(ImmunizationRecommendation)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_ImmunizationRecommendation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ImmunizationRecommendation' namespace='##targetNamespace'"
	 * @generated
	 */
	ImmunizationRecommendation getImmunizationRecommendation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getImmunizationRecommendation <em>Immunization Recommendation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Immunization Recommendation</em>' containment reference.
	 * @see #getImmunizationRecommendation()
	 * @generated
	 */
	void setImmunizationRecommendation(ImmunizationRecommendation value);

	/**
	 * Returns the value of the '<em><b>Implementation Guide</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implementation Guide</em>' containment reference.
	 * @see #setImplementationGuide(ImplementationGuide)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_ImplementationGuide()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ImplementationGuide' namespace='##targetNamespace'"
	 * @generated
	 */
	ImplementationGuide getImplementationGuide();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getImplementationGuide <em>Implementation Guide</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Guide</em>' containment reference.
	 * @see #getImplementationGuide()
	 * @generated
	 */
	void setImplementationGuide(ImplementationGuide value);

	/**
	 * Returns the value of the '<em><b>Insurance Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Details of a Health Insurance product/plan provided by an organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insurance Plan</em>' containment reference.
	 * @see #setInsurancePlan(InsurancePlan)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_InsurancePlan()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='InsurancePlan' namespace='##targetNamespace'"
	 * @generated
	 */
	InsurancePlan getInsurancePlan();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getInsurancePlan <em>Insurance Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insurance Plan</em>' containment reference.
	 * @see #getInsurancePlan()
	 * @generated
	 */
	void setInsurancePlan(InsurancePlan value);

	/**
	 * Returns the value of the '<em><b>Invoice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Invoice containing collected ChargeItems from an Account with calculated individual and total price for Billing purpose.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invoice</em>' containment reference.
	 * @see #setInvoice(Invoice)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Invoice()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Invoice' namespace='##targetNamespace'"
	 * @generated
	 */
	Invoice getInvoice();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getInvoice <em>Invoice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice</em>' containment reference.
	 * @see #getInvoice()
	 * @generated
	 */
	void setInvoice(Invoice value);

	/**
	 * Returns the value of the '<em><b>Library</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Library resource is a general-purpose container for knowledge asset definitions. It can be used to describe and expose existing knowledge assets such as logic libraries and information model descriptions, as well as to describe a collection of knowledge assets.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Library</em>' containment reference.
	 * @see #setLibrary(Library)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Library()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Library' namespace='##targetNamespace'"
	 * @generated
	 */
	Library getLibrary();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getLibrary <em>Library</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' containment reference.
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(Library value);

	/**
	 * Returns the value of the '<em><b>Linkage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies two or more records (resource instances) that refer to the same real-world "occurrence".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Linkage</em>' containment reference.
	 * @see #setLinkage(Linkage)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Linkage()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Linkage' namespace='##targetNamespace'"
	 * @generated
	 */
	Linkage getLinkage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getLinkage <em>Linkage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linkage</em>' containment reference.
	 * @see #getLinkage()
	 * @generated
	 */
	void setLinkage(Linkage value);

	/**
	 * Returns the value of the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list is a curated collection of resources.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>List</em>' containment reference.
	 * @see #setList(List)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_List()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='List' namespace='##targetNamespace'"
	 * @generated
	 */
	List getList();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getList <em>List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List</em>' containment reference.
	 * @see #getList()
	 * @generated
	 */
	void setList(List value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Details and position information for a physical place where services are provided and resources and participants may be stored, found, contained, or accommodated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Location)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Location()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Location' namespace='##targetNamespace'"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Measure resource provides the definition of a quality measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measure</em>' containment reference.
	 * @see #setMeasure(Measure)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Measure()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Measure' namespace='##targetNamespace'"
	 * @generated
	 */
	Measure getMeasure();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getMeasure <em>Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure</em>' containment reference.
	 * @see #getMeasure()
	 * @generated
	 */
	void setMeasure(Measure value);

	/**
	 * Returns the value of the '<em><b>Measure Report</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The MeasureReport resource contains the results of the calculation of a measure; and optionally a reference to the resources involved in that calculation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measure Report</em>' containment reference.
	 * @see #setMeasureReport(MeasureReport)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_MeasureReport()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MeasureReport' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasureReport getMeasureReport();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getMeasureReport <em>Measure Report</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Report</em>' containment reference.
	 * @see #getMeasureReport()
	 * @generated
	 */
	void setMeasureReport(MeasureReport value);

	/**
	 * Returns the value of the '<em><b>Media</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A photo, video, or audio recording acquired or used in healthcare. The actual content may be inline or provided by direct reference.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Media</em>' containment reference.
	 * @see #setMedia(Media)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Media()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Media' namespace='##targetNamespace'"
	 * @generated
	 */
	Media getMedia();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getMedia <em>Media</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media</em>' containment reference.
	 * @see #getMedia()
	 * @generated
	 */
	void setMedia(Media value);

	/**
	 * Returns the value of the '<em><b>Medication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This resource is primarily used for the identification and definition of a medication for the purposes of prescribing, dispensing, and administering a medication as well as for making statements about medication use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medication</em>' containment reference.
	 * @see #setMedication(Medication)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Medication()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Medication' namespace='##targetNamespace'"
	 * @generated
	 */
	Medication getMedication();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getMedication <em>Medication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medication</em>' containment reference.
	 * @see #getMedication()
	 * @generated
	 */
	void setMedication(Medication value);

	/**
	 * Returns the value of the '<em><b>Medication Administration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the event of a patient consuming or otherwise being administered a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion.  Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medication Administration</em>' containment reference.
	 * @see #setMedicationAdministration(MedicationAdministration)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_MedicationAdministration()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MedicationAdministration' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationAdministration getMedicationAdministration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getMedicationAdministration <em>Medication Administration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medication Administration</em>' containment reference.
	 * @see #getMedicationAdministration()
	 * @generated
	 */
	void setMedicationAdministration(MedicationAdministration value);

	/**
	 * Returns the value of the '<em><b>Medication Dispense</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medication Dispense</em>' containment reference.
	 * @see #setMedicationDispense(MedicationDispense)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_MedicationDispense()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MedicationDispense' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationDispense getMedicationDispense();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getMedicationDispense <em>Medication Dispense</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medication Dispense</em>' containment reference.
	 * @see #getMedicationDispense()
	 * @generated
	 */
	void setMedicationDispense(MedicationDispense value);

	/**
	 * Returns the value of the '<em><b>Medication Knowledge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about a medication that is used to support knowledge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medication Knowledge</em>' containment reference.
	 * @see #setMedicationKnowledge(MedicationKnowledge)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_MedicationKnowledge()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MedicationKnowledge' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationKnowledge getMedicationKnowledge();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getMedicationKnowledge <em>Medication Knowledge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medication Knowledge</em>' containment reference.
	 * @see #getMedicationKnowledge()
	 * @generated
	 */
	void setMedicationKnowledge(MedicationKnowledge value);

	/**
	 * Returns the value of the '<em><b>Medication Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called "MedicationRequest" rather than "MedicationPrescription" or "MedicationOrder" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medication Request</em>' containment reference.
	 * @see #setMedicationRequest(MedicationRequest)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_MedicationRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MedicationRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationRequest getMedicationRequest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getMedicationRequest <em>Medication Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medication Request</em>' containment reference.
	 * @see #getMedicationRequest()
	 * @generated
	 */
	void setMedicationRequest(MedicationRequest value);

	/**
	 * Returns the value of the '<em><b>Medication Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A record of a medication that is being consumed by a patient.   A MedicationStatement may indicate that the patient may be taking the medication now or has taken the medication in the past or will be taking the medication in the future.  The source of this information can be the patient, significant other (such as a family member or spouse), or a clinician.  A common scenario where this information is captured is during the history taking process during a patient visit or stay.   The medication information may come from sources such as the patient's memory, from a prescription bottle,  or from a list of medications the patient, clinician or other party maintains. 
	 * 
	 * The primary difference between a medication statement and a medication administration is that the medication administration has complete administration information and is based on actual administration information from the person who administered the medication.  A medication statement is often, if not always, less specific.  There is no required date/time when the medication was administered, in fact we only know that a source has reported the patient is taking this medication, where details such as time, quantity, or rate or even medication product may be incomplete or missing or less precise.  As stated earlier, the medication statement information may come from the patient's memory, from a prescription bottle or from a list of medications the patient, clinician or other party maintains.  Medication administration is more formal and is not missing detailed information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medication Statement</em>' containment reference.
	 * @see #setMedicationStatement(MedicationStatement)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_MedicationStatement()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MedicationStatement' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationStatement getMedicationStatement();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getMedicationStatement <em>Medication Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medication Statement</em>' containment reference.
	 * @see #getMedicationStatement()
	 * @generated
	 */
	void setMedicationStatement(MedicationStatement value);

	/**
	 * Returns the value of the '<em><b>Medicinal Product</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Detailed definition of a medicinal product, typically for uses other than direct patient care (e.g. regulatory use).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medicinal Product</em>' containment reference.
	 * @see #setMedicinalProduct(MedicinalProduct)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_MedicinalProduct()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MedicinalProduct' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicinalProduct getMedicinalProduct();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getMedicinalProduct <em>Medicinal Product</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medicinal Product</em>' containment reference.
	 * @see #getMedicinalProduct()
	 * @generated
	 */
	void setMedicinalProduct(MedicinalProduct value);

	/**
	 * Returns the value of the '<em><b>Medicinal Product Authorization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The regulatory authorization of a medicinal product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medicinal Product Authorization</em>' containment reference.
	 * @see #setMedicinalProductAuthorization(MedicinalProductAuthorization)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_MedicinalProductAuthorization()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MedicinalProductAuthorization' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicinalProductAuthorization getMedicinalProductAuthorization();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getMedicinalProductAuthorization <em>Medicinal Product Authorization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medicinal Product Authorization</em>' containment reference.
	 * @see #getMedicinalProductAuthorization()
	 * @generated
	 */
	void setMedicinalProductAuthorization(MedicinalProductAuthorization value);

	/**
	 * Returns the value of the '<em><b>Medicinal Product Contraindication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The clinical particulars - indications, contraindications etc. of a medicinal product, including for regulatory purposes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medicinal Product Contraindication</em>' containment reference.
	 * @see #setMedicinalProductContraindication(MedicinalProductContraindication)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_MedicinalProductContraindication()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MedicinalProductContraindication' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicinalProductContraindication getMedicinalProductContraindication();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getMedicinalProductContraindication <em>Medicinal Product Contraindication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medicinal Product Contraindication</em>' containment reference.
	 * @see #getMedicinalProductContraindication()
	 * @generated
	 */
	void setMedicinalProductContraindication(MedicinalProductContraindication value);

	/**
	 * Returns the value of the '<em><b>Medicinal Product Indication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indication for the Medicinal Product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medicinal Product Indication</em>' containment reference.
	 * @see #setMedicinalProductIndication(MedicinalProductIndication)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_MedicinalProductIndication()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MedicinalProductIndication' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicinalProductIndication getMedicinalProductIndication();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getMedicinalProductIndication <em>Medicinal Product Indication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medicinal Product Indication</em>' containment reference.
	 * @see #getMedicinalProductIndication()
	 * @generated
	 */
	void setMedicinalProductIndication(MedicinalProductIndication value);

	/**
	 * Returns the value of the '<em><b>Medicinal Product Ingredient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An ingredient of a manufactured item or pharmaceutical product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medicinal Product Ingredient</em>' containment reference.
	 * @see #setMedicinalProductIngredient(MedicinalProductIngredient)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_MedicinalProductIngredient()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MedicinalProductIngredient' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicinalProductIngredient getMedicinalProductIngredient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getMedicinalProductIngredient <em>Medicinal Product Ingredient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medicinal Product Ingredient</em>' containment reference.
	 * @see #getMedicinalProductIngredient()
	 * @generated
	 */
	void setMedicinalProductIngredient(MedicinalProductIngredient value);

	/**
	 * Returns the value of the '<em><b>Medicinal Product Interaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The interactions of the medicinal product with other medicinal products, or other forms of interactions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medicinal Product Interaction</em>' containment reference.
	 * @see #setMedicinalProductInteraction(MedicinalProductInteraction)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_MedicinalProductInteraction()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MedicinalProductInteraction' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicinalProductInteraction getMedicinalProductInteraction();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getMedicinalProductInteraction <em>Medicinal Product Interaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medicinal Product Interaction</em>' containment reference.
	 * @see #getMedicinalProductInteraction()
	 * @generated
	 */
	void setMedicinalProductInteraction(MedicinalProductInteraction value);

	/**
	 * Returns the value of the '<em><b>Medicinal Product Manufactured</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The manufactured item as contained in the packaged medicinal product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medicinal Product Manufactured</em>' containment reference.
	 * @see #setMedicinalProductManufactured(MedicinalProductManufactured)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_MedicinalProductManufactured()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MedicinalProductManufactured' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicinalProductManufactured getMedicinalProductManufactured();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getMedicinalProductManufactured <em>Medicinal Product Manufactured</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medicinal Product Manufactured</em>' containment reference.
	 * @see #getMedicinalProductManufactured()
	 * @generated
	 */
	void setMedicinalProductManufactured(MedicinalProductManufactured value);

	/**
	 * Returns the value of the '<em><b>Medicinal Product Packaged</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A medicinal product in a container or package.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medicinal Product Packaged</em>' containment reference.
	 * @see #setMedicinalProductPackaged(MedicinalProductPackaged)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_MedicinalProductPackaged()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MedicinalProductPackaged' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicinalProductPackaged getMedicinalProductPackaged();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getMedicinalProductPackaged <em>Medicinal Product Packaged</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medicinal Product Packaged</em>' containment reference.
	 * @see #getMedicinalProductPackaged()
	 * @generated
	 */
	void setMedicinalProductPackaged(MedicinalProductPackaged value);

	/**
	 * Returns the value of the '<em><b>Medicinal Product Pharmaceutical</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A pharmaceutical product described in terms of its composition and dose form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medicinal Product Pharmaceutical</em>' containment reference.
	 * @see #setMedicinalProductPharmaceutical(MedicinalProductPharmaceutical)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_MedicinalProductPharmaceutical()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MedicinalProductPharmaceutical' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicinalProductPharmaceutical getMedicinalProductPharmaceutical();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getMedicinalProductPharmaceutical <em>Medicinal Product Pharmaceutical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medicinal Product Pharmaceutical</em>' containment reference.
	 * @see #getMedicinalProductPharmaceutical()
	 * @generated
	 */
	void setMedicinalProductPharmaceutical(MedicinalProductPharmaceutical value);

	/**
	 * Returns the value of the '<em><b>Medicinal Product Undesirable Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describe the undesirable effects of the medicinal product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medicinal Product Undesirable Effect</em>' containment reference.
	 * @see #setMedicinalProductUndesirableEffect(MedicinalProductUndesirableEffect)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_MedicinalProductUndesirableEffect()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MedicinalProductUndesirableEffect' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicinalProductUndesirableEffect getMedicinalProductUndesirableEffect();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getMedicinalProductUndesirableEffect <em>Medicinal Product Undesirable Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medicinal Product Undesirable Effect</em>' containment reference.
	 * @see #getMedicinalProductUndesirableEffect()
	 * @generated
	 */
	void setMedicinalProductUndesirableEffect(MedicinalProductUndesirableEffect value);

	/**
	 * Returns the value of the '<em><b>Message Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the characteristics of a message that can be shared between systems, including the type of event that initiates the message, the content to be transmitted and what response(s), if any, are permitted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Definition</em>' containment reference.
	 * @see #setMessageDefinition(MessageDefinition)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_MessageDefinition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MessageDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	MessageDefinition getMessageDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getMessageDefinition <em>Message Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Definition</em>' containment reference.
	 * @see #getMessageDefinition()
	 * @generated
	 */
	void setMessageDefinition(MessageDefinition value);

	/**
	 * Returns the value of the '<em><b>Message Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Header</em>' containment reference.
	 * @see #setMessageHeader(MessageHeader)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_MessageHeader()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MessageHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	MessageHeader getMessageHeader();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getMessageHeader <em>Message Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Header</em>' containment reference.
	 * @see #getMessageHeader()
	 * @generated
	 */
	void setMessageHeader(MessageHeader value);

	/**
	 * Returns the value of the '<em><b>Molecular Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Raw data describing a biological sequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Molecular Sequence</em>' containment reference.
	 * @see #setMolecularSequence(MolecularSequence)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_MolecularSequence()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MolecularSequence' namespace='##targetNamespace'"
	 * @generated
	 */
	MolecularSequence getMolecularSequence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getMolecularSequence <em>Molecular Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Molecular Sequence</em>' containment reference.
	 * @see #getMolecularSequence()
	 * @generated
	 */
	void setMolecularSequence(MolecularSequence value);

	/**
	 * Returns the value of the '<em><b>Naming System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A curated namespace that issues unique symbols within that namespace for the identification of concepts, people, devices, etc.  Represents a "System" used within the Identifier and Coding data types.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Naming System</em>' containment reference.
	 * @see #setNamingSystem(NamingSystem)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_NamingSystem()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NamingSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	NamingSystem getNamingSystem();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getNamingSystem <em>Naming System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Naming System</em>' containment reference.
	 * @see #getNamingSystem()
	 * @generated
	 */
	void setNamingSystem(NamingSystem value);

	/**
	 * Returns the value of the '<em><b>Nutrition Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nutrition Order</em>' containment reference.
	 * @see #setNutritionOrder(NutritionOrder)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_NutritionOrder()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NutritionOrder' namespace='##targetNamespace'"
	 * @generated
	 */
	NutritionOrder getNutritionOrder();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getNutritionOrder <em>Nutrition Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nutrition Order</em>' containment reference.
	 * @see #getNutritionOrder()
	 * @generated
	 */
	void setNutritionOrder(NutritionOrder value);

	/**
	 * Returns the value of the '<em><b>Observation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Measurements and simple assertions made about a patient, device or other subject.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Observation</em>' containment reference.
	 * @see #setObservation(Observation)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Observation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Observation' namespace='##targetNamespace'"
	 * @generated
	 */
	Observation getObservation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getObservation <em>Observation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observation</em>' containment reference.
	 * @see #getObservation()
	 * @generated
	 */
	void setObservation(Observation value);

	/**
	 * Returns the value of the '<em><b>Observation Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set of definitional characteristics for a kind of observation or measurement produced or consumed by an orderable health care service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Observation Definition</em>' containment reference.
	 * @see #setObservationDefinition(ObservationDefinition)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_ObservationDefinition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ObservationDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	ObservationDefinition getObservationDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getObservationDefinition <em>Observation Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observation Definition</em>' containment reference.
	 * @see #getObservationDefinition()
	 * @generated
	 */
	void setObservationDefinition(ObservationDefinition value);

	/**
	 * Returns the value of the '<em><b>Operation Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation Definition</em>' containment reference.
	 * @see #setOperationDefinition(OperationDefinition)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_OperationDefinition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OperationDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationDefinition getOperationDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getOperationDefinition <em>Operation Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Definition</em>' containment reference.
	 * @see #getOperationDefinition()
	 * @generated
	 */
	void setOperationDefinition(OperationDefinition value);

	/**
	 * Returns the value of the '<em><b>Operation Outcome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of error, warning, or information messages that result from a system action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation Outcome</em>' containment reference.
	 * @see #setOperationOutcome(OperationOutcome)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_OperationOutcome()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OperationOutcome' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationOutcome getOperationOutcome();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getOperationOutcome <em>Operation Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Outcome</em>' containment reference.
	 * @see #getOperationOutcome()
	 * @generated
	 */
	void setOperationOutcome(OperationOutcome value);

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A formally or informally recognized grouping of people or organizations formed for the purpose of achieving some form of collective action.  Includes companies, institutions, corporations, departments, community groups, healthcare practice groups, payer/insurer, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference.
	 * @see #setOrganization(Organization)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Organization()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Organization' namespace='##targetNamespace'"
	 * @generated
	 */
	Organization getOrganization();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getOrganization <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' containment reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(Organization value);

	/**
	 * Returns the value of the '<em><b>Organization Affiliation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines an affiliation/assotiation/relationship between 2 distinct oganizations, that is not a part-of relationship/sub-division relationship.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Affiliation</em>' containment reference.
	 * @see #setOrganizationAffiliation(OrganizationAffiliation)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_OrganizationAffiliation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OrganizationAffiliation' namespace='##targetNamespace'"
	 * @generated
	 */
	OrganizationAffiliation getOrganizationAffiliation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getOrganizationAffiliation <em>Organization Affiliation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Affiliation</em>' containment reference.
	 * @see #getOrganizationAffiliation()
	 * @generated
	 */
	void setOrganizationAffiliation(OrganizationAffiliation value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This resource is a non-persisted resource used to pass information into and back from an [operation](operations.html). It has no other use, and there is no RESTful endpoint associated with it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference.
	 * @see #setParameters(Parameters)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Parameters()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Parameters' namespace='##targetNamespace'"
	 * @generated
	 */
	Parameters getParameters();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getParameters <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' containment reference.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(Parameters value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Demographics and other administrative information about an individual or animal receiving care or other health-related services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Patient)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Patient()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Patient getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Patient value);

	/**
	 * Returns the value of the '<em><b>Payment Notice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This resource provides the status of the payment for goods and services rendered, and the request and response resource references.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Notice</em>' containment reference.
	 * @see #setPaymentNotice(PaymentNotice)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_PaymentNotice()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PaymentNotice' namespace='##targetNamespace'"
	 * @generated
	 */
	PaymentNotice getPaymentNotice();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getPaymentNotice <em>Payment Notice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Notice</em>' containment reference.
	 * @see #getPaymentNotice()
	 * @generated
	 */
	void setPaymentNotice(PaymentNotice value);

	/**
	 * Returns the value of the '<em><b>Payment Reconciliation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This resource provides the details including amount of a payment and allocates the payment items being paid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Reconciliation</em>' containment reference.
	 * @see #setPaymentReconciliation(PaymentReconciliation)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_PaymentReconciliation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PaymentReconciliation' namespace='##targetNamespace'"
	 * @generated
	 */
	PaymentReconciliation getPaymentReconciliation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getPaymentReconciliation <em>Payment Reconciliation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Reconciliation</em>' containment reference.
	 * @see #getPaymentReconciliation()
	 * @generated
	 */
	void setPaymentReconciliation(PaymentReconciliation value);

	/**
	 * Returns the value of the '<em><b>Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Demographics and administrative information about a person independent of a specific health-related context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person</em>' containment reference.
	 * @see #setPerson(Person)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Person()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Person' namespace='##targetNamespace'"
	 * @generated
	 */
	Person getPerson();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getPerson <em>Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' containment reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(Person value);

	/**
	 * Returns the value of the '<em><b>Plan Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plan Definition</em>' containment reference.
	 * @see #setPlanDefinition(PlanDefinition)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_PlanDefinition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PlanDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	PlanDefinition getPlanDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getPlanDefinition <em>Plan Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan Definition</em>' containment reference.
	 * @see #getPlanDefinition()
	 * @generated
	 */
	void setPlanDefinition(PlanDefinition value);

	/**
	 * Returns the value of the '<em><b>Practitioner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A person who is directly or indirectly involved in the provisioning of healthcare.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Practitioner</em>' containment reference.
	 * @see #setPractitioner(Practitioner)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Practitioner()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Practitioner' namespace='##targetNamespace'"
	 * @generated
	 */
	Practitioner getPractitioner();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getPractitioner <em>Practitioner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Practitioner</em>' containment reference.
	 * @see #getPractitioner()
	 * @generated
	 */
	void setPractitioner(Practitioner value);

	/**
	 * Returns the value of the '<em><b>Practitioner Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A specific set of Roles/Locations/specialties/services that a practitioner may perform at an organization for a period of time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Practitioner Role</em>' containment reference.
	 * @see #setPractitionerRole(PractitionerRole)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_PractitionerRole()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PractitionerRole' namespace='##targetNamespace'"
	 * @generated
	 */
	PractitionerRole getPractitionerRole();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getPractitionerRole <em>Practitioner Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Practitioner Role</em>' containment reference.
	 * @see #getPractitionerRole()
	 * @generated
	 */
	void setPractitionerRole(PractitionerRole value);

	/**
	 * Returns the value of the '<em><b>Procedure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An action that is or was performed on or for a patient. This can be a physical intervention like an operation, or less invasive like long term services, counseling, or hypnotherapy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Procedure</em>' containment reference.
	 * @see #setProcedure(Procedure)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Procedure()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Procedure' namespace='##targetNamespace'"
	 * @generated
	 */
	Procedure getProcedure();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getProcedure <em>Procedure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedure</em>' containment reference.
	 * @see #getProcedure()
	 * @generated
	 */
	void setProcedure(Procedure value);

	/**
	 * Returns the value of the '<em><b>Provenance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provenance</em>' containment reference.
	 * @see #setProvenance(Provenance)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Provenance()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Provenance' namespace='##targetNamespace'"
	 * @generated
	 */
	Provenance getProvenance();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getProvenance <em>Provenance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provenance</em>' containment reference.
	 * @see #getProvenance()
	 * @generated
	 */
	void setProvenance(Provenance value);

	/**
	 * Returns the value of the '<em><b>Questionnaire</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Questionnaire</em>' containment reference.
	 * @see #setQuestionnaire(Questionnaire)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Questionnaire()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Questionnaire' namespace='##targetNamespace'"
	 * @generated
	 */
	Questionnaire getQuestionnaire();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getQuestionnaire <em>Questionnaire</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Questionnaire</em>' containment reference.
	 * @see #getQuestionnaire()
	 * @generated
	 */
	void setQuestionnaire(Questionnaire value);

	/**
	 * Returns the value of the '<em><b>Questionnaire Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Questionnaire Response</em>' containment reference.
	 * @see #setQuestionnaireResponse(QuestionnaireResponse)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_QuestionnaireResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='QuestionnaireResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	QuestionnaireResponse getQuestionnaireResponse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getQuestionnaireResponse <em>Questionnaire Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Questionnaire Response</em>' containment reference.
	 * @see #getQuestionnaireResponse()
	 * @generated
	 */
	void setQuestionnaireResponse(QuestionnaireResponse value);

	/**
	 * Returns the value of the '<em><b>Related Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about a person that is involved in the care for a patient, but who is not the target of healthcare, nor has a formal responsibility in the care process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Person</em>' containment reference.
	 * @see #setRelatedPerson(RelatedPerson)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_RelatedPerson()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RelatedPerson' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatedPerson getRelatedPerson();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getRelatedPerson <em>Related Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Person</em>' containment reference.
	 * @see #getRelatedPerson()
	 * @generated
	 */
	void setRelatedPerson(RelatedPerson value);

	/**
	 * Returns the value of the '<em><b>Request Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A group of related requests that can be used to capture intended activities that have inter-dependencies such as "give this medication after that one".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request Group</em>' containment reference.
	 * @see #setRequestGroup(RequestGroup)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_RequestGroup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RequestGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestGroup getRequestGroup();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getRequestGroup <em>Request Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Group</em>' containment reference.
	 * @see #getRequestGroup()
	 * @generated
	 */
	void setRequestGroup(RequestGroup value);

	/**
	 * Returns the value of the '<em><b>Research Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ResearchDefinition resource describes the conditional state (population and any exposures being compared within the population) and outcome (if specified) that the knowledge (evidence, assertion, recommendation) is about.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Research Definition</em>' containment reference.
	 * @see #setResearchDefinition(ResearchDefinition)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_ResearchDefinition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ResearchDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	ResearchDefinition getResearchDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getResearchDefinition <em>Research Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Research Definition</em>' containment reference.
	 * @see #getResearchDefinition()
	 * @generated
	 */
	void setResearchDefinition(ResearchDefinition value);

	/**
	 * Returns the value of the '<em><b>Research Element Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ResearchElementDefinition resource describes a "PICO" element that knowledge (evidence, assertion, recommendation) is about.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Research Element Definition</em>' containment reference.
	 * @see #setResearchElementDefinition(ResearchElementDefinition)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_ResearchElementDefinition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ResearchElementDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	ResearchElementDefinition getResearchElementDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getResearchElementDefinition <em>Research Element Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Research Element Definition</em>' containment reference.
	 * @see #getResearchElementDefinition()
	 * @generated
	 */
	void setResearchElementDefinition(ResearchElementDefinition value);

	/**
	 * Returns the value of the '<em><b>Research Study</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A process where a researcher or organization plans and then executes a series of steps intended to increase the field of healthcare-related knowledge.  This includes studies of safety, efficacy, comparative effectiveness and other information about medications, devices, therapies and other interventional and investigative techniques.  A ResearchStudy involves the gathering of information about human or animal subjects.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Research Study</em>' containment reference.
	 * @see #setResearchStudy(ResearchStudy)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_ResearchStudy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ResearchStudy' namespace='##targetNamespace'"
	 * @generated
	 */
	ResearchStudy getResearchStudy();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getResearchStudy <em>Research Study</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Research Study</em>' containment reference.
	 * @see #getResearchStudy()
	 * @generated
	 */
	void setResearchStudy(ResearchStudy value);

	/**
	 * Returns the value of the '<em><b>Research Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A physical entity which is the primary unit of operational and/or administrative interest in a study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Research Subject</em>' containment reference.
	 * @see #setResearchSubject(ResearchSubject)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_ResearchSubject()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ResearchSubject' namespace='##targetNamespace'"
	 * @generated
	 */
	ResearchSubject getResearchSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getResearchSubject <em>Research Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Research Subject</em>' containment reference.
	 * @see #getResearchSubject()
	 * @generated
	 */
	void setResearchSubject(ResearchSubject value);

	/**
	 * Returns the value of the '<em><b>Risk Assessment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Risk Assessment</em>' containment reference.
	 * @see #setRiskAssessment(RiskAssessment)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_RiskAssessment()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RiskAssessment' namespace='##targetNamespace'"
	 * @generated
	 */
	RiskAssessment getRiskAssessment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getRiskAssessment <em>Risk Assessment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk Assessment</em>' containment reference.
	 * @see #getRiskAssessment()
	 * @generated
	 */
	void setRiskAssessment(RiskAssessment value);

	/**
	 * Returns the value of the '<em><b>Risk Evidence Synthesis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The RiskEvidenceSynthesis resource describes the likelihood of an outcome in a population plus exposure state where the risk estimate is derived from a combination of research studies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Risk Evidence Synthesis</em>' containment reference.
	 * @see #setRiskEvidenceSynthesis(RiskEvidenceSynthesis)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_RiskEvidenceSynthesis()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RiskEvidenceSynthesis' namespace='##targetNamespace'"
	 * @generated
	 */
	RiskEvidenceSynthesis getRiskEvidenceSynthesis();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getRiskEvidenceSynthesis <em>Risk Evidence Synthesis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk Evidence Synthesis</em>' containment reference.
	 * @see #getRiskEvidenceSynthesis()
	 * @generated
	 */
	void setRiskEvidenceSynthesis(RiskEvidenceSynthesis value);

	/**
	 * Returns the value of the '<em><b>Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for slots of time that may be available for booking appointments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schedule</em>' containment reference.
	 * @see #setSchedule(Schedule)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Schedule()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Schedule' namespace='##targetNamespace'"
	 * @generated
	 */
	Schedule getSchedule();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getSchedule <em>Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule</em>' containment reference.
	 * @see #getSchedule()
	 * @generated
	 */
	void setSchedule(Schedule value);

	/**
	 * Returns the value of the '<em><b>Search Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A search parameter that defines a named search item that can be used to search/filter on a resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Search Parameter</em>' containment reference.
	 * @see #setSearchParameter(SearchParameter)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_SearchParameter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SearchParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	SearchParameter getSearchParameter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getSearchParameter <em>Search Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Search Parameter</em>' containment reference.
	 * @see #getSearchParameter()
	 * @generated
	 */
	void setSearchParameter(SearchParameter value);

	/**
	 * Returns the value of the '<em><b>Service Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A record of a request for service such as diagnostic investigations, treatments, or operations to be performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Request</em>' containment reference.
	 * @see #setServiceRequest(ServiceRequest)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_ServiceRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServiceRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceRequest getServiceRequest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getServiceRequest <em>Service Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Request</em>' containment reference.
	 * @see #getServiceRequest()
	 * @generated
	 */
	void setServiceRequest(ServiceRequest value);

	/**
	 * Returns the value of the '<em><b>Slot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A slot of time on a schedule that may be available for booking appointments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Slot</em>' containment reference.
	 * @see #setSlot(Slot)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Slot()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Slot' namespace='##targetNamespace'"
	 * @generated
	 */
	Slot getSlot();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getSlot <em>Slot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slot</em>' containment reference.
	 * @see #getSlot()
	 * @generated
	 */
	void setSlot(Slot value);

	/**
	 * Returns the value of the '<em><b>Specimen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A sample to be used for analysis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specimen</em>' containment reference.
	 * @see #setSpecimen(Specimen)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Specimen()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Specimen' namespace='##targetNamespace'"
	 * @generated
	 */
	Specimen getSpecimen();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getSpecimen <em>Specimen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specimen</em>' containment reference.
	 * @see #getSpecimen()
	 * @generated
	 */
	void setSpecimen(Specimen value);

	/**
	 * Returns the value of the '<em><b>Specimen Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A kind of specimen with associated set of requirements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specimen Definition</em>' containment reference.
	 * @see #setSpecimenDefinition(SpecimenDefinition)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_SpecimenDefinition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SpecimenDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	SpecimenDefinition getSpecimenDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getSpecimenDefinition <em>Specimen Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specimen Definition</em>' containment reference.
	 * @see #getSpecimenDefinition()
	 * @generated
	 */
	void setSpecimenDefinition(SpecimenDefinition value);

	/**
	 * Returns the value of the '<em><b>Structure Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in FHIR, and also for describing extensions and constraints on resources and data types.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structure Definition</em>' containment reference.
	 * @see #setStructureDefinition(StructureDefinition)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_StructureDefinition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StructureDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	StructureDefinition getStructureDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getStructureDefinition <em>Structure Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure Definition</em>' containment reference.
	 * @see #getStructureDefinition()
	 * @generated
	 */
	void setStructureDefinition(StructureDefinition value);

	/**
	 * Returns the value of the '<em><b>Structure Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Map of relationships between 2 structures that can be used to transform data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structure Map</em>' containment reference.
	 * @see #setStructureMap(StructureMap)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_StructureMap()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StructureMap' namespace='##targetNamespace'"
	 * @generated
	 */
	StructureMap getStructureMap();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getStructureMap <em>Structure Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure Map</em>' containment reference.
	 * @see #getStructureMap()
	 * @generated
	 */
	void setStructureMap(StructureMap value);

	/**
	 * Returns the value of the '<em><b>Subscription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The subscription resource is used to define a push-based subscription from a server to another system. Once a subscription is registered with the server, the server checks every resource that is created or updated, and if the resource matches the given criteria, it sends a message on the defined "channel" so that another system can take an appropriate action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subscription</em>' containment reference.
	 * @see #setSubscription(Subscription)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Subscription()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Subscription' namespace='##targetNamespace'"
	 * @generated
	 */
	Subscription getSubscription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getSubscription <em>Subscription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription</em>' containment reference.
	 * @see #getSubscription()
	 * @generated
	 */
	void setSubscription(Subscription value);

	/**
	 * Returns the value of the '<em><b>Substance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A homogeneous material with a definite composition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substance</em>' containment reference.
	 * @see #setSubstance(Substance)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Substance()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Substance' namespace='##targetNamespace'"
	 * @generated
	 */
	Substance getSubstance();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getSubstance <em>Substance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substance</em>' containment reference.
	 * @see #getSubstance()
	 * @generated
	 */
	void setSubstance(Substance value);

	/**
	 * Returns the value of the '<em><b>Substance Nucleic Acid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nucleic acids are defined by three distinct elements: the base, sugar and linkage. Individual substance/moiety IDs will be created for each of these elements. The nucleotide sequence will be always entered in the 5’-3’ direction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substance Nucleic Acid</em>' containment reference.
	 * @see #setSubstanceNucleicAcid(SubstanceNucleicAcid)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_SubstanceNucleicAcid()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SubstanceNucleicAcid' namespace='##targetNamespace'"
	 * @generated
	 */
	SubstanceNucleicAcid getSubstanceNucleicAcid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getSubstanceNucleicAcid <em>Substance Nucleic Acid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substance Nucleic Acid</em>' containment reference.
	 * @see #getSubstanceNucleicAcid()
	 * @generated
	 */
	void setSubstanceNucleicAcid(SubstanceNucleicAcid value);

	/**
	 * Returns the value of the '<em><b>Substance Polymer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substance Polymer</em>' containment reference.
	 * @see #setSubstancePolymer(SubstancePolymer)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_SubstancePolymer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SubstancePolymer' namespace='##targetNamespace'"
	 * @generated
	 */
	SubstancePolymer getSubstancePolymer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getSubstancePolymer <em>Substance Polymer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substance Polymer</em>' containment reference.
	 * @see #getSubstancePolymer()
	 * @generated
	 */
	void setSubstancePolymer(SubstancePolymer value);

	/**
	 * Returns the value of the '<em><b>Substance Protein</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A SubstanceProtein is defined as a single unit of a linear amino acid sequence, or a combination of subunits that are either covalently linked or have a defined invariant stoichiometric relationship. This includes all synthetic, recombinant and purified SubstanceProteins of defined sequence, whether the use is therapeutic or prophylactic. This set of elements will be used to describe albumins, coagulation factors, cytokines, growth factors, peptide/SubstanceProtein hormones, enzymes, toxins, toxoids, recombinant vaccines, and immunomodulators.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substance Protein</em>' containment reference.
	 * @see #setSubstanceProtein(SubstanceProtein)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_SubstanceProtein()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SubstanceProtein' namespace='##targetNamespace'"
	 * @generated
	 */
	SubstanceProtein getSubstanceProtein();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getSubstanceProtein <em>Substance Protein</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substance Protein</em>' containment reference.
	 * @see #getSubstanceProtein()
	 * @generated
	 */
	void setSubstanceProtein(SubstanceProtein value);

	/**
	 * Returns the value of the '<em><b>Substance Reference Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substance Reference Information</em>' containment reference.
	 * @see #setSubstanceReferenceInformation(SubstanceReferenceInformation)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_SubstanceReferenceInformation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SubstanceReferenceInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	SubstanceReferenceInformation getSubstanceReferenceInformation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getSubstanceReferenceInformation <em>Substance Reference Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substance Reference Information</em>' containment reference.
	 * @see #getSubstanceReferenceInformation()
	 * @generated
	 */
	void setSubstanceReferenceInformation(SubstanceReferenceInformation value);

	/**
	 * Returns the value of the '<em><b>Substance Source Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Source material shall capture information on the taxonomic and anatomical origins as well as the fraction of a material that can result in or can be modified to form a substance. This set of data elements shall be used to define polymer substances isolated from biological matrices. Taxonomic and anatomical origins shall be described using a controlled vocabulary as required. This information is captured for naturally derived polymers ( . starch) and structurally diverse substances. For Organisms belonging to the Kingdom Plantae the Substance level defines the fresh material of a single species or infraspecies, the Herbal Drug and the Herbal preparation. For Herbal preparations, the fraction information will be captured at the Substance information level and additional information for herbal extracts will be captured at the Specified Substance Group 1 information level. See for further explanation the Substance Class: Structurally Diverse and the herbal annex.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substance Source Material</em>' containment reference.
	 * @see #setSubstanceSourceMaterial(SubstanceSourceMaterial)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_SubstanceSourceMaterial()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SubstanceSourceMaterial' namespace='##targetNamespace'"
	 * @generated
	 */
	SubstanceSourceMaterial getSubstanceSourceMaterial();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getSubstanceSourceMaterial <em>Substance Source Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substance Source Material</em>' containment reference.
	 * @see #getSubstanceSourceMaterial()
	 * @generated
	 */
	void setSubstanceSourceMaterial(SubstanceSourceMaterial value);

	/**
	 * Returns the value of the '<em><b>Substance Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The detailed description of a substance, typically at a level beyond what is used for prescribing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substance Specification</em>' containment reference.
	 * @see #setSubstanceSpecification(SubstanceSpecification)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_SubstanceSpecification()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SubstanceSpecification' namespace='##targetNamespace'"
	 * @generated
	 */
	SubstanceSpecification getSubstanceSpecification();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getSubstanceSpecification <em>Substance Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substance Specification</em>' containment reference.
	 * @see #getSubstanceSpecification()
	 * @generated
	 */
	void setSubstanceSpecification(SubstanceSpecification value);

	/**
	 * Returns the value of the '<em><b>Supply Delivery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Record of delivery of what is supplied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supply Delivery</em>' containment reference.
	 * @see #setSupplyDelivery(SupplyDelivery)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_SupplyDelivery()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SupplyDelivery' namespace='##targetNamespace'"
	 * @generated
	 */
	SupplyDelivery getSupplyDelivery();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getSupplyDelivery <em>Supply Delivery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supply Delivery</em>' containment reference.
	 * @see #getSupplyDelivery()
	 * @generated
	 */
	void setSupplyDelivery(SupplyDelivery value);

	/**
	 * Returns the value of the '<em><b>Supply Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A record of a request for a medication, substance or device used in the healthcare setting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supply Request</em>' containment reference.
	 * @see #setSupplyRequest(SupplyRequest)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_SupplyRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SupplyRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	SupplyRequest getSupplyRequest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getSupplyRequest <em>Supply Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supply Request</em>' containment reference.
	 * @see #getSupplyRequest()
	 * @generated
	 */
	void setSupplyRequest(SupplyRequest value);

	/**
	 * Returns the value of the '<em><b>Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A task to be performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Task</em>' containment reference.
	 * @see #setTask(Task)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Task()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Task' namespace='##targetNamespace'"
	 * @generated
	 */
	Task getTask();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getTask <em>Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' containment reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task value);

	/**
	 * Returns the value of the '<em><b>Terminology Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A TerminologyCapabilities resource documents a set of capabilities (behaviors) of a FHIR Terminology Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Terminology Capabilities</em>' containment reference.
	 * @see #setTerminologyCapabilities(TerminologyCapabilities)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_TerminologyCapabilities()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TerminologyCapabilities' namespace='##targetNamespace'"
	 * @generated
	 */
	TerminologyCapabilities getTerminologyCapabilities();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getTerminologyCapabilities <em>Terminology Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminology Capabilities</em>' containment reference.
	 * @see #getTerminologyCapabilities()
	 * @generated
	 */
	void setTerminologyCapabilities(TerminologyCapabilities value);

	/**
	 * Returns the value of the '<em><b>Test Report</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A summary of information based on the results of executing a TestScript.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test Report</em>' containment reference.
	 * @see #setTestReport(TestReport)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_TestReport()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TestReport' namespace='##targetNamespace'"
	 * @generated
	 */
	TestReport getTestReport();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getTestReport <em>Test Report</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Report</em>' containment reference.
	 * @see #getTestReport()
	 * @generated
	 */
	void setTestReport(TestReport value);

	/**
	 * Returns the value of the '<em><b>Test Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A structured set of tests against a FHIR server or client implementation to determine compliance against the FHIR specification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test Script</em>' containment reference.
	 * @see #setTestScript(TestScript)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_TestScript()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TestScript' namespace='##targetNamespace'"
	 * @generated
	 */
	TestScript getTestScript();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getTestScript <em>Test Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Script</em>' containment reference.
	 * @see #getTestScript()
	 * @generated
	 */
	void setTestScript(TestScript value);

	/**
	 * Returns the value of the '<em><b>Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A ValueSet resource instance specifies a set of codes drawn from one or more code systems, intended for use in a particular context. Value sets link between [[[CodeSystem]]] definitions and their use in [coded elements](terminologies.html).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Set</em>' containment reference.
	 * @see #setValueSet(ValueSet)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_ValueSet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ValueSet' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueSet getValueSet();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getValueSet <em>Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set</em>' containment reference.
	 * @see #getValueSet()
	 * @generated
	 */
	void setValueSet(ValueSet value);

	/**
	 * Returns the value of the '<em><b>Verification Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes validation requirements, source(s), status and dates for one or more elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verification Result</em>' containment reference.
	 * @see #setVerificationResult(VerificationResult)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_VerificationResult()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='VerificationResult' namespace='##targetNamespace'"
	 * @generated
	 */
	VerificationResult getVerificationResult();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getVerificationResult <em>Verification Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verification Result</em>' containment reference.
	 * @see #getVerificationResult()
	 * @generated
	 */
	void setVerificationResult(VerificationResult value);

	/**
	 * Returns the value of the '<em><b>Vision Prescription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An authorization for the provision of glasses and/or contact lenses to a patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vision Prescription</em>' containment reference.
	 * @see #setVisionPrescription(VisionPrescription)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_VisionPrescription()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='VisionPrescription' namespace='##targetNamespace'"
	 * @generated
	 */
	VisionPrescription getVisionPrescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getVisionPrescription <em>Vision Prescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vision Prescription</em>' containment reference.
	 * @see #getVisionPrescription()
	 * @generated
	 */
	void setVisionPrescription(VisionPrescription value);

} // DocumentRoot
