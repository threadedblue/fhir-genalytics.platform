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

import org.hl7.fhir.CatalogEntry;
import org.hl7.fhir.CatalogEntryRelatedEntry;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.PublicationStatus;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catalog Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CatalogEntryImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CatalogEntryImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CatalogEntryImpl#getOrderable <em>Orderable</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CatalogEntryImpl#getReferencedItem <em>Referenced Item</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CatalogEntryImpl#getAdditionalIdentifier <em>Additional Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CatalogEntryImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CatalogEntryImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CatalogEntryImpl#getValidityPeriod <em>Validity Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CatalogEntryImpl#getValidTo <em>Valid To</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CatalogEntryImpl#getLastUpdated <em>Last Updated</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CatalogEntryImpl#getAdditionalCharacteristic <em>Additional Characteristic</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CatalogEntryImpl#getAdditionalClassification <em>Additional Classification</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CatalogEntryImpl#getRelatedEntry <em>Related Entry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CatalogEntryImpl extends DomainResourceImpl implements CatalogEntry {
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
	 * The cached value of the '{@link #getOrderable() <em>Orderable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderable()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean orderable;

	/**
	 * The cached value of the '{@link #getReferencedItem() <em>Referenced Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedItem()
	 * @generated
	 * @ordered
	 */
	protected Reference referencedItem;

	/**
	 * The cached value of the '{@link #getAdditionalIdentifier() <em>Additional Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> additionalIdentifier;

	/**
	 * The cached value of the '{@link #getClassification() <em>Classification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> classification;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected PublicationStatus status;

	/**
	 * The cached value of the '{@link #getValidityPeriod() <em>Validity Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidityPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period validityPeriod;

	/**
	 * The cached value of the '{@link #getValidTo() <em>Valid To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidTo()
	 * @generated
	 * @ordered
	 */
	protected DateTime validTo;

	/**
	 * The cached value of the '{@link #getLastUpdated() <em>Last Updated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdated()
	 * @generated
	 * @ordered
	 */
	protected DateTime lastUpdated;

	/**
	 * The cached value of the '{@link #getAdditionalCharacteristic() <em>Additional Characteristic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalCharacteristic()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> additionalCharacteristic;

	/**
	 * The cached value of the '{@link #getAdditionalClassification() <em>Additional Classification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalClassification()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> additionalClassification;

	/**
	 * The cached value of the '{@link #getRelatedEntry() <em>Related Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<CatalogEntryRelatedEntry> relatedEntry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatalogEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCatalogEntry();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.CATALOG_ENTRY__IDENTIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_ENTRY__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_ENTRY__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_ENTRY__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_ENTRY__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getOrderable() {
		return orderable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrderable(org.hl7.fhir.Boolean newOrderable, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldOrderable = orderable;
		orderable = newOrderable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_ENTRY__ORDERABLE, oldOrderable, newOrderable);
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
	public void setOrderable(org.hl7.fhir.Boolean newOrderable) {
		if (newOrderable != orderable) {
			NotificationChain msgs = null;
			if (orderable != null)
				msgs = ((InternalEObject)orderable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_ENTRY__ORDERABLE, null, msgs);
			if (newOrderable != null)
				msgs = ((InternalEObject)newOrderable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_ENTRY__ORDERABLE, null, msgs);
			msgs = basicSetOrderable(newOrderable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_ENTRY__ORDERABLE, newOrderable, newOrderable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getReferencedItem() {
		return referencedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedItem(Reference newReferencedItem, NotificationChain msgs) {
		Reference oldReferencedItem = referencedItem;
		referencedItem = newReferencedItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_ENTRY__REFERENCED_ITEM, oldReferencedItem, newReferencedItem);
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
	public void setReferencedItem(Reference newReferencedItem) {
		if (newReferencedItem != referencedItem) {
			NotificationChain msgs = null;
			if (referencedItem != null)
				msgs = ((InternalEObject)referencedItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_ENTRY__REFERENCED_ITEM, null, msgs);
			if (newReferencedItem != null)
				msgs = ((InternalEObject)newReferencedItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_ENTRY__REFERENCED_ITEM, null, msgs);
			msgs = basicSetReferencedItem(newReferencedItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_ENTRY__REFERENCED_ITEM, newReferencedItem, newReferencedItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getAdditionalIdentifier() {
		if (additionalIdentifier == null) {
			additionalIdentifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.CATALOG_ENTRY__ADDITIONAL_IDENTIFIER);
		}
		return additionalIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getClassification() {
		if (classification == null) {
			classification = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CATALOG_ENTRY__CLASSIFICATION);
		}
		return classification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicationStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(PublicationStatus newStatus, NotificationChain msgs) {
		PublicationStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_ENTRY__STATUS, oldStatus, newStatus);
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
	public void setStatus(PublicationStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_ENTRY__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_ENTRY__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_ENTRY__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getValidityPeriod() {
		return validityPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidityPeriod(Period newValidityPeriod, NotificationChain msgs) {
		Period oldValidityPeriod = validityPeriod;
		validityPeriod = newValidityPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_ENTRY__VALIDITY_PERIOD, oldValidityPeriod, newValidityPeriod);
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
	public void setValidityPeriod(Period newValidityPeriod) {
		if (newValidityPeriod != validityPeriod) {
			NotificationChain msgs = null;
			if (validityPeriod != null)
				msgs = ((InternalEObject)validityPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_ENTRY__VALIDITY_PERIOD, null, msgs);
			if (newValidityPeriod != null)
				msgs = ((InternalEObject)newValidityPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_ENTRY__VALIDITY_PERIOD, null, msgs);
			msgs = basicSetValidityPeriod(newValidityPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_ENTRY__VALIDITY_PERIOD, newValidityPeriod, newValidityPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getValidTo() {
		return validTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidTo(DateTime newValidTo, NotificationChain msgs) {
		DateTime oldValidTo = validTo;
		validTo = newValidTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_ENTRY__VALID_TO, oldValidTo, newValidTo);
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
	public void setValidTo(DateTime newValidTo) {
		if (newValidTo != validTo) {
			NotificationChain msgs = null;
			if (validTo != null)
				msgs = ((InternalEObject)validTo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_ENTRY__VALID_TO, null, msgs);
			if (newValidTo != null)
				msgs = ((InternalEObject)newValidTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_ENTRY__VALID_TO, null, msgs);
			msgs = basicSetValidTo(newValidTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_ENTRY__VALID_TO, newValidTo, newValidTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getLastUpdated() {
		return lastUpdated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastUpdated(DateTime newLastUpdated, NotificationChain msgs) {
		DateTime oldLastUpdated = lastUpdated;
		lastUpdated = newLastUpdated;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_ENTRY__LAST_UPDATED, oldLastUpdated, newLastUpdated);
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
	public void setLastUpdated(DateTime newLastUpdated) {
		if (newLastUpdated != lastUpdated) {
			NotificationChain msgs = null;
			if (lastUpdated != null)
				msgs = ((InternalEObject)lastUpdated).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_ENTRY__LAST_UPDATED, null, msgs);
			if (newLastUpdated != null)
				msgs = ((InternalEObject)newLastUpdated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_ENTRY__LAST_UPDATED, null, msgs);
			msgs = basicSetLastUpdated(newLastUpdated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_ENTRY__LAST_UPDATED, newLastUpdated, newLastUpdated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getAdditionalCharacteristic() {
		if (additionalCharacteristic == null) {
			additionalCharacteristic = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CATALOG_ENTRY__ADDITIONAL_CHARACTERISTIC);
		}
		return additionalCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getAdditionalClassification() {
		if (additionalClassification == null) {
			additionalClassification = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CATALOG_ENTRY__ADDITIONAL_CLASSIFICATION);
		}
		return additionalClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CatalogEntryRelatedEntry> getRelatedEntry() {
		if (relatedEntry == null) {
			relatedEntry = new EObjectContainmentEList<CatalogEntryRelatedEntry>(CatalogEntryRelatedEntry.class, this, FhirPackage.CATALOG_ENTRY__RELATED_ENTRY);
		}
		return relatedEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CATALOG_ENTRY__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.CATALOG_ENTRY__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.CATALOG_ENTRY__ORDERABLE:
				return basicSetOrderable(null, msgs);
			case FhirPackage.CATALOG_ENTRY__REFERENCED_ITEM:
				return basicSetReferencedItem(null, msgs);
			case FhirPackage.CATALOG_ENTRY__ADDITIONAL_IDENTIFIER:
				return ((InternalEList<?>)getAdditionalIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.CATALOG_ENTRY__CLASSIFICATION:
				return ((InternalEList<?>)getClassification()).basicRemove(otherEnd, msgs);
			case FhirPackage.CATALOG_ENTRY__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.CATALOG_ENTRY__VALIDITY_PERIOD:
				return basicSetValidityPeriod(null, msgs);
			case FhirPackage.CATALOG_ENTRY__VALID_TO:
				return basicSetValidTo(null, msgs);
			case FhirPackage.CATALOG_ENTRY__LAST_UPDATED:
				return basicSetLastUpdated(null, msgs);
			case FhirPackage.CATALOG_ENTRY__ADDITIONAL_CHARACTERISTIC:
				return ((InternalEList<?>)getAdditionalCharacteristic()).basicRemove(otherEnd, msgs);
			case FhirPackage.CATALOG_ENTRY__ADDITIONAL_CLASSIFICATION:
				return ((InternalEList<?>)getAdditionalClassification()).basicRemove(otherEnd, msgs);
			case FhirPackage.CATALOG_ENTRY__RELATED_ENTRY:
				return ((InternalEList<?>)getRelatedEntry()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CATALOG_ENTRY__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.CATALOG_ENTRY__TYPE:
				return getType();
			case FhirPackage.CATALOG_ENTRY__ORDERABLE:
				return getOrderable();
			case FhirPackage.CATALOG_ENTRY__REFERENCED_ITEM:
				return getReferencedItem();
			case FhirPackage.CATALOG_ENTRY__ADDITIONAL_IDENTIFIER:
				return getAdditionalIdentifier();
			case FhirPackage.CATALOG_ENTRY__CLASSIFICATION:
				return getClassification();
			case FhirPackage.CATALOG_ENTRY__STATUS:
				return getStatus();
			case FhirPackage.CATALOG_ENTRY__VALIDITY_PERIOD:
				return getValidityPeriod();
			case FhirPackage.CATALOG_ENTRY__VALID_TO:
				return getValidTo();
			case FhirPackage.CATALOG_ENTRY__LAST_UPDATED:
				return getLastUpdated();
			case FhirPackage.CATALOG_ENTRY__ADDITIONAL_CHARACTERISTIC:
				return getAdditionalCharacteristic();
			case FhirPackage.CATALOG_ENTRY__ADDITIONAL_CLASSIFICATION:
				return getAdditionalClassification();
			case FhirPackage.CATALOG_ENTRY__RELATED_ENTRY:
				return getRelatedEntry();
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
			case FhirPackage.CATALOG_ENTRY__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.CATALOG_ENTRY__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.CATALOG_ENTRY__ORDERABLE:
				setOrderable((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.CATALOG_ENTRY__REFERENCED_ITEM:
				setReferencedItem((Reference)newValue);
				return;
			case FhirPackage.CATALOG_ENTRY__ADDITIONAL_IDENTIFIER:
				getAdditionalIdentifier().clear();
				getAdditionalIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.CATALOG_ENTRY__CLASSIFICATION:
				getClassification().clear();
				getClassification().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CATALOG_ENTRY__STATUS:
				setStatus((PublicationStatus)newValue);
				return;
			case FhirPackage.CATALOG_ENTRY__VALIDITY_PERIOD:
				setValidityPeriod((Period)newValue);
				return;
			case FhirPackage.CATALOG_ENTRY__VALID_TO:
				setValidTo((DateTime)newValue);
				return;
			case FhirPackage.CATALOG_ENTRY__LAST_UPDATED:
				setLastUpdated((DateTime)newValue);
				return;
			case FhirPackage.CATALOG_ENTRY__ADDITIONAL_CHARACTERISTIC:
				getAdditionalCharacteristic().clear();
				getAdditionalCharacteristic().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CATALOG_ENTRY__ADDITIONAL_CLASSIFICATION:
				getAdditionalClassification().clear();
				getAdditionalClassification().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CATALOG_ENTRY__RELATED_ENTRY:
				getRelatedEntry().clear();
				getRelatedEntry().addAll((Collection<? extends CatalogEntryRelatedEntry>)newValue);
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
			case FhirPackage.CATALOG_ENTRY__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.CATALOG_ENTRY__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.CATALOG_ENTRY__ORDERABLE:
				setOrderable((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.CATALOG_ENTRY__REFERENCED_ITEM:
				setReferencedItem((Reference)null);
				return;
			case FhirPackage.CATALOG_ENTRY__ADDITIONAL_IDENTIFIER:
				getAdditionalIdentifier().clear();
				return;
			case FhirPackage.CATALOG_ENTRY__CLASSIFICATION:
				getClassification().clear();
				return;
			case FhirPackage.CATALOG_ENTRY__STATUS:
				setStatus((PublicationStatus)null);
				return;
			case FhirPackage.CATALOG_ENTRY__VALIDITY_PERIOD:
				setValidityPeriod((Period)null);
				return;
			case FhirPackage.CATALOG_ENTRY__VALID_TO:
				setValidTo((DateTime)null);
				return;
			case FhirPackage.CATALOG_ENTRY__LAST_UPDATED:
				setLastUpdated((DateTime)null);
				return;
			case FhirPackage.CATALOG_ENTRY__ADDITIONAL_CHARACTERISTIC:
				getAdditionalCharacteristic().clear();
				return;
			case FhirPackage.CATALOG_ENTRY__ADDITIONAL_CLASSIFICATION:
				getAdditionalClassification().clear();
				return;
			case FhirPackage.CATALOG_ENTRY__RELATED_ENTRY:
				getRelatedEntry().clear();
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
			case FhirPackage.CATALOG_ENTRY__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.CATALOG_ENTRY__TYPE:
				return type != null;
			case FhirPackage.CATALOG_ENTRY__ORDERABLE:
				return orderable != null;
			case FhirPackage.CATALOG_ENTRY__REFERENCED_ITEM:
				return referencedItem != null;
			case FhirPackage.CATALOG_ENTRY__ADDITIONAL_IDENTIFIER:
				return additionalIdentifier != null && !additionalIdentifier.isEmpty();
			case FhirPackage.CATALOG_ENTRY__CLASSIFICATION:
				return classification != null && !classification.isEmpty();
			case FhirPackage.CATALOG_ENTRY__STATUS:
				return status != null;
			case FhirPackage.CATALOG_ENTRY__VALIDITY_PERIOD:
				return validityPeriod != null;
			case FhirPackage.CATALOG_ENTRY__VALID_TO:
				return validTo != null;
			case FhirPackage.CATALOG_ENTRY__LAST_UPDATED:
				return lastUpdated != null;
			case FhirPackage.CATALOG_ENTRY__ADDITIONAL_CHARACTERISTIC:
				return additionalCharacteristic != null && !additionalCharacteristic.isEmpty();
			case FhirPackage.CATALOG_ENTRY__ADDITIONAL_CLASSIFICATION:
				return additionalClassification != null && !additionalClassification.isEmpty();
			case FhirPackage.CATALOG_ENTRY__RELATED_ENTRY:
				return relatedEntry != null && !relatedEntry.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CatalogEntryImpl
