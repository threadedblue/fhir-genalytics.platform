/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effect Evidence Synthesis Precision Estimate</b></em>'.
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
 *   <li>{@link org.hl7.fhir.EffectEvidenceSynthesisPrecisionEstimate#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.EffectEvidenceSynthesisPrecisionEstimate#getLevel <em>Level</em>}</li>
 *   <li>{@link org.hl7.fhir.EffectEvidenceSynthesisPrecisionEstimate#getFrom <em>From</em>}</li>
 *   <li>{@link org.hl7.fhir.EffectEvidenceSynthesisPrecisionEstimate#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getEffectEvidenceSynthesisPrecisionEstimate()
 * @model extendedMetaData="name='EffectEvidenceSynthesis.PrecisionEstimate' kind='elementOnly'"
 * @generated
 */
public interface EffectEvidenceSynthesisPrecisionEstimate extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Examples include confidence interval and interquartile range.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getEffectEvidenceSynthesisPrecisionEstimate_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EffectEvidenceSynthesisPrecisionEstimate#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Use 95 for a 95% confidence interval.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Level</em>' containment reference.
	 * @see #setLevel(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getEffectEvidenceSynthesisPrecisionEstimate_Level()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='level' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getLevel();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EffectEvidenceSynthesisPrecisionEstimate#getLevel <em>Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' containment reference.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(Decimal value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lower bound of confidence interval.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From</em>' containment reference.
	 * @see #setFrom(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getEffectEvidenceSynthesisPrecisionEstimate_From()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='from' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getFrom();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EffectEvidenceSynthesisPrecisionEstimate#getFrom <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' containment reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Decimal value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Upper bound of confidence interval.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To</em>' containment reference.
	 * @see #setTo(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getEffectEvidenceSynthesisPrecisionEstimate_To()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='to' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getTo();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EffectEvidenceSynthesisPrecisionEstimate#getTo <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' containment reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Decimal value);

} // EffectEvidenceSynthesisPrecisionEstimate
