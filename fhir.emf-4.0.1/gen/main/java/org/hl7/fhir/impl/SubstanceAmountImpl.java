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
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Range;
import org.hl7.fhir.SubstanceAmount;
import org.hl7.fhir.SubstanceAmountReferenceRange;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Amount</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubstanceAmountImpl#getAmountQuantity <em>Amount Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceAmountImpl#getAmountRange <em>Amount Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceAmountImpl#getAmountString <em>Amount String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceAmountImpl#getAmountType <em>Amount Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceAmountImpl#getAmountText <em>Amount Text</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceAmountImpl#getReferenceRange <em>Reference Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceAmountImpl extends BackboneElementImpl implements SubstanceAmount {
	/**
	 * The cached value of the '{@link #getAmountQuantity() <em>Amount Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity amountQuantity;

	/**
	 * The cached value of the '{@link #getAmountRange() <em>Amount Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountRange()
	 * @generated
	 * @ordered
	 */
	protected Range amountRange;

	/**
	 * The cached value of the '{@link #getAmountString() <em>Amount String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String amountString;

	/**
	 * The cached value of the '{@link #getAmountType() <em>Amount Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept amountType;

	/**
	 * The cached value of the '{@link #getAmountText() <em>Amount Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountText()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String amountText;

	/**
	 * The cached value of the '{@link #getReferenceRange() <em>Reference Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceRange()
	 * @generated
	 * @ordered
	 */
	protected SubstanceAmountReferenceRange referenceRange;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceAmountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubstanceAmount();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getAmountQuantity() {
		return amountQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmountQuantity(Quantity newAmountQuantity, NotificationChain msgs) {
		Quantity oldAmountQuantity = amountQuantity;
		amountQuantity = newAmountQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_AMOUNT__AMOUNT_QUANTITY, oldAmountQuantity, newAmountQuantity);
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
	public void setAmountQuantity(Quantity newAmountQuantity) {
		if (newAmountQuantity != amountQuantity) {
			NotificationChain msgs = null;
			if (amountQuantity != null)
				msgs = ((InternalEObject)amountQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_AMOUNT__AMOUNT_QUANTITY, null, msgs);
			if (newAmountQuantity != null)
				msgs = ((InternalEObject)newAmountQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_AMOUNT__AMOUNT_QUANTITY, null, msgs);
			msgs = basicSetAmountQuantity(newAmountQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_AMOUNT__AMOUNT_QUANTITY, newAmountQuantity, newAmountQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Range getAmountRange() {
		return amountRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmountRange(Range newAmountRange, NotificationChain msgs) {
		Range oldAmountRange = amountRange;
		amountRange = newAmountRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_AMOUNT__AMOUNT_RANGE, oldAmountRange, newAmountRange);
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
	public void setAmountRange(Range newAmountRange) {
		if (newAmountRange != amountRange) {
			NotificationChain msgs = null;
			if (amountRange != null)
				msgs = ((InternalEObject)amountRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_AMOUNT__AMOUNT_RANGE, null, msgs);
			if (newAmountRange != null)
				msgs = ((InternalEObject)newAmountRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_AMOUNT__AMOUNT_RANGE, null, msgs);
			msgs = basicSetAmountRange(newAmountRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_AMOUNT__AMOUNT_RANGE, newAmountRange, newAmountRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getAmountString() {
		return amountString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmountString(org.hl7.fhir.String newAmountString, NotificationChain msgs) {
		org.hl7.fhir.String oldAmountString = amountString;
		amountString = newAmountString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_AMOUNT__AMOUNT_STRING, oldAmountString, newAmountString);
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
	public void setAmountString(org.hl7.fhir.String newAmountString) {
		if (newAmountString != amountString) {
			NotificationChain msgs = null;
			if (amountString != null)
				msgs = ((InternalEObject)amountString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_AMOUNT__AMOUNT_STRING, null, msgs);
			if (newAmountString != null)
				msgs = ((InternalEObject)newAmountString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_AMOUNT__AMOUNT_STRING, null, msgs);
			msgs = basicSetAmountString(newAmountString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_AMOUNT__AMOUNT_STRING, newAmountString, newAmountString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getAmountType() {
		return amountType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmountType(CodeableConcept newAmountType, NotificationChain msgs) {
		CodeableConcept oldAmountType = amountType;
		amountType = newAmountType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_AMOUNT__AMOUNT_TYPE, oldAmountType, newAmountType);
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
	public void setAmountType(CodeableConcept newAmountType) {
		if (newAmountType != amountType) {
			NotificationChain msgs = null;
			if (amountType != null)
				msgs = ((InternalEObject)amountType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_AMOUNT__AMOUNT_TYPE, null, msgs);
			if (newAmountType != null)
				msgs = ((InternalEObject)newAmountType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_AMOUNT__AMOUNT_TYPE, null, msgs);
			msgs = basicSetAmountType(newAmountType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_AMOUNT__AMOUNT_TYPE, newAmountType, newAmountType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getAmountText() {
		return amountText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmountText(org.hl7.fhir.String newAmountText, NotificationChain msgs) {
		org.hl7.fhir.String oldAmountText = amountText;
		amountText = newAmountText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_AMOUNT__AMOUNT_TEXT, oldAmountText, newAmountText);
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
	public void setAmountText(org.hl7.fhir.String newAmountText) {
		if (newAmountText != amountText) {
			NotificationChain msgs = null;
			if (amountText != null)
				msgs = ((InternalEObject)amountText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_AMOUNT__AMOUNT_TEXT, null, msgs);
			if (newAmountText != null)
				msgs = ((InternalEObject)newAmountText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_AMOUNT__AMOUNT_TEXT, null, msgs);
			msgs = basicSetAmountText(newAmountText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_AMOUNT__AMOUNT_TEXT, newAmountText, newAmountText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceAmountReferenceRange getReferenceRange() {
		return referenceRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceRange(SubstanceAmountReferenceRange newReferenceRange, NotificationChain msgs) {
		SubstanceAmountReferenceRange oldReferenceRange = referenceRange;
		referenceRange = newReferenceRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_AMOUNT__REFERENCE_RANGE, oldReferenceRange, newReferenceRange);
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
	public void setReferenceRange(SubstanceAmountReferenceRange newReferenceRange) {
		if (newReferenceRange != referenceRange) {
			NotificationChain msgs = null;
			if (referenceRange != null)
				msgs = ((InternalEObject)referenceRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_AMOUNT__REFERENCE_RANGE, null, msgs);
			if (newReferenceRange != null)
				msgs = ((InternalEObject)newReferenceRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_AMOUNT__REFERENCE_RANGE, null, msgs);
			msgs = basicSetReferenceRange(newReferenceRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_AMOUNT__REFERENCE_RANGE, newReferenceRange, newReferenceRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUBSTANCE_AMOUNT__AMOUNT_QUANTITY:
				return basicSetAmountQuantity(null, msgs);
			case FhirPackage.SUBSTANCE_AMOUNT__AMOUNT_RANGE:
				return basicSetAmountRange(null, msgs);
			case FhirPackage.SUBSTANCE_AMOUNT__AMOUNT_STRING:
				return basicSetAmountString(null, msgs);
			case FhirPackage.SUBSTANCE_AMOUNT__AMOUNT_TYPE:
				return basicSetAmountType(null, msgs);
			case FhirPackage.SUBSTANCE_AMOUNT__AMOUNT_TEXT:
				return basicSetAmountText(null, msgs);
			case FhirPackage.SUBSTANCE_AMOUNT__REFERENCE_RANGE:
				return basicSetReferenceRange(null, msgs);
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
			case FhirPackage.SUBSTANCE_AMOUNT__AMOUNT_QUANTITY:
				return getAmountQuantity();
			case FhirPackage.SUBSTANCE_AMOUNT__AMOUNT_RANGE:
				return getAmountRange();
			case FhirPackage.SUBSTANCE_AMOUNT__AMOUNT_STRING:
				return getAmountString();
			case FhirPackage.SUBSTANCE_AMOUNT__AMOUNT_TYPE:
				return getAmountType();
			case FhirPackage.SUBSTANCE_AMOUNT__AMOUNT_TEXT:
				return getAmountText();
			case FhirPackage.SUBSTANCE_AMOUNT__REFERENCE_RANGE:
				return getReferenceRange();
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
			case FhirPackage.SUBSTANCE_AMOUNT__AMOUNT_QUANTITY:
				setAmountQuantity((Quantity)newValue);
				return;
			case FhirPackage.SUBSTANCE_AMOUNT__AMOUNT_RANGE:
				setAmountRange((Range)newValue);
				return;
			case FhirPackage.SUBSTANCE_AMOUNT__AMOUNT_STRING:
				setAmountString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSTANCE_AMOUNT__AMOUNT_TYPE:
				setAmountType((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_AMOUNT__AMOUNT_TEXT:
				setAmountText((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSTANCE_AMOUNT__REFERENCE_RANGE:
				setReferenceRange((SubstanceAmountReferenceRange)newValue);
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
			case FhirPackage.SUBSTANCE_AMOUNT__AMOUNT_QUANTITY:
				setAmountQuantity((Quantity)null);
				return;
			case FhirPackage.SUBSTANCE_AMOUNT__AMOUNT_RANGE:
				setAmountRange((Range)null);
				return;
			case FhirPackage.SUBSTANCE_AMOUNT__AMOUNT_STRING:
				setAmountString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSTANCE_AMOUNT__AMOUNT_TYPE:
				setAmountType((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_AMOUNT__AMOUNT_TEXT:
				setAmountText((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSTANCE_AMOUNT__REFERENCE_RANGE:
				setReferenceRange((SubstanceAmountReferenceRange)null);
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
			case FhirPackage.SUBSTANCE_AMOUNT__AMOUNT_QUANTITY:
				return amountQuantity != null;
			case FhirPackage.SUBSTANCE_AMOUNT__AMOUNT_RANGE:
				return amountRange != null;
			case FhirPackage.SUBSTANCE_AMOUNT__AMOUNT_STRING:
				return amountString != null;
			case FhirPackage.SUBSTANCE_AMOUNT__AMOUNT_TYPE:
				return amountType != null;
			case FhirPackage.SUBSTANCE_AMOUNT__AMOUNT_TEXT:
				return amountText != null;
			case FhirPackage.SUBSTANCE_AMOUNT__REFERENCE_RANGE:
				return referenceRange != null;
		}
		return super.eIsSet(featureID);
	}

} //SubstanceAmountImpl
