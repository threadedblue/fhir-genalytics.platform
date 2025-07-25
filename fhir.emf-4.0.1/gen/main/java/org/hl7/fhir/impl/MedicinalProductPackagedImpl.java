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
import org.hl7.fhir.MarketingStatus;
import org.hl7.fhir.MedicinalProductPackaged;
import org.hl7.fhir.MedicinalProductPackagedBatchIdentifier;
import org.hl7.fhir.MedicinalProductPackagedPackageItem;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicinal Product Packaged</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductPackagedImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductPackagedImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductPackagedImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductPackagedImpl#getLegalStatusOfSupply <em>Legal Status Of Supply</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductPackagedImpl#getMarketingStatus <em>Marketing Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductPackagedImpl#getMarketingAuthorization <em>Marketing Authorization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductPackagedImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductPackagedImpl#getBatchIdentifier <em>Batch Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductPackagedImpl#getPackageItem <em>Package Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductPackagedImpl extends DomainResourceImpl implements MedicinalProductPackaged {
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
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> subject;

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
	 * The cached value of the '{@link #getLegalStatusOfSupply() <em>Legal Status Of Supply</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegalStatusOfSupply()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept legalStatusOfSupply;

	/**
	 * The cached value of the '{@link #getMarketingStatus() <em>Marketing Status</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarketingStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<MarketingStatus> marketingStatus;

	/**
	 * The cached value of the '{@link #getMarketingAuthorization() <em>Marketing Authorization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarketingAuthorization()
	 * @generated
	 * @ordered
	 */
	protected Reference marketingAuthorization;

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
	 * The cached value of the '{@link #getBatchIdentifier() <em>Batch Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatchIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductPackagedBatchIdentifier> batchIdentifier;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductPackagedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicinalProductPackaged();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.MEDICINAL_PRODUCT_PACKAGED__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSubject() {
		if (subject == null) {
			subject = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICINAL_PRODUCT_PACKAGED__SUBJECT);
		}
		return subject;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_PACKAGED__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_PACKAGED__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_PACKAGED__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_PACKAGED__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getLegalStatusOfSupply() {
		return legalStatusOfSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLegalStatusOfSupply(CodeableConcept newLegalStatusOfSupply, NotificationChain msgs) {
		CodeableConcept oldLegalStatusOfSupply = legalStatusOfSupply;
		legalStatusOfSupply = newLegalStatusOfSupply;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_PACKAGED__LEGAL_STATUS_OF_SUPPLY, oldLegalStatusOfSupply, newLegalStatusOfSupply);
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
	public void setLegalStatusOfSupply(CodeableConcept newLegalStatusOfSupply) {
		if (newLegalStatusOfSupply != legalStatusOfSupply) {
			NotificationChain msgs = null;
			if (legalStatusOfSupply != null)
				msgs = ((InternalEObject)legalStatusOfSupply).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_PACKAGED__LEGAL_STATUS_OF_SUPPLY, null, msgs);
			if (newLegalStatusOfSupply != null)
				msgs = ((InternalEObject)newLegalStatusOfSupply).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_PACKAGED__LEGAL_STATUS_OF_SUPPLY, null, msgs);
			msgs = basicSetLegalStatusOfSupply(newLegalStatusOfSupply, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_PACKAGED__LEGAL_STATUS_OF_SUPPLY, newLegalStatusOfSupply, newLegalStatusOfSupply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MarketingStatus> getMarketingStatus() {
		if (marketingStatus == null) {
			marketingStatus = new EObjectContainmentEList<MarketingStatus>(MarketingStatus.class, this, FhirPackage.MEDICINAL_PRODUCT_PACKAGED__MARKETING_STATUS);
		}
		return marketingStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getMarketingAuthorization() {
		return marketingAuthorization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMarketingAuthorization(Reference newMarketingAuthorization, NotificationChain msgs) {
		Reference oldMarketingAuthorization = marketingAuthorization;
		marketingAuthorization = newMarketingAuthorization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_PACKAGED__MARKETING_AUTHORIZATION, oldMarketingAuthorization, newMarketingAuthorization);
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
	public void setMarketingAuthorization(Reference newMarketingAuthorization) {
		if (newMarketingAuthorization != marketingAuthorization) {
			NotificationChain msgs = null;
			if (marketingAuthorization != null)
				msgs = ((InternalEObject)marketingAuthorization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_PACKAGED__MARKETING_AUTHORIZATION, null, msgs);
			if (newMarketingAuthorization != null)
				msgs = ((InternalEObject)newMarketingAuthorization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_PACKAGED__MARKETING_AUTHORIZATION, null, msgs);
			msgs = basicSetMarketingAuthorization(newMarketingAuthorization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_PACKAGED__MARKETING_AUTHORIZATION, newMarketingAuthorization, newMarketingAuthorization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getManufacturer() {
		if (manufacturer == null) {
			manufacturer = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICINAL_PRODUCT_PACKAGED__MANUFACTURER);
		}
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicinalProductPackagedBatchIdentifier> getBatchIdentifier() {
		if (batchIdentifier == null) {
			batchIdentifier = new EObjectContainmentEList<MedicinalProductPackagedBatchIdentifier>(MedicinalProductPackagedBatchIdentifier.class, this, FhirPackage.MEDICINAL_PRODUCT_PACKAGED__BATCH_IDENTIFIER);
		}
		return batchIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicinalProductPackagedPackageItem> getPackageItem() {
		if (packageItem == null) {
			packageItem = new EObjectContainmentEList<MedicinalProductPackagedPackageItem>(MedicinalProductPackagedPackageItem.class, this, FhirPackage.MEDICINAL_PRODUCT_PACKAGED__PACKAGE_ITEM);
		}
		return packageItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__SUBJECT:
				return ((InternalEList<?>)getSubject()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__LEGAL_STATUS_OF_SUPPLY:
				return basicSetLegalStatusOfSupply(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__MARKETING_STATUS:
				return ((InternalEList<?>)getMarketingStatus()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__MARKETING_AUTHORIZATION:
				return basicSetMarketingAuthorization(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__MANUFACTURER:
				return ((InternalEList<?>)getManufacturer()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__BATCH_IDENTIFIER:
				return ((InternalEList<?>)getBatchIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__PACKAGE_ITEM:
				return ((InternalEList<?>)getPackageItem()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__SUBJECT:
				return getSubject();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__DESCRIPTION:
				return getDescription();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__LEGAL_STATUS_OF_SUPPLY:
				return getLegalStatusOfSupply();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__MARKETING_STATUS:
				return getMarketingStatus();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__MARKETING_AUTHORIZATION:
				return getMarketingAuthorization();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__MANUFACTURER:
				return getManufacturer();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__BATCH_IDENTIFIER:
				return getBatchIdentifier();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__PACKAGE_ITEM:
				return getPackageItem();
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
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__SUBJECT:
				getSubject().clear();
				getSubject().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__LEGAL_STATUS_OF_SUPPLY:
				setLegalStatusOfSupply((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__MARKETING_STATUS:
				getMarketingStatus().clear();
				getMarketingStatus().addAll((Collection<? extends MarketingStatus>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__MARKETING_AUTHORIZATION:
				setMarketingAuthorization((Reference)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__MANUFACTURER:
				getManufacturer().clear();
				getManufacturer().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__BATCH_IDENTIFIER:
				getBatchIdentifier().clear();
				getBatchIdentifier().addAll((Collection<? extends MedicinalProductPackagedBatchIdentifier>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__PACKAGE_ITEM:
				getPackageItem().clear();
				getPackageItem().addAll((Collection<? extends MedicinalProductPackagedPackageItem>)newValue);
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
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__SUBJECT:
				getSubject().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__LEGAL_STATUS_OF_SUPPLY:
				setLegalStatusOfSupply((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__MARKETING_STATUS:
				getMarketingStatus().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__MARKETING_AUTHORIZATION:
				setMarketingAuthorization((Reference)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__MANUFACTURER:
				getManufacturer().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__BATCH_IDENTIFIER:
				getBatchIdentifier().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__PACKAGE_ITEM:
				getPackageItem().clear();
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
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__SUBJECT:
				return subject != null && !subject.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__DESCRIPTION:
				return description != null;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__LEGAL_STATUS_OF_SUPPLY:
				return legalStatusOfSupply != null;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__MARKETING_STATUS:
				return marketingStatus != null && !marketingStatus.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__MARKETING_AUTHORIZATION:
				return marketingAuthorization != null;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__MANUFACTURER:
				return manufacturer != null && !manufacturer.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__BATCH_IDENTIFIER:
				return batchIdentifier != null && !batchIdentifier.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__PACKAGE_ITEM:
				return packageItem != null && !packageItem.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductPackagedImpl
