/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Polymer Starting Material</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Todo.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SubstancePolymerStartingMaterial#getMaterial <em>Material</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstancePolymerStartingMaterial#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstancePolymerStartingMaterial#getIsDefining <em>Is Defining</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstancePolymerStartingMaterial#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubstancePolymerStartingMaterial()
 * @model extendedMetaData="name='SubstancePolymer.StartingMaterial' kind='elementOnly'"
 * @generated
 */
public interface SubstancePolymerStartingMaterial extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Material</em>' containment reference.
	 * @see #setMaterial(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstancePolymerStartingMaterial_Material()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='material' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getMaterial();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstancePolymerStartingMaterial#getMaterial <em>Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material</em>' containment reference.
	 * @see #getMaterial()
	 * @generated
	 */
	void setMaterial(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstancePolymerStartingMaterial_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstancePolymerStartingMaterial#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Is Defining</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Defining</em>' containment reference.
	 * @see #setIsDefining(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getSubstancePolymerStartingMaterial_IsDefining()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='isDefining' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getIsDefining();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstancePolymerStartingMaterial#getIsDefining <em>Is Defining</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Defining</em>' containment reference.
	 * @see #getIsDefining()
	 * @generated
	 */
	void setIsDefining(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount</em>' containment reference.
	 * @see #setAmount(SubstanceAmount)
	 * @see org.hl7.fhir.FhirPackage#getSubstancePolymerStartingMaterial_Amount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amount' namespace='##targetNamespace'"
	 * @generated
	 */
	SubstanceAmount getAmount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstancePolymerStartingMaterial#getAmount <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' containment reference.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(SubstanceAmount value);

} // SubstancePolymerStartingMaterial
