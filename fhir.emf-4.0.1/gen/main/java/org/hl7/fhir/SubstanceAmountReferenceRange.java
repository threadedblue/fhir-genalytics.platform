/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Amount Reference Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Chemical substances are a single substance type whose primary defining element is the molecular structure. Chemical substances shall be defined on the basis of their complete covalent molecular structure; the presence of a salt (counter-ion) and/or solvates (water, alcohols) is also captured. Purity, grade, physical form or particle size are not taken into account in the definition of a chemical substance or in the assignment of a Substance ID.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SubstanceAmountReferenceRange#getLowLimit <em>Low Limit</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceAmountReferenceRange#getHighLimit <em>High Limit</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubstanceAmountReferenceRange()
 * @model extendedMetaData="name='SubstanceAmount.ReferenceRange' kind='elementOnly'"
 * @generated
 */
public interface SubstanceAmountReferenceRange extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Low Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lower limit possible or expected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Low Limit</em>' containment reference.
	 * @see #setLowLimit(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceAmountReferenceRange_LowLimit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lowLimit' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getLowLimit();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceAmountReferenceRange#getLowLimit <em>Low Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low Limit</em>' containment reference.
	 * @see #getLowLimit()
	 * @generated
	 */
	void setLowLimit(Quantity value);

	/**
	 * Returns the value of the '<em><b>High Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Upper limit possible or expected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>High Limit</em>' containment reference.
	 * @see #setHighLimit(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceAmountReferenceRange_HighLimit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='highLimit' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getHighLimit();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceAmountReferenceRange#getHighLimit <em>High Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High Limit</em>' containment reference.
	 * @see #getHighLimit()
	 * @generated
	 */
	void setHighLimit(Quantity value);

} // SubstanceAmountReferenceRange
