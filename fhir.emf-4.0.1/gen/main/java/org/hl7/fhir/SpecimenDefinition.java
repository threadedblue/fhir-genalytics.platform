/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specimen Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A kind of specimen with associated set of requirements.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SpecimenDefinition#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenDefinition#getTypeCollected <em>Type Collected</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenDefinition#getPatientPreparation <em>Patient Preparation</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenDefinition#getTimeAspect <em>Time Aspect</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenDefinition#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenDefinition#getTypeTested <em>Type Tested</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinition()
 * @model extendedMetaData="name='SpecimenDefinition' kind='elementOnly'"
 * @generated
 */
public interface SpecimenDefinition extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A business identifier associated with the kind of specimen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinition_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenDefinition#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Type Collected</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The kind of material to be collected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Collected</em>' containment reference.
	 * @see #setTypeCollected(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinition_TypeCollected()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='typeCollected' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getTypeCollected();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenDefinition#getTypeCollected <em>Type Collected</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Collected</em>' containment reference.
	 * @see #getTypeCollected()
	 * @generated
	 */
	void setTypeCollected(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Patient Preparation</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Preparation of the patient for specimen collection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient Preparation</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinition_PatientPreparation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patientPreparation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getPatientPreparation();

	/**
	 * Returns the value of the '<em><b>Time Aspect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time aspect of specimen collection (duration or offset).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Aspect</em>' containment reference.
	 * @see #setTimeAspect(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinition_TimeAspect()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timeAspect' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getTimeAspect();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenDefinition#getTimeAspect <em>Time Aspect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Aspect</em>' containment reference.
	 * @see #getTimeAspect()
	 * @generated
	 */
	void setTimeAspect(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Collection</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The action to be performed for collecting the specimen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collection</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinition_Collection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='collection' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCollection();

	/**
	 * Returns the value of the '<em><b>Type Tested</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SpecimenDefinitionTypeTested}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specimen conditioned in a container as expected by the testing laboratory.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Tested</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinition_TypeTested()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='typeTested' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SpecimenDefinitionTypeTested> getTypeTested();

} // SpecimenDefinition
