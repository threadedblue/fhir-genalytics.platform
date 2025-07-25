/**
 */
package org.hl7.fhir;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getAccount <em>Account</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getActivityDefinition <em>Activity Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getAdverseEvent <em>Adverse Event</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getAllergyIntolerance <em>Allergy Intolerance</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getAppointment <em>Appointment</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getAppointmentResponse <em>Appointment Response</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getAuditEvent <em>Audit Event</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getBasic <em>Basic</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getBinary <em>Binary</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getBiologicallyDerivedProduct <em>Biologically Derived Product</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getBodyStructure <em>Body Structure</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getBundle <em>Bundle</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getCapabilityStatement <em>Capability Statement</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getCarePlan <em>Care Plan</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getCareTeam <em>Care Team</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getCatalogEntry <em>Catalog Entry</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getChargeItem <em>Charge Item</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getChargeItemDefinition <em>Charge Item Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getClaim <em>Claim</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getClaimResponse <em>Claim Response</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getClinicalImpression <em>Clinical Impression</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getCodeSystem <em>Code System</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getCommunication <em>Communication</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getCommunicationRequest <em>Communication Request</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getCompartmentDefinition <em>Compartment Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getComposition <em>Composition</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getConceptMap <em>Concept Map</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getConsent <em>Consent</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getContract <em>Contract</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getCoverageEligibilityRequest <em>Coverage Eligibility Request</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getCoverageEligibilityResponse <em>Coverage Eligibility Response</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getDetectedIssue <em>Detected Issue</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getDeviceDefinition <em>Device Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getDeviceMetric <em>Device Metric</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getDeviceRequest <em>Device Request</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getDeviceUseStatement <em>Device Use Statement</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getDiagnosticReport <em>Diagnostic Report</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getDocumentManifest <em>Document Manifest</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getDocumentReference <em>Document Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getEffectEvidenceSynthesis <em>Effect Evidence Synthesis</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getEnrollmentRequest <em>Enrollment Request</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getEnrollmentResponse <em>Enrollment Response</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getEpisodeOfCare <em>Episode Of Care</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getEventDefinition <em>Event Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getEvidenceVariable <em>Evidence Variable</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getExampleScenario <em>Example Scenario</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getExplanationOfBenefit <em>Explanation Of Benefit</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getFamilyMemberHistory <em>Family Member History</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getFlag <em>Flag</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getGoal <em>Goal</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getGraphDefinition <em>Graph Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getGroup <em>Group</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getGuidanceResponse <em>Guidance Response</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getHealthcareService <em>Healthcare Service</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getImagingStudy <em>Imaging Study</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getImmunization <em>Immunization</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getImmunizationEvaluation <em>Immunization Evaluation</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getImmunizationRecommendation <em>Immunization Recommendation</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getImplementationGuide <em>Implementation Guide</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getInsurancePlan <em>Insurance Plan</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getInvoice <em>Invoice</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getLinkage <em>Linkage</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getList <em>List</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getMeasureReport <em>Measure Report</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getMedia <em>Media</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getMedication <em>Medication</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getMedicationAdministration <em>Medication Administration</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getMedicationDispense <em>Medication Dispense</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getMedicationKnowledge <em>Medication Knowledge</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getMedicationRequest <em>Medication Request</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getMedicationStatement <em>Medication Statement</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getMedicinalProduct <em>Medicinal Product</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getMedicinalProductAuthorization <em>Medicinal Product Authorization</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getMedicinalProductContraindication <em>Medicinal Product Contraindication</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getMedicinalProductIndication <em>Medicinal Product Indication</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getMedicinalProductIngredient <em>Medicinal Product Ingredient</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getMedicinalProductInteraction <em>Medicinal Product Interaction</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getMedicinalProductManufactured <em>Medicinal Product Manufactured</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getMedicinalProductPackaged <em>Medicinal Product Packaged</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getMedicinalProductPharmaceutical <em>Medicinal Product Pharmaceutical</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getMedicinalProductUndesirableEffect <em>Medicinal Product Undesirable Effect</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getMessageDefinition <em>Message Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getMessageHeader <em>Message Header</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getMolecularSequence <em>Molecular Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getNamingSystem <em>Naming System</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getNutritionOrder <em>Nutrition Order</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getObservation <em>Observation</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getObservationDefinition <em>Observation Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getOperationDefinition <em>Operation Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getOperationOutcome <em>Operation Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getOrganizationAffiliation <em>Organization Affiliation</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getPaymentNotice <em>Payment Notice</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getPaymentReconciliation <em>Payment Reconciliation</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getPerson <em>Person</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getPlanDefinition <em>Plan Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getPractitioner <em>Practitioner</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getPractitionerRole <em>Practitioner Role</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getProvenance <em>Provenance</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getQuestionnaire <em>Questionnaire</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getQuestionnaireResponse <em>Questionnaire Response</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getRelatedPerson <em>Related Person</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getRequestGroup <em>Request Group</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getResearchDefinition <em>Research Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getResearchElementDefinition <em>Research Element Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getResearchStudy <em>Research Study</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getResearchSubject <em>Research Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getRiskAssessment <em>Risk Assessment</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getRiskEvidenceSynthesis <em>Risk Evidence Synthesis</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getSearchParameter <em>Search Parameter</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getServiceRequest <em>Service Request</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getSlot <em>Slot</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getSpecimen <em>Specimen</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getSpecimenDefinition <em>Specimen Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getStructureDefinition <em>Structure Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getStructureMap <em>Structure Map</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getSubscription <em>Subscription</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getSubstance <em>Substance</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getSubstanceNucleicAcid <em>Substance Nucleic Acid</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getSubstancePolymer <em>Substance Polymer</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getSubstanceProtein <em>Substance Protein</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getSubstanceReferenceInformation <em>Substance Reference Information</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getSubstanceSourceMaterial <em>Substance Source Material</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getSubstanceSpecification <em>Substance Specification</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getSupplyDelivery <em>Supply Delivery</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getSupplyRequest <em>Supply Request</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getTask <em>Task</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getTerminologyCapabilities <em>Terminology Capabilities</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getTestReport <em>Test Report</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getTestScript <em>Test Script</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getVerificationResult <em>Verification Result</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getVisionPrescription <em>Vision Prescription</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getResourceContainer()
 * @model extendedMetaData="name='ResourceContainer' kind='elementOnly'"
 * @generated
 */
public interface ResourceContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Account</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account</em>' containment reference.
	 * @see #setAccount(Account)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Account()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Account' namespace='##targetNamespace'"
	 * @generated
	 */
	Account getAccount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getAccount <em>Account</em>}' containment reference.
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
	 * @return the value of the '<em>Activity Definition</em>' containment reference.
	 * @see #setActivityDefinition(ActivityDefinition)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_ActivityDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ActivityDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	ActivityDefinition getActivityDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getActivityDefinition <em>Activity Definition</em>}' containment reference.
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
	 * @return the value of the '<em>Adverse Event</em>' containment reference.
	 * @see #setAdverseEvent(AdverseEvent)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_AdverseEvent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AdverseEvent' namespace='##targetNamespace'"
	 * @generated
	 */
	AdverseEvent getAdverseEvent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getAdverseEvent <em>Adverse Event</em>}' containment reference.
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
	 * @return the value of the '<em>Allergy Intolerance</em>' containment reference.
	 * @see #setAllergyIntolerance(AllergyIntolerance)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_AllergyIntolerance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AllergyIntolerance' namespace='##targetNamespace'"
	 * @generated
	 */
	AllergyIntolerance getAllergyIntolerance();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getAllergyIntolerance <em>Allergy Intolerance</em>}' containment reference.
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
	 * @return the value of the '<em>Appointment</em>' containment reference.
	 * @see #setAppointment(Appointment)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Appointment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Appointment' namespace='##targetNamespace'"
	 * @generated
	 */
	Appointment getAppointment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getAppointment <em>Appointment</em>}' containment reference.
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
	 * @return the value of the '<em>Appointment Response</em>' containment reference.
	 * @see #setAppointmentResponse(AppointmentResponse)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_AppointmentResponse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AppointmentResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	AppointmentResponse getAppointmentResponse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getAppointmentResponse <em>Appointment Response</em>}' containment reference.
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
	 * @return the value of the '<em>Audit Event</em>' containment reference.
	 * @see #setAuditEvent(AuditEvent)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_AuditEvent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AuditEvent' namespace='##targetNamespace'"
	 * @generated
	 */
	AuditEvent getAuditEvent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getAuditEvent <em>Audit Event</em>}' containment reference.
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
	 * @return the value of the '<em>Basic</em>' containment reference.
	 * @see #setBasic(Basic)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Basic()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Basic' namespace='##targetNamespace'"
	 * @generated
	 */
	Basic getBasic();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getBasic <em>Basic</em>}' containment reference.
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
	 * @return the value of the '<em>Binary</em>' containment reference.
	 * @see #setBinary(Binary)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Binary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Binary' namespace='##targetNamespace'"
	 * @generated
	 */
	Binary getBinary();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getBinary <em>Binary</em>}' containment reference.
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
	 * @return the value of the '<em>Biologically Derived Product</em>' containment reference.
	 * @see #setBiologicallyDerivedProduct(BiologicallyDerivedProduct)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_BiologicallyDerivedProduct()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BiologicallyDerivedProduct' namespace='##targetNamespace'"
	 * @generated
	 */
	BiologicallyDerivedProduct getBiologicallyDerivedProduct();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getBiologicallyDerivedProduct <em>Biologically Derived Product</em>}' containment reference.
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
	 * @return the value of the '<em>Body Structure</em>' containment reference.
	 * @see #setBodyStructure(BodyStructure)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_BodyStructure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BodyStructure' namespace='##targetNamespace'"
	 * @generated
	 */
	BodyStructure getBodyStructure();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getBodyStructure <em>Body Structure</em>}' containment reference.
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
	 * @return the value of the '<em>Bundle</em>' containment reference.
	 * @see #setBundle(Bundle)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Bundle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bundle' namespace='##targetNamespace'"
	 * @generated
	 */
	Bundle getBundle();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getBundle <em>Bundle</em>}' containment reference.
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
	 * @return the value of the '<em>Capability Statement</em>' containment reference.
	 * @see #setCapabilityStatement(CapabilityStatement)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_CapabilityStatement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CapabilityStatement' namespace='##targetNamespace'"
	 * @generated
	 */
	CapabilityStatement getCapabilityStatement();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getCapabilityStatement <em>Capability Statement</em>}' containment reference.
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
	 * @return the value of the '<em>Care Plan</em>' containment reference.
	 * @see #setCarePlan(CarePlan)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_CarePlan()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CarePlan' namespace='##targetNamespace'"
	 * @generated
	 */
	CarePlan getCarePlan();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getCarePlan <em>Care Plan</em>}' containment reference.
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
	 * @return the value of the '<em>Care Team</em>' containment reference.
	 * @see #setCareTeam(CareTeam)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_CareTeam()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CareTeam' namespace='##targetNamespace'"
	 * @generated
	 */
	CareTeam getCareTeam();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getCareTeam <em>Care Team</em>}' containment reference.
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
	 * @return the value of the '<em>Catalog Entry</em>' containment reference.
	 * @see #setCatalogEntry(CatalogEntry)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_CatalogEntry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CatalogEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	CatalogEntry getCatalogEntry();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getCatalogEntry <em>Catalog Entry</em>}' containment reference.
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
	 * @return the value of the '<em>Charge Item</em>' containment reference.
	 * @see #setChargeItem(ChargeItem)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_ChargeItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ChargeItem' namespace='##targetNamespace'"
	 * @generated
	 */
	ChargeItem getChargeItem();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getChargeItem <em>Charge Item</em>}' containment reference.
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
	 * @return the value of the '<em>Charge Item Definition</em>' containment reference.
	 * @see #setChargeItemDefinition(ChargeItemDefinition)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_ChargeItemDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ChargeItemDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	ChargeItemDefinition getChargeItemDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getChargeItemDefinition <em>Charge Item Definition</em>}' containment reference.
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
	 * @return the value of the '<em>Claim</em>' containment reference.
	 * @see #setClaim(Claim)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Claim()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Claim' namespace='##targetNamespace'"
	 * @generated
	 */
	Claim getClaim();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getClaim <em>Claim</em>}' containment reference.
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
	 * @return the value of the '<em>Claim Response</em>' containment reference.
	 * @see #setClaimResponse(ClaimResponse)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_ClaimResponse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ClaimResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	ClaimResponse getClaimResponse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getClaimResponse <em>Claim Response</em>}' containment reference.
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
	 * @return the value of the '<em>Clinical Impression</em>' containment reference.
	 * @see #setClinicalImpression(ClinicalImpression)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_ClinicalImpression()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ClinicalImpression' namespace='##targetNamespace'"
	 * @generated
	 */
	ClinicalImpression getClinicalImpression();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getClinicalImpression <em>Clinical Impression</em>}' containment reference.
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
	 * @return the value of the '<em>Code System</em>' containment reference.
	 * @see #setCodeSystem(CodeSystem)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_CodeSystem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CodeSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeSystem getCodeSystem();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getCodeSystem <em>Code System</em>}' containment reference.
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
	 * @return the value of the '<em>Communication</em>' containment reference.
	 * @see #setCommunication(Communication)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Communication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Communication' namespace='##targetNamespace'"
	 * @generated
	 */
	Communication getCommunication();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getCommunication <em>Communication</em>}' containment reference.
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
	 * @return the value of the '<em>Communication Request</em>' containment reference.
	 * @see #setCommunicationRequest(CommunicationRequest)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_CommunicationRequest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CommunicationRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	CommunicationRequest getCommunicationRequest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getCommunicationRequest <em>Communication Request</em>}' containment reference.
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
	 * @return the value of the '<em>Compartment Definition</em>' containment reference.
	 * @see #setCompartmentDefinition(CompartmentDefinition)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_CompartmentDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CompartmentDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	CompartmentDefinition getCompartmentDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getCompartmentDefinition <em>Compartment Definition</em>}' containment reference.
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
	 * @return the value of the '<em>Composition</em>' containment reference.
	 * @see #setComposition(Composition)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Composition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Composition' namespace='##targetNamespace'"
	 * @generated
	 */
	Composition getComposition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getComposition <em>Composition</em>}' containment reference.
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
	 * @return the value of the '<em>Concept Map</em>' containment reference.
	 * @see #setConceptMap(ConceptMap)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_ConceptMap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConceptMap' namespace='##targetNamespace'"
	 * @generated
	 */
	ConceptMap getConceptMap();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getConceptMap <em>Concept Map</em>}' containment reference.
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
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Condition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Condition' namespace='##targetNamespace'"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getCondition <em>Condition</em>}' containment reference.
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
	 * @return the value of the '<em>Consent</em>' containment reference.
	 * @see #setConsent(Consent)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Consent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Consent' namespace='##targetNamespace'"
	 * @generated
	 */
	Consent getConsent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getConsent <em>Consent</em>}' containment reference.
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
	 * @return the value of the '<em>Contract</em>' containment reference.
	 * @see #setContract(Contract)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Contract()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Contract' namespace='##targetNamespace'"
	 * @generated
	 */
	Contract getContract();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getContract <em>Contract</em>}' containment reference.
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
	 * @return the value of the '<em>Coverage</em>' containment reference.
	 * @see #setCoverage(Coverage)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Coverage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Coverage' namespace='##targetNamespace'"
	 * @generated
	 */
	Coverage getCoverage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getCoverage <em>Coverage</em>}' containment reference.
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
	 * @return the value of the '<em>Coverage Eligibility Request</em>' containment reference.
	 * @see #setCoverageEligibilityRequest(CoverageEligibilityRequest)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_CoverageEligibilityRequest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CoverageEligibilityRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	CoverageEligibilityRequest getCoverageEligibilityRequest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getCoverageEligibilityRequest <em>Coverage Eligibility Request</em>}' containment reference.
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
	 * @return the value of the '<em>Coverage Eligibility Response</em>' containment reference.
	 * @see #setCoverageEligibilityResponse(CoverageEligibilityResponse)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_CoverageEligibilityResponse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CoverageEligibilityResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	CoverageEligibilityResponse getCoverageEligibilityResponse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getCoverageEligibilityResponse <em>Coverage Eligibility Response</em>}' containment reference.
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
	 * @return the value of the '<em>Detected Issue</em>' containment reference.
	 * @see #setDetectedIssue(DetectedIssue)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_DetectedIssue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DetectedIssue' namespace='##targetNamespace'"
	 * @generated
	 */
	DetectedIssue getDetectedIssue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getDetectedIssue <em>Detected Issue</em>}' containment reference.
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
	 * @return the value of the '<em>Device</em>' containment reference.
	 * @see #setDevice(Device)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Device()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Device' namespace='##targetNamespace'"
	 * @generated
	 */
	Device getDevice();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getDevice <em>Device</em>}' containment reference.
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
	 * @return the value of the '<em>Device Definition</em>' containment reference.
	 * @see #setDeviceDefinition(DeviceDefinition)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_DeviceDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeviceDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceDefinition getDeviceDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getDeviceDefinition <em>Device Definition</em>}' containment reference.
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
	 * @return the value of the '<em>Device Metric</em>' containment reference.
	 * @see #setDeviceMetric(DeviceMetric)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_DeviceMetric()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeviceMetric' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceMetric getDeviceMetric();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getDeviceMetric <em>Device Metric</em>}' containment reference.
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
	 * @return the value of the '<em>Device Request</em>' containment reference.
	 * @see #setDeviceRequest(DeviceRequest)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_DeviceRequest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeviceRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceRequest getDeviceRequest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getDeviceRequest <em>Device Request</em>}' containment reference.
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
	 * @return the value of the '<em>Device Use Statement</em>' containment reference.
	 * @see #setDeviceUseStatement(DeviceUseStatement)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_DeviceUseStatement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeviceUseStatement' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceUseStatement getDeviceUseStatement();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getDeviceUseStatement <em>Device Use Statement</em>}' containment reference.
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
	 * @return the value of the '<em>Diagnostic Report</em>' containment reference.
	 * @see #setDiagnosticReport(DiagnosticReport)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_DiagnosticReport()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DiagnosticReport' namespace='##targetNamespace'"
	 * @generated
	 */
	DiagnosticReport getDiagnosticReport();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getDiagnosticReport <em>Diagnostic Report</em>}' containment reference.
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
	 * @return the value of the '<em>Document Manifest</em>' containment reference.
	 * @see #setDocumentManifest(DocumentManifest)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_DocumentManifest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentManifest' namespace='##targetNamespace'"
	 * @generated
	 */
	DocumentManifest getDocumentManifest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getDocumentManifest <em>Document Manifest</em>}' containment reference.
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
	 * @return the value of the '<em>Document Reference</em>' containment reference.
	 * @see #setDocumentReference(DocumentReference)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_DocumentReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentReference' namespace='##targetNamespace'"
	 * @generated
	 */
	DocumentReference getDocumentReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getDocumentReference <em>Document Reference</em>}' containment reference.
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
	 * @return the value of the '<em>Effect Evidence Synthesis</em>' containment reference.
	 * @see #setEffectEvidenceSynthesis(EffectEvidenceSynthesis)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_EffectEvidenceSynthesis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EffectEvidenceSynthesis' namespace='##targetNamespace'"
	 * @generated
	 */
	EffectEvidenceSynthesis getEffectEvidenceSynthesis();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getEffectEvidenceSynthesis <em>Effect Evidence Synthesis</em>}' containment reference.
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
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Encounter)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Encounter getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getEncounter <em>Encounter</em>}' containment reference.
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
	 * @return the value of the '<em>Endpoint</em>' containment reference.
	 * @see #setEndpoint(Endpoint)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Endpoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Endpoint' namespace='##targetNamespace'"
	 * @generated
	 */
	Endpoint getEndpoint();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getEndpoint <em>Endpoint</em>}' containment reference.
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
	 * @return the value of the '<em>Enrollment Request</em>' containment reference.
	 * @see #setEnrollmentRequest(EnrollmentRequest)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_EnrollmentRequest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EnrollmentRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	EnrollmentRequest getEnrollmentRequest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getEnrollmentRequest <em>Enrollment Request</em>}' containment reference.
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
	 * @return the value of the '<em>Enrollment Response</em>' containment reference.
	 * @see #setEnrollmentResponse(EnrollmentResponse)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_EnrollmentResponse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EnrollmentResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	EnrollmentResponse getEnrollmentResponse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getEnrollmentResponse <em>Enrollment Response</em>}' containment reference.
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
	 * @return the value of the '<em>Episode Of Care</em>' containment reference.
	 * @see #setEpisodeOfCare(EpisodeOfCare)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_EpisodeOfCare()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EpisodeOfCare' namespace='##targetNamespace'"
	 * @generated
	 */
	EpisodeOfCare getEpisodeOfCare();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getEpisodeOfCare <em>Episode Of Care</em>}' containment reference.
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
	 * @return the value of the '<em>Event Definition</em>' containment reference.
	 * @see #setEventDefinition(EventDefinition)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_EventDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EventDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	EventDefinition getEventDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getEventDefinition <em>Event Definition</em>}' containment reference.
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
	 * @return the value of the '<em>Evidence</em>' containment reference.
	 * @see #setEvidence(Evidence)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Evidence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Evidence' namespace='##targetNamespace'"
	 * @generated
	 */
	Evidence getEvidence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getEvidence <em>Evidence</em>}' containment reference.
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
	 * @return the value of the '<em>Evidence Variable</em>' containment reference.
	 * @see #setEvidenceVariable(EvidenceVariable)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_EvidenceVariable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EvidenceVariable' namespace='##targetNamespace'"
	 * @generated
	 */
	EvidenceVariable getEvidenceVariable();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getEvidenceVariable <em>Evidence Variable</em>}' containment reference.
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
	 * @return the value of the '<em>Example Scenario</em>' containment reference.
	 * @see #setExampleScenario(ExampleScenario)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_ExampleScenario()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExampleScenario' namespace='##targetNamespace'"
	 * @generated
	 */
	ExampleScenario getExampleScenario();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getExampleScenario <em>Example Scenario</em>}' containment reference.
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
	 * @return the value of the '<em>Explanation Of Benefit</em>' containment reference.
	 * @see #setExplanationOfBenefit(ExplanationOfBenefit)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_ExplanationOfBenefit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExplanationOfBenefit' namespace='##targetNamespace'"
	 * @generated
	 */
	ExplanationOfBenefit getExplanationOfBenefit();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getExplanationOfBenefit <em>Explanation Of Benefit</em>}' containment reference.
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
	 * @return the value of the '<em>Family Member History</em>' containment reference.
	 * @see #setFamilyMemberHistory(FamilyMemberHistory)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_FamilyMemberHistory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FamilyMemberHistory' namespace='##targetNamespace'"
	 * @generated
	 */
	FamilyMemberHistory getFamilyMemberHistory();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getFamilyMemberHistory <em>Family Member History</em>}' containment reference.
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
	 * @return the value of the '<em>Flag</em>' containment reference.
	 * @see #setFlag(Flag)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Flag()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Flag' namespace='##targetNamespace'"
	 * @generated
	 */
	Flag getFlag();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getFlag <em>Flag</em>}' containment reference.
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
	 * @return the value of the '<em>Goal</em>' containment reference.
	 * @see #setGoal(Goal)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Goal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Goal' namespace='##targetNamespace'"
	 * @generated
	 */
	Goal getGoal();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getGoal <em>Goal</em>}' containment reference.
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
	 * @return the value of the '<em>Graph Definition</em>' containment reference.
	 * @see #setGraphDefinition(GraphDefinition)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_GraphDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GraphDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	GraphDefinition getGraphDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getGraphDefinition <em>Graph Definition</em>}' containment reference.
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
	 * @return the value of the '<em>Group</em>' containment reference.
	 * @see #setGroup(Group)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Group()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Group' namespace='##targetNamespace'"
	 * @generated
	 */
	Group getGroup();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getGroup <em>Group</em>}' containment reference.
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
	 * @return the value of the '<em>Guidance Response</em>' containment reference.
	 * @see #setGuidanceResponse(GuidanceResponse)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_GuidanceResponse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GuidanceResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	GuidanceResponse getGuidanceResponse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getGuidanceResponse <em>Guidance Response</em>}' containment reference.
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
	 * @return the value of the '<em>Healthcare Service</em>' containment reference.
	 * @see #setHealthcareService(HealthcareService)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_HealthcareService()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='HealthcareService' namespace='##targetNamespace'"
	 * @generated
	 */
	HealthcareService getHealthcareService();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getHealthcareService <em>Healthcare Service</em>}' containment reference.
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
	 * @return the value of the '<em>Imaging Study</em>' containment reference.
	 * @see #setImagingStudy(ImagingStudy)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_ImagingStudy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ImagingStudy' namespace='##targetNamespace'"
	 * @generated
	 */
	ImagingStudy getImagingStudy();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getImagingStudy <em>Imaging Study</em>}' containment reference.
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
	 * @return the value of the '<em>Immunization</em>' containment reference.
	 * @see #setImmunization(Immunization)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Immunization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Immunization' namespace='##targetNamespace'"
	 * @generated
	 */
	Immunization getImmunization();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getImmunization <em>Immunization</em>}' containment reference.
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
	 * @return the value of the '<em>Immunization Evaluation</em>' containment reference.
	 * @see #setImmunizationEvaluation(ImmunizationEvaluation)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_ImmunizationEvaluation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ImmunizationEvaluation' namespace='##targetNamespace'"
	 * @generated
	 */
	ImmunizationEvaluation getImmunizationEvaluation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getImmunizationEvaluation <em>Immunization Evaluation</em>}' containment reference.
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
	 * @return the value of the '<em>Immunization Recommendation</em>' containment reference.
	 * @see #setImmunizationRecommendation(ImmunizationRecommendation)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_ImmunizationRecommendation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ImmunizationRecommendation' namespace='##targetNamespace'"
	 * @generated
	 */
	ImmunizationRecommendation getImmunizationRecommendation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getImmunizationRecommendation <em>Immunization Recommendation</em>}' containment reference.
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
	 * @return the value of the '<em>Implementation Guide</em>' containment reference.
	 * @see #setImplementationGuide(ImplementationGuide)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_ImplementationGuide()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ImplementationGuide' namespace='##targetNamespace'"
	 * @generated
	 */
	ImplementationGuide getImplementationGuide();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getImplementationGuide <em>Implementation Guide</em>}' containment reference.
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
	 * @return the value of the '<em>Insurance Plan</em>' containment reference.
	 * @see #setInsurancePlan(InsurancePlan)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_InsurancePlan()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InsurancePlan' namespace='##targetNamespace'"
	 * @generated
	 */
	InsurancePlan getInsurancePlan();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getInsurancePlan <em>Insurance Plan</em>}' containment reference.
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
	 * @return the value of the '<em>Invoice</em>' containment reference.
	 * @see #setInvoice(Invoice)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Invoice()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Invoice' namespace='##targetNamespace'"
	 * @generated
	 */
	Invoice getInvoice();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getInvoice <em>Invoice</em>}' containment reference.
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
	 * @return the value of the '<em>Library</em>' containment reference.
	 * @see #setLibrary(Library)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Library()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Library' namespace='##targetNamespace'"
	 * @generated
	 */
	Library getLibrary();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getLibrary <em>Library</em>}' containment reference.
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
	 * @return the value of the '<em>Linkage</em>' containment reference.
	 * @see #setLinkage(Linkage)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Linkage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Linkage' namespace='##targetNamespace'"
	 * @generated
	 */
	Linkage getLinkage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getLinkage <em>Linkage</em>}' containment reference.
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
	 * @return the value of the '<em>List</em>' containment reference.
	 * @see #setList(List)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_List()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='List' namespace='##targetNamespace'"
	 * @generated
	 */
	List getList();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getList <em>List</em>}' containment reference.
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
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Location)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Location' namespace='##targetNamespace'"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getLocation <em>Location</em>}' containment reference.
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
	 * @return the value of the '<em>Measure</em>' containment reference.
	 * @see #setMeasure(Measure)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Measure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Measure' namespace='##targetNamespace'"
	 * @generated
	 */
	Measure getMeasure();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getMeasure <em>Measure</em>}' containment reference.
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
	 * @return the value of the '<em>Measure Report</em>' containment reference.
	 * @see #setMeasureReport(MeasureReport)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_MeasureReport()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MeasureReport' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasureReport getMeasureReport();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getMeasureReport <em>Measure Report</em>}' containment reference.
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
	 * @return the value of the '<em>Media</em>' containment reference.
	 * @see #setMedia(Media)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Media()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Media' namespace='##targetNamespace'"
	 * @generated
	 */
	Media getMedia();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getMedia <em>Media</em>}' containment reference.
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
	 * @return the value of the '<em>Medication</em>' containment reference.
	 * @see #setMedication(Medication)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Medication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Medication' namespace='##targetNamespace'"
	 * @generated
	 */
	Medication getMedication();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getMedication <em>Medication</em>}' containment reference.
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
	 * @return the value of the '<em>Medication Administration</em>' containment reference.
	 * @see #setMedicationAdministration(MedicationAdministration)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_MedicationAdministration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MedicationAdministration' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationAdministration getMedicationAdministration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getMedicationAdministration <em>Medication Administration</em>}' containment reference.
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
	 * @return the value of the '<em>Medication Dispense</em>' containment reference.
	 * @see #setMedicationDispense(MedicationDispense)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_MedicationDispense()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MedicationDispense' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationDispense getMedicationDispense();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getMedicationDispense <em>Medication Dispense</em>}' containment reference.
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
	 * @return the value of the '<em>Medication Knowledge</em>' containment reference.
	 * @see #setMedicationKnowledge(MedicationKnowledge)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_MedicationKnowledge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MedicationKnowledge' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationKnowledge getMedicationKnowledge();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getMedicationKnowledge <em>Medication Knowledge</em>}' containment reference.
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
	 * @return the value of the '<em>Medication Request</em>' containment reference.
	 * @see #setMedicationRequest(MedicationRequest)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_MedicationRequest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MedicationRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationRequest getMedicationRequest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getMedicationRequest <em>Medication Request</em>}' containment reference.
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
	 * @return the value of the '<em>Medication Statement</em>' containment reference.
	 * @see #setMedicationStatement(MedicationStatement)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_MedicationStatement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MedicationStatement' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationStatement getMedicationStatement();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getMedicationStatement <em>Medication Statement</em>}' containment reference.
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
	 * @return the value of the '<em>Medicinal Product</em>' containment reference.
	 * @see #setMedicinalProduct(MedicinalProduct)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_MedicinalProduct()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MedicinalProduct' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicinalProduct getMedicinalProduct();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getMedicinalProduct <em>Medicinal Product</em>}' containment reference.
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
	 * @return the value of the '<em>Medicinal Product Authorization</em>' containment reference.
	 * @see #setMedicinalProductAuthorization(MedicinalProductAuthorization)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_MedicinalProductAuthorization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MedicinalProductAuthorization' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicinalProductAuthorization getMedicinalProductAuthorization();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getMedicinalProductAuthorization <em>Medicinal Product Authorization</em>}' containment reference.
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
	 * @return the value of the '<em>Medicinal Product Contraindication</em>' containment reference.
	 * @see #setMedicinalProductContraindication(MedicinalProductContraindication)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_MedicinalProductContraindication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MedicinalProductContraindication' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicinalProductContraindication getMedicinalProductContraindication();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getMedicinalProductContraindication <em>Medicinal Product Contraindication</em>}' containment reference.
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
	 * @return the value of the '<em>Medicinal Product Indication</em>' containment reference.
	 * @see #setMedicinalProductIndication(MedicinalProductIndication)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_MedicinalProductIndication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MedicinalProductIndication' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicinalProductIndication getMedicinalProductIndication();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getMedicinalProductIndication <em>Medicinal Product Indication</em>}' containment reference.
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
	 * @return the value of the '<em>Medicinal Product Ingredient</em>' containment reference.
	 * @see #setMedicinalProductIngredient(MedicinalProductIngredient)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_MedicinalProductIngredient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MedicinalProductIngredient' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicinalProductIngredient getMedicinalProductIngredient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getMedicinalProductIngredient <em>Medicinal Product Ingredient</em>}' containment reference.
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
	 * @return the value of the '<em>Medicinal Product Interaction</em>' containment reference.
	 * @see #setMedicinalProductInteraction(MedicinalProductInteraction)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_MedicinalProductInteraction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MedicinalProductInteraction' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicinalProductInteraction getMedicinalProductInteraction();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getMedicinalProductInteraction <em>Medicinal Product Interaction</em>}' containment reference.
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
	 * @return the value of the '<em>Medicinal Product Manufactured</em>' containment reference.
	 * @see #setMedicinalProductManufactured(MedicinalProductManufactured)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_MedicinalProductManufactured()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MedicinalProductManufactured' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicinalProductManufactured getMedicinalProductManufactured();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getMedicinalProductManufactured <em>Medicinal Product Manufactured</em>}' containment reference.
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
	 * @return the value of the '<em>Medicinal Product Packaged</em>' containment reference.
	 * @see #setMedicinalProductPackaged(MedicinalProductPackaged)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_MedicinalProductPackaged()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MedicinalProductPackaged' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicinalProductPackaged getMedicinalProductPackaged();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getMedicinalProductPackaged <em>Medicinal Product Packaged</em>}' containment reference.
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
	 * @return the value of the '<em>Medicinal Product Pharmaceutical</em>' containment reference.
	 * @see #setMedicinalProductPharmaceutical(MedicinalProductPharmaceutical)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_MedicinalProductPharmaceutical()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MedicinalProductPharmaceutical' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicinalProductPharmaceutical getMedicinalProductPharmaceutical();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getMedicinalProductPharmaceutical <em>Medicinal Product Pharmaceutical</em>}' containment reference.
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
	 * @return the value of the '<em>Medicinal Product Undesirable Effect</em>' containment reference.
	 * @see #setMedicinalProductUndesirableEffect(MedicinalProductUndesirableEffect)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_MedicinalProductUndesirableEffect()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MedicinalProductUndesirableEffect' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicinalProductUndesirableEffect getMedicinalProductUndesirableEffect();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getMedicinalProductUndesirableEffect <em>Medicinal Product Undesirable Effect</em>}' containment reference.
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
	 * @return the value of the '<em>Message Definition</em>' containment reference.
	 * @see #setMessageDefinition(MessageDefinition)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_MessageDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MessageDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	MessageDefinition getMessageDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getMessageDefinition <em>Message Definition</em>}' containment reference.
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
	 * @return the value of the '<em>Message Header</em>' containment reference.
	 * @see #setMessageHeader(MessageHeader)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_MessageHeader()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MessageHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	MessageHeader getMessageHeader();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getMessageHeader <em>Message Header</em>}' containment reference.
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
	 * @return the value of the '<em>Molecular Sequence</em>' containment reference.
	 * @see #setMolecularSequence(MolecularSequence)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_MolecularSequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MolecularSequence' namespace='##targetNamespace'"
	 * @generated
	 */
	MolecularSequence getMolecularSequence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getMolecularSequence <em>Molecular Sequence</em>}' containment reference.
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
	 * @return the value of the '<em>Naming System</em>' containment reference.
	 * @see #setNamingSystem(NamingSystem)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_NamingSystem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NamingSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	NamingSystem getNamingSystem();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getNamingSystem <em>Naming System</em>}' containment reference.
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
	 * @return the value of the '<em>Nutrition Order</em>' containment reference.
	 * @see #setNutritionOrder(NutritionOrder)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_NutritionOrder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NutritionOrder' namespace='##targetNamespace'"
	 * @generated
	 */
	NutritionOrder getNutritionOrder();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getNutritionOrder <em>Nutrition Order</em>}' containment reference.
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
	 * @return the value of the '<em>Observation</em>' containment reference.
	 * @see #setObservation(Observation)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Observation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Observation' namespace='##targetNamespace'"
	 * @generated
	 */
	Observation getObservation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getObservation <em>Observation</em>}' containment reference.
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
	 * @return the value of the '<em>Observation Definition</em>' containment reference.
	 * @see #setObservationDefinition(ObservationDefinition)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_ObservationDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ObservationDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	ObservationDefinition getObservationDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getObservationDefinition <em>Observation Definition</em>}' containment reference.
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
	 * @return the value of the '<em>Operation Definition</em>' containment reference.
	 * @see #setOperationDefinition(OperationDefinition)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_OperationDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OperationDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationDefinition getOperationDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getOperationDefinition <em>Operation Definition</em>}' containment reference.
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
	 * @return the value of the '<em>Operation Outcome</em>' containment reference.
	 * @see #setOperationOutcome(OperationOutcome)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_OperationOutcome()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OperationOutcome' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationOutcome getOperationOutcome();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getOperationOutcome <em>Operation Outcome</em>}' containment reference.
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
	 * @return the value of the '<em>Organization</em>' containment reference.
	 * @see #setOrganization(Organization)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Organization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Organization' namespace='##targetNamespace'"
	 * @generated
	 */
	Organization getOrganization();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getOrganization <em>Organization</em>}' containment reference.
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
	 * @return the value of the '<em>Organization Affiliation</em>' containment reference.
	 * @see #setOrganizationAffiliation(OrganizationAffiliation)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_OrganizationAffiliation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OrganizationAffiliation' namespace='##targetNamespace'"
	 * @generated
	 */
	OrganizationAffiliation getOrganizationAffiliation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getOrganizationAffiliation <em>Organization Affiliation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Affiliation</em>' containment reference.
	 * @see #getOrganizationAffiliation()
	 * @generated
	 */
	void setOrganizationAffiliation(OrganizationAffiliation value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Patient)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Patient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Patient getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getPatient <em>Patient</em>}' containment reference.
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
	 * @return the value of the '<em>Payment Notice</em>' containment reference.
	 * @see #setPaymentNotice(PaymentNotice)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_PaymentNotice()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PaymentNotice' namespace='##targetNamespace'"
	 * @generated
	 */
	PaymentNotice getPaymentNotice();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getPaymentNotice <em>Payment Notice</em>}' containment reference.
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
	 * @return the value of the '<em>Payment Reconciliation</em>' containment reference.
	 * @see #setPaymentReconciliation(PaymentReconciliation)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_PaymentReconciliation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PaymentReconciliation' namespace='##targetNamespace'"
	 * @generated
	 */
	PaymentReconciliation getPaymentReconciliation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getPaymentReconciliation <em>Payment Reconciliation</em>}' containment reference.
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
	 * @return the value of the '<em>Person</em>' containment reference.
	 * @see #setPerson(Person)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Person()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Person' namespace='##targetNamespace'"
	 * @generated
	 */
	Person getPerson();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getPerson <em>Person</em>}' containment reference.
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
	 * @return the value of the '<em>Plan Definition</em>' containment reference.
	 * @see #setPlanDefinition(PlanDefinition)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_PlanDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PlanDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	PlanDefinition getPlanDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getPlanDefinition <em>Plan Definition</em>}' containment reference.
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
	 * @return the value of the '<em>Practitioner</em>' containment reference.
	 * @see #setPractitioner(Practitioner)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Practitioner()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Practitioner' namespace='##targetNamespace'"
	 * @generated
	 */
	Practitioner getPractitioner();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getPractitioner <em>Practitioner</em>}' containment reference.
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
	 * @return the value of the '<em>Practitioner Role</em>' containment reference.
	 * @see #setPractitionerRole(PractitionerRole)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_PractitionerRole()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PractitionerRole' namespace='##targetNamespace'"
	 * @generated
	 */
	PractitionerRole getPractitionerRole();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getPractitionerRole <em>Practitioner Role</em>}' containment reference.
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
	 * @return the value of the '<em>Procedure</em>' containment reference.
	 * @see #setProcedure(Procedure)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Procedure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Procedure' namespace='##targetNamespace'"
	 * @generated
	 */
	Procedure getProcedure();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getProcedure <em>Procedure</em>}' containment reference.
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
	 * @return the value of the '<em>Provenance</em>' containment reference.
	 * @see #setProvenance(Provenance)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Provenance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Provenance' namespace='##targetNamespace'"
	 * @generated
	 */
	Provenance getProvenance();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getProvenance <em>Provenance</em>}' containment reference.
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
	 * @return the value of the '<em>Questionnaire</em>' containment reference.
	 * @see #setQuestionnaire(Questionnaire)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Questionnaire()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Questionnaire' namespace='##targetNamespace'"
	 * @generated
	 */
	Questionnaire getQuestionnaire();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getQuestionnaire <em>Questionnaire</em>}' containment reference.
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
	 * @return the value of the '<em>Questionnaire Response</em>' containment reference.
	 * @see #setQuestionnaireResponse(QuestionnaireResponse)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_QuestionnaireResponse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='QuestionnaireResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	QuestionnaireResponse getQuestionnaireResponse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getQuestionnaireResponse <em>Questionnaire Response</em>}' containment reference.
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
	 * @return the value of the '<em>Related Person</em>' containment reference.
	 * @see #setRelatedPerson(RelatedPerson)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_RelatedPerson()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RelatedPerson' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatedPerson getRelatedPerson();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getRelatedPerson <em>Related Person</em>}' containment reference.
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
	 * @return the value of the '<em>Request Group</em>' containment reference.
	 * @see #setRequestGroup(RequestGroup)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_RequestGroup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RequestGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestGroup getRequestGroup();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getRequestGroup <em>Request Group</em>}' containment reference.
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
	 * @return the value of the '<em>Research Definition</em>' containment reference.
	 * @see #setResearchDefinition(ResearchDefinition)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_ResearchDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ResearchDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	ResearchDefinition getResearchDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getResearchDefinition <em>Research Definition</em>}' containment reference.
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
	 * @return the value of the '<em>Research Element Definition</em>' containment reference.
	 * @see #setResearchElementDefinition(ResearchElementDefinition)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_ResearchElementDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ResearchElementDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	ResearchElementDefinition getResearchElementDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getResearchElementDefinition <em>Research Element Definition</em>}' containment reference.
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
	 * @return the value of the '<em>Research Study</em>' containment reference.
	 * @see #setResearchStudy(ResearchStudy)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_ResearchStudy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ResearchStudy' namespace='##targetNamespace'"
	 * @generated
	 */
	ResearchStudy getResearchStudy();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getResearchStudy <em>Research Study</em>}' containment reference.
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
	 * @return the value of the '<em>Research Subject</em>' containment reference.
	 * @see #setResearchSubject(ResearchSubject)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_ResearchSubject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ResearchSubject' namespace='##targetNamespace'"
	 * @generated
	 */
	ResearchSubject getResearchSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getResearchSubject <em>Research Subject</em>}' containment reference.
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
	 * @return the value of the '<em>Risk Assessment</em>' containment reference.
	 * @see #setRiskAssessment(RiskAssessment)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_RiskAssessment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RiskAssessment' namespace='##targetNamespace'"
	 * @generated
	 */
	RiskAssessment getRiskAssessment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getRiskAssessment <em>Risk Assessment</em>}' containment reference.
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
	 * @return the value of the '<em>Risk Evidence Synthesis</em>' containment reference.
	 * @see #setRiskEvidenceSynthesis(RiskEvidenceSynthesis)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_RiskEvidenceSynthesis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RiskEvidenceSynthesis' namespace='##targetNamespace'"
	 * @generated
	 */
	RiskEvidenceSynthesis getRiskEvidenceSynthesis();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getRiskEvidenceSynthesis <em>Risk Evidence Synthesis</em>}' containment reference.
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
	 * @return the value of the '<em>Schedule</em>' containment reference.
	 * @see #setSchedule(Schedule)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Schedule()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Schedule' namespace='##targetNamespace'"
	 * @generated
	 */
	Schedule getSchedule();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getSchedule <em>Schedule</em>}' containment reference.
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
	 * @return the value of the '<em>Search Parameter</em>' containment reference.
	 * @see #setSearchParameter(SearchParameter)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_SearchParameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SearchParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	SearchParameter getSearchParameter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getSearchParameter <em>Search Parameter</em>}' containment reference.
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
	 * @return the value of the '<em>Service Request</em>' containment reference.
	 * @see #setServiceRequest(ServiceRequest)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_ServiceRequest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ServiceRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceRequest getServiceRequest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getServiceRequest <em>Service Request</em>}' containment reference.
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
	 * @return the value of the '<em>Slot</em>' containment reference.
	 * @see #setSlot(Slot)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Slot()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Slot' namespace='##targetNamespace'"
	 * @generated
	 */
	Slot getSlot();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getSlot <em>Slot</em>}' containment reference.
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
	 * @return the value of the '<em>Specimen</em>' containment reference.
	 * @see #setSpecimen(Specimen)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Specimen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Specimen' namespace='##targetNamespace'"
	 * @generated
	 */
	Specimen getSpecimen();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getSpecimen <em>Specimen</em>}' containment reference.
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
	 * @return the value of the '<em>Specimen Definition</em>' containment reference.
	 * @see #setSpecimenDefinition(SpecimenDefinition)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_SpecimenDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SpecimenDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	SpecimenDefinition getSpecimenDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getSpecimenDefinition <em>Specimen Definition</em>}' containment reference.
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
	 * @return the value of the '<em>Structure Definition</em>' containment reference.
	 * @see #setStructureDefinition(StructureDefinition)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_StructureDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StructureDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	StructureDefinition getStructureDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getStructureDefinition <em>Structure Definition</em>}' containment reference.
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
	 * @return the value of the '<em>Structure Map</em>' containment reference.
	 * @see #setStructureMap(StructureMap)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_StructureMap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StructureMap' namespace='##targetNamespace'"
	 * @generated
	 */
	StructureMap getStructureMap();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getStructureMap <em>Structure Map</em>}' containment reference.
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
	 * @return the value of the '<em>Subscription</em>' containment reference.
	 * @see #setSubscription(Subscription)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Subscription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Subscription' namespace='##targetNamespace'"
	 * @generated
	 */
	Subscription getSubscription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getSubscription <em>Subscription</em>}' containment reference.
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
	 * @return the value of the '<em>Substance</em>' containment reference.
	 * @see #setSubstance(Substance)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Substance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Substance' namespace='##targetNamespace'"
	 * @generated
	 */
	Substance getSubstance();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getSubstance <em>Substance</em>}' containment reference.
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
	 * @return the value of the '<em>Substance Nucleic Acid</em>' containment reference.
	 * @see #setSubstanceNucleicAcid(SubstanceNucleicAcid)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_SubstanceNucleicAcid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubstanceNucleicAcid' namespace='##targetNamespace'"
	 * @generated
	 */
	SubstanceNucleicAcid getSubstanceNucleicAcid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getSubstanceNucleicAcid <em>Substance Nucleic Acid</em>}' containment reference.
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
	 * @return the value of the '<em>Substance Polymer</em>' containment reference.
	 * @see #setSubstancePolymer(SubstancePolymer)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_SubstancePolymer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubstancePolymer' namespace='##targetNamespace'"
	 * @generated
	 */
	SubstancePolymer getSubstancePolymer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getSubstancePolymer <em>Substance Polymer</em>}' containment reference.
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
	 * @return the value of the '<em>Substance Protein</em>' containment reference.
	 * @see #setSubstanceProtein(SubstanceProtein)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_SubstanceProtein()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubstanceProtein' namespace='##targetNamespace'"
	 * @generated
	 */
	SubstanceProtein getSubstanceProtein();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getSubstanceProtein <em>Substance Protein</em>}' containment reference.
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
	 * @return the value of the '<em>Substance Reference Information</em>' containment reference.
	 * @see #setSubstanceReferenceInformation(SubstanceReferenceInformation)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_SubstanceReferenceInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubstanceReferenceInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	SubstanceReferenceInformation getSubstanceReferenceInformation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getSubstanceReferenceInformation <em>Substance Reference Information</em>}' containment reference.
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
	 * @return the value of the '<em>Substance Source Material</em>' containment reference.
	 * @see #setSubstanceSourceMaterial(SubstanceSourceMaterial)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_SubstanceSourceMaterial()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubstanceSourceMaterial' namespace='##targetNamespace'"
	 * @generated
	 */
	SubstanceSourceMaterial getSubstanceSourceMaterial();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getSubstanceSourceMaterial <em>Substance Source Material</em>}' containment reference.
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
	 * @return the value of the '<em>Substance Specification</em>' containment reference.
	 * @see #setSubstanceSpecification(SubstanceSpecification)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_SubstanceSpecification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubstanceSpecification' namespace='##targetNamespace'"
	 * @generated
	 */
	SubstanceSpecification getSubstanceSpecification();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getSubstanceSpecification <em>Substance Specification</em>}' containment reference.
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
	 * @return the value of the '<em>Supply Delivery</em>' containment reference.
	 * @see #setSupplyDelivery(SupplyDelivery)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_SupplyDelivery()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SupplyDelivery' namespace='##targetNamespace'"
	 * @generated
	 */
	SupplyDelivery getSupplyDelivery();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getSupplyDelivery <em>Supply Delivery</em>}' containment reference.
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
	 * @return the value of the '<em>Supply Request</em>' containment reference.
	 * @see #setSupplyRequest(SupplyRequest)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_SupplyRequest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SupplyRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	SupplyRequest getSupplyRequest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getSupplyRequest <em>Supply Request</em>}' containment reference.
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
	 * @return the value of the '<em>Task</em>' containment reference.
	 * @see #setTask(Task)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Task()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Task' namespace='##targetNamespace'"
	 * @generated
	 */
	Task getTask();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getTask <em>Task</em>}' containment reference.
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
	 * @return the value of the '<em>Terminology Capabilities</em>' containment reference.
	 * @see #setTerminologyCapabilities(TerminologyCapabilities)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_TerminologyCapabilities()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TerminologyCapabilities' namespace='##targetNamespace'"
	 * @generated
	 */
	TerminologyCapabilities getTerminologyCapabilities();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getTerminologyCapabilities <em>Terminology Capabilities</em>}' containment reference.
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
	 * @return the value of the '<em>Test Report</em>' containment reference.
	 * @see #setTestReport(TestReport)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_TestReport()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TestReport' namespace='##targetNamespace'"
	 * @generated
	 */
	TestReport getTestReport();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getTestReport <em>Test Report</em>}' containment reference.
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
	 * @return the value of the '<em>Test Script</em>' containment reference.
	 * @see #setTestScript(TestScript)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_TestScript()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TestScript' namespace='##targetNamespace'"
	 * @generated
	 */
	TestScript getTestScript();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getTestScript <em>Test Script</em>}' containment reference.
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
	 * @return the value of the '<em>Value Set</em>' containment reference.
	 * @see #setValueSet(ValueSet)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_ValueSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ValueSet' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueSet getValueSet();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getValueSet <em>Value Set</em>}' containment reference.
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
	 * @return the value of the '<em>Verification Result</em>' containment reference.
	 * @see #setVerificationResult(VerificationResult)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_VerificationResult()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VerificationResult' namespace='##targetNamespace'"
	 * @generated
	 */
	VerificationResult getVerificationResult();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getVerificationResult <em>Verification Result</em>}' containment reference.
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
	 * @return the value of the '<em>Vision Prescription</em>' containment reference.
	 * @see #setVisionPrescription(VisionPrescription)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_VisionPrescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VisionPrescription' namespace='##targetNamespace'"
	 * @generated
	 */
	VisionPrescription getVisionPrescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getVisionPrescription <em>Vision Prescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vision Prescription</em>' containment reference.
	 * @see #getVisionPrescription()
	 * @generated
	 */
	void setVisionPrescription(VisionPrescription value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference.
	 * @see #setParameters(Parameters)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Parameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Parameters' namespace='##targetNamespace'"
	 * @generated
	 */
	Parameters getParameters();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getParameters <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' containment reference.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(Parameters value);

} // ResourceContainer
