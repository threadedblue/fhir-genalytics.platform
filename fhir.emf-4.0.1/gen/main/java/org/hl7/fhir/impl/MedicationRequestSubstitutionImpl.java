/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.MedicationRequestSubstitution;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Request Substitution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicationRequestSubstitutionImpl#getAllowedBoolean <em>Allowed Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationRequestSubstitutionImpl#getAllowedCodeableConcept <em>Allowed Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationRequestSubstitutionImpl#getReason <em>Reason</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationRequestSubstitutionImpl extends BackboneElementImpl implements MedicationRequestSubstitution {
	/**
	 * The cached value of the '{@link #getAllowedBoolean() <em>Allowed Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedBoolean()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean allowedBoolean;

	/**
	 * The cached value of the '{@link #getAllowedCodeableConcept() <em>Allowed Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept allowedCodeableConcept;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept reason;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationRequestSubstitutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicationRequestSubstitution();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getAllowedBoolean() {
		return allowedBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllowedBoolean(org.hl7.fhir.Boolean newAllowedBoolean, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldAllowedBoolean = allowedBoolean;
		allowedBoolean = newAllowedBoolean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST_SUBSTITUTION__ALLOWED_BOOLEAN, oldAllowedBoolean, newAllowedBoolean);
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
	public void setAllowedBoolean(org.hl7.fhir.Boolean newAllowedBoolean) {
		if (newAllowedBoolean != allowedBoolean) {
			NotificationChain msgs = null;
			if (allowedBoolean != null)
				msgs = ((InternalEObject)allowedBoolean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST_SUBSTITUTION__ALLOWED_BOOLEAN, null, msgs);
			if (newAllowedBoolean != null)
				msgs = ((InternalEObject)newAllowedBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST_SUBSTITUTION__ALLOWED_BOOLEAN, null, msgs);
			msgs = basicSetAllowedBoolean(newAllowedBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST_SUBSTITUTION__ALLOWED_BOOLEAN, newAllowedBoolean, newAllowedBoolean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getAllowedCodeableConcept() {
		return allowedCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllowedCodeableConcept(CodeableConcept newAllowedCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldAllowedCodeableConcept = allowedCodeableConcept;
		allowedCodeableConcept = newAllowedCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST_SUBSTITUTION__ALLOWED_CODEABLE_CONCEPT, oldAllowedCodeableConcept, newAllowedCodeableConcept);
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
	public void setAllowedCodeableConcept(CodeableConcept newAllowedCodeableConcept) {
		if (newAllowedCodeableConcept != allowedCodeableConcept) {
			NotificationChain msgs = null;
			if (allowedCodeableConcept != null)
				msgs = ((InternalEObject)allowedCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST_SUBSTITUTION__ALLOWED_CODEABLE_CONCEPT, null, msgs);
			if (newAllowedCodeableConcept != null)
				msgs = ((InternalEObject)newAllowedCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST_SUBSTITUTION__ALLOWED_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetAllowedCodeableConcept(newAllowedCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST_SUBSTITUTION__ALLOWED_CODEABLE_CONCEPT, newAllowedCodeableConcept, newAllowedCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getReason() {
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReason(CodeableConcept newReason, NotificationChain msgs) {
		CodeableConcept oldReason = reason;
		reason = newReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST_SUBSTITUTION__REASON, oldReason, newReason);
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
	public void setReason(CodeableConcept newReason) {
		if (newReason != reason) {
			NotificationChain msgs = null;
			if (reason != null)
				msgs = ((InternalEObject)reason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST_SUBSTITUTION__REASON, null, msgs);
			if (newReason != null)
				msgs = ((InternalEObject)newReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST_SUBSTITUTION__REASON, null, msgs);
			msgs = basicSetReason(newReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST_SUBSTITUTION__REASON, newReason, newReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICATION_REQUEST_SUBSTITUTION__ALLOWED_BOOLEAN:
				return basicSetAllowedBoolean(null, msgs);
			case FhirPackage.MEDICATION_REQUEST_SUBSTITUTION__ALLOWED_CODEABLE_CONCEPT:
				return basicSetAllowedCodeableConcept(null, msgs);
			case FhirPackage.MEDICATION_REQUEST_SUBSTITUTION__REASON:
				return basicSetReason(null, msgs);
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
			case FhirPackage.MEDICATION_REQUEST_SUBSTITUTION__ALLOWED_BOOLEAN:
				return getAllowedBoolean();
			case FhirPackage.MEDICATION_REQUEST_SUBSTITUTION__ALLOWED_CODEABLE_CONCEPT:
				return getAllowedCodeableConcept();
			case FhirPackage.MEDICATION_REQUEST_SUBSTITUTION__REASON:
				return getReason();
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
			case FhirPackage.MEDICATION_REQUEST_SUBSTITUTION__ALLOWED_BOOLEAN:
				setAllowedBoolean((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST_SUBSTITUTION__ALLOWED_CODEABLE_CONCEPT:
				setAllowedCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST_SUBSTITUTION__REASON:
				setReason((CodeableConcept)newValue);
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
			case FhirPackage.MEDICATION_REQUEST_SUBSTITUTION__ALLOWED_BOOLEAN:
				setAllowedBoolean((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.MEDICATION_REQUEST_SUBSTITUTION__ALLOWED_CODEABLE_CONCEPT:
				setAllowedCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_REQUEST_SUBSTITUTION__REASON:
				setReason((CodeableConcept)null);
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
			case FhirPackage.MEDICATION_REQUEST_SUBSTITUTION__ALLOWED_BOOLEAN:
				return allowedBoolean != null;
			case FhirPackage.MEDICATION_REQUEST_SUBSTITUTION__ALLOWED_CODEABLE_CONCEPT:
				return allowedCodeableConcept != null;
			case FhirPackage.MEDICATION_REQUEST_SUBSTITUTION__REASON:
				return reason != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicationRequestSubstitutionImpl
