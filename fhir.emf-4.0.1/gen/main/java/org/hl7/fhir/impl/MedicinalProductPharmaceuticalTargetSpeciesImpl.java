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
import org.hl7.fhir.MedicinalProductPharmaceuticalTargetSpecies;
import org.hl7.fhir.MedicinalProductPharmaceuticalWithdrawalPeriod;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicinal Product Pharmaceutical Target Species</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductPharmaceuticalTargetSpeciesImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductPharmaceuticalTargetSpeciesImpl#getWithdrawalPeriod <em>Withdrawal Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductPharmaceuticalTargetSpeciesImpl extends BackboneElementImpl implements MedicinalProductPharmaceuticalTargetSpecies {
	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

	/**
	 * The cached value of the '{@link #getWithdrawalPeriod() <em>Withdrawal Period</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithdrawalPeriod()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductPharmaceuticalWithdrawalPeriod> withdrawalPeriod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductPharmaceuticalTargetSpeciesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicinalProductPharmaceuticalTargetSpecies();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CodeableConcept newCode, NotificationChain msgs) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_TARGET_SPECIES__CODE, oldCode, newCode);
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
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_TARGET_SPECIES__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_TARGET_SPECIES__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_TARGET_SPECIES__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicinalProductPharmaceuticalWithdrawalPeriod> getWithdrawalPeriod() {
		if (withdrawalPeriod == null) {
			withdrawalPeriod = new EObjectContainmentEList<MedicinalProductPharmaceuticalWithdrawalPeriod>(MedicinalProductPharmaceuticalWithdrawalPeriod.class, this, FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_TARGET_SPECIES__WITHDRAWAL_PERIOD);
		}
		return withdrawalPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_TARGET_SPECIES__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_TARGET_SPECIES__WITHDRAWAL_PERIOD:
				return ((InternalEList<?>)getWithdrawalPeriod()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_TARGET_SPECIES__CODE:
				return getCode();
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_TARGET_SPECIES__WITHDRAWAL_PERIOD:
				return getWithdrawalPeriod();
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
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_TARGET_SPECIES__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_TARGET_SPECIES__WITHDRAWAL_PERIOD:
				getWithdrawalPeriod().clear();
				getWithdrawalPeriod().addAll((Collection<? extends MedicinalProductPharmaceuticalWithdrawalPeriod>)newValue);
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
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_TARGET_SPECIES__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_TARGET_SPECIES__WITHDRAWAL_PERIOD:
				getWithdrawalPeriod().clear();
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
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_TARGET_SPECIES__CODE:
				return code != null;
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_TARGET_SPECIES__WITHDRAWAL_PERIOD:
				return withdrawalPeriod != null && !withdrawalPeriod.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductPharmaceuticalTargetSpeciesImpl
