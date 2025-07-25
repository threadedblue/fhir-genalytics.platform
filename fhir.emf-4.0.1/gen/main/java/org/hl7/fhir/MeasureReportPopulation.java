/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Report Population</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The MeasureReport resource contains the results of the calculation of a measure; and optionally a reference to the resources involved in that calculation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MeasureReportPopulation#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReportPopulation#getCount <em>Count</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReportPopulation#getSubjectResults <em>Subject Results</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMeasureReportPopulation()
 * @model extendedMetaData="name='MeasureReport.Population' kind='elementOnly'"
 * @generated
 */
public interface MeasureReportPopulation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the population.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMeasureReportPopulation_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureReportPopulation#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of members of the population.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Count</em>' containment reference.
	 * @see #setCount(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getMeasureReportPopulation_Count()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='count' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getCount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureReportPopulation#getCount <em>Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' containment reference.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Subject Results</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element refers to a List of subject level MeasureReport resources, one for each subject in this population.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject Results</em>' containment reference.
	 * @see #setSubjectResults(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMeasureReportPopulation_SubjectResults()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subjectResults' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubjectResults();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureReportPopulation#getSubjectResults <em>Subject Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject Results</em>' containment reference.
	 * @see #getSubjectResults()
	 * @generated
	 */
	void setSubjectResults(Reference value);

} // MeasureReportPopulation
