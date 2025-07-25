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
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.ExplanationOfBenefit;
import org.hl7.fhir.ExplanationOfBenefitAccident;
import org.hl7.fhir.ExplanationOfBenefitAddItem;
import org.hl7.fhir.ExplanationOfBenefitAdjudication;
import org.hl7.fhir.ExplanationOfBenefitBenefitBalance;
import org.hl7.fhir.ExplanationOfBenefitCareTeam;
import org.hl7.fhir.ExplanationOfBenefitDiagnosis;
import org.hl7.fhir.ExplanationOfBenefitInsurance;
import org.hl7.fhir.ExplanationOfBenefitItem;
import org.hl7.fhir.ExplanationOfBenefitPayee;
import org.hl7.fhir.ExplanationOfBenefitPayment;
import org.hl7.fhir.ExplanationOfBenefitProcedure;
import org.hl7.fhir.ExplanationOfBenefitProcessNote;
import org.hl7.fhir.ExplanationOfBenefitRelated;
import org.hl7.fhir.ExplanationOfBenefitStatus;
import org.hl7.fhir.ExplanationOfBenefitSupportingInfo;
import org.hl7.fhir.ExplanationOfBenefitTotal;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Use;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explanation Of Benefit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getUse <em>Use</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getBillablePeriod <em>Billable Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getEnterer <em>Enterer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getInsurer <em>Insurer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getFundsReserveRequested <em>Funds Reserve Requested</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getFundsReserve <em>Funds Reserve</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getRelated <em>Related</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getPrescription <em>Prescription</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getOriginalPrescription <em>Original Prescription</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getPayee <em>Payee</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getReferral <em>Referral</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getFacility <em>Facility</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getClaim <em>Claim</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getClaimResponse <em>Claim Response</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getDisposition <em>Disposition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getPreAuthRef <em>Pre Auth Ref</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getPreAuthRefPeriod <em>Pre Auth Ref Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getCareTeam <em>Care Team</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getSupportingInfo <em>Supporting Info</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getDiagnosis <em>Diagnosis</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getPrecedence <em>Precedence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getInsurance <em>Insurance</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getAccident <em>Accident</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getItem <em>Item</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getAddItem <em>Add Item</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getAdjudication <em>Adjudication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getTotal <em>Total</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getPayment <em>Payment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getFormCode <em>Form Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getForm <em>Form</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getProcessNote <em>Process Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getBenefitPeriod <em>Benefit Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getBenefitBalance <em>Benefit Balance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExplanationOfBenefitImpl extends DomainResourceImpl implements ExplanationOfBenefit {
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
	protected ExplanationOfBenefitStatus status;

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
	 * The cached value of the '{@link #getBillablePeriod() <em>Billable Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillablePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period billablePeriod;

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
	 * The cached value of the '{@link #getInsurer() <em>Insurer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurer()
	 * @generated
	 * @ordered
	 */
	protected Reference insurer;

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
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept priority;

	/**
	 * The cached value of the '{@link #getFundsReserveRequested() <em>Funds Reserve Requested</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFundsReserveRequested()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept fundsReserveRequested;

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
	 * The cached value of the '{@link #getRelated() <em>Related</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelated()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitRelated> related;

	/**
	 * The cached value of the '{@link #getPrescription() <em>Prescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescription()
	 * @generated
	 * @ordered
	 */
	protected Reference prescription;

	/**
	 * The cached value of the '{@link #getOriginalPrescription() <em>Original Prescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalPrescription()
	 * @generated
	 * @ordered
	 */
	protected Reference originalPrescription;

	/**
	 * The cached value of the '{@link #getPayee() <em>Payee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayee()
	 * @generated
	 * @ordered
	 */
	protected ExplanationOfBenefitPayee payee;

	/**
	 * The cached value of the '{@link #getReferral() <em>Referral</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferral()
	 * @generated
	 * @ordered
	 */
	protected Reference referral;

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
	 * The cached value of the '{@link #getClaim() <em>Claim</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaim()
	 * @generated
	 * @ordered
	 */
	protected Reference claim;

	/**
	 * The cached value of the '{@link #getClaimResponse() <em>Claim Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaimResponse()
	 * @generated
	 * @ordered
	 */
	protected Reference claimResponse;

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
	 * The cached value of the '{@link #getPreAuthRef() <em>Pre Auth Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreAuthRef()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> preAuthRef;

	/**
	 * The cached value of the '{@link #getPreAuthRefPeriod() <em>Pre Auth Ref Period</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreAuthRefPeriod()
	 * @generated
	 * @ordered
	 */
	protected EList<Period> preAuthRefPeriod;

	/**
	 * The cached value of the '{@link #getCareTeam() <em>Care Team</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareTeam()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitCareTeam> careTeam;

	/**
	 * The cached value of the '{@link #getSupportingInfo() <em>Supporting Info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitSupportingInfo> supportingInfo;

	/**
	 * The cached value of the '{@link #getDiagnosis() <em>Diagnosis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosis()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitDiagnosis> diagnosis;

	/**
	 * The cached value of the '{@link #getProcedure() <em>Procedure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedure()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitProcedure> procedure;

	/**
	 * The cached value of the '{@link #getPrecedence() <em>Precedence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecedence()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt precedence;

	/**
	 * The cached value of the '{@link #getInsurance() <em>Insurance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurance()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitInsurance> insurance;

	/**
	 * The cached value of the '{@link #getAccident() <em>Accident</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccident()
	 * @generated
	 * @ordered
	 */
	protected ExplanationOfBenefitAccident accident;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitItem> item;

	/**
	 * The cached value of the '{@link #getAddItem() <em>Add Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitAddItem> addItem;

	/**
	 * The cached value of the '{@link #getAdjudication() <em>Adjudication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjudication()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitAdjudication> adjudication;

	/**
	 * The cached value of the '{@link #getTotal() <em>Total</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitTotal> total;

	/**
	 * The cached value of the '{@link #getPayment() <em>Payment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment()
	 * @generated
	 * @ordered
	 */
	protected ExplanationOfBenefitPayment payment;

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
	protected EList<ExplanationOfBenefitProcessNote> processNote;

	/**
	 * The cached value of the '{@link #getBenefitPeriod() <em>Benefit Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefitPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period benefitPeriod;

	/**
	 * The cached value of the '{@link #getBenefitBalance() <em>Benefit Balance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefitBalance()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitBenefitBalance> benefitBalance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExplanationOfBenefitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getExplanationOfBenefit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.EXPLANATION_OF_BENEFIT__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefitStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(ExplanationOfBenefitStatus newStatus, NotificationChain msgs) {
		ExplanationOfBenefitStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__STATUS, oldStatus, newStatus);
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
	public void setStatus(ExplanationOfBenefitStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__TYPE, newType, newType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__SUB_TYPE, oldSubType, newSubType);
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
				msgs = ((InternalEObject)subType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__SUB_TYPE, null, msgs);
			if (newSubType != null)
				msgs = ((InternalEObject)newSubType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__SUB_TYPE, null, msgs);
			msgs = basicSetSubType(newSubType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__SUB_TYPE, newSubType, newSubType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__USE, oldUse, newUse);
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
				msgs = ((InternalEObject)use).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__USE, null, msgs);
			if (newUse != null)
				msgs = ((InternalEObject)newUse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__USE, null, msgs);
			msgs = basicSetUse(newUse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__USE, newUse, newUse));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PATIENT, oldPatient, newPatient);
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
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getBillablePeriod() {
		return billablePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBillablePeriod(Period newBillablePeriod, NotificationChain msgs) {
		Period oldBillablePeriod = billablePeriod;
		billablePeriod = newBillablePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__BILLABLE_PERIOD, oldBillablePeriod, newBillablePeriod);
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
	public void setBillablePeriod(Period newBillablePeriod) {
		if (newBillablePeriod != billablePeriod) {
			NotificationChain msgs = null;
			if (billablePeriod != null)
				msgs = ((InternalEObject)billablePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__BILLABLE_PERIOD, null, msgs);
			if (newBillablePeriod != null)
				msgs = ((InternalEObject)newBillablePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__BILLABLE_PERIOD, null, msgs);
			msgs = basicSetBillablePeriod(newBillablePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__BILLABLE_PERIOD, newBillablePeriod, newBillablePeriod));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__CREATED, oldCreated, newCreated);
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
				msgs = ((InternalEObject)created).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__CREATED, null, msgs);
			if (newCreated != null)
				msgs = ((InternalEObject)newCreated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__CREATED, null, msgs);
			msgs = basicSetCreated(newCreated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__CREATED, newCreated, newCreated));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__ENTERER, oldEnterer, newEnterer);
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
				msgs = ((InternalEObject)enterer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__ENTERER, null, msgs);
			if (newEnterer != null)
				msgs = ((InternalEObject)newEnterer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__ENTERER, null, msgs);
			msgs = basicSetEnterer(newEnterer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__ENTERER, newEnterer, newEnterer));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__INSURER, oldInsurer, newInsurer);
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
				msgs = ((InternalEObject)insurer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__INSURER, null, msgs);
			if (newInsurer != null)
				msgs = ((InternalEObject)newInsurer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__INSURER, null, msgs);
			msgs = basicSetInsurer(newInsurer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__INSURER, newInsurer, newInsurer));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PROVIDER, oldProvider, newProvider);
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
				msgs = ((InternalEObject)provider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PROVIDER, null, msgs);
			if (newProvider != null)
				msgs = ((InternalEObject)newProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PROVIDER, null, msgs);
			msgs = basicSetProvider(newProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PROVIDER, newProvider, newProvider));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PRIORITY, oldPriority, newPriority);
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
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PRIORITY, newPriority, newPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getFundsReserveRequested() {
		return fundsReserveRequested;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFundsReserveRequested(CodeableConcept newFundsReserveRequested, NotificationChain msgs) {
		CodeableConcept oldFundsReserveRequested = fundsReserveRequested;
		fundsReserveRequested = newFundsReserveRequested;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__FUNDS_RESERVE_REQUESTED, oldFundsReserveRequested, newFundsReserveRequested);
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
	public void setFundsReserveRequested(CodeableConcept newFundsReserveRequested) {
		if (newFundsReserveRequested != fundsReserveRequested) {
			NotificationChain msgs = null;
			if (fundsReserveRequested != null)
				msgs = ((InternalEObject)fundsReserveRequested).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__FUNDS_RESERVE_REQUESTED, null, msgs);
			if (newFundsReserveRequested != null)
				msgs = ((InternalEObject)newFundsReserveRequested).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__FUNDS_RESERVE_REQUESTED, null, msgs);
			msgs = basicSetFundsReserveRequested(newFundsReserveRequested, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__FUNDS_RESERVE_REQUESTED, newFundsReserveRequested, newFundsReserveRequested));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__FUNDS_RESERVE, oldFundsReserve, newFundsReserve);
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
				msgs = ((InternalEObject)fundsReserve).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__FUNDS_RESERVE, null, msgs);
			if (newFundsReserve != null)
				msgs = ((InternalEObject)newFundsReserve).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__FUNDS_RESERVE, null, msgs);
			msgs = basicSetFundsReserve(newFundsReserve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__FUNDS_RESERVE, newFundsReserve, newFundsReserve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExplanationOfBenefitRelated> getRelated() {
		if (related == null) {
			related = new EObjectContainmentEList<ExplanationOfBenefitRelated>(ExplanationOfBenefitRelated.class, this, FhirPackage.EXPLANATION_OF_BENEFIT__RELATED);
		}
		return related;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getPrescription() {
		return prescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrescription(Reference newPrescription, NotificationChain msgs) {
		Reference oldPrescription = prescription;
		prescription = newPrescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION, oldPrescription, newPrescription);
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
	public void setPrescription(Reference newPrescription) {
		if (newPrescription != prescription) {
			NotificationChain msgs = null;
			if (prescription != null)
				msgs = ((InternalEObject)prescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION, null, msgs);
			if (newPrescription != null)
				msgs = ((InternalEObject)newPrescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION, null, msgs);
			msgs = basicSetPrescription(newPrescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION, newPrescription, newPrescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getOriginalPrescription() {
		return originalPrescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginalPrescription(Reference newOriginalPrescription, NotificationChain msgs) {
		Reference oldOriginalPrescription = originalPrescription;
		originalPrescription = newOriginalPrescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION, oldOriginalPrescription, newOriginalPrescription);
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
	public void setOriginalPrescription(Reference newOriginalPrescription) {
		if (newOriginalPrescription != originalPrescription) {
			NotificationChain msgs = null;
			if (originalPrescription != null)
				msgs = ((InternalEObject)originalPrescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION, null, msgs);
			if (newOriginalPrescription != null)
				msgs = ((InternalEObject)newOriginalPrescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION, null, msgs);
			msgs = basicSetOriginalPrescription(newOriginalPrescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION, newOriginalPrescription, newOriginalPrescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefitPayee getPayee() {
		return payee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPayee(ExplanationOfBenefitPayee newPayee, NotificationChain msgs) {
		ExplanationOfBenefitPayee oldPayee = payee;
		payee = newPayee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PAYEE, oldPayee, newPayee);
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
	public void setPayee(ExplanationOfBenefitPayee newPayee) {
		if (newPayee != payee) {
			NotificationChain msgs = null;
			if (payee != null)
				msgs = ((InternalEObject)payee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PAYEE, null, msgs);
			if (newPayee != null)
				msgs = ((InternalEObject)newPayee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PAYEE, null, msgs);
			msgs = basicSetPayee(newPayee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PAYEE, newPayee, newPayee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getReferral() {
		return referral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferral(Reference newReferral, NotificationChain msgs) {
		Reference oldReferral = referral;
		referral = newReferral;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__REFERRAL, oldReferral, newReferral);
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
	public void setReferral(Reference newReferral) {
		if (newReferral != referral) {
			NotificationChain msgs = null;
			if (referral != null)
				msgs = ((InternalEObject)referral).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__REFERRAL, null, msgs);
			if (newReferral != null)
				msgs = ((InternalEObject)newReferral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__REFERRAL, null, msgs);
			msgs = basicSetReferral(newReferral, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__REFERRAL, newReferral, newReferral));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__FACILITY, oldFacility, newFacility);
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
				msgs = ((InternalEObject)facility).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__FACILITY, null, msgs);
			if (newFacility != null)
				msgs = ((InternalEObject)newFacility).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__FACILITY, null, msgs);
			msgs = basicSetFacility(newFacility, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__FACILITY, newFacility, newFacility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getClaim() {
		return claim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClaim(Reference newClaim, NotificationChain msgs) {
		Reference oldClaim = claim;
		claim = newClaim;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM, oldClaim, newClaim);
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
	public void setClaim(Reference newClaim) {
		if (newClaim != claim) {
			NotificationChain msgs = null;
			if (claim != null)
				msgs = ((InternalEObject)claim).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM, null, msgs);
			if (newClaim != null)
				msgs = ((InternalEObject)newClaim).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM, null, msgs);
			msgs = basicSetClaim(newClaim, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM, newClaim, newClaim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getClaimResponse() {
		return claimResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClaimResponse(Reference newClaimResponse, NotificationChain msgs) {
		Reference oldClaimResponse = claimResponse;
		claimResponse = newClaimResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE, oldClaimResponse, newClaimResponse);
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
	public void setClaimResponse(Reference newClaimResponse) {
		if (newClaimResponse != claimResponse) {
			NotificationChain msgs = null;
			if (claimResponse != null)
				msgs = ((InternalEObject)claimResponse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE, null, msgs);
			if (newClaimResponse != null)
				msgs = ((InternalEObject)newClaimResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE, null, msgs);
			msgs = basicSetClaimResponse(newClaimResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE, newClaimResponse, newClaimResponse));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__OUTCOME, oldOutcome, newOutcome);
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
				msgs = ((InternalEObject)outcome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__OUTCOME, null, msgs);
			if (newOutcome != null)
				msgs = ((InternalEObject)newOutcome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__OUTCOME, null, msgs);
			msgs = basicSetOutcome(newOutcome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__OUTCOME, newOutcome, newOutcome));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__DISPOSITION, oldDisposition, newDisposition);
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
				msgs = ((InternalEObject)disposition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__DISPOSITION, null, msgs);
			if (newDisposition != null)
				msgs = ((InternalEObject)newDisposition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__DISPOSITION, null, msgs);
			msgs = basicSetDisposition(newDisposition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__DISPOSITION, newDisposition, newDisposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.hl7.fhir.String> getPreAuthRef() {
		if (preAuthRef == null) {
			preAuthRef = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.EXPLANATION_OF_BENEFIT__PRE_AUTH_REF);
		}
		return preAuthRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Period> getPreAuthRefPeriod() {
		if (preAuthRefPeriod == null) {
			preAuthRefPeriod = new EObjectContainmentEList<Period>(Period.class, this, FhirPackage.EXPLANATION_OF_BENEFIT__PRE_AUTH_REF_PERIOD);
		}
		return preAuthRefPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExplanationOfBenefitCareTeam> getCareTeam() {
		if (careTeam == null) {
			careTeam = new EObjectContainmentEList<ExplanationOfBenefitCareTeam>(ExplanationOfBenefitCareTeam.class, this, FhirPackage.EXPLANATION_OF_BENEFIT__CARE_TEAM);
		}
		return careTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExplanationOfBenefitSupportingInfo> getSupportingInfo() {
		if (supportingInfo == null) {
			supportingInfo = new EObjectContainmentEList<ExplanationOfBenefitSupportingInfo>(ExplanationOfBenefitSupportingInfo.class, this, FhirPackage.EXPLANATION_OF_BENEFIT__SUPPORTING_INFO);
		}
		return supportingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExplanationOfBenefitDiagnosis> getDiagnosis() {
		if (diagnosis == null) {
			diagnosis = new EObjectContainmentEList<ExplanationOfBenefitDiagnosis>(ExplanationOfBenefitDiagnosis.class, this, FhirPackage.EXPLANATION_OF_BENEFIT__DIAGNOSIS);
		}
		return diagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExplanationOfBenefitProcedure> getProcedure() {
		if (procedure == null) {
			procedure = new EObjectContainmentEList<ExplanationOfBenefitProcedure>(ExplanationOfBenefitProcedure.class, this, FhirPackage.EXPLANATION_OF_BENEFIT__PROCEDURE);
		}
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getPrecedence() {
		return precedence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecedence(PositiveInt newPrecedence, NotificationChain msgs) {
		PositiveInt oldPrecedence = precedence;
		precedence = newPrecedence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PRECEDENCE, oldPrecedence, newPrecedence);
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
	public void setPrecedence(PositiveInt newPrecedence) {
		if (newPrecedence != precedence) {
			NotificationChain msgs = null;
			if (precedence != null)
				msgs = ((InternalEObject)precedence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PRECEDENCE, null, msgs);
			if (newPrecedence != null)
				msgs = ((InternalEObject)newPrecedence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PRECEDENCE, null, msgs);
			msgs = basicSetPrecedence(newPrecedence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PRECEDENCE, newPrecedence, newPrecedence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExplanationOfBenefitInsurance> getInsurance() {
		if (insurance == null) {
			insurance = new EObjectContainmentEList<ExplanationOfBenefitInsurance>(ExplanationOfBenefitInsurance.class, this, FhirPackage.EXPLANATION_OF_BENEFIT__INSURANCE);
		}
		return insurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefitAccident getAccident() {
		return accident;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccident(ExplanationOfBenefitAccident newAccident, NotificationChain msgs) {
		ExplanationOfBenefitAccident oldAccident = accident;
		accident = newAccident;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT, oldAccident, newAccident);
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
	public void setAccident(ExplanationOfBenefitAccident newAccident) {
		if (newAccident != accident) {
			NotificationChain msgs = null;
			if (accident != null)
				msgs = ((InternalEObject)accident).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT, null, msgs);
			if (newAccident != null)
				msgs = ((InternalEObject)newAccident).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT, null, msgs);
			msgs = basicSetAccident(newAccident, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT, newAccident, newAccident));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExplanationOfBenefitItem> getItem() {
		if (item == null) {
			item = new EObjectContainmentEList<ExplanationOfBenefitItem>(ExplanationOfBenefitItem.class, this, FhirPackage.EXPLANATION_OF_BENEFIT__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExplanationOfBenefitAddItem> getAddItem() {
		if (addItem == null) {
			addItem = new EObjectContainmentEList<ExplanationOfBenefitAddItem>(ExplanationOfBenefitAddItem.class, this, FhirPackage.EXPLANATION_OF_BENEFIT__ADD_ITEM);
		}
		return addItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExplanationOfBenefitAdjudication> getAdjudication() {
		if (adjudication == null) {
			adjudication = new EObjectContainmentEList<ExplanationOfBenefitAdjudication>(ExplanationOfBenefitAdjudication.class, this, FhirPackage.EXPLANATION_OF_BENEFIT__ADJUDICATION);
		}
		return adjudication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExplanationOfBenefitTotal> getTotal() {
		if (total == null) {
			total = new EObjectContainmentEList<ExplanationOfBenefitTotal>(ExplanationOfBenefitTotal.class, this, FhirPackage.EXPLANATION_OF_BENEFIT__TOTAL);
		}
		return total;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefitPayment getPayment() {
		return payment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPayment(ExplanationOfBenefitPayment newPayment, NotificationChain msgs) {
		ExplanationOfBenefitPayment oldPayment = payment;
		payment = newPayment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT, oldPayment, newPayment);
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
	public void setPayment(ExplanationOfBenefitPayment newPayment) {
		if (newPayment != payment) {
			NotificationChain msgs = null;
			if (payment != null)
				msgs = ((InternalEObject)payment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT, null, msgs);
			if (newPayment != null)
				msgs = ((InternalEObject)newPayment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT, null, msgs);
			msgs = basicSetPayment(newPayment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT, newPayment, newPayment));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__FORM_CODE, oldFormCode, newFormCode);
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
				msgs = ((InternalEObject)formCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__FORM_CODE, null, msgs);
			if (newFormCode != null)
				msgs = ((InternalEObject)newFormCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__FORM_CODE, null, msgs);
			msgs = basicSetFormCode(newFormCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__FORM_CODE, newFormCode, newFormCode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__FORM, oldForm, newForm);
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
				msgs = ((InternalEObject)form).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__FORM, null, msgs);
			if (newForm != null)
				msgs = ((InternalEObject)newForm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__FORM, null, msgs);
			msgs = basicSetForm(newForm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__FORM, newForm, newForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExplanationOfBenefitProcessNote> getProcessNote() {
		if (processNote == null) {
			processNote = new EObjectContainmentEList<ExplanationOfBenefitProcessNote>(ExplanationOfBenefitProcessNote.class, this, FhirPackage.EXPLANATION_OF_BENEFIT__PROCESS_NOTE);
		}
		return processNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getBenefitPeriod() {
		return benefitPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBenefitPeriod(Period newBenefitPeriod, NotificationChain msgs) {
		Period oldBenefitPeriod = benefitPeriod;
		benefitPeriod = newBenefitPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__BENEFIT_PERIOD, oldBenefitPeriod, newBenefitPeriod);
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
	public void setBenefitPeriod(Period newBenefitPeriod) {
		if (newBenefitPeriod != benefitPeriod) {
			NotificationChain msgs = null;
			if (benefitPeriod != null)
				msgs = ((InternalEObject)benefitPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__BENEFIT_PERIOD, null, msgs);
			if (newBenefitPeriod != null)
				msgs = ((InternalEObject)newBenefitPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__BENEFIT_PERIOD, null, msgs);
			msgs = basicSetBenefitPeriod(newBenefitPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__BENEFIT_PERIOD, newBenefitPeriod, newBenefitPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExplanationOfBenefitBenefitBalance> getBenefitBalance() {
		if (benefitBalance == null) {
			benefitBalance = new EObjectContainmentEList<ExplanationOfBenefitBenefitBalance>(ExplanationOfBenefitBenefitBalance.class, this, FhirPackage.EXPLANATION_OF_BENEFIT__BENEFIT_BALANCE);
		}
		return benefitBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.EXPLANATION_OF_BENEFIT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__SUB_TYPE:
				return basicSetSubType(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__USE:
				return basicSetUse(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__BILLABLE_PERIOD:
				return basicSetBillablePeriod(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__CREATED:
				return basicSetCreated(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__ENTERER:
				return basicSetEnterer(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__INSURER:
				return basicSetInsurer(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__PROVIDER:
				return basicSetProvider(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRIORITY:
				return basicSetPriority(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__FUNDS_RESERVE_REQUESTED:
				return basicSetFundsReserveRequested(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__FUNDS_RESERVE:
				return basicSetFundsReserve(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__RELATED:
				return ((InternalEList<?>)getRelated()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION:
				return basicSetPrescription(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION:
				return basicSetOriginalPrescription(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYEE:
				return basicSetPayee(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__REFERRAL:
				return basicSetReferral(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__FACILITY:
				return basicSetFacility(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM:
				return basicSetClaim(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE:
				return basicSetClaimResponse(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__OUTCOME:
				return basicSetOutcome(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__DISPOSITION:
				return basicSetDisposition(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRE_AUTH_REF:
				return ((InternalEList<?>)getPreAuthRef()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRE_AUTH_REF_PERIOD:
				return ((InternalEList<?>)getPreAuthRefPeriod()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__CARE_TEAM:
				return ((InternalEList<?>)getCareTeam()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__SUPPORTING_INFO:
				return ((InternalEList<?>)getSupportingInfo()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__DIAGNOSIS:
				return ((InternalEList<?>)getDiagnosis()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__PROCEDURE:
				return ((InternalEList<?>)getProcedure()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRECEDENCE:
				return basicSetPrecedence(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__INSURANCE:
				return ((InternalEList<?>)getInsurance()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT:
				return basicSetAccident(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__ADD_ITEM:
				return ((InternalEList<?>)getAddItem()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__ADJUDICATION:
				return ((InternalEList<?>)getAdjudication()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__TOTAL:
				return ((InternalEList<?>)getTotal()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT:
				return basicSetPayment(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__FORM_CODE:
				return basicSetFormCode(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__FORM:
				return basicSetForm(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__PROCESS_NOTE:
				return ((InternalEList<?>)getProcessNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__BENEFIT_PERIOD:
				return basicSetBenefitPeriod(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__BENEFIT_BALANCE:
				return ((InternalEList<?>)getBenefitBalance()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.EXPLANATION_OF_BENEFIT__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.EXPLANATION_OF_BENEFIT__STATUS:
				return getStatus();
			case FhirPackage.EXPLANATION_OF_BENEFIT__TYPE:
				return getType();
			case FhirPackage.EXPLANATION_OF_BENEFIT__SUB_TYPE:
				return getSubType();
			case FhirPackage.EXPLANATION_OF_BENEFIT__USE:
				return getUse();
			case FhirPackage.EXPLANATION_OF_BENEFIT__PATIENT:
				return getPatient();
			case FhirPackage.EXPLANATION_OF_BENEFIT__BILLABLE_PERIOD:
				return getBillablePeriod();
			case FhirPackage.EXPLANATION_OF_BENEFIT__CREATED:
				return getCreated();
			case FhirPackage.EXPLANATION_OF_BENEFIT__ENTERER:
				return getEnterer();
			case FhirPackage.EXPLANATION_OF_BENEFIT__INSURER:
				return getInsurer();
			case FhirPackage.EXPLANATION_OF_BENEFIT__PROVIDER:
				return getProvider();
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRIORITY:
				return getPriority();
			case FhirPackage.EXPLANATION_OF_BENEFIT__FUNDS_RESERVE_REQUESTED:
				return getFundsReserveRequested();
			case FhirPackage.EXPLANATION_OF_BENEFIT__FUNDS_RESERVE:
				return getFundsReserve();
			case FhirPackage.EXPLANATION_OF_BENEFIT__RELATED:
				return getRelated();
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION:
				return getPrescription();
			case FhirPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION:
				return getOriginalPrescription();
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYEE:
				return getPayee();
			case FhirPackage.EXPLANATION_OF_BENEFIT__REFERRAL:
				return getReferral();
			case FhirPackage.EXPLANATION_OF_BENEFIT__FACILITY:
				return getFacility();
			case FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM:
				return getClaim();
			case FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE:
				return getClaimResponse();
			case FhirPackage.EXPLANATION_OF_BENEFIT__OUTCOME:
				return getOutcome();
			case FhirPackage.EXPLANATION_OF_BENEFIT__DISPOSITION:
				return getDisposition();
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRE_AUTH_REF:
				return getPreAuthRef();
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRE_AUTH_REF_PERIOD:
				return getPreAuthRefPeriod();
			case FhirPackage.EXPLANATION_OF_BENEFIT__CARE_TEAM:
				return getCareTeam();
			case FhirPackage.EXPLANATION_OF_BENEFIT__SUPPORTING_INFO:
				return getSupportingInfo();
			case FhirPackage.EXPLANATION_OF_BENEFIT__DIAGNOSIS:
				return getDiagnosis();
			case FhirPackage.EXPLANATION_OF_BENEFIT__PROCEDURE:
				return getProcedure();
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRECEDENCE:
				return getPrecedence();
			case FhirPackage.EXPLANATION_OF_BENEFIT__INSURANCE:
				return getInsurance();
			case FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT:
				return getAccident();
			case FhirPackage.EXPLANATION_OF_BENEFIT__ITEM:
				return getItem();
			case FhirPackage.EXPLANATION_OF_BENEFIT__ADD_ITEM:
				return getAddItem();
			case FhirPackage.EXPLANATION_OF_BENEFIT__ADJUDICATION:
				return getAdjudication();
			case FhirPackage.EXPLANATION_OF_BENEFIT__TOTAL:
				return getTotal();
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT:
				return getPayment();
			case FhirPackage.EXPLANATION_OF_BENEFIT__FORM_CODE:
				return getFormCode();
			case FhirPackage.EXPLANATION_OF_BENEFIT__FORM:
				return getForm();
			case FhirPackage.EXPLANATION_OF_BENEFIT__PROCESS_NOTE:
				return getProcessNote();
			case FhirPackage.EXPLANATION_OF_BENEFIT__BENEFIT_PERIOD:
				return getBenefitPeriod();
			case FhirPackage.EXPLANATION_OF_BENEFIT__BENEFIT_BALANCE:
				return getBenefitBalance();
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
			case FhirPackage.EXPLANATION_OF_BENEFIT__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__STATUS:
				setStatus((ExplanationOfBenefitStatus)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__SUB_TYPE:
				setSubType((CodeableConcept)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__USE:
				setUse((Use)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__BILLABLE_PERIOD:
				setBillablePeriod((Period)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__CREATED:
				setCreated((DateTime)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ENTERER:
				setEnterer((Reference)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__INSURER:
				setInsurer((Reference)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PROVIDER:
				setProvider((Reference)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRIORITY:
				setPriority((CodeableConcept)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__FUNDS_RESERVE_REQUESTED:
				setFundsReserveRequested((CodeableConcept)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__FUNDS_RESERVE:
				setFundsReserve((CodeableConcept)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__RELATED:
				getRelated().clear();
				getRelated().addAll((Collection<? extends ExplanationOfBenefitRelated>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION:
				setPrescription((Reference)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION:
				setOriginalPrescription((Reference)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYEE:
				setPayee((ExplanationOfBenefitPayee)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__REFERRAL:
				setReferral((Reference)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__FACILITY:
				setFacility((Reference)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM:
				setClaim((Reference)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE:
				setClaimResponse((Reference)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__OUTCOME:
				setOutcome((ClaimProcessingCodes)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__DISPOSITION:
				setDisposition((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRE_AUTH_REF:
				getPreAuthRef().clear();
				getPreAuthRef().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRE_AUTH_REF_PERIOD:
				getPreAuthRefPeriod().clear();
				getPreAuthRefPeriod().addAll((Collection<? extends Period>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__CARE_TEAM:
				getCareTeam().clear();
				getCareTeam().addAll((Collection<? extends ExplanationOfBenefitCareTeam>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__SUPPORTING_INFO:
				getSupportingInfo().clear();
				getSupportingInfo().addAll((Collection<? extends ExplanationOfBenefitSupportingInfo>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__DIAGNOSIS:
				getDiagnosis().clear();
				getDiagnosis().addAll((Collection<? extends ExplanationOfBenefitDiagnosis>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PROCEDURE:
				getProcedure().clear();
				getProcedure().addAll((Collection<? extends ExplanationOfBenefitProcedure>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRECEDENCE:
				setPrecedence((PositiveInt)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__INSURANCE:
				getInsurance().clear();
				getInsurance().addAll((Collection<? extends ExplanationOfBenefitInsurance>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT:
				setAccident((ExplanationOfBenefitAccident)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends ExplanationOfBenefitItem>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ADD_ITEM:
				getAddItem().clear();
				getAddItem().addAll((Collection<? extends ExplanationOfBenefitAddItem>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ADJUDICATION:
				getAdjudication().clear();
				getAdjudication().addAll((Collection<? extends ExplanationOfBenefitAdjudication>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__TOTAL:
				getTotal().clear();
				getTotal().addAll((Collection<? extends ExplanationOfBenefitTotal>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT:
				setPayment((ExplanationOfBenefitPayment)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__FORM_CODE:
				setFormCode((CodeableConcept)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__FORM:
				setForm((Attachment)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PROCESS_NOTE:
				getProcessNote().clear();
				getProcessNote().addAll((Collection<? extends ExplanationOfBenefitProcessNote>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__BENEFIT_PERIOD:
				setBenefitPeriod((Period)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__BENEFIT_BALANCE:
				getBenefitBalance().clear();
				getBenefitBalance().addAll((Collection<? extends ExplanationOfBenefitBenefitBalance>)newValue);
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
			case FhirPackage.EXPLANATION_OF_BENEFIT__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__STATUS:
				setStatus((ExplanationOfBenefitStatus)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__SUB_TYPE:
				setSubType((CodeableConcept)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__USE:
				setUse((Use)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PATIENT:
				setPatient((Reference)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__BILLABLE_PERIOD:
				setBillablePeriod((Period)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__CREATED:
				setCreated((DateTime)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ENTERER:
				setEnterer((Reference)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__INSURER:
				setInsurer((Reference)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PROVIDER:
				setProvider((Reference)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRIORITY:
				setPriority((CodeableConcept)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__FUNDS_RESERVE_REQUESTED:
				setFundsReserveRequested((CodeableConcept)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__FUNDS_RESERVE:
				setFundsReserve((CodeableConcept)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__RELATED:
				getRelated().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION:
				setPrescription((Reference)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION:
				setOriginalPrescription((Reference)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYEE:
				setPayee((ExplanationOfBenefitPayee)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__REFERRAL:
				setReferral((Reference)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__FACILITY:
				setFacility((Reference)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM:
				setClaim((Reference)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE:
				setClaimResponse((Reference)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__OUTCOME:
				setOutcome((ClaimProcessingCodes)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__DISPOSITION:
				setDisposition((org.hl7.fhir.String)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRE_AUTH_REF:
				getPreAuthRef().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRE_AUTH_REF_PERIOD:
				getPreAuthRefPeriod().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__CARE_TEAM:
				getCareTeam().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__SUPPORTING_INFO:
				getSupportingInfo().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__DIAGNOSIS:
				getDiagnosis().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PROCEDURE:
				getProcedure().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRECEDENCE:
				setPrecedence((PositiveInt)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__INSURANCE:
				getInsurance().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT:
				setAccident((ExplanationOfBenefitAccident)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ITEM:
				getItem().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ADD_ITEM:
				getAddItem().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ADJUDICATION:
				getAdjudication().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__TOTAL:
				getTotal().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT:
				setPayment((ExplanationOfBenefitPayment)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__FORM_CODE:
				setFormCode((CodeableConcept)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__FORM:
				setForm((Attachment)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PROCESS_NOTE:
				getProcessNote().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__BENEFIT_PERIOD:
				setBenefitPeriod((Period)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__BENEFIT_BALANCE:
				getBenefitBalance().clear();
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
			case FhirPackage.EXPLANATION_OF_BENEFIT__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT__STATUS:
				return status != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__TYPE:
				return type != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__SUB_TYPE:
				return subType != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__USE:
				return use != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PATIENT:
				return patient != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__BILLABLE_PERIOD:
				return billablePeriod != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__CREATED:
				return created != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ENTERER:
				return enterer != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__INSURER:
				return insurer != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PROVIDER:
				return provider != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRIORITY:
				return priority != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__FUNDS_RESERVE_REQUESTED:
				return fundsReserveRequested != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__FUNDS_RESERVE:
				return fundsReserve != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__RELATED:
				return related != null && !related.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION:
				return prescription != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION:
				return originalPrescription != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYEE:
				return payee != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__REFERRAL:
				return referral != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__FACILITY:
				return facility != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM:
				return claim != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE:
				return claimResponse != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__OUTCOME:
				return outcome != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__DISPOSITION:
				return disposition != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRE_AUTH_REF:
				return preAuthRef != null && !preAuthRef.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRE_AUTH_REF_PERIOD:
				return preAuthRefPeriod != null && !preAuthRefPeriod.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT__CARE_TEAM:
				return careTeam != null && !careTeam.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT__SUPPORTING_INFO:
				return supportingInfo != null && !supportingInfo.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT__DIAGNOSIS:
				return diagnosis != null && !diagnosis.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT__PROCEDURE:
				return procedure != null && !procedure.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRECEDENCE:
				return precedence != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__INSURANCE:
				return insurance != null && !insurance.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT:
				return accident != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ITEM:
				return item != null && !item.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT__ADD_ITEM:
				return addItem != null && !addItem.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT__ADJUDICATION:
				return adjudication != null && !adjudication.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT__TOTAL:
				return total != null && !total.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT:
				return payment != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__FORM_CODE:
				return formCode != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__FORM:
				return form != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PROCESS_NOTE:
				return processNote != null && !processNote.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT__BENEFIT_PERIOD:
				return benefitPeriod != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__BENEFIT_BALANCE:
				return benefitBalance != null && !benefitBalance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExplanationOfBenefitImpl
