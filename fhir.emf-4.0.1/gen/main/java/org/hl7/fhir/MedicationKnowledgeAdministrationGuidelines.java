/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Knowledge Administration Guidelines</b></em>'.
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
 *   <li>{@link org.hl7.fhir.MedicationKnowledgeAdministrationGuidelines#getDosage <em>Dosage</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledgeAdministrationGuidelines#getIndicationCodeableConcept <em>Indication Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledgeAdministrationGuidelines#getIndicationReference <em>Indication Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledgeAdministrationGuidelines#getPatientCharacteristics <em>Patient Characteristics</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgeAdministrationGuidelines()
 * @model extendedMetaData="name='MedicationKnowledge.AdministrationGuidelines' kind='elementOnly'"
 * @generated
 */
public interface MedicationKnowledgeAdministrationGuidelines extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Dosage</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicationKnowledgeDosage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dosage for the medication for the specific guidelines.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dosage</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgeAdministrationGuidelines_Dosage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dosage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicationKnowledgeDosage> getDosage();

	/**
	 * Returns the value of the '<em><b>Indication Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indication for use that apply to the specific administration guidelines. (choose any one of indication*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Indication Codeable Concept</em>' containment reference.
	 * @see #setIndicationCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgeAdministrationGuidelines_IndicationCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='indicationCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getIndicationCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationKnowledgeAdministrationGuidelines#getIndicationCodeableConcept <em>Indication Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indication Codeable Concept</em>' containment reference.
	 * @see #getIndicationCodeableConcept()
	 * @generated
	 */
	void setIndicationCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Indication Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indication for use that apply to the specific administration guidelines. (choose any one of indication*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Indication Reference</em>' containment reference.
	 * @see #setIndicationReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgeAdministrationGuidelines_IndicationReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='indicationReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getIndicationReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationKnowledgeAdministrationGuidelines#getIndicationReference <em>Indication Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indication Reference</em>' containment reference.
	 * @see #getIndicationReference()
	 * @generated
	 */
	void setIndicationReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Patient Characteristics</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicationKnowledgePatientCharacteristics}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Characteristics of the patient that are relevant to the administration guidelines (for example, height, weight, gender, etc.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient Characteristics</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgeAdministrationGuidelines_PatientCharacteristics()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patientCharacteristics' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicationKnowledgePatientCharacteristics> getPatientCharacteristics();

} // MedicationKnowledgeAdministrationGuidelines
