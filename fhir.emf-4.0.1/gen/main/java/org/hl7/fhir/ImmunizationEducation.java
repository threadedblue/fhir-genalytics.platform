/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Immunization Education</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the event of a patient being administered a vaccine or a record of an immunization as reported by a patient, a clinician or another party.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ImmunizationEducation#getDocumentType <em>Document Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationEducation#getReference <em>Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationEducation#getPublicationDate <em>Publication Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationEducation#getPresentationDate <em>Presentation Date</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getImmunizationEducation()
 * @model extendedMetaData="name='Immunization.Education' kind='elementOnly'"
 * @generated
 */
public interface ImmunizationEducation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Document Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier of the material presented to the patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Type</em>' containment reference.
	 * @see #setDocumentType(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationEducation_DocumentType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='documentType' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDocumentType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationEducation#getDocumentType <em>Document Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Type</em>' containment reference.
	 * @see #getDocumentType()
	 * @generated
	 */
	void setDocumentType(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference pointer to the educational material given to the patient if the information was on line.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(Uri)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationEducation_Reference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationEducation#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Uri value);

	/**
	 * Returns the value of the '<em><b>Publication Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date the educational material was published.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publication Date</em>' containment reference.
	 * @see #setPublicationDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationEducation_PublicationDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='publicationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getPublicationDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationEducation#getPublicationDate <em>Publication Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publication Date</em>' containment reference.
	 * @see #getPublicationDate()
	 * @generated
	 */
	void setPublicationDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Presentation Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date the educational material was given to the patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Presentation Date</em>' containment reference.
	 * @see #setPresentationDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationEducation_PresentationDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='presentationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getPresentationDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationEducation#getPresentationDate <em>Presentation Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation Date</em>' containment reference.
	 * @see #getPresentationDate()
	 * @generated
	 */
	void setPresentationDate(DateTime value);

} // ImmunizationEducation
