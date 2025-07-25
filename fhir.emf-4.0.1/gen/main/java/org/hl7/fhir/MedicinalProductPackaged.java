/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Packaged</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A medicinal product in a container or package.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicinalProductPackaged#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductPackaged#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductPackaged#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductPackaged#getLegalStatusOfSupply <em>Legal Status Of Supply</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductPackaged#getMarketingStatus <em>Marketing Status</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductPackaged#getMarketingAuthorization <em>Marketing Authorization</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductPackaged#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductPackaged#getBatchIdentifier <em>Batch Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductPackaged#getPackageItem <em>Package Item</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPackaged()
 * @model extendedMetaData="name='MedicinalProductPackaged' kind='elementOnly'"
 * @generated
 */
public interface MedicinalProductPackaged extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPackaged_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The product with this is a pack for.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPackaged_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSubject();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Textual description.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPackaged_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductPackaged#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Legal Status Of Supply</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The legal status of supply of the medicinal product as classified by the regulator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Legal Status Of Supply</em>' containment reference.
	 * @see #setLegalStatusOfSupply(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPackaged_LegalStatusOfSupply()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='legalStatusOfSupply' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getLegalStatusOfSupply();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductPackaged#getLegalStatusOfSupply <em>Legal Status Of Supply</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legal Status Of Supply</em>' containment reference.
	 * @see #getLegalStatusOfSupply()
	 * @generated
	 */
	void setLegalStatusOfSupply(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Marketing Status</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MarketingStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Marketing information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Marketing Status</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPackaged_MarketingStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='marketingStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MarketingStatus> getMarketingStatus();

	/**
	 * Returns the value of the '<em><b>Marketing Authorization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Manufacturer of this Package Item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Marketing Authorization</em>' containment reference.
	 * @see #setMarketingAuthorization(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPackaged_MarketingAuthorization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='marketingAuthorization' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getMarketingAuthorization();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductPackaged#getMarketingAuthorization <em>Marketing Authorization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marketing Authorization</em>' containment reference.
	 * @see #getMarketingAuthorization()
	 * @generated
	 */
	void setMarketingAuthorization(Reference value);

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Manufacturer of this Package Item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPackaged_Manufacturer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='manufacturer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getManufacturer();

	/**
	 * Returns the value of the '<em><b>Batch Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicinalProductPackagedBatchIdentifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Batch numbering.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Batch Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPackaged_BatchIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='batchIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicinalProductPackagedBatchIdentifier> getBatchIdentifier();

	/**
	 * Returns the value of the '<em><b>Package Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicinalProductPackagedPackageItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A packaging item, as a contained for medicine, possibly with other packaging items within.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package Item</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPackaged_PackageItem()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='packageItem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicinalProductPackagedPackageItem> getPackageItem();

} // MedicinalProductPackaged
