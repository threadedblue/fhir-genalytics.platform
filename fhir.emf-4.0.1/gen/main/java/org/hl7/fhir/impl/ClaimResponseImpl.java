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

import org.hl7.fhir.Attachment;
import org.hl7.fhir.ClaimProcessingCodes;
import org.hl7.fhir.ClaimResponse;
import org.hl7.fhir.ClaimResponseAddItem;
import org.hl7.fhir.ClaimResponseAdjudication;
import org.hl7.fhir.ClaimResponseError;
import org.hl7.fhir.ClaimResponseInsurance;
import org.hl7.fhir.ClaimResponseItem;
import org.hl7.fhir.ClaimResponsePayment;
import org.hl7.fhir.ClaimResponseProcessNote;
import org.hl7.fhir.ClaimResponseTotal;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.FinancialResourceStatusCodes;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Use;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getUse <em>Use</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getInsurer <em>Insurer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getRequestor <em>Requestor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getDisposition <em>Disposition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getPreAuthRef <em>Pre Auth Ref</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getPreAuthPeriod <em>Pre Auth Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getPayeeType <em>Payee Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getItem <em>Item</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getAddItem <em>Add Item</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getAdjudication <em>Adjudication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getTotal <em>Total</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getPayment <em>Payment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getFundsReserve <em>Funds Reserve</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getFormCode <em>Form Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getForm <em>Form</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getProcessNote <em>Process Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getCommunicationRequest <em>Communication Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getInsurance <em>Insurance</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getError <em>Error</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaimResponseImpl extends DomainResourceImpl implements ClaimResponse {
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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected FinancialResourceStatusCodes status;

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
	 * The cached value of the '{@link #getSubType() <em>Sub Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept subType;

	/**
	 * The cached value of the '{@link #getUse() <em>Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected Use use;

	/**
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Reference patient;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected DateTime created;

	/**
	 * The cached value of the '{@link #getInsurer() <em>Insurer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurer()
	 * @generated
	 * @ordered
	 */
	protected Reference insurer;

	/**
	 * The cached value of the '{@link #getRequestor() <em>Requestor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestor()
	 * @generated
	 * @ordered
	 */
	protected Reference requestor;

	/**
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected Reference request;

	/**
	 * The cached value of the '{@link #getOutcome() <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcome()
	 * @generated
	 * @ordered
	 */
	protected ClaimProcessingCodes outcome;

	/**
	 * The cached value of the '{@link #getDisposition() <em>Disposition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisposition()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String disposition;

	/**
	 * The cached value of the '{@link #getPreAuthRef() <em>Pre Auth Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreAuthRef()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String preAuthRef;

	/**
	 * The cached value of the '{@link #getPreAuthPeriod() <em>Pre Auth Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreAuthPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period preAuthPeriod;

	/**
	 * The cached value of the '{@link #getPayeeType() <em>Payee Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayeeType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept payeeType;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseItem> item;

	/**
	 * The cached value of the '{@link #getAddItem() <em>Add Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseAddItem> addItem;

	/**
	 * The cached value of the '{@link #getAdjudication() <em>Adjudication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjudication()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseAdjudication> adjudication;

	/**
	 * The cached value of the '{@link #getTotal() <em>Total</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseTotal> total;

	/**
	 * The cached value of the '{@link #getPayment() <em>Payment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment()
	 * @generated
	 * @ordered
	 */
	protected ClaimResponsePayment payment;

	/**
	 * The cached value of the '{@link #getFundsReserve() <em>Funds Reserve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFundsReserve()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept fundsReserve;

	/**
	 * The cached value of the '{@link #getFormCode() <em>Form Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept formCode;

	/**
	 * The cached value of the '{@link #getForm() <em>Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForm()
	 * @generated
	 * @ordered
	 */
	protected Attachment form;

	/**
	 * The cached value of the '{@link #getProcessNote() <em>Process Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessNote()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseProcessNote> processNote;

	/**
	 * The cached value of the '{@link #getCommunicationRequest() <em>Communication Request</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationRequest()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> communicationRequest;

	/**
	 * The cached value of the '{@link #getInsurance() <em>Insurance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurance()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseInsurance> insurance;

	/**
	 * The cached value of the '{@link #getError() <em>Error</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseError> error;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getClaimResponse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.CLAIM_RESPONSE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinancialResourceStatusCodes getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(FinancialResourceStatusCodes newStatus, NotificationChain msgs) {
		FinancialResourceStatusCodes oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__STATUS, oldStatus, newStatus);
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
	public void setStatus(FinancialResourceStatusCodes newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getSubType() {
		return subType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubType(CodeableConcept newSubType, NotificationChain msgs) {
		CodeableConcept oldSubType = subType;
		subType = newSubType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__SUB_TYPE, oldSubType, newSubType);
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
	public void setSubType(CodeableConcept newSubType) {
		if (newSubType != subType) {
			NotificationChain msgs = null;
			if (subType != null)
				msgs = ((InternalEObject)subType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__SUB_TYPE, null, msgs);
			if (newSubType != null)
				msgs = ((InternalEObject)newSubType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__SUB_TYPE, null, msgs);
			msgs = basicSetSubType(newSubType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__SUB_TYPE, newSubType, newSubType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Use getUse() {
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUse(Use newUse, NotificationChain msgs) {
		Use oldUse = use;
		use = newUse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__USE, oldUse, newUse);
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
	public void setUse(Use newUse) {
		if (newUse != use) {
			NotificationChain msgs = null;
			if (use != null)
				msgs = ((InternalEObject)use).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__USE, null, msgs);
			if (newUse != null)
				msgs = ((InternalEObject)newUse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__USE, null, msgs);
			msgs = basicSetUse(newUse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__USE, newUse, newUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getPatient() {
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatient(Reference newPatient, NotificationChain msgs) {
		Reference oldPatient = patient;
		patient = newPatient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__PATIENT, oldPatient, newPatient);
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
	public void setPatient(Reference newPatient) {
		if (newPatient != patient) {
			NotificationChain msgs = null;
			if (patient != null)
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreated(DateTime newCreated, NotificationChain msgs) {
		DateTime oldCreated = created;
		created = newCreated;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__CREATED, oldCreated, newCreated);
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
	public void setCreated(DateTime newCreated) {
		if (newCreated != created) {
			NotificationChain msgs = null;
			if (created != null)
				msgs = ((InternalEObject)created).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__CREATED, null, msgs);
			if (newCreated != null)
				msgs = ((InternalEObject)newCreated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__CREATED, null, msgs);
			msgs = basicSetCreated(newCreated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__CREATED, newCreated, newCreated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getInsurer() {
		return insurer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInsurer(Reference newInsurer, NotificationChain msgs) {
		Reference oldInsurer = insurer;
		insurer = newInsurer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__INSURER, oldInsurer, newInsurer);
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
	public void setInsurer(Reference newInsurer) {
		if (newInsurer != insurer) {
			NotificationChain msgs = null;
			if (insurer != null)
				msgs = ((InternalEObject)insurer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__INSURER, null, msgs);
			if (newInsurer != null)
				msgs = ((InternalEObject)newInsurer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__INSURER, null, msgs);
			msgs = basicSetInsurer(newInsurer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__INSURER, newInsurer, newInsurer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getRequestor() {
		return requestor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestor(Reference newRequestor, NotificationChain msgs) {
		Reference oldRequestor = requestor;
		requestor = newRequestor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__REQUESTOR, oldRequestor, newRequestor);
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
	public void setRequestor(Reference newRequestor) {
		if (newRequestor != requestor) {
			NotificationChain msgs = null;
			if (requestor != null)
				msgs = ((InternalEObject)requestor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__REQUESTOR, null, msgs);
			if (newRequestor != null)
				msgs = ((InternalEObject)newRequestor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__REQUESTOR, null, msgs);
			msgs = basicSetRequestor(newRequestor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__REQUESTOR, newRequestor, newRequestor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getRequest() {
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequest(Reference newRequest, NotificationChain msgs) {
		Reference oldRequest = request;
		request = newRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__REQUEST, oldRequest, newRequest);
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
	public void setRequest(Reference newRequest) {
		if (newRequest != request) {
			NotificationChain msgs = null;
			if (request != null)
				msgs = ((InternalEObject)request).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__REQUEST, null, msgs);
			if (newRequest != null)
				msgs = ((InternalEObject)newRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__REQUEST, null, msgs);
			msgs = basicSetRequest(newRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__REQUEST, newRequest, newRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimProcessingCodes getOutcome() {
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutcome(ClaimProcessingCodes newOutcome, NotificationChain msgs) {
		ClaimProcessingCodes oldOutcome = outcome;
		outcome = newOutcome;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__OUTCOME, oldOutcome, newOutcome);
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
	public void setOutcome(ClaimProcessingCodes newOutcome) {
		if (newOutcome != outcome) {
			NotificationChain msgs = null;
			if (outcome != null)
				msgs = ((InternalEObject)outcome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__OUTCOME, null, msgs);
			if (newOutcome != null)
				msgs = ((InternalEObject)newOutcome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__OUTCOME, null, msgs);
			msgs = basicSetOutcome(newOutcome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__OUTCOME, newOutcome, newOutcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getDisposition() {
		return disposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisposition(org.hl7.fhir.String newDisposition, NotificationChain msgs) {
		org.hl7.fhir.String oldDisposition = disposition;
		disposition = newDisposition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__DISPOSITION, oldDisposition, newDisposition);
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
	public void setDisposition(org.hl7.fhir.String newDisposition) {
		if (newDisposition != disposition) {
			NotificationChain msgs = null;
			if (disposition != null)
				msgs = ((InternalEObject)disposition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__DISPOSITION, null, msgs);
			if (newDisposition != null)
				msgs = ((InternalEObject)newDisposition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__DISPOSITION, null, msgs);
			msgs = basicSetDisposition(newDisposition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__DISPOSITION, newDisposition, newDisposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getPreAuthRef() {
		return preAuthRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreAuthRef(org.hl7.fhir.String newPreAuthRef, NotificationChain msgs) {
		org.hl7.fhir.String oldPreAuthRef = preAuthRef;
		preAuthRef = newPreAuthRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__PRE_AUTH_REF, oldPreAuthRef, newPreAuthRef);
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
	public void setPreAuthRef(org.hl7.fhir.String newPreAuthRef) {
		if (newPreAuthRef != preAuthRef) {
			NotificationChain msgs = null;
			if (preAuthRef != null)
				msgs = ((InternalEObject)preAuthRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__PRE_AUTH_REF, null, msgs);
			if (newPreAuthRef != null)
				msgs = ((InternalEObject)newPreAuthRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__PRE_AUTH_REF, null, msgs);
			msgs = basicSetPreAuthRef(newPreAuthRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__PRE_AUTH_REF, newPreAuthRef, newPreAuthRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getPreAuthPeriod() {
		return preAuthPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreAuthPeriod(Period newPreAuthPeriod, NotificationChain msgs) {
		Period oldPreAuthPeriod = preAuthPeriod;
		preAuthPeriod = newPreAuthPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__PRE_AUTH_PERIOD, oldPreAuthPeriod, newPreAuthPeriod);
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
	public void setPreAuthPeriod(Period newPreAuthPeriod) {
		if (newPreAuthPeriod != preAuthPeriod) {
			NotificationChain msgs = null;
			if (preAuthPeriod != null)
				msgs = ((InternalEObject)preAuthPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__PRE_AUTH_PERIOD, null, msgs);
			if (newPreAuthPeriod != null)
				msgs = ((InternalEObject)newPreAuthPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__PRE_AUTH_PERIOD, null, msgs);
			msgs = basicSetPreAuthPeriod(newPreAuthPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__PRE_AUTH_PERIOD, newPreAuthPeriod, newPreAuthPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getPayeeType() {
		return payeeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPayeeType(CodeableConcept newPayeeType, NotificationChain msgs) {
		CodeableConcept oldPayeeType = payeeType;
		payeeType = newPayeeType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__PAYEE_TYPE, oldPayeeType, newPayeeType);
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
	public void setPayeeType(CodeableConcept newPayeeType) {
		if (newPayeeType != payeeType) {
			NotificationChain msgs = null;
			if (payeeType != null)
				msgs = ((InternalEObject)payeeType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__PAYEE_TYPE, null, msgs);
			if (newPayeeType != null)
				msgs = ((InternalEObject)newPayeeType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__PAYEE_TYPE, null, msgs);
			msgs = basicSetPayeeType(newPayeeType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__PAYEE_TYPE, newPayeeType, newPayeeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClaimResponseItem> getItem() {
		if (item == null) {
			item = new EObjectContainmentEList<ClaimResponseItem>(ClaimResponseItem.class, this, FhirPackage.CLAIM_RESPONSE__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClaimResponseAddItem> getAddItem() {
		if (addItem == null) {
			addItem = new EObjectContainmentEList<ClaimResponseAddItem>(ClaimResponseAddItem.class, this, FhirPackage.CLAIM_RESPONSE__ADD_ITEM);
		}
		return addItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClaimResponseAdjudication> getAdjudication() {
		if (adjudication == null) {
			adjudication = new EObjectContainmentEList<ClaimResponseAdjudication>(ClaimResponseAdjudication.class, this, FhirPackage.CLAIM_RESPONSE__ADJUDICATION);
		}
		return adjudication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClaimResponseTotal> getTotal() {
		if (total == null) {
			total = new EObjectContainmentEList<ClaimResponseTotal>(ClaimResponseTotal.class, this, FhirPackage.CLAIM_RESPONSE__TOTAL);
		}
		return total;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimResponsePayment getPayment() {
		return payment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPayment(ClaimResponsePayment newPayment, NotificationChain msgs) {
		ClaimResponsePayment oldPayment = payment;
		payment = newPayment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__PAYMENT, oldPayment, newPayment);
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
	public void setPayment(ClaimResponsePayment newPayment) {
		if (newPayment != payment) {
			NotificationChain msgs = null;
			if (payment != null)
				msgs = ((InternalEObject)payment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__PAYMENT, null, msgs);
			if (newPayment != null)
				msgs = ((InternalEObject)newPayment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__PAYMENT, null, msgs);
			msgs = basicSetPayment(newPayment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__PAYMENT, newPayment, newPayment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getFundsReserve() {
		return fundsReserve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFundsReserve(CodeableConcept newFundsReserve, NotificationChain msgs) {
		CodeableConcept oldFundsReserve = fundsReserve;
		fundsReserve = newFundsReserve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__FUNDS_RESERVE, oldFundsReserve, newFundsReserve);
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
	public void setFundsReserve(CodeableConcept newFundsReserve) {
		if (newFundsReserve != fundsReserve) {
			NotificationChain msgs = null;
			if (fundsReserve != null)
				msgs = ((InternalEObject)fundsReserve).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__FUNDS_RESERVE, null, msgs);
			if (newFundsReserve != null)
				msgs = ((InternalEObject)newFundsReserve).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__FUNDS_RESERVE, null, msgs);
			msgs = basicSetFundsReserve(newFundsReserve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__FUNDS_RESERVE, newFundsReserve, newFundsReserve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getFormCode() {
		return formCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormCode(CodeableConcept newFormCode, NotificationChain msgs) {
		CodeableConcept oldFormCode = formCode;
		formCode = newFormCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__FORM_CODE, oldFormCode, newFormCode);
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
	public void setFormCode(CodeableConcept newFormCode) {
		if (newFormCode != formCode) {
			NotificationChain msgs = null;
			if (formCode != null)
				msgs = ((InternalEObject)formCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__FORM_CODE, null, msgs);
			if (newFormCode != null)
				msgs = ((InternalEObject)newFormCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__FORM_CODE, null, msgs);
			msgs = basicSetFormCode(newFormCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__FORM_CODE, newFormCode, newFormCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attachment getForm() {
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForm(Attachment newForm, NotificationChain msgs) {
		Attachment oldForm = form;
		form = newForm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__FORM, oldForm, newForm);
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
	public void setForm(Attachment newForm) {
		if (newForm != form) {
			NotificationChain msgs = null;
			if (form != null)
				msgs = ((InternalEObject)form).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__FORM, null, msgs);
			if (newForm != null)
				msgs = ((InternalEObject)newForm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__FORM, null, msgs);
			msgs = basicSetForm(newForm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__FORM, newForm, newForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClaimResponseProcessNote> getProcessNote() {
		if (processNote == null) {
			processNote = new EObjectContainmentEList<ClaimResponseProcessNote>(ClaimResponseProcessNote.class, this, FhirPackage.CLAIM_RESPONSE__PROCESS_NOTE);
		}
		return processNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getCommunicationRequest() {
		if (communicationRequest == null) {
			communicationRequest = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CLAIM_RESPONSE__COMMUNICATION_REQUEST);
		}
		return communicationRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClaimResponseInsurance> getInsurance() {
		if (insurance == null) {
			insurance = new EObjectContainmentEList<ClaimResponseInsurance>(ClaimResponseInsurance.class, this, FhirPackage.CLAIM_RESPONSE__INSURANCE);
		}
		return insurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClaimResponseError> getError() {
		if (error == null) {
			error = new EObjectContainmentEList<ClaimResponseError>(ClaimResponseError.class, this, FhirPackage.CLAIM_RESPONSE__ERROR);
		}
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CLAIM_RESPONSE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_RESPONSE__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__SUB_TYPE:
				return basicSetSubType(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__USE:
				return basicSetUse(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__CREATED:
				return basicSetCreated(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__INSURER:
				return basicSetInsurer(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__REQUESTOR:
				return basicSetRequestor(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__REQUEST:
				return basicSetRequest(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__OUTCOME:
				return basicSetOutcome(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__DISPOSITION:
				return basicSetDisposition(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__PRE_AUTH_REF:
				return basicSetPreAuthRef(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__PRE_AUTH_PERIOD:
				return basicSetPreAuthPeriod(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__PAYEE_TYPE:
				return basicSetPayeeType(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_RESPONSE__ADD_ITEM:
				return ((InternalEList<?>)getAddItem()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_RESPONSE__ADJUDICATION:
				return ((InternalEList<?>)getAdjudication()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_RESPONSE__TOTAL:
				return ((InternalEList<?>)getTotal()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_RESPONSE__PAYMENT:
				return basicSetPayment(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__FUNDS_RESERVE:
				return basicSetFundsReserve(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__FORM_CODE:
				return basicSetFormCode(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__FORM:
				return basicSetForm(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__PROCESS_NOTE:
				return ((InternalEList<?>)getProcessNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_RESPONSE__COMMUNICATION_REQUEST:
				return ((InternalEList<?>)getCommunicationRequest()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_RESPONSE__INSURANCE:
				return ((InternalEList<?>)getInsurance()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_RESPONSE__ERROR:
				return ((InternalEList<?>)getError()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CLAIM_RESPONSE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.CLAIM_RESPONSE__STATUS:
				return getStatus();
			case FhirPackage.CLAIM_RESPONSE__TYPE:
				return getType();
			case FhirPackage.CLAIM_RESPONSE__SUB_TYPE:
				return getSubType();
			case FhirPackage.CLAIM_RESPONSE__USE:
				return getUse();
			case FhirPackage.CLAIM_RESPONSE__PATIENT:
				return getPatient();
			case FhirPackage.CLAIM_RESPONSE__CREATED:
				return getCreated();
			case FhirPackage.CLAIM_RESPONSE__INSURER:
				return getInsurer();
			case FhirPackage.CLAIM_RESPONSE__REQUESTOR:
				return getRequestor();
			case FhirPackage.CLAIM_RESPONSE__REQUEST:
				return getRequest();
			case FhirPackage.CLAIM_RESPONSE__OUTCOME:
				return getOutcome();
			case FhirPackage.CLAIM_RESPONSE__DISPOSITION:
				return getDisposition();
			case FhirPackage.CLAIM_RESPONSE__PRE_AUTH_REF:
				return getPreAuthRef();
			case FhirPackage.CLAIM_RESPONSE__PRE_AUTH_PERIOD:
				return getPreAuthPeriod();
			case FhirPackage.CLAIM_RESPONSE__PAYEE_TYPE:
				return getPayeeType();
			case FhirPackage.CLAIM_RESPONSE__ITEM:
				return getItem();
			case FhirPackage.CLAIM_RESPONSE__ADD_ITEM:
				return getAddItem();
			case FhirPackage.CLAIM_RESPONSE__ADJUDICATION:
				return getAdjudication();
			case FhirPackage.CLAIM_RESPONSE__TOTAL:
				return getTotal();
			case FhirPackage.CLAIM_RESPONSE__PAYMENT:
				return getPayment();
			case FhirPackage.CLAIM_RESPONSE__FUNDS_RESERVE:
				return getFundsReserve();
			case FhirPackage.CLAIM_RESPONSE__FORM_CODE:
				return getFormCode();
			case FhirPackage.CLAIM_RESPONSE__FORM:
				return getForm();
			case FhirPackage.CLAIM_RESPONSE__PROCESS_NOTE:
				return getProcessNote();
			case FhirPackage.CLAIM_RESPONSE__COMMUNICATION_REQUEST:
				return getCommunicationRequest();
			case FhirPackage.CLAIM_RESPONSE__INSURANCE:
				return getInsurance();
			case FhirPackage.CLAIM_RESPONSE__ERROR:
				return getError();
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
			case FhirPackage.CLAIM_RESPONSE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__STATUS:
				setStatus((FinancialResourceStatusCodes)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__SUB_TYPE:
				setSubType((CodeableConcept)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__USE:
				setUse((Use)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__CREATED:
				setCreated((DateTime)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__INSURER:
				setInsurer((Reference)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__REQUESTOR:
				setRequestor((Reference)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__REQUEST:
				setRequest((Reference)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__OUTCOME:
				setOutcome((ClaimProcessingCodes)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__DISPOSITION:
				setDisposition((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__PRE_AUTH_REF:
				setPreAuthRef((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__PRE_AUTH_PERIOD:
				setPreAuthPeriod((Period)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__PAYEE_TYPE:
				setPayeeType((CodeableConcept)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends ClaimResponseItem>)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__ADD_ITEM:
				getAddItem().clear();
				getAddItem().addAll((Collection<? extends ClaimResponseAddItem>)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__ADJUDICATION:
				getAdjudication().clear();
				getAdjudication().addAll((Collection<? extends ClaimResponseAdjudication>)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__TOTAL:
				getTotal().clear();
				getTotal().addAll((Collection<? extends ClaimResponseTotal>)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__PAYMENT:
				setPayment((ClaimResponsePayment)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__FUNDS_RESERVE:
				setFundsReserve((CodeableConcept)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__FORM_CODE:
				setFormCode((CodeableConcept)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__FORM:
				setForm((Attachment)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__PROCESS_NOTE:
				getProcessNote().clear();
				getProcessNote().addAll((Collection<? extends ClaimResponseProcessNote>)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__COMMUNICATION_REQUEST:
				getCommunicationRequest().clear();
				getCommunicationRequest().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__INSURANCE:
				getInsurance().clear();
				getInsurance().addAll((Collection<? extends ClaimResponseInsurance>)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__ERROR:
				getError().clear();
				getError().addAll((Collection<? extends ClaimResponseError>)newValue);
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
			case FhirPackage.CLAIM_RESPONSE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.CLAIM_RESPONSE__STATUS:
				setStatus((FinancialResourceStatusCodes)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__SUB_TYPE:
				setSubType((CodeableConcept)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__USE:
				setUse((Use)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__PATIENT:
				setPatient((Reference)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__CREATED:
				setCreated((DateTime)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__INSURER:
				setInsurer((Reference)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__REQUESTOR:
				setRequestor((Reference)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__REQUEST:
				setRequest((Reference)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__OUTCOME:
				setOutcome((ClaimProcessingCodes)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__DISPOSITION:
				setDisposition((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__PRE_AUTH_REF:
				setPreAuthRef((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__PRE_AUTH_PERIOD:
				setPreAuthPeriod((Period)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__PAYEE_TYPE:
				setPayeeType((CodeableConcept)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__ITEM:
				getItem().clear();
				return;
			case FhirPackage.CLAIM_RESPONSE__ADD_ITEM:
				getAddItem().clear();
				return;
			case FhirPackage.CLAIM_RESPONSE__ADJUDICATION:
				getAdjudication().clear();
				return;
			case FhirPackage.CLAIM_RESPONSE__TOTAL:
				getTotal().clear();
				return;
			case FhirPackage.CLAIM_RESPONSE__PAYMENT:
				setPayment((ClaimResponsePayment)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__FUNDS_RESERVE:
				setFundsReserve((CodeableConcept)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__FORM_CODE:
				setFormCode((CodeableConcept)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__FORM:
				setForm((Attachment)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__PROCESS_NOTE:
				getProcessNote().clear();
				return;
			case FhirPackage.CLAIM_RESPONSE__COMMUNICATION_REQUEST:
				getCommunicationRequest().clear();
				return;
			case FhirPackage.CLAIM_RESPONSE__INSURANCE:
				getInsurance().clear();
				return;
			case FhirPackage.CLAIM_RESPONSE__ERROR:
				getError().clear();
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
			case FhirPackage.CLAIM_RESPONSE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.CLAIM_RESPONSE__STATUS:
				return status != null;
			case FhirPackage.CLAIM_RESPONSE__TYPE:
				return type != null;
			case FhirPackage.CLAIM_RESPONSE__SUB_TYPE:
				return subType != null;
			case FhirPackage.CLAIM_RESPONSE__USE:
				return use != null;
			case FhirPackage.CLAIM_RESPONSE__PATIENT:
				return patient != null;
			case FhirPackage.CLAIM_RESPONSE__CREATED:
				return created != null;
			case FhirPackage.CLAIM_RESPONSE__INSURER:
				return insurer != null;
			case FhirPackage.CLAIM_RESPONSE__REQUESTOR:
				return requestor != null;
			case FhirPackage.CLAIM_RESPONSE__REQUEST:
				return request != null;
			case FhirPackage.CLAIM_RESPONSE__OUTCOME:
				return outcome != null;
			case FhirPackage.CLAIM_RESPONSE__DISPOSITION:
				return disposition != null;
			case FhirPackage.CLAIM_RESPONSE__PRE_AUTH_REF:
				return preAuthRef != null;
			case FhirPackage.CLAIM_RESPONSE__PRE_AUTH_PERIOD:
				return preAuthPeriod != null;
			case FhirPackage.CLAIM_RESPONSE__PAYEE_TYPE:
				return payeeType != null;
			case FhirPackage.CLAIM_RESPONSE__ITEM:
				return item != null && !item.isEmpty();
			case FhirPackage.CLAIM_RESPONSE__ADD_ITEM:
				return addItem != null && !addItem.isEmpty();
			case FhirPackage.CLAIM_RESPONSE__ADJUDICATION:
				return adjudication != null && !adjudication.isEmpty();
			case FhirPackage.CLAIM_RESPONSE__TOTAL:
				return total != null && !total.isEmpty();
			case FhirPackage.CLAIM_RESPONSE__PAYMENT:
				return payment != null;
			case FhirPackage.CLAIM_RESPONSE__FUNDS_RESERVE:
				return fundsReserve != null;
			case FhirPackage.CLAIM_RESPONSE__FORM_CODE:
				return formCode != null;
			case FhirPackage.CLAIM_RESPONSE__FORM:
				return form != null;
			case FhirPackage.CLAIM_RESPONSE__PROCESS_NOTE:
				return processNote != null && !processNote.isEmpty();
			case FhirPackage.CLAIM_RESPONSE__COMMUNICATION_REQUEST:
				return communicationRequest != null && !communicationRequest.isEmpty();
			case FhirPackage.CLAIM_RESPONSE__INSURANCE:
				return insurance != null && !insurance.isEmpty();
			case FhirPackage.CLAIM_RESPONSE__ERROR:
				return error != null && !error.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClaimResponseImpl
