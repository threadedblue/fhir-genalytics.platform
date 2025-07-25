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

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.InsurancePlanBenefit;
import org.hl7.fhir.InsurancePlanCoverage;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Insurance Plan Coverage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.InsurancePlanCoverageImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InsurancePlanCoverageImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InsurancePlanCoverageImpl#getBenefit <em>Benefit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InsurancePlanCoverageImpl extends BackboneElementImpl implements InsurancePlanCoverage {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> network;

	/**
	 * The cached value of the '{@link #getBenefit() <em>Benefit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefit()
	 * @generated
	 * @ordered
	 */
	protected EList<InsurancePlanBenefit> benefit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InsurancePlanCoverageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getInsurancePlanCoverage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INSURANCE_PLAN_COVERAGE__TYPE, oldType, newType);
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
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INSURANCE_PLAN_COVERAGE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INSURANCE_PLAN_COVERAGE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INSURANCE_PLAN_COVERAGE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getNetwork() {
		if (network == null) {
			network = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.INSURANCE_PLAN_COVERAGE__NETWORK);
		}
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InsurancePlanBenefit> getBenefit() {
		if (benefit == null) {
			benefit = new EObjectContainmentEList<InsurancePlanBenefit>(InsurancePlanBenefit.class, this, FhirPackage.INSURANCE_PLAN_COVERAGE__BENEFIT);
		}
		return benefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.INSURANCE_PLAN_COVERAGE__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.INSURANCE_PLAN_COVERAGE__NETWORK:
				return ((InternalEList<?>)getNetwork()).basicRemove(otherEnd, msgs);
			case FhirPackage.INSURANCE_PLAN_COVERAGE__BENEFIT:
				return ((InternalEList<?>)getBenefit()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.INSURANCE_PLAN_COVERAGE__TYPE:
				return getType();
			case FhirPackage.INSURANCE_PLAN_COVERAGE__NETWORK:
				return getNetwork();
			case FhirPackage.INSURANCE_PLAN_COVERAGE__BENEFIT:
				return getBenefit();
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
			case FhirPackage.INSURANCE_PLAN_COVERAGE__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.INSURANCE_PLAN_COVERAGE__NETWORK:
				getNetwork().clear();
				getNetwork().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.INSURANCE_PLAN_COVERAGE__BENEFIT:
				getBenefit().clear();
				getBenefit().addAll((Collection<? extends InsurancePlanBenefit>)newValue);
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
			case FhirPackage.INSURANCE_PLAN_COVERAGE__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.INSURANCE_PLAN_COVERAGE__NETWORK:
				getNetwork().clear();
				return;
			case FhirPackage.INSURANCE_PLAN_COVERAGE__BENEFIT:
				getBenefit().clear();
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
			case FhirPackage.INSURANCE_PLAN_COVERAGE__TYPE:
				return type != null;
			case FhirPackage.INSURANCE_PLAN_COVERAGE__NETWORK:
				return network != null && !network.isEmpty();
			case FhirPackage.INSURANCE_PLAN_COVERAGE__BENEFIT:
				return benefit != null && !benefit.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InsurancePlanCoverageImpl
