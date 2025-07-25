/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Pharmaceutical</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A pharmaceutical product described in terms of its composition and dose form.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicinalProductPharmaceutical#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductPharmaceutical#getAdministrableDoseForm <em>Administrable Dose Form</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductPharmaceutical#getUnitOfPresentation <em>Unit Of Presentation</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductPharmaceutical#getIngredient <em>Ingredient</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductPharmaceutical#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductPharmaceutical#getCharacteristics <em>Characteristics</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductPharmaceutical#getRouteOfAdministration <em>Route Of Administration</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPharmaceutical()
 * @model extendedMetaData="name='MedicinalProductPharmaceutical' kind='elementOnly'"
 * @generated
 */
public interface MedicinalProductPharmaceutical extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier for the pharmaceutical medicinal product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPharmaceutical_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Administrable Dose Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The administrable dose form, after necessary reconstitution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Administrable Dose Form</em>' containment reference.
	 * @see #setAdministrableDoseForm(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPharmaceutical_AdministrableDoseForm()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='administrableDoseForm' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getAdministrableDoseForm();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductPharmaceutical#getAdministrableDoseForm <em>Administrable Dose Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Administrable Dose Form</em>' containment reference.
	 * @see #getAdministrableDoseForm()
	 * @generated
	 */
	void setAdministrableDoseForm(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Unit Of Presentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit Of Presentation</em>' containment reference.
	 * @see #setUnitOfPresentation(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPharmaceutical_UnitOfPresentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unitOfPresentation' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getUnitOfPresentation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductPharmaceutical#getUnitOfPresentation <em>Unit Of Presentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Of Presentation</em>' containment reference.
	 * @see #getUnitOfPresentation()
	 * @generated
	 */
	void setUnitOfPresentation(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Ingredient</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ingredient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ingredient</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPharmaceutical_Ingredient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ingredient' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getIngredient();

	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Accompanying device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPharmaceutical_Device()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='device' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getDevice();

	/**
	 * Returns the value of the '<em><b>Characteristics</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicinalProductPharmaceuticalCharacteristics}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Characteristics e.g. a products onset of action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Characteristics</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPharmaceutical_Characteristics()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='characteristics' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicinalProductPharmaceuticalCharacteristics> getCharacteristics();

	/**
	 * Returns the value of the '<em><b>Route Of Administration</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicinalProductPharmaceuticalRouteOfAdministration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The path by which the pharmaceutical product is taken into or makes contact with the body.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route Of Administration</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPharmaceutical_RouteOfAdministration()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='routeOfAdministration' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicinalProductPharmaceuticalRouteOfAdministration> getRouteOfAdministration();

} // MedicinalProductPharmaceutical
