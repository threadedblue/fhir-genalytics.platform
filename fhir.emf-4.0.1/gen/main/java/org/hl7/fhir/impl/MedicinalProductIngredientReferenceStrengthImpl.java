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
import org.hl7.fhir.MedicinalProductIngredientReferenceStrength;
import org.hl7.fhir.Ratio;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicinal Product Ingredient Reference Strength</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductIngredientReferenceStrengthImpl#getSubstance <em>Substance</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductIngredientReferenceStrengthImpl#getStrength <em>Strength</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductIngredientReferenceStrengthImpl#getStrengthLowLimit <em>Strength Low Limit</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductIngredientReferenceStrengthImpl#getMeasurementPoint <em>Measurement Point</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductIngredientReferenceStrengthImpl#getCountry <em>Country</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductIngredientReferenceStrengthImpl extends BackboneElementImpl implements MedicinalProductIngredientReferenceStrength {
	/**
	 * The cached value of the '{@link #getSubstance() <em>Substance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstance()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept substance;

	/**
	 * The cached value of the '{@link #getStrength() <em>Strength</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrength()
	 * @generated
	 * @ordered
	 */
	protected Ratio strength;

	/**
	 * The cached value of the '{@link #getStrengthLowLimit() <em>Strength Low Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrengthLowLimit()
	 * @generated
	 * @ordered
	 */
	protected Ratio strengthLowLimit;

	/**
	 * The cached value of the '{@link #getMeasurementPoint() <em>Measurement Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementPoint()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String measurementPoint;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> country;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductIngredientReferenceStrengthImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicinalProductIngredientReferenceStrength();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getSubstance() {
		return substance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstance(CodeableConcept newSubstance, NotificationChain msgs) {
		CodeableConcept oldSubstance = substance;
		substance = newSubstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_REFERENCE_STRENGTH__SUBSTANCE, oldSubstance, newSubstance);
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
	public void setSubstance(CodeableConcept newSubstance) {
		if (newSubstance != substance) {
			NotificationChain msgs = null;
			if (substance != null)
				msgs = ((InternalEObject)substance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_REFERENCE_STRENGTH__SUBSTANCE, null, msgs);
			if (newSubstance != null)
				msgs = ((InternalEObject)newSubstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_REFERENCE_STRENGTH__SUBSTANCE, null, msgs);
			msgs = basicSetSubstance(newSubstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_REFERENCE_STRENGTH__SUBSTANCE, newSubstance, newSubstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ratio getStrength() {
		return strength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrength(Ratio newStrength, NotificationChain msgs) {
		Ratio oldStrength = strength;
		strength = newStrength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_REFERENCE_STRENGTH__STRENGTH, oldStrength, newStrength);
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
	public void setStrength(Ratio newStrength) {
		if (newStrength != strength) {
			NotificationChain msgs = null;
			if (strength != null)
				msgs = ((InternalEObject)strength).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_REFERENCE_STRENGTH__STRENGTH, null, msgs);
			if (newStrength != null)
				msgs = ((InternalEObject)newStrength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_REFERENCE_STRENGTH__STRENGTH, null, msgs);
			msgs = basicSetStrength(newStrength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_REFERENCE_STRENGTH__STRENGTH, newStrength, newStrength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ratio getStrengthLowLimit() {
		return strengthLowLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrengthLowLimit(Ratio newStrengthLowLimit, NotificationChain msgs) {
		Ratio oldStrengthLowLimit = strengthLowLimit;
		strengthLowLimit = newStrengthLowLimit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_REFERENCE_STRENGTH__STRENGTH_LOW_LIMIT, oldStrengthLowLimit, newStrengthLowLimit);
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
	public void setStrengthLowLimit(Ratio newStrengthLowLimit) {
		if (newStrengthLowLimit != strengthLowLimit) {
			NotificationChain msgs = null;
			if (strengthLowLimit != null)
				msgs = ((InternalEObject)strengthLowLimit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_REFERENCE_STRENGTH__STRENGTH_LOW_LIMIT, null, msgs);
			if (newStrengthLowLimit != null)
				msgs = ((InternalEObject)newStrengthLowLimit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_REFERENCE_STRENGTH__STRENGTH_LOW_LIMIT, null, msgs);
			msgs = basicSetStrengthLowLimit(newStrengthLowLimit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_REFERENCE_STRENGTH__STRENGTH_LOW_LIMIT, newStrengthLowLimit, newStrengthLowLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getMeasurementPoint() {
		return measurementPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasurementPoint(org.hl7.fhir.String newMeasurementPoint, NotificationChain msgs) {
		org.hl7.fhir.String oldMeasurementPoint = measurementPoint;
		measurementPoint = newMeasurementPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_REFERENCE_STRENGTH__MEASUREMENT_POINT, oldMeasurementPoint, newMeasurementPoint);
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
	public void setMeasurementPoint(org.hl7.fhir.String newMeasurementPoint) {
		if (newMeasurementPoint != measurementPoint) {
			NotificationChain msgs = null;
			if (measurementPoint != null)
				msgs = ((InternalEObject)measurementPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_REFERENCE_STRENGTH__MEASUREMENT_POINT, null, msgs);
			if (newMeasurementPoint != null)
				msgs = ((InternalEObject)newMeasurementPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_REFERENCE_STRENGTH__MEASUREMENT_POINT, null, msgs);
			msgs = basicSetMeasurementPoint(newMeasurementPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_REFERENCE_STRENGTH__MEASUREMENT_POINT, newMeasurementPoint, newMeasurementPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCountry() {
		if (country == null) {
			country = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_REFERENCE_STRENGTH__COUNTRY);
		}
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_REFERENCE_STRENGTH__SUBSTANCE:
				return basicSetSubstance(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_REFERENCE_STRENGTH__STRENGTH:
				return basicSetStrength(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_REFERENCE_STRENGTH__STRENGTH_LOW_LIMIT:
				return basicSetStrengthLowLimit(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_REFERENCE_STRENGTH__MEASUREMENT_POINT:
				return basicSetMeasurementPoint(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_REFERENCE_STRENGTH__COUNTRY:
				return ((InternalEList<?>)getCountry()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_REFERENCE_STRENGTH__SUBSTANCE:
				return getSubstance();
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_REFERENCE_STRENGTH__STRENGTH:
				return getStrength();
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_REFERENCE_STRENGTH__STRENGTH_LOW_LIMIT:
				return getStrengthLowLimit();
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_REFERENCE_STRENGTH__MEASUREMENT_POINT:
				return getMeasurementPoint();
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_REFERENCE_STRENGTH__COUNTRY:
				return getCountry();
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
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_REFERENCE_STRENGTH__SUBSTANCE:
				setSubstance((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_REFERENCE_STRENGTH__STRENGTH:
				setStrength((Ratio)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_REFERENCE_STRENGTH__STRENGTH_LOW_LIMIT:
				setStrengthLowLimit((Ratio)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_REFERENCE_STRENGTH__MEASUREMENT_POINT:
				setMeasurementPoint((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_REFERENCE_STRENGTH__COUNTRY:
				getCountry().clear();
				getCountry().addAll((Collection<? extends CodeableConcept>)newValue);
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
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_REFERENCE_STRENGTH__SUBSTANCE:
				setSubstance((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_REFERENCE_STRENGTH__STRENGTH:
				setStrength((Ratio)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_REFERENCE_STRENGTH__STRENGTH_LOW_LIMIT:
				setStrengthLowLimit((Ratio)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_REFERENCE_STRENGTH__MEASUREMENT_POINT:
				setMeasurementPoint((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_REFERENCE_STRENGTH__COUNTRY:
				getCountry().clear();
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
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_REFERENCE_STRENGTH__SUBSTANCE:
				return substance != null;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_REFERENCE_STRENGTH__STRENGTH:
				return strength != null;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_REFERENCE_STRENGTH__STRENGTH_LOW_LIMIT:
				return strengthLowLimit != null;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_REFERENCE_STRENGTH__MEASUREMENT_POINT:
				return measurementPoint != null;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_REFERENCE_STRENGTH__COUNTRY:
				return country != null && !country.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductIngredientReferenceStrengthImpl
