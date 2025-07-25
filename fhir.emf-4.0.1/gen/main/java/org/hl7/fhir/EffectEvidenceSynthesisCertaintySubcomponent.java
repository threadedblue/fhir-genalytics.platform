/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effect Evidence Synthesis Certainty Subcomponent</b></em>'.
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
 *   <li>{@link org.hl7.fhir.EffectEvidenceSynthesisCertaintySubcomponent#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.EffectEvidenceSynthesisCertaintySubcomponent#getRating <em>Rating</em>}</li>
 *   <li>{@link org.hl7.fhir.EffectEvidenceSynthesisCertaintySubcomponent#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getEffectEvidenceSynthesisCertaintySubcomponent()
 * @model extendedMetaData="name='EffectEvidenceSynthesis.CertaintySubcomponent' kind='elementOnly'"
 * @generated
 */
public interface EffectEvidenceSynthesisCertaintySubcomponent extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of subcomponent of certainty rating.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getEffectEvidenceSynthesisCertaintySubcomponent_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EffectEvidenceSynthesisCertaintySubcomponent#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Rating</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A rating of a subcomponent of rating certainty.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rating</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEffectEvidenceSynthesisCertaintySubcomponent_Rating()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rating' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getRating();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human-readable string to clarify or explain concepts about the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEffectEvidenceSynthesisCertaintySubcomponent_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

} // EffectEvidenceSynthesisCertaintySubcomponent
