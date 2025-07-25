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
import org.hl7.fhir.MedicinalProductPackagedPackageItem;
import org.hl7.fhir.ProdCharacteristic;
import org.hl7.fhir.ProductShelfLife;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicinal Product Packaged Package Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductPackagedPackageItemImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductPackagedPackageItemImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductPackagedPackageItemImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductPackagedPackageItemImpl#getMaterial <em>Material</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductPackagedPackageItemImpl#getAlternateMaterial <em>Alternate Material</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductPackagedPackageItemImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductPackagedPackageItemImpl#getManufacturedItem <em>Manufactured Item</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductPackagedPackageItemImpl#getPackageItem <em>Package Item</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductPackagedPackageItemImpl#getPhysicalCharacteristics <em>Physical Characteristics</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductPackagedPackageItemImpl#getOtherCharacteristics <em>Other Characteristics</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductPackagedPackageItemImpl#getShelfLifeStorage <em>Shelf Life Storage</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductPackagedPackageItemImpl#getManufacturer <em>Manufacturer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductPackagedPackageItemImpl extends BackboneElementImpl implements MedicinalProductPackagedPackageItem {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

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
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity quantity;

	/**
	 * The cached value of the '{@link #getMaterial() <em>Material</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterial()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> material;

	/**
	 * The cached value of the '{@link #getAlternateMaterial() <em>Alternate Material</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternateMaterial()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> alternateMaterial;

	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> device;

	/**
	 * The cached value of the '{@link #getManufacturedItem() <em>Manufactured Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturedItem()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> manufacturedItem;

	/**
	 * The cached value of the '{@link #getPackageItem() <em>Package Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageItem()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductPackagedPackageItem> packageItem;

	/**
	 * The cached value of the '{@link #getPhysicalCharacteristics() <em>Physical Characteristics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected ProdCharacteristic physicalCharacteristics;

	/**
	 * The cached value of the '{@link #getOtherCharacteristics() <em>Other Characteristics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> otherCharacteristics;

	/**
	 * The cached value of the '{@link #getShelfLifeStorage() <em>Shelf Life Storage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShelfLifeStorage()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductShelfLife> shelfLifeStorage;

	/**
	 * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> manufacturer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductPackagedPackageItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicinalProductPackagedPackageItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__IDENTIFIER);
		}
		return identifier;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(Quantity newQuantity, NotificationChain msgs) {
		Quantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__QUANTITY, oldQuantity, newQuantity);
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
	public void setQuantity(Quantity newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getMaterial() {
		if (material == null) {
			material = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__MATERIAL);
		}
		return material;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getAlternateMaterial() {
		if (alternateMaterial == null) {
			alternateMaterial = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__ALTERNATE_MATERIAL);
		}
		return alternateMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getDevice() {
		if (device == null) {
			device = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__DEVICE);
		}
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getManufacturedItem() {
		if (manufacturedItem == null) {
			manufacturedItem = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__MANUFACTURED_ITEM);
		}
		return manufacturedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicinalProductPackagedPackageItem> getPackageItem() {
		if (packageItem == null) {
			packageItem = new EObjectContainmentEList<MedicinalProductPackagedPackageItem>(MedicinalProductPackagedPackageItem.class, this, FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__PACKAGE_ITEM);
		}
		return packageItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProdCharacteristic getPhysicalCharacteristics() {
		return physicalCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhysicalCharacteristics(ProdCharacteristic newPhysicalCharacteristics, NotificationChain msgs) {
		ProdCharacteristic oldPhysicalCharacteristics = physicalCharacteristics;
		physicalCharacteristics = newPhysicalCharacteristics;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__PHYSICAL_CHARACTERISTICS, oldPhysicalCharacteristics, newPhysicalCharacteristics);
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
	public void setPhysicalCharacteristics(ProdCharacteristic newPhysicalCharacteristics) {
		if (newPhysicalCharacteristics != physicalCharacteristics) {
			NotificationChain msgs = null;
			if (physicalCharacteristics != null)
				msgs = ((InternalEObject)physicalCharacteristics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__PHYSICAL_CHARACTERISTICS, null, msgs);
			if (newPhysicalCharacteristics != null)
				msgs = ((InternalEObject)newPhysicalCharacteristics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__PHYSICAL_CHARACTERISTICS, null, msgs);
			msgs = basicSetPhysicalCharacteristics(newPhysicalCharacteristics, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__PHYSICAL_CHARACTERISTICS, newPhysicalCharacteristics, newPhysicalCharacteristics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getOtherCharacteristics() {
		if (otherCharacteristics == null) {
			otherCharacteristics = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__OTHER_CHARACTERISTICS);
		}
		return otherCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProductShelfLife> getShelfLifeStorage() {
		if (shelfLifeStorage == null) {
			shelfLifeStorage = new EObjectContainmentEList<ProductShelfLife>(ProductShelfLife.class, this, FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__SHELF_LIFE_STORAGE);
		}
		return shelfLifeStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getManufacturer() {
		if (manufacturer == null) {
			manufacturer = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__MANUFACTURER);
		}
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__QUANTITY:
				return basicSetQuantity(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__MATERIAL:
				return ((InternalEList<?>)getMaterial()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__ALTERNATE_MATERIAL:
				return ((InternalEList<?>)getAlternateMaterial()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__DEVICE:
				return ((InternalEList<?>)getDevice()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__MANUFACTURED_ITEM:
				return ((InternalEList<?>)getManufacturedItem()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__PACKAGE_ITEM:
				return ((InternalEList<?>)getPackageItem()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__PHYSICAL_CHARACTERISTICS:
				return basicSetPhysicalCharacteristics(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__OTHER_CHARACTERISTICS:
				return ((InternalEList<?>)getOtherCharacteristics()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__SHELF_LIFE_STORAGE:
				return ((InternalEList<?>)getShelfLifeStorage()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__MANUFACTURER:
				return ((InternalEList<?>)getManufacturer()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__TYPE:
				return getType();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__QUANTITY:
				return getQuantity();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__MATERIAL:
				return getMaterial();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__ALTERNATE_MATERIAL:
				return getAlternateMaterial();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__DEVICE:
				return getDevice();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__MANUFACTURED_ITEM:
				return getManufacturedItem();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__PACKAGE_ITEM:
				return getPackageItem();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__PHYSICAL_CHARACTERISTICS:
				return getPhysicalCharacteristics();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__OTHER_CHARACTERISTICS:
				return getOtherCharacteristics();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__SHELF_LIFE_STORAGE:
				return getShelfLifeStorage();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__MANUFACTURER:
				return getManufacturer();
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
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__MATERIAL:
				getMaterial().clear();
				getMaterial().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__ALTERNATE_MATERIAL:
				getAlternateMaterial().clear();
				getAlternateMaterial().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__DEVICE:
				getDevice().clear();
				getDevice().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__MANUFACTURED_ITEM:
				getManufacturedItem().clear();
				getManufacturedItem().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__PACKAGE_ITEM:
				getPackageItem().clear();
				getPackageItem().addAll((Collection<? extends MedicinalProductPackagedPackageItem>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__PHYSICAL_CHARACTERISTICS:
				setPhysicalCharacteristics((ProdCharacteristic)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__OTHER_CHARACTERISTICS:
				getOtherCharacteristics().clear();
				getOtherCharacteristics().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__SHELF_LIFE_STORAGE:
				getShelfLifeStorage().clear();
				getShelfLifeStorage().addAll((Collection<? extends ProductShelfLife>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__MANUFACTURER:
				getManufacturer().clear();
				getManufacturer().addAll((Collection<? extends Reference>)newValue);
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
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__MATERIAL:
				getMaterial().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__ALTERNATE_MATERIAL:
				getAlternateMaterial().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__DEVICE:
				getDevice().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__MANUFACTURED_ITEM:
				getManufacturedItem().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__PACKAGE_ITEM:
				getPackageItem().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__PHYSICAL_CHARACTERISTICS:
				setPhysicalCharacteristics((ProdCharacteristic)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__OTHER_CHARACTERISTICS:
				getOtherCharacteristics().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__SHELF_LIFE_STORAGE:
				getShelfLifeStorage().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__MANUFACTURER:
				getManufacturer().clear();
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
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__TYPE:
				return type != null;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__QUANTITY:
				return quantity != null;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__MATERIAL:
				return material != null && !material.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__ALTERNATE_MATERIAL:
				return alternateMaterial != null && !alternateMaterial.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__DEVICE:
				return device != null && !device.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__MANUFACTURED_ITEM:
				return manufacturedItem != null && !manufacturedItem.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__PACKAGE_ITEM:
				return packageItem != null && !packageItem.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__PHYSICAL_CHARACTERISTICS:
				return physicalCharacteristics != null;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__OTHER_CHARACTERISTICS:
				return otherCharacteristics != null && !otherCharacteristics.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__SHELF_LIFE_STORAGE:
				return shelfLifeStorage != null && !shelfLifeStorage.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__MANUFACTURER:
				return manufacturer != null && !manufacturer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductPackagedPackageItemImpl
