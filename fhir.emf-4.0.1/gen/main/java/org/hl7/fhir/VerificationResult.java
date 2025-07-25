/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verification Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes validation requirements, source(s), status and dates for one or more elements.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.VerificationResult#getTarget <em>Target</em>}</li>
 *   <li>{@link org.hl7.fhir.VerificationResult#getTargetLocation <em>Target Location</em>}</li>
 *   <li>{@link org.hl7.fhir.VerificationResult#getNeed <em>Need</em>}</li>
 *   <li>{@link org.hl7.fhir.VerificationResult#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.VerificationResult#getStatusDate <em>Status Date</em>}</li>
 *   <li>{@link org.hl7.fhir.VerificationResult#getValidationType <em>Validation Type</em>}</li>
 *   <li>{@link org.hl7.fhir.VerificationResult#getValidationProcess <em>Validation Process</em>}</li>
 *   <li>{@link org.hl7.fhir.VerificationResult#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link org.hl7.fhir.VerificationResult#getLastPerformed <em>Last Performed</em>}</li>
 *   <li>{@link org.hl7.fhir.VerificationResult#getNextScheduled <em>Next Scheduled</em>}</li>
 *   <li>{@link org.hl7.fhir.VerificationResult#getFailureAction <em>Failure Action</em>}</li>
 *   <li>{@link org.hl7.fhir.VerificationResult#getPrimarySource <em>Primary Source</em>}</li>
 *   <li>{@link org.hl7.fhir.VerificationResult#getAttestation <em>Attestation</em>}</li>
 *   <li>{@link org.hl7.fhir.VerificationResult#getValidator <em>Validator</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getVerificationResult()
 * @model extendedMetaData="name='VerificationResult' kind='elementOnly'"
 * @generated
 */
public interface VerificationResult extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A resource that was validated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getVerificationResult_Target()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='target' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getTarget();

	/**
	 * Returns the value of the '<em><b>Target Location</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The fhirpath location(s) within the resource that was validated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Location</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getVerificationResult_TargetLocation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='targetLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getTargetLocation();

	/**
	 * Returns the value of the '<em><b>Need</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The frequency with which the target must be validated (none; initial; periodic).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Need</em>' containment reference.
	 * @see #setNeed(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getVerificationResult_Need()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='need' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getNeed();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VerificationResult#getNeed <em>Need</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Need</em>' containment reference.
	 * @see #getNeed()
	 * @generated
	 */
	void setNeed(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The validation status of the target (attested; validated; in process; requires revalidation; validation failed; revalidation failed).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(Status)
	 * @see org.hl7.fhir.FhirPackage#getVerificationResult_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VerificationResult#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Status Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the validation status was updated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Date</em>' containment reference.
	 * @see #setStatusDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getVerificationResult_StatusDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='statusDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getStatusDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VerificationResult#getStatusDate <em>Status Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Date</em>' containment reference.
	 * @see #getStatusDate()
	 * @generated
	 */
	void setStatusDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Validation Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * What the target is validated against (nothing; primary source; multiple sources).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validation Type</em>' containment reference.
	 * @see #setValidationType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getVerificationResult_ValidationType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='validationType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getValidationType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VerificationResult#getValidationType <em>Validation Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Type</em>' containment reference.
	 * @see #getValidationType()
	 * @generated
	 */
	void setValidationType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Validation Process</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The primary process by which the target is validated (edit check; value set; primary source; multiple sources; standalone; in context).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validation Process</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getVerificationResult_ValidationProcess()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='validationProcess' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getValidationProcess();

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Frequency of revalidation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frequency</em>' containment reference.
	 * @see #setFrequency(Timing)
	 * @see org.hl7.fhir.FhirPackage#getVerificationResult_Frequency()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='frequency' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getFrequency();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VerificationResult#getFrequency <em>Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' containment reference.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(Timing value);

	/**
	 * Returns the value of the '<em><b>Last Performed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date/time validation was last completed (including failed validations).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Performed</em>' containment reference.
	 * @see #setLastPerformed(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getVerificationResult_LastPerformed()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lastPerformed' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getLastPerformed();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VerificationResult#getLastPerformed <em>Last Performed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Performed</em>' containment reference.
	 * @see #getLastPerformed()
	 * @generated
	 */
	void setLastPerformed(DateTime value);

	/**
	 * Returns the value of the '<em><b>Next Scheduled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date when target is next validated, if appropriate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Next Scheduled</em>' containment reference.
	 * @see #setNextScheduled(Date)
	 * @see org.hl7.fhir.FhirPackage#getVerificationResult_NextScheduled()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nextScheduled' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getNextScheduled();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VerificationResult#getNextScheduled <em>Next Scheduled</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Scheduled</em>' containment reference.
	 * @see #getNextScheduled()
	 * @generated
	 */
	void setNextScheduled(Date value);

	/**
	 * Returns the value of the '<em><b>Failure Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The result if validation fails (fatal; warning; record only; none).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Failure Action</em>' containment reference.
	 * @see #setFailureAction(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getVerificationResult_FailureAction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='failureAction' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getFailureAction();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VerificationResult#getFailureAction <em>Failure Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Action</em>' containment reference.
	 * @see #getFailureAction()
	 * @generated
	 */
	void setFailureAction(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Primary Source</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.VerificationResultPrimarySource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about the primary source(s) involved in validation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Primary Source</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getVerificationResult_PrimarySource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='primarySource' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VerificationResultPrimarySource> getPrimarySource();

	/**
	 * Returns the value of the '<em><b>Attestation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about the entity attesting to information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attestation</em>' containment reference.
	 * @see #setAttestation(VerificationResultAttestation)
	 * @see org.hl7.fhir.FhirPackage#getVerificationResult_Attestation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='attestation' namespace='##targetNamespace'"
	 * @generated
	 */
	VerificationResultAttestation getAttestation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VerificationResult#getAttestation <em>Attestation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attestation</em>' containment reference.
	 * @see #getAttestation()
	 * @generated
	 */
	void setAttestation(VerificationResultAttestation value);

	/**
	 * Returns the value of the '<em><b>Validator</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.VerificationResultValidator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about the entity validating information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validator</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getVerificationResult_Validator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='validator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VerificationResultValidator> getValidator();

} // VerificationResult
