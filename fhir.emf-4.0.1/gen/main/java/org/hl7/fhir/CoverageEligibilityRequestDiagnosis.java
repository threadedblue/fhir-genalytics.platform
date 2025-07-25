/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coverage Eligibility Request Diagnosis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CoverageEligibilityRequest provides patient and insurance coverage information to an insurer for them to respond, in the form of an CoverageEligibilityResponse, with information regarding whether the stated coverage is valid and in-force and optionally to provide the insurance details of the policy.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.CoverageEligibilityRequestDiagnosis#getDiagnosisCodeableConcept <em>Diagnosis Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.CoverageEligibilityRequestDiagnosis#getDiagnosisReference <em>Diagnosis Reference</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCoverageEligibilityRequestDiagnosis()
 * @model extendedMetaData="name='CoverageEligibilityRequest.Diagnosis' kind='elementOnly'"
 * @generated
 */
public interface CoverageEligibilityRequestDiagnosis extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Diagnosis Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The nature of illness or problem in a coded form or as a reference to an external defined Condition. (choose any one of diagnosis*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diagnosis Codeable Concept</em>' containment reference.
	 * @see #setDiagnosisCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getCoverageEligibilityRequestDiagnosis_DiagnosisCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='diagnosisCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDiagnosisCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CoverageEligibilityRequestDiagnosis#getDiagnosisCodeableConcept <em>Diagnosis Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagnosis Codeable Concept</em>' containment reference.
	 * @see #getDiagnosisCodeableConcept()
	 * @generated
	 */
	void setDiagnosisCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Diagnosis Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The nature of illness or problem in a coded form or as a reference to an external defined Condition. (choose any one of diagnosis*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diagnosis Reference</em>' containment reference.
	 * @see #setDiagnosisReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCoverageEligibilityRequestDiagnosis_DiagnosisReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='diagnosisReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getDiagnosisReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CoverageEligibilityRequestDiagnosis#getDiagnosisReference <em>Diagnosis Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagnosis Reference</em>' containment reference.
	 * @see #getDiagnosisReference()
	 * @generated
	 */
	void setDiagnosisReference(Reference value);

} // CoverageEligibilityRequestDiagnosis
