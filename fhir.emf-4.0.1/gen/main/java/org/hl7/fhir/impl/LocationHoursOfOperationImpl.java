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

import org.hl7.fhir.DaysOfWeek;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.LocationHoursOfOperation;
import org.hl7.fhir.Time;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location Hours Of Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.LocationHoursOfOperationImpl#getDaysOfWeek <em>Days Of Week</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.LocationHoursOfOperationImpl#getAllDay <em>All Day</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.LocationHoursOfOperationImpl#getOpeningTime <em>Opening Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.LocationHoursOfOperationImpl#getClosingTime <em>Closing Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationHoursOfOperationImpl extends BackboneElementImpl implements LocationHoursOfOperation {
	/**
	 * The cached value of the '{@link #getDaysOfWeek() <em>Days Of Week</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaysOfWeek()
	 * @generated
	 * @ordered
	 */
	protected EList<DaysOfWeek> daysOfWeek;

	/**
	 * The cached value of the '{@link #getAllDay() <em>All Day</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllDay()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean allDay;

	/**
	 * The cached value of the '{@link #getOpeningTime() <em>Opening Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpeningTime()
	 * @generated
	 * @ordered
	 */
	protected Time openingTime;

	/**
	 * The cached value of the '{@link #getClosingTime() <em>Closing Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosingTime()
	 * @generated
	 * @ordered
	 */
	protected Time closingTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationHoursOfOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getLocationHoursOfOperation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DaysOfWeek> getDaysOfWeek() {
		if (daysOfWeek == null) {
			daysOfWeek = new EObjectContainmentEList<DaysOfWeek>(DaysOfWeek.class, this, FhirPackage.LOCATION_HOURS_OF_OPERATION__DAYS_OF_WEEK);
		}
		return daysOfWeek;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getAllDay() {
		return allDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllDay(org.hl7.fhir.Boolean newAllDay, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldAllDay = allDay;
		allDay = newAllDay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.LOCATION_HOURS_OF_OPERATION__ALL_DAY, oldAllDay, newAllDay);
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
	public void setAllDay(org.hl7.fhir.Boolean newAllDay) {
		if (newAllDay != allDay) {
			NotificationChain msgs = null;
			if (allDay != null)
				msgs = ((InternalEObject)allDay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LOCATION_HOURS_OF_OPERATION__ALL_DAY, null, msgs);
			if (newAllDay != null)
				msgs = ((InternalEObject)newAllDay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LOCATION_HOURS_OF_OPERATION__ALL_DAY, null, msgs);
			msgs = basicSetAllDay(newAllDay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.LOCATION_HOURS_OF_OPERATION__ALL_DAY, newAllDay, newAllDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Time getOpeningTime() {
		return openingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpeningTime(Time newOpeningTime, NotificationChain msgs) {
		Time oldOpeningTime = openingTime;
		openingTime = newOpeningTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.LOCATION_HOURS_OF_OPERATION__OPENING_TIME, oldOpeningTime, newOpeningTime);
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
	public void setOpeningTime(Time newOpeningTime) {
		if (newOpeningTime != openingTime) {
			NotificationChain msgs = null;
			if (openingTime != null)
				msgs = ((InternalEObject)openingTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LOCATION_HOURS_OF_OPERATION__OPENING_TIME, null, msgs);
			if (newOpeningTime != null)
				msgs = ((InternalEObject)newOpeningTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LOCATION_HOURS_OF_OPERATION__OPENING_TIME, null, msgs);
			msgs = basicSetOpeningTime(newOpeningTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.LOCATION_HOURS_OF_OPERATION__OPENING_TIME, newOpeningTime, newOpeningTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Time getClosingTime() {
		return closingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClosingTime(Time newClosingTime, NotificationChain msgs) {
		Time oldClosingTime = closingTime;
		closingTime = newClosingTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.LOCATION_HOURS_OF_OPERATION__CLOSING_TIME, oldClosingTime, newClosingTime);
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
	public void setClosingTime(Time newClosingTime) {
		if (newClosingTime != closingTime) {
			NotificationChain msgs = null;
			if (closingTime != null)
				msgs = ((InternalEObject)closingTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LOCATION_HOURS_OF_OPERATION__CLOSING_TIME, null, msgs);
			if (newClosingTime != null)
				msgs = ((InternalEObject)newClosingTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LOCATION_HOURS_OF_OPERATION__CLOSING_TIME, null, msgs);
			msgs = basicSetClosingTime(newClosingTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.LOCATION_HOURS_OF_OPERATION__CLOSING_TIME, newClosingTime, newClosingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.LOCATION_HOURS_OF_OPERATION__DAYS_OF_WEEK:
				return ((InternalEList<?>)getDaysOfWeek()).basicRemove(otherEnd, msgs);
			case FhirPackage.LOCATION_HOURS_OF_OPERATION__ALL_DAY:
				return basicSetAllDay(null, msgs);
			case FhirPackage.LOCATION_HOURS_OF_OPERATION__OPENING_TIME:
				return basicSetOpeningTime(null, msgs);
			case FhirPackage.LOCATION_HOURS_OF_OPERATION__CLOSING_TIME:
				return basicSetClosingTime(null, msgs);
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
			case FhirPackage.LOCATION_HOURS_OF_OPERATION__DAYS_OF_WEEK:
				return getDaysOfWeek();
			case FhirPackage.LOCATION_HOURS_OF_OPERATION__ALL_DAY:
				return getAllDay();
			case FhirPackage.LOCATION_HOURS_OF_OPERATION__OPENING_TIME:
				return getOpeningTime();
			case FhirPackage.LOCATION_HOURS_OF_OPERATION__CLOSING_TIME:
				return getClosingTime();
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
			case FhirPackage.LOCATION_HOURS_OF_OPERATION__DAYS_OF_WEEK:
				getDaysOfWeek().clear();
				getDaysOfWeek().addAll((Collection<? extends DaysOfWeek>)newValue);
				return;
			case FhirPackage.LOCATION_HOURS_OF_OPERATION__ALL_DAY:
				setAllDay((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.LOCATION_HOURS_OF_OPERATION__OPENING_TIME:
				setOpeningTime((Time)newValue);
				return;
			case FhirPackage.LOCATION_HOURS_OF_OPERATION__CLOSING_TIME:
				setClosingTime((Time)newValue);
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
			case FhirPackage.LOCATION_HOURS_OF_OPERATION__DAYS_OF_WEEK:
				getDaysOfWeek().clear();
				return;
			case FhirPackage.LOCATION_HOURS_OF_OPERATION__ALL_DAY:
				setAllDay((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.LOCATION_HOURS_OF_OPERATION__OPENING_TIME:
				setOpeningTime((Time)null);
				return;
			case FhirPackage.LOCATION_HOURS_OF_OPERATION__CLOSING_TIME:
				setClosingTime((Time)null);
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
			case FhirPackage.LOCATION_HOURS_OF_OPERATION__DAYS_OF_WEEK:
				return daysOfWeek != null && !daysOfWeek.isEmpty();
			case FhirPackage.LOCATION_HOURS_OF_OPERATION__ALL_DAY:
				return allDay != null;
			case FhirPackage.LOCATION_HOURS_OF_OPERATION__OPENING_TIME:
				return openingTime != null;
			case FhirPackage.LOCATION_HOURS_OF_OPERATION__CLOSING_TIME:
				return closingTime != null;
		}
		return super.eIsSet(featureID);
	}

} //LocationHoursOfOperationImpl
