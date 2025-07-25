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

import org.hl7.fhir.Duration;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.MedicationKnowledgeKinetics;
import org.hl7.fhir.Quantity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Knowledge Kinetics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeKineticsImpl#getAreaUnderCurve <em>Area Under Curve</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeKineticsImpl#getLethalDose50 <em>Lethal Dose50</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeKineticsImpl#getHalfLifePeriod <em>Half Life Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationKnowledgeKineticsImpl extends BackboneElementImpl implements MedicationKnowledgeKinetics {
	/**
	 * The cached value of the '{@link #getAreaUnderCurve() <em>Area Under Curve</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreaUnderCurve()
	 * @generated
	 * @ordered
	 */
	protected EList<Quantity> areaUnderCurve;

	/**
	 * The cached value of the '{@link #getLethalDose50() <em>Lethal Dose50</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLethalDose50()
	 * @generated
	 * @ordered
	 */
	protected EList<Quantity> lethalDose50;

	/**
	 * The cached value of the '{@link #getHalfLifePeriod() <em>Half Life Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHalfLifePeriod()
	 * @generated
	 * @ordered
	 */
	protected Duration halfLifePeriod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationKnowledgeKineticsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicationKnowledgeKinetics();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Quantity> getAreaUnderCurve() {
		if (areaUnderCurve == null) {
			areaUnderCurve = new EObjectContainmentEList<Quantity>(Quantity.class, this, FhirPackage.MEDICATION_KNOWLEDGE_KINETICS__AREA_UNDER_CURVE);
		}
		return areaUnderCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Quantity> getLethalDose50() {
		if (lethalDose50 == null) {
			lethalDose50 = new EObjectContainmentEList<Quantity>(Quantity.class, this, FhirPackage.MEDICATION_KNOWLEDGE_KINETICS__LETHAL_DOSE50);
		}
		return lethalDose50;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getHalfLifePeriod() {
		return halfLifePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHalfLifePeriod(Duration newHalfLifePeriod, NotificationChain msgs) {
		Duration oldHalfLifePeriod = halfLifePeriod;
		halfLifePeriod = newHalfLifePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE_KINETICS__HALF_LIFE_PERIOD, oldHalfLifePeriod, newHalfLifePeriod);
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
	public void setHalfLifePeriod(Duration newHalfLifePeriod) {
		if (newHalfLifePeriod != halfLifePeriod) {
			NotificationChain msgs = null;
			if (halfLifePeriod != null)
				msgs = ((InternalEObject)halfLifePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE_KINETICS__HALF_LIFE_PERIOD, null, msgs);
			if (newHalfLifePeriod != null)
				msgs = ((InternalEObject)newHalfLifePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE_KINETICS__HALF_LIFE_PERIOD, null, msgs);
			msgs = basicSetHalfLifePeriod(newHalfLifePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE_KINETICS__HALF_LIFE_PERIOD, newHalfLifePeriod, newHalfLifePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICATION_KNOWLEDGE_KINETICS__AREA_UNDER_CURVE:
				return ((InternalEList<?>)getAreaUnderCurve()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE_KINETICS__LETHAL_DOSE50:
				return ((InternalEList<?>)getLethalDose50()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE_KINETICS__HALF_LIFE_PERIOD:
				return basicSetHalfLifePeriod(null, msgs);
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
			case FhirPackage.MEDICATION_KNOWLEDGE_KINETICS__AREA_UNDER_CURVE:
				return getAreaUnderCurve();
			case FhirPackage.MEDICATION_KNOWLEDGE_KINETICS__LETHAL_DOSE50:
				return getLethalDose50();
			case FhirPackage.MEDICATION_KNOWLEDGE_KINETICS__HALF_LIFE_PERIOD:
				return getHalfLifePeriod();
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
			case FhirPackage.MEDICATION_KNOWLEDGE_KINETICS__AREA_UNDER_CURVE:
				getAreaUnderCurve().clear();
				getAreaUnderCurve().addAll((Collection<? extends Quantity>)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_KINETICS__LETHAL_DOSE50:
				getLethalDose50().clear();
				getLethalDose50().addAll((Collection<? extends Quantity>)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_KINETICS__HALF_LIFE_PERIOD:
				setHalfLifePeriod((Duration)newValue);
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
			case FhirPackage.MEDICATION_KNOWLEDGE_KINETICS__AREA_UNDER_CURVE:
				getAreaUnderCurve().clear();
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_KINETICS__LETHAL_DOSE50:
				getLethalDose50().clear();
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_KINETICS__HALF_LIFE_PERIOD:
				setHalfLifePeriod((Duration)null);
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
			case FhirPackage.MEDICATION_KNOWLEDGE_KINETICS__AREA_UNDER_CURVE:
				return areaUnderCurve != null && !areaUnderCurve.isEmpty();
			case FhirPackage.MEDICATION_KNOWLEDGE_KINETICS__LETHAL_DOSE50:
				return lethalDose50 != null && !lethalDose50.isEmpty();
			case FhirPackage.MEDICATION_KNOWLEDGE_KINETICS__HALF_LIFE_PERIOD:
				return halfLifePeriod != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicationKnowledgeKineticsImpl
