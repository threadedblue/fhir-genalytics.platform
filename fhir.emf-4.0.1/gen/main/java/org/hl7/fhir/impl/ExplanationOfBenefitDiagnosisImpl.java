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
import org.hl7.fhir.ExplanationOfBenefitDiagnosis;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explanation Of Benefit Diagnosis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitDiagnosisImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitDiagnosisImpl#getDiagnosisCodeableConcept <em>Diagnosis Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitDiagnosisImpl#getDiagnosisReference <em>Diagnosis Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitDiagnosisImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitDiagnosisImpl#getOnAdmission <em>On Admission</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitDiagnosisImpl#getPackageCode <em>Package Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExplanationOfBenefitDiagnosisImpl extends BackboneElementImpl implements ExplanationOfBenefitDiagnosis {
	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt sequence;

	/**
	 * The cached value of the '{@link #getDiagnosisCodeableConcept() <em>Diagnosis Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosisCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept diagnosisCodeableConcept;

	/**
	 * The cached value of the '{@link #getDiagnosisReference() <em>Diagnosis Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosisReference()
	 * @generated
	 * @ordered
	 */
	protected Reference diagnosisReference;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> type;

	/**
	 * The cached value of the '{@link #getOnAdmission() <em>On Admission</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnAdmission()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept onAdmission;

	/**
	 * The cached value of the '{@link #getPackageCode() <em>Package Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept packageCode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExplanationOfBenefitDiagnosisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getExplanationOfBenefitDiagnosis();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequence(PositiveInt newSequence, NotificationChain msgs) {
		PositiveInt oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__SEQUENCE, oldSequence, newSequence);
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
	public void setSequence(PositiveInt newSequence) {
		if (newSequence != sequence) {
			NotificationChain msgs = null;
			if (sequence != null)
				msgs = ((InternalEObject)sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__SEQUENCE, null, msgs);
			if (newSequence != null)
				msgs = ((InternalEObject)newSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__SEQUENCE, null, msgs);
			msgs = basicSetSequence(newSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__SEQUENCE, newSequence, newSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getDiagnosisCodeableConcept() {
		return diagnosisCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagnosisCodeableConcept(CodeableConcept newDiagnosisCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldDiagnosisCodeableConcept = diagnosisCodeableConcept;
		diagnosisCodeableConcept = newDiagnosisCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__DIAGNOSIS_CODEABLE_CONCEPT, oldDiagnosisCodeableConcept, newDiagnosisCodeableConcept);
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
	public void setDiagnosisCodeableConcept(CodeableConcept newDiagnosisCodeableConcept) {
		if (newDiagnosisCodeableConcept != diagnosisCodeableConcept) {
			NotificationChain msgs = null;
			if (diagnosisCodeableConcept != null)
				msgs = ((InternalEObject)diagnosisCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__DIAGNOSIS_CODEABLE_CONCEPT, null, msgs);
			if (newDiagnosisCodeableConcept != null)
				msgs = ((InternalEObject)newDiagnosisCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__DIAGNOSIS_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetDiagnosisCodeableConcept(newDiagnosisCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__DIAGNOSIS_CODEABLE_CONCEPT, newDiagnosisCodeableConcept, newDiagnosisCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getDiagnosisReference() {
		return diagnosisReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagnosisReference(Reference newDiagnosisReference, NotificationChain msgs) {
		Reference oldDiagnosisReference = diagnosisReference;
		diagnosisReference = newDiagnosisReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__DIAGNOSIS_REFERENCE, oldDiagnosisReference, newDiagnosisReference);
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
	public void setDiagnosisReference(Reference newDiagnosisReference) {
		if (newDiagnosisReference != diagnosisReference) {
			NotificationChain msgs = null;
			if (diagnosisReference != null)
				msgs = ((InternalEObject)diagnosisReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__DIAGNOSIS_REFERENCE, null, msgs);
			if (newDiagnosisReference != null)
				msgs = ((InternalEObject)newDiagnosisReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__DIAGNOSIS_REFERENCE, null, msgs);
			msgs = basicSetDiagnosisReference(newDiagnosisReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__DIAGNOSIS_REFERENCE, newDiagnosisReference, newDiagnosisReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getType() {
		if (type == null) {
			type = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getOnAdmission() {
		return onAdmission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnAdmission(CodeableConcept newOnAdmission, NotificationChain msgs) {
		CodeableConcept oldOnAdmission = onAdmission;
		onAdmission = newOnAdmission;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__ON_ADMISSION, oldOnAdmission, newOnAdmission);
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
	public void setOnAdmission(CodeableConcept newOnAdmission) {
		if (newOnAdmission != onAdmission) {
			NotificationChain msgs = null;
			if (onAdmission != null)
				msgs = ((InternalEObject)onAdmission).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__ON_ADMISSION, null, msgs);
			if (newOnAdmission != null)
				msgs = ((InternalEObject)newOnAdmission).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__ON_ADMISSION, null, msgs);
			msgs = basicSetOnAdmission(newOnAdmission, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__ON_ADMISSION, newOnAdmission, newOnAdmission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getPackageCode() {
		return packageCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackageCode(CodeableConcept newPackageCode, NotificationChain msgs) {
		CodeableConcept oldPackageCode = packageCode;
		packageCode = newPackageCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__PACKAGE_CODE, oldPackageCode, newPackageCode);
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
	public void setPackageCode(CodeableConcept newPackageCode) {
		if (newPackageCode != packageCode) {
			NotificationChain msgs = null;
			if (packageCode != null)
				msgs = ((InternalEObject)packageCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__PACKAGE_CODE, null, msgs);
			if (newPackageCode != null)
				msgs = ((InternalEObject)newPackageCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__PACKAGE_CODE, null, msgs);
			msgs = basicSetPackageCode(newPackageCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__PACKAGE_CODE, newPackageCode, newPackageCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__SEQUENCE:
				return basicSetSequence(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__DIAGNOSIS_CODEABLE_CONCEPT:
				return basicSetDiagnosisCodeableConcept(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__DIAGNOSIS_REFERENCE:
				return basicSetDiagnosisReference(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__ON_ADMISSION:
				return basicSetOnAdmission(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__PACKAGE_CODE:
				return basicSetPackageCode(null, msgs);
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__SEQUENCE:
				return getSequence();
			case FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__DIAGNOSIS_CODEABLE_CONCEPT:
				return getDiagnosisCodeableConcept();
			case FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__DIAGNOSIS_REFERENCE:
				return getDiagnosisReference();
			case FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__TYPE:
				return getType();
			case FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__ON_ADMISSION:
				return getOnAdmission();
			case FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__PACKAGE_CODE:
				return getPackageCode();
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__SEQUENCE:
				setSequence((PositiveInt)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__DIAGNOSIS_CODEABLE_CONCEPT:
				setDiagnosisCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__DIAGNOSIS_REFERENCE:
				setDiagnosisReference((Reference)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__ON_ADMISSION:
				setOnAdmission((CodeableConcept)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__PACKAGE_CODE:
				setPackageCode((CodeableConcept)newValue);
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__SEQUENCE:
				setSequence((PositiveInt)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__DIAGNOSIS_CODEABLE_CONCEPT:
				setDiagnosisCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__DIAGNOSIS_REFERENCE:
				setDiagnosisReference((Reference)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__TYPE:
				getType().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__ON_ADMISSION:
				setOnAdmission((CodeableConcept)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__PACKAGE_CODE:
				setPackageCode((CodeableConcept)null);
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__SEQUENCE:
				return sequence != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__DIAGNOSIS_CODEABLE_CONCEPT:
				return diagnosisCodeableConcept != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__DIAGNOSIS_REFERENCE:
				return diagnosisReference != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__TYPE:
				return type != null && !type.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__ON_ADMISSION:
				return onAdmission != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__PACKAGE_CODE:
				return packageCode != null;
		}
		return super.eIsSet(featureID);
	}

} //ExplanationOfBenefitDiagnosisImpl
