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
import org.hl7.fhir.SubstanceSourceMaterialFractionDescription;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Source Material Fraction Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSourceMaterialFractionDescriptionImpl#getFraction <em>Fraction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSourceMaterialFractionDescriptionImpl#getMaterialType <em>Material Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceSourceMaterialFractionDescriptionImpl extends BackboneElementImpl implements SubstanceSourceMaterialFractionDescription {
	/**
	 * The cached value of the '{@link #getFraction() <em>Fraction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFraction()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String fraction;

	/**
	 * The cached value of the '{@link #getMaterialType() <em>Material Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept materialType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceSourceMaterialFractionDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubstanceSourceMaterialFractionDescription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getFraction() {
		return fraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFraction(org.hl7.fhir.String newFraction, NotificationChain msgs) {
		org.hl7.fhir.String oldFraction = fraction;
		fraction = newFraction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SOURCE_MATERIAL_FRACTION_DESCRIPTION__FRACTION, oldFraction, newFraction);
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
	public void setFraction(org.hl7.fhir.String newFraction) {
		if (newFraction != fraction) {
			NotificationChain msgs = null;
			if (fraction != null)
				msgs = ((InternalEObject)fraction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SOURCE_MATERIAL_FRACTION_DESCRIPTION__FRACTION, null, msgs);
			if (newFraction != null)
				msgs = ((InternalEObject)newFraction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SOURCE_MATERIAL_FRACTION_DESCRIPTION__FRACTION, null, msgs);
			msgs = basicSetFraction(newFraction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SOURCE_MATERIAL_FRACTION_DESCRIPTION__FRACTION, newFraction, newFraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getMaterialType() {
		return materialType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaterialType(CodeableConcept newMaterialType, NotificationChain msgs) {
		CodeableConcept oldMaterialType = materialType;
		materialType = newMaterialType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SOURCE_MATERIAL_FRACTION_DESCRIPTION__MATERIAL_TYPE, oldMaterialType, newMaterialType);
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
	public void setMaterialType(CodeableConcept newMaterialType) {
		if (newMaterialType != materialType) {
			NotificationChain msgs = null;
			if (materialType != null)
				msgs = ((InternalEObject)materialType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SOURCE_MATERIAL_FRACTION_DESCRIPTION__MATERIAL_TYPE, null, msgs);
			if (newMaterialType != null)
				msgs = ((InternalEObject)newMaterialType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SOURCE_MATERIAL_FRACTION_DESCRIPTION__MATERIAL_TYPE, null, msgs);
			msgs = basicSetMaterialType(newMaterialType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SOURCE_MATERIAL_FRACTION_DESCRIPTION__MATERIAL_TYPE, newMaterialType, newMaterialType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_FRACTION_DESCRIPTION__FRACTION:
				return basicSetFraction(null, msgs);
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_FRACTION_DESCRIPTION__MATERIAL_TYPE:
				return basicSetMaterialType(null, msgs);
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
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_FRACTION_DESCRIPTION__FRACTION:
				return getFraction();
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_FRACTION_DESCRIPTION__MATERIAL_TYPE:
				return getMaterialType();
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
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_FRACTION_DESCRIPTION__FRACTION:
				setFraction((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_FRACTION_DESCRIPTION__MATERIAL_TYPE:
				setMaterialType((CodeableConcept)newValue);
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
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_FRACTION_DESCRIPTION__FRACTION:
				setFraction((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_FRACTION_DESCRIPTION__MATERIAL_TYPE:
				setMaterialType((CodeableConcept)null);
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
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_FRACTION_DESCRIPTION__FRACTION:
				return fraction != null;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_FRACTION_DESCRIPTION__MATERIAL_TYPE:
				return materialType != null;
		}
		return super.eIsSet(featureID);
	}

} //SubstanceSourceMaterialFractionDescriptionImpl
