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
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.EffectEvidenceSynthesis;
import org.hl7.fhir.EffectEvidenceSynthesisCertainty;
import org.hl7.fhir.EffectEvidenceSynthesisEffectEstimate;
import org.hl7.fhir.EffectEvidenceSynthesisResultsByExposure;
import org.hl7.fhir.EffectEvidenceSynthesisSampleSize;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.Period;
import org.hl7.fhir.PublicationStatus;
import org.hl7.fhir.Reference;
import org.hl7.fhir.RelatedArtifact;
import org.hl7.fhir.Uri;
import org.hl7.fhir.UsageContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Effect Evidence Synthesis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.EffectEvidenceSynthesisImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EffectEvidenceSynthesisImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EffectEvidenceSynthesisImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EffectEvidenceSynthesisImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EffectEvidenceSynthesisImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EffectEvidenceSynthesisImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EffectEvidenceSynthesisImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EffectEvidenceSynthesisImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EffectEvidenceSynthesisImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EffectEvidenceSynthesisImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EffectEvidenceSynthesisImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EffectEvidenceSynthesisImpl#getUseContext <em>Use Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EffectEvidenceSynthesisImpl#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EffectEvidenceSynthesisImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EffectEvidenceSynthesisImpl#getApprovalDate <em>Approval Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EffectEvidenceSynthesisImpl#getLastReviewDate <em>Last Review Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EffectEvidenceSynthesisImpl#getEffectivePeriod <em>Effective Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EffectEvidenceSynthesisImpl#getTopic <em>Topic</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EffectEvidenceSynthesisImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EffectEvidenceSynthesisImpl#getEditor <em>Editor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EffectEvidenceSynthesisImpl#getReviewer <em>Reviewer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EffectEvidenceSynthesisImpl#getEndorser <em>Endorser</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EffectEvidenceSynthesisImpl#getRelatedArtifact <em>Related Artifact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EffectEvidenceSynthesisImpl#getSynthesisType <em>Synthesis Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EffectEvidenceSynthesisImpl#getStudyType <em>Study Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EffectEvidenceSynthesisImpl#getPopulation <em>Population</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EffectEvidenceSynthesisImpl#getExposure <em>Exposure</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EffectEvidenceSynthesisImpl#getExposureAlternative <em>Exposure Alternative</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EffectEvidenceSynthesisImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EffectEvidenceSynthesisImpl#getSampleSize <em>Sample Size</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EffectEvidenceSynthesisImpl#getResultsByExposure <em>Results By Exposure</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EffectEvidenceSynthesisImpl#getEffectEstimate <em>Effect Estimate</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EffectEvidenceSynthesisImpl#getCertainty <em>Certainty</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EffectEvidenceSynthesisImpl extends DomainResourceImpl implements EffectEvidenceSynthesis {
	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected Uri url;

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
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String version;

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
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String title;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected PublicationStatus status;

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
	 * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String publisher;

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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Markdown description;

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
	 * The cached value of the '{@link #getUseContext() <em>Use Context</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseContext()
	 * @generated
	 * @ordered
	 */
	protected EList<UsageContext> useContext;

	/**
	 * The cached value of the '{@link #getJurisdiction() <em>Jurisdiction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJurisdiction()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> jurisdiction;

	/**
	 * The cached value of the '{@link #getCopyright() <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected Markdown copyright;

	/**
	 * The cached value of the '{@link #getApprovalDate() <em>Approval Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalDate()
	 * @generated
	 * @ordered
	 */
	protected Date approvalDate;

	/**
	 * The cached value of the '{@link #getLastReviewDate() <em>Last Review Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastReviewDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastReviewDate;

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
	 * The cached value of the '{@link #getTopic() <em>Topic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> topic;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactDetail> author;

	/**
	 * The cached value of the '{@link #getEditor() <em>Editor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditor()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactDetail> editor;

	/**
	 * The cached value of the '{@link #getReviewer() <em>Reviewer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewer()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactDetail> reviewer;

	/**
	 * The cached value of the '{@link #getEndorser() <em>Endorser</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndorser()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactDetail> endorser;

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
	 * The cached value of the '{@link #getSynthesisType() <em>Synthesis Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynthesisType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept synthesisType;

	/**
	 * The cached value of the '{@link #getStudyType() <em>Study Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept studyType;

	/**
	 * The cached value of the '{@link #getPopulation() <em>Population</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulation()
	 * @generated
	 * @ordered
	 */
	protected Reference population;

	/**
	 * The cached value of the '{@link #getExposure() <em>Exposure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposure()
	 * @generated
	 * @ordered
	 */
	protected Reference exposure;

	/**
	 * The cached value of the '{@link #getExposureAlternative() <em>Exposure Alternative</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposureAlternative()
	 * @generated
	 * @ordered
	 */
	protected Reference exposureAlternative;

	/**
	 * The cached value of the '{@link #getOutcome() <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcome()
	 * @generated
	 * @ordered
	 */
	protected Reference outcome;

	/**
	 * The cached value of the '{@link #getSampleSize() <em>Sample Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleSize()
	 * @generated
	 * @ordered
	 */
	protected EffectEvidenceSynthesisSampleSize sampleSize;

	/**
	 * The cached value of the '{@link #getResultsByExposure() <em>Results By Exposure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsByExposure()
	 * @generated
	 * @ordered
	 */
	protected EList<EffectEvidenceSynthesisResultsByExposure> resultsByExposure;

	/**
	 * The cached value of the '{@link #getEffectEstimate() <em>Effect Estimate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectEstimate()
	 * @generated
	 * @ordered
	 */
	protected EList<EffectEvidenceSynthesisEffectEstimate> effectEstimate;

	/**
	 * The cached value of the '{@link #getCertainty() <em>Certainty</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertainty()
	 * @generated
	 * @ordered
	 */
	protected EList<EffectEvidenceSynthesisCertainty> certainty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EffectEvidenceSynthesisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getEffectEvidenceSynthesis();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrl(Uri newUrl, NotificationChain msgs) {
		Uri oldUrl = url;
		url = newUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__URL, oldUrl, newUrl);
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
	public void setUrl(Uri newUrl) {
		if (newUrl != url) {
			NotificationChain msgs = null;
			if (url != null)
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(org.hl7.fhir.String newVersion, NotificationChain msgs) {
		org.hl7.fhir.String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__VERSION, oldVersion, newVersion);
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
	public void setVersion(org.hl7.fhir.String newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__VERSION, newVersion, newVersion));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__NAME, newName, newName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__TITLE, oldTitle, newTitle);
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
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicationStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(PublicationStatus newStatus, NotificationChain msgs) {
		PublicationStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__STATUS, oldStatus, newStatus);
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
	public void setStatus(PublicationStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getPublisher() {
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublisher(org.hl7.fhir.String newPublisher, NotificationChain msgs) {
		org.hl7.fhir.String oldPublisher = publisher;
		publisher = newPublisher;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__PUBLISHER, oldPublisher, newPublisher);
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
	public void setPublisher(org.hl7.fhir.String newPublisher) {
		if (newPublisher != publisher) {
			NotificationChain msgs = null;
			if (publisher != null)
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactDetail> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__CONTACT);
		}
		return contact;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UsageContext> getUseContext() {
		if (useContext == null) {
			useContext = new EObjectContainmentEList<UsageContext>(UsageContext.class, this, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__USE_CONTEXT);
		}
		return useContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getJurisdiction() {
		if (jurisdiction == null) {
			jurisdiction = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__JURISDICTION);
		}
		return jurisdiction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getCopyright() {
		return copyright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCopyright(Markdown newCopyright, NotificationChain msgs) {
		Markdown oldCopyright = copyright;
		copyright = newCopyright;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__COPYRIGHT, oldCopyright, newCopyright);
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
	public void setCopyright(Markdown newCopyright) {
		if (newCopyright != copyright) {
			NotificationChain msgs = null;
			if (copyright != null)
				msgs = ((InternalEObject)copyright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__COPYRIGHT, null, msgs);
			if (newCopyright != null)
				msgs = ((InternalEObject)newCopyright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__COPYRIGHT, null, msgs);
			msgs = basicSetCopyright(newCopyright, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__COPYRIGHT, newCopyright, newCopyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getApprovalDate() {
		return approvalDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApprovalDate(Date newApprovalDate, NotificationChain msgs) {
		Date oldApprovalDate = approvalDate;
		approvalDate = newApprovalDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__APPROVAL_DATE, oldApprovalDate, newApprovalDate);
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
	public void setApprovalDate(Date newApprovalDate) {
		if (newApprovalDate != approvalDate) {
			NotificationChain msgs = null;
			if (approvalDate != null)
				msgs = ((InternalEObject)approvalDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__APPROVAL_DATE, null, msgs);
			if (newApprovalDate != null)
				msgs = ((InternalEObject)newApprovalDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__APPROVAL_DATE, null, msgs);
			msgs = basicSetApprovalDate(newApprovalDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__APPROVAL_DATE, newApprovalDate, newApprovalDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastReviewDate() {
		return lastReviewDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastReviewDate(Date newLastReviewDate, NotificationChain msgs) {
		Date oldLastReviewDate = lastReviewDate;
		lastReviewDate = newLastReviewDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__LAST_REVIEW_DATE, oldLastReviewDate, newLastReviewDate);
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
	public void setLastReviewDate(Date newLastReviewDate) {
		if (newLastReviewDate != lastReviewDate) {
			NotificationChain msgs = null;
			if (lastReviewDate != null)
				msgs = ((InternalEObject)lastReviewDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__LAST_REVIEW_DATE, null, msgs);
			if (newLastReviewDate != null)
				msgs = ((InternalEObject)newLastReviewDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__LAST_REVIEW_DATE, null, msgs);
			msgs = basicSetLastReviewDate(newLastReviewDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__LAST_REVIEW_DATE, newLastReviewDate, newLastReviewDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__EFFECTIVE_PERIOD, oldEffectivePeriod, newEffectivePeriod);
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
				msgs = ((InternalEObject)effectivePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__EFFECTIVE_PERIOD, null, msgs);
			if (newEffectivePeriod != null)
				msgs = ((InternalEObject)newEffectivePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__EFFECTIVE_PERIOD, null, msgs);
			msgs = basicSetEffectivePeriod(newEffectivePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__EFFECTIVE_PERIOD, newEffectivePeriod, newEffectivePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getTopic() {
		if (topic == null) {
			topic = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__TOPIC);
		}
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactDetail> getAuthor() {
		if (author == null) {
			author = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__AUTHOR);
		}
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactDetail> getEditor() {
		if (editor == null) {
			editor = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__EDITOR);
		}
		return editor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactDetail> getReviewer() {
		if (reviewer == null) {
			reviewer = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__REVIEWER);
		}
		return reviewer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactDetail> getEndorser() {
		if (endorser == null) {
			endorser = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__ENDORSER);
		}
		return endorser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedArtifact> getRelatedArtifact() {
		if (relatedArtifact == null) {
			relatedArtifact = new EObjectContainmentEList<RelatedArtifact>(RelatedArtifact.class, this, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__RELATED_ARTIFACT);
		}
		return relatedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getSynthesisType() {
		return synthesisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSynthesisType(CodeableConcept newSynthesisType, NotificationChain msgs) {
		CodeableConcept oldSynthesisType = synthesisType;
		synthesisType = newSynthesisType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__SYNTHESIS_TYPE, oldSynthesisType, newSynthesisType);
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
	public void setSynthesisType(CodeableConcept newSynthesisType) {
		if (newSynthesisType != synthesisType) {
			NotificationChain msgs = null;
			if (synthesisType != null)
				msgs = ((InternalEObject)synthesisType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__SYNTHESIS_TYPE, null, msgs);
			if (newSynthesisType != null)
				msgs = ((InternalEObject)newSynthesisType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__SYNTHESIS_TYPE, null, msgs);
			msgs = basicSetSynthesisType(newSynthesisType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__SYNTHESIS_TYPE, newSynthesisType, newSynthesisType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getStudyType() {
		return studyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudyType(CodeableConcept newStudyType, NotificationChain msgs) {
		CodeableConcept oldStudyType = studyType;
		studyType = newStudyType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__STUDY_TYPE, oldStudyType, newStudyType);
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
	public void setStudyType(CodeableConcept newStudyType) {
		if (newStudyType != studyType) {
			NotificationChain msgs = null;
			if (studyType != null)
				msgs = ((InternalEObject)studyType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__STUDY_TYPE, null, msgs);
			if (newStudyType != null)
				msgs = ((InternalEObject)newStudyType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__STUDY_TYPE, null, msgs);
			msgs = basicSetStudyType(newStudyType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__STUDY_TYPE, newStudyType, newStudyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getPopulation() {
		return population;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPopulation(Reference newPopulation, NotificationChain msgs) {
		Reference oldPopulation = population;
		population = newPopulation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__POPULATION, oldPopulation, newPopulation);
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
	public void setPopulation(Reference newPopulation) {
		if (newPopulation != population) {
			NotificationChain msgs = null;
			if (population != null)
				msgs = ((InternalEObject)population).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__POPULATION, null, msgs);
			if (newPopulation != null)
				msgs = ((InternalEObject)newPopulation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__POPULATION, null, msgs);
			msgs = basicSetPopulation(newPopulation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__POPULATION, newPopulation, newPopulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getExposure() {
		return exposure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExposure(Reference newExposure, NotificationChain msgs) {
		Reference oldExposure = exposure;
		exposure = newExposure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__EXPOSURE, oldExposure, newExposure);
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
	public void setExposure(Reference newExposure) {
		if (newExposure != exposure) {
			NotificationChain msgs = null;
			if (exposure != null)
				msgs = ((InternalEObject)exposure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__EXPOSURE, null, msgs);
			if (newExposure != null)
				msgs = ((InternalEObject)newExposure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__EXPOSURE, null, msgs);
			msgs = basicSetExposure(newExposure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__EXPOSURE, newExposure, newExposure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getExposureAlternative() {
		return exposureAlternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExposureAlternative(Reference newExposureAlternative, NotificationChain msgs) {
		Reference oldExposureAlternative = exposureAlternative;
		exposureAlternative = newExposureAlternative;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__EXPOSURE_ALTERNATIVE, oldExposureAlternative, newExposureAlternative);
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
	public void setExposureAlternative(Reference newExposureAlternative) {
		if (newExposureAlternative != exposureAlternative) {
			NotificationChain msgs = null;
			if (exposureAlternative != null)
				msgs = ((InternalEObject)exposureAlternative).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__EXPOSURE_ALTERNATIVE, null, msgs);
			if (newExposureAlternative != null)
				msgs = ((InternalEObject)newExposureAlternative).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__EXPOSURE_ALTERNATIVE, null, msgs);
			msgs = basicSetExposureAlternative(newExposureAlternative, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__EXPOSURE_ALTERNATIVE, newExposureAlternative, newExposureAlternative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getOutcome() {
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutcome(Reference newOutcome, NotificationChain msgs) {
		Reference oldOutcome = outcome;
		outcome = newOutcome;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__OUTCOME, oldOutcome, newOutcome);
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
	public void setOutcome(Reference newOutcome) {
		if (newOutcome != outcome) {
			NotificationChain msgs = null;
			if (outcome != null)
				msgs = ((InternalEObject)outcome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__OUTCOME, null, msgs);
			if (newOutcome != null)
				msgs = ((InternalEObject)newOutcome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__OUTCOME, null, msgs);
			msgs = basicSetOutcome(newOutcome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__OUTCOME, newOutcome, newOutcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EffectEvidenceSynthesisSampleSize getSampleSize() {
		return sampleSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSampleSize(EffectEvidenceSynthesisSampleSize newSampleSize, NotificationChain msgs) {
		EffectEvidenceSynthesisSampleSize oldSampleSize = sampleSize;
		sampleSize = newSampleSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__SAMPLE_SIZE, oldSampleSize, newSampleSize);
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
	public void setSampleSize(EffectEvidenceSynthesisSampleSize newSampleSize) {
		if (newSampleSize != sampleSize) {
			NotificationChain msgs = null;
			if (sampleSize != null)
				msgs = ((InternalEObject)sampleSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__SAMPLE_SIZE, null, msgs);
			if (newSampleSize != null)
				msgs = ((InternalEObject)newSampleSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__SAMPLE_SIZE, null, msgs);
			msgs = basicSetSampleSize(newSampleSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__SAMPLE_SIZE, newSampleSize, newSampleSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EffectEvidenceSynthesisResultsByExposure> getResultsByExposure() {
		if (resultsByExposure == null) {
			resultsByExposure = new EObjectContainmentEList<EffectEvidenceSynthesisResultsByExposure>(EffectEvidenceSynthesisResultsByExposure.class, this, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__RESULTS_BY_EXPOSURE);
		}
		return resultsByExposure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EffectEvidenceSynthesisEffectEstimate> getEffectEstimate() {
		if (effectEstimate == null) {
			effectEstimate = new EObjectContainmentEList<EffectEvidenceSynthesisEffectEstimate>(EffectEvidenceSynthesisEffectEstimate.class, this, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__EFFECT_ESTIMATE);
		}
		return effectEstimate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EffectEvidenceSynthesisCertainty> getCertainty() {
		if (certainty == null) {
			certainty = new EObjectContainmentEList<EffectEvidenceSynthesisCertainty>(EffectEvidenceSynthesisCertainty.class, this, FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__CERTAINTY);
		}
		return certainty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__URL:
				return basicSetUrl(null, msgs);
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__VERSION:
				return basicSetVersion(null, msgs);
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__TITLE:
				return basicSetTitle(null, msgs);
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__USE_CONTEXT:
				return ((InternalEList<?>)getUseContext()).basicRemove(otherEnd, msgs);
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__JURISDICTION:
				return ((InternalEList<?>)getJurisdiction()).basicRemove(otherEnd, msgs);
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__COPYRIGHT:
				return basicSetCopyright(null, msgs);
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__APPROVAL_DATE:
				return basicSetApprovalDate(null, msgs);
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__LAST_REVIEW_DATE:
				return basicSetLastReviewDate(null, msgs);
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__EFFECTIVE_PERIOD:
				return basicSetEffectivePeriod(null, msgs);
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__TOPIC:
				return ((InternalEList<?>)getTopic()).basicRemove(otherEnd, msgs);
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__AUTHOR:
				return ((InternalEList<?>)getAuthor()).basicRemove(otherEnd, msgs);
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__EDITOR:
				return ((InternalEList<?>)getEditor()).basicRemove(otherEnd, msgs);
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__REVIEWER:
				return ((InternalEList<?>)getReviewer()).basicRemove(otherEnd, msgs);
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__ENDORSER:
				return ((InternalEList<?>)getEndorser()).basicRemove(otherEnd, msgs);
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__RELATED_ARTIFACT:
				return ((InternalEList<?>)getRelatedArtifact()).basicRemove(otherEnd, msgs);
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__SYNTHESIS_TYPE:
				return basicSetSynthesisType(null, msgs);
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__STUDY_TYPE:
				return basicSetStudyType(null, msgs);
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__POPULATION:
				return basicSetPopulation(null, msgs);
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__EXPOSURE:
				return basicSetExposure(null, msgs);
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__EXPOSURE_ALTERNATIVE:
				return basicSetExposureAlternative(null, msgs);
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__OUTCOME:
				return basicSetOutcome(null, msgs);
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__SAMPLE_SIZE:
				return basicSetSampleSize(null, msgs);
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__RESULTS_BY_EXPOSURE:
				return ((InternalEList<?>)getResultsByExposure()).basicRemove(otherEnd, msgs);
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__EFFECT_ESTIMATE:
				return ((InternalEList<?>)getEffectEstimate()).basicRemove(otherEnd, msgs);
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__CERTAINTY:
				return ((InternalEList<?>)getCertainty()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__URL:
				return getUrl();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__VERSION:
				return getVersion();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__NAME:
				return getName();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__TITLE:
				return getTitle();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__STATUS:
				return getStatus();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__DATE:
				return getDate();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__PUBLISHER:
				return getPublisher();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__CONTACT:
				return getContact();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__DESCRIPTION:
				return getDescription();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__NOTE:
				return getNote();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__USE_CONTEXT:
				return getUseContext();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__JURISDICTION:
				return getJurisdiction();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__COPYRIGHT:
				return getCopyright();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__APPROVAL_DATE:
				return getApprovalDate();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__LAST_REVIEW_DATE:
				return getLastReviewDate();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__EFFECTIVE_PERIOD:
				return getEffectivePeriod();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__TOPIC:
				return getTopic();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__AUTHOR:
				return getAuthor();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__EDITOR:
				return getEditor();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__REVIEWER:
				return getReviewer();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__ENDORSER:
				return getEndorser();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__RELATED_ARTIFACT:
				return getRelatedArtifact();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__SYNTHESIS_TYPE:
				return getSynthesisType();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__STUDY_TYPE:
				return getStudyType();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__POPULATION:
				return getPopulation();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__EXPOSURE:
				return getExposure();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__EXPOSURE_ALTERNATIVE:
				return getExposureAlternative();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__OUTCOME:
				return getOutcome();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__SAMPLE_SIZE:
				return getSampleSize();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__RESULTS_BY_EXPOSURE:
				return getResultsByExposure();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__EFFECT_ESTIMATE:
				return getEffectEstimate();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__CERTAINTY:
				return getCertainty();
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
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__URL:
				setUrl((Uri)newValue);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__VERSION:
				setVersion((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__TITLE:
				setTitle((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__STATUS:
				setStatus((PublicationStatus)newValue);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__PUBLISHER:
				setPublisher((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__USE_CONTEXT:
				getUseContext().clear();
				getUseContext().addAll((Collection<? extends UsageContext>)newValue);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__JURISDICTION:
				getJurisdiction().clear();
				getJurisdiction().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__COPYRIGHT:
				setCopyright((Markdown)newValue);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__APPROVAL_DATE:
				setApprovalDate((Date)newValue);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__LAST_REVIEW_DATE:
				setLastReviewDate((Date)newValue);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)newValue);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__TOPIC:
				getTopic().clear();
				getTopic().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__AUTHOR:
				getAuthor().clear();
				getAuthor().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__EDITOR:
				getEditor().clear();
				getEditor().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__REVIEWER:
				getReviewer().clear();
				getReviewer().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__ENDORSER:
				getEndorser().clear();
				getEndorser().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__RELATED_ARTIFACT:
				getRelatedArtifact().clear();
				getRelatedArtifact().addAll((Collection<? extends RelatedArtifact>)newValue);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__SYNTHESIS_TYPE:
				setSynthesisType((CodeableConcept)newValue);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__STUDY_TYPE:
				setStudyType((CodeableConcept)newValue);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__POPULATION:
				setPopulation((Reference)newValue);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__EXPOSURE:
				setExposure((Reference)newValue);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__EXPOSURE_ALTERNATIVE:
				setExposureAlternative((Reference)newValue);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__OUTCOME:
				setOutcome((Reference)newValue);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__SAMPLE_SIZE:
				setSampleSize((EffectEvidenceSynthesisSampleSize)newValue);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__RESULTS_BY_EXPOSURE:
				getResultsByExposure().clear();
				getResultsByExposure().addAll((Collection<? extends EffectEvidenceSynthesisResultsByExposure>)newValue);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__EFFECT_ESTIMATE:
				getEffectEstimate().clear();
				getEffectEstimate().addAll((Collection<? extends EffectEvidenceSynthesisEffectEstimate>)newValue);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__CERTAINTY:
				getCertainty().clear();
				getCertainty().addAll((Collection<? extends EffectEvidenceSynthesisCertainty>)newValue);
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
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__URL:
				setUrl((Uri)null);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__VERSION:
				setVersion((org.hl7.fhir.String)null);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__TITLE:
				setTitle((org.hl7.fhir.String)null);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__STATUS:
				setStatus((PublicationStatus)null);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__PUBLISHER:
				setPublisher((org.hl7.fhir.String)null);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__CONTACT:
				getContact().clear();
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__NOTE:
				getNote().clear();
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__USE_CONTEXT:
				getUseContext().clear();
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__JURISDICTION:
				getJurisdiction().clear();
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__COPYRIGHT:
				setCopyright((Markdown)null);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__APPROVAL_DATE:
				setApprovalDate((Date)null);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__LAST_REVIEW_DATE:
				setLastReviewDate((Date)null);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)null);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__TOPIC:
				getTopic().clear();
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__AUTHOR:
				getAuthor().clear();
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__EDITOR:
				getEditor().clear();
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__REVIEWER:
				getReviewer().clear();
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__ENDORSER:
				getEndorser().clear();
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__RELATED_ARTIFACT:
				getRelatedArtifact().clear();
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__SYNTHESIS_TYPE:
				setSynthesisType((CodeableConcept)null);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__STUDY_TYPE:
				setStudyType((CodeableConcept)null);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__POPULATION:
				setPopulation((Reference)null);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__EXPOSURE:
				setExposure((Reference)null);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__EXPOSURE_ALTERNATIVE:
				setExposureAlternative((Reference)null);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__OUTCOME:
				setOutcome((Reference)null);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__SAMPLE_SIZE:
				setSampleSize((EffectEvidenceSynthesisSampleSize)null);
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__RESULTS_BY_EXPOSURE:
				getResultsByExposure().clear();
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__EFFECT_ESTIMATE:
				getEffectEstimate().clear();
				return;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__CERTAINTY:
				getCertainty().clear();
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
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__URL:
				return url != null;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__VERSION:
				return version != null;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__NAME:
				return name != null;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__TITLE:
				return title != null;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__STATUS:
				return status != null;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__DATE:
				return date != null;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__PUBLISHER:
				return publisher != null;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__CONTACT:
				return contact != null && !contact.isEmpty();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__DESCRIPTION:
				return description != null;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__USE_CONTEXT:
				return useContext != null && !useContext.isEmpty();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__JURISDICTION:
				return jurisdiction != null && !jurisdiction.isEmpty();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__COPYRIGHT:
				return copyright != null;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__APPROVAL_DATE:
				return approvalDate != null;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__LAST_REVIEW_DATE:
				return lastReviewDate != null;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__EFFECTIVE_PERIOD:
				return effectivePeriod != null;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__TOPIC:
				return topic != null && !topic.isEmpty();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__AUTHOR:
				return author != null && !author.isEmpty();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__EDITOR:
				return editor != null && !editor.isEmpty();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__REVIEWER:
				return reviewer != null && !reviewer.isEmpty();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__ENDORSER:
				return endorser != null && !endorser.isEmpty();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__RELATED_ARTIFACT:
				return relatedArtifact != null && !relatedArtifact.isEmpty();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__SYNTHESIS_TYPE:
				return synthesisType != null;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__STUDY_TYPE:
				return studyType != null;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__POPULATION:
				return population != null;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__EXPOSURE:
				return exposure != null;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__EXPOSURE_ALTERNATIVE:
				return exposureAlternative != null;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__OUTCOME:
				return outcome != null;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__SAMPLE_SIZE:
				return sampleSize != null;
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__RESULTS_BY_EXPOSURE:
				return resultsByExposure != null && !resultsByExposure.isEmpty();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__EFFECT_ESTIMATE:
				return effectEstimate != null && !effectEstimate.isEmpty();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS__CERTAINTY:
				return certainty != null && !certainty.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EffectEvidenceSynthesisImpl
