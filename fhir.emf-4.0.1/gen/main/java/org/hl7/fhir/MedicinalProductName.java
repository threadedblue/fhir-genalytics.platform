/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Detailed definition of a medicinal product, typically for uses other than direct patient care (e.g. regulatory use).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicinalProductName#getProductName <em>Product Name</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductName#getNamePart <em>Name Part</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductName#getCountryLanguage <em>Country Language</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicinalProductName()
 * @model extendedMetaData="name='MedicinalProduct.Name' kind='elementOnly'"
 * @generated
 */
public interface MedicinalProductName extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Product Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The full product name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product Name</em>' containment reference.
	 * @see #setProductName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductName_ProductName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='productName' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getProductName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductName#getProductName <em>Product Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Name</em>' containment reference.
	 * @see #getProductName()
	 * @generated
	 */
	void setProductName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Name Part</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicinalProductNamePart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coding words or phrases of the name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Part</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductName_NamePart()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='namePart' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicinalProductNamePart> getNamePart();

	/**
	 * Returns the value of the '<em><b>Country Language</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicinalProductCountryLanguage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Country where the name applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Country Language</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductName_CountryLanguage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='countryLanguage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicinalProductCountryLanguage> getCountryLanguage();

} // MedicinalProductName
