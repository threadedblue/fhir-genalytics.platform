/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allergy Intolerance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Risk of harmful or undesirable, physiological response which is unique to an individual and associated with exposure to a substance.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getClinicalStatus <em>Clinical Status</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getVerificationStatus <em>Verification Status</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getCriticality <em>Criticality</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getOnsetDateTime <em>Onset Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getOnsetAge <em>Onset Age</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getOnsetPeriod <em>Onset Period</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getOnsetRange <em>Onset Range</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getOnsetString <em>Onset String</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getRecordedDate <em>Recorded Date</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getRecorder <em>Recorder</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getAsserter <em>Asserter</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getLastOccurrence <em>Last Occurrence</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntolerance#getReaction <em>Reaction</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance()
 * @model extendedMetaData="name='AllergyIntolerance' kind='elementOnly'"
 * @generated
 */
public interface AllergyIntolerance extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Business identifiers assigned to this AllergyIntolerance by the performer or other systems which remain constant as the resource is updated and propagates from server to server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Clinical Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The clinical status of the allergy or intolerance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clinical Status</em>' containment reference.
	 * @see #setClinicalStatus(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_ClinicalStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='clinicalStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getClinicalStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntolerance#getClinicalStatus <em>Clinical Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clinical Status</em>' containment reference.
	 * @see #getClinicalStatus()
	 * @generated
	 */
	void setClinicalStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Verification Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Assertion about certainty associated with the propensity, or potential risk, of a reaction to the identified substance (including pharmaceutical product).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verification Status</em>' containment reference.
	 * @see #setVerificationStatus(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_VerificationStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='verificationStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getVerificationStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntolerance#getVerificationStatus <em>Verification Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verification Status</em>' containment reference.
	 * @see #getVerificationStatus()
	 * @generated
	 */
	void setVerificationStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identification of the underlying physiological mechanism for the reaction risk.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(AllergyIntoleranceType)
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	AllergyIntoleranceType getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntolerance#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(AllergyIntoleranceType value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.AllergyIntoleranceCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Category of the identified substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AllergyIntoleranceCategory> getCategory();

	/**
	 * Returns the value of the '<em><b>Criticality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Estimate of the potential clinical harm, or seriousness, of the reaction to the identified substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Criticality</em>' containment reference.
	 * @see #setCriticality(AllergyIntoleranceCriticality)
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_Criticality()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='criticality' namespace='##targetNamespace'"
	 * @generated
	 */
	AllergyIntoleranceCriticality getCriticality();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntolerance#getCriticality <em>Criticality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criticality</em>' containment reference.
	 * @see #getCriticality()
	 * @generated
	 */
	void setCriticality(AllergyIntoleranceCriticality value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code for an allergy or intolerance statement (either a positive or a negated/excluded statement).  This may be a code for a substance or pharmaceutical product that is considered to be responsible for the adverse reaction risk (e.g., "Latex"), an allergy or intolerance condition (e.g., "Latex allergy"), or a negated/excluded code for a specific substance or class (e.g., "No latex allergy") or a general or categorical negated statement (e.g.,  "No known allergy", "No known drug allergies").  Note: the substance for a specific reaction may be different from the substance identified as the cause of the risk, but it must be consistent with it. For instance, it may be a more specific substance (e.g. a brand medication) or a composite product that includes the identified substance. It must be clinically safe to only process the 'code' and ignore the 'reaction.substance'.  If a receiving system is unable to confirm that AllergyIntolerance.reaction.substance falls within the semantic scope of AllergyIntolerance.code, then the receiving system should ignore AllergyIntolerance.reaction.substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntolerance#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The patient who has the allergy or intolerance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_Patient()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntolerance#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The encounter when the allergy or intolerance was asserted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntolerance#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Onset Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Estimated or actual date,  date-time, or age when allergy or intolerance was identified. (choose any one of onset*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Onset Date Time</em>' containment reference.
	 * @see #setOnsetDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_OnsetDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onsetDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getOnsetDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntolerance#getOnsetDateTime <em>Onset Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onset Date Time</em>' containment reference.
	 * @see #getOnsetDateTime()
	 * @generated
	 */
	void setOnsetDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Onset Age</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Estimated or actual date,  date-time, or age when allergy or intolerance was identified. (choose any one of onset*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Onset Age</em>' containment reference.
	 * @see #setOnsetAge(Age)
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_OnsetAge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onsetAge' namespace='##targetNamespace'"
	 * @generated
	 */
	Age getOnsetAge();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntolerance#getOnsetAge <em>Onset Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onset Age</em>' containment reference.
	 * @see #getOnsetAge()
	 * @generated
	 */
	void setOnsetAge(Age value);

	/**
	 * Returns the value of the '<em><b>Onset Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Estimated or actual date,  date-time, or age when allergy or intolerance was identified. (choose any one of onset*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Onset Period</em>' containment reference.
	 * @see #setOnsetPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_OnsetPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onsetPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getOnsetPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntolerance#getOnsetPeriod <em>Onset Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onset Period</em>' containment reference.
	 * @see #getOnsetPeriod()
	 * @generated
	 */
	void setOnsetPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Onset Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Estimated or actual date,  date-time, or age when allergy or intolerance was identified. (choose any one of onset*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Onset Range</em>' containment reference.
	 * @see #setOnsetRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_OnsetRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onsetRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getOnsetRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntolerance#getOnsetRange <em>Onset Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onset Range</em>' containment reference.
	 * @see #getOnsetRange()
	 * @generated
	 */
	void setOnsetRange(Range value);

	/**
	 * Returns the value of the '<em><b>Onset String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Estimated or actual date,  date-time, or age when allergy or intolerance was identified. (choose any one of onset*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Onset String</em>' containment reference.
	 * @see #setOnsetString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_OnsetString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onsetString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getOnsetString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntolerance#getOnsetString <em>Onset String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onset String</em>' containment reference.
	 * @see #getOnsetString()
	 * @generated
	 */
	void setOnsetString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Recorded Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The recordedDate represents when this particular AllergyIntolerance record was created in the system, which is often a system-generated date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recorded Date</em>' containment reference.
	 * @see #setRecordedDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_RecordedDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='recordedDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getRecordedDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntolerance#getRecordedDate <em>Recorded Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorded Date</em>' containment reference.
	 * @see #getRecordedDate()
	 * @generated
	 */
	void setRecordedDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Recorder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Individual who recorded the record and takes responsibility for its content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recorder</em>' containment reference.
	 * @see #setRecorder(Reference)
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_Recorder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='recorder' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRecorder();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntolerance#getRecorder <em>Recorder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorder</em>' containment reference.
	 * @see #getRecorder()
	 * @generated
	 */
	void setRecorder(Reference value);

	/**
	 * Returns the value of the '<em><b>Asserter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source of the information about the allergy that is recorded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Asserter</em>' containment reference.
	 * @see #setAsserter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_Asserter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='asserter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAsserter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntolerance#getAsserter <em>Asserter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asserter</em>' containment reference.
	 * @see #getAsserter()
	 * @generated
	 */
	void setAsserter(Reference value);

	/**
	 * Returns the value of the '<em><b>Last Occurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the date and/or time of the last known occurrence of a reaction event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Occurrence</em>' containment reference.
	 * @see #setLastOccurrence(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_LastOccurrence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lastOccurrence' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getLastOccurrence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntolerance#getLastOccurrence <em>Last Occurrence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Occurrence</em>' containment reference.
	 * @see #getLastOccurrence()
	 * @generated
	 */
	void setLastOccurrence(DateTime value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional narrative about the propensity for the Adverse Reaction, not captured in other fields.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

	/**
	 * Returns the value of the '<em><b>Reaction</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.AllergyIntoleranceReaction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Details about each adverse reaction event linked to exposure to the identified substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reaction</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAllergyIntolerance_Reaction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reaction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AllergyIntoleranceReaction> getReaction();

} // AllergyIntolerance
