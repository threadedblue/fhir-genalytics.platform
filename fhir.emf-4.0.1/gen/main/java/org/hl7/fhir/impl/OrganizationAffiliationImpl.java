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
import org.hl7.fhir.ContactPoint;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.OrganizationAffiliation;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organization Affiliation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.OrganizationAffiliationImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OrganizationAffiliationImpl#getActive <em>Active</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OrganizationAffiliationImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OrganizationAffiliationImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OrganizationAffiliationImpl#getParticipatingOrganization <em>Participating Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OrganizationAffiliationImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OrganizationAffiliationImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OrganizationAffiliationImpl#getSpecialty <em>Specialty</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OrganizationAffiliationImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OrganizationAffiliationImpl#getHealthcareService <em>Healthcare Service</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OrganizationAffiliationImpl#getTelecom <em>Telecom</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OrganizationAffiliationImpl#getEndpoint <em>Endpoint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrganizationAffiliationImpl extends DomainResourceImpl implements OrganizationAffiliation {
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
	 * The cached value of the '{@link #getActive() <em>Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean active;

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
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected Reference organization;

	/**
	 * The cached value of the '{@link #getParticipatingOrganization() <em>Participating Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipatingOrganization()
	 * @generated
	 * @ordered
	 */
	protected Reference participatingOrganization;

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
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> code;

	/**
	 * The cached value of the '{@link #getSpecialty() <em>Specialty</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialty()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> specialty;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> location;

	/**
	 * The cached value of the '{@link #getHealthcareService() <em>Healthcare Service</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthcareService()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> healthcareService;

	/**
	 * The cached value of the '{@link #getTelecom() <em>Telecom</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelecom()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactPoint> telecom;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationAffiliationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getOrganizationAffiliation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.ORGANIZATION_AFFILIATION__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActive(org.hl7.fhir.Boolean newActive, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ORGANIZATION_AFFILIATION__ACTIVE, oldActive, newActive);
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
	public void setActive(org.hl7.fhir.Boolean newActive) {
		if (newActive != active) {
			NotificationChain msgs = null;
			if (active != null)
				msgs = ((InternalEObject)active).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORGANIZATION_AFFILIATION__ACTIVE, null, msgs);
			if (newActive != null)
				msgs = ((InternalEObject)newActive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORGANIZATION_AFFILIATION__ACTIVE, null, msgs);
			msgs = basicSetActive(newActive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ORGANIZATION_AFFILIATION__ACTIVE, newActive, newActive));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ORGANIZATION_AFFILIATION__PERIOD, oldPeriod, newPeriod);
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
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORGANIZATION_AFFILIATION__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORGANIZATION_AFFILIATION__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ORGANIZATION_AFFILIATION__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getOrganization() {
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganization(Reference newOrganization, NotificationChain msgs) {
		Reference oldOrganization = organization;
		organization = newOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ORGANIZATION_AFFILIATION__ORGANIZATION, oldOrganization, newOrganization);
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
	public void setOrganization(Reference newOrganization) {
		if (newOrganization != organization) {
			NotificationChain msgs = null;
			if (organization != null)
				msgs = ((InternalEObject)organization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORGANIZATION_AFFILIATION__ORGANIZATION, null, msgs);
			if (newOrganization != null)
				msgs = ((InternalEObject)newOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORGANIZATION_AFFILIATION__ORGANIZATION, null, msgs);
			msgs = basicSetOrganization(newOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ORGANIZATION_AFFILIATION__ORGANIZATION, newOrganization, newOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getParticipatingOrganization() {
		return participatingOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParticipatingOrganization(Reference newParticipatingOrganization, NotificationChain msgs) {
		Reference oldParticipatingOrganization = participatingOrganization;
		participatingOrganization = newParticipatingOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ORGANIZATION_AFFILIATION__PARTICIPATING_ORGANIZATION, oldParticipatingOrganization, newParticipatingOrganization);
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
	public void setParticipatingOrganization(Reference newParticipatingOrganization) {
		if (newParticipatingOrganization != participatingOrganization) {
			NotificationChain msgs = null;
			if (participatingOrganization != null)
				msgs = ((InternalEObject)participatingOrganization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORGANIZATION_AFFILIATION__PARTICIPATING_ORGANIZATION, null, msgs);
			if (newParticipatingOrganization != null)
				msgs = ((InternalEObject)newParticipatingOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORGANIZATION_AFFILIATION__PARTICIPATING_ORGANIZATION, null, msgs);
			msgs = basicSetParticipatingOrganization(newParticipatingOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ORGANIZATION_AFFILIATION__PARTICIPATING_ORGANIZATION, newParticipatingOrganization, newParticipatingOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getNetwork() {
		if (network == null) {
			network = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.ORGANIZATION_AFFILIATION__NETWORK);
		}
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCode() {
		if (code == null) {
			code = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.ORGANIZATION_AFFILIATION__CODE);
		}
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getSpecialty() {
		if (specialty == null) {
			specialty = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.ORGANIZATION_AFFILIATION__SPECIALTY);
		}
		return specialty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getLocation() {
		if (location == null) {
			location = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.ORGANIZATION_AFFILIATION__LOCATION);
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getHealthcareService() {
		if (healthcareService == null) {
			healthcareService = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.ORGANIZATION_AFFILIATION__HEALTHCARE_SERVICE);
		}
		return healthcareService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactPoint> getTelecom() {
		if (telecom == null) {
			telecom = new EObjectContainmentEList<ContactPoint>(ContactPoint.class, this, FhirPackage.ORGANIZATION_AFFILIATION__TELECOM);
		}
		return telecom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getEndpoint() {
		if (endpoint == null) {
			endpoint = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.ORGANIZATION_AFFILIATION__ENDPOINT);
		}
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ORGANIZATION_AFFILIATION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.ORGANIZATION_AFFILIATION__ACTIVE:
				return basicSetActive(null, msgs);
			case FhirPackage.ORGANIZATION_AFFILIATION__PERIOD:
				return basicSetPeriod(null, msgs);
			case FhirPackage.ORGANIZATION_AFFILIATION__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case FhirPackage.ORGANIZATION_AFFILIATION__PARTICIPATING_ORGANIZATION:
				return basicSetParticipatingOrganization(null, msgs);
			case FhirPackage.ORGANIZATION_AFFILIATION__NETWORK:
				return ((InternalEList<?>)getNetwork()).basicRemove(otherEnd, msgs);
			case FhirPackage.ORGANIZATION_AFFILIATION__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case FhirPackage.ORGANIZATION_AFFILIATION__SPECIALTY:
				return ((InternalEList<?>)getSpecialty()).basicRemove(otherEnd, msgs);
			case FhirPackage.ORGANIZATION_AFFILIATION__LOCATION:
				return ((InternalEList<?>)getLocation()).basicRemove(otherEnd, msgs);
			case FhirPackage.ORGANIZATION_AFFILIATION__HEALTHCARE_SERVICE:
				return ((InternalEList<?>)getHealthcareService()).basicRemove(otherEnd, msgs);
			case FhirPackage.ORGANIZATION_AFFILIATION__TELECOM:
				return ((InternalEList<?>)getTelecom()).basicRemove(otherEnd, msgs);
			case FhirPackage.ORGANIZATION_AFFILIATION__ENDPOINT:
				return ((InternalEList<?>)getEndpoint()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.ORGANIZATION_AFFILIATION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.ORGANIZATION_AFFILIATION__ACTIVE:
				return getActive();
			case FhirPackage.ORGANIZATION_AFFILIATION__PERIOD:
				return getPeriod();
			case FhirPackage.ORGANIZATION_AFFILIATION__ORGANIZATION:
				return getOrganization();
			case FhirPackage.ORGANIZATION_AFFILIATION__PARTICIPATING_ORGANIZATION:
				return getParticipatingOrganization();
			case FhirPackage.ORGANIZATION_AFFILIATION__NETWORK:
				return getNetwork();
			case FhirPackage.ORGANIZATION_AFFILIATION__CODE:
				return getCode();
			case FhirPackage.ORGANIZATION_AFFILIATION__SPECIALTY:
				return getSpecialty();
			case FhirPackage.ORGANIZATION_AFFILIATION__LOCATION:
				return getLocation();
			case FhirPackage.ORGANIZATION_AFFILIATION__HEALTHCARE_SERVICE:
				return getHealthcareService();
			case FhirPackage.ORGANIZATION_AFFILIATION__TELECOM:
				return getTelecom();
			case FhirPackage.ORGANIZATION_AFFILIATION__ENDPOINT:
				return getEndpoint();
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
			case FhirPackage.ORGANIZATION_AFFILIATION__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.ORGANIZATION_AFFILIATION__ACTIVE:
				setActive((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.ORGANIZATION_AFFILIATION__PERIOD:
				setPeriod((Period)newValue);
				return;
			case FhirPackage.ORGANIZATION_AFFILIATION__ORGANIZATION:
				setOrganization((Reference)newValue);
				return;
			case FhirPackage.ORGANIZATION_AFFILIATION__PARTICIPATING_ORGANIZATION:
				setParticipatingOrganization((Reference)newValue);
				return;
			case FhirPackage.ORGANIZATION_AFFILIATION__NETWORK:
				getNetwork().clear();
				getNetwork().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.ORGANIZATION_AFFILIATION__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.ORGANIZATION_AFFILIATION__SPECIALTY:
				getSpecialty().clear();
				getSpecialty().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.ORGANIZATION_AFFILIATION__LOCATION:
				getLocation().clear();
				getLocation().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.ORGANIZATION_AFFILIATION__HEALTHCARE_SERVICE:
				getHealthcareService().clear();
				getHealthcareService().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.ORGANIZATION_AFFILIATION__TELECOM:
				getTelecom().clear();
				getTelecom().addAll((Collection<? extends ContactPoint>)newValue);
				return;
			case FhirPackage.ORGANIZATION_AFFILIATION__ENDPOINT:
				getEndpoint().clear();
				getEndpoint().addAll((Collection<? extends Reference>)newValue);
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
			case FhirPackage.ORGANIZATION_AFFILIATION__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.ORGANIZATION_AFFILIATION__ACTIVE:
				setActive((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.ORGANIZATION_AFFILIATION__PERIOD:
				setPeriod((Period)null);
				return;
			case FhirPackage.ORGANIZATION_AFFILIATION__ORGANIZATION:
				setOrganization((Reference)null);
				return;
			case FhirPackage.ORGANIZATION_AFFILIATION__PARTICIPATING_ORGANIZATION:
				setParticipatingOrganization((Reference)null);
				return;
			case FhirPackage.ORGANIZATION_AFFILIATION__NETWORK:
				getNetwork().clear();
				return;
			case FhirPackage.ORGANIZATION_AFFILIATION__CODE:
				getCode().clear();
				return;
			case FhirPackage.ORGANIZATION_AFFILIATION__SPECIALTY:
				getSpecialty().clear();
				return;
			case FhirPackage.ORGANIZATION_AFFILIATION__LOCATION:
				getLocation().clear();
				return;
			case FhirPackage.ORGANIZATION_AFFILIATION__HEALTHCARE_SERVICE:
				getHealthcareService().clear();
				return;
			case FhirPackage.ORGANIZATION_AFFILIATION__TELECOM:
				getTelecom().clear();
				return;
			case FhirPackage.ORGANIZATION_AFFILIATION__ENDPOINT:
				getEndpoint().clear();
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
			case FhirPackage.ORGANIZATION_AFFILIATION__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.ORGANIZATION_AFFILIATION__ACTIVE:
				return active != null;
			case FhirPackage.ORGANIZATION_AFFILIATION__PERIOD:
				return period != null;
			case FhirPackage.ORGANIZATION_AFFILIATION__ORGANIZATION:
				return organization != null;
			case FhirPackage.ORGANIZATION_AFFILIATION__PARTICIPATING_ORGANIZATION:
				return participatingOrganization != null;
			case FhirPackage.ORGANIZATION_AFFILIATION__NETWORK:
				return network != null && !network.isEmpty();
			case FhirPackage.ORGANIZATION_AFFILIATION__CODE:
				return code != null && !code.isEmpty();
			case FhirPackage.ORGANIZATION_AFFILIATION__SPECIALTY:
				return specialty != null && !specialty.isEmpty();
			case FhirPackage.ORGANIZATION_AFFILIATION__LOCATION:
				return location != null && !location.isEmpty();
			case FhirPackage.ORGANIZATION_AFFILIATION__HEALTHCARE_SERVICE:
				return healthcareService != null && !healthcareService.isEmpty();
			case FhirPackage.ORGANIZATION_AFFILIATION__TELECOM:
				return telecom != null && !telecom.isEmpty();
			case FhirPackage.ORGANIZATION_AFFILIATION__ENDPOINT:
				return endpoint != null && !endpoint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OrganizationAffiliationImpl
