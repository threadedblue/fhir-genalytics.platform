/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DeviceDefinitionMaterial;
import org.hl7.fhir.FhirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Definition Material</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionMaterialImpl#getSubstance <em>Substance</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionMaterialImpl#getAlternate <em>Alternate</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionMaterialImpl#getAllergenicIndicator <em>Allergenic Indicator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceDefinitionMaterialImpl extends BackboneElementImpl implements DeviceDefinitionMaterial {
	/**
	 * The cached value of the '{@link #getSubstance() <em>Substance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstance()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept substance;

	/**
	 * The cached value of the '{@link #getAlternate() <em>Alternate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternate()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean alternate;

	/**
	 * The cached value of the '{@link #getAllergenicIndicator() <em>Allergenic Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergenicIndicator()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean allergenicIndicator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceDefinitionMaterialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDeviceDefinitionMaterial();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getSubstance() {
		return substance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstance(CodeableConcept newSubstance, NotificationChain msgs) {
		CodeableConcept oldSubstance = substance;
		substance = newSubstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION_MATERIAL__SUBSTANCE, oldSubstance, newSubstance);
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
	public void setSubstance(CodeableConcept newSubstance) {
		if (newSubstance != substance) {
			NotificationChain msgs = null;
			if (substance != null)
				msgs = ((InternalEObject)substance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION_MATERIAL__SUBSTANCE, null, msgs);
			if (newSubstance != null)
				msgs = ((InternalEObject)newSubstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION_MATERIAL__SUBSTANCE, null, msgs);
			msgs = basicSetSubstance(newSubstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION_MATERIAL__SUBSTANCE, newSubstance, newSubstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getAlternate() {
		return alternate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlternate(org.hl7.fhir.Boolean newAlternate, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldAlternate = alternate;
		alternate = newAlternate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION_MATERIAL__ALTERNATE, oldAlternate, newAlternate);
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
	public void setAlternate(org.hl7.fhir.Boolean newAlternate) {
		if (newAlternate != alternate) {
			NotificationChain msgs = null;
			if (alternate != null)
				msgs = ((InternalEObject)alternate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION_MATERIAL__ALTERNATE, null, msgs);
			if (newAlternate != null)
				msgs = ((InternalEObject)newAlternate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION_MATERIAL__ALTERNATE, null, msgs);
			msgs = basicSetAlternate(newAlternate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION_MATERIAL__ALTERNATE, newAlternate, newAlternate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getAllergenicIndicator() {
		return allergenicIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllergenicIndicator(org.hl7.fhir.Boolean newAllergenicIndicator, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldAllergenicIndicator = allergenicIndicator;
		allergenicIndicator = newAllergenicIndicator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION_MATERIAL__ALLERGENIC_INDICATOR, oldAllergenicIndicator, newAllergenicIndicator);
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
	public void setAllergenicIndicator(org.hl7.fhir.Boolean newAllergenicIndicator) {
		if (newAllergenicIndicator != allergenicIndicator) {
			NotificationChain msgs = null;
			if (allergenicIndicator != null)
				msgs = ((InternalEObject)allergenicIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION_MATERIAL__ALLERGENIC_INDICATOR, null, msgs);
			if (newAllergenicIndicator != null)
				msgs = ((InternalEObject)newAllergenicIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION_MATERIAL__ALLERGENIC_INDICATOR, null, msgs);
			msgs = basicSetAllergenicIndicator(newAllergenicIndicator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION_MATERIAL__ALLERGENIC_INDICATOR, newAllergenicIndicator, newAllergenicIndicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DEVICE_DEFINITION_MATERIAL__SUBSTANCE:
				return basicSetSubstance(null, msgs);
			case FhirPackage.DEVICE_DEFINITION_MATERIAL__ALTERNATE:
				return basicSetAlternate(null, msgs);
			case FhirPackage.DEVICE_DEFINITION_MATERIAL__ALLERGENIC_INDICATOR:
				return basicSetAllergenicIndicator(null, msgs);
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
			case FhirPackage.DEVICE_DEFINITION_MATERIAL__SUBSTANCE:
				return getSubstance();
			case FhirPackage.DEVICE_DEFINITION_MATERIAL__ALTERNATE:
				return getAlternate();
			case FhirPackage.DEVICE_DEFINITION_MATERIAL__ALLERGENIC_INDICATOR:
				return getAllergenicIndicator();
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
			case FhirPackage.DEVICE_DEFINITION_MATERIAL__SUBSTANCE:
				setSubstance((CodeableConcept)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION_MATERIAL__ALTERNATE:
				setAlternate((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION_MATERIAL__ALLERGENIC_INDICATOR:
				setAllergenicIndicator((org.hl7.fhir.Boolean)newValue);
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
			case FhirPackage.DEVICE_DEFINITION_MATERIAL__SUBSTANCE:
				setSubstance((CodeableConcept)null);
				return;
			case FhirPackage.DEVICE_DEFINITION_MATERIAL__ALTERNATE:
				setAlternate((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.DEVICE_DEFINITION_MATERIAL__ALLERGENIC_INDICATOR:
				setAllergenicIndicator((org.hl7.fhir.Boolean)null);
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
			case FhirPackage.DEVICE_DEFINITION_MATERIAL__SUBSTANCE:
				return substance != null;
			case FhirPackage.DEVICE_DEFINITION_MATERIAL__ALTERNATE:
				return alternate != null;
			case FhirPackage.DEVICE_DEFINITION_MATERIAL__ALLERGENIC_INDICATOR:
				return allergenicIndicator != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceDefinitionMaterialImpl
