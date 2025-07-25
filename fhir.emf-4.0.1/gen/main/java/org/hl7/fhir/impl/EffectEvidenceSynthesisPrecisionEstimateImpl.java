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
import org.hl7.fhir.EffectEvidenceSynthesisPrecisionEstimate;
import org.hl7.fhir.FhirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Effect Evidence Synthesis Precision Estimate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.EffectEvidenceSynthesisPrecisionEstimateImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EffectEvidenceSynthesisPrecisionEstimateImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EffectEvidenceSynthesisPrecisionEstimateImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EffectEvidenceSynthesisPrecisionEstimateImpl#getTo <em>To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EffectEvidenceSynthesisPrecisionEstimateImpl extends BackboneElementImpl implements EffectEvidenceSynthesisPrecisionEstimate {
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
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected Decimal level;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Decimal from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected Decimal to;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EffectEvidenceSynthesisPrecisionEstimateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getEffectEvidenceSynthesisPrecisionEstimate();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_PRECISION_ESTIMATE__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_PRECISION_ESTIMATE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_PRECISION_ESTIMATE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_PRECISION_ESTIMATE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLevel(Decimal newLevel, NotificationChain msgs) {
		Decimal oldLevel = level;
		level = newLevel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_PRECISION_ESTIMATE__LEVEL, oldLevel, newLevel);
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
	public void setLevel(Decimal newLevel) {
		if (newLevel != level) {
			NotificationChain msgs = null;
			if (level != null)
				msgs = ((InternalEObject)level).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_PRECISION_ESTIMATE__LEVEL, null, msgs);
			if (newLevel != null)
				msgs = ((InternalEObject)newLevel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_PRECISION_ESTIMATE__LEVEL, null, msgs);
			msgs = basicSetLevel(newLevel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_PRECISION_ESTIMATE__LEVEL, newLevel, newLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(Decimal newFrom, NotificationChain msgs) {
		Decimal oldFrom = from;
		from = newFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_PRECISION_ESTIMATE__FROM, oldFrom, newFrom);
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
	public void setFrom(Decimal newFrom) {
		if (newFrom != from) {
			NotificationChain msgs = null;
			if (from != null)
				msgs = ((InternalEObject)from).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_PRECISION_ESTIMATE__FROM, null, msgs);
			if (newFrom != null)
				msgs = ((InternalEObject)newFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_PRECISION_ESTIMATE__FROM, null, msgs);
			msgs = basicSetFrom(newFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_PRECISION_ESTIMATE__FROM, newFrom, newFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo(Decimal newTo, NotificationChain msgs) {
		Decimal oldTo = to;
		to = newTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_PRECISION_ESTIMATE__TO, oldTo, newTo);
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
	public void setTo(Decimal newTo) {
		if (newTo != to) {
			NotificationChain msgs = null;
			if (to != null)
				msgs = ((InternalEObject)to).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_PRECISION_ESTIMATE__TO, null, msgs);
			if (newTo != null)
				msgs = ((InternalEObject)newTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_PRECISION_ESTIMATE__TO, null, msgs);
			msgs = basicSetTo(newTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_PRECISION_ESTIMATE__TO, newTo, newTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_PRECISION_ESTIMATE__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_PRECISION_ESTIMATE__LEVEL:
				return basicSetLevel(null, msgs);
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_PRECISION_ESTIMATE__FROM:
				return basicSetFrom(null, msgs);
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_PRECISION_ESTIMATE__TO:
				return basicSetTo(null, msgs);
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
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_PRECISION_ESTIMATE__TYPE:
				return getType();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_PRECISION_ESTIMATE__LEVEL:
				return getLevel();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_PRECISION_ESTIMATE__FROM:
				return getFrom();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_PRECISION_ESTIMATE__TO:
				return getTo();
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
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_PRECISION_ESTIMATE__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_PRECISION_ESTIMATE__LEVEL:
				setLevel((Decimal)newValue);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_PRECISION_ESTIMATE__FROM:
				setFrom((Decimal)newValue);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_PRECISION_ESTIMATE__TO:
				setTo((Decimal)newValue);
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
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_PRECISION_ESTIMATE__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_PRECISION_ESTIMATE__LEVEL:
				setLevel((Decimal)null);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_PRECISION_ESTIMATE__FROM:
				setFrom((Decimal)null);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_PRECISION_ESTIMATE__TO:
				setTo((Decimal)null);
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
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_PRECISION_ESTIMATE__TYPE:
				return type != null;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_PRECISION_ESTIMATE__LEVEL:
				return level != null;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_PRECISION_ESTIMATE__FROM:
				return from != null;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_PRECISION_ESTIMATE__TO:
				return to != null;
		}
		return super.eIsSet(featureID);
	}

} //EffectEvidenceSynthesisPrecisionEstimateImpl
