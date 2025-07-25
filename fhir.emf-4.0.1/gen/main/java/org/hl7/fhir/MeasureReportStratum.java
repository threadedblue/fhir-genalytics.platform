/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Report Stratum</b></em>'.
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
 *   <li>{@link org.hl7.fhir.MeasureReportStratum#getValue <em>Value</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReportStratum#getComponent <em>Component</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReportStratum#getPopulation <em>Population</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReportStratum#getMeasureScore <em>Measure Score</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMeasureReportStratum()
 * @model extendedMetaData="name='MeasureReport.Stratum' kind='elementOnly'"
 * @generated
 */
public interface MeasureReportStratum extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value for this stratum, expressed as a CodeableConcept. When defining stratifiers on complex values, the value must be rendered such that the value for each stratum within the stratifier is unique.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMeasureReportStratum_Value()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureReportStratum#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MeasureReportComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A stratifier component value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMeasureReportStratum_Component()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='component' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MeasureReportComponent> getComponent();

	/**
	 * Returns the value of the '<em><b>Population</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MeasureReportPopulation1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The populations that make up the stratum, one for each type of population appropriate to the measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Population</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMeasureReportStratum_Population()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='population' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MeasureReportPopulation1> getPopulation();

	/**
	 * Returns the value of the '<em><b>Measure Score</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The measure score for this stratum, calculated as appropriate for the measure type and scoring method, and based on only the members of this stratum.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measure Score</em>' containment reference.
	 * @see #setMeasureScore(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getMeasureReportStratum_MeasureScore()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='measureScore' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getMeasureScore();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureReportStratum#getMeasureScore <em>Measure Score</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Score</em>' containment reference.
	 * @see #getMeasureScore()
	 * @generated
	 */
	void setMeasureScore(Quantity value);

} // MeasureReportStratum
