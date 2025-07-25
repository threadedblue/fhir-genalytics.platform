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
import org.hl7.fhir.AllergyIntolerance;
import org.hl7.fhir.AllergyIntoleranceCategory;
import org.hl7.fhir.AllergyIntoleranceCriticality;
import org.hl7.fhir.AllergyIntoleranceReaction;
import org.hl7.fhir.AllergyIntoleranceType;
import org.hl7.fhir.Annotation;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.Range;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allergy Intolerance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.AllergyIntoleranceImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AllergyIntoleranceImpl#getClinicalStatus <em>Clinical Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AllergyIntoleranceImpl#getVerificationStatus <em>Verification Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AllergyIntoleranceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AllergyIntoleranceImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AllergyIntoleranceImpl#getCriticality <em>Criticality</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AllergyIntoleranceImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AllergyIntoleranceImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AllergyIntoleranceImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AllergyIntoleranceImpl#getOnsetDateTime <em>Onset Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AllergyIntoleranceImpl#getOnsetAge <em>Onset Age</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AllergyIntoleranceImpl#getOnsetPeriod <em>Onset Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AllergyIntoleranceImpl#getOnsetRange <em>Onset Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AllergyIntoleranceImpl#getOnsetString <em>Onset String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AllergyIntoleranceImpl#getRecordedDate <em>Recorded Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AllergyIntoleranceImpl#getRecorder <em>Recorder</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AllergyIntoleranceImpl#getAsserter <em>Asserter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AllergyIntoleranceImpl#getLastOccurrence <em>Last Occurrence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AllergyIntoleranceImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AllergyIntoleranceImpl#getReaction <em>Reaction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllergyIntoleranceImpl extends DomainResourceImpl implements AllergyIntolerance {
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
	 * The cached value of the '{@link #getClinicalStatus() <em>Clinical Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClinicalStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept clinicalStatus;

	/**
	 * The cached value of the '{@link #getVerificationStatus() <em>Verification Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerificationStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept verificationStatus;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected AllergyIntoleranceType type;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<AllergyIntoleranceCategory> category;

	/**
	 * The cached value of the '{@link #getCriticality() <em>Criticality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticality()
	 * @generated
	 * @ordered
	 */
	protected AllergyIntoleranceCriticality criticality;

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
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Reference patient;

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
	 * The cached value of the '{@link #getOnsetDateTime() <em>Onset Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnsetDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime onsetDateTime;

	/**
	 * The cached value of the '{@link #getOnsetAge() <em>Onset Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnsetAge()
	 * @generated
	 * @ordered
	 */
	protected Age onsetAge;

	/**
	 * The cached value of the '{@link #getOnsetPeriod() <em>Onset Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnsetPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period onsetPeriod;

	/**
	 * The cached value of the '{@link #getOnsetRange() <em>Onset Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnsetRange()
	 * @generated
	 * @ordered
	 */
	protected Range onsetRange;

	/**
	 * The cached value of the '{@link #getOnsetString() <em>Onset String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnsetString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String onsetString;

	/**
	 * The cached value of the '{@link #getRecordedDate() <em>Recorded Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordedDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime recordedDate;

	/**
	 * The cached value of the '{@link #getRecorder() <em>Recorder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecorder()
	 * @generated
	 * @ordered
	 */
	protected Reference recorder;

	/**
	 * The cached value of the '{@link #getAsserter() <em>Asserter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsserter()
	 * @generated
	 * @ordered
	 */
	protected Reference asserter;

	/**
	 * The cached value of the '{@link #getLastOccurrence() <em>Last Occurrence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastOccurrence()
	 * @generated
	 * @ordered
	 */
	protected DateTime lastOccurrence;

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
	 * The cached value of the '{@link #getReaction() <em>Reaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReaction()
	 * @generated
	 * @ordered
	 */
	protected EList<AllergyIntoleranceReaction> reaction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllergyIntoleranceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getAllergyIntolerance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.ALLERGY_INTOLERANCE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getClinicalStatus() {
		return clinicalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClinicalStatus(CodeableConcept newClinicalStatus, NotificationChain msgs) {
		CodeableConcept oldClinicalStatus = clinicalStatus;
		clinicalStatus = newClinicalStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__CLINICAL_STATUS, oldClinicalStatus, newClinicalStatus);
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
	public void setClinicalStatus(CodeableConcept newClinicalStatus) {
		if (newClinicalStatus != clinicalStatus) {
			NotificationChain msgs = null;
			if (clinicalStatus != null)
				msgs = ((InternalEObject)clinicalStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__CLINICAL_STATUS, null, msgs);
			if (newClinicalStatus != null)
				msgs = ((InternalEObject)newClinicalStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__CLINICAL_STATUS, null, msgs);
			msgs = basicSetClinicalStatus(newClinicalStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__CLINICAL_STATUS, newClinicalStatus, newClinicalStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getVerificationStatus() {
		return verificationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerificationStatus(CodeableConcept newVerificationStatus, NotificationChain msgs) {
		CodeableConcept oldVerificationStatus = verificationStatus;
		verificationStatus = newVerificationStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__VERIFICATION_STATUS, oldVerificationStatus, newVerificationStatus);
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
	public void setVerificationStatus(CodeableConcept newVerificationStatus) {
		if (newVerificationStatus != verificationStatus) {
			NotificationChain msgs = null;
			if (verificationStatus != null)
				msgs = ((InternalEObject)verificationStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__VERIFICATION_STATUS, null, msgs);
			if (newVerificationStatus != null)
				msgs = ((InternalEObject)newVerificationStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__VERIFICATION_STATUS, null, msgs);
			msgs = basicSetVerificationStatus(newVerificationStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__VERIFICATION_STATUS, newVerificationStatus, newVerificationStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllergyIntoleranceType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(AllergyIntoleranceType newType, NotificationChain msgs) {
		AllergyIntoleranceType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__TYPE, oldType, newType);
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
	public void setType(AllergyIntoleranceType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AllergyIntoleranceCategory> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<AllergyIntoleranceCategory>(AllergyIntoleranceCategory.class, this, FhirPackage.ALLERGY_INTOLERANCE__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllergyIntoleranceCriticality getCriticality() {
		return criticality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCriticality(AllergyIntoleranceCriticality newCriticality, NotificationChain msgs) {
		AllergyIntoleranceCriticality oldCriticality = criticality;
		criticality = newCriticality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__CRITICALITY, oldCriticality, newCriticality);
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
	public void setCriticality(AllergyIntoleranceCriticality newCriticality) {
		if (newCriticality != criticality) {
			NotificationChain msgs = null;
			if (criticality != null)
				msgs = ((InternalEObject)criticality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__CRITICALITY, null, msgs);
			if (newCriticality != null)
				msgs = ((InternalEObject)newCriticality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__CRITICALITY, null, msgs);
			msgs = basicSetCriticality(newCriticality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__CRITICALITY, newCriticality, newCriticality));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__CODE, oldCode, newCode);
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
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__CODE, newCode, newCode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__PATIENT, oldPatient, newPatient);
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
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__PATIENT, newPatient, newPatient));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__ENCOUNTER, oldEncounter, newEncounter);
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
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getOnsetDateTime() {
		return onsetDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnsetDateTime(DateTime newOnsetDateTime, NotificationChain msgs) {
		DateTime oldOnsetDateTime = onsetDateTime;
		onsetDateTime = newOnsetDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__ONSET_DATE_TIME, oldOnsetDateTime, newOnsetDateTime);
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
	public void setOnsetDateTime(DateTime newOnsetDateTime) {
		if (newOnsetDateTime != onsetDateTime) {
			NotificationChain msgs = null;
			if (onsetDateTime != null)
				msgs = ((InternalEObject)onsetDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__ONSET_DATE_TIME, null, msgs);
			if (newOnsetDateTime != null)
				msgs = ((InternalEObject)newOnsetDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__ONSET_DATE_TIME, null, msgs);
			msgs = basicSetOnsetDateTime(newOnsetDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__ONSET_DATE_TIME, newOnsetDateTime, newOnsetDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Age getOnsetAge() {
		return onsetAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnsetAge(Age newOnsetAge, NotificationChain msgs) {
		Age oldOnsetAge = onsetAge;
		onsetAge = newOnsetAge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__ONSET_AGE, oldOnsetAge, newOnsetAge);
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
	public void setOnsetAge(Age newOnsetAge) {
		if (newOnsetAge != onsetAge) {
			NotificationChain msgs = null;
			if (onsetAge != null)
				msgs = ((InternalEObject)onsetAge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__ONSET_AGE, null, msgs);
			if (newOnsetAge != null)
				msgs = ((InternalEObject)newOnsetAge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__ONSET_AGE, null, msgs);
			msgs = basicSetOnsetAge(newOnsetAge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__ONSET_AGE, newOnsetAge, newOnsetAge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getOnsetPeriod() {
		return onsetPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnsetPeriod(Period newOnsetPeriod, NotificationChain msgs) {
		Period oldOnsetPeriod = onsetPeriod;
		onsetPeriod = newOnsetPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__ONSET_PERIOD, oldOnsetPeriod, newOnsetPeriod);
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
	public void setOnsetPeriod(Period newOnsetPeriod) {
		if (newOnsetPeriod != onsetPeriod) {
			NotificationChain msgs = null;
			if (onsetPeriod != null)
				msgs = ((InternalEObject)onsetPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__ONSET_PERIOD, null, msgs);
			if (newOnsetPeriod != null)
				msgs = ((InternalEObject)newOnsetPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__ONSET_PERIOD, null, msgs);
			msgs = basicSetOnsetPeriod(newOnsetPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__ONSET_PERIOD, newOnsetPeriod, newOnsetPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Range getOnsetRange() {
		return onsetRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnsetRange(Range newOnsetRange, NotificationChain msgs) {
		Range oldOnsetRange = onsetRange;
		onsetRange = newOnsetRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__ONSET_RANGE, oldOnsetRange, newOnsetRange);
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
	public void setOnsetRange(Range newOnsetRange) {
		if (newOnsetRange != onsetRange) {
			NotificationChain msgs = null;
			if (onsetRange != null)
				msgs = ((InternalEObject)onsetRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__ONSET_RANGE, null, msgs);
			if (newOnsetRange != null)
				msgs = ((InternalEObject)newOnsetRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__ONSET_RANGE, null, msgs);
			msgs = basicSetOnsetRange(newOnsetRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__ONSET_RANGE, newOnsetRange, newOnsetRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getOnsetString() {
		return onsetString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnsetString(org.hl7.fhir.String newOnsetString, NotificationChain msgs) {
		org.hl7.fhir.String oldOnsetString = onsetString;
		onsetString = newOnsetString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__ONSET_STRING, oldOnsetString, newOnsetString);
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
	public void setOnsetString(org.hl7.fhir.String newOnsetString) {
		if (newOnsetString != onsetString) {
			NotificationChain msgs = null;
			if (onsetString != null)
				msgs = ((InternalEObject)onsetString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__ONSET_STRING, null, msgs);
			if (newOnsetString != null)
				msgs = ((InternalEObject)newOnsetString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__ONSET_STRING, null, msgs);
			msgs = basicSetOnsetString(newOnsetString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__ONSET_STRING, newOnsetString, newOnsetString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getRecordedDate() {
		return recordedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecordedDate(DateTime newRecordedDate, NotificationChain msgs) {
		DateTime oldRecordedDate = recordedDate;
		recordedDate = newRecordedDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__RECORDED_DATE, oldRecordedDate, newRecordedDate);
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
	public void setRecordedDate(DateTime newRecordedDate) {
		if (newRecordedDate != recordedDate) {
			NotificationChain msgs = null;
			if (recordedDate != null)
				msgs = ((InternalEObject)recordedDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__RECORDED_DATE, null, msgs);
			if (newRecordedDate != null)
				msgs = ((InternalEObject)newRecordedDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__RECORDED_DATE, null, msgs);
			msgs = basicSetRecordedDate(newRecordedDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__RECORDED_DATE, newRecordedDate, newRecordedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getRecorder() {
		return recorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecorder(Reference newRecorder, NotificationChain msgs) {
		Reference oldRecorder = recorder;
		recorder = newRecorder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__RECORDER, oldRecorder, newRecorder);
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
	public void setRecorder(Reference newRecorder) {
		if (newRecorder != recorder) {
			NotificationChain msgs = null;
			if (recorder != null)
				msgs = ((InternalEObject)recorder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__RECORDER, null, msgs);
			if (newRecorder != null)
				msgs = ((InternalEObject)newRecorder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__RECORDER, null, msgs);
			msgs = basicSetRecorder(newRecorder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__RECORDER, newRecorder, newRecorder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getAsserter() {
		return asserter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsserter(Reference newAsserter, NotificationChain msgs) {
		Reference oldAsserter = asserter;
		asserter = newAsserter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__ASSERTER, oldAsserter, newAsserter);
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
	public void setAsserter(Reference newAsserter) {
		if (newAsserter != asserter) {
			NotificationChain msgs = null;
			if (asserter != null)
				msgs = ((InternalEObject)asserter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__ASSERTER, null, msgs);
			if (newAsserter != null)
				msgs = ((InternalEObject)newAsserter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__ASSERTER, null, msgs);
			msgs = basicSetAsserter(newAsserter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__ASSERTER, newAsserter, newAsserter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getLastOccurrence() {
		return lastOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastOccurrence(DateTime newLastOccurrence, NotificationChain msgs) {
		DateTime oldLastOccurrence = lastOccurrence;
		lastOccurrence = newLastOccurrence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__LAST_OCCURRENCE, oldLastOccurrence, newLastOccurrence);
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
	public void setLastOccurrence(DateTime newLastOccurrence) {
		if (newLastOccurrence != lastOccurrence) {
			NotificationChain msgs = null;
			if (lastOccurrence != null)
				msgs = ((InternalEObject)lastOccurrence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__LAST_OCCURRENCE, null, msgs);
			if (newLastOccurrence != null)
				msgs = ((InternalEObject)newLastOccurrence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ALLERGY_INTOLERANCE__LAST_OCCURRENCE, null, msgs);
			msgs = basicSetLastOccurrence(newLastOccurrence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ALLERGY_INTOLERANCE__LAST_OCCURRENCE, newLastOccurrence, newLastOccurrence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.ALLERGY_INTOLERANCE__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AllergyIntoleranceReaction> getReaction() {
		if (reaction == null) {
			reaction = new EObjectContainmentEList<AllergyIntoleranceReaction>(AllergyIntoleranceReaction.class, this, FhirPackage.ALLERGY_INTOLERANCE__REACTION);
		}
		return reaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ALLERGY_INTOLERANCE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.ALLERGY_INTOLERANCE__CLINICAL_STATUS:
				return basicSetClinicalStatus(null, msgs);
			case FhirPackage.ALLERGY_INTOLERANCE__VERIFICATION_STATUS:
				return basicSetVerificationStatus(null, msgs);
			case FhirPackage.ALLERGY_INTOLERANCE__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.ALLERGY_INTOLERANCE__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case FhirPackage.ALLERGY_INTOLERANCE__CRITICALITY:
				return basicSetCriticality(null, msgs);
			case FhirPackage.ALLERGY_INTOLERANCE__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.ALLERGY_INTOLERANCE__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.ALLERGY_INTOLERANCE__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FhirPackage.ALLERGY_INTOLERANCE__ONSET_DATE_TIME:
				return basicSetOnsetDateTime(null, msgs);
			case FhirPackage.ALLERGY_INTOLERANCE__ONSET_AGE:
				return basicSetOnsetAge(null, msgs);
			case FhirPackage.ALLERGY_INTOLERANCE__ONSET_PERIOD:
				return basicSetOnsetPeriod(null, msgs);
			case FhirPackage.ALLERGY_INTOLERANCE__ONSET_RANGE:
				return basicSetOnsetRange(null, msgs);
			case FhirPackage.ALLERGY_INTOLERANCE__ONSET_STRING:
				return basicSetOnsetString(null, msgs);
			case FhirPackage.ALLERGY_INTOLERANCE__RECORDED_DATE:
				return basicSetRecordedDate(null, msgs);
			case FhirPackage.ALLERGY_INTOLERANCE__RECORDER:
				return basicSetRecorder(null, msgs);
			case FhirPackage.ALLERGY_INTOLERANCE__ASSERTER:
				return basicSetAsserter(null, msgs);
			case FhirPackage.ALLERGY_INTOLERANCE__LAST_OCCURRENCE:
				return basicSetLastOccurrence(null, msgs);
			case FhirPackage.ALLERGY_INTOLERANCE__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.ALLERGY_INTOLERANCE__REACTION:
				return ((InternalEList<?>)getReaction()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.ALLERGY_INTOLERANCE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.ALLERGY_INTOLERANCE__CLINICAL_STATUS:
				return getClinicalStatus();
			case FhirPackage.ALLERGY_INTOLERANCE__VERIFICATION_STATUS:
				return getVerificationStatus();
			case FhirPackage.ALLERGY_INTOLERANCE__TYPE:
				return getType();
			case FhirPackage.ALLERGY_INTOLERANCE__CATEGORY:
				return getCategory();
			case FhirPackage.ALLERGY_INTOLERANCE__CRITICALITY:
				return getCriticality();
			case FhirPackage.ALLERGY_INTOLERANCE__CODE:
				return getCode();
			case FhirPackage.ALLERGY_INTOLERANCE__PATIENT:
				return getPatient();
			case FhirPackage.ALLERGY_INTOLERANCE__ENCOUNTER:
				return getEncounter();
			case FhirPackage.ALLERGY_INTOLERANCE__ONSET_DATE_TIME:
				return getOnsetDateTime();
			case FhirPackage.ALLERGY_INTOLERANCE__ONSET_AGE:
				return getOnsetAge();
			case FhirPackage.ALLERGY_INTOLERANCE__ONSET_PERIOD:
				return getOnsetPeriod();
			case FhirPackage.ALLERGY_INTOLERANCE__ONSET_RANGE:
				return getOnsetRange();
			case FhirPackage.ALLERGY_INTOLERANCE__ONSET_STRING:
				return getOnsetString();
			case FhirPackage.ALLERGY_INTOLERANCE__RECORDED_DATE:
				return getRecordedDate();
			case FhirPackage.ALLERGY_INTOLERANCE__RECORDER:
				return getRecorder();
			case FhirPackage.ALLERGY_INTOLERANCE__ASSERTER:
				return getAsserter();
			case FhirPackage.ALLERGY_INTOLERANCE__LAST_OCCURRENCE:
				return getLastOccurrence();
			case FhirPackage.ALLERGY_INTOLERANCE__NOTE:
				return getNote();
			case FhirPackage.ALLERGY_INTOLERANCE__REACTION:
				return getReaction();
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
			case FhirPackage.ALLERGY_INTOLERANCE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__CLINICAL_STATUS:
				setClinicalStatus((CodeableConcept)newValue);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__VERIFICATION_STATUS:
				setVerificationStatus((CodeableConcept)newValue);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__TYPE:
				setType((AllergyIntoleranceType)newValue);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends AllergyIntoleranceCategory>)newValue);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__CRITICALITY:
				setCriticality((AllergyIntoleranceCriticality)newValue);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__ONSET_DATE_TIME:
				setOnsetDateTime((DateTime)newValue);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__ONSET_AGE:
				setOnsetAge((Age)newValue);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__ONSET_PERIOD:
				setOnsetPeriod((Period)newValue);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__ONSET_RANGE:
				setOnsetRange((Range)newValue);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__ONSET_STRING:
				setOnsetString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__RECORDED_DATE:
				setRecordedDate((DateTime)newValue);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__RECORDER:
				setRecorder((Reference)newValue);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__ASSERTER:
				setAsserter((Reference)newValue);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__LAST_OCCURRENCE:
				setLastOccurrence((DateTime)newValue);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__REACTION:
				getReaction().clear();
				getReaction().addAll((Collection<? extends AllergyIntoleranceReaction>)newValue);
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
			case FhirPackage.ALLERGY_INTOLERANCE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__CLINICAL_STATUS:
				setClinicalStatus((CodeableConcept)null);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__VERIFICATION_STATUS:
				setVerificationStatus((CodeableConcept)null);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__TYPE:
				setType((AllergyIntoleranceType)null);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__CATEGORY:
				getCategory().clear();
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__CRITICALITY:
				setCriticality((AllergyIntoleranceCriticality)null);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__PATIENT:
				setPatient((Reference)null);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__ONSET_DATE_TIME:
				setOnsetDateTime((DateTime)null);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__ONSET_AGE:
				setOnsetAge((Age)null);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__ONSET_PERIOD:
				setOnsetPeriod((Period)null);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__ONSET_RANGE:
				setOnsetRange((Range)null);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__ONSET_STRING:
				setOnsetString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__RECORDED_DATE:
				setRecordedDate((DateTime)null);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__RECORDER:
				setRecorder((Reference)null);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__ASSERTER:
				setAsserter((Reference)null);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__LAST_OCCURRENCE:
				setLastOccurrence((DateTime)null);
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__NOTE:
				getNote().clear();
				return;
			case FhirPackage.ALLERGY_INTOLERANCE__REACTION:
				getReaction().clear();
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
			case FhirPackage.ALLERGY_INTOLERANCE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.ALLERGY_INTOLERANCE__CLINICAL_STATUS:
				return clinicalStatus != null;
			case FhirPackage.ALLERGY_INTOLERANCE__VERIFICATION_STATUS:
				return verificationStatus != null;
			case FhirPackage.ALLERGY_INTOLERANCE__TYPE:
				return type != null;
			case FhirPackage.ALLERGY_INTOLERANCE__CATEGORY:
				return category != null && !category.isEmpty();
			case FhirPackage.ALLERGY_INTOLERANCE__CRITICALITY:
				return criticality != null;
			case FhirPackage.ALLERGY_INTOLERANCE__CODE:
				return code != null;
			case FhirPackage.ALLERGY_INTOLERANCE__PATIENT:
				return patient != null;
			case FhirPackage.ALLERGY_INTOLERANCE__ENCOUNTER:
				return encounter != null;
			case FhirPackage.ALLERGY_INTOLERANCE__ONSET_DATE_TIME:
				return onsetDateTime != null;
			case FhirPackage.ALLERGY_INTOLERANCE__ONSET_AGE:
				return onsetAge != null;
			case FhirPackage.ALLERGY_INTOLERANCE__ONSET_PERIOD:
				return onsetPeriod != null;
			case FhirPackage.ALLERGY_INTOLERANCE__ONSET_RANGE:
				return onsetRange != null;
			case FhirPackage.ALLERGY_INTOLERANCE__ONSET_STRING:
				return onsetString != null;
			case FhirPackage.ALLERGY_INTOLERANCE__RECORDED_DATE:
				return recordedDate != null;
			case FhirPackage.ALLERGY_INTOLERANCE__RECORDER:
				return recorder != null;
			case FhirPackage.ALLERGY_INTOLERANCE__ASSERTER:
				return asserter != null;
			case FhirPackage.ALLERGY_INTOLERANCE__LAST_OCCURRENCE:
				return lastOccurrence != null;
			case FhirPackage.ALLERGY_INTOLERANCE__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.ALLERGY_INTOLERANCE__REACTION:
				return reaction != null && !reaction.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AllergyIntoleranceImpl
