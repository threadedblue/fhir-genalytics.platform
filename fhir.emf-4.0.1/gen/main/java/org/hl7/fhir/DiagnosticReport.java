/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagnostic Report</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The findings and interpretation of diagnostic  tests performed on patients, groups of patients, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting and provider information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation of diagnostic reports.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.DiagnosticReport#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.DiagnosticReport#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.DiagnosticReport#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.DiagnosticReport#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.DiagnosticReport#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.DiagnosticReport#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.DiagnosticReport#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.DiagnosticReport#getEffectiveDateTime <em>Effective Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.DiagnosticReport#getEffectivePeriod <em>Effective Period</em>}</li>
 *   <li>{@link org.hl7.fhir.DiagnosticReport#getIssued <em>Issued</em>}</li>
 *   <li>{@link org.hl7.fhir.DiagnosticReport#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.DiagnosticReport#getResultsInterpreter <em>Results Interpreter</em>}</li>
 *   <li>{@link org.hl7.fhir.DiagnosticReport#getSpecimen <em>Specimen</em>}</li>
 *   <li>{@link org.hl7.fhir.DiagnosticReport#getResult <em>Result</em>}</li>
 *   <li>{@link org.hl7.fhir.DiagnosticReport#getImagingStudy <em>Imaging Study</em>}</li>
 *   <li>{@link org.hl7.fhir.DiagnosticReport#getMedia <em>Media</em>}</li>
 *   <li>{@link org.hl7.fhir.DiagnosticReport#getConclusion <em>Conclusion</em>}</li>
 *   <li>{@link org.hl7.fhir.DiagnosticReport#getConclusionCode <em>Conclusion Code</em>}</li>
 *   <li>{@link org.hl7.fhir.DiagnosticReport#getPresentedForm <em>Presented Form</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDiagnosticReport()
 * @model extendedMetaData="name='DiagnosticReport' kind='elementOnly'"
 * @generated
 */
public interface DiagnosticReport extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifiers assigned to this report by the performer or other systems.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticReport_Identifier()
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
	 * Details concerning a service requested.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Based On</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticReport_BasedOn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='basedOn' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getBasedOn();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of the diagnostic report.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(DiagnosticReportStatus)
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticReport_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	DiagnosticReportStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DiagnosticReport#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(DiagnosticReportStatus value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code that classifies the clinical discipline, department or diagnostic service that created the report (e.g. cardiology, biochemistry, hematology, MRI). This is used for searching, sorting and display purposes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticReport_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCategory();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code or name that describes this diagnostic report.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticReport_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DiagnosticReport#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The subject of the report. Usually, but not always, this is a patient. However, diagnostic services also perform analyses on specimens collected from a variety of other sources.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticReport_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DiagnosticReport#getSubject <em>Subject</em>}' containment reference.
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
	 * The healthcare event  (e.g. a patient and healthcare provider interaction) which this DiagnosticReport is about.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticReport_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DiagnosticReport#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Effective Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time or time-period the observed values are related to. When the subject of the report is a patient, this is usually either the time of the procedure or of specimen collection(s), but very often the source of the date/time is not known, only the date/time itself. (choose any one of effective*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Effective Date Time</em>' containment reference.
	 * @see #setEffectiveDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticReport_EffectiveDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='effectiveDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getEffectiveDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DiagnosticReport#getEffectiveDateTime <em>Effective Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Date Time</em>' containment reference.
	 * @see #getEffectiveDateTime()
	 * @generated
	 */
	void setEffectiveDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Effective Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time or time-period the observed values are related to. When the subject of the report is a patient, this is usually either the time of the procedure or of specimen collection(s), but very often the source of the date/time is not known, only the date/time itself. (choose any one of effective*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Effective Period</em>' containment reference.
	 * @see #setEffectivePeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticReport_EffectivePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='effectivePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getEffectivePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DiagnosticReport#getEffectivePeriod <em>Effective Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Period</em>' containment reference.
	 * @see #getEffectivePeriod()
	 * @generated
	 */
	void setEffectivePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date and time that this version of the report was made available to providers, typically after the report was reviewed and verified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issued</em>' containment reference.
	 * @see #setIssued(Instant)
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticReport_Issued()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='issued' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getIssued();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DiagnosticReport#getIssued <em>Issued</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issued</em>' containment reference.
	 * @see #getIssued()
	 * @generated
	 */
	void setIssued(Instant value);

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The diagnostic service that is responsible for issuing the report.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticReport_Performer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getPerformer();

	/**
	 * Returns the value of the '<em><b>Results Interpreter</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The practitioner or organization that is responsible for the report's conclusions and interpretations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Results Interpreter</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticReport_ResultsInterpreter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resultsInterpreter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getResultsInterpreter();

	/**
	 * Returns the value of the '<em><b>Specimen</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Details about the specimens on which this diagnostic report is based.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specimen</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticReport_Specimen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specimen' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSpecimen();

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [Observations](observation.html)  that are part of this diagnostic report.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticReport_Result()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='result' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getResult();

	/**
	 * Returns the value of the '<em><b>Imaging Study</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One or more links to full details of any imaging performed during the diagnostic investigation. Typically, this is imaging performed by DICOM enabled modalities, but this is not required. A fully enabled PACS viewer can use this information to provide views of the source images.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imaging Study</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticReport_ImagingStudy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='imagingStudy' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getImagingStudy();

	/**
	 * Returns the value of the '<em><b>Media</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DiagnosticReportMedia}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of key images associated with this report. The images are generally created during the diagnostic process, and may be directly of the patient, or of treated specimens (i.e. slides of interest).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Media</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticReport_Media()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='media' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DiagnosticReportMedia> getMedia();

	/**
	 * Returns the value of the '<em><b>Conclusion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Concise and clinically contextualized summary conclusion (interpretation/impression) of the diagnostic report.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conclusion</em>' containment reference.
	 * @see #setConclusion(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticReport_Conclusion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='conclusion' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getConclusion();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DiagnosticReport#getConclusion <em>Conclusion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conclusion</em>' containment reference.
	 * @see #getConclusion()
	 * @generated
	 */
	void setConclusion(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Conclusion Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One or more codes that represent the summary conclusion (interpretation/impression) of the diagnostic report.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conclusion Code</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticReport_ConclusionCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='conclusionCode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getConclusionCode();

	/**
	 * Returns the value of the '<em><b>Presented Form</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Attachment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rich text representation of the entire result as issued by the diagnostic service. Multiple formats are allowed but they SHALL be semantically equivalent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Presented Form</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticReport_PresentedForm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='presentedForm' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Attachment> getPresentedForm();

} // DiagnosticReport
