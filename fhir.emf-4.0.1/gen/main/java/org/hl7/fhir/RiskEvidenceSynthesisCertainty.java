/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Risk Evidence Synthesis Certainty</b></em>'.
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
 *   <li>{@link org.hl7.fhir.RiskEvidenceSynthesisCertainty#getRating <em>Rating</em>}</li>
 *   <li>{@link org.hl7.fhir.RiskEvidenceSynthesisCertainty#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.RiskEvidenceSynthesisCertainty#getCertaintySubcomponent <em>Certainty Subcomponent</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getRiskEvidenceSynthesisCertainty()
 * @model extendedMetaData="name='RiskEvidenceSynthesis.Certainty' kind='elementOnly'"
 * @generated
 */
public interface RiskEvidenceSynthesisCertainty extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Rating</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A rating of the certainty of the effect estimate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rating</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getRiskEvidenceSynthesisCertainty_Rating()
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
	 * @see org.hl7.fhir.FhirPackage#getRiskEvidenceSynthesisCertainty_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

	/**
	 * Returns the value of the '<em><b>Certainty Subcomponent</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.RiskEvidenceSynthesisCertaintySubcomponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of a component of the overall certainty.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Certainty Subcomponent</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getRiskEvidenceSynthesisCertainty_CertaintySubcomponent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='certaintySubcomponent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RiskEvidenceSynthesisCertaintySubcomponent> getCertaintySubcomponent();

} // RiskEvidenceSynthesisCertainty
