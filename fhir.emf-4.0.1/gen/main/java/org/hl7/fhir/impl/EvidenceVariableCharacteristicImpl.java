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
import org.hl7.fhir.EvidenceVariableCharacteristic;
import org.hl7.fhir.Expression;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.GroupMeasure;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Timing;
import org.hl7.fhir.TriggerDefinition;
import org.hl7.fhir.UsageContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evidence Variable Characteristic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariableCharacteristicImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariableCharacteristicImpl#getDefinitionReference <em>Definition Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariableCharacteristicImpl#getDefinitionCanonical <em>Definition Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariableCharacteristicImpl#getDefinitionCodeableConcept <em>Definition Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariableCharacteristicImpl#getDefinitionExpression <em>Definition Expression</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariableCharacteristicImpl#getDefinitionDataRequirement <em>Definition Data Requirement</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariableCharacteristicImpl#getDefinitionTriggerDefinition <em>Definition Trigger Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariableCharacteristicImpl#getUsageContext <em>Usage Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariableCharacteristicImpl#getExclude <em>Exclude</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariableCharacteristicImpl#getParticipantEffectiveDateTime <em>Participant Effective Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariableCharacteristicImpl#getParticipantEffectivePeriod <em>Participant Effective Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariableCharacteristicImpl#getParticipantEffectiveDuration <em>Participant Effective Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariableCharacteristicImpl#getParticipantEffectiveTiming <em>Participant Effective Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariableCharacteristicImpl#getTimeFromStart <em>Time From Start</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EvidenceVariableCharacteristicImpl#getGroupMeasure <em>Group Measure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvidenceVariableCharacteristicImpl extends BackboneElementImpl implements EvidenceVariableCharacteristic {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String description;

	/**
	 * The cached value of the '{@link #getDefinitionReference() <em>Definition Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionReference()
	 * @generated
	 * @ordered
	 */
	protected Reference definitionReference;

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
	 * The cached value of the '{@link #getDefinitionCodeableConcept() <em>Definition Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept definitionCodeableConcept;

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
	 * The cached value of the '{@link #getDefinitionTriggerDefinition() <em>Definition Trigger Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionTriggerDefinition()
	 * @generated
	 * @ordered
	 */
	protected TriggerDefinition definitionTriggerDefinition;

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
	 * The cached value of the '{@link #getTimeFromStart() <em>Time From Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeFromStart()
	 * @generated
	 * @ordered
	 */
	protected Duration timeFromStart;

	/**
	 * The cached value of the '{@link #getGroupMeasure() <em>Group Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupMeasure()
	 * @generated
	 * @ordered
	 */
	protected GroupMeasure groupMeasure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvidenceVariableCharacteristicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getEvidenceVariableCharacteristic();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.hl7.fhir.String newDescription, NotificationChain msgs) {
		org.hl7.fhir.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(org.hl7.fhir.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getDefinitionReference() {
		return definitionReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitionReference(Reference newDefinitionReference, NotificationChain msgs) {
		Reference oldDefinitionReference = definitionReference;
		definitionReference = newDefinitionReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_REFERENCE, oldDefinitionReference, newDefinitionReference);
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
	public void setDefinitionReference(Reference newDefinitionReference) {
		if (newDefinitionReference != definitionReference) {
			NotificationChain msgs = null;
			if (definitionReference != null)
				msgs = ((InternalEObject)definitionReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_REFERENCE, null, msgs);
			if (newDefinitionReference != null)
				msgs = ((InternalEObject)newDefinitionReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_REFERENCE, null, msgs);
			msgs = basicSetDefinitionReference(newDefinitionReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_REFERENCE, newDefinitionReference, newDefinitionReference));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CANONICAL, oldDefinitionCanonical, newDefinitionCanonical);
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
				msgs = ((InternalEObject)definitionCanonical).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CANONICAL, null, msgs);
			if (newDefinitionCanonical != null)
				msgs = ((InternalEObject)newDefinitionCanonical).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CANONICAL, null, msgs);
			msgs = basicSetDefinitionCanonical(newDefinitionCanonical, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CANONICAL, newDefinitionCanonical, newDefinitionCanonical));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CODEABLE_CONCEPT, oldDefinitionCodeableConcept, newDefinitionCodeableConcept);
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
				msgs = ((InternalEObject)definitionCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CODEABLE_CONCEPT, null, msgs);
			if (newDefinitionCodeableConcept != null)
				msgs = ((InternalEObject)newDefinitionCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetDefinitionCodeableConcept(newDefinitionCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CODEABLE_CONCEPT, newDefinitionCodeableConcept, newDefinitionCodeableConcept));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_EXPRESSION, oldDefinitionExpression, newDefinitionExpression);
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
				msgs = ((InternalEObject)definitionExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_EXPRESSION, null, msgs);
			if (newDefinitionExpression != null)
				msgs = ((InternalEObject)newDefinitionExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_EXPRESSION, null, msgs);
			msgs = basicSetDefinitionExpression(newDefinitionExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_EXPRESSION, newDefinitionExpression, newDefinitionExpression));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_DATA_REQUIREMENT, oldDefinitionDataRequirement, newDefinitionDataRequirement);
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
				msgs = ((InternalEObject)definitionDataRequirement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_DATA_REQUIREMENT, null, msgs);
			if (newDefinitionDataRequirement != null)
				msgs = ((InternalEObject)newDefinitionDataRequirement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_DATA_REQUIREMENT, null, msgs);
			msgs = basicSetDefinitionDataRequirement(newDefinitionDataRequirement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_DATA_REQUIREMENT, newDefinitionDataRequirement, newDefinitionDataRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TriggerDefinition getDefinitionTriggerDefinition() {
		return definitionTriggerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitionTriggerDefinition(TriggerDefinition newDefinitionTriggerDefinition, NotificationChain msgs) {
		TriggerDefinition oldDefinitionTriggerDefinition = definitionTriggerDefinition;
		definitionTriggerDefinition = newDefinitionTriggerDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_TRIGGER_DEFINITION, oldDefinitionTriggerDefinition, newDefinitionTriggerDefinition);
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
	public void setDefinitionTriggerDefinition(TriggerDefinition newDefinitionTriggerDefinition) {
		if (newDefinitionTriggerDefinition != definitionTriggerDefinition) {
			NotificationChain msgs = null;
			if (definitionTriggerDefinition != null)
				msgs = ((InternalEObject)definitionTriggerDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_TRIGGER_DEFINITION, null, msgs);
			if (newDefinitionTriggerDefinition != null)
				msgs = ((InternalEObject)newDefinitionTriggerDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_TRIGGER_DEFINITION, null, msgs);
			msgs = basicSetDefinitionTriggerDefinition(newDefinitionTriggerDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_TRIGGER_DEFINITION, newDefinitionTriggerDefinition, newDefinitionTriggerDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UsageContext> getUsageContext() {
		if (usageContext == null) {
			usageContext = new EObjectContainmentEList<UsageContext>(UsageContext.class, this, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__USAGE_CONTEXT);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__EXCLUDE, oldExclude, newExclude);
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
				msgs = ((InternalEObject)exclude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__EXCLUDE, null, msgs);
			if (newExclude != null)
				msgs = ((InternalEObject)newExclude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__EXCLUDE, null, msgs);
			msgs = basicSetExclude(newExclude, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__EXCLUDE, newExclude, newExclude));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DATE_TIME, oldParticipantEffectiveDateTime, newParticipantEffectiveDateTime);
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
				msgs = ((InternalEObject)participantEffectiveDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DATE_TIME, null, msgs);
			if (newParticipantEffectiveDateTime != null)
				msgs = ((InternalEObject)newParticipantEffectiveDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DATE_TIME, null, msgs);
			msgs = basicSetParticipantEffectiveDateTime(newParticipantEffectiveDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DATE_TIME, newParticipantEffectiveDateTime, newParticipantEffectiveDateTime));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_PERIOD, oldParticipantEffectivePeriod, newParticipantEffectivePeriod);
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
				msgs = ((InternalEObject)participantEffectivePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_PERIOD, null, msgs);
			if (newParticipantEffectivePeriod != null)
				msgs = ((InternalEObject)newParticipantEffectivePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_PERIOD, null, msgs);
			msgs = basicSetParticipantEffectivePeriod(newParticipantEffectivePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_PERIOD, newParticipantEffectivePeriod, newParticipantEffectivePeriod));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DURATION, oldParticipantEffectiveDuration, newParticipantEffectiveDuration);
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
				msgs = ((InternalEObject)participantEffectiveDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DURATION, null, msgs);
			if (newParticipantEffectiveDuration != null)
				msgs = ((InternalEObject)newParticipantEffectiveDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DURATION, null, msgs);
			msgs = basicSetParticipantEffectiveDuration(newParticipantEffectiveDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DURATION, newParticipantEffectiveDuration, newParticipantEffectiveDuration));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_TIMING, oldParticipantEffectiveTiming, newParticipantEffectiveTiming);
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
				msgs = ((InternalEObject)participantEffectiveTiming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_TIMING, null, msgs);
			if (newParticipantEffectiveTiming != null)
				msgs = ((InternalEObject)newParticipantEffectiveTiming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_TIMING, null, msgs);
			msgs = basicSetParticipantEffectiveTiming(newParticipantEffectiveTiming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_TIMING, newParticipantEffectiveTiming, newParticipantEffectiveTiming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getTimeFromStart() {
		return timeFromStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeFromStart(Duration newTimeFromStart, NotificationChain msgs) {
		Duration oldTimeFromStart = timeFromStart;
		timeFromStart = newTimeFromStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__TIME_FROM_START, oldTimeFromStart, newTimeFromStart);
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
	public void setTimeFromStart(Duration newTimeFromStart) {
		if (newTimeFromStart != timeFromStart) {
			NotificationChain msgs = null;
			if (timeFromStart != null)
				msgs = ((InternalEObject)timeFromStart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__TIME_FROM_START, null, msgs);
			if (newTimeFromStart != null)
				msgs = ((InternalEObject)newTimeFromStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__TIME_FROM_START, null, msgs);
			msgs = basicSetTimeFromStart(newTimeFromStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__TIME_FROM_START, newTimeFromStart, newTimeFromStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupMeasure getGroupMeasure() {
		return groupMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroupMeasure(GroupMeasure newGroupMeasure, NotificationChain msgs) {
		GroupMeasure oldGroupMeasure = groupMeasure;
		groupMeasure = newGroupMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__GROUP_MEASURE, oldGroupMeasure, newGroupMeasure);
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
	public void setGroupMeasure(GroupMeasure newGroupMeasure) {
		if (newGroupMeasure != groupMeasure) {
			NotificationChain msgs = null;
			if (groupMeasure != null)
				msgs = ((InternalEObject)groupMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__GROUP_MEASURE, null, msgs);
			if (newGroupMeasure != null)
				msgs = ((InternalEObject)newGroupMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__GROUP_MEASURE, null, msgs);
			msgs = basicSetGroupMeasure(newGroupMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__GROUP_MEASURE, newGroupMeasure, newGroupMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_REFERENCE:
				return basicSetDefinitionReference(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CANONICAL:
				return basicSetDefinitionCanonical(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CODEABLE_CONCEPT:
				return basicSetDefinitionCodeableConcept(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_EXPRESSION:
				return basicSetDefinitionExpression(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_DATA_REQUIREMENT:
				return basicSetDefinitionDataRequirement(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_TRIGGER_DEFINITION:
				return basicSetDefinitionTriggerDefinition(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__USAGE_CONTEXT:
				return ((InternalEList<?>)getUsageContext()).basicRemove(otherEnd, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__EXCLUDE:
				return basicSetExclude(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DATE_TIME:
				return basicSetParticipantEffectiveDateTime(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_PERIOD:
				return basicSetParticipantEffectivePeriod(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DURATION:
				return basicSetParticipantEffectiveDuration(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_TIMING:
				return basicSetParticipantEffectiveTiming(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__TIME_FROM_START:
				return basicSetTimeFromStart(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__GROUP_MEASURE:
				return basicSetGroupMeasure(null, msgs);
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
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DESCRIPTION:
				return getDescription();
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_REFERENCE:
				return getDefinitionReference();
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CANONICAL:
				return getDefinitionCanonical();
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CODEABLE_CONCEPT:
				return getDefinitionCodeableConcept();
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_EXPRESSION:
				return getDefinitionExpression();
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_DATA_REQUIREMENT:
				return getDefinitionDataRequirement();
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_TRIGGER_DEFINITION:
				return getDefinitionTriggerDefinition();
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__USAGE_CONTEXT:
				return getUsageContext();
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__EXCLUDE:
				return getExclude();
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DATE_TIME:
				return getParticipantEffectiveDateTime();
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_PERIOD:
				return getParticipantEffectivePeriod();
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DURATION:
				return getParticipantEffectiveDuration();
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_TIMING:
				return getParticipantEffectiveTiming();
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__TIME_FROM_START:
				return getTimeFromStart();
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__GROUP_MEASURE:
				return getGroupMeasure();
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
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_REFERENCE:
				setDefinitionReference((Reference)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CANONICAL:
				setDefinitionCanonical((Canonical)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CODEABLE_CONCEPT:
				setDefinitionCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_EXPRESSION:
				setDefinitionExpression((Expression)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_DATA_REQUIREMENT:
				setDefinitionDataRequirement((DataRequirement)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_TRIGGER_DEFINITION:
				setDefinitionTriggerDefinition((TriggerDefinition)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__USAGE_CONTEXT:
				getUsageContext().clear();
				getUsageContext().addAll((Collection<? extends UsageContext>)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__EXCLUDE:
				setExclude((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DATE_TIME:
				setParticipantEffectiveDateTime((DateTime)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_PERIOD:
				setParticipantEffectivePeriod((Period)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DURATION:
				setParticipantEffectiveDuration((Duration)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_TIMING:
				setParticipantEffectiveTiming((Timing)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__TIME_FROM_START:
				setTimeFromStart((Duration)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__GROUP_MEASURE:
				setGroupMeasure((GroupMeasure)newValue);
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
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_REFERENCE:
				setDefinitionReference((Reference)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CANONICAL:
				setDefinitionCanonical((Canonical)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CODEABLE_CONCEPT:
				setDefinitionCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_EXPRESSION:
				setDefinitionExpression((Expression)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_DATA_REQUIREMENT:
				setDefinitionDataRequirement((DataRequirement)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_TRIGGER_DEFINITION:
				setDefinitionTriggerDefinition((TriggerDefinition)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__USAGE_CONTEXT:
				getUsageContext().clear();
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__EXCLUDE:
				setExclude((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DATE_TIME:
				setParticipantEffectiveDateTime((DateTime)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_PERIOD:
				setParticipantEffectivePeriod((Period)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DURATION:
				setParticipantEffectiveDuration((Duration)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_TIMING:
				setParticipantEffectiveTiming((Timing)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__TIME_FROM_START:
				setTimeFromStart((Duration)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__GROUP_MEASURE:
				setGroupMeasure((GroupMeasure)null);
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
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DESCRIPTION:
				return description != null;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_REFERENCE:
				return definitionReference != null;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CANONICAL:
				return definitionCanonical != null;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CODEABLE_CONCEPT:
				return definitionCodeableConcept != null;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_EXPRESSION:
				return definitionExpression != null;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_DATA_REQUIREMENT:
				return definitionDataRequirement != null;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_TRIGGER_DEFINITION:
				return definitionTriggerDefinition != null;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__USAGE_CONTEXT:
				return usageContext != null && !usageContext.isEmpty();
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__EXCLUDE:
				return exclude != null;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DATE_TIME:
				return participantEffectiveDateTime != null;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_PERIOD:
				return participantEffectivePeriod != null;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_DURATION:
				return participantEffectiveDuration != null;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVE_TIMING:
				return participantEffectiveTiming != null;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__TIME_FROM_START:
				return timeFromStart != null;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__GROUP_MEASURE:
				return groupMeasure != null;
		}
		return super.eIsSet(featureID);
	}

} //EvidenceVariableCharacteristicImpl
