/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Knowledge Patient Characteristics</b></em>'.
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
 *   <li>{@link org.hl7.fhir.MedicationKnowledgePatientCharacteristics#getCharacteristicCodeableConcept <em>Characteristic Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledgePatientCharacteristics#getCharacteristicQuantity <em>Characteristic Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledgePatientCharacteristics#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgePatientCharacteristics()
 * @model extendedMetaData="name='MedicationKnowledge.PatientCharacteristics' kind='elementOnly'"
 * @generated
 */
public interface MedicationKnowledgePatientCharacteristics extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Characteristic Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specific characteristic that is relevant to the administration guideline (e.g. height, weight, gender). (choose any one of characteristic*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Characteristic Codeable Concept</em>' containment reference.
	 * @see #setCharacteristicCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgePatientCharacteristics_CharacteristicCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='characteristicCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCharacteristicCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationKnowledgePatientCharacteristics#getCharacteristicCodeableConcept <em>Characteristic Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Characteristic Codeable Concept</em>' containment reference.
	 * @see #getCharacteristicCodeableConcept()
	 * @generated
	 */
	void setCharacteristicCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Characteristic Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specific characteristic that is relevant to the administration guideline (e.g. height, weight, gender). (choose any one of characteristic*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Characteristic Quantity</em>' containment reference.
	 * @see #setCharacteristicQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgePatientCharacteristics_CharacteristicQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='characteristicQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getCharacteristicQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationKnowledgePatientCharacteristics#getCharacteristicQuantity <em>Characteristic Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Characteristic Quantity</em>' containment reference.
	 * @see #getCharacteristicQuantity()
	 * @generated
	 */
	void setCharacteristicQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specific characteristic (e.g. height, weight, gender, etc.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgePatientCharacteristics_Value()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getValue();

} // MedicationKnowledgePatientCharacteristics
