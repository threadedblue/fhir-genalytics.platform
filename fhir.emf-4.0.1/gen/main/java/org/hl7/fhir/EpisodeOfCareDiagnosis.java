/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Episode Of Care Diagnosis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this time.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.EpisodeOfCareDiagnosis#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.EpisodeOfCareDiagnosis#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.EpisodeOfCareDiagnosis#getRank <em>Rank</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getEpisodeOfCareDiagnosis()
 * @model extendedMetaData="name='EpisodeOfCare.Diagnosis' kind='elementOnly'"
 * @generated
 */
public interface EpisodeOfCareDiagnosis extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of conditions/problems/diagnoses that this episode of care is intended to be providing care for.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEpisodeOfCareDiagnosis_Condition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='condition' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getCondition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EpisodeOfCareDiagnosis#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Reference value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Role that this diagnosis has within the episode of care (e.g. admission, billing, discharge …).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getEpisodeOfCareDiagnosis_Role()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='role' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRole();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EpisodeOfCareDiagnosis#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Rank</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ranking of the diagnosis (for each role type).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rank</em>' containment reference.
	 * @see #setRank(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getEpisodeOfCareDiagnosis_Rank()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rank' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getRank();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EpisodeOfCareDiagnosis#getRank <em>Rank</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rank</em>' containment reference.
	 * @see #getRank()
	 * @generated
	 */
	void setRank(PositiveInt value);

} // EpisodeOfCareDiagnosis
