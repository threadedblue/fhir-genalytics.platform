/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effect Evidence Synthesis Effect Estimate</b></em>'.
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
 *   <li>{@link org.hl7.fhir.EffectEvidenceSynthesisEffectEstimate#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.EffectEvidenceSynthesisEffectEstimate#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.EffectEvidenceSynthesisEffectEstimate#getVariantState <em>Variant State</em>}</li>
 *   <li>{@link org.hl7.fhir.EffectEvidenceSynthesisEffectEstimate#getValue <em>Value</em>}</li>
 *   <li>{@link org.hl7.fhir.EffectEvidenceSynthesisEffectEstimate#getUnitOfMeasure <em>Unit Of Measure</em>}</li>
 *   <li>{@link org.hl7.fhir.EffectEvidenceSynthesisEffectEstimate#getPrecisionEstimate <em>Precision Estimate</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getEffectEvidenceSynthesisEffectEstimate()
 * @model extendedMetaData="name='EffectEvidenceSynthesis.EffectEstimate' kind='elementOnly'"
 * @generated
 */
public interface EffectEvidenceSynthesisEffectEstimate extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Human-readable summary of effect estimate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getEffectEvidenceSynthesisEffectEstimate_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EffectEvidenceSynthesisEffectEstimate#getDescription <em>Description</em>}' containment reference.
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
	 * Examples include relative risk and mean difference.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getEffectEvidenceSynthesisEffectEstimate_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EffectEvidenceSynthesisEffectEstimate#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Variant State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to define variant exposure states such as low-risk state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variant State</em>' containment reference.
	 * @see #setVariantState(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getEffectEvidenceSynthesisEffectEstimate_VariantState()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='variantState' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getVariantState();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EffectEvidenceSynthesisEffectEstimate#getVariantState <em>Variant State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variant State</em>' containment reference.
	 * @see #getVariantState()
	 * @generated
	 */
	void setVariantState(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The point estimate of the effect estimate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getEffectEvidenceSynthesisEffectEstimate_Value()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EffectEvidenceSynthesisEffectEstimate#getValue <em>Value</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getEffectEvidenceSynthesisEffectEstimate_UnitOfMeasure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unitOfMeasure' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getUnitOfMeasure();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EffectEvidenceSynthesisEffectEstimate#getUnitOfMeasure <em>Unit Of Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Of Measure</em>' containment reference.
	 * @see #getUnitOfMeasure()
	 * @generated
	 */
	void setUnitOfMeasure(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Precision Estimate</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.EffectEvidenceSynthesisPrecisionEstimate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the precision of the estimate for the effect.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Precision Estimate</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEffectEvidenceSynthesisEffectEstimate_PrecisionEstimate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='precisionEstimate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EffectEvidenceSynthesisPrecisionEstimate> getPrecisionEstimate();

} // EffectEvidenceSynthesisEffectEstimate
