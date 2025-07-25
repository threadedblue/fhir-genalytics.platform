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
import org.hl7.fhir.SubstancePolymerRepeat;
import org.hl7.fhir.SubstancePolymerRepeatUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Polymer Repeat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubstancePolymerRepeatImpl#getNumberOfUnits <em>Number Of Units</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstancePolymerRepeatImpl#getAverageMolecularFormula <em>Average Molecular Formula</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstancePolymerRepeatImpl#getRepeatUnitAmountType <em>Repeat Unit Amount Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstancePolymerRepeatImpl#getRepeatUnit <em>Repeat Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstancePolymerRepeatImpl extends BackboneElementImpl implements SubstancePolymerRepeat {
	/**
	 * The cached value of the '{@link #getNumberOfUnits() <em>Number Of Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfUnits()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer numberOfUnits;

	/**
	 * The cached value of the '{@link #getAverageMolecularFormula() <em>Average Molecular Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageMolecularFormula()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String averageMolecularFormula;

	/**
	 * The cached value of the '{@link #getRepeatUnitAmountType() <em>Repeat Unit Amount Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatUnitAmountType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept repeatUnitAmountType;

	/**
	 * The cached value of the '{@link #getRepeatUnit() <em>Repeat Unit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstancePolymerRepeatUnit> repeatUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstancePolymerRepeatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubstancePolymerRepeat();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Integer getNumberOfUnits() {
		return numberOfUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberOfUnits(org.hl7.fhir.Integer newNumberOfUnits, NotificationChain msgs) {
		org.hl7.fhir.Integer oldNumberOfUnits = numberOfUnits;
		numberOfUnits = newNumberOfUnits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_POLYMER_REPEAT__NUMBER_OF_UNITS, oldNumberOfUnits, newNumberOfUnits);
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
	public void setNumberOfUnits(org.hl7.fhir.Integer newNumberOfUnits) {
		if (newNumberOfUnits != numberOfUnits) {
			NotificationChain msgs = null;
			if (numberOfUnits != null)
				msgs = ((InternalEObject)numberOfUnits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_POLYMER_REPEAT__NUMBER_OF_UNITS, null, msgs);
			if (newNumberOfUnits != null)
				msgs = ((InternalEObject)newNumberOfUnits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_POLYMER_REPEAT__NUMBER_OF_UNITS, null, msgs);
			msgs = basicSetNumberOfUnits(newNumberOfUnits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_POLYMER_REPEAT__NUMBER_OF_UNITS, newNumberOfUnits, newNumberOfUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getAverageMolecularFormula() {
		return averageMolecularFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAverageMolecularFormula(org.hl7.fhir.String newAverageMolecularFormula, NotificationChain msgs) {
		org.hl7.fhir.String oldAverageMolecularFormula = averageMolecularFormula;
		averageMolecularFormula = newAverageMolecularFormula;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_POLYMER_REPEAT__AVERAGE_MOLECULAR_FORMULA, oldAverageMolecularFormula, newAverageMolecularFormula);
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
	public void setAverageMolecularFormula(org.hl7.fhir.String newAverageMolecularFormula) {
		if (newAverageMolecularFormula != averageMolecularFormula) {
			NotificationChain msgs = null;
			if (averageMolecularFormula != null)
				msgs = ((InternalEObject)averageMolecularFormula).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_POLYMER_REPEAT__AVERAGE_MOLECULAR_FORMULA, null, msgs);
			if (newAverageMolecularFormula != null)
				msgs = ((InternalEObject)newAverageMolecularFormula).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_POLYMER_REPEAT__AVERAGE_MOLECULAR_FORMULA, null, msgs);
			msgs = basicSetAverageMolecularFormula(newAverageMolecularFormula, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_POLYMER_REPEAT__AVERAGE_MOLECULAR_FORMULA, newAverageMolecularFormula, newAverageMolecularFormula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getRepeatUnitAmountType() {
		return repeatUnitAmountType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepeatUnitAmountType(CodeableConcept newRepeatUnitAmountType, NotificationChain msgs) {
		CodeableConcept oldRepeatUnitAmountType = repeatUnitAmountType;
		repeatUnitAmountType = newRepeatUnitAmountType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_POLYMER_REPEAT__REPEAT_UNIT_AMOUNT_TYPE, oldRepeatUnitAmountType, newRepeatUnitAmountType);
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
	public void setRepeatUnitAmountType(CodeableConcept newRepeatUnitAmountType) {
		if (newRepeatUnitAmountType != repeatUnitAmountType) {
			NotificationChain msgs = null;
			if (repeatUnitAmountType != null)
				msgs = ((InternalEObject)repeatUnitAmountType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_POLYMER_REPEAT__REPEAT_UNIT_AMOUNT_TYPE, null, msgs);
			if (newRepeatUnitAmountType != null)
				msgs = ((InternalEObject)newRepeatUnitAmountType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_POLYMER_REPEAT__REPEAT_UNIT_AMOUNT_TYPE, null, msgs);
			msgs = basicSetRepeatUnitAmountType(newRepeatUnitAmountType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_POLYMER_REPEAT__REPEAT_UNIT_AMOUNT_TYPE, newRepeatUnitAmountType, newRepeatUnitAmountType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstancePolymerRepeatUnit> getRepeatUnit() {
		if (repeatUnit == null) {
			repeatUnit = new EObjectContainmentEList<SubstancePolymerRepeatUnit>(SubstancePolymerRepeatUnit.class, this, FhirPackage.SUBSTANCE_POLYMER_REPEAT__REPEAT_UNIT);
		}
		return repeatUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT__NUMBER_OF_UNITS:
				return basicSetNumberOfUnits(null, msgs);
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT__AVERAGE_MOLECULAR_FORMULA:
				return basicSetAverageMolecularFormula(null, msgs);
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT__REPEAT_UNIT_AMOUNT_TYPE:
				return basicSetRepeatUnitAmountType(null, msgs);
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT__REPEAT_UNIT:
				return ((InternalEList<?>)getRepeatUnit()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT__NUMBER_OF_UNITS:
				return getNumberOfUnits();
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT__AVERAGE_MOLECULAR_FORMULA:
				return getAverageMolecularFormula();
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT__REPEAT_UNIT_AMOUNT_TYPE:
				return getRepeatUnitAmountType();
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT__REPEAT_UNIT:
				return getRepeatUnit();
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
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT__NUMBER_OF_UNITS:
				setNumberOfUnits((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT__AVERAGE_MOLECULAR_FORMULA:
				setAverageMolecularFormula((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT__REPEAT_UNIT_AMOUNT_TYPE:
				setRepeatUnitAmountType((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT__REPEAT_UNIT:
				getRepeatUnit().clear();
				getRepeatUnit().addAll((Collection<? extends SubstancePolymerRepeatUnit>)newValue);
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
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT__NUMBER_OF_UNITS:
				setNumberOfUnits((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT__AVERAGE_MOLECULAR_FORMULA:
				setAverageMolecularFormula((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT__REPEAT_UNIT_AMOUNT_TYPE:
				setRepeatUnitAmountType((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT__REPEAT_UNIT:
				getRepeatUnit().clear();
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
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT__NUMBER_OF_UNITS:
				return numberOfUnits != null;
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT__AVERAGE_MOLECULAR_FORMULA:
				return averageMolecularFormula != null;
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT__REPEAT_UNIT_AMOUNT_TYPE:
				return repeatUnitAmountType != null;
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT__REPEAT_UNIT:
				return repeatUnit != null && !repeatUnit.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubstancePolymerRepeatImpl
