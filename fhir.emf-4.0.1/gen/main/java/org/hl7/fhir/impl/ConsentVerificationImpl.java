/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.ConsentVerification;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consent Verification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ConsentVerificationImpl#getVerified <em>Verified</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentVerificationImpl#getVerifiedWith <em>Verified With</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentVerificationImpl#getVerificationDate <em>Verification Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsentVerificationImpl extends BackboneElementImpl implements ConsentVerification {
	/**
	 * The cached value of the '{@link #getVerified() <em>Verified</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerified()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean verified;

	/**
	 * The cached value of the '{@link #getVerifiedWith() <em>Verified With</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifiedWith()
	 * @generated
	 * @ordered
	 */
	protected Reference verifiedWith;

	/**
	 * The cached value of the '{@link #getVerificationDate() <em>Verification Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerificationDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime verificationDate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsentVerificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getConsentVerification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getVerified() {
		return verified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerified(org.hl7.fhir.Boolean newVerified, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldVerified = verified;
		verified = newVerified;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT_VERIFICATION__VERIFIED, oldVerified, newVerified);
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
	public void setVerified(org.hl7.fhir.Boolean newVerified) {
		if (newVerified != verified) {
			NotificationChain msgs = null;
			if (verified != null)
				msgs = ((InternalEObject)verified).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT_VERIFICATION__VERIFIED, null, msgs);
			if (newVerified != null)
				msgs = ((InternalEObject)newVerified).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT_VERIFICATION__VERIFIED, null, msgs);
			msgs = basicSetVerified(newVerified, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT_VERIFICATION__VERIFIED, newVerified, newVerified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getVerifiedWith() {
		return verifiedWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerifiedWith(Reference newVerifiedWith, NotificationChain msgs) {
		Reference oldVerifiedWith = verifiedWith;
		verifiedWith = newVerifiedWith;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT_VERIFICATION__VERIFIED_WITH, oldVerifiedWith, newVerifiedWith);
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
	public void setVerifiedWith(Reference newVerifiedWith) {
		if (newVerifiedWith != verifiedWith) {
			NotificationChain msgs = null;
			if (verifiedWith != null)
				msgs = ((InternalEObject)verifiedWith).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT_VERIFICATION__VERIFIED_WITH, null, msgs);
			if (newVerifiedWith != null)
				msgs = ((InternalEObject)newVerifiedWith).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT_VERIFICATION__VERIFIED_WITH, null, msgs);
			msgs = basicSetVerifiedWith(newVerifiedWith, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT_VERIFICATION__VERIFIED_WITH, newVerifiedWith, newVerifiedWith));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getVerificationDate() {
		return verificationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerificationDate(DateTime newVerificationDate, NotificationChain msgs) {
		DateTime oldVerificationDate = verificationDate;
		verificationDate = newVerificationDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT_VERIFICATION__VERIFICATION_DATE, oldVerificationDate, newVerificationDate);
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
	public void setVerificationDate(DateTime newVerificationDate) {
		if (newVerificationDate != verificationDate) {
			NotificationChain msgs = null;
			if (verificationDate != null)
				msgs = ((InternalEObject)verificationDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT_VERIFICATION__VERIFICATION_DATE, null, msgs);
			if (newVerificationDate != null)
				msgs = ((InternalEObject)newVerificationDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT_VERIFICATION__VERIFICATION_DATE, null, msgs);
			msgs = basicSetVerificationDate(newVerificationDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT_VERIFICATION__VERIFICATION_DATE, newVerificationDate, newVerificationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CONSENT_VERIFICATION__VERIFIED:
				return basicSetVerified(null, msgs);
			case FhirPackage.CONSENT_VERIFICATION__VERIFIED_WITH:
				return basicSetVerifiedWith(null, msgs);
			case FhirPackage.CONSENT_VERIFICATION__VERIFICATION_DATE:
				return basicSetVerificationDate(null, msgs);
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
			case FhirPackage.CONSENT_VERIFICATION__VERIFIED:
				return getVerified();
			case FhirPackage.CONSENT_VERIFICATION__VERIFIED_WITH:
				return getVerifiedWith();
			case FhirPackage.CONSENT_VERIFICATION__VERIFICATION_DATE:
				return getVerificationDate();
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
			case FhirPackage.CONSENT_VERIFICATION__VERIFIED:
				setVerified((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.CONSENT_VERIFICATION__VERIFIED_WITH:
				setVerifiedWith((Reference)newValue);
				return;
			case FhirPackage.CONSENT_VERIFICATION__VERIFICATION_DATE:
				setVerificationDate((DateTime)newValue);
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
			case FhirPackage.CONSENT_VERIFICATION__VERIFIED:
				setVerified((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.CONSENT_VERIFICATION__VERIFIED_WITH:
				setVerifiedWith((Reference)null);
				return;
			case FhirPackage.CONSENT_VERIFICATION__VERIFICATION_DATE:
				setVerificationDate((DateTime)null);
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
			case FhirPackage.CONSENT_VERIFICATION__VERIFIED:
				return verified != null;
			case FhirPackage.CONSENT_VERIFICATION__VERIFIED_WITH:
				return verifiedWith != null;
			case FhirPackage.CONSENT_VERIFICATION__VERIFICATION_DATE:
				return verificationDate != null;
		}
		return super.eIsSet(featureID);
	}

} //ConsentVerificationImpl
