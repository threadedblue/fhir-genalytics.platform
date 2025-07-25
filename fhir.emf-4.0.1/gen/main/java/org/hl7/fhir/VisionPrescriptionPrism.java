/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vision Prescription Prism</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An authorization for the provision of glasses and/or contact lenses to a patient.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.VisionPrescriptionPrism#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.hl7.fhir.VisionPrescriptionPrism#getBase <em>Base</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getVisionPrescriptionPrism()
 * @model extendedMetaData="name='VisionPrescription.Prism' kind='elementOnly'"
 * @generated
 */
public interface VisionPrescriptionPrism extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Amount of prism to compensate for eye alignment in fractional units.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount</em>' containment reference.
	 * @see #setAmount(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getVisionPrescriptionPrism_Amount()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='amount' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getAmount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VisionPrescriptionPrism#getAmount <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' containment reference.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(Decimal value);

	/**
	 * Returns the value of the '<em><b>Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relative base, or reference lens edge, for the prism.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base</em>' containment reference.
	 * @see #setBase(VisionBase)
	 * @see org.hl7.fhir.FhirPackage#getVisionPrescriptionPrism_Base()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='base' namespace='##targetNamespace'"
	 * @generated
	 */
	VisionBase getBase();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VisionPrescriptionPrism#getBase <em>Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' containment reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(VisionBase value);

} // VisionPrescriptionPrism
