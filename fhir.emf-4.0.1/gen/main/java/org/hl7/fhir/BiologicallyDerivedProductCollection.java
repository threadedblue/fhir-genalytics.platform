/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Biologically Derived Product Collection</b></em>'.
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
 *   <li>{@link org.hl7.fhir.BiologicallyDerivedProductCollection#getCollector <em>Collector</em>}</li>
 *   <li>{@link org.hl7.fhir.BiologicallyDerivedProductCollection#getSource <em>Source</em>}</li>
 *   <li>{@link org.hl7.fhir.BiologicallyDerivedProductCollection#getCollectedDateTime <em>Collected Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.BiologicallyDerivedProductCollection#getCollectedPeriod <em>Collected Period</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProductCollection()
 * @model extendedMetaData="name='BiologicallyDerivedProduct.Collection' kind='elementOnly'"
 * @generated
 */
public interface BiologicallyDerivedProductCollection extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Collector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Healthcare professional who is performing the collection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collector</em>' containment reference.
	 * @see #setCollector(Reference)
	 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProductCollection_Collector()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='collector' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getCollector();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BiologicallyDerivedProductCollection#getCollector <em>Collector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collector</em>' containment reference.
	 * @see #getCollector()
	 * @generated
	 */
	void setCollector(Reference value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The patient or entity, such as a hospital or vendor in the case of a processed/manipulated/manufactured product, providing the product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Reference)
	 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProductCollection_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSource();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BiologicallyDerivedProductCollection#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Reference value);

	/**
	 * Returns the value of the '<em><b>Collected Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time of product collection. (choose any one of collected*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collected Date Time</em>' containment reference.
	 * @see #setCollectedDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProductCollection_CollectedDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='collectedDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getCollectedDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BiologicallyDerivedProductCollection#getCollectedDateTime <em>Collected Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collected Date Time</em>' containment reference.
	 * @see #getCollectedDateTime()
	 * @generated
	 */
	void setCollectedDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Collected Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time of product collection. (choose any one of collected*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collected Period</em>' containment reference.
	 * @see #setCollectedPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProductCollection_CollectedPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='collectedPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getCollectedPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BiologicallyDerivedProductCollection#getCollectedPeriod <em>Collected Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collected Period</em>' containment reference.
	 * @see #getCollectedPeriod()
	 * @generated
	 */
	void setCollectedPeriod(Period value);

} // BiologicallyDerivedProductCollection
