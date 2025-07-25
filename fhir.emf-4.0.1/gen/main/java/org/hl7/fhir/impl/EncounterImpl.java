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
import org.hl7.fhir.Coding;
import org.hl7.fhir.Duration;
import org.hl7.fhir.Encounter;
import org.hl7.fhir.EncounterClassHistory;
import org.hl7.fhir.EncounterDiagnosis;
import org.hl7.fhir.EncounterHospitalization;
import org.hl7.fhir.EncounterLocation;
import org.hl7.fhir.EncounterParticipant;
import org.hl7.fhir.EncounterStatus;
import org.hl7.fhir.EncounterStatusHistory;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encounter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getStatusHistory <em>Status History</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getClassHistory <em>Class History</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getEpisodeOfCare <em>Episode Of Care</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getAppointment <em>Appointment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getReasonCode <em>Reason Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getReasonReference <em>Reason Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getDiagnosis <em>Diagnosis</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getAccount <em>Account</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getHospitalization <em>Hospitalization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getServiceProvider <em>Service Provider</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterImpl#getPartOf <em>Part Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EncounterImpl extends DomainResourceImpl implements Encounter {
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
	protected EncounterStatus status;

	/**
	 * The cached value of the '{@link #getStatusHistory() <em>Status History</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusHistory()
	 * @generated
	 * @ordered
	 */
	protected EList<EncounterStatusHistory> statusHistory;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected Coding class_;

	/**
	 * The cached value of the '{@link #getClassHistory() <em>Class History</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassHistory()
	 * @generated
	 * @ordered
	 */
	protected EList<EncounterClassHistory> classHistory;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> type;

	/**
	 * The cached value of the '{@link #getServiceType() <em>Service Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept serviceType;

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
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Reference subject;

	/**
	 * The cached value of the '{@link #getEpisodeOfCare() <em>Episode Of Care</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpisodeOfCare()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> episodeOfCare;

	/**
	 * The cached value of the '{@link #getBasedOn() <em>Based On</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedOn()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> basedOn;

	/**
	 * The cached value of the '{@link #getParticipant() <em>Participant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipant()
	 * @generated
	 * @ordered
	 */
	protected EList<EncounterParticipant> participant;

	/**
	 * The cached value of the '{@link #getAppointment() <em>Appointment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppointment()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> appointment;

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
	 * The cached value of the '{@link #getLength() <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected Duration length;

	/**
	 * The cached value of the '{@link #getReasonCode() <em>Reason Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> reasonCode;

	/**
	 * The cached value of the '{@link #getReasonReference() <em>Reason Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonReference()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> reasonReference;

	/**
	 * The cached value of the '{@link #getDiagnosis() <em>Diagnosis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosis()
	 * @generated
	 * @ordered
	 */
	protected EList<EncounterDiagnosis> diagnosis;

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
	 * The cached value of the '{@link #getHospitalization() <em>Hospitalization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalization()
	 * @generated
	 * @ordered
	 */
	protected EncounterHospitalization hospitalization;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<EncounterLocation> location;

	/**
	 * The cached value of the '{@link #getServiceProvider() <em>Service Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceProvider()
	 * @generated
	 * @ordered
	 */
	protected Reference serviceProvider;

	/**
	 * The cached value of the '{@link #getPartOf() <em>Part Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOf()
	 * @generated
	 * @ordered
	 */
	protected Reference partOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncounterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getEncounter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.ENCOUNTER__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncounterStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(EncounterStatus newStatus, NotificationChain msgs) {
		EncounterStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER__STATUS, oldStatus, newStatus);
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
	public void setStatus(EncounterStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EncounterStatusHistory> getStatusHistory() {
		if (statusHistory == null) {
			statusHistory = new EObjectContainmentEList<EncounterStatusHistory>(EncounterStatusHistory.class, this, FhirPackage.ENCOUNTER__STATUS_HISTORY);
		}
		return statusHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coding getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClass(Coding newClass, NotificationChain msgs) {
		Coding oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER__CLASS, oldClass, newClass);
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
	public void setClass(Coding newClass) {
		if (newClass != class_) {
			NotificationChain msgs = null;
			if (class_ != null)
				msgs = ((InternalEObject)class_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER__CLASS, null, msgs);
			if (newClass != null)
				msgs = ((InternalEObject)newClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER__CLASS, null, msgs);
			msgs = basicSetClass(newClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER__CLASS, newClass, newClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EncounterClassHistory> getClassHistory() {
		if (classHistory == null) {
			classHistory = new EObjectContainmentEList<EncounterClassHistory>(EncounterClassHistory.class, this, FhirPackage.ENCOUNTER__CLASS_HISTORY);
		}
		return classHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getType() {
		if (type == null) {
			type = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.ENCOUNTER__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getServiceType() {
		return serviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceType(CodeableConcept newServiceType, NotificationChain msgs) {
		CodeableConcept oldServiceType = serviceType;
		serviceType = newServiceType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER__SERVICE_TYPE, oldServiceType, newServiceType);
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
	public void setServiceType(CodeableConcept newServiceType) {
		if (newServiceType != serviceType) {
			NotificationChain msgs = null;
			if (serviceType != null)
				msgs = ((InternalEObject)serviceType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER__SERVICE_TYPE, null, msgs);
			if (newServiceType != null)
				msgs = ((InternalEObject)newServiceType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER__SERVICE_TYPE, null, msgs);
			msgs = basicSetServiceType(newServiceType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER__SERVICE_TYPE, newServiceType, newServiceType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER__PRIORITY, oldPriority, newPriority);
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
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER__PRIORITY, newPriority, newPriority));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getEpisodeOfCare() {
		if (episodeOfCare == null) {
			episodeOfCare = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.ENCOUNTER__EPISODE_OF_CARE);
		}
		return episodeOfCare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getBasedOn() {
		if (basedOn == null) {
			basedOn = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.ENCOUNTER__BASED_ON);
		}
		return basedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EncounterParticipant> getParticipant() {
		if (participant == null) {
			participant = new EObjectContainmentEList<EncounterParticipant>(EncounterParticipant.class, this, FhirPackage.ENCOUNTER__PARTICIPANT);
		}
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getAppointment() {
		if (appointment == null) {
			appointment = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.ENCOUNTER__APPOINTMENT);
		}
		return appointment;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER__PERIOD, oldPeriod, newPeriod);
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
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLength(Duration newLength, NotificationChain msgs) {
		Duration oldLength = length;
		length = newLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER__LENGTH, oldLength, newLength);
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
	public void setLength(Duration newLength) {
		if (newLength != length) {
			NotificationChain msgs = null;
			if (length != null)
				msgs = ((InternalEObject)length).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER__LENGTH, null, msgs);
			if (newLength != null)
				msgs = ((InternalEObject)newLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER__LENGTH, null, msgs);
			msgs = basicSetLength(newLength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER__LENGTH, newLength, newLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getReasonCode() {
		if (reasonCode == null) {
			reasonCode = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.ENCOUNTER__REASON_CODE);
		}
		return reasonCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getReasonReference() {
		if (reasonReference == null) {
			reasonReference = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.ENCOUNTER__REASON_REFERENCE);
		}
		return reasonReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EncounterDiagnosis> getDiagnosis() {
		if (diagnosis == null) {
			diagnosis = new EObjectContainmentEList<EncounterDiagnosis>(EncounterDiagnosis.class, this, FhirPackage.ENCOUNTER__DIAGNOSIS);
		}
		return diagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getAccount() {
		if (account == null) {
			account = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.ENCOUNTER__ACCOUNT);
		}
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncounterHospitalization getHospitalization() {
		return hospitalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHospitalization(EncounterHospitalization newHospitalization, NotificationChain msgs) {
		EncounterHospitalization oldHospitalization = hospitalization;
		hospitalization = newHospitalization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER__HOSPITALIZATION, oldHospitalization, newHospitalization);
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
	public void setHospitalization(EncounterHospitalization newHospitalization) {
		if (newHospitalization != hospitalization) {
			NotificationChain msgs = null;
			if (hospitalization != null)
				msgs = ((InternalEObject)hospitalization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER__HOSPITALIZATION, null, msgs);
			if (newHospitalization != null)
				msgs = ((InternalEObject)newHospitalization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER__HOSPITALIZATION, null, msgs);
			msgs = basicSetHospitalization(newHospitalization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER__HOSPITALIZATION, newHospitalization, newHospitalization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EncounterLocation> getLocation() {
		if (location == null) {
			location = new EObjectContainmentEList<EncounterLocation>(EncounterLocation.class, this, FhirPackage.ENCOUNTER__LOCATION);
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getServiceProvider() {
		return serviceProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceProvider(Reference newServiceProvider, NotificationChain msgs) {
		Reference oldServiceProvider = serviceProvider;
		serviceProvider = newServiceProvider;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER__SERVICE_PROVIDER, oldServiceProvider, newServiceProvider);
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
	public void setServiceProvider(Reference newServiceProvider) {
		if (newServiceProvider != serviceProvider) {
			NotificationChain msgs = null;
			if (serviceProvider != null)
				msgs = ((InternalEObject)serviceProvider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER__SERVICE_PROVIDER, null, msgs);
			if (newServiceProvider != null)
				msgs = ((InternalEObject)newServiceProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER__SERVICE_PROVIDER, null, msgs);
			msgs = basicSetServiceProvider(newServiceProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER__SERVICE_PROVIDER, newServiceProvider, newServiceProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getPartOf() {
		return partOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartOf(Reference newPartOf, NotificationChain msgs) {
		Reference oldPartOf = partOf;
		partOf = newPartOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER__PART_OF, oldPartOf, newPartOf);
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
	public void setPartOf(Reference newPartOf) {
		if (newPartOf != partOf) {
			NotificationChain msgs = null;
			if (partOf != null)
				msgs = ((InternalEObject)partOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER__PART_OF, null, msgs);
			if (newPartOf != null)
				msgs = ((InternalEObject)newPartOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER__PART_OF, null, msgs);
			msgs = basicSetPartOf(newPartOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER__PART_OF, newPartOf, newPartOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ENCOUNTER__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENCOUNTER__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.ENCOUNTER__STATUS_HISTORY:
				return ((InternalEList<?>)getStatusHistory()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENCOUNTER__CLASS:
				return basicSetClass(null, msgs);
			case FhirPackage.ENCOUNTER__CLASS_HISTORY:
				return ((InternalEList<?>)getClassHistory()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENCOUNTER__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENCOUNTER__SERVICE_TYPE:
				return basicSetServiceType(null, msgs);
			case FhirPackage.ENCOUNTER__PRIORITY:
				return basicSetPriority(null, msgs);
			case FhirPackage.ENCOUNTER__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.ENCOUNTER__EPISODE_OF_CARE:
				return ((InternalEList<?>)getEpisodeOfCare()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENCOUNTER__BASED_ON:
				return ((InternalEList<?>)getBasedOn()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENCOUNTER__PARTICIPANT:
				return ((InternalEList<?>)getParticipant()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENCOUNTER__APPOINTMENT:
				return ((InternalEList<?>)getAppointment()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENCOUNTER__PERIOD:
				return basicSetPeriod(null, msgs);
			case FhirPackage.ENCOUNTER__LENGTH:
				return basicSetLength(null, msgs);
			case FhirPackage.ENCOUNTER__REASON_CODE:
				return ((InternalEList<?>)getReasonCode()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENCOUNTER__REASON_REFERENCE:
				return ((InternalEList<?>)getReasonReference()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENCOUNTER__DIAGNOSIS:
				return ((InternalEList<?>)getDiagnosis()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENCOUNTER__ACCOUNT:
				return ((InternalEList<?>)getAccount()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENCOUNTER__HOSPITALIZATION:
				return basicSetHospitalization(null, msgs);
			case FhirPackage.ENCOUNTER__LOCATION:
				return ((InternalEList<?>)getLocation()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENCOUNTER__SERVICE_PROVIDER:
				return basicSetServiceProvider(null, msgs);
			case FhirPackage.ENCOUNTER__PART_OF:
				return basicSetPartOf(null, msgs);
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
			case FhirPackage.ENCOUNTER__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.ENCOUNTER__STATUS:
				return getStatus();
			case FhirPackage.ENCOUNTER__STATUS_HISTORY:
				return getStatusHistory();
			case FhirPackage.ENCOUNTER__CLASS:
				return getClass_();
			case FhirPackage.ENCOUNTER__CLASS_HISTORY:
				return getClassHistory();
			case FhirPackage.ENCOUNTER__TYPE:
				return getType();
			case FhirPackage.ENCOUNTER__SERVICE_TYPE:
				return getServiceType();
			case FhirPackage.ENCOUNTER__PRIORITY:
				return getPriority();
			case FhirPackage.ENCOUNTER__SUBJECT:
				return getSubject();
			case FhirPackage.ENCOUNTER__EPISODE_OF_CARE:
				return getEpisodeOfCare();
			case FhirPackage.ENCOUNTER__BASED_ON:
				return getBasedOn();
			case FhirPackage.ENCOUNTER__PARTICIPANT:
				return getParticipant();
			case FhirPackage.ENCOUNTER__APPOINTMENT:
				return getAppointment();
			case FhirPackage.ENCOUNTER__PERIOD:
				return getPeriod();
			case FhirPackage.ENCOUNTER__LENGTH:
				return getLength();
			case FhirPackage.ENCOUNTER__REASON_CODE:
				return getReasonCode();
			case FhirPackage.ENCOUNTER__REASON_REFERENCE:
				return getReasonReference();
			case FhirPackage.ENCOUNTER__DIAGNOSIS:
				return getDiagnosis();
			case FhirPackage.ENCOUNTER__ACCOUNT:
				return getAccount();
			case FhirPackage.ENCOUNTER__HOSPITALIZATION:
				return getHospitalization();
			case FhirPackage.ENCOUNTER__LOCATION:
				return getLocation();
			case FhirPackage.ENCOUNTER__SERVICE_PROVIDER:
				return getServiceProvider();
			case FhirPackage.ENCOUNTER__PART_OF:
				return getPartOf();
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
			case FhirPackage.ENCOUNTER__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.ENCOUNTER__STATUS:
				setStatus((EncounterStatus)newValue);
				return;
			case FhirPackage.ENCOUNTER__STATUS_HISTORY:
				getStatusHistory().clear();
				getStatusHistory().addAll((Collection<? extends EncounterStatusHistory>)newValue);
				return;
			case FhirPackage.ENCOUNTER__CLASS:
				setClass((Coding)newValue);
				return;
			case FhirPackage.ENCOUNTER__CLASS_HISTORY:
				getClassHistory().clear();
				getClassHistory().addAll((Collection<? extends EncounterClassHistory>)newValue);
				return;
			case FhirPackage.ENCOUNTER__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.ENCOUNTER__SERVICE_TYPE:
				setServiceType((CodeableConcept)newValue);
				return;
			case FhirPackage.ENCOUNTER__PRIORITY:
				setPriority((CodeableConcept)newValue);
				return;
			case FhirPackage.ENCOUNTER__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.ENCOUNTER__EPISODE_OF_CARE:
				getEpisodeOfCare().clear();
				getEpisodeOfCare().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.ENCOUNTER__BASED_ON:
				getBasedOn().clear();
				getBasedOn().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.ENCOUNTER__PARTICIPANT:
				getParticipant().clear();
				getParticipant().addAll((Collection<? extends EncounterParticipant>)newValue);
				return;
			case FhirPackage.ENCOUNTER__APPOINTMENT:
				getAppointment().clear();
				getAppointment().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.ENCOUNTER__PERIOD:
				setPeriod((Period)newValue);
				return;
			case FhirPackage.ENCOUNTER__LENGTH:
				setLength((Duration)newValue);
				return;
			case FhirPackage.ENCOUNTER__REASON_CODE:
				getReasonCode().clear();
				getReasonCode().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.ENCOUNTER__REASON_REFERENCE:
				getReasonReference().clear();
				getReasonReference().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.ENCOUNTER__DIAGNOSIS:
				getDiagnosis().clear();
				getDiagnosis().addAll((Collection<? extends EncounterDiagnosis>)newValue);
				return;
			case FhirPackage.ENCOUNTER__ACCOUNT:
				getAccount().clear();
				getAccount().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.ENCOUNTER__HOSPITALIZATION:
				setHospitalization((EncounterHospitalization)newValue);
				return;
			case FhirPackage.ENCOUNTER__LOCATION:
				getLocation().clear();
				getLocation().addAll((Collection<? extends EncounterLocation>)newValue);
				return;
			case FhirPackage.ENCOUNTER__SERVICE_PROVIDER:
				setServiceProvider((Reference)newValue);
				return;
			case FhirPackage.ENCOUNTER__PART_OF:
				setPartOf((Reference)newValue);
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
			case FhirPackage.ENCOUNTER__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.ENCOUNTER__STATUS:
				setStatus((EncounterStatus)null);
				return;
			case FhirPackage.ENCOUNTER__STATUS_HISTORY:
				getStatusHistory().clear();
				return;
			case FhirPackage.ENCOUNTER__CLASS:
				setClass((Coding)null);
				return;
			case FhirPackage.ENCOUNTER__CLASS_HISTORY:
				getClassHistory().clear();
				return;
			case FhirPackage.ENCOUNTER__TYPE:
				getType().clear();
				return;
			case FhirPackage.ENCOUNTER__SERVICE_TYPE:
				setServiceType((CodeableConcept)null);
				return;
			case FhirPackage.ENCOUNTER__PRIORITY:
				setPriority((CodeableConcept)null);
				return;
			case FhirPackage.ENCOUNTER__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.ENCOUNTER__EPISODE_OF_CARE:
				getEpisodeOfCare().clear();
				return;
			case FhirPackage.ENCOUNTER__BASED_ON:
				getBasedOn().clear();
				return;
			case FhirPackage.ENCOUNTER__PARTICIPANT:
				getParticipant().clear();
				return;
			case FhirPackage.ENCOUNTER__APPOINTMENT:
				getAppointment().clear();
				return;
			case FhirPackage.ENCOUNTER__PERIOD:
				setPeriod((Period)null);
				return;
			case FhirPackage.ENCOUNTER__LENGTH:
				setLength((Duration)null);
				return;
			case FhirPackage.ENCOUNTER__REASON_CODE:
				getReasonCode().clear();
				return;
			case FhirPackage.ENCOUNTER__REASON_REFERENCE:
				getReasonReference().clear();
				return;
			case FhirPackage.ENCOUNTER__DIAGNOSIS:
				getDiagnosis().clear();
				return;
			case FhirPackage.ENCOUNTER__ACCOUNT:
				getAccount().clear();
				return;
			case FhirPackage.ENCOUNTER__HOSPITALIZATION:
				setHospitalization((EncounterHospitalization)null);
				return;
			case FhirPackage.ENCOUNTER__LOCATION:
				getLocation().clear();
				return;
			case FhirPackage.ENCOUNTER__SERVICE_PROVIDER:
				setServiceProvider((Reference)null);
				return;
			case FhirPackage.ENCOUNTER__PART_OF:
				setPartOf((Reference)null);
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
			case FhirPackage.ENCOUNTER__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.ENCOUNTER__STATUS:
				return status != null;
			case FhirPackage.ENCOUNTER__STATUS_HISTORY:
				return statusHistory != null && !statusHistory.isEmpty();
			case FhirPackage.ENCOUNTER__CLASS:
				return class_ != null;
			case FhirPackage.ENCOUNTER__CLASS_HISTORY:
				return classHistory != null && !classHistory.isEmpty();
			case FhirPackage.ENCOUNTER__TYPE:
				return type != null && !type.isEmpty();
			case FhirPackage.ENCOUNTER__SERVICE_TYPE:
				return serviceType != null;
			case FhirPackage.ENCOUNTER__PRIORITY:
				return priority != null;
			case FhirPackage.ENCOUNTER__SUBJECT:
				return subject != null;
			case FhirPackage.ENCOUNTER__EPISODE_OF_CARE:
				return episodeOfCare != null && !episodeOfCare.isEmpty();
			case FhirPackage.ENCOUNTER__BASED_ON:
				return basedOn != null && !basedOn.isEmpty();
			case FhirPackage.ENCOUNTER__PARTICIPANT:
				return participant != null && !participant.isEmpty();
			case FhirPackage.ENCOUNTER__APPOINTMENT:
				return appointment != null && !appointment.isEmpty();
			case FhirPackage.ENCOUNTER__PERIOD:
				return period != null;
			case FhirPackage.ENCOUNTER__LENGTH:
				return length != null;
			case FhirPackage.ENCOUNTER__REASON_CODE:
				return reasonCode != null && !reasonCode.isEmpty();
			case FhirPackage.ENCOUNTER__REASON_REFERENCE:
				return reasonReference != null && !reasonReference.isEmpty();
			case FhirPackage.ENCOUNTER__DIAGNOSIS:
				return diagnosis != null && !diagnosis.isEmpty();
			case FhirPackage.ENCOUNTER__ACCOUNT:
				return account != null && !account.isEmpty();
			case FhirPackage.ENCOUNTER__HOSPITALIZATION:
				return hospitalization != null;
			case FhirPackage.ENCOUNTER__LOCATION:
				return location != null && !location.isEmpty();
			case FhirPackage.ENCOUNTER__SERVICE_PROVIDER:
				return serviceProvider != null;
			case FhirPackage.ENCOUNTER__PART_OF:
				return partOf != null;
		}
		return super.eIsSet(featureID);
	}

} //EncounterImpl
