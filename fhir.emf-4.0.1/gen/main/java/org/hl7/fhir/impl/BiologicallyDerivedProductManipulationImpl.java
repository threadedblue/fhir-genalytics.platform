/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.BiologicallyDerivedProductManipulation;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Period;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Biologically Derived Product Manipulation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.BiologicallyDerivedProductManipulationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.BiologicallyDerivedProductManipulationImpl#getTimeDateTime <em>Time Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.BiologicallyDerivedProductManipulationImpl#getTimePeriod <em>Time Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BiologicallyDerivedProductManipulationImpl extends BackboneElementImpl implements BiologicallyDerivedProductManipulation {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String description;

	/**
	 * The cached value of the '{@link #getTimeDateTime() <em>Time Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime timeDateTime;

	/**
	 * The cached value of the '{@link #getTimePeriod() <em>Time Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period timePeriod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BiologicallyDerivedProductManipulationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getBiologicallyDerivedProductManipulation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.hl7.fhir.String newDescription, NotificationChain msgs) {
		org.hl7.fhir.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_MANIPULATION__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(org.hl7.fhir.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_MANIPULATION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_MANIPULATION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_MANIPULATION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getTimeDateTime() {
		return timeDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeDateTime(DateTime newTimeDateTime, NotificationChain msgs) {
		DateTime oldTimeDateTime = timeDateTime;
		timeDateTime = newTimeDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_MANIPULATION__TIME_DATE_TIME, oldTimeDateTime, newTimeDateTime);
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
	public void setTimeDateTime(DateTime newTimeDateTime) {
		if (newTimeDateTime != timeDateTime) {
			NotificationChain msgs = null;
			if (timeDateTime != null)
				msgs = ((InternalEObject)timeDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_MANIPULATION__TIME_DATE_TIME, null, msgs);
			if (newTimeDateTime != null)
				msgs = ((InternalEObject)newTimeDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_MANIPULATION__TIME_DATE_TIME, null, msgs);
			msgs = basicSetTimeDateTime(newTimeDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_MANIPULATION__TIME_DATE_TIME, newTimeDateTime, newTimeDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getTimePeriod() {
		return timePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimePeriod(Period newTimePeriod, NotificationChain msgs) {
		Period oldTimePeriod = timePeriod;
		timePeriod = newTimePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_MANIPULATION__TIME_PERIOD, oldTimePeriod, newTimePeriod);
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
	public void setTimePeriod(Period newTimePeriod) {
		if (newTimePeriod != timePeriod) {
			NotificationChain msgs = null;
			if (timePeriod != null)
				msgs = ((InternalEObject)timePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_MANIPULATION__TIME_PERIOD, null, msgs);
			if (newTimePeriod != null)
				msgs = ((InternalEObject)newTimePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_MANIPULATION__TIME_PERIOD, null, msgs);
			msgs = basicSetTimePeriod(newTimePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_MANIPULATION__TIME_PERIOD, newTimePeriod, newTimePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_MANIPULATION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_MANIPULATION__TIME_DATE_TIME:
				return basicSetTimeDateTime(null, msgs);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_MANIPULATION__TIME_PERIOD:
				return basicSetTimePeriod(null, msgs);
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
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_MANIPULATION__DESCRIPTION:
				return getDescription();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_MANIPULATION__TIME_DATE_TIME:
				return getTimeDateTime();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_MANIPULATION__TIME_PERIOD:
				return getTimePeriod();
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
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_MANIPULATION__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_MANIPULATION__TIME_DATE_TIME:
				setTimeDateTime((DateTime)newValue);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_MANIPULATION__TIME_PERIOD:
				setTimePeriod((Period)newValue);
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
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_MANIPULATION__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_MANIPULATION__TIME_DATE_TIME:
				setTimeDateTime((DateTime)null);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_MANIPULATION__TIME_PERIOD:
				setTimePeriod((Period)null);
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
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_MANIPULATION__DESCRIPTION:
				return description != null;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_MANIPULATION__TIME_DATE_TIME:
				return timeDateTime != null;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_MANIPULATION__TIME_PERIOD:
				return timePeriod != null;
		}
		return super.eIsSet(featureID);
	}

} //BiologicallyDerivedProductManipulationImpl
