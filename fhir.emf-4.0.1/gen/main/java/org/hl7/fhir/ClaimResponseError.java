/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Response Error</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides the adjudication details from the processing of a Claim resource.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ClaimResponseError#getItemSequence <em>Item Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseError#getDetailSequence <em>Detail Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseError#getSubDetailSequence <em>Sub Detail Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseError#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getClaimResponseError()
 * @model extendedMetaData="name='ClaimResponse.Error' kind='elementOnly'"
 * @generated
 */
public interface ClaimResponseError extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Item Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sequence number of the line item submitted which contains the error. This value is omitted when the error occurs outside of the item structure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Sequence</em>' containment reference.
	 * @see #setItemSequence(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponseError_ItemSequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='itemSequence' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getItemSequence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponseError#getItemSequence <em>Item Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Sequence</em>' containment reference.
	 * @see #getItemSequence()
	 * @generated
	 */
	void setItemSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Detail Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sequence number of the detail within the line item submitted which contains the error. This value is omitted when the error occurs outside of the item structure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detail Sequence</em>' containment reference.
	 * @see #setDetailSequence(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponseError_DetailSequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='detailSequence' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getDetailSequence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponseError#getDetailSequence <em>Detail Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail Sequence</em>' containment reference.
	 * @see #getDetailSequence()
	 * @generated
	 */
	void setDetailSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Sub Detail Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sequence number of the sub-detail within the detail within the line item submitted which contains the error. This value is omitted when the error occurs outside of the item structure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Detail Sequence</em>' containment reference.
	 * @see #setSubDetailSequence(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponseError_SubDetailSequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subDetailSequence' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getSubDetailSequence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponseError#getSubDetailSequence <em>Sub Detail Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Detail Sequence</em>' containment reference.
	 * @see #getSubDetailSequence()
	 * @generated
	 */
	void setSubDetailSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An error code, from a specified code system, which details why the claim could not be adjudicated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponseError_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponseError#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

} // ClaimResponseError
