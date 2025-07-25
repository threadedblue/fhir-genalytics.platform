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

import org.hl7.fhir.Annotation;
import org.hl7.fhir.Canonical;
import org.hl7.fhir.ChargeItem;
import org.hl7.fhir.ChargeItemPerformer;
import org.hl7.fhir.ChargeItemStatus;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Money;
import org.hl7.fhir.Period;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Timing;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Charge Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ChargeItemImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ChargeItemImpl#getDefinitionUri <em>Definition Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ChargeItemImpl#getDefinitionCanonical <em>Definition Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ChargeItemImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ChargeItemImpl#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ChargeItemImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ChargeItemImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ChargeItemImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ChargeItemImpl#getOccurrenceDateTime <em>Occurrence Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ChargeItemImpl#getOccurrencePeriod <em>Occurrence Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ChargeItemImpl#getOccurrenceTiming <em>Occurrence Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ChargeItemImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ChargeItemImpl#getPerformingOrganization <em>Performing Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ChargeItemImpl#getRequestingOrganization <em>Requesting Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ChargeItemImpl#getCostCenter <em>Cost Center</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ChargeItemImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ChargeItemImpl#getBodysite <em>Bodysite</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ChargeItemImpl#getFactorOverride <em>Factor Override</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ChargeItemImpl#getPriceOverride <em>Price Override</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ChargeItemImpl#getOverrideReason <em>Override Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ChargeItemImpl#getEnterer <em>Enterer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ChargeItemImpl#getEnteredDate <em>Entered Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ChargeItemImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ChargeItemImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ChargeItemImpl#getProductReference <em>Product Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ChargeItemImpl#getProductCodeableConcept <em>Product Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ChargeItemImpl#getAccount <em>Account</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ChargeItemImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ChargeItemImpl#getSupportingInformation <em>Supporting Information</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChargeItemImpl extends DomainResourceImpl implements ChargeItem {
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
	 * The cached value of the '{@link #getDefinitionUri() <em>Definition Uri</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionUri()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> definitionUri;

	/**
	 * The cached value of the '{@link #getDefinitionCanonical() <em>Definition Canonical</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionCanonical()
	 * @generated
	 * @ordered
	 */
	protected EList<Canonical> definitionCanonical;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected ChargeItemStatus status;

	/**
	 * The cached value of the '{@link #getPartOf() <em>Part Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> partOf;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Reference subject;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Reference context;

	/**
	 * The cached value of the '{@link #getOccurrenceDateTime() <em>Occurrence Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrenceDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime occurrenceDateTime;

	/**
	 * The cached value of the '{@link #getOccurrencePeriod() <em>Occurrence Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrencePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period occurrencePeriod;

	/**
	 * The cached value of the '{@link #getOccurrenceTiming() <em>Occurrence Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrenceTiming()
	 * @generated
	 * @ordered
	 */
	protected Timing occurrenceTiming;

	/**
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected EList<ChargeItemPerformer> performer;

	/**
	 * The cached value of the '{@link #getPerformingOrganization() <em>Performing Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformingOrganization()
	 * @generated
	 * @ordered
	 */
	protected Reference performingOrganization;

	/**
	 * The cached value of the '{@link #getRequestingOrganization() <em>Requesting Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestingOrganization()
	 * @generated
	 * @ordered
	 */
	protected Reference requestingOrganization;

	/**
	 * The cached value of the '{@link #getCostCenter() <em>Cost Center</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostCenter()
	 * @generated
	 * @ordered
	 */
	protected Reference costCenter;

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
	 * The cached value of the '{@link #getBodysite() <em>Bodysite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodysite()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> bodysite;

	/**
	 * The cached value of the '{@link #getFactorOverride() <em>Factor Override</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactorOverride()
	 * @generated
	 * @ordered
	 */
	protected Decimal factorOverride;

	/**
	 * The cached value of the '{@link #getPriceOverride() <em>Price Override</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriceOverride()
	 * @generated
	 * @ordered
	 */
	protected Money priceOverride;

	/**
	 * The cached value of the '{@link #getOverrideReason() <em>Override Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverrideReason()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String overrideReason;

	/**
	 * The cached value of the '{@link #getEnterer() <em>Enterer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnterer()
	 * @generated
	 * @ordered
	 */
	protected Reference enterer;

	/**
	 * The cached value of the '{@link #getEnteredDate() <em>Entered Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnteredDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime enteredDate;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> reason;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> service;

	/**
	 * The cached value of the '{@link #getProductReference() <em>Product Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductReference()
	 * @generated
	 * @ordered
	 */
	protected Reference productReference;

	/**
	 * The cached value of the '{@link #getProductCodeableConcept() <em>Product Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept productCodeableConcept;

	/**
	 * The cached value of the '{@link #getAccount() <em>Account</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccount()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> account;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> note;

	/**
	 * The cached value of the '{@link #getSupportingInformation() <em>Supporting Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> supportingInformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChargeItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getChargeItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.CHARGE_ITEM__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Uri> getDefinitionUri() {
		if (definitionUri == null) {
			definitionUri = new EObjectContainmentEList<Uri>(Uri.class, this, FhirPackage.CHARGE_ITEM__DEFINITION_URI);
		}
		return definitionUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Canonical> getDefinitionCanonical() {
		if (definitionCanonical == null) {
			definitionCanonical = new EObjectContainmentEList<Canonical>(Canonical.class, this, FhirPackage.CHARGE_ITEM__DEFINITION_CANONICAL);
		}
		return definitionCanonical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChargeItemStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(ChargeItemStatus newStatus, NotificationChain msgs) {
		ChargeItemStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CHARGE_ITEM__STATUS, oldStatus, newStatus);
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
	public void setStatus(ChargeItemStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CHARGE_ITEM__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CHARGE_ITEM__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CHARGE_ITEM__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getPartOf() {
		if (partOf == null) {
			partOf = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CHARGE_ITEM__PART_OF);
		}
		return partOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CodeableConcept newCode, NotificationChain msgs) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CHARGE_ITEM__CODE, oldCode, newCode);
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
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CHARGE_ITEM__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CHARGE_ITEM__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CHARGE_ITEM__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(Reference newSubject, NotificationChain msgs) {
		Reference oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CHARGE_ITEM__SUBJECT, oldSubject, newSubject);
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
	public void setSubject(Reference newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null)
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CHARGE_ITEM__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CHARGE_ITEM__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CHARGE_ITEM__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(Reference newContext, NotificationChain msgs) {
		Reference oldContext = context;
		context = newContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CHARGE_ITEM__CONTEXT, oldContext, newContext);
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
	public void setContext(Reference newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CHARGE_ITEM__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CHARGE_ITEM__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CHARGE_ITEM__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getOccurrenceDateTime() {
		return occurrenceDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurrenceDateTime(DateTime newOccurrenceDateTime, NotificationChain msgs) {
		DateTime oldOccurrenceDateTime = occurrenceDateTime;
		occurrenceDateTime = newOccurrenceDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CHARGE_ITEM__OCCURRENCE_DATE_TIME, oldOccurrenceDateTime, newOccurrenceDateTime);
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
	public void setOccurrenceDateTime(DateTime newOccurrenceDateTime) {
		if (newOccurrenceDateTime != occurrenceDateTime) {
			NotificationChain msgs = null;
			if (occurrenceDateTime != null)
				msgs = ((InternalEObject)occurrenceDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CHARGE_ITEM__OCCURRENCE_DATE_TIME, null, msgs);
			if (newOccurrenceDateTime != null)
				msgs = ((InternalEObject)newOccurrenceDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CHARGE_ITEM__OCCURRENCE_DATE_TIME, null, msgs);
			msgs = basicSetOccurrenceDateTime(newOccurrenceDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CHARGE_ITEM__OCCURRENCE_DATE_TIME, newOccurrenceDateTime, newOccurrenceDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getOccurrencePeriod() {
		return occurrencePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurrencePeriod(Period newOccurrencePeriod, NotificationChain msgs) {
		Period oldOccurrencePeriod = occurrencePeriod;
		occurrencePeriod = newOccurrencePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CHARGE_ITEM__OCCURRENCE_PERIOD, oldOccurrencePeriod, newOccurrencePeriod);
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
	public void setOccurrencePeriod(Period newOccurrencePeriod) {
		if (newOccurrencePeriod != occurrencePeriod) {
			NotificationChain msgs = null;
			if (occurrencePeriod != null)
				msgs = ((InternalEObject)occurrencePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CHARGE_ITEM__OCCURRENCE_PERIOD, null, msgs);
			if (newOccurrencePeriod != null)
				msgs = ((InternalEObject)newOccurrencePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CHARGE_ITEM__OCCURRENCE_PERIOD, null, msgs);
			msgs = basicSetOccurrencePeriod(newOccurrencePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CHARGE_ITEM__OCCURRENCE_PERIOD, newOccurrencePeriod, newOccurrencePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Timing getOccurrenceTiming() {
		return occurrenceTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurrenceTiming(Timing newOccurrenceTiming, NotificationChain msgs) {
		Timing oldOccurrenceTiming = occurrenceTiming;
		occurrenceTiming = newOccurrenceTiming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CHARGE_ITEM__OCCURRENCE_TIMING, oldOccurrenceTiming, newOccurrenceTiming);
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
	public void setOccurrenceTiming(Timing newOccurrenceTiming) {
		if (newOccurrenceTiming != occurrenceTiming) {
			NotificationChain msgs = null;
			if (occurrenceTiming != null)
				msgs = ((InternalEObject)occurrenceTiming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CHARGE_ITEM__OCCURRENCE_TIMING, null, msgs);
			if (newOccurrenceTiming != null)
				msgs = ((InternalEObject)newOccurrenceTiming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CHARGE_ITEM__OCCURRENCE_TIMING, null, msgs);
			msgs = basicSetOccurrenceTiming(newOccurrenceTiming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CHARGE_ITEM__OCCURRENCE_TIMING, newOccurrenceTiming, newOccurrenceTiming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChargeItemPerformer> getPerformer() {
		if (performer == null) {
			performer = new EObjectContainmentEList<ChargeItemPerformer>(ChargeItemPerformer.class, this, FhirPackage.CHARGE_ITEM__PERFORMER);
		}
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getPerformingOrganization() {
		return performingOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformingOrganization(Reference newPerformingOrganization, NotificationChain msgs) {
		Reference oldPerformingOrganization = performingOrganization;
		performingOrganization = newPerformingOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CHARGE_ITEM__PERFORMING_ORGANIZATION, oldPerformingOrganization, newPerformingOrganization);
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
	public void setPerformingOrganization(Reference newPerformingOrganization) {
		if (newPerformingOrganization != performingOrganization) {
			NotificationChain msgs = null;
			if (performingOrganization != null)
				msgs = ((InternalEObject)performingOrganization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CHARGE_ITEM__PERFORMING_ORGANIZATION, null, msgs);
			if (newPerformingOrganization != null)
				msgs = ((InternalEObject)newPerformingOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CHARGE_ITEM__PERFORMING_ORGANIZATION, null, msgs);
			msgs = basicSetPerformingOrganization(newPerformingOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CHARGE_ITEM__PERFORMING_ORGANIZATION, newPerformingOrganization, newPerformingOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getRequestingOrganization() {
		return requestingOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestingOrganization(Reference newRequestingOrganization, NotificationChain msgs) {
		Reference oldRequestingOrganization = requestingOrganization;
		requestingOrganization = newRequestingOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CHARGE_ITEM__REQUESTING_ORGANIZATION, oldRequestingOrganization, newRequestingOrganization);
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
	public void setRequestingOrganization(Reference newRequestingOrganization) {
		if (newRequestingOrganization != requestingOrganization) {
			NotificationChain msgs = null;
			if (requestingOrganization != null)
				msgs = ((InternalEObject)requestingOrganization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CHARGE_ITEM__REQUESTING_ORGANIZATION, null, msgs);
			if (newRequestingOrganization != null)
				msgs = ((InternalEObject)newRequestingOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CHARGE_ITEM__REQUESTING_ORGANIZATION, null, msgs);
			msgs = basicSetRequestingOrganization(newRequestingOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CHARGE_ITEM__REQUESTING_ORGANIZATION, newRequestingOrganization, newRequestingOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getCostCenter() {
		return costCenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCostCenter(Reference newCostCenter, NotificationChain msgs) {
		Reference oldCostCenter = costCenter;
		costCenter = newCostCenter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CHARGE_ITEM__COST_CENTER, oldCostCenter, newCostCenter);
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
	public void setCostCenter(Reference newCostCenter) {
		if (newCostCenter != costCenter) {
			NotificationChain msgs = null;
			if (costCenter != null)
				msgs = ((InternalEObject)costCenter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CHARGE_ITEM__COST_CENTER, null, msgs);
			if (newCostCenter != null)
				msgs = ((InternalEObject)newCostCenter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CHARGE_ITEM__COST_CENTER, null, msgs);
			msgs = basicSetCostCenter(newCostCenter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CHARGE_ITEM__COST_CENTER, newCostCenter, newCostCenter));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CHARGE_ITEM__QUANTITY, oldQuantity, newQuantity);
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
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CHARGE_ITEM__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CHARGE_ITEM__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CHARGE_ITEM__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getBodysite() {
		if (bodysite == null) {
			bodysite = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CHARGE_ITEM__BODYSITE);
		}
		return bodysite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getFactorOverride() {
		return factorOverride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFactorOverride(Decimal newFactorOverride, NotificationChain msgs) {
		Decimal oldFactorOverride = factorOverride;
		factorOverride = newFactorOverride;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CHARGE_ITEM__FACTOR_OVERRIDE, oldFactorOverride, newFactorOverride);
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
	public void setFactorOverride(Decimal newFactorOverride) {
		if (newFactorOverride != factorOverride) {
			NotificationChain msgs = null;
			if (factorOverride != null)
				msgs = ((InternalEObject)factorOverride).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CHARGE_ITEM__FACTOR_OVERRIDE, null, msgs);
			if (newFactorOverride != null)
				msgs = ((InternalEObject)newFactorOverride).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CHARGE_ITEM__FACTOR_OVERRIDE, null, msgs);
			msgs = basicSetFactorOverride(newFactorOverride, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CHARGE_ITEM__FACTOR_OVERRIDE, newFactorOverride, newFactorOverride));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Money getPriceOverride() {
		return priceOverride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriceOverride(Money newPriceOverride, NotificationChain msgs) {
		Money oldPriceOverride = priceOverride;
		priceOverride = newPriceOverride;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CHARGE_ITEM__PRICE_OVERRIDE, oldPriceOverride, newPriceOverride);
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
	public void setPriceOverride(Money newPriceOverride) {
		if (newPriceOverride != priceOverride) {
			NotificationChain msgs = null;
			if (priceOverride != null)
				msgs = ((InternalEObject)priceOverride).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CHARGE_ITEM__PRICE_OVERRIDE, null, msgs);
			if (newPriceOverride != null)
				msgs = ((InternalEObject)newPriceOverride).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CHARGE_ITEM__PRICE_OVERRIDE, null, msgs);
			msgs = basicSetPriceOverride(newPriceOverride, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CHARGE_ITEM__PRICE_OVERRIDE, newPriceOverride, newPriceOverride));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getOverrideReason() {
		return overrideReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOverrideReason(org.hl7.fhir.String newOverrideReason, NotificationChain msgs) {
		org.hl7.fhir.String oldOverrideReason = overrideReason;
		overrideReason = newOverrideReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CHARGE_ITEM__OVERRIDE_REASON, oldOverrideReason, newOverrideReason);
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
	public void setOverrideReason(org.hl7.fhir.String newOverrideReason) {
		if (newOverrideReason != overrideReason) {
			NotificationChain msgs = null;
			if (overrideReason != null)
				msgs = ((InternalEObject)overrideReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CHARGE_ITEM__OVERRIDE_REASON, null, msgs);
			if (newOverrideReason != null)
				msgs = ((InternalEObject)newOverrideReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CHARGE_ITEM__OVERRIDE_REASON, null, msgs);
			msgs = basicSetOverrideReason(newOverrideReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CHARGE_ITEM__OVERRIDE_REASON, newOverrideReason, newOverrideReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getEnterer() {
		return enterer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnterer(Reference newEnterer, NotificationChain msgs) {
		Reference oldEnterer = enterer;
		enterer = newEnterer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CHARGE_ITEM__ENTERER, oldEnterer, newEnterer);
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
	public void setEnterer(Reference newEnterer) {
		if (newEnterer != enterer) {
			NotificationChain msgs = null;
			if (enterer != null)
				msgs = ((InternalEObject)enterer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CHARGE_ITEM__ENTERER, null, msgs);
			if (newEnterer != null)
				msgs = ((InternalEObject)newEnterer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CHARGE_ITEM__ENTERER, null, msgs);
			msgs = basicSetEnterer(newEnterer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CHARGE_ITEM__ENTERER, newEnterer, newEnterer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getEnteredDate() {
		return enteredDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnteredDate(DateTime newEnteredDate, NotificationChain msgs) {
		DateTime oldEnteredDate = enteredDate;
		enteredDate = newEnteredDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CHARGE_ITEM__ENTERED_DATE, oldEnteredDate, newEnteredDate);
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
	public void setEnteredDate(DateTime newEnteredDate) {
		if (newEnteredDate != enteredDate) {
			NotificationChain msgs = null;
			if (enteredDate != null)
				msgs = ((InternalEObject)enteredDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CHARGE_ITEM__ENTERED_DATE, null, msgs);
			if (newEnteredDate != null)
				msgs = ((InternalEObject)newEnteredDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CHARGE_ITEM__ENTERED_DATE, null, msgs);
			msgs = basicSetEnteredDate(newEnteredDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CHARGE_ITEM__ENTERED_DATE, newEnteredDate, newEnteredDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getReason() {
		if (reason == null) {
			reason = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CHARGE_ITEM__REASON);
		}
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getService() {
		if (service == null) {
			service = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CHARGE_ITEM__SERVICE);
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getProductReference() {
		return productReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductReference(Reference newProductReference, NotificationChain msgs) {
		Reference oldProductReference = productReference;
		productReference = newProductReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CHARGE_ITEM__PRODUCT_REFERENCE, oldProductReference, newProductReference);
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
	public void setProductReference(Reference newProductReference) {
		if (newProductReference != productReference) {
			NotificationChain msgs = null;
			if (productReference != null)
				msgs = ((InternalEObject)productReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CHARGE_ITEM__PRODUCT_REFERENCE, null, msgs);
			if (newProductReference != null)
				msgs = ((InternalEObject)newProductReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CHARGE_ITEM__PRODUCT_REFERENCE, null, msgs);
			msgs = basicSetProductReference(newProductReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CHARGE_ITEM__PRODUCT_REFERENCE, newProductReference, newProductReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getProductCodeableConcept() {
		return productCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductCodeableConcept(CodeableConcept newProductCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldProductCodeableConcept = productCodeableConcept;
		productCodeableConcept = newProductCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CHARGE_ITEM__PRODUCT_CODEABLE_CONCEPT, oldProductCodeableConcept, newProductCodeableConcept);
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
	public void setProductCodeableConcept(CodeableConcept newProductCodeableConcept) {
		if (newProductCodeableConcept != productCodeableConcept) {
			NotificationChain msgs = null;
			if (productCodeableConcept != null)
				msgs = ((InternalEObject)productCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CHARGE_ITEM__PRODUCT_CODEABLE_CONCEPT, null, msgs);
			if (newProductCodeableConcept != null)
				msgs = ((InternalEObject)newProductCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CHARGE_ITEM__PRODUCT_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetProductCodeableConcept(newProductCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CHARGE_ITEM__PRODUCT_CODEABLE_CONCEPT, newProductCodeableConcept, newProductCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getAccount() {
		if (account == null) {
			account = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CHARGE_ITEM__ACCOUNT);
		}
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.CHARGE_ITEM__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSupportingInformation() {
		if (supportingInformation == null) {
			supportingInformation = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CHARGE_ITEM__SUPPORTING_INFORMATION);
		}
		return supportingInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CHARGE_ITEM__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.CHARGE_ITEM__DEFINITION_URI:
				return ((InternalEList<?>)getDefinitionUri()).basicRemove(otherEnd, msgs);
			case FhirPackage.CHARGE_ITEM__DEFINITION_CANONICAL:
				return ((InternalEList<?>)getDefinitionCanonical()).basicRemove(otherEnd, msgs);
			case FhirPackage.CHARGE_ITEM__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.CHARGE_ITEM__PART_OF:
				return ((InternalEList<?>)getPartOf()).basicRemove(otherEnd, msgs);
			case FhirPackage.CHARGE_ITEM__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.CHARGE_ITEM__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.CHARGE_ITEM__CONTEXT:
				return basicSetContext(null, msgs);
			case FhirPackage.CHARGE_ITEM__OCCURRENCE_DATE_TIME:
				return basicSetOccurrenceDateTime(null, msgs);
			case FhirPackage.CHARGE_ITEM__OCCURRENCE_PERIOD:
				return basicSetOccurrencePeriod(null, msgs);
			case FhirPackage.CHARGE_ITEM__OCCURRENCE_TIMING:
				return basicSetOccurrenceTiming(null, msgs);
			case FhirPackage.CHARGE_ITEM__PERFORMER:
				return ((InternalEList<?>)getPerformer()).basicRemove(otherEnd, msgs);
			case FhirPackage.CHARGE_ITEM__PERFORMING_ORGANIZATION:
				return basicSetPerformingOrganization(null, msgs);
			case FhirPackage.CHARGE_ITEM__REQUESTING_ORGANIZATION:
				return basicSetRequestingOrganization(null, msgs);
			case FhirPackage.CHARGE_ITEM__COST_CENTER:
				return basicSetCostCenter(null, msgs);
			case FhirPackage.CHARGE_ITEM__QUANTITY:
				return basicSetQuantity(null, msgs);
			case FhirPackage.CHARGE_ITEM__BODYSITE:
				return ((InternalEList<?>)getBodysite()).basicRemove(otherEnd, msgs);
			case FhirPackage.CHARGE_ITEM__FACTOR_OVERRIDE:
				return basicSetFactorOverride(null, msgs);
			case FhirPackage.CHARGE_ITEM__PRICE_OVERRIDE:
				return basicSetPriceOverride(null, msgs);
			case FhirPackage.CHARGE_ITEM__OVERRIDE_REASON:
				return basicSetOverrideReason(null, msgs);
			case FhirPackage.CHARGE_ITEM__ENTERER:
				return basicSetEnterer(null, msgs);
			case FhirPackage.CHARGE_ITEM__ENTERED_DATE:
				return basicSetEnteredDate(null, msgs);
			case FhirPackage.CHARGE_ITEM__REASON:
				return ((InternalEList<?>)getReason()).basicRemove(otherEnd, msgs);
			case FhirPackage.CHARGE_ITEM__SERVICE:
				return ((InternalEList<?>)getService()).basicRemove(otherEnd, msgs);
			case FhirPackage.CHARGE_ITEM__PRODUCT_REFERENCE:
				return basicSetProductReference(null, msgs);
			case FhirPackage.CHARGE_ITEM__PRODUCT_CODEABLE_CONCEPT:
				return basicSetProductCodeableConcept(null, msgs);
			case FhirPackage.CHARGE_ITEM__ACCOUNT:
				return ((InternalEList<?>)getAccount()).basicRemove(otherEnd, msgs);
			case FhirPackage.CHARGE_ITEM__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.CHARGE_ITEM__SUPPORTING_INFORMATION:
				return ((InternalEList<?>)getSupportingInformation()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CHARGE_ITEM__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.CHARGE_ITEM__DEFINITION_URI:
				return getDefinitionUri();
			case FhirPackage.CHARGE_ITEM__DEFINITION_CANONICAL:
				return getDefinitionCanonical();
			case FhirPackage.CHARGE_ITEM__STATUS:
				return getStatus();
			case FhirPackage.CHARGE_ITEM__PART_OF:
				return getPartOf();
			case FhirPackage.CHARGE_ITEM__CODE:
				return getCode();
			case FhirPackage.CHARGE_ITEM__SUBJECT:
				return getSubject();
			case FhirPackage.CHARGE_ITEM__CONTEXT:
				return getContext();
			case FhirPackage.CHARGE_ITEM__OCCURRENCE_DATE_TIME:
				return getOccurrenceDateTime();
			case FhirPackage.CHARGE_ITEM__OCCURRENCE_PERIOD:
				return getOccurrencePeriod();
			case FhirPackage.CHARGE_ITEM__OCCURRENCE_TIMING:
				return getOccurrenceTiming();
			case FhirPackage.CHARGE_ITEM__PERFORMER:
				return getPerformer();
			case FhirPackage.CHARGE_ITEM__PERFORMING_ORGANIZATION:
				return getPerformingOrganization();
			case FhirPackage.CHARGE_ITEM__REQUESTING_ORGANIZATION:
				return getRequestingOrganization();
			case FhirPackage.CHARGE_ITEM__COST_CENTER:
				return getCostCenter();
			case FhirPackage.CHARGE_ITEM__QUANTITY:
				return getQuantity();
			case FhirPackage.CHARGE_ITEM__BODYSITE:
				return getBodysite();
			case FhirPackage.CHARGE_ITEM__FACTOR_OVERRIDE:
				return getFactorOverride();
			case FhirPackage.CHARGE_ITEM__PRICE_OVERRIDE:
				return getPriceOverride();
			case FhirPackage.CHARGE_ITEM__OVERRIDE_REASON:
				return getOverrideReason();
			case FhirPackage.CHARGE_ITEM__ENTERER:
				return getEnterer();
			case FhirPackage.CHARGE_ITEM__ENTERED_DATE:
				return getEnteredDate();
			case FhirPackage.CHARGE_ITEM__REASON:
				return getReason();
			case FhirPackage.CHARGE_ITEM__SERVICE:
				return getService();
			case FhirPackage.CHARGE_ITEM__PRODUCT_REFERENCE:
				return getProductReference();
			case FhirPackage.CHARGE_ITEM__PRODUCT_CODEABLE_CONCEPT:
				return getProductCodeableConcept();
			case FhirPackage.CHARGE_ITEM__ACCOUNT:
				return getAccount();
			case FhirPackage.CHARGE_ITEM__NOTE:
				return getNote();
			case FhirPackage.CHARGE_ITEM__SUPPORTING_INFORMATION:
				return getSupportingInformation();
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
			case FhirPackage.CHARGE_ITEM__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.CHARGE_ITEM__DEFINITION_URI:
				getDefinitionUri().clear();
				getDefinitionUri().addAll((Collection<? extends Uri>)newValue);
				return;
			case FhirPackage.CHARGE_ITEM__DEFINITION_CANONICAL:
				getDefinitionCanonical().clear();
				getDefinitionCanonical().addAll((Collection<? extends Canonical>)newValue);
				return;
			case FhirPackage.CHARGE_ITEM__STATUS:
				setStatus((ChargeItemStatus)newValue);
				return;
			case FhirPackage.CHARGE_ITEM__PART_OF:
				getPartOf().clear();
				getPartOf().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CHARGE_ITEM__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.CHARGE_ITEM__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.CHARGE_ITEM__CONTEXT:
				setContext((Reference)newValue);
				return;
			case FhirPackage.CHARGE_ITEM__OCCURRENCE_DATE_TIME:
				setOccurrenceDateTime((DateTime)newValue);
				return;
			case FhirPackage.CHARGE_ITEM__OCCURRENCE_PERIOD:
				setOccurrencePeriod((Period)newValue);
				return;
			case FhirPackage.CHARGE_ITEM__OCCURRENCE_TIMING:
				setOccurrenceTiming((Timing)newValue);
				return;
			case FhirPackage.CHARGE_ITEM__PERFORMER:
				getPerformer().clear();
				getPerformer().addAll((Collection<? extends ChargeItemPerformer>)newValue);
				return;
			case FhirPackage.CHARGE_ITEM__PERFORMING_ORGANIZATION:
				setPerformingOrganization((Reference)newValue);
				return;
			case FhirPackage.CHARGE_ITEM__REQUESTING_ORGANIZATION:
				setRequestingOrganization((Reference)newValue);
				return;
			case FhirPackage.CHARGE_ITEM__COST_CENTER:
				setCostCenter((Reference)newValue);
				return;
			case FhirPackage.CHARGE_ITEM__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case FhirPackage.CHARGE_ITEM__BODYSITE:
				getBodysite().clear();
				getBodysite().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CHARGE_ITEM__FACTOR_OVERRIDE:
				setFactorOverride((Decimal)newValue);
				return;
			case FhirPackage.CHARGE_ITEM__PRICE_OVERRIDE:
				setPriceOverride((Money)newValue);
				return;
			case FhirPackage.CHARGE_ITEM__OVERRIDE_REASON:
				setOverrideReason((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CHARGE_ITEM__ENTERER:
				setEnterer((Reference)newValue);
				return;
			case FhirPackage.CHARGE_ITEM__ENTERED_DATE:
				setEnteredDate((DateTime)newValue);
				return;
			case FhirPackage.CHARGE_ITEM__REASON:
				getReason().clear();
				getReason().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CHARGE_ITEM__SERVICE:
				getService().clear();
				getService().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CHARGE_ITEM__PRODUCT_REFERENCE:
				setProductReference((Reference)newValue);
				return;
			case FhirPackage.CHARGE_ITEM__PRODUCT_CODEABLE_CONCEPT:
				setProductCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.CHARGE_ITEM__ACCOUNT:
				getAccount().clear();
				getAccount().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CHARGE_ITEM__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.CHARGE_ITEM__SUPPORTING_INFORMATION:
				getSupportingInformation().clear();
				getSupportingInformation().addAll((Collection<? extends Reference>)newValue);
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
			case FhirPackage.CHARGE_ITEM__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.CHARGE_ITEM__DEFINITION_URI:
				getDefinitionUri().clear();
				return;
			case FhirPackage.CHARGE_ITEM__DEFINITION_CANONICAL:
				getDefinitionCanonical().clear();
				return;
			case FhirPackage.CHARGE_ITEM__STATUS:
				setStatus((ChargeItemStatus)null);
				return;
			case FhirPackage.CHARGE_ITEM__PART_OF:
				getPartOf().clear();
				return;
			case FhirPackage.CHARGE_ITEM__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.CHARGE_ITEM__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.CHARGE_ITEM__CONTEXT:
				setContext((Reference)null);
				return;
			case FhirPackage.CHARGE_ITEM__OCCURRENCE_DATE_TIME:
				setOccurrenceDateTime((DateTime)null);
				return;
			case FhirPackage.CHARGE_ITEM__OCCURRENCE_PERIOD:
				setOccurrencePeriod((Period)null);
				return;
			case FhirPackage.CHARGE_ITEM__OCCURRENCE_TIMING:
				setOccurrenceTiming((Timing)null);
				return;
			case FhirPackage.CHARGE_ITEM__PERFORMER:
				getPerformer().clear();
				return;
			case FhirPackage.CHARGE_ITEM__PERFORMING_ORGANIZATION:
				setPerformingOrganization((Reference)null);
				return;
			case FhirPackage.CHARGE_ITEM__REQUESTING_ORGANIZATION:
				setRequestingOrganization((Reference)null);
				return;
			case FhirPackage.CHARGE_ITEM__COST_CENTER:
				setCostCenter((Reference)null);
				return;
			case FhirPackage.CHARGE_ITEM__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case FhirPackage.CHARGE_ITEM__BODYSITE:
				getBodysite().clear();
				return;
			case FhirPackage.CHARGE_ITEM__FACTOR_OVERRIDE:
				setFactorOverride((Decimal)null);
				return;
			case FhirPackage.CHARGE_ITEM__PRICE_OVERRIDE:
				setPriceOverride((Money)null);
				return;
			case FhirPackage.CHARGE_ITEM__OVERRIDE_REASON:
				setOverrideReason((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CHARGE_ITEM__ENTERER:
				setEnterer((Reference)null);
				return;
			case FhirPackage.CHARGE_ITEM__ENTERED_DATE:
				setEnteredDate((DateTime)null);
				return;
			case FhirPackage.CHARGE_ITEM__REASON:
				getReason().clear();
				return;
			case FhirPackage.CHARGE_ITEM__SERVICE:
				getService().clear();
				return;
			case FhirPackage.CHARGE_ITEM__PRODUCT_REFERENCE:
				setProductReference((Reference)null);
				return;
			case FhirPackage.CHARGE_ITEM__PRODUCT_CODEABLE_CONCEPT:
				setProductCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.CHARGE_ITEM__ACCOUNT:
				getAccount().clear();
				return;
			case FhirPackage.CHARGE_ITEM__NOTE:
				getNote().clear();
				return;
			case FhirPackage.CHARGE_ITEM__SUPPORTING_INFORMATION:
				getSupportingInformation().clear();
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
			case FhirPackage.CHARGE_ITEM__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.CHARGE_ITEM__DEFINITION_URI:
				return definitionUri != null && !definitionUri.isEmpty();
			case FhirPackage.CHARGE_ITEM__DEFINITION_CANONICAL:
				return definitionCanonical != null && !definitionCanonical.isEmpty();
			case FhirPackage.CHARGE_ITEM__STATUS:
				return status != null;
			case FhirPackage.CHARGE_ITEM__PART_OF:
				return partOf != null && !partOf.isEmpty();
			case FhirPackage.CHARGE_ITEM__CODE:
				return code != null;
			case FhirPackage.CHARGE_ITEM__SUBJECT:
				return subject != null;
			case FhirPackage.CHARGE_ITEM__CONTEXT:
				return context != null;
			case FhirPackage.CHARGE_ITEM__OCCURRENCE_DATE_TIME:
				return occurrenceDateTime != null;
			case FhirPackage.CHARGE_ITEM__OCCURRENCE_PERIOD:
				return occurrencePeriod != null;
			case FhirPackage.CHARGE_ITEM__OCCURRENCE_TIMING:
				return occurrenceTiming != null;
			case FhirPackage.CHARGE_ITEM__PERFORMER:
				return performer != null && !performer.isEmpty();
			case FhirPackage.CHARGE_ITEM__PERFORMING_ORGANIZATION:
				return performingOrganization != null;
			case FhirPackage.CHARGE_ITEM__REQUESTING_ORGANIZATION:
				return requestingOrganization != null;
			case FhirPackage.CHARGE_ITEM__COST_CENTER:
				return costCenter != null;
			case FhirPackage.CHARGE_ITEM__QUANTITY:
				return quantity != null;
			case FhirPackage.CHARGE_ITEM__BODYSITE:
				return bodysite != null && !bodysite.isEmpty();
			case FhirPackage.CHARGE_ITEM__FACTOR_OVERRIDE:
				return factorOverride != null;
			case FhirPackage.CHARGE_ITEM__PRICE_OVERRIDE:
				return priceOverride != null;
			case FhirPackage.CHARGE_ITEM__OVERRIDE_REASON:
				return overrideReason != null;
			case FhirPackage.CHARGE_ITEM__ENTERER:
				return enterer != null;
			case FhirPackage.CHARGE_ITEM__ENTERED_DATE:
				return enteredDate != null;
			case FhirPackage.CHARGE_ITEM__REASON:
				return reason != null && !reason.isEmpty();
			case FhirPackage.CHARGE_ITEM__SERVICE:
				return service != null && !service.isEmpty();
			case FhirPackage.CHARGE_ITEM__PRODUCT_REFERENCE:
				return productReference != null;
			case FhirPackage.CHARGE_ITEM__PRODUCT_CODEABLE_CONCEPT:
				return productCodeableConcept != null;
			case FhirPackage.CHARGE_ITEM__ACCOUNT:
				return account != null && !account.isEmpty();
			case FhirPackage.CHARGE_ITEM__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.CHARGE_ITEM__SUPPORTING_INFORMATION:
				return supportingInformation != null && !supportingInformation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ChargeItemImpl
