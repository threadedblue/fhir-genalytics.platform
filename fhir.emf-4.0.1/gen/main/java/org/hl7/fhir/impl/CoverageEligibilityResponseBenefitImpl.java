/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.CoverageEligibilityResponseBenefit;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Money;
import org.hl7.fhir.UnsignedInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coverage Eligibility Response Benefit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityResponseBenefitImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityResponseBenefitImpl#getAllowedUnsignedInt <em>Allowed Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityResponseBenefitImpl#getAllowedString <em>Allowed String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityResponseBenefitImpl#getAllowedMoney <em>Allowed Money</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityResponseBenefitImpl#getUsedUnsignedInt <em>Used Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityResponseBenefitImpl#getUsedString <em>Used String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityResponseBenefitImpl#getUsedMoney <em>Used Money</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoverageEligibilityResponseBenefitImpl extends BackboneElementImpl implements CoverageEligibilityResponseBenefit {
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
	 * The cached value of the '{@link #getAllowedUnsignedInt() <em>Allowed Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedUnsignedInt()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt allowedUnsignedInt;

	/**
	 * The cached value of the '{@link #getAllowedString() <em>Allowed String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String allowedString;

	/**
	 * The cached value of the '{@link #getAllowedMoney() <em>Allowed Money</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedMoney()
	 * @generated
	 * @ordered
	 */
	protected Money allowedMoney;

	/**
	 * The cached value of the '{@link #getUsedUnsignedInt() <em>Used Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedUnsignedInt()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt usedUnsignedInt;

	/**
	 * The cached value of the '{@link #getUsedString() <em>Used String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String usedString;

	/**
	 * The cached value of the '{@link #getUsedMoney() <em>Used Money</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedMoney()
	 * @generated
	 * @ordered
	 */
	protected Money usedMoney;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoverageEligibilityResponseBenefitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCoverageEligibilityResponseBenefit();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnsignedInt getAllowedUnsignedInt() {
		return allowedUnsignedInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllowedUnsignedInt(UnsignedInt newAllowedUnsignedInt, NotificationChain msgs) {
		UnsignedInt oldAllowedUnsignedInt = allowedUnsignedInt;
		allowedUnsignedInt = newAllowedUnsignedInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__ALLOWED_UNSIGNED_INT, oldAllowedUnsignedInt, newAllowedUnsignedInt);
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
	public void setAllowedUnsignedInt(UnsignedInt newAllowedUnsignedInt) {
		if (newAllowedUnsignedInt != allowedUnsignedInt) {
			NotificationChain msgs = null;
			if (allowedUnsignedInt != null)
				msgs = ((InternalEObject)allowedUnsignedInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__ALLOWED_UNSIGNED_INT, null, msgs);
			if (newAllowedUnsignedInt != null)
				msgs = ((InternalEObject)newAllowedUnsignedInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__ALLOWED_UNSIGNED_INT, null, msgs);
			msgs = basicSetAllowedUnsignedInt(newAllowedUnsignedInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__ALLOWED_UNSIGNED_INT, newAllowedUnsignedInt, newAllowedUnsignedInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getAllowedString() {
		return allowedString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllowedString(org.hl7.fhir.String newAllowedString, NotificationChain msgs) {
		org.hl7.fhir.String oldAllowedString = allowedString;
		allowedString = newAllowedString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__ALLOWED_STRING, oldAllowedString, newAllowedString);
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
	public void setAllowedString(org.hl7.fhir.String newAllowedString) {
		if (newAllowedString != allowedString) {
			NotificationChain msgs = null;
			if (allowedString != null)
				msgs = ((InternalEObject)allowedString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__ALLOWED_STRING, null, msgs);
			if (newAllowedString != null)
				msgs = ((InternalEObject)newAllowedString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__ALLOWED_STRING, null, msgs);
			msgs = basicSetAllowedString(newAllowedString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__ALLOWED_STRING, newAllowedString, newAllowedString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Money getAllowedMoney() {
		return allowedMoney;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllowedMoney(Money newAllowedMoney, NotificationChain msgs) {
		Money oldAllowedMoney = allowedMoney;
		allowedMoney = newAllowedMoney;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__ALLOWED_MONEY, oldAllowedMoney, newAllowedMoney);
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
	public void setAllowedMoney(Money newAllowedMoney) {
		if (newAllowedMoney != allowedMoney) {
			NotificationChain msgs = null;
			if (allowedMoney != null)
				msgs = ((InternalEObject)allowedMoney).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__ALLOWED_MONEY, null, msgs);
			if (newAllowedMoney != null)
				msgs = ((InternalEObject)newAllowedMoney).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__ALLOWED_MONEY, null, msgs);
			msgs = basicSetAllowedMoney(newAllowedMoney, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__ALLOWED_MONEY, newAllowedMoney, newAllowedMoney));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnsignedInt getUsedUnsignedInt() {
		return usedUnsignedInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsedUnsignedInt(UnsignedInt newUsedUnsignedInt, NotificationChain msgs) {
		UnsignedInt oldUsedUnsignedInt = usedUnsignedInt;
		usedUnsignedInt = newUsedUnsignedInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__USED_UNSIGNED_INT, oldUsedUnsignedInt, newUsedUnsignedInt);
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
	public void setUsedUnsignedInt(UnsignedInt newUsedUnsignedInt) {
		if (newUsedUnsignedInt != usedUnsignedInt) {
			NotificationChain msgs = null;
			if (usedUnsignedInt != null)
				msgs = ((InternalEObject)usedUnsignedInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__USED_UNSIGNED_INT, null, msgs);
			if (newUsedUnsignedInt != null)
				msgs = ((InternalEObject)newUsedUnsignedInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__USED_UNSIGNED_INT, null, msgs);
			msgs = basicSetUsedUnsignedInt(newUsedUnsignedInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__USED_UNSIGNED_INT, newUsedUnsignedInt, newUsedUnsignedInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getUsedString() {
		return usedString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsedString(org.hl7.fhir.String newUsedString, NotificationChain msgs) {
		org.hl7.fhir.String oldUsedString = usedString;
		usedString = newUsedString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__USED_STRING, oldUsedString, newUsedString);
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
	public void setUsedString(org.hl7.fhir.String newUsedString) {
		if (newUsedString != usedString) {
			NotificationChain msgs = null;
			if (usedString != null)
				msgs = ((InternalEObject)usedString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__USED_STRING, null, msgs);
			if (newUsedString != null)
				msgs = ((InternalEObject)newUsedString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__USED_STRING, null, msgs);
			msgs = basicSetUsedString(newUsedString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__USED_STRING, newUsedString, newUsedString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Money getUsedMoney() {
		return usedMoney;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsedMoney(Money newUsedMoney, NotificationChain msgs) {
		Money oldUsedMoney = usedMoney;
		usedMoney = newUsedMoney;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__USED_MONEY, oldUsedMoney, newUsedMoney);
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
	public void setUsedMoney(Money newUsedMoney) {
		if (newUsedMoney != usedMoney) {
			NotificationChain msgs = null;
			if (usedMoney != null)
				msgs = ((InternalEObject)usedMoney).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__USED_MONEY, null, msgs);
			if (newUsedMoney != null)
				msgs = ((InternalEObject)newUsedMoney).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__USED_MONEY, null, msgs);
			msgs = basicSetUsedMoney(newUsedMoney, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__USED_MONEY, newUsedMoney, newUsedMoney));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__ALLOWED_UNSIGNED_INT:
				return basicSetAllowedUnsignedInt(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__ALLOWED_STRING:
				return basicSetAllowedString(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__ALLOWED_MONEY:
				return basicSetAllowedMoney(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__USED_UNSIGNED_INT:
				return basicSetUsedUnsignedInt(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__USED_STRING:
				return basicSetUsedString(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__USED_MONEY:
				return basicSetUsedMoney(null, msgs);
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
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__TYPE:
				return getType();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__ALLOWED_UNSIGNED_INT:
				return getAllowedUnsignedInt();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__ALLOWED_STRING:
				return getAllowedString();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__ALLOWED_MONEY:
				return getAllowedMoney();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__USED_UNSIGNED_INT:
				return getUsedUnsignedInt();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__USED_STRING:
				return getUsedString();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__USED_MONEY:
				return getUsedMoney();
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
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__ALLOWED_UNSIGNED_INT:
				setAllowedUnsignedInt((UnsignedInt)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__ALLOWED_STRING:
				setAllowedString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__ALLOWED_MONEY:
				setAllowedMoney((Money)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__USED_UNSIGNED_INT:
				setUsedUnsignedInt((UnsignedInt)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__USED_STRING:
				setUsedString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__USED_MONEY:
				setUsedMoney((Money)newValue);
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
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__ALLOWED_UNSIGNED_INT:
				setAllowedUnsignedInt((UnsignedInt)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__ALLOWED_STRING:
				setAllowedString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__ALLOWED_MONEY:
				setAllowedMoney((Money)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__USED_UNSIGNED_INT:
				setUsedUnsignedInt((UnsignedInt)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__USED_STRING:
				setUsedString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__USED_MONEY:
				setUsedMoney((Money)null);
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
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__TYPE:
				return type != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__ALLOWED_UNSIGNED_INT:
				return allowedUnsignedInt != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__ALLOWED_STRING:
				return allowedString != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__ALLOWED_MONEY:
				return allowedMoney != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__USED_UNSIGNED_INT:
				return usedUnsignedInt != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__USED_STRING:
				return usedString != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT__USED_MONEY:
				return usedMoney != null;
		}
		return super.eIsSet(featureID);
	}

} //CoverageEligibilityResponseBenefitImpl
