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

import org.hl7.fhir.CareTeamParticipant;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Care Team Participant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CareTeamParticipantImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CareTeamParticipantImpl#getMember <em>Member</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CareTeamParticipantImpl#getOnBehalfOf <em>On Behalf Of</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CareTeamParticipantImpl#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CareTeamParticipantImpl extends BackboneElementImpl implements CareTeamParticipant {
	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> role;

	/**
	 * The cached value of the '{@link #getMember() <em>Member</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected Reference member;

	/**
	 * The cached value of the '{@link #getOnBehalfOf() <em>On Behalf Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnBehalfOf()
	 * @generated
	 * @ordered
	 */
	protected Reference onBehalfOf;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CareTeamParticipantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCareTeamParticipant();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getRole() {
		if (role == null) {
			role = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CARE_TEAM_PARTICIPANT__ROLE);
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getMember() {
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMember(Reference newMember, NotificationChain msgs) {
		Reference oldMember = member;
		member = newMember;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_TEAM_PARTICIPANT__MEMBER, oldMember, newMember);
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
	public void setMember(Reference newMember) {
		if (newMember != member) {
			NotificationChain msgs = null;
			if (member != null)
				msgs = ((InternalEObject)member).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_TEAM_PARTICIPANT__MEMBER, null, msgs);
			if (newMember != null)
				msgs = ((InternalEObject)newMember).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_TEAM_PARTICIPANT__MEMBER, null, msgs);
			msgs = basicSetMember(newMember, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_TEAM_PARTICIPANT__MEMBER, newMember, newMember));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getOnBehalfOf() {
		return onBehalfOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnBehalfOf(Reference newOnBehalfOf, NotificationChain msgs) {
		Reference oldOnBehalfOf = onBehalfOf;
		onBehalfOf = newOnBehalfOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_TEAM_PARTICIPANT__ON_BEHALF_OF, oldOnBehalfOf, newOnBehalfOf);
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
	public void setOnBehalfOf(Reference newOnBehalfOf) {
		if (newOnBehalfOf != onBehalfOf) {
			NotificationChain msgs = null;
			if (onBehalfOf != null)
				msgs = ((InternalEObject)onBehalfOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_TEAM_PARTICIPANT__ON_BEHALF_OF, null, msgs);
			if (newOnBehalfOf != null)
				msgs = ((InternalEObject)newOnBehalfOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_TEAM_PARTICIPANT__ON_BEHALF_OF, null, msgs);
			msgs = basicSetOnBehalfOf(newOnBehalfOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_TEAM_PARTICIPANT__ON_BEHALF_OF, newOnBehalfOf, newOnBehalfOf));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_TEAM_PARTICIPANT__PERIOD, oldPeriod, newPeriod);
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
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_TEAM_PARTICIPANT__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_TEAM_PARTICIPANT__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_TEAM_PARTICIPANT__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CARE_TEAM_PARTICIPANT__ROLE:
				return ((InternalEList<?>)getRole()).basicRemove(otherEnd, msgs);
			case FhirPackage.CARE_TEAM_PARTICIPANT__MEMBER:
				return basicSetMember(null, msgs);
			case FhirPackage.CARE_TEAM_PARTICIPANT__ON_BEHALF_OF:
				return basicSetOnBehalfOf(null, msgs);
			case FhirPackage.CARE_TEAM_PARTICIPANT__PERIOD:
				return basicSetPeriod(null, msgs);
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
			case FhirPackage.CARE_TEAM_PARTICIPANT__ROLE:
				return getRole();
			case FhirPackage.CARE_TEAM_PARTICIPANT__MEMBER:
				return getMember();
			case FhirPackage.CARE_TEAM_PARTICIPANT__ON_BEHALF_OF:
				return getOnBehalfOf();
			case FhirPackage.CARE_TEAM_PARTICIPANT__PERIOD:
				return getPeriod();
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
			case FhirPackage.CARE_TEAM_PARTICIPANT__ROLE:
				getRole().clear();
				getRole().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CARE_TEAM_PARTICIPANT__MEMBER:
				setMember((Reference)newValue);
				return;
			case FhirPackage.CARE_TEAM_PARTICIPANT__ON_BEHALF_OF:
				setOnBehalfOf((Reference)newValue);
				return;
			case FhirPackage.CARE_TEAM_PARTICIPANT__PERIOD:
				setPeriod((Period)newValue);
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
			case FhirPackage.CARE_TEAM_PARTICIPANT__ROLE:
				getRole().clear();
				return;
			case FhirPackage.CARE_TEAM_PARTICIPANT__MEMBER:
				setMember((Reference)null);
				return;
			case FhirPackage.CARE_TEAM_PARTICIPANT__ON_BEHALF_OF:
				setOnBehalfOf((Reference)null);
				return;
			case FhirPackage.CARE_TEAM_PARTICIPANT__PERIOD:
				setPeriod((Period)null);
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
			case FhirPackage.CARE_TEAM_PARTICIPANT__ROLE:
				return role != null && !role.isEmpty();
			case FhirPackage.CARE_TEAM_PARTICIPANT__MEMBER:
				return member != null;
			case FhirPackage.CARE_TEAM_PARTICIPANT__ON_BEHALF_OF:
				return onBehalfOf != null;
			case FhirPackage.CARE_TEAM_PARTICIPANT__PERIOD:
				return period != null;
		}
		return super.eIsSet(featureID);
	}

} //CareTeamParticipantImpl
