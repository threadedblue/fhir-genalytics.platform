/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Research Element Definition Characteristic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ResearchElementDefinition resource describes a "PICO" element that knowledge (evidence, assertion, recommendation) is about.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ResearchElementDefinitionCharacteristic#getDefinitionCodeableConcept <em>Definition Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchElementDefinitionCharacteristic#getDefinitionCanonical <em>Definition Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchElementDefinitionCharacteristic#getDefinitionExpression <em>Definition Expression</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchElementDefinitionCharacteristic#getDefinitionDataRequirement <em>Definition Data Requirement</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchElementDefinitionCharacteristic#getUsageContext <em>Usage Context</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchElementDefinitionCharacteristic#getExclude <em>Exclude</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchElementDefinitionCharacteristic#getUnitOfMeasure <em>Unit Of Measure</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchElementDefinitionCharacteristic#getStudyEffectiveDescription <em>Study Effective Description</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchElementDefinitionCharacteristic#getStudyEffectiveDateTime <em>Study Effective Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchElementDefinitionCharacteristic#getStudyEffectivePeriod <em>Study Effective Period</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchElementDefinitionCharacteristic#getStudyEffectiveDuration <em>Study Effective Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchElementDefinitionCharacteristic#getStudyEffectiveTiming <em>Study Effective Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchElementDefinitionCharacteristic#getStudyEffectiveTimeFromStart <em>Study Effective Time From Start</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchElementDefinitionCharacteristic#getStudyEffectiveGroupMeasure <em>Study Effective Group Measure</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchElementDefinitionCharacteristic#getParticipantEffectiveDescription <em>Participant Effective Description</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchElementDefinitionCharacteristic#getParticipantEffectiveDateTime <em>Participant Effective Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchElementDefinitionCharacteristic#getParticipantEffectivePeriod <em>Participant Effective Period</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchElementDefinitionCharacteristic#getParticipantEffectiveDuration <em>Participant Effective Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchElementDefinitionCharacteristic#getParticipantEffectiveTiming <em>Participant Effective Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchElementDefinitionCharacteristic#getParticipantEffectiveTimeFromStart <em>Participant Effective Time From Start</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchElementDefinitionCharacteristic#getParticipantEffectiveGroupMeasure <em>Participant Effective Group Measure</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getResearchElementDefinitionCharacteristic()
 * @model extendedMetaData="name='ResearchElementDefinition.Characteristic' kind='elementOnly'"
 * @generated
 */
public interface ResearchElementDefinitionCharacteristic extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Definition Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Define members of the research element using Codes (such as condition, medication, or observation), Expressions ( using an expression language such as FHIRPath or CQL) or DataRequirements (such as Diabetes diagnosis onset in the last year). (choose any one of definition*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition Codeable Concept</em>' containment reference.
	 * @see #setDefinitionCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getResearchElementDefinitionCharacteristic_DefinitionCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definitionCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDefinitionCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchElementDefinitionCharacteristic#getDefinitionCodeableConcept <em>Definition Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Codeable Concept</em>' containment reference.
	 * @see #getDefinitionCodeableConcept()
	 * @generated
	 */
	void setDefinitionCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Definition Canonical</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Define members of the research element using Codes (such as condition, medication, or observation), Expressions ( using an expression language such as FHIRPath or CQL) or DataRequirements (such as Diabetes diagnosis onset in the last year). (choose any one of definition*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition Canonical</em>' containment reference.
	 * @see #setDefinitionCanonical(Canonical)
	 * @see org.hl7.fhir.FhirPackage#getResearchElementDefinitionCharacteristic_DefinitionCanonical()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definitionCanonical' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getDefinitionCanonical();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchElementDefinitionCharacteristic#getDefinitionCanonical <em>Definition Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Canonical</em>' containment reference.
	 * @see #getDefinitionCanonical()
	 * @generated
	 */
	void setDefinitionCanonical(Canonical value);

	/**
	 * Returns the value of the '<em><b>Definition Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Define members of the research element using Codes (such as condition, medication, or observation), Expressions ( using an expression language such as FHIRPath or CQL) or DataRequirements (such as Diabetes diagnosis onset in the last year). (choose any one of definition*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition Expression</em>' containment reference.
	 * @see #setDefinitionExpression(Expression)
	 * @see org.hl7.fhir.FhirPackage#getResearchElementDefinitionCharacteristic_DefinitionExpression()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definitionExpression' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getDefinitionExpression();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchElementDefinitionCharacteristic#getDefinitionExpression <em>Definition Expression</em>}' containment reference.
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
	 * Define members of the research element using Codes (such as condition, medication, or observation), Expressions ( using an expression language such as FHIRPath or CQL) or DataRequirements (such as Diabetes diagnosis onset in the last year). (choose any one of definition*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition Data Requirement</em>' containment reference.
	 * @see #setDefinitionDataRequirement(DataRequirement)
	 * @see org.hl7.fhir.FhirPackage#getResearchElementDefinitionCharacteristic_DefinitionDataRequirement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definitionDataRequirement' namespace='##targetNamespace'"
	 * @generated
	 */
	DataRequirement getDefinitionDataRequirement();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchElementDefinitionCharacteristic#getDefinitionDataRequirement <em>Definition Data Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Data Requirement</em>' containment reference.
	 * @see #getDefinitionDataRequirement()
	 * @generated
	 */
	void setDefinitionDataRequirement(DataRequirement value);

	/**
	 * Returns the value of the '<em><b>Usage Context</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.UsageContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Use UsageContext to define the members of the population, such as Age Ranges, Genders, Settings.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usage Context</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getResearchElementDefinitionCharacteristic_UsageContext()
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
	 * @see org.hl7.fhir.FhirPackage#getResearchElementDefinitionCharacteristic_Exclude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exclude' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getExclude();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchElementDefinitionCharacteristic#getExclude <em>Exclude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude</em>' containment reference.
	 * @see #getExclude()
	 * @generated
	 */
	void setExclude(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Unit Of Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the UCUM unit for the outcome.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit Of Measure</em>' containment reference.
	 * @see #setUnitOfMeasure(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getResearchElementDefinitionCharacteristic_UnitOfMeasure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unitOfMeasure' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getUnitOfMeasure();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchElementDefinitionCharacteristic#getUnitOfMeasure <em>Unit Of Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Of Measure</em>' containment reference.
	 * @see #getUnitOfMeasure()
	 * @generated
	 */
	void setUnitOfMeasure(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Study Effective Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A narrative description of the time period the study covers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Study Effective Description</em>' containment reference.
	 * @see #setStudyEffectiveDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getResearchElementDefinitionCharacteristic_StudyEffectiveDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='studyEffectiveDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getStudyEffectiveDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchElementDefinitionCharacteristic#getStudyEffectiveDescription <em>Study Effective Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study Effective Description</em>' containment reference.
	 * @see #getStudyEffectiveDescription()
	 * @generated
	 */
	void setStudyEffectiveDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Study Effective Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates what effective period the study covers. (choose any one of studyEffective*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Study Effective Date Time</em>' containment reference.
	 * @see #setStudyEffectiveDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getResearchElementDefinitionCharacteristic_StudyEffectiveDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='studyEffectiveDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getStudyEffectiveDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchElementDefinitionCharacteristic#getStudyEffectiveDateTime <em>Study Effective Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study Effective Date Time</em>' containment reference.
	 * @see #getStudyEffectiveDateTime()
	 * @generated
	 */
	void setStudyEffectiveDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Study Effective Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates what effective period the study covers. (choose any one of studyEffective*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Study Effective Period</em>' containment reference.
	 * @see #setStudyEffectivePeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getResearchElementDefinitionCharacteristic_StudyEffectivePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='studyEffectivePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getStudyEffectivePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchElementDefinitionCharacteristic#getStudyEffectivePeriod <em>Study Effective Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study Effective Period</em>' containment reference.
	 * @see #getStudyEffectivePeriod()
	 * @generated
	 */
	void setStudyEffectivePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Study Effective Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates what effective period the study covers. (choose any one of studyEffective*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Study Effective Duration</em>' containment reference.
	 * @see #setStudyEffectiveDuration(Duration)
	 * @see org.hl7.fhir.FhirPackage#getResearchElementDefinitionCharacteristic_StudyEffectiveDuration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='studyEffectiveDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getStudyEffectiveDuration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchElementDefinitionCharacteristic#getStudyEffectiveDuration <em>Study Effective Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study Effective Duration</em>' containment reference.
	 * @see #getStudyEffectiveDuration()
	 * @generated
	 */
	void setStudyEffectiveDuration(Duration value);

	/**
	 * Returns the value of the '<em><b>Study Effective Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates what effective period the study covers. (choose any one of studyEffective*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Study Effective Timing</em>' containment reference.
	 * @see #setStudyEffectiveTiming(Timing)
	 * @see org.hl7.fhir.FhirPackage#getResearchElementDefinitionCharacteristic_StudyEffectiveTiming()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='studyEffectiveTiming' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getStudyEffectiveTiming();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchElementDefinitionCharacteristic#getStudyEffectiveTiming <em>Study Effective Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study Effective Timing</em>' containment reference.
	 * @see #getStudyEffectiveTiming()
	 * @generated
	 */
	void setStudyEffectiveTiming(Timing value);

	/**
	 * Returns the value of the '<em><b>Study Effective Time From Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates duration from the study initiation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Study Effective Time From Start</em>' containment reference.
	 * @see #setStudyEffectiveTimeFromStart(Duration)
	 * @see org.hl7.fhir.FhirPackage#getResearchElementDefinitionCharacteristic_StudyEffectiveTimeFromStart()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='studyEffectiveTimeFromStart' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getStudyEffectiveTimeFromStart();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchElementDefinitionCharacteristic#getStudyEffectiveTimeFromStart <em>Study Effective Time From Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study Effective Time From Start</em>' containment reference.
	 * @see #getStudyEffectiveTimeFromStart()
	 * @generated
	 */
	void setStudyEffectiveTimeFromStart(Duration value);

	/**
	 * Returns the value of the '<em><b>Study Effective Group Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how elements are aggregated within the study effective period.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Study Effective Group Measure</em>' containment reference.
	 * @see #setStudyEffectiveGroupMeasure(GroupMeasure)
	 * @see org.hl7.fhir.FhirPackage#getResearchElementDefinitionCharacteristic_StudyEffectiveGroupMeasure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='studyEffectiveGroupMeasure' namespace='##targetNamespace'"
	 * @generated
	 */
	GroupMeasure getStudyEffectiveGroupMeasure();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchElementDefinitionCharacteristic#getStudyEffectiveGroupMeasure <em>Study Effective Group Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study Effective Group Measure</em>' containment reference.
	 * @see #getStudyEffectiveGroupMeasure()
	 * @generated
	 */
	void setStudyEffectiveGroupMeasure(GroupMeasure value);

	/**
	 * Returns the value of the '<em><b>Participant Effective Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A narrative description of the time period the study covers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participant Effective Description</em>' containment reference.
	 * @see #setParticipantEffectiveDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getResearchElementDefinitionCharacteristic_ParticipantEffectiveDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='participantEffectiveDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getParticipantEffectiveDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchElementDefinitionCharacteristic#getParticipantEffectiveDescription <em>Participant Effective Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participant Effective Description</em>' containment reference.
	 * @see #getParticipantEffectiveDescription()
	 * @generated
	 */
	void setParticipantEffectiveDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Participant Effective Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates what effective period the study covers. (choose any one of participantEffective*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participant Effective Date Time</em>' containment reference.
	 * @see #setParticipantEffectiveDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getResearchElementDefinitionCharacteristic_ParticipantEffectiveDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='participantEffectiveDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getParticipantEffectiveDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchElementDefinitionCharacteristic#getParticipantEffectiveDateTime <em>Participant Effective Date Time</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getResearchElementDefinitionCharacteristic_ParticipantEffectivePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='participantEffectivePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getParticipantEffectivePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchElementDefinitionCharacteristic#getParticipantEffectivePeriod <em>Participant Effective Period</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getResearchElementDefinitionCharacteristic_ParticipantEffectiveDuration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='participantEffectiveDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getParticipantEffectiveDuration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchElementDefinitionCharacteristic#getParticipantEffectiveDuration <em>Participant Effective Duration</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getResearchElementDefinitionCharacteristic_ParticipantEffectiveTiming()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='participantEffectiveTiming' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getParticipantEffectiveTiming();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchElementDefinitionCharacteristic#getParticipantEffectiveTiming <em>Participant Effective Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participant Effective Timing</em>' containment reference.
	 * @see #getParticipantEffectiveTiming()
	 * @generated
	 */
	void setParticipantEffectiveTiming(Timing value);

	/**
	 * Returns the value of the '<em><b>Participant Effective Time From Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates duration from the participant's study entry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participant Effective Time From Start</em>' containment reference.
	 * @see #setParticipantEffectiveTimeFromStart(Duration)
	 * @see org.hl7.fhir.FhirPackage#getResearchElementDefinitionCharacteristic_ParticipantEffectiveTimeFromStart()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='participantEffectiveTimeFromStart' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getParticipantEffectiveTimeFromStart();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchElementDefinitionCharacteristic#getParticipantEffectiveTimeFromStart <em>Participant Effective Time From Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participant Effective Time From Start</em>' containment reference.
	 * @see #getParticipantEffectiveTimeFromStart()
	 * @generated
	 */
	void setParticipantEffectiveTimeFromStart(Duration value);

	/**
	 * Returns the value of the '<em><b>Participant Effective Group Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how elements are aggregated within the study effective period.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participant Effective Group Measure</em>' containment reference.
	 * @see #setParticipantEffectiveGroupMeasure(GroupMeasure)
	 * @see org.hl7.fhir.FhirPackage#getResearchElementDefinitionCharacteristic_ParticipantEffectiveGroupMeasure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='participantEffectiveGroupMeasure' namespace='##targetNamespace'"
	 * @generated
	 */
	GroupMeasure getParticipantEffectiveGroupMeasure();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchElementDefinitionCharacteristic#getParticipantEffectiveGroupMeasure <em>Participant Effective Group Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participant Effective Group Measure</em>' containment reference.
	 * @see #getParticipantEffectiveGroupMeasure()
	 * @generated
	 */
	void setParticipantEffectiveGroupMeasure(GroupMeasure value);

} // ResearchElementDefinitionCharacteristic
