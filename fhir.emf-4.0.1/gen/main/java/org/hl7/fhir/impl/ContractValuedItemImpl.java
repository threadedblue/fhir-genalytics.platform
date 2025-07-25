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
import org.hl7.fhir.ContractValuedItem;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Money;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Reference;
import org.hl7.fhir.UnsignedInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contract Valued Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ContractValuedItemImpl#getEntityCodeableConcept <em>Entity Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractValuedItemImpl#getEntityReference <em>Entity Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractValuedItemImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractValuedItemImpl#getEffectiveTime <em>Effective Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractValuedItemImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractValuedItemImpl#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractValuedItemImpl#getFactor <em>Factor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractValuedItemImpl#getPoints <em>Points</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractValuedItemImpl#getNet <em>Net</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractValuedItemImpl#getPayment <em>Payment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractValuedItemImpl#getPaymentDate <em>Payment Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractValuedItemImpl#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractValuedItemImpl#getRecipient <em>Recipient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractValuedItemImpl#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractValuedItemImpl#getSecurityLabelNumber <em>Security Label Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContractValuedItemImpl extends BackboneElementImpl implements ContractValuedItem {
	/**
	 * The cached value of the '{@link #getEntityCodeableConcept() <em>Entity Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept entityCodeableConcept;

	/**
	 * The cached value of the '{@link #getEntityReference() <em>Entity Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityReference()
	 * @generated
	 * @ordered
	 */
	protected Reference entityReference;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getEffectiveTime() <em>Effective Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime effectiveTime;

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
	 * The cached value of the '{@link #getFactor() <em>Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactor()
	 * @generated
	 * @ordered
	 */
	protected Decimal factor;

	/**
	 * The cached value of the '{@link #getPoints() <em>Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected Decimal points;

	/**
	 * The cached value of the '{@link #getNet() <em>Net</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNet()
	 * @generated
	 * @ordered
	 */
	protected Money net;

	/**
	 * The cached value of the '{@link #getPayment() <em>Payment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String payment;

	/**
	 * The cached value of the '{@link #getPaymentDate() <em>Payment Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime paymentDate;

	/**
	 * The cached value of the '{@link #getResponsible() <em>Responsible</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsible()
	 * @generated
	 * @ordered
	 */
	protected Reference responsible;

	/**
	 * The cached value of the '{@link #getRecipient() <em>Recipient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipient()
	 * @generated
	 * @ordered
	 */
	protected Reference recipient;

	/**
	 * The cached value of the '{@link #getLinkId() <em>Link Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkId()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> linkId;

	/**
	 * The cached value of the '{@link #getSecurityLabelNumber() <em>Security Label Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLabelNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<UnsignedInt> securityLabelNumber;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractValuedItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getContractValuedItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getEntityCodeableConcept() {
		return entityCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntityCodeableConcept(CodeableConcept newEntityCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldEntityCodeableConcept = entityCodeableConcept;
		entityCodeableConcept = newEntityCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_VALUED_ITEM__ENTITY_CODEABLE_CONCEPT, oldEntityCodeableConcept, newEntityCodeableConcept);
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
	public void setEntityCodeableConcept(CodeableConcept newEntityCodeableConcept) {
		if (newEntityCodeableConcept != entityCodeableConcept) {
			NotificationChain msgs = null;
			if (entityCodeableConcept != null)
				msgs = ((InternalEObject)entityCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_VALUED_ITEM__ENTITY_CODEABLE_CONCEPT, null, msgs);
			if (newEntityCodeableConcept != null)
				msgs = ((InternalEObject)newEntityCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_VALUED_ITEM__ENTITY_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetEntityCodeableConcept(newEntityCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_VALUED_ITEM__ENTITY_CODEABLE_CONCEPT, newEntityCodeableConcept, newEntityCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getEntityReference() {
		return entityReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntityReference(Reference newEntityReference, NotificationChain msgs) {
		Reference oldEntityReference = entityReference;
		entityReference = newEntityReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_VALUED_ITEM__ENTITY_REFERENCE, oldEntityReference, newEntityReference);
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
	public void setEntityReference(Reference newEntityReference) {
		if (newEntityReference != entityReference) {
			NotificationChain msgs = null;
			if (entityReference != null)
				msgs = ((InternalEObject)entityReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_VALUED_ITEM__ENTITY_REFERENCE, null, msgs);
			if (newEntityReference != null)
				msgs = ((InternalEObject)newEntityReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_VALUED_ITEM__ENTITY_REFERENCE, null, msgs);
			msgs = basicSetEntityReference(newEntityReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_VALUED_ITEM__ENTITY_REFERENCE, newEntityReference, newEntityReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_VALUED_ITEM__IDENTIFIER, oldIdentifier, newIdentifier);
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
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_VALUED_ITEM__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_VALUED_ITEM__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_VALUED_ITEM__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getEffectiveTime() {
		return effectiveTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffectiveTime(DateTime newEffectiveTime, NotificationChain msgs) {
		DateTime oldEffectiveTime = effectiveTime;
		effectiveTime = newEffectiveTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_VALUED_ITEM__EFFECTIVE_TIME, oldEffectiveTime, newEffectiveTime);
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
	public void setEffectiveTime(DateTime newEffectiveTime) {
		if (newEffectiveTime != effectiveTime) {
			NotificationChain msgs = null;
			if (effectiveTime != null)
				msgs = ((InternalEObject)effectiveTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_VALUED_ITEM__EFFECTIVE_TIME, null, msgs);
			if (newEffectiveTime != null)
				msgs = ((InternalEObject)newEffectiveTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_VALUED_ITEM__EFFECTIVE_TIME, null, msgs);
			msgs = basicSetEffectiveTime(newEffectiveTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_VALUED_ITEM__EFFECTIVE_TIME, newEffectiveTime, newEffectiveTime));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_VALUED_ITEM__QUANTITY, oldQuantity, newQuantity);
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
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_VALUED_ITEM__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_VALUED_ITEM__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_VALUED_ITEM__QUANTITY, newQuantity, newQuantity));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_VALUED_ITEM__UNIT_PRICE, oldUnitPrice, newUnitPrice);
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
				msgs = ((InternalEObject)unitPrice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_VALUED_ITEM__UNIT_PRICE, null, msgs);
			if (newUnitPrice != null)
				msgs = ((InternalEObject)newUnitPrice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_VALUED_ITEM__UNIT_PRICE, null, msgs);
			msgs = basicSetUnitPrice(newUnitPrice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_VALUED_ITEM__UNIT_PRICE, newUnitPrice, newUnitPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getFactor() {
		return factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFactor(Decimal newFactor, NotificationChain msgs) {
		Decimal oldFactor = factor;
		factor = newFactor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_VALUED_ITEM__FACTOR, oldFactor, newFactor);
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
	public void setFactor(Decimal newFactor) {
		if (newFactor != factor) {
			NotificationChain msgs = null;
			if (factor != null)
				msgs = ((InternalEObject)factor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_VALUED_ITEM__FACTOR, null, msgs);
			if (newFactor != null)
				msgs = ((InternalEObject)newFactor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_VALUED_ITEM__FACTOR, null, msgs);
			msgs = basicSetFactor(newFactor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_VALUED_ITEM__FACTOR, newFactor, newFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getPoints() {
		return points;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPoints(Decimal newPoints, NotificationChain msgs) {
		Decimal oldPoints = points;
		points = newPoints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_VALUED_ITEM__POINTS, oldPoints, newPoints);
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
	public void setPoints(Decimal newPoints) {
		if (newPoints != points) {
			NotificationChain msgs = null;
			if (points != null)
				msgs = ((InternalEObject)points).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_VALUED_ITEM__POINTS, null, msgs);
			if (newPoints != null)
				msgs = ((InternalEObject)newPoints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_VALUED_ITEM__POINTS, null, msgs);
			msgs = basicSetPoints(newPoints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_VALUED_ITEM__POINTS, newPoints, newPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Money getNet() {
		return net;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNet(Money newNet, NotificationChain msgs) {
		Money oldNet = net;
		net = newNet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_VALUED_ITEM__NET, oldNet, newNet);
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
	public void setNet(Money newNet) {
		if (newNet != net) {
			NotificationChain msgs = null;
			if (net != null)
				msgs = ((InternalEObject)net).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_VALUED_ITEM__NET, null, msgs);
			if (newNet != null)
				msgs = ((InternalEObject)newNet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_VALUED_ITEM__NET, null, msgs);
			msgs = basicSetNet(newNet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_VALUED_ITEM__NET, newNet, newNet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getPayment() {
		return payment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPayment(org.hl7.fhir.String newPayment, NotificationChain msgs) {
		org.hl7.fhir.String oldPayment = payment;
		payment = newPayment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_VALUED_ITEM__PAYMENT, oldPayment, newPayment);
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
	public void setPayment(org.hl7.fhir.String newPayment) {
		if (newPayment != payment) {
			NotificationChain msgs = null;
			if (payment != null)
				msgs = ((InternalEObject)payment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_VALUED_ITEM__PAYMENT, null, msgs);
			if (newPayment != null)
				msgs = ((InternalEObject)newPayment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_VALUED_ITEM__PAYMENT, null, msgs);
			msgs = basicSetPayment(newPayment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_VALUED_ITEM__PAYMENT, newPayment, newPayment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getPaymentDate() {
		return paymentDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaymentDate(DateTime newPaymentDate, NotificationChain msgs) {
		DateTime oldPaymentDate = paymentDate;
		paymentDate = newPaymentDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_VALUED_ITEM__PAYMENT_DATE, oldPaymentDate, newPaymentDate);
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
	public void setPaymentDate(DateTime newPaymentDate) {
		if (newPaymentDate != paymentDate) {
			NotificationChain msgs = null;
			if (paymentDate != null)
				msgs = ((InternalEObject)paymentDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_VALUED_ITEM__PAYMENT_DATE, null, msgs);
			if (newPaymentDate != null)
				msgs = ((InternalEObject)newPaymentDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_VALUED_ITEM__PAYMENT_DATE, null, msgs);
			msgs = basicSetPaymentDate(newPaymentDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_VALUED_ITEM__PAYMENT_DATE, newPaymentDate, newPaymentDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getResponsible() {
		return responsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponsible(Reference newResponsible, NotificationChain msgs) {
		Reference oldResponsible = responsible;
		responsible = newResponsible;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_VALUED_ITEM__RESPONSIBLE, oldResponsible, newResponsible);
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
	public void setResponsible(Reference newResponsible) {
		if (newResponsible != responsible) {
			NotificationChain msgs = null;
			if (responsible != null)
				msgs = ((InternalEObject)responsible).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_VALUED_ITEM__RESPONSIBLE, null, msgs);
			if (newResponsible != null)
				msgs = ((InternalEObject)newResponsible).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_VALUED_ITEM__RESPONSIBLE, null, msgs);
			msgs = basicSetResponsible(newResponsible, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_VALUED_ITEM__RESPONSIBLE, newResponsible, newResponsible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getRecipient() {
		return recipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecipient(Reference newRecipient, NotificationChain msgs) {
		Reference oldRecipient = recipient;
		recipient = newRecipient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_VALUED_ITEM__RECIPIENT, oldRecipient, newRecipient);
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
	public void setRecipient(Reference newRecipient) {
		if (newRecipient != recipient) {
			NotificationChain msgs = null;
			if (recipient != null)
				msgs = ((InternalEObject)recipient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_VALUED_ITEM__RECIPIENT, null, msgs);
			if (newRecipient != null)
				msgs = ((InternalEObject)newRecipient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_VALUED_ITEM__RECIPIENT, null, msgs);
			msgs = basicSetRecipient(newRecipient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_VALUED_ITEM__RECIPIENT, newRecipient, newRecipient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.hl7.fhir.String> getLinkId() {
		if (linkId == null) {
			linkId = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.CONTRACT_VALUED_ITEM__LINK_ID);
		}
		return linkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnsignedInt> getSecurityLabelNumber() {
		if (securityLabelNumber == null) {
			securityLabelNumber = new EObjectContainmentEList<UnsignedInt>(UnsignedInt.class, this, FhirPackage.CONTRACT_VALUED_ITEM__SECURITY_LABEL_NUMBER);
		}
		return securityLabelNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CONTRACT_VALUED_ITEM__ENTITY_CODEABLE_CONCEPT:
				return basicSetEntityCodeableConcept(null, msgs);
			case FhirPackage.CONTRACT_VALUED_ITEM__ENTITY_REFERENCE:
				return basicSetEntityReference(null, msgs);
			case FhirPackage.CONTRACT_VALUED_ITEM__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.CONTRACT_VALUED_ITEM__EFFECTIVE_TIME:
				return basicSetEffectiveTime(null, msgs);
			case FhirPackage.CONTRACT_VALUED_ITEM__QUANTITY:
				return basicSetQuantity(null, msgs);
			case FhirPackage.CONTRACT_VALUED_ITEM__UNIT_PRICE:
				return basicSetUnitPrice(null, msgs);
			case FhirPackage.CONTRACT_VALUED_ITEM__FACTOR:
				return basicSetFactor(null, msgs);
			case FhirPackage.CONTRACT_VALUED_ITEM__POINTS:
				return basicSetPoints(null, msgs);
			case FhirPackage.CONTRACT_VALUED_ITEM__NET:
				return basicSetNet(null, msgs);
			case FhirPackage.CONTRACT_VALUED_ITEM__PAYMENT:
				return basicSetPayment(null, msgs);
			case FhirPackage.CONTRACT_VALUED_ITEM__PAYMENT_DATE:
				return basicSetPaymentDate(null, msgs);
			case FhirPackage.CONTRACT_VALUED_ITEM__RESPONSIBLE:
				return basicSetResponsible(null, msgs);
			case FhirPackage.CONTRACT_VALUED_ITEM__RECIPIENT:
				return basicSetRecipient(null, msgs);
			case FhirPackage.CONTRACT_VALUED_ITEM__LINK_ID:
				return ((InternalEList<?>)getLinkId()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT_VALUED_ITEM__SECURITY_LABEL_NUMBER:
				return ((InternalEList<?>)getSecurityLabelNumber()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CONTRACT_VALUED_ITEM__ENTITY_CODEABLE_CONCEPT:
				return getEntityCodeableConcept();
			case FhirPackage.CONTRACT_VALUED_ITEM__ENTITY_REFERENCE:
				return getEntityReference();
			case FhirPackage.CONTRACT_VALUED_ITEM__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.CONTRACT_VALUED_ITEM__EFFECTIVE_TIME:
				return getEffectiveTime();
			case FhirPackage.CONTRACT_VALUED_ITEM__QUANTITY:
				return getQuantity();
			case FhirPackage.CONTRACT_VALUED_ITEM__UNIT_PRICE:
				return getUnitPrice();
			case FhirPackage.CONTRACT_VALUED_ITEM__FACTOR:
				return getFactor();
			case FhirPackage.CONTRACT_VALUED_ITEM__POINTS:
				return getPoints();
			case FhirPackage.CONTRACT_VALUED_ITEM__NET:
				return getNet();
			case FhirPackage.CONTRACT_VALUED_ITEM__PAYMENT:
				return getPayment();
			case FhirPackage.CONTRACT_VALUED_ITEM__PAYMENT_DATE:
				return getPaymentDate();
			case FhirPackage.CONTRACT_VALUED_ITEM__RESPONSIBLE:
				return getResponsible();
			case FhirPackage.CONTRACT_VALUED_ITEM__RECIPIENT:
				return getRecipient();
			case FhirPackage.CONTRACT_VALUED_ITEM__LINK_ID:
				return getLinkId();
			case FhirPackage.CONTRACT_VALUED_ITEM__SECURITY_LABEL_NUMBER:
				return getSecurityLabelNumber();
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
			case FhirPackage.CONTRACT_VALUED_ITEM__ENTITY_CODEABLE_CONCEPT:
				setEntityCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.CONTRACT_VALUED_ITEM__ENTITY_REFERENCE:
				setEntityReference((Reference)newValue);
				return;
			case FhirPackage.CONTRACT_VALUED_ITEM__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.CONTRACT_VALUED_ITEM__EFFECTIVE_TIME:
				setEffectiveTime((DateTime)newValue);
				return;
			case FhirPackage.CONTRACT_VALUED_ITEM__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case FhirPackage.CONTRACT_VALUED_ITEM__UNIT_PRICE:
				setUnitPrice((Money)newValue);
				return;
			case FhirPackage.CONTRACT_VALUED_ITEM__FACTOR:
				setFactor((Decimal)newValue);
				return;
			case FhirPackage.CONTRACT_VALUED_ITEM__POINTS:
				setPoints((Decimal)newValue);
				return;
			case FhirPackage.CONTRACT_VALUED_ITEM__NET:
				setNet((Money)newValue);
				return;
			case FhirPackage.CONTRACT_VALUED_ITEM__PAYMENT:
				setPayment((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CONTRACT_VALUED_ITEM__PAYMENT_DATE:
				setPaymentDate((DateTime)newValue);
				return;
			case FhirPackage.CONTRACT_VALUED_ITEM__RESPONSIBLE:
				setResponsible((Reference)newValue);
				return;
			case FhirPackage.CONTRACT_VALUED_ITEM__RECIPIENT:
				setRecipient((Reference)newValue);
				return;
			case FhirPackage.CONTRACT_VALUED_ITEM__LINK_ID:
				getLinkId().clear();
				getLinkId().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.CONTRACT_VALUED_ITEM__SECURITY_LABEL_NUMBER:
				getSecurityLabelNumber().clear();
				getSecurityLabelNumber().addAll((Collection<? extends UnsignedInt>)newValue);
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
			case FhirPackage.CONTRACT_VALUED_ITEM__ENTITY_CODEABLE_CONCEPT:
				setEntityCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.CONTRACT_VALUED_ITEM__ENTITY_REFERENCE:
				setEntityReference((Reference)null);
				return;
			case FhirPackage.CONTRACT_VALUED_ITEM__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.CONTRACT_VALUED_ITEM__EFFECTIVE_TIME:
				setEffectiveTime((DateTime)null);
				return;
			case FhirPackage.CONTRACT_VALUED_ITEM__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case FhirPackage.CONTRACT_VALUED_ITEM__UNIT_PRICE:
				setUnitPrice((Money)null);
				return;
			case FhirPackage.CONTRACT_VALUED_ITEM__FACTOR:
				setFactor((Decimal)null);
				return;
			case FhirPackage.CONTRACT_VALUED_ITEM__POINTS:
				setPoints((Decimal)null);
				return;
			case FhirPackage.CONTRACT_VALUED_ITEM__NET:
				setNet((Money)null);
				return;
			case FhirPackage.CONTRACT_VALUED_ITEM__PAYMENT:
				setPayment((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CONTRACT_VALUED_ITEM__PAYMENT_DATE:
				setPaymentDate((DateTime)null);
				return;
			case FhirPackage.CONTRACT_VALUED_ITEM__RESPONSIBLE:
				setResponsible((Reference)null);
				return;
			case FhirPackage.CONTRACT_VALUED_ITEM__RECIPIENT:
				setRecipient((Reference)null);
				return;
			case FhirPackage.CONTRACT_VALUED_ITEM__LINK_ID:
				getLinkId().clear();
				return;
			case FhirPackage.CONTRACT_VALUED_ITEM__SECURITY_LABEL_NUMBER:
				getSecurityLabelNumber().clear();
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
			case FhirPackage.CONTRACT_VALUED_ITEM__ENTITY_CODEABLE_CONCEPT:
				return entityCodeableConcept != null;
			case FhirPackage.CONTRACT_VALUED_ITEM__ENTITY_REFERENCE:
				return entityReference != null;
			case FhirPackage.CONTRACT_VALUED_ITEM__IDENTIFIER:
				return identifier != null;
			case FhirPackage.CONTRACT_VALUED_ITEM__EFFECTIVE_TIME:
				return effectiveTime != null;
			case FhirPackage.CONTRACT_VALUED_ITEM__QUANTITY:
				return quantity != null;
			case FhirPackage.CONTRACT_VALUED_ITEM__UNIT_PRICE:
				return unitPrice != null;
			case FhirPackage.CONTRACT_VALUED_ITEM__FACTOR:
				return factor != null;
			case FhirPackage.CONTRACT_VALUED_ITEM__POINTS:
				return points != null;
			case FhirPackage.CONTRACT_VALUED_ITEM__NET:
				return net != null;
			case FhirPackage.CONTRACT_VALUED_ITEM__PAYMENT:
				return payment != null;
			case FhirPackage.CONTRACT_VALUED_ITEM__PAYMENT_DATE:
				return paymentDate != null;
			case FhirPackage.CONTRACT_VALUED_ITEM__RESPONSIBLE:
				return responsible != null;
			case FhirPackage.CONTRACT_VALUED_ITEM__RECIPIENT:
				return recipient != null;
			case FhirPackage.CONTRACT_VALUED_ITEM__LINK_ID:
				return linkId != null && !linkId.isEmpty();
			case FhirPackage.CONTRACT_VALUED_ITEM__SECURITY_LABEL_NUMBER:
				return securityLabelNumber != null && !securityLabelNumber.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContractValuedItemImpl
