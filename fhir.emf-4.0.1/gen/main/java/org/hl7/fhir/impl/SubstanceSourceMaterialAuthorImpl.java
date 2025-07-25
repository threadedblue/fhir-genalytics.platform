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
import org.hl7.fhir.SubstanceSourceMaterialAuthor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Source Material Author</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSourceMaterialAuthorImpl#getAuthorType <em>Author Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSourceMaterialAuthorImpl#getAuthorDescription <em>Author Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceSourceMaterialAuthorImpl extends BackboneElementImpl implements SubstanceSourceMaterialAuthor {
	/**
	 * The cached value of the '{@link #getAuthorType() <em>Author Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept authorType;

	/**
	 * The cached value of the '{@link #getAuthorDescription() <em>Author Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorDescription()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String authorDescription;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceSourceMaterialAuthorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubstanceSourceMaterialAuthor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getAuthorType() {
		return authorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthorType(CodeableConcept newAuthorType, NotificationChain msgs) {
		CodeableConcept oldAuthorType = authorType;
		authorType = newAuthorType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SOURCE_MATERIAL_AUTHOR__AUTHOR_TYPE, oldAuthorType, newAuthorType);
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
	public void setAuthorType(CodeableConcept newAuthorType) {
		if (newAuthorType != authorType) {
			NotificationChain msgs = null;
			if (authorType != null)
				msgs = ((InternalEObject)authorType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SOURCE_MATERIAL_AUTHOR__AUTHOR_TYPE, null, msgs);
			if (newAuthorType != null)
				msgs = ((InternalEObject)newAuthorType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SOURCE_MATERIAL_AUTHOR__AUTHOR_TYPE, null, msgs);
			msgs = basicSetAuthorType(newAuthorType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SOURCE_MATERIAL_AUTHOR__AUTHOR_TYPE, newAuthorType, newAuthorType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getAuthorDescription() {
		return authorDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthorDescription(org.hl7.fhir.String newAuthorDescription, NotificationChain msgs) {
		org.hl7.fhir.String oldAuthorDescription = authorDescription;
		authorDescription = newAuthorDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SOURCE_MATERIAL_AUTHOR__AUTHOR_DESCRIPTION, oldAuthorDescription, newAuthorDescription);
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
	public void setAuthorDescription(org.hl7.fhir.String newAuthorDescription) {
		if (newAuthorDescription != authorDescription) {
			NotificationChain msgs = null;
			if (authorDescription != null)
				msgs = ((InternalEObject)authorDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SOURCE_MATERIAL_AUTHOR__AUTHOR_DESCRIPTION, null, msgs);
			if (newAuthorDescription != null)
				msgs = ((InternalEObject)newAuthorDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SOURCE_MATERIAL_AUTHOR__AUTHOR_DESCRIPTION, null, msgs);
			msgs = basicSetAuthorDescription(newAuthorDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SOURCE_MATERIAL_AUTHOR__AUTHOR_DESCRIPTION, newAuthorDescription, newAuthorDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_AUTHOR__AUTHOR_TYPE:
				return basicSetAuthorType(null, msgs);
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_AUTHOR__AUTHOR_DESCRIPTION:
				return basicSetAuthorDescription(null, msgs);
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
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_AUTHOR__AUTHOR_TYPE:
				return getAuthorType();
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_AUTHOR__AUTHOR_DESCRIPTION:
				return getAuthorDescription();
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
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_AUTHOR__AUTHOR_TYPE:
				setAuthorType((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_AUTHOR__AUTHOR_DESCRIPTION:
				setAuthorDescription((org.hl7.fhir.String)newValue);
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
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_AUTHOR__AUTHOR_TYPE:
				setAuthorType((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_AUTHOR__AUTHOR_DESCRIPTION:
				setAuthorDescription((org.hl7.fhir.String)null);
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
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_AUTHOR__AUTHOR_TYPE:
				return authorType != null;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_AUTHOR__AUTHOR_DESCRIPTION:
				return authorDescription != null;
		}
		return super.eIsSet(featureID);
	}

} //SubstanceSourceMaterialAuthorImpl
