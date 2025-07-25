/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Media</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A photo, video, or audio recording acquired or used in healthcare. The actual content may be inline or provided by direct reference.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Media#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Media#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.Media#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link org.hl7.fhir.Media#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Media#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Media#getModality <em>Modality</em>}</li>
 *   <li>{@link org.hl7.fhir.Media#getView <em>View</em>}</li>
 *   <li>{@link org.hl7.fhir.Media#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.Media#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.Media#getCreatedDateTime <em>Created Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.Media#getCreatedPeriod <em>Created Period</em>}</li>
 *   <li>{@link org.hl7.fhir.Media#getIssued <em>Issued</em>}</li>
 *   <li>{@link org.hl7.fhir.Media#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.hl7.fhir.Media#getReasonCode <em>Reason Code</em>}</li>
 *   <li>{@link org.hl7.fhir.Media#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.fhir.Media#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link org.hl7.fhir.Media#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.fhir.Media#getHeight <em>Height</em>}</li>
 *   <li>{@link org.hl7.fhir.Media#getWidth <em>Width</em>}</li>
 *   <li>{@link org.hl7.fhir.Media#getFrames <em>Frames</em>}</li>
 *   <li>{@link org.hl7.fhir.Media#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.Media#getContent <em>Content</em>}</li>
 *   <li>{@link org.hl7.fhir.Media#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedia()
 * @model extendedMetaData="name='Media' kind='elementOnly'"
 * @generated
 */
public interface Media extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifiers associated with the image - these may include identifiers for the image itself, identifiers for the context of its collection (e.g. series ids) and context ids such as accession numbers or other workflow identifiers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedia_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Based On</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A procedure that is fulfilled in whole or in part by the creation of this media.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Based On</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedia_BasedOn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='basedOn' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getBasedOn();

	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A larger event of which this particular event is a component or step.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part Of</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedia_PartOf()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='partOf' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getPartOf();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current state of the {{title}}.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(EventStatus)
	 * @see org.hl7.fhir.FhirPackage#getMedia_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	EventStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Media#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(EventStatus value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code that classifies whether the media is an image, video or audio recording or some other media category.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedia_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Media#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Modality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Details of the type of the media - usually, how it was acquired (what type of device). If images sourced from a DICOM system, are wrapped in a Media resource, then this is the modality.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modality</em>' containment reference.
	 * @see #setModality(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedia_Modality()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modality' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getModality();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Media#getModality <em>Modality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modality</em>' containment reference.
	 * @see #getModality()
	 * @generated
	 */
	void setModality(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the imaging view e.g. Lateral or Antero-posterior (AP).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>View</em>' containment reference.
	 * @see #setView(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedia_View()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='view' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getView();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Media#getView <em>View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View</em>' containment reference.
	 * @see #getView()
	 * @generated
	 */
	void setView(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Who/What this Media is a record of.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedia_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Media#getSubject <em>Subject</em>}' containment reference.
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
	 * The encounter that establishes the context for this media.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedia_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Media#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Created Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date and time(s) at which the media was collected. (choose any one of created*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Created Date Time</em>' containment reference.
	 * @see #setCreatedDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getMedia_CreatedDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='createdDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getCreatedDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Media#getCreatedDateTime <em>Created Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Date Time</em>' containment reference.
	 * @see #getCreatedDateTime()
	 * @generated
	 */
	void setCreatedDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Created Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date and time(s) at which the media was collected. (choose any one of created*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Created Period</em>' containment reference.
	 * @see #setCreatedPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getMedia_CreatedPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='createdPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getCreatedPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Media#getCreatedPeriod <em>Created Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Period</em>' containment reference.
	 * @see #getCreatedPeriod()
	 * @generated
	 */
	void setCreatedPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date and time this version of the media was made available to providers, typically after having been reviewed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issued</em>' containment reference.
	 * @see #setIssued(Instant)
	 * @see org.hl7.fhir.FhirPackage#getMedia_Issued()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='issued' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getIssued();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Media#getIssued <em>Issued</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issued</em>' containment reference.
	 * @see #getIssued()
	 * @generated
	 */
	void setIssued(Instant value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person who administered the collection of the image.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operator</em>' containment reference.
	 * @see #setOperator(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedia_Operator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='operator' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOperator();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Media#getOperator <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' containment reference.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Reference value);

	/**
	 * Returns the value of the '<em><b>Reason Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes why the event occurred in coded or textual form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason Code</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedia_ReasonCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reasonCode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getReasonCode();

	/**
	 * Returns the value of the '<em><b>Body Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the site on the subject's body where the observation was made (i.e. the target site).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Site</em>' containment reference.
	 * @see #setBodySite(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedia_BodySite()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bodySite' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getBodySite();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Media#getBodySite <em>Body Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Site</em>' containment reference.
	 * @see #getBodySite()
	 * @generated
	 */
	void setBodySite(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Device Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the device / manufacturer of the device  that was used to make the recording.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Name</em>' containment reference.
	 * @see #setDeviceName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMedia_DeviceName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deviceName' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDeviceName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Media#getDeviceName <em>Device Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Name</em>' containment reference.
	 * @see #getDeviceName()
	 * @generated
	 */
	void setDeviceName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The device used to collect the media.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device</em>' containment reference.
	 * @see #setDevice(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedia_Device()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='device' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getDevice();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Media#getDevice <em>Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' containment reference.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(Reference value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Height of the image in pixels (photo/video).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Height</em>' containment reference.
	 * @see #setHeight(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getMedia_Height()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='height' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getHeight();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Media#getHeight <em>Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' containment reference.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Width of the image in pixels (photo/video).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Width</em>' containment reference.
	 * @see #setWidth(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getMedia_Width()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='width' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getWidth();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Media#getWidth <em>Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' containment reference.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Frames</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of frames in a photo. This is used with a multi-page fax, or an imaging acquisition context that takes multiple slices in a single image, or an animated gif. If there is more than one frame, this SHALL have a value in order to alert interface software that a multi-frame capable rendering widget is required.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frames</em>' containment reference.
	 * @see #setFrames(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getMedia_Frames()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='frames' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getFrames();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Media#getFrames <em>Frames</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frames</em>' containment reference.
	 * @see #getFrames()
	 * @generated
	 */
	void setFrames(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The duration of the recording in seconds - for audio and video.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration</em>' containment reference.
	 * @see #setDuration(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getMedia_Duration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='duration' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getDuration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Media#getDuration <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' containment reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Decimal value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual content of the media - inline or by direct reference to the media source file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(Attachment)
	 * @see org.hl7.fhir.FhirPackage#getMedia_Content()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='content' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getContent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Media#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(Attachment value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Comments made about the media by the performer, subject or other participants.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedia_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

} // Media
