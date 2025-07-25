/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Ingredient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ingredient of a manufactured item or pharmaceutical product.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicinalProductIngredient#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductIngredient#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductIngredient#getAllergenicIndicator <em>Allergenic Indicator</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductIngredient#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductIngredient#getSpecifiedSubstance <em>Specified Substance</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductIngredient#getSubstance <em>Substance</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicinalProductIngredient()
 * @model extendedMetaData="name='MedicinalProductIngredient' kind='elementOnly'"
 * @generated
 */
public interface MedicinalProductIngredient extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifier(s) of this Ingredient that are assigned by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductIngredient_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductIngredient#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ingredient role e.g. Active ingredient, excipient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductIngredient_Role()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='role' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRole();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductIngredient#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Allergenic Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the ingredient is a known or suspected allergen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allergenic Indicator</em>' containment reference.
	 * @see #setAllergenicIndicator(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductIngredient_AllergenicIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='allergenicIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getAllergenicIndicator();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductIngredient#getAllergenicIndicator <em>Allergenic Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allergenic Indicator</em>' containment reference.
	 * @see #getAllergenicIndicator()
	 * @generated
	 */
	void setAllergenicIndicator(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Manufacturer of this Ingredient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductIngredient_Manufacturer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='manufacturer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getManufacturer();

	/**
	 * Returns the value of the '<em><b>Specified Substance</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicinalProductIngredientSpecifiedSubstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A specified substance that comprises this ingredient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specified Substance</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductIngredient_SpecifiedSubstance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specifiedSubstance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicinalProductIngredientSpecifiedSubstance> getSpecifiedSubstance();

	/**
	 * Returns the value of the '<em><b>Substance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ingredient substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substance</em>' containment reference.
	 * @see #setSubstance(MedicinalProductIngredientSubstance)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductIngredient_Substance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='substance' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicinalProductIngredientSubstance getSubstance();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductIngredient#getSubstance <em>Substance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substance</em>' containment reference.
	 * @see #getSubstance()
	 * @generated
	 */
	void setSubstance(MedicinalProductIngredientSubstance value);

} // MedicinalProductIngredient
