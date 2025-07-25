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
import org.hl7.fhir.CoverageEligibilityRequest;
import org.hl7.fhir.CoverageEligibilityRequestInsurance;
import org.hl7.fhir.CoverageEligibilityRequestItem;
import org.hl7.fhir.CoverageEligibilityRequestSupportingInfo;
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.EligibilityRequestPurpose;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.FinancialResourceStatusCodes;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coverage Eligibility Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityRequestImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityRequestImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityRequestImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityRequestImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityRequestImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityRequestImpl#getServicedDate <em>Serviced Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityRequestImpl#getServicedPeriod <em>Serviced Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityRequestImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityRequestImpl#getEnterer <em>Enterer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityRequestImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityRequestImpl#getInsurer <em>Insurer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityRequestImpl#getFacility <em>Facility</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityRequestImpl#getSupportingInfo <em>Supporting Info</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityRequestImpl#getInsurance <em>Insurance</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageEligibilityRequestImpl#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoverageEligibilityRequestImpl extends DomainResourceImpl implements CoverageEligibilityRequest {
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
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept priority;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected EList<EligibilityRequestPurpose> purpose;

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
	 * The cached value of the '{@link #getEnterer() <em>Enterer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnterer()
	 * @generated
	 * @ordered
	 */
	protected Reference enterer;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected Reference provider;

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
	 * The cached value of the '{@link #getFacility() <em>Facility</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacility()
	 * @generated
	 * @ordered
	 */
	protected Reference facility;

	/**
	 * The cached value of the '{@link #getSupportingInfo() <em>Supporting Info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<CoverageEligibilityRequestSupportingInfo> supportingInfo;

	/**
	 * The cached value of the '{@link #getInsurance() <em>Insurance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurance()
	 * @generated
	 * @ordered
	 */
	protected EList<CoverageEligibilityRequestInsurance> insurance;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList<CoverageEligibilityRequestItem> item;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoverageEligibilityRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCoverageEligibilityRequest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__IDENTIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriority(CodeableConcept newPriority, NotificationChain msgs) {
		CodeableConcept oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__PRIORITY, oldPriority, newPriority);
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
	public void setPriority(CodeableConcept newPriority) {
		if (newPriority != priority) {
			NotificationChain msgs = null;
			if (priority != null)
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__PRIORITY, newPriority, newPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EligibilityRequestPurpose> getPurpose() {
		if (purpose == null) {
			purpose = new EObjectContainmentEList<EligibilityRequestPurpose>(EligibilityRequestPurpose.class, this, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__PURPOSE);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__PATIENT, oldPatient, newPatient);
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
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__PATIENT, newPatient, newPatient));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__SERVICED_DATE, oldServicedDate, newServicedDate);
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
				msgs = ((InternalEObject)servicedDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__SERVICED_DATE, null, msgs);
			if (newServicedDate != null)
				msgs = ((InternalEObject)newServicedDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__SERVICED_DATE, null, msgs);
			msgs = basicSetServicedDate(newServicedDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__SERVICED_DATE, newServicedDate, newServicedDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__SERVICED_PERIOD, oldServicedPeriod, newServicedPeriod);
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
				msgs = ((InternalEObject)servicedPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__SERVICED_PERIOD, null, msgs);
			if (newServicedPeriod != null)
				msgs = ((InternalEObject)newServicedPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__SERVICED_PERIOD, null, msgs);
			msgs = basicSetServicedPeriod(newServicedPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__SERVICED_PERIOD, newServicedPeriod, newServicedPeriod));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__CREATED, oldCreated, newCreated);
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
				msgs = ((InternalEObject)created).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__CREATED, null, msgs);
			if (newCreated != null)
				msgs = ((InternalEObject)newCreated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__CREATED, null, msgs);
			msgs = basicSetCreated(newCreated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__CREATED, newCreated, newCreated));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__ENTERER, oldEnterer, newEnterer);
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
				msgs = ((InternalEObject)enterer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__ENTERER, null, msgs);
			if (newEnterer != null)
				msgs = ((InternalEObject)newEnterer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__ENTERER, null, msgs);
			msgs = basicSetEnterer(newEnterer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__ENTERER, newEnterer, newEnterer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvider(Reference newProvider, NotificationChain msgs) {
		Reference oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__PROVIDER, oldProvider, newProvider);
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
	public void setProvider(Reference newProvider) {
		if (newProvider != provider) {
			NotificationChain msgs = null;
			if (provider != null)
				msgs = ((InternalEObject)provider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__PROVIDER, null, msgs);
			if (newProvider != null)
				msgs = ((InternalEObject)newProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__PROVIDER, null, msgs);
			msgs = basicSetProvider(newProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__PROVIDER, newProvider, newProvider));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__INSURER, oldInsurer, newInsurer);
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
				msgs = ((InternalEObject)insurer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__INSURER, null, msgs);
			if (newInsurer != null)
				msgs = ((InternalEObject)newInsurer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__INSURER, null, msgs);
			msgs = basicSetInsurer(newInsurer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__INSURER, newInsurer, newInsurer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getFacility() {
		return facility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFacility(Reference newFacility, NotificationChain msgs) {
		Reference oldFacility = facility;
		facility = newFacility;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__FACILITY, oldFacility, newFacility);
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
	public void setFacility(Reference newFacility) {
		if (newFacility != facility) {
			NotificationChain msgs = null;
			if (facility != null)
				msgs = ((InternalEObject)facility).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__FACILITY, null, msgs);
			if (newFacility != null)
				msgs = ((InternalEObject)newFacility).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__FACILITY, null, msgs);
			msgs = basicSetFacility(newFacility, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__FACILITY, newFacility, newFacility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CoverageEligibilityRequestSupportingInfo> getSupportingInfo() {
		if (supportingInfo == null) {
			supportingInfo = new EObjectContainmentEList<CoverageEligibilityRequestSupportingInfo>(CoverageEligibilityRequestSupportingInfo.class, this, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__SUPPORTING_INFO);
		}
		return supportingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CoverageEligibilityRequestInsurance> getInsurance() {
		if (insurance == null) {
			insurance = new EObjectContainmentEList<CoverageEligibilityRequestInsurance>(CoverageEligibilityRequestInsurance.class, this, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__INSURANCE);
		}
		return insurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CoverageEligibilityRequestItem> getItem() {
		if (item == null) {
			item = new EObjectContainmentEList<CoverageEligibilityRequestItem>(CoverageEligibilityRequestItem.class, this, FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__PRIORITY:
				return basicSetPriority(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__PURPOSE:
				return ((InternalEList<?>)getPurpose()).basicRemove(otherEnd, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__SERVICED_DATE:
				return basicSetServicedDate(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__SERVICED_PERIOD:
				return basicSetServicedPeriod(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__CREATED:
				return basicSetCreated(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__ENTERER:
				return basicSetEnterer(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__PROVIDER:
				return basicSetProvider(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__INSURER:
				return basicSetInsurer(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__FACILITY:
				return basicSetFacility(null, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__SUPPORTING_INFO:
				return ((InternalEList<?>)getSupportingInfo()).basicRemove(otherEnd, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__INSURANCE:
				return ((InternalEList<?>)getInsurance()).basicRemove(otherEnd, msgs);
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__STATUS:
				return getStatus();
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__PRIORITY:
				return getPriority();
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__PURPOSE:
				return getPurpose();
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__PATIENT:
				return getPatient();
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__SERVICED_DATE:
				return getServicedDate();
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__SERVICED_PERIOD:
				return getServicedPeriod();
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__CREATED:
				return getCreated();
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__ENTERER:
				return getEnterer();
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__PROVIDER:
				return getProvider();
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__INSURER:
				return getInsurer();
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__FACILITY:
				return getFacility();
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__SUPPORTING_INFO:
				return getSupportingInfo();
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__INSURANCE:
				return getInsurance();
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__ITEM:
				return getItem();
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
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__STATUS:
				setStatus((FinancialResourceStatusCodes)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__PRIORITY:
				setPriority((CodeableConcept)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__PURPOSE:
				getPurpose().clear();
				getPurpose().addAll((Collection<? extends EligibilityRequestPurpose>)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__SERVICED_DATE:
				setServicedDate((Date)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__SERVICED_PERIOD:
				setServicedPeriod((Period)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__CREATED:
				setCreated((DateTime)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__ENTERER:
				setEnterer((Reference)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__PROVIDER:
				setProvider((Reference)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__INSURER:
				setInsurer((Reference)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__FACILITY:
				setFacility((Reference)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__SUPPORTING_INFO:
				getSupportingInfo().clear();
				getSupportingInfo().addAll((Collection<? extends CoverageEligibilityRequestSupportingInfo>)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__INSURANCE:
				getInsurance().clear();
				getInsurance().addAll((Collection<? extends CoverageEligibilityRequestInsurance>)newValue);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends CoverageEligibilityRequestItem>)newValue);
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
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__STATUS:
				setStatus((FinancialResourceStatusCodes)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__PRIORITY:
				setPriority((CodeableConcept)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__PURPOSE:
				getPurpose().clear();
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__PATIENT:
				setPatient((Reference)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__SERVICED_DATE:
				setServicedDate((Date)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__SERVICED_PERIOD:
				setServicedPeriod((Period)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__CREATED:
				setCreated((DateTime)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__ENTERER:
				setEnterer((Reference)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__PROVIDER:
				setProvider((Reference)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__INSURER:
				setInsurer((Reference)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__FACILITY:
				setFacility((Reference)null);
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__SUPPORTING_INFO:
				getSupportingInfo().clear();
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__INSURANCE:
				getInsurance().clear();
				return;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__ITEM:
				getItem().clear();
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
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__STATUS:
				return status != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__PRIORITY:
				return priority != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__PURPOSE:
				return purpose != null && !purpose.isEmpty();
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__PATIENT:
				return patient != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__SERVICED_DATE:
				return servicedDate != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__SERVICED_PERIOD:
				return servicedPeriod != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__CREATED:
				return created != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__ENTERER:
				return enterer != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__PROVIDER:
				return provider != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__INSURER:
				return insurer != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__FACILITY:
				return facility != null;
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__SUPPORTING_INFO:
				return supportingInfo != null && !supportingInfo.isEmpty();
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__INSURANCE:
				return insurance != null && !insurance.isEmpty();
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST__ITEM:
				return item != null && !item.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CoverageEligibilityRequestImpl
