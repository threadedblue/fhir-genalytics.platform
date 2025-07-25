/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.EpisodeOfCareDiagnosis;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Episode Of Care Diagnosis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.EpisodeOfCareDiagnosisImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EpisodeOfCareDiagnosisImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EpisodeOfCareDiagnosisImpl#getRank <em>Rank</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EpisodeOfCareDiagnosisImpl extends BackboneElementImpl implements EpisodeOfCareDiagnosis {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Reference condition;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept role;

	/**
	 * The cached value of the '{@link #getRank() <em>Rank</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt rank;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EpisodeOfCareDiagnosisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getEpisodeOfCareDiagnosis();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Reference newCondition, NotificationChain msgs) {
		Reference oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EPISODE_OF_CARE_DIAGNOSIS__CONDITION, oldCondition, newCondition);
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
	public void setCondition(Reference newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EPISODE_OF_CARE_DIAGNOSIS__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EPISODE_OF_CARE_DIAGNOSIS__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EPISODE_OF_CARE_DIAGNOSIS__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(CodeableConcept newRole, NotificationChain msgs) {
		CodeableConcept oldRole = role;
		role = newRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EPISODE_OF_CARE_DIAGNOSIS__ROLE, oldRole, newRole);
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
	public void setRole(CodeableConcept newRole) {
		if (newRole != role) {
			NotificationChain msgs = null;
			if (role != null)
				msgs = ((InternalEObject)role).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EPISODE_OF_CARE_DIAGNOSIS__ROLE, null, msgs);
			if (newRole != null)
				msgs = ((InternalEObject)newRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EPISODE_OF_CARE_DIAGNOSIS__ROLE, null, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EPISODE_OF_CARE_DIAGNOSIS__ROLE, newRole, newRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getRank() {
		return rank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRank(PositiveInt newRank, NotificationChain msgs) {
		PositiveInt oldRank = rank;
		rank = newRank;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EPISODE_OF_CARE_DIAGNOSIS__RANK, oldRank, newRank);
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
	public void setRank(PositiveInt newRank) {
		if (newRank != rank) {
			NotificationChain msgs = null;
			if (rank != null)
				msgs = ((InternalEObject)rank).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EPISODE_OF_CARE_DIAGNOSIS__RANK, null, msgs);
			if (newRank != null)
				msgs = ((InternalEObject)newRank).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EPISODE_OF_CARE_DIAGNOSIS__RANK, null, msgs);
			msgs = basicSetRank(newRank, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EPISODE_OF_CARE_DIAGNOSIS__RANK, newRank, newRank));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.EPISODE_OF_CARE_DIAGNOSIS__CONDITION:
				return basicSetCondition(null, msgs);
			case FhirPackage.EPISODE_OF_CARE_DIAGNOSIS__ROLE:
				return basicSetRole(null, msgs);
			case FhirPackage.EPISODE_OF_CARE_DIAGNOSIS__RANK:
				return basicSetRank(null, msgs);
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
			case FhirPackage.EPISODE_OF_CARE_DIAGNOSIS__CONDITION:
				return getCondition();
			case FhirPackage.EPISODE_OF_CARE_DIAGNOSIS__ROLE:
				return getRole();
			case FhirPackage.EPISODE_OF_CARE_DIAGNOSIS__RANK:
				return getRank();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.EPISODE_OF_CARE_DIAGNOSIS__CONDITION:
				setCondition((Reference)newValue);
				return;
			case FhirPackage.EPISODE_OF_CARE_DIAGNOSIS__ROLE:
				setRole((CodeableConcept)newValue);
				return;
			case FhirPackage.EPISODE_OF_CARE_DIAGNOSIS__RANK:
				setRank((PositiveInt)newValue);
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
			case FhirPackage.EPISODE_OF_CARE_DIAGNOSIS__CONDITION:
				setCondition((Reference)null);
				return;
			case FhirPackage.EPISODE_OF_CARE_DIAGNOSIS__ROLE:
				setRole((CodeableConcept)null);
				return;
			case FhirPackage.EPISODE_OF_CARE_DIAGNOSIS__RANK:
				setRank((PositiveInt)null);
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
			case FhirPackage.EPISODE_OF_CARE_DIAGNOSIS__CONDITION:
				return condition != null;
			case FhirPackage.EPISODE_OF_CARE_DIAGNOSIS__ROLE:
				return role != null;
			case FhirPackage.EPISODE_OF_CARE_DIAGNOSIS__RANK:
				return rank != null;
		}
		return super.eIsSet(featureID);
	}

} //EpisodeOfCareDiagnosisImpl
