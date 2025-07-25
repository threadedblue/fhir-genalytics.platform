/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Risk Evidence Synthesis Risk Estimate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The RiskEvidenceSynthesis resource describes the likelihood of an outcome in a population plus exposure state where the risk estimate is derived from a combination of research studies.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.RiskEvidenceSynthesisRiskEstimate#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.RiskEvidenceSynthesisRiskEstimate#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.RiskEvidenceSynthesisRiskEstimate#getValue <em>Value</em>}</li>
 *   <li>{@link org.hl7.fhir.RiskEvidenceSynthesisRiskEstimate#getUnitOfMeasure <em>Unit Of Measure</em>}</li>
 *   <li>{@link org.hl7.fhir.RiskEvidenceSynthesisRiskEstimate#getDenominatorCount <em>Denominator Count</em>}</li>
 *   <li>{@link org.hl7.fhir.RiskEvidenceSynthesisRiskEstimate#getNumeratorCount <em>Numerator Count</em>}</li>
 *   <li>{@link org.hl7.fhir.RiskEvidenceSynthesisRiskEstimate#getPrecisionEstimate <em>Precision Estimate</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getRiskEvidenceSynthesisRiskEstimate()
 * @model extendedMetaData="name='RiskEvidenceSynthesis.RiskEstimate' kind='elementOnly'"
 * @generated
 */
public interface RiskEvidenceSynthesisRiskEstimate extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Human-readable summary of risk estimate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getRiskEvidenceSynthesisRiskEstimate_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RiskEvidenceSynthesisRiskEstimate#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Examples include proportion and mean.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getRiskEvidenceSynthesisRiskEstimate_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RiskEvidenceSynthesisRiskEstimate#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The point estimate of the risk estimate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getRiskEvidenceSynthesisRiskEstimate_Value()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RiskEvidenceSynthesisRiskEstimate#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Decimal value);

	/**
	 * Returns the value of the '<em><b>Unit Of Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the UCUM unit for the outcome.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit Of Measure</em>' containment reference.
	 * @see #setUnitOfMeasure(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getRiskEvidenceSynthesisRiskEstimate_UnitOfMeasure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unitOfMeasure' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getUnitOfMeasure();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RiskEvidenceSynthesisRiskEstimate#getUnitOfMeasure <em>Unit Of Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Of Measure</em>' containment reference.
	 * @see #getUnitOfMeasure()
	 * @generated
	 */
	void setUnitOfMeasure(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Denominator Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sample size for the group that was measured for this risk estimate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Denominator Count</em>' containment reference.
	 * @see #setDenominatorCount(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getRiskEvidenceSynthesisRiskEstimate_DenominatorCount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='denominatorCount' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getDenominatorCount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RiskEvidenceSynthesisRiskEstimate#getDenominatorCount <em>Denominator Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Denominator Count</em>' containment reference.
	 * @see #getDenominatorCount()
	 * @generated
	 */
	void setDenominatorCount(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Numerator Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of group members with the outcome of interest.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Numerator Count</em>' containment reference.
	 * @see #setNumeratorCount(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getRiskEvidenceSynthesisRiskEstimate_NumeratorCount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='numeratorCount' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getNumeratorCount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RiskEvidenceSynthesisRiskEstimate#getNumeratorCount <em>Numerator Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numerator Count</em>' containment reference.
	 * @see #getNumeratorCount()
	 * @generated
	 */
	void setNumeratorCount(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Precision Estimate</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.RiskEvidenceSynthesisPrecisionEstimate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the precision of the estimate for the effect.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Precision Estimate</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getRiskEvidenceSynthesisRiskEstimate_PrecisionEstimate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='precisionEstimate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RiskEvidenceSynthesisPrecisionEstimate> getPrecisionEstimate();

} // RiskEvidenceSynthesisRiskEstimate
