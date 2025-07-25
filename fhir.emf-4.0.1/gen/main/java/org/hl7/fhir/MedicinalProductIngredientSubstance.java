/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Ingredient Substance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ingredient of a manufactured item or pharmaceutical product.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicinalProductIngredientSubstance#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductIngredientSubstance#getStrength <em>Strength</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicinalProductIngredientSubstance()
 * @model extendedMetaData="name='MedicinalProductIngredient.Substance' kind='elementOnly'"
 * @generated
 */
public interface MedicinalProductIngredientSubstance extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ingredient substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductIngredientSubstance_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductIngredientSubstance#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Strength</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicinalProductIngredientStrength}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Quantity of the substance or specified substance present in the manufactured item or pharmaceutical product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strength</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductIngredientSubstance_Strength()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='strength' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicinalProductIngredientStrength> getStrength();

} // MedicinalProductIngredientSubstance
