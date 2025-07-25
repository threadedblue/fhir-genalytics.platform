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

import org.hl7.fhir.Age;
import org.hl7.fhir.Annotation;
import org.hl7.fhir.Canonical;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FamilyHistoryStatus;
import org.hl7.fhir.FamilyMemberHistory;
import org.hl7.fhir.FamilyMemberHistoryCondition;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.Range;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Family Member History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.FamilyMemberHistoryImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.FamilyMemberHistoryImpl#getInstantiatesCanonical <em>Instantiates Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.FamilyMemberHistoryImpl#getInstantiatesUri <em>Instantiates Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.FamilyMemberHistoryImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.FamilyMemberHistoryImpl#getDataAbsentReason <em>Data Absent Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.FamilyMemberHistoryImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.FamilyMemberHistoryImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.FamilyMemberHistoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.FamilyMemberHistoryImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.FamilyMemberHistoryImpl#getSex <em>Sex</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.FamilyMemberHistoryImpl#getBornPeriod <em>Born Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.FamilyMemberHistoryImpl#getBornDate <em>Born Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.FamilyMemberHistoryImpl#getBornString <em>Born String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.FamilyMemberHistoryImpl#getAgeAge <em>Age Age</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.FamilyMemberHistoryImpl#getAgeRange <em>Age Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.FamilyMemberHistoryImpl#getAgeString <em>Age String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.FamilyMemberHistoryImpl#getEstimatedAge <em>Estimated Age</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.FamilyMemberHistoryImpl#getDeceasedBoolean <em>Deceased Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.FamilyMemberHistoryImpl#getDeceasedAge <em>Deceased Age</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.FamilyMemberHistoryImpl#getDeceasedRange <em>Deceased Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.FamilyMemberHistoryImpl#getDeceasedDate <em>Deceased Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.FamilyMemberHistoryImpl#getDeceasedString <em>Deceased String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.FamilyMemberHistoryImpl#getReasonCode <em>Reason Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.FamilyMemberHistoryImpl#getReasonReference <em>Reason Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.FamilyMemberHistoryImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.FamilyMemberHistoryImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FamilyMemberHistoryImpl extends DomainResourceImpl implements FamilyMemberHistory {
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
	 * The cached value of the '{@link #getInstantiatesCanonical() <em>Instantiates Canonical</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatesCanonical()
	 * @generated
	 * @ordered
	 */
	protected EList<Canonical> instantiatesCanonical;

	/**
	 * The cached value of the '{@link #getInstantiatesUri() <em>Instantiates Uri</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatesUri()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> instantiatesUri;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected FamilyHistoryStatus status;

	/**
	 * The cached value of the '{@link #getDataAbsentReason() <em>Data Absent Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataAbsentReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept dataAbsentReason;

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
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime date;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String name;

	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept relationship;

	/**
	 * The cached value of the '{@link #getSex() <em>Sex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSex()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept sex;

	/**
	 * The cached value of the '{@link #getBornPeriod() <em>Born Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBornPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period bornPeriod;

	/**
	 * The cached value of the '{@link #getBornDate() <em>Born Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBornDate()
	 * @generated
	 * @ordered
	 */
	protected Date bornDate;

	/**
	 * The cached value of the '{@link #getBornString() <em>Born String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBornString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String bornString;

	/**
	 * The cached value of the '{@link #getAgeAge() <em>Age Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgeAge()
	 * @generated
	 * @ordered
	 */
	protected Age ageAge;

	/**
	 * The cached value of the '{@link #getAgeRange() <em>Age Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgeRange()
	 * @generated
	 * @ordered
	 */
	protected Range ageRange;

	/**
	 * The cached value of the '{@link #getAgeString() <em>Age String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgeString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String ageString;

	/**
	 * The cached value of the '{@link #getEstimatedAge() <em>Estimated Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedAge()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean estimatedAge;

	/**
	 * The cached value of the '{@link #getDeceasedBoolean() <em>Deceased Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeceasedBoolean()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean deceasedBoolean;

	/**
	 * The cached value of the '{@link #getDeceasedAge() <em>Deceased Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeceasedAge()
	 * @generated
	 * @ordered
	 */
	protected Age deceasedAge;

	/**
	 * The cached value of the '{@link #getDeceasedRange() <em>Deceased Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeceasedRange()
	 * @generated
	 * @ordered
	 */
	protected Range deceasedRange;

	/**
	 * The cached value of the '{@link #getDeceasedDate() <em>Deceased Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeceasedDate()
	 * @generated
	 * @ordered
	 */
	protected Date deceasedDate;

	/**
	 * The cached value of the '{@link #getDeceasedString() <em>Deceased String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeceasedString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String deceasedString;

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
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> note;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<FamilyMemberHistoryCondition> condition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FamilyMemberHistoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getFamilyMemberHistory();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.FAMILY_MEMBER_HISTORY__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Canonical> getInstantiatesCanonical() {
		if (instantiatesCanonical == null) {
			instantiatesCanonical = new EObjectContainmentEList<Canonical>(Canonical.class, this, FhirPackage.FAMILY_MEMBER_HISTORY__INSTANTIATES_CANONICAL);
		}
		return instantiatesCanonical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Uri> getInstantiatesUri() {
		if (instantiatesUri == null) {
			instantiatesUri = new EObjectContainmentEList<Uri>(Uri.class, this, FhirPackage.FAMILY_MEMBER_HISTORY__INSTANTIATES_URI);
		}
		return instantiatesUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FamilyHistoryStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(FamilyHistoryStatus newStatus, NotificationChain msgs) {
		FamilyHistoryStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY__STATUS, oldStatus, newStatus);
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
	public void setStatus(FamilyHistoryStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getDataAbsentReason() {
		return dataAbsentReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataAbsentReason(CodeableConcept newDataAbsentReason, NotificationChain msgs) {
		CodeableConcept oldDataAbsentReason = dataAbsentReason;
		dataAbsentReason = newDataAbsentReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY__DATA_ABSENT_REASON, oldDataAbsentReason, newDataAbsentReason);
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
	public void setDataAbsentReason(CodeableConcept newDataAbsentReason) {
		if (newDataAbsentReason != dataAbsentReason) {
			NotificationChain msgs = null;
			if (dataAbsentReason != null)
				msgs = ((InternalEObject)dataAbsentReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY__DATA_ABSENT_REASON, null, msgs);
			if (newDataAbsentReason != null)
				msgs = ((InternalEObject)newDataAbsentReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY__DATA_ABSENT_REASON, null, msgs);
			msgs = basicSetDataAbsentReason(newDataAbsentReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY__DATA_ABSENT_REASON, newDataAbsentReason, newDataAbsentReason));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY__PATIENT, oldPatient, newPatient);
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
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY__PATIENT, newPatient, newPatient));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.hl7.fhir.String newName, NotificationChain msgs) {
		org.hl7.fhir.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY__NAME, oldName, newName);
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
	public void setName(org.hl7.fhir.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getRelationship() {
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationship(CodeableConcept newRelationship, NotificationChain msgs) {
		CodeableConcept oldRelationship = relationship;
		relationship = newRelationship;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY__RELATIONSHIP, oldRelationship, newRelationship);
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
	public void setRelationship(CodeableConcept newRelationship) {
		if (newRelationship != relationship) {
			NotificationChain msgs = null;
			if (relationship != null)
				msgs = ((InternalEObject)relationship).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY__RELATIONSHIP, null, msgs);
			if (newRelationship != null)
				msgs = ((InternalEObject)newRelationship).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY__RELATIONSHIP, null, msgs);
			msgs = basicSetRelationship(newRelationship, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY__RELATIONSHIP, newRelationship, newRelationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getSex() {
		return sex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSex(CodeableConcept newSex, NotificationChain msgs) {
		CodeableConcept oldSex = sex;
		sex = newSex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY__SEX, oldSex, newSex);
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
	public void setSex(CodeableConcept newSex) {
		if (newSex != sex) {
			NotificationChain msgs = null;
			if (sex != null)
				msgs = ((InternalEObject)sex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY__SEX, null, msgs);
			if (newSex != null)
				msgs = ((InternalEObject)newSex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY__SEX, null, msgs);
			msgs = basicSetSex(newSex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY__SEX, newSex, newSex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getBornPeriod() {
		return bornPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBornPeriod(Period newBornPeriod, NotificationChain msgs) {
		Period oldBornPeriod = bornPeriod;
		bornPeriod = newBornPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY__BORN_PERIOD, oldBornPeriod, newBornPeriod);
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
	public void setBornPeriod(Period newBornPeriod) {
		if (newBornPeriod != bornPeriod) {
			NotificationChain msgs = null;
			if (bornPeriod != null)
				msgs = ((InternalEObject)bornPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY__BORN_PERIOD, null, msgs);
			if (newBornPeriod != null)
				msgs = ((InternalEObject)newBornPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY__BORN_PERIOD, null, msgs);
			msgs = basicSetBornPeriod(newBornPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY__BORN_PERIOD, newBornPeriod, newBornPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getBornDate() {
		return bornDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBornDate(Date newBornDate, NotificationChain msgs) {
		Date oldBornDate = bornDate;
		bornDate = newBornDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY__BORN_DATE, oldBornDate, newBornDate);
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
	public void setBornDate(Date newBornDate) {
		if (newBornDate != bornDate) {
			NotificationChain msgs = null;
			if (bornDate != null)
				msgs = ((InternalEObject)bornDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY__BORN_DATE, null, msgs);
			if (newBornDate != null)
				msgs = ((InternalEObject)newBornDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY__BORN_DATE, null, msgs);
			msgs = basicSetBornDate(newBornDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY__BORN_DATE, newBornDate, newBornDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getBornString() {
		return bornString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBornString(org.hl7.fhir.String newBornString, NotificationChain msgs) {
		org.hl7.fhir.String oldBornString = bornString;
		bornString = newBornString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY__BORN_STRING, oldBornString, newBornString);
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
	public void setBornString(org.hl7.fhir.String newBornString) {
		if (newBornString != bornString) {
			NotificationChain msgs = null;
			if (bornString != null)
				msgs = ((InternalEObject)bornString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY__BORN_STRING, null, msgs);
			if (newBornString != null)
				msgs = ((InternalEObject)newBornString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY__BORN_STRING, null, msgs);
			msgs = basicSetBornString(newBornString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY__BORN_STRING, newBornString, newBornString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Age getAgeAge() {
		return ageAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAgeAge(Age newAgeAge, NotificationChain msgs) {
		Age oldAgeAge = ageAge;
		ageAge = newAgeAge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY__AGE_AGE, oldAgeAge, newAgeAge);
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
	public void setAgeAge(Age newAgeAge) {
		if (newAgeAge != ageAge) {
			NotificationChain msgs = null;
			if (ageAge != null)
				msgs = ((InternalEObject)ageAge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY__AGE_AGE, null, msgs);
			if (newAgeAge != null)
				msgs = ((InternalEObject)newAgeAge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY__AGE_AGE, null, msgs);
			msgs = basicSetAgeAge(newAgeAge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY__AGE_AGE, newAgeAge, newAgeAge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Range getAgeRange() {
		return ageRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAgeRange(Range newAgeRange, NotificationChain msgs) {
		Range oldAgeRange = ageRange;
		ageRange = newAgeRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY__AGE_RANGE, oldAgeRange, newAgeRange);
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
	public void setAgeRange(Range newAgeRange) {
		if (newAgeRange != ageRange) {
			NotificationChain msgs = null;
			if (ageRange != null)
				msgs = ((InternalEObject)ageRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY__AGE_RANGE, null, msgs);
			if (newAgeRange != null)
				msgs = ((InternalEObject)newAgeRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY__AGE_RANGE, null, msgs);
			msgs = basicSetAgeRange(newAgeRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY__AGE_RANGE, newAgeRange, newAgeRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getAgeString() {
		return ageString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAgeString(org.hl7.fhir.String newAgeString, NotificationChain msgs) {
		org.hl7.fhir.String oldAgeString = ageString;
		ageString = newAgeString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY__AGE_STRING, oldAgeString, newAgeString);
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
	public void setAgeString(org.hl7.fhir.String newAgeString) {
		if (newAgeString != ageString) {
			NotificationChain msgs = null;
			if (ageString != null)
				msgs = ((InternalEObject)ageString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY__AGE_STRING, null, msgs);
			if (newAgeString != null)
				msgs = ((InternalEObject)newAgeString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY__AGE_STRING, null, msgs);
			msgs = basicSetAgeString(newAgeString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY__AGE_STRING, newAgeString, newAgeString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getEstimatedAge() {
		return estimatedAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstimatedAge(org.hl7.fhir.Boolean newEstimatedAge, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldEstimatedAge = estimatedAge;
		estimatedAge = newEstimatedAge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY__ESTIMATED_AGE, oldEstimatedAge, newEstimatedAge);
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
	public void setEstimatedAge(org.hl7.fhir.Boolean newEstimatedAge) {
		if (newEstimatedAge != estimatedAge) {
			NotificationChain msgs = null;
			if (estimatedAge != null)
				msgs = ((InternalEObject)estimatedAge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY__ESTIMATED_AGE, null, msgs);
			if (newEstimatedAge != null)
				msgs = ((InternalEObject)newEstimatedAge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY__ESTIMATED_AGE, null, msgs);
			msgs = basicSetEstimatedAge(newEstimatedAge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY__ESTIMATED_AGE, newEstimatedAge, newEstimatedAge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getDeceasedBoolean() {
		return deceasedBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeceasedBoolean(org.hl7.fhir.Boolean newDeceasedBoolean, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldDeceasedBoolean = deceasedBoolean;
		deceasedBoolean = newDeceasedBoolean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY__DECEASED_BOOLEAN, oldDeceasedBoolean, newDeceasedBoolean);
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
	public void setDeceasedBoolean(org.hl7.fhir.Boolean newDeceasedBoolean) {
		if (newDeceasedBoolean != deceasedBoolean) {
			NotificationChain msgs = null;
			if (deceasedBoolean != null)
				msgs = ((InternalEObject)deceasedBoolean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY__DECEASED_BOOLEAN, null, msgs);
			if (newDeceasedBoolean != null)
				msgs = ((InternalEObject)newDeceasedBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY__DECEASED_BOOLEAN, null, msgs);
			msgs = basicSetDeceasedBoolean(newDeceasedBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY__DECEASED_BOOLEAN, newDeceasedBoolean, newDeceasedBoolean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Age getDeceasedAge() {
		return deceasedAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeceasedAge(Age newDeceasedAge, NotificationChain msgs) {
		Age oldDeceasedAge = deceasedAge;
		deceasedAge = newDeceasedAge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY__DECEASED_AGE, oldDeceasedAge, newDeceasedAge);
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
	public void setDeceasedAge(Age newDeceasedAge) {
		if (newDeceasedAge != deceasedAge) {
			NotificationChain msgs = null;
			if (deceasedAge != null)
				msgs = ((InternalEObject)deceasedAge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY__DECEASED_AGE, null, msgs);
			if (newDeceasedAge != null)
				msgs = ((InternalEObject)newDeceasedAge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY__DECEASED_AGE, null, msgs);
			msgs = basicSetDeceasedAge(newDeceasedAge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY__DECEASED_AGE, newDeceasedAge, newDeceasedAge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Range getDeceasedRange() {
		return deceasedRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeceasedRange(Range newDeceasedRange, NotificationChain msgs) {
		Range oldDeceasedRange = deceasedRange;
		deceasedRange = newDeceasedRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY__DECEASED_RANGE, oldDeceasedRange, newDeceasedRange);
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
	public void setDeceasedRange(Range newDeceasedRange) {
		if (newDeceasedRange != deceasedRange) {
			NotificationChain msgs = null;
			if (deceasedRange != null)
				msgs = ((InternalEObject)deceasedRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY__DECEASED_RANGE, null, msgs);
			if (newDeceasedRange != null)
				msgs = ((InternalEObject)newDeceasedRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY__DECEASED_RANGE, null, msgs);
			msgs = basicSetDeceasedRange(newDeceasedRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY__DECEASED_RANGE, newDeceasedRange, newDeceasedRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDeceasedDate() {
		return deceasedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeceasedDate(Date newDeceasedDate, NotificationChain msgs) {
		Date oldDeceasedDate = deceasedDate;
		deceasedDate = newDeceasedDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY__DECEASED_DATE, oldDeceasedDate, newDeceasedDate);
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
	public void setDeceasedDate(Date newDeceasedDate) {
		if (newDeceasedDate != deceasedDate) {
			NotificationChain msgs = null;
			if (deceasedDate != null)
				msgs = ((InternalEObject)deceasedDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY__DECEASED_DATE, null, msgs);
			if (newDeceasedDate != null)
				msgs = ((InternalEObject)newDeceasedDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY__DECEASED_DATE, null, msgs);
			msgs = basicSetDeceasedDate(newDeceasedDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY__DECEASED_DATE, newDeceasedDate, newDeceasedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getDeceasedString() {
		return deceasedString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeceasedString(org.hl7.fhir.String newDeceasedString, NotificationChain msgs) {
		org.hl7.fhir.String oldDeceasedString = deceasedString;
		deceasedString = newDeceasedString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY__DECEASED_STRING, oldDeceasedString, newDeceasedString);
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
	public void setDeceasedString(org.hl7.fhir.String newDeceasedString) {
		if (newDeceasedString != deceasedString) {
			NotificationChain msgs = null;
			if (deceasedString != null)
				msgs = ((InternalEObject)deceasedString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY__DECEASED_STRING, null, msgs);
			if (newDeceasedString != null)
				msgs = ((InternalEObject)newDeceasedString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.FAMILY_MEMBER_HISTORY__DECEASED_STRING, null, msgs);
			msgs = basicSetDeceasedString(newDeceasedString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.FAMILY_MEMBER_HISTORY__DECEASED_STRING, newDeceasedString, newDeceasedString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getReasonCode() {
		if (reasonCode == null) {
			reasonCode = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.FAMILY_MEMBER_HISTORY__REASON_CODE);
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
			reasonReference = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.FAMILY_MEMBER_HISTORY__REASON_REFERENCE);
		}
		return reasonReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.FAMILY_MEMBER_HISTORY__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FamilyMemberHistoryCondition> getCondition() {
		if (condition == null) {
			condition = new EObjectContainmentEList<FamilyMemberHistoryCondition>(FamilyMemberHistoryCondition.class, this, FhirPackage.FAMILY_MEMBER_HISTORY__CONDITION);
		}
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.FAMILY_MEMBER_HISTORY__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.FAMILY_MEMBER_HISTORY__INSTANTIATES_CANONICAL:
				return ((InternalEList<?>)getInstantiatesCanonical()).basicRemove(otherEnd, msgs);
			case FhirPackage.FAMILY_MEMBER_HISTORY__INSTANTIATES_URI:
				return ((InternalEList<?>)getInstantiatesUri()).basicRemove(otherEnd, msgs);
			case FhirPackage.FAMILY_MEMBER_HISTORY__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.FAMILY_MEMBER_HISTORY__DATA_ABSENT_REASON:
				return basicSetDataAbsentReason(null, msgs);
			case FhirPackage.FAMILY_MEMBER_HISTORY__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.FAMILY_MEMBER_HISTORY__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.FAMILY_MEMBER_HISTORY__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.FAMILY_MEMBER_HISTORY__RELATIONSHIP:
				return basicSetRelationship(null, msgs);
			case FhirPackage.FAMILY_MEMBER_HISTORY__SEX:
				return basicSetSex(null, msgs);
			case FhirPackage.FAMILY_MEMBER_HISTORY__BORN_PERIOD:
				return basicSetBornPeriod(null, msgs);
			case FhirPackage.FAMILY_MEMBER_HISTORY__BORN_DATE:
				return basicSetBornDate(null, msgs);
			case FhirPackage.FAMILY_MEMBER_HISTORY__BORN_STRING:
				return basicSetBornString(null, msgs);
			case FhirPackage.FAMILY_MEMBER_HISTORY__AGE_AGE:
				return basicSetAgeAge(null, msgs);
			case FhirPackage.FAMILY_MEMBER_HISTORY__AGE_RANGE:
				return basicSetAgeRange(null, msgs);
			case FhirPackage.FAMILY_MEMBER_HISTORY__AGE_STRING:
				return basicSetAgeString(null, msgs);
			case FhirPackage.FAMILY_MEMBER_HISTORY__ESTIMATED_AGE:
				return basicSetEstimatedAge(null, msgs);
			case FhirPackage.FAMILY_MEMBER_HISTORY__DECEASED_BOOLEAN:
				return basicSetDeceasedBoolean(null, msgs);
			case FhirPackage.FAMILY_MEMBER_HISTORY__DECEASED_AGE:
				return basicSetDeceasedAge(null, msgs);
			case FhirPackage.FAMILY_MEMBER_HISTORY__DECEASED_RANGE:
				return basicSetDeceasedRange(null, msgs);
			case FhirPackage.FAMILY_MEMBER_HISTORY__DECEASED_DATE:
				return basicSetDeceasedDate(null, msgs);
			case FhirPackage.FAMILY_MEMBER_HISTORY__DECEASED_STRING:
				return basicSetDeceasedString(null, msgs);
			case FhirPackage.FAMILY_MEMBER_HISTORY__REASON_CODE:
				return ((InternalEList<?>)getReasonCode()).basicRemove(otherEnd, msgs);
			case FhirPackage.FAMILY_MEMBER_HISTORY__REASON_REFERENCE:
				return ((InternalEList<?>)getReasonReference()).basicRemove(otherEnd, msgs);
			case FhirPackage.FAMILY_MEMBER_HISTORY__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.FAMILY_MEMBER_HISTORY__CONDITION:
				return ((InternalEList<?>)getCondition()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.FAMILY_MEMBER_HISTORY__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.FAMILY_MEMBER_HISTORY__INSTANTIATES_CANONICAL:
				return getInstantiatesCanonical();
			case FhirPackage.FAMILY_MEMBER_HISTORY__INSTANTIATES_URI:
				return getInstantiatesUri();
			case FhirPackage.FAMILY_MEMBER_HISTORY__STATUS:
				return getStatus();
			case FhirPackage.FAMILY_MEMBER_HISTORY__DATA_ABSENT_REASON:
				return getDataAbsentReason();
			case FhirPackage.FAMILY_MEMBER_HISTORY__PATIENT:
				return getPatient();
			case FhirPackage.FAMILY_MEMBER_HISTORY__DATE:
				return getDate();
			case FhirPackage.FAMILY_MEMBER_HISTORY__NAME:
				return getName();
			case FhirPackage.FAMILY_MEMBER_HISTORY__RELATIONSHIP:
				return getRelationship();
			case FhirPackage.FAMILY_MEMBER_HISTORY__SEX:
				return getSex();
			case FhirPackage.FAMILY_MEMBER_HISTORY__BORN_PERIOD:
				return getBornPeriod();
			case FhirPackage.FAMILY_MEMBER_HISTORY__BORN_DATE:
				return getBornDate();
			case FhirPackage.FAMILY_MEMBER_HISTORY__BORN_STRING:
				return getBornString();
			case FhirPackage.FAMILY_MEMBER_HISTORY__AGE_AGE:
				return getAgeAge();
			case FhirPackage.FAMILY_MEMBER_HISTORY__AGE_RANGE:
				return getAgeRange();
			case FhirPackage.FAMILY_MEMBER_HISTORY__AGE_STRING:
				return getAgeString();
			case FhirPackage.FAMILY_MEMBER_HISTORY__ESTIMATED_AGE:
				return getEstimatedAge();
			case FhirPackage.FAMILY_MEMBER_HISTORY__DECEASED_BOOLEAN:
				return getDeceasedBoolean();
			case FhirPackage.FAMILY_MEMBER_HISTORY__DECEASED_AGE:
				return getDeceasedAge();
			case FhirPackage.FAMILY_MEMBER_HISTORY__DECEASED_RANGE:
				return getDeceasedRange();
			case FhirPackage.FAMILY_MEMBER_HISTORY__DECEASED_DATE:
				return getDeceasedDate();
			case FhirPackage.FAMILY_MEMBER_HISTORY__DECEASED_STRING:
				return getDeceasedString();
			case FhirPackage.FAMILY_MEMBER_HISTORY__REASON_CODE:
				return getReasonCode();
			case FhirPackage.FAMILY_MEMBER_HISTORY__REASON_REFERENCE:
				return getReasonReference();
			case FhirPackage.FAMILY_MEMBER_HISTORY__NOTE:
				return getNote();
			case FhirPackage.FAMILY_MEMBER_HISTORY__CONDITION:
				return getCondition();
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
			case FhirPackage.FAMILY_MEMBER_HISTORY__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__INSTANTIATES_CANONICAL:
				getInstantiatesCanonical().clear();
				getInstantiatesCanonical().addAll((Collection<? extends Canonical>)newValue);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__INSTANTIATES_URI:
				getInstantiatesUri().clear();
				getInstantiatesUri().addAll((Collection<? extends Uri>)newValue);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__STATUS:
				setStatus((FamilyHistoryStatus)newValue);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__DATA_ABSENT_REASON:
				setDataAbsentReason((CodeableConcept)newValue);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__RELATIONSHIP:
				setRelationship((CodeableConcept)newValue);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__SEX:
				setSex((CodeableConcept)newValue);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__BORN_PERIOD:
				setBornPeriod((Period)newValue);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__BORN_DATE:
				setBornDate((Date)newValue);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__BORN_STRING:
				setBornString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__AGE_AGE:
				setAgeAge((Age)newValue);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__AGE_RANGE:
				setAgeRange((Range)newValue);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__AGE_STRING:
				setAgeString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__ESTIMATED_AGE:
				setEstimatedAge((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__DECEASED_BOOLEAN:
				setDeceasedBoolean((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__DECEASED_AGE:
				setDeceasedAge((Age)newValue);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__DECEASED_RANGE:
				setDeceasedRange((Range)newValue);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__DECEASED_DATE:
				setDeceasedDate((Date)newValue);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__DECEASED_STRING:
				setDeceasedString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__REASON_CODE:
				getReasonCode().clear();
				getReasonCode().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__REASON_REFERENCE:
				getReasonReference().clear();
				getReasonReference().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__CONDITION:
				getCondition().clear();
				getCondition().addAll((Collection<? extends FamilyMemberHistoryCondition>)newValue);
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
			case FhirPackage.FAMILY_MEMBER_HISTORY__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__INSTANTIATES_CANONICAL:
				getInstantiatesCanonical().clear();
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__INSTANTIATES_URI:
				getInstantiatesUri().clear();
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__STATUS:
				setStatus((FamilyHistoryStatus)null);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__DATA_ABSENT_REASON:
				setDataAbsentReason((CodeableConcept)null);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__PATIENT:
				setPatient((Reference)null);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__RELATIONSHIP:
				setRelationship((CodeableConcept)null);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__SEX:
				setSex((CodeableConcept)null);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__BORN_PERIOD:
				setBornPeriod((Period)null);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__BORN_DATE:
				setBornDate((Date)null);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__BORN_STRING:
				setBornString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__AGE_AGE:
				setAgeAge((Age)null);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__AGE_RANGE:
				setAgeRange((Range)null);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__AGE_STRING:
				setAgeString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__ESTIMATED_AGE:
				setEstimatedAge((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__DECEASED_BOOLEAN:
				setDeceasedBoolean((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__DECEASED_AGE:
				setDeceasedAge((Age)null);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__DECEASED_RANGE:
				setDeceasedRange((Range)null);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__DECEASED_DATE:
				setDeceasedDate((Date)null);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__DECEASED_STRING:
				setDeceasedString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__REASON_CODE:
				getReasonCode().clear();
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__REASON_REFERENCE:
				getReasonReference().clear();
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__NOTE:
				getNote().clear();
				return;
			case FhirPackage.FAMILY_MEMBER_HISTORY__CONDITION:
				getCondition().clear();
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
			case FhirPackage.FAMILY_MEMBER_HISTORY__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.FAMILY_MEMBER_HISTORY__INSTANTIATES_CANONICAL:
				return instantiatesCanonical != null && !instantiatesCanonical.isEmpty();
			case FhirPackage.FAMILY_MEMBER_HISTORY__INSTANTIATES_URI:
				return instantiatesUri != null && !instantiatesUri.isEmpty();
			case FhirPackage.FAMILY_MEMBER_HISTORY__STATUS:
				return status != null;
			case FhirPackage.FAMILY_MEMBER_HISTORY__DATA_ABSENT_REASON:
				return dataAbsentReason != null;
			case FhirPackage.FAMILY_MEMBER_HISTORY__PATIENT:
				return patient != null;
			case FhirPackage.FAMILY_MEMBER_HISTORY__DATE:
				return date != null;
			case FhirPackage.FAMILY_MEMBER_HISTORY__NAME:
				return name != null;
			case FhirPackage.FAMILY_MEMBER_HISTORY__RELATIONSHIP:
				return relationship != null;
			case FhirPackage.FAMILY_MEMBER_HISTORY__SEX:
				return sex != null;
			case FhirPackage.FAMILY_MEMBER_HISTORY__BORN_PERIOD:
				return bornPeriod != null;
			case FhirPackage.FAMILY_MEMBER_HISTORY__BORN_DATE:
				return bornDate != null;
			case FhirPackage.FAMILY_MEMBER_HISTORY__BORN_STRING:
				return bornString != null;
			case FhirPackage.FAMILY_MEMBER_HISTORY__AGE_AGE:
				return ageAge != null;
			case FhirPackage.FAMILY_MEMBER_HISTORY__AGE_RANGE:
				return ageRange != null;
			case FhirPackage.FAMILY_MEMBER_HISTORY__AGE_STRING:
				return ageString != null;
			case FhirPackage.FAMILY_MEMBER_HISTORY__ESTIMATED_AGE:
				return estimatedAge != null;
			case FhirPackage.FAMILY_MEMBER_HISTORY__DECEASED_BOOLEAN:
				return deceasedBoolean != null;
			case FhirPackage.FAMILY_MEMBER_HISTORY__DECEASED_AGE:
				return deceasedAge != null;
			case FhirPackage.FAMILY_MEMBER_HISTORY__DECEASED_RANGE:
				return deceasedRange != null;
			case FhirPackage.FAMILY_MEMBER_HISTORY__DECEASED_DATE:
				return deceasedDate != null;
			case FhirPackage.FAMILY_MEMBER_HISTORY__DECEASED_STRING:
				return deceasedString != null;
			case FhirPackage.FAMILY_MEMBER_HISTORY__REASON_CODE:
				return reasonCode != null && !reasonCode.isEmpty();
			case FhirPackage.FAMILY_MEMBER_HISTORY__REASON_REFERENCE:
				return reasonReference != null && !reasonReference.isEmpty();
			case FhirPackage.FAMILY_MEMBER_HISTORY__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.FAMILY_MEMBER_HISTORY__CONDITION:
				return condition != null && !condition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FamilyMemberHistoryImpl
