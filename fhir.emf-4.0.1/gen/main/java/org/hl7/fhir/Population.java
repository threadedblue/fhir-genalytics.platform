/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Population</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A populatioof people with some set of grouping criteria.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Population#getAgeRange <em>Age Range</em>}</li>
 *   <li>{@link org.hl7.fhir.Population#getAgeCodeableConcept <em>Age Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.Population#getGender <em>Gender</em>}</li>
 *   <li>{@link org.hl7.fhir.Population#getRace <em>Race</em>}</li>
 *   <li>{@link org.hl7.fhir.Population#getPhysiologicalCondition <em>Physiological Condition</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getPopulation()
 * @model extendedMetaData="name='Population' kind='elementOnly'"
 * @generated
 */
public interface Population extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Age Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The age of the specific population. (choose any one of age*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Age Range</em>' containment reference.
	 * @see #setAgeRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getPopulation_AgeRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ageRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getAgeRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Population#getAgeRange <em>Age Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age Range</em>' containment reference.
	 * @see #getAgeRange()
	 * @generated
	 */
	void setAgeRange(Range value);

	/**
	 * Returns the value of the '<em><b>Age Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The age of the specific population. (choose any one of age*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Age Codeable Concept</em>' containment reference.
	 * @see #setAgeCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getPopulation_AgeCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ageCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getAgeCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Population#getAgeCodeableConcept <em>Age Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age Codeable Concept</em>' containment reference.
	 * @see #getAgeCodeableConcept()
	 * @generated
	 */
	void setAgeCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Gender</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gender of the specific population.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gender</em>' containment reference.
	 * @see #setGender(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getPopulation_Gender()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='gender' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getGender();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Population#getGender <em>Gender</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' containment reference.
	 * @see #getGender()
	 * @generated
	 */
	void setGender(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Race</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Race of the specific population.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Race</em>' containment reference.
	 * @see #setRace(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getPopulation_Race()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='race' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRace();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Population#getRace <em>Race</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Race</em>' containment reference.
	 * @see #getRace()
	 * @generated
	 */
	void setRace(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Physiological Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The existing physiological conditions of the specific population to which this applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physiological Condition</em>' containment reference.
	 * @see #setPhysiologicalCondition(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getPopulation_PhysiologicalCondition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='physiologicalCondition' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getPhysiologicalCondition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Population#getPhysiologicalCondition <em>Physiological Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physiological Condition</em>' containment reference.
	 * @see #getPhysiologicalCondition()
	 * @generated
	 */
	void setPhysiologicalCondition(CodeableConcept value);

} // Population
