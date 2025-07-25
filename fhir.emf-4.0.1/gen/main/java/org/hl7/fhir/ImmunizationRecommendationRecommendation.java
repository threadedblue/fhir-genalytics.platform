/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Immunization Recommendation Recommendation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A patient's point-in-time set of recommendations (i.e. forecasting) according to a published schedule with optional supporting justification.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ImmunizationRecommendationRecommendation#getVaccineCode <em>Vaccine Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationRecommendationRecommendation#getTargetDisease <em>Target Disease</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationRecommendationRecommendation#getContraindicatedVaccineCode <em>Contraindicated Vaccine Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationRecommendationRecommendation#getForecastStatus <em>Forecast Status</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationRecommendationRecommendation#getForecastReason <em>Forecast Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationRecommendationRecommendation#getDateCriterion <em>Date Criterion</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationRecommendationRecommendation#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationRecommendationRecommendation#getSeries <em>Series</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationRecommendationRecommendation#getDoseNumberPositiveInt <em>Dose Number Positive Int</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationRecommendationRecommendation#getDoseNumberString <em>Dose Number String</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationRecommendationRecommendation#getSeriesDosesPositiveInt <em>Series Doses Positive Int</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationRecommendationRecommendation#getSeriesDosesString <em>Series Doses String</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationRecommendationRecommendation#getSupportingImmunization <em>Supporting Immunization</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationRecommendationRecommendation#getSupportingPatientInformation <em>Supporting Patient Information</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getImmunizationRecommendationRecommendation()
 * @model extendedMetaData="name='ImmunizationRecommendation.Recommendation' kind='elementOnly'"
 * @generated
 */
public interface ImmunizationRecommendationRecommendation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Vaccine Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vaccine(s) or vaccine group that pertain to the recommendation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vaccine Code</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImmunizationRecommendationRecommendation_VaccineCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vaccineCode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getVaccineCode();

	/**
	 * Returns the value of the '<em><b>Target Disease</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The targeted disease for the recommendation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Disease</em>' containment reference.
	 * @see #setTargetDisease(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationRecommendationRecommendation_TargetDisease()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='targetDisease' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getTargetDisease();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationRecommendationRecommendation#getTargetDisease <em>Target Disease</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Disease</em>' containment reference.
	 * @see #getTargetDisease()
	 * @generated
	 */
	void setTargetDisease(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Contraindicated Vaccine Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vaccine(s) which should not be used to fulfill the recommendation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contraindicated Vaccine Code</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImmunizationRecommendationRecommendation_ContraindicatedVaccineCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contraindicatedVaccineCode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getContraindicatedVaccineCode();

	/**
	 * Returns the value of the '<em><b>Forecast Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the patient status with respect to the path to immunity for the target disease.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Forecast Status</em>' containment reference.
	 * @see #setForecastStatus(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationRecommendationRecommendation_ForecastStatus()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='forecastStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getForecastStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationRecommendationRecommendation#getForecastStatus <em>Forecast Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forecast Status</em>' containment reference.
	 * @see #getForecastStatus()
	 * @generated
	 */
	void setForecastStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Forecast Reason</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reason for the assigned forecast status.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Forecast Reason</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImmunizationRecommendationRecommendation_ForecastReason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='forecastReason' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getForecastReason();

	/**
	 * Returns the value of the '<em><b>Date Criterion</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ImmunizationRecommendationDateCriterion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vaccine date recommendations.  For example, earliest date to administer, latest date to administer, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Criterion</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImmunizationRecommendationRecommendation_DateCriterion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dateCriterion' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImmunizationRecommendationDateCriterion> getDateCriterion();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains the description about the protocol under which the vaccine was administered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationRecommendationRecommendation_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationRecommendationRecommendation#getDescription <em>Description</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getImmunizationRecommendationRecommendation_Series()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='series' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSeries();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationRecommendationRecommendation#getSeries <em>Series</em>}' containment reference.
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
	 * Nominal position of the recommended dose in a series (e.g. dose 2 is the next recommended dose). (choose any one of doseNumber*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dose Number Positive Int</em>' containment reference.
	 * @see #setDoseNumberPositiveInt(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationRecommendationRecommendation_DoseNumberPositiveInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='doseNumberPositiveInt' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getDoseNumberPositiveInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationRecommendationRecommendation#getDoseNumberPositiveInt <em>Dose Number Positive Int</em>}' containment reference.
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
	 * Nominal position of the recommended dose in a series (e.g. dose 2 is the next recommended dose). (choose any one of doseNumber*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dose Number String</em>' containment reference.
	 * @see #setDoseNumberString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationRecommendationRecommendation_DoseNumberString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='doseNumberString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDoseNumberString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationRecommendationRecommendation#getDoseNumberString <em>Dose Number String</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getImmunizationRecommendationRecommendation_SeriesDosesPositiveInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='seriesDosesPositiveInt' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getSeriesDosesPositiveInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationRecommendationRecommendation#getSeriesDosesPositiveInt <em>Series Doses Positive Int</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getImmunizationRecommendationRecommendation_SeriesDosesString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='seriesDosesString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSeriesDosesString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationRecommendationRecommendation#getSeriesDosesString <em>Series Doses String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series Doses String</em>' containment reference.
	 * @see #getSeriesDosesString()
	 * @generated
	 */
	void setSeriesDosesString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Supporting Immunization</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Immunization event history and/or evaluation that supports the status and recommendation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supporting Immunization</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImmunizationRecommendationRecommendation_SupportingImmunization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supportingImmunization' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSupportingImmunization();

	/**
	 * Returns the value of the '<em><b>Supporting Patient Information</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Patient Information that supports the status and recommendation.  This includes patient observations, adverse reactions and allergy/intolerance information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supporting Patient Information</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImmunizationRecommendationRecommendation_SupportingPatientInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supportingPatientInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSupportingPatientInformation();

} // ImmunizationRecommendationRecommendation
