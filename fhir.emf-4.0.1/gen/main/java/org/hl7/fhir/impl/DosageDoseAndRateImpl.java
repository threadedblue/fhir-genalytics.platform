/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DosageDoseAndRate;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Range;
import org.hl7.fhir.Ratio;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dosage Dose And Rate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DosageDoseAndRateImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DosageDoseAndRateImpl#getDoseRange <em>Dose Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DosageDoseAndRateImpl#getDoseQuantity <em>Dose Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DosageDoseAndRateImpl#getRateRatio <em>Rate Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DosageDoseAndRateImpl#getRateRange <em>Rate Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DosageDoseAndRateImpl#getRateQuantity <em>Rate Quantity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DosageDoseAndRateImpl extends BackboneElementImpl implements DosageDoseAndRate {
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
	 * The cached value of the '{@link #getDoseRange() <em>Dose Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseRange()
	 * @generated
	 * @ordered
	 */
	protected Range doseRange;

	/**
	 * The cached value of the '{@link #getDoseQuantity() <em>Dose Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity doseQuantity;

	/**
	 * The cached value of the '{@link #getRateRatio() <em>Rate Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateRatio()
	 * @generated
	 * @ordered
	 */
	protected Ratio rateRatio;

	/**
	 * The cached value of the '{@link #getRateRange() <em>Rate Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateRange()
	 * @generated
	 * @ordered
	 */
	protected Range rateRange;

	/**
	 * The cached value of the '{@link #getRateQuantity() <em>Rate Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity rateQuantity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DosageDoseAndRateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDosageDoseAndRate();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DOSAGE_DOSE_AND_RATE__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOSAGE_DOSE_AND_RATE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOSAGE_DOSE_AND_RATE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DOSAGE_DOSE_AND_RATE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Range getDoseRange() {
		return doseRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoseRange(Range newDoseRange, NotificationChain msgs) {
		Range oldDoseRange = doseRange;
		doseRange = newDoseRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DOSAGE_DOSE_AND_RATE__DOSE_RANGE, oldDoseRange, newDoseRange);
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
	public void setDoseRange(Range newDoseRange) {
		if (newDoseRange != doseRange) {
			NotificationChain msgs = null;
			if (doseRange != null)
				msgs = ((InternalEObject)doseRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOSAGE_DOSE_AND_RATE__DOSE_RANGE, null, msgs);
			if (newDoseRange != null)
				msgs = ((InternalEObject)newDoseRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOSAGE_DOSE_AND_RATE__DOSE_RANGE, null, msgs);
			msgs = basicSetDoseRange(newDoseRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DOSAGE_DOSE_AND_RATE__DOSE_RANGE, newDoseRange, newDoseRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getDoseQuantity() {
		return doseQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoseQuantity(Quantity newDoseQuantity, NotificationChain msgs) {
		Quantity oldDoseQuantity = doseQuantity;
		doseQuantity = newDoseQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DOSAGE_DOSE_AND_RATE__DOSE_QUANTITY, oldDoseQuantity, newDoseQuantity);
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
	public void setDoseQuantity(Quantity newDoseQuantity) {
		if (newDoseQuantity != doseQuantity) {
			NotificationChain msgs = null;
			if (doseQuantity != null)
				msgs = ((InternalEObject)doseQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOSAGE_DOSE_AND_RATE__DOSE_QUANTITY, null, msgs);
			if (newDoseQuantity != null)
				msgs = ((InternalEObject)newDoseQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOSAGE_DOSE_AND_RATE__DOSE_QUANTITY, null, msgs);
			msgs = basicSetDoseQuantity(newDoseQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DOSAGE_DOSE_AND_RATE__DOSE_QUANTITY, newDoseQuantity, newDoseQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ratio getRateRatio() {
		return rateRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRateRatio(Ratio newRateRatio, NotificationChain msgs) {
		Ratio oldRateRatio = rateRatio;
		rateRatio = newRateRatio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DOSAGE_DOSE_AND_RATE__RATE_RATIO, oldRateRatio, newRateRatio);
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
	public void setRateRatio(Ratio newRateRatio) {
		if (newRateRatio != rateRatio) {
			NotificationChain msgs = null;
			if (rateRatio != null)
				msgs = ((InternalEObject)rateRatio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOSAGE_DOSE_AND_RATE__RATE_RATIO, null, msgs);
			if (newRateRatio != null)
				msgs = ((InternalEObject)newRateRatio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOSAGE_DOSE_AND_RATE__RATE_RATIO, null, msgs);
			msgs = basicSetRateRatio(newRateRatio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DOSAGE_DOSE_AND_RATE__RATE_RATIO, newRateRatio, newRateRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Range getRateRange() {
		return rateRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRateRange(Range newRateRange, NotificationChain msgs) {
		Range oldRateRange = rateRange;
		rateRange = newRateRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DOSAGE_DOSE_AND_RATE__RATE_RANGE, oldRateRange, newRateRange);
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
	public void setRateRange(Range newRateRange) {
		if (newRateRange != rateRange) {
			NotificationChain msgs = null;
			if (rateRange != null)
				msgs = ((InternalEObject)rateRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOSAGE_DOSE_AND_RATE__RATE_RANGE, null, msgs);
			if (newRateRange != null)
				msgs = ((InternalEObject)newRateRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOSAGE_DOSE_AND_RATE__RATE_RANGE, null, msgs);
			msgs = basicSetRateRange(newRateRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DOSAGE_DOSE_AND_RATE__RATE_RANGE, newRateRange, newRateRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getRateQuantity() {
		return rateQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRateQuantity(Quantity newRateQuantity, NotificationChain msgs) {
		Quantity oldRateQuantity = rateQuantity;
		rateQuantity = newRateQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DOSAGE_DOSE_AND_RATE__RATE_QUANTITY, oldRateQuantity, newRateQuantity);
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
	public void setRateQuantity(Quantity newRateQuantity) {
		if (newRateQuantity != rateQuantity) {
			NotificationChain msgs = null;
			if (rateQuantity != null)
				msgs = ((InternalEObject)rateQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOSAGE_DOSE_AND_RATE__RATE_QUANTITY, null, msgs);
			if (newRateQuantity != null)
				msgs = ((InternalEObject)newRateQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOSAGE_DOSE_AND_RATE__RATE_QUANTITY, null, msgs);
			msgs = basicSetRateQuantity(newRateQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DOSAGE_DOSE_AND_RATE__RATE_QUANTITY, newRateQuantity, newRateQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DOSAGE_DOSE_AND_RATE__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.DOSAGE_DOSE_AND_RATE__DOSE_RANGE:
				return basicSetDoseRange(null, msgs);
			case FhirPackage.DOSAGE_DOSE_AND_RATE__DOSE_QUANTITY:
				return basicSetDoseQuantity(null, msgs);
			case FhirPackage.DOSAGE_DOSE_AND_RATE__RATE_RATIO:
				return basicSetRateRatio(null, msgs);
			case FhirPackage.DOSAGE_DOSE_AND_RATE__RATE_RANGE:
				return basicSetRateRange(null, msgs);
			case FhirPackage.DOSAGE_DOSE_AND_RATE__RATE_QUANTITY:
				return basicSetRateQuantity(null, msgs);
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
			case FhirPackage.DOSAGE_DOSE_AND_RATE__TYPE:
				return getType();
			case FhirPackage.DOSAGE_DOSE_AND_RATE__DOSE_RANGE:
				return getDoseRange();
			case FhirPackage.DOSAGE_DOSE_AND_RATE__DOSE_QUANTITY:
				return getDoseQuantity();
			case FhirPackage.DOSAGE_DOSE_AND_RATE__RATE_RATIO:
				return getRateRatio();
			case FhirPackage.DOSAGE_DOSE_AND_RATE__RATE_RANGE:
				return getRateRange();
			case FhirPackage.DOSAGE_DOSE_AND_RATE__RATE_QUANTITY:
				return getRateQuantity();
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
			case FhirPackage.DOSAGE_DOSE_AND_RATE__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.DOSAGE_DOSE_AND_RATE__DOSE_RANGE:
				setDoseRange((Range)newValue);
				return;
			case FhirPackage.DOSAGE_DOSE_AND_RATE__DOSE_QUANTITY:
				setDoseQuantity((Quantity)newValue);
				return;
			case FhirPackage.DOSAGE_DOSE_AND_RATE__RATE_RATIO:
				setRateRatio((Ratio)newValue);
				return;
			case FhirPackage.DOSAGE_DOSE_AND_RATE__RATE_RANGE:
				setRateRange((Range)newValue);
				return;
			case FhirPackage.DOSAGE_DOSE_AND_RATE__RATE_QUANTITY:
				setRateQuantity((Quantity)newValue);
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
			case FhirPackage.DOSAGE_DOSE_AND_RATE__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.DOSAGE_DOSE_AND_RATE__DOSE_RANGE:
				setDoseRange((Range)null);
				return;
			case FhirPackage.DOSAGE_DOSE_AND_RATE__DOSE_QUANTITY:
				setDoseQuantity((Quantity)null);
				return;
			case FhirPackage.DOSAGE_DOSE_AND_RATE__RATE_RATIO:
				setRateRatio((Ratio)null);
				return;
			case FhirPackage.DOSAGE_DOSE_AND_RATE__RATE_RANGE:
				setRateRange((Range)null);
				return;
			case FhirPackage.DOSAGE_DOSE_AND_RATE__RATE_QUANTITY:
				setRateQuantity((Quantity)null);
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
			case FhirPackage.DOSAGE_DOSE_AND_RATE__TYPE:
				return type != null;
			case FhirPackage.DOSAGE_DOSE_AND_RATE__DOSE_RANGE:
				return doseRange != null;
			case FhirPackage.DOSAGE_DOSE_AND_RATE__DOSE_QUANTITY:
				return doseQuantity != null;
			case FhirPackage.DOSAGE_DOSE_AND_RATE__RATE_RATIO:
				return rateRatio != null;
			case FhirPackage.DOSAGE_DOSE_AND_RATE__RATE_RANGE:
				return rateRange != null;
			case FhirPackage.DOSAGE_DOSE_AND_RATE__RATE_QUANTITY:
				return rateQuantity != null;
		}
		return super.eIsSet(featureID);
	}

} //DosageDoseAndRateImpl
