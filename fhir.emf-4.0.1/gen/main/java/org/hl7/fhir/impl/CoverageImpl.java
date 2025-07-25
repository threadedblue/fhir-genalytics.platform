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

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Coverage;
import org.hl7.fhir.CoverageClass;
import org.hl7.fhir.CoverageCostToBeneficiary;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.FinancialResourceStatusCodes;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coverage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getPolicyHolder <em>Policy Holder</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getSubscriber <em>Subscriber</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getSubscriberId <em>Subscriber Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getBeneficiary <em>Beneficiary</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getDependent <em>Dependent</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getPayor <em>Payor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getCostToBeneficiary <em>Cost To Beneficiary</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getSubrogation <em>Subrogation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getContract <em>Contract</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoverageImpl extends DomainResourceImpl implements Coverage {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected FinancialResourceStatusCodes status;

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
	 * The cached value of the '{@link #getPolicyHolder() <em>Policy Holder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyHolder()
	 * @generated
	 * @ordered
	 */
	protected Reference policyHolder;

	/**
	 * The cached value of the '{@link #getSubscriber() <em>Subscriber</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriber()
	 * @generated
	 * @ordered
	 */
	protected Reference subscriber;

	/**
	 * The cached value of the '{@link #getSubscriberId() <em>Subscriber Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriberId()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String subscriberId;

	/**
	 * The cached value of the '{@link #getBeneficiary() <em>Beneficiary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeneficiary()
	 * @generated
	 * @ordered
	 */
	protected Reference beneficiary;

	/**
	 * The cached value of the '{@link #getDependent() <em>Dependent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependent()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String dependent;

	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept relationship;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

	/**
	 * The cached value of the '{@link #getPayor() <em>Payor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayor()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> payor;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected EList<CoverageClass> class_;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt order;

	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String network;

	/**
	 * The cached value of the '{@link #getCostToBeneficiary() <em>Cost To Beneficiary</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostToBeneficiary()
	 * @generated
	 * @ordered
	 */
	protected EList<CoverageCostToBeneficiary> costToBeneficiary;

	/**
	 * The cached value of the '{@link #getSubrogation() <em>Subrogation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubrogation()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean subrogation;

	/**
	 * The cached value of the '{@link #getContract() <em>Contract</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContract()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> contract;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoverageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCoverage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.COVERAGE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinancialResourceStatusCodes getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(FinancialResourceStatusCodes newStatus, NotificationChain msgs) {
		FinancialResourceStatusCodes oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__STATUS, oldStatus, newStatus);
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
	public void setStatus(FinancialResourceStatusCodes newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getPolicyHolder() {
		return policyHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolicyHolder(Reference newPolicyHolder, NotificationChain msgs) {
		Reference oldPolicyHolder = policyHolder;
		policyHolder = newPolicyHolder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__POLICY_HOLDER, oldPolicyHolder, newPolicyHolder);
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
	public void setPolicyHolder(Reference newPolicyHolder) {
		if (newPolicyHolder != policyHolder) {
			NotificationChain msgs = null;
			if (policyHolder != null)
				msgs = ((InternalEObject)policyHolder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__POLICY_HOLDER, null, msgs);
			if (newPolicyHolder != null)
				msgs = ((InternalEObject)newPolicyHolder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__POLICY_HOLDER, null, msgs);
			msgs = basicSetPolicyHolder(newPolicyHolder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__POLICY_HOLDER, newPolicyHolder, newPolicyHolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getSubscriber() {
		return subscriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscriber(Reference newSubscriber, NotificationChain msgs) {
		Reference oldSubscriber = subscriber;
		subscriber = newSubscriber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__SUBSCRIBER, oldSubscriber, newSubscriber);
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
	public void setSubscriber(Reference newSubscriber) {
		if (newSubscriber != subscriber) {
			NotificationChain msgs = null;
			if (subscriber != null)
				msgs = ((InternalEObject)subscriber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__SUBSCRIBER, null, msgs);
			if (newSubscriber != null)
				msgs = ((InternalEObject)newSubscriber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__SUBSCRIBER, null, msgs);
			msgs = basicSetSubscriber(newSubscriber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__SUBSCRIBER, newSubscriber, newSubscriber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getSubscriberId() {
		return subscriberId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscriberId(org.hl7.fhir.String newSubscriberId, NotificationChain msgs) {
		org.hl7.fhir.String oldSubscriberId = subscriberId;
		subscriberId = newSubscriberId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__SUBSCRIBER_ID, oldSubscriberId, newSubscriberId);
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
	public void setSubscriberId(org.hl7.fhir.String newSubscriberId) {
		if (newSubscriberId != subscriberId) {
			NotificationChain msgs = null;
			if (subscriberId != null)
				msgs = ((InternalEObject)subscriberId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__SUBSCRIBER_ID, null, msgs);
			if (newSubscriberId != null)
				msgs = ((InternalEObject)newSubscriberId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__SUBSCRIBER_ID, null, msgs);
			msgs = basicSetSubscriberId(newSubscriberId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__SUBSCRIBER_ID, newSubscriberId, newSubscriberId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getBeneficiary() {
		return beneficiary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeneficiary(Reference newBeneficiary, NotificationChain msgs) {
		Reference oldBeneficiary = beneficiary;
		beneficiary = newBeneficiary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__BENEFICIARY, oldBeneficiary, newBeneficiary);
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
	public void setBeneficiary(Reference newBeneficiary) {
		if (newBeneficiary != beneficiary) {
			NotificationChain msgs = null;
			if (beneficiary != null)
				msgs = ((InternalEObject)beneficiary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__BENEFICIARY, null, msgs);
			if (newBeneficiary != null)
				msgs = ((InternalEObject)newBeneficiary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__BENEFICIARY, null, msgs);
			msgs = basicSetBeneficiary(newBeneficiary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__BENEFICIARY, newBeneficiary, newBeneficiary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getDependent() {
		return dependent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependent(org.hl7.fhir.String newDependent, NotificationChain msgs) {
		org.hl7.fhir.String oldDependent = dependent;
		dependent = newDependent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__DEPENDENT, oldDependent, newDependent);
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
	public void setDependent(org.hl7.fhir.String newDependent) {
		if (newDependent != dependent) {
			NotificationChain msgs = null;
			if (dependent != null)
				msgs = ((InternalEObject)dependent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__DEPENDENT, null, msgs);
			if (newDependent != null)
				msgs = ((InternalEObject)newDependent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__DEPENDENT, null, msgs);
			msgs = basicSetDependent(newDependent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__DEPENDENT, newDependent, newDependent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getRelationship() {
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationship(CodeableConcept newRelationship, NotificationChain msgs) {
		CodeableConcept oldRelationship = relationship;
		relationship = newRelationship;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__RELATIONSHIP, oldRelationship, newRelationship);
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
	public void setRelationship(CodeableConcept newRelationship) {
		if (newRelationship != relationship) {
			NotificationChain msgs = null;
			if (relationship != null)
				msgs = ((InternalEObject)relationship).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__RELATIONSHIP, null, msgs);
			if (newRelationship != null)
				msgs = ((InternalEObject)newRelationship).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__RELATIONSHIP, null, msgs);
			msgs = basicSetRelationship(newRelationship, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__RELATIONSHIP, newRelationship, newRelationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(Period newPeriod, NotificationChain msgs) {
		Period oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__PERIOD, oldPeriod, newPeriod);
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
	public void setPeriod(Period newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getPayor() {
		if (payor == null) {
			payor = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.COVERAGE__PAYOR);
		}
		return payor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CoverageClass> getClass_() {
		if (class_ == null) {
			class_ = new EObjectContainmentEList<CoverageClass>(CoverageClass.class, this, FhirPackage.COVERAGE__CLASS);
		}
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrder(PositiveInt newOrder, NotificationChain msgs) {
		PositiveInt oldOrder = order;
		order = newOrder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__ORDER, oldOrder, newOrder);
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
	public void setOrder(PositiveInt newOrder) {
		if (newOrder != order) {
			NotificationChain msgs = null;
			if (order != null)
				msgs = ((InternalEObject)order).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__ORDER, null, msgs);
			if (newOrder != null)
				msgs = ((InternalEObject)newOrder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__ORDER, null, msgs);
			msgs = basicSetOrder(newOrder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__ORDER, newOrder, newOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getNetwork() {
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetwork(org.hl7.fhir.String newNetwork, NotificationChain msgs) {
		org.hl7.fhir.String oldNetwork = network;
		network = newNetwork;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__NETWORK, oldNetwork, newNetwork);
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
	public void setNetwork(org.hl7.fhir.String newNetwork) {
		if (newNetwork != network) {
			NotificationChain msgs = null;
			if (network != null)
				msgs = ((InternalEObject)network).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__NETWORK, null, msgs);
			if (newNetwork != null)
				msgs = ((InternalEObject)newNetwork).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__NETWORK, null, msgs);
			msgs = basicSetNetwork(newNetwork, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__NETWORK, newNetwork, newNetwork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CoverageCostToBeneficiary> getCostToBeneficiary() {
		if (costToBeneficiary == null) {
			costToBeneficiary = new EObjectContainmentEList<CoverageCostToBeneficiary>(CoverageCostToBeneficiary.class, this, FhirPackage.COVERAGE__COST_TO_BENEFICIARY);
		}
		return costToBeneficiary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getSubrogation() {
		return subrogation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubrogation(org.hl7.fhir.Boolean newSubrogation, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldSubrogation = subrogation;
		subrogation = newSubrogation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__SUBROGATION, oldSubrogation, newSubrogation);
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
	public void setSubrogation(org.hl7.fhir.Boolean newSubrogation) {
		if (newSubrogation != subrogation) {
			NotificationChain msgs = null;
			if (subrogation != null)
				msgs = ((InternalEObject)subrogation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__SUBROGATION, null, msgs);
			if (newSubrogation != null)
				msgs = ((InternalEObject)newSubrogation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__SUBROGATION, null, msgs);
			msgs = basicSetSubrogation(newSubrogation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__SUBROGATION, newSubrogation, newSubrogation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getContract() {
		if (contract == null) {
			contract = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.COVERAGE__CONTRACT);
		}
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.COVERAGE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.COVERAGE__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.COVERAGE__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.COVERAGE__POLICY_HOLDER:
				return basicSetPolicyHolder(null, msgs);
			case FhirPackage.COVERAGE__SUBSCRIBER:
				return basicSetSubscriber(null, msgs);
			case FhirPackage.COVERAGE__SUBSCRIBER_ID:
				return basicSetSubscriberId(null, msgs);
			case FhirPackage.COVERAGE__BENEFICIARY:
				return basicSetBeneficiary(null, msgs);
			case FhirPackage.COVERAGE__DEPENDENT:
				return basicSetDependent(null, msgs);
			case FhirPackage.COVERAGE__RELATIONSHIP:
				return basicSetRelationship(null, msgs);
			case FhirPackage.COVERAGE__PERIOD:
				return basicSetPeriod(null, msgs);
			case FhirPackage.COVERAGE__PAYOR:
				return ((InternalEList<?>)getPayor()).basicRemove(otherEnd, msgs);
			case FhirPackage.COVERAGE__CLASS:
				return ((InternalEList<?>)getClass_()).basicRemove(otherEnd, msgs);
			case FhirPackage.COVERAGE__ORDER:
				return basicSetOrder(null, msgs);
			case FhirPackage.COVERAGE__NETWORK:
				return basicSetNetwork(null, msgs);
			case FhirPackage.COVERAGE__COST_TO_BENEFICIARY:
				return ((InternalEList<?>)getCostToBeneficiary()).basicRemove(otherEnd, msgs);
			case FhirPackage.COVERAGE__SUBROGATION:
				return basicSetSubrogation(null, msgs);
			case FhirPackage.COVERAGE__CONTRACT:
				return ((InternalEList<?>)getContract()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.COVERAGE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.COVERAGE__STATUS:
				return getStatus();
			case FhirPackage.COVERAGE__TYPE:
				return getType();
			case FhirPackage.COVERAGE__POLICY_HOLDER:
				return getPolicyHolder();
			case FhirPackage.COVERAGE__SUBSCRIBER:
				return getSubscriber();
			case FhirPackage.COVERAGE__SUBSCRIBER_ID:
				return getSubscriberId();
			case FhirPackage.COVERAGE__BENEFICIARY:
				return getBeneficiary();
			case FhirPackage.COVERAGE__DEPENDENT:
				return getDependent();
			case FhirPackage.COVERAGE__RELATIONSHIP:
				return getRelationship();
			case FhirPackage.COVERAGE__PERIOD:
				return getPeriod();
			case FhirPackage.COVERAGE__PAYOR:
				return getPayor();
			case FhirPackage.COVERAGE__CLASS:
				return getClass_();
			case FhirPackage.COVERAGE__ORDER:
				return getOrder();
			case FhirPackage.COVERAGE__NETWORK:
				return getNetwork();
			case FhirPackage.COVERAGE__COST_TO_BENEFICIARY:
				return getCostToBeneficiary();
			case FhirPackage.COVERAGE__SUBROGATION:
				return getSubrogation();
			case FhirPackage.COVERAGE__CONTRACT:
				return getContract();
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
			case FhirPackage.COVERAGE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.COVERAGE__STATUS:
				setStatus((FinancialResourceStatusCodes)newValue);
				return;
			case FhirPackage.COVERAGE__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.COVERAGE__POLICY_HOLDER:
				setPolicyHolder((Reference)newValue);
				return;
			case FhirPackage.COVERAGE__SUBSCRIBER:
				setSubscriber((Reference)newValue);
				return;
			case FhirPackage.COVERAGE__SUBSCRIBER_ID:
				setSubscriberId((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.COVERAGE__BENEFICIARY:
				setBeneficiary((Reference)newValue);
				return;
			case FhirPackage.COVERAGE__DEPENDENT:
				setDependent((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.COVERAGE__RELATIONSHIP:
				setRelationship((CodeableConcept)newValue);
				return;
			case FhirPackage.COVERAGE__PERIOD:
				setPeriod((Period)newValue);
				return;
			case FhirPackage.COVERAGE__PAYOR:
				getPayor().clear();
				getPayor().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.COVERAGE__CLASS:
				getClass_().clear();
				getClass_().addAll((Collection<? extends CoverageClass>)newValue);
				return;
			case FhirPackage.COVERAGE__ORDER:
				setOrder((PositiveInt)newValue);
				return;
			case FhirPackage.COVERAGE__NETWORK:
				setNetwork((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.COVERAGE__COST_TO_BENEFICIARY:
				getCostToBeneficiary().clear();
				getCostToBeneficiary().addAll((Collection<? extends CoverageCostToBeneficiary>)newValue);
				return;
			case FhirPackage.COVERAGE__SUBROGATION:
				setSubrogation((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.COVERAGE__CONTRACT:
				getContract().clear();
				getContract().addAll((Collection<? extends Reference>)newValue);
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
			case FhirPackage.COVERAGE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.COVERAGE__STATUS:
				setStatus((FinancialResourceStatusCodes)null);
				return;
			case FhirPackage.COVERAGE__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.COVERAGE__POLICY_HOLDER:
				setPolicyHolder((Reference)null);
				return;
			case FhirPackage.COVERAGE__SUBSCRIBER:
				setSubscriber((Reference)null);
				return;
			case FhirPackage.COVERAGE__SUBSCRIBER_ID:
				setSubscriberId((org.hl7.fhir.String)null);
				return;
			case FhirPackage.COVERAGE__BENEFICIARY:
				setBeneficiary((Reference)null);
				return;
			case FhirPackage.COVERAGE__DEPENDENT:
				setDependent((org.hl7.fhir.String)null);
				return;
			case FhirPackage.COVERAGE__RELATIONSHIP:
				setRelationship((CodeableConcept)null);
				return;
			case FhirPackage.COVERAGE__PERIOD:
				setPeriod((Period)null);
				return;
			case FhirPackage.COVERAGE__PAYOR:
				getPayor().clear();
				return;
			case FhirPackage.COVERAGE__CLASS:
				getClass_().clear();
				return;
			case FhirPackage.COVERAGE__ORDER:
				setOrder((PositiveInt)null);
				return;
			case FhirPackage.COVERAGE__NETWORK:
				setNetwork((org.hl7.fhir.String)null);
				return;
			case FhirPackage.COVERAGE__COST_TO_BENEFICIARY:
				getCostToBeneficiary().clear();
				return;
			case FhirPackage.COVERAGE__SUBROGATION:
				setSubrogation((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.COVERAGE__CONTRACT:
				getContract().clear();
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
			case FhirPackage.COVERAGE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.COVERAGE__STATUS:
				return status != null;
			case FhirPackage.COVERAGE__TYPE:
				return type != null;
			case FhirPackage.COVERAGE__POLICY_HOLDER:
				return policyHolder != null;
			case FhirPackage.COVERAGE__SUBSCRIBER:
				return subscriber != null;
			case FhirPackage.COVERAGE__SUBSCRIBER_ID:
				return subscriberId != null;
			case FhirPackage.COVERAGE__BENEFICIARY:
				return beneficiary != null;
			case FhirPackage.COVERAGE__DEPENDENT:
				return dependent != null;
			case FhirPackage.COVERAGE__RELATIONSHIP:
				return relationship != null;
			case FhirPackage.COVERAGE__PERIOD:
				return period != null;
			case FhirPackage.COVERAGE__PAYOR:
				return payor != null && !payor.isEmpty();
			case FhirPackage.COVERAGE__CLASS:
				return class_ != null && !class_.isEmpty();
			case FhirPackage.COVERAGE__ORDER:
				return order != null;
			case FhirPackage.COVERAGE__NETWORK:
				return network != null;
			case FhirPackage.COVERAGE__COST_TO_BENEFICIARY:
				return costToBeneficiary != null && !costToBeneficiary.isEmpty();
			case FhirPackage.COVERAGE__SUBROGATION:
				return subrogation != null;
			case FhirPackage.COVERAGE__CONTRACT:
				return contract != null && !contract.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CoverageImpl
