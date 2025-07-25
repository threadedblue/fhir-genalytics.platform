/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Undesirable Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describe the undesirable effects of the medicinal product.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicinalProductUndesirableEffect#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductUndesirableEffect#getSymptomConditionEffect <em>Symptom Condition Effect</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductUndesirableEffect#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductUndesirableEffect#getFrequencyOfOccurrence <em>Frequency Of Occurrence</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductUndesirableEffect#getPopulation <em>Population</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicinalProductUndesirableEffect()
 * @model extendedMetaData="name='MedicinalProductUndesirableEffect' kind='elementOnly'"
 * @generated
 */
public interface MedicinalProductUndesirableEffect extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The medication for which this is an indication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductUndesirableEffect_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSubject();

	/**
	 * Returns the value of the '<em><b>Symptom Condition Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The symptom, condition or undesirable effect.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Symptom Condition Effect</em>' containment reference.
	 * @see #setSymptomConditionEffect(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductUndesirableEffect_SymptomConditionEffect()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='symptomConditionEffect' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSymptomConditionEffect();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductUndesirableEffect#getSymptomConditionEffect <em>Symptom Condition Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symptom Condition Effect</em>' containment reference.
	 * @see #getSymptomConditionEffect()
	 * @generated
	 */
	void setSymptomConditionEffect(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Classification of the effect.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classification</em>' containment reference.
	 * @see #setClassification(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductUndesirableEffect_Classification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='classification' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getClassification();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductUndesirableEffect#getClassification <em>Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification</em>' containment reference.
	 * @see #getClassification()
	 * @generated
	 */
	void setClassification(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Frequency Of Occurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The frequency of occurrence of the effect.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frequency Of Occurrence</em>' containment reference.
	 * @see #setFrequencyOfOccurrence(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductUndesirableEffect_FrequencyOfOccurrence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='frequencyOfOccurrence' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getFrequencyOfOccurrence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductUndesirableEffect#getFrequencyOfOccurrence <em>Frequency Of Occurrence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency Of Occurrence</em>' containment reference.
	 * @see #getFrequencyOfOccurrence()
	 * @generated
	 */
	void setFrequencyOfOccurrence(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Population</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Population}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The population group to which this applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Population</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductUndesirableEffect_Population()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='population' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Population> getPopulation();

} // MedicinalProductUndesirableEffect
