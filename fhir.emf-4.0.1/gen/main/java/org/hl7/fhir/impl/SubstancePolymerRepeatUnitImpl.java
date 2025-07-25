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
import org.hl7.fhir.SubstanceAmount;
import org.hl7.fhir.SubstancePolymerDegreeOfPolymerisation;
import org.hl7.fhir.SubstancePolymerRepeatUnit;
import org.hl7.fhir.SubstancePolymerStructuralRepresentation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Polymer Repeat Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubstancePolymerRepeatUnitImpl#getOrientationOfPolymerisation <em>Orientation Of Polymerisation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstancePolymerRepeatUnitImpl#getRepeatUnit <em>Repeat Unit</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstancePolymerRepeatUnitImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstancePolymerRepeatUnitImpl#getDegreeOfPolymerisation <em>Degree Of Polymerisation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstancePolymerRepeatUnitImpl#getStructuralRepresentation <em>Structural Representation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstancePolymerRepeatUnitImpl extends BackboneElementImpl implements SubstancePolymerRepeatUnit {
	/**
	 * The cached value of the '{@link #getOrientationOfPolymerisation() <em>Orientation Of Polymerisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientationOfPolymerisation()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept orientationOfPolymerisation;

	/**
	 * The cached value of the '{@link #getRepeatUnit() <em>Repeat Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatUnit()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String repeatUnit;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected SubstanceAmount amount;

	/**
	 * The cached value of the '{@link #getDegreeOfPolymerisation() <em>Degree Of Polymerisation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegreeOfPolymerisation()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstancePolymerDegreeOfPolymerisation> degreeOfPolymerisation;

	/**
	 * The cached value of the '{@link #getStructuralRepresentation() <em>Structural Representation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralRepresentation()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstancePolymerStructuralRepresentation> structuralRepresentation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstancePolymerRepeatUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubstancePolymerRepeatUnit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getOrientationOfPolymerisation() {
		return orientationOfPolymerisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrientationOfPolymerisation(CodeableConcept newOrientationOfPolymerisation, NotificationChain msgs) {
		CodeableConcept oldOrientationOfPolymerisation = orientationOfPolymerisation;
		orientationOfPolymerisation = newOrientationOfPolymerisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__ORIENTATION_OF_POLYMERISATION, oldOrientationOfPolymerisation, newOrientationOfPolymerisation);
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
	public void setOrientationOfPolymerisation(CodeableConcept newOrientationOfPolymerisation) {
		if (newOrientationOfPolymerisation != orientationOfPolymerisation) {
			NotificationChain msgs = null;
			if (orientationOfPolymerisation != null)
				msgs = ((InternalEObject)orientationOfPolymerisation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__ORIENTATION_OF_POLYMERISATION, null, msgs);
			if (newOrientationOfPolymerisation != null)
				msgs = ((InternalEObject)newOrientationOfPolymerisation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__ORIENTATION_OF_POLYMERISATION, null, msgs);
			msgs = basicSetOrientationOfPolymerisation(newOrientationOfPolymerisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__ORIENTATION_OF_POLYMERISATION, newOrientationOfPolymerisation, newOrientationOfPolymerisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getRepeatUnit() {
		return repeatUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepeatUnit(org.hl7.fhir.String newRepeatUnit, NotificationChain msgs) {
		org.hl7.fhir.String oldRepeatUnit = repeatUnit;
		repeatUnit = newRepeatUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__REPEAT_UNIT, oldRepeatUnit, newRepeatUnit);
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
	public void setRepeatUnit(org.hl7.fhir.String newRepeatUnit) {
		if (newRepeatUnit != repeatUnit) {
			NotificationChain msgs = null;
			if (repeatUnit != null)
				msgs = ((InternalEObject)repeatUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__REPEAT_UNIT, null, msgs);
			if (newRepeatUnit != null)
				msgs = ((InternalEObject)newRepeatUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__REPEAT_UNIT, null, msgs);
			msgs = basicSetRepeatUnit(newRepeatUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__REPEAT_UNIT, newRepeatUnit, newRepeatUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceAmount getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmount(SubstanceAmount newAmount, NotificationChain msgs) {
		SubstanceAmount oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__AMOUNT, oldAmount, newAmount);
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
	public void setAmount(SubstanceAmount newAmount) {
		if (newAmount != amount) {
			NotificationChain msgs = null;
			if (amount != null)
				msgs = ((InternalEObject)amount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__AMOUNT, null, msgs);
			if (newAmount != null)
				msgs = ((InternalEObject)newAmount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__AMOUNT, null, msgs);
			msgs = basicSetAmount(newAmount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__AMOUNT, newAmount, newAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstancePolymerDegreeOfPolymerisation> getDegreeOfPolymerisation() {
		if (degreeOfPolymerisation == null) {
			degreeOfPolymerisation = new EObjectContainmentEList<SubstancePolymerDegreeOfPolymerisation>(SubstancePolymerDegreeOfPolymerisation.class, this, FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__DEGREE_OF_POLYMERISATION);
		}
		return degreeOfPolymerisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstancePolymerStructuralRepresentation> getStructuralRepresentation() {
		if (structuralRepresentation == null) {
			structuralRepresentation = new EObjectContainmentEList<SubstancePolymerStructuralRepresentation>(SubstancePolymerStructuralRepresentation.class, this, FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__STRUCTURAL_REPRESENTATION);
		}
		return structuralRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__ORIENTATION_OF_POLYMERISATION:
				return basicSetOrientationOfPolymerisation(null, msgs);
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__REPEAT_UNIT:
				return basicSetRepeatUnit(null, msgs);
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__AMOUNT:
				return basicSetAmount(null, msgs);
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__DEGREE_OF_POLYMERISATION:
				return ((InternalEList<?>)getDegreeOfPolymerisation()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__STRUCTURAL_REPRESENTATION:
				return ((InternalEList<?>)getStructuralRepresentation()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__ORIENTATION_OF_POLYMERISATION:
				return getOrientationOfPolymerisation();
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__REPEAT_UNIT:
				return getRepeatUnit();
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__AMOUNT:
				return getAmount();
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__DEGREE_OF_POLYMERISATION:
				return getDegreeOfPolymerisation();
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__STRUCTURAL_REPRESENTATION:
				return getStructuralRepresentation();
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
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__ORIENTATION_OF_POLYMERISATION:
				setOrientationOfPolymerisation((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__REPEAT_UNIT:
				setRepeatUnit((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__AMOUNT:
				setAmount((SubstanceAmount)newValue);
				return;
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__DEGREE_OF_POLYMERISATION:
				getDegreeOfPolymerisation().clear();
				getDegreeOfPolymerisation().addAll((Collection<? extends SubstancePolymerDegreeOfPolymerisation>)newValue);
				return;
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__STRUCTURAL_REPRESENTATION:
				getStructuralRepresentation().clear();
				getStructuralRepresentation().addAll((Collection<? extends SubstancePolymerStructuralRepresentation>)newValue);
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
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__ORIENTATION_OF_POLYMERISATION:
				setOrientationOfPolymerisation((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__REPEAT_UNIT:
				setRepeatUnit((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__AMOUNT:
				setAmount((SubstanceAmount)null);
				return;
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__DEGREE_OF_POLYMERISATION:
				getDegreeOfPolymerisation().clear();
				return;
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__STRUCTURAL_REPRESENTATION:
				getStructuralRepresentation().clear();
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
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__ORIENTATION_OF_POLYMERISATION:
				return orientationOfPolymerisation != null;
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__REPEAT_UNIT:
				return repeatUnit != null;
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__AMOUNT:
				return amount != null;
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__DEGREE_OF_POLYMERISATION:
				return degreeOfPolymerisation != null && !degreeOfPolymerisation.isEmpty();
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__STRUCTURAL_REPRESENTATION:
				return structuralRepresentation != null && !structuralRepresentation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubstancePolymerRepeatUnitImpl
