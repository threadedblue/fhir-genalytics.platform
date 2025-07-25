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
import org.hl7.fhir.SubstanceSourceMaterialPartDescription;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Source Material Part Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSourceMaterialPartDescriptionImpl#getPart <em>Part</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSourceMaterialPartDescriptionImpl#getPartLocation <em>Part Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceSourceMaterialPartDescriptionImpl extends BackboneElementImpl implements SubstanceSourceMaterialPartDescription {
	/**
	 * The cached value of the '{@link #getPart() <em>Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPart()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept part;

	/**
	 * The cached value of the '{@link #getPartLocation() <em>Part Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartLocation()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept partLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceSourceMaterialPartDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubstanceSourceMaterialPartDescription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getPart() {
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPart(CodeableConcept newPart, NotificationChain msgs) {
		CodeableConcept oldPart = part;
		part = newPart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SOURCE_MATERIAL_PART_DESCRIPTION__PART, oldPart, newPart);
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
	public void setPart(CodeableConcept newPart) {
		if (newPart != part) {
			NotificationChain msgs = null;
			if (part != null)
				msgs = ((InternalEObject)part).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SOURCE_MATERIAL_PART_DESCRIPTION__PART, null, msgs);
			if (newPart != null)
				msgs = ((InternalEObject)newPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SOURCE_MATERIAL_PART_DESCRIPTION__PART, null, msgs);
			msgs = basicSetPart(newPart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SOURCE_MATERIAL_PART_DESCRIPTION__PART, newPart, newPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getPartLocation() {
		return partLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartLocation(CodeableConcept newPartLocation, NotificationChain msgs) {
		CodeableConcept oldPartLocation = partLocation;
		partLocation = newPartLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SOURCE_MATERIAL_PART_DESCRIPTION__PART_LOCATION, oldPartLocation, newPartLocation);
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
	public void setPartLocation(CodeableConcept newPartLocation) {
		if (newPartLocation != partLocation) {
			NotificationChain msgs = null;
			if (partLocation != null)
				msgs = ((InternalEObject)partLocation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SOURCE_MATERIAL_PART_DESCRIPTION__PART_LOCATION, null, msgs);
			if (newPartLocation != null)
				msgs = ((InternalEObject)newPartLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SOURCE_MATERIAL_PART_DESCRIPTION__PART_LOCATION, null, msgs);
			msgs = basicSetPartLocation(newPartLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SOURCE_MATERIAL_PART_DESCRIPTION__PART_LOCATION, newPartLocation, newPartLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_PART_DESCRIPTION__PART:
				return basicSetPart(null, msgs);
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_PART_DESCRIPTION__PART_LOCATION:
				return basicSetPartLocation(null, msgs);
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
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_PART_DESCRIPTION__PART:
				return getPart();
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_PART_DESCRIPTION__PART_LOCATION:
				return getPartLocation();
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
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_PART_DESCRIPTION__PART:
				setPart((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_PART_DESCRIPTION__PART_LOCATION:
				setPartLocation((CodeableConcept)newValue);
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
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_PART_DESCRIPTION__PART:
				setPart((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_PART_DESCRIPTION__PART_LOCATION:
				setPartLocation((CodeableConcept)null);
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
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_PART_DESCRIPTION__PART:
				return part != null;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_PART_DESCRIPTION__PART_LOCATION:
				return partLocation != null;
		}
		return super.eIsSet(featureID);
	}

} //SubstanceSourceMaterialPartDescriptionImpl
