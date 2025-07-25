/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Knowledge Substitution</b></em>'.
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
 *   <li>{@link org.hl7.fhir.MedicationKnowledgeSubstitution#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledgeSubstitution#getAllowed <em>Allowed</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgeSubstitution()
 * @model extendedMetaData="name='MedicationKnowledge.Substitution' kind='elementOnly'"
 * @generated
 */
public interface MedicationKnowledgeSubstitution extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the type of substitution allowed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgeSubstitution_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationKnowledgeSubstitution#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Allowed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies if regulation allows for changes in the medication when dispensing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allowed</em>' containment reference.
	 * @see #setAllowed(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgeSubstitution_Allowed()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='allowed' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getAllowed();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationKnowledgeSubstitution#getAllowed <em>Allowed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed</em>' containment reference.
	 * @see #getAllowed()
	 * @generated
	 */
	void setAllowed(org.hl7.fhir.Boolean value);

} // MedicationKnowledgeSubstitution
