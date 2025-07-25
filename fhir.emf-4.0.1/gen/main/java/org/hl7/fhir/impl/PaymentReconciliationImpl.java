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
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.FinancialResourceStatusCodes;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Money;
import org.hl7.fhir.PaymentReconciliation;
import org.hl7.fhir.PaymentReconciliationDetail;
import org.hl7.fhir.PaymentReconciliationProcessNote;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;
import org.hl7.fhir.RemittanceOutcome;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Reconciliation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getPaymentIssuer <em>Payment Issuer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getRequestor <em>Requestor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getDisposition <em>Disposition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getPaymentDate <em>Payment Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getPaymentAmount <em>Payment Amount</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getPaymentIdentifier <em>Payment Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getDetail <em>Detail</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getFormCode <em>Form Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getProcessNote <em>Process Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentReconciliationImpl extends DomainResourceImpl implements PaymentReconciliation {
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
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

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
	 * The cached value of the '{@link #getPaymentIssuer() <em>Payment Issuer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentIssuer()
	 * @generated
	 * @ordered
	 */
	protected Reference paymentIssuer;

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
	 * The cached value of the '{@link #getRequestor() <em>Requestor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestor()
	 * @generated
	 * @ordered
	 */
	protected Reference requestor;

	/**
	 * The cached value of the '{@link #getOutcome() <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcome()
	 * @generated
	 * @ordered
	 */
	protected RemittanceOutcome outcome;

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
	 * The cached value of the '{@link #getPaymentDate() <em>Payment Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentDate()
	 * @generated
	 * @ordered
	 */
	protected Date paymentDate;

	/**
	 * The cached value of the '{@link #getPaymentAmount() <em>Payment Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentAmount()
	 * @generated
	 * @ordered
	 */
	protected Money paymentAmount;

	/**
	 * The cached value of the '{@link #getPaymentIdentifier() <em>Payment Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier paymentIdentifier;

	/**
	 * The cached value of the '{@link #getDetail() <em>Detail</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetail()
	 * @generated
	 * @ordered
	 */
	protected EList<PaymentReconciliationDetail> detail;

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
	 * The cached value of the '{@link #getProcessNote() <em>Process Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessNote()
	 * @generated
	 * @ordered
	 */
	protected EList<PaymentReconciliationProcessNote> processNote;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentReconciliationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getPaymentReconciliation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.PAYMENT_RECONCILIATION__IDENTIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(Period newPeriod, NotificationChain msgs) {
		Period oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__PERIOD, oldPeriod, newPeriod);
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
	public void setPeriod(Period newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__PERIOD, newPeriod, newPeriod));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__CREATED, oldCreated, newCreated);
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
				msgs = ((InternalEObject)created).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__CREATED, null, msgs);
			if (newCreated != null)
				msgs = ((InternalEObject)newCreated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__CREATED, null, msgs);
			msgs = basicSetCreated(newCreated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__CREATED, newCreated, newCreated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getPaymentIssuer() {
		return paymentIssuer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaymentIssuer(Reference newPaymentIssuer, NotificationChain msgs) {
		Reference oldPaymentIssuer = paymentIssuer;
		paymentIssuer = newPaymentIssuer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_ISSUER, oldPaymentIssuer, newPaymentIssuer);
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
	public void setPaymentIssuer(Reference newPaymentIssuer) {
		if (newPaymentIssuer != paymentIssuer) {
			NotificationChain msgs = null;
			if (paymentIssuer != null)
				msgs = ((InternalEObject)paymentIssuer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_ISSUER, null, msgs);
			if (newPaymentIssuer != null)
				msgs = ((InternalEObject)newPaymentIssuer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_ISSUER, null, msgs);
			msgs = basicSetPaymentIssuer(newPaymentIssuer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_ISSUER, newPaymentIssuer, newPaymentIssuer));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__REQUEST, oldRequest, newRequest);
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
				msgs = ((InternalEObject)request).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__REQUEST, null, msgs);
			if (newRequest != null)
				msgs = ((InternalEObject)newRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__REQUEST, null, msgs);
			msgs = basicSetRequest(newRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__REQUEST, newRequest, newRequest));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__REQUESTOR, oldRequestor, newRequestor);
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
				msgs = ((InternalEObject)requestor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__REQUESTOR, null, msgs);
			if (newRequestor != null)
				msgs = ((InternalEObject)newRequestor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__REQUESTOR, null, msgs);
			msgs = basicSetRequestor(newRequestor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__REQUESTOR, newRequestor, newRequestor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemittanceOutcome getOutcome() {
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutcome(RemittanceOutcome newOutcome, NotificationChain msgs) {
		RemittanceOutcome oldOutcome = outcome;
		outcome = newOutcome;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__OUTCOME, oldOutcome, newOutcome);
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
	public void setOutcome(RemittanceOutcome newOutcome) {
		if (newOutcome != outcome) {
			NotificationChain msgs = null;
			if (outcome != null)
				msgs = ((InternalEObject)outcome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__OUTCOME, null, msgs);
			if (newOutcome != null)
				msgs = ((InternalEObject)newOutcome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__OUTCOME, null, msgs);
			msgs = basicSetOutcome(newOutcome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__OUTCOME, newOutcome, newOutcome));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__DISPOSITION, oldDisposition, newDisposition);
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
				msgs = ((InternalEObject)disposition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__DISPOSITION, null, msgs);
			if (newDisposition != null)
				msgs = ((InternalEObject)newDisposition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__DISPOSITION, null, msgs);
			msgs = basicSetDisposition(newDisposition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__DISPOSITION, newDisposition, newDisposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getPaymentDate() {
		return paymentDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaymentDate(Date newPaymentDate, NotificationChain msgs) {
		Date oldPaymentDate = paymentDate;
		paymentDate = newPaymentDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_DATE, oldPaymentDate, newPaymentDate);
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
	public void setPaymentDate(Date newPaymentDate) {
		if (newPaymentDate != paymentDate) {
			NotificationChain msgs = null;
			if (paymentDate != null)
				msgs = ((InternalEObject)paymentDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_DATE, null, msgs);
			if (newPaymentDate != null)
				msgs = ((InternalEObject)newPaymentDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_DATE, null, msgs);
			msgs = basicSetPaymentDate(newPaymentDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_DATE, newPaymentDate, newPaymentDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Money getPaymentAmount() {
		return paymentAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaymentAmount(Money newPaymentAmount, NotificationChain msgs) {
		Money oldPaymentAmount = paymentAmount;
		paymentAmount = newPaymentAmount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_AMOUNT, oldPaymentAmount, newPaymentAmount);
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
	public void setPaymentAmount(Money newPaymentAmount) {
		if (newPaymentAmount != paymentAmount) {
			NotificationChain msgs = null;
			if (paymentAmount != null)
				msgs = ((InternalEObject)paymentAmount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_AMOUNT, null, msgs);
			if (newPaymentAmount != null)
				msgs = ((InternalEObject)newPaymentAmount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_AMOUNT, null, msgs);
			msgs = basicSetPaymentAmount(newPaymentAmount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_AMOUNT, newPaymentAmount, newPaymentAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getPaymentIdentifier() {
		return paymentIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaymentIdentifier(Identifier newPaymentIdentifier, NotificationChain msgs) {
		Identifier oldPaymentIdentifier = paymentIdentifier;
		paymentIdentifier = newPaymentIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_IDENTIFIER, oldPaymentIdentifier, newPaymentIdentifier);
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
	public void setPaymentIdentifier(Identifier newPaymentIdentifier) {
		if (newPaymentIdentifier != paymentIdentifier) {
			NotificationChain msgs = null;
			if (paymentIdentifier != null)
				msgs = ((InternalEObject)paymentIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_IDENTIFIER, null, msgs);
			if (newPaymentIdentifier != null)
				msgs = ((InternalEObject)newPaymentIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_IDENTIFIER, null, msgs);
			msgs = basicSetPaymentIdentifier(newPaymentIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_IDENTIFIER, newPaymentIdentifier, newPaymentIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PaymentReconciliationDetail> getDetail() {
		if (detail == null) {
			detail = new EObjectContainmentEList<PaymentReconciliationDetail>(PaymentReconciliationDetail.class, this, FhirPackage.PAYMENT_RECONCILIATION__DETAIL);
		}
		return detail;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__FORM_CODE, oldFormCode, newFormCode);
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
				msgs = ((InternalEObject)formCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__FORM_CODE, null, msgs);
			if (newFormCode != null)
				msgs = ((InternalEObject)newFormCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__FORM_CODE, null, msgs);
			msgs = basicSetFormCode(newFormCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__FORM_CODE, newFormCode, newFormCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PaymentReconciliationProcessNote> getProcessNote() {
		if (processNote == null) {
			processNote = new EObjectContainmentEList<PaymentReconciliationProcessNote>(PaymentReconciliationProcessNote.class, this, FhirPackage.PAYMENT_RECONCILIATION__PROCESS_NOTE);
		}
		return processNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PAYMENT_RECONCILIATION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__PERIOD:
				return basicSetPeriod(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__CREATED:
				return basicSetCreated(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_ISSUER:
				return basicSetPaymentIssuer(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__REQUEST:
				return basicSetRequest(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__REQUESTOR:
				return basicSetRequestor(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__OUTCOME:
				return basicSetOutcome(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__DISPOSITION:
				return basicSetDisposition(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_DATE:
				return basicSetPaymentDate(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_AMOUNT:
				return basicSetPaymentAmount(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_IDENTIFIER:
				return basicSetPaymentIdentifier(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__DETAIL:
				return ((InternalEList<?>)getDetail()).basicRemove(otherEnd, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__FORM_CODE:
				return basicSetFormCode(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__PROCESS_NOTE:
				return ((InternalEList<?>)getProcessNote()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.PAYMENT_RECONCILIATION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.PAYMENT_RECONCILIATION__STATUS:
				return getStatus();
			case FhirPackage.PAYMENT_RECONCILIATION__PERIOD:
				return getPeriod();
			case FhirPackage.PAYMENT_RECONCILIATION__CREATED:
				return getCreated();
			case FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_ISSUER:
				return getPaymentIssuer();
			case FhirPackage.PAYMENT_RECONCILIATION__REQUEST:
				return getRequest();
			case FhirPackage.PAYMENT_RECONCILIATION__REQUESTOR:
				return getRequestor();
			case FhirPackage.PAYMENT_RECONCILIATION__OUTCOME:
				return getOutcome();
			case FhirPackage.PAYMENT_RECONCILIATION__DISPOSITION:
				return getDisposition();
			case FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_DATE:
				return getPaymentDate();
			case FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_AMOUNT:
				return getPaymentAmount();
			case FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_IDENTIFIER:
				return getPaymentIdentifier();
			case FhirPackage.PAYMENT_RECONCILIATION__DETAIL:
				return getDetail();
			case FhirPackage.PAYMENT_RECONCILIATION__FORM_CODE:
				return getFormCode();
			case FhirPackage.PAYMENT_RECONCILIATION__PROCESS_NOTE:
				return getProcessNote();
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
			case FhirPackage.PAYMENT_RECONCILIATION__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__STATUS:
				setStatus((FinancialResourceStatusCodes)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__PERIOD:
				setPeriod((Period)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__CREATED:
				setCreated((DateTime)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_ISSUER:
				setPaymentIssuer((Reference)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__REQUEST:
				setRequest((Reference)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__REQUESTOR:
				setRequestor((Reference)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__OUTCOME:
				setOutcome((RemittanceOutcome)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__DISPOSITION:
				setDisposition((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_DATE:
				setPaymentDate((Date)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_AMOUNT:
				setPaymentAmount((Money)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_IDENTIFIER:
				setPaymentIdentifier((Identifier)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__DETAIL:
				getDetail().clear();
				getDetail().addAll((Collection<? extends PaymentReconciliationDetail>)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__FORM_CODE:
				setFormCode((CodeableConcept)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__PROCESS_NOTE:
				getProcessNote().clear();
				getProcessNote().addAll((Collection<? extends PaymentReconciliationProcessNote>)newValue);
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
			case FhirPackage.PAYMENT_RECONCILIATION__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__STATUS:
				setStatus((FinancialResourceStatusCodes)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__PERIOD:
				setPeriod((Period)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__CREATED:
				setCreated((DateTime)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_ISSUER:
				setPaymentIssuer((Reference)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__REQUEST:
				setRequest((Reference)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__REQUESTOR:
				setRequestor((Reference)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__OUTCOME:
				setOutcome((RemittanceOutcome)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__DISPOSITION:
				setDisposition((org.hl7.fhir.String)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_DATE:
				setPaymentDate((Date)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_AMOUNT:
				setPaymentAmount((Money)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_IDENTIFIER:
				setPaymentIdentifier((Identifier)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__DETAIL:
				getDetail().clear();
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__FORM_CODE:
				setFormCode((CodeableConcept)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__PROCESS_NOTE:
				getProcessNote().clear();
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
			case FhirPackage.PAYMENT_RECONCILIATION__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.PAYMENT_RECONCILIATION__STATUS:
				return status != null;
			case FhirPackage.PAYMENT_RECONCILIATION__PERIOD:
				return period != null;
			case FhirPackage.PAYMENT_RECONCILIATION__CREATED:
				return created != null;
			case FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_ISSUER:
				return paymentIssuer != null;
			case FhirPackage.PAYMENT_RECONCILIATION__REQUEST:
				return request != null;
			case FhirPackage.PAYMENT_RECONCILIATION__REQUESTOR:
				return requestor != null;
			case FhirPackage.PAYMENT_RECONCILIATION__OUTCOME:
				return outcome != null;
			case FhirPackage.PAYMENT_RECONCILIATION__DISPOSITION:
				return disposition != null;
			case FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_DATE:
				return paymentDate != null;
			case FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_AMOUNT:
				return paymentAmount != null;
			case FhirPackage.PAYMENT_RECONCILIATION__PAYMENT_IDENTIFIER:
				return paymentIdentifier != null;
			case FhirPackage.PAYMENT_RECONCILIATION__DETAIL:
				return detail != null && !detail.isEmpty();
			case FhirPackage.PAYMENT_RECONCILIATION__FORM_CODE:
				return formCode != null;
			case FhirPackage.PAYMENT_RECONCILIATION__PROCESS_NOTE:
				return processNote != null && !processNote.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PaymentReconciliationImpl
