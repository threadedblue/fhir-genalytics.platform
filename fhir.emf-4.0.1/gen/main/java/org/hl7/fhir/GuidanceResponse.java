/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guidance Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A guidance response is the formal response to a guidance request, including any output parameters returned by the evaluation, as well as the description of any proposed actions to be taken.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.GuidanceResponse#getRequestIdentifier <em>Request Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.GuidanceResponse#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.GuidanceResponse#getModuleUri <em>Module Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.GuidanceResponse#getModuleCanonical <em>Module Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.GuidanceResponse#getModuleCodeableConcept <em>Module Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.GuidanceResponse#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.GuidanceResponse#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.GuidanceResponse#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.GuidanceResponse#getOccurrenceDateTime <em>Occurrence Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.GuidanceResponse#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.GuidanceResponse#getReasonCode <em>Reason Code</em>}</li>
 *   <li>{@link org.hl7.fhir.GuidanceResponse#getReasonReference <em>Reason Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.GuidanceResponse#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.GuidanceResponse#getEvaluationMessage <em>Evaluation Message</em>}</li>
 *   <li>{@link org.hl7.fhir.GuidanceResponse#getOutputParameters <em>Output Parameters</em>}</li>
 *   <li>{@link org.hl7.fhir.GuidanceResponse#getResult <em>Result</em>}</li>
 *   <li>{@link org.hl7.fhir.GuidanceResponse#getDataRequirement <em>Data Requirement</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getGuidanceResponse()
 * @model extendedMetaData="name='GuidanceResponse' kind='elementOnly'"
 * @generated
 */
public interface GuidanceResponse extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Request Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifier of the request associated with this response. If an identifier was given as part of the request, it will be reproduced here to enable the requester to more easily identify the response in a multi-request scenario.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request Identifier</em>' containment reference.
	 * @see #setRequestIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponse_RequestIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requestIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getRequestIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GuidanceResponse#getRequestIdentifier <em>Request Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Identifier</em>' containment reference.
	 * @see #getRequestIdentifier()
	 * @generated
	 */
	void setRequestIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allows a service to provide  unique, business identifiers for the response.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponse_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Module Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier, CodeableConcept or canonical reference to the guidance that was requested. (choose any one of module*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Module Uri</em>' containment reference.
	 * @see #setModuleUri(Uri)
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponse_ModuleUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='moduleUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getModuleUri();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GuidanceResponse#getModuleUri <em>Module Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Uri</em>' containment reference.
	 * @see #getModuleUri()
	 * @generated
	 */
	void setModuleUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Module Canonical</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier, CodeableConcept or canonical reference to the guidance that was requested. (choose any one of module*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Module Canonical</em>' containment reference.
	 * @see #setModuleCanonical(Canonical)
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponse_ModuleCanonical()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='moduleCanonical' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getModuleCanonical();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GuidanceResponse#getModuleCanonical <em>Module Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Canonical</em>' containment reference.
	 * @see #getModuleCanonical()
	 * @generated
	 */
	void setModuleCanonical(Canonical value);

	/**
	 * Returns the value of the '<em><b>Module Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier, CodeableConcept or canonical reference to the guidance that was requested. (choose any one of module*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Module Codeable Concept</em>' containment reference.
	 * @see #setModuleCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponse_ModuleCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='moduleCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getModuleCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GuidanceResponse#getModuleCodeableConcept <em>Module Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Codeable Concept</em>' containment reference.
	 * @see #getModuleCodeableConcept()
	 * @generated
	 */
	void setModuleCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of the response. If the evaluation is completed successfully, the status will indicate success. However, in order to complete the evaluation, the engine may require more information. In this case, the status will be data-required, and the response will contain a description of the additional required information. If the evaluation completed successfully, but the engine determines that a potentially more accurate response could be provided if more data was available, the status will be data-requested, and the response will contain a description of the additional requested information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(GuidanceResponseStatus)
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponse_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	GuidanceResponseStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GuidanceResponse#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(GuidanceResponseStatus value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The patient for which the request was processed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponse_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GuidanceResponse#getSubject <em>Subject</em>}' containment reference.
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
	 * The encounter during which this response was created or to which the creation of this record is tightly associated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponse_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GuidanceResponse#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Occurrence Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates when the guidance response was processed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occurrence Date Time</em>' containment reference.
	 * @see #setOccurrenceDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponse_OccurrenceDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='occurrenceDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getOccurrenceDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GuidanceResponse#getOccurrenceDateTime <em>Occurrence Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence Date Time</em>' containment reference.
	 * @see #getOccurrenceDateTime()
	 * @generated
	 */
	void setOccurrenceDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides a reference to the device that performed the guidance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference.
	 * @see #setPerformer(Reference)
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponse_Performer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performer' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPerformer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GuidanceResponse#getPerformer <em>Performer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performer</em>' containment reference.
	 * @see #getPerformer()
	 * @generated
	 */
	void setPerformer(Reference value);

	/**
	 * Returns the value of the '<em><b>Reason Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the reason for the guidance response in coded or textual form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason Code</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponse_ReasonCode()
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
	 * Indicates the reason the request was initiated. This is typically provided as a parameter to the evaluation and echoed by the service, although for some use cases, such as subscription- or event-based scenarios, it may provide an indication of the cause for the response.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason Reference</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponse_ReasonReference()
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
	 * Provides a mechanism to communicate additional information about the response.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponse_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

	/**
	 * Returns the value of the '<em><b>Evaluation Message</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Messages resulting from the evaluation of the artifact or artifacts. As part of evaluating the request, the engine may produce informational or warning messages. These messages will be provided by this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Evaluation Message</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponse_EvaluationMessage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='evaluationMessage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getEvaluationMessage();

	/**
	 * Returns the value of the '<em><b>Output Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The output parameters of the evaluation, if any. Many modules will result in the return of specific resources such as procedure or communication requests that are returned as part of the operation result. However, modules may define specific outputs that would be returned as the result of the evaluation, and these would be returned in this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Parameters</em>' containment reference.
	 * @see #setOutputParameters(Reference)
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponse_OutputParameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outputParameters' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOutputParameters();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GuidanceResponse#getOutputParameters <em>Output Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Parameters</em>' containment reference.
	 * @see #getOutputParameters()
	 * @generated
	 */
	void setOutputParameters(Reference value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actions, if any, produced by the evaluation of the artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(Reference)
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponse_Result()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='result' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getResult();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GuidanceResponse#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(Reference value);

	/**
	 * Returns the value of the '<em><b>Data Requirement</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DataRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the evaluation could not be completed due to lack of information, or additional information would potentially result in a more accurate response, this element will a description of the data required in order to proceed with the evaluation. A subsequent request to the service should include this data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Requirement</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGuidanceResponse_DataRequirement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dataRequirement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DataRequirement> getDataRequirement();

} // GuidanceResponse
