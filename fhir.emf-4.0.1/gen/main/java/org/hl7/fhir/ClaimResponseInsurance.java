/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Response Insurance</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ClaimResponseInsurance#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseInsurance#getFocal <em>Focal</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseInsurance#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseInsurance#getBusinessArrangement <em>Business Arrangement</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseInsurance#getClaimResponse <em>Claim Response</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getClaimResponseInsurance()
 * @model extendedMetaData="name='ClaimResponse.Insurance' kind='elementOnly'"
 * @generated
 */
public interface ClaimResponseInsurance extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A number to uniquely identify insurance entries and provide a sequence of coverages to convey coordination of benefit order.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponseInsurance_Sequence()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getSequence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponseInsurance#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Focal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A flag to indicate that this Coverage is to be used for adjudication of this claim when set to true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Focal</em>' containment reference.
	 * @see #setFocal(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponseInsurance_Focal()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='focal' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getFocal();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponseInsurance#getFocal <em>Focal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Focal</em>' containment reference.
	 * @see #getFocal()
	 * @generated
	 */
	void setFocal(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the insurance card level information contained in the Coverage resource. The coverage issuing insurer will use these details to locate the patient's actual coverage within the insurer's information system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coverage</em>' containment reference.
	 * @see #setCoverage(Reference)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponseInsurance_Coverage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='coverage' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getCoverage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponseInsurance#getCoverage <em>Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage</em>' containment reference.
	 * @see #getCoverage()
	 * @generated
	 */
	void setCoverage(Reference value);

	/**
	 * Returns the value of the '<em><b>Business Arrangement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A business agreement number established between the provider and the insurer for special business processing purposes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Business Arrangement</em>' containment reference.
	 * @see #setBusinessArrangement(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponseInsurance_BusinessArrangement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='businessArrangement' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getBusinessArrangement();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponseInsurance#getBusinessArrangement <em>Business Arrangement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Arrangement</em>' containment reference.
	 * @see #getBusinessArrangement()
	 * @generated
	 */
	void setBusinessArrangement(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Claim Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The result of the adjudication of the line items for the Coverage specified in this insurance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Claim Response</em>' containment reference.
	 * @see #setClaimResponse(Reference)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponseInsurance_ClaimResponse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='claimResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getClaimResponse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponseInsurance#getClaimResponse <em>Claim Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim Response</em>' containment reference.
	 * @see #getClaimResponse()
	 * @generated
	 */
	void setClaimResponse(Reference value);

} // ClaimResponseInsurance
