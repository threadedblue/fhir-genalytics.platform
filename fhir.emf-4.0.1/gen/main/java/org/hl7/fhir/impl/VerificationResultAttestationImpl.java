/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Date;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Signature;
import org.hl7.fhir.VerificationResultAttestation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verification Result Attestation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.VerificationResultAttestationImpl#getWho <em>Who</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VerificationResultAttestationImpl#getOnBehalfOf <em>On Behalf Of</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VerificationResultAttestationImpl#getCommunicationMethod <em>Communication Method</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VerificationResultAttestationImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VerificationResultAttestationImpl#getSourceIdentityCertificate <em>Source Identity Certificate</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VerificationResultAttestationImpl#getProxyIdentityCertificate <em>Proxy Identity Certificate</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VerificationResultAttestationImpl#getProxySignature <em>Proxy Signature</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VerificationResultAttestationImpl#getSourceSignature <em>Source Signature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerificationResultAttestationImpl extends BackboneElementImpl implements VerificationResultAttestation {
	/**
	 * The cached value of the '{@link #getWho() <em>Who</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWho()
	 * @generated
	 * @ordered
	 */
	protected Reference who;

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
	 * The cached value of the '{@link #getCommunicationMethod() <em>Communication Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationMethod()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept communicationMethod;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date;

	/**
	 * The cached value of the '{@link #getSourceIdentityCertificate() <em>Source Identity Certificate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceIdentityCertificate()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String sourceIdentityCertificate;

	/**
	 * The cached value of the '{@link #getProxyIdentityCertificate() <em>Proxy Identity Certificate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyIdentityCertificate()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String proxyIdentityCertificate;

	/**
	 * The cached value of the '{@link #getProxySignature() <em>Proxy Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxySignature()
	 * @generated
	 * @ordered
	 */
	protected Signature proxySignature;

	/**
	 * The cached value of the '{@link #getSourceSignature() <em>Source Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceSignature()
	 * @generated
	 * @ordered
	 */
	protected Signature sourceSignature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerificationResultAttestationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getVerificationResultAttestation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getWho() {
		return who;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWho(Reference newWho, NotificationChain msgs) {
		Reference oldWho = who;
		who = newWho;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_ATTESTATION__WHO, oldWho, newWho);
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
	public void setWho(Reference newWho) {
		if (newWho != who) {
			NotificationChain msgs = null;
			if (who != null)
				msgs = ((InternalEObject)who).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_ATTESTATION__WHO, null, msgs);
			if (newWho != null)
				msgs = ((InternalEObject)newWho).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_ATTESTATION__WHO, null, msgs);
			msgs = basicSetWho(newWho, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_ATTESTATION__WHO, newWho, newWho));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_ATTESTATION__ON_BEHALF_OF, oldOnBehalfOf, newOnBehalfOf);
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
				msgs = ((InternalEObject)onBehalfOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_ATTESTATION__ON_BEHALF_OF, null, msgs);
			if (newOnBehalfOf != null)
				msgs = ((InternalEObject)newOnBehalfOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_ATTESTATION__ON_BEHALF_OF, null, msgs);
			msgs = basicSetOnBehalfOf(newOnBehalfOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_ATTESTATION__ON_BEHALF_OF, newOnBehalfOf, newOnBehalfOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCommunicationMethod() {
		return communicationMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommunicationMethod(CodeableConcept newCommunicationMethod, NotificationChain msgs) {
		CodeableConcept oldCommunicationMethod = communicationMethod;
		communicationMethod = newCommunicationMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_ATTESTATION__COMMUNICATION_METHOD, oldCommunicationMethod, newCommunicationMethod);
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
	public void setCommunicationMethod(CodeableConcept newCommunicationMethod) {
		if (newCommunicationMethod != communicationMethod) {
			NotificationChain msgs = null;
			if (communicationMethod != null)
				msgs = ((InternalEObject)communicationMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_ATTESTATION__COMMUNICATION_METHOD, null, msgs);
			if (newCommunicationMethod != null)
				msgs = ((InternalEObject)newCommunicationMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_ATTESTATION__COMMUNICATION_METHOD, null, msgs);
			msgs = basicSetCommunicationMethod(newCommunicationMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_ATTESTATION__COMMUNICATION_METHOD, newCommunicationMethod, newCommunicationMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(Date newDate, NotificationChain msgs) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_ATTESTATION__DATE, oldDate, newDate);
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
	public void setDate(Date newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_ATTESTATION__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_ATTESTATION__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_ATTESTATION__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getSourceIdentityCertificate() {
		return sourceIdentityCertificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceIdentityCertificate(org.hl7.fhir.String newSourceIdentityCertificate, NotificationChain msgs) {
		org.hl7.fhir.String oldSourceIdentityCertificate = sourceIdentityCertificate;
		sourceIdentityCertificate = newSourceIdentityCertificate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_ATTESTATION__SOURCE_IDENTITY_CERTIFICATE, oldSourceIdentityCertificate, newSourceIdentityCertificate);
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
	public void setSourceIdentityCertificate(org.hl7.fhir.String newSourceIdentityCertificate) {
		if (newSourceIdentityCertificate != sourceIdentityCertificate) {
			NotificationChain msgs = null;
			if (sourceIdentityCertificate != null)
				msgs = ((InternalEObject)sourceIdentityCertificate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_ATTESTATION__SOURCE_IDENTITY_CERTIFICATE, null, msgs);
			if (newSourceIdentityCertificate != null)
				msgs = ((InternalEObject)newSourceIdentityCertificate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_ATTESTATION__SOURCE_IDENTITY_CERTIFICATE, null, msgs);
			msgs = basicSetSourceIdentityCertificate(newSourceIdentityCertificate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_ATTESTATION__SOURCE_IDENTITY_CERTIFICATE, newSourceIdentityCertificate, newSourceIdentityCertificate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getProxyIdentityCertificate() {
		return proxyIdentityCertificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProxyIdentityCertificate(org.hl7.fhir.String newProxyIdentityCertificate, NotificationChain msgs) {
		org.hl7.fhir.String oldProxyIdentityCertificate = proxyIdentityCertificate;
		proxyIdentityCertificate = newProxyIdentityCertificate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_ATTESTATION__PROXY_IDENTITY_CERTIFICATE, oldProxyIdentityCertificate, newProxyIdentityCertificate);
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
	public void setProxyIdentityCertificate(org.hl7.fhir.String newProxyIdentityCertificate) {
		if (newProxyIdentityCertificate != proxyIdentityCertificate) {
			NotificationChain msgs = null;
			if (proxyIdentityCertificate != null)
				msgs = ((InternalEObject)proxyIdentityCertificate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_ATTESTATION__PROXY_IDENTITY_CERTIFICATE, null, msgs);
			if (newProxyIdentityCertificate != null)
				msgs = ((InternalEObject)newProxyIdentityCertificate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_ATTESTATION__PROXY_IDENTITY_CERTIFICATE, null, msgs);
			msgs = basicSetProxyIdentityCertificate(newProxyIdentityCertificate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_ATTESTATION__PROXY_IDENTITY_CERTIFICATE, newProxyIdentityCertificate, newProxyIdentityCertificate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signature getProxySignature() {
		return proxySignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProxySignature(Signature newProxySignature, NotificationChain msgs) {
		Signature oldProxySignature = proxySignature;
		proxySignature = newProxySignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_ATTESTATION__PROXY_SIGNATURE, oldProxySignature, newProxySignature);
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
	public void setProxySignature(Signature newProxySignature) {
		if (newProxySignature != proxySignature) {
			NotificationChain msgs = null;
			if (proxySignature != null)
				msgs = ((InternalEObject)proxySignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_ATTESTATION__PROXY_SIGNATURE, null, msgs);
			if (newProxySignature != null)
				msgs = ((InternalEObject)newProxySignature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_ATTESTATION__PROXY_SIGNATURE, null, msgs);
			msgs = basicSetProxySignature(newProxySignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_ATTESTATION__PROXY_SIGNATURE, newProxySignature, newProxySignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signature getSourceSignature() {
		return sourceSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceSignature(Signature newSourceSignature, NotificationChain msgs) {
		Signature oldSourceSignature = sourceSignature;
		sourceSignature = newSourceSignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_ATTESTATION__SOURCE_SIGNATURE, oldSourceSignature, newSourceSignature);
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
	public void setSourceSignature(Signature newSourceSignature) {
		if (newSourceSignature != sourceSignature) {
			NotificationChain msgs = null;
			if (sourceSignature != null)
				msgs = ((InternalEObject)sourceSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_ATTESTATION__SOURCE_SIGNATURE, null, msgs);
			if (newSourceSignature != null)
				msgs = ((InternalEObject)newSourceSignature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_ATTESTATION__SOURCE_SIGNATURE, null, msgs);
			msgs = basicSetSourceSignature(newSourceSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_ATTESTATION__SOURCE_SIGNATURE, newSourceSignature, newSourceSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__WHO:
				return basicSetWho(null, msgs);
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__ON_BEHALF_OF:
				return basicSetOnBehalfOf(null, msgs);
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__COMMUNICATION_METHOD:
				return basicSetCommunicationMethod(null, msgs);
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__SOURCE_IDENTITY_CERTIFICATE:
				return basicSetSourceIdentityCertificate(null, msgs);
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__PROXY_IDENTITY_CERTIFICATE:
				return basicSetProxyIdentityCertificate(null, msgs);
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__PROXY_SIGNATURE:
				return basicSetProxySignature(null, msgs);
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__SOURCE_SIGNATURE:
				return basicSetSourceSignature(null, msgs);
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
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__WHO:
				return getWho();
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__ON_BEHALF_OF:
				return getOnBehalfOf();
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__COMMUNICATION_METHOD:
				return getCommunicationMethod();
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__DATE:
				return getDate();
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__SOURCE_IDENTITY_CERTIFICATE:
				return getSourceIdentityCertificate();
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__PROXY_IDENTITY_CERTIFICATE:
				return getProxyIdentityCertificate();
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__PROXY_SIGNATURE:
				return getProxySignature();
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__SOURCE_SIGNATURE:
				return getSourceSignature();
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
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__WHO:
				setWho((Reference)newValue);
				return;
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__ON_BEHALF_OF:
				setOnBehalfOf((Reference)newValue);
				return;
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__COMMUNICATION_METHOD:
				setCommunicationMethod((CodeableConcept)newValue);
				return;
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__DATE:
				setDate((Date)newValue);
				return;
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__SOURCE_IDENTITY_CERTIFICATE:
				setSourceIdentityCertificate((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__PROXY_IDENTITY_CERTIFICATE:
				setProxyIdentityCertificate((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__PROXY_SIGNATURE:
				setProxySignature((Signature)newValue);
				return;
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__SOURCE_SIGNATURE:
				setSourceSignature((Signature)newValue);
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
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__WHO:
				setWho((Reference)null);
				return;
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__ON_BEHALF_OF:
				setOnBehalfOf((Reference)null);
				return;
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__COMMUNICATION_METHOD:
				setCommunicationMethod((CodeableConcept)null);
				return;
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__DATE:
				setDate((Date)null);
				return;
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__SOURCE_IDENTITY_CERTIFICATE:
				setSourceIdentityCertificate((org.hl7.fhir.String)null);
				return;
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__PROXY_IDENTITY_CERTIFICATE:
				setProxyIdentityCertificate((org.hl7.fhir.String)null);
				return;
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__PROXY_SIGNATURE:
				setProxySignature((Signature)null);
				return;
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__SOURCE_SIGNATURE:
				setSourceSignature((Signature)null);
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
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__WHO:
				return who != null;
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__ON_BEHALF_OF:
				return onBehalfOf != null;
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__COMMUNICATION_METHOD:
				return communicationMethod != null;
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__DATE:
				return date != null;
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__SOURCE_IDENTITY_CERTIFICATE:
				return sourceIdentityCertificate != null;
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__PROXY_IDENTITY_CERTIFICATE:
				return proxyIdentityCertificate != null;
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__PROXY_SIGNATURE:
				return proxySignature != null;
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__SOURCE_SIGNATURE:
				return sourceSignature != null;
		}
		return super.eIsSet(featureID);
	}

} //VerificationResultAttestationImpl
