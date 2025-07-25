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
import org.hl7.fhir.CoverageEligibilityResponse;
import org.hl7.fhir.CoverageEligibilityResponseError;
import org.hl7.fhir.CoverageEligibilityResponseInsurance;
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.EligibilityResponsePurpose;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.FinancialResourceStatusCodes;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;
import org.hl7.fhir.RemittanceOutcome;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coverage Eligibility Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityResponseImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityResponseImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityResponseImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityResponseImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityResponseImpl#getServicedDate <em>Serviced Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityResponseImpl#getServicedPeriod <em>Serviced Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityResponseImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityResponseImpl#getRequestor <em>Requestor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityResponseImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityResponseImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityResponseImpl#getDisposition <em>Disposition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityResponseImpl#getInsurer <em>Insurer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityResponseImpl#getInsurance <em>Insurance</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityResponseImpl#getPreAuthRef <em>Pre Auth Ref</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityResponseImpl#getForm <em>Form</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityResponseImpl#getError <em>Error</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoverageEligibilityResponseImpl extends DomainResourceImpl implements CoverageEligibilityResponse {
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
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected EList<EligibilityResponsePurpose> purpose;

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
	 * The cached value of the '{@link #getServicedDate() <em>Serviced Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicedDate()
	 * @generated
	 * @ordered
	 */
	protected Date servicedDate;

	/**
	 * The cached value of the '{@link #getServicedPeriod() <em>Serviced Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicedPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period servicedPeriod;

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
	 * The cached value of the '{@link #getInsurer() <em>Insurer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurer()
	 * @generated
	 * @ordered
	 */
	protected Reference insurer;

	/**
	 * The cached value of the '{@link #getInsurance() <em>Insurance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurance()
	 * @generated
	 * @ordered
	 */
	protected EList<CoverageEligibilityResponseInsurance> insurance;

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
	 * The cached value of the '{@link #getForm() <em>Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForm()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept form;

	/**
	 * The cached value of the '{@link #getError() <em>Error</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError()
	 * @generated
	 * @ordered
	 */
	protected EList<CoverageEligibilityResponseError> error;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoverageEligibilityResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCoverageEligibilityResponse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__IDENTIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EligibilityResponsePurpose> getPurpose() {
		if (purpose == null) {
			purpose = new EObjectContainmentEList<EligibilityResponsePurpose>(EligibilityResponsePurpose.class, this, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__PURPOSE);
		}
		return purpose;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__PATIENT, oldPatient, newPatient);
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
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getServicedDate() {
		return servicedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServicedDate(Date newServicedDate, NotificationChain msgs) {
		Date oldServicedDate = servicedDate;
		servicedDate = newServicedDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__SERVICED_DATE, oldServicedDate, newServicedDate);
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
	public void setServicedDate(Date newServicedDate) {
		if (newServicedDate != servicedDate) {
			NotificationChain msgs = null;
			if (servicedDate != null)
				msgs = ((InternalEObject)servicedDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__SERVICED_DATE, null, msgs);
			if (newServicedDate != null)
				msgs = ((InternalEObject)newServicedDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__SERVICED_DATE, null, msgs);
			msgs = basicSetServicedDate(newServicedDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__SERVICED_DATE, newServicedDate, newServicedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getServicedPeriod() {
		return servicedPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServicedPeriod(Period newServicedPeriod, NotificationChain msgs) {
		Period oldServicedPeriod = servicedPeriod;
		servicedPeriod = newServicedPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__SERVICED_PERIOD, oldServicedPeriod, newServicedPeriod);
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
	public void setServicedPeriod(Period newServicedPeriod) {
		if (newServicedPeriod != servicedPeriod) {
			NotificationChain msgs = null;
			if (servicedPeriod != null)
				msgs = ((InternalEObject)servicedPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__SERVICED_PERIOD, null, msgs);
			if (newServicedPeriod != null)
				msgs = ((InternalEObject)newServicedPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__SERVICED_PERIOD, null, msgs);
			msgs = basicSetServicedPeriod(newServicedPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__SERVICED_PERIOD, newServicedPeriod, newServicedPeriod));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__CREATED, oldCreated, newCreated);
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
				msgs = ((InternalEObject)created).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__CREATED, null, msgs);
			if (newCreated != null)
				msgs = ((InternalEObject)newCreated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__CREATED, null, msgs);
			msgs = basicSetCreated(newCreated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__CREATED, newCreated, newCreated));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__REQUESTOR, oldRequestor, newRequestor);
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
				msgs = ((InternalEObject)requestor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__REQUESTOR, null, msgs);
			if (newRequestor != null)
				msgs = ((InternalEObject)newRequestor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__REQUESTOR, null, msgs);
			msgs = basicSetRequestor(newRequestor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__REQUESTOR, newRequestor, newRequestor));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__REQUEST, oldRequest, newRequest);
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
				msgs = ((InternalEObject)request).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__REQUEST, null, msgs);
			if (newRequest != null)
				msgs = ((InternalEObject)newRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__REQUEST, null, msgs);
			msgs = basicSetRequest(newRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__REQUEST, newRequest, newRequest));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__OUTCOME, oldOutcome, newOutcome);
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
				msgs = ((InternalEObject)outcome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__OUTCOME, null, msgs);
			if (newOutcome != null)
				msgs = ((InternalEObject)newOutcome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__OUTCOME, null, msgs);
			msgs = basicSetOutcome(newOutcome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__OUTCOME, newOutcome, newOutcome));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__DISPOSITION, oldDisposition, newDisposition);
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
				msgs = ((InternalEObject)disposition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__DISPOSITION, null, msgs);
			if (newDisposition != null)
				msgs = ((InternalEObject)newDisposition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__DISPOSITION, null, msgs);
			msgs = basicSetDisposition(newDisposition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__DISPOSITION, newDisposition, newDisposition));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__INSURER, oldInsurer, newInsurer);
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
				msgs = ((InternalEObject)insurer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__INSURER, null, msgs);
			if (newInsurer != null)
				msgs = ((InternalEObject)newInsurer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__INSURER, null, msgs);
			msgs = basicSetInsurer(newInsurer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__INSURER, newInsurer, newInsurer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CoverageEligibilityResponseInsurance> getInsurance() {
		if (insurance == null) {
			insurance = new EObjectContainmentEList<CoverageEligibilityResponseInsurance>(CoverageEligibilityResponseInsurance.class, this, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__INSURANCE);
		}
		return insurance;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__PRE_AUTH_REF, oldPreAuthRef, newPreAuthRef);
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
				msgs = ((InternalEObject)preAuthRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__PRE_AUTH_REF, null, msgs);
			if (newPreAuthRef != null)
				msgs = ((InternalEObject)newPreAuthRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__PRE_AUTH_REF, null, msgs);
			msgs = basicSetPreAuthRef(newPreAuthRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__PRE_AUTH_REF, newPreAuthRef, newPreAuthRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getForm() {
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForm(CodeableConcept newForm, NotificationChain msgs) {
		CodeableConcept oldForm = form;
		form = newForm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__FORM, oldForm, newForm);
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
	public void setForm(CodeableConcept newForm) {
		if (newForm != form) {
			NotificationChain msgs = null;
			if (form != null)
				msgs = ((InternalEObject)form).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__FORM, null, msgs);
			if (newForm != null)
				msgs = ((InternalEObject)newForm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__FORM, null, msgs);
			msgs = basicSetForm(newForm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__FORM, newForm, newForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CoverageEligibilityResponseError> getError() {
		if (error == null) {
			error = new EObjectContainmentEList<CoverageEligibilityResponseError>(CoverageEligibilityResponseError.class, this, FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__ERROR);
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
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__PURPOSE:
				return ((InternalEList<?>)getPurpose()).basicRemove(otherEnd, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__SERVICED_DATE:
				return basicSetServicedDate(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__SERVICED_PERIOD:
				return basicSetServicedPeriod(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__CREATED:
				return basicSetCreated(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__REQUESTOR:
				return basicSetRequestor(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__REQUEST:
				return basicSetRequest(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__OUTCOME:
				return basicSetOutcome(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__DISPOSITION:
				return basicSetDisposition(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__INSURER:
				return basicSetInsurer(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__INSURANCE:
				return ((InternalEList<?>)getInsurance()).basicRemove(otherEnd, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__PRE_AUTH_REF:
				return basicSetPreAuthRef(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__FORM:
				return basicSetForm(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__ERROR:
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
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__STATUS:
				return getStatus();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__PURPOSE:
				return getPurpose();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__PATIENT:
				return getPatient();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__SERVICED_DATE:
				return getServicedDate();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__SERVICED_PERIOD:
				return getServicedPeriod();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__CREATED:
				return getCreated();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__REQUESTOR:
				return getRequestor();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__REQUEST:
				return getRequest();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__OUTCOME:
				return getOutcome();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__DISPOSITION:
				return getDisposition();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__INSURER:
				return getInsurer();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__INSURANCE:
				return getInsurance();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__PRE_AUTH_REF:
				return getPreAuthRef();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__FORM:
				return getForm();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__ERROR:
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
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__STATUS:
				setStatus((FinancialResourceStatusCodes)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__PURPOSE:
				getPurpose().clear();
				getPurpose().addAll((Collection<? extends EligibilityResponsePurpose>)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__SERVICED_DATE:
				setServicedDate((Date)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__SERVICED_PERIOD:
				setServicedPeriod((Period)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__CREATED:
				setCreated((DateTime)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__REQUESTOR:
				setRequestor((Reference)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__REQUEST:
				setRequest((Reference)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__OUTCOME:
				setOutcome((RemittanceOutcome)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__DISPOSITION:
				setDisposition((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__INSURER:
				setInsurer((Reference)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__INSURANCE:
				getInsurance().clear();
				getInsurance().addAll((Collection<? extends CoverageEligibilityResponseInsurance>)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__PRE_AUTH_REF:
				setPreAuthRef((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__FORM:
				setForm((CodeableConcept)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__ERROR:
				getError().clear();
				getError().addAll((Collection<? extends CoverageEligibilityResponseError>)newValue);
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
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__STATUS:
				setStatus((FinancialResourceStatusCodes)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__PURPOSE:
				getPurpose().clear();
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__PATIENT:
				setPatient((Reference)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__SERVICED_DATE:
				setServicedDate((Date)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__SERVICED_PERIOD:
				setServicedPeriod((Period)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__CREATED:
				setCreated((DateTime)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__REQUESTOR:
				setRequestor((Reference)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__REQUEST:
				setRequest((Reference)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__OUTCOME:
				setOutcome((RemittanceOutcome)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__DISPOSITION:
				setDisposition((org.hl7.fhir.String)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__INSURER:
				setInsurer((Reference)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__INSURANCE:
				getInsurance().clear();
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__PRE_AUTH_REF:
				setPreAuthRef((org.hl7.fhir.String)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__FORM:
				setForm((CodeableConcept)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__ERROR:
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
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__STATUS:
				return status != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__PURPOSE:
				return purpose != null && !purpose.isEmpty();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__PATIENT:
				return patient != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__SERVICED_DATE:
				return servicedDate != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__SERVICED_PERIOD:
				return servicedPeriod != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__CREATED:
				return created != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__REQUESTOR:
				return requestor != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__REQUEST:
				return request != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__OUTCOME:
				return outcome != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__DISPOSITION:
				return disposition != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__INSURER:
				return insurer != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__INSURANCE:
				return insurance != null && !insurance.isEmpty();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__PRE_AUTH_REF:
				return preAuthRef != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__FORM:
				return form != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE__ERROR:
				return error != null && !error.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CoverageEligibilityResponseImpl
