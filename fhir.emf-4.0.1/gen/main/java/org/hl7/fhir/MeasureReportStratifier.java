/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Report Stratifier</b></em>'.
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
 *   <li>{@link org.hl7.fhir.MeasureReportStratifier#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureReportStratifier#getStratum <em>Stratum</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMeasureReportStratifier()
 * @model extendedMetaData="name='MeasureReport.Stratifier' kind='elementOnly'"
 * @generated
 */
public interface MeasureReportStratifier extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The meaning of this stratifier, as defined in the measure definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMeasureReportStratifier_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCode();

	/**
	 * Returns the value of the '<em><b>Stratum</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MeasureReportStratum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element contains the results for a single stratum within the stratifier. For example, when stratifying on administrative gender, there will be four strata, one for each possible gender value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stratum</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMeasureReportStratifier_Stratum()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stratum' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MeasureReportStratum> getStratum();

} // MeasureReportStratifier
