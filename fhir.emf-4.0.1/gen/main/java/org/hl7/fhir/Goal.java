/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Goal#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Goal#getLifecycleStatus <em>Lifecycle Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Goal#getAchievementStatus <em>Achievement Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Goal#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.Goal#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.fhir.Goal#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.Goal#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.Goal#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.hl7.fhir.Goal#getStartCodeableConcept <em>Start Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.Goal#getTarget <em>Target</em>}</li>
 *   <li>{@link org.hl7.fhir.Goal#getStatusDate <em>Status Date</em>}</li>
 *   <li>{@link org.hl7.fhir.Goal#getStatusReason <em>Status Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.Goal#getExpressedBy <em>Expressed By</em>}</li>
 *   <li>{@link org.hl7.fhir.Goal#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link org.hl7.fhir.Goal#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.Goal#getOutcomeCode <em>Outcome Code</em>}</li>
 *   <li>{@link org.hl7.fhir.Goal#getOutcomeReference <em>Outcome Reference</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getGoal()
 * @model extendedMetaData="name='Goal' kind='elementOnly'"
 * @generated
 */
public interface Goal extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Business identifiers assigned to this goal by the performer or other systems which remain constant as the resource is updated and propagates from server to server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGoal_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Lifecycle Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The state of the goal throughout its lifecycle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lifecycle Status</em>' containment reference.
	 * @see #setLifecycleStatus(GoalLifecycleStatus)
	 * @see org.hl7.fhir.FhirPackage#getGoal_LifecycleStatus()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='lifecycleStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	GoalLifecycleStatus getLifecycleStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Goal#getLifecycleStatus <em>Lifecycle Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lifecycle Status</em>' containment reference.
	 * @see #getLifecycleStatus()
	 * @generated
	 */
	void setLifecycleStatus(GoalLifecycleStatus value);

	/**
	 * Returns the value of the '<em><b>Achievement Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the progression, or lack thereof, towards the goal against the target.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Achievement Status</em>' containment reference.
	 * @see #setAchievementStatus(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getGoal_AchievementStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='achievementStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getAchievementStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Goal#getAchievementStatus <em>Achievement Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Achievement Status</em>' containment reference.
	 * @see #getAchievementStatus()
	 * @generated
	 */
	void setAchievementStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates a category the goal falls within.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGoal_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCategory();

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the mutually agreed level of importance associated with reaching/sustaining the goal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' containment reference.
	 * @see #setPriority(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getGoal_Priority()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='priority' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getPriority();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Goal#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Human-readable and/or coded description of a specific desired objective of care, such as "control blood pressure" or "negotiate an obstacle course" or "dance with child at wedding".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getGoal_Description()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Goal#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the patient, group or organization for whom the goal is being established.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getGoal_Subject()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Goal#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date or event after which the goal should begin being pursued. (choose any one of start*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Date</em>' containment reference.
	 * @see #setStartDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getGoal_StartDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='startDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Goal#getStartDate <em>Start Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' containment reference.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Start Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date or event after which the goal should begin being pursued. (choose any one of start*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Codeable Concept</em>' containment reference.
	 * @see #setStartCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getGoal_StartCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='startCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getStartCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Goal#getStartCodeableConcept <em>Start Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Codeable Concept</em>' containment reference.
	 * @see #getStartCodeableConcept()
	 * @generated
	 */
	void setStartCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.GoalTarget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates what should be done by when.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGoal_Target()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='target' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GoalTarget> getTarget();

	/**
	 * Returns the value of the '<em><b>Status Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies when the current status.  I.e. When initially created, when achieved, when cancelled, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Date</em>' containment reference.
	 * @see #setStatusDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getGoal_StatusDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='statusDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getStatusDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Goal#getStatusDate <em>Status Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Date</em>' containment reference.
	 * @see #getStatusDate()
	 * @generated
	 */
	void setStatusDate(Date value);

	/**
	 * Returns the value of the '<em><b>Status Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Captures the reason for the current status.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Reason</em>' containment reference.
	 * @see #setStatusReason(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getGoal_StatusReason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='statusReason' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getStatusReason();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Goal#getStatusReason <em>Status Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Reason</em>' containment reference.
	 * @see #getStatusReason()
	 * @generated
	 */
	void setStatusReason(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Expressed By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whose goal this is - patient goal, practitioner goal, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expressed By</em>' containment reference.
	 * @see #setExpressedBy(Reference)
	 * @see org.hl7.fhir.FhirPackage#getGoal_ExpressedBy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='expressedBy' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getExpressedBy();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Goal#getExpressedBy <em>Expressed By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expressed By</em>' containment reference.
	 * @see #getExpressedBy()
	 * @generated
	 */
	void setExpressedBy(Reference value);

	/**
	 * Returns the value of the '<em><b>Addresses</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identified conditions and other health record elements that are intended to be addressed by the goal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Addresses</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGoal_Addresses()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='addresses' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getAddresses();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any comments related to the goal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGoal_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

	/**
	 * Returns the value of the '<em><b>Outcome Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the change (or lack of change) at the point when the status of the goal is assessed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outcome Code</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGoal_OutcomeCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outcomeCode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getOutcomeCode();

	/**
	 * Returns the value of the '<em><b>Outcome Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Details of what's changed (or not changed).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outcome Reference</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGoal_OutcomeReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outcomeReference' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getOutcomeReference();

} // Goal
