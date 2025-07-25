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
import org.hl7.fhir.CompositionStatus;
import org.hl7.fhir.DocumentReference;
import org.hl7.fhir.DocumentReferenceContent;
import org.hl7.fhir.DocumentReferenceContext;
import org.hl7.fhir.DocumentReferenceRelatesTo;
import org.hl7.fhir.DocumentReferenceStatus;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Instant;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DocumentReferenceImpl#getMasterIdentifier <em>Master Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentReferenceImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentReferenceImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentReferenceImpl#getDocStatus <em>Doc Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentReferenceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentReferenceImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentReferenceImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentReferenceImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentReferenceImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentReferenceImpl#getAuthenticator <em>Authenticator</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentReferenceImpl#getCustodian <em>Custodian</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentReferenceImpl#getRelatesTo <em>Relates To</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentReferenceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentReferenceImpl#getSecurityLabel <em>Security Label</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentReferenceImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentReferenceImpl#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentReferenceImpl extends DomainResourceImpl implements DocumentReference {
	/**
	 * The cached value of the '{@link #getMasterIdentifier() <em>Master Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier masterIdentifier;

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
	protected DocumentReferenceStatus status;

	/**
	 * The cached value of the '{@link #getDocStatus() <em>Doc Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocStatus()
	 * @generated
	 * @ordered
	 */
	protected CompositionStatus docStatus;

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
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> category;

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
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Instant date;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> author;

	/**
	 * The cached value of the '{@link #getAuthenticator() <em>Authenticator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticator()
	 * @generated
	 * @ordered
	 */
	protected Reference authenticator;

	/**
	 * The cached value of the '{@link #getCustodian() <em>Custodian</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustodian()
	 * @generated
	 * @ordered
	 */
	protected Reference custodian;

	/**
	 * The cached value of the '{@link #getRelatesTo() <em>Relates To</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatesTo()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentReferenceRelatesTo> relatesTo;

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
	 * The cached value of the '{@link #getSecurityLabel() <em>Security Label</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLabel()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> securityLabel;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentReferenceContent> content;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected DocumentReferenceContext context;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDocumentReference();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getMasterIdentifier() {
		return masterIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMasterIdentifier(Identifier newMasterIdentifier, NotificationChain msgs) {
		Identifier oldMasterIdentifier = masterIdentifier;
		masterIdentifier = newMasterIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE__MASTER_IDENTIFIER, oldMasterIdentifier, newMasterIdentifier);
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
	public void setMasterIdentifier(Identifier newMasterIdentifier) {
		if (newMasterIdentifier != masterIdentifier) {
			NotificationChain msgs = null;
			if (masterIdentifier != null)
				msgs = ((InternalEObject)masterIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE__MASTER_IDENTIFIER, null, msgs);
			if (newMasterIdentifier != null)
				msgs = ((InternalEObject)newMasterIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE__MASTER_IDENTIFIER, null, msgs);
			msgs = basicSetMasterIdentifier(newMasterIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE__MASTER_IDENTIFIER, newMasterIdentifier, newMasterIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.DOCUMENT_REFERENCE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentReferenceStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(DocumentReferenceStatus newStatus, NotificationChain msgs) {
		DocumentReferenceStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE__STATUS, oldStatus, newStatus);
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
	public void setStatus(DocumentReferenceStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositionStatus getDocStatus() {
		return docStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocStatus(CompositionStatus newDocStatus, NotificationChain msgs) {
		CompositionStatus oldDocStatus = docStatus;
		docStatus = newDocStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE__DOC_STATUS, oldDocStatus, newDocStatus);
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
	public void setDocStatus(CompositionStatus newDocStatus) {
		if (newDocStatus != docStatus) {
			NotificationChain msgs = null;
			if (docStatus != null)
				msgs = ((InternalEObject)docStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE__DOC_STATUS, null, msgs);
			if (newDocStatus != null)
				msgs = ((InternalEObject)newDocStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE__DOC_STATUS, null, msgs);
			msgs = basicSetDocStatus(newDocStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE__DOC_STATUS, newDocStatus, newDocStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.DOCUMENT_REFERENCE__CATEGORY);
		}
		return category;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instant getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(Instant newDate, NotificationChain msgs) {
		Instant oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE__DATE, oldDate, newDate);
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
	public void setDate(Instant newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getAuthor() {
		if (author == null) {
			author = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.DOCUMENT_REFERENCE__AUTHOR);
		}
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getAuthenticator() {
		return authenticator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthenticator(Reference newAuthenticator, NotificationChain msgs) {
		Reference oldAuthenticator = authenticator;
		authenticator = newAuthenticator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE__AUTHENTICATOR, oldAuthenticator, newAuthenticator);
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
	public void setAuthenticator(Reference newAuthenticator) {
		if (newAuthenticator != authenticator) {
			NotificationChain msgs = null;
			if (authenticator != null)
				msgs = ((InternalEObject)authenticator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE__AUTHENTICATOR, null, msgs);
			if (newAuthenticator != null)
				msgs = ((InternalEObject)newAuthenticator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE__AUTHENTICATOR, null, msgs);
			msgs = basicSetAuthenticator(newAuthenticator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE__AUTHENTICATOR, newAuthenticator, newAuthenticator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getCustodian() {
		return custodian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustodian(Reference newCustodian, NotificationChain msgs) {
		Reference oldCustodian = custodian;
		custodian = newCustodian;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE__CUSTODIAN, oldCustodian, newCustodian);
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
	public void setCustodian(Reference newCustodian) {
		if (newCustodian != custodian) {
			NotificationChain msgs = null;
			if (custodian != null)
				msgs = ((InternalEObject)custodian).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE__CUSTODIAN, null, msgs);
			if (newCustodian != null)
				msgs = ((InternalEObject)newCustodian).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE__CUSTODIAN, null, msgs);
			msgs = basicSetCustodian(newCustodian, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE__CUSTODIAN, newCustodian, newCustodian));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DocumentReferenceRelatesTo> getRelatesTo() {
		if (relatesTo == null) {
			relatesTo = new EObjectContainmentEList<DocumentReferenceRelatesTo>(DocumentReferenceRelatesTo.class, this, FhirPackage.DOCUMENT_REFERENCE__RELATES_TO);
		}
		return relatesTo;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getSecurityLabel() {
		if (securityLabel == null) {
			securityLabel = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.DOCUMENT_REFERENCE__SECURITY_LABEL);
		}
		return securityLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DocumentReferenceContent> getContent() {
		if (content == null) {
			content = new EObjectContainmentEList<DocumentReferenceContent>(DocumentReferenceContent.class, this, FhirPackage.DOCUMENT_REFERENCE__CONTENT);
		}
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentReferenceContext getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(DocumentReferenceContext newContext, NotificationChain msgs) {
		DocumentReferenceContext oldContext = context;
		context = newContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE__CONTEXT, oldContext, newContext);
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
	public void setContext(DocumentReferenceContext newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_REFERENCE__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_REFERENCE__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DOCUMENT_REFERENCE__MASTER_IDENTIFIER:
				return basicSetMasterIdentifier(null, msgs);
			case FhirPackage.DOCUMENT_REFERENCE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.DOCUMENT_REFERENCE__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.DOCUMENT_REFERENCE__DOC_STATUS:
				return basicSetDocStatus(null, msgs);
			case FhirPackage.DOCUMENT_REFERENCE__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.DOCUMENT_REFERENCE__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case FhirPackage.DOCUMENT_REFERENCE__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.DOCUMENT_REFERENCE__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.DOCUMENT_REFERENCE__AUTHOR:
				return ((InternalEList<?>)getAuthor()).basicRemove(otherEnd, msgs);
			case FhirPackage.DOCUMENT_REFERENCE__AUTHENTICATOR:
				return basicSetAuthenticator(null, msgs);
			case FhirPackage.DOCUMENT_REFERENCE__CUSTODIAN:
				return basicSetCustodian(null, msgs);
			case FhirPackage.DOCUMENT_REFERENCE__RELATES_TO:
				return ((InternalEList<?>)getRelatesTo()).basicRemove(otherEnd, msgs);
			case FhirPackage.DOCUMENT_REFERENCE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.DOCUMENT_REFERENCE__SECURITY_LABEL:
				return ((InternalEList<?>)getSecurityLabel()).basicRemove(otherEnd, msgs);
			case FhirPackage.DOCUMENT_REFERENCE__CONTENT:
				return ((InternalEList<?>)getContent()).basicRemove(otherEnd, msgs);
			case FhirPackage.DOCUMENT_REFERENCE__CONTEXT:
				return basicSetContext(null, msgs);
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
			case FhirPackage.DOCUMENT_REFERENCE__MASTER_IDENTIFIER:
				return getMasterIdentifier();
			case FhirPackage.DOCUMENT_REFERENCE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.DOCUMENT_REFERENCE__STATUS:
				return getStatus();
			case FhirPackage.DOCUMENT_REFERENCE__DOC_STATUS:
				return getDocStatus();
			case FhirPackage.DOCUMENT_REFERENCE__TYPE:
				return getType();
			case FhirPackage.DOCUMENT_REFERENCE__CATEGORY:
				return getCategory();
			case FhirPackage.DOCUMENT_REFERENCE__SUBJECT:
				return getSubject();
			case FhirPackage.DOCUMENT_REFERENCE__DATE:
				return getDate();
			case FhirPackage.DOCUMENT_REFERENCE__AUTHOR:
				return getAuthor();
			case FhirPackage.DOCUMENT_REFERENCE__AUTHENTICATOR:
				return getAuthenticator();
			case FhirPackage.DOCUMENT_REFERENCE__CUSTODIAN:
				return getCustodian();
			case FhirPackage.DOCUMENT_REFERENCE__RELATES_TO:
				return getRelatesTo();
			case FhirPackage.DOCUMENT_REFERENCE__DESCRIPTION:
				return getDescription();
			case FhirPackage.DOCUMENT_REFERENCE__SECURITY_LABEL:
				return getSecurityLabel();
			case FhirPackage.DOCUMENT_REFERENCE__CONTENT:
				return getContent();
			case FhirPackage.DOCUMENT_REFERENCE__CONTEXT:
				return getContext();
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
			case FhirPackage.DOCUMENT_REFERENCE__MASTER_IDENTIFIER:
				setMasterIdentifier((Identifier)newValue);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__STATUS:
				setStatus((DocumentReferenceStatus)newValue);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__DOC_STATUS:
				setDocStatus((CompositionStatus)newValue);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__DATE:
				setDate((Instant)newValue);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__AUTHOR:
				getAuthor().clear();
				getAuthor().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__AUTHENTICATOR:
				setAuthenticator((Reference)newValue);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__CUSTODIAN:
				setCustodian((Reference)newValue);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__RELATES_TO:
				getRelatesTo().clear();
				getRelatesTo().addAll((Collection<? extends DocumentReferenceRelatesTo>)newValue);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__SECURITY_LABEL:
				getSecurityLabel().clear();
				getSecurityLabel().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__CONTENT:
				getContent().clear();
				getContent().addAll((Collection<? extends DocumentReferenceContent>)newValue);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__CONTEXT:
				setContext((DocumentReferenceContext)newValue);
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
			case FhirPackage.DOCUMENT_REFERENCE__MASTER_IDENTIFIER:
				setMasterIdentifier((Identifier)null);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.DOCUMENT_REFERENCE__STATUS:
				setStatus((DocumentReferenceStatus)null);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__DOC_STATUS:
				setDocStatus((CompositionStatus)null);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__CATEGORY:
				getCategory().clear();
				return;
			case FhirPackage.DOCUMENT_REFERENCE__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__DATE:
				setDate((Instant)null);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__AUTHOR:
				getAuthor().clear();
				return;
			case FhirPackage.DOCUMENT_REFERENCE__AUTHENTICATOR:
				setAuthenticator((Reference)null);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__CUSTODIAN:
				setCustodian((Reference)null);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__RELATES_TO:
				getRelatesTo().clear();
				return;
			case FhirPackage.DOCUMENT_REFERENCE__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.DOCUMENT_REFERENCE__SECURITY_LABEL:
				getSecurityLabel().clear();
				return;
			case FhirPackage.DOCUMENT_REFERENCE__CONTENT:
				getContent().clear();
				return;
			case FhirPackage.DOCUMENT_REFERENCE__CONTEXT:
				setContext((DocumentReferenceContext)null);
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
			case FhirPackage.DOCUMENT_REFERENCE__MASTER_IDENTIFIER:
				return masterIdentifier != null;
			case FhirPackage.DOCUMENT_REFERENCE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.DOCUMENT_REFERENCE__STATUS:
				return status != null;
			case FhirPackage.DOCUMENT_REFERENCE__DOC_STATUS:
				return docStatus != null;
			case FhirPackage.DOCUMENT_REFERENCE__TYPE:
				return type != null;
			case FhirPackage.DOCUMENT_REFERENCE__CATEGORY:
				return category != null && !category.isEmpty();
			case FhirPackage.DOCUMENT_REFERENCE__SUBJECT:
				return subject != null;
			case FhirPackage.DOCUMENT_REFERENCE__DATE:
				return date != null;
			case FhirPackage.DOCUMENT_REFERENCE__AUTHOR:
				return author != null && !author.isEmpty();
			case FhirPackage.DOCUMENT_REFERENCE__AUTHENTICATOR:
				return authenticator != null;
			case FhirPackage.DOCUMENT_REFERENCE__CUSTODIAN:
				return custodian != null;
			case FhirPackage.DOCUMENT_REFERENCE__RELATES_TO:
				return relatesTo != null && !relatesTo.isEmpty();
			case FhirPackage.DOCUMENT_REFERENCE__DESCRIPTION:
				return description != null;
			case FhirPackage.DOCUMENT_REFERENCE__SECURITY_LABEL:
				return securityLabel != null && !securityLabel.isEmpty();
			case FhirPackage.DOCUMENT_REFERENCE__CONTENT:
				return content != null && !content.isEmpty();
			case FhirPackage.DOCUMENT_REFERENCE__CONTEXT:
				return context != null;
		}
		return super.eIsSet(featureID);
	}

} //DocumentReferenceImpl
