/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Immunization Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes a comparison of an immunization event against published recommendations to determine if the administration is "valid" in relation to those  recommendations.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ImmunizationEvaluation#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationEvaluation#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationEvaluation#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationEvaluation#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationEvaluation#getAuthority <em>Authority</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationEvaluation#getTargetDisease <em>Target Disease</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationEvaluation#getImmunizationEvent <em>Immunization Event</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationEvaluation#getDoseStatus <em>Dose Status</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationEvaluation#getDoseStatusReason <em>Dose Status Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationEvaluation#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationEvaluation#getSeries <em>Series</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationEvaluation#getDoseNumberPositiveInt <em>Dose Number Positive Int</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationEvaluation#getDoseNumberString <em>Dose Number String</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationEvaluation#getSeriesDosesPositiveInt <em>Series Doses Positive Int</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationEvaluation#getSeriesDosesString <em>Series Doses String</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getImmunizationEvaluation()
 * @model extendedMetaData="name='ImmunizationEvaluation' kind='elementOnly'"
 * @generated
 */
public interface ImmunizationEvaluation extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier assigned to this immunization evaluation record.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImmunizationEvaluation_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the current status of the evaluation of the vaccination administration event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(ImmunizationEvaluationStatusCodes)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationEvaluation_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	ImmunizationEvaluationStatusCodes getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationEvaluation#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ImmunizationEvaluationStatusCodes value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The individual for whom the evaluation is being done.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationEvaluation_Patient()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationEvaluation#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date the evaluation of the vaccine administration event was performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationEvaluation_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationEvaluation#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Authority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the authority who published the protocol (e.g. ACIP).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authority</em>' containment reference.
	 * @see #setAuthority(Reference)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationEvaluation_Authority()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='authority' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAuthority();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationEvaluation#getAuthority <em>Authority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authority</em>' containment reference.
	 * @see #getAuthority()
	 * @generated
	 */
	void setAuthority(Reference value);

	/**
	 * Returns the value of the '<em><b>Target Disease</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The vaccine preventable disease the dose is being evaluated against.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Disease</em>' containment reference.
	 * @see #setTargetDisease(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationEvaluation_TargetDisease()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='targetDisease' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getTargetDisease();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationEvaluation#getTargetDisease <em>Target Disease</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Disease</em>' containment reference.
	 * @see #getTargetDisease()
	 * @generated
	 */
	void setTargetDisease(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Immunization Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The vaccine administration event being evaluated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Immunization Event</em>' containment reference.
	 * @see #setImmunizationEvent(Reference)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationEvaluation_ImmunizationEvent()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='immunizationEvent' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getImmunizationEvent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationEvaluation#getImmunizationEvent <em>Immunization Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Immunization Event</em>' containment reference.
	 * @see #getImmunizationEvent()
	 * @generated
	 */
	void setImmunizationEvent(Reference value);

	/**
	 * Returns the value of the '<em><b>Dose Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates if the dose is valid or not valid with respect to the published recommendations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dose Status</em>' containment reference.
	 * @see #setDoseStatus(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationEvaluation_DoseStatus()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='doseStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDoseStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationEvaluation#getDoseStatus <em>Dose Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dose Status</em>' containment reference.
	 * @see #getDoseStatus()
	 * @generated
	 */
	void setDoseStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Dose Status Reason</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides an explanation as to why the vaccine administration event is valid or not relative to the published recommendations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dose Status Reason</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImmunizationEvaluation_DoseStatusReason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='doseStatusReason' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getDoseStatusReason();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional information about the evaluation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationEvaluation_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationEvaluation#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Series</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One possible path to achieve presumed immunity against a disease - within the context of an authority.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Series</em>' containment reference.
	 * @see #setSeries(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationEvaluation_Series()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='series' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSeries();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationEvaluation#getSeries <em>Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series</em>' containment reference.
	 * @see #getSeries()
	 * @generated
	 */
	void setSeries(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Dose Number Positive Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nominal position in a series. (choose any one of doseNumber*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dose Number Positive Int</em>' containment reference.
	 * @see #setDoseNumberPositiveInt(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationEvaluation_DoseNumberPositiveInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='doseNumberPositiveInt' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getDoseNumberPositiveInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationEvaluation#getDoseNumberPositiveInt <em>Dose Number Positive Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dose Number Positive Int</em>' containment reference.
	 * @see #getDoseNumberPositiveInt()
	 * @generated
	 */
	void setDoseNumberPositiveInt(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Dose Number String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nominal position in a series. (choose any one of doseNumber*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dose Number String</em>' containment reference.
	 * @see #setDoseNumberString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationEvaluation_DoseNumberString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='doseNumberString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDoseNumberString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationEvaluation#getDoseNumberString <em>Dose Number String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dose Number String</em>' containment reference.
	 * @see #getDoseNumberString()
	 * @generated
	 */
	void setDoseNumberString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Series Doses Positive Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The recommended number of doses to achieve immunity. (choose any one of seriesDoses*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Series Doses Positive Int</em>' containment reference.
	 * @see #setSeriesDosesPositiveInt(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationEvaluation_SeriesDosesPositiveInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='seriesDosesPositiveInt' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getSeriesDosesPositiveInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationEvaluation#getSeriesDosesPositiveInt <em>Series Doses Positive Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series Doses Positive Int</em>' containment reference.
	 * @see #getSeriesDosesPositiveInt()
	 * @generated
	 */
	void setSeriesDosesPositiveInt(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Series Doses String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The recommended number of doses to achieve immunity. (choose any one of seriesDoses*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Series Doses String</em>' containment reference.
	 * @see #setSeriesDosesString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationEvaluation_SeriesDosesString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='seriesDosesString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSeriesDosesString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationEvaluation#getSeriesDosesString <em>Series Doses String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series Doses String</em>' containment reference.
	 * @see #getSeriesDosesString()
	 * @generated
	 */
	void setSeriesDosesString(org.hl7.fhir.String value);

} // ImmunizationEvaluation
