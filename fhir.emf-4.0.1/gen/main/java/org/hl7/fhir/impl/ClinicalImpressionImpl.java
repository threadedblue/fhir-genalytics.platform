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
import org.hl7.fhir.ClinicalImpression;
import org.hl7.fhir.ClinicalImpressionFinding;
import org.hl7.fhir.ClinicalImpressionInvestigation;
import org.hl7.fhir.ClinicalImpressionStatus;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clinical Impression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ClinicalImpressionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalImpressionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalImpressionImpl#getStatusReason <em>Status Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalImpressionImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalImpressionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalImpressionImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalImpressionImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalImpressionImpl#getEffectiveDateTime <em>Effective Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalImpressionImpl#getEffectivePeriod <em>Effective Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalImpressionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalImpressionImpl#getAssessor <em>Assessor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalImpressionImpl#getPrevious <em>Previous</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalImpressionImpl#getProblem <em>Problem</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalImpressionImpl#getInvestigation <em>Investigation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalImpressionImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalImpressionImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalImpressionImpl#getFinding <em>Finding</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalImpressionImpl#getPrognosisCodeableConcept <em>Prognosis Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalImpressionImpl#getPrognosisReference <em>Prognosis Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalImpressionImpl#getSupportingInfo <em>Supporting Info</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalImpressionImpl#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClinicalImpressionImpl extends DomainResourceImpl implements ClinicalImpression {
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
	protected ClinicalImpressionStatus status;

	/**
	 * The cached value of the '{@link #getStatusReason() <em>Status Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept statusReason;

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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String description;

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
	 * The cached value of the '{@link #getEncounter() <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounter()
	 * @generated
	 * @ordered
	 */
	protected Reference encounter;

	/**
	 * The cached value of the '{@link #getEffectiveDateTime() <em>Effective Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime effectiveDateTime;

	/**
	 * The cached value of the '{@link #getEffectivePeriod() <em>Effective Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectivePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period effectivePeriod;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime date;

	/**
	 * The cached value of the '{@link #getAssessor() <em>Assessor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessor()
	 * @generated
	 * @ordered
	 */
	protected Reference assessor;

	/**
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected Reference previous;

	/**
	 * The cached value of the '{@link #getProblem() <em>Problem</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblem()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> problem;

	/**
	 * The cached value of the '{@link #getInvestigation() <em>Investigation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvestigation()
	 * @generated
	 * @ordered
	 */
	protected EList<ClinicalImpressionInvestigation> investigation;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> protocol;

	/**
	 * The cached value of the '{@link #getSummary() <em>Summary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String summary;

	/**
	 * The cached value of the '{@link #getFinding() <em>Finding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinding()
	 * @generated
	 * @ordered
	 */
	protected EList<ClinicalImpressionFinding> finding;

	/**
	 * The cached value of the '{@link #getPrognosisCodeableConcept() <em>Prognosis Codeable Concept</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrognosisCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> prognosisCodeableConcept;

	/**
	 * The cached value of the '{@link #getPrognosisReference() <em>Prognosis Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrognosisReference()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> prognosisReference;

	/**
	 * The cached value of the '{@link #getSupportingInfo() <em>Supporting Info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> supportingInfo;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClinicalImpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getClinicalImpression();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.CLINICAL_IMPRESSION__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClinicalImpressionStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(ClinicalImpressionStatus newStatus, NotificationChain msgs) {
		ClinicalImpressionStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__STATUS, oldStatus, newStatus);
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
	public void setStatus(ClinicalImpressionStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getStatusReason() {
		return statusReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatusReason(CodeableConcept newStatusReason, NotificationChain msgs) {
		CodeableConcept oldStatusReason = statusReason;
		statusReason = newStatusReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__STATUS_REASON, oldStatusReason, newStatusReason);
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
	public void setStatusReason(CodeableConcept newStatusReason) {
		if (newStatusReason != statusReason) {
			NotificationChain msgs = null;
			if (statusReason != null)
				msgs = ((InternalEObject)statusReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__STATUS_REASON, null, msgs);
			if (newStatusReason != null)
				msgs = ((InternalEObject)newStatusReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__STATUS_REASON, null, msgs);
			msgs = basicSetStatusReason(newStatusReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__STATUS_REASON, newStatusReason, newStatusReason));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__CODE, oldCode, newCode);
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
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.hl7.fhir.String newDescription, NotificationChain msgs) {
		org.hl7.fhir.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(org.hl7.fhir.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__DESCRIPTION, newDescription, newDescription));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getEncounter() {
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncounter(Reference newEncounter, NotificationChain msgs) {
		Reference oldEncounter = encounter;
		encounter = newEncounter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__ENCOUNTER, oldEncounter, newEncounter);
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
	public void setEncounter(Reference newEncounter) {
		if (newEncounter != encounter) {
			NotificationChain msgs = null;
			if (encounter != null)
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getEffectiveDateTime() {
		return effectiveDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffectiveDateTime(DateTime newEffectiveDateTime, NotificationChain msgs) {
		DateTime oldEffectiveDateTime = effectiveDateTime;
		effectiveDateTime = newEffectiveDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__EFFECTIVE_DATE_TIME, oldEffectiveDateTime, newEffectiveDateTime);
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
	public void setEffectiveDateTime(DateTime newEffectiveDateTime) {
		if (newEffectiveDateTime != effectiveDateTime) {
			NotificationChain msgs = null;
			if (effectiveDateTime != null)
				msgs = ((InternalEObject)effectiveDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__EFFECTIVE_DATE_TIME, null, msgs);
			if (newEffectiveDateTime != null)
				msgs = ((InternalEObject)newEffectiveDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__EFFECTIVE_DATE_TIME, null, msgs);
			msgs = basicSetEffectiveDateTime(newEffectiveDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__EFFECTIVE_DATE_TIME, newEffectiveDateTime, newEffectiveDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getEffectivePeriod() {
		return effectivePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffectivePeriod(Period newEffectivePeriod, NotificationChain msgs) {
		Period oldEffectivePeriod = effectivePeriod;
		effectivePeriod = newEffectivePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__EFFECTIVE_PERIOD, oldEffectivePeriod, newEffectivePeriod);
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
	public void setEffectivePeriod(Period newEffectivePeriod) {
		if (newEffectivePeriod != effectivePeriod) {
			NotificationChain msgs = null;
			if (effectivePeriod != null)
				msgs = ((InternalEObject)effectivePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__EFFECTIVE_PERIOD, null, msgs);
			if (newEffectivePeriod != null)
				msgs = ((InternalEObject)newEffectivePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__EFFECTIVE_PERIOD, null, msgs);
			msgs = basicSetEffectivePeriod(newEffectivePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__EFFECTIVE_PERIOD, newEffectivePeriod, newEffectivePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(DateTime newDate, NotificationChain msgs) {
		DateTime oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__DATE, oldDate, newDate);
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
	public void setDate(DateTime newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getAssessor() {
		return assessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssessor(Reference newAssessor, NotificationChain msgs) {
		Reference oldAssessor = assessor;
		assessor = newAssessor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__ASSESSOR, oldAssessor, newAssessor);
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
	public void setAssessor(Reference newAssessor) {
		if (newAssessor != assessor) {
			NotificationChain msgs = null;
			if (assessor != null)
				msgs = ((InternalEObject)assessor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__ASSESSOR, null, msgs);
			if (newAssessor != null)
				msgs = ((InternalEObject)newAssessor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__ASSESSOR, null, msgs);
			msgs = basicSetAssessor(newAssessor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__ASSESSOR, newAssessor, newAssessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getPrevious() {
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrevious(Reference newPrevious, NotificationChain msgs) {
		Reference oldPrevious = previous;
		previous = newPrevious;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__PREVIOUS, oldPrevious, newPrevious);
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
	public void setPrevious(Reference newPrevious) {
		if (newPrevious != previous) {
			NotificationChain msgs = null;
			if (previous != null)
				msgs = ((InternalEObject)previous).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__PREVIOUS, null, msgs);
			if (newPrevious != null)
				msgs = ((InternalEObject)newPrevious).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__PREVIOUS, null, msgs);
			msgs = basicSetPrevious(newPrevious, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__PREVIOUS, newPrevious, newPrevious));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getProblem() {
		if (problem == null) {
			problem = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CLINICAL_IMPRESSION__PROBLEM);
		}
		return problem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClinicalImpressionInvestigation> getInvestigation() {
		if (investigation == null) {
			investigation = new EObjectContainmentEList<ClinicalImpressionInvestigation>(ClinicalImpressionInvestigation.class, this, FhirPackage.CLINICAL_IMPRESSION__INVESTIGATION);
		}
		return investigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Uri> getProtocol() {
		if (protocol == null) {
			protocol = new EObjectContainmentEList<Uri>(Uri.class, this, FhirPackage.CLINICAL_IMPRESSION__PROTOCOL);
		}
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getSummary() {
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSummary(org.hl7.fhir.String newSummary, NotificationChain msgs) {
		org.hl7.fhir.String oldSummary = summary;
		summary = newSummary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__SUMMARY, oldSummary, newSummary);
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
	public void setSummary(org.hl7.fhir.String newSummary) {
		if (newSummary != summary) {
			NotificationChain msgs = null;
			if (summary != null)
				msgs = ((InternalEObject)summary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__SUMMARY, null, msgs);
			if (newSummary != null)
				msgs = ((InternalEObject)newSummary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_IMPRESSION__SUMMARY, null, msgs);
			msgs = basicSetSummary(newSummary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_IMPRESSION__SUMMARY, newSummary, newSummary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClinicalImpressionFinding> getFinding() {
		if (finding == null) {
			finding = new EObjectContainmentEList<ClinicalImpressionFinding>(ClinicalImpressionFinding.class, this, FhirPackage.CLINICAL_IMPRESSION__FINDING);
		}
		return finding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getPrognosisCodeableConcept() {
		if (prognosisCodeableConcept == null) {
			prognosisCodeableConcept = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CLINICAL_IMPRESSION__PROGNOSIS_CODEABLE_CONCEPT);
		}
		return prognosisCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getPrognosisReference() {
		if (prognosisReference == null) {
			prognosisReference = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CLINICAL_IMPRESSION__PROGNOSIS_REFERENCE);
		}
		return prognosisReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSupportingInfo() {
		if (supportingInfo == null) {
			supportingInfo = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CLINICAL_IMPRESSION__SUPPORTING_INFO);
		}
		return supportingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.CLINICAL_IMPRESSION__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CLINICAL_IMPRESSION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLINICAL_IMPRESSION__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.CLINICAL_IMPRESSION__STATUS_REASON:
				return basicSetStatusReason(null, msgs);
			case FhirPackage.CLINICAL_IMPRESSION__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.CLINICAL_IMPRESSION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.CLINICAL_IMPRESSION__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.CLINICAL_IMPRESSION__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FhirPackage.CLINICAL_IMPRESSION__EFFECTIVE_DATE_TIME:
				return basicSetEffectiveDateTime(null, msgs);
			case FhirPackage.CLINICAL_IMPRESSION__EFFECTIVE_PERIOD:
				return basicSetEffectivePeriod(null, msgs);
			case FhirPackage.CLINICAL_IMPRESSION__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.CLINICAL_IMPRESSION__ASSESSOR:
				return basicSetAssessor(null, msgs);
			case FhirPackage.CLINICAL_IMPRESSION__PREVIOUS:
				return basicSetPrevious(null, msgs);
			case FhirPackage.CLINICAL_IMPRESSION__PROBLEM:
				return ((InternalEList<?>)getProblem()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLINICAL_IMPRESSION__INVESTIGATION:
				return ((InternalEList<?>)getInvestigation()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLINICAL_IMPRESSION__PROTOCOL:
				return ((InternalEList<?>)getProtocol()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLINICAL_IMPRESSION__SUMMARY:
				return basicSetSummary(null, msgs);
			case FhirPackage.CLINICAL_IMPRESSION__FINDING:
				return ((InternalEList<?>)getFinding()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLINICAL_IMPRESSION__PROGNOSIS_CODEABLE_CONCEPT:
				return ((InternalEList<?>)getPrognosisCodeableConcept()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLINICAL_IMPRESSION__PROGNOSIS_REFERENCE:
				return ((InternalEList<?>)getPrognosisReference()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLINICAL_IMPRESSION__SUPPORTING_INFO:
				return ((InternalEList<?>)getSupportingInfo()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLINICAL_IMPRESSION__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CLINICAL_IMPRESSION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.CLINICAL_IMPRESSION__STATUS:
				return getStatus();
			case FhirPackage.CLINICAL_IMPRESSION__STATUS_REASON:
				return getStatusReason();
			case FhirPackage.CLINICAL_IMPRESSION__CODE:
				return getCode();
			case FhirPackage.CLINICAL_IMPRESSION__DESCRIPTION:
				return getDescription();
			case FhirPackage.CLINICAL_IMPRESSION__SUBJECT:
				return getSubject();
			case FhirPackage.CLINICAL_IMPRESSION__ENCOUNTER:
				return getEncounter();
			case FhirPackage.CLINICAL_IMPRESSION__EFFECTIVE_DATE_TIME:
				return getEffectiveDateTime();
			case FhirPackage.CLINICAL_IMPRESSION__EFFECTIVE_PERIOD:
				return getEffectivePeriod();
			case FhirPackage.CLINICAL_IMPRESSION__DATE:
				return getDate();
			case FhirPackage.CLINICAL_IMPRESSION__ASSESSOR:
				return getAssessor();
			case FhirPackage.CLINICAL_IMPRESSION__PREVIOUS:
				return getPrevious();
			case FhirPackage.CLINICAL_IMPRESSION__PROBLEM:
				return getProblem();
			case FhirPackage.CLINICAL_IMPRESSION__INVESTIGATION:
				return getInvestigation();
			case FhirPackage.CLINICAL_IMPRESSION__PROTOCOL:
				return getProtocol();
			case FhirPackage.CLINICAL_IMPRESSION__SUMMARY:
				return getSummary();
			case FhirPackage.CLINICAL_IMPRESSION__FINDING:
				return getFinding();
			case FhirPackage.CLINICAL_IMPRESSION__PROGNOSIS_CODEABLE_CONCEPT:
				return getPrognosisCodeableConcept();
			case FhirPackage.CLINICAL_IMPRESSION__PROGNOSIS_REFERENCE:
				return getPrognosisReference();
			case FhirPackage.CLINICAL_IMPRESSION__SUPPORTING_INFO:
				return getSupportingInfo();
			case FhirPackage.CLINICAL_IMPRESSION__NOTE:
				return getNote();
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
			case FhirPackage.CLINICAL_IMPRESSION__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__STATUS:
				setStatus((ClinicalImpressionStatus)newValue);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__STATUS_REASON:
				setStatusReason((CodeableConcept)newValue);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__EFFECTIVE_DATE_TIME:
				setEffectiveDateTime((DateTime)newValue);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)newValue);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__ASSESSOR:
				setAssessor((Reference)newValue);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__PREVIOUS:
				setPrevious((Reference)newValue);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__PROBLEM:
				getProblem().clear();
				getProblem().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__INVESTIGATION:
				getInvestigation().clear();
				getInvestigation().addAll((Collection<? extends ClinicalImpressionInvestigation>)newValue);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__PROTOCOL:
				getProtocol().clear();
				getProtocol().addAll((Collection<? extends Uri>)newValue);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__SUMMARY:
				setSummary((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__FINDING:
				getFinding().clear();
				getFinding().addAll((Collection<? extends ClinicalImpressionFinding>)newValue);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__PROGNOSIS_CODEABLE_CONCEPT:
				getPrognosisCodeableConcept().clear();
				getPrognosisCodeableConcept().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__PROGNOSIS_REFERENCE:
				getPrognosisReference().clear();
				getPrognosisReference().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__SUPPORTING_INFO:
				getSupportingInfo().clear();
				getSupportingInfo().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
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
			case FhirPackage.CLINICAL_IMPRESSION__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.CLINICAL_IMPRESSION__STATUS:
				setStatus((ClinicalImpressionStatus)null);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__STATUS_REASON:
				setStatusReason((CodeableConcept)null);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__EFFECTIVE_DATE_TIME:
				setEffectiveDateTime((DateTime)null);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)null);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__ASSESSOR:
				setAssessor((Reference)null);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__PREVIOUS:
				setPrevious((Reference)null);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__PROBLEM:
				getProblem().clear();
				return;
			case FhirPackage.CLINICAL_IMPRESSION__INVESTIGATION:
				getInvestigation().clear();
				return;
			case FhirPackage.CLINICAL_IMPRESSION__PROTOCOL:
				getProtocol().clear();
				return;
			case FhirPackage.CLINICAL_IMPRESSION__SUMMARY:
				setSummary((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CLINICAL_IMPRESSION__FINDING:
				getFinding().clear();
				return;
			case FhirPackage.CLINICAL_IMPRESSION__PROGNOSIS_CODEABLE_CONCEPT:
				getPrognosisCodeableConcept().clear();
				return;
			case FhirPackage.CLINICAL_IMPRESSION__PROGNOSIS_REFERENCE:
				getPrognosisReference().clear();
				return;
			case FhirPackage.CLINICAL_IMPRESSION__SUPPORTING_INFO:
				getSupportingInfo().clear();
				return;
			case FhirPackage.CLINICAL_IMPRESSION__NOTE:
				getNote().clear();
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
			case FhirPackage.CLINICAL_IMPRESSION__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.CLINICAL_IMPRESSION__STATUS:
				return status != null;
			case FhirPackage.CLINICAL_IMPRESSION__STATUS_REASON:
				return statusReason != null;
			case FhirPackage.CLINICAL_IMPRESSION__CODE:
				return code != null;
			case FhirPackage.CLINICAL_IMPRESSION__DESCRIPTION:
				return description != null;
			case FhirPackage.CLINICAL_IMPRESSION__SUBJECT:
				return subject != null;
			case FhirPackage.CLINICAL_IMPRESSION__ENCOUNTER:
				return encounter != null;
			case FhirPackage.CLINICAL_IMPRESSION__EFFECTIVE_DATE_TIME:
				return effectiveDateTime != null;
			case FhirPackage.CLINICAL_IMPRESSION__EFFECTIVE_PERIOD:
				return effectivePeriod != null;
			case FhirPackage.CLINICAL_IMPRESSION__DATE:
				return date != null;
			case FhirPackage.CLINICAL_IMPRESSION__ASSESSOR:
				return assessor != null;
			case FhirPackage.CLINICAL_IMPRESSION__PREVIOUS:
				return previous != null;
			case FhirPackage.CLINICAL_IMPRESSION__PROBLEM:
				return problem != null && !problem.isEmpty();
			case FhirPackage.CLINICAL_IMPRESSION__INVESTIGATION:
				return investigation != null && !investigation.isEmpty();
			case FhirPackage.CLINICAL_IMPRESSION__PROTOCOL:
				return protocol != null && !protocol.isEmpty();
			case FhirPackage.CLINICAL_IMPRESSION__SUMMARY:
				return summary != null;
			case FhirPackage.CLINICAL_IMPRESSION__FINDING:
				return finding != null && !finding.isEmpty();
			case FhirPackage.CLINICAL_IMPRESSION__PROGNOSIS_CODEABLE_CONCEPT:
				return prognosisCodeableConcept != null && !prognosisCodeableConcept.isEmpty();
			case FhirPackage.CLINICAL_IMPRESSION__PROGNOSIS_REFERENCE:
				return prognosisReference != null && !prognosisReference.isEmpty();
			case FhirPackage.CLINICAL_IMPRESSION__SUPPORTING_INFO:
				return supportingInfo != null && !supportingInfo.isEmpty();
			case FhirPackage.CLINICAL_IMPRESSION__NOTE:
				return note != null && !note.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClinicalImpressionImpl
