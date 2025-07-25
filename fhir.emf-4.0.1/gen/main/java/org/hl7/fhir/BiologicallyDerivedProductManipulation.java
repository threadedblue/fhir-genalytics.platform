/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Biologically Derived Product Manipulation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A material substance originating from a biological entity intended to be transplanted or infused
 * into another (possibly the same) biological entity.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.BiologicallyDerivedProductManipulation#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.BiologicallyDerivedProductManipulation#getTimeDateTime <em>Time Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.BiologicallyDerivedProductManipulation#getTimePeriod <em>Time Period</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProductManipulation()
 * @model extendedMetaData="name='BiologicallyDerivedProduct.Manipulation' kind='elementOnly'"
 * @generated
 */
public interface BiologicallyDerivedProductManipulation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of manipulation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProductManipulation_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BiologicallyDerivedProductManipulation#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Time Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time of manipulation. (choose any one of time*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Date Time</em>' containment reference.
	 * @see #setTimeDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProductManipulation_TimeDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timeDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getTimeDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BiologicallyDerivedProductManipulation#getTimeDateTime <em>Time Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Date Time</em>' containment reference.
	 * @see #getTimeDateTime()
	 * @generated
	 */
	void setTimeDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Time Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time of manipulation. (choose any one of time*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Period</em>' containment reference.
	 * @see #setTimePeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProductManipulation_TimePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getTimePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BiologicallyDerivedProductManipulation#getTimePeriod <em>Time Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Period</em>' containment reference.
	 * @see #getTimePeriod()
	 * @generated
	 */
	void setTimePeriod(Period value);

} // BiologicallyDerivedProductManipulation
