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
import org.hl7.fhir.DeviceDefinitionProperty;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Quantity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Definition Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionPropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionPropertyImpl#getValueQuantity <em>Value Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionPropertyImpl#getValueCode <em>Value Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceDefinitionPropertyImpl extends BackboneElementImpl implements DeviceDefinitionProperty {
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
	 * The cached value of the '{@link #getValueQuantity() <em>Value Quantity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueQuantity()
	 * @generated
	 * @ordered
	 */
	protected EList<Quantity> valueQuantity;

	/**
	 * The cached value of the '{@link #getValueCode() <em>Value Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> valueCode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceDefinitionPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDeviceDefinitionProperty();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION_PROPERTY__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION_PROPERTY__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION_PROPERTY__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION_PROPERTY__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Quantity> getValueQuantity() {
		if (valueQuantity == null) {
			valueQuantity = new EObjectContainmentEList<Quantity>(Quantity.class, this, FhirPackage.DEVICE_DEFINITION_PROPERTY__VALUE_QUANTITY);
		}
		return valueQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getValueCode() {
		if (valueCode == null) {
			valueCode = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.DEVICE_DEFINITION_PROPERTY__VALUE_CODE);
		}
		return valueCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DEVICE_DEFINITION_PROPERTY__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.DEVICE_DEFINITION_PROPERTY__VALUE_QUANTITY:
				return ((InternalEList<?>)getValueQuantity()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_DEFINITION_PROPERTY__VALUE_CODE:
				return ((InternalEList<?>)getValueCode()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.DEVICE_DEFINITION_PROPERTY__TYPE:
				return getType();
			case FhirPackage.DEVICE_DEFINITION_PROPERTY__VALUE_QUANTITY:
				return getValueQuantity();
			case FhirPackage.DEVICE_DEFINITION_PROPERTY__VALUE_CODE:
				return getValueCode();
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
			case FhirPackage.DEVICE_DEFINITION_PROPERTY__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION_PROPERTY__VALUE_QUANTITY:
				getValueQuantity().clear();
				getValueQuantity().addAll((Collection<? extends Quantity>)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION_PROPERTY__VALUE_CODE:
				getValueCode().clear();
				getValueCode().addAll((Collection<? extends CodeableConcept>)newValue);
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
			case FhirPackage.DEVICE_DEFINITION_PROPERTY__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.DEVICE_DEFINITION_PROPERTY__VALUE_QUANTITY:
				getValueQuantity().clear();
				return;
			case FhirPackage.DEVICE_DEFINITION_PROPERTY__VALUE_CODE:
				getValueCode().clear();
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
			case FhirPackage.DEVICE_DEFINITION_PROPERTY__TYPE:
				return type != null;
			case FhirPackage.DEVICE_DEFINITION_PROPERTY__VALUE_QUANTITY:
				return valueQuantity != null && !valueQuantity.isEmpty();
			case FhirPackage.DEVICE_DEFINITION_PROPERTY__VALUE_CODE:
				return valueCode != null && !valueCode.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeviceDefinitionPropertyImpl
