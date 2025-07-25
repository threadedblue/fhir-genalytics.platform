/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.Canonical;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DataRequirement;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.Duration;
import org.hl7.fhir.Expression;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.GroupMeasure;
import org.hl7.fhir.Period;
import org.hl7.fhir.ResearchElementDefinitionCharacteristic;
import org.hl7.fhir.Timing;
import org.hl7.fhir.UsageContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Research Element Definition Characteristic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ResearchElementDefinitionCharacteristicImpl#getDefinitionCodeableConcept <em>Definition Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchElementDefinitionCharacteristicImpl#getDefinitionCanonical <em>Definition Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchElementDefinitionCharacteristicImpl#getDefinitionExpression <em>Definition Expression</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchElementDefinitionCharacteristicImpl#getDefinitionDataRequirement <em>Definition Data Requirement</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchElementDefinitionCharacteristicImpl#getUsageContext <em>Usage Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchElementDefinitionCharacteristicImpl#getExclude <em>Exclude</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchElementDefinitionCharacteristicImpl#getUnitOfMeasure <em>Unit Of Measure</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchElementDefinitionCharacteristicImpl#getStudyEffectiveDescription <em>Study Effective Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchElementDefinitionCharacteristicImpl#getStudyEffectiveDateTime <em>Study Effective Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchElementDefinitionCharacteristicImpl#getStudyEffectivePeriod <em>Study Effective Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchElementDefinitionCharacteristicImpl#getStudyEffectiveDuration <em>Study Effective Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchElementDefinitionCharacteristicImpl#getStudyEffectiveTiming <em>Study Effective Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchElementDefinitionCharacteristicImpl#getStudyEffectiveTimeFromStart <em>Study Effective Time From Start</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchElementDefinitionCharacteristicImpl#getStudyEffectiveGroupMeasure <em>Study Effective Group Measure</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchElementDefinitionCharacteristicImpl#getParticipantEffectiveDescription <em>Participant Effective Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchElementDefinitionCharacteristicImpl#getParticipantEffectiveDateTime <em>Participant Effective Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchElementDefinitionCharacteristicImpl#getParticipantEffectivePeriod <em>Participant Effective Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchElementDefinitionCharacteristicImpl#getParticipantEffectiveDuration <em>Participant Effective Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchElementDefinitionCharacteristicImpl#getParticipantEffectiveTiming <em>Participant Effective Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchElementDefinitionCharacteristicImpl#getParticipantEffectiveTimeFromStart <em>Participant Effective Time From Start</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchElementDefinitionCharacteristicImpl#getParticipantEffectiveGroupMeasure <em>Participant Effective Group Measure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResearchElementDefinitionCharacteristicImpl extends BackboneElementImpl implements ResearchElementDefinitionCharacteristic {
	/**
	 * The cached value of the '{@link #getDefinitionCodeableConcept() <em>Definition Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept definitionCodeableConcept;

	/**
	 * The cached value of the '{@link #getDefinitionCanonical() <em>Definition Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionCanonical()
	 * @generated
	 * @ordered
	 */
	protected Canonical definitionCanonical;

	/**
	 * The cached value of the '{@link #getDefinitionExpression() <em>Definition Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression definitionExpression;

	/**
	 * The cached value of the '{@link #getDefinitionDataRequirement() <em>Definition Data Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionDataRequirement()
	 * @generated
	 * @ordered
	 */
	protected DataRequirement definitionDataRequirement;

	/**
	 * The cached value of the '{@link #getUsageContext() <em>Usage Context</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageContext()
	 * @generated
	 * @ordered
	 */
	protected EList<UsageContext> usageContext;

	/**
	 * The cached value of the '{@link #getExclude() <em>Exclude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclude()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean exclude;

	/**
	 * The cached value of the '{@link #getUnitOfMeasure() <em>Unit Of Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitOfMeasure()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept unitOfMeasure;

	/**
	 * The cached value of the '{@link #getStudyEffectiveDescription() <em>Study Effective Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyEffectiveDescription()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String studyEffectiveDescription;

	/**
	 * The cached value of the '{@link #getStudyEffectiveDateTime() <em>Study Effective Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyEffectiveDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime studyEffectiveDateTime;

	/**
	 * The cached value of the '{@link #getStudyEffectivePeriod() <em>Study Effective Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyEffectivePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period studyEffectivePeriod;

	/**
	 * The cached value of the '{@link #getStudyEffectiveDuration() <em>Study Effective Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyEffectiveDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration studyEffectiveDuration;

	/**
	 * The cached value of the '{@link #getStudyEffectiveTiming() <em>Study Effective Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyEffectiveTiming()
	 * @generated
	 * @ordered
	 */
	protected Timing studyEffectiveTiming;

	/**
	 * The cached value of the '{@link #getStudyEffectiveTimeFromStart() <em>Study Effective Time From Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyEffectiveTimeFromStart()
	 * @generated
	 * @ordered
	 */
	protected Duration studyEffectiveTimeFromStart;

	/**
	 * The cached value of the '{@link #getStudyEffectiveGroupMeasure() <em>Study Effective Group Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyEffectiveGroupMeasure()
	 * @generated
	 * @ordered
	 */
	protected GroupMeasure studyEffectiveGroupMeasure;

	/**
	 * The cached value of the '{@link #getParticipantEffectiveDescription() <em>Participant Effective Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantEffectiveDescription()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String participantEffectiveDescription;

	/**
	 * The cached value of the '{@link #getParticipantEffectiveDateTime() <em>Participant Effective Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantEffectiveDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime participantEffectiveDateTime;

	/**
	 * The cached value of the '{@link #getParticipantEffectivePeriod() <em>Participant Effective Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantEffectivePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period participantEffectivePeriod;

	/**
	 * The cached value of the '{@link #getParticipantEffectiveDuration() <em>Participant Effective Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantEffectiveDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration participantEffectiveDuration;

	/**
	 * The cached value of the '{@link #getParticipantEffectiveTiming() <em>Participant Effective Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantEffectiveTiming()
	 * @generated
	 * @ordered
	 */
	protected Timing participantEffectiveTiming;

	/**
	 * The cached value of the '{@link #getParticipantEffectiveTimeFromStart() <em>Participant Effective Time From Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantEffectiveTimeFromStart()
	 * @generated
	 * @ordered
	 */
	protected Duration participantEffectiveTimeFromStart;

	/**
	 * The cached value of the '{@link #getParticipantEffectiveGroupMeasure() <em>Participant Effective Group Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantEffectiveGroupMeasure()
	 * @generated
	 * @ordered
	 */
	protected GroupMeasure participantEffectiveGroupMeasure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResearchElementDefinitionCharacteristicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getResearchElementDefinitionCharacteristic();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getDefinitionCodeableConcept() {
		return definitionCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitionCodeableConcept(CodeableConcept newDefinitionCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldDefinitionCodeableConcept = definitionCodeableConcept;
		definitionCodeableConcept = newDefinitionCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__DEFINITION_CODEABLE_CONCEPT, oldDefinitionCodeableConcept, newDefinitionCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinitionCodeableConcept(CodeableConcept newDefinitionCodeableConcept) {
		if (newDefinitionCodeableConcept != definitionCodeableConcept) {
			NotificationChain msgs = null;
			if (definitionCodeableConcept != null)
				msgs = ((InternalEObject)definitionCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__DEFINITION_CODEABLE_CONCEPT, null, msgs);
			if (newDefinitionCodeableConcept != null)
				msgs = ((InternalEObject)newDefinitionCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__DEFINITION_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetDefinitionCodeableConcept(newDefinitionCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__DEFINITION_CODEABLE_CONCEPT, newDefinitionCodeableConcept, newDefinitionCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Canonical getDefinitionCanonical() {
		return definitionCanonical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitionCanonical(Canonical newDefinitionCanonical, NotificationChain msgs) {
		Canonical oldDefinitionCanonical = definitionCanonical;
		definitionCanonical = newDefinitionCanonical;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__DEFINITION_CANONICAL, oldDefinitionCanonical, newDefinitionCanonical);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinitionCanonical(Canonical newDefinitionCanonical) {
		if (newDefinitionCanonical != definitionCanonical) {
			NotificationChain msgs = null;
			if (definitionCanonical != null)
				msgs = ((InternalEObject)definitionCanonical).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__DEFINITION_CANONICAL, null, msgs);
			if (newDefinitionCanonical != null)
				msgs = ((InternalEObject)newDefinitionCanonical).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__DEFINITION_CANONICAL, null, msgs);
			msgs = basicSetDefinitionCanonical(newDefinitionCanonical, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__DEFINITION_CANONICAL, newDefinitionCanonical, newDefinitionCanonical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getDefinitionExpression() {
		return definitionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitionExpression(Expression newDefinitionExpression, NotificationChain msgs) {
		Expression oldDefinitionExpression = definitionExpression;
		definitionExpression = newDefinitionExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__DEFINITION_EXPRESSION, oldDefinitionExpression, newDefinitionExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinitionExpression(Expression newDefinitionExpression) {
		if (newDefinitionExpression != definitionExpression) {
			NotificationChain msgs = null;
			if (definitionExpression != null)
				msgs = ((InternalEObject)definitionExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__DEFINITION_EXPRESSION, null, msgs);
			if (newDefinitionExpression != null)
				msgs = ((InternalEObject)newDefinitionExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__DEFINITION_EXPRESSION, null, msgs);
			msgs = basicSetDefinitionExpression(newDefinitionExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__DEFINITION_EXPRESSION, newDefinitionExpression, newDefinitionExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataRequirement getDefinitionDataRequirement() {
		return definitionDataRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitionDataRequirement(DataRequirement newDefinitionDataRequirement, NotificationChain msgs) {
		DataRequirement oldDefinitionDataRequirement = definitionDataRequirement;
		definitionDataRequirement = newDefinitionDataRequirement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__DEFINITION_DATA_REQUIREMENT, oldDefinitionDataRequirement, newDefinitionDataRequirement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinitionDataRequirement(DataRequirement newDefinitionDataRequirement) {
		if (newDefinitionDataRequirement != definitionDataRequirement) {
			NotificationChain msgs = null;
			if (definitionDataRequirement != null)
				msgs = ((InternalEObject)definitionDataRequirement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__DEFINITION_DATA_REQUIREMENT, null, msgs);
			if (newDefinitionDataRequirement != null)
				msgs = ((InternalEObject)newDefinitionDataRequirement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__DEFINITION_DATA_REQUIREMENT, null, msgs);
			msgs = basicSetDefinitionDataRequirement(newDefinitionDataRequirement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__DEFINITION_DATA_REQUIREMENT, newDefinitionDataRequirement, newDefinitionDataRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UsageContext> getUsageContext() {
		if (usageContext == null) {
			usageContext = new EObjectContainmentEList<UsageContext>(UsageContext.class, this, FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__USAGE_CONTEXT);
		}
		return usageContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getExclude() {
		return exclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExclude(org.hl7.fhir.Boolean newExclude, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldExclude = exclude;
		exclude = newExclude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__EXCLUDE, oldExclude, newExclude);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExclude(org.hl7.fhir.Boolean newExclude) {
		if (newExclude != exclude) {
			NotificationChain msgs = null;
			if (exclude != null)
				msgs = ((InternalEObject)exclude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__EXCLUDE, null, msgs);
			if (newExclude != null)
				msgs = ((InternalEObject)newExclude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__EXCLUDE, null, msgs);
			msgs = basicSetExclude(newExclude, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__EXCLUDE, newExclude, newExclude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getUnitOfMeasure() {
		return unitOfMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnitOfMeasure(CodeableConcept newUnitOfMeasure, NotificationChain msgs) {
		CodeableConcept oldUnitOfMeasure = unitOfMeasure;
		unitOfMeasure = newUnitOfMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__UNIT_OF_MEASURE, oldUnitOfMeasure, newUnitOfMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitOfMeasure(CodeableConcept newUnitOfMeasure) {
		if (newUnitOfMeasure != unitOfMeasure) {
			NotificationChain msgs = null;
			if (unitOfMeasure != null)
				msgs = ((InternalEObject)unitOfMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__UNIT_OF_MEASURE, null, msgs);
			if (newUnitOfMeasure != null)
				msgs = ((InternalEObject)newUnitOfMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__UNIT_OF_MEASURE, null, msgs);
			msgs = basicSetUnitOfMeasure(newUnitOfMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__UNIT_OF_MEASURE, newUnitOfMeasure, newUnitOfMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getStudyEffectiveDescription() {
		return studyEffectiveDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudyEffectiveDescription(org.hl7.fhir.String newStudyEffectiveDescription, NotificationChain msgs) {
		org.hl7.fhir.String oldStudyEffectiveDescription = studyEffectiveDescription;
		studyEffectiveDescription = newStudyEffectiveDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_DESCRIPTION, oldStudyEffectiveDescription, newStudyEffectiveDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStudyEffectiveDescription(org.hl7.fhir.String newStudyEffectiveDescription) {
		if (newStudyEffectiveDescription != studyEffectiveDescription) {
			NotificationChain msgs = null;
			if (studyEffectiveDescription != null)
				msgs = ((InternalEObject)studyEffectiveDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_DESCRIPTION, null, msgs);
			if (newStudyEffectiveDescription != null)
				msgs = ((InternalEObject)newStudyEffectiveDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_DESCRIPTION, null, msgs);
			msgs = basicSetStudyEffectiveDescription(newStudyEffectiveDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_DESCRIPTION, newStudyEffectiveDescription, newStudyEffectiveDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getStudyEffectiveDateTime() {
		return studyEffectiveDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudyEffectiveDateTime(DateTime newStudyEffectiveDateTime, NotificationChain msgs) {
		DateTime oldStudyEffectiveDateTime = studyEffectiveDateTime;
		studyEffectiveDateTime = newStudyEffectiveDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_DATE_TIME, oldStudyEffectiveDateTime, newStudyEffectiveDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStudyEffectiveDateTime(DateTime newStudyEffectiveDateTime) {
		if (newStudyEffectiveDateTime != studyEffectiveDateTime) {
			NotificationChain msgs = null;
			if (studyEffectiveDateTime != null)
				msgs = ((InternalEObject)studyEffectiveDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_DATE_TIME, null, msgs);
			if (newStudyEffectiveDateTime != null)
				msgs = ((InternalEObject)newStudyEffectiveDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_DATE_TIME, null, msgs);
			msgs = basicSetStudyEffectiveDateTime(newStudyEffectiveDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_DATE_TIME, newStudyEffectiveDateTime, newStudyEffectiveDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getStudyEffectivePeriod() {
		return studyEffectivePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudyEffectivePeriod(Period newStudyEffectivePeriod, NotificationChain msgs) {
		Period oldStudyEffectivePeriod = studyEffectivePeriod;
		studyEffectivePeriod = newStudyEffectivePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_PERIOD, oldStudyEffectivePeriod, newStudyEffectivePeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStudyEffectivePeriod(Period newStudyEffectivePeriod) {
		if (newStudyEffectivePeriod != studyEffectivePeriod) {
			NotificationChain msgs = null;
			if (studyEffectivePeriod != null)
				msgs = ((InternalEObject)studyEffectivePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_PERIOD, null, msgs);
			if (newStudyEffectivePeriod != null)
				msgs = ((InternalEObject)newStudyEffectivePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_PERIOD, null, msgs);
			msgs = basicSetStudyEffectivePeriod(newStudyEffectivePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_PERIOD, newStudyEffectivePeriod, newStudyEffectivePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getStudyEffectiveDuration() {
		return studyEffectiveDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudyEffectiveDuration(Duration newStudyEffectiveDuration, NotificationChain msgs) {
		Duration oldStudyEffectiveDuration = studyEffectiveDuration;
		studyEffectiveDuration = newStudyEffectiveDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_DURATION, oldStudyEffectiveDuration, newStudyEffectiveDuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStudyEffectiveDuration(Duration newStudyEffectiveDuration) {
		if (newStudyEffectiveDuration != studyEffectiveDuration) {
			NotificationChain msgs = null;
			if (studyEffectiveDuration != null)
				msgs = ((InternalEObject)studyEffectiveDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_DURATION, null, msgs);
			if (newStudyEffectiveDuration != null)
				msgs = ((InternalEObject)newStudyEffectiveDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_DURATION, null, msgs);
			msgs = basicSetStudyEffectiveDuration(newStudyEffectiveDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_DURATION, newStudyEffectiveDuration, newStudyEffectiveDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Timing getStudyEffectiveTiming() {
		return studyEffectiveTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudyEffectiveTiming(Timing newStudyEffectiveTiming, NotificationChain msgs) {
		Timing oldStudyEffectiveTiming = studyEffectiveTiming;
		studyEffectiveTiming = newStudyEffectiveTiming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_TIMING, oldStudyEffectiveTiming, newStudyEffectiveTiming);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStudyEffectiveTiming(Timing newStudyEffectiveTiming) {
		if (newStudyEffectiveTiming != studyEffectiveTiming) {
			NotificationChain msgs = null;
			if (studyEffectiveTiming != null)
				msgs = ((InternalEObject)studyEffectiveTiming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_TIMING, null, msgs);
			if (newStudyEffectiveTiming != null)
				msgs = ((InternalEObject)newStudyEffectiveTiming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_TIMING, null, msgs);
			msgs = basicSetStudyEffectiveTiming(newStudyEffectiveTiming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_TIMING, newStudyEffectiveTiming, newStudyEffectiveTiming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getStudyEffectiveTimeFromStart() {
		return studyEffectiveTimeFromStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudyEffectiveTimeFromStart(Duration newStudyEffectiveTimeFromStart, NotificationChain msgs) {
		Duration oldStudyEffectiveTimeFromStart = studyEffectiveTimeFromStart;
		studyEffectiveTimeFromStart = newStudyEffectiveTimeFromStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_TIME_FROM_START, oldStudyEffectiveTimeFromStart, newStudyEffectiveTimeFromStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStudyEffectiveTimeFromStart(Duration newStudyEffectiveTimeFromStart) {
		if (newStudyEffectiveTimeFromStart != studyEffectiveTimeFromStart) {
			NotificationChain msgs = null;
			if (studyEffectiveTimeFromStart != null)
				msgs = ((InternalEObject)studyEffectiveTimeFromStart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_TIME_FROM_START, null, msgs);
			if (newStudyEffectiveTimeFromStart != null)
				msgs = ((InternalEObject)newStudyEffectiveTimeFromStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_TIME_FROM_START, null, msgs);
			msgs = basicSetStudyEffectiveTimeFromStart(newStudyEffectiveTimeFromStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_TIME_FROM_START, newStudyEffectiveTimeFromStart, newStudyEffectiveTimeFromStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupMeasure getStudyEffectiveGroupMeasure() {
		return studyEffectiveGroupMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudyEffectiveGroupMeasure(GroupMeasure newStudyEffectiveGroupMeasure, NotificationChain msgs) {
		GroupMeasure oldStudyEffectiveGroupMeasure = studyEffectiveGroupMeasure;
		studyEffectiveGroupMeasure = newStudyEffectiveGroupMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_GROUP_MEASURE, oldStudyEffectiveGroupMeasure, newStudyEffectiveGroupMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStudyEffectiveGroupMeasure(GroupMeasure newStudyEffectiveGroupMeasure) {
		if (newStudyEffectiveGroupMeasure != studyEffectiveGroupMeasure) {
			NotificationChain msgs = null;
			if (studyEffectiveGroupMeasure != null)
				msgs = ((InternalEObject)studyEffectiveGroupMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_GROUP_MEASURE, null, msgs);
			if (newStudyEffectiveGroupMeasure != null)
				msgs = ((InternalEObject)newStudyEffectiveGroupMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_GROUP_MEASURE, null, msgs);
			msgs = basicSetStudyEffectiveGroupMeasure(newStudyEffectiveGroupMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_GROUP_MEASURE, newStudyEffectiveGroupMeasure, newStudyEffectiveGroupMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getParticipantEffectiveDescription() {
		return participantEffectiveDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParticipantEffectiveDescription(org.hl7.fhir.String newParticipantEffectiveDescription, NotificationChain msgs) {
		org.hl7.fhir.String oldParticipantEffectiveDescription = participantEffectiveDescription;
		participantEffectiveDescription = newParticipantEffectiveDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DESCRIPTION, oldParticipantEffectiveDescription, newParticipantEffectiveDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParticipantEffectiveDescription(org.hl7.fhir.String newParticipantEffectiveDescription) {
		if (newParticipantEffectiveDescription != participantEffectiveDescription) {
			NotificationChain msgs = null;
			if (participantEffectiveDescription != null)
				msgs = ((InternalEObject)participantEffectiveDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DESCRIPTION, null, msgs);
			if (newParticipantEffectiveDescription != null)
				msgs = ((InternalEObject)newParticipantEffectiveDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DESCRIPTION, null, msgs);
			msgs = basicSetParticipantEffectiveDescription(newParticipantEffectiveDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DESCRIPTION, newParticipantEffectiveDescription, newParticipantEffectiveDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getParticipantEffectiveDateTime() {
		return participantEffectiveDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParticipantEffectiveDateTime(DateTime newParticipantEffectiveDateTime, NotificationChain msgs) {
		DateTime oldParticipantEffectiveDateTime = participantEffectiveDateTime;
		participantEffectiveDateTime = newParticipantEffectiveDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DATE_TIME, oldParticipantEffectiveDateTime, newParticipantEffectiveDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParticipantEffectiveDateTime(DateTime newParticipantEffectiveDateTime) {
		if (newParticipantEffectiveDateTime != participantEffectiveDateTime) {
			NotificationChain msgs = null;
			if (participantEffectiveDateTime != null)
				msgs = ((InternalEObject)participantEffectiveDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DATE_TIME, null, msgs);
			if (newParticipantEffectiveDateTime != null)
				msgs = ((InternalEObject)newParticipantEffectiveDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DATE_TIME, null, msgs);
			msgs = basicSetParticipantEffectiveDateTime(newParticipantEffectiveDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DATE_TIME, newParticipantEffectiveDateTime, newParticipantEffectiveDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getParticipantEffectivePeriod() {
		return participantEffectivePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParticipantEffectivePeriod(Period newParticipantEffectivePeriod, NotificationChain msgs) {
		Period oldParticipantEffectivePeriod = participantEffectivePeriod;
		participantEffectivePeriod = newParticipantEffectivePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_PERIOD, oldParticipantEffectivePeriod, newParticipantEffectivePeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParticipantEffectivePeriod(Period newParticipantEffectivePeriod) {
		if (newParticipantEffectivePeriod != participantEffectivePeriod) {
			NotificationChain msgs = null;
			if (participantEffectivePeriod != null)
				msgs = ((InternalEObject)participantEffectivePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_PERIOD, null, msgs);
			if (newParticipantEffectivePeriod != null)
				msgs = ((InternalEObject)newParticipantEffectivePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_PERIOD, null, msgs);
			msgs = basicSetParticipantEffectivePeriod(newParticipantEffectivePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_PERIOD, newParticipantEffectivePeriod, newParticipantEffectivePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getParticipantEffectiveDuration() {
		return participantEffectiveDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParticipantEffectiveDuration(Duration newParticipantEffectiveDuration, NotificationChain msgs) {
		Duration oldParticipantEffectiveDuration = participantEffectiveDuration;
		participantEffectiveDuration = newParticipantEffectiveDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DURATION, oldParticipantEffectiveDuration, newParticipantEffectiveDuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParticipantEffectiveDuration(Duration newParticipantEffectiveDuration) {
		if (newParticipantEffectiveDuration != participantEffectiveDuration) {
			NotificationChain msgs = null;
			if (participantEffectiveDuration != null)
				msgs = ((InternalEObject)participantEffectiveDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DURATION, null, msgs);
			if (newParticipantEffectiveDuration != null)
				msgs = ((InternalEObject)newParticipantEffectiveDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DURATION, null, msgs);
			msgs = basicSetParticipantEffectiveDuration(newParticipantEffectiveDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DURATION, newParticipantEffectiveDuration, newParticipantEffectiveDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Timing getParticipantEffectiveTiming() {
		return participantEffectiveTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParticipantEffectiveTiming(Timing newParticipantEffectiveTiming, NotificationChain msgs) {
		Timing oldParticipantEffectiveTiming = participantEffectiveTiming;
		participantEffectiveTiming = newParticipantEffectiveTiming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_TIMING, oldParticipantEffectiveTiming, newParticipantEffectiveTiming);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParticipantEffectiveTiming(Timing newParticipantEffectiveTiming) {
		if (newParticipantEffectiveTiming != participantEffectiveTiming) {
			NotificationChain msgs = null;
			if (participantEffectiveTiming != null)
				msgs = ((InternalEObject)participantEffectiveTiming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_TIMING, null, msgs);
			if (newParticipantEffectiveTiming != null)
				msgs = ((InternalEObject)newParticipantEffectiveTiming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_TIMING, null, msgs);
			msgs = basicSetParticipantEffectiveTiming(newParticipantEffectiveTiming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_TIMING, newParticipantEffectiveTiming, newParticipantEffectiveTiming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getParticipantEffectiveTimeFromStart() {
		return participantEffectiveTimeFromStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParticipantEffectiveTimeFromStart(Duration newParticipantEffectiveTimeFromStart, NotificationChain msgs) {
		Duration oldParticipantEffectiveTimeFromStart = participantEffectiveTimeFromStart;
		participantEffectiveTimeFromStart = newParticipantEffectiveTimeFromStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_TIME_FROM_START, oldParticipantEffectiveTimeFromStart, newParticipantEffectiveTimeFromStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParticipantEffectiveTimeFromStart(Duration newParticipantEffectiveTimeFromStart) {
		if (newParticipantEffectiveTimeFromStart != participantEffectiveTimeFromStart) {
			NotificationChain msgs = null;
			if (participantEffectiveTimeFromStart != null)
				msgs = ((InternalEObject)participantEffectiveTimeFromStart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_TIME_FROM_START, null, msgs);
			if (newParticipantEffectiveTimeFromStart != null)
				msgs = ((InternalEObject)newParticipantEffectiveTimeFromStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_TIME_FROM_START, null, msgs);
			msgs = basicSetParticipantEffectiveTimeFromStart(newParticipantEffectiveTimeFromStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_TIME_FROM_START, newParticipantEffectiveTimeFromStart, newParticipantEffectiveTimeFromStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupMeasure getParticipantEffectiveGroupMeasure() {
		return participantEffectiveGroupMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParticipantEffectiveGroupMeasure(GroupMeasure newParticipantEffectiveGroupMeasure, NotificationChain msgs) {
		GroupMeasure oldParticipantEffectiveGroupMeasure = participantEffectiveGroupMeasure;
		participantEffectiveGroupMeasure = newParticipantEffectiveGroupMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_GROUP_MEASURE, oldParticipantEffectiveGroupMeasure, newParticipantEffectiveGroupMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParticipantEffectiveGroupMeasure(GroupMeasure newParticipantEffectiveGroupMeasure) {
		if (newParticipantEffectiveGroupMeasure != participantEffectiveGroupMeasure) {
			NotificationChain msgs = null;
			if (participantEffectiveGroupMeasure != null)
				msgs = ((InternalEObject)participantEffectiveGroupMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_GROUP_MEASURE, null, msgs);
			if (newParticipantEffectiveGroupMeasure != null)
				msgs = ((InternalEObject)newParticipantEffectiveGroupMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_GROUP_MEASURE, null, msgs);
			msgs = basicSetParticipantEffectiveGroupMeasure(newParticipantEffectiveGroupMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_GROUP_MEASURE, newParticipantEffectiveGroupMeasure, newParticipantEffectiveGroupMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__DEFINITION_CODEABLE_CONCEPT:
				return basicSetDefinitionCodeableConcept(null, msgs);
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__DEFINITION_CANONICAL:
				return basicSetDefinitionCanonical(null, msgs);
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__DEFINITION_EXPRESSION:
				return basicSetDefinitionExpression(null, msgs);
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__DEFINITION_DATA_REQUIREMENT:
				return basicSetDefinitionDataRequirement(null, msgs);
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__USAGE_CONTEXT:
				return ((InternalEList<?>)getUsageContext()).basicRemove(otherEnd, msgs);
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__EXCLUDE:
				return basicSetExclude(null, msgs);
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__UNIT_OF_MEASURE:
				return basicSetUnitOfMeasure(null, msgs);
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_DESCRIPTION:
				return basicSetStudyEffectiveDescription(null, msgs);
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_DATE_TIME:
				return basicSetStudyEffectiveDateTime(null, msgs);
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_PERIOD:
				return basicSetStudyEffectivePeriod(null, msgs);
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_DURATION:
				return basicSetStudyEffectiveDuration(null, msgs);
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_TIMING:
				return basicSetStudyEffectiveTiming(null, msgs);
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_TIME_FROM_START:
				return basicSetStudyEffectiveTimeFromStart(null, msgs);
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_GROUP_MEASURE:
				return basicSetStudyEffectiveGroupMeasure(null, msgs);
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DESCRIPTION:
				return basicSetParticipantEffectiveDescription(null, msgs);
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DATE_TIME:
				return basicSetParticipantEffectiveDateTime(null, msgs);
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_PERIOD:
				return basicSetParticipantEffectivePeriod(null, msgs);
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DURATION:
				return basicSetParticipantEffectiveDuration(null, msgs);
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_TIMING:
				return basicSetParticipantEffectiveTiming(null, msgs);
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_TIME_FROM_START:
				return basicSetParticipantEffectiveTimeFromStart(null, msgs);
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_GROUP_MEASURE:
				return basicSetParticipantEffectiveGroupMeasure(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__DEFINITION_CODEABLE_CONCEPT:
				return getDefinitionCodeableConcept();
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__DEFINITION_CANONICAL:
				return getDefinitionCanonical();
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__DEFINITION_EXPRESSION:
				return getDefinitionExpression();
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__DEFINITION_DATA_REQUIREMENT:
				return getDefinitionDataRequirement();
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__USAGE_CONTEXT:
				return getUsageContext();
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__EXCLUDE:
				return getExclude();
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__UNIT_OF_MEASURE:
				return getUnitOfMeasure();
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_DESCRIPTION:
				return getStudyEffectiveDescription();
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_DATE_TIME:
				return getStudyEffectiveDateTime();
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_PERIOD:
				return getStudyEffectivePeriod();
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_DURATION:
				return getStudyEffectiveDuration();
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_TIMING:
				return getStudyEffectiveTiming();
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_TIME_FROM_START:
				return getStudyEffectiveTimeFromStart();
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_GROUP_MEASURE:
				return getStudyEffectiveGroupMeasure();
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DESCRIPTION:
				return getParticipantEffectiveDescription();
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DATE_TIME:
				return getParticipantEffectiveDateTime();
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_PERIOD:
				return getParticipantEffectivePeriod();
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DURATION:
				return getParticipantEffectiveDuration();
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_TIMING:
				return getParticipantEffectiveTiming();
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_TIME_FROM_START:
				return getParticipantEffectiveTimeFromStart();
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_GROUP_MEASURE:
				return getParticipantEffectiveGroupMeasure();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__DEFINITION_CODEABLE_CONCEPT:
				setDefinitionCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__DEFINITION_CANONICAL:
				setDefinitionCanonical((Canonical)newValue);
				return;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__DEFINITION_EXPRESSION:
				setDefinitionExpression((Expression)newValue);
				return;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__DEFINITION_DATA_REQUIREMENT:
				setDefinitionDataRequirement((DataRequirement)newValue);
				return;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__USAGE_CONTEXT:
				getUsageContext().clear();
				getUsageContext().addAll((Collection<? extends UsageContext>)newValue);
				return;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__EXCLUDE:
				setExclude((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__UNIT_OF_MEASURE:
				setUnitOfMeasure((CodeableConcept)newValue);
				return;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_DESCRIPTION:
				setStudyEffectiveDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_DATE_TIME:
				setStudyEffectiveDateTime((DateTime)newValue);
				return;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_PERIOD:
				setStudyEffectivePeriod((Period)newValue);
				return;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_DURATION:
				setStudyEffectiveDuration((Duration)newValue);
				return;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_TIMING:
				setStudyEffectiveTiming((Timing)newValue);
				return;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_TIME_FROM_START:
				setStudyEffectiveTimeFromStart((Duration)newValue);
				return;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_GROUP_MEASURE:
				setStudyEffectiveGroupMeasure((GroupMeasure)newValue);
				return;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DESCRIPTION:
				setParticipantEffectiveDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DATE_TIME:
				setParticipantEffectiveDateTime((DateTime)newValue);
				return;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_PERIOD:
				setParticipantEffectivePeriod((Period)newValue);
				return;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DURATION:
				setParticipantEffectiveDuration((Duration)newValue);
				return;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_TIMING:
				setParticipantEffectiveTiming((Timing)newValue);
				return;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_TIME_FROM_START:
				setParticipantEffectiveTimeFromStart((Duration)newValue);
				return;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_GROUP_MEASURE:
				setParticipantEffectiveGroupMeasure((GroupMeasure)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__DEFINITION_CODEABLE_CONCEPT:
				setDefinitionCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__DEFINITION_CANONICAL:
				setDefinitionCanonical((Canonical)null);
				return;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__DEFINITION_EXPRESSION:
				setDefinitionExpression((Expression)null);
				return;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__DEFINITION_DATA_REQUIREMENT:
				setDefinitionDataRequirement((DataRequirement)null);
				return;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__USAGE_CONTEXT:
				getUsageContext().clear();
				return;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__EXCLUDE:
				setExclude((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__UNIT_OF_MEASURE:
				setUnitOfMeasure((CodeableConcept)null);
				return;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_DESCRIPTION:
				setStudyEffectiveDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_DATE_TIME:
				setStudyEffectiveDateTime((DateTime)null);
				return;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_PERIOD:
				setStudyEffectivePeriod((Period)null);
				return;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_DURATION:
				setStudyEffectiveDuration((Duration)null);
				return;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_TIMING:
				setStudyEffectiveTiming((Timing)null);
				return;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_TIME_FROM_START:
				setStudyEffectiveTimeFromStart((Duration)null);
				return;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_GROUP_MEASURE:
				setStudyEffectiveGroupMeasure((GroupMeasure)null);
				return;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DESCRIPTION:
				setParticipantEffectiveDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DATE_TIME:
				setParticipantEffectiveDateTime((DateTime)null);
				return;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_PERIOD:
				setParticipantEffectivePeriod((Period)null);
				return;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DURATION:
				setParticipantEffectiveDuration((Duration)null);
				return;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_TIMING:
				setParticipantEffectiveTiming((Timing)null);
				return;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_TIME_FROM_START:
				setParticipantEffectiveTimeFromStart((Duration)null);
				return;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_GROUP_MEASURE:
				setParticipantEffectiveGroupMeasure((GroupMeasure)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__DEFINITION_CODEABLE_CONCEPT:
				return definitionCodeableConcept != null;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__DEFINITION_CANONICAL:
				return definitionCanonical != null;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__DEFINITION_EXPRESSION:
				return definitionExpression != null;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__DEFINITION_DATA_REQUIREMENT:
				return definitionDataRequirement != null;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__USAGE_CONTEXT:
				return usageContext != null && !usageContext.isEmpty();
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__EXCLUDE:
				return exclude != null;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__UNIT_OF_MEASURE:
				return unitOfMeasure != null;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_DESCRIPTION:
				return studyEffectiveDescription != null;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_DATE_TIME:
				return studyEffectiveDateTime != null;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_PERIOD:
				return studyEffectivePeriod != null;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_DURATION:
				return studyEffectiveDuration != null;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_TIMING:
				return studyEffectiveTiming != null;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_TIME_FROM_START:
				return studyEffectiveTimeFromStart != null;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__STUDY_EFFECTIVE_GROUP_MEASURE:
				return studyEffectiveGroupMeasure != null;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DESCRIPTION:
				return participantEffectiveDescription != null;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DATE_TIME:
				return participantEffectiveDateTime != null;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_PERIOD:
				return participantEffectivePeriod != null;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DURATION:
				return participantEffectiveDuration != null;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_TIMING:
				return participantEffectiveTiming != null;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_TIME_FROM_START:
				return participantEffectiveTimeFromStart != null;
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_GROUP_MEASURE:
				return participantEffectiveGroupMeasure != null;
		}
		return super.eIsSet(featureID);
	}

} //ResearchElementDefinitionCharacteristicImpl
