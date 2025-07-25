/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ClaimProcedure#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimProcedure#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimProcedure#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimProcedure#getProcedureCodeableConcept <em>Procedure Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimProcedure#getProcedureReference <em>Procedure Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimProcedure#getUdi <em>Udi</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getClaimProcedure()
 * @model extendedMetaData="name='Claim.Procedure' kind='elementOnly'"
 * @generated
 */
public interface ClaimProcedure extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A number to uniquely identify procedure entries.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getClaimProcedure_Sequence()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getSequence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimProcedure#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the condition was observed or the relative ranking.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimProcedure_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getType();

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date and optionally time the procedure was performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getClaimProcedure_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimProcedure#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Procedure Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The code or reference to a Procedure resource which identifies the clinical intervention performed. (choose any one of procedure*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Procedure Codeable Concept</em>' containment reference.
	 * @see #setProcedureCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getClaimProcedure_ProcedureCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='procedureCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getProcedureCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimProcedure#getProcedureCodeableConcept <em>Procedure Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedure Codeable Concept</em>' containment reference.
	 * @see #getProcedureCodeableConcept()
	 * @generated
	 */
	void setProcedureCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Procedure Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The code or reference to a Procedure resource which identifies the clinical intervention performed. (choose any one of procedure*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Procedure Reference</em>' containment reference.
	 * @see #setProcedureReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getClaimProcedure_ProcedureReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='procedureReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getProcedureReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimProcedure#getProcedureReference <em>Procedure Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedure Reference</em>' containment reference.
	 * @see #getProcedureReference()
	 * @generated
	 */
	void setProcedureReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Udi</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique Device Identifiers associated with this line item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Udi</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimProcedure_Udi()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='udi' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getUdi();

} // ClaimProcedure
