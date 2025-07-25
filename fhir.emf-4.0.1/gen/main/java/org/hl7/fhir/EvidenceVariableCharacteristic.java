/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evidence Variable Characteristic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The EvidenceVariable resource describes a "PICO" element that knowledge (evidence, assertion, recommendation) is about.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDefinitionReference <em>Definition Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDefinitionCanonical <em>Definition Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDefinitionCodeableConcept <em>Definition Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDefinitionExpression <em>Definition Expression</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDefinitionDataRequirement <em>Definition Data Requirement</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDefinitionTriggerDefinition <em>Definition Trigger Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceVariableCharacteristic#getUsageContext <em>Usage Context</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceVariableCharacteristic#getExclude <em>Exclude</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceVariableCharacteristic#getParticipantEffectiveDateTime <em>Participant Effective Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceVariableCharacteristic#getParticipantEffectivePeriod <em>Participant Effective Period</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceVariableCharacteristic#getParticipantEffectiveDuration <em>Participant Effective Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceVariableCharacteristic#getParticipantEffectiveTiming <em>Participant Effective Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceVariableCharacteristic#getTimeFromStart <em>Time From Start</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceVariableCharacteristic#getGroupMeasure <em>Group Measure</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableCharacteristic()
 * @model extendedMetaData="name='EvidenceVariable.Characteristic' kind='elementOnly'"
 * @generated
 */
public interface EvidenceVariableCharacteristic extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A short, natural language description of the characteristic that could be used to communicate the criteria to an end-user.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableCharacteristic_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Definition Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Define members of the evidence element using Codes (such as condition, medication, or observation), Expressions ( using an expression language such as FHIRPath or CQL) or DataRequirements (such as Diabetes diagnosis onset in the last year). (choose any one of definition*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition Reference</em>' containment reference.
	 * @see #setDefinitionReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableCharacteristic_DefinitionReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definitionReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getDefinitionReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDefinitionReference <em>Definition Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Reference</em>' containment reference.
	 * @see #getDefinitionReference()
	 * @generated
	 */
	void setDefinitionReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Definition Canonical</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Define members of the evidence element using Codes (such as condition, medication, or observation), Expressions ( using an expression language such as FHIRPath or CQL) or DataRequirements (such as Diabetes diagnosis onset in the last year). (choose any one of definition*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition Canonical</em>' containment reference.
	 * @see #setDefinitionCanonical(Canonical)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableCharacteristic_DefinitionCanonical()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definitionCanonical' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getDefinitionCanonical();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDefinitionCanonical <em>Definition Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Canonical</em>' containment reference.
	 * @see #getDefinitionCanonical()
	 * @generated
	 */
	void setDefinitionCanonical(Canonical value);

	/**
	 * Returns the value of the '<em><b>Definition Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Define members of the evidence element using Codes (such as condition, medication, or observation), Expressions ( using an expression language such as FHIRPath or CQL) or DataRequirements (such as Diabetes diagnosis onset in the last year). (choose any one of definition*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition Codeable Concept</em>' containment reference.
	 * @see #setDefinitionCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableCharacteristic_DefinitionCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definitionCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDefinitionCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDefinitionCodeableConcept <em>Definition Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Codeable Concept</em>' containment reference.
	 * @see #getDefinitionCodeableConcept()
	 * @generated
	 */
	void setDefinitionCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Definition Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Define members of the evidence element using Codes (such as condition, medication, or observation), Expressions ( using an expression language such as FHIRPath or CQL) or DataRequirements (such as Diabetes diagnosis onset in the last year). (choose any one of definition*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition Expression</em>' containment reference.
	 * @see #setDefinitionExpression(Expression)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableCharacteristic_DefinitionExpression()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definitionExpression' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getDefinitionExpression();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDefinitionExpression <em>Definition Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Expression</em>' containment reference.
	 * @see #getDefinitionExpression()
	 * @generated
	 */
	void setDefinitionExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Definition Data Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Define members of the evidence element using Codes (such as condition, medication, or observation), Expressions ( using an expression language such as FHIRPath or CQL) or DataRequirements (such as Diabetes diagnosis onset in the last year). (choose any one of definition*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition Data Requirement</em>' containment reference.
	 * @see #setDefinitionDataRequirement(DataRequirement)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableCharacteristic_DefinitionDataRequirement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definitionDataRequirement' namespace='##targetNamespace'"
	 * @generated
	 */
	DataRequirement getDefinitionDataRequirement();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDefinitionDataRequirement <em>Definition Data Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Data Requirement</em>' containment reference.
	 * @see #getDefinitionDataRequirement()
	 * @generated
	 */
	void setDefinitionDataRequirement(DataRequirement value);

	/**
	 * Returns the value of the '<em><b>Definition Trigger Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Define members of the evidence element using Codes (such as condition, medication, or observation), Expressions ( using an expression language such as FHIRPath or CQL) or DataRequirements (such as Diabetes diagnosis onset in the last year). (choose any one of definition*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition Trigger Definition</em>' containment reference.
	 * @see #setDefinitionTriggerDefinition(TriggerDefinition)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableCharacteristic_DefinitionTriggerDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definitionTriggerDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	TriggerDefinition getDefinitionTriggerDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceVariableCharacteristic#getDefinitionTriggerDefinition <em>Definition Trigger Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Trigger Definition</em>' containment reference.
	 * @see #getDefinitionTriggerDefinition()
	 * @generated
	 */
	void setDefinitionTriggerDefinition(TriggerDefinition value);

	/**
	 * Returns the value of the '<em><b>Usage Context</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.UsageContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Use UsageContext to define the members of the population, such as Age Ranges, Genders, Settings.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usage Context</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableCharacteristic_UsageContext()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='usageContext' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UsageContext> getUsageContext();

	/**
	 * Returns the value of the '<em><b>Exclude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When true, members with this characteristic are excluded from the element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exclude</em>' containment reference.
	 * @see #setExclude(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableCharacteristic_Exclude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exclude' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getExclude();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceVariableCharacteristic#getExclude <em>Exclude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude</em>' containment reference.
	 * @see #getExclude()
	 * @generated
	 */
	void setExclude(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Participant Effective Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates what effective period the study covers. (choose any one of participantEffective*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participant Effective Date Time</em>' containment reference.
	 * @see #setParticipantEffectiveDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableCharacteristic_ParticipantEffectiveDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='participantEffectiveDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getParticipantEffectiveDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceVariableCharacteristic#getParticipantEffectiveDateTime <em>Participant Effective Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participant Effective Date Time</em>' containment reference.
	 * @see #getParticipantEffectiveDateTime()
	 * @generated
	 */
	void setParticipantEffectiveDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Participant Effective Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates what effective period the study covers. (choose any one of participantEffective*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participant Effective Period</em>' containment reference.
	 * @see #setParticipantEffectivePeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableCharacteristic_ParticipantEffectivePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='participantEffectivePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getParticipantEffectivePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceVariableCharacteristic#getParticipantEffectivePeriod <em>Participant Effective Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participant Effective Period</em>' containment reference.
	 * @see #getParticipantEffectivePeriod()
	 * @generated
	 */
	void setParticipantEffectivePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Participant Effective Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates what effective period the study covers. (choose any one of participantEffective*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participant Effective Duration</em>' containment reference.
	 * @see #setParticipantEffectiveDuration(Duration)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableCharacteristic_ParticipantEffectiveDuration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='participantEffectiveDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getParticipantEffectiveDuration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceVariableCharacteristic#getParticipantEffectiveDuration <em>Participant Effective Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participant Effective Duration</em>' containment reference.
	 * @see #getParticipantEffectiveDuration()
	 * @generated
	 */
	void setParticipantEffectiveDuration(Duration value);

	/**
	 * Returns the value of the '<em><b>Participant Effective Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates what effective period the study covers. (choose any one of participantEffective*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participant Effective Timing</em>' containment reference.
	 * @see #setParticipantEffectiveTiming(Timing)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableCharacteristic_ParticipantEffectiveTiming()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='participantEffectiveTiming' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getParticipantEffectiveTiming();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceVariableCharacteristic#getParticipantEffectiveTiming <em>Participant Effective Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participant Effective Timing</em>' containment reference.
	 * @see #getParticipantEffectiveTiming()
	 * @generated
	 */
	void setParticipantEffectiveTiming(Timing value);

	/**
	 * Returns the value of the '<em><b>Time From Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates duration from the participant's study entry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time From Start</em>' containment reference.
	 * @see #setTimeFromStart(Duration)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableCharacteristic_TimeFromStart()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timeFromStart' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getTimeFromStart();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceVariableCharacteristic#getTimeFromStart <em>Time From Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time From Start</em>' containment reference.
	 * @see #getTimeFromStart()
	 * @generated
	 */
	void setTimeFromStart(Duration value);

	/**
	 * Returns the value of the '<em><b>Group Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how elements are aggregated within the study effective period.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group Measure</em>' containment reference.
	 * @see #setGroupMeasure(GroupMeasure)
	 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableCharacteristic_GroupMeasure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='groupMeasure' namespace='##targetNamespace'"
	 * @generated
	 */
	GroupMeasure getGroupMeasure();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceVariableCharacteristic#getGroupMeasure <em>Group Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Measure</em>' containment reference.
	 * @see #getGroupMeasure()
	 * @generated
	 */
	void setGroupMeasure(GroupMeasure value);

} // EvidenceVariableCharacteristic
