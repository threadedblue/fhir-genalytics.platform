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

import org.hl7.fhir.CapabilityStatementKind;
import org.hl7.fhir.CodeSearchSupport;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.ContactDetail;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.PublicationStatus;
import org.hl7.fhir.TerminologyCapabilities;
import org.hl7.fhir.TerminologyCapabilitiesClosure;
import org.hl7.fhir.TerminologyCapabilitiesCodeSystem;
import org.hl7.fhir.TerminologyCapabilitiesExpansion;
import org.hl7.fhir.TerminologyCapabilitiesImplementation;
import org.hl7.fhir.TerminologyCapabilitiesSoftware;
import org.hl7.fhir.TerminologyCapabilitiesTranslation;
import org.hl7.fhir.TerminologyCapabilitiesValidateCode;
import org.hl7.fhir.Uri;
import org.hl7.fhir.UsageContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminology Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.TerminologyCapabilitiesImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TerminologyCapabilitiesImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TerminologyCapabilitiesImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TerminologyCapabilitiesImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TerminologyCapabilitiesImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TerminologyCapabilitiesImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TerminologyCapabilitiesImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TerminologyCapabilitiesImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TerminologyCapabilitiesImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TerminologyCapabilitiesImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TerminologyCapabilitiesImpl#getUseContext <em>Use Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TerminologyCapabilitiesImpl#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TerminologyCapabilitiesImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TerminologyCapabilitiesImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TerminologyCapabilitiesImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TerminologyCapabilitiesImpl#getSoftware <em>Software</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TerminologyCapabilitiesImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TerminologyCapabilitiesImpl#getLockedDate <em>Locked Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TerminologyCapabilitiesImpl#getCodeSystem <em>Code System</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TerminologyCapabilitiesImpl#getExpansion <em>Expansion</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TerminologyCapabilitiesImpl#getCodeSearch <em>Code Search</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TerminologyCapabilitiesImpl#getValidateCode <em>Validate Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TerminologyCapabilitiesImpl#getTranslation <em>Translation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TerminologyCapabilitiesImpl#getClosure <em>Closure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TerminologyCapabilitiesImpl extends DomainResourceImpl implements TerminologyCapabilities {
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
	 * The cached value of the '{@link #getExperimental() <em>Experimental</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperimental()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean experimental;

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
	 * The cached value of the '{@link #getCopyright() <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected Markdown copyright;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected CapabilityStatementKind kind;

	/**
	 * The cached value of the '{@link #getSoftware() <em>Software</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftware()
	 * @generated
	 * @ordered
	 */
	protected TerminologyCapabilitiesSoftware software;

	/**
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected TerminologyCapabilitiesImplementation implementation;

	/**
	 * The cached value of the '{@link #getLockedDate() <em>Locked Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockedDate()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean lockedDate;

	/**
	 * The cached value of the '{@link #getCodeSystem() <em>Code System</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSystem()
	 * @generated
	 * @ordered
	 */
	protected EList<TerminologyCapabilitiesCodeSystem> codeSystem;

	/**
	 * The cached value of the '{@link #getExpansion() <em>Expansion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpansion()
	 * @generated
	 * @ordered
	 */
	protected TerminologyCapabilitiesExpansion expansion;

	/**
	 * The cached value of the '{@link #getCodeSearch() <em>Code Search</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSearch()
	 * @generated
	 * @ordered
	 */
	protected CodeSearchSupport codeSearch;

	/**
	 * The cached value of the '{@link #getValidateCode() <em>Validate Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidateCode()
	 * @generated
	 * @ordered
	 */
	protected TerminologyCapabilitiesValidateCode validateCode;

	/**
	 * The cached value of the '{@link #getTranslation() <em>Translation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslation()
	 * @generated
	 * @ordered
	 */
	protected TerminologyCapabilitiesTranslation translation;

	/**
	 * The cached value of the '{@link #getClosure() <em>Closure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosure()
	 * @generated
	 * @ordered
	 */
	protected TerminologyCapabilitiesClosure closure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminologyCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getTerminologyCapabilities();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES__URL, oldUrl, newUrl);
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
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES__URL, newUrl, newUrl));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES__VERSION, oldVersion, newVersion);
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
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES__VERSION, newVersion, newVersion));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES__NAME, newName, newName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES__TITLE, oldTitle, newTitle);
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
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES__TITLE, newTitle, newTitle));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES__EXPERIMENTAL, oldExperimental, newExperimental);
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
				msgs = ((InternalEObject)experimental).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES__EXPERIMENTAL, null, msgs);
			if (newExperimental != null)
				msgs = ((InternalEObject)newExperimental).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES__EXPERIMENTAL, null, msgs);
			msgs = basicSetExperimental(newExperimental, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES__EXPERIMENTAL, newExperimental, newExperimental));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES__DATE, newDate, newDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES__PUBLISHER, oldPublisher, newPublisher);
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
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactDetail> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FhirPackage.TERMINOLOGY_CAPABILITIES__CONTACT);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UsageContext> getUseContext() {
		if (useContext == null) {
			useContext = new EObjectContainmentEList<UsageContext>(UsageContext.class, this, FhirPackage.TERMINOLOGY_CAPABILITIES__USE_CONTEXT);
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
			jurisdiction = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.TERMINOLOGY_CAPABILITIES__JURISDICTION);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES__PURPOSE, oldPurpose, newPurpose);
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
				msgs = ((InternalEObject)purpose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES__PURPOSE, null, msgs);
			if (newPurpose != null)
				msgs = ((InternalEObject)newPurpose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES__PURPOSE, null, msgs);
			msgs = basicSetPurpose(newPurpose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES__PURPOSE, newPurpose, newPurpose));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES__COPYRIGHT, oldCopyright, newCopyright);
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
				msgs = ((InternalEObject)copyright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES__COPYRIGHT, null, msgs);
			if (newCopyright != null)
				msgs = ((InternalEObject)newCopyright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES__COPYRIGHT, null, msgs);
			msgs = basicSetCopyright(newCopyright, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES__COPYRIGHT, newCopyright, newCopyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityStatementKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKind(CapabilityStatementKind newKind, NotificationChain msgs) {
		CapabilityStatementKind oldKind = kind;
		kind = newKind;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES__KIND, oldKind, newKind);
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
	public void setKind(CapabilityStatementKind newKind) {
		if (newKind != kind) {
			NotificationChain msgs = null;
			if (kind != null)
				msgs = ((InternalEObject)kind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES__KIND, null, msgs);
			if (newKind != null)
				msgs = ((InternalEObject)newKind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES__KIND, null, msgs);
			msgs = basicSetKind(newKind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES__KIND, newKind, newKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminologyCapabilitiesSoftware getSoftware() {
		return software;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoftware(TerminologyCapabilitiesSoftware newSoftware, NotificationChain msgs) {
		TerminologyCapabilitiesSoftware oldSoftware = software;
		software = newSoftware;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES__SOFTWARE, oldSoftware, newSoftware);
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
	public void setSoftware(TerminologyCapabilitiesSoftware newSoftware) {
		if (newSoftware != software) {
			NotificationChain msgs = null;
			if (software != null)
				msgs = ((InternalEObject)software).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES__SOFTWARE, null, msgs);
			if (newSoftware != null)
				msgs = ((InternalEObject)newSoftware).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES__SOFTWARE, null, msgs);
			msgs = basicSetSoftware(newSoftware, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES__SOFTWARE, newSoftware, newSoftware));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminologyCapabilitiesImplementation getImplementation() {
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementation(TerminologyCapabilitiesImplementation newImplementation, NotificationChain msgs) {
		TerminologyCapabilitiesImplementation oldImplementation = implementation;
		implementation = newImplementation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES__IMPLEMENTATION, oldImplementation, newImplementation);
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
	public void setImplementation(TerminologyCapabilitiesImplementation newImplementation) {
		if (newImplementation != implementation) {
			NotificationChain msgs = null;
			if (implementation != null)
				msgs = ((InternalEObject)implementation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES__IMPLEMENTATION, null, msgs);
			if (newImplementation != null)
				msgs = ((InternalEObject)newImplementation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES__IMPLEMENTATION, null, msgs);
			msgs = basicSetImplementation(newImplementation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES__IMPLEMENTATION, newImplementation, newImplementation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getLockedDate() {
		return lockedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLockedDate(org.hl7.fhir.Boolean newLockedDate, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldLockedDate = lockedDate;
		lockedDate = newLockedDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES__LOCKED_DATE, oldLockedDate, newLockedDate);
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
	public void setLockedDate(org.hl7.fhir.Boolean newLockedDate) {
		if (newLockedDate != lockedDate) {
			NotificationChain msgs = null;
			if (lockedDate != null)
				msgs = ((InternalEObject)lockedDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES__LOCKED_DATE, null, msgs);
			if (newLockedDate != null)
				msgs = ((InternalEObject)newLockedDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES__LOCKED_DATE, null, msgs);
			msgs = basicSetLockedDate(newLockedDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES__LOCKED_DATE, newLockedDate, newLockedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TerminologyCapabilitiesCodeSystem> getCodeSystem() {
		if (codeSystem == null) {
			codeSystem = new EObjectContainmentEList<TerminologyCapabilitiesCodeSystem>(TerminologyCapabilitiesCodeSystem.class, this, FhirPackage.TERMINOLOGY_CAPABILITIES__CODE_SYSTEM);
		}
		return codeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminologyCapabilitiesExpansion getExpansion() {
		return expansion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpansion(TerminologyCapabilitiesExpansion newExpansion, NotificationChain msgs) {
		TerminologyCapabilitiesExpansion oldExpansion = expansion;
		expansion = newExpansion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES__EXPANSION, oldExpansion, newExpansion);
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
	public void setExpansion(TerminologyCapabilitiesExpansion newExpansion) {
		if (newExpansion != expansion) {
			NotificationChain msgs = null;
			if (expansion != null)
				msgs = ((InternalEObject)expansion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES__EXPANSION, null, msgs);
			if (newExpansion != null)
				msgs = ((InternalEObject)newExpansion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES__EXPANSION, null, msgs);
			msgs = basicSetExpansion(newExpansion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES__EXPANSION, newExpansion, newExpansion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeSearchSupport getCodeSearch() {
		return codeSearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCodeSearch(CodeSearchSupport newCodeSearch, NotificationChain msgs) {
		CodeSearchSupport oldCodeSearch = codeSearch;
		codeSearch = newCodeSearch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES__CODE_SEARCH, oldCodeSearch, newCodeSearch);
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
	public void setCodeSearch(CodeSearchSupport newCodeSearch) {
		if (newCodeSearch != codeSearch) {
			NotificationChain msgs = null;
			if (codeSearch != null)
				msgs = ((InternalEObject)codeSearch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES__CODE_SEARCH, null, msgs);
			if (newCodeSearch != null)
				msgs = ((InternalEObject)newCodeSearch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES__CODE_SEARCH, null, msgs);
			msgs = basicSetCodeSearch(newCodeSearch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES__CODE_SEARCH, newCodeSearch, newCodeSearch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminologyCapabilitiesValidateCode getValidateCode() {
		return validateCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidateCode(TerminologyCapabilitiesValidateCode newValidateCode, NotificationChain msgs) {
		TerminologyCapabilitiesValidateCode oldValidateCode = validateCode;
		validateCode = newValidateCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES__VALIDATE_CODE, oldValidateCode, newValidateCode);
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
	public void setValidateCode(TerminologyCapabilitiesValidateCode newValidateCode) {
		if (newValidateCode != validateCode) {
			NotificationChain msgs = null;
			if (validateCode != null)
				msgs = ((InternalEObject)validateCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES__VALIDATE_CODE, null, msgs);
			if (newValidateCode != null)
				msgs = ((InternalEObject)newValidateCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES__VALIDATE_CODE, null, msgs);
			msgs = basicSetValidateCode(newValidateCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES__VALIDATE_CODE, newValidateCode, newValidateCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminologyCapabilitiesTranslation getTranslation() {
		return translation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTranslation(TerminologyCapabilitiesTranslation newTranslation, NotificationChain msgs) {
		TerminologyCapabilitiesTranslation oldTranslation = translation;
		translation = newTranslation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES__TRANSLATION, oldTranslation, newTranslation);
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
	public void setTranslation(TerminologyCapabilitiesTranslation newTranslation) {
		if (newTranslation != translation) {
			NotificationChain msgs = null;
			if (translation != null)
				msgs = ((InternalEObject)translation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES__TRANSLATION, null, msgs);
			if (newTranslation != null)
				msgs = ((InternalEObject)newTranslation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES__TRANSLATION, null, msgs);
			msgs = basicSetTranslation(newTranslation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES__TRANSLATION, newTranslation, newTranslation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminologyCapabilitiesClosure getClosure() {
		return closure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClosure(TerminologyCapabilitiesClosure newClosure, NotificationChain msgs) {
		TerminologyCapabilitiesClosure oldClosure = closure;
		closure = newClosure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES__CLOSURE, oldClosure, newClosure);
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
	public void setClosure(TerminologyCapabilitiesClosure newClosure) {
		if (newClosure != closure) {
			NotificationChain msgs = null;
			if (closure != null)
				msgs = ((InternalEObject)closure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES__CLOSURE, null, msgs);
			if (newClosure != null)
				msgs = ((InternalEObject)newClosure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES__CLOSURE, null, msgs);
			msgs = basicSetClosure(newClosure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES__CLOSURE, newClosure, newClosure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.TERMINOLOGY_CAPABILITIES__URL:
				return basicSetUrl(null, msgs);
			case FhirPackage.TERMINOLOGY_CAPABILITIES__VERSION:
				return basicSetVersion(null, msgs);
			case FhirPackage.TERMINOLOGY_CAPABILITIES__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.TERMINOLOGY_CAPABILITIES__TITLE:
				return basicSetTitle(null, msgs);
			case FhirPackage.TERMINOLOGY_CAPABILITIES__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.TERMINOLOGY_CAPABILITIES__EXPERIMENTAL:
				return basicSetExperimental(null, msgs);
			case FhirPackage.TERMINOLOGY_CAPABILITIES__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.TERMINOLOGY_CAPABILITIES__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case FhirPackage.TERMINOLOGY_CAPABILITIES__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case FhirPackage.TERMINOLOGY_CAPABILITIES__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.TERMINOLOGY_CAPABILITIES__USE_CONTEXT:
				return ((InternalEList<?>)getUseContext()).basicRemove(otherEnd, msgs);
			case FhirPackage.TERMINOLOGY_CAPABILITIES__JURISDICTION:
				return ((InternalEList<?>)getJurisdiction()).basicRemove(otherEnd, msgs);
			case FhirPackage.TERMINOLOGY_CAPABILITIES__PURPOSE:
				return basicSetPurpose(null, msgs);
			case FhirPackage.TERMINOLOGY_CAPABILITIES__COPYRIGHT:
				return basicSetCopyright(null, msgs);
			case FhirPackage.TERMINOLOGY_CAPABILITIES__KIND:
				return basicSetKind(null, msgs);
			case FhirPackage.TERMINOLOGY_CAPABILITIES__SOFTWARE:
				return basicSetSoftware(null, msgs);
			case FhirPackage.TERMINOLOGY_CAPABILITIES__IMPLEMENTATION:
				return basicSetImplementation(null, msgs);
			case FhirPackage.TERMINOLOGY_CAPABILITIES__LOCKED_DATE:
				return basicSetLockedDate(null, msgs);
			case FhirPackage.TERMINOLOGY_CAPABILITIES__CODE_SYSTEM:
				return ((InternalEList<?>)getCodeSystem()).basicRemove(otherEnd, msgs);
			case FhirPackage.TERMINOLOGY_CAPABILITIES__EXPANSION:
				return basicSetExpansion(null, msgs);
			case FhirPackage.TERMINOLOGY_CAPABILITIES__CODE_SEARCH:
				return basicSetCodeSearch(null, msgs);
			case FhirPackage.TERMINOLOGY_CAPABILITIES__VALIDATE_CODE:
				return basicSetValidateCode(null, msgs);
			case FhirPackage.TERMINOLOGY_CAPABILITIES__TRANSLATION:
				return basicSetTranslation(null, msgs);
			case FhirPackage.TERMINOLOGY_CAPABILITIES__CLOSURE:
				return basicSetClosure(null, msgs);
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
			case FhirPackage.TERMINOLOGY_CAPABILITIES__URL:
				return getUrl();
			case FhirPackage.TERMINOLOGY_CAPABILITIES__VERSION:
				return getVersion();
			case FhirPackage.TERMINOLOGY_CAPABILITIES__NAME:
				return getName();
			case FhirPackage.TERMINOLOGY_CAPABILITIES__TITLE:
				return getTitle();
			case FhirPackage.TERMINOLOGY_CAPABILITIES__STATUS:
				return getStatus();
			case FhirPackage.TERMINOLOGY_CAPABILITIES__EXPERIMENTAL:
				return getExperimental();
			case FhirPackage.TERMINOLOGY_CAPABILITIES__DATE:
				return getDate();
			case FhirPackage.TERMINOLOGY_CAPABILITIES__PUBLISHER:
				return getPublisher();
			case FhirPackage.TERMINOLOGY_CAPABILITIES__CONTACT:
				return getContact();
			case FhirPackage.TERMINOLOGY_CAPABILITIES__DESCRIPTION:
				return getDescription();
			case FhirPackage.TERMINOLOGY_CAPABILITIES__USE_CONTEXT:
				return getUseContext();
			case FhirPackage.TERMINOLOGY_CAPABILITIES__JURISDICTION:
				return getJurisdiction();
			case FhirPackage.TERMINOLOGY_CAPABILITIES__PURPOSE:
				return getPurpose();
			case FhirPackage.TERMINOLOGY_CAPABILITIES__COPYRIGHT:
				return getCopyright();
			case FhirPackage.TERMINOLOGY_CAPABILITIES__KIND:
				return getKind();
			case FhirPackage.TERMINOLOGY_CAPABILITIES__SOFTWARE:
				return getSoftware();
			case FhirPackage.TERMINOLOGY_CAPABILITIES__IMPLEMENTATION:
				return getImplementation();
			case FhirPackage.TERMINOLOGY_CAPABILITIES__LOCKED_DATE:
				return getLockedDate();
			case FhirPackage.TERMINOLOGY_CAPABILITIES__CODE_SYSTEM:
				return getCodeSystem();
			case FhirPackage.TERMINOLOGY_CAPABILITIES__EXPANSION:
				return getExpansion();
			case FhirPackage.TERMINOLOGY_CAPABILITIES__CODE_SEARCH:
				return getCodeSearch();
			case FhirPackage.TERMINOLOGY_CAPABILITIES__VALIDATE_CODE:
				return getValidateCode();
			case FhirPackage.TERMINOLOGY_CAPABILITIES__TRANSLATION:
				return getTranslation();
			case FhirPackage.TERMINOLOGY_CAPABILITIES__CLOSURE:
				return getClosure();
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
			case FhirPackage.TERMINOLOGY_CAPABILITIES__URL:
				setUrl((Uri)newValue);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__VERSION:
				setVersion((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__TITLE:
				setTitle((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__STATUS:
				setStatus((PublicationStatus)newValue);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__EXPERIMENTAL:
				setExperimental((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__PUBLISHER:
				setPublisher((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__USE_CONTEXT:
				getUseContext().clear();
				getUseContext().addAll((Collection<? extends UsageContext>)newValue);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__JURISDICTION:
				getJurisdiction().clear();
				getJurisdiction().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__PURPOSE:
				setPurpose((Markdown)newValue);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__COPYRIGHT:
				setCopyright((Markdown)newValue);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__KIND:
				setKind((CapabilityStatementKind)newValue);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__SOFTWARE:
				setSoftware((TerminologyCapabilitiesSoftware)newValue);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__IMPLEMENTATION:
				setImplementation((TerminologyCapabilitiesImplementation)newValue);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__LOCKED_DATE:
				setLockedDate((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__CODE_SYSTEM:
				getCodeSystem().clear();
				getCodeSystem().addAll((Collection<? extends TerminologyCapabilitiesCodeSystem>)newValue);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__EXPANSION:
				setExpansion((TerminologyCapabilitiesExpansion)newValue);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__CODE_SEARCH:
				setCodeSearch((CodeSearchSupport)newValue);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__VALIDATE_CODE:
				setValidateCode((TerminologyCapabilitiesValidateCode)newValue);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__TRANSLATION:
				setTranslation((TerminologyCapabilitiesTranslation)newValue);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__CLOSURE:
				setClosure((TerminologyCapabilitiesClosure)newValue);
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
			case FhirPackage.TERMINOLOGY_CAPABILITIES__URL:
				setUrl((Uri)null);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__VERSION:
				setVersion((org.hl7.fhir.String)null);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__TITLE:
				setTitle((org.hl7.fhir.String)null);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__STATUS:
				setStatus((PublicationStatus)null);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__EXPERIMENTAL:
				setExperimental((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__PUBLISHER:
				setPublisher((org.hl7.fhir.String)null);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__CONTACT:
				getContact().clear();
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__USE_CONTEXT:
				getUseContext().clear();
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__JURISDICTION:
				getJurisdiction().clear();
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__PURPOSE:
				setPurpose((Markdown)null);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__COPYRIGHT:
				setCopyright((Markdown)null);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__KIND:
				setKind((CapabilityStatementKind)null);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__SOFTWARE:
				setSoftware((TerminologyCapabilitiesSoftware)null);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__IMPLEMENTATION:
				setImplementation((TerminologyCapabilitiesImplementation)null);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__LOCKED_DATE:
				setLockedDate((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__CODE_SYSTEM:
				getCodeSystem().clear();
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__EXPANSION:
				setExpansion((TerminologyCapabilitiesExpansion)null);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__CODE_SEARCH:
				setCodeSearch((CodeSearchSupport)null);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__VALIDATE_CODE:
				setValidateCode((TerminologyCapabilitiesValidateCode)null);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__TRANSLATION:
				setTranslation((TerminologyCapabilitiesTranslation)null);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__CLOSURE:
				setClosure((TerminologyCapabilitiesClosure)null);
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
			case FhirPackage.TERMINOLOGY_CAPABILITIES__URL:
				return url != null;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__VERSION:
				return version != null;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__NAME:
				return name != null;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__TITLE:
				return title != null;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__STATUS:
				return status != null;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__EXPERIMENTAL:
				return experimental != null;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__DATE:
				return date != null;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__PUBLISHER:
				return publisher != null;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__CONTACT:
				return contact != null && !contact.isEmpty();
			case FhirPackage.TERMINOLOGY_CAPABILITIES__DESCRIPTION:
				return description != null;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__USE_CONTEXT:
				return useContext != null && !useContext.isEmpty();
			case FhirPackage.TERMINOLOGY_CAPABILITIES__JURISDICTION:
				return jurisdiction != null && !jurisdiction.isEmpty();
			case FhirPackage.TERMINOLOGY_CAPABILITIES__PURPOSE:
				return purpose != null;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__COPYRIGHT:
				return copyright != null;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__KIND:
				return kind != null;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__SOFTWARE:
				return software != null;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__IMPLEMENTATION:
				return implementation != null;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__LOCKED_DATE:
				return lockedDate != null;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__CODE_SYSTEM:
				return codeSystem != null && !codeSystem.isEmpty();
			case FhirPackage.TERMINOLOGY_CAPABILITIES__EXPANSION:
				return expansion != null;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__CODE_SEARCH:
				return codeSearch != null;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__VALIDATE_CODE:
				return validateCode != null;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__TRANSLATION:
				return translation != null;
			case FhirPackage.TERMINOLOGY_CAPABILITIES__CLOSURE:
				return closure != null;
		}
		return super.eIsSet(featureID);
	}

} //TerminologyCapabilitiesImpl
