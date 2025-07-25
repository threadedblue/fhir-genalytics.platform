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
import org.hl7.fhir.DateTime;
import org.hl7.fhir.DetectedIssue;
import org.hl7.fhir.DetectedIssueEvidence;
import org.hl7.fhir.DetectedIssueMitigation;
import org.hl7.fhir.DetectedIssueSeverity;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.ObservationStatus;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Detected Issue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DetectedIssueImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DetectedIssueImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DetectedIssueImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DetectedIssueImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DetectedIssueImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DetectedIssueImpl#getIdentifiedDateTime <em>Identified Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DetectedIssueImpl#getIdentifiedPeriod <em>Identified Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DetectedIssueImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DetectedIssueImpl#getImplicated <em>Implicated</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DetectedIssueImpl#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DetectedIssueImpl#getDetail <em>Detail</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DetectedIssueImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DetectedIssueImpl#getMitigation <em>Mitigation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DetectedIssueImpl extends DomainResourceImpl implements DetectedIssue {
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
	protected ObservationStatus status;

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
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected DetectedIssueSeverity severity;

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
	 * The cached value of the '{@link #getIdentifiedDateTime() <em>Identified Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiedDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime identifiedDateTime;

	/**
	 * The cached value of the '{@link #getIdentifiedPeriod() <em>Identified Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiedPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period identifiedPeriod;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected Reference author;

	/**
	 * The cached value of the '{@link #getImplicated() <em>Implicated</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicated()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> implicated;

	/**
	 * The cached value of the '{@link #getEvidence() <em>Evidence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvidence()
	 * @generated
	 * @ordered
	 */
	protected EList<DetectedIssueEvidence> evidence;

	/**
	 * The cached value of the '{@link #getDetail() <em>Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetail()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String detail;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected Uri reference;

	/**
	 * The cached value of the '{@link #getMitigation() <em>Mitigation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMitigation()
	 * @generated
	 * @ordered
	 */
	protected EList<DetectedIssueMitigation> mitigation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DetectedIssueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDetectedIssue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.DETECTED_ISSUE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObservationStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(ObservationStatus newStatus, NotificationChain msgs) {
		ObservationStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DETECTED_ISSUE__STATUS, oldStatus, newStatus);
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
	public void setStatus(ObservationStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DETECTED_ISSUE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DETECTED_ISSUE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DETECTED_ISSUE__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DETECTED_ISSUE__CODE, oldCode, newCode);
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
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DETECTED_ISSUE__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DETECTED_ISSUE__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DETECTED_ISSUE__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DetectedIssueSeverity getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeverity(DetectedIssueSeverity newSeverity, NotificationChain msgs) {
		DetectedIssueSeverity oldSeverity = severity;
		severity = newSeverity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DETECTED_ISSUE__SEVERITY, oldSeverity, newSeverity);
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
	public void setSeverity(DetectedIssueSeverity newSeverity) {
		if (newSeverity != severity) {
			NotificationChain msgs = null;
			if (severity != null)
				msgs = ((InternalEObject)severity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DETECTED_ISSUE__SEVERITY, null, msgs);
			if (newSeverity != null)
				msgs = ((InternalEObject)newSeverity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DETECTED_ISSUE__SEVERITY, null, msgs);
			msgs = basicSetSeverity(newSeverity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DETECTED_ISSUE__SEVERITY, newSeverity, newSeverity));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DETECTED_ISSUE__PATIENT, oldPatient, newPatient);
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
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DETECTED_ISSUE__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DETECTED_ISSUE__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DETECTED_ISSUE__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getIdentifiedDateTime() {
		return identifiedDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifiedDateTime(DateTime newIdentifiedDateTime, NotificationChain msgs) {
		DateTime oldIdentifiedDateTime = identifiedDateTime;
		identifiedDateTime = newIdentifiedDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DETECTED_ISSUE__IDENTIFIED_DATE_TIME, oldIdentifiedDateTime, newIdentifiedDateTime);
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
	public void setIdentifiedDateTime(DateTime newIdentifiedDateTime) {
		if (newIdentifiedDateTime != identifiedDateTime) {
			NotificationChain msgs = null;
			if (identifiedDateTime != null)
				msgs = ((InternalEObject)identifiedDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DETECTED_ISSUE__IDENTIFIED_DATE_TIME, null, msgs);
			if (newIdentifiedDateTime != null)
				msgs = ((InternalEObject)newIdentifiedDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DETECTED_ISSUE__IDENTIFIED_DATE_TIME, null, msgs);
			msgs = basicSetIdentifiedDateTime(newIdentifiedDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DETECTED_ISSUE__IDENTIFIED_DATE_TIME, newIdentifiedDateTime, newIdentifiedDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getIdentifiedPeriod() {
		return identifiedPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifiedPeriod(Period newIdentifiedPeriod, NotificationChain msgs) {
		Period oldIdentifiedPeriod = identifiedPeriod;
		identifiedPeriod = newIdentifiedPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DETECTED_ISSUE__IDENTIFIED_PERIOD, oldIdentifiedPeriod, newIdentifiedPeriod);
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
	public void setIdentifiedPeriod(Period newIdentifiedPeriod) {
		if (newIdentifiedPeriod != identifiedPeriod) {
			NotificationChain msgs = null;
			if (identifiedPeriod != null)
				msgs = ((InternalEObject)identifiedPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DETECTED_ISSUE__IDENTIFIED_PERIOD, null, msgs);
			if (newIdentifiedPeriod != null)
				msgs = ((InternalEObject)newIdentifiedPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DETECTED_ISSUE__IDENTIFIED_PERIOD, null, msgs);
			msgs = basicSetIdentifiedPeriod(newIdentifiedPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DETECTED_ISSUE__IDENTIFIED_PERIOD, newIdentifiedPeriod, newIdentifiedPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthor(Reference newAuthor, NotificationChain msgs) {
		Reference oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DETECTED_ISSUE__AUTHOR, oldAuthor, newAuthor);
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
	public void setAuthor(Reference newAuthor) {
		if (newAuthor != author) {
			NotificationChain msgs = null;
			if (author != null)
				msgs = ((InternalEObject)author).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DETECTED_ISSUE__AUTHOR, null, msgs);
			if (newAuthor != null)
				msgs = ((InternalEObject)newAuthor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DETECTED_ISSUE__AUTHOR, null, msgs);
			msgs = basicSetAuthor(newAuthor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DETECTED_ISSUE__AUTHOR, newAuthor, newAuthor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getImplicated() {
		if (implicated == null) {
			implicated = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.DETECTED_ISSUE__IMPLICATED);
		}
		return implicated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DetectedIssueEvidence> getEvidence() {
		if (evidence == null) {
			evidence = new EObjectContainmentEList<DetectedIssueEvidence>(DetectedIssueEvidence.class, this, FhirPackage.DETECTED_ISSUE__EVIDENCE);
		}
		return evidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getDetail() {
		return detail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDetail(org.hl7.fhir.String newDetail, NotificationChain msgs) {
		org.hl7.fhir.String oldDetail = detail;
		detail = newDetail;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DETECTED_ISSUE__DETAIL, oldDetail, newDetail);
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
	public void setDetail(org.hl7.fhir.String newDetail) {
		if (newDetail != detail) {
			NotificationChain msgs = null;
			if (detail != null)
				msgs = ((InternalEObject)detail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DETECTED_ISSUE__DETAIL, null, msgs);
			if (newDetail != null)
				msgs = ((InternalEObject)newDetail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DETECTED_ISSUE__DETAIL, null, msgs);
			msgs = basicSetDetail(newDetail, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DETECTED_ISSUE__DETAIL, newDetail, newDetail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReference(Uri newReference, NotificationChain msgs) {
		Uri oldReference = reference;
		reference = newReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DETECTED_ISSUE__REFERENCE, oldReference, newReference);
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
	public void setReference(Uri newReference) {
		if (newReference != reference) {
			NotificationChain msgs = null;
			if (reference != null)
				msgs = ((InternalEObject)reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DETECTED_ISSUE__REFERENCE, null, msgs);
			if (newReference != null)
				msgs = ((InternalEObject)newReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DETECTED_ISSUE__REFERENCE, null, msgs);
			msgs = basicSetReference(newReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DETECTED_ISSUE__REFERENCE, newReference, newReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DetectedIssueMitigation> getMitigation() {
		if (mitigation == null) {
			mitigation = new EObjectContainmentEList<DetectedIssueMitigation>(DetectedIssueMitigation.class, this, FhirPackage.DETECTED_ISSUE__MITIGATION);
		}
		return mitigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DETECTED_ISSUE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.DETECTED_ISSUE__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.DETECTED_ISSUE__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.DETECTED_ISSUE__SEVERITY:
				return basicSetSeverity(null, msgs);
			case FhirPackage.DETECTED_ISSUE__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.DETECTED_ISSUE__IDENTIFIED_DATE_TIME:
				return basicSetIdentifiedDateTime(null, msgs);
			case FhirPackage.DETECTED_ISSUE__IDENTIFIED_PERIOD:
				return basicSetIdentifiedPeriod(null, msgs);
			case FhirPackage.DETECTED_ISSUE__AUTHOR:
				return basicSetAuthor(null, msgs);
			case FhirPackage.DETECTED_ISSUE__IMPLICATED:
				return ((InternalEList<?>)getImplicated()).basicRemove(otherEnd, msgs);
			case FhirPackage.DETECTED_ISSUE__EVIDENCE:
				return ((InternalEList<?>)getEvidence()).basicRemove(otherEnd, msgs);
			case FhirPackage.DETECTED_ISSUE__DETAIL:
				return basicSetDetail(null, msgs);
			case FhirPackage.DETECTED_ISSUE__REFERENCE:
				return basicSetReference(null, msgs);
			case FhirPackage.DETECTED_ISSUE__MITIGATION:
				return ((InternalEList<?>)getMitigation()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.DETECTED_ISSUE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.DETECTED_ISSUE__STATUS:
				return getStatus();
			case FhirPackage.DETECTED_ISSUE__CODE:
				return getCode();
			case FhirPackage.DETECTED_ISSUE__SEVERITY:
				return getSeverity();
			case FhirPackage.DETECTED_ISSUE__PATIENT:
				return getPatient();
			case FhirPackage.DETECTED_ISSUE__IDENTIFIED_DATE_TIME:
				return getIdentifiedDateTime();
			case FhirPackage.DETECTED_ISSUE__IDENTIFIED_PERIOD:
				return getIdentifiedPeriod();
			case FhirPackage.DETECTED_ISSUE__AUTHOR:
				return getAuthor();
			case FhirPackage.DETECTED_ISSUE__IMPLICATED:
				return getImplicated();
			case FhirPackage.DETECTED_ISSUE__EVIDENCE:
				return getEvidence();
			case FhirPackage.DETECTED_ISSUE__DETAIL:
				return getDetail();
			case FhirPackage.DETECTED_ISSUE__REFERENCE:
				return getReference();
			case FhirPackage.DETECTED_ISSUE__MITIGATION:
				return getMitigation();
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
			case FhirPackage.DETECTED_ISSUE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.DETECTED_ISSUE__STATUS:
				setStatus((ObservationStatus)newValue);
				return;
			case FhirPackage.DETECTED_ISSUE__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.DETECTED_ISSUE__SEVERITY:
				setSeverity((DetectedIssueSeverity)newValue);
				return;
			case FhirPackage.DETECTED_ISSUE__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FhirPackage.DETECTED_ISSUE__IDENTIFIED_DATE_TIME:
				setIdentifiedDateTime((DateTime)newValue);
				return;
			case FhirPackage.DETECTED_ISSUE__IDENTIFIED_PERIOD:
				setIdentifiedPeriod((Period)newValue);
				return;
			case FhirPackage.DETECTED_ISSUE__AUTHOR:
				setAuthor((Reference)newValue);
				return;
			case FhirPackage.DETECTED_ISSUE__IMPLICATED:
				getImplicated().clear();
				getImplicated().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.DETECTED_ISSUE__EVIDENCE:
				getEvidence().clear();
				getEvidence().addAll((Collection<? extends DetectedIssueEvidence>)newValue);
				return;
			case FhirPackage.DETECTED_ISSUE__DETAIL:
				setDetail((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.DETECTED_ISSUE__REFERENCE:
				setReference((Uri)newValue);
				return;
			case FhirPackage.DETECTED_ISSUE__MITIGATION:
				getMitigation().clear();
				getMitigation().addAll((Collection<? extends DetectedIssueMitigation>)newValue);
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
			case FhirPackage.DETECTED_ISSUE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.DETECTED_ISSUE__STATUS:
				setStatus((ObservationStatus)null);
				return;
			case FhirPackage.DETECTED_ISSUE__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.DETECTED_ISSUE__SEVERITY:
				setSeverity((DetectedIssueSeverity)null);
				return;
			case FhirPackage.DETECTED_ISSUE__PATIENT:
				setPatient((Reference)null);
				return;
			case FhirPackage.DETECTED_ISSUE__IDENTIFIED_DATE_TIME:
				setIdentifiedDateTime((DateTime)null);
				return;
			case FhirPackage.DETECTED_ISSUE__IDENTIFIED_PERIOD:
				setIdentifiedPeriod((Period)null);
				return;
			case FhirPackage.DETECTED_ISSUE__AUTHOR:
				setAuthor((Reference)null);
				return;
			case FhirPackage.DETECTED_ISSUE__IMPLICATED:
				getImplicated().clear();
				return;
			case FhirPackage.DETECTED_ISSUE__EVIDENCE:
				getEvidence().clear();
				return;
			case FhirPackage.DETECTED_ISSUE__DETAIL:
				setDetail((org.hl7.fhir.String)null);
				return;
			case FhirPackage.DETECTED_ISSUE__REFERENCE:
				setReference((Uri)null);
				return;
			case FhirPackage.DETECTED_ISSUE__MITIGATION:
				getMitigation().clear();
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
			case FhirPackage.DETECTED_ISSUE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.DETECTED_ISSUE__STATUS:
				return status != null;
			case FhirPackage.DETECTED_ISSUE__CODE:
				return code != null;
			case FhirPackage.DETECTED_ISSUE__SEVERITY:
				return severity != null;
			case FhirPackage.DETECTED_ISSUE__PATIENT:
				return patient != null;
			case FhirPackage.DETECTED_ISSUE__IDENTIFIED_DATE_TIME:
				return identifiedDateTime != null;
			case FhirPackage.DETECTED_ISSUE__IDENTIFIED_PERIOD:
				return identifiedPeriod != null;
			case FhirPackage.DETECTED_ISSUE__AUTHOR:
				return author != null;
			case FhirPackage.DETECTED_ISSUE__IMPLICATED:
				return implicated != null && !implicated.isEmpty();
			case FhirPackage.DETECTED_ISSUE__EVIDENCE:
				return evidence != null && !evidence.isEmpty();
			case FhirPackage.DETECTED_ISSUE__DETAIL:
				return detail != null;
			case FhirPackage.DETECTED_ISSUE__REFERENCE:
				return reference != null;
			case FhirPackage.DETECTED_ISSUE__MITIGATION:
				return mitigation != null && !mitigation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DetectedIssueImpl
