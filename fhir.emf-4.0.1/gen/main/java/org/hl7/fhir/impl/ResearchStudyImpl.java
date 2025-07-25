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
import org.hl7.fhir.ContactDetail;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;
import org.hl7.fhir.RelatedArtifact;
import org.hl7.fhir.ResearchStudy;
import org.hl7.fhir.ResearchStudyArm;
import org.hl7.fhir.ResearchStudyObjective;
import org.hl7.fhir.ResearchStudyStatus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Research Study</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ResearchStudyImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchStudyImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchStudyImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchStudyImpl#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchStudyImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchStudyImpl#getPrimaryPurposeType <em>Primary Purpose Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchStudyImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchStudyImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchStudyImpl#getFocus <em>Focus</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchStudyImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchStudyImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchStudyImpl#getRelatedArtifact <em>Related Artifact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchStudyImpl#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchStudyImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchStudyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchStudyImpl#getEnrollment <em>Enrollment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchStudyImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchStudyImpl#getSponsor <em>Sponsor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchStudyImpl#getPrincipalInvestigator <em>Principal Investigator</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchStudyImpl#getSite <em>Site</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchStudyImpl#getReasonStopped <em>Reason Stopped</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchStudyImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchStudyImpl#getArm <em>Arm</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchStudyImpl#getObjective <em>Objective</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResearchStudyImpl extends DomainResourceImpl implements ResearchStudy {
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
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String title;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> protocol;

	/**
	 * The cached value of the '{@link #getPartOf() <em>Part Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> partOf;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected ResearchStudyStatus status;

	/**
	 * The cached value of the '{@link #getPrimaryPurposeType() <em>Primary Purpose Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryPurposeType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept primaryPurposeType;

	/**
	 * The cached value of the '{@link #getPhase() <em>Phase</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept phase;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> category;

	/**
	 * The cached value of the '{@link #getFocus() <em>Focus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocus()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> focus;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> condition;

	/**
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactDetail> contact;

	/**
	 * The cached value of the '{@link #getRelatedArtifact() <em>Related Artifact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedArtifact()
	 * @generated
	 * @ordered
	 */
	protected EList<RelatedArtifact> relatedArtifact;

	/**
	 * The cached value of the '{@link #getKeyword() <em>Keyword</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyword()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> keyword;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> location;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Markdown description;

	/**
	 * The cached value of the '{@link #getEnrollment() <em>Enrollment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnrollment()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> enrollment;

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
	 * The cached value of the '{@link #getSponsor() <em>Sponsor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSponsor()
	 * @generated
	 * @ordered
	 */
	protected Reference sponsor;

	/**
	 * The cached value of the '{@link #getPrincipalInvestigator() <em>Principal Investigator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrincipalInvestigator()
	 * @generated
	 * @ordered
	 */
	protected Reference principalInvestigator;

	/**
	 * The cached value of the '{@link #getSite() <em>Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSite()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> site;

	/**
	 * The cached value of the '{@link #getReasonStopped() <em>Reason Stopped</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonStopped()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept reasonStopped;

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
	 * The cached value of the '{@link #getArm() <em>Arm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArm()
	 * @generated
	 * @ordered
	 */
	protected EList<ResearchStudyArm> arm;

	/**
	 * The cached value of the '{@link #getObjective() <em>Objective</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjective()
	 * @generated
	 * @ordered
	 */
	protected EList<ResearchStudyObjective> objective;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResearchStudyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getResearchStudy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.RESEARCH_STUDY__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(org.hl7.fhir.String newTitle, NotificationChain msgs) {
		org.hl7.fhir.String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY__TITLE, oldTitle, newTitle);
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
	public void setTitle(org.hl7.fhir.String newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getProtocol() {
		if (protocol == null) {
			protocol = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.RESEARCH_STUDY__PROTOCOL);
		}
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getPartOf() {
		if (partOf == null) {
			partOf = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.RESEARCH_STUDY__PART_OF);
		}
		return partOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResearchStudyStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(ResearchStudyStatus newStatus, NotificationChain msgs) {
		ResearchStudyStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY__STATUS, oldStatus, newStatus);
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
	public void setStatus(ResearchStudyStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getPrimaryPurposeType() {
		return primaryPurposeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimaryPurposeType(CodeableConcept newPrimaryPurposeType, NotificationChain msgs) {
		CodeableConcept oldPrimaryPurposeType = primaryPurposeType;
		primaryPurposeType = newPrimaryPurposeType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY__PRIMARY_PURPOSE_TYPE, oldPrimaryPurposeType, newPrimaryPurposeType);
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
	public void setPrimaryPurposeType(CodeableConcept newPrimaryPurposeType) {
		if (newPrimaryPurposeType != primaryPurposeType) {
			NotificationChain msgs = null;
			if (primaryPurposeType != null)
				msgs = ((InternalEObject)primaryPurposeType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY__PRIMARY_PURPOSE_TYPE, null, msgs);
			if (newPrimaryPurposeType != null)
				msgs = ((InternalEObject)newPrimaryPurposeType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY__PRIMARY_PURPOSE_TYPE, null, msgs);
			msgs = basicSetPrimaryPurposeType(newPrimaryPurposeType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY__PRIMARY_PURPOSE_TYPE, newPrimaryPurposeType, newPrimaryPurposeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getPhase() {
		return phase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhase(CodeableConcept newPhase, NotificationChain msgs) {
		CodeableConcept oldPhase = phase;
		phase = newPhase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY__PHASE, oldPhase, newPhase);
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
	public void setPhase(CodeableConcept newPhase) {
		if (newPhase != phase) {
			NotificationChain msgs = null;
			if (phase != null)
				msgs = ((InternalEObject)phase).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY__PHASE, null, msgs);
			if (newPhase != null)
				msgs = ((InternalEObject)newPhase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY__PHASE, null, msgs);
			msgs = basicSetPhase(newPhase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY__PHASE, newPhase, newPhase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.RESEARCH_STUDY__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getFocus() {
		if (focus == null) {
			focus = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.RESEARCH_STUDY__FOCUS);
		}
		return focus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCondition() {
		if (condition == null) {
			condition = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.RESEARCH_STUDY__CONDITION);
		}
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactDetail> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FhirPackage.RESEARCH_STUDY__CONTACT);
		}
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedArtifact> getRelatedArtifact() {
		if (relatedArtifact == null) {
			relatedArtifact = new EObjectContainmentEList<RelatedArtifact>(RelatedArtifact.class, this, FhirPackage.RESEARCH_STUDY__RELATED_ARTIFACT);
		}
		return relatedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getKeyword() {
		if (keyword == null) {
			keyword = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.RESEARCH_STUDY__KEYWORD);
		}
		return keyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getLocation() {
		if (location == null) {
			location = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.RESEARCH_STUDY__LOCATION);
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(Markdown newDescription, NotificationChain msgs) {
		Markdown oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(Markdown newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getEnrollment() {
		if (enrollment == null) {
			enrollment = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.RESEARCH_STUDY__ENROLLMENT);
		}
		return enrollment;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY__PERIOD, oldPeriod, newPeriod);
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
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getSponsor() {
		return sponsor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSponsor(Reference newSponsor, NotificationChain msgs) {
		Reference oldSponsor = sponsor;
		sponsor = newSponsor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY__SPONSOR, oldSponsor, newSponsor);
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
	public void setSponsor(Reference newSponsor) {
		if (newSponsor != sponsor) {
			NotificationChain msgs = null;
			if (sponsor != null)
				msgs = ((InternalEObject)sponsor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY__SPONSOR, null, msgs);
			if (newSponsor != null)
				msgs = ((InternalEObject)newSponsor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY__SPONSOR, null, msgs);
			msgs = basicSetSponsor(newSponsor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY__SPONSOR, newSponsor, newSponsor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getPrincipalInvestigator() {
		return principalInvestigator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrincipalInvestigator(Reference newPrincipalInvestigator, NotificationChain msgs) {
		Reference oldPrincipalInvestigator = principalInvestigator;
		principalInvestigator = newPrincipalInvestigator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY__PRINCIPAL_INVESTIGATOR, oldPrincipalInvestigator, newPrincipalInvestigator);
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
	public void setPrincipalInvestigator(Reference newPrincipalInvestigator) {
		if (newPrincipalInvestigator != principalInvestigator) {
			NotificationChain msgs = null;
			if (principalInvestigator != null)
				msgs = ((InternalEObject)principalInvestigator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY__PRINCIPAL_INVESTIGATOR, null, msgs);
			if (newPrincipalInvestigator != null)
				msgs = ((InternalEObject)newPrincipalInvestigator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY__PRINCIPAL_INVESTIGATOR, null, msgs);
			msgs = basicSetPrincipalInvestigator(newPrincipalInvestigator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY__PRINCIPAL_INVESTIGATOR, newPrincipalInvestigator, newPrincipalInvestigator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSite() {
		if (site == null) {
			site = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.RESEARCH_STUDY__SITE);
		}
		return site;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getReasonStopped() {
		return reasonStopped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReasonStopped(CodeableConcept newReasonStopped, NotificationChain msgs) {
		CodeableConcept oldReasonStopped = reasonStopped;
		reasonStopped = newReasonStopped;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY__REASON_STOPPED, oldReasonStopped, newReasonStopped);
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
	public void setReasonStopped(CodeableConcept newReasonStopped) {
		if (newReasonStopped != reasonStopped) {
			NotificationChain msgs = null;
			if (reasonStopped != null)
				msgs = ((InternalEObject)reasonStopped).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY__REASON_STOPPED, null, msgs);
			if (newReasonStopped != null)
				msgs = ((InternalEObject)newReasonStopped).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_STUDY__REASON_STOPPED, null, msgs);
			msgs = basicSetReasonStopped(newReasonStopped, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_STUDY__REASON_STOPPED, newReasonStopped, newReasonStopped));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.RESEARCH_STUDY__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResearchStudyArm> getArm() {
		if (arm == null) {
			arm = new EObjectContainmentEList<ResearchStudyArm>(ResearchStudyArm.class, this, FhirPackage.RESEARCH_STUDY__ARM);
		}
		return arm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResearchStudyObjective> getObjective() {
		if (objective == null) {
			objective = new EObjectContainmentEList<ResearchStudyObjective>(ResearchStudyObjective.class, this, FhirPackage.RESEARCH_STUDY__OBJECTIVE);
		}
		return objective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.RESEARCH_STUDY__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.RESEARCH_STUDY__TITLE:
				return basicSetTitle(null, msgs);
			case FhirPackage.RESEARCH_STUDY__PROTOCOL:
				return ((InternalEList<?>)getProtocol()).basicRemove(otherEnd, msgs);
			case FhirPackage.RESEARCH_STUDY__PART_OF:
				return ((InternalEList<?>)getPartOf()).basicRemove(otherEnd, msgs);
			case FhirPackage.RESEARCH_STUDY__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.RESEARCH_STUDY__PRIMARY_PURPOSE_TYPE:
				return basicSetPrimaryPurposeType(null, msgs);
			case FhirPackage.RESEARCH_STUDY__PHASE:
				return basicSetPhase(null, msgs);
			case FhirPackage.RESEARCH_STUDY__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case FhirPackage.RESEARCH_STUDY__FOCUS:
				return ((InternalEList<?>)getFocus()).basicRemove(otherEnd, msgs);
			case FhirPackage.RESEARCH_STUDY__CONDITION:
				return ((InternalEList<?>)getCondition()).basicRemove(otherEnd, msgs);
			case FhirPackage.RESEARCH_STUDY__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case FhirPackage.RESEARCH_STUDY__RELATED_ARTIFACT:
				return ((InternalEList<?>)getRelatedArtifact()).basicRemove(otherEnd, msgs);
			case FhirPackage.RESEARCH_STUDY__KEYWORD:
				return ((InternalEList<?>)getKeyword()).basicRemove(otherEnd, msgs);
			case FhirPackage.RESEARCH_STUDY__LOCATION:
				return ((InternalEList<?>)getLocation()).basicRemove(otherEnd, msgs);
			case FhirPackage.RESEARCH_STUDY__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.RESEARCH_STUDY__ENROLLMENT:
				return ((InternalEList<?>)getEnrollment()).basicRemove(otherEnd, msgs);
			case FhirPackage.RESEARCH_STUDY__PERIOD:
				return basicSetPeriod(null, msgs);
			case FhirPackage.RESEARCH_STUDY__SPONSOR:
				return basicSetSponsor(null, msgs);
			case FhirPackage.RESEARCH_STUDY__PRINCIPAL_INVESTIGATOR:
				return basicSetPrincipalInvestigator(null, msgs);
			case FhirPackage.RESEARCH_STUDY__SITE:
				return ((InternalEList<?>)getSite()).basicRemove(otherEnd, msgs);
			case FhirPackage.RESEARCH_STUDY__REASON_STOPPED:
				return basicSetReasonStopped(null, msgs);
			case FhirPackage.RESEARCH_STUDY__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.RESEARCH_STUDY__ARM:
				return ((InternalEList<?>)getArm()).basicRemove(otherEnd, msgs);
			case FhirPackage.RESEARCH_STUDY__OBJECTIVE:
				return ((InternalEList<?>)getObjective()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.RESEARCH_STUDY__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.RESEARCH_STUDY__TITLE:
				return getTitle();
			case FhirPackage.RESEARCH_STUDY__PROTOCOL:
				return getProtocol();
			case FhirPackage.RESEARCH_STUDY__PART_OF:
				return getPartOf();
			case FhirPackage.RESEARCH_STUDY__STATUS:
				return getStatus();
			case FhirPackage.RESEARCH_STUDY__PRIMARY_PURPOSE_TYPE:
				return getPrimaryPurposeType();
			case FhirPackage.RESEARCH_STUDY__PHASE:
				return getPhase();
			case FhirPackage.RESEARCH_STUDY__CATEGORY:
				return getCategory();
			case FhirPackage.RESEARCH_STUDY__FOCUS:
				return getFocus();
			case FhirPackage.RESEARCH_STUDY__CONDITION:
				return getCondition();
			case FhirPackage.RESEARCH_STUDY__CONTACT:
				return getContact();
			case FhirPackage.RESEARCH_STUDY__RELATED_ARTIFACT:
				return getRelatedArtifact();
			case FhirPackage.RESEARCH_STUDY__KEYWORD:
				return getKeyword();
			case FhirPackage.RESEARCH_STUDY__LOCATION:
				return getLocation();
			case FhirPackage.RESEARCH_STUDY__DESCRIPTION:
				return getDescription();
			case FhirPackage.RESEARCH_STUDY__ENROLLMENT:
				return getEnrollment();
			case FhirPackage.RESEARCH_STUDY__PERIOD:
				return getPeriod();
			case FhirPackage.RESEARCH_STUDY__SPONSOR:
				return getSponsor();
			case FhirPackage.RESEARCH_STUDY__PRINCIPAL_INVESTIGATOR:
				return getPrincipalInvestigator();
			case FhirPackage.RESEARCH_STUDY__SITE:
				return getSite();
			case FhirPackage.RESEARCH_STUDY__REASON_STOPPED:
				return getReasonStopped();
			case FhirPackage.RESEARCH_STUDY__NOTE:
				return getNote();
			case FhirPackage.RESEARCH_STUDY__ARM:
				return getArm();
			case FhirPackage.RESEARCH_STUDY__OBJECTIVE:
				return getObjective();
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
			case FhirPackage.RESEARCH_STUDY__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__TITLE:
				setTitle((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__PROTOCOL:
				getProtocol().clear();
				getProtocol().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__PART_OF:
				getPartOf().clear();
				getPartOf().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__STATUS:
				setStatus((ResearchStudyStatus)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__PRIMARY_PURPOSE_TYPE:
				setPrimaryPurposeType((CodeableConcept)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__PHASE:
				setPhase((CodeableConcept)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__FOCUS:
				getFocus().clear();
				getFocus().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__CONDITION:
				getCondition().clear();
				getCondition().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__RELATED_ARTIFACT:
				getRelatedArtifact().clear();
				getRelatedArtifact().addAll((Collection<? extends RelatedArtifact>)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__KEYWORD:
				getKeyword().clear();
				getKeyword().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__LOCATION:
				getLocation().clear();
				getLocation().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__ENROLLMENT:
				getEnrollment().clear();
				getEnrollment().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__PERIOD:
				setPeriod((Period)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__SPONSOR:
				setSponsor((Reference)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__PRINCIPAL_INVESTIGATOR:
				setPrincipalInvestigator((Reference)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__SITE:
				getSite().clear();
				getSite().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__REASON_STOPPED:
				setReasonStopped((CodeableConcept)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__ARM:
				getArm().clear();
				getArm().addAll((Collection<? extends ResearchStudyArm>)newValue);
				return;
			case FhirPackage.RESEARCH_STUDY__OBJECTIVE:
				getObjective().clear();
				getObjective().addAll((Collection<? extends ResearchStudyObjective>)newValue);
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
			case FhirPackage.RESEARCH_STUDY__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.RESEARCH_STUDY__TITLE:
				setTitle((org.hl7.fhir.String)null);
				return;
			case FhirPackage.RESEARCH_STUDY__PROTOCOL:
				getProtocol().clear();
				return;
			case FhirPackage.RESEARCH_STUDY__PART_OF:
				getPartOf().clear();
				return;
			case FhirPackage.RESEARCH_STUDY__STATUS:
				setStatus((ResearchStudyStatus)null);
				return;
			case FhirPackage.RESEARCH_STUDY__PRIMARY_PURPOSE_TYPE:
				setPrimaryPurposeType((CodeableConcept)null);
				return;
			case FhirPackage.RESEARCH_STUDY__PHASE:
				setPhase((CodeableConcept)null);
				return;
			case FhirPackage.RESEARCH_STUDY__CATEGORY:
				getCategory().clear();
				return;
			case FhirPackage.RESEARCH_STUDY__FOCUS:
				getFocus().clear();
				return;
			case FhirPackage.RESEARCH_STUDY__CONDITION:
				getCondition().clear();
				return;
			case FhirPackage.RESEARCH_STUDY__CONTACT:
				getContact().clear();
				return;
			case FhirPackage.RESEARCH_STUDY__RELATED_ARTIFACT:
				getRelatedArtifact().clear();
				return;
			case FhirPackage.RESEARCH_STUDY__KEYWORD:
				getKeyword().clear();
				return;
			case FhirPackage.RESEARCH_STUDY__LOCATION:
				getLocation().clear();
				return;
			case FhirPackage.RESEARCH_STUDY__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.RESEARCH_STUDY__ENROLLMENT:
				getEnrollment().clear();
				return;
			case FhirPackage.RESEARCH_STUDY__PERIOD:
				setPeriod((Period)null);
				return;
			case FhirPackage.RESEARCH_STUDY__SPONSOR:
				setSponsor((Reference)null);
				return;
			case FhirPackage.RESEARCH_STUDY__PRINCIPAL_INVESTIGATOR:
				setPrincipalInvestigator((Reference)null);
				return;
			case FhirPackage.RESEARCH_STUDY__SITE:
				getSite().clear();
				return;
			case FhirPackage.RESEARCH_STUDY__REASON_STOPPED:
				setReasonStopped((CodeableConcept)null);
				return;
			case FhirPackage.RESEARCH_STUDY__NOTE:
				getNote().clear();
				return;
			case FhirPackage.RESEARCH_STUDY__ARM:
				getArm().clear();
				return;
			case FhirPackage.RESEARCH_STUDY__OBJECTIVE:
				getObjective().clear();
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
			case FhirPackage.RESEARCH_STUDY__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.RESEARCH_STUDY__TITLE:
				return title != null;
			case FhirPackage.RESEARCH_STUDY__PROTOCOL:
				return protocol != null && !protocol.isEmpty();
			case FhirPackage.RESEARCH_STUDY__PART_OF:
				return partOf != null && !partOf.isEmpty();
			case FhirPackage.RESEARCH_STUDY__STATUS:
				return status != null;
			case FhirPackage.RESEARCH_STUDY__PRIMARY_PURPOSE_TYPE:
				return primaryPurposeType != null;
			case FhirPackage.RESEARCH_STUDY__PHASE:
				return phase != null;
			case FhirPackage.RESEARCH_STUDY__CATEGORY:
				return category != null && !category.isEmpty();
			case FhirPackage.RESEARCH_STUDY__FOCUS:
				return focus != null && !focus.isEmpty();
			case FhirPackage.RESEARCH_STUDY__CONDITION:
				return condition != null && !condition.isEmpty();
			case FhirPackage.RESEARCH_STUDY__CONTACT:
				return contact != null && !contact.isEmpty();
			case FhirPackage.RESEARCH_STUDY__RELATED_ARTIFACT:
				return relatedArtifact != null && !relatedArtifact.isEmpty();
			case FhirPackage.RESEARCH_STUDY__KEYWORD:
				return keyword != null && !keyword.isEmpty();
			case FhirPackage.RESEARCH_STUDY__LOCATION:
				return location != null && !location.isEmpty();
			case FhirPackage.RESEARCH_STUDY__DESCRIPTION:
				return description != null;
			case FhirPackage.RESEARCH_STUDY__ENROLLMENT:
				return enrollment != null && !enrollment.isEmpty();
			case FhirPackage.RESEARCH_STUDY__PERIOD:
				return period != null;
			case FhirPackage.RESEARCH_STUDY__SPONSOR:
				return sponsor != null;
			case FhirPackage.RESEARCH_STUDY__PRINCIPAL_INVESTIGATOR:
				return principalInvestigator != null;
			case FhirPackage.RESEARCH_STUDY__SITE:
				return site != null && !site.isEmpty();
			case FhirPackage.RESEARCH_STUDY__REASON_STOPPED:
				return reasonStopped != null;
			case FhirPackage.RESEARCH_STUDY__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.RESEARCH_STUDY__ARM:
				return arm != null && !arm.isEmpty();
			case FhirPackage.RESEARCH_STUDY__OBJECTIVE:
				return objective != null && !objective.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResearchStudyImpl
