/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imaging Study</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context.  A series is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getModality <em>Modality</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getStarted <em>Started</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getReferrer <em>Referrer</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getInterpreter <em>Interpreter</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getNumberOfSeries <em>Number Of Series</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getNumberOfInstances <em>Number Of Instances</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getProcedureReference <em>Procedure Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getProcedureCode <em>Procedure Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getReasonCode <em>Reason Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getReasonReference <em>Reason Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getSeries <em>Series</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getImagingStudy()
 * @model extendedMetaData="name='ImagingStudy' kind='elementOnly'"
 * @generated
 */
public interface ImagingStudy extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifiers for the ImagingStudy such as DICOM Study Instance UID, and Accession Number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current state of the ImagingStudy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(ImagingStudyStatus)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	ImagingStudyStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudy#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ImagingStudyStatus value);

	/**
	 * Returns the value of the '<em><b>Modality</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of all the series.modality values that are actual acquisition modalities, i.e. those in the DICOM Context Group 29 (value set OID 1.2.840.10008.6.1.19).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modality</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_Modality()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modality' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getModality();

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The subject, typically a patient, of the imaging study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_Subject()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudy#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The healthcare event (e.g. a patient and healthcare provider interaction) during which this ImagingStudy is made.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudy#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Started</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date and time the study started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Started</em>' containment reference.
	 * @see #setStarted(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_Started()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='started' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getStarted();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudy#getStarted <em>Started</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Started</em>' containment reference.
	 * @see #getStarted()
	 * @generated
	 */
	void setStarted(DateTime value);

	/**
	 * Returns the value of the '<em><b>Based On</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of the diagnostic requests that resulted in this imaging study being performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Based On</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_BasedOn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='basedOn' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getBasedOn();

	/**
	 * Returns the value of the '<em><b>Referrer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The requesting/referring physician.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referrer</em>' containment reference.
	 * @see #setReferrer(Reference)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_Referrer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referrer' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReferrer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudy#getReferrer <em>Referrer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referrer</em>' containment reference.
	 * @see #getReferrer()
	 * @generated
	 */
	void setReferrer(Reference value);

	/**
	 * Returns the value of the '<em><b>Interpreter</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Who read the study and interpreted the images or other content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interpreter</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_Interpreter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interpreter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getInterpreter();

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The network service providing access (e.g., query, view, or retrieval) for the study. See implementation notes for information about using DICOM endpoints. A study-level endpoint applies to each series in the study, unless overridden by a series-level endpoint with the same Endpoint.connectionType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endpoint</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_Endpoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endpoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getEndpoint();

	/**
	 * Returns the value of the '<em><b>Number Of Series</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of Series in the Study. This value given may be larger than the number of series elements this Resource contains due to resource availability, security, or other factors. This element should be present if any series elements are present.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Series</em>' containment reference.
	 * @see #setNumberOfSeries(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_NumberOfSeries()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='numberOfSeries' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getNumberOfSeries();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudy#getNumberOfSeries <em>Number Of Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Series</em>' containment reference.
	 * @see #getNumberOfSeries()
	 * @generated
	 */
	void setNumberOfSeries(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Number Of Instances</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of SOP Instances in Study. This value given may be larger than the number of instance elements this resource contains due to resource availability, security, or other factors. This element should be present if any instance elements are present.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Instances</em>' containment reference.
	 * @see #setNumberOfInstances(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_NumberOfInstances()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='numberOfInstances' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getNumberOfInstances();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudy#getNumberOfInstances <em>Number Of Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Instances</em>' containment reference.
	 * @see #getNumberOfInstances()
	 * @generated
	 */
	void setNumberOfInstances(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Procedure Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The procedure which this ImagingStudy was part of.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Procedure Reference</em>' containment reference.
	 * @see #setProcedureReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_ProcedureReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='procedureReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getProcedureReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudy#getProcedureReference <em>Procedure Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedure Reference</em>' containment reference.
	 * @see #getProcedureReference()
	 * @generated
	 */
	void setProcedureReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Procedure Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The code for the performed procedure type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Procedure Code</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_ProcedureCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='procedureCode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getProcedureCode();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The principal physical location where the ImagingStudy was performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Reference)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getLocation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudy#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Reference value);

	/**
	 * Returns the value of the '<em><b>Reason Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of clinical condition indicating why the ImagingStudy was requested.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason Code</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_ReasonCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reasonCode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getReasonCode();

	/**
	 * Returns the value of the '<em><b>Reason Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates another resource whose existence justifies this Study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason Reference</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_ReasonReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reasonReference' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getReasonReference();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Per the recommended DICOM mapping, this element is derived from the Study Description attribute (0008,1030). Observations or findings about the imaging study should be recorded in another resource, e.g. Observation, and not in this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Imaging Manager description of the study. Institution-generated description or classification of the Study (component) performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudy#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Series</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ImagingStudySeries}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each study has one or more series of images or other content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Series</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_Series()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='series' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImagingStudySeries> getSeries();

} // ImagingStudy
