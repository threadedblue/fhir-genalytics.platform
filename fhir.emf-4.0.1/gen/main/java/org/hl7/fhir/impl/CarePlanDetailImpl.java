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
import org.hl7.fhir.CarePlanActivityKind;
import org.hl7.fhir.CarePlanActivityStatus;
import org.hl7.fhir.CarePlanDetail;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Period;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Timing;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Care Plan Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CarePlanDetailImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanDetailImpl#getInstantiatesCanonical <em>Instantiates Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanDetailImpl#getInstantiatesUri <em>Instantiates Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanDetailImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanDetailImpl#getReasonCode <em>Reason Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanDetailImpl#getReasonReference <em>Reason Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanDetailImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanDetailImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanDetailImpl#getStatusReason <em>Status Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanDetailImpl#getDoNotPerform <em>Do Not Perform</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanDetailImpl#getScheduledTiming <em>Scheduled Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanDetailImpl#getScheduledPeriod <em>Scheduled Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanDetailImpl#getScheduledString <em>Scheduled String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanDetailImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanDetailImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanDetailImpl#getProductCodeableConcept <em>Product Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanDetailImpl#getProductReference <em>Product Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanDetailImpl#getDailyAmount <em>Daily Amount</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanDetailImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanDetailImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CarePlanDetailImpl extends BackboneElementImpl implements CarePlanDetail {
	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected CarePlanActivityKind kind;

	/**
	 * The cached value of the '{@link #getInstantiatesCanonical() <em>Instantiates Canonical</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatesCanonical()
	 * @generated
	 * @ordered
	 */
	protected EList<Canonical> instantiatesCanonical;

	/**
	 * The cached value of the '{@link #getInstantiatesUri() <em>Instantiates Uri</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatesUri()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> instantiatesUri;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

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
	 * The cached value of the '{@link #getGoal() <em>Goal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> goal;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected CarePlanActivityStatus status;

	/**
	 * The cached value of the '{@link #getStatusReason() <em>Status Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept statusReason;

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
	 * The cached value of the '{@link #getScheduledTiming() <em>Scheduled Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledTiming()
	 * @generated
	 * @ordered
	 */
	protected Timing scheduledTiming;

	/**
	 * The cached value of the '{@link #getScheduledPeriod() <em>Scheduled Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period scheduledPeriod;

	/**
	 * The cached value of the '{@link #getScheduledString() <em>Scheduled String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String scheduledString;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Reference location;

	/**
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> performer;

	/**
	 * The cached value of the '{@link #getProductCodeableConcept() <em>Product Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept productCodeableConcept;

	/**
	 * The cached value of the '{@link #getProductReference() <em>Product Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductReference()
	 * @generated
	 * @ordered
	 */
	protected Reference productReference;

	/**
	 * The cached value of the '{@link #getDailyAmount() <em>Daily Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDailyAmount()
	 * @generated
	 * @ordered
	 */
	protected Quantity dailyAmount;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity quantity;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarePlanDetailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCarePlanDetail();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CarePlanActivityKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKind(CarePlanActivityKind newKind, NotificationChain msgs) {
		CarePlanActivityKind oldKind = kind;
		kind = newKind;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__KIND, oldKind, newKind);
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
	public void setKind(CarePlanActivityKind newKind) {
		if (newKind != kind) {
			NotificationChain msgs = null;
			if (kind != null)
				msgs = ((InternalEObject)kind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__KIND, null, msgs);
			if (newKind != null)
				msgs = ((InternalEObject)newKind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__KIND, null, msgs);
			msgs = basicSetKind(newKind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__KIND, newKind, newKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Canonical> getInstantiatesCanonical() {
		if (instantiatesCanonical == null) {
			instantiatesCanonical = new EObjectContainmentEList<Canonical>(Canonical.class, this, FhirPackage.CARE_PLAN_DETAIL__INSTANTIATES_CANONICAL);
		}
		return instantiatesCanonical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Uri> getInstantiatesUri() {
		if (instantiatesUri == null) {
			instantiatesUri = new EObjectContainmentEList<Uri>(Uri.class, this, FhirPackage.CARE_PLAN_DETAIL__INSTANTIATES_URI);
		}
		return instantiatesUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CodeableConcept newCode, NotificationChain msgs) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__CODE, oldCode, newCode);
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
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getReasonCode() {
		if (reasonCode == null) {
			reasonCode = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CARE_PLAN_DETAIL__REASON_CODE);
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
			reasonReference = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CARE_PLAN_DETAIL__REASON_REFERENCE);
		}
		return reasonReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getGoal() {
		if (goal == null) {
			goal = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CARE_PLAN_DETAIL__GOAL);
		}
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CarePlanActivityStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(CarePlanActivityStatus newStatus, NotificationChain msgs) {
		CarePlanActivityStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__STATUS, oldStatus, newStatus);
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
	public void setStatus(CarePlanActivityStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getStatusReason() {
		return statusReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatusReason(CodeableConcept newStatusReason, NotificationChain msgs) {
		CodeableConcept oldStatusReason = statusReason;
		statusReason = newStatusReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__STATUS_REASON, oldStatusReason, newStatusReason);
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
	public void setStatusReason(CodeableConcept newStatusReason) {
		if (newStatusReason != statusReason) {
			NotificationChain msgs = null;
			if (statusReason != null)
				msgs = ((InternalEObject)statusReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__STATUS_REASON, null, msgs);
			if (newStatusReason != null)
				msgs = ((InternalEObject)newStatusReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__STATUS_REASON, null, msgs);
			msgs = basicSetStatusReason(newStatusReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__STATUS_REASON, newStatusReason, newStatusReason));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__DO_NOT_PERFORM, oldDoNotPerform, newDoNotPerform);
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
				msgs = ((InternalEObject)doNotPerform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__DO_NOT_PERFORM, null, msgs);
			if (newDoNotPerform != null)
				msgs = ((InternalEObject)newDoNotPerform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__DO_NOT_PERFORM, null, msgs);
			msgs = basicSetDoNotPerform(newDoNotPerform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__DO_NOT_PERFORM, newDoNotPerform, newDoNotPerform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Timing getScheduledTiming() {
		return scheduledTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheduledTiming(Timing newScheduledTiming, NotificationChain msgs) {
		Timing oldScheduledTiming = scheduledTiming;
		scheduledTiming = newScheduledTiming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_TIMING, oldScheduledTiming, newScheduledTiming);
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
	public void setScheduledTiming(Timing newScheduledTiming) {
		if (newScheduledTiming != scheduledTiming) {
			NotificationChain msgs = null;
			if (scheduledTiming != null)
				msgs = ((InternalEObject)scheduledTiming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_TIMING, null, msgs);
			if (newScheduledTiming != null)
				msgs = ((InternalEObject)newScheduledTiming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_TIMING, null, msgs);
			msgs = basicSetScheduledTiming(newScheduledTiming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_TIMING, newScheduledTiming, newScheduledTiming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getScheduledPeriod() {
		return scheduledPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheduledPeriod(Period newScheduledPeriod, NotificationChain msgs) {
		Period oldScheduledPeriod = scheduledPeriod;
		scheduledPeriod = newScheduledPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_PERIOD, oldScheduledPeriod, newScheduledPeriod);
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
	public void setScheduledPeriod(Period newScheduledPeriod) {
		if (newScheduledPeriod != scheduledPeriod) {
			NotificationChain msgs = null;
			if (scheduledPeriod != null)
				msgs = ((InternalEObject)scheduledPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_PERIOD, null, msgs);
			if (newScheduledPeriod != null)
				msgs = ((InternalEObject)newScheduledPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_PERIOD, null, msgs);
			msgs = basicSetScheduledPeriod(newScheduledPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_PERIOD, newScheduledPeriod, newScheduledPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getScheduledString() {
		return scheduledString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheduledString(org.hl7.fhir.String newScheduledString, NotificationChain msgs) {
		org.hl7.fhir.String oldScheduledString = scheduledString;
		scheduledString = newScheduledString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_STRING, oldScheduledString, newScheduledString);
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
	public void setScheduledString(org.hl7.fhir.String newScheduledString) {
		if (newScheduledString != scheduledString) {
			NotificationChain msgs = null;
			if (scheduledString != null)
				msgs = ((InternalEObject)scheduledString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_STRING, null, msgs);
			if (newScheduledString != null)
				msgs = ((InternalEObject)newScheduledString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_STRING, null, msgs);
			msgs = basicSetScheduledString(newScheduledString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_STRING, newScheduledString, newScheduledString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Reference newLocation, NotificationChain msgs) {
		Reference oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__LOCATION, oldLocation, newLocation);
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
	public void setLocation(Reference newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getPerformer() {
		if (performer == null) {
			performer = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CARE_PLAN_DETAIL__PERFORMER);
		}
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getProductCodeableConcept() {
		return productCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductCodeableConcept(CodeableConcept newProductCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldProductCodeableConcept = productCodeableConcept;
		productCodeableConcept = newProductCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__PRODUCT_CODEABLE_CONCEPT, oldProductCodeableConcept, newProductCodeableConcept);
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
	public void setProductCodeableConcept(CodeableConcept newProductCodeableConcept) {
		if (newProductCodeableConcept != productCodeableConcept) {
			NotificationChain msgs = null;
			if (productCodeableConcept != null)
				msgs = ((InternalEObject)productCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__PRODUCT_CODEABLE_CONCEPT, null, msgs);
			if (newProductCodeableConcept != null)
				msgs = ((InternalEObject)newProductCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__PRODUCT_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetProductCodeableConcept(newProductCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__PRODUCT_CODEABLE_CONCEPT, newProductCodeableConcept, newProductCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getProductReference() {
		return productReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductReference(Reference newProductReference, NotificationChain msgs) {
		Reference oldProductReference = productReference;
		productReference = newProductReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__PRODUCT_REFERENCE, oldProductReference, newProductReference);
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
	public void setProductReference(Reference newProductReference) {
		if (newProductReference != productReference) {
			NotificationChain msgs = null;
			if (productReference != null)
				msgs = ((InternalEObject)productReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__PRODUCT_REFERENCE, null, msgs);
			if (newProductReference != null)
				msgs = ((InternalEObject)newProductReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__PRODUCT_REFERENCE, null, msgs);
			msgs = basicSetProductReference(newProductReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__PRODUCT_REFERENCE, newProductReference, newProductReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getDailyAmount() {
		return dailyAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDailyAmount(Quantity newDailyAmount, NotificationChain msgs) {
		Quantity oldDailyAmount = dailyAmount;
		dailyAmount = newDailyAmount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__DAILY_AMOUNT, oldDailyAmount, newDailyAmount);
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
	public void setDailyAmount(Quantity newDailyAmount) {
		if (newDailyAmount != dailyAmount) {
			NotificationChain msgs = null;
			if (dailyAmount != null)
				msgs = ((InternalEObject)dailyAmount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__DAILY_AMOUNT, null, msgs);
			if (newDailyAmount != null)
				msgs = ((InternalEObject)newDailyAmount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__DAILY_AMOUNT, null, msgs);
			msgs = basicSetDailyAmount(newDailyAmount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__DAILY_AMOUNT, newDailyAmount, newDailyAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(Quantity newQuantity, NotificationChain msgs) {
		Quantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__QUANTITY, oldQuantity, newQuantity);
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
	public void setQuantity(Quantity newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__QUANTITY, newQuantity, newQuantity));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_DETAIL__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_DETAIL__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CARE_PLAN_DETAIL__KIND:
				return basicSetKind(null, msgs);
			case FhirPackage.CARE_PLAN_DETAIL__INSTANTIATES_CANONICAL:
				return ((InternalEList<?>)getInstantiatesCanonical()).basicRemove(otherEnd, msgs);
			case FhirPackage.CARE_PLAN_DETAIL__INSTANTIATES_URI:
				return ((InternalEList<?>)getInstantiatesUri()).basicRemove(otherEnd, msgs);
			case FhirPackage.CARE_PLAN_DETAIL__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.CARE_PLAN_DETAIL__REASON_CODE:
				return ((InternalEList<?>)getReasonCode()).basicRemove(otherEnd, msgs);
			case FhirPackage.CARE_PLAN_DETAIL__REASON_REFERENCE:
				return ((InternalEList<?>)getReasonReference()).basicRemove(otherEnd, msgs);
			case FhirPackage.CARE_PLAN_DETAIL__GOAL:
				return ((InternalEList<?>)getGoal()).basicRemove(otherEnd, msgs);
			case FhirPackage.CARE_PLAN_DETAIL__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.CARE_PLAN_DETAIL__STATUS_REASON:
				return basicSetStatusReason(null, msgs);
			case FhirPackage.CARE_PLAN_DETAIL__DO_NOT_PERFORM:
				return basicSetDoNotPerform(null, msgs);
			case FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_TIMING:
				return basicSetScheduledTiming(null, msgs);
			case FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_PERIOD:
				return basicSetScheduledPeriod(null, msgs);
			case FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_STRING:
				return basicSetScheduledString(null, msgs);
			case FhirPackage.CARE_PLAN_DETAIL__LOCATION:
				return basicSetLocation(null, msgs);
			case FhirPackage.CARE_PLAN_DETAIL__PERFORMER:
				return ((InternalEList<?>)getPerformer()).basicRemove(otherEnd, msgs);
			case FhirPackage.CARE_PLAN_DETAIL__PRODUCT_CODEABLE_CONCEPT:
				return basicSetProductCodeableConcept(null, msgs);
			case FhirPackage.CARE_PLAN_DETAIL__PRODUCT_REFERENCE:
				return basicSetProductReference(null, msgs);
			case FhirPackage.CARE_PLAN_DETAIL__DAILY_AMOUNT:
				return basicSetDailyAmount(null, msgs);
			case FhirPackage.CARE_PLAN_DETAIL__QUANTITY:
				return basicSetQuantity(null, msgs);
			case FhirPackage.CARE_PLAN_DETAIL__DESCRIPTION:
				return basicSetDescription(null, msgs);
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
			case FhirPackage.CARE_PLAN_DETAIL__KIND:
				return getKind();
			case FhirPackage.CARE_PLAN_DETAIL__INSTANTIATES_CANONICAL:
				return getInstantiatesCanonical();
			case FhirPackage.CARE_PLAN_DETAIL__INSTANTIATES_URI:
				return getInstantiatesUri();
			case FhirPackage.CARE_PLAN_DETAIL__CODE:
				return getCode();
			case FhirPackage.CARE_PLAN_DETAIL__REASON_CODE:
				return getReasonCode();
			case FhirPackage.CARE_PLAN_DETAIL__REASON_REFERENCE:
				return getReasonReference();
			case FhirPackage.CARE_PLAN_DETAIL__GOAL:
				return getGoal();
			case FhirPackage.CARE_PLAN_DETAIL__STATUS:
				return getStatus();
			case FhirPackage.CARE_PLAN_DETAIL__STATUS_REASON:
				return getStatusReason();
			case FhirPackage.CARE_PLAN_DETAIL__DO_NOT_PERFORM:
				return getDoNotPerform();
			case FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_TIMING:
				return getScheduledTiming();
			case FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_PERIOD:
				return getScheduledPeriod();
			case FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_STRING:
				return getScheduledString();
			case FhirPackage.CARE_PLAN_DETAIL__LOCATION:
				return getLocation();
			case FhirPackage.CARE_PLAN_DETAIL__PERFORMER:
				return getPerformer();
			case FhirPackage.CARE_PLAN_DETAIL__PRODUCT_CODEABLE_CONCEPT:
				return getProductCodeableConcept();
			case FhirPackage.CARE_PLAN_DETAIL__PRODUCT_REFERENCE:
				return getProductReference();
			case FhirPackage.CARE_PLAN_DETAIL__DAILY_AMOUNT:
				return getDailyAmount();
			case FhirPackage.CARE_PLAN_DETAIL__QUANTITY:
				return getQuantity();
			case FhirPackage.CARE_PLAN_DETAIL__DESCRIPTION:
				return getDescription();
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
			case FhirPackage.CARE_PLAN_DETAIL__KIND:
				setKind((CarePlanActivityKind)newValue);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__INSTANTIATES_CANONICAL:
				getInstantiatesCanonical().clear();
				getInstantiatesCanonical().addAll((Collection<? extends Canonical>)newValue);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__INSTANTIATES_URI:
				getInstantiatesUri().clear();
				getInstantiatesUri().addAll((Collection<? extends Uri>)newValue);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__REASON_CODE:
				getReasonCode().clear();
				getReasonCode().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__REASON_REFERENCE:
				getReasonReference().clear();
				getReasonReference().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__GOAL:
				getGoal().clear();
				getGoal().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__STATUS:
				setStatus((CarePlanActivityStatus)newValue);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__STATUS_REASON:
				setStatusReason((CodeableConcept)newValue);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__DO_NOT_PERFORM:
				setDoNotPerform((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_TIMING:
				setScheduledTiming((Timing)newValue);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_PERIOD:
				setScheduledPeriod((Period)newValue);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_STRING:
				setScheduledString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__LOCATION:
				setLocation((Reference)newValue);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__PERFORMER:
				getPerformer().clear();
				getPerformer().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__PRODUCT_CODEABLE_CONCEPT:
				setProductCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__PRODUCT_REFERENCE:
				setProductReference((Reference)newValue);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__DAILY_AMOUNT:
				setDailyAmount((Quantity)newValue);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
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
			case FhirPackage.CARE_PLAN_DETAIL__KIND:
				setKind((CarePlanActivityKind)null);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__INSTANTIATES_CANONICAL:
				getInstantiatesCanonical().clear();
				return;
			case FhirPackage.CARE_PLAN_DETAIL__INSTANTIATES_URI:
				getInstantiatesUri().clear();
				return;
			case FhirPackage.CARE_PLAN_DETAIL__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__REASON_CODE:
				getReasonCode().clear();
				return;
			case FhirPackage.CARE_PLAN_DETAIL__REASON_REFERENCE:
				getReasonReference().clear();
				return;
			case FhirPackage.CARE_PLAN_DETAIL__GOAL:
				getGoal().clear();
				return;
			case FhirPackage.CARE_PLAN_DETAIL__STATUS:
				setStatus((CarePlanActivityStatus)null);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__STATUS_REASON:
				setStatusReason((CodeableConcept)null);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__DO_NOT_PERFORM:
				setDoNotPerform((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_TIMING:
				setScheduledTiming((Timing)null);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_PERIOD:
				setScheduledPeriod((Period)null);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_STRING:
				setScheduledString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__LOCATION:
				setLocation((Reference)null);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__PERFORMER:
				getPerformer().clear();
				return;
			case FhirPackage.CARE_PLAN_DETAIL__PRODUCT_CODEABLE_CONCEPT:
				setProductCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__PRODUCT_REFERENCE:
				setProductReference((Reference)null);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__DAILY_AMOUNT:
				setDailyAmount((Quantity)null);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case FhirPackage.CARE_PLAN_DETAIL__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
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
			case FhirPackage.CARE_PLAN_DETAIL__KIND:
				return kind != null;
			case FhirPackage.CARE_PLAN_DETAIL__INSTANTIATES_CANONICAL:
				return instantiatesCanonical != null && !instantiatesCanonical.isEmpty();
			case FhirPackage.CARE_PLAN_DETAIL__INSTANTIATES_URI:
				return instantiatesUri != null && !instantiatesUri.isEmpty();
			case FhirPackage.CARE_PLAN_DETAIL__CODE:
				return code != null;
			case FhirPackage.CARE_PLAN_DETAIL__REASON_CODE:
				return reasonCode != null && !reasonCode.isEmpty();
			case FhirPackage.CARE_PLAN_DETAIL__REASON_REFERENCE:
				return reasonReference != null && !reasonReference.isEmpty();
			case FhirPackage.CARE_PLAN_DETAIL__GOAL:
				return goal != null && !goal.isEmpty();
			case FhirPackage.CARE_PLAN_DETAIL__STATUS:
				return status != null;
			case FhirPackage.CARE_PLAN_DETAIL__STATUS_REASON:
				return statusReason != null;
			case FhirPackage.CARE_PLAN_DETAIL__DO_NOT_PERFORM:
				return doNotPerform != null;
			case FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_TIMING:
				return scheduledTiming != null;
			case FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_PERIOD:
				return scheduledPeriod != null;
			case FhirPackage.CARE_PLAN_DETAIL__SCHEDULED_STRING:
				return scheduledString != null;
			case FhirPackage.CARE_PLAN_DETAIL__LOCATION:
				return location != null;
			case FhirPackage.CARE_PLAN_DETAIL__PERFORMER:
				return performer != null && !performer.isEmpty();
			case FhirPackage.CARE_PLAN_DETAIL__PRODUCT_CODEABLE_CONCEPT:
				return productCodeableConcept != null;
			case FhirPackage.CARE_PLAN_DETAIL__PRODUCT_REFERENCE:
				return productReference != null;
			case FhirPackage.CARE_PLAN_DETAIL__DAILY_AMOUNT:
				return dailyAmount != null;
			case FhirPackage.CARE_PLAN_DETAIL__QUANTITY:
				return quantity != null;
			case FhirPackage.CARE_PLAN_DETAIL__DESCRIPTION:
				return description != null;
		}
		return super.eIsSet(featureID);
	}

} //CarePlanDetailImpl
