/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imaging Study Series</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context.  A series is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ImagingStudySeries#getUid <em>Uid</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudySeries#getNumber <em>Number</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudySeries#getModality <em>Modality</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudySeries#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudySeries#getNumberOfInstances <em>Number Of Instances</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudySeries#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudySeries#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudySeries#getLaterality <em>Laterality</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudySeries#getSpecimen <em>Specimen</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudySeries#getStarted <em>Started</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudySeries#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudySeries#getInstance <em>Instance</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getImagingStudySeries()
 * @model extendedMetaData="name='ImagingStudy.Series' kind='elementOnly'"
 * @generated
 */
public interface ImagingStudySeries extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Uid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DICOM Series Instance UID for the series.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uid</em>' containment reference.
	 * @see #setUid(Id)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudySeries_Uid()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='uid' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getUid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudySeries#getUid <em>Uid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' containment reference.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(Id value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The numeric identifier of this series in the study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number</em>' containment reference.
	 * @see #setNumber(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudySeries_Number()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='number' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getNumber();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudySeries#getNumber <em>Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' containment reference.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Modality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The modality of this series sequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modality</em>' containment reference.
	 * @see #setModality(Coding)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudySeries_Modality()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='modality' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getModality();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudySeries#getModality <em>Modality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modality</em>' containment reference.
	 * @see #getModality()
	 * @generated
	 */
	void setModality(Coding value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the series.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudySeries_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudySeries#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Number Of Instances</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of SOP Instances in the Study. The value given may be larger than the number of instance elements this resource contains due to resource availability, security, or other factors. This element should be present if any instance elements are present.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Instances</em>' containment reference.
	 * @see #setNumberOfInstances(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudySeries_NumberOfInstances()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='numberOfInstances' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getNumberOfInstances();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudySeries#getNumberOfInstances <em>Number Of Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Instances</em>' containment reference.
	 * @see #getNumberOfInstances()
	 * @generated
	 */
	void setNumberOfInstances(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The network service providing access (e.g., query, view, or retrieval) for this series. See implementation notes for information about using DICOM endpoints. A series-level endpoint, if present, has precedence over a study-level endpoint with the same Endpoint.connectionType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endpoint</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingStudySeries_Endpoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endpoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getEndpoint();

	/**
	 * Returns the value of the '<em><b>Body Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The anatomic structures examined. See DICOM Part 16 Annex L (http://dicom.nema.org/medical/dicom/current/output/chtml/part16/chapter_L.html) for DICOM to SNOMED-CT mappings. The bodySite may indicate the laterality of body part imaged; if so, it shall be consistent with any content of ImagingStudy.series.laterality.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Site</em>' containment reference.
	 * @see #setBodySite(Coding)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudySeries_BodySite()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bodySite' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getBodySite();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudySeries#getBodySite <em>Body Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Site</em>' containment reference.
	 * @see #getBodySite()
	 * @generated
	 */
	void setBodySite(Coding value);

	/**
	 * Returns the value of the '<em><b>Laterality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The laterality of the (possibly paired) anatomic structures examined. E.g., the left knee, both lungs, or unpaired abdomen. If present, shall be consistent with any laterality information indicated in ImagingStudy.series.bodySite.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Laterality</em>' containment reference.
	 * @see #setLaterality(Coding)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudySeries_Laterality()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='laterality' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getLaterality();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudySeries#getLaterality <em>Laterality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Laterality</em>' containment reference.
	 * @see #getLaterality()
	 * @generated
	 */
	void setLaterality(Coding value);

	/**
	 * Returns the value of the '<em><b>Specimen</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specimen imaged, e.g., for whole slide imaging of a biopsy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specimen</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingStudySeries_Specimen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specimen' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSpecimen();

	/**
	 * Returns the value of the '<em><b>Started</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date and time the series was started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Started</em>' containment reference.
	 * @see #setStarted(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudySeries_Started()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='started' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getStarted();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudySeries#getStarted <em>Started</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Started</em>' containment reference.
	 * @see #getStarted()
	 * @generated
	 */
	void setStarted(DateTime value);

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ImagingStudyPerformer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates who or what performed the series and how they were involved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingStudySeries_Performer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImagingStudyPerformer> getPerformer();

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ImagingStudyInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A single SOP instance within the series, e.g. an image, or presentation state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingStudySeries_Instance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImagingStudyInstance> getInstance();

} // ImagingStudySeries
