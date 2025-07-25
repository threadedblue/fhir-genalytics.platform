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
import org.hl7.fhir.ImmunizationProtocolApplied;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immunization Protocol Applied</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationProtocolAppliedImpl#getSeries <em>Series</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationProtocolAppliedImpl#getAuthority <em>Authority</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationProtocolAppliedImpl#getTargetDisease <em>Target Disease</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationProtocolAppliedImpl#getDoseNumberPositiveInt <em>Dose Number Positive Int</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationProtocolAppliedImpl#getDoseNumberString <em>Dose Number String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationProtocolAppliedImpl#getSeriesDosesPositiveInt <em>Series Doses Positive Int</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationProtocolAppliedImpl#getSeriesDosesString <em>Series Doses String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImmunizationProtocolAppliedImpl extends BackboneElementImpl implements ImmunizationProtocolApplied {
	/**
	 * The cached value of the '{@link #getSeries() <em>Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeries()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String series;

	/**
	 * The cached value of the '{@link #getAuthority() <em>Authority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthority()
	 * @generated
	 * @ordered
	 */
	protected Reference authority;

	/**
	 * The cached value of the '{@link #getTargetDisease() <em>Target Disease</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDisease()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> targetDisease;

	/**
	 * The cached value of the '{@link #getDoseNumberPositiveInt() <em>Dose Number Positive Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseNumberPositiveInt()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt doseNumberPositiveInt;

	/**
	 * The cached value of the '{@link #getDoseNumberString() <em>Dose Number String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseNumberString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String doseNumberString;

	/**
	 * The cached value of the '{@link #getSeriesDosesPositiveInt() <em>Series Doses Positive Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriesDosesPositiveInt()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt seriesDosesPositiveInt;

	/**
	 * The cached value of the '{@link #getSeriesDosesString() <em>Series Doses String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriesDosesString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String seriesDosesString;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmunizationProtocolAppliedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getImmunizationProtocolApplied();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getSeries() {
		return series;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeries(org.hl7.fhir.String newSeries, NotificationChain msgs) {
		org.hl7.fhir.String oldSeries = series;
		series = newSeries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES, oldSeries, newSeries);
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
	public void setSeries(org.hl7.fhir.String newSeries) {
		if (newSeries != series) {
			NotificationChain msgs = null;
			if (series != null)
				msgs = ((InternalEObject)series).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES, null, msgs);
			if (newSeries != null)
				msgs = ((InternalEObject)newSeries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES, null, msgs);
			msgs = basicSetSeries(newSeries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES, newSeries, newSeries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getAuthority() {
		return authority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthority(Reference newAuthority, NotificationChain msgs) {
		Reference oldAuthority = authority;
		authority = newAuthority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__AUTHORITY, oldAuthority, newAuthority);
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
	public void setAuthority(Reference newAuthority) {
		if (newAuthority != authority) {
			NotificationChain msgs = null;
			if (authority != null)
				msgs = ((InternalEObject)authority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__AUTHORITY, null, msgs);
			if (newAuthority != null)
				msgs = ((InternalEObject)newAuthority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__AUTHORITY, null, msgs);
			msgs = basicSetAuthority(newAuthority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__AUTHORITY, newAuthority, newAuthority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getTargetDisease() {
		if (targetDisease == null) {
			targetDisease = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__TARGET_DISEASE);
		}
		return targetDisease;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getDoseNumberPositiveInt() {
		return doseNumberPositiveInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoseNumberPositiveInt(PositiveInt newDoseNumberPositiveInt, NotificationChain msgs) {
		PositiveInt oldDoseNumberPositiveInt = doseNumberPositiveInt;
		doseNumberPositiveInt = newDoseNumberPositiveInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__DOSE_NUMBER_POSITIVE_INT, oldDoseNumberPositiveInt, newDoseNumberPositiveInt);
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
	public void setDoseNumberPositiveInt(PositiveInt newDoseNumberPositiveInt) {
		if (newDoseNumberPositiveInt != doseNumberPositiveInt) {
			NotificationChain msgs = null;
			if (doseNumberPositiveInt != null)
				msgs = ((InternalEObject)doseNumberPositiveInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__DOSE_NUMBER_POSITIVE_INT, null, msgs);
			if (newDoseNumberPositiveInt != null)
				msgs = ((InternalEObject)newDoseNumberPositiveInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__DOSE_NUMBER_POSITIVE_INT, null, msgs);
			msgs = basicSetDoseNumberPositiveInt(newDoseNumberPositiveInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__DOSE_NUMBER_POSITIVE_INT, newDoseNumberPositiveInt, newDoseNumberPositiveInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getDoseNumberString() {
		return doseNumberString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoseNumberString(org.hl7.fhir.String newDoseNumberString, NotificationChain msgs) {
		org.hl7.fhir.String oldDoseNumberString = doseNumberString;
		doseNumberString = newDoseNumberString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__DOSE_NUMBER_STRING, oldDoseNumberString, newDoseNumberString);
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
	public void setDoseNumberString(org.hl7.fhir.String newDoseNumberString) {
		if (newDoseNumberString != doseNumberString) {
			NotificationChain msgs = null;
			if (doseNumberString != null)
				msgs = ((InternalEObject)doseNumberString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__DOSE_NUMBER_STRING, null, msgs);
			if (newDoseNumberString != null)
				msgs = ((InternalEObject)newDoseNumberString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__DOSE_NUMBER_STRING, null, msgs);
			msgs = basicSetDoseNumberString(newDoseNumberString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__DOSE_NUMBER_STRING, newDoseNumberString, newDoseNumberString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getSeriesDosesPositiveInt() {
		return seriesDosesPositiveInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeriesDosesPositiveInt(PositiveInt newSeriesDosesPositiveInt, NotificationChain msgs) {
		PositiveInt oldSeriesDosesPositiveInt = seriesDosesPositiveInt;
		seriesDosesPositiveInt = newSeriesDosesPositiveInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES_DOSES_POSITIVE_INT, oldSeriesDosesPositiveInt, newSeriesDosesPositiveInt);
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
	public void setSeriesDosesPositiveInt(PositiveInt newSeriesDosesPositiveInt) {
		if (newSeriesDosesPositiveInt != seriesDosesPositiveInt) {
			NotificationChain msgs = null;
			if (seriesDosesPositiveInt != null)
				msgs = ((InternalEObject)seriesDosesPositiveInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES_DOSES_POSITIVE_INT, null, msgs);
			if (newSeriesDosesPositiveInt != null)
				msgs = ((InternalEObject)newSeriesDosesPositiveInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES_DOSES_POSITIVE_INT, null, msgs);
			msgs = basicSetSeriesDosesPositiveInt(newSeriesDosesPositiveInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES_DOSES_POSITIVE_INT, newSeriesDosesPositiveInt, newSeriesDosesPositiveInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getSeriesDosesString() {
		return seriesDosesString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeriesDosesString(org.hl7.fhir.String newSeriesDosesString, NotificationChain msgs) {
		org.hl7.fhir.String oldSeriesDosesString = seriesDosesString;
		seriesDosesString = newSeriesDosesString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES_DOSES_STRING, oldSeriesDosesString, newSeriesDosesString);
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
	public void setSeriesDosesString(org.hl7.fhir.String newSeriesDosesString) {
		if (newSeriesDosesString != seriesDosesString) {
			NotificationChain msgs = null;
			if (seriesDosesString != null)
				msgs = ((InternalEObject)seriesDosesString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES_DOSES_STRING, null, msgs);
			if (newSeriesDosesString != null)
				msgs = ((InternalEObject)newSeriesDosesString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES_DOSES_STRING, null, msgs);
			msgs = basicSetSeriesDosesString(newSeriesDosesString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES_DOSES_STRING, newSeriesDosesString, newSeriesDosesString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES:
				return basicSetSeries(null, msgs);
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__AUTHORITY:
				return basicSetAuthority(null, msgs);
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__TARGET_DISEASE:
				return ((InternalEList<?>)getTargetDisease()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__DOSE_NUMBER_POSITIVE_INT:
				return basicSetDoseNumberPositiveInt(null, msgs);
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__DOSE_NUMBER_STRING:
				return basicSetDoseNumberString(null, msgs);
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES_DOSES_POSITIVE_INT:
				return basicSetSeriesDosesPositiveInt(null, msgs);
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES_DOSES_STRING:
				return basicSetSeriesDosesString(null, msgs);
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
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES:
				return getSeries();
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__AUTHORITY:
				return getAuthority();
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__TARGET_DISEASE:
				return getTargetDisease();
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__DOSE_NUMBER_POSITIVE_INT:
				return getDoseNumberPositiveInt();
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__DOSE_NUMBER_STRING:
				return getDoseNumberString();
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES_DOSES_POSITIVE_INT:
				return getSeriesDosesPositiveInt();
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES_DOSES_STRING:
				return getSeriesDosesString();
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
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES:
				setSeries((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__AUTHORITY:
				setAuthority((Reference)newValue);
				return;
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__TARGET_DISEASE:
				getTargetDisease().clear();
				getTargetDisease().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__DOSE_NUMBER_POSITIVE_INT:
				setDoseNumberPositiveInt((PositiveInt)newValue);
				return;
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__DOSE_NUMBER_STRING:
				setDoseNumberString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES_DOSES_POSITIVE_INT:
				setSeriesDosesPositiveInt((PositiveInt)newValue);
				return;
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES_DOSES_STRING:
				setSeriesDosesString((org.hl7.fhir.String)newValue);
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
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES:
				setSeries((org.hl7.fhir.String)null);
				return;
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__AUTHORITY:
				setAuthority((Reference)null);
				return;
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__TARGET_DISEASE:
				getTargetDisease().clear();
				return;
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__DOSE_NUMBER_POSITIVE_INT:
				setDoseNumberPositiveInt((PositiveInt)null);
				return;
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__DOSE_NUMBER_STRING:
				setDoseNumberString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES_DOSES_POSITIVE_INT:
				setSeriesDosesPositiveInt((PositiveInt)null);
				return;
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES_DOSES_STRING:
				setSeriesDosesString((org.hl7.fhir.String)null);
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
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES:
				return series != null;
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__AUTHORITY:
				return authority != null;
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__TARGET_DISEASE:
				return targetDisease != null && !targetDisease.isEmpty();
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__DOSE_NUMBER_POSITIVE_INT:
				return doseNumberPositiveInt != null;
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__DOSE_NUMBER_STRING:
				return doseNumberString != null;
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES_DOSES_POSITIVE_INT:
				return seriesDosesPositiveInt != null;
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES_DOSES_STRING:
				return seriesDosesString != null;
		}
		return super.eIsSet(featureID);
	}

} //ImmunizationProtocolAppliedImpl
