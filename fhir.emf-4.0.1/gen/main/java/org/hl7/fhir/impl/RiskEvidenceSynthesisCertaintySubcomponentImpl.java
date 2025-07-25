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

import org.hl7.fhir.Annotation;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.RiskEvidenceSynthesisCertaintySubcomponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Risk Evidence Synthesis Certainty Subcomponent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.RiskEvidenceSynthesisCertaintySubcomponentImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RiskEvidenceSynthesisCertaintySubcomponentImpl#getRating <em>Rating</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RiskEvidenceSynthesisCertaintySubcomponentImpl#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RiskEvidenceSynthesisCertaintySubcomponentImpl extends BackboneElementImpl implements RiskEvidenceSynthesisCertaintySubcomponent {
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
	 * The cached value of the '{@link #getRating() <em>Rating</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRating()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> rating;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> note;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RiskEvidenceSynthesisCertaintySubcomponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getRiskEvidenceSynthesisCertaintySubcomponent();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY_SUBCOMPONENT__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY_SUBCOMPONENT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY_SUBCOMPONENT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY_SUBCOMPONENT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getRating() {
		if (rating == null) {
			rating = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY_SUBCOMPONENT__RATING);
		}
		return rating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY_SUBCOMPONENT__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY_SUBCOMPONENT__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY_SUBCOMPONENT__RATING:
				return ((InternalEList<?>)getRating()).basicRemove(otherEnd, msgs);
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY_SUBCOMPONENT__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY_SUBCOMPONENT__TYPE:
				return getType();
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY_SUBCOMPONENT__RATING:
				return getRating();
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY_SUBCOMPONENT__NOTE:
				return getNote();
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
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY_SUBCOMPONENT__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY_SUBCOMPONENT__RATING:
				getRating().clear();
				getRating().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY_SUBCOMPONENT__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
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
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY_SUBCOMPONENT__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY_SUBCOMPONENT__RATING:
				getRating().clear();
				return;
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY_SUBCOMPONENT__NOTE:
				getNote().clear();
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
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY_SUBCOMPONENT__TYPE:
				return type != null;
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY_SUBCOMPONENT__RATING:
				return rating != null && !rating.isEmpty();
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY_SUBCOMPONENT__NOTE:
				return note != null && !note.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RiskEvidenceSynthesisCertaintySubcomponentImpl
