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
import org.hl7.fhir.MedicinalProductManufacturingBusinessOperation;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicinal Product Manufacturing Business Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductManufacturingBusinessOperationImpl#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductManufacturingBusinessOperationImpl#getAuthorisationReferenceNumber <em>Authorisation Reference Number</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductManufacturingBusinessOperationImpl#getEffectiveDate <em>Effective Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductManufacturingBusinessOperationImpl#getConfidentialityIndicator <em>Confidentiality Indicator</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductManufacturingBusinessOperationImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductManufacturingBusinessOperationImpl#getRegulator <em>Regulator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductManufacturingBusinessOperationImpl extends BackboneElementImpl implements MedicinalProductManufacturingBusinessOperation {
	/**
	 * The cached value of the '{@link #getOperationType() <em>Operation Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept operationType;

	/**
	 * The cached value of the '{@link #getAuthorisationReferenceNumber() <em>Authorisation Reference Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorisationReferenceNumber()
	 * @generated
	 * @ordered
	 */
	protected Identifier authorisationReferenceNumber;

	/**
	 * The cached value of the '{@link #getEffectiveDate() <em>Effective Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime effectiveDate;

	/**
	 * The cached value of the '{@link #getConfidentialityIndicator() <em>Confidentiality Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentialityIndicator()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept confidentialityIndicator;

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
	 * The cached value of the '{@link #getRegulator() <em>Regulator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulator()
	 * @generated
	 * @ordered
	 */
	protected Reference regulator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductManufacturingBusinessOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicinalProductManufacturingBusinessOperation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getOperationType() {
		return operationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationType(CodeableConcept newOperationType, NotificationChain msgs) {
		CodeableConcept oldOperationType = operationType;
		operationType = newOperationType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__OPERATION_TYPE, oldOperationType, newOperationType);
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
	public void setOperationType(CodeableConcept newOperationType) {
		if (newOperationType != operationType) {
			NotificationChain msgs = null;
			if (operationType != null)
				msgs = ((InternalEObject)operationType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__OPERATION_TYPE, null, msgs);
			if (newOperationType != null)
				msgs = ((InternalEObject)newOperationType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__OPERATION_TYPE, null, msgs);
			msgs = basicSetOperationType(newOperationType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__OPERATION_TYPE, newOperationType, newOperationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getAuthorisationReferenceNumber() {
		return authorisationReferenceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthorisationReferenceNumber(Identifier newAuthorisationReferenceNumber, NotificationChain msgs) {
		Identifier oldAuthorisationReferenceNumber = authorisationReferenceNumber;
		authorisationReferenceNumber = newAuthorisationReferenceNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__AUTHORISATION_REFERENCE_NUMBER, oldAuthorisationReferenceNumber, newAuthorisationReferenceNumber);
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
	public void setAuthorisationReferenceNumber(Identifier newAuthorisationReferenceNumber) {
		if (newAuthorisationReferenceNumber != authorisationReferenceNumber) {
			NotificationChain msgs = null;
			if (authorisationReferenceNumber != null)
				msgs = ((InternalEObject)authorisationReferenceNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__AUTHORISATION_REFERENCE_NUMBER, null, msgs);
			if (newAuthorisationReferenceNumber != null)
				msgs = ((InternalEObject)newAuthorisationReferenceNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__AUTHORISATION_REFERENCE_NUMBER, null, msgs);
			msgs = basicSetAuthorisationReferenceNumber(newAuthorisationReferenceNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__AUTHORISATION_REFERENCE_NUMBER, newAuthorisationReferenceNumber, newAuthorisationReferenceNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getEffectiveDate() {
		return effectiveDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffectiveDate(DateTime newEffectiveDate, NotificationChain msgs) {
		DateTime oldEffectiveDate = effectiveDate;
		effectiveDate = newEffectiveDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__EFFECTIVE_DATE, oldEffectiveDate, newEffectiveDate);
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
	public void setEffectiveDate(DateTime newEffectiveDate) {
		if (newEffectiveDate != effectiveDate) {
			NotificationChain msgs = null;
			if (effectiveDate != null)
				msgs = ((InternalEObject)effectiveDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__EFFECTIVE_DATE, null, msgs);
			if (newEffectiveDate != null)
				msgs = ((InternalEObject)newEffectiveDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__EFFECTIVE_DATE, null, msgs);
			msgs = basicSetEffectiveDate(newEffectiveDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__EFFECTIVE_DATE, newEffectiveDate, newEffectiveDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getConfidentialityIndicator() {
		return confidentialityIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfidentialityIndicator(CodeableConcept newConfidentialityIndicator, NotificationChain msgs) {
		CodeableConcept oldConfidentialityIndicator = confidentialityIndicator;
		confidentialityIndicator = newConfidentialityIndicator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__CONFIDENTIALITY_INDICATOR, oldConfidentialityIndicator, newConfidentialityIndicator);
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
	public void setConfidentialityIndicator(CodeableConcept newConfidentialityIndicator) {
		if (newConfidentialityIndicator != confidentialityIndicator) {
			NotificationChain msgs = null;
			if (confidentialityIndicator != null)
				msgs = ((InternalEObject)confidentialityIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__CONFIDENTIALITY_INDICATOR, null, msgs);
			if (newConfidentialityIndicator != null)
				msgs = ((InternalEObject)newConfidentialityIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__CONFIDENTIALITY_INDICATOR, null, msgs);
			msgs = basicSetConfidentialityIndicator(newConfidentialityIndicator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__CONFIDENTIALITY_INDICATOR, newConfidentialityIndicator, newConfidentialityIndicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getManufacturer() {
		if (manufacturer == null) {
			manufacturer = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__MANUFACTURER);
		}
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getRegulator() {
		return regulator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegulator(Reference newRegulator, NotificationChain msgs) {
		Reference oldRegulator = regulator;
		regulator = newRegulator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__REGULATOR, oldRegulator, newRegulator);
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
	public void setRegulator(Reference newRegulator) {
		if (newRegulator != regulator) {
			NotificationChain msgs = null;
			if (regulator != null)
				msgs = ((InternalEObject)regulator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__REGULATOR, null, msgs);
			if (newRegulator != null)
				msgs = ((InternalEObject)newRegulator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__REGULATOR, null, msgs);
			msgs = basicSetRegulator(newRegulator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__REGULATOR, newRegulator, newRegulator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__OPERATION_TYPE:
				return basicSetOperationType(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__AUTHORISATION_REFERENCE_NUMBER:
				return basicSetAuthorisationReferenceNumber(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__EFFECTIVE_DATE:
				return basicSetEffectiveDate(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__CONFIDENTIALITY_INDICATOR:
				return basicSetConfidentialityIndicator(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__MANUFACTURER:
				return ((InternalEList<?>)getManufacturer()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__REGULATOR:
				return basicSetRegulator(null, msgs);
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
			case FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__OPERATION_TYPE:
				return getOperationType();
			case FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__AUTHORISATION_REFERENCE_NUMBER:
				return getAuthorisationReferenceNumber();
			case FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__EFFECTIVE_DATE:
				return getEffectiveDate();
			case FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__CONFIDENTIALITY_INDICATOR:
				return getConfidentialityIndicator();
			case FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__MANUFACTURER:
				return getManufacturer();
			case FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__REGULATOR:
				return getRegulator();
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
			case FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__OPERATION_TYPE:
				setOperationType((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__AUTHORISATION_REFERENCE_NUMBER:
				setAuthorisationReferenceNumber((Identifier)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__EFFECTIVE_DATE:
				setEffectiveDate((DateTime)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__CONFIDENTIALITY_INDICATOR:
				setConfidentialityIndicator((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__MANUFACTURER:
				getManufacturer().clear();
				getManufacturer().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__REGULATOR:
				setRegulator((Reference)newValue);
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
			case FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__OPERATION_TYPE:
				setOperationType((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__AUTHORISATION_REFERENCE_NUMBER:
				setAuthorisationReferenceNumber((Identifier)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__EFFECTIVE_DATE:
				setEffectiveDate((DateTime)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__CONFIDENTIALITY_INDICATOR:
				setConfidentialityIndicator((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__MANUFACTURER:
				getManufacturer().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__REGULATOR:
				setRegulator((Reference)null);
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
			case FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__OPERATION_TYPE:
				return operationType != null;
			case FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__AUTHORISATION_REFERENCE_NUMBER:
				return authorisationReferenceNumber != null;
			case FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__EFFECTIVE_DATE:
				return effectiveDate != null;
			case FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__CONFIDENTIALITY_INDICATOR:
				return confidentialityIndicator != null;
			case FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__MANUFACTURER:
				return manufacturer != null && !manufacturer.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION__REGULATOR:
				return regulator != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductManufacturingBusinessOperationImpl
