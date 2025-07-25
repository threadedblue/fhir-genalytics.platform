/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Biologically Derived Product Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Biologically Derived Product Category.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.BiologicallyDerivedProductCategory#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProductCategory()
 * @model extendedMetaData="name='BiologicallyDerivedProductCategory' kind='elementOnly'"
 * @generated
 */
public interface BiologicallyDerivedProductCategory extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.fhir.BiologicallyDerivedProductCategoryList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.BiologicallyDerivedProductCategoryList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(BiologicallyDerivedProductCategoryList)
	 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProductCategory_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	BiologicallyDerivedProductCategoryList getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BiologicallyDerivedProductCategory#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.BiologicallyDerivedProductCategoryList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BiologicallyDerivedProductCategoryList value);

	/**
	 * Unsets the value of the '{@link org.hl7.fhir.BiologicallyDerivedProductCategory#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(BiologicallyDerivedProductCategoryList)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.fhir.BiologicallyDerivedProductCategory#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(BiologicallyDerivedProductCategoryList)
	 * @generated
	 */
	boolean isSetValue();

} // BiologicallyDerivedProductCategory
