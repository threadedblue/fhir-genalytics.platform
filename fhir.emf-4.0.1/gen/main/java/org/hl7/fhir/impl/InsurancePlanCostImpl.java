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
import org.hl7.fhir.InsurancePlanCost;
import org.hl7.fhir.Quantity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Insurance Plan Cost</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.InsurancePlanCostImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InsurancePlanCostImpl#getApplicability <em>Applicability</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InsurancePlanCostImpl#getQualifiers <em>Qualifiers</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InsurancePlanCostImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InsurancePlanCostImpl extends BackboneElementImpl implements InsurancePlanCost {
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
	 * The cached value of the '{@link #getApplicability() <em>Applicability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicability()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept applicability;

	/**
	 * The cached value of the '{@link #getQualifiers() <em>Qualifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> qualifiers;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Quantity value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InsurancePlanCostImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getInsurancePlanCost();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INSURANCE_PLAN_COST__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INSURANCE_PLAN_COST__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INSURANCE_PLAN_COST__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INSURANCE_PLAN_COST__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getApplicability() {
		return applicability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicability(CodeableConcept newApplicability, NotificationChain msgs) {
		CodeableConcept oldApplicability = applicability;
		applicability = newApplicability;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INSURANCE_PLAN_COST__APPLICABILITY, oldApplicability, newApplicability);
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
	public void setApplicability(CodeableConcept newApplicability) {
		if (newApplicability != applicability) {
			NotificationChain msgs = null;
			if (applicability != null)
				msgs = ((InternalEObject)applicability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INSURANCE_PLAN_COST__APPLICABILITY, null, msgs);
			if (newApplicability != null)
				msgs = ((InternalEObject)newApplicability).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INSURANCE_PLAN_COST__APPLICABILITY, null, msgs);
			msgs = basicSetApplicability(newApplicability, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INSURANCE_PLAN_COST__APPLICABILITY, newApplicability, newApplicability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getQualifiers() {
		if (qualifiers == null) {
			qualifiers = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.INSURANCE_PLAN_COST__QUALIFIERS);
		}
		return qualifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(Quantity newValue, NotificationChain msgs) {
		Quantity oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INSURANCE_PLAN_COST__VALUE, oldValue, newValue);
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
	public void setValue(Quantity newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INSURANCE_PLAN_COST__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INSURANCE_PLAN_COST__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INSURANCE_PLAN_COST__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.INSURANCE_PLAN_COST__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.INSURANCE_PLAN_COST__APPLICABILITY:
				return basicSetApplicability(null, msgs);
			case FhirPackage.INSURANCE_PLAN_COST__QUALIFIERS:
				return ((InternalEList<?>)getQualifiers()).basicRemove(otherEnd, msgs);
			case FhirPackage.INSURANCE_PLAN_COST__VALUE:
				return basicSetValue(null, msgs);
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
			case FhirPackage.INSURANCE_PLAN_COST__TYPE:
				return getType();
			case FhirPackage.INSURANCE_PLAN_COST__APPLICABILITY:
				return getApplicability();
			case FhirPackage.INSURANCE_PLAN_COST__QUALIFIERS:
				return getQualifiers();
			case FhirPackage.INSURANCE_PLAN_COST__VALUE:
				return getValue();
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
			case FhirPackage.INSURANCE_PLAN_COST__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.INSURANCE_PLAN_COST__APPLICABILITY:
				setApplicability((CodeableConcept)newValue);
				return;
			case FhirPackage.INSURANCE_PLAN_COST__QUALIFIERS:
				getQualifiers().clear();
				getQualifiers().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.INSURANCE_PLAN_COST__VALUE:
				setValue((Quantity)newValue);
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
			case FhirPackage.INSURANCE_PLAN_COST__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.INSURANCE_PLAN_COST__APPLICABILITY:
				setApplicability((CodeableConcept)null);
				return;
			case FhirPackage.INSURANCE_PLAN_COST__QUALIFIERS:
				getQualifiers().clear();
				return;
			case FhirPackage.INSURANCE_PLAN_COST__VALUE:
				setValue((Quantity)null);
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
			case FhirPackage.INSURANCE_PLAN_COST__TYPE:
				return type != null;
			case FhirPackage.INSURANCE_PLAN_COST__APPLICABILITY:
				return applicability != null;
			case FhirPackage.INSURANCE_PLAN_COST__QUALIFIERS:
				return qualifiers != null && !qualifiers.isEmpty();
			case FhirPackage.INSURANCE_PLAN_COST__VALUE:
				return value != null;
		}
		return super.eIsSet(featureID);
	}

} //InsurancePlanCostImpl
