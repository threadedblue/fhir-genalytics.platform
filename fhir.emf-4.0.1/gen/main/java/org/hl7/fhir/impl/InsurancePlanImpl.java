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
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.InsurancePlan;
import org.hl7.fhir.InsurancePlanContact;
import org.hl7.fhir.InsurancePlanCoverage;
import org.hl7.fhir.InsurancePlanPlan;
import org.hl7.fhir.Period;
import org.hl7.fhir.PublicationStatus;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Insurance Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.InsurancePlanImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InsurancePlanImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InsurancePlanImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InsurancePlanImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InsurancePlanImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InsurancePlanImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InsurancePlanImpl#getOwnedBy <em>Owned By</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InsurancePlanImpl#getAdministeredBy <em>Administered By</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InsurancePlanImpl#getCoverageArea <em>Coverage Area</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InsurancePlanImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InsurancePlanImpl#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InsurancePlanImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InsurancePlanImpl#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InsurancePlanImpl#getPlan <em>Plan</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InsurancePlanImpl extends DomainResourceImpl implements InsurancePlan {
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
	protected PublicationStatus status;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> type;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String name;

	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> alias;

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
	 * The cached value of the '{@link #getOwnedBy() <em>Owned By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedBy()
	 * @generated
	 * @ordered
	 */
	protected Reference ownedBy;

	/**
	 * The cached value of the '{@link #getAdministeredBy() <em>Administered By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdministeredBy()
	 * @generated
	 * @ordered
	 */
	protected Reference administeredBy;

	/**
	 * The cached value of the '{@link #getCoverageArea() <em>Coverage Area</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverageArea()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> coverageArea;

	/**
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected EList<InsurancePlanContact> contact;

	/**
	 * The cached value of the '{@link #getEndpoint() <em>Endpoint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> endpoint;

	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> network;

	/**
	 * The cached value of the '{@link #getCoverage() <em>Coverage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverage()
	 * @generated
	 * @ordered
	 */
	protected EList<InsurancePlanCoverage> coverage;

	/**
	 * The cached value of the '{@link #getPlan() <em>Plan</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlan()
	 * @generated
	 * @ordered
	 */
	protected EList<InsurancePlanPlan> plan;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InsurancePlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getInsurancePlan();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.INSURANCE_PLAN__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicationStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(PublicationStatus newStatus, NotificationChain msgs) {
		PublicationStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INSURANCE_PLAN__STATUS, oldStatus, newStatus);
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
	public void setStatus(PublicationStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INSURANCE_PLAN__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INSURANCE_PLAN__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INSURANCE_PLAN__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getType() {
		if (type == null) {
			type = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.INSURANCE_PLAN__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.hl7.fhir.String newName, NotificationChain msgs) {
		org.hl7.fhir.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INSURANCE_PLAN__NAME, oldName, newName);
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
	public void setName(org.hl7.fhir.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INSURANCE_PLAN__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INSURANCE_PLAN__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INSURANCE_PLAN__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.hl7.fhir.String> getAlias() {
		if (alias == null) {
			alias = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.INSURANCE_PLAN__ALIAS);
		}
		return alias;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INSURANCE_PLAN__PERIOD, oldPeriod, newPeriod);
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
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INSURANCE_PLAN__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INSURANCE_PLAN__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INSURANCE_PLAN__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getOwnedBy() {
		return ownedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedBy(Reference newOwnedBy, NotificationChain msgs) {
		Reference oldOwnedBy = ownedBy;
		ownedBy = newOwnedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INSURANCE_PLAN__OWNED_BY, oldOwnedBy, newOwnedBy);
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
	public void setOwnedBy(Reference newOwnedBy) {
		if (newOwnedBy != ownedBy) {
			NotificationChain msgs = null;
			if (ownedBy != null)
				msgs = ((InternalEObject)ownedBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INSURANCE_PLAN__OWNED_BY, null, msgs);
			if (newOwnedBy != null)
				msgs = ((InternalEObject)newOwnedBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INSURANCE_PLAN__OWNED_BY, null, msgs);
			msgs = basicSetOwnedBy(newOwnedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INSURANCE_PLAN__OWNED_BY, newOwnedBy, newOwnedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getAdministeredBy() {
		return administeredBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdministeredBy(Reference newAdministeredBy, NotificationChain msgs) {
		Reference oldAdministeredBy = administeredBy;
		administeredBy = newAdministeredBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INSURANCE_PLAN__ADMINISTERED_BY, oldAdministeredBy, newAdministeredBy);
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
	public void setAdministeredBy(Reference newAdministeredBy) {
		if (newAdministeredBy != administeredBy) {
			NotificationChain msgs = null;
			if (administeredBy != null)
				msgs = ((InternalEObject)administeredBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INSURANCE_PLAN__ADMINISTERED_BY, null, msgs);
			if (newAdministeredBy != null)
				msgs = ((InternalEObject)newAdministeredBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INSURANCE_PLAN__ADMINISTERED_BY, null, msgs);
			msgs = basicSetAdministeredBy(newAdministeredBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INSURANCE_PLAN__ADMINISTERED_BY, newAdministeredBy, newAdministeredBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getCoverageArea() {
		if (coverageArea == null) {
			coverageArea = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.INSURANCE_PLAN__COVERAGE_AREA);
		}
		return coverageArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InsurancePlanContact> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<InsurancePlanContact>(InsurancePlanContact.class, this, FhirPackage.INSURANCE_PLAN__CONTACT);
		}
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getEndpoint() {
		if (endpoint == null) {
			endpoint = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.INSURANCE_PLAN__ENDPOINT);
		}
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getNetwork() {
		if (network == null) {
			network = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.INSURANCE_PLAN__NETWORK);
		}
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InsurancePlanCoverage> getCoverage() {
		if (coverage == null) {
			coverage = new EObjectContainmentEList<InsurancePlanCoverage>(InsurancePlanCoverage.class, this, FhirPackage.INSURANCE_PLAN__COVERAGE);
		}
		return coverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InsurancePlanPlan> getPlan() {
		if (plan == null) {
			plan = new EObjectContainmentEList<InsurancePlanPlan>(InsurancePlanPlan.class, this, FhirPackage.INSURANCE_PLAN__PLAN);
		}
		return plan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.INSURANCE_PLAN__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.INSURANCE_PLAN__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.INSURANCE_PLAN__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case FhirPackage.INSURANCE_PLAN__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.INSURANCE_PLAN__ALIAS:
				return ((InternalEList<?>)getAlias()).basicRemove(otherEnd, msgs);
			case FhirPackage.INSURANCE_PLAN__PERIOD:
				return basicSetPeriod(null, msgs);
			case FhirPackage.INSURANCE_PLAN__OWNED_BY:
				return basicSetOwnedBy(null, msgs);
			case FhirPackage.INSURANCE_PLAN__ADMINISTERED_BY:
				return basicSetAdministeredBy(null, msgs);
			case FhirPackage.INSURANCE_PLAN__COVERAGE_AREA:
				return ((InternalEList<?>)getCoverageArea()).basicRemove(otherEnd, msgs);
			case FhirPackage.INSURANCE_PLAN__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case FhirPackage.INSURANCE_PLAN__ENDPOINT:
				return ((InternalEList<?>)getEndpoint()).basicRemove(otherEnd, msgs);
			case FhirPackage.INSURANCE_PLAN__NETWORK:
				return ((InternalEList<?>)getNetwork()).basicRemove(otherEnd, msgs);
			case FhirPackage.INSURANCE_PLAN__COVERAGE:
				return ((InternalEList<?>)getCoverage()).basicRemove(otherEnd, msgs);
			case FhirPackage.INSURANCE_PLAN__PLAN:
				return ((InternalEList<?>)getPlan()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.INSURANCE_PLAN__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.INSURANCE_PLAN__STATUS:
				return getStatus();
			case FhirPackage.INSURANCE_PLAN__TYPE:
				return getType();
			case FhirPackage.INSURANCE_PLAN__NAME:
				return getName();
			case FhirPackage.INSURANCE_PLAN__ALIAS:
				return getAlias();
			case FhirPackage.INSURANCE_PLAN__PERIOD:
				return getPeriod();
			case FhirPackage.INSURANCE_PLAN__OWNED_BY:
				return getOwnedBy();
			case FhirPackage.INSURANCE_PLAN__ADMINISTERED_BY:
				return getAdministeredBy();
			case FhirPackage.INSURANCE_PLAN__COVERAGE_AREA:
				return getCoverageArea();
			case FhirPackage.INSURANCE_PLAN__CONTACT:
				return getContact();
			case FhirPackage.INSURANCE_PLAN__ENDPOINT:
				return getEndpoint();
			case FhirPackage.INSURANCE_PLAN__NETWORK:
				return getNetwork();
			case FhirPackage.INSURANCE_PLAN__COVERAGE:
				return getCoverage();
			case FhirPackage.INSURANCE_PLAN__PLAN:
				return getPlan();
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
			case FhirPackage.INSURANCE_PLAN__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.INSURANCE_PLAN__STATUS:
				setStatus((PublicationStatus)newValue);
				return;
			case FhirPackage.INSURANCE_PLAN__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.INSURANCE_PLAN__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.INSURANCE_PLAN__ALIAS:
				getAlias().clear();
				getAlias().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.INSURANCE_PLAN__PERIOD:
				setPeriod((Period)newValue);
				return;
			case FhirPackage.INSURANCE_PLAN__OWNED_BY:
				setOwnedBy((Reference)newValue);
				return;
			case FhirPackage.INSURANCE_PLAN__ADMINISTERED_BY:
				setAdministeredBy((Reference)newValue);
				return;
			case FhirPackage.INSURANCE_PLAN__COVERAGE_AREA:
				getCoverageArea().clear();
				getCoverageArea().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.INSURANCE_PLAN__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends InsurancePlanContact>)newValue);
				return;
			case FhirPackage.INSURANCE_PLAN__ENDPOINT:
				getEndpoint().clear();
				getEndpoint().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.INSURANCE_PLAN__NETWORK:
				getNetwork().clear();
				getNetwork().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.INSURANCE_PLAN__COVERAGE:
				getCoverage().clear();
				getCoverage().addAll((Collection<? extends InsurancePlanCoverage>)newValue);
				return;
			case FhirPackage.INSURANCE_PLAN__PLAN:
				getPlan().clear();
				getPlan().addAll((Collection<? extends InsurancePlanPlan>)newValue);
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
			case FhirPackage.INSURANCE_PLAN__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.INSURANCE_PLAN__STATUS:
				setStatus((PublicationStatus)null);
				return;
			case FhirPackage.INSURANCE_PLAN__TYPE:
				getType().clear();
				return;
			case FhirPackage.INSURANCE_PLAN__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.INSURANCE_PLAN__ALIAS:
				getAlias().clear();
				return;
			case FhirPackage.INSURANCE_PLAN__PERIOD:
				setPeriod((Period)null);
				return;
			case FhirPackage.INSURANCE_PLAN__OWNED_BY:
				setOwnedBy((Reference)null);
				return;
			case FhirPackage.INSURANCE_PLAN__ADMINISTERED_BY:
				setAdministeredBy((Reference)null);
				return;
			case FhirPackage.INSURANCE_PLAN__COVERAGE_AREA:
				getCoverageArea().clear();
				return;
			case FhirPackage.INSURANCE_PLAN__CONTACT:
				getContact().clear();
				return;
			case FhirPackage.INSURANCE_PLAN__ENDPOINT:
				getEndpoint().clear();
				return;
			case FhirPackage.INSURANCE_PLAN__NETWORK:
				getNetwork().clear();
				return;
			case FhirPackage.INSURANCE_PLAN__COVERAGE:
				getCoverage().clear();
				return;
			case FhirPackage.INSURANCE_PLAN__PLAN:
				getPlan().clear();
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
			case FhirPackage.INSURANCE_PLAN__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.INSURANCE_PLAN__STATUS:
				return status != null;
			case FhirPackage.INSURANCE_PLAN__TYPE:
				return type != null && !type.isEmpty();
			case FhirPackage.INSURANCE_PLAN__NAME:
				return name != null;
			case FhirPackage.INSURANCE_PLAN__ALIAS:
				return alias != null && !alias.isEmpty();
			case FhirPackage.INSURANCE_PLAN__PERIOD:
				return period != null;
			case FhirPackage.INSURANCE_PLAN__OWNED_BY:
				return ownedBy != null;
			case FhirPackage.INSURANCE_PLAN__ADMINISTERED_BY:
				return administeredBy != null;
			case FhirPackage.INSURANCE_PLAN__COVERAGE_AREA:
				return coverageArea != null && !coverageArea.isEmpty();
			case FhirPackage.INSURANCE_PLAN__CONTACT:
				return contact != null && !contact.isEmpty();
			case FhirPackage.INSURANCE_PLAN__ENDPOINT:
				return endpoint != null && !endpoint.isEmpty();
			case FhirPackage.INSURANCE_PLAN__NETWORK:
				return network != null && !network.isEmpty();
			case FhirPackage.INSURANCE_PLAN__COVERAGE:
				return coverage != null && !coverage.isEmpty();
			case FhirPackage.INSURANCE_PLAN__PLAN:
				return plan != null && !plan.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InsurancePlanImpl
