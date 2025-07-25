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
import org.hl7.fhir.CoverageEligibilityResponseBenefit;
import org.hl7.fhir.CoverageEligibilityResponseItem;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coverage Eligibility Response Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityResponseItemImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityResponseItemImpl#getProductOrService <em>Product Or Service</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityResponseItemImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityResponseItemImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityResponseItemImpl#getExcluded <em>Excluded</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityResponseItemImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityResponseItemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityResponseItemImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityResponseItemImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityResponseItemImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityResponseItemImpl#getBenefit <em>Benefit</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityResponseItemImpl#getAuthorizationRequired <em>Authorization Required</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityResponseItemImpl#getAuthorizationSupporting <em>Authorization Supporting</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityResponseItemImpl#getAuthorizationUrl <em>Authorization Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoverageEligibilityResponseItemImpl extends BackboneElementImpl implements CoverageEligibilityResponseItem {
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
	 * The cached value of the '{@link #getExcluded() <em>Excluded</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcluded()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean excluded;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String name;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String description;

	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept network;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept unit;

	/**
	 * The cached value of the '{@link #getTerm() <em>Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept term;

	/**
	 * The cached value of the '{@link #getBenefit() <em>Benefit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefit()
	 * @generated
	 * @ordered
	 */
	protected EList<CoverageEligibilityResponseBenefit> benefit;

	/**
	 * The cached value of the '{@link #getAuthorizationRequired() <em>Authorization Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizationRequired()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean authorizationRequired;

	/**
	 * The cached value of the '{@link #getAuthorizationSupporting() <em>Authorization Supporting</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizationSupporting()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> authorizationSupporting;

	/**
	 * The cached value of the '{@link #getAuthorizationUrl() <em>Authorization Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizationUrl()
	 * @generated
	 * @ordered
	 */
	protected Uri authorizationUrl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoverageEligibilityResponseItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCoverageEligibilityResponseItem();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__CATEGORY, oldCategory, newCategory);
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
				msgs = ((InternalEObject)category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__CATEGORY, newCategory, newCategory));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__PRODUCT_OR_SERVICE, oldProductOrService, newProductOrService);
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
				msgs = ((InternalEObject)productOrService).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__PRODUCT_OR_SERVICE, null, msgs);
			if (newProductOrService != null)
				msgs = ((InternalEObject)newProductOrService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__PRODUCT_OR_SERVICE, null, msgs);
			msgs = basicSetProductOrService(newProductOrService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__PRODUCT_OR_SERVICE, newProductOrService, newProductOrService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getModifier() {
		if (modifier == null) {
			modifier = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__MODIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__PROVIDER, oldProvider, newProvider);
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
				msgs = ((InternalEObject)provider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__PROVIDER, null, msgs);
			if (newProvider != null)
				msgs = ((InternalEObject)newProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__PROVIDER, null, msgs);
			msgs = basicSetProvider(newProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__PROVIDER, newProvider, newProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getExcluded() {
		return excluded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExcluded(org.hl7.fhir.Boolean newExcluded, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldExcluded = excluded;
		excluded = newExcluded;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__EXCLUDED, oldExcluded, newExcluded);
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
	public void setExcluded(org.hl7.fhir.Boolean newExcluded) {
		if (newExcluded != excluded) {
			NotificationChain msgs = null;
			if (excluded != null)
				msgs = ((InternalEObject)excluded).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__EXCLUDED, null, msgs);
			if (newExcluded != null)
				msgs = ((InternalEObject)newExcluded).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__EXCLUDED, null, msgs);
			msgs = basicSetExcluded(newExcluded, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__EXCLUDED, newExcluded, newExcluded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.hl7.fhir.String newName, NotificationChain msgs) {
		org.hl7.fhir.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__NAME, oldName, newName);
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
	public void setName(org.hl7.fhir.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.hl7.fhir.String newDescription, NotificationChain msgs) {
		org.hl7.fhir.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(org.hl7.fhir.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getNetwork() {
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetwork(CodeableConcept newNetwork, NotificationChain msgs) {
		CodeableConcept oldNetwork = network;
		network = newNetwork;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__NETWORK, oldNetwork, newNetwork);
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
	public void setNetwork(CodeableConcept newNetwork) {
		if (newNetwork != network) {
			NotificationChain msgs = null;
			if (network != null)
				msgs = ((InternalEObject)network).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__NETWORK, null, msgs);
			if (newNetwork != null)
				msgs = ((InternalEObject)newNetwork).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__NETWORK, null, msgs);
			msgs = basicSetNetwork(newNetwork, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__NETWORK, newNetwork, newNetwork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnit(CodeableConcept newUnit, NotificationChain msgs) {
		CodeableConcept oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__UNIT, oldUnit, newUnit);
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
	public void setUnit(CodeableConcept newUnit) {
		if (newUnit != unit) {
			NotificationChain msgs = null;
			if (unit != null)
				msgs = ((InternalEObject)unit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__UNIT, null, msgs);
			if (newUnit != null)
				msgs = ((InternalEObject)newUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__UNIT, null, msgs);
			msgs = basicSetUnit(newUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__UNIT, newUnit, newUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getTerm() {
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerm(CodeableConcept newTerm, NotificationChain msgs) {
		CodeableConcept oldTerm = term;
		term = newTerm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__TERM, oldTerm, newTerm);
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
	public void setTerm(CodeableConcept newTerm) {
		if (newTerm != term) {
			NotificationChain msgs = null;
			if (term != null)
				msgs = ((InternalEObject)term).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__TERM, null, msgs);
			if (newTerm != null)
				msgs = ((InternalEObject)newTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__TERM, null, msgs);
			msgs = basicSetTerm(newTerm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__TERM, newTerm, newTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CoverageEligibilityResponseBenefit> getBenefit() {
		if (benefit == null) {
			benefit = new EObjectContainmentEList<CoverageEligibilityResponseBenefit>(CoverageEligibilityResponseBenefit.class, this, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__BENEFIT);
		}
		return benefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getAuthorizationRequired() {
		return authorizationRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthorizationRequired(org.hl7.fhir.Boolean newAuthorizationRequired, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldAuthorizationRequired = authorizationRequired;
		authorizationRequired = newAuthorizationRequired;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__AUTHORIZATION_REQUIRED, oldAuthorizationRequired, newAuthorizationRequired);
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
	public void setAuthorizationRequired(org.hl7.fhir.Boolean newAuthorizationRequired) {
		if (newAuthorizationRequired != authorizationRequired) {
			NotificationChain msgs = null;
			if (authorizationRequired != null)
				msgs = ((InternalEObject)authorizationRequired).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__AUTHORIZATION_REQUIRED, null, msgs);
			if (newAuthorizationRequired != null)
				msgs = ((InternalEObject)newAuthorizationRequired).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__AUTHORIZATION_REQUIRED, null, msgs);
			msgs = basicSetAuthorizationRequired(newAuthorizationRequired, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__AUTHORIZATION_REQUIRED, newAuthorizationRequired, newAuthorizationRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getAuthorizationSupporting() {
		if (authorizationSupporting == null) {
			authorizationSupporting = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__AUTHORIZATION_SUPPORTING);
		}
		return authorizationSupporting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getAuthorizationUrl() {
		return authorizationUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthorizationUrl(Uri newAuthorizationUrl, NotificationChain msgs) {
		Uri oldAuthorizationUrl = authorizationUrl;
		authorizationUrl = newAuthorizationUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__AUTHORIZATION_URL, oldAuthorizationUrl, newAuthorizationUrl);
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
	public void setAuthorizationUrl(Uri newAuthorizationUrl) {
		if (newAuthorizationUrl != authorizationUrl) {
			NotificationChain msgs = null;
			if (authorizationUrl != null)
				msgs = ((InternalEObject)authorizationUrl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__AUTHORIZATION_URL, null, msgs);
			if (newAuthorizationUrl != null)
				msgs = ((InternalEObject)newAuthorizationUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__AUTHORIZATION_URL, null, msgs);
			msgs = basicSetAuthorizationUrl(newAuthorizationUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__AUTHORIZATION_URL, newAuthorizationUrl, newAuthorizationUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__CATEGORY:
				return basicSetCategory(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__PRODUCT_OR_SERVICE:
				return basicSetProductOrService(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__MODIFIER:
				return ((InternalEList<?>)getModifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__PROVIDER:
				return basicSetProvider(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__EXCLUDED:
				return basicSetExcluded(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__NETWORK:
				return basicSetNetwork(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__UNIT:
				return basicSetUnit(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__TERM:
				return basicSetTerm(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__BENEFIT:
				return ((InternalEList<?>)getBenefit()).basicRemove(otherEnd, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__AUTHORIZATION_REQUIRED:
				return basicSetAuthorizationRequired(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__AUTHORIZATION_SUPPORTING:
				return ((InternalEList<?>)getAuthorizationSupporting()).basicRemove(otherEnd, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__AUTHORIZATION_URL:
				return basicSetAuthorizationUrl(null, msgs);
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
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__CATEGORY:
				return getCategory();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__PRODUCT_OR_SERVICE:
				return getProductOrService();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__MODIFIER:
				return getModifier();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__PROVIDER:
				return getProvider();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__EXCLUDED:
				return getExcluded();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__NAME:
				return getName();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__DESCRIPTION:
				return getDescription();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__NETWORK:
				return getNetwork();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__UNIT:
				return getUnit();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__TERM:
				return getTerm();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__BENEFIT:
				return getBenefit();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__AUTHORIZATION_REQUIRED:
				return getAuthorizationRequired();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__AUTHORIZATION_SUPPORTING:
				return getAuthorizationSupporting();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__AUTHORIZATION_URL:
				return getAuthorizationUrl();
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
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__PRODUCT_OR_SERVICE:
				setProductOrService((CodeableConcept)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__MODIFIER:
				getModifier().clear();
				getModifier().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__PROVIDER:
				setProvider((Reference)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__EXCLUDED:
				setExcluded((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__NETWORK:
				setNetwork((CodeableConcept)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__UNIT:
				setUnit((CodeableConcept)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__TERM:
				setTerm((CodeableConcept)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__BENEFIT:
				getBenefit().clear();
				getBenefit().addAll((Collection<? extends CoverageEligibilityResponseBenefit>)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__AUTHORIZATION_REQUIRED:
				setAuthorizationRequired((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__AUTHORIZATION_SUPPORTING:
				getAuthorizationSupporting().clear();
				getAuthorizationSupporting().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__AUTHORIZATION_URL:
				setAuthorizationUrl((Uri)newValue);
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
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__PRODUCT_OR_SERVICE:
				setProductOrService((CodeableConcept)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__MODIFIER:
				getModifier().clear();
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__PROVIDER:
				setProvider((Reference)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__EXCLUDED:
				setExcluded((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__NETWORK:
				setNetwork((CodeableConcept)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__UNIT:
				setUnit((CodeableConcept)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__TERM:
				setTerm((CodeableConcept)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__BENEFIT:
				getBenefit().clear();
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__AUTHORIZATION_REQUIRED:
				setAuthorizationRequired((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__AUTHORIZATION_SUPPORTING:
				getAuthorizationSupporting().clear();
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__AUTHORIZATION_URL:
				setAuthorizationUrl((Uri)null);
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
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__CATEGORY:
				return category != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__PRODUCT_OR_SERVICE:
				return productOrService != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__MODIFIER:
				return modifier != null && !modifier.isEmpty();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__PROVIDER:
				return provider != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__EXCLUDED:
				return excluded != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__NAME:
				return name != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__DESCRIPTION:
				return description != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__NETWORK:
				return network != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__UNIT:
				return unit != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__TERM:
				return term != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__BENEFIT:
				return benefit != null && !benefit.isEmpty();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__AUTHORIZATION_REQUIRED:
				return authorizationRequired != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__AUTHORIZATION_SUPPORTING:
				return authorizationSupporting != null && !authorizationSupporting.isEmpty();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM__AUTHORIZATION_URL:
				return authorizationUrl != null;
		}
		return super.eIsSet(featureID);
	}

} //CoverageEligibilityResponseItemImpl
