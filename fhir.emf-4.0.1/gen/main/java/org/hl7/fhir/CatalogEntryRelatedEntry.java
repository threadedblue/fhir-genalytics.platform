/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog Entry Related Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Catalog entries are wrappers that contextualize items included in a catalog.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.CatalogEntryRelatedEntry#getRelationtype <em>Relationtype</em>}</li>
 *   <li>{@link org.hl7.fhir.CatalogEntryRelatedEntry#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCatalogEntryRelatedEntry()
 * @model extendedMetaData="name='CatalogEntry.RelatedEntry' kind='elementOnly'"
 * @generated
 */
public interface CatalogEntryRelatedEntry extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Relationtype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of relation to the related item: child, parent, packageContent, containerPackage, usedIn, uses, requires, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationtype</em>' containment reference.
	 * @see #setRelationtype(CatalogEntryRelationType)
	 * @see org.hl7.fhir.FhirPackage#getCatalogEntryRelatedEntry_Relationtype()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='relationtype' namespace='##targetNamespace'"
	 * @generated
	 */
	CatalogEntryRelationType getRelationtype();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CatalogEntryRelatedEntry#getRelationtype <em>Relationtype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationtype</em>' containment reference.
	 * @see #getRelationtype()
	 * @generated
	 */
	void setRelationtype(CatalogEntryRelationType value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reference to the related item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item</em>' containment reference.
	 * @see #setItem(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCatalogEntryRelatedEntry_Item()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='item' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getItem();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CatalogEntryRelatedEntry#getItem <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' containment reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(Reference value);

} // CatalogEntryRelatedEntry
