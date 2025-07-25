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
import org.hl7.fhir.CapabilityStatement;
import org.hl7.fhir.CapabilityStatementDocument;
import org.hl7.fhir.CapabilityStatementImplementation;
import org.hl7.fhir.CapabilityStatementKind;
import org.hl7.fhir.CapabilityStatementMessaging;
import org.hl7.fhir.CapabilityStatementRest;
import org.hl7.fhir.CapabilityStatementSoftware;
import org.hl7.fhir.Code;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.ContactDetail;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FHIRVersion;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.PublicationStatus;
import org.hl7.fhir.Uri;
import org.hl7.fhir.UsageContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementImpl#getUseContext <em>Use Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementImpl#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementImpl#getInstantiates <em>Instantiates</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementImpl#getSoftware <em>Software</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementImpl#getFhirVersion <em>Fhir Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementImpl#getPatchFormat <em>Patch Format</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementImpl#getImplementationGuide <em>Implementation Guide</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementImpl#getRest <em>Rest</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementImpl#getMessaging <em>Messaging</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementImpl#getDocument <em>Document</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityStatementImpl extends DomainResourceImpl implements CapabilityStatement {
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
	 * The cached value of the '{@link #getInstantiates() <em>Instantiates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiates()
	 * @generated
	 * @ordered
	 */
	protected EList<Canonical> instantiates;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Canonical> imports;

	/**
	 * The cached value of the '{@link #getSoftware() <em>Software</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftware()
	 * @generated
	 * @ordered
	 */
	protected CapabilityStatementSoftware software;

	/**
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected CapabilityStatementImplementation implementation;

	/**
	 * The cached value of the '{@link #getFhirVersion() <em>Fhir Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFhirVersion()
	 * @generated
	 * @ordered
	 */
	protected FHIRVersion fhirVersion;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> format;

	/**
	 * The cached value of the '{@link #getPatchFormat() <em>Patch Format</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatchFormat()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> patchFormat;

	/**
	 * The cached value of the '{@link #getImplementationGuide() <em>Implementation Guide</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationGuide()
	 * @generated
	 * @ordered
	 */
	protected EList<Canonical> implementationGuide;

	/**
	 * The cached value of the '{@link #getRest() <em>Rest</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRest()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityStatementRest> rest;

	/**
	 * The cached value of the '{@link #getMessaging() <em>Messaging</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessaging()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityStatementMessaging> messaging;

	/**
	 * The cached value of the '{@link #getDocument() <em>Document</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocument()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityStatementDocument> document;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCapabilityStatement();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT__URL, oldUrl, newUrl);
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
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT__URL, newUrl, newUrl));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT__VERSION, oldVersion, newVersion);
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
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT__VERSION, newVersion, newVersion));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT__NAME, newName, newName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT__TITLE, oldTitle, newTitle);
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
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT__TITLE, newTitle, newTitle));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT__EXPERIMENTAL, oldExperimental, newExperimental);
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
				msgs = ((InternalEObject)experimental).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT__EXPERIMENTAL, null, msgs);
			if (newExperimental != null)
				msgs = ((InternalEObject)newExperimental).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT__EXPERIMENTAL, null, msgs);
			msgs = basicSetExperimental(newExperimental, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT__EXPERIMENTAL, newExperimental, newExperimental));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT__DATE, newDate, newDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT__PUBLISHER, oldPublisher, newPublisher);
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
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactDetail> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FhirPackage.CAPABILITY_STATEMENT__CONTACT);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UsageContext> getUseContext() {
		if (useContext == null) {
			useContext = new EObjectContainmentEList<UsageContext>(UsageContext.class, this, FhirPackage.CAPABILITY_STATEMENT__USE_CONTEXT);
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
			jurisdiction = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CAPABILITY_STATEMENT__JURISDICTION);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT__PURPOSE, oldPurpose, newPurpose);
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
				msgs = ((InternalEObject)purpose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT__PURPOSE, null, msgs);
			if (newPurpose != null)
				msgs = ((InternalEObject)newPurpose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT__PURPOSE, null, msgs);
			msgs = basicSetPurpose(newPurpose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT__PURPOSE, newPurpose, newPurpose));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT__COPYRIGHT, oldCopyright, newCopyright);
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
				msgs = ((InternalEObject)copyright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT__COPYRIGHT, null, msgs);
			if (newCopyright != null)
				msgs = ((InternalEObject)newCopyright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT__COPYRIGHT, null, msgs);
			msgs = basicSetCopyright(newCopyright, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT__COPYRIGHT, newCopyright, newCopyright));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT__KIND, oldKind, newKind);
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
				msgs = ((InternalEObject)kind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT__KIND, null, msgs);
			if (newKind != null)
				msgs = ((InternalEObject)newKind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT__KIND, null, msgs);
			msgs = basicSetKind(newKind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT__KIND, newKind, newKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Canonical> getInstantiates() {
		if (instantiates == null) {
			instantiates = new EObjectContainmentEList<Canonical>(Canonical.class, this, FhirPackage.CAPABILITY_STATEMENT__INSTANTIATES);
		}
		return instantiates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Canonical> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<Canonical>(Canonical.class, this, FhirPackage.CAPABILITY_STATEMENT__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityStatementSoftware getSoftware() {
		return software;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoftware(CapabilityStatementSoftware newSoftware, NotificationChain msgs) {
		CapabilityStatementSoftware oldSoftware = software;
		software = newSoftware;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT__SOFTWARE, oldSoftware, newSoftware);
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
	public void setSoftware(CapabilityStatementSoftware newSoftware) {
		if (newSoftware != software) {
			NotificationChain msgs = null;
			if (software != null)
				msgs = ((InternalEObject)software).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT__SOFTWARE, null, msgs);
			if (newSoftware != null)
				msgs = ((InternalEObject)newSoftware).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT__SOFTWARE, null, msgs);
			msgs = basicSetSoftware(newSoftware, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT__SOFTWARE, newSoftware, newSoftware));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityStatementImplementation getImplementation() {
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementation(CapabilityStatementImplementation newImplementation, NotificationChain msgs) {
		CapabilityStatementImplementation oldImplementation = implementation;
		implementation = newImplementation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT__IMPLEMENTATION, oldImplementation, newImplementation);
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
	public void setImplementation(CapabilityStatementImplementation newImplementation) {
		if (newImplementation != implementation) {
			NotificationChain msgs = null;
			if (implementation != null)
				msgs = ((InternalEObject)implementation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT__IMPLEMENTATION, null, msgs);
			if (newImplementation != null)
				msgs = ((InternalEObject)newImplementation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT__IMPLEMENTATION, null, msgs);
			msgs = basicSetImplementation(newImplementation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT__IMPLEMENTATION, newImplementation, newImplementation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FHIRVersion getFhirVersion() {
		return fhirVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFhirVersion(FHIRVersion newFhirVersion, NotificationChain msgs) {
		FHIRVersion oldFhirVersion = fhirVersion;
		fhirVersion = newFhirVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT__FHIR_VERSION, oldFhirVersion, newFhirVersion);
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
	public void setFhirVersion(FHIRVersion newFhirVersion) {
		if (newFhirVersion != fhirVersion) {
			NotificationChain msgs = null;
			if (fhirVersion != null)
				msgs = ((InternalEObject)fhirVersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT__FHIR_VERSION, null, msgs);
			if (newFhirVersion != null)
				msgs = ((InternalEObject)newFhirVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT__FHIR_VERSION, null, msgs);
			msgs = basicSetFhirVersion(newFhirVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT__FHIR_VERSION, newFhirVersion, newFhirVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Code> getFormat() {
		if (format == null) {
			format = new EObjectContainmentEList<Code>(Code.class, this, FhirPackage.CAPABILITY_STATEMENT__FORMAT);
		}
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Code> getPatchFormat() {
		if (patchFormat == null) {
			patchFormat = new EObjectContainmentEList<Code>(Code.class, this, FhirPackage.CAPABILITY_STATEMENT__PATCH_FORMAT);
		}
		return patchFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Canonical> getImplementationGuide() {
		if (implementationGuide == null) {
			implementationGuide = new EObjectContainmentEList<Canonical>(Canonical.class, this, FhirPackage.CAPABILITY_STATEMENT__IMPLEMENTATION_GUIDE);
		}
		return implementationGuide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CapabilityStatementRest> getRest() {
		if (rest == null) {
			rest = new EObjectContainmentEList<CapabilityStatementRest>(CapabilityStatementRest.class, this, FhirPackage.CAPABILITY_STATEMENT__REST);
		}
		return rest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CapabilityStatementMessaging> getMessaging() {
		if (messaging == null) {
			messaging = new EObjectContainmentEList<CapabilityStatementMessaging>(CapabilityStatementMessaging.class, this, FhirPackage.CAPABILITY_STATEMENT__MESSAGING);
		}
		return messaging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CapabilityStatementDocument> getDocument() {
		if (document == null) {
			document = new EObjectContainmentEList<CapabilityStatementDocument>(CapabilityStatementDocument.class, this, FhirPackage.CAPABILITY_STATEMENT__DOCUMENT);
		}
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CAPABILITY_STATEMENT__URL:
				return basicSetUrl(null, msgs);
			case FhirPackage.CAPABILITY_STATEMENT__VERSION:
				return basicSetVersion(null, msgs);
			case FhirPackage.CAPABILITY_STATEMENT__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.CAPABILITY_STATEMENT__TITLE:
				return basicSetTitle(null, msgs);
			case FhirPackage.CAPABILITY_STATEMENT__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.CAPABILITY_STATEMENT__EXPERIMENTAL:
				return basicSetExperimental(null, msgs);
			case FhirPackage.CAPABILITY_STATEMENT__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.CAPABILITY_STATEMENT__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case FhirPackage.CAPABILITY_STATEMENT__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case FhirPackage.CAPABILITY_STATEMENT__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.CAPABILITY_STATEMENT__USE_CONTEXT:
				return ((InternalEList<?>)getUseContext()).basicRemove(otherEnd, msgs);
			case FhirPackage.CAPABILITY_STATEMENT__JURISDICTION:
				return ((InternalEList<?>)getJurisdiction()).basicRemove(otherEnd, msgs);
			case FhirPackage.CAPABILITY_STATEMENT__PURPOSE:
				return basicSetPurpose(null, msgs);
			case FhirPackage.CAPABILITY_STATEMENT__COPYRIGHT:
				return basicSetCopyright(null, msgs);
			case FhirPackage.CAPABILITY_STATEMENT__KIND:
				return basicSetKind(null, msgs);
			case FhirPackage.CAPABILITY_STATEMENT__INSTANTIATES:
				return ((InternalEList<?>)getInstantiates()).basicRemove(otherEnd, msgs);
			case FhirPackage.CAPABILITY_STATEMENT__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
			case FhirPackage.CAPABILITY_STATEMENT__SOFTWARE:
				return basicSetSoftware(null, msgs);
			case FhirPackage.CAPABILITY_STATEMENT__IMPLEMENTATION:
				return basicSetImplementation(null, msgs);
			case FhirPackage.CAPABILITY_STATEMENT__FHIR_VERSION:
				return basicSetFhirVersion(null, msgs);
			case FhirPackage.CAPABILITY_STATEMENT__FORMAT:
				return ((InternalEList<?>)getFormat()).basicRemove(otherEnd, msgs);
			case FhirPackage.CAPABILITY_STATEMENT__PATCH_FORMAT:
				return ((InternalEList<?>)getPatchFormat()).basicRemove(otherEnd, msgs);
			case FhirPackage.CAPABILITY_STATEMENT__IMPLEMENTATION_GUIDE:
				return ((InternalEList<?>)getImplementationGuide()).basicRemove(otherEnd, msgs);
			case FhirPackage.CAPABILITY_STATEMENT__REST:
				return ((InternalEList<?>)getRest()).basicRemove(otherEnd, msgs);
			case FhirPackage.CAPABILITY_STATEMENT__MESSAGING:
				return ((InternalEList<?>)getMessaging()).basicRemove(otherEnd, msgs);
			case FhirPackage.CAPABILITY_STATEMENT__DOCUMENT:
				return ((InternalEList<?>)getDocument()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CAPABILITY_STATEMENT__URL:
				return getUrl();
			case FhirPackage.CAPABILITY_STATEMENT__VERSION:
				return getVersion();
			case FhirPackage.CAPABILITY_STATEMENT__NAME:
				return getName();
			case FhirPackage.CAPABILITY_STATEMENT__TITLE:
				return getTitle();
			case FhirPackage.CAPABILITY_STATEMENT__STATUS:
				return getStatus();
			case FhirPackage.CAPABILITY_STATEMENT__EXPERIMENTAL:
				return getExperimental();
			case FhirPackage.CAPABILITY_STATEMENT__DATE:
				return getDate();
			case FhirPackage.CAPABILITY_STATEMENT__PUBLISHER:
				return getPublisher();
			case FhirPackage.CAPABILITY_STATEMENT__CONTACT:
				return getContact();
			case FhirPackage.CAPABILITY_STATEMENT__DESCRIPTION:
				return getDescription();
			case FhirPackage.CAPABILITY_STATEMENT__USE_CONTEXT:
				return getUseContext();
			case FhirPackage.CAPABILITY_STATEMENT__JURISDICTION:
				return getJurisdiction();
			case FhirPackage.CAPABILITY_STATEMENT__PURPOSE:
				return getPurpose();
			case FhirPackage.CAPABILITY_STATEMENT__COPYRIGHT:
				return getCopyright();
			case FhirPackage.CAPABILITY_STATEMENT__KIND:
				return getKind();
			case FhirPackage.CAPABILITY_STATEMENT__INSTANTIATES:
				return getInstantiates();
			case FhirPackage.CAPABILITY_STATEMENT__IMPORTS:
				return getImports();
			case FhirPackage.CAPABILITY_STATEMENT__SOFTWARE:
				return getSoftware();
			case FhirPackage.CAPABILITY_STATEMENT__IMPLEMENTATION:
				return getImplementation();
			case FhirPackage.CAPABILITY_STATEMENT__FHIR_VERSION:
				return getFhirVersion();
			case FhirPackage.CAPABILITY_STATEMENT__FORMAT:
				return getFormat();
			case FhirPackage.CAPABILITY_STATEMENT__PATCH_FORMAT:
				return getPatchFormat();
			case FhirPackage.CAPABILITY_STATEMENT__IMPLEMENTATION_GUIDE:
				return getImplementationGuide();
			case FhirPackage.CAPABILITY_STATEMENT__REST:
				return getRest();
			case FhirPackage.CAPABILITY_STATEMENT__MESSAGING:
				return getMessaging();
			case FhirPackage.CAPABILITY_STATEMENT__DOCUMENT:
				return getDocument();
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
			case FhirPackage.CAPABILITY_STATEMENT__URL:
				setUrl((Uri)newValue);
				return;
			case FhirPackage.CAPABILITY_STATEMENT__VERSION:
				setVersion((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CAPABILITY_STATEMENT__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CAPABILITY_STATEMENT__TITLE:
				setTitle((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CAPABILITY_STATEMENT__STATUS:
				setStatus((PublicationStatus)newValue);
				return;
			case FhirPackage.CAPABILITY_STATEMENT__EXPERIMENTAL:
				setExperimental((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.CAPABILITY_STATEMENT__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.CAPABILITY_STATEMENT__PUBLISHER:
				setPublisher((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CAPABILITY_STATEMENT__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FhirPackage.CAPABILITY_STATEMENT__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.CAPABILITY_STATEMENT__USE_CONTEXT:
				getUseContext().clear();
				getUseContext().addAll((Collection<? extends UsageContext>)newValue);
				return;
			case FhirPackage.CAPABILITY_STATEMENT__JURISDICTION:
				getJurisdiction().clear();
				getJurisdiction().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CAPABILITY_STATEMENT__PURPOSE:
				setPurpose((Markdown)newValue);
				return;
			case FhirPackage.CAPABILITY_STATEMENT__COPYRIGHT:
				setCopyright((Markdown)newValue);
				return;
			case FhirPackage.CAPABILITY_STATEMENT__KIND:
				setKind((CapabilityStatementKind)newValue);
				return;
			case FhirPackage.CAPABILITY_STATEMENT__INSTANTIATES:
				getInstantiates().clear();
				getInstantiates().addAll((Collection<? extends Canonical>)newValue);
				return;
			case FhirPackage.CAPABILITY_STATEMENT__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends Canonical>)newValue);
				return;
			case FhirPackage.CAPABILITY_STATEMENT__SOFTWARE:
				setSoftware((CapabilityStatementSoftware)newValue);
				return;
			case FhirPackage.CAPABILITY_STATEMENT__IMPLEMENTATION:
				setImplementation((CapabilityStatementImplementation)newValue);
				return;
			case FhirPackage.CAPABILITY_STATEMENT__FHIR_VERSION:
				setFhirVersion((FHIRVersion)newValue);
				return;
			case FhirPackage.CAPABILITY_STATEMENT__FORMAT:
				getFormat().clear();
				getFormat().addAll((Collection<? extends Code>)newValue);
				return;
			case FhirPackage.CAPABILITY_STATEMENT__PATCH_FORMAT:
				getPatchFormat().clear();
				getPatchFormat().addAll((Collection<? extends Code>)newValue);
				return;
			case FhirPackage.CAPABILITY_STATEMENT__IMPLEMENTATION_GUIDE:
				getImplementationGuide().clear();
				getImplementationGuide().addAll((Collection<? extends Canonical>)newValue);
				return;
			case FhirPackage.CAPABILITY_STATEMENT__REST:
				getRest().clear();
				getRest().addAll((Collection<? extends CapabilityStatementRest>)newValue);
				return;
			case FhirPackage.CAPABILITY_STATEMENT__MESSAGING:
				getMessaging().clear();
				getMessaging().addAll((Collection<? extends CapabilityStatementMessaging>)newValue);
				return;
			case FhirPackage.CAPABILITY_STATEMENT__DOCUMENT:
				getDocument().clear();
				getDocument().addAll((Collection<? extends CapabilityStatementDocument>)newValue);
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
			case FhirPackage.CAPABILITY_STATEMENT__URL:
				setUrl((Uri)null);
				return;
			case FhirPackage.CAPABILITY_STATEMENT__VERSION:
				setVersion((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CAPABILITY_STATEMENT__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CAPABILITY_STATEMENT__TITLE:
				setTitle((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CAPABILITY_STATEMENT__STATUS:
				setStatus((PublicationStatus)null);
				return;
			case FhirPackage.CAPABILITY_STATEMENT__EXPERIMENTAL:
				setExperimental((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.CAPABILITY_STATEMENT__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.CAPABILITY_STATEMENT__PUBLISHER:
				setPublisher((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CAPABILITY_STATEMENT__CONTACT:
				getContact().clear();
				return;
			case FhirPackage.CAPABILITY_STATEMENT__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.CAPABILITY_STATEMENT__USE_CONTEXT:
				getUseContext().clear();
				return;
			case FhirPackage.CAPABILITY_STATEMENT__JURISDICTION:
				getJurisdiction().clear();
				return;
			case FhirPackage.CAPABILITY_STATEMENT__PURPOSE:
				setPurpose((Markdown)null);
				return;
			case FhirPackage.CAPABILITY_STATEMENT__COPYRIGHT:
				setCopyright((Markdown)null);
				return;
			case FhirPackage.CAPABILITY_STATEMENT__KIND:
				setKind((CapabilityStatementKind)null);
				return;
			case FhirPackage.CAPABILITY_STATEMENT__INSTANTIATES:
				getInstantiates().clear();
				return;
			case FhirPackage.CAPABILITY_STATEMENT__IMPORTS:
				getImports().clear();
				return;
			case FhirPackage.CAPABILITY_STATEMENT__SOFTWARE:
				setSoftware((CapabilityStatementSoftware)null);
				return;
			case FhirPackage.CAPABILITY_STATEMENT__IMPLEMENTATION:
				setImplementation((CapabilityStatementImplementation)null);
				return;
			case FhirPackage.CAPABILITY_STATEMENT__FHIR_VERSION:
				setFhirVersion((FHIRVersion)null);
				return;
			case FhirPackage.CAPABILITY_STATEMENT__FORMAT:
				getFormat().clear();
				return;
			case FhirPackage.CAPABILITY_STATEMENT__PATCH_FORMAT:
				getPatchFormat().clear();
				return;
			case FhirPackage.CAPABILITY_STATEMENT__IMPLEMENTATION_GUIDE:
				getImplementationGuide().clear();
				return;
			case FhirPackage.CAPABILITY_STATEMENT__REST:
				getRest().clear();
				return;
			case FhirPackage.CAPABILITY_STATEMENT__MESSAGING:
				getMessaging().clear();
				return;
			case FhirPackage.CAPABILITY_STATEMENT__DOCUMENT:
				getDocument().clear();
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
			case FhirPackage.CAPABILITY_STATEMENT__URL:
				return url != null;
			case FhirPackage.CAPABILITY_STATEMENT__VERSION:
				return version != null;
			case FhirPackage.CAPABILITY_STATEMENT__NAME:
				return name != null;
			case FhirPackage.CAPABILITY_STATEMENT__TITLE:
				return title != null;
			case FhirPackage.CAPABILITY_STATEMENT__STATUS:
				return status != null;
			case FhirPackage.CAPABILITY_STATEMENT__EXPERIMENTAL:
				return experimental != null;
			case FhirPackage.CAPABILITY_STATEMENT__DATE:
				return date != null;
			case FhirPackage.CAPABILITY_STATEMENT__PUBLISHER:
				return publisher != null;
			case FhirPackage.CAPABILITY_STATEMENT__CONTACT:
				return contact != null && !contact.isEmpty();
			case FhirPackage.CAPABILITY_STATEMENT__DESCRIPTION:
				return description != null;
			case FhirPackage.CAPABILITY_STATEMENT__USE_CONTEXT:
				return useContext != null && !useContext.isEmpty();
			case FhirPackage.CAPABILITY_STATEMENT__JURISDICTION:
				return jurisdiction != null && !jurisdiction.isEmpty();
			case FhirPackage.CAPABILITY_STATEMENT__PURPOSE:
				return purpose != null;
			case FhirPackage.CAPABILITY_STATEMENT__COPYRIGHT:
				return copyright != null;
			case FhirPackage.CAPABILITY_STATEMENT__KIND:
				return kind != null;
			case FhirPackage.CAPABILITY_STATEMENT__INSTANTIATES:
				return instantiates != null && !instantiates.isEmpty();
			case FhirPackage.CAPABILITY_STATEMENT__IMPORTS:
				return imports != null && !imports.isEmpty();
			case FhirPackage.CAPABILITY_STATEMENT__SOFTWARE:
				return software != null;
			case FhirPackage.CAPABILITY_STATEMENT__IMPLEMENTATION:
				return implementation != null;
			case FhirPackage.CAPABILITY_STATEMENT__FHIR_VERSION:
				return fhirVersion != null;
			case FhirPackage.CAPABILITY_STATEMENT__FORMAT:
				return format != null && !format.isEmpty();
			case FhirPackage.CAPABILITY_STATEMENT__PATCH_FORMAT:
				return patchFormat != null && !patchFormat.isEmpty();
			case FhirPackage.CAPABILITY_STATEMENT__IMPLEMENTATION_GUIDE:
				return implementationGuide != null && !implementationGuide.isEmpty();
			case FhirPackage.CAPABILITY_STATEMENT__REST:
				return rest != null && !rest.isEmpty();
			case FhirPackage.CAPABILITY_STATEMENT__MESSAGING:
				return messaging != null && !messaging.isEmpty();
			case FhirPackage.CAPABILITY_STATEMENT__DOCUMENT:
				return document != null && !document.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapabilityStatementImpl
