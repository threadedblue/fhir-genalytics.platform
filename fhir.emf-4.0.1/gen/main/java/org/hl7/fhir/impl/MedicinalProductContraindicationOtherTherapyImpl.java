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
import org.hl7.fhir.MedicinalProductContraindicationOtherTherapy;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicinal Product Contraindication Other Therapy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductContraindicationOtherTherapyImpl#getTherapyRelationshipType <em>Therapy Relationship Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductContraindicationOtherTherapyImpl#getMedicationCodeableConcept <em>Medication Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductContraindicationOtherTherapyImpl#getMedicationReference <em>Medication Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductContraindicationOtherTherapyImpl extends BackboneElementImpl implements MedicinalProductContraindicationOtherTherapy {
	/**
	 * The cached value of the '{@link #getTherapyRelationshipType() <em>Therapy Relationship Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTherapyRelationshipType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept therapyRelationshipType;

	/**
	 * The cached value of the '{@link #getMedicationCodeableConcept() <em>Medication Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept medicationCodeableConcept;

	/**
	 * The cached value of the '{@link #getMedicationReference() <em>Medication Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationReference()
	 * @generated
	 * @ordered
	 */
	protected Reference medicationReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductContraindicationOtherTherapyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicinalProductContraindicationOtherTherapy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getTherapyRelationshipType() {
		return therapyRelationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTherapyRelationshipType(CodeableConcept newTherapyRelationshipType, NotificationChain msgs) {
		CodeableConcept oldTherapyRelationshipType = therapyRelationshipType;
		therapyRelationshipType = newTherapyRelationshipType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_CONTRAINDICATION_OTHER_THERAPY__THERAPY_RELATIONSHIP_TYPE, oldTherapyRelationshipType, newTherapyRelationshipType);
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
	public void setTherapyRelationshipType(CodeableConcept newTherapyRelationshipType) {
		if (newTherapyRelationshipType != therapyRelationshipType) {
			NotificationChain msgs = null;
			if (therapyRelationshipType != null)
				msgs = ((InternalEObject)therapyRelationshipType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_CONTRAINDICATION_OTHER_THERAPY__THERAPY_RELATIONSHIP_TYPE, null, msgs);
			if (newTherapyRelationshipType != null)
				msgs = ((InternalEObject)newTherapyRelationshipType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_CONTRAINDICATION_OTHER_THERAPY__THERAPY_RELATIONSHIP_TYPE, null, msgs);
			msgs = basicSetTherapyRelationshipType(newTherapyRelationshipType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_CONTRAINDICATION_OTHER_THERAPY__THERAPY_RELATIONSHIP_TYPE, newTherapyRelationshipType, newTherapyRelationshipType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getMedicationCodeableConcept() {
		return medicationCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedicationCodeableConcept(CodeableConcept newMedicationCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldMedicationCodeableConcept = medicationCodeableConcept;
		medicationCodeableConcept = newMedicationCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_CONTRAINDICATION_OTHER_THERAPY__MEDICATION_CODEABLE_CONCEPT, oldMedicationCodeableConcept, newMedicationCodeableConcept);
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
	public void setMedicationCodeableConcept(CodeableConcept newMedicationCodeableConcept) {
		if (newMedicationCodeableConcept != medicationCodeableConcept) {
			NotificationChain msgs = null;
			if (medicationCodeableConcept != null)
				msgs = ((InternalEObject)medicationCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_CONTRAINDICATION_OTHER_THERAPY__MEDICATION_CODEABLE_CONCEPT, null, msgs);
			if (newMedicationCodeableConcept != null)
				msgs = ((InternalEObject)newMedicationCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_CONTRAINDICATION_OTHER_THERAPY__MEDICATION_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetMedicationCodeableConcept(newMedicationCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_CONTRAINDICATION_OTHER_THERAPY__MEDICATION_CODEABLE_CONCEPT, newMedicationCodeableConcept, newMedicationCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getMedicationReference() {
		return medicationReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedicationReference(Reference newMedicationReference, NotificationChain msgs) {
		Reference oldMedicationReference = medicationReference;
		medicationReference = newMedicationReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_CONTRAINDICATION_OTHER_THERAPY__MEDICATION_REFERENCE, oldMedicationReference, newMedicationReference);
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
	public void setMedicationReference(Reference newMedicationReference) {
		if (newMedicationReference != medicationReference) {
			NotificationChain msgs = null;
			if (medicationReference != null)
				msgs = ((InternalEObject)medicationReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_CONTRAINDICATION_OTHER_THERAPY__MEDICATION_REFERENCE, null, msgs);
			if (newMedicationReference != null)
				msgs = ((InternalEObject)newMedicationReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_CONTRAINDICATION_OTHER_THERAPY__MEDICATION_REFERENCE, null, msgs);
			msgs = basicSetMedicationReference(newMedicationReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_CONTRAINDICATION_OTHER_THERAPY__MEDICATION_REFERENCE, newMedicationReference, newMedicationReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICINAL_PRODUCT_CONTRAINDICATION_OTHER_THERAPY__THERAPY_RELATIONSHIP_TYPE:
				return basicSetTherapyRelationshipType(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_CONTRAINDICATION_OTHER_THERAPY__MEDICATION_CODEABLE_CONCEPT:
				return basicSetMedicationCodeableConcept(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_CONTRAINDICATION_OTHER_THERAPY__MEDICATION_REFERENCE:
				return basicSetMedicationReference(null, msgs);
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
			case FhirPackage.MEDICINAL_PRODUCT_CONTRAINDICATION_OTHER_THERAPY__THERAPY_RELATIONSHIP_TYPE:
				return getTherapyRelationshipType();
			case FhirPackage.MEDICINAL_PRODUCT_CONTRAINDICATION_OTHER_THERAPY__MEDICATION_CODEABLE_CONCEPT:
				return getMedicationCodeableConcept();
			case FhirPackage.MEDICINAL_PRODUCT_CONTRAINDICATION_OTHER_THERAPY__MEDICATION_REFERENCE:
				return getMedicationReference();
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
			case FhirPackage.MEDICINAL_PRODUCT_CONTRAINDICATION_OTHER_THERAPY__THERAPY_RELATIONSHIP_TYPE:
				setTherapyRelationshipType((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_CONTRAINDICATION_OTHER_THERAPY__MEDICATION_CODEABLE_CONCEPT:
				setMedicationCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_CONTRAINDICATION_OTHER_THERAPY__MEDICATION_REFERENCE:
				setMedicationReference((Reference)newValue);
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
			case FhirPackage.MEDICINAL_PRODUCT_CONTRAINDICATION_OTHER_THERAPY__THERAPY_RELATIONSHIP_TYPE:
				setTherapyRelationshipType((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_CONTRAINDICATION_OTHER_THERAPY__MEDICATION_CODEABLE_CONCEPT:
				setMedicationCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_CONTRAINDICATION_OTHER_THERAPY__MEDICATION_REFERENCE:
				setMedicationReference((Reference)null);
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
			case FhirPackage.MEDICINAL_PRODUCT_CONTRAINDICATION_OTHER_THERAPY__THERAPY_RELATIONSHIP_TYPE:
				return therapyRelationshipType != null;
			case FhirPackage.MEDICINAL_PRODUCT_CONTRAINDICATION_OTHER_THERAPY__MEDICATION_CODEABLE_CONCEPT:
				return medicationCodeableConcept != null;
			case FhirPackage.MEDICINAL_PRODUCT_CONTRAINDICATION_OTHER_THERAPY__MEDICATION_REFERENCE:
				return medicationReference != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductContraindicationOtherTherapyImpl
