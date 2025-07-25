/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Search Support</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The degree to which the server supports the code search parameter on ValueSet, if it is supported.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.CodeSearchSupport#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCodeSearchSupport()
 * @model extendedMetaData="name='CodeSearchSupport' kind='elementOnly'"
 * @generated
 */
public interface CodeSearchSupport extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.fhir.CodeSearchSupportList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.CodeSearchSupportList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(CodeSearchSupportList)
	 * @see org.hl7.fhir.FhirPackage#getCodeSearchSupport_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	CodeSearchSupportList getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CodeSearchSupport#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.CodeSearchSupportList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(CodeSearchSupportList value);

	/**
	 * Unsets the value of the '{@link org.hl7.fhir.CodeSearchSupport#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(CodeSearchSupportList)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.fhir.CodeSearchSupport#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(CodeSearchSupportList)
	 * @generated
	 */
	boolean isSetValue();

} // CodeSearchSupport
