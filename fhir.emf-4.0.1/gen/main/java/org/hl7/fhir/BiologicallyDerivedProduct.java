/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Biologically Derived Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A material substance originating from a biological entity intended to be transplanted or infused
 * into another (possibly the same) biological entity.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.BiologicallyDerivedProduct#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.BiologicallyDerivedProduct#getProductCategory <em>Product Category</em>}</li>
 *   <li>{@link org.hl7.fhir.BiologicallyDerivedProduct#getProductCode <em>Product Code</em>}</li>
 *   <li>{@link org.hl7.fhir.BiologicallyDerivedProduct#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.BiologicallyDerivedProduct#getRequest <em>Request</em>}</li>
 *   <li>{@link org.hl7.fhir.BiologicallyDerivedProduct#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.BiologicallyDerivedProduct#getParent <em>Parent</em>}</li>
 *   <li>{@link org.hl7.fhir.BiologicallyDerivedProduct#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.hl7.fhir.BiologicallyDerivedProduct#getProcessing <em>Processing</em>}</li>
 *   <li>{@link org.hl7.fhir.BiologicallyDerivedProduct#getManipulation <em>Manipulation</em>}</li>
 *   <li>{@link org.hl7.fhir.BiologicallyDerivedProduct#getStorage <em>Storage</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProduct()
 * @model extendedMetaData="name='BiologicallyDerivedProduct' kind='elementOnly'"
 * @generated
 */
public interface BiologicallyDerivedProduct extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This records identifiers associated with this biologically derived product instance that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProduct_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Product Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Broad category of this product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product Category</em>' containment reference.
	 * @see #setProductCategory(BiologicallyDerivedProductCategory)
	 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProduct_ProductCategory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='productCategory' namespace='##targetNamespace'"
	 * @generated
	 */
	BiologicallyDerivedProductCategory getProductCategory();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BiologicallyDerivedProduct#getProductCategory <em>Product Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Category</em>' containment reference.
	 * @see #getProductCategory()
	 * @generated
	 */
	void setProductCategory(BiologicallyDerivedProductCategory value);

	/**
	 * Returns the value of the '<em><b>Product Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code that identifies the kind of this biologically derived product (SNOMED Ctcode).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product Code</em>' containment reference.
	 * @see #setProductCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProduct_ProductCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='productCode' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getProductCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BiologicallyDerivedProduct#getProductCode <em>Product Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Code</em>' containment reference.
	 * @see #getProductCode()
	 * @generated
	 */
	void setProductCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the product is currently available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(BiologicallyDerivedProductStatus)
	 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProduct_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	BiologicallyDerivedProductStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BiologicallyDerivedProduct#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(BiologicallyDerivedProductStatus value);

	/**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Procedure request to obtain this biologically derived product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProduct_Request()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='request' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getRequest();

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of discrete units within this product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProduct_Quantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BiologicallyDerivedProduct#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parent product (if any).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProduct_Parent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getParent();

	/**
	 * Returns the value of the '<em><b>Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How this product was collected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collection</em>' containment reference.
	 * @see #setCollection(BiologicallyDerivedProductCollection)
	 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProduct_Collection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='collection' namespace='##targetNamespace'"
	 * @generated
	 */
	BiologicallyDerivedProductCollection getCollection();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BiologicallyDerivedProduct#getCollection <em>Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' containment reference.
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(BiologicallyDerivedProductCollection value);

	/**
	 * Returns the value of the '<em><b>Processing</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.BiologicallyDerivedProductProcessing}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any processing of the product during collection that does not change the fundamental nature of the product. For example adding anti-coagulants during the collection of Peripheral Blood Stem Cells.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Processing</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProduct_Processing()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='processing' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BiologicallyDerivedProductProcessing> getProcessing();

	/**
	 * Returns the value of the '<em><b>Manipulation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any manipulation of product post-collection that is intended to alter the product.  For example a buffy-coat enrichment or CD8 reduction of Peripheral Blood Stem Cells to make it more suitable for infusion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manipulation</em>' containment reference.
	 * @see #setManipulation(BiologicallyDerivedProductManipulation)
	 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProduct_Manipulation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='manipulation' namespace='##targetNamespace'"
	 * @generated
	 */
	BiologicallyDerivedProductManipulation getManipulation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BiologicallyDerivedProduct#getManipulation <em>Manipulation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manipulation</em>' containment reference.
	 * @see #getManipulation()
	 * @generated
	 */
	void setManipulation(BiologicallyDerivedProductManipulation value);

	/**
	 * Returns the value of the '<em><b>Storage</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.BiologicallyDerivedProductStorage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Product storage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Storage</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProduct_Storage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='storage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BiologicallyDerivedProductStorage> getStorage();

} // BiologicallyDerivedProduct
