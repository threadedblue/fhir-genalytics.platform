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

import org.hl7.fhir.Attachment;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Contract;
import org.hl7.fhir.ContractContentDefinition;
import org.hl7.fhir.ContractFriendly;
import org.hl7.fhir.ContractLegal;
import org.hl7.fhir.ContractResourceStatusCodes;
import org.hl7.fhir.ContractRule;
import org.hl7.fhir.ContractSigner;
import org.hl7.fhir.ContractTerm;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getLegalState <em>Legal State</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getInstantiatesCanonical <em>Instantiates Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getInstantiatesUri <em>Instantiates Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getContentDerivative <em>Content Derivative</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getIssued <em>Issued</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getApplies <em>Applies</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getExpirationType <em>Expiration Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getAuthority <em>Authority</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getSite <em>Site</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getTopicCodeableConcept <em>Topic Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getTopicReference <em>Topic Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getContentDefinition <em>Content Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getSupportingInfo <em>Supporting Info</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getRelevantHistory <em>Relevant History</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getSigner <em>Signer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getFriendly <em>Friendly</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getLegal <em>Legal</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getLegallyBindingAttachment <em>Legally Binding Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getLegallyBindingReference <em>Legally Binding Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContractImpl extends DomainResourceImpl implements Contract {
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
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected Uri url;

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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected ContractResourceStatusCodes status;

	/**
	 * The cached value of the '{@link #getLegalState() <em>Legal State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegalState()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept legalState;

	/**
	 * The cached value of the '{@link #getInstantiatesCanonical() <em>Instantiates Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatesCanonical()
	 * @generated
	 * @ordered
	 */
	protected Reference instantiatesCanonical;

	/**
	 * The cached value of the '{@link #getInstantiatesUri() <em>Instantiates Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatesUri()
	 * @generated
	 * @ordered
	 */
	protected Uri instantiatesUri;

	/**
	 * The cached value of the '{@link #getContentDerivative() <em>Content Derivative</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentDerivative()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept contentDerivative;

	/**
	 * The cached value of the '{@link #getIssued() <em>Issued</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssued()
	 * @generated
	 * @ordered
	 */
	protected DateTime issued;

	/**
	 * The cached value of the '{@link #getApplies() <em>Applies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplies()
	 * @generated
	 * @ordered
	 */
	protected Period applies;

	/**
	 * The cached value of the '{@link #getExpirationType() <em>Expiration Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept expirationType;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> subject;

	/**
	 * The cached value of the '{@link #getAuthority() <em>Authority</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthority()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> authority;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> domain;

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
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> alias;

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
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept scope;

	/**
	 * The cached value of the '{@link #getTopicCodeableConcept() <em>Topic Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept topicCodeableConcept;

	/**
	 * The cached value of the '{@link #getTopicReference() <em>Topic Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicReference()
	 * @generated
	 * @ordered
	 */
	protected Reference topicReference;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getSubType() <em>Sub Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubType()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> subType;

	/**
	 * The cached value of the '{@link #getContentDefinition() <em>Content Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentDefinition()
	 * @generated
	 * @ordered
	 */
	protected ContractContentDefinition contentDefinition;

	/**
	 * The cached value of the '{@link #getTerm() <em>Term</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractTerm> term;

	/**
	 * The cached value of the '{@link #getSupportingInfo() <em>Supporting Info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> supportingInfo;

	/**
	 * The cached value of the '{@link #getRelevantHistory() <em>Relevant History</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelevantHistory()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> relevantHistory;

	/**
	 * The cached value of the '{@link #getSigner() <em>Signer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSigner()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractSigner> signer;

	/**
	 * The cached value of the '{@link #getFriendly() <em>Friendly</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFriendly()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractFriendly> friendly;

	/**
	 * The cached value of the '{@link #getLegal() <em>Legal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegal()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractLegal> legal;

	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractRule> rule;

	/**
	 * The cached value of the '{@link #getLegallyBindingAttachment() <em>Legally Binding Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegallyBindingAttachment()
	 * @generated
	 * @ordered
	 */
	protected Attachment legallyBindingAttachment;

	/**
	 * The cached value of the '{@link #getLegallyBindingReference() <em>Legally Binding Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegallyBindingReference()
	 * @generated
	 * @ordered
	 */
	protected Reference legallyBindingReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getContract();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.CONTRACT__IDENTIFIER);
		}
		return identifier;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__URL, oldUrl, newUrl);
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
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__URL, newUrl, newUrl));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__VERSION, oldVersion, newVersion);
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
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractResourceStatusCodes getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(ContractResourceStatusCodes newStatus, NotificationChain msgs) {
		ContractResourceStatusCodes oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__STATUS, oldStatus, newStatus);
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
	public void setStatus(ContractResourceStatusCodes newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getLegalState() {
		return legalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLegalState(CodeableConcept newLegalState, NotificationChain msgs) {
		CodeableConcept oldLegalState = legalState;
		legalState = newLegalState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__LEGAL_STATE, oldLegalState, newLegalState);
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
	public void setLegalState(CodeableConcept newLegalState) {
		if (newLegalState != legalState) {
			NotificationChain msgs = null;
			if (legalState != null)
				msgs = ((InternalEObject)legalState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__LEGAL_STATE, null, msgs);
			if (newLegalState != null)
				msgs = ((InternalEObject)newLegalState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__LEGAL_STATE, null, msgs);
			msgs = basicSetLegalState(newLegalState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__LEGAL_STATE, newLegalState, newLegalState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getInstantiatesCanonical() {
		return instantiatesCanonical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstantiatesCanonical(Reference newInstantiatesCanonical, NotificationChain msgs) {
		Reference oldInstantiatesCanonical = instantiatesCanonical;
		instantiatesCanonical = newInstantiatesCanonical;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__INSTANTIATES_CANONICAL, oldInstantiatesCanonical, newInstantiatesCanonical);
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
	public void setInstantiatesCanonical(Reference newInstantiatesCanonical) {
		if (newInstantiatesCanonical != instantiatesCanonical) {
			NotificationChain msgs = null;
			if (instantiatesCanonical != null)
				msgs = ((InternalEObject)instantiatesCanonical).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__INSTANTIATES_CANONICAL, null, msgs);
			if (newInstantiatesCanonical != null)
				msgs = ((InternalEObject)newInstantiatesCanonical).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__INSTANTIATES_CANONICAL, null, msgs);
			msgs = basicSetInstantiatesCanonical(newInstantiatesCanonical, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__INSTANTIATES_CANONICAL, newInstantiatesCanonical, newInstantiatesCanonical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getInstantiatesUri() {
		return instantiatesUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstantiatesUri(Uri newInstantiatesUri, NotificationChain msgs) {
		Uri oldInstantiatesUri = instantiatesUri;
		instantiatesUri = newInstantiatesUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__INSTANTIATES_URI, oldInstantiatesUri, newInstantiatesUri);
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
	public void setInstantiatesUri(Uri newInstantiatesUri) {
		if (newInstantiatesUri != instantiatesUri) {
			NotificationChain msgs = null;
			if (instantiatesUri != null)
				msgs = ((InternalEObject)instantiatesUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__INSTANTIATES_URI, null, msgs);
			if (newInstantiatesUri != null)
				msgs = ((InternalEObject)newInstantiatesUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__INSTANTIATES_URI, null, msgs);
			msgs = basicSetInstantiatesUri(newInstantiatesUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__INSTANTIATES_URI, newInstantiatesUri, newInstantiatesUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getContentDerivative() {
		return contentDerivative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentDerivative(CodeableConcept newContentDerivative, NotificationChain msgs) {
		CodeableConcept oldContentDerivative = contentDerivative;
		contentDerivative = newContentDerivative;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__CONTENT_DERIVATIVE, oldContentDerivative, newContentDerivative);
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
	public void setContentDerivative(CodeableConcept newContentDerivative) {
		if (newContentDerivative != contentDerivative) {
			NotificationChain msgs = null;
			if (contentDerivative != null)
				msgs = ((InternalEObject)contentDerivative).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__CONTENT_DERIVATIVE, null, msgs);
			if (newContentDerivative != null)
				msgs = ((InternalEObject)newContentDerivative).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__CONTENT_DERIVATIVE, null, msgs);
			msgs = basicSetContentDerivative(newContentDerivative, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__CONTENT_DERIVATIVE, newContentDerivative, newContentDerivative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getIssued() {
		return issued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssued(DateTime newIssued, NotificationChain msgs) {
		DateTime oldIssued = issued;
		issued = newIssued;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__ISSUED, oldIssued, newIssued);
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
	public void setIssued(DateTime newIssued) {
		if (newIssued != issued) {
			NotificationChain msgs = null;
			if (issued != null)
				msgs = ((InternalEObject)issued).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__ISSUED, null, msgs);
			if (newIssued != null)
				msgs = ((InternalEObject)newIssued).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__ISSUED, null, msgs);
			msgs = basicSetIssued(newIssued, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__ISSUED, newIssued, newIssued));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getApplies() {
		return applies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplies(Period newApplies, NotificationChain msgs) {
		Period oldApplies = applies;
		applies = newApplies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__APPLIES, oldApplies, newApplies);
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
	public void setApplies(Period newApplies) {
		if (newApplies != applies) {
			NotificationChain msgs = null;
			if (applies != null)
				msgs = ((InternalEObject)applies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__APPLIES, null, msgs);
			if (newApplies != null)
				msgs = ((InternalEObject)newApplies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__APPLIES, null, msgs);
			msgs = basicSetApplies(newApplies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__APPLIES, newApplies, newApplies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getExpirationType() {
		return expirationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpirationType(CodeableConcept newExpirationType, NotificationChain msgs) {
		CodeableConcept oldExpirationType = expirationType;
		expirationType = newExpirationType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__EXPIRATION_TYPE, oldExpirationType, newExpirationType);
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
	public void setExpirationType(CodeableConcept newExpirationType) {
		if (newExpirationType != expirationType) {
			NotificationChain msgs = null;
			if (expirationType != null)
				msgs = ((InternalEObject)expirationType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__EXPIRATION_TYPE, null, msgs);
			if (newExpirationType != null)
				msgs = ((InternalEObject)newExpirationType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__EXPIRATION_TYPE, null, msgs);
			msgs = basicSetExpirationType(newExpirationType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__EXPIRATION_TYPE, newExpirationType, newExpirationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSubject() {
		if (subject == null) {
			subject = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CONTRACT__SUBJECT);
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getAuthority() {
		if (authority == null) {
			authority = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CONTRACT__AUTHORITY);
		}
		return authority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getDomain() {
		if (domain == null) {
			domain = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CONTRACT__DOMAIN);
		}
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSite() {
		if (site == null) {
			site = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CONTRACT__SITE);
		}
		return site;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__NAME, newName, newName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__TITLE, oldTitle, newTitle);
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
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__TITLE, newTitle, newTitle));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__SUBTITLE, oldSubtitle, newSubtitle);
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
				msgs = ((InternalEObject)subtitle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__SUBTITLE, null, msgs);
			if (newSubtitle != null)
				msgs = ((InternalEObject)newSubtitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__SUBTITLE, null, msgs);
			msgs = basicSetSubtitle(newSubtitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__SUBTITLE, newSubtitle, newSubtitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.hl7.fhir.String> getAlias() {
		if (alias == null) {
			alias = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.CONTRACT__ALIAS);
		}
		return alias;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__AUTHOR, oldAuthor, newAuthor);
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
				msgs = ((InternalEObject)author).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__AUTHOR, null, msgs);
			if (newAuthor != null)
				msgs = ((InternalEObject)newAuthor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__AUTHOR, null, msgs);
			msgs = basicSetAuthor(newAuthor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__AUTHOR, newAuthor, newAuthor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScope(CodeableConcept newScope, NotificationChain msgs) {
		CodeableConcept oldScope = scope;
		scope = newScope;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__SCOPE, oldScope, newScope);
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
	public void setScope(CodeableConcept newScope) {
		if (newScope != scope) {
			NotificationChain msgs = null;
			if (scope != null)
				msgs = ((InternalEObject)scope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__SCOPE, null, msgs);
			if (newScope != null)
				msgs = ((InternalEObject)newScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__SCOPE, null, msgs);
			msgs = basicSetScope(newScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__SCOPE, newScope, newScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getTopicCodeableConcept() {
		return topicCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopicCodeableConcept(CodeableConcept newTopicCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldTopicCodeableConcept = topicCodeableConcept;
		topicCodeableConcept = newTopicCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__TOPIC_CODEABLE_CONCEPT, oldTopicCodeableConcept, newTopicCodeableConcept);
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
	public void setTopicCodeableConcept(CodeableConcept newTopicCodeableConcept) {
		if (newTopicCodeableConcept != topicCodeableConcept) {
			NotificationChain msgs = null;
			if (topicCodeableConcept != null)
				msgs = ((InternalEObject)topicCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__TOPIC_CODEABLE_CONCEPT, null, msgs);
			if (newTopicCodeableConcept != null)
				msgs = ((InternalEObject)newTopicCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__TOPIC_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetTopicCodeableConcept(newTopicCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__TOPIC_CODEABLE_CONCEPT, newTopicCodeableConcept, newTopicCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getTopicReference() {
		return topicReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopicReference(Reference newTopicReference, NotificationChain msgs) {
		Reference oldTopicReference = topicReference;
		topicReference = newTopicReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__TOPIC_REFERENCE, oldTopicReference, newTopicReference);
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
	public void setTopicReference(Reference newTopicReference) {
		if (newTopicReference != topicReference) {
			NotificationChain msgs = null;
			if (topicReference != null)
				msgs = ((InternalEObject)topicReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__TOPIC_REFERENCE, null, msgs);
			if (newTopicReference != null)
				msgs = ((InternalEObject)newTopicReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__TOPIC_REFERENCE, null, msgs);
			msgs = basicSetTopicReference(newTopicReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__TOPIC_REFERENCE, newTopicReference, newTopicReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__TYPE, oldType, newType);
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
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getSubType() {
		if (subType == null) {
			subType = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CONTRACT__SUB_TYPE);
		}
		return subType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractContentDefinition getContentDefinition() {
		return contentDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentDefinition(ContractContentDefinition newContentDefinition, NotificationChain msgs) {
		ContractContentDefinition oldContentDefinition = contentDefinition;
		contentDefinition = newContentDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__CONTENT_DEFINITION, oldContentDefinition, newContentDefinition);
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
	public void setContentDefinition(ContractContentDefinition newContentDefinition) {
		if (newContentDefinition != contentDefinition) {
			NotificationChain msgs = null;
			if (contentDefinition != null)
				msgs = ((InternalEObject)contentDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__CONTENT_DEFINITION, null, msgs);
			if (newContentDefinition != null)
				msgs = ((InternalEObject)newContentDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__CONTENT_DEFINITION, null, msgs);
			msgs = basicSetContentDefinition(newContentDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__CONTENT_DEFINITION, newContentDefinition, newContentDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContractTerm> getTerm() {
		if (term == null) {
			term = new EObjectContainmentEList<ContractTerm>(ContractTerm.class, this, FhirPackage.CONTRACT__TERM);
		}
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSupportingInfo() {
		if (supportingInfo == null) {
			supportingInfo = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CONTRACT__SUPPORTING_INFO);
		}
		return supportingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getRelevantHistory() {
		if (relevantHistory == null) {
			relevantHistory = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CONTRACT__RELEVANT_HISTORY);
		}
		return relevantHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContractSigner> getSigner() {
		if (signer == null) {
			signer = new EObjectContainmentEList<ContractSigner>(ContractSigner.class, this, FhirPackage.CONTRACT__SIGNER);
		}
		return signer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContractFriendly> getFriendly() {
		if (friendly == null) {
			friendly = new EObjectContainmentEList<ContractFriendly>(ContractFriendly.class, this, FhirPackage.CONTRACT__FRIENDLY);
		}
		return friendly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContractLegal> getLegal() {
		if (legal == null) {
			legal = new EObjectContainmentEList<ContractLegal>(ContractLegal.class, this, FhirPackage.CONTRACT__LEGAL);
		}
		return legal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContractRule> getRule() {
		if (rule == null) {
			rule = new EObjectContainmentEList<ContractRule>(ContractRule.class, this, FhirPackage.CONTRACT__RULE);
		}
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attachment getLegallyBindingAttachment() {
		return legallyBindingAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLegallyBindingAttachment(Attachment newLegallyBindingAttachment, NotificationChain msgs) {
		Attachment oldLegallyBindingAttachment = legallyBindingAttachment;
		legallyBindingAttachment = newLegallyBindingAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__LEGALLY_BINDING_ATTACHMENT, oldLegallyBindingAttachment, newLegallyBindingAttachment);
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
	public void setLegallyBindingAttachment(Attachment newLegallyBindingAttachment) {
		if (newLegallyBindingAttachment != legallyBindingAttachment) {
			NotificationChain msgs = null;
			if (legallyBindingAttachment != null)
				msgs = ((InternalEObject)legallyBindingAttachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__LEGALLY_BINDING_ATTACHMENT, null, msgs);
			if (newLegallyBindingAttachment != null)
				msgs = ((InternalEObject)newLegallyBindingAttachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__LEGALLY_BINDING_ATTACHMENT, null, msgs);
			msgs = basicSetLegallyBindingAttachment(newLegallyBindingAttachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__LEGALLY_BINDING_ATTACHMENT, newLegallyBindingAttachment, newLegallyBindingAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getLegallyBindingReference() {
		return legallyBindingReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLegallyBindingReference(Reference newLegallyBindingReference, NotificationChain msgs) {
		Reference oldLegallyBindingReference = legallyBindingReference;
		legallyBindingReference = newLegallyBindingReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__LEGALLY_BINDING_REFERENCE, oldLegallyBindingReference, newLegallyBindingReference);
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
	public void setLegallyBindingReference(Reference newLegallyBindingReference) {
		if (newLegallyBindingReference != legallyBindingReference) {
			NotificationChain msgs = null;
			if (legallyBindingReference != null)
				msgs = ((InternalEObject)legallyBindingReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__LEGALLY_BINDING_REFERENCE, null, msgs);
			if (newLegallyBindingReference != null)
				msgs = ((InternalEObject)newLegallyBindingReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__LEGALLY_BINDING_REFERENCE, null, msgs);
			msgs = basicSetLegallyBindingReference(newLegallyBindingReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__LEGALLY_BINDING_REFERENCE, newLegallyBindingReference, newLegallyBindingReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CONTRACT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT__URL:
				return basicSetUrl(null, msgs);
			case FhirPackage.CONTRACT__VERSION:
				return basicSetVersion(null, msgs);
			case FhirPackage.CONTRACT__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.CONTRACT__LEGAL_STATE:
				return basicSetLegalState(null, msgs);
			case FhirPackage.CONTRACT__INSTANTIATES_CANONICAL:
				return basicSetInstantiatesCanonical(null, msgs);
			case FhirPackage.CONTRACT__INSTANTIATES_URI:
				return basicSetInstantiatesUri(null, msgs);
			case FhirPackage.CONTRACT__CONTENT_DERIVATIVE:
				return basicSetContentDerivative(null, msgs);
			case FhirPackage.CONTRACT__ISSUED:
				return basicSetIssued(null, msgs);
			case FhirPackage.CONTRACT__APPLIES:
				return basicSetApplies(null, msgs);
			case FhirPackage.CONTRACT__EXPIRATION_TYPE:
				return basicSetExpirationType(null, msgs);
			case FhirPackage.CONTRACT__SUBJECT:
				return ((InternalEList<?>)getSubject()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT__AUTHORITY:
				return ((InternalEList<?>)getAuthority()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT__DOMAIN:
				return ((InternalEList<?>)getDomain()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT__SITE:
				return ((InternalEList<?>)getSite()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.CONTRACT__TITLE:
				return basicSetTitle(null, msgs);
			case FhirPackage.CONTRACT__SUBTITLE:
				return basicSetSubtitle(null, msgs);
			case FhirPackage.CONTRACT__ALIAS:
				return ((InternalEList<?>)getAlias()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT__AUTHOR:
				return basicSetAuthor(null, msgs);
			case FhirPackage.CONTRACT__SCOPE:
				return basicSetScope(null, msgs);
			case FhirPackage.CONTRACT__TOPIC_CODEABLE_CONCEPT:
				return basicSetTopicCodeableConcept(null, msgs);
			case FhirPackage.CONTRACT__TOPIC_REFERENCE:
				return basicSetTopicReference(null, msgs);
			case FhirPackage.CONTRACT__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.CONTRACT__SUB_TYPE:
				return ((InternalEList<?>)getSubType()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT__CONTENT_DEFINITION:
				return basicSetContentDefinition(null, msgs);
			case FhirPackage.CONTRACT__TERM:
				return ((InternalEList<?>)getTerm()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT__SUPPORTING_INFO:
				return ((InternalEList<?>)getSupportingInfo()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT__RELEVANT_HISTORY:
				return ((InternalEList<?>)getRelevantHistory()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT__SIGNER:
				return ((InternalEList<?>)getSigner()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT__FRIENDLY:
				return ((InternalEList<?>)getFriendly()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT__LEGAL:
				return ((InternalEList<?>)getLegal()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT__RULE:
				return ((InternalEList<?>)getRule()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT__LEGALLY_BINDING_ATTACHMENT:
				return basicSetLegallyBindingAttachment(null, msgs);
			case FhirPackage.CONTRACT__LEGALLY_BINDING_REFERENCE:
				return basicSetLegallyBindingReference(null, msgs);
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
			case FhirPackage.CONTRACT__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.CONTRACT__URL:
				return getUrl();
			case FhirPackage.CONTRACT__VERSION:
				return getVersion();
			case FhirPackage.CONTRACT__STATUS:
				return getStatus();
			case FhirPackage.CONTRACT__LEGAL_STATE:
				return getLegalState();
			case FhirPackage.CONTRACT__INSTANTIATES_CANONICAL:
				return getInstantiatesCanonical();
			case FhirPackage.CONTRACT__INSTANTIATES_URI:
				return getInstantiatesUri();
			case FhirPackage.CONTRACT__CONTENT_DERIVATIVE:
				return getContentDerivative();
			case FhirPackage.CONTRACT__ISSUED:
				return getIssued();
			case FhirPackage.CONTRACT__APPLIES:
				return getApplies();
			case FhirPackage.CONTRACT__EXPIRATION_TYPE:
				return getExpirationType();
			case FhirPackage.CONTRACT__SUBJECT:
				return getSubject();
			case FhirPackage.CONTRACT__AUTHORITY:
				return getAuthority();
			case FhirPackage.CONTRACT__DOMAIN:
				return getDomain();
			case FhirPackage.CONTRACT__SITE:
				return getSite();
			case FhirPackage.CONTRACT__NAME:
				return getName();
			case FhirPackage.CONTRACT__TITLE:
				return getTitle();
			case FhirPackage.CONTRACT__SUBTITLE:
				return getSubtitle();
			case FhirPackage.CONTRACT__ALIAS:
				return getAlias();
			case FhirPackage.CONTRACT__AUTHOR:
				return getAuthor();
			case FhirPackage.CONTRACT__SCOPE:
				return getScope();
			case FhirPackage.CONTRACT__TOPIC_CODEABLE_CONCEPT:
				return getTopicCodeableConcept();
			case FhirPackage.CONTRACT__TOPIC_REFERENCE:
				return getTopicReference();
			case FhirPackage.CONTRACT__TYPE:
				return getType();
			case FhirPackage.CONTRACT__SUB_TYPE:
				return getSubType();
			case FhirPackage.CONTRACT__CONTENT_DEFINITION:
				return getContentDefinition();
			case FhirPackage.CONTRACT__TERM:
				return getTerm();
			case FhirPackage.CONTRACT__SUPPORTING_INFO:
				return getSupportingInfo();
			case FhirPackage.CONTRACT__RELEVANT_HISTORY:
				return getRelevantHistory();
			case FhirPackage.CONTRACT__SIGNER:
				return getSigner();
			case FhirPackage.CONTRACT__FRIENDLY:
				return getFriendly();
			case FhirPackage.CONTRACT__LEGAL:
				return getLegal();
			case FhirPackage.CONTRACT__RULE:
				return getRule();
			case FhirPackage.CONTRACT__LEGALLY_BINDING_ATTACHMENT:
				return getLegallyBindingAttachment();
			case FhirPackage.CONTRACT__LEGALLY_BINDING_REFERENCE:
				return getLegallyBindingReference();
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
			case FhirPackage.CONTRACT__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.CONTRACT__URL:
				setUrl((Uri)newValue);
				return;
			case FhirPackage.CONTRACT__VERSION:
				setVersion((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CONTRACT__STATUS:
				setStatus((ContractResourceStatusCodes)newValue);
				return;
			case FhirPackage.CONTRACT__LEGAL_STATE:
				setLegalState((CodeableConcept)newValue);
				return;
			case FhirPackage.CONTRACT__INSTANTIATES_CANONICAL:
				setInstantiatesCanonical((Reference)newValue);
				return;
			case FhirPackage.CONTRACT__INSTANTIATES_URI:
				setInstantiatesUri((Uri)newValue);
				return;
			case FhirPackage.CONTRACT__CONTENT_DERIVATIVE:
				setContentDerivative((CodeableConcept)newValue);
				return;
			case FhirPackage.CONTRACT__ISSUED:
				setIssued((DateTime)newValue);
				return;
			case FhirPackage.CONTRACT__APPLIES:
				setApplies((Period)newValue);
				return;
			case FhirPackage.CONTRACT__EXPIRATION_TYPE:
				setExpirationType((CodeableConcept)newValue);
				return;
			case FhirPackage.CONTRACT__SUBJECT:
				getSubject().clear();
				getSubject().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CONTRACT__AUTHORITY:
				getAuthority().clear();
				getAuthority().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CONTRACT__DOMAIN:
				getDomain().clear();
				getDomain().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CONTRACT__SITE:
				getSite().clear();
				getSite().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CONTRACT__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CONTRACT__TITLE:
				setTitle((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CONTRACT__SUBTITLE:
				setSubtitle((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CONTRACT__ALIAS:
				getAlias().clear();
				getAlias().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.CONTRACT__AUTHOR:
				setAuthor((Reference)newValue);
				return;
			case FhirPackage.CONTRACT__SCOPE:
				setScope((CodeableConcept)newValue);
				return;
			case FhirPackage.CONTRACT__TOPIC_CODEABLE_CONCEPT:
				setTopicCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.CONTRACT__TOPIC_REFERENCE:
				setTopicReference((Reference)newValue);
				return;
			case FhirPackage.CONTRACT__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.CONTRACT__SUB_TYPE:
				getSubType().clear();
				getSubType().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CONTRACT__CONTENT_DEFINITION:
				setContentDefinition((ContractContentDefinition)newValue);
				return;
			case FhirPackage.CONTRACT__TERM:
				getTerm().clear();
				getTerm().addAll((Collection<? extends ContractTerm>)newValue);
				return;
			case FhirPackage.CONTRACT__SUPPORTING_INFO:
				getSupportingInfo().clear();
				getSupportingInfo().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CONTRACT__RELEVANT_HISTORY:
				getRelevantHistory().clear();
				getRelevantHistory().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CONTRACT__SIGNER:
				getSigner().clear();
				getSigner().addAll((Collection<? extends ContractSigner>)newValue);
				return;
			case FhirPackage.CONTRACT__FRIENDLY:
				getFriendly().clear();
				getFriendly().addAll((Collection<? extends ContractFriendly>)newValue);
				return;
			case FhirPackage.CONTRACT__LEGAL:
				getLegal().clear();
				getLegal().addAll((Collection<? extends ContractLegal>)newValue);
				return;
			case FhirPackage.CONTRACT__RULE:
				getRule().clear();
				getRule().addAll((Collection<? extends ContractRule>)newValue);
				return;
			case FhirPackage.CONTRACT__LEGALLY_BINDING_ATTACHMENT:
				setLegallyBindingAttachment((Attachment)newValue);
				return;
			case FhirPackage.CONTRACT__LEGALLY_BINDING_REFERENCE:
				setLegallyBindingReference((Reference)newValue);
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
			case FhirPackage.CONTRACT__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.CONTRACT__URL:
				setUrl((Uri)null);
				return;
			case FhirPackage.CONTRACT__VERSION:
				setVersion((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CONTRACT__STATUS:
				setStatus((ContractResourceStatusCodes)null);
				return;
			case FhirPackage.CONTRACT__LEGAL_STATE:
				setLegalState((CodeableConcept)null);
				return;
			case FhirPackage.CONTRACT__INSTANTIATES_CANONICAL:
				setInstantiatesCanonical((Reference)null);
				return;
			case FhirPackage.CONTRACT__INSTANTIATES_URI:
				setInstantiatesUri((Uri)null);
				return;
			case FhirPackage.CONTRACT__CONTENT_DERIVATIVE:
				setContentDerivative((CodeableConcept)null);
				return;
			case FhirPackage.CONTRACT__ISSUED:
				setIssued((DateTime)null);
				return;
			case FhirPackage.CONTRACT__APPLIES:
				setApplies((Period)null);
				return;
			case FhirPackage.CONTRACT__EXPIRATION_TYPE:
				setExpirationType((CodeableConcept)null);
				return;
			case FhirPackage.CONTRACT__SUBJECT:
				getSubject().clear();
				return;
			case FhirPackage.CONTRACT__AUTHORITY:
				getAuthority().clear();
				return;
			case FhirPackage.CONTRACT__DOMAIN:
				getDomain().clear();
				return;
			case FhirPackage.CONTRACT__SITE:
				getSite().clear();
				return;
			case FhirPackage.CONTRACT__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CONTRACT__TITLE:
				setTitle((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CONTRACT__SUBTITLE:
				setSubtitle((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CONTRACT__ALIAS:
				getAlias().clear();
				return;
			case FhirPackage.CONTRACT__AUTHOR:
				setAuthor((Reference)null);
				return;
			case FhirPackage.CONTRACT__SCOPE:
				setScope((CodeableConcept)null);
				return;
			case FhirPackage.CONTRACT__TOPIC_CODEABLE_CONCEPT:
				setTopicCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.CONTRACT__TOPIC_REFERENCE:
				setTopicReference((Reference)null);
				return;
			case FhirPackage.CONTRACT__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.CONTRACT__SUB_TYPE:
				getSubType().clear();
				return;
			case FhirPackage.CONTRACT__CONTENT_DEFINITION:
				setContentDefinition((ContractContentDefinition)null);
				return;
			case FhirPackage.CONTRACT__TERM:
				getTerm().clear();
				return;
			case FhirPackage.CONTRACT__SUPPORTING_INFO:
				getSupportingInfo().clear();
				return;
			case FhirPackage.CONTRACT__RELEVANT_HISTORY:
				getRelevantHistory().clear();
				return;
			case FhirPackage.CONTRACT__SIGNER:
				getSigner().clear();
				return;
			case FhirPackage.CONTRACT__FRIENDLY:
				getFriendly().clear();
				return;
			case FhirPackage.CONTRACT__LEGAL:
				getLegal().clear();
				return;
			case FhirPackage.CONTRACT__RULE:
				getRule().clear();
				return;
			case FhirPackage.CONTRACT__LEGALLY_BINDING_ATTACHMENT:
				setLegallyBindingAttachment((Attachment)null);
				return;
			case FhirPackage.CONTRACT__LEGALLY_BINDING_REFERENCE:
				setLegallyBindingReference((Reference)null);
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
			case FhirPackage.CONTRACT__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.CONTRACT__URL:
				return url != null;
			case FhirPackage.CONTRACT__VERSION:
				return version != null;
			case FhirPackage.CONTRACT__STATUS:
				return status != null;
			case FhirPackage.CONTRACT__LEGAL_STATE:
				return legalState != null;
			case FhirPackage.CONTRACT__INSTANTIATES_CANONICAL:
				return instantiatesCanonical != null;
			case FhirPackage.CONTRACT__INSTANTIATES_URI:
				return instantiatesUri != null;
			case FhirPackage.CONTRACT__CONTENT_DERIVATIVE:
				return contentDerivative != null;
			case FhirPackage.CONTRACT__ISSUED:
				return issued != null;
			case FhirPackage.CONTRACT__APPLIES:
				return applies != null;
			case FhirPackage.CONTRACT__EXPIRATION_TYPE:
				return expirationType != null;
			case FhirPackage.CONTRACT__SUBJECT:
				return subject != null && !subject.isEmpty();
			case FhirPackage.CONTRACT__AUTHORITY:
				return authority != null && !authority.isEmpty();
			case FhirPackage.CONTRACT__DOMAIN:
				return domain != null && !domain.isEmpty();
			case FhirPackage.CONTRACT__SITE:
				return site != null && !site.isEmpty();
			case FhirPackage.CONTRACT__NAME:
				return name != null;
			case FhirPackage.CONTRACT__TITLE:
				return title != null;
			case FhirPackage.CONTRACT__SUBTITLE:
				return subtitle != null;
			case FhirPackage.CONTRACT__ALIAS:
				return alias != null && !alias.isEmpty();
			case FhirPackage.CONTRACT__AUTHOR:
				return author != null;
			case FhirPackage.CONTRACT__SCOPE:
				return scope != null;
			case FhirPackage.CONTRACT__TOPIC_CODEABLE_CONCEPT:
				return topicCodeableConcept != null;
			case FhirPackage.CONTRACT__TOPIC_REFERENCE:
				return topicReference != null;
			case FhirPackage.CONTRACT__TYPE:
				return type != null;
			case FhirPackage.CONTRACT__SUB_TYPE:
				return subType != null && !subType.isEmpty();
			case FhirPackage.CONTRACT__CONTENT_DEFINITION:
				return contentDefinition != null;
			case FhirPackage.CONTRACT__TERM:
				return term != null && !term.isEmpty();
			case FhirPackage.CONTRACT__SUPPORTING_INFO:
				return supportingInfo != null && !supportingInfo.isEmpty();
			case FhirPackage.CONTRACT__RELEVANT_HISTORY:
				return relevantHistory != null && !relevantHistory.isEmpty();
			case FhirPackage.CONTRACT__SIGNER:
				return signer != null && !signer.isEmpty();
			case FhirPackage.CONTRACT__FRIENDLY:
				return friendly != null && !friendly.isEmpty();
			case FhirPackage.CONTRACT__LEGAL:
				return legal != null && !legal.isEmpty();
			case FhirPackage.CONTRACT__RULE:
				return rule != null && !rule.isEmpty();
			case FhirPackage.CONTRACT__LEGALLY_BINDING_ATTACHMENT:
				return legallyBindingAttachment != null;
			case FhirPackage.CONTRACT__LEGALLY_BINDING_REFERENCE:
				return legallyBindingReference != null;
		}
		return super.eIsSet(featureID);
	}

} //ContractImpl
