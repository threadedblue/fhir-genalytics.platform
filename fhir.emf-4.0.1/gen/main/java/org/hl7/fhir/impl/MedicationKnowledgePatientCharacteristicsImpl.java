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
import org.hl7.fhir.MedicationKnowledgePatientCharacteristics;
import org.hl7.fhir.Quantity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Knowledge Patient Characteristics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgePatientCharacteristicsImpl#getCharacteristicCodeableConcept <em>Characteristic Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgePatientCharacteristicsImpl#getCharacteristicQuantity <em>Characteristic Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgePatientCharacteristicsImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationKnowledgePatientCharacteristicsImpl extends BackboneElementImpl implements MedicationKnowledgePatientCharacteristics {
	/**
	 * The cached value of the '{@link #getCharacteristicCodeableConcept() <em>Characteristic Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristicCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept characteristicCodeableConcept;

	/**
	 * The cached value of the '{@link #getCharacteristicQuantity() <em>Characteristic Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristicQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity characteristicQuantity;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationKnowledgePatientCharacteristicsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicationKnowledgePatientCharacteristics();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCharacteristicCodeableConcept() {
		return characteristicCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCharacteristicCodeableConcept(CodeableConcept newCharacteristicCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldCharacteristicCodeableConcept = characteristicCodeableConcept;
		characteristicCodeableConcept = newCharacteristicCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE_PATIENT_CHARACTERISTICS__CHARACTERISTIC_CODEABLE_CONCEPT, oldCharacteristicCodeableConcept, newCharacteristicCodeableConcept);
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
	public void setCharacteristicCodeableConcept(CodeableConcept newCharacteristicCodeableConcept) {
		if (newCharacteristicCodeableConcept != characteristicCodeableConcept) {
			NotificationChain msgs = null;
			if (characteristicCodeableConcept != null)
				msgs = ((InternalEObject)characteristicCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE_PATIENT_CHARACTERISTICS__CHARACTERISTIC_CODEABLE_CONCEPT, null, msgs);
			if (newCharacteristicCodeableConcept != null)
				msgs = ((InternalEObject)newCharacteristicCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE_PATIENT_CHARACTERISTICS__CHARACTERISTIC_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetCharacteristicCodeableConcept(newCharacteristicCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE_PATIENT_CHARACTERISTICS__CHARACTERISTIC_CODEABLE_CONCEPT, newCharacteristicCodeableConcept, newCharacteristicCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getCharacteristicQuantity() {
		return characteristicQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCharacteristicQuantity(Quantity newCharacteristicQuantity, NotificationChain msgs) {
		Quantity oldCharacteristicQuantity = characteristicQuantity;
		characteristicQuantity = newCharacteristicQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE_PATIENT_CHARACTERISTICS__CHARACTERISTIC_QUANTITY, oldCharacteristicQuantity, newCharacteristicQuantity);
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
	public void setCharacteristicQuantity(Quantity newCharacteristicQuantity) {
		if (newCharacteristicQuantity != characteristicQuantity) {
			NotificationChain msgs = null;
			if (characteristicQuantity != null)
				msgs = ((InternalEObject)characteristicQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE_PATIENT_CHARACTERISTICS__CHARACTERISTIC_QUANTITY, null, msgs);
			if (newCharacteristicQuantity != null)
				msgs = ((InternalEObject)newCharacteristicQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE_PATIENT_CHARACTERISTICS__CHARACTERISTIC_QUANTITY, null, msgs);
			msgs = basicSetCharacteristicQuantity(newCharacteristicQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE_PATIENT_CHARACTERISTICS__CHARACTERISTIC_QUANTITY, newCharacteristicQuantity, newCharacteristicQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.hl7.fhir.String> getValue() {
		if (value == null) {
			value = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.MEDICATION_KNOWLEDGE_PATIENT_CHARACTERISTICS__VALUE);
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICATION_KNOWLEDGE_PATIENT_CHARACTERISTICS__CHARACTERISTIC_CODEABLE_CONCEPT:
				return basicSetCharacteristicCodeableConcept(null, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE_PATIENT_CHARACTERISTICS__CHARACTERISTIC_QUANTITY:
				return basicSetCharacteristicQuantity(null, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE_PATIENT_CHARACTERISTICS__VALUE:
				return ((InternalEList<?>)getValue()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MEDICATION_KNOWLEDGE_PATIENT_CHARACTERISTICS__CHARACTERISTIC_CODEABLE_CONCEPT:
				return getCharacteristicCodeableConcept();
			case FhirPackage.MEDICATION_KNOWLEDGE_PATIENT_CHARACTERISTICS__CHARACTERISTIC_QUANTITY:
				return getCharacteristicQuantity();
			case FhirPackage.MEDICATION_KNOWLEDGE_PATIENT_CHARACTERISTICS__VALUE:
				return getValue();
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
			case FhirPackage.MEDICATION_KNOWLEDGE_PATIENT_CHARACTERISTICS__CHARACTERISTIC_CODEABLE_CONCEPT:
				setCharacteristicCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_PATIENT_CHARACTERISTICS__CHARACTERISTIC_QUANTITY:
				setCharacteristicQuantity((Quantity)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_PATIENT_CHARACTERISTICS__VALUE:
				getValue().clear();
				getValue().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
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
			case FhirPackage.MEDICATION_KNOWLEDGE_PATIENT_CHARACTERISTICS__CHARACTERISTIC_CODEABLE_CONCEPT:
				setCharacteristicCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_PATIENT_CHARACTERISTICS__CHARACTERISTIC_QUANTITY:
				setCharacteristicQuantity((Quantity)null);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_PATIENT_CHARACTERISTICS__VALUE:
				getValue().clear();
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
			case FhirPackage.MEDICATION_KNOWLEDGE_PATIENT_CHARACTERISTICS__CHARACTERISTIC_CODEABLE_CONCEPT:
				return characteristicCodeableConcept != null;
			case FhirPackage.MEDICATION_KNOWLEDGE_PATIENT_CHARACTERISTICS__CHARACTERISTIC_QUANTITY:
				return characteristicQuantity != null;
			case FhirPackage.MEDICATION_KNOWLEDGE_PATIENT_CHARACTERISTICS__VALUE:
				return value != null && !value.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicationKnowledgePatientCharacteristicsImpl
