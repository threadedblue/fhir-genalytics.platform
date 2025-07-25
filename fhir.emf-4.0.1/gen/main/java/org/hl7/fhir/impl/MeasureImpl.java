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

import org.hl7.fhir.Canonical;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.ContactDetail;
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.Measure;
import org.hl7.fhir.MeasureGroup;
import org.hl7.fhir.MeasureSupplementalData;
import org.hl7.fhir.Period;
import org.hl7.fhir.PublicationStatus;
import org.hl7.fhir.Reference;
import org.hl7.fhir.RelatedArtifact;
import org.hl7.fhir.Uri;
import org.hl7.fhir.UsageContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getSubjectCodeableConcept <em>Subject Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getSubjectReference <em>Subject Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getUseContext <em>Use Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getApprovalDate <em>Approval Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getLastReviewDate <em>Last Review Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getEffectivePeriod <em>Effective Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getTopic <em>Topic</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getEditor <em>Editor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getReviewer <em>Reviewer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getEndorser <em>Endorser</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getRelatedArtifact <em>Related Artifact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getDisclaimer <em>Disclaimer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getScoring <em>Scoring</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getCompositeScoring <em>Composite Scoring</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getRiskAdjustment <em>Risk Adjustment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getRateAggregation <em>Rate Aggregation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getRationale <em>Rationale</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getClinicalRecommendationStatement <em>Clinical Recommendation Statement</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getImprovementNotation <em>Improvement Notation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getGuidance <em>Guidance</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureImpl#getSupplementalData <em>Supplemental Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasureImpl extends DomainResourceImpl implements Measure {
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
	 * The cached value of the '{@link #getSubtitle() <em>Subtitle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtitle()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String subtitle;

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
	 * The cached value of the '{@link #getExperimental() <em>Experimental</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperimental()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean experimental;

	/**
	 * The cached value of the '{@link #getSubjectCodeableConcept() <em>Subject Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept subjectCodeableConcept;

	/**
	 * The cached value of the '{@link #getSubjectReference() <em>Subject Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectReference()
	 * @generated
	 * @ordered
	 */
	protected Reference subjectReference;

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
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected Markdown purpose;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String usage;

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
	 * The cached value of the '{@link #getLibrary() <em>Library</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected EList<Canonical> library;

	/**
	 * The cached value of the '{@link #getDisclaimer() <em>Disclaimer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisclaimer()
	 * @generated
	 * @ordered
	 */
	protected Markdown disclaimer;

	/**
	 * The cached value of the '{@link #getScoring() <em>Scoring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScoring()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept scoring;

	/**
	 * The cached value of the '{@link #getCompositeScoring() <em>Composite Scoring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeScoring()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept compositeScoring;

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
	 * The cached value of the '{@link #getRiskAdjustment() <em>Risk Adjustment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskAdjustment()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String riskAdjustment;

	/**
	 * The cached value of the '{@link #getRateAggregation() <em>Rate Aggregation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateAggregation()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String rateAggregation;

	/**
	 * The cached value of the '{@link #getRationale() <em>Rationale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale()
	 * @generated
	 * @ordered
	 */
	protected Markdown rationale;

	/**
	 * The cached value of the '{@link #getClinicalRecommendationStatement() <em>Clinical Recommendation Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClinicalRecommendationStatement()
	 * @generated
	 * @ordered
	 */
	protected Markdown clinicalRecommendationStatement;

	/**
	 * The cached value of the '{@link #getImprovementNotation() <em>Improvement Notation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImprovementNotation()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept improvementNotation;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<Markdown> definition;

	/**
	 * The cached value of the '{@link #getGuidance() <em>Guidance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuidance()
	 * @generated
	 * @ordered
	 */
	protected Markdown guidance;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureGroup> group;

	/**
	 * The cached value of the '{@link #getSupplementalData() <em>Supplemental Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalData()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureSupplementalData> supplementalData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMeasure();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__URL, oldUrl, newUrl);
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
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.MEASURE__IDENTIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__VERSION, oldVersion, newVersion);
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
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__VERSION, newVersion, newVersion));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__NAME, newName, newName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__TITLE, oldTitle, newTitle);
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
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getSubtitle() {
		return subtitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubtitle(org.hl7.fhir.String newSubtitle, NotificationChain msgs) {
		org.hl7.fhir.String oldSubtitle = subtitle;
		subtitle = newSubtitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__SUBTITLE, oldSubtitle, newSubtitle);
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
	public void setSubtitle(org.hl7.fhir.String newSubtitle) {
		if (newSubtitle != subtitle) {
			NotificationChain msgs = null;
			if (subtitle != null)
				msgs = ((InternalEObject)subtitle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__SUBTITLE, null, msgs);
			if (newSubtitle != null)
				msgs = ((InternalEObject)newSubtitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__SUBTITLE, null, msgs);
			msgs = basicSetSubtitle(newSubtitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__SUBTITLE, newSubtitle, newSubtitle));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getExperimental() {
		return experimental;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExperimental(org.hl7.fhir.Boolean newExperimental, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldExperimental = experimental;
		experimental = newExperimental;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__EXPERIMENTAL, oldExperimental, newExperimental);
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
	public void setExperimental(org.hl7.fhir.Boolean newExperimental) {
		if (newExperimental != experimental) {
			NotificationChain msgs = null;
			if (experimental != null)
				msgs = ((InternalEObject)experimental).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__EXPERIMENTAL, null, msgs);
			if (newExperimental != null)
				msgs = ((InternalEObject)newExperimental).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__EXPERIMENTAL, null, msgs);
			msgs = basicSetExperimental(newExperimental, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__EXPERIMENTAL, newExperimental, newExperimental));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getSubjectCodeableConcept() {
		return subjectCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubjectCodeableConcept(CodeableConcept newSubjectCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldSubjectCodeableConcept = subjectCodeableConcept;
		subjectCodeableConcept = newSubjectCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__SUBJECT_CODEABLE_CONCEPT, oldSubjectCodeableConcept, newSubjectCodeableConcept);
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
	public void setSubjectCodeableConcept(CodeableConcept newSubjectCodeableConcept) {
		if (newSubjectCodeableConcept != subjectCodeableConcept) {
			NotificationChain msgs = null;
			if (subjectCodeableConcept != null)
				msgs = ((InternalEObject)subjectCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__SUBJECT_CODEABLE_CONCEPT, null, msgs);
			if (newSubjectCodeableConcept != null)
				msgs = ((InternalEObject)newSubjectCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__SUBJECT_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetSubjectCodeableConcept(newSubjectCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__SUBJECT_CODEABLE_CONCEPT, newSubjectCodeableConcept, newSubjectCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getSubjectReference() {
		return subjectReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubjectReference(Reference newSubjectReference, NotificationChain msgs) {
		Reference oldSubjectReference = subjectReference;
		subjectReference = newSubjectReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__SUBJECT_REFERENCE, oldSubjectReference, newSubjectReference);
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
	public void setSubjectReference(Reference newSubjectReference) {
		if (newSubjectReference != subjectReference) {
			NotificationChain msgs = null;
			if (subjectReference != null)
				msgs = ((InternalEObject)subjectReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__SUBJECT_REFERENCE, null, msgs);
			if (newSubjectReference != null)
				msgs = ((InternalEObject)newSubjectReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__SUBJECT_REFERENCE, null, msgs);
			msgs = basicSetSubjectReference(newSubjectReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__SUBJECT_REFERENCE, newSubjectReference, newSubjectReference));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__DATE, newDate, newDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__PUBLISHER, oldPublisher, newPublisher);
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
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactDetail> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FhirPackage.MEASURE__CONTACT);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UsageContext> getUseContext() {
		if (useContext == null) {
			useContext = new EObjectContainmentEList<UsageContext>(UsageContext.class, this, FhirPackage.MEASURE__USE_CONTEXT);
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
			jurisdiction = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.MEASURE__JURISDICTION);
		}
		return jurisdiction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPurpose(Markdown newPurpose, NotificationChain msgs) {
		Markdown oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__PURPOSE, oldPurpose, newPurpose);
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
	public void setPurpose(Markdown newPurpose) {
		if (newPurpose != purpose) {
			NotificationChain msgs = null;
			if (purpose != null)
				msgs = ((InternalEObject)purpose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__PURPOSE, null, msgs);
			if (newPurpose != null)
				msgs = ((InternalEObject)newPurpose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__PURPOSE, null, msgs);
			msgs = basicSetPurpose(newPurpose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__PURPOSE, newPurpose, newPurpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsage(org.hl7.fhir.String newUsage, NotificationChain msgs) {
		org.hl7.fhir.String oldUsage = usage;
		usage = newUsage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__USAGE, oldUsage, newUsage);
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
	public void setUsage(org.hl7.fhir.String newUsage) {
		if (newUsage != usage) {
			NotificationChain msgs = null;
			if (usage != null)
				msgs = ((InternalEObject)usage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__USAGE, null, msgs);
			if (newUsage != null)
				msgs = ((InternalEObject)newUsage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__USAGE, null, msgs);
			msgs = basicSetUsage(newUsage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__USAGE, newUsage, newUsage));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__COPYRIGHT, oldCopyright, newCopyright);
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
				msgs = ((InternalEObject)copyright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__COPYRIGHT, null, msgs);
			if (newCopyright != null)
				msgs = ((InternalEObject)newCopyright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__COPYRIGHT, null, msgs);
			msgs = basicSetCopyright(newCopyright, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__COPYRIGHT, newCopyright, newCopyright));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__APPROVAL_DATE, oldApprovalDate, newApprovalDate);
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
				msgs = ((InternalEObject)approvalDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__APPROVAL_DATE, null, msgs);
			if (newApprovalDate != null)
				msgs = ((InternalEObject)newApprovalDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__APPROVAL_DATE, null, msgs);
			msgs = basicSetApprovalDate(newApprovalDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__APPROVAL_DATE, newApprovalDate, newApprovalDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__LAST_REVIEW_DATE, oldLastReviewDate, newLastReviewDate);
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
				msgs = ((InternalEObject)lastReviewDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__LAST_REVIEW_DATE, null, msgs);
			if (newLastReviewDate != null)
				msgs = ((InternalEObject)newLastReviewDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__LAST_REVIEW_DATE, null, msgs);
			msgs = basicSetLastReviewDate(newLastReviewDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__LAST_REVIEW_DATE, newLastReviewDate, newLastReviewDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__EFFECTIVE_PERIOD, oldEffectivePeriod, newEffectivePeriod);
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
				msgs = ((InternalEObject)effectivePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__EFFECTIVE_PERIOD, null, msgs);
			if (newEffectivePeriod != null)
				msgs = ((InternalEObject)newEffectivePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__EFFECTIVE_PERIOD, null, msgs);
			msgs = basicSetEffectivePeriod(newEffectivePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__EFFECTIVE_PERIOD, newEffectivePeriod, newEffectivePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getTopic() {
		if (topic == null) {
			topic = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.MEASURE__TOPIC);
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
			author = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FhirPackage.MEASURE__AUTHOR);
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
			editor = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FhirPackage.MEASURE__EDITOR);
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
			reviewer = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FhirPackage.MEASURE__REVIEWER);
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
			endorser = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FhirPackage.MEASURE__ENDORSER);
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
			relatedArtifact = new EObjectContainmentEList<RelatedArtifact>(RelatedArtifact.class, this, FhirPackage.MEASURE__RELATED_ARTIFACT);
		}
		return relatedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Canonical> getLibrary() {
		if (library == null) {
			library = new EObjectContainmentEList<Canonical>(Canonical.class, this, FhirPackage.MEASURE__LIBRARY);
		}
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getDisclaimer() {
		return disclaimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisclaimer(Markdown newDisclaimer, NotificationChain msgs) {
		Markdown oldDisclaimer = disclaimer;
		disclaimer = newDisclaimer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__DISCLAIMER, oldDisclaimer, newDisclaimer);
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
	public void setDisclaimer(Markdown newDisclaimer) {
		if (newDisclaimer != disclaimer) {
			NotificationChain msgs = null;
			if (disclaimer != null)
				msgs = ((InternalEObject)disclaimer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__DISCLAIMER, null, msgs);
			if (newDisclaimer != null)
				msgs = ((InternalEObject)newDisclaimer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__DISCLAIMER, null, msgs);
			msgs = basicSetDisclaimer(newDisclaimer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__DISCLAIMER, newDisclaimer, newDisclaimer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getScoring() {
		return scoring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScoring(CodeableConcept newScoring, NotificationChain msgs) {
		CodeableConcept oldScoring = scoring;
		scoring = newScoring;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__SCORING, oldScoring, newScoring);
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
	public void setScoring(CodeableConcept newScoring) {
		if (newScoring != scoring) {
			NotificationChain msgs = null;
			if (scoring != null)
				msgs = ((InternalEObject)scoring).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__SCORING, null, msgs);
			if (newScoring != null)
				msgs = ((InternalEObject)newScoring).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__SCORING, null, msgs);
			msgs = basicSetScoring(newScoring, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__SCORING, newScoring, newScoring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCompositeScoring() {
		return compositeScoring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompositeScoring(CodeableConcept newCompositeScoring, NotificationChain msgs) {
		CodeableConcept oldCompositeScoring = compositeScoring;
		compositeScoring = newCompositeScoring;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__COMPOSITE_SCORING, oldCompositeScoring, newCompositeScoring);
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
	public void setCompositeScoring(CodeableConcept newCompositeScoring) {
		if (newCompositeScoring != compositeScoring) {
			NotificationChain msgs = null;
			if (compositeScoring != null)
				msgs = ((InternalEObject)compositeScoring).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__COMPOSITE_SCORING, null, msgs);
			if (newCompositeScoring != null)
				msgs = ((InternalEObject)newCompositeScoring).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__COMPOSITE_SCORING, null, msgs);
			msgs = basicSetCompositeScoring(newCompositeScoring, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__COMPOSITE_SCORING, newCompositeScoring, newCompositeScoring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getType() {
		if (type == null) {
			type = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.MEASURE__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getRiskAdjustment() {
		return riskAdjustment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRiskAdjustment(org.hl7.fhir.String newRiskAdjustment, NotificationChain msgs) {
		org.hl7.fhir.String oldRiskAdjustment = riskAdjustment;
		riskAdjustment = newRiskAdjustment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__RISK_ADJUSTMENT, oldRiskAdjustment, newRiskAdjustment);
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
	public void setRiskAdjustment(org.hl7.fhir.String newRiskAdjustment) {
		if (newRiskAdjustment != riskAdjustment) {
			NotificationChain msgs = null;
			if (riskAdjustment != null)
				msgs = ((InternalEObject)riskAdjustment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__RISK_ADJUSTMENT, null, msgs);
			if (newRiskAdjustment != null)
				msgs = ((InternalEObject)newRiskAdjustment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__RISK_ADJUSTMENT, null, msgs);
			msgs = basicSetRiskAdjustment(newRiskAdjustment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__RISK_ADJUSTMENT, newRiskAdjustment, newRiskAdjustment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getRateAggregation() {
		return rateAggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRateAggregation(org.hl7.fhir.String newRateAggregation, NotificationChain msgs) {
		org.hl7.fhir.String oldRateAggregation = rateAggregation;
		rateAggregation = newRateAggregation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__RATE_AGGREGATION, oldRateAggregation, newRateAggregation);
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
	public void setRateAggregation(org.hl7.fhir.String newRateAggregation) {
		if (newRateAggregation != rateAggregation) {
			NotificationChain msgs = null;
			if (rateAggregation != null)
				msgs = ((InternalEObject)rateAggregation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__RATE_AGGREGATION, null, msgs);
			if (newRateAggregation != null)
				msgs = ((InternalEObject)newRateAggregation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__RATE_AGGREGATION, null, msgs);
			msgs = basicSetRateAggregation(newRateAggregation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__RATE_AGGREGATION, newRateAggregation, newRateAggregation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getRationale() {
		return rationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRationale(Markdown newRationale, NotificationChain msgs) {
		Markdown oldRationale = rationale;
		rationale = newRationale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__RATIONALE, oldRationale, newRationale);
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
	public void setRationale(Markdown newRationale) {
		if (newRationale != rationale) {
			NotificationChain msgs = null;
			if (rationale != null)
				msgs = ((InternalEObject)rationale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__RATIONALE, null, msgs);
			if (newRationale != null)
				msgs = ((InternalEObject)newRationale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__RATIONALE, null, msgs);
			msgs = basicSetRationale(newRationale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__RATIONALE, newRationale, newRationale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getClinicalRecommendationStatement() {
		return clinicalRecommendationStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClinicalRecommendationStatement(Markdown newClinicalRecommendationStatement, NotificationChain msgs) {
		Markdown oldClinicalRecommendationStatement = clinicalRecommendationStatement;
		clinicalRecommendationStatement = newClinicalRecommendationStatement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__CLINICAL_RECOMMENDATION_STATEMENT, oldClinicalRecommendationStatement, newClinicalRecommendationStatement);
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
	public void setClinicalRecommendationStatement(Markdown newClinicalRecommendationStatement) {
		if (newClinicalRecommendationStatement != clinicalRecommendationStatement) {
			NotificationChain msgs = null;
			if (clinicalRecommendationStatement != null)
				msgs = ((InternalEObject)clinicalRecommendationStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__CLINICAL_RECOMMENDATION_STATEMENT, null, msgs);
			if (newClinicalRecommendationStatement != null)
				msgs = ((InternalEObject)newClinicalRecommendationStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__CLINICAL_RECOMMENDATION_STATEMENT, null, msgs);
			msgs = basicSetClinicalRecommendationStatement(newClinicalRecommendationStatement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__CLINICAL_RECOMMENDATION_STATEMENT, newClinicalRecommendationStatement, newClinicalRecommendationStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getImprovementNotation() {
		return improvementNotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImprovementNotation(CodeableConcept newImprovementNotation, NotificationChain msgs) {
		CodeableConcept oldImprovementNotation = improvementNotation;
		improvementNotation = newImprovementNotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__IMPROVEMENT_NOTATION, oldImprovementNotation, newImprovementNotation);
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
	public void setImprovementNotation(CodeableConcept newImprovementNotation) {
		if (newImprovementNotation != improvementNotation) {
			NotificationChain msgs = null;
			if (improvementNotation != null)
				msgs = ((InternalEObject)improvementNotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__IMPROVEMENT_NOTATION, null, msgs);
			if (newImprovementNotation != null)
				msgs = ((InternalEObject)newImprovementNotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__IMPROVEMENT_NOTATION, null, msgs);
			msgs = basicSetImprovementNotation(newImprovementNotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__IMPROVEMENT_NOTATION, newImprovementNotation, newImprovementNotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Markdown> getDefinition() {
		if (definition == null) {
			definition = new EObjectContainmentEList<Markdown>(Markdown.class, this, FhirPackage.MEASURE__DEFINITION);
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getGuidance() {
		return guidance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuidance(Markdown newGuidance, NotificationChain msgs) {
		Markdown oldGuidance = guidance;
		guidance = newGuidance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__GUIDANCE, oldGuidance, newGuidance);
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
	public void setGuidance(Markdown newGuidance) {
		if (newGuidance != guidance) {
			NotificationChain msgs = null;
			if (guidance != null)
				msgs = ((InternalEObject)guidance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__GUIDANCE, null, msgs);
			if (newGuidance != null)
				msgs = ((InternalEObject)newGuidance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE__GUIDANCE, null, msgs);
			msgs = basicSetGuidance(newGuidance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE__GUIDANCE, newGuidance, newGuidance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MeasureGroup> getGroup() {
		if (group == null) {
			group = new EObjectContainmentEList<MeasureGroup>(MeasureGroup.class, this, FhirPackage.MEASURE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MeasureSupplementalData> getSupplementalData() {
		if (supplementalData == null) {
			supplementalData = new EObjectContainmentEList<MeasureSupplementalData>(MeasureSupplementalData.class, this, FhirPackage.MEASURE__SUPPLEMENTAL_DATA);
		}
		return supplementalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEASURE__URL:
				return basicSetUrl(null, msgs);
			case FhirPackage.MEASURE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEASURE__VERSION:
				return basicSetVersion(null, msgs);
			case FhirPackage.MEASURE__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.MEASURE__TITLE:
				return basicSetTitle(null, msgs);
			case FhirPackage.MEASURE__SUBTITLE:
				return basicSetSubtitle(null, msgs);
			case FhirPackage.MEASURE__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.MEASURE__EXPERIMENTAL:
				return basicSetExperimental(null, msgs);
			case FhirPackage.MEASURE__SUBJECT_CODEABLE_CONCEPT:
				return basicSetSubjectCodeableConcept(null, msgs);
			case FhirPackage.MEASURE__SUBJECT_REFERENCE:
				return basicSetSubjectReference(null, msgs);
			case FhirPackage.MEASURE__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.MEASURE__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case FhirPackage.MEASURE__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEASURE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.MEASURE__USE_CONTEXT:
				return ((InternalEList<?>)getUseContext()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEASURE__JURISDICTION:
				return ((InternalEList<?>)getJurisdiction()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEASURE__PURPOSE:
				return basicSetPurpose(null, msgs);
			case FhirPackage.MEASURE__USAGE:
				return basicSetUsage(null, msgs);
			case FhirPackage.MEASURE__COPYRIGHT:
				return basicSetCopyright(null, msgs);
			case FhirPackage.MEASURE__APPROVAL_DATE:
				return basicSetApprovalDate(null, msgs);
			case FhirPackage.MEASURE__LAST_REVIEW_DATE:
				return basicSetLastReviewDate(null, msgs);
			case FhirPackage.MEASURE__EFFECTIVE_PERIOD:
				return basicSetEffectivePeriod(null, msgs);
			case FhirPackage.MEASURE__TOPIC:
				return ((InternalEList<?>)getTopic()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEASURE__AUTHOR:
				return ((InternalEList<?>)getAuthor()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEASURE__EDITOR:
				return ((InternalEList<?>)getEditor()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEASURE__REVIEWER:
				return ((InternalEList<?>)getReviewer()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEASURE__ENDORSER:
				return ((InternalEList<?>)getEndorser()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEASURE__RELATED_ARTIFACT:
				return ((InternalEList<?>)getRelatedArtifact()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEASURE__LIBRARY:
				return ((InternalEList<?>)getLibrary()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEASURE__DISCLAIMER:
				return basicSetDisclaimer(null, msgs);
			case FhirPackage.MEASURE__SCORING:
				return basicSetScoring(null, msgs);
			case FhirPackage.MEASURE__COMPOSITE_SCORING:
				return basicSetCompositeScoring(null, msgs);
			case FhirPackage.MEASURE__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEASURE__RISK_ADJUSTMENT:
				return basicSetRiskAdjustment(null, msgs);
			case FhirPackage.MEASURE__RATE_AGGREGATION:
				return basicSetRateAggregation(null, msgs);
			case FhirPackage.MEASURE__RATIONALE:
				return basicSetRationale(null, msgs);
			case FhirPackage.MEASURE__CLINICAL_RECOMMENDATION_STATEMENT:
				return basicSetClinicalRecommendationStatement(null, msgs);
			case FhirPackage.MEASURE__IMPROVEMENT_NOTATION:
				return basicSetImprovementNotation(null, msgs);
			case FhirPackage.MEASURE__DEFINITION:
				return ((InternalEList<?>)getDefinition()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEASURE__GUIDANCE:
				return basicSetGuidance(null, msgs);
			case FhirPackage.MEASURE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEASURE__SUPPLEMENTAL_DATA:
				return ((InternalEList<?>)getSupplementalData()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MEASURE__URL:
				return getUrl();
			case FhirPackage.MEASURE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.MEASURE__VERSION:
				return getVersion();
			case FhirPackage.MEASURE__NAME:
				return getName();
			case FhirPackage.MEASURE__TITLE:
				return getTitle();
			case FhirPackage.MEASURE__SUBTITLE:
				return getSubtitle();
			case FhirPackage.MEASURE__STATUS:
				return getStatus();
			case FhirPackage.MEASURE__EXPERIMENTAL:
				return getExperimental();
			case FhirPackage.MEASURE__SUBJECT_CODEABLE_CONCEPT:
				return getSubjectCodeableConcept();
			case FhirPackage.MEASURE__SUBJECT_REFERENCE:
				return getSubjectReference();
			case FhirPackage.MEASURE__DATE:
				return getDate();
			case FhirPackage.MEASURE__PUBLISHER:
				return getPublisher();
			case FhirPackage.MEASURE__CONTACT:
				return getContact();
			case FhirPackage.MEASURE__DESCRIPTION:
				return getDescription();
			case FhirPackage.MEASURE__USE_CONTEXT:
				return getUseContext();
			case FhirPackage.MEASURE__JURISDICTION:
				return getJurisdiction();
			case FhirPackage.MEASURE__PURPOSE:
				return getPurpose();
			case FhirPackage.MEASURE__USAGE:
				return getUsage();
			case FhirPackage.MEASURE__COPYRIGHT:
				return getCopyright();
			case FhirPackage.MEASURE__APPROVAL_DATE:
				return getApprovalDate();
			case FhirPackage.MEASURE__LAST_REVIEW_DATE:
				return getLastReviewDate();
			case FhirPackage.MEASURE__EFFECTIVE_PERIOD:
				return getEffectivePeriod();
			case FhirPackage.MEASURE__TOPIC:
				return getTopic();
			case FhirPackage.MEASURE__AUTHOR:
				return getAuthor();
			case FhirPackage.MEASURE__EDITOR:
				return getEditor();
			case FhirPackage.MEASURE__REVIEWER:
				return getReviewer();
			case FhirPackage.MEASURE__ENDORSER:
				return getEndorser();
			case FhirPackage.MEASURE__RELATED_ARTIFACT:
				return getRelatedArtifact();
			case FhirPackage.MEASURE__LIBRARY:
				return getLibrary();
			case FhirPackage.MEASURE__DISCLAIMER:
				return getDisclaimer();
			case FhirPackage.MEASURE__SCORING:
				return getScoring();
			case FhirPackage.MEASURE__COMPOSITE_SCORING:
				return getCompositeScoring();
			case FhirPackage.MEASURE__TYPE:
				return getType();
			case FhirPackage.MEASURE__RISK_ADJUSTMENT:
				return getRiskAdjustment();
			case FhirPackage.MEASURE__RATE_AGGREGATION:
				return getRateAggregation();
			case FhirPackage.MEASURE__RATIONALE:
				return getRationale();
			case FhirPackage.MEASURE__CLINICAL_RECOMMENDATION_STATEMENT:
				return getClinicalRecommendationStatement();
			case FhirPackage.MEASURE__IMPROVEMENT_NOTATION:
				return getImprovementNotation();
			case FhirPackage.MEASURE__DEFINITION:
				return getDefinition();
			case FhirPackage.MEASURE__GUIDANCE:
				return getGuidance();
			case FhirPackage.MEASURE__GROUP:
				return getGroup();
			case FhirPackage.MEASURE__SUPPLEMENTAL_DATA:
				return getSupplementalData();
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
			case FhirPackage.MEASURE__URL:
				setUrl((Uri)newValue);
				return;
			case FhirPackage.MEASURE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.MEASURE__VERSION:
				setVersion((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MEASURE__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MEASURE__TITLE:
				setTitle((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MEASURE__SUBTITLE:
				setSubtitle((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MEASURE__STATUS:
				setStatus((PublicationStatus)newValue);
				return;
			case FhirPackage.MEASURE__EXPERIMENTAL:
				setExperimental((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.MEASURE__SUBJECT_CODEABLE_CONCEPT:
				setSubjectCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.MEASURE__SUBJECT_REFERENCE:
				setSubjectReference((Reference)newValue);
				return;
			case FhirPackage.MEASURE__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.MEASURE__PUBLISHER:
				setPublisher((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MEASURE__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FhirPackage.MEASURE__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.MEASURE__USE_CONTEXT:
				getUseContext().clear();
				getUseContext().addAll((Collection<? extends UsageContext>)newValue);
				return;
			case FhirPackage.MEASURE__JURISDICTION:
				getJurisdiction().clear();
				getJurisdiction().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.MEASURE__PURPOSE:
				setPurpose((Markdown)newValue);
				return;
			case FhirPackage.MEASURE__USAGE:
				setUsage((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MEASURE__COPYRIGHT:
				setCopyright((Markdown)newValue);
				return;
			case FhirPackage.MEASURE__APPROVAL_DATE:
				setApprovalDate((Date)newValue);
				return;
			case FhirPackage.MEASURE__LAST_REVIEW_DATE:
				setLastReviewDate((Date)newValue);
				return;
			case FhirPackage.MEASURE__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)newValue);
				return;
			case FhirPackage.MEASURE__TOPIC:
				getTopic().clear();
				getTopic().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.MEASURE__AUTHOR:
				getAuthor().clear();
				getAuthor().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FhirPackage.MEASURE__EDITOR:
				getEditor().clear();
				getEditor().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FhirPackage.MEASURE__REVIEWER:
				getReviewer().clear();
				getReviewer().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FhirPackage.MEASURE__ENDORSER:
				getEndorser().clear();
				getEndorser().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FhirPackage.MEASURE__RELATED_ARTIFACT:
				getRelatedArtifact().clear();
				getRelatedArtifact().addAll((Collection<? extends RelatedArtifact>)newValue);
				return;
			case FhirPackage.MEASURE__LIBRARY:
				getLibrary().clear();
				getLibrary().addAll((Collection<? extends Canonical>)newValue);
				return;
			case FhirPackage.MEASURE__DISCLAIMER:
				setDisclaimer((Markdown)newValue);
				return;
			case FhirPackage.MEASURE__SCORING:
				setScoring((CodeableConcept)newValue);
				return;
			case FhirPackage.MEASURE__COMPOSITE_SCORING:
				setCompositeScoring((CodeableConcept)newValue);
				return;
			case FhirPackage.MEASURE__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.MEASURE__RISK_ADJUSTMENT:
				setRiskAdjustment((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MEASURE__RATE_AGGREGATION:
				setRateAggregation((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MEASURE__RATIONALE:
				setRationale((Markdown)newValue);
				return;
			case FhirPackage.MEASURE__CLINICAL_RECOMMENDATION_STATEMENT:
				setClinicalRecommendationStatement((Markdown)newValue);
				return;
			case FhirPackage.MEASURE__IMPROVEMENT_NOTATION:
				setImprovementNotation((CodeableConcept)newValue);
				return;
			case FhirPackage.MEASURE__DEFINITION:
				getDefinition().clear();
				getDefinition().addAll((Collection<? extends Markdown>)newValue);
				return;
			case FhirPackage.MEASURE__GUIDANCE:
				setGuidance((Markdown)newValue);
				return;
			case FhirPackage.MEASURE__GROUP:
				getGroup().clear();
				getGroup().addAll((Collection<? extends MeasureGroup>)newValue);
				return;
			case FhirPackage.MEASURE__SUPPLEMENTAL_DATA:
				getSupplementalData().clear();
				getSupplementalData().addAll((Collection<? extends MeasureSupplementalData>)newValue);
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
			case FhirPackage.MEASURE__URL:
				setUrl((Uri)null);
				return;
			case FhirPackage.MEASURE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.MEASURE__VERSION:
				setVersion((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MEASURE__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MEASURE__TITLE:
				setTitle((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MEASURE__SUBTITLE:
				setSubtitle((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MEASURE__STATUS:
				setStatus((PublicationStatus)null);
				return;
			case FhirPackage.MEASURE__EXPERIMENTAL:
				setExperimental((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.MEASURE__SUBJECT_CODEABLE_CONCEPT:
				setSubjectCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.MEASURE__SUBJECT_REFERENCE:
				setSubjectReference((Reference)null);
				return;
			case FhirPackage.MEASURE__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.MEASURE__PUBLISHER:
				setPublisher((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MEASURE__CONTACT:
				getContact().clear();
				return;
			case FhirPackage.MEASURE__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.MEASURE__USE_CONTEXT:
				getUseContext().clear();
				return;
			case FhirPackage.MEASURE__JURISDICTION:
				getJurisdiction().clear();
				return;
			case FhirPackage.MEASURE__PURPOSE:
				setPurpose((Markdown)null);
				return;
			case FhirPackage.MEASURE__USAGE:
				setUsage((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MEASURE__COPYRIGHT:
				setCopyright((Markdown)null);
				return;
			case FhirPackage.MEASURE__APPROVAL_DATE:
				setApprovalDate((Date)null);
				return;
			case FhirPackage.MEASURE__LAST_REVIEW_DATE:
				setLastReviewDate((Date)null);
				return;
			case FhirPackage.MEASURE__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)null);
				return;
			case FhirPackage.MEASURE__TOPIC:
				getTopic().clear();
				return;
			case FhirPackage.MEASURE__AUTHOR:
				getAuthor().clear();
				return;
			case FhirPackage.MEASURE__EDITOR:
				getEditor().clear();
				return;
			case FhirPackage.MEASURE__REVIEWER:
				getReviewer().clear();
				return;
			case FhirPackage.MEASURE__ENDORSER:
				getEndorser().clear();
				return;
			case FhirPackage.MEASURE__RELATED_ARTIFACT:
				getRelatedArtifact().clear();
				return;
			case FhirPackage.MEASURE__LIBRARY:
				getLibrary().clear();
				return;
			case FhirPackage.MEASURE__DISCLAIMER:
				setDisclaimer((Markdown)null);
				return;
			case FhirPackage.MEASURE__SCORING:
				setScoring((CodeableConcept)null);
				return;
			case FhirPackage.MEASURE__COMPOSITE_SCORING:
				setCompositeScoring((CodeableConcept)null);
				return;
			case FhirPackage.MEASURE__TYPE:
				getType().clear();
				return;
			case FhirPackage.MEASURE__RISK_ADJUSTMENT:
				setRiskAdjustment((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MEASURE__RATE_AGGREGATION:
				setRateAggregation((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MEASURE__RATIONALE:
				setRationale((Markdown)null);
				return;
			case FhirPackage.MEASURE__CLINICAL_RECOMMENDATION_STATEMENT:
				setClinicalRecommendationStatement((Markdown)null);
				return;
			case FhirPackage.MEASURE__IMPROVEMENT_NOTATION:
				setImprovementNotation((CodeableConcept)null);
				return;
			case FhirPackage.MEASURE__DEFINITION:
				getDefinition().clear();
				return;
			case FhirPackage.MEASURE__GUIDANCE:
				setGuidance((Markdown)null);
				return;
			case FhirPackage.MEASURE__GROUP:
				getGroup().clear();
				return;
			case FhirPackage.MEASURE__SUPPLEMENTAL_DATA:
				getSupplementalData().clear();
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
			case FhirPackage.MEASURE__URL:
				return url != null;
			case FhirPackage.MEASURE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.MEASURE__VERSION:
				return version != null;
			case FhirPackage.MEASURE__NAME:
				return name != null;
			case FhirPackage.MEASURE__TITLE:
				return title != null;
			case FhirPackage.MEASURE__SUBTITLE:
				return subtitle != null;
			case FhirPackage.MEASURE__STATUS:
				return status != null;
			case FhirPackage.MEASURE__EXPERIMENTAL:
				return experimental != null;
			case FhirPackage.MEASURE__SUBJECT_CODEABLE_CONCEPT:
				return subjectCodeableConcept != null;
			case FhirPackage.MEASURE__SUBJECT_REFERENCE:
				return subjectReference != null;
			case FhirPackage.MEASURE__DATE:
				return date != null;
			case FhirPackage.MEASURE__PUBLISHER:
				return publisher != null;
			case FhirPackage.MEASURE__CONTACT:
				return contact != null && !contact.isEmpty();
			case FhirPackage.MEASURE__DESCRIPTION:
				return description != null;
			case FhirPackage.MEASURE__USE_CONTEXT:
				return useContext != null && !useContext.isEmpty();
			case FhirPackage.MEASURE__JURISDICTION:
				return jurisdiction != null && !jurisdiction.isEmpty();
			case FhirPackage.MEASURE__PURPOSE:
				return purpose != null;
			case FhirPackage.MEASURE__USAGE:
				return usage != null;
			case FhirPackage.MEASURE__COPYRIGHT:
				return copyright != null;
			case FhirPackage.MEASURE__APPROVAL_DATE:
				return approvalDate != null;
			case FhirPackage.MEASURE__LAST_REVIEW_DATE:
				return lastReviewDate != null;
			case FhirPackage.MEASURE__EFFECTIVE_PERIOD:
				return effectivePeriod != null;
			case FhirPackage.MEASURE__TOPIC:
				return topic != null && !topic.isEmpty();
			case FhirPackage.MEASURE__AUTHOR:
				return author != null && !author.isEmpty();
			case FhirPackage.MEASURE__EDITOR:
				return editor != null && !editor.isEmpty();
			case FhirPackage.MEASURE__REVIEWER:
				return reviewer != null && !reviewer.isEmpty();
			case FhirPackage.MEASURE__ENDORSER:
				return endorser != null && !endorser.isEmpty();
			case FhirPackage.MEASURE__RELATED_ARTIFACT:
				return relatedArtifact != null && !relatedArtifact.isEmpty();
			case FhirPackage.MEASURE__LIBRARY:
				return library != null && !library.isEmpty();
			case FhirPackage.MEASURE__DISCLAIMER:
				return disclaimer != null;
			case FhirPackage.MEASURE__SCORING:
				return scoring != null;
			case FhirPackage.MEASURE__COMPOSITE_SCORING:
				return compositeScoring != null;
			case FhirPackage.MEASURE__TYPE:
				return type != null && !type.isEmpty();
			case FhirPackage.MEASURE__RISK_ADJUSTMENT:
				return riskAdjustment != null;
			case FhirPackage.MEASURE__RATE_AGGREGATION:
				return rateAggregation != null;
			case FhirPackage.MEASURE__RATIONALE:
				return rationale != null;
			case FhirPackage.MEASURE__CLINICAL_RECOMMENDATION_STATEMENT:
				return clinicalRecommendationStatement != null;
			case FhirPackage.MEASURE__IMPROVEMENT_NOTATION:
				return improvementNotation != null;
			case FhirPackage.MEASURE__DEFINITION:
				return definition != null && !definition.isEmpty();
			case FhirPackage.MEASURE__GUIDANCE:
				return guidance != null;
			case FhirPackage.MEASURE__GROUP:
				return group != null && !group.isEmpty();
			case FhirPackage.MEASURE__SUPPLEMENTAL_DATA:
				return supplementalData != null && !supplementalData.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MeasureImpl
