/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Knowledge Cost</b></em>'.
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
 *   <li>{@link org.hl7.fhir.MedicationKnowledgeCost#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledgeCost#getSource <em>Source</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledgeCost#getCost <em>Cost</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgeCost()
 * @model extendedMetaData="name='MedicationKnowledge.Cost' kind='elementOnly'"
 * @generated
 */
public interface MedicationKnowledgeCost extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The category of the cost information.  For example, manufacturers' cost, patient cost, claim reimbursement cost, actual acquisition cost.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgeCost_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationKnowledgeCost#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source or owner that assigns the price to the medication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgeCost_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSource();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationKnowledgeCost#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The price of the medication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cost</em>' containment reference.
	 * @see #setCost(Money)
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgeCost_Cost()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='cost' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getCost();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationKnowledgeCost#getCost <em>Cost</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' containment reference.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(Money value);

} // MedicationKnowledgeCost
