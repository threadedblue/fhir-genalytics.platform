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

import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.ProvenanceAgent;
import org.hl7.fhir.ProvenanceEntity;
import org.hl7.fhir.ProvenanceEntityRole;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provenance Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ProvenanceEntityImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProvenanceEntityImpl#getWhat <em>What</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProvenanceEntityImpl#getAgent <em>Agent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProvenanceEntityImpl extends BackboneElementImpl implements ProvenanceEntity {
	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected ProvenanceEntityRole role;

	/**
	 * The cached value of the '{@link #getWhat() <em>What</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhat()
	 * @generated
	 * @ordered
	 */
	protected Reference what;

	/**
	 * The cached value of the '{@link #getAgent() <em>Agent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgent()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvenanceAgent> agent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvenanceEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getProvenanceEntity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProvenanceEntityRole getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(ProvenanceEntityRole newRole, NotificationChain msgs) {
		ProvenanceEntityRole oldRole = role;
		role = newRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_ENTITY__ROLE, oldRole, newRole);
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
	public void setRole(ProvenanceEntityRole newRole) {
		if (newRole != role) {
			NotificationChain msgs = null;
			if (role != null)
				msgs = ((InternalEObject)role).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_ENTITY__ROLE, null, msgs);
			if (newRole != null)
				msgs = ((InternalEObject)newRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_ENTITY__ROLE, null, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_ENTITY__ROLE, newRole, newRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getWhat() {
		return what;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhat(Reference newWhat, NotificationChain msgs) {
		Reference oldWhat = what;
		what = newWhat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_ENTITY__WHAT, oldWhat, newWhat);
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
	public void setWhat(Reference newWhat) {
		if (newWhat != what) {
			NotificationChain msgs = null;
			if (what != null)
				msgs = ((InternalEObject)what).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_ENTITY__WHAT, null, msgs);
			if (newWhat != null)
				msgs = ((InternalEObject)newWhat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_ENTITY__WHAT, null, msgs);
			msgs = basicSetWhat(newWhat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_ENTITY__WHAT, newWhat, newWhat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProvenanceAgent> getAgent() {
		if (agent == null) {
			agent = new EObjectContainmentEList<ProvenanceAgent>(ProvenanceAgent.class, this, FhirPackage.PROVENANCE_ENTITY__AGENT);
		}
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PROVENANCE_ENTITY__ROLE:
				return basicSetRole(null, msgs);
			case FhirPackage.PROVENANCE_ENTITY__WHAT:
				return basicSetWhat(null, msgs);
			case FhirPackage.PROVENANCE_ENTITY__AGENT:
				return ((InternalEList<?>)getAgent()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.PROVENANCE_ENTITY__ROLE:
				return getRole();
			case FhirPackage.PROVENANCE_ENTITY__WHAT:
				return getWhat();
			case FhirPackage.PROVENANCE_ENTITY__AGENT:
				return getAgent();
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
			case FhirPackage.PROVENANCE_ENTITY__ROLE:
				setRole((ProvenanceEntityRole)newValue);
				return;
			case FhirPackage.PROVENANCE_ENTITY__WHAT:
				setWhat((Reference)newValue);
				return;
			case FhirPackage.PROVENANCE_ENTITY__AGENT:
				getAgent().clear();
				getAgent().addAll((Collection<? extends ProvenanceAgent>)newValue);
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
			case FhirPackage.PROVENANCE_ENTITY__ROLE:
				setRole((ProvenanceEntityRole)null);
				return;
			case FhirPackage.PROVENANCE_ENTITY__WHAT:
				setWhat((Reference)null);
				return;
			case FhirPackage.PROVENANCE_ENTITY__AGENT:
				getAgent().clear();
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
			case FhirPackage.PROVENANCE_ENTITY__ROLE:
				return role != null;
			case FhirPackage.PROVENANCE_ENTITY__WHAT:
				return what != null;
			case FhirPackage.PROVENANCE_ENTITY__AGENT:
				return agent != null && !agent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProvenanceEntityImpl
