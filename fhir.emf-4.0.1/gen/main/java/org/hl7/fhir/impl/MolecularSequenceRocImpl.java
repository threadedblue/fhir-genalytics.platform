/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.Decimal;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.MolecularSequenceRoc;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Molecular Sequence Roc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceRocImpl#getScore <em>Score</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceRocImpl#getNumTP <em>Num TP</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceRocImpl#getNumFP <em>Num FP</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceRocImpl#getNumFN <em>Num FN</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceRocImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceRocImpl#getSensitivity <em>Sensitivity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceRocImpl#getFMeasure <em>FMeasure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MolecularSequenceRocImpl extends BackboneElementImpl implements MolecularSequenceRoc {
	/**
	 * The cached value of the '{@link #getScore() <em>Score</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.Integer> score;

	/**
	 * The cached value of the '{@link #getNumTP() <em>Num TP</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumTP()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.Integer> numTP;

	/**
	 * The cached value of the '{@link #getNumFP() <em>Num FP</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumFP()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.Integer> numFP;

	/**
	 * The cached value of the '{@link #getNumFN() <em>Num FN</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumFN()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.Integer> numFN;

	/**
	 * The cached value of the '{@link #getPrecision() <em>Precision</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected EList<Decimal> precision;

	/**
	 * The cached value of the '{@link #getSensitivity() <em>Sensitivity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensitivity()
	 * @generated
	 * @ordered
	 */
	protected EList<Decimal> sensitivity;

	/**
	 * The cached value of the '{@link #getFMeasure() <em>FMeasure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFMeasure()
	 * @generated
	 * @ordered
	 */
	protected EList<Decimal> fMeasure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MolecularSequenceRocImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMolecularSequenceRoc();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.hl7.fhir.Integer> getScore() {
		if (score == null) {
			score = new EObjectContainmentEList<org.hl7.fhir.Integer>(org.hl7.fhir.Integer.class, this, FhirPackage.MOLECULAR_SEQUENCE_ROC__SCORE);
		}
		return score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.hl7.fhir.Integer> getNumTP() {
		if (numTP == null) {
			numTP = new EObjectContainmentEList<org.hl7.fhir.Integer>(org.hl7.fhir.Integer.class, this, FhirPackage.MOLECULAR_SEQUENCE_ROC__NUM_TP);
		}
		return numTP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.hl7.fhir.Integer> getNumFP() {
		if (numFP == null) {
			numFP = new EObjectContainmentEList<org.hl7.fhir.Integer>(org.hl7.fhir.Integer.class, this, FhirPackage.MOLECULAR_SEQUENCE_ROC__NUM_FP);
		}
		return numFP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.hl7.fhir.Integer> getNumFN() {
		if (numFN == null) {
			numFN = new EObjectContainmentEList<org.hl7.fhir.Integer>(org.hl7.fhir.Integer.class, this, FhirPackage.MOLECULAR_SEQUENCE_ROC__NUM_FN);
		}
		return numFN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Decimal> getPrecision() {
		if (precision == null) {
			precision = new EObjectContainmentEList<Decimal>(Decimal.class, this, FhirPackage.MOLECULAR_SEQUENCE_ROC__PRECISION);
		}
		return precision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Decimal> getSensitivity() {
		if (sensitivity == null) {
			sensitivity = new EObjectContainmentEList<Decimal>(Decimal.class, this, FhirPackage.MOLECULAR_SEQUENCE_ROC__SENSITIVITY);
		}
		return sensitivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Decimal> getFMeasure() {
		if (fMeasure == null) {
			fMeasure = new EObjectContainmentEList<Decimal>(Decimal.class, this, FhirPackage.MOLECULAR_SEQUENCE_ROC__FMEASURE);
		}
		return fMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MOLECULAR_SEQUENCE_ROC__SCORE:
				return ((InternalEList<?>)getScore()).basicRemove(otherEnd, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE_ROC__NUM_TP:
				return ((InternalEList<?>)getNumTP()).basicRemove(otherEnd, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE_ROC__NUM_FP:
				return ((InternalEList<?>)getNumFP()).basicRemove(otherEnd, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE_ROC__NUM_FN:
				return ((InternalEList<?>)getNumFN()).basicRemove(otherEnd, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE_ROC__PRECISION:
				return ((InternalEList<?>)getPrecision()).basicRemove(otherEnd, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE_ROC__SENSITIVITY:
				return ((InternalEList<?>)getSensitivity()).basicRemove(otherEnd, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE_ROC__FMEASURE:
				return ((InternalEList<?>)getFMeasure()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MOLECULAR_SEQUENCE_ROC__SCORE:
				return getScore();
			case FhirPackage.MOLECULAR_SEQUENCE_ROC__NUM_TP:
				return getNumTP();
			case FhirPackage.MOLECULAR_SEQUENCE_ROC__NUM_FP:
				return getNumFP();
			case FhirPackage.MOLECULAR_SEQUENCE_ROC__NUM_FN:
				return getNumFN();
			case FhirPackage.MOLECULAR_SEQUENCE_ROC__PRECISION:
				return getPrecision();
			case FhirPackage.MOLECULAR_SEQUENCE_ROC__SENSITIVITY:
				return getSensitivity();
			case FhirPackage.MOLECULAR_SEQUENCE_ROC__FMEASURE:
				return getFMeasure();
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
			case FhirPackage.MOLECULAR_SEQUENCE_ROC__SCORE:
				getScore().clear();
				getScore().addAll((Collection<? extends org.hl7.fhir.Integer>)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_ROC__NUM_TP:
				getNumTP().clear();
				getNumTP().addAll((Collection<? extends org.hl7.fhir.Integer>)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_ROC__NUM_FP:
				getNumFP().clear();
				getNumFP().addAll((Collection<? extends org.hl7.fhir.Integer>)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_ROC__NUM_FN:
				getNumFN().clear();
				getNumFN().addAll((Collection<? extends org.hl7.fhir.Integer>)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_ROC__PRECISION:
				getPrecision().clear();
				getPrecision().addAll((Collection<? extends Decimal>)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_ROC__SENSITIVITY:
				getSensitivity().clear();
				getSensitivity().addAll((Collection<? extends Decimal>)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_ROC__FMEASURE:
				getFMeasure().clear();
				getFMeasure().addAll((Collection<? extends Decimal>)newValue);
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
			case FhirPackage.MOLECULAR_SEQUENCE_ROC__SCORE:
				getScore().clear();
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_ROC__NUM_TP:
				getNumTP().clear();
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_ROC__NUM_FP:
				getNumFP().clear();
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_ROC__NUM_FN:
				getNumFN().clear();
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_ROC__PRECISION:
				getPrecision().clear();
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_ROC__SENSITIVITY:
				getSensitivity().clear();
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_ROC__FMEASURE:
				getFMeasure().clear();
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
			case FhirPackage.MOLECULAR_SEQUENCE_ROC__SCORE:
				return score != null && !score.isEmpty();
			case FhirPackage.MOLECULAR_SEQUENCE_ROC__NUM_TP:
				return numTP != null && !numTP.isEmpty();
			case FhirPackage.MOLECULAR_SEQUENCE_ROC__NUM_FP:
				return numFP != null && !numFP.isEmpty();
			case FhirPackage.MOLECULAR_SEQUENCE_ROC__NUM_FN:
				return numFN != null && !numFN.isEmpty();
			case FhirPackage.MOLECULAR_SEQUENCE_ROC__PRECISION:
				return precision != null && !precision.isEmpty();
			case FhirPackage.MOLECULAR_SEQUENCE_ROC__SENSITIVITY:
				return sensitivity != null && !sensitivity.isEmpty();
			case FhirPackage.MOLECULAR_SEQUENCE_ROC__FMEASURE:
				return fMeasure != null && !fMeasure.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MolecularSequenceRocImpl
