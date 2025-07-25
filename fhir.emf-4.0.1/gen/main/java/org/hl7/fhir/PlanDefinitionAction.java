/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan Definition Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.PlanDefinitionAction#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionAction#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionAction#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionAction#getTextEquivalent <em>Text Equivalent</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionAction#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionAction#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionAction#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionAction#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionAction#getGoalId <em>Goal Id</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionAction#getSubjectCodeableConcept <em>Subject Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionAction#getSubjectReference <em>Subject Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionAction#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionAction#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionAction#getInput <em>Input</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionAction#getOutput <em>Output</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionAction#getRelatedAction <em>Related Action</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionAction#getTimingDateTime <em>Timing Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionAction#getTimingAge <em>Timing Age</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionAction#getTimingPeriod <em>Timing Period</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionAction#getTimingDuration <em>Timing Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionAction#getTimingRange <em>Timing Range</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionAction#getTimingTiming <em>Timing Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionAction#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionAction#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionAction#getGroupingBehavior <em>Grouping Behavior</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionAction#getSelectionBehavior <em>Selection Behavior</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionAction#getRequiredBehavior <em>Required Behavior</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionAction#getPrecheckBehavior <em>Precheck Behavior</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionAction#getCardinalityBehavior <em>Cardinality Behavior</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionAction#getDefinitionCanonical <em>Definition Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionAction#getDefinitionUri <em>Definition Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionAction#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionAction#getDynamicValue <em>Dynamic Value</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionAction#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionAction()
 * @model extendedMetaData="name='PlanDefinition.Action' kind='elementOnly'"
 * @generated
 */
public interface PlanDefinitionAction extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A user-visible prefix for the action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prefix</em>' containment reference.
	 * @see #setPrefix(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionAction_Prefix()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='prefix' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPrefix();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionAction#getPrefix <em>Prefix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' containment reference.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The title of the action displayed to a user.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionAction_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getTitle();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionAction#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A brief description of the action used to provide a summary to display to the user.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionAction_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionAction#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Text Equivalent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A text equivalent of the action to be performed. This provides a human-interpretable description of the action when the definition is consumed by a system that might not be capable of interpreting it dynamically.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text Equivalent</em>' containment reference.
	 * @see #setTextEquivalent(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionAction_TextEquivalent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='textEquivalent' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getTextEquivalent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionAction#getTextEquivalent <em>Text Equivalent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Equivalent</em>' containment reference.
	 * @see #getTextEquivalent()
	 * @generated
	 */
	void setTextEquivalent(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how quickly the action should be addressed with respect to other actions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' containment reference.
	 * @see #setPriority(RequestPriority)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionAction_Priority()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='priority' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestPriority getPriority();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionAction#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(RequestPriority value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code that provides meaning for the action or action group. For example, a section may have a LOINC code for the section of a documentation template.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionAction_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCode();

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of why this action is necessary or appropriate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionAction_Reason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getReason();

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.RelatedArtifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Didactic or other informational resources associated with the action that can be provided to the CDS recipient. Information resources can include inline text commentary and links to web resources.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionAction_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RelatedArtifact> getDocumentation();

	/**
	 * Returns the value of the '<em><b>Goal Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Id}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies goals that this action supports. The reference must be to a goal element defined within this plan definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Goal Id</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionAction_GoalId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='goalId' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Id> getGoalId();

	/**
	 * Returns the value of the '<em><b>Subject Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code or group definition that describes the intended subject of the action and its children, if any. (choose any one of subject*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject Codeable Concept</em>' containment reference.
	 * @see #setSubjectCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionAction_SubjectCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subjectCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSubjectCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionAction#getSubjectCodeableConcept <em>Subject Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject Codeable Concept</em>' containment reference.
	 * @see #getSubjectCodeableConcept()
	 * @generated
	 */
	void setSubjectCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Subject Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code or group definition that describes the intended subject of the action and its children, if any. (choose any one of subject*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject Reference</em>' containment reference.
	 * @see #setSubjectReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionAction_SubjectReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subjectReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubjectReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionAction#getSubjectReference <em>Subject Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject Reference</em>' containment reference.
	 * @see #getSubjectReference()
	 * @generated
	 */
	void setSubjectReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.TriggerDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of when the action should be triggered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionAction_Trigger()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='trigger' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TriggerDefinition> getTrigger();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PlanDefinitionCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An expression that describes applicability criteria or start/stop conditions for the action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionAction_Condition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='condition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PlanDefinitionCondition> getCondition();

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DataRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines input data requirements for the action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionAction_Input()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='input' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DataRequirement> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DataRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the outputs of the action, if any.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionAction_Output()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='output' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DataRequirement> getOutput();

	/**
	 * Returns the value of the '<em><b>Related Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PlanDefinitionRelatedAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A relationship to another action such as "before" or "30-60 minutes after start of".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Action</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionAction_RelatedAction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relatedAction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PlanDefinitionRelatedAction> getRelatedAction();

	/**
	 * Returns the value of the '<em><b>Timing Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional value describing when the action should be performed. (choose any one of timing*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timing Date Time</em>' containment reference.
	 * @see #setTimingDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionAction_TimingDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timingDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getTimingDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionAction#getTimingDateTime <em>Timing Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing Date Time</em>' containment reference.
	 * @see #getTimingDateTime()
	 * @generated
	 */
	void setTimingDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Timing Age</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional value describing when the action should be performed. (choose any one of timing*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timing Age</em>' containment reference.
	 * @see #setTimingAge(Age)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionAction_TimingAge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timingAge' namespace='##targetNamespace'"
	 * @generated
	 */
	Age getTimingAge();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionAction#getTimingAge <em>Timing Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing Age</em>' containment reference.
	 * @see #getTimingAge()
	 * @generated
	 */
	void setTimingAge(Age value);

	/**
	 * Returns the value of the '<em><b>Timing Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional value describing when the action should be performed. (choose any one of timing*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timing Period</em>' containment reference.
	 * @see #setTimingPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionAction_TimingPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timingPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getTimingPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionAction#getTimingPeriod <em>Timing Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing Period</em>' containment reference.
	 * @see #getTimingPeriod()
	 * @generated
	 */
	void setTimingPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Timing Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional value describing when the action should be performed. (choose any one of timing*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timing Duration</em>' containment reference.
	 * @see #setTimingDuration(Duration)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionAction_TimingDuration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timingDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getTimingDuration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionAction#getTimingDuration <em>Timing Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing Duration</em>' containment reference.
	 * @see #getTimingDuration()
	 * @generated
	 */
	void setTimingDuration(Duration value);

	/**
	 * Returns the value of the '<em><b>Timing Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional value describing when the action should be performed. (choose any one of timing*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timing Range</em>' containment reference.
	 * @see #setTimingRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionAction_TimingRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timingRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getTimingRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionAction#getTimingRange <em>Timing Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing Range</em>' containment reference.
	 * @see #getTimingRange()
	 * @generated
	 */
	void setTimingRange(Range value);

	/**
	 * Returns the value of the '<em><b>Timing Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional value describing when the action should be performed. (choose any one of timing*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timing Timing</em>' containment reference.
	 * @see #setTimingTiming(Timing)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionAction_TimingTiming()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timingTiming' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getTimingTiming();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionAction#getTimingTiming <em>Timing Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing Timing</em>' containment reference.
	 * @see #getTimingTiming()
	 * @generated
	 */
	void setTimingTiming(Timing value);

	/**
	 * Returns the value of the '<em><b>Participant</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PlanDefinitionParticipant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates who should participate in performing the action described.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participant</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionAction_Participant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='participant' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PlanDefinitionParticipant> getParticipant();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of action to perform (create, update, remove).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionAction_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionAction#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Grouping Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the grouping behavior for the action and its children.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Grouping Behavior</em>' containment reference.
	 * @see #setGroupingBehavior(ActionGroupingBehavior)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionAction_GroupingBehavior()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='groupingBehavior' namespace='##targetNamespace'"
	 * @generated
	 */
	ActionGroupingBehavior getGroupingBehavior();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionAction#getGroupingBehavior <em>Grouping Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grouping Behavior</em>' containment reference.
	 * @see #getGroupingBehavior()
	 * @generated
	 */
	void setGroupingBehavior(ActionGroupingBehavior value);

	/**
	 * Returns the value of the '<em><b>Selection Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the selection behavior for the action and its children.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selection Behavior</em>' containment reference.
	 * @see #setSelectionBehavior(ActionSelectionBehavior)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionAction_SelectionBehavior()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='selectionBehavior' namespace='##targetNamespace'"
	 * @generated
	 */
	ActionSelectionBehavior getSelectionBehavior();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionAction#getSelectionBehavior <em>Selection Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection Behavior</em>' containment reference.
	 * @see #getSelectionBehavior()
	 * @generated
	 */
	void setSelectionBehavior(ActionSelectionBehavior value);

	/**
	 * Returns the value of the '<em><b>Required Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the required behavior for the action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Behavior</em>' containment reference.
	 * @see #setRequiredBehavior(ActionRequiredBehavior)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionAction_RequiredBehavior()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requiredBehavior' namespace='##targetNamespace'"
	 * @generated
	 */
	ActionRequiredBehavior getRequiredBehavior();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionAction#getRequiredBehavior <em>Required Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Behavior</em>' containment reference.
	 * @see #getRequiredBehavior()
	 * @generated
	 */
	void setRequiredBehavior(ActionRequiredBehavior value);

	/**
	 * Returns the value of the '<em><b>Precheck Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines whether the action should usually be preselected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Precheck Behavior</em>' containment reference.
	 * @see #setPrecheckBehavior(ActionPrecheckBehavior)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionAction_PrecheckBehavior()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='precheckBehavior' namespace='##targetNamespace'"
	 * @generated
	 */
	ActionPrecheckBehavior getPrecheckBehavior();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionAction#getPrecheckBehavior <em>Precheck Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precheck Behavior</em>' containment reference.
	 * @see #getPrecheckBehavior()
	 * @generated
	 */
	void setPrecheckBehavior(ActionPrecheckBehavior value);

	/**
	 * Returns the value of the '<em><b>Cardinality Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines whether the action can be selected multiple times.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cardinality Behavior</em>' containment reference.
	 * @see #setCardinalityBehavior(ActionCardinalityBehavior)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionAction_CardinalityBehavior()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cardinalityBehavior' namespace='##targetNamespace'"
	 * @generated
	 */
	ActionCardinalityBehavior getCardinalityBehavior();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionAction#getCardinalityBehavior <em>Cardinality Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality Behavior</em>' containment reference.
	 * @see #getCardinalityBehavior()
	 * @generated
	 */
	void setCardinalityBehavior(ActionCardinalityBehavior value);

	/**
	 * Returns the value of the '<em><b>Definition Canonical</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to an ActivityDefinition that describes the action to be taken in detail, or a PlanDefinition that describes a series of actions to be taken. (choose any one of definition*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition Canonical</em>' containment reference.
	 * @see #setDefinitionCanonical(Canonical)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionAction_DefinitionCanonical()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definitionCanonical' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getDefinitionCanonical();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionAction#getDefinitionCanonical <em>Definition Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Canonical</em>' containment reference.
	 * @see #getDefinitionCanonical()
	 * @generated
	 */
	void setDefinitionCanonical(Canonical value);

	/**
	 * Returns the value of the '<em><b>Definition Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to an ActivityDefinition that describes the action to be taken in detail, or a PlanDefinition that describes a series of actions to be taken. (choose any one of definition*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition Uri</em>' containment reference.
	 * @see #setDefinitionUri(Uri)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionAction_DefinitionUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definitionUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getDefinitionUri();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionAction#getDefinitionUri <em>Definition Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Uri</em>' containment reference.
	 * @see #getDefinitionUri()
	 * @generated
	 */
	void setDefinitionUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a StructureMap resource that defines a transform that can be executed to produce the intent resource using the ActivityDefinition instance as the input.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transform</em>' containment reference.
	 * @see #setTransform(Canonical)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionAction_Transform()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='transform' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getTransform();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionAction#getTransform <em>Transform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transform</em>' containment reference.
	 * @see #getTransform()
	 * @generated
	 */
	void setTransform(Canonical value);

	/**
	 * Returns the value of the '<em><b>Dynamic Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PlanDefinitionDynamicValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Customizations that should be applied to the statically defined resource. For example, if the dosage of a medication must be computed based on the patient's weight, a customization would be used to specify an expression that calculated the weight, and the path on the resource that would contain the result.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dynamic Value</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionAction_DynamicValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dynamicValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PlanDefinitionDynamicValue> getDynamicValue();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PlanDefinitionAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sub actions that are contained within the action. The behavior of this action determines the functionality of the sub-actions. For example, a selection behavior of at-most-one indicates that of the sub-actions, at most one may be chosen as part of realizing the action definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionAction_Action()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='action' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PlanDefinitionAction> getAction();

} // PlanDefinitionAction
