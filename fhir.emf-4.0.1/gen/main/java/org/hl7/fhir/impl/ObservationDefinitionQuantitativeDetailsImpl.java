/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.ObservationDefinitionQuantitativeDetails;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observation Definition Quantitative Details</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionQuantitativeDetailsImpl#getCustomaryUnit <em>Customary Unit</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionQuantitativeDetailsImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionQuantitativeDetailsImpl#getConversionFactor <em>Conversion Factor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionQuantitativeDetailsImpl#getDecimalPrecision <em>Decimal Precision</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObservationDefinitionQuantitativeDetailsImpl extends BackboneElementImpl implements ObservationDefinitionQuantitativeDetails {
	/**
	 * The cached value of the '{@link #getCustomaryUnit() <em>Customary Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomaryUnit()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept customaryUnit;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept unit;

	/**
	 * The cached value of the '{@link #getConversionFactor() <em>Conversion Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversionFactor()
	 * @generated
	 * @ordered
	 */
	protected Decimal conversionFactor;

	/**
	 * The cached value of the '{@link #getDecimalPrecision() <em>Decimal Precision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimalPrecision()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer decimalPrecision;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObservationDefinitionQuantitativeDetailsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getObservationDefinitionQuantitativeDetails();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCustomaryUnit() {
		return customaryUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomaryUnit(CodeableConcept newCustomaryUnit, NotificationChain msgs) {
		CodeableConcept oldCustomaryUnit = customaryUnit;
		customaryUnit = newCustomaryUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__CUSTOMARY_UNIT, oldCustomaryUnit, newCustomaryUnit);
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
	public void setCustomaryUnit(CodeableConcept newCustomaryUnit) {
		if (newCustomaryUnit != customaryUnit) {
			NotificationChain msgs = null;
			if (customaryUnit != null)
				msgs = ((InternalEObject)customaryUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__CUSTOMARY_UNIT, null, msgs);
			if (newCustomaryUnit != null)
				msgs = ((InternalEObject)newCustomaryUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__CUSTOMARY_UNIT, null, msgs);
			msgs = basicSetCustomaryUnit(newCustomaryUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__CUSTOMARY_UNIT, newCustomaryUnit, newCustomaryUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnit(CodeableConcept newUnit, NotificationChain msgs) {
		CodeableConcept oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__UNIT, oldUnit, newUnit);
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
	public void setUnit(CodeableConcept newUnit) {
		if (newUnit != unit) {
			NotificationChain msgs = null;
			if (unit != null)
				msgs = ((InternalEObject)unit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__UNIT, null, msgs);
			if (newUnit != null)
				msgs = ((InternalEObject)newUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__UNIT, null, msgs);
			msgs = basicSetUnit(newUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__UNIT, newUnit, newUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getConversionFactor() {
		return conversionFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConversionFactor(Decimal newConversionFactor, NotificationChain msgs) {
		Decimal oldConversionFactor = conversionFactor;
		conversionFactor = newConversionFactor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__CONVERSION_FACTOR, oldConversionFactor, newConversionFactor);
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
	public void setConversionFactor(Decimal newConversionFactor) {
		if (newConversionFactor != conversionFactor) {
			NotificationChain msgs = null;
			if (conversionFactor != null)
				msgs = ((InternalEObject)conversionFactor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__CONVERSION_FACTOR, null, msgs);
			if (newConversionFactor != null)
				msgs = ((InternalEObject)newConversionFactor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__CONVERSION_FACTOR, null, msgs);
			msgs = basicSetConversionFactor(newConversionFactor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__CONVERSION_FACTOR, newConversionFactor, newConversionFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Integer getDecimalPrecision() {
		return decimalPrecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDecimalPrecision(org.hl7.fhir.Integer newDecimalPrecision, NotificationChain msgs) {
		org.hl7.fhir.Integer oldDecimalPrecision = decimalPrecision;
		decimalPrecision = newDecimalPrecision;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__DECIMAL_PRECISION, oldDecimalPrecision, newDecimalPrecision);
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
	public void setDecimalPrecision(org.hl7.fhir.Integer newDecimalPrecision) {
		if (newDecimalPrecision != decimalPrecision) {
			NotificationChain msgs = null;
			if (decimalPrecision != null)
				msgs = ((InternalEObject)decimalPrecision).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__DECIMAL_PRECISION, null, msgs);
			if (newDecimalPrecision != null)
				msgs = ((InternalEObject)newDecimalPrecision).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__DECIMAL_PRECISION, null, msgs);
			msgs = basicSetDecimalPrecision(newDecimalPrecision, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__DECIMAL_PRECISION, newDecimalPrecision, newDecimalPrecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__CUSTOMARY_UNIT:
				return basicSetCustomaryUnit(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__UNIT:
				return basicSetUnit(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__CONVERSION_FACTOR:
				return basicSetConversionFactor(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__DECIMAL_PRECISION:
				return basicSetDecimalPrecision(null, msgs);
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
			case FhirPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__CUSTOMARY_UNIT:
				return getCustomaryUnit();
			case FhirPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__UNIT:
				return getUnit();
			case FhirPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__CONVERSION_FACTOR:
				return getConversionFactor();
			case FhirPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__DECIMAL_PRECISION:
				return getDecimalPrecision();
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
			case FhirPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__CUSTOMARY_UNIT:
				setCustomaryUnit((CodeableConcept)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__UNIT:
				setUnit((CodeableConcept)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__CONVERSION_FACTOR:
				setConversionFactor((Decimal)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__DECIMAL_PRECISION:
				setDecimalPrecision((org.hl7.fhir.Integer)newValue);
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
			case FhirPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__CUSTOMARY_UNIT:
				setCustomaryUnit((CodeableConcept)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__UNIT:
				setUnit((CodeableConcept)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__CONVERSION_FACTOR:
				setConversionFactor((Decimal)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__DECIMAL_PRECISION:
				setDecimalPrecision((org.hl7.fhir.Integer)null);
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
			case FhirPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__CUSTOMARY_UNIT:
				return customaryUnit != null;
			case FhirPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__UNIT:
				return unit != null;
			case FhirPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__CONVERSION_FACTOR:
				return conversionFactor != null;
			case FhirPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__DECIMAL_PRECISION:
				return decimalPrecision != null;
		}
		return super.eIsSet(featureID);
	}

} //ObservationDefinitionQuantitativeDetailsImpl
