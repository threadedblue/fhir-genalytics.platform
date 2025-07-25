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
import org.hl7.fhir.Canonical;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DataRequirement;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.GuidanceResponse;
import org.hl7.fhir.GuidanceResponseStatus;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guidance Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseImpl#getRequestIdentifier <em>Request Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseImpl#getModuleUri <em>Module Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseImpl#getModuleCanonical <em>Module Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseImpl#getModuleCodeableConcept <em>Module Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseImpl#getOccurrenceDateTime <em>Occurrence Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseImpl#getReasonCode <em>Reason Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseImpl#getReasonReference <em>Reason Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseImpl#getEvaluationMessage <em>Evaluation Message</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseImpl#getOutputParameters <em>Output Parameters</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseImpl#getDataRequirement <em>Data Requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GuidanceResponseImpl extends DomainResourceImpl implements GuidanceResponse {
	/**
	 * The cached value of the '{@link #getRequestIdentifier() <em>Request Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier requestIdentifier;

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
	 * The cached value of the '{@link #getModuleUri() <em>Module Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleUri()
	 * @generated
	 * @ordered
	 */
	protected Uri moduleUri;

	/**
	 * The cached value of the '{@link #getModuleCanonical() <em>Module Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleCanonical()
	 * @generated
	 * @ordered
	 */
	protected Canonical moduleCanonical;

	/**
	 * The cached value of the '{@link #getModuleCodeableConcept() <em>Module Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept moduleCodeableConcept;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected GuidanceResponseStatus status;

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
	 * The cached value of the '{@link #getOccurrenceDateTime() <em>Occurrence Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrenceDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime occurrenceDateTime;

	/**
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected Reference performer;

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
	 * The cached value of the '{@link #getEvaluationMessage() <em>Evaluation Message</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationMessage()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> evaluationMessage;

	/**
	 * The cached value of the '{@link #getOutputParameters() <em>Output Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputParameters()
	 * @generated
	 * @ordered
	 */
	protected Reference outputParameters;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected Reference result;

	/**
	 * The cached value of the '{@link #getDataRequirement() <em>Data Requirement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<DataRequirement> dataRequirement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuidanceResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getGuidanceResponse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getRequestIdentifier() {
		return requestIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestIdentifier(Identifier newRequestIdentifier, NotificationChain msgs) {
		Identifier oldRequestIdentifier = requestIdentifier;
		requestIdentifier = newRequestIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__REQUEST_IDENTIFIER, oldRequestIdentifier, newRequestIdentifier);
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
	public void setRequestIdentifier(Identifier newRequestIdentifier) {
		if (newRequestIdentifier != requestIdentifier) {
			NotificationChain msgs = null;
			if (requestIdentifier != null)
				msgs = ((InternalEObject)requestIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__REQUEST_IDENTIFIER, null, msgs);
			if (newRequestIdentifier != null)
				msgs = ((InternalEObject)newRequestIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__REQUEST_IDENTIFIER, null, msgs);
			msgs = basicSetRequestIdentifier(newRequestIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__REQUEST_IDENTIFIER, newRequestIdentifier, newRequestIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.GUIDANCE_RESPONSE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getModuleUri() {
		return moduleUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModuleUri(Uri newModuleUri, NotificationChain msgs) {
		Uri oldModuleUri = moduleUri;
		moduleUri = newModuleUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__MODULE_URI, oldModuleUri, newModuleUri);
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
	public void setModuleUri(Uri newModuleUri) {
		if (newModuleUri != moduleUri) {
			NotificationChain msgs = null;
			if (moduleUri != null)
				msgs = ((InternalEObject)moduleUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__MODULE_URI, null, msgs);
			if (newModuleUri != null)
				msgs = ((InternalEObject)newModuleUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__MODULE_URI, null, msgs);
			msgs = basicSetModuleUri(newModuleUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__MODULE_URI, newModuleUri, newModuleUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Canonical getModuleCanonical() {
		return moduleCanonical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModuleCanonical(Canonical newModuleCanonical, NotificationChain msgs) {
		Canonical oldModuleCanonical = moduleCanonical;
		moduleCanonical = newModuleCanonical;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__MODULE_CANONICAL, oldModuleCanonical, newModuleCanonical);
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
	public void setModuleCanonical(Canonical newModuleCanonical) {
		if (newModuleCanonical != moduleCanonical) {
			NotificationChain msgs = null;
			if (moduleCanonical != null)
				msgs = ((InternalEObject)moduleCanonical).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__MODULE_CANONICAL, null, msgs);
			if (newModuleCanonical != null)
				msgs = ((InternalEObject)newModuleCanonical).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__MODULE_CANONICAL, null, msgs);
			msgs = basicSetModuleCanonical(newModuleCanonical, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__MODULE_CANONICAL, newModuleCanonical, newModuleCanonical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getModuleCodeableConcept() {
		return moduleCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModuleCodeableConcept(CodeableConcept newModuleCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldModuleCodeableConcept = moduleCodeableConcept;
		moduleCodeableConcept = newModuleCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__MODULE_CODEABLE_CONCEPT, oldModuleCodeableConcept, newModuleCodeableConcept);
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
	public void setModuleCodeableConcept(CodeableConcept newModuleCodeableConcept) {
		if (newModuleCodeableConcept != moduleCodeableConcept) {
			NotificationChain msgs = null;
			if (moduleCodeableConcept != null)
				msgs = ((InternalEObject)moduleCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__MODULE_CODEABLE_CONCEPT, null, msgs);
			if (newModuleCodeableConcept != null)
				msgs = ((InternalEObject)newModuleCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__MODULE_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetModuleCodeableConcept(newModuleCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__MODULE_CODEABLE_CONCEPT, newModuleCodeableConcept, newModuleCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GuidanceResponseStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(GuidanceResponseStatus newStatus, NotificationChain msgs) {
		GuidanceResponseStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__STATUS, oldStatus, newStatus);
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
	public void setStatus(GuidanceResponseStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__SUBJECT, newSubject, newSubject));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__ENCOUNTER, oldEncounter, newEncounter);
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
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getOccurrenceDateTime() {
		return occurrenceDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurrenceDateTime(DateTime newOccurrenceDateTime, NotificationChain msgs) {
		DateTime oldOccurrenceDateTime = occurrenceDateTime;
		occurrenceDateTime = newOccurrenceDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__OCCURRENCE_DATE_TIME, oldOccurrenceDateTime, newOccurrenceDateTime);
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
	public void setOccurrenceDateTime(DateTime newOccurrenceDateTime) {
		if (newOccurrenceDateTime != occurrenceDateTime) {
			NotificationChain msgs = null;
			if (occurrenceDateTime != null)
				msgs = ((InternalEObject)occurrenceDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__OCCURRENCE_DATE_TIME, null, msgs);
			if (newOccurrenceDateTime != null)
				msgs = ((InternalEObject)newOccurrenceDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__OCCURRENCE_DATE_TIME, null, msgs);
			msgs = basicSetOccurrenceDateTime(newOccurrenceDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__OCCURRENCE_DATE_TIME, newOccurrenceDateTime, newOccurrenceDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getPerformer() {
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformer(Reference newPerformer, NotificationChain msgs) {
		Reference oldPerformer = performer;
		performer = newPerformer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__PERFORMER, oldPerformer, newPerformer);
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
	public void setPerformer(Reference newPerformer) {
		if (newPerformer != performer) {
			NotificationChain msgs = null;
			if (performer != null)
				msgs = ((InternalEObject)performer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__PERFORMER, null, msgs);
			if (newPerformer != null)
				msgs = ((InternalEObject)newPerformer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__PERFORMER, null, msgs);
			msgs = basicSetPerformer(newPerformer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__PERFORMER, newPerformer, newPerformer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getReasonCode() {
		if (reasonCode == null) {
			reasonCode = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.GUIDANCE_RESPONSE__REASON_CODE);
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
			reasonReference = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.GUIDANCE_RESPONSE__REASON_REFERENCE);
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
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.GUIDANCE_RESPONSE__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getEvaluationMessage() {
		if (evaluationMessage == null) {
			evaluationMessage = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.GUIDANCE_RESPONSE__EVALUATION_MESSAGE);
		}
		return evaluationMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getOutputParameters() {
		return outputParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputParameters(Reference newOutputParameters, NotificationChain msgs) {
		Reference oldOutputParameters = outputParameters;
		outputParameters = newOutputParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS, oldOutputParameters, newOutputParameters);
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
	public void setOutputParameters(Reference newOutputParameters) {
		if (newOutputParameters != outputParameters) {
			NotificationChain msgs = null;
			if (outputParameters != null)
				msgs = ((InternalEObject)outputParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS, null, msgs);
			if (newOutputParameters != null)
				msgs = ((InternalEObject)newOutputParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS, null, msgs);
			msgs = basicSetOutputParameters(newOutputParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS, newOutputParameters, newOutputParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResult(Reference newResult, NotificationChain msgs) {
		Reference oldResult = result;
		result = newResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__RESULT, oldResult, newResult);
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
	public void setResult(Reference newResult) {
		if (newResult != result) {
			NotificationChain msgs = null;
			if (result != null)
				msgs = ((InternalEObject)result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__RESULT, null, msgs);
			if (newResult != null)
				msgs = ((InternalEObject)newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE__RESULT, null, msgs);
			msgs = basicSetResult(newResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE__RESULT, newResult, newResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataRequirement> getDataRequirement() {
		if (dataRequirement == null) {
			dataRequirement = new EObjectContainmentEList<DataRequirement>(DataRequirement.class, this, FhirPackage.GUIDANCE_RESPONSE__DATA_REQUIREMENT);
		}
		return dataRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.GUIDANCE_RESPONSE__REQUEST_IDENTIFIER:
				return basicSetRequestIdentifier(null, msgs);
			case FhirPackage.GUIDANCE_RESPONSE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.GUIDANCE_RESPONSE__MODULE_URI:
				return basicSetModuleUri(null, msgs);
			case FhirPackage.GUIDANCE_RESPONSE__MODULE_CANONICAL:
				return basicSetModuleCanonical(null, msgs);
			case FhirPackage.GUIDANCE_RESPONSE__MODULE_CODEABLE_CONCEPT:
				return basicSetModuleCodeableConcept(null, msgs);
			case FhirPackage.GUIDANCE_RESPONSE__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.GUIDANCE_RESPONSE__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.GUIDANCE_RESPONSE__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FhirPackage.GUIDANCE_RESPONSE__OCCURRENCE_DATE_TIME:
				return basicSetOccurrenceDateTime(null, msgs);
			case FhirPackage.GUIDANCE_RESPONSE__PERFORMER:
				return basicSetPerformer(null, msgs);
			case FhirPackage.GUIDANCE_RESPONSE__REASON_CODE:
				return ((InternalEList<?>)getReasonCode()).basicRemove(otherEnd, msgs);
			case FhirPackage.GUIDANCE_RESPONSE__REASON_REFERENCE:
				return ((InternalEList<?>)getReasonReference()).basicRemove(otherEnd, msgs);
			case FhirPackage.GUIDANCE_RESPONSE__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.GUIDANCE_RESPONSE__EVALUATION_MESSAGE:
				return ((InternalEList<?>)getEvaluationMessage()).basicRemove(otherEnd, msgs);
			case FhirPackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS:
				return basicSetOutputParameters(null, msgs);
			case FhirPackage.GUIDANCE_RESPONSE__RESULT:
				return basicSetResult(null, msgs);
			case FhirPackage.GUIDANCE_RESPONSE__DATA_REQUIREMENT:
				return ((InternalEList<?>)getDataRequirement()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.GUIDANCE_RESPONSE__REQUEST_IDENTIFIER:
				return getRequestIdentifier();
			case FhirPackage.GUIDANCE_RESPONSE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.GUIDANCE_RESPONSE__MODULE_URI:
				return getModuleUri();
			case FhirPackage.GUIDANCE_RESPONSE__MODULE_CANONICAL:
				return getModuleCanonical();
			case FhirPackage.GUIDANCE_RESPONSE__MODULE_CODEABLE_CONCEPT:
				return getModuleCodeableConcept();
			case FhirPackage.GUIDANCE_RESPONSE__STATUS:
				return getStatus();
			case FhirPackage.GUIDANCE_RESPONSE__SUBJECT:
				return getSubject();
			case FhirPackage.GUIDANCE_RESPONSE__ENCOUNTER:
				return getEncounter();
			case FhirPackage.GUIDANCE_RESPONSE__OCCURRENCE_DATE_TIME:
				return getOccurrenceDateTime();
			case FhirPackage.GUIDANCE_RESPONSE__PERFORMER:
				return getPerformer();
			case FhirPackage.GUIDANCE_RESPONSE__REASON_CODE:
				return getReasonCode();
			case FhirPackage.GUIDANCE_RESPONSE__REASON_REFERENCE:
				return getReasonReference();
			case FhirPackage.GUIDANCE_RESPONSE__NOTE:
				return getNote();
			case FhirPackage.GUIDANCE_RESPONSE__EVALUATION_MESSAGE:
				return getEvaluationMessage();
			case FhirPackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS:
				return getOutputParameters();
			case FhirPackage.GUIDANCE_RESPONSE__RESULT:
				return getResult();
			case FhirPackage.GUIDANCE_RESPONSE__DATA_REQUIREMENT:
				return getDataRequirement();
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
			case FhirPackage.GUIDANCE_RESPONSE__REQUEST_IDENTIFIER:
				setRequestIdentifier((Identifier)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__MODULE_URI:
				setModuleUri((Uri)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__MODULE_CANONICAL:
				setModuleCanonical((Canonical)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__MODULE_CODEABLE_CONCEPT:
				setModuleCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__STATUS:
				setStatus((GuidanceResponseStatus)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__OCCURRENCE_DATE_TIME:
				setOccurrenceDateTime((DateTime)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__PERFORMER:
				setPerformer((Reference)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__REASON_CODE:
				getReasonCode().clear();
				getReasonCode().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__REASON_REFERENCE:
				getReasonReference().clear();
				getReasonReference().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__EVALUATION_MESSAGE:
				getEvaluationMessage().clear();
				getEvaluationMessage().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS:
				setOutputParameters((Reference)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__RESULT:
				setResult((Reference)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__DATA_REQUIREMENT:
				getDataRequirement().clear();
				getDataRequirement().addAll((Collection<? extends DataRequirement>)newValue);
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
			case FhirPackage.GUIDANCE_RESPONSE__REQUEST_IDENTIFIER:
				setRequestIdentifier((Identifier)null);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.GUIDANCE_RESPONSE__MODULE_URI:
				setModuleUri((Uri)null);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__MODULE_CANONICAL:
				setModuleCanonical((Canonical)null);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__MODULE_CODEABLE_CONCEPT:
				setModuleCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__STATUS:
				setStatus((GuidanceResponseStatus)null);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__OCCURRENCE_DATE_TIME:
				setOccurrenceDateTime((DateTime)null);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__PERFORMER:
				setPerformer((Reference)null);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__REASON_CODE:
				getReasonCode().clear();
				return;
			case FhirPackage.GUIDANCE_RESPONSE__REASON_REFERENCE:
				getReasonReference().clear();
				return;
			case FhirPackage.GUIDANCE_RESPONSE__NOTE:
				getNote().clear();
				return;
			case FhirPackage.GUIDANCE_RESPONSE__EVALUATION_MESSAGE:
				getEvaluationMessage().clear();
				return;
			case FhirPackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS:
				setOutputParameters((Reference)null);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__RESULT:
				setResult((Reference)null);
				return;
			case FhirPackage.GUIDANCE_RESPONSE__DATA_REQUIREMENT:
				getDataRequirement().clear();
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
			case FhirPackage.GUIDANCE_RESPONSE__REQUEST_IDENTIFIER:
				return requestIdentifier != null;
			case FhirPackage.GUIDANCE_RESPONSE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.GUIDANCE_RESPONSE__MODULE_URI:
				return moduleUri != null;
			case FhirPackage.GUIDANCE_RESPONSE__MODULE_CANONICAL:
				return moduleCanonical != null;
			case FhirPackage.GUIDANCE_RESPONSE__MODULE_CODEABLE_CONCEPT:
				return moduleCodeableConcept != null;
			case FhirPackage.GUIDANCE_RESPONSE__STATUS:
				return status != null;
			case FhirPackage.GUIDANCE_RESPONSE__SUBJECT:
				return subject != null;
			case FhirPackage.GUIDANCE_RESPONSE__ENCOUNTER:
				return encounter != null;
			case FhirPackage.GUIDANCE_RESPONSE__OCCURRENCE_DATE_TIME:
				return occurrenceDateTime != null;
			case FhirPackage.GUIDANCE_RESPONSE__PERFORMER:
				return performer != null;
			case FhirPackage.GUIDANCE_RESPONSE__REASON_CODE:
				return reasonCode != null && !reasonCode.isEmpty();
			case FhirPackage.GUIDANCE_RESPONSE__REASON_REFERENCE:
				return reasonReference != null && !reasonReference.isEmpty();
			case FhirPackage.GUIDANCE_RESPONSE__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.GUIDANCE_RESPONSE__EVALUATION_MESSAGE:
				return evaluationMessage != null && !evaluationMessage.isEmpty();
			case FhirPackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS:
				return outputParameters != null;
			case FhirPackage.GUIDANCE_RESPONSE__RESULT:
				return result != null;
			case FhirPackage.GUIDANCE_RESPONSE__DATA_REQUIREMENT:
				return dataRequirement != null && !dataRequirement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GuidanceResponseImpl
