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
import org.hl7.fhir.InvoiceLineItem;
import org.hl7.fhir.InvoicePriceComponent;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invoice Line Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.InvoiceLineItemImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InvoiceLineItemImpl#getChargeItemReference <em>Charge Item Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InvoiceLineItemImpl#getChargeItemCodeableConcept <em>Charge Item Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InvoiceLineItemImpl#getPriceComponent <em>Price Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InvoiceLineItemImpl extends BackboneElementImpl implements InvoiceLineItem {
	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt sequence;

	/**
	 * The cached value of the '{@link #getChargeItemReference() <em>Charge Item Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeItemReference()
	 * @generated
	 * @ordered
	 */
	protected Reference chargeItemReference;

	/**
	 * The cached value of the '{@link #getChargeItemCodeableConcept() <em>Charge Item Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeItemCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept chargeItemCodeableConcept;

	/**
	 * The cached value of the '{@link #getPriceComponent() <em>Price Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriceComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<InvoicePriceComponent> priceComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvoiceLineItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getInvoiceLineItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequence(PositiveInt newSequence, NotificationChain msgs) {
		PositiveInt oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INVOICE_LINE_ITEM__SEQUENCE, oldSequence, newSequence);
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
	public void setSequence(PositiveInt newSequence) {
		if (newSequence != sequence) {
			NotificationChain msgs = null;
			if (sequence != null)
				msgs = ((InternalEObject)sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVOICE_LINE_ITEM__SEQUENCE, null, msgs);
			if (newSequence != null)
				msgs = ((InternalEObject)newSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVOICE_LINE_ITEM__SEQUENCE, null, msgs);
			msgs = basicSetSequence(newSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INVOICE_LINE_ITEM__SEQUENCE, newSequence, newSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getChargeItemReference() {
		return chargeItemReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChargeItemReference(Reference newChargeItemReference, NotificationChain msgs) {
		Reference oldChargeItemReference = chargeItemReference;
		chargeItemReference = newChargeItemReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INVOICE_LINE_ITEM__CHARGE_ITEM_REFERENCE, oldChargeItemReference, newChargeItemReference);
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
	public void setChargeItemReference(Reference newChargeItemReference) {
		if (newChargeItemReference != chargeItemReference) {
			NotificationChain msgs = null;
			if (chargeItemReference != null)
				msgs = ((InternalEObject)chargeItemReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVOICE_LINE_ITEM__CHARGE_ITEM_REFERENCE, null, msgs);
			if (newChargeItemReference != null)
				msgs = ((InternalEObject)newChargeItemReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVOICE_LINE_ITEM__CHARGE_ITEM_REFERENCE, null, msgs);
			msgs = basicSetChargeItemReference(newChargeItemReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INVOICE_LINE_ITEM__CHARGE_ITEM_REFERENCE, newChargeItemReference, newChargeItemReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getChargeItemCodeableConcept() {
		return chargeItemCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChargeItemCodeableConcept(CodeableConcept newChargeItemCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldChargeItemCodeableConcept = chargeItemCodeableConcept;
		chargeItemCodeableConcept = newChargeItemCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INVOICE_LINE_ITEM__CHARGE_ITEM_CODEABLE_CONCEPT, oldChargeItemCodeableConcept, newChargeItemCodeableConcept);
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
	public void setChargeItemCodeableConcept(CodeableConcept newChargeItemCodeableConcept) {
		if (newChargeItemCodeableConcept != chargeItemCodeableConcept) {
			NotificationChain msgs = null;
			if (chargeItemCodeableConcept != null)
				msgs = ((InternalEObject)chargeItemCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVOICE_LINE_ITEM__CHARGE_ITEM_CODEABLE_CONCEPT, null, msgs);
			if (newChargeItemCodeableConcept != null)
				msgs = ((InternalEObject)newChargeItemCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INVOICE_LINE_ITEM__CHARGE_ITEM_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetChargeItemCodeableConcept(newChargeItemCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INVOICE_LINE_ITEM__CHARGE_ITEM_CODEABLE_CONCEPT, newChargeItemCodeableConcept, newChargeItemCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InvoicePriceComponent> getPriceComponent() {
		if (priceComponent == null) {
			priceComponent = new EObjectContainmentEList<InvoicePriceComponent>(InvoicePriceComponent.class, this, FhirPackage.INVOICE_LINE_ITEM__PRICE_COMPONENT);
		}
		return priceComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.INVOICE_LINE_ITEM__SEQUENCE:
				return basicSetSequence(null, msgs);
			case FhirPackage.INVOICE_LINE_ITEM__CHARGE_ITEM_REFERENCE:
				return basicSetChargeItemReference(null, msgs);
			case FhirPackage.INVOICE_LINE_ITEM__CHARGE_ITEM_CODEABLE_CONCEPT:
				return basicSetChargeItemCodeableConcept(null, msgs);
			case FhirPackage.INVOICE_LINE_ITEM__PRICE_COMPONENT:
				return ((InternalEList<?>)getPriceComponent()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.INVOICE_LINE_ITEM__SEQUENCE:
				return getSequence();
			case FhirPackage.INVOICE_LINE_ITEM__CHARGE_ITEM_REFERENCE:
				return getChargeItemReference();
			case FhirPackage.INVOICE_LINE_ITEM__CHARGE_ITEM_CODEABLE_CONCEPT:
				return getChargeItemCodeableConcept();
			case FhirPackage.INVOICE_LINE_ITEM__PRICE_COMPONENT:
				return getPriceComponent();
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
			case FhirPackage.INVOICE_LINE_ITEM__SEQUENCE:
				setSequence((PositiveInt)newValue);
				return;
			case FhirPackage.INVOICE_LINE_ITEM__CHARGE_ITEM_REFERENCE:
				setChargeItemReference((Reference)newValue);
				return;
			case FhirPackage.INVOICE_LINE_ITEM__CHARGE_ITEM_CODEABLE_CONCEPT:
				setChargeItemCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.INVOICE_LINE_ITEM__PRICE_COMPONENT:
				getPriceComponent().clear();
				getPriceComponent().addAll((Collection<? extends InvoicePriceComponent>)newValue);
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
			case FhirPackage.INVOICE_LINE_ITEM__SEQUENCE:
				setSequence((PositiveInt)null);
				return;
			case FhirPackage.INVOICE_LINE_ITEM__CHARGE_ITEM_REFERENCE:
				setChargeItemReference((Reference)null);
				return;
			case FhirPackage.INVOICE_LINE_ITEM__CHARGE_ITEM_CODEABLE_CONCEPT:
				setChargeItemCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.INVOICE_LINE_ITEM__PRICE_COMPONENT:
				getPriceComponent().clear();
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
			case FhirPackage.INVOICE_LINE_ITEM__SEQUENCE:
				return sequence != null;
			case FhirPackage.INVOICE_LINE_ITEM__CHARGE_ITEM_REFERENCE:
				return chargeItemReference != null;
			case FhirPackage.INVOICE_LINE_ITEM__CHARGE_ITEM_CODEABLE_CONCEPT:
				return chargeItemCodeableConcept != null;
			case FhirPackage.INVOICE_LINE_ITEM__PRICE_COMPONENT:
				return priceComponent != null && !priceComponent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InvoiceLineItemImpl
