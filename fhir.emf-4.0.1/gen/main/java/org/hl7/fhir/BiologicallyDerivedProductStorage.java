/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Biologically Derived Product Storage</b></em>'.
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
 *   <li>{@link org.hl7.fhir.BiologicallyDerivedProductStorage#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.BiologicallyDerivedProductStorage#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link org.hl7.fhir.BiologicallyDerivedProductStorage#getScale <em>Scale</em>}</li>
 *   <li>{@link org.hl7.fhir.BiologicallyDerivedProductStorage#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProductStorage()
 * @model extendedMetaData="name='BiologicallyDerivedProduct.Storage' kind='elementOnly'"
 * @generated
 */
public interface BiologicallyDerivedProductStorage extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of storage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProductStorage_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BiologicallyDerivedProductStorage#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Temperature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Storage temperature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Temperature</em>' containment reference.
	 * @see #setTemperature(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProductStorage_Temperature()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='temperature' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getTemperature();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BiologicallyDerivedProductStorage#getTemperature <em>Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature</em>' containment reference.
	 * @see #getTemperature()
	 * @generated
	 */
	void setTemperature(Decimal value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Temperature scale used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scale</em>' containment reference.
	 * @see #setScale(BiologicallyDerivedProductStorageScale)
	 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProductStorage_Scale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='scale' namespace='##targetNamespace'"
	 * @generated
	 */
	BiologicallyDerivedProductStorageScale getScale();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BiologicallyDerivedProductStorage#getScale <em>Scale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' containment reference.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(BiologicallyDerivedProductStorageScale value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Storage timeperiod.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration</em>' containment reference.
	 * @see #setDuration(Period)
	 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProductStorage_Duration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='duration' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getDuration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BiologicallyDerivedProductStorage#getDuration <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' containment reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Period value);

} // BiologicallyDerivedProductStorage
