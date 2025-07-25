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
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.ImmunizationEvaluation;
import org.hl7.fhir.ImmunizationEvaluationStatusCodes;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immunization Evaluation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationEvaluationImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationEvaluationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationEvaluationImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationEvaluationImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationEvaluationImpl#getAuthority <em>Authority</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationEvaluationImpl#getTargetDisease <em>Target Disease</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationEvaluationImpl#getImmunizationEvent <em>Immunization Event</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationEvaluationImpl#getDoseStatus <em>Dose Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationEvaluationImpl#getDoseStatusReason <em>Dose Status Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationEvaluationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationEvaluationImpl#getSeries <em>Series</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationEvaluationImpl#getDoseNumberPositiveInt <em>Dose Number Positive Int</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationEvaluationImpl#getDoseNumberString <em>Dose Number String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationEvaluationImpl#getSeriesDosesPositiveInt <em>Series Doses Positive Int</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationEvaluationImpl#getSeriesDosesString <em>Series Doses String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImmunizationEvaluationImpl extends DomainResourceImpl implements ImmunizationEvaluation {
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
	protected ImmunizationEvaluationStatusCodes status;

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
	 * The cached value of the '{@link #getAuthority() <em>Authority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthority()
	 * @generated
	 * @ordered
	 */
	protected Reference authority;

	/**
	 * The cached value of the '{@link #getTargetDisease() <em>Target Disease</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDisease()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept targetDisease;

	/**
	 * The cached value of the '{@link #getImmunizationEvent() <em>Immunization Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizationEvent()
	 * @generated
	 * @ordered
	 */
	protected Reference immunizationEvent;

	/**
	 * The cached value of the '{@link #getDoseStatus() <em>Dose Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept doseStatus;

	/**
	 * The cached value of the '{@link #getDoseStatusReason() <em>Dose Status Reason</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseStatusReason()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> doseStatusReason;

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
	 * The cached value of the '{@link #getSeries() <em>Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeries()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String series;

	/**
	 * The cached value of the '{@link #getDoseNumberPositiveInt() <em>Dose Number Positive Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseNumberPositiveInt()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt doseNumberPositiveInt;

	/**
	 * The cached value of the '{@link #getDoseNumberString() <em>Dose Number String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseNumberString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String doseNumberString;

	/**
	 * The cached value of the '{@link #getSeriesDosesPositiveInt() <em>Series Doses Positive Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriesDosesPositiveInt()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt seriesDosesPositiveInt;

	/**
	 * The cached value of the '{@link #getSeriesDosesString() <em>Series Doses String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriesDosesString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String seriesDosesString;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmunizationEvaluationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getImmunizationEvaluation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.IMMUNIZATION_EVALUATION__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationEvaluationStatusCodes getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(ImmunizationEvaluationStatusCodes newStatus, NotificationChain msgs) {
		ImmunizationEvaluationStatusCodes oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__STATUS, oldStatus, newStatus);
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
	public void setStatus(ImmunizationEvaluationStatusCodes newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__PATIENT, oldPatient, newPatient);
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
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__PATIENT, newPatient, newPatient));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getAuthority() {
		return authority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthority(Reference newAuthority, NotificationChain msgs) {
		Reference oldAuthority = authority;
		authority = newAuthority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__AUTHORITY, oldAuthority, newAuthority);
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
	public void setAuthority(Reference newAuthority) {
		if (newAuthority != authority) {
			NotificationChain msgs = null;
			if (authority != null)
				msgs = ((InternalEObject)authority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__AUTHORITY, null, msgs);
			if (newAuthority != null)
				msgs = ((InternalEObject)newAuthority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__AUTHORITY, null, msgs);
			msgs = basicSetAuthority(newAuthority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__AUTHORITY, newAuthority, newAuthority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getTargetDisease() {
		return targetDisease;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetDisease(CodeableConcept newTargetDisease, NotificationChain msgs) {
		CodeableConcept oldTargetDisease = targetDisease;
		targetDisease = newTargetDisease;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__TARGET_DISEASE, oldTargetDisease, newTargetDisease);
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
	public void setTargetDisease(CodeableConcept newTargetDisease) {
		if (newTargetDisease != targetDisease) {
			NotificationChain msgs = null;
			if (targetDisease != null)
				msgs = ((InternalEObject)targetDisease).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__TARGET_DISEASE, null, msgs);
			if (newTargetDisease != null)
				msgs = ((InternalEObject)newTargetDisease).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__TARGET_DISEASE, null, msgs);
			msgs = basicSetTargetDisease(newTargetDisease, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__TARGET_DISEASE, newTargetDisease, newTargetDisease));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getImmunizationEvent() {
		return immunizationEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImmunizationEvent(Reference newImmunizationEvent, NotificationChain msgs) {
		Reference oldImmunizationEvent = immunizationEvent;
		immunizationEvent = newImmunizationEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__IMMUNIZATION_EVENT, oldImmunizationEvent, newImmunizationEvent);
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
	public void setImmunizationEvent(Reference newImmunizationEvent) {
		if (newImmunizationEvent != immunizationEvent) {
			NotificationChain msgs = null;
			if (immunizationEvent != null)
				msgs = ((InternalEObject)immunizationEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__IMMUNIZATION_EVENT, null, msgs);
			if (newImmunizationEvent != null)
				msgs = ((InternalEObject)newImmunizationEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__IMMUNIZATION_EVENT, null, msgs);
			msgs = basicSetImmunizationEvent(newImmunizationEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__IMMUNIZATION_EVENT, newImmunizationEvent, newImmunizationEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getDoseStatus() {
		return doseStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoseStatus(CodeableConcept newDoseStatus, NotificationChain msgs) {
		CodeableConcept oldDoseStatus = doseStatus;
		doseStatus = newDoseStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__DOSE_STATUS, oldDoseStatus, newDoseStatus);
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
	public void setDoseStatus(CodeableConcept newDoseStatus) {
		if (newDoseStatus != doseStatus) {
			NotificationChain msgs = null;
			if (doseStatus != null)
				msgs = ((InternalEObject)doseStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__DOSE_STATUS, null, msgs);
			if (newDoseStatus != null)
				msgs = ((InternalEObject)newDoseStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__DOSE_STATUS, null, msgs);
			msgs = basicSetDoseStatus(newDoseStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__DOSE_STATUS, newDoseStatus, newDoseStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getDoseStatusReason() {
		if (doseStatusReason == null) {
			doseStatusReason = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.IMMUNIZATION_EVALUATION__DOSE_STATUS_REASON);
		}
		return doseStatusReason;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getSeries() {
		return series;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeries(org.hl7.fhir.String newSeries, NotificationChain msgs) {
		org.hl7.fhir.String oldSeries = series;
		series = newSeries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__SERIES, oldSeries, newSeries);
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
	public void setSeries(org.hl7.fhir.String newSeries) {
		if (newSeries != series) {
			NotificationChain msgs = null;
			if (series != null)
				msgs = ((InternalEObject)series).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__SERIES, null, msgs);
			if (newSeries != null)
				msgs = ((InternalEObject)newSeries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__SERIES, null, msgs);
			msgs = basicSetSeries(newSeries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__SERIES, newSeries, newSeries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getDoseNumberPositiveInt() {
		return doseNumberPositiveInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoseNumberPositiveInt(PositiveInt newDoseNumberPositiveInt, NotificationChain msgs) {
		PositiveInt oldDoseNumberPositiveInt = doseNumberPositiveInt;
		doseNumberPositiveInt = newDoseNumberPositiveInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__DOSE_NUMBER_POSITIVE_INT, oldDoseNumberPositiveInt, newDoseNumberPositiveInt);
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
	public void setDoseNumberPositiveInt(PositiveInt newDoseNumberPositiveInt) {
		if (newDoseNumberPositiveInt != doseNumberPositiveInt) {
			NotificationChain msgs = null;
			if (doseNumberPositiveInt != null)
				msgs = ((InternalEObject)doseNumberPositiveInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__DOSE_NUMBER_POSITIVE_INT, null, msgs);
			if (newDoseNumberPositiveInt != null)
				msgs = ((InternalEObject)newDoseNumberPositiveInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__DOSE_NUMBER_POSITIVE_INT, null, msgs);
			msgs = basicSetDoseNumberPositiveInt(newDoseNumberPositiveInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__DOSE_NUMBER_POSITIVE_INT, newDoseNumberPositiveInt, newDoseNumberPositiveInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getDoseNumberString() {
		return doseNumberString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoseNumberString(org.hl7.fhir.String newDoseNumberString, NotificationChain msgs) {
		org.hl7.fhir.String oldDoseNumberString = doseNumberString;
		doseNumberString = newDoseNumberString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__DOSE_NUMBER_STRING, oldDoseNumberString, newDoseNumberString);
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
	public void setDoseNumberString(org.hl7.fhir.String newDoseNumberString) {
		if (newDoseNumberString != doseNumberString) {
			NotificationChain msgs = null;
			if (doseNumberString != null)
				msgs = ((InternalEObject)doseNumberString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__DOSE_NUMBER_STRING, null, msgs);
			if (newDoseNumberString != null)
				msgs = ((InternalEObject)newDoseNumberString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__DOSE_NUMBER_STRING, null, msgs);
			msgs = basicSetDoseNumberString(newDoseNumberString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__DOSE_NUMBER_STRING, newDoseNumberString, newDoseNumberString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getSeriesDosesPositiveInt() {
		return seriesDosesPositiveInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeriesDosesPositiveInt(PositiveInt newSeriesDosesPositiveInt, NotificationChain msgs) {
		PositiveInt oldSeriesDosesPositiveInt = seriesDosesPositiveInt;
		seriesDosesPositiveInt = newSeriesDosesPositiveInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__SERIES_DOSES_POSITIVE_INT, oldSeriesDosesPositiveInt, newSeriesDosesPositiveInt);
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
	public void setSeriesDosesPositiveInt(PositiveInt newSeriesDosesPositiveInt) {
		if (newSeriesDosesPositiveInt != seriesDosesPositiveInt) {
			NotificationChain msgs = null;
			if (seriesDosesPositiveInt != null)
				msgs = ((InternalEObject)seriesDosesPositiveInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__SERIES_DOSES_POSITIVE_INT, null, msgs);
			if (newSeriesDosesPositiveInt != null)
				msgs = ((InternalEObject)newSeriesDosesPositiveInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__SERIES_DOSES_POSITIVE_INT, null, msgs);
			msgs = basicSetSeriesDosesPositiveInt(newSeriesDosesPositiveInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__SERIES_DOSES_POSITIVE_INT, newSeriesDosesPositiveInt, newSeriesDosesPositiveInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getSeriesDosesString() {
		return seriesDosesString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeriesDosesString(org.hl7.fhir.String newSeriesDosesString, NotificationChain msgs) {
		org.hl7.fhir.String oldSeriesDosesString = seriesDosesString;
		seriesDosesString = newSeriesDosesString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__SERIES_DOSES_STRING, oldSeriesDosesString, newSeriesDosesString);
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
	public void setSeriesDosesString(org.hl7.fhir.String newSeriesDosesString) {
		if (newSeriesDosesString != seriesDosesString) {
			NotificationChain msgs = null;
			if (seriesDosesString != null)
				msgs = ((InternalEObject)seriesDosesString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__SERIES_DOSES_STRING, null, msgs);
			if (newSeriesDosesString != null)
				msgs = ((InternalEObject)newSeriesDosesString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_EVALUATION__SERIES_DOSES_STRING, null, msgs);
			msgs = basicSetSeriesDosesString(newSeriesDosesString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_EVALUATION__SERIES_DOSES_STRING, newSeriesDosesString, newSeriesDosesString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.IMMUNIZATION_EVALUATION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMMUNIZATION_EVALUATION__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.IMMUNIZATION_EVALUATION__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.IMMUNIZATION_EVALUATION__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.IMMUNIZATION_EVALUATION__AUTHORITY:
				return basicSetAuthority(null, msgs);
			case FhirPackage.IMMUNIZATION_EVALUATION__TARGET_DISEASE:
				return basicSetTargetDisease(null, msgs);
			case FhirPackage.IMMUNIZATION_EVALUATION__IMMUNIZATION_EVENT:
				return basicSetImmunizationEvent(null, msgs);
			case FhirPackage.IMMUNIZATION_EVALUATION__DOSE_STATUS:
				return basicSetDoseStatus(null, msgs);
			case FhirPackage.IMMUNIZATION_EVALUATION__DOSE_STATUS_REASON:
				return ((InternalEList<?>)getDoseStatusReason()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMMUNIZATION_EVALUATION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.IMMUNIZATION_EVALUATION__SERIES:
				return basicSetSeries(null, msgs);
			case FhirPackage.IMMUNIZATION_EVALUATION__DOSE_NUMBER_POSITIVE_INT:
				return basicSetDoseNumberPositiveInt(null, msgs);
			case FhirPackage.IMMUNIZATION_EVALUATION__DOSE_NUMBER_STRING:
				return basicSetDoseNumberString(null, msgs);
			case FhirPackage.IMMUNIZATION_EVALUATION__SERIES_DOSES_POSITIVE_INT:
				return basicSetSeriesDosesPositiveInt(null, msgs);
			case FhirPackage.IMMUNIZATION_EVALUATION__SERIES_DOSES_STRING:
				return basicSetSeriesDosesString(null, msgs);
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
			case FhirPackage.IMMUNIZATION_EVALUATION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.IMMUNIZATION_EVALUATION__STATUS:
				return getStatus();
			case FhirPackage.IMMUNIZATION_EVALUATION__PATIENT:
				return getPatient();
			case FhirPackage.IMMUNIZATION_EVALUATION__DATE:
				return getDate();
			case FhirPackage.IMMUNIZATION_EVALUATION__AUTHORITY:
				return getAuthority();
			case FhirPackage.IMMUNIZATION_EVALUATION__TARGET_DISEASE:
				return getTargetDisease();
			case FhirPackage.IMMUNIZATION_EVALUATION__IMMUNIZATION_EVENT:
				return getImmunizationEvent();
			case FhirPackage.IMMUNIZATION_EVALUATION__DOSE_STATUS:
				return getDoseStatus();
			case FhirPackage.IMMUNIZATION_EVALUATION__DOSE_STATUS_REASON:
				return getDoseStatusReason();
			case FhirPackage.IMMUNIZATION_EVALUATION__DESCRIPTION:
				return getDescription();
			case FhirPackage.IMMUNIZATION_EVALUATION__SERIES:
				return getSeries();
			case FhirPackage.IMMUNIZATION_EVALUATION__DOSE_NUMBER_POSITIVE_INT:
				return getDoseNumberPositiveInt();
			case FhirPackage.IMMUNIZATION_EVALUATION__DOSE_NUMBER_STRING:
				return getDoseNumberString();
			case FhirPackage.IMMUNIZATION_EVALUATION__SERIES_DOSES_POSITIVE_INT:
				return getSeriesDosesPositiveInt();
			case FhirPackage.IMMUNIZATION_EVALUATION__SERIES_DOSES_STRING:
				return getSeriesDosesString();
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
			case FhirPackage.IMMUNIZATION_EVALUATION__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__STATUS:
				setStatus((ImmunizationEvaluationStatusCodes)newValue);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__AUTHORITY:
				setAuthority((Reference)newValue);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__TARGET_DISEASE:
				setTargetDisease((CodeableConcept)newValue);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__IMMUNIZATION_EVENT:
				setImmunizationEvent((Reference)newValue);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__DOSE_STATUS:
				setDoseStatus((CodeableConcept)newValue);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__DOSE_STATUS_REASON:
				getDoseStatusReason().clear();
				getDoseStatusReason().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__SERIES:
				setSeries((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__DOSE_NUMBER_POSITIVE_INT:
				setDoseNumberPositiveInt((PositiveInt)newValue);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__DOSE_NUMBER_STRING:
				setDoseNumberString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__SERIES_DOSES_POSITIVE_INT:
				setSeriesDosesPositiveInt((PositiveInt)newValue);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__SERIES_DOSES_STRING:
				setSeriesDosesString((org.hl7.fhir.String)newValue);
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
			case FhirPackage.IMMUNIZATION_EVALUATION__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__STATUS:
				setStatus((ImmunizationEvaluationStatusCodes)null);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__PATIENT:
				setPatient((Reference)null);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__AUTHORITY:
				setAuthority((Reference)null);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__TARGET_DISEASE:
				setTargetDisease((CodeableConcept)null);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__IMMUNIZATION_EVENT:
				setImmunizationEvent((Reference)null);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__DOSE_STATUS:
				setDoseStatus((CodeableConcept)null);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__DOSE_STATUS_REASON:
				getDoseStatusReason().clear();
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__SERIES:
				setSeries((org.hl7.fhir.String)null);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__DOSE_NUMBER_POSITIVE_INT:
				setDoseNumberPositiveInt((PositiveInt)null);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__DOSE_NUMBER_STRING:
				setDoseNumberString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__SERIES_DOSES_POSITIVE_INT:
				setSeriesDosesPositiveInt((PositiveInt)null);
				return;
			case FhirPackage.IMMUNIZATION_EVALUATION__SERIES_DOSES_STRING:
				setSeriesDosesString((org.hl7.fhir.String)null);
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
			case FhirPackage.IMMUNIZATION_EVALUATION__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.IMMUNIZATION_EVALUATION__STATUS:
				return status != null;
			case FhirPackage.IMMUNIZATION_EVALUATION__PATIENT:
				return patient != null;
			case FhirPackage.IMMUNIZATION_EVALUATION__DATE:
				return date != null;
			case FhirPackage.IMMUNIZATION_EVALUATION__AUTHORITY:
				return authority != null;
			case FhirPackage.IMMUNIZATION_EVALUATION__TARGET_DISEASE:
				return targetDisease != null;
			case FhirPackage.IMMUNIZATION_EVALUATION__IMMUNIZATION_EVENT:
				return immunizationEvent != null;
			case FhirPackage.IMMUNIZATION_EVALUATION__DOSE_STATUS:
				return doseStatus != null;
			case FhirPackage.IMMUNIZATION_EVALUATION__DOSE_STATUS_REASON:
				return doseStatusReason != null && !doseStatusReason.isEmpty();
			case FhirPackage.IMMUNIZATION_EVALUATION__DESCRIPTION:
				return description != null;
			case FhirPackage.IMMUNIZATION_EVALUATION__SERIES:
				return series != null;
			case FhirPackage.IMMUNIZATION_EVALUATION__DOSE_NUMBER_POSITIVE_INT:
				return doseNumberPositiveInt != null;
			case FhirPackage.IMMUNIZATION_EVALUATION__DOSE_NUMBER_STRING:
				return doseNumberString != null;
			case FhirPackage.IMMUNIZATION_EVALUATION__SERIES_DOSES_POSITIVE_INT:
				return seriesDosesPositiveInt != null;
			case FhirPackage.IMMUNIZATION_EVALUATION__SERIES_DOSES_STRING:
				return seriesDosesString != null;
		}
		return super.eIsSet(featureID);
	}

} //ImmunizationEvaluationImpl
