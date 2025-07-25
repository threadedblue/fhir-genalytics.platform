/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Biologically Derived Product Processing</b></em>'.
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
 *   <li>{@link org.hl7.fhir.BiologicallyDerivedProductProcessing#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.BiologicallyDerivedProductProcessing#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.hl7.fhir.BiologicallyDerivedProductProcessing#getAdditive <em>Additive</em>}</li>
 *   <li>{@link org.hl7.fhir.BiologicallyDerivedProductProcessing#getTimeDateTime <em>Time Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.BiologicallyDerivedProductProcessing#getTimePeriod <em>Time Period</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProductProcessing()
 * @model extendedMetaData="name='BiologicallyDerivedProduct.Processing' kind='elementOnly'"
 * @generated
 */
public interface BiologicallyDerivedProductProcessing extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of of processing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProductProcessing_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BiologicallyDerivedProductProcessing#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Procedure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Procesing code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Procedure</em>' containment reference.
	 * @see #setProcedure(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProductProcessing_Procedure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='procedure' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getProcedure();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BiologicallyDerivedProductProcessing#getProcedure <em>Procedure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedure</em>' containment reference.
	 * @see #getProcedure()
	 * @generated
	 */
	void setProcedure(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Additive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Substance added during processing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additive</em>' containment reference.
	 * @see #setAdditive(Reference)
	 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProductProcessing_Additive()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='additive' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAdditive();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BiologicallyDerivedProductProcessing#getAdditive <em>Additive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additive</em>' containment reference.
	 * @see #getAdditive()
	 * @generated
	 */
	void setAdditive(Reference value);

	/**
	 * Returns the value of the '<em><b>Time Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time of processing. (choose any one of time*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Date Time</em>' containment reference.
	 * @see #setTimeDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProductProcessing_TimeDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timeDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getTimeDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BiologicallyDerivedProductProcessing#getTimeDateTime <em>Time Date Time</em>}' containment reference.
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
	 * Time of processing. (choose any one of time*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Period</em>' containment reference.
	 * @see #setTimePeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProductProcessing_TimePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getTimePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BiologicallyDerivedProductProcessing#getTimePeriod <em>Time Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Period</em>' containment reference.
	 * @see #getTimePeriod()
	 * @generated
	 */
	void setTimePeriod(Period value);

} // BiologicallyDerivedProductProcessing
