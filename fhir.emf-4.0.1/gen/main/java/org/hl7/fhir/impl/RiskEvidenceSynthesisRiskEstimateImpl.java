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
import org.hl7.fhir.Decimal;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.RiskEvidenceSynthesisPrecisionEstimate;
import org.hl7.fhir.RiskEvidenceSynthesisRiskEstimate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Risk Evidence Synthesis Risk Estimate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.RiskEvidenceSynthesisRiskEstimateImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RiskEvidenceSynthesisRiskEstimateImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RiskEvidenceSynthesisRiskEstimateImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RiskEvidenceSynthesisRiskEstimateImpl#getUnitOfMeasure <em>Unit Of Measure</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RiskEvidenceSynthesisRiskEstimateImpl#getDenominatorCount <em>Denominator Count</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RiskEvidenceSynthesisRiskEstimateImpl#getNumeratorCount <em>Numerator Count</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RiskEvidenceSynthesisRiskEstimateImpl#getPrecisionEstimate <em>Precision Estimate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RiskEvidenceSynthesisRiskEstimateImpl extends BackboneElementImpl implements RiskEvidenceSynthesisRiskEstimate {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Decimal value;

	/**
	 * The cached value of the '{@link #getUnitOfMeasure() <em>Unit Of Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitOfMeasure()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept unitOfMeasure;

	/**
	 * The cached value of the '{@link #getDenominatorCount() <em>Denominator Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenominatorCount()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer denominatorCount;

	/**
	 * The cached value of the '{@link #getNumeratorCount() <em>Numerator Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeratorCount()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer numeratorCount;

	/**
	 * The cached value of the '{@link #getPrecisionEstimate() <em>Precision Estimate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecisionEstimate()
	 * @generated
	 * @ordered
	 */
	protected EList<RiskEvidenceSynthesisPrecisionEstimate> precisionEstimate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RiskEvidenceSynthesisRiskEstimateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getRiskEvidenceSynthesisRiskEstimate();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__TYPE, oldType, newType);
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
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(Decimal newValue, NotificationChain msgs) {
		Decimal oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__VALUE, oldValue, newValue);
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
	public void setValue(Decimal newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getUnitOfMeasure() {
		return unitOfMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnitOfMeasure(CodeableConcept newUnitOfMeasure, NotificationChain msgs) {
		CodeableConcept oldUnitOfMeasure = unitOfMeasure;
		unitOfMeasure = newUnitOfMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__UNIT_OF_MEASURE, oldUnitOfMeasure, newUnitOfMeasure);
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
	public void setUnitOfMeasure(CodeableConcept newUnitOfMeasure) {
		if (newUnitOfMeasure != unitOfMeasure) {
			NotificationChain msgs = null;
			if (unitOfMeasure != null)
				msgs = ((InternalEObject)unitOfMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__UNIT_OF_MEASURE, null, msgs);
			if (newUnitOfMeasure != null)
				msgs = ((InternalEObject)newUnitOfMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__UNIT_OF_MEASURE, null, msgs);
			msgs = basicSetUnitOfMeasure(newUnitOfMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__UNIT_OF_MEASURE, newUnitOfMeasure, newUnitOfMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Integer getDenominatorCount() {
		return denominatorCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDenominatorCount(org.hl7.fhir.Integer newDenominatorCount, NotificationChain msgs) {
		org.hl7.fhir.Integer oldDenominatorCount = denominatorCount;
		denominatorCount = newDenominatorCount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__DENOMINATOR_COUNT, oldDenominatorCount, newDenominatorCount);
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
	public void setDenominatorCount(org.hl7.fhir.Integer newDenominatorCount) {
		if (newDenominatorCount != denominatorCount) {
			NotificationChain msgs = null;
			if (denominatorCount != null)
				msgs = ((InternalEObject)denominatorCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__DENOMINATOR_COUNT, null, msgs);
			if (newDenominatorCount != null)
				msgs = ((InternalEObject)newDenominatorCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__DENOMINATOR_COUNT, null, msgs);
			msgs = basicSetDenominatorCount(newDenominatorCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__DENOMINATOR_COUNT, newDenominatorCount, newDenominatorCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Integer getNumeratorCount() {
		return numeratorCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumeratorCount(org.hl7.fhir.Integer newNumeratorCount, NotificationChain msgs) {
		org.hl7.fhir.Integer oldNumeratorCount = numeratorCount;
		numeratorCount = newNumeratorCount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__NUMERATOR_COUNT, oldNumeratorCount, newNumeratorCount);
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
	public void setNumeratorCount(org.hl7.fhir.Integer newNumeratorCount) {
		if (newNumeratorCount != numeratorCount) {
			NotificationChain msgs = null;
			if (numeratorCount != null)
				msgs = ((InternalEObject)numeratorCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__NUMERATOR_COUNT, null, msgs);
			if (newNumeratorCount != null)
				msgs = ((InternalEObject)newNumeratorCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__NUMERATOR_COUNT, null, msgs);
			msgs = basicSetNumeratorCount(newNumeratorCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__NUMERATOR_COUNT, newNumeratorCount, newNumeratorCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RiskEvidenceSynthesisPrecisionEstimate> getPrecisionEstimate() {
		if (precisionEstimate == null) {
			precisionEstimate = new EObjectContainmentEList<RiskEvidenceSynthesisPrecisionEstimate>(RiskEvidenceSynthesisPrecisionEstimate.class, this, FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__PRECISION_ESTIMATE);
		}
		return precisionEstimate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__VALUE:
				return basicSetValue(null, msgs);
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__UNIT_OF_MEASURE:
				return basicSetUnitOfMeasure(null, msgs);
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__DENOMINATOR_COUNT:
				return basicSetDenominatorCount(null, msgs);
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__NUMERATOR_COUNT:
				return basicSetNumeratorCount(null, msgs);
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__PRECISION_ESTIMATE:
				return ((InternalEList<?>)getPrecisionEstimate()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__DESCRIPTION:
				return getDescription();
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__TYPE:
				return getType();
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__VALUE:
				return getValue();
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__UNIT_OF_MEASURE:
				return getUnitOfMeasure();
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__DENOMINATOR_COUNT:
				return getDenominatorCount();
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__NUMERATOR_COUNT:
				return getNumeratorCount();
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__PRECISION_ESTIMATE:
				return getPrecisionEstimate();
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
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__VALUE:
				setValue((Decimal)newValue);
				return;
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__UNIT_OF_MEASURE:
				setUnitOfMeasure((CodeableConcept)newValue);
				return;
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__DENOMINATOR_COUNT:
				setDenominatorCount((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__NUMERATOR_COUNT:
				setNumeratorCount((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__PRECISION_ESTIMATE:
				getPrecisionEstimate().clear();
				getPrecisionEstimate().addAll((Collection<? extends RiskEvidenceSynthesisPrecisionEstimate>)newValue);
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
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__VALUE:
				setValue((Decimal)null);
				return;
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__UNIT_OF_MEASURE:
				setUnitOfMeasure((CodeableConcept)null);
				return;
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__DENOMINATOR_COUNT:
				setDenominatorCount((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__NUMERATOR_COUNT:
				setNumeratorCount((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__PRECISION_ESTIMATE:
				getPrecisionEstimate().clear();
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
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__DESCRIPTION:
				return description != null;
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__TYPE:
				return type != null;
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__VALUE:
				return value != null;
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__UNIT_OF_MEASURE:
				return unitOfMeasure != null;
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__DENOMINATOR_COUNT:
				return denominatorCount != null;
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__NUMERATOR_COUNT:
				return numeratorCount != null;
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__PRECISION_ESTIMATE:
				return precisionEstimate != null && !precisionEstimate.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RiskEvidenceSynthesisRiskEstimateImpl
