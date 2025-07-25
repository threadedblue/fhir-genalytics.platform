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

import org.hl7.fhir.Annotation;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.ContractAction;
import org.hl7.fhir.ContractSubject;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Timing;
import org.hl7.fhir.UnsignedInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contract Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ContractActionImpl#getDoNotPerform <em>Do Not Perform</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractActionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractActionImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractActionImpl#getIntent <em>Intent</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractActionImpl#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractActionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractActionImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractActionImpl#getContextLinkId <em>Context Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractActionImpl#getOccurrenceDateTime <em>Occurrence Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractActionImpl#getOccurrencePeriod <em>Occurrence Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractActionImpl#getOccurrenceTiming <em>Occurrence Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractActionImpl#getRequester <em>Requester</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractActionImpl#getRequesterLinkId <em>Requester Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractActionImpl#getPerformerType <em>Performer Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractActionImpl#getPerformerRole <em>Performer Role</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractActionImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractActionImpl#getPerformerLinkId <em>Performer Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractActionImpl#getReasonCode <em>Reason Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractActionImpl#getReasonReference <em>Reason Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractActionImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractActionImpl#getReasonLinkId <em>Reason Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractActionImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractActionImpl#getSecurityLabelNumber <em>Security Label Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContractActionImpl extends BackboneElementImpl implements ContractAction {
	/**
	 * The cached value of the '{@link #getDoNotPerform() <em>Do Not Perform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoNotPerform()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean doNotPerform;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractSubject> subject;

	/**
	 * The cached value of the '{@link #getIntent() <em>Intent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntent()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept intent;

	/**
	 * The cached value of the '{@link #getLinkId() <em>Link Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkId()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> linkId;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept status;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Reference context;

	/**
	 * The cached value of the '{@link #getContextLinkId() <em>Context Link Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextLinkId()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> contextLinkId;

	/**
	 * The cached value of the '{@link #getOccurrenceDateTime() <em>Occurrence Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrenceDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime occurrenceDateTime;

	/**
	 * The cached value of the '{@link #getOccurrencePeriod() <em>Occurrence Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrencePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period occurrencePeriod;

	/**
	 * The cached value of the '{@link #getOccurrenceTiming() <em>Occurrence Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrenceTiming()
	 * @generated
	 * @ordered
	 */
	protected Timing occurrenceTiming;

	/**
	 * The cached value of the '{@link #getRequester() <em>Requester</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequester()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> requester;

	/**
	 * The cached value of the '{@link #getRequesterLinkId() <em>Requester Link Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequesterLinkId()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> requesterLinkId;

	/**
	 * The cached value of the '{@link #getPerformerType() <em>Performer Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformerType()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> performerType;

	/**
	 * The cached value of the '{@link #getPerformerRole() <em>Performer Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformerRole()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept performerRole;

	/**
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected Reference performer;

	/**
	 * The cached value of the '{@link #getPerformerLinkId() <em>Performer Link Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformerLinkId()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> performerLinkId;

	/**
	 * The cached value of the '{@link #getReasonCode() <em>Reason Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> reasonCode;

	/**
	 * The cached value of the '{@link #getReasonReference() <em>Reason Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonReference()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> reasonReference;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> reason;

	/**
	 * The cached value of the '{@link #getReasonLinkId() <em>Reason Link Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonLinkId()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> reasonLinkId;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> note;

	/**
	 * The cached value of the '{@link #getSecurityLabelNumber() <em>Security Label Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLabelNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<UnsignedInt> securityLabelNumber;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getContractAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getDoNotPerform() {
		return doNotPerform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoNotPerform(org.hl7.fhir.Boolean newDoNotPerform, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldDoNotPerform = doNotPerform;
		doNotPerform = newDoNotPerform;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_ACTION__DO_NOT_PERFORM, oldDoNotPerform, newDoNotPerform);
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
	public void setDoNotPerform(org.hl7.fhir.Boolean newDoNotPerform) {
		if (newDoNotPerform != doNotPerform) {
			NotificationChain msgs = null;
			if (doNotPerform != null)
				msgs = ((InternalEObject)doNotPerform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_ACTION__DO_NOT_PERFORM, null, msgs);
			if (newDoNotPerform != null)
				msgs = ((InternalEObject)newDoNotPerform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_ACTION__DO_NOT_PERFORM, null, msgs);
			msgs = basicSetDoNotPerform(newDoNotPerform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_ACTION__DO_NOT_PERFORM, newDoNotPerform, newDoNotPerform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_ACTION__TYPE, oldType, newType);
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
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_ACTION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_ACTION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_ACTION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContractSubject> getSubject() {
		if (subject == null) {
			subject = new EObjectContainmentEList<ContractSubject>(ContractSubject.class, this, FhirPackage.CONTRACT_ACTION__SUBJECT);
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getIntent() {
		return intent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntent(CodeableConcept newIntent, NotificationChain msgs) {
		CodeableConcept oldIntent = intent;
		intent = newIntent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_ACTION__INTENT, oldIntent, newIntent);
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
	public void setIntent(CodeableConcept newIntent) {
		if (newIntent != intent) {
			NotificationChain msgs = null;
			if (intent != null)
				msgs = ((InternalEObject)intent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_ACTION__INTENT, null, msgs);
			if (newIntent != null)
				msgs = ((InternalEObject)newIntent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_ACTION__INTENT, null, msgs);
			msgs = basicSetIntent(newIntent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_ACTION__INTENT, newIntent, newIntent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.hl7.fhir.String> getLinkId() {
		if (linkId == null) {
			linkId = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.CONTRACT_ACTION__LINK_ID);
		}
		return linkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(CodeableConcept newStatus, NotificationChain msgs) {
		CodeableConcept oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_ACTION__STATUS, oldStatus, newStatus);
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
	public void setStatus(CodeableConcept newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_ACTION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_ACTION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_ACTION__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(Reference newContext, NotificationChain msgs) {
		Reference oldContext = context;
		context = newContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_ACTION__CONTEXT, oldContext, newContext);
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
	public void setContext(Reference newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_ACTION__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_ACTION__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_ACTION__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.hl7.fhir.String> getContextLinkId() {
		if (contextLinkId == null) {
			contextLinkId = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.CONTRACT_ACTION__CONTEXT_LINK_ID);
		}
		return contextLinkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getOccurrenceDateTime() {
		return occurrenceDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurrenceDateTime(DateTime newOccurrenceDateTime, NotificationChain msgs) {
		DateTime oldOccurrenceDateTime = occurrenceDateTime;
		occurrenceDateTime = newOccurrenceDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_ACTION__OCCURRENCE_DATE_TIME, oldOccurrenceDateTime, newOccurrenceDateTime);
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
	public void setOccurrenceDateTime(DateTime newOccurrenceDateTime) {
		if (newOccurrenceDateTime != occurrenceDateTime) {
			NotificationChain msgs = null;
			if (occurrenceDateTime != null)
				msgs = ((InternalEObject)occurrenceDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_ACTION__OCCURRENCE_DATE_TIME, null, msgs);
			if (newOccurrenceDateTime != null)
				msgs = ((InternalEObject)newOccurrenceDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_ACTION__OCCURRENCE_DATE_TIME, null, msgs);
			msgs = basicSetOccurrenceDateTime(newOccurrenceDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_ACTION__OCCURRENCE_DATE_TIME, newOccurrenceDateTime, newOccurrenceDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getOccurrencePeriod() {
		return occurrencePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurrencePeriod(Period newOccurrencePeriod, NotificationChain msgs) {
		Period oldOccurrencePeriod = occurrencePeriod;
		occurrencePeriod = newOccurrencePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_ACTION__OCCURRENCE_PERIOD, oldOccurrencePeriod, newOccurrencePeriod);
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
	public void setOccurrencePeriod(Period newOccurrencePeriod) {
		if (newOccurrencePeriod != occurrencePeriod) {
			NotificationChain msgs = null;
			if (occurrencePeriod != null)
				msgs = ((InternalEObject)occurrencePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_ACTION__OCCURRENCE_PERIOD, null, msgs);
			if (newOccurrencePeriod != null)
				msgs = ((InternalEObject)newOccurrencePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_ACTION__OCCURRENCE_PERIOD, null, msgs);
			msgs = basicSetOccurrencePeriod(newOccurrencePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_ACTION__OCCURRENCE_PERIOD, newOccurrencePeriod, newOccurrencePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Timing getOccurrenceTiming() {
		return occurrenceTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurrenceTiming(Timing newOccurrenceTiming, NotificationChain msgs) {
		Timing oldOccurrenceTiming = occurrenceTiming;
		occurrenceTiming = newOccurrenceTiming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_ACTION__OCCURRENCE_TIMING, oldOccurrenceTiming, newOccurrenceTiming);
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
	public void setOccurrenceTiming(Timing newOccurrenceTiming) {
		if (newOccurrenceTiming != occurrenceTiming) {
			NotificationChain msgs = null;
			if (occurrenceTiming != null)
				msgs = ((InternalEObject)occurrenceTiming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_ACTION__OCCURRENCE_TIMING, null, msgs);
			if (newOccurrenceTiming != null)
				msgs = ((InternalEObject)newOccurrenceTiming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_ACTION__OCCURRENCE_TIMING, null, msgs);
			msgs = basicSetOccurrenceTiming(newOccurrenceTiming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_ACTION__OCCURRENCE_TIMING, newOccurrenceTiming, newOccurrenceTiming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getRequester() {
		if (requester == null) {
			requester = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CONTRACT_ACTION__REQUESTER);
		}
		return requester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.hl7.fhir.String> getRequesterLinkId() {
		if (requesterLinkId == null) {
			requesterLinkId = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.CONTRACT_ACTION__REQUESTER_LINK_ID);
		}
		return requesterLinkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getPerformerType() {
		if (performerType == null) {
			performerType = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CONTRACT_ACTION__PERFORMER_TYPE);
		}
		return performerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getPerformerRole() {
		return performerRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformerRole(CodeableConcept newPerformerRole, NotificationChain msgs) {
		CodeableConcept oldPerformerRole = performerRole;
		performerRole = newPerformerRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_ACTION__PERFORMER_ROLE, oldPerformerRole, newPerformerRole);
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
	public void setPerformerRole(CodeableConcept newPerformerRole) {
		if (newPerformerRole != performerRole) {
			NotificationChain msgs = null;
			if (performerRole != null)
				msgs = ((InternalEObject)performerRole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_ACTION__PERFORMER_ROLE, null, msgs);
			if (newPerformerRole != null)
				msgs = ((InternalEObject)newPerformerRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_ACTION__PERFORMER_ROLE, null, msgs);
			msgs = basicSetPerformerRole(newPerformerRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_ACTION__PERFORMER_ROLE, newPerformerRole, newPerformerRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getPerformer() {
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformer(Reference newPerformer, NotificationChain msgs) {
		Reference oldPerformer = performer;
		performer = newPerformer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_ACTION__PERFORMER, oldPerformer, newPerformer);
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
	public void setPerformer(Reference newPerformer) {
		if (newPerformer != performer) {
			NotificationChain msgs = null;
			if (performer != null)
				msgs = ((InternalEObject)performer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_ACTION__PERFORMER, null, msgs);
			if (newPerformer != null)
				msgs = ((InternalEObject)newPerformer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_ACTION__PERFORMER, null, msgs);
			msgs = basicSetPerformer(newPerformer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_ACTION__PERFORMER, newPerformer, newPerformer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.hl7.fhir.String> getPerformerLinkId() {
		if (performerLinkId == null) {
			performerLinkId = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.CONTRACT_ACTION__PERFORMER_LINK_ID);
		}
		return performerLinkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getReasonCode() {
		if (reasonCode == null) {
			reasonCode = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CONTRACT_ACTION__REASON_CODE);
		}
		return reasonCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getReasonReference() {
		if (reasonReference == null) {
			reasonReference = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CONTRACT_ACTION__REASON_REFERENCE);
		}
		return reasonReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.hl7.fhir.String> getReason() {
		if (reason == null) {
			reason = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.CONTRACT_ACTION__REASON);
		}
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.hl7.fhir.String> getReasonLinkId() {
		if (reasonLinkId == null) {
			reasonLinkId = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.CONTRACT_ACTION__REASON_LINK_ID);
		}
		return reasonLinkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.CONTRACT_ACTION__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnsignedInt> getSecurityLabelNumber() {
		if (securityLabelNumber == null) {
			securityLabelNumber = new EObjectContainmentEList<UnsignedInt>(UnsignedInt.class, this, FhirPackage.CONTRACT_ACTION__SECURITY_LABEL_NUMBER);
		}
		return securityLabelNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CONTRACT_ACTION__DO_NOT_PERFORM:
				return basicSetDoNotPerform(null, msgs);
			case FhirPackage.CONTRACT_ACTION__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.CONTRACT_ACTION__SUBJECT:
				return ((InternalEList<?>)getSubject()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT_ACTION__INTENT:
				return basicSetIntent(null, msgs);
			case FhirPackage.CONTRACT_ACTION__LINK_ID:
				return ((InternalEList<?>)getLinkId()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT_ACTION__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.CONTRACT_ACTION__CONTEXT:
				return basicSetContext(null, msgs);
			case FhirPackage.CONTRACT_ACTION__CONTEXT_LINK_ID:
				return ((InternalEList<?>)getContextLinkId()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT_ACTION__OCCURRENCE_DATE_TIME:
				return basicSetOccurrenceDateTime(null, msgs);
			case FhirPackage.CONTRACT_ACTION__OCCURRENCE_PERIOD:
				return basicSetOccurrencePeriod(null, msgs);
			case FhirPackage.CONTRACT_ACTION__OCCURRENCE_TIMING:
				return basicSetOccurrenceTiming(null, msgs);
			case FhirPackage.CONTRACT_ACTION__REQUESTER:
				return ((InternalEList<?>)getRequester()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT_ACTION__REQUESTER_LINK_ID:
				return ((InternalEList<?>)getRequesterLinkId()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT_ACTION__PERFORMER_TYPE:
				return ((InternalEList<?>)getPerformerType()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT_ACTION__PERFORMER_ROLE:
				return basicSetPerformerRole(null, msgs);
			case FhirPackage.CONTRACT_ACTION__PERFORMER:
				return basicSetPerformer(null, msgs);
			case FhirPackage.CONTRACT_ACTION__PERFORMER_LINK_ID:
				return ((InternalEList<?>)getPerformerLinkId()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT_ACTION__REASON_CODE:
				return ((InternalEList<?>)getReasonCode()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT_ACTION__REASON_REFERENCE:
				return ((InternalEList<?>)getReasonReference()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT_ACTION__REASON:
				return ((InternalEList<?>)getReason()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT_ACTION__REASON_LINK_ID:
				return ((InternalEList<?>)getReasonLinkId()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT_ACTION__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT_ACTION__SECURITY_LABEL_NUMBER:
				return ((InternalEList<?>)getSecurityLabelNumber()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CONTRACT_ACTION__DO_NOT_PERFORM:
				return getDoNotPerform();
			case FhirPackage.CONTRACT_ACTION__TYPE:
				return getType();
			case FhirPackage.CONTRACT_ACTION__SUBJECT:
				return getSubject();
			case FhirPackage.CONTRACT_ACTION__INTENT:
				return getIntent();
			case FhirPackage.CONTRACT_ACTION__LINK_ID:
				return getLinkId();
			case FhirPackage.CONTRACT_ACTION__STATUS:
				return getStatus();
			case FhirPackage.CONTRACT_ACTION__CONTEXT:
				return getContext();
			case FhirPackage.CONTRACT_ACTION__CONTEXT_LINK_ID:
				return getContextLinkId();
			case FhirPackage.CONTRACT_ACTION__OCCURRENCE_DATE_TIME:
				return getOccurrenceDateTime();
			case FhirPackage.CONTRACT_ACTION__OCCURRENCE_PERIOD:
				return getOccurrencePeriod();
			case FhirPackage.CONTRACT_ACTION__OCCURRENCE_TIMING:
				return getOccurrenceTiming();
			case FhirPackage.CONTRACT_ACTION__REQUESTER:
				return getRequester();
			case FhirPackage.CONTRACT_ACTION__REQUESTER_LINK_ID:
				return getRequesterLinkId();
			case FhirPackage.CONTRACT_ACTION__PERFORMER_TYPE:
				return getPerformerType();
			case FhirPackage.CONTRACT_ACTION__PERFORMER_ROLE:
				return getPerformerRole();
			case FhirPackage.CONTRACT_ACTION__PERFORMER:
				return getPerformer();
			case FhirPackage.CONTRACT_ACTION__PERFORMER_LINK_ID:
				return getPerformerLinkId();
			case FhirPackage.CONTRACT_ACTION__REASON_CODE:
				return getReasonCode();
			case FhirPackage.CONTRACT_ACTION__REASON_REFERENCE:
				return getReasonReference();
			case FhirPackage.CONTRACT_ACTION__REASON:
				return getReason();
			case FhirPackage.CONTRACT_ACTION__REASON_LINK_ID:
				return getReasonLinkId();
			case FhirPackage.CONTRACT_ACTION__NOTE:
				return getNote();
			case FhirPackage.CONTRACT_ACTION__SECURITY_LABEL_NUMBER:
				return getSecurityLabelNumber();
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
			case FhirPackage.CONTRACT_ACTION__DO_NOT_PERFORM:
				setDoNotPerform((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.CONTRACT_ACTION__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.CONTRACT_ACTION__SUBJECT:
				getSubject().clear();
				getSubject().addAll((Collection<? extends ContractSubject>)newValue);
				return;
			case FhirPackage.CONTRACT_ACTION__INTENT:
				setIntent((CodeableConcept)newValue);
				return;
			case FhirPackage.CONTRACT_ACTION__LINK_ID:
				getLinkId().clear();
				getLinkId().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.CONTRACT_ACTION__STATUS:
				setStatus((CodeableConcept)newValue);
				return;
			case FhirPackage.CONTRACT_ACTION__CONTEXT:
				setContext((Reference)newValue);
				return;
			case FhirPackage.CONTRACT_ACTION__CONTEXT_LINK_ID:
				getContextLinkId().clear();
				getContextLinkId().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.CONTRACT_ACTION__OCCURRENCE_DATE_TIME:
				setOccurrenceDateTime((DateTime)newValue);
				return;
			case FhirPackage.CONTRACT_ACTION__OCCURRENCE_PERIOD:
				setOccurrencePeriod((Period)newValue);
				return;
			case FhirPackage.CONTRACT_ACTION__OCCURRENCE_TIMING:
				setOccurrenceTiming((Timing)newValue);
				return;
			case FhirPackage.CONTRACT_ACTION__REQUESTER:
				getRequester().clear();
				getRequester().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CONTRACT_ACTION__REQUESTER_LINK_ID:
				getRequesterLinkId().clear();
				getRequesterLinkId().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.CONTRACT_ACTION__PERFORMER_TYPE:
				getPerformerType().clear();
				getPerformerType().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CONTRACT_ACTION__PERFORMER_ROLE:
				setPerformerRole((CodeableConcept)newValue);
				return;
			case FhirPackage.CONTRACT_ACTION__PERFORMER:
				setPerformer((Reference)newValue);
				return;
			case FhirPackage.CONTRACT_ACTION__PERFORMER_LINK_ID:
				getPerformerLinkId().clear();
				getPerformerLinkId().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.CONTRACT_ACTION__REASON_CODE:
				getReasonCode().clear();
				getReasonCode().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CONTRACT_ACTION__REASON_REFERENCE:
				getReasonReference().clear();
				getReasonReference().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CONTRACT_ACTION__REASON:
				getReason().clear();
				getReason().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.CONTRACT_ACTION__REASON_LINK_ID:
				getReasonLinkId().clear();
				getReasonLinkId().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.CONTRACT_ACTION__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.CONTRACT_ACTION__SECURITY_LABEL_NUMBER:
				getSecurityLabelNumber().clear();
				getSecurityLabelNumber().addAll((Collection<? extends UnsignedInt>)newValue);
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
			case FhirPackage.CONTRACT_ACTION__DO_NOT_PERFORM:
				setDoNotPerform((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.CONTRACT_ACTION__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.CONTRACT_ACTION__SUBJECT:
				getSubject().clear();
				return;
			case FhirPackage.CONTRACT_ACTION__INTENT:
				setIntent((CodeableConcept)null);
				return;
			case FhirPackage.CONTRACT_ACTION__LINK_ID:
				getLinkId().clear();
				return;
			case FhirPackage.CONTRACT_ACTION__STATUS:
				setStatus((CodeableConcept)null);
				return;
			case FhirPackage.CONTRACT_ACTION__CONTEXT:
				setContext((Reference)null);
				return;
			case FhirPackage.CONTRACT_ACTION__CONTEXT_LINK_ID:
				getContextLinkId().clear();
				return;
			case FhirPackage.CONTRACT_ACTION__OCCURRENCE_DATE_TIME:
				setOccurrenceDateTime((DateTime)null);
				return;
			case FhirPackage.CONTRACT_ACTION__OCCURRENCE_PERIOD:
				setOccurrencePeriod((Period)null);
				return;
			case FhirPackage.CONTRACT_ACTION__OCCURRENCE_TIMING:
				setOccurrenceTiming((Timing)null);
				return;
			case FhirPackage.CONTRACT_ACTION__REQUESTER:
				getRequester().clear();
				return;
			case FhirPackage.CONTRACT_ACTION__REQUESTER_LINK_ID:
				getRequesterLinkId().clear();
				return;
			case FhirPackage.CONTRACT_ACTION__PERFORMER_TYPE:
				getPerformerType().clear();
				return;
			case FhirPackage.CONTRACT_ACTION__PERFORMER_ROLE:
				setPerformerRole((CodeableConcept)null);
				return;
			case FhirPackage.CONTRACT_ACTION__PERFORMER:
				setPerformer((Reference)null);
				return;
			case FhirPackage.CONTRACT_ACTION__PERFORMER_LINK_ID:
				getPerformerLinkId().clear();
				return;
			case FhirPackage.CONTRACT_ACTION__REASON_CODE:
				getReasonCode().clear();
				return;
			case FhirPackage.CONTRACT_ACTION__REASON_REFERENCE:
				getReasonReference().clear();
				return;
			case FhirPackage.CONTRACT_ACTION__REASON:
				getReason().clear();
				return;
			case FhirPackage.CONTRACT_ACTION__REASON_LINK_ID:
				getReasonLinkId().clear();
				return;
			case FhirPackage.CONTRACT_ACTION__NOTE:
				getNote().clear();
				return;
			case FhirPackage.CONTRACT_ACTION__SECURITY_LABEL_NUMBER:
				getSecurityLabelNumber().clear();
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
			case FhirPackage.CONTRACT_ACTION__DO_NOT_PERFORM:
				return doNotPerform != null;
			case FhirPackage.CONTRACT_ACTION__TYPE:
				return type != null;
			case FhirPackage.CONTRACT_ACTION__SUBJECT:
				return subject != null && !subject.isEmpty();
			case FhirPackage.CONTRACT_ACTION__INTENT:
				return intent != null;
			case FhirPackage.CONTRACT_ACTION__LINK_ID:
				return linkId != null && !linkId.isEmpty();
			case FhirPackage.CONTRACT_ACTION__STATUS:
				return status != null;
			case FhirPackage.CONTRACT_ACTION__CONTEXT:
				return context != null;
			case FhirPackage.CONTRACT_ACTION__CONTEXT_LINK_ID:
				return contextLinkId != null && !contextLinkId.isEmpty();
			case FhirPackage.CONTRACT_ACTION__OCCURRENCE_DATE_TIME:
				return occurrenceDateTime != null;
			case FhirPackage.CONTRACT_ACTION__OCCURRENCE_PERIOD:
				return occurrencePeriod != null;
			case FhirPackage.CONTRACT_ACTION__OCCURRENCE_TIMING:
				return occurrenceTiming != null;
			case FhirPackage.CONTRACT_ACTION__REQUESTER:
				return requester != null && !requester.isEmpty();
			case FhirPackage.CONTRACT_ACTION__REQUESTER_LINK_ID:
				return requesterLinkId != null && !requesterLinkId.isEmpty();
			case FhirPackage.CONTRACT_ACTION__PERFORMER_TYPE:
				return performerType != null && !performerType.isEmpty();
			case FhirPackage.CONTRACT_ACTION__PERFORMER_ROLE:
				return performerRole != null;
			case FhirPackage.CONTRACT_ACTION__PERFORMER:
				return performer != null;
			case FhirPackage.CONTRACT_ACTION__PERFORMER_LINK_ID:
				return performerLinkId != null && !performerLinkId.isEmpty();
			case FhirPackage.CONTRACT_ACTION__REASON_CODE:
				return reasonCode != null && !reasonCode.isEmpty();
			case FhirPackage.CONTRACT_ACTION__REASON_REFERENCE:
				return reasonReference != null && !reasonReference.isEmpty();
			case FhirPackage.CONTRACT_ACTION__REASON:
				return reason != null && !reason.isEmpty();
			case FhirPackage.CONTRACT_ACTION__REASON_LINK_ID:
				return reasonLinkId != null && !reasonLinkId.isEmpty();
			case FhirPackage.CONTRACT_ACTION__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.CONTRACT_ACTION__SECURITY_LABEL_NUMBER:
				return securityLabelNumber != null && !securityLabelNumber.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContractActionImpl
