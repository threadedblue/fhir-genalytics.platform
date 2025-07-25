/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Knowledge Ingredient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Information about a medication that is used to support knowledge.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicationKnowledgeIngredient#getItemCodeableConcept <em>Item Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledgeIngredient#getItemReference <em>Item Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledgeIngredient#getIsActive <em>Is Active</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledgeIngredient#getStrength <em>Strength</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgeIngredient()
 * @model extendedMetaData="name='MedicationKnowledge.Ingredient' kind='elementOnly'"
 * @generated
 */
public interface MedicationKnowledgeIngredient extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Item Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual ingredient - either a substance (simple ingredient) or another medication. (choose any one of item*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Codeable Concept</em>' containment reference.
	 * @see #setItemCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgeIngredient_ItemCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='itemCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getItemCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationKnowledgeIngredient#getItemCodeableConcept <em>Item Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Codeable Concept</em>' containment reference.
	 * @see #getItemCodeableConcept()
	 * @generated
	 */
	void setItemCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Item Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual ingredient - either a substance (simple ingredient) or another medication. (choose any one of item*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Reference</em>' containment reference.
	 * @see #setItemReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgeIngredient_ItemReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='itemReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getItemReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationKnowledgeIngredient#getItemReference <em>Item Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Reference</em>' containment reference.
	 * @see #getItemReference()
	 * @generated
	 */
	void setItemReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Is Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indication of whether this ingredient affects the therapeutic action of the drug.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Active</em>' containment reference.
	 * @see #setIsActive(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgeIngredient_IsActive()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='isActive' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getIsActive();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationKnowledgeIngredient#getIsActive <em>Is Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Active</em>' containment reference.
	 * @see #getIsActive()
	 * @generated
	 */
	void setIsActive(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Strength</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies how many (or how much) of the items there are in this Medication.  For example, 250 mg per tablet.  This is expressed as a ratio where the numerator is 250mg and the denominator is 1 tablet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strength</em>' containment reference.
	 * @see #setStrength(Ratio)
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgeIngredient_Strength()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='strength' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getStrength();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationKnowledgeIngredient#getStrength <em>Strength</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strength</em>' containment reference.
	 * @see #getStrength()
	 * @generated
	 */
	void setStrength(Ratio value);

} // MedicationKnowledgeIngredient
