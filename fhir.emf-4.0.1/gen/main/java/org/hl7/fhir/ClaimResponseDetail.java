/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Response Detail</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ClaimResponseDetail#getDetailSequence <em>Detail Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseDetail#getNoteNumber <em>Note Number</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseDetail#getAdjudication <em>Adjudication</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseDetail#getSubDetail <em>Sub Detail</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getClaimResponseDetail()
 * @model extendedMetaData="name='ClaimResponse.Detail' kind='elementOnly'"
 * @generated
 */
public interface ClaimResponseDetail extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Detail Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A number to uniquely reference the claim detail entry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detail Sequence</em>' containment reference.
	 * @see #setDetailSequence(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponseDetail_DetailSequence()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='detailSequence' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getDetailSequence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponseDetail#getDetailSequence <em>Detail Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail Sequence</em>' containment reference.
	 * @see #getDetailSequence()
	 * @generated
	 */
	void setDetailSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Note Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PositiveInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The numbers associated with notes below which apply to the adjudication of this item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note Number</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimResponseDetail_NoteNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='noteNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PositiveInt> getNoteNumber();

	/**
	 * Returns the value of the '<em><b>Adjudication</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ClaimResponseAdjudication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The adjudication results.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adjudication</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimResponseDetail_Adjudication()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='adjudication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClaimResponseAdjudication> getAdjudication();

	/**
	 * Returns the value of the '<em><b>Sub Detail</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ClaimResponseSubDetail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A sub-detail adjudication of a simple product or service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Detail</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimResponseDetail_SubDetail()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subDetail' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClaimResponseSubDetail> getSubDetail();

} // ClaimResponseDetail
