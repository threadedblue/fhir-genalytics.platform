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
import org.hl7.fhir.Identifier;
import org.hl7.fhir.ProductShelfLife;
import org.hl7.fhir.Quantity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Shelf Life</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ProductShelfLifeImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProductShelfLifeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProductShelfLifeImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProductShelfLifeImpl#getSpecialPrecautionsForStorage <em>Special Precautions For Storage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductShelfLifeImpl extends BackboneElementImpl implements ProductShelfLife {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

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
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Quantity period;

	/**
	 * The cached value of the '{@link #getSpecialPrecautionsForStorage() <em>Special Precautions For Storage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialPrecautionsForStorage()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> specialPrecautionsForStorage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductShelfLifeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getProductShelfLife();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PRODUCT_SHELF_LIFE__IDENTIFIER, oldIdentifier, newIdentifier);
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
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRODUCT_SHELF_LIFE__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRODUCT_SHELF_LIFE__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PRODUCT_SHELF_LIFE__IDENTIFIER, newIdentifier, newIdentifier));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PRODUCT_SHELF_LIFE__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRODUCT_SHELF_LIFE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRODUCT_SHELF_LIFE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PRODUCT_SHELF_LIFE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(Quantity newPeriod, NotificationChain msgs) {
		Quantity oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PRODUCT_SHELF_LIFE__PERIOD, oldPeriod, newPeriod);
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
	public void setPeriod(Quantity newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRODUCT_SHELF_LIFE__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRODUCT_SHELF_LIFE__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PRODUCT_SHELF_LIFE__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getSpecialPrecautionsForStorage() {
		if (specialPrecautionsForStorage == null) {
			specialPrecautionsForStorage = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.PRODUCT_SHELF_LIFE__SPECIAL_PRECAUTIONS_FOR_STORAGE);
		}
		return specialPrecautionsForStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PRODUCT_SHELF_LIFE__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.PRODUCT_SHELF_LIFE__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.PRODUCT_SHELF_LIFE__PERIOD:
				return basicSetPeriod(null, msgs);
			case FhirPackage.PRODUCT_SHELF_LIFE__SPECIAL_PRECAUTIONS_FOR_STORAGE:
				return ((InternalEList<?>)getSpecialPrecautionsForStorage()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.PRODUCT_SHELF_LIFE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.PRODUCT_SHELF_LIFE__TYPE:
				return getType();
			case FhirPackage.PRODUCT_SHELF_LIFE__PERIOD:
				return getPeriod();
			case FhirPackage.PRODUCT_SHELF_LIFE__SPECIAL_PRECAUTIONS_FOR_STORAGE:
				return getSpecialPrecautionsForStorage();
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
			case FhirPackage.PRODUCT_SHELF_LIFE__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.PRODUCT_SHELF_LIFE__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.PRODUCT_SHELF_LIFE__PERIOD:
				setPeriod((Quantity)newValue);
				return;
			case FhirPackage.PRODUCT_SHELF_LIFE__SPECIAL_PRECAUTIONS_FOR_STORAGE:
				getSpecialPrecautionsForStorage().clear();
				getSpecialPrecautionsForStorage().addAll((Collection<? extends CodeableConcept>)newValue);
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
			case FhirPackage.PRODUCT_SHELF_LIFE__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.PRODUCT_SHELF_LIFE__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.PRODUCT_SHELF_LIFE__PERIOD:
				setPeriod((Quantity)null);
				return;
			case FhirPackage.PRODUCT_SHELF_LIFE__SPECIAL_PRECAUTIONS_FOR_STORAGE:
				getSpecialPrecautionsForStorage().clear();
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
			case FhirPackage.PRODUCT_SHELF_LIFE__IDENTIFIER:
				return identifier != null;
			case FhirPackage.PRODUCT_SHELF_LIFE__TYPE:
				return type != null;
			case FhirPackage.PRODUCT_SHELF_LIFE__PERIOD:
				return period != null;
			case FhirPackage.PRODUCT_SHELF_LIFE__SPECIAL_PRECAUTIONS_FOR_STORAGE:
				return specialPrecautionsForStorage != null && !specialPrecautionsForStorage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProductShelfLifeImpl
