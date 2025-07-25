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
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Coding;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.ImagingStudy;
import org.hl7.fhir.ImagingStudySeries;
import org.hl7.fhir.ImagingStudyStatus;
import org.hl7.fhir.Reference;
import org.hl7.fhir.UnsignedInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imaging Study</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getModality <em>Modality</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getStarted <em>Started</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getReferrer <em>Referrer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getInterpreter <em>Interpreter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getNumberOfSeries <em>Number Of Series</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getNumberOfInstances <em>Number Of Instances</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getProcedureReference <em>Procedure Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getProcedureCode <em>Procedure Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getReasonCode <em>Reason Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getReasonReference <em>Reason Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getSeries <em>Series</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImagingStudyImpl extends DomainResourceImpl implements ImagingStudy {
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
	protected ImagingStudyStatus status;

	/**
	 * The cached value of the '{@link #getModality() <em>Modality</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModality()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> modality;

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
	 * The cached value of the '{@link #getStarted() <em>Started</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStarted()
	 * @generated
	 * @ordered
	 */
	protected DateTime started;

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
	 * The cached value of the '{@link #getReferrer() <em>Referrer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferrer()
	 * @generated
	 * @ordered
	 */
	protected Reference referrer;

	/**
	 * The cached value of the '{@link #getInterpreter() <em>Interpreter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpreter()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> interpreter;

	/**
	 * The cached value of the '{@link #getEndpoint() <em>Endpoint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> endpoint;

	/**
	 * The cached value of the '{@link #getNumberOfSeries() <em>Number Of Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSeries()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt numberOfSeries;

	/**
	 * The cached value of the '{@link #getNumberOfInstances() <em>Number Of Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfInstances()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt numberOfInstances;

	/**
	 * The cached value of the '{@link #getProcedureReference() <em>Procedure Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureReference()
	 * @generated
	 * @ordered
	 */
	protected Reference procedureReference;

	/**
	 * The cached value of the '{@link #getProcedureCode() <em>Procedure Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> procedureCode;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Reference location;

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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String description;

	/**
	 * The cached value of the '{@link #getSeries() <em>Series</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeries()
	 * @generated
	 * @ordered
	 */
	protected EList<ImagingStudySeries> series;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImagingStudyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getImagingStudy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.IMAGING_STUDY__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImagingStudyStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(ImagingStudyStatus newStatus, NotificationChain msgs) {
		ImagingStudyStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__STATUS, oldStatus, newStatus);
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
	public void setStatus(ImagingStudyStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Coding> getModality() {
		if (modality == null) {
			modality = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.IMAGING_STUDY__MODALITY);
		}
		return modality;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__SUBJECT, newSubject, newSubject));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__ENCOUNTER, oldEncounter, newEncounter);
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
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getStarted() {
		return started;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStarted(DateTime newStarted, NotificationChain msgs) {
		DateTime oldStarted = started;
		started = newStarted;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__STARTED, oldStarted, newStarted);
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
	public void setStarted(DateTime newStarted) {
		if (newStarted != started) {
			NotificationChain msgs = null;
			if (started != null)
				msgs = ((InternalEObject)started).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__STARTED, null, msgs);
			if (newStarted != null)
				msgs = ((InternalEObject)newStarted).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__STARTED, null, msgs);
			msgs = basicSetStarted(newStarted, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__STARTED, newStarted, newStarted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getBasedOn() {
		if (basedOn == null) {
			basedOn = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.IMAGING_STUDY__BASED_ON);
		}
		return basedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getReferrer() {
		return referrer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferrer(Reference newReferrer, NotificationChain msgs) {
		Reference oldReferrer = referrer;
		referrer = newReferrer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__REFERRER, oldReferrer, newReferrer);
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
	public void setReferrer(Reference newReferrer) {
		if (newReferrer != referrer) {
			NotificationChain msgs = null;
			if (referrer != null)
				msgs = ((InternalEObject)referrer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__REFERRER, null, msgs);
			if (newReferrer != null)
				msgs = ((InternalEObject)newReferrer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__REFERRER, null, msgs);
			msgs = basicSetReferrer(newReferrer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__REFERRER, newReferrer, newReferrer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getInterpreter() {
		if (interpreter == null) {
			interpreter = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.IMAGING_STUDY__INTERPRETER);
		}
		return interpreter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getEndpoint() {
		if (endpoint == null) {
			endpoint = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.IMAGING_STUDY__ENDPOINT);
		}
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnsignedInt getNumberOfSeries() {
		return numberOfSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberOfSeries(UnsignedInt newNumberOfSeries, NotificationChain msgs) {
		UnsignedInt oldNumberOfSeries = numberOfSeries;
		numberOfSeries = newNumberOfSeries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__NUMBER_OF_SERIES, oldNumberOfSeries, newNumberOfSeries);
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
	public void setNumberOfSeries(UnsignedInt newNumberOfSeries) {
		if (newNumberOfSeries != numberOfSeries) {
			NotificationChain msgs = null;
			if (numberOfSeries != null)
				msgs = ((InternalEObject)numberOfSeries).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__NUMBER_OF_SERIES, null, msgs);
			if (newNumberOfSeries != null)
				msgs = ((InternalEObject)newNumberOfSeries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__NUMBER_OF_SERIES, null, msgs);
			msgs = basicSetNumberOfSeries(newNumberOfSeries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__NUMBER_OF_SERIES, newNumberOfSeries, newNumberOfSeries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnsignedInt getNumberOfInstances() {
		return numberOfInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberOfInstances(UnsignedInt newNumberOfInstances, NotificationChain msgs) {
		UnsignedInt oldNumberOfInstances = numberOfInstances;
		numberOfInstances = newNumberOfInstances;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__NUMBER_OF_INSTANCES, oldNumberOfInstances, newNumberOfInstances);
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
	public void setNumberOfInstances(UnsignedInt newNumberOfInstances) {
		if (newNumberOfInstances != numberOfInstances) {
			NotificationChain msgs = null;
			if (numberOfInstances != null)
				msgs = ((InternalEObject)numberOfInstances).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__NUMBER_OF_INSTANCES, null, msgs);
			if (newNumberOfInstances != null)
				msgs = ((InternalEObject)newNumberOfInstances).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__NUMBER_OF_INSTANCES, null, msgs);
			msgs = basicSetNumberOfInstances(newNumberOfInstances, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__NUMBER_OF_INSTANCES, newNumberOfInstances, newNumberOfInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getProcedureReference() {
		return procedureReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcedureReference(Reference newProcedureReference, NotificationChain msgs) {
		Reference oldProcedureReference = procedureReference;
		procedureReference = newProcedureReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__PROCEDURE_REFERENCE, oldProcedureReference, newProcedureReference);
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
	public void setProcedureReference(Reference newProcedureReference) {
		if (newProcedureReference != procedureReference) {
			NotificationChain msgs = null;
			if (procedureReference != null)
				msgs = ((InternalEObject)procedureReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__PROCEDURE_REFERENCE, null, msgs);
			if (newProcedureReference != null)
				msgs = ((InternalEObject)newProcedureReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__PROCEDURE_REFERENCE, null, msgs);
			msgs = basicSetProcedureReference(newProcedureReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__PROCEDURE_REFERENCE, newProcedureReference, newProcedureReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getProcedureCode() {
		if (procedureCode == null) {
			procedureCode = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.IMAGING_STUDY__PROCEDURE_CODE);
		}
		return procedureCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Reference newLocation, NotificationChain msgs) {
		Reference oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__LOCATION, oldLocation, newLocation);
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
	public void setLocation(Reference newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getReasonCode() {
		if (reasonCode == null) {
			reasonCode = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.IMAGING_STUDY__REASON_CODE);
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
			reasonReference = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.IMAGING_STUDY__REASON_REFERENCE);
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
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.IMAGING_STUDY__NOTE);
		}
		return note;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImagingStudySeries> getSeries() {
		if (series == null) {
			series = new EObjectContainmentEList<ImagingStudySeries>(ImagingStudySeries.class, this, FhirPackage.IMAGING_STUDY__SERIES);
		}
		return series;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.IMAGING_STUDY__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMAGING_STUDY__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.IMAGING_STUDY__MODALITY:
				return ((InternalEList<?>)getModality()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMAGING_STUDY__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.IMAGING_STUDY__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FhirPackage.IMAGING_STUDY__STARTED:
				return basicSetStarted(null, msgs);
			case FhirPackage.IMAGING_STUDY__BASED_ON:
				return ((InternalEList<?>)getBasedOn()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMAGING_STUDY__REFERRER:
				return basicSetReferrer(null, msgs);
			case FhirPackage.IMAGING_STUDY__INTERPRETER:
				return ((InternalEList<?>)getInterpreter()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMAGING_STUDY__ENDPOINT:
				return ((InternalEList<?>)getEndpoint()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMAGING_STUDY__NUMBER_OF_SERIES:
				return basicSetNumberOfSeries(null, msgs);
			case FhirPackage.IMAGING_STUDY__NUMBER_OF_INSTANCES:
				return basicSetNumberOfInstances(null, msgs);
			case FhirPackage.IMAGING_STUDY__PROCEDURE_REFERENCE:
				return basicSetProcedureReference(null, msgs);
			case FhirPackage.IMAGING_STUDY__PROCEDURE_CODE:
				return ((InternalEList<?>)getProcedureCode()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMAGING_STUDY__LOCATION:
				return basicSetLocation(null, msgs);
			case FhirPackage.IMAGING_STUDY__REASON_CODE:
				return ((InternalEList<?>)getReasonCode()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMAGING_STUDY__REASON_REFERENCE:
				return ((InternalEList<?>)getReasonReference()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMAGING_STUDY__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMAGING_STUDY__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.IMAGING_STUDY__SERIES:
				return ((InternalEList<?>)getSeries()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.IMAGING_STUDY__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.IMAGING_STUDY__STATUS:
				return getStatus();
			case FhirPackage.IMAGING_STUDY__MODALITY:
				return getModality();
			case FhirPackage.IMAGING_STUDY__SUBJECT:
				return getSubject();
			case FhirPackage.IMAGING_STUDY__ENCOUNTER:
				return getEncounter();
			case FhirPackage.IMAGING_STUDY__STARTED:
				return getStarted();
			case FhirPackage.IMAGING_STUDY__BASED_ON:
				return getBasedOn();
			case FhirPackage.IMAGING_STUDY__REFERRER:
				return getReferrer();
			case FhirPackage.IMAGING_STUDY__INTERPRETER:
				return getInterpreter();
			case FhirPackage.IMAGING_STUDY__ENDPOINT:
				return getEndpoint();
			case FhirPackage.IMAGING_STUDY__NUMBER_OF_SERIES:
				return getNumberOfSeries();
			case FhirPackage.IMAGING_STUDY__NUMBER_OF_INSTANCES:
				return getNumberOfInstances();
			case FhirPackage.IMAGING_STUDY__PROCEDURE_REFERENCE:
				return getProcedureReference();
			case FhirPackage.IMAGING_STUDY__PROCEDURE_CODE:
				return getProcedureCode();
			case FhirPackage.IMAGING_STUDY__LOCATION:
				return getLocation();
			case FhirPackage.IMAGING_STUDY__REASON_CODE:
				return getReasonCode();
			case FhirPackage.IMAGING_STUDY__REASON_REFERENCE:
				return getReasonReference();
			case FhirPackage.IMAGING_STUDY__NOTE:
				return getNote();
			case FhirPackage.IMAGING_STUDY__DESCRIPTION:
				return getDescription();
			case FhirPackage.IMAGING_STUDY__SERIES:
				return getSeries();
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
			case FhirPackage.IMAGING_STUDY__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__STATUS:
				setStatus((ImagingStudyStatus)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__MODALITY:
				getModality().clear();
				getModality().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__STARTED:
				setStarted((DateTime)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__BASED_ON:
				getBasedOn().clear();
				getBasedOn().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__REFERRER:
				setReferrer((Reference)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__INTERPRETER:
				getInterpreter().clear();
				getInterpreter().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__ENDPOINT:
				getEndpoint().clear();
				getEndpoint().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__NUMBER_OF_SERIES:
				setNumberOfSeries((UnsignedInt)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__NUMBER_OF_INSTANCES:
				setNumberOfInstances((UnsignedInt)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__PROCEDURE_REFERENCE:
				setProcedureReference((Reference)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__PROCEDURE_CODE:
				getProcedureCode().clear();
				getProcedureCode().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__LOCATION:
				setLocation((Reference)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__REASON_CODE:
				getReasonCode().clear();
				getReasonCode().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__REASON_REFERENCE:
				getReasonReference().clear();
				getReasonReference().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__SERIES:
				getSeries().clear();
				getSeries().addAll((Collection<? extends ImagingStudySeries>)newValue);
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
			case FhirPackage.IMAGING_STUDY__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.IMAGING_STUDY__STATUS:
				setStatus((ImagingStudyStatus)null);
				return;
			case FhirPackage.IMAGING_STUDY__MODALITY:
				getModality().clear();
				return;
			case FhirPackage.IMAGING_STUDY__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.IMAGING_STUDY__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case FhirPackage.IMAGING_STUDY__STARTED:
				setStarted((DateTime)null);
				return;
			case FhirPackage.IMAGING_STUDY__BASED_ON:
				getBasedOn().clear();
				return;
			case FhirPackage.IMAGING_STUDY__REFERRER:
				setReferrer((Reference)null);
				return;
			case FhirPackage.IMAGING_STUDY__INTERPRETER:
				getInterpreter().clear();
				return;
			case FhirPackage.IMAGING_STUDY__ENDPOINT:
				getEndpoint().clear();
				return;
			case FhirPackage.IMAGING_STUDY__NUMBER_OF_SERIES:
				setNumberOfSeries((UnsignedInt)null);
				return;
			case FhirPackage.IMAGING_STUDY__NUMBER_OF_INSTANCES:
				setNumberOfInstances((UnsignedInt)null);
				return;
			case FhirPackage.IMAGING_STUDY__PROCEDURE_REFERENCE:
				setProcedureReference((Reference)null);
				return;
			case FhirPackage.IMAGING_STUDY__PROCEDURE_CODE:
				getProcedureCode().clear();
				return;
			case FhirPackage.IMAGING_STUDY__LOCATION:
				setLocation((Reference)null);
				return;
			case FhirPackage.IMAGING_STUDY__REASON_CODE:
				getReasonCode().clear();
				return;
			case FhirPackage.IMAGING_STUDY__REASON_REFERENCE:
				getReasonReference().clear();
				return;
			case FhirPackage.IMAGING_STUDY__NOTE:
				getNote().clear();
				return;
			case FhirPackage.IMAGING_STUDY__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.IMAGING_STUDY__SERIES:
				getSeries().clear();
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
			case FhirPackage.IMAGING_STUDY__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.IMAGING_STUDY__STATUS:
				return status != null;
			case FhirPackage.IMAGING_STUDY__MODALITY:
				return modality != null && !modality.isEmpty();
			case FhirPackage.IMAGING_STUDY__SUBJECT:
				return subject != null;
			case FhirPackage.IMAGING_STUDY__ENCOUNTER:
				return encounter != null;
			case FhirPackage.IMAGING_STUDY__STARTED:
				return started != null;
			case FhirPackage.IMAGING_STUDY__BASED_ON:
				return basedOn != null && !basedOn.isEmpty();
			case FhirPackage.IMAGING_STUDY__REFERRER:
				return referrer != null;
			case FhirPackage.IMAGING_STUDY__INTERPRETER:
				return interpreter != null && !interpreter.isEmpty();
			case FhirPackage.IMAGING_STUDY__ENDPOINT:
				return endpoint != null && !endpoint.isEmpty();
			case FhirPackage.IMAGING_STUDY__NUMBER_OF_SERIES:
				return numberOfSeries != null;
			case FhirPackage.IMAGING_STUDY__NUMBER_OF_INSTANCES:
				return numberOfInstances != null;
			case FhirPackage.IMAGING_STUDY__PROCEDURE_REFERENCE:
				return procedureReference != null;
			case FhirPackage.IMAGING_STUDY__PROCEDURE_CODE:
				return procedureCode != null && !procedureCode.isEmpty();
			case FhirPackage.IMAGING_STUDY__LOCATION:
				return location != null;
			case FhirPackage.IMAGING_STUDY__REASON_CODE:
				return reasonCode != null && !reasonCode.isEmpty();
			case FhirPackage.IMAGING_STUDY__REASON_REFERENCE:
				return reasonReference != null && !reasonReference.isEmpty();
			case FhirPackage.IMAGING_STUDY__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.IMAGING_STUDY__DESCRIPTION:
				return description != null;
			case FhirPackage.IMAGING_STUDY__SERIES:
				return series != null && !series.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImagingStudyImpl
