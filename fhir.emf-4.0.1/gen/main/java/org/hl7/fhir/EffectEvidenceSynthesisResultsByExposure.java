/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effect Evidence Synthesis Results By Exposure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The EffectEvidenceSynthesis resource describes the difference in an outcome between exposures states in a population where the effect estimate is derived from a combination of research studies.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.EffectEvidenceSynthesisResultsByExposure#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.EffectEvidenceSynthesisResultsByExposure#getExposureState <em>Exposure State</em>}</li>
 *   <li>{@link org.hl7.fhir.EffectEvidenceSynthesisResultsByExposure#getVariantState <em>Variant State</em>}</li>
 *   <li>{@link org.hl7.fhir.EffectEvidenceSynthesisResultsByExposure#getRiskEvidenceSynthesis <em>Risk Evidence Synthesis</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getEffectEvidenceSynthesisResultsByExposure()
 * @model extendedMetaData="name='EffectEvidenceSynthesis.ResultsByExposure' kind='elementOnly'"
 * @generated
 */
public interface EffectEvidenceSynthesisResultsByExposure extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Human-readable summary of results by exposure state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getEffectEvidenceSynthesisResultsByExposure_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EffectEvidenceSynthesisResultsByExposure#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Exposure State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether these results are for the exposure state or alternative exposure state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exposure State</em>' containment reference.
	 * @see #setExposureState(ExposureState)
	 * @see org.hl7.fhir.FhirPackage#getEffectEvidenceSynthesisResultsByExposure_ExposureState()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exposureState' namespace='##targetNamespace'"
	 * @generated
	 */
	ExposureState getExposureState();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EffectEvidenceSynthesisResultsByExposure#getExposureState <em>Exposure State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exposure State</em>' containment reference.
	 * @see #getExposureState()
	 * @generated
	 */
	void setExposureState(ExposureState value);

	/**
	 * Returns the value of the '<em><b>Variant State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to define variant exposure states such as low-risk state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variant State</em>' containment reference.
	 * @see #setVariantState(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getEffectEvidenceSynthesisResultsByExposure_VariantState()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='variantState' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getVariantState();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EffectEvidenceSynthesisResultsByExposure#getVariantState <em>Variant State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variant State</em>' containment reference.
	 * @see #getVariantState()
	 * @generated
	 */
	void setVariantState(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Risk Evidence Synthesis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to a RiskEvidenceSynthesis resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Risk Evidence Synthesis</em>' containment reference.
	 * @see #setRiskEvidenceSynthesis(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEffectEvidenceSynthesisResultsByExposure_RiskEvidenceSynthesis()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='riskEvidenceSynthesis' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRiskEvidenceSynthesis();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EffectEvidenceSynthesisResultsByExposure#getRiskEvidenceSynthesis <em>Risk Evidence Synthesis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk Evidence Synthesis</em>' containment reference.
	 * @see #getRiskEvidenceSynthesis()
	 * @generated
	 */
	void setRiskEvidenceSynthesis(Reference value);

} // EffectEvidenceSynthesisResultsByExposure
