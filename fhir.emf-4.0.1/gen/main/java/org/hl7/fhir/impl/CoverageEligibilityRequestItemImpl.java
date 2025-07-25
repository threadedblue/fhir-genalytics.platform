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
import org.hl7.fhir.CoverageEligibilityRequestDiagnosis;
import org.hl7.fhir.CoverageEligibilityRequestItem;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Money;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coverage Eligibility Request Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityRequestItemImpl#getSupportingInfoSequence <em>Supporting Info Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityRequestItemImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityRequestItemImpl#getProductOrService <em>Product Or Service</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityRequestItemImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityRequestItemImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityRequestItemImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityRequestItemImpl#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityRequestItemImpl#getFacility <em>Facility</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityRequestItemImpl#getDiagnosis <em>Diagnosis</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityRequestItemImpl#getDetail <em>Detail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoverageEligibilityRequestItemImpl extends BackboneElementImpl implements CoverageEligibilityRequestItem {
	/**
	 * The cached value of the '{@link #getSupportingInfoSequence() <em>Supporting Info Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingInfoSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<PositiveInt> supportingInfoSequence;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept category;

	/**
	 * The cached value of the '{@link #getProductOrService() <em>Product Or Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductOrService()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept productOrService;

	/**
	 * The cached value of the '{@link #getModifier() <em>Modifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> modifier;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected Reference provider;

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
	 * The cached value of the '{@link #getUnitPrice() <em>Unit Price</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitPrice()
	 * @generated
	 * @ordered
	 */
	protected Money unitPrice;

	/**
	 * The cached value of the '{@link #getFacility() <em>Facility</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacility()
	 * @generated
	 * @ordered
	 */
	protected Reference facility;

	/**
	 * The cached value of the '{@link #getDiagnosis() <em>Diagnosis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosis()
	 * @generated
	 * @ordered
	 */
	protected EList<CoverageEligibilityRequestDiagnosis> diagnosis;

	/**
	 * The cached value of the '{@link #getDetail() <em>Detail</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetail()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> detail;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoverageEligibilityRequestItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCoverageEligibilityRequestItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PositiveInt> getSupportingInfoSequence() {
		if (supportingInfoSequence == null) {
			supportingInfoSequence = new EObjectContainmentEList<PositiveInt>(PositiveInt.class, this, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__SUPPORTING_INFO_SEQUENCE);
		}
		return supportingInfoSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(CodeableConcept newCategory, NotificationChain msgs) {
		CodeableConcept oldCategory = category;
		category = newCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__CATEGORY, oldCategory, newCategory);
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
	public void setCategory(CodeableConcept newCategory) {
		if (newCategory != category) {
			NotificationChain msgs = null;
			if (category != null)
				msgs = ((InternalEObject)category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__CATEGORY, newCategory, newCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getProductOrService() {
		return productOrService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductOrService(CodeableConcept newProductOrService, NotificationChain msgs) {
		CodeableConcept oldProductOrService = productOrService;
		productOrService = newProductOrService;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__PRODUCT_OR_SERVICE, oldProductOrService, newProductOrService);
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
	public void setProductOrService(CodeableConcept newProductOrService) {
		if (newProductOrService != productOrService) {
			NotificationChain msgs = null;
			if (productOrService != null)
				msgs = ((InternalEObject)productOrService).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__PRODUCT_OR_SERVICE, null, msgs);
			if (newProductOrService != null)
				msgs = ((InternalEObject)newProductOrService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__PRODUCT_OR_SERVICE, null, msgs);
			msgs = basicSetProductOrService(newProductOrService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__PRODUCT_OR_SERVICE, newProductOrService, newProductOrService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getModifier() {
		if (modifier == null) {
			modifier = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__MODIFIER);
		}
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvider(Reference newProvider, NotificationChain msgs) {
		Reference oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__PROVIDER, oldProvider, newProvider);
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
	public void setProvider(Reference newProvider) {
		if (newProvider != provider) {
			NotificationChain msgs = null;
			if (provider != null)
				msgs = ((InternalEObject)provider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__PROVIDER, null, msgs);
			if (newProvider != null)
				msgs = ((InternalEObject)newProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__PROVIDER, null, msgs);
			msgs = basicSetProvider(newProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__PROVIDER, newProvider, newProvider));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__QUANTITY, oldQuantity, newQuantity);
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
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Money getUnitPrice() {
		return unitPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnitPrice(Money newUnitPrice, NotificationChain msgs) {
		Money oldUnitPrice = unitPrice;
		unitPrice = newUnitPrice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__UNIT_PRICE, oldUnitPrice, newUnitPrice);
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
	public void setUnitPrice(Money newUnitPrice) {
		if (newUnitPrice != unitPrice) {
			NotificationChain msgs = null;
			if (unitPrice != null)
				msgs = ((InternalEObject)unitPrice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__UNIT_PRICE, null, msgs);
			if (newUnitPrice != null)
				msgs = ((InternalEObject)newUnitPrice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__UNIT_PRICE, null, msgs);
			msgs = basicSetUnitPrice(newUnitPrice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__UNIT_PRICE, newUnitPrice, newUnitPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getFacility() {
		return facility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFacility(Reference newFacility, NotificationChain msgs) {
		Reference oldFacility = facility;
		facility = newFacility;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__FACILITY, oldFacility, newFacility);
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
	public void setFacility(Reference newFacility) {
		if (newFacility != facility) {
			NotificationChain msgs = null;
			if (facility != null)
				msgs = ((InternalEObject)facility).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__FACILITY, null, msgs);
			if (newFacility != null)
				msgs = ((InternalEObject)newFacility).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__FACILITY, null, msgs);
			msgs = basicSetFacility(newFacility, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__FACILITY, newFacility, newFacility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CoverageEligibilityRequestDiagnosis> getDiagnosis() {
		if (diagnosis == null) {
			diagnosis = new EObjectContainmentEList<CoverageEligibilityRequestDiagnosis>(CoverageEligibilityRequestDiagnosis.class, this, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__DIAGNOSIS);
		}
		return diagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getDetail() {
		if (detail == null) {
			detail = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__DETAIL);
		}
		return detail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__SUPPORTING_INFO_SEQUENCE:
				return ((InternalEList<?>)getSupportingInfoSequence()).basicRemove(otherEnd, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__CATEGORY:
				return basicSetCategory(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__PRODUCT_OR_SERVICE:
				return basicSetProductOrService(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__MODIFIER:
				return ((InternalEList<?>)getModifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__PROVIDER:
				return basicSetProvider(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__QUANTITY:
				return basicSetQuantity(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__UNIT_PRICE:
				return basicSetUnitPrice(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__FACILITY:
				return basicSetFacility(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__DIAGNOSIS:
				return ((InternalEList<?>)getDiagnosis()).basicRemove(otherEnd, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__DETAIL:
				return ((InternalEList<?>)getDetail()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__SUPPORTING_INFO_SEQUENCE:
				return getSupportingInfoSequence();
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__CATEGORY:
				return getCategory();
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__PRODUCT_OR_SERVICE:
				return getProductOrService();
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__MODIFIER:
				return getModifier();
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__PROVIDER:
				return getProvider();
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__QUANTITY:
				return getQuantity();
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__UNIT_PRICE:
				return getUnitPrice();
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__FACILITY:
				return getFacility();
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__DIAGNOSIS:
				return getDiagnosis();
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__DETAIL:
				return getDetail();
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
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__SUPPORTING_INFO_SEQUENCE:
				getSupportingInfoSequence().clear();
				getSupportingInfoSequence().addAll((Collection<? extends PositiveInt>)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__PRODUCT_OR_SERVICE:
				setProductOrService((CodeableConcept)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__MODIFIER:
				getModifier().clear();
				getModifier().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__PROVIDER:
				setProvider((Reference)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__UNIT_PRICE:
				setUnitPrice((Money)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__FACILITY:
				setFacility((Reference)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__DIAGNOSIS:
				getDiagnosis().clear();
				getDiagnosis().addAll((Collection<? extends CoverageEligibilityRequestDiagnosis>)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__DETAIL:
				getDetail().clear();
				getDetail().addAll((Collection<? extends Reference>)newValue);
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
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__SUPPORTING_INFO_SEQUENCE:
				getSupportingInfoSequence().clear();
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__PRODUCT_OR_SERVICE:
				setProductOrService((CodeableConcept)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__MODIFIER:
				getModifier().clear();
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__PROVIDER:
				setProvider((Reference)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__UNIT_PRICE:
				setUnitPrice((Money)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__FACILITY:
				setFacility((Reference)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__DIAGNOSIS:
				getDiagnosis().clear();
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__DETAIL:
				getDetail().clear();
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
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__SUPPORTING_INFO_SEQUENCE:
				return supportingInfoSequence != null && !supportingInfoSequence.isEmpty();
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__CATEGORY:
				return category != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__PRODUCT_OR_SERVICE:
				return productOrService != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__MODIFIER:
				return modifier != null && !modifier.isEmpty();
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__PROVIDER:
				return provider != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__QUANTITY:
				return quantity != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__UNIT_PRICE:
				return unitPrice != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__FACILITY:
				return facility != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__DIAGNOSIS:
				return diagnosis != null && !diagnosis.isEmpty();
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM__DETAIL:
				return detail != null && !detail.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CoverageEligibilityRequestItemImpl
