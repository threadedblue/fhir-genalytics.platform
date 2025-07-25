/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.MarketingStatus;
import org.hl7.fhir.Period;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Marketing Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MarketingStatusImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MarketingStatusImpl#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MarketingStatusImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MarketingStatusImpl#getDateRange <em>Date Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MarketingStatusImpl#getRestoreDate <em>Restore Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarketingStatusImpl extends BackboneElementImpl implements MarketingStatus {
	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept country;

	/**
	 * The cached value of the '{@link #getJurisdiction() <em>Jurisdiction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJurisdiction()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept jurisdiction;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept status;

	/**
	 * The cached value of the '{@link #getDateRange() <em>Date Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateRange()
	 * @generated
	 * @ordered
	 */
	protected Period dateRange;

	/**
	 * The cached value of the '{@link #getRestoreDate() <em>Restore Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestoreDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime restoreDate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarketingStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMarketingStatus();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCountry(CodeableConcept newCountry, NotificationChain msgs) {
		CodeableConcept oldCountry = country;
		country = newCountry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MARKETING_STATUS__COUNTRY, oldCountry, newCountry);
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
	public void setCountry(CodeableConcept newCountry) {
		if (newCountry != country) {
			NotificationChain msgs = null;
			if (country != null)
				msgs = ((InternalEObject)country).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MARKETING_STATUS__COUNTRY, null, msgs);
			if (newCountry != null)
				msgs = ((InternalEObject)newCountry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MARKETING_STATUS__COUNTRY, null, msgs);
			msgs = basicSetCountry(newCountry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MARKETING_STATUS__COUNTRY, newCountry, newCountry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getJurisdiction() {
		return jurisdiction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJurisdiction(CodeableConcept newJurisdiction, NotificationChain msgs) {
		CodeableConcept oldJurisdiction = jurisdiction;
		jurisdiction = newJurisdiction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MARKETING_STATUS__JURISDICTION, oldJurisdiction, newJurisdiction);
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
	public void setJurisdiction(CodeableConcept newJurisdiction) {
		if (newJurisdiction != jurisdiction) {
			NotificationChain msgs = null;
			if (jurisdiction != null)
				msgs = ((InternalEObject)jurisdiction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MARKETING_STATUS__JURISDICTION, null, msgs);
			if (newJurisdiction != null)
				msgs = ((InternalEObject)newJurisdiction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MARKETING_STATUS__JURISDICTION, null, msgs);
			msgs = basicSetJurisdiction(newJurisdiction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MARKETING_STATUS__JURISDICTION, newJurisdiction, newJurisdiction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(CodeableConcept newStatus, NotificationChain msgs) {
		CodeableConcept oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MARKETING_STATUS__STATUS, oldStatus, newStatus);
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
	public void setStatus(CodeableConcept newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MARKETING_STATUS__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MARKETING_STATUS__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MARKETING_STATUS__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getDateRange() {
		return dateRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateRange(Period newDateRange, NotificationChain msgs) {
		Period oldDateRange = dateRange;
		dateRange = newDateRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MARKETING_STATUS__DATE_RANGE, oldDateRange, newDateRange);
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
	public void setDateRange(Period newDateRange) {
		if (newDateRange != dateRange) {
			NotificationChain msgs = null;
			if (dateRange != null)
				msgs = ((InternalEObject)dateRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MARKETING_STATUS__DATE_RANGE, null, msgs);
			if (newDateRange != null)
				msgs = ((InternalEObject)newDateRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MARKETING_STATUS__DATE_RANGE, null, msgs);
			msgs = basicSetDateRange(newDateRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MARKETING_STATUS__DATE_RANGE, newDateRange, newDateRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getRestoreDate() {
		return restoreDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRestoreDate(DateTime newRestoreDate, NotificationChain msgs) {
		DateTime oldRestoreDate = restoreDate;
		restoreDate = newRestoreDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MARKETING_STATUS__RESTORE_DATE, oldRestoreDate, newRestoreDate);
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
	public void setRestoreDate(DateTime newRestoreDate) {
		if (newRestoreDate != restoreDate) {
			NotificationChain msgs = null;
			if (restoreDate != null)
				msgs = ((InternalEObject)restoreDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MARKETING_STATUS__RESTORE_DATE, null, msgs);
			if (newRestoreDate != null)
				msgs = ((InternalEObject)newRestoreDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MARKETING_STATUS__RESTORE_DATE, null, msgs);
			msgs = basicSetRestoreDate(newRestoreDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MARKETING_STATUS__RESTORE_DATE, newRestoreDate, newRestoreDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MARKETING_STATUS__COUNTRY:
				return basicSetCountry(null, msgs);
			case FhirPackage.MARKETING_STATUS__JURISDICTION:
				return basicSetJurisdiction(null, msgs);
			case FhirPackage.MARKETING_STATUS__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.MARKETING_STATUS__DATE_RANGE:
				return basicSetDateRange(null, msgs);
			case FhirPackage.MARKETING_STATUS__RESTORE_DATE:
				return basicSetRestoreDate(null, msgs);
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
			case FhirPackage.MARKETING_STATUS__COUNTRY:
				return getCountry();
			case FhirPackage.MARKETING_STATUS__JURISDICTION:
				return getJurisdiction();
			case FhirPackage.MARKETING_STATUS__STATUS:
				return getStatus();
			case FhirPackage.MARKETING_STATUS__DATE_RANGE:
				return getDateRange();
			case FhirPackage.MARKETING_STATUS__RESTORE_DATE:
				return getRestoreDate();
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
			case FhirPackage.MARKETING_STATUS__COUNTRY:
				setCountry((CodeableConcept)newValue);
				return;
			case FhirPackage.MARKETING_STATUS__JURISDICTION:
				setJurisdiction((CodeableConcept)newValue);
				return;
			case FhirPackage.MARKETING_STATUS__STATUS:
				setStatus((CodeableConcept)newValue);
				return;
			case FhirPackage.MARKETING_STATUS__DATE_RANGE:
				setDateRange((Period)newValue);
				return;
			case FhirPackage.MARKETING_STATUS__RESTORE_DATE:
				setRestoreDate((DateTime)newValue);
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
			case FhirPackage.MARKETING_STATUS__COUNTRY:
				setCountry((CodeableConcept)null);
				return;
			case FhirPackage.MARKETING_STATUS__JURISDICTION:
				setJurisdiction((CodeableConcept)null);
				return;
			case FhirPackage.MARKETING_STATUS__STATUS:
				setStatus((CodeableConcept)null);
				return;
			case FhirPackage.MARKETING_STATUS__DATE_RANGE:
				setDateRange((Period)null);
				return;
			case FhirPackage.MARKETING_STATUS__RESTORE_DATE:
				setRestoreDate((DateTime)null);
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
			case FhirPackage.MARKETING_STATUS__COUNTRY:
				return country != null;
			case FhirPackage.MARKETING_STATUS__JURISDICTION:
				return jurisdiction != null;
			case FhirPackage.MARKETING_STATUS__STATUS:
				return status != null;
			case FhirPackage.MARKETING_STATUS__DATE_RANGE:
				return dateRange != null;
			case FhirPackage.MARKETING_STATUS__RESTORE_DATE:
				return restoreDate != null;
		}
		return super.eIsSet(featureID);
	}

} //MarketingStatusImpl
