/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dosage Dose And Rate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Indicates how the medication is/was taken or should be taken by the patient.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.DosageDoseAndRate#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.DosageDoseAndRate#getDoseRange <em>Dose Range</em>}</li>
 *   <li>{@link org.hl7.fhir.DosageDoseAndRate#getDoseQuantity <em>Dose Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.DosageDoseAndRate#getRateRatio <em>Rate Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.DosageDoseAndRate#getRateRange <em>Rate Range</em>}</li>
 *   <li>{@link org.hl7.fhir.DosageDoseAndRate#getRateQuantity <em>Rate Quantity</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDosageDoseAndRate()
 * @model extendedMetaData="name='Dosage.DoseAndRate' kind='elementOnly'"
 * @generated
 */
public interface DosageDoseAndRate extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The kind of dose or rate specified, for example, ordered or calculated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getDosageDoseAndRate_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DosageDoseAndRate#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Dose Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Amount of medication per dose. (choose any one of dose*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dose Range</em>' containment reference.
	 * @see #setDoseRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getDosageDoseAndRate_DoseRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='doseRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getDoseRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DosageDoseAndRate#getDoseRange <em>Dose Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dose Range</em>' containment reference.
	 * @see #getDoseRange()
	 * @generated
	 */
	void setDoseRange(Range value);

	/**
	 * Returns the value of the '<em><b>Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Amount of medication per dose. (choose any one of dose*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dose Quantity</em>' containment reference.
	 * @see #setDoseQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getDosageDoseAndRate_DoseQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='doseQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getDoseQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DosageDoseAndRate#getDoseQuantity <em>Dose Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dose Quantity</em>' containment reference.
	 * @see #getDoseQuantity()
	 * @generated
	 */
	void setDoseQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Rate Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Amount of medication per unit of time. (choose any one of rate*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rate Ratio</em>' containment reference.
	 * @see #setRateRatio(Ratio)
	 * @see org.hl7.fhir.FhirPackage#getDosageDoseAndRate_RateRatio()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rateRatio' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getRateRatio();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DosageDoseAndRate#getRateRatio <em>Rate Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Ratio</em>' containment reference.
	 * @see #getRateRatio()
	 * @generated
	 */
	void setRateRatio(Ratio value);

	/**
	 * Returns the value of the '<em><b>Rate Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Amount of medication per unit of time. (choose any one of rate*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rate Range</em>' containment reference.
	 * @see #setRateRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getDosageDoseAndRate_RateRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rateRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getRateRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DosageDoseAndRate#getRateRange <em>Rate Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Range</em>' containment reference.
	 * @see #getRateRange()
	 * @generated
	 */
	void setRateRange(Range value);

	/**
	 * Returns the value of the '<em><b>Rate Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Amount of medication per unit of time. (choose any one of rate*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rate Quantity</em>' containment reference.
	 * @see #setRateQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getDosageDoseAndRate_RateQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rateQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getRateQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DosageDoseAndRate#getRateQuantity <em>Rate Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Quantity</em>' containment reference.
	 * @see #getRateQuantity()
	 * @generated
	 */
	void setRateQuantity(Quantity value);

} // DosageDoseAndRate
