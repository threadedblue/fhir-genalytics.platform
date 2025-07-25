/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CoverageEligibilityRequestSupportingInfo;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coverage Eligibility Request Supporting Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityRequestSupportingInfoImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityRequestSupportingInfoImpl#getInformation <em>Information</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityRequestSupportingInfoImpl#getAppliesToAll <em>Applies To All</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoverageEligibilityRequestSupportingInfoImpl extends BackboneElementImpl implements CoverageEligibilityRequestSupportingInfo {
	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt sequence;

	/**
	 * The cached value of the '{@link #getInformation() <em>Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformation()
	 * @generated
	 * @ordered
	 */
	protected Reference information;

	/**
	 * The cached value of the '{@link #getAppliesToAll() <em>Applies To All</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliesToAll()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean appliesToAll;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoverageEligibilityRequestSupportingInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCoverageEligibilityRequestSupportingInfo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequence(PositiveInt newSequence, NotificationChain msgs) {
		PositiveInt oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_SUPPORTING_INFO__SEQUENCE, oldSequence, newSequence);
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
	public void setSequence(PositiveInt newSequence) {
		if (newSequence != sequence) {
			NotificationChain msgs = null;
			if (sequence != null)
				msgs = ((InternalEObject)sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_SUPPORTING_INFO__SEQUENCE, null, msgs);
			if (newSequence != null)
				msgs = ((InternalEObject)newSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_SUPPORTING_INFO__SEQUENCE, null, msgs);
			msgs = basicSetSequence(newSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_SUPPORTING_INFO__SEQUENCE, newSequence, newSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getInformation() {
		return information;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInformation(Reference newInformation, NotificationChain msgs) {
		Reference oldInformation = information;
		information = newInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_SUPPORTING_INFO__INFORMATION, oldInformation, newInformation);
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
	public void setInformation(Reference newInformation) {
		if (newInformation != information) {
			NotificationChain msgs = null;
			if (information != null)
				msgs = ((InternalEObject)information).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_SUPPORTING_INFO__INFORMATION, null, msgs);
			if (newInformation != null)
				msgs = ((InternalEObject)newInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_SUPPORTING_INFO__INFORMATION, null, msgs);
			msgs = basicSetInformation(newInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_SUPPORTING_INFO__INFORMATION, newInformation, newInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getAppliesToAll() {
		return appliesToAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppliesToAll(org.hl7.fhir.Boolean newAppliesToAll, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldAppliesToAll = appliesToAll;
		appliesToAll = newAppliesToAll;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_SUPPORTING_INFO__APPLIES_TO_ALL, oldAppliesToAll, newAppliesToAll);
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
	public void setAppliesToAll(org.hl7.fhir.Boolean newAppliesToAll) {
		if (newAppliesToAll != appliesToAll) {
			NotificationChain msgs = null;
			if (appliesToAll != null)
				msgs = ((InternalEObject)appliesToAll).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_SUPPORTING_INFO__APPLIES_TO_ALL, null, msgs);
			if (newAppliesToAll != null)
				msgs = ((InternalEObject)newAppliesToAll).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_SUPPORTING_INFO__APPLIES_TO_ALL, null, msgs);
			msgs = basicSetAppliesToAll(newAppliesToAll, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_SUPPORTING_INFO__APPLIES_TO_ALL, newAppliesToAll, newAppliesToAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_SUPPORTING_INFO__SEQUENCE:
				return basicSetSequence(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_SUPPORTING_INFO__INFORMATION:
				return basicSetInformation(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_SUPPORTING_INFO__APPLIES_TO_ALL:
				return basicSetAppliesToAll(null, msgs);
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
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_SUPPORTING_INFO__SEQUENCE:
				return getSequence();
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_SUPPORTING_INFO__INFORMATION:
				return getInformation();
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_SUPPORTING_INFO__APPLIES_TO_ALL:
				return getAppliesToAll();
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
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_SUPPORTING_INFO__SEQUENCE:
				setSequence((PositiveInt)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_SUPPORTING_INFO__INFORMATION:
				setInformation((Reference)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_SUPPORTING_INFO__APPLIES_TO_ALL:
				setAppliesToAll((org.hl7.fhir.Boolean)newValue);
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
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_SUPPORTING_INFO__SEQUENCE:
				setSequence((PositiveInt)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_SUPPORTING_INFO__INFORMATION:
				setInformation((Reference)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_SUPPORTING_INFO__APPLIES_TO_ALL:
				setAppliesToAll((org.hl7.fhir.Boolean)null);
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
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_SUPPORTING_INFO__SEQUENCE:
				return sequence != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_SUPPORTING_INFO__INFORMATION:
				return information != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_SUPPORTING_INFO__APPLIES_TO_ALL:
				return appliesToAll != null;
		}
		return super.eIsSet(featureID);
	}

} //CoverageEligibilityRequestSupportingInfoImpl
