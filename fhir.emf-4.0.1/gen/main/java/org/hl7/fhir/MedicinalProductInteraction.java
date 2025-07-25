/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The interactions of the medicinal product with other medicinal products, or other forms of interactions.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicinalProductInteraction#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductInteraction#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductInteraction#getInteractant <em>Interactant</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductInteraction#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductInteraction#getEffect <em>Effect</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductInteraction#getIncidence <em>Incidence</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductInteraction#getManagement <em>Management</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicinalProductInteraction()
 * @model extendedMetaData="name='MedicinalProductInteraction' kind='elementOnly'"
 * @generated
 */
public interface MedicinalProductInteraction extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The medication for which this is a described interaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductInteraction_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSubject();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The interaction described.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductInteraction_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductInteraction#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Interactant</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicinalProductInteractionInteractant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specific medication, food or laboratory test that interacts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interactant</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductInteraction_Interactant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interactant' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicinalProductInteractionInteractant> getInteractant();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the interaction e.g. drug-drug interaction, drug-food interaction, drug-lab test interaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductInteraction_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductInteraction#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The effect of the interaction, for example "reduced gastric absorption of primary medication".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Effect</em>' containment reference.
	 * @see #setEffect(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductInteraction_Effect()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='effect' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getEffect();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductInteraction#getEffect <em>Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' containment reference.
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Incidence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The incidence of the interaction, e.g. theoretical, observed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incidence</em>' containment reference.
	 * @see #setIncidence(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductInteraction_Incidence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='incidence' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getIncidence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductInteraction#getIncidence <em>Incidence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incidence</em>' containment reference.
	 * @see #getIncidence()
	 * @generated
	 */
	void setIncidence(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Actions for managing the interaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Management</em>' containment reference.
	 * @see #setManagement(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductInteraction_Management()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='management' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getManagement();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductInteraction#getManagement <em>Management</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Management</em>' containment reference.
	 * @see #getManagement()
	 * @generated
	 */
	void setManagement(CodeableConcept value);

} // MedicinalProductInteraction
