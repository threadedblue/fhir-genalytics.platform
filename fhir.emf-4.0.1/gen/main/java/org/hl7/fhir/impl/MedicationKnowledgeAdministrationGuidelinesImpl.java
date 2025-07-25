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
import org.hl7.fhir.MedicationKnowledgeAdministrationGuidelines;
import org.hl7.fhir.MedicationKnowledgeDosage;
import org.hl7.fhir.MedicationKnowledgePatientCharacteristics;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Knowledge Administration Guidelines</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeAdministrationGuidelinesImpl#getDosage <em>Dosage</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeAdministrationGuidelinesImpl#getIndicationCodeableConcept <em>Indication Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeAdministrationGuidelinesImpl#getIndicationReference <em>Indication Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeAdministrationGuidelinesImpl#getPatientCharacteristics <em>Patient Characteristics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationKnowledgeAdministrationGuidelinesImpl extends BackboneElementImpl implements MedicationKnowledgeAdministrationGuidelines {
	/**
	 * The cached value of the '{@link #getDosage() <em>Dosage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDosage()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationKnowledgeDosage> dosage;

	/**
	 * The cached value of the '{@link #getIndicationCodeableConcept() <em>Indication Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicationCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept indicationCodeableConcept;

	/**
	 * The cached value of the '{@link #getIndicationReference() <em>Indication Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicationReference()
	 * @generated
	 * @ordered
	 */
	protected Reference indicationReference;

	/**
	 * The cached value of the '{@link #getPatientCharacteristics() <em>Patient Characteristics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationKnowledgePatientCharacteristics> patientCharacteristics;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationKnowledgeAdministrationGuidelinesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicationKnowledgeAdministrationGuidelines();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicationKnowledgeDosage> getDosage() {
		if (dosage == null) {
			dosage = new EObjectContainmentEList<MedicationKnowledgeDosage>(MedicationKnowledgeDosage.class, this, FhirPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__DOSAGE);
		}
		return dosage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getIndicationCodeableConcept() {
		return indicationCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndicationCodeableConcept(CodeableConcept newIndicationCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldIndicationCodeableConcept = indicationCodeableConcept;
		indicationCodeableConcept = newIndicationCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__INDICATION_CODEABLE_CONCEPT, oldIndicationCodeableConcept, newIndicationCodeableConcept);
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
	public void setIndicationCodeableConcept(CodeableConcept newIndicationCodeableConcept) {
		if (newIndicationCodeableConcept != indicationCodeableConcept) {
			NotificationChain msgs = null;
			if (indicationCodeableConcept != null)
				msgs = ((InternalEObject)indicationCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__INDICATION_CODEABLE_CONCEPT, null, msgs);
			if (newIndicationCodeableConcept != null)
				msgs = ((InternalEObject)newIndicationCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__INDICATION_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetIndicationCodeableConcept(newIndicationCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__INDICATION_CODEABLE_CONCEPT, newIndicationCodeableConcept, newIndicationCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getIndicationReference() {
		return indicationReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndicationReference(Reference newIndicationReference, NotificationChain msgs) {
		Reference oldIndicationReference = indicationReference;
		indicationReference = newIndicationReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__INDICATION_REFERENCE, oldIndicationReference, newIndicationReference);
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
	public void setIndicationReference(Reference newIndicationReference) {
		if (newIndicationReference != indicationReference) {
			NotificationChain msgs = null;
			if (indicationReference != null)
				msgs = ((InternalEObject)indicationReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__INDICATION_REFERENCE, null, msgs);
			if (newIndicationReference != null)
				msgs = ((InternalEObject)newIndicationReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__INDICATION_REFERENCE, null, msgs);
			msgs = basicSetIndicationReference(newIndicationReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__INDICATION_REFERENCE, newIndicationReference, newIndicationReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicationKnowledgePatientCharacteristics> getPatientCharacteristics() {
		if (patientCharacteristics == null) {
			patientCharacteristics = new EObjectContainmentEList<MedicationKnowledgePatientCharacteristics>(MedicationKnowledgePatientCharacteristics.class, this, FhirPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__PATIENT_CHARACTERISTICS);
		}
		return patientCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__DOSAGE:
				return ((InternalEList<?>)getDosage()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__INDICATION_CODEABLE_CONCEPT:
				return basicSetIndicationCodeableConcept(null, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__INDICATION_REFERENCE:
				return basicSetIndicationReference(null, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__PATIENT_CHARACTERISTICS:
				return ((InternalEList<?>)getPatientCharacteristics()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__DOSAGE:
				return getDosage();
			case FhirPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__INDICATION_CODEABLE_CONCEPT:
				return getIndicationCodeableConcept();
			case FhirPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__INDICATION_REFERENCE:
				return getIndicationReference();
			case FhirPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__PATIENT_CHARACTERISTICS:
				return getPatientCharacteristics();
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
			case FhirPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__DOSAGE:
				getDosage().clear();
				getDosage().addAll((Collection<? extends MedicationKnowledgeDosage>)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__INDICATION_CODEABLE_CONCEPT:
				setIndicationCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__INDICATION_REFERENCE:
				setIndicationReference((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__PATIENT_CHARACTERISTICS:
				getPatientCharacteristics().clear();
				getPatientCharacteristics().addAll((Collection<? extends MedicationKnowledgePatientCharacteristics>)newValue);
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
			case FhirPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__DOSAGE:
				getDosage().clear();
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__INDICATION_CODEABLE_CONCEPT:
				setIndicationCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__INDICATION_REFERENCE:
				setIndicationReference((Reference)null);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__PATIENT_CHARACTERISTICS:
				getPatientCharacteristics().clear();
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
			case FhirPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__DOSAGE:
				return dosage != null && !dosage.isEmpty();
			case FhirPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__INDICATION_CODEABLE_CONCEPT:
				return indicationCodeableConcept != null;
			case FhirPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__INDICATION_REFERENCE:
				return indicationReference != null;
			case FhirPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__PATIENT_CHARACTERISTICS:
				return patientCharacteristics != null && !patientCharacteristics.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicationKnowledgeAdministrationGuidelinesImpl
