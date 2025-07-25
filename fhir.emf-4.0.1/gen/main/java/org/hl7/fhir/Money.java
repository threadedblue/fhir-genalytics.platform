/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Money</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An amount of economic utility in some recognized currency.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Money#getValue <em>Value</em>}</li>
 *   <li>{@link org.hl7.fhir.Money#getCurrency <em>Currency</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMoney()
 * @model extendedMetaData="name='Money' kind='elementOnly'"
 * @generated
 */
public interface Money extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Numerical value (with implicit precision).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getMoney_Value()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Money#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Decimal value);

	/**
	 * Returns the value of the '<em><b>Currency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ISO 4217 Currency Code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Currency</em>' containment reference.
	 * @see #setCurrency(Code)
	 * @see org.hl7.fhir.FhirPackage#getMoney_Currency()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='currency' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getCurrency();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Money#getCurrency <em>Currency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' containment reference.
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(Code value);

} // Money
