/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoice Price Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Codes indicating the kind of the price component.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.InvoicePriceComponentType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getInvoicePriceComponentType()
 * @model extendedMetaData="name='InvoicePriceComponentType' kind='elementOnly'"
 * @generated
 */
public interface InvoicePriceComponentType extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.fhir.InvoicePriceComponentTypeList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.InvoicePriceComponentTypeList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(InvoicePriceComponentTypeList)
	 * @see org.hl7.fhir.FhirPackage#getInvoicePriceComponentType_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	InvoicePriceComponentTypeList getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InvoicePriceComponentType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.InvoicePriceComponentTypeList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(InvoicePriceComponentTypeList value);

	/**
	 * Unsets the value of the '{@link org.hl7.fhir.InvoicePriceComponentType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(InvoicePriceComponentTypeList)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.fhir.InvoicePriceComponentType#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(InvoicePriceComponentTypeList)
	 * @generated
	 */
	boolean isSetValue();

} // InvoicePriceComponentType
