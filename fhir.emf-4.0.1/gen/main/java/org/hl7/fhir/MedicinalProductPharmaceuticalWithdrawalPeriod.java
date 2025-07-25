/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Pharmaceutical Withdrawal Period</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A pharmaceutical product described in terms of its composition and dose form.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicinalProductPharmaceuticalWithdrawalPeriod#getTissue <em>Tissue</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductPharmaceuticalWithdrawalPeriod#getValue <em>Value</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductPharmaceuticalWithdrawalPeriod#getSupportingInformation <em>Supporting Information</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPharmaceuticalWithdrawalPeriod()
 * @model extendedMetaData="name='MedicinalProductPharmaceutical.WithdrawalPeriod' kind='elementOnly'"
 * @generated
 */
public interface MedicinalProductPharmaceuticalWithdrawalPeriod extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Tissue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coded expression for the type of tissue for which the withdrawal period applues, e.g. meat, milk.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tissue</em>' containment reference.
	 * @see #setTissue(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPharmaceuticalWithdrawalPeriod_Tissue()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='tissue' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getTissue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductPharmaceuticalWithdrawalPeriod#getTissue <em>Tissue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tissue</em>' containment reference.
	 * @see #getTissue()
	 * @generated
	 */
	void setTissue(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value for the time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPharmaceuticalWithdrawalPeriod_Value()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductPharmaceuticalWithdrawalPeriod#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Quantity value);

	/**
	 * Returns the value of the '<em><b>Supporting Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Extra information about the withdrawal period.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supporting Information</em>' containment reference.
	 * @see #setSupportingInformation(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPharmaceuticalWithdrawalPeriod_SupportingInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supportingInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSupportingInformation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductPharmaceuticalWithdrawalPeriod#getSupportingInformation <em>Supporting Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supporting Information</em>' containment reference.
	 * @see #getSupportingInformation()
	 * @generated
	 */
	void setSupportingInformation(org.hl7.fhir.String value);

} // MedicinalProductPharmaceuticalWithdrawalPeriod
