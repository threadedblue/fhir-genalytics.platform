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

import org.hl7.fhir.ExplanationOfBenefitInsurance;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explanation Of Benefit Insurance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitInsuranceImpl#getFocal <em>Focal</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitInsuranceImpl#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitInsuranceImpl#getPreAuthRef <em>Pre Auth Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExplanationOfBenefitInsuranceImpl extends BackboneElementImpl implements ExplanationOfBenefitInsurance {
	/**
	 * The cached value of the '{@link #getFocal() <em>Focal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocal()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean focal;

	/**
	 * The cached value of the '{@link #getCoverage() <em>Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverage()
	 * @generated
	 * @ordered
	 */
	protected Reference coverage;

	/**
	 * The cached value of the '{@link #getPreAuthRef() <em>Pre Auth Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreAuthRef()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> preAuthRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExplanationOfBenefitInsuranceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getExplanationOfBenefitInsurance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getFocal() {
		return focal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFocal(org.hl7.fhir.Boolean newFocal, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldFocal = focal;
		focal = newFocal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_INSURANCE__FOCAL, oldFocal, newFocal);
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
	public void setFocal(org.hl7.fhir.Boolean newFocal) {
		if (newFocal != focal) {
			NotificationChain msgs = null;
			if (focal != null)
				msgs = ((InternalEObject)focal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_INSURANCE__FOCAL, null, msgs);
			if (newFocal != null)
				msgs = ((InternalEObject)newFocal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_INSURANCE__FOCAL, null, msgs);
			msgs = basicSetFocal(newFocal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_INSURANCE__FOCAL, newFocal, newFocal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getCoverage() {
		return coverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoverage(Reference newCoverage, NotificationChain msgs) {
		Reference oldCoverage = coverage;
		coverage = newCoverage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_INSURANCE__COVERAGE, oldCoverage, newCoverage);
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
	public void setCoverage(Reference newCoverage) {
		if (newCoverage != coverage) {
			NotificationChain msgs = null;
			if (coverage != null)
				msgs = ((InternalEObject)coverage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_INSURANCE__COVERAGE, null, msgs);
			if (newCoverage != null)
				msgs = ((InternalEObject)newCoverage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_INSURANCE__COVERAGE, null, msgs);
			msgs = basicSetCoverage(newCoverage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_INSURANCE__COVERAGE, newCoverage, newCoverage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.hl7.fhir.String> getPreAuthRef() {
		if (preAuthRef == null) {
			preAuthRef = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.EXPLANATION_OF_BENEFIT_INSURANCE__PRE_AUTH_REF);
		}
		return preAuthRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.EXPLANATION_OF_BENEFIT_INSURANCE__FOCAL:
				return basicSetFocal(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_INSURANCE__COVERAGE:
				return basicSetCoverage(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_INSURANCE__PRE_AUTH_REF:
				return ((InternalEList<?>)getPreAuthRef()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_INSURANCE__FOCAL:
				return getFocal();
			case FhirPackage.EXPLANATION_OF_BENEFIT_INSURANCE__COVERAGE:
				return getCoverage();
			case FhirPackage.EXPLANATION_OF_BENEFIT_INSURANCE__PRE_AUTH_REF:
				return getPreAuthRef();
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_INSURANCE__FOCAL:
				setFocal((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_INSURANCE__COVERAGE:
				setCoverage((Reference)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_INSURANCE__PRE_AUTH_REF:
				getPreAuthRef().clear();
				getPreAuthRef().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_INSURANCE__FOCAL:
				setFocal((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_INSURANCE__COVERAGE:
				setCoverage((Reference)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_INSURANCE__PRE_AUTH_REF:
				getPreAuthRef().clear();
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_INSURANCE__FOCAL:
				return focal != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_INSURANCE__COVERAGE:
				return coverage != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_INSURANCE__PRE_AUTH_REF:
				return preAuthRef != null && !preAuthRef.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExplanationOfBenefitInsuranceImpl
