/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Packaged Batch Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A medicinal product in a container or package.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicinalProductPackagedBatchIdentifier#getOuterPackaging <em>Outer Packaging</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductPackagedBatchIdentifier#getImmediatePackaging <em>Immediate Packaging</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPackagedBatchIdentifier()
 * @model extendedMetaData="name='MedicinalProductPackaged.BatchIdentifier' kind='elementOnly'"
 * @generated
 */
public interface MedicinalProductPackagedBatchIdentifier extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Outer Packaging</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A number appearing on the outer packaging of a specific batch.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outer Packaging</em>' containment reference.
	 * @see #setOuterPackaging(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPackagedBatchIdentifier_OuterPackaging()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='outerPackaging' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getOuterPackaging();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductPackagedBatchIdentifier#getOuterPackaging <em>Outer Packaging</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Packaging</em>' containment reference.
	 * @see #getOuterPackaging()
	 * @generated
	 */
	void setOuterPackaging(Identifier value);

	/**
	 * Returns the value of the '<em><b>Immediate Packaging</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A number appearing on the immediate packaging (and not the outer packaging).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Immediate Packaging</em>' containment reference.
	 * @see #setImmediatePackaging(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPackagedBatchIdentifier_ImmediatePackaging()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='immediatePackaging' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getImmediatePackaging();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductPackagedBatchIdentifier#getImmediatePackaging <em>Immediate Packaging</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Immediate Packaging</em>' containment reference.
	 * @see #getImmediatePackaging()
	 * @generated
	 */
	void setImmediatePackaging(Identifier value);

} // MedicinalProductPackagedBatchIdentifier
