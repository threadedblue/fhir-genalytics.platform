/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ContractAction#getDoNotPerform <em>Do Not Perform</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAction#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAction#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAction#getIntent <em>Intent</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAction#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAction#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAction#getContext <em>Context</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAction#getContextLinkId <em>Context Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAction#getOccurrenceDateTime <em>Occurrence Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAction#getOccurrencePeriod <em>Occurrence Period</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAction#getOccurrenceTiming <em>Occurrence Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAction#getRequester <em>Requester</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAction#getRequesterLinkId <em>Requester Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAction#getPerformerType <em>Performer Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAction#getPerformerRole <em>Performer Role</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAction#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAction#getPerformerLinkId <em>Performer Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAction#getReasonCode <em>Reason Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAction#getReasonReference <em>Reason Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAction#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAction#getReasonLinkId <em>Reason Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAction#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAction#getSecurityLabelNumber <em>Security Label Number</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getContractAction()
 * @model extendedMetaData="name='Contract.Action' kind='elementOnly'"
 * @generated
 */
public interface ContractAction extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Do Not Perform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if the term prohibits the  action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Do Not Perform</em>' containment reference.
	 * @see #setDoNotPerform(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getContractAction_DoNotPerform()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='doNotPerform' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getDoNotPerform();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractAction#getDoNotPerform <em>Do Not Perform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do Not Perform</em>' containment reference.
	 * @see #getDoNotPerform()
	 * @generated
	 */
	void setDoNotPerform(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Activity or service obligation to be done or not done, performed or not performed, effectuated or not by this Contract term.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getContractAction_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractAction#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContractSubject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Entity of the action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContractAction_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContractSubject> getSubject();

	/**
	 * Returns the value of the '<em><b>Intent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reason or purpose for the action stipulated by this Contract Provision.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intent</em>' containment reference.
	 * @see #setIntent(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getContractAction_Intent()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='intent' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getIntent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractAction#getIntent <em>Intent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intent</em>' containment reference.
	 * @see #getIntent()
	 * @generated
	 */
	void setIntent(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Link Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id [identifier??] of the clause or question text related to this action in the referenced form or QuestionnaireResponse.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link Id</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContractAction_LinkId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='linkId' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getLinkId();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Current state of the term action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getContractAction_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractAction#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Encounter or Episode with primary association to specified term activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(Reference)
	 * @see org.hl7.fhir.FhirPackage#getContractAction_Context()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='context' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getContext();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractAction#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Reference value);

	/**
	 * Returns the value of the '<em><b>Context Link Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id [identifier??] of the clause or question text related to the requester of this action in the referenced form or QuestionnaireResponse.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context Link Id</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContractAction_ContextLinkId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contextLinkId' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getContextLinkId();

	/**
	 * Returns the value of the '<em><b>Occurrence Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When action happens. (choose any one of occurrence*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occurrence Date Time</em>' containment reference.
	 * @see #setOccurrenceDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getContractAction_OccurrenceDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='occurrenceDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getOccurrenceDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractAction#getOccurrenceDateTime <em>Occurrence Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence Date Time</em>' containment reference.
	 * @see #getOccurrenceDateTime()
	 * @generated
	 */
	void setOccurrenceDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Occurrence Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When action happens. (choose any one of occurrence*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occurrence Period</em>' containment reference.
	 * @see #setOccurrencePeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getContractAction_OccurrencePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='occurrencePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getOccurrencePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractAction#getOccurrencePeriod <em>Occurrence Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence Period</em>' containment reference.
	 * @see #getOccurrencePeriod()
	 * @generated
	 */
	void setOccurrencePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Occurrence Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When action happens. (choose any one of occurrence*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occurrence Timing</em>' containment reference.
	 * @see #setOccurrenceTiming(Timing)
	 * @see org.hl7.fhir.FhirPackage#getContractAction_OccurrenceTiming()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='occurrenceTiming' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getOccurrenceTiming();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractAction#getOccurrenceTiming <em>Occurrence Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence Timing</em>' containment reference.
	 * @see #getOccurrenceTiming()
	 * @generated
	 */
	void setOccurrenceTiming(Timing value);

	/**
	 * Returns the value of the '<em><b>Requester</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Who or what initiated the action and has responsibility for its activation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requester</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContractAction_Requester()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requester' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getRequester();

	/**
	 * Returns the value of the '<em><b>Requester Link Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id [identifier??] of the clause or question text related to the requester of this action in the referenced form or QuestionnaireResponse.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requester Link Id</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContractAction_RequesterLinkId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requesterLinkId' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getRequesterLinkId();

	/**
	 * Returns the value of the '<em><b>Performer Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of individual that is desired or required to perform or not perform the action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performer Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContractAction_PerformerType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performerType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getPerformerType();

	/**
	 * Returns the value of the '<em><b>Performer Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of role or competency of an individual desired or required to perform or not perform the action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performer Role</em>' containment reference.
	 * @see #setPerformerRole(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getContractAction_PerformerRole()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performerRole' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getPerformerRole();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractAction#getPerformerRole <em>Performer Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performer Role</em>' containment reference.
	 * @see #getPerformerRole()
	 * @generated
	 */
	void setPerformerRole(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates who or what is being asked to perform (or not perform) the ction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference.
	 * @see #setPerformer(Reference)
	 * @see org.hl7.fhir.FhirPackage#getContractAction_Performer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performer' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPerformer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractAction#getPerformer <em>Performer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performer</em>' containment reference.
	 * @see #getPerformer()
	 * @generated
	 */
	void setPerformer(Reference value);

	/**
	 * Returns the value of the '<em><b>Performer Link Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id [identifier??] of the clause or question text related to the reason type or reference of this  action in the referenced form or QuestionnaireResponse.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performer Link Id</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContractAction_PerformerLinkId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performerLinkId' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getPerformerLinkId();

	/**
	 * Returns the value of the '<em><b>Reason Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rationale for the action to be performed or not performed. Describes why the action is permitted or prohibited.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason Code</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContractAction_ReasonCode()
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
	 * Indicates another resource whose existence justifies permitting or not permitting this action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason Reference</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContractAction_ReasonReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reasonReference' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getReasonReference();

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes why the action is to be performed or not performed in textual form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContractAction_Reason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getReason();

	/**
	 * Returns the value of the '<em><b>Reason Link Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id [identifier??] of the clause or question text related to the reason type or reference of this  action in the referenced form or QuestionnaireResponse.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason Link Id</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContractAction_ReasonLinkId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reasonLinkId' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getReasonLinkId();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Comments made about the term action made by the requester, performer, subject or other participants.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContractAction_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

	/**
	 * Returns the value of the '<em><b>Security Label Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.UnsignedInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Security labels that protects the action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security Label Number</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContractAction_SecurityLabelNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='securityLabelNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UnsignedInt> getSecurityLabelNumber();

} // ContractAction
