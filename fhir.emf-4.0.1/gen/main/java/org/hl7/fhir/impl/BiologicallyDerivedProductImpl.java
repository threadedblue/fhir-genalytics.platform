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

import org.hl7.fhir.BiologicallyDerivedProduct;
import org.hl7.fhir.BiologicallyDerivedProductCategory;
import org.hl7.fhir.BiologicallyDerivedProductCollection;
import org.hl7.fhir.BiologicallyDerivedProductManipulation;
import org.hl7.fhir.BiologicallyDerivedProductProcessing;
import org.hl7.fhir.BiologicallyDerivedProductStatus;
import org.hl7.fhir.BiologicallyDerivedProductStorage;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Biologically Derived Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.BiologicallyDerivedProductImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.BiologicallyDerivedProductImpl#getProductCategory <em>Product Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.BiologicallyDerivedProductImpl#getProductCode <em>Product Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.BiologicallyDerivedProductImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.BiologicallyDerivedProductImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.BiologicallyDerivedProductImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.BiologicallyDerivedProductImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.BiologicallyDerivedProductImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.BiologicallyDerivedProductImpl#getProcessing <em>Processing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.BiologicallyDerivedProductImpl#getManipulation <em>Manipulation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.BiologicallyDerivedProductImpl#getStorage <em>Storage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BiologicallyDerivedProductImpl extends DomainResourceImpl implements BiologicallyDerivedProduct {
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
	 * The cached value of the '{@link #getProductCategory() <em>Product Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCategory()
	 * @generated
	 * @ordered
	 */
	protected BiologicallyDerivedProductCategory productCategory;

	/**
	 * The cached value of the '{@link #getProductCode() <em>Product Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept productCode;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected BiologicallyDerivedProductStatus status;

	/**
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> request;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer quantity;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> parent;

	/**
	 * The cached value of the '{@link #getCollection() <em>Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollection()
	 * @generated
	 * @ordered
	 */
	protected BiologicallyDerivedProductCollection collection;

	/**
	 * The cached value of the '{@link #getProcessing() <em>Processing</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessing()
	 * @generated
	 * @ordered
	 */
	protected EList<BiologicallyDerivedProductProcessing> processing;

	/**
	 * The cached value of the '{@link #getManipulation() <em>Manipulation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManipulation()
	 * @generated
	 * @ordered
	 */
	protected BiologicallyDerivedProductManipulation manipulation;

	/**
	 * The cached value of the '{@link #getStorage() <em>Storage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorage()
	 * @generated
	 * @ordered
	 */
	protected EList<BiologicallyDerivedProductStorage> storage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BiologicallyDerivedProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getBiologicallyDerivedProduct();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BiologicallyDerivedProductCategory getProductCategory() {
		return productCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductCategory(BiologicallyDerivedProductCategory newProductCategory, NotificationChain msgs) {
		BiologicallyDerivedProductCategory oldProductCategory = productCategory;
		productCategory = newProductCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CATEGORY, oldProductCategory, newProductCategory);
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
	public void setProductCategory(BiologicallyDerivedProductCategory newProductCategory) {
		if (newProductCategory != productCategory) {
			NotificationChain msgs = null;
			if (productCategory != null)
				msgs = ((InternalEObject)productCategory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CATEGORY, null, msgs);
			if (newProductCategory != null)
				msgs = ((InternalEObject)newProductCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CATEGORY, null, msgs);
			msgs = basicSetProductCategory(newProductCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CATEGORY, newProductCategory, newProductCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getProductCode() {
		return productCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductCode(CodeableConcept newProductCode, NotificationChain msgs) {
		CodeableConcept oldProductCode = productCode;
		productCode = newProductCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CODE, oldProductCode, newProductCode);
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
	public void setProductCode(CodeableConcept newProductCode) {
		if (newProductCode != productCode) {
			NotificationChain msgs = null;
			if (productCode != null)
				msgs = ((InternalEObject)productCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CODE, null, msgs);
			if (newProductCode != null)
				msgs = ((InternalEObject)newProductCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CODE, null, msgs);
			msgs = basicSetProductCode(newProductCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CODE, newProductCode, newProductCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BiologicallyDerivedProductStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(BiologicallyDerivedProductStatus newStatus, NotificationChain msgs) {
		BiologicallyDerivedProductStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__STATUS, oldStatus, newStatus);
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
	public void setStatus(BiologicallyDerivedProductStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getRequest() {
		if (request == null) {
			request = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__REQUEST);
		}
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Integer getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(org.hl7.fhir.Integer newQuantity, NotificationChain msgs) {
		org.hl7.fhir.Integer oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__QUANTITY, oldQuantity, newQuantity);
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
	public void setQuantity(org.hl7.fhir.Integer newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getParent() {
		if (parent == null) {
			parent = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PARENT);
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BiologicallyDerivedProductCollection getCollection() {
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollection(BiologicallyDerivedProductCollection newCollection, NotificationChain msgs) {
		BiologicallyDerivedProductCollection oldCollection = collection;
		collection = newCollection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__COLLECTION, oldCollection, newCollection);
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
	public void setCollection(BiologicallyDerivedProductCollection newCollection) {
		if (newCollection != collection) {
			NotificationChain msgs = null;
			if (collection != null)
				msgs = ((InternalEObject)collection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__COLLECTION, null, msgs);
			if (newCollection != null)
				msgs = ((InternalEObject)newCollection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__COLLECTION, null, msgs);
			msgs = basicSetCollection(newCollection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__COLLECTION, newCollection, newCollection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BiologicallyDerivedProductProcessing> getProcessing() {
		if (processing == null) {
			processing = new EObjectContainmentEList<BiologicallyDerivedProductProcessing>(BiologicallyDerivedProductProcessing.class, this, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PROCESSING);
		}
		return processing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BiologicallyDerivedProductManipulation getManipulation() {
		return manipulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManipulation(BiologicallyDerivedProductManipulation newManipulation, NotificationChain msgs) {
		BiologicallyDerivedProductManipulation oldManipulation = manipulation;
		manipulation = newManipulation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__MANIPULATION, oldManipulation, newManipulation);
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
	public void setManipulation(BiologicallyDerivedProductManipulation newManipulation) {
		if (newManipulation != manipulation) {
			NotificationChain msgs = null;
			if (manipulation != null)
				msgs = ((InternalEObject)manipulation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__MANIPULATION, null, msgs);
			if (newManipulation != null)
				msgs = ((InternalEObject)newManipulation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__MANIPULATION, null, msgs);
			msgs = basicSetManipulation(newManipulation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__MANIPULATION, newManipulation, newManipulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BiologicallyDerivedProductStorage> getStorage() {
		if (storage == null) {
			storage = new EObjectContainmentEList<BiologicallyDerivedProductStorage>(BiologicallyDerivedProductStorage.class, this, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__STORAGE);
		}
		return storage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CATEGORY:
				return basicSetProductCategory(null, msgs);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CODE:
				return basicSetProductCode(null, msgs);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__REQUEST:
				return ((InternalEList<?>)getRequest()).basicRemove(otherEnd, msgs);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__QUANTITY:
				return basicSetQuantity(null, msgs);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PARENT:
				return ((InternalEList<?>)getParent()).basicRemove(otherEnd, msgs);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__COLLECTION:
				return basicSetCollection(null, msgs);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PROCESSING:
				return ((InternalEList<?>)getProcessing()).basicRemove(otherEnd, msgs);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__MANIPULATION:
				return basicSetManipulation(null, msgs);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__STORAGE:
				return ((InternalEList<?>)getStorage()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CATEGORY:
				return getProductCategory();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CODE:
				return getProductCode();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__STATUS:
				return getStatus();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__REQUEST:
				return getRequest();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__QUANTITY:
				return getQuantity();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PARENT:
				return getParent();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__COLLECTION:
				return getCollection();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PROCESSING:
				return getProcessing();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__MANIPULATION:
				return getManipulation();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__STORAGE:
				return getStorage();
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
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CATEGORY:
				setProductCategory((BiologicallyDerivedProductCategory)newValue);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CODE:
				setProductCode((CodeableConcept)newValue);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__STATUS:
				setStatus((BiologicallyDerivedProductStatus)newValue);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__REQUEST:
				getRequest().clear();
				getRequest().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__QUANTITY:
				setQuantity((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PARENT:
				getParent().clear();
				getParent().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__COLLECTION:
				setCollection((BiologicallyDerivedProductCollection)newValue);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PROCESSING:
				getProcessing().clear();
				getProcessing().addAll((Collection<? extends BiologicallyDerivedProductProcessing>)newValue);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__MANIPULATION:
				setManipulation((BiologicallyDerivedProductManipulation)newValue);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__STORAGE:
				getStorage().clear();
				getStorage().addAll((Collection<? extends BiologicallyDerivedProductStorage>)newValue);
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
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CATEGORY:
				setProductCategory((BiologicallyDerivedProductCategory)null);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CODE:
				setProductCode((CodeableConcept)null);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__STATUS:
				setStatus((BiologicallyDerivedProductStatus)null);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__REQUEST:
				getRequest().clear();
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__QUANTITY:
				setQuantity((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PARENT:
				getParent().clear();
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__COLLECTION:
				setCollection((BiologicallyDerivedProductCollection)null);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PROCESSING:
				getProcessing().clear();
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__MANIPULATION:
				setManipulation((BiologicallyDerivedProductManipulation)null);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__STORAGE:
				getStorage().clear();
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
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CATEGORY:
				return productCategory != null;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CODE:
				return productCode != null;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__STATUS:
				return status != null;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__REQUEST:
				return request != null && !request.isEmpty();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__QUANTITY:
				return quantity != null;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PARENT:
				return parent != null && !parent.isEmpty();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__COLLECTION:
				return collection != null;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__PROCESSING:
				return processing != null && !processing.isEmpty();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__MANIPULATION:
				return manipulation != null;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT__STORAGE:
				return storage != null && !storage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BiologicallyDerivedProductImpl
