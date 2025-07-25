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
import org.hl7.fhir.CoverageCostToBeneficiary;
import org.hl7.fhir.CoverageException;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Money;
import org.hl7.fhir.Quantity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coverage Cost To Beneficiary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CoverageCostToBeneficiaryImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageCostToBeneficiaryImpl#getValueQuantity <em>Value Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageCostToBeneficiaryImpl#getValueMoney <em>Value Money</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageCostToBeneficiaryImpl#getException <em>Exception</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoverageCostToBeneficiaryImpl extends BackboneElementImpl implements CoverageCostToBeneficiary {
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
	 * The cached value of the '{@link #getValueQuantity() <em>Value Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity valueQuantity;

	/**
	 * The cached value of the '{@link #getValueMoney() <em>Value Money</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueMoney()
	 * @generated
	 * @ordered
	 */
	protected Money valueMoney;

	/**
	 * The cached value of the '{@link #getException() <em>Exception</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getException()
	 * @generated
	 * @ordered
	 */
	protected EList<CoverageException> exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoverageCostToBeneficiaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCoverageCostToBeneficiary();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_COST_TO_BENEFICIARY__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_COST_TO_BENEFICIARY__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_COST_TO_BENEFICIARY__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_COST_TO_BENEFICIARY__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getValueQuantity() {
		return valueQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueQuantity(Quantity newValueQuantity, NotificationChain msgs) {
		Quantity oldValueQuantity = valueQuantity;
		valueQuantity = newValueQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_COST_TO_BENEFICIARY__VALUE_QUANTITY, oldValueQuantity, newValueQuantity);
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
	public void setValueQuantity(Quantity newValueQuantity) {
		if (newValueQuantity != valueQuantity) {
			NotificationChain msgs = null;
			if (valueQuantity != null)
				msgs = ((InternalEObject)valueQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_COST_TO_BENEFICIARY__VALUE_QUANTITY, null, msgs);
			if (newValueQuantity != null)
				msgs = ((InternalEObject)newValueQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_COST_TO_BENEFICIARY__VALUE_QUANTITY, null, msgs);
			msgs = basicSetValueQuantity(newValueQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_COST_TO_BENEFICIARY__VALUE_QUANTITY, newValueQuantity, newValueQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Money getValueMoney() {
		return valueMoney;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueMoney(Money newValueMoney, NotificationChain msgs) {
		Money oldValueMoney = valueMoney;
		valueMoney = newValueMoney;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_COST_TO_BENEFICIARY__VALUE_MONEY, oldValueMoney, newValueMoney);
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
	public void setValueMoney(Money newValueMoney) {
		if (newValueMoney != valueMoney) {
			NotificationChain msgs = null;
			if (valueMoney != null)
				msgs = ((InternalEObject)valueMoney).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_COST_TO_BENEFICIARY__VALUE_MONEY, null, msgs);
			if (newValueMoney != null)
				msgs = ((InternalEObject)newValueMoney).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_COST_TO_BENEFICIARY__VALUE_MONEY, null, msgs);
			msgs = basicSetValueMoney(newValueMoney, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_COST_TO_BENEFICIARY__VALUE_MONEY, newValueMoney, newValueMoney));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CoverageException> getException() {
		if (exception == null) {
			exception = new EObjectContainmentEList<CoverageException>(CoverageException.class, this, FhirPackage.COVERAGE_COST_TO_BENEFICIARY__EXCEPTION);
		}
		return exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.COVERAGE_COST_TO_BENEFICIARY__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.COVERAGE_COST_TO_BENEFICIARY__VALUE_QUANTITY:
				return basicSetValueQuantity(null, msgs);
			case FhirPackage.COVERAGE_COST_TO_BENEFICIARY__VALUE_MONEY:
				return basicSetValueMoney(null, msgs);
			case FhirPackage.COVERAGE_COST_TO_BENEFICIARY__EXCEPTION:
				return ((InternalEList<?>)getException()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.COVERAGE_COST_TO_BENEFICIARY__TYPE:
				return getType();
			case FhirPackage.COVERAGE_COST_TO_BENEFICIARY__VALUE_QUANTITY:
				return getValueQuantity();
			case FhirPackage.COVERAGE_COST_TO_BENEFICIARY__VALUE_MONEY:
				return getValueMoney();
			case FhirPackage.COVERAGE_COST_TO_BENEFICIARY__EXCEPTION:
				return getException();
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
			case FhirPackage.COVERAGE_COST_TO_BENEFICIARY__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.COVERAGE_COST_TO_BENEFICIARY__VALUE_QUANTITY:
				setValueQuantity((Quantity)newValue);
				return;
			case FhirPackage.COVERAGE_COST_TO_BENEFICIARY__VALUE_MONEY:
				setValueMoney((Money)newValue);
				return;
			case FhirPackage.COVERAGE_COST_TO_BENEFICIARY__EXCEPTION:
				getException().clear();
				getException().addAll((Collection<? extends CoverageException>)newValue);
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
			case FhirPackage.COVERAGE_COST_TO_BENEFICIARY__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.COVERAGE_COST_TO_BENEFICIARY__VALUE_QUANTITY:
				setValueQuantity((Quantity)null);
				return;
			case FhirPackage.COVERAGE_COST_TO_BENEFICIARY__VALUE_MONEY:
				setValueMoney((Money)null);
				return;
			case FhirPackage.COVERAGE_COST_TO_BENEFICIARY__EXCEPTION:
				getException().clear();
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
			case FhirPackage.COVERAGE_COST_TO_BENEFICIARY__TYPE:
				return type != null;
			case FhirPackage.COVERAGE_COST_TO_BENEFICIARY__VALUE_QUANTITY:
				return valueQuantity != null;
			case FhirPackage.COVERAGE_COST_TO_BENEFICIARY__VALUE_MONEY:
				return valueMoney != null;
			case FhirPackage.COVERAGE_COST_TO_BENEFICIARY__EXCEPTION:
				return exception != null && !exception.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CoverageCostToBeneficiaryImpl
