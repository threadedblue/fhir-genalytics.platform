/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Ingredient Specified Substance</b></em>'.
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
 *   <li>{@link org.hl7.fhir.MedicinalProductIngredientSpecifiedSubstance#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductIngredientSpecifiedSubstance#getGroup <em>Group</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductIngredientSpecifiedSubstance#getConfidentiality <em>Confidentiality</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductIngredientSpecifiedSubstance#getStrength <em>Strength</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicinalProductIngredientSpecifiedSubstance()
 * @model extendedMetaData="name='MedicinalProductIngredient.SpecifiedSubstance' kind='elementOnly'"
 * @generated
 */
public interface MedicinalProductIngredientSpecifiedSubstance extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specified substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductIngredientSpecifiedSubstance_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductIngredientSpecifiedSubstance#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The group of specified substance, e.g. group 1 to 4.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' containment reference.
	 * @see #setGroup(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductIngredientSpecifiedSubstance_Group()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='group' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getGroup();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductIngredientSpecifiedSubstance#getGroup <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' containment reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Confidentiality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Confidentiality level of the specified substance as the ingredient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Confidentiality</em>' containment reference.
	 * @see #setConfidentiality(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductIngredientSpecifiedSubstance_Confidentiality()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='confidentiality' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getConfidentiality();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductIngredientSpecifiedSubstance#getConfidentiality <em>Confidentiality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidentiality</em>' containment reference.
	 * @see #getConfidentiality()
	 * @generated
	 */
	void setConfidentiality(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Strength</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicinalProductIngredientStrength}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Quantity of the substance or specified substance present in the manufactured item or pharmaceutical product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strength</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductIngredientSpecifiedSubstance_Strength()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='strength' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicinalProductIngredientStrength> getStrength();

} // MedicinalProductIngredientSpecifiedSubstance
