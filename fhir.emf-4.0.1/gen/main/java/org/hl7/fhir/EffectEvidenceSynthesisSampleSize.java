/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effect Evidence Synthesis Sample Size</b></em>'.
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
 *   <li>{@link org.hl7.fhir.EffectEvidenceSynthesisSampleSize#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.EffectEvidenceSynthesisSampleSize#getNumberOfStudies <em>Number Of Studies</em>}</li>
 *   <li>{@link org.hl7.fhir.EffectEvidenceSynthesisSampleSize#getNumberOfParticipants <em>Number Of Participants</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getEffectEvidenceSynthesisSampleSize()
 * @model extendedMetaData="name='EffectEvidenceSynthesis.SampleSize' kind='elementOnly'"
 * @generated
 */
public interface EffectEvidenceSynthesisSampleSize extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Human-readable summary of sample size.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getEffectEvidenceSynthesisSampleSize_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EffectEvidenceSynthesisSampleSize#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Number Of Studies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of studies included in this evidence synthesis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Studies</em>' containment reference.
	 * @see #setNumberOfStudies(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getEffectEvidenceSynthesisSampleSize_NumberOfStudies()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='numberOfStudies' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getNumberOfStudies();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EffectEvidenceSynthesisSampleSize#getNumberOfStudies <em>Number Of Studies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Studies</em>' containment reference.
	 * @see #getNumberOfStudies()
	 * @generated
	 */
	void setNumberOfStudies(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Number Of Participants</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of participants included in this evidence synthesis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Participants</em>' containment reference.
	 * @see #setNumberOfParticipants(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getEffectEvidenceSynthesisSampleSize_NumberOfParticipants()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='numberOfParticipants' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getNumberOfParticipants();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EffectEvidenceSynthesisSampleSize#getNumberOfParticipants <em>Number Of Participants</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Participants</em>' containment reference.
	 * @see #getNumberOfParticipants()
	 * @generated
	 */
	void setNumberOfParticipants(org.hl7.fhir.Integer value);

} // EffectEvidenceSynthesisSampleSize
