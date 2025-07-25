/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Packaged Package Item</b></em>'.
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
 *   <li>{@link org.hl7.fhir.MedicinalProductPackagedPackageItem#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductPackagedPackageItem#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductPackagedPackageItem#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductPackagedPackageItem#getMaterial <em>Material</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductPackagedPackageItem#getAlternateMaterial <em>Alternate Material</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductPackagedPackageItem#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductPackagedPackageItem#getManufacturedItem <em>Manufactured Item</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductPackagedPackageItem#getPackageItem <em>Package Item</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductPackagedPackageItem#getPhysicalCharacteristics <em>Physical Characteristics</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductPackagedPackageItem#getOtherCharacteristics <em>Other Characteristics</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductPackagedPackageItem#getShelfLifeStorage <em>Shelf Life Storage</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductPackagedPackageItem#getManufacturer <em>Manufacturer</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPackagedPackageItem()
 * @model extendedMetaData="name='MedicinalProductPackaged.PackageItem' kind='elementOnly'"
 * @generated
 */
public interface MedicinalProductPackagedPackageItem extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Including possibly Data Carrier Identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPackagedPackageItem_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The physical type of the container of the medicine.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPackagedPackageItem_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductPackagedPackageItem#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The quantity of this package in the medicinal product, at the current level of packaging. The outermost is always 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPackagedPackageItem_Quantity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductPackagedPackageItem#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Material</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Material type of the package item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Material</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPackagedPackageItem_Material()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='material' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getMaterial();

	/**
	 * Returns the value of the '<em><b>Alternate Material</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A possible alternate material for the packaging.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alternate Material</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPackagedPackageItem_AlternateMaterial()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='alternateMaterial' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getAlternateMaterial();

	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A device accompanying a medicinal product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPackagedPackageItem_Device()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='device' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getDevice();

	/**
	 * Returns the value of the '<em><b>Manufactured Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The manufactured item as contained in the packaged medicinal product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufactured Item</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPackagedPackageItem_ManufacturedItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='manufacturedItem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getManufacturedItem();

	/**
	 * Returns the value of the '<em><b>Package Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicinalProductPackagedPackageItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allows containers within containers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package Item</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPackagedPackageItem_PackageItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='packageItem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicinalProductPackagedPackageItem> getPackageItem();

	/**
	 * Returns the value of the '<em><b>Physical Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dimensions, color etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Characteristics</em>' containment reference.
	 * @see #setPhysicalCharacteristics(ProdCharacteristic)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPackagedPackageItem_PhysicalCharacteristics()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='physicalCharacteristics' namespace='##targetNamespace'"
	 * @generated
	 */
	ProdCharacteristic getPhysicalCharacteristics();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductPackagedPackageItem#getPhysicalCharacteristics <em>Physical Characteristics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Characteristics</em>' containment reference.
	 * @see #getPhysicalCharacteristics()
	 * @generated
	 */
	void setPhysicalCharacteristics(ProdCharacteristic value);

	/**
	 * Returns the value of the '<em><b>Other Characteristics</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Other codeable characteristics.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Characteristics</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPackagedPackageItem_OtherCharacteristics()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='otherCharacteristics' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getOtherCharacteristics();

	/**
	 * Returns the value of the '<em><b>Shelf Life Storage</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ProductShelfLife}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Shelf Life and storage information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shelf Life Storage</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPackagedPackageItem_ShelfLifeStorage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='shelfLifeStorage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProductShelfLife> getShelfLifeStorage();

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Manufacturer of this Package Item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPackagedPackageItem_Manufacturer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='manufacturer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getManufacturer();

} // MedicinalProductPackagedPackageItem
