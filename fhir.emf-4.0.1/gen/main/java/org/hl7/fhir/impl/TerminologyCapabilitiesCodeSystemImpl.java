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
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.TerminologyCapabilitiesCodeSystem;
import org.hl7.fhir.TerminologyCapabilitiesVersion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminology Capabilities Code System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.TerminologyCapabilitiesCodeSystemImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TerminologyCapabilitiesCodeSystemImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TerminologyCapabilitiesCodeSystemImpl#getSubsumption <em>Subsumption</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TerminologyCapabilitiesCodeSystemImpl extends BackboneElementImpl implements TerminologyCapabilitiesCodeSystem {
	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected Canonical uri;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected EList<TerminologyCapabilitiesVersion> version;

	/**
	 * The cached value of the '{@link #getSubsumption() <em>Subsumption</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsumption()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean subsumption;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminologyCapabilitiesCodeSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getTerminologyCapabilitiesCodeSystem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Canonical getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUri(Canonical newUri, NotificationChain msgs) {
		Canonical oldUri = uri;
		uri = newUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__URI, oldUri, newUri);
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
	public void setUri(Canonical newUri) {
		if (newUri != uri) {
			NotificationChain msgs = null;
			if (uri != null)
				msgs = ((InternalEObject)uri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__URI, null, msgs);
			if (newUri != null)
				msgs = ((InternalEObject)newUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__URI, null, msgs);
			msgs = basicSetUri(newUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__URI, newUri, newUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TerminologyCapabilitiesVersion> getVersion() {
		if (version == null) {
			version = new EObjectContainmentEList<TerminologyCapabilitiesVersion>(TerminologyCapabilitiesVersion.class, this, FhirPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__VERSION);
		}
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getSubsumption() {
		return subsumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubsumption(org.hl7.fhir.Boolean newSubsumption, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldSubsumption = subsumption;
		subsumption = newSubsumption;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__SUBSUMPTION, oldSubsumption, newSubsumption);
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
	public void setSubsumption(org.hl7.fhir.Boolean newSubsumption) {
		if (newSubsumption != subsumption) {
			NotificationChain msgs = null;
			if (subsumption != null)
				msgs = ((InternalEObject)subsumption).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__SUBSUMPTION, null, msgs);
			if (newSubsumption != null)
				msgs = ((InternalEObject)newSubsumption).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__SUBSUMPTION, null, msgs);
			msgs = basicSetSubsumption(newSubsumption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__SUBSUMPTION, newSubsumption, newSubsumption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__URI:
				return basicSetUri(null, msgs);
			case FhirPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__VERSION:
				return ((InternalEList<?>)getVersion()).basicRemove(otherEnd, msgs);
			case FhirPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__SUBSUMPTION:
				return basicSetSubsumption(null, msgs);
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
			case FhirPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__URI:
				return getUri();
			case FhirPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__VERSION:
				return getVersion();
			case FhirPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__SUBSUMPTION:
				return getSubsumption();
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
			case FhirPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__URI:
				setUri((Canonical)newValue);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__VERSION:
				getVersion().clear();
				getVersion().addAll((Collection<? extends TerminologyCapabilitiesVersion>)newValue);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__SUBSUMPTION:
				setSubsumption((org.hl7.fhir.Boolean)newValue);
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
			case FhirPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__URI:
				setUri((Canonical)null);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__VERSION:
				getVersion().clear();
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__SUBSUMPTION:
				setSubsumption((org.hl7.fhir.Boolean)null);
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
			case FhirPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__URI:
				return uri != null;
			case FhirPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__VERSION:
				return version != null && !version.isEmpty();
			case FhirPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__SUBSUMPTION:
				return subsumption != null;
		}
		return super.eIsSet(featureID);
	}

} //TerminologyCapabilitiesCodeSystemImpl
