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
import org.hl7.fhir.MeasureReportComponent;
import org.hl7.fhir.MeasureReportPopulation1;
import org.hl7.fhir.MeasureReportStratum;
import org.hl7.fhir.Quantity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Report Stratum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MeasureReportStratumImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureReportStratumImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureReportStratumImpl#getPopulation <em>Population</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureReportStratumImpl#getMeasureScore <em>Measure Score</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasureReportStratumImpl extends BackboneElementImpl implements MeasureReportStratum {
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept value;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureReportComponent> component;

	/**
	 * The cached value of the '{@link #getPopulation() <em>Population</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulation()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureReportPopulation1> population;

	/**
	 * The cached value of the '{@link #getMeasureScore() <em>Measure Score</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureScore()
	 * @generated
	 * @ordered
	 */
	protected Quantity measureScore;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureReportStratumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMeasureReportStratum();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(CodeableConcept newValue, NotificationChain msgs) {
		CodeableConcept oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_STRATUM__VALUE, oldValue, newValue);
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
	public void setValue(CodeableConcept newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_STRATUM__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_STRATUM__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_STRATUM__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MeasureReportComponent> getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList<MeasureReportComponent>(MeasureReportComponent.class, this, FhirPackage.MEASURE_REPORT_STRATUM__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MeasureReportPopulation1> getPopulation() {
		if (population == null) {
			population = new EObjectContainmentEList<MeasureReportPopulation1>(MeasureReportPopulation1.class, this, FhirPackage.MEASURE_REPORT_STRATUM__POPULATION);
		}
		return population;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getMeasureScore() {
		return measureScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasureScore(Quantity newMeasureScore, NotificationChain msgs) {
		Quantity oldMeasureScore = measureScore;
		measureScore = newMeasureScore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE, oldMeasureScore, newMeasureScore);
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
	public void setMeasureScore(Quantity newMeasureScore) {
		if (newMeasureScore != measureScore) {
			NotificationChain msgs = null;
			if (measureScore != null)
				msgs = ((InternalEObject)measureScore).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE, null, msgs);
			if (newMeasureScore != null)
				msgs = ((InternalEObject)newMeasureScore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE, null, msgs);
			msgs = basicSetMeasureScore(newMeasureScore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE, newMeasureScore, newMeasureScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEASURE_REPORT_STRATUM__VALUE:
				return basicSetValue(null, msgs);
			case FhirPackage.MEASURE_REPORT_STRATUM__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEASURE_REPORT_STRATUM__POPULATION:
				return ((InternalEList<?>)getPopulation()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE:
				return basicSetMeasureScore(null, msgs);
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
			case FhirPackage.MEASURE_REPORT_STRATUM__VALUE:
				return getValue();
			case FhirPackage.MEASURE_REPORT_STRATUM__COMPONENT:
				return getComponent();
			case FhirPackage.MEASURE_REPORT_STRATUM__POPULATION:
				return getPopulation();
			case FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE:
				return getMeasureScore();
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
			case FhirPackage.MEASURE_REPORT_STRATUM__VALUE:
				setValue((CodeableConcept)newValue);
				return;
			case FhirPackage.MEASURE_REPORT_STRATUM__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends MeasureReportComponent>)newValue);
				return;
			case FhirPackage.MEASURE_REPORT_STRATUM__POPULATION:
				getPopulation().clear();
				getPopulation().addAll((Collection<? extends MeasureReportPopulation1>)newValue);
				return;
			case FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE:
				setMeasureScore((Quantity)newValue);
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
			case FhirPackage.MEASURE_REPORT_STRATUM__VALUE:
				setValue((CodeableConcept)null);
				return;
			case FhirPackage.MEASURE_REPORT_STRATUM__COMPONENT:
				getComponent().clear();
				return;
			case FhirPackage.MEASURE_REPORT_STRATUM__POPULATION:
				getPopulation().clear();
				return;
			case FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE:
				setMeasureScore((Quantity)null);
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
			case FhirPackage.MEASURE_REPORT_STRATUM__VALUE:
				return value != null;
			case FhirPackage.MEASURE_REPORT_STRATUM__COMPONENT:
				return component != null && !component.isEmpty();
			case FhirPackage.MEASURE_REPORT_STRATUM__POPULATION:
				return population != null && !population.isEmpty();
			case FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE:
				return measureScore != null;
		}
		return super.eIsSet(featureID);
	}

} //MeasureReportStratumImpl
