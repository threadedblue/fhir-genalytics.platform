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

import org.hl7.fhir.CapabilityStatementSecurity;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Markdown;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Statement Security</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementSecurityImpl#getCors <em>Cors</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementSecurityImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementSecurityImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityStatementSecurityImpl extends BackboneElementImpl implements CapabilityStatementSecurity {
	/**
	 * The cached value of the '{@link #getCors() <em>Cors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCors()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean cors;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> service;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Markdown description;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityStatementSecurityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCapabilityStatementSecurity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getCors() {
		return cors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCors(org.hl7.fhir.Boolean newCors, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldCors = cors;
		cors = newCors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT_SECURITY__CORS, oldCors, newCors);
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
	public void setCors(org.hl7.fhir.Boolean newCors) {
		if (newCors != cors) {
			NotificationChain msgs = null;
			if (cors != null)
				msgs = ((InternalEObject)cors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT_SECURITY__CORS, null, msgs);
			if (newCors != null)
				msgs = ((InternalEObject)newCors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT_SECURITY__CORS, null, msgs);
			msgs = basicSetCors(newCors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT_SECURITY__CORS, newCors, newCors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getService() {
		if (service == null) {
			service = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CAPABILITY_STATEMENT_SECURITY__SERVICE);
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(Markdown newDescription, NotificationChain msgs) {
		Markdown oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT_SECURITY__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(Markdown newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT_SECURITY__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT_SECURITY__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT_SECURITY__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CAPABILITY_STATEMENT_SECURITY__CORS:
				return basicSetCors(null, msgs);
			case FhirPackage.CAPABILITY_STATEMENT_SECURITY__SERVICE:
				return ((InternalEList<?>)getService()).basicRemove(otherEnd, msgs);
			case FhirPackage.CAPABILITY_STATEMENT_SECURITY__DESCRIPTION:
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
			case FhirPackage.CAPABILITY_STATEMENT_SECURITY__CORS:
				return getCors();
			case FhirPackage.CAPABILITY_STATEMENT_SECURITY__SERVICE:
				return getService();
			case FhirPackage.CAPABILITY_STATEMENT_SECURITY__DESCRIPTION:
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
			case FhirPackage.CAPABILITY_STATEMENT_SECURITY__CORS:
				setCors((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.CAPABILITY_STATEMENT_SECURITY__SERVICE:
				getService().clear();
				getService().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CAPABILITY_STATEMENT_SECURITY__DESCRIPTION:
				setDescription((Markdown)newValue);
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
			case FhirPackage.CAPABILITY_STATEMENT_SECURITY__CORS:
				setCors((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.CAPABILITY_STATEMENT_SECURITY__SERVICE:
				getService().clear();
				return;
			case FhirPackage.CAPABILITY_STATEMENT_SECURITY__DESCRIPTION:
				setDescription((Markdown)null);
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
			case FhirPackage.CAPABILITY_STATEMENT_SECURITY__CORS:
				return cors != null;
			case FhirPackage.CAPABILITY_STATEMENT_SECURITY__SERVICE:
				return service != null && !service.isEmpty();
			case FhirPackage.CAPABILITY_STATEMENT_SECURITY__DESCRIPTION:
				return description != null;
		}
		return super.eIsSet(featureID);
	}

} //CapabilityStatementSecurityImpl
