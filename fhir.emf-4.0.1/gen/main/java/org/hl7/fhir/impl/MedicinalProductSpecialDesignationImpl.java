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
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.MedicinalProductSpecialDesignation;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicinal Product Special Designation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductSpecialDesignationImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductSpecialDesignationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductSpecialDesignationImpl#getIntendedUse <em>Intended Use</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductSpecialDesignationImpl#getIndicationCodeableConcept <em>Indication Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductSpecialDesignationImpl#getIndicationReference <em>Indication Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductSpecialDesignationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductSpecialDesignationImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductSpecialDesignationImpl#getSpecies <em>Species</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductSpecialDesignationImpl extends BackboneElementImpl implements MedicinalProductSpecialDesignation {
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
	 * The cached value of the '{@link #getIntendedUse() <em>Intended Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntendedUse()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept intendedUse;

	/**
	 * The cached value of the '{@link #getIndicationCodeableConcept() <em>Indication Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicationCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept indicationCodeableConcept;

	/**
	 * The cached value of the '{@link #getIndicationReference() <em>Indication Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicationReference()
	 * @generated
	 * @ordered
	 */
	protected Reference indicationReference;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept status;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime date;

	/**
	 * The cached value of the '{@link #getSpecies() <em>Species</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecies()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept species;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductSpecialDesignationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicinalProductSpecialDesignation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__IDENTIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getIntendedUse() {
		return intendedUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntendedUse(CodeableConcept newIntendedUse, NotificationChain msgs) {
		CodeableConcept oldIntendedUse = intendedUse;
		intendedUse = newIntendedUse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__INTENDED_USE, oldIntendedUse, newIntendedUse);
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
	public void setIntendedUse(CodeableConcept newIntendedUse) {
		if (newIntendedUse != intendedUse) {
			NotificationChain msgs = null;
			if (intendedUse != null)
				msgs = ((InternalEObject)intendedUse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__INTENDED_USE, null, msgs);
			if (newIntendedUse != null)
				msgs = ((InternalEObject)newIntendedUse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__INTENDED_USE, null, msgs);
			msgs = basicSetIntendedUse(newIntendedUse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__INTENDED_USE, newIntendedUse, newIntendedUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getIndicationCodeableConcept() {
		return indicationCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndicationCodeableConcept(CodeableConcept newIndicationCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldIndicationCodeableConcept = indicationCodeableConcept;
		indicationCodeableConcept = newIndicationCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__INDICATION_CODEABLE_CONCEPT, oldIndicationCodeableConcept, newIndicationCodeableConcept);
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
	public void setIndicationCodeableConcept(CodeableConcept newIndicationCodeableConcept) {
		if (newIndicationCodeableConcept != indicationCodeableConcept) {
			NotificationChain msgs = null;
			if (indicationCodeableConcept != null)
				msgs = ((InternalEObject)indicationCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__INDICATION_CODEABLE_CONCEPT, null, msgs);
			if (newIndicationCodeableConcept != null)
				msgs = ((InternalEObject)newIndicationCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__INDICATION_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetIndicationCodeableConcept(newIndicationCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__INDICATION_CODEABLE_CONCEPT, newIndicationCodeableConcept, newIndicationCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getIndicationReference() {
		return indicationReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndicationReference(Reference newIndicationReference, NotificationChain msgs) {
		Reference oldIndicationReference = indicationReference;
		indicationReference = newIndicationReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__INDICATION_REFERENCE, oldIndicationReference, newIndicationReference);
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
	public void setIndicationReference(Reference newIndicationReference) {
		if (newIndicationReference != indicationReference) {
			NotificationChain msgs = null;
			if (indicationReference != null)
				msgs = ((InternalEObject)indicationReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__INDICATION_REFERENCE, null, msgs);
			if (newIndicationReference != null)
				msgs = ((InternalEObject)newIndicationReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__INDICATION_REFERENCE, null, msgs);
			msgs = basicSetIndicationReference(newIndicationReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__INDICATION_REFERENCE, newIndicationReference, newIndicationReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(CodeableConcept newStatus, NotificationChain msgs) {
		CodeableConcept oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__STATUS, oldStatus, newStatus);
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
	public void setStatus(CodeableConcept newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(DateTime newDate, NotificationChain msgs) {
		DateTime oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__DATE, oldDate, newDate);
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
	public void setDate(DateTime newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getSpecies() {
		return species;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecies(CodeableConcept newSpecies, NotificationChain msgs) {
		CodeableConcept oldSpecies = species;
		species = newSpecies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__SPECIES, oldSpecies, newSpecies);
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
	public void setSpecies(CodeableConcept newSpecies) {
		if (newSpecies != species) {
			NotificationChain msgs = null;
			if (species != null)
				msgs = ((InternalEObject)species).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__SPECIES, null, msgs);
			if (newSpecies != null)
				msgs = ((InternalEObject)newSpecies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__SPECIES, null, msgs);
			msgs = basicSetSpecies(newSpecies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__SPECIES, newSpecies, newSpecies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__INTENDED_USE:
				return basicSetIntendedUse(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__INDICATION_CODEABLE_CONCEPT:
				return basicSetIndicationCodeableConcept(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__INDICATION_REFERENCE:
				return basicSetIndicationReference(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__SPECIES:
				return basicSetSpecies(null, msgs);
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
			case FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__TYPE:
				return getType();
			case FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__INTENDED_USE:
				return getIntendedUse();
			case FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__INDICATION_CODEABLE_CONCEPT:
				return getIndicationCodeableConcept();
			case FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__INDICATION_REFERENCE:
				return getIndicationReference();
			case FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__STATUS:
				return getStatus();
			case FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__DATE:
				return getDate();
			case FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__SPECIES:
				return getSpecies();
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
			case FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__INTENDED_USE:
				setIntendedUse((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__INDICATION_CODEABLE_CONCEPT:
				setIndicationCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__INDICATION_REFERENCE:
				setIndicationReference((Reference)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__STATUS:
				setStatus((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__SPECIES:
				setSpecies((CodeableConcept)newValue);
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
			case FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__INTENDED_USE:
				setIntendedUse((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__INDICATION_CODEABLE_CONCEPT:
				setIndicationCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__INDICATION_REFERENCE:
				setIndicationReference((Reference)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__STATUS:
				setStatus((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__SPECIES:
				setSpecies((CodeableConcept)null);
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
			case FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__TYPE:
				return type != null;
			case FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__INTENDED_USE:
				return intendedUse != null;
			case FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__INDICATION_CODEABLE_CONCEPT:
				return indicationCodeableConcept != null;
			case FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__INDICATION_REFERENCE:
				return indicationReference != null;
			case FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__STATUS:
				return status != null;
			case FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__DATE:
				return date != null;
			case FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__SPECIES:
				return species != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductSpecialDesignationImpl
