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
import org.hl7.fhir.Code;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.GraphDefinitionCompartment;
import org.hl7.fhir.GraphDefinitionLink;
import org.hl7.fhir.GraphDefinitionTarget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph Definition Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.GraphDefinitionTargetImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GraphDefinitionTargetImpl#getParams <em>Params</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GraphDefinitionTargetImpl#getProfile <em>Profile</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GraphDefinitionTargetImpl#getCompartment <em>Compartment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GraphDefinitionTargetImpl#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphDefinitionTargetImpl extends BackboneElementImpl implements GraphDefinitionTarget {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Code type;

	/**
	 * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParams()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String params;

	/**
	 * The cached value of the '{@link #getProfile() <em>Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfile()
	 * @generated
	 * @ordered
	 */
	protected Canonical profile;

	/**
	 * The cached value of the '{@link #getCompartment() <em>Compartment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompartment()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphDefinitionCompartment> compartment;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphDefinitionLink> link;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphDefinitionTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getGraphDefinitionTarget();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Code newType, NotificationChain msgs) {
		Code oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GRAPH_DEFINITION_TARGET__TYPE, oldType, newType);
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
	public void setType(Code newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GRAPH_DEFINITION_TARGET__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GRAPH_DEFINITION_TARGET__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GRAPH_DEFINITION_TARGET__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getParams() {
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParams(org.hl7.fhir.String newParams, NotificationChain msgs) {
		org.hl7.fhir.String oldParams = params;
		params = newParams;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GRAPH_DEFINITION_TARGET__PARAMS, oldParams, newParams);
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
	public void setParams(org.hl7.fhir.String newParams) {
		if (newParams != params) {
			NotificationChain msgs = null;
			if (params != null)
				msgs = ((InternalEObject)params).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GRAPH_DEFINITION_TARGET__PARAMS, null, msgs);
			if (newParams != null)
				msgs = ((InternalEObject)newParams).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GRAPH_DEFINITION_TARGET__PARAMS, null, msgs);
			msgs = basicSetParams(newParams, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GRAPH_DEFINITION_TARGET__PARAMS, newParams, newParams));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Canonical getProfile() {
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProfile(Canonical newProfile, NotificationChain msgs) {
		Canonical oldProfile = profile;
		profile = newProfile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GRAPH_DEFINITION_TARGET__PROFILE, oldProfile, newProfile);
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
	public void setProfile(Canonical newProfile) {
		if (newProfile != profile) {
			NotificationChain msgs = null;
			if (profile != null)
				msgs = ((InternalEObject)profile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GRAPH_DEFINITION_TARGET__PROFILE, null, msgs);
			if (newProfile != null)
				msgs = ((InternalEObject)newProfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GRAPH_DEFINITION_TARGET__PROFILE, null, msgs);
			msgs = basicSetProfile(newProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GRAPH_DEFINITION_TARGET__PROFILE, newProfile, newProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GraphDefinitionCompartment> getCompartment() {
		if (compartment == null) {
			compartment = new EObjectContainmentEList<GraphDefinitionCompartment>(GraphDefinitionCompartment.class, this, FhirPackage.GRAPH_DEFINITION_TARGET__COMPARTMENT);
		}
		return compartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GraphDefinitionLink> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<GraphDefinitionLink>(GraphDefinitionLink.class, this, FhirPackage.GRAPH_DEFINITION_TARGET__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.GRAPH_DEFINITION_TARGET__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.GRAPH_DEFINITION_TARGET__PARAMS:
				return basicSetParams(null, msgs);
			case FhirPackage.GRAPH_DEFINITION_TARGET__PROFILE:
				return basicSetProfile(null, msgs);
			case FhirPackage.GRAPH_DEFINITION_TARGET__COMPARTMENT:
				return ((InternalEList<?>)getCompartment()).basicRemove(otherEnd, msgs);
			case FhirPackage.GRAPH_DEFINITION_TARGET__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.GRAPH_DEFINITION_TARGET__TYPE:
				return getType();
			case FhirPackage.GRAPH_DEFINITION_TARGET__PARAMS:
				return getParams();
			case FhirPackage.GRAPH_DEFINITION_TARGET__PROFILE:
				return getProfile();
			case FhirPackage.GRAPH_DEFINITION_TARGET__COMPARTMENT:
				return getCompartment();
			case FhirPackage.GRAPH_DEFINITION_TARGET__LINK:
				return getLink();
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
			case FhirPackage.GRAPH_DEFINITION_TARGET__TYPE:
				setType((Code)newValue);
				return;
			case FhirPackage.GRAPH_DEFINITION_TARGET__PARAMS:
				setParams((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.GRAPH_DEFINITION_TARGET__PROFILE:
				setProfile((Canonical)newValue);
				return;
			case FhirPackage.GRAPH_DEFINITION_TARGET__COMPARTMENT:
				getCompartment().clear();
				getCompartment().addAll((Collection<? extends GraphDefinitionCompartment>)newValue);
				return;
			case FhirPackage.GRAPH_DEFINITION_TARGET__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends GraphDefinitionLink>)newValue);
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
			case FhirPackage.GRAPH_DEFINITION_TARGET__TYPE:
				setType((Code)null);
				return;
			case FhirPackage.GRAPH_DEFINITION_TARGET__PARAMS:
				setParams((org.hl7.fhir.String)null);
				return;
			case FhirPackage.GRAPH_DEFINITION_TARGET__PROFILE:
				setProfile((Canonical)null);
				return;
			case FhirPackage.GRAPH_DEFINITION_TARGET__COMPARTMENT:
				getCompartment().clear();
				return;
			case FhirPackage.GRAPH_DEFINITION_TARGET__LINK:
				getLink().clear();
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
			case FhirPackage.GRAPH_DEFINITION_TARGET__TYPE:
				return type != null;
			case FhirPackage.GRAPH_DEFINITION_TARGET__PARAMS:
				return params != null;
			case FhirPackage.GRAPH_DEFINITION_TARGET__PROFILE:
				return profile != null;
			case FhirPackage.GRAPH_DEFINITION_TARGET__COMPARTMENT:
				return compartment != null && !compartment.isEmpty();
			case FhirPackage.GRAPH_DEFINITION_TARGET__LINK:
				return link != null && !link.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GraphDefinitionTargetImpl
