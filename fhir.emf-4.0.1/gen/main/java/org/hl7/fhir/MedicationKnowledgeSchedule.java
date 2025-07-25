/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Knowledge Schedule</b></em>'.
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
 *   <li>{@link org.hl7.fhir.MedicationKnowledgeSchedule#getSchedule <em>Schedule</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgeSchedule()
 * @model extendedMetaData="name='MedicationKnowledge.Schedule' kind='elementOnly'"
 * @generated
 */
public interface MedicationKnowledgeSchedule extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the specific drug schedule.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schedule</em>' containment reference.
	 * @see #setSchedule(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgeSchedule_Schedule()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='schedule' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSchedule();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationKnowledgeSchedule#getSchedule <em>Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule</em>' containment reference.
	 * @see #getSchedule()
	 * @generated
	 */
	void setSchedule(CodeableConcept value);

} // MedicationKnowledgeSchedule
