/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Amount</b></em>'.
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
 *   <li>{@link org.hl7.fhir.SubstanceAmount#getAmountQuantity <em>Amount Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceAmount#getAmountRange <em>Amount Range</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceAmount#getAmountString <em>Amount String</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceAmount#getAmountType <em>Amount Type</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceAmount#getAmountText <em>Amount Text</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceAmount#getReferenceRange <em>Reference Range</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubstanceAmount()
 * @model extendedMetaData="name='SubstanceAmount' kind='elementOnly'"
 * @generated
 */
public interface SubstanceAmount extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Amount Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to capture quantitative values for a variety of elements. If only limits are given, the arithmetic mean would be the average. If only a single definite value for a given element is given, it would be captured in this field. (choose any one of amount*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount Quantity</em>' containment reference.
	 * @see #setAmountQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceAmount_AmountQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amountQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getAmountQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceAmount#getAmountQuantity <em>Amount Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Quantity</em>' containment reference.
	 * @see #getAmountQuantity()
	 * @generated
	 */
	void setAmountQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Amount Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to capture quantitative values for a variety of elements. If only limits are given, the arithmetic mean would be the average. If only a single definite value for a given element is given, it would be captured in this field. (choose any one of amount*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount Range</em>' containment reference.
	 * @see #setAmountRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceAmount_AmountRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amountRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getAmountRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceAmount#getAmountRange <em>Amount Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Range</em>' containment reference.
	 * @see #getAmountRange()
	 * @generated
	 */
	void setAmountRange(Range value);

	/**
	 * Returns the value of the '<em><b>Amount String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to capture quantitative values for a variety of elements. If only limits are given, the arithmetic mean would be the average. If only a single definite value for a given element is given, it would be captured in this field. (choose any one of amount*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount String</em>' containment reference.
	 * @see #setAmountString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceAmount_AmountString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amountString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getAmountString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceAmount#getAmountString <em>Amount String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount String</em>' containment reference.
	 * @see #getAmountString()
	 * @generated
	 */
	void setAmountString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Amount Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Most elements that require a quantitative value will also have a field called amount type. Amount type should always be specified because the actual value of the amount is often dependent on it. EXAMPLE: In capturing the actual relative amounts of substances or molecular fragments it is essential to indicate whether the amount refers to a mole ratio or weight ratio. For any given element an effort should be made to use same the amount type for all related definitional elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount Type</em>' containment reference.
	 * @see #setAmountType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceAmount_AmountType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amountType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getAmountType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceAmount#getAmountType <em>Amount Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Type</em>' containment reference.
	 * @see #getAmountType()
	 * @generated
	 */
	void setAmountType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Amount Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A textual comment on a numeric value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount Text</em>' containment reference.
	 * @see #setAmountText(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceAmount_AmountText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amountText' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getAmountText();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceAmount#getAmountText <em>Amount Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Text</em>' containment reference.
	 * @see #getAmountText()
	 * @generated
	 */
	void setAmountText(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Reference Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference range of possible or expected values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Range</em>' containment reference.
	 * @see #setReferenceRange(SubstanceAmountReferenceRange)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceAmount_ReferenceRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referenceRange' namespace='##targetNamespace'"
	 * @generated
	 */
	SubstanceAmountReferenceRange getReferenceRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceAmount#getReferenceRange <em>Reference Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Range</em>' containment reference.
	 * @see #getReferenceRange()
	 * @generated
	 */
	void setReferenceRange(SubstanceAmountReferenceRange value);

} // SubstanceAmount
