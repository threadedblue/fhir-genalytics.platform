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
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;
import org.hl7.fhir.SubstanceSpecification;
import org.hl7.fhir.SubstanceSpecificationCode;
import org.hl7.fhir.SubstanceSpecificationMoiety;
import org.hl7.fhir.SubstanceSpecificationMolecularWeight;
import org.hl7.fhir.SubstanceSpecificationName;
import org.hl7.fhir.SubstanceSpecificationProperty;
import org.hl7.fhir.SubstanceSpecificationRelationship;
import org.hl7.fhir.SubstanceSpecificationStructure;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationImpl#getMoiety <em>Moiety</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationImpl#getReferenceInformation <em>Reference Information</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationImpl#getStructure <em>Structure</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationImpl#getMolecularWeight <em>Molecular Weight</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationImpl#getNucleicAcid <em>Nucleic Acid</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationImpl#getPolymer <em>Polymer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationImpl#getProtein <em>Protein</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationImpl#getSourceMaterial <em>Source Material</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceSpecificationImpl extends DomainResourceImpl implements SubstanceSpecification {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept status;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept domain;

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
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> source;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String comment;

	/**
	 * The cached value of the '{@link #getMoiety() <em>Moiety</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoiety()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceSpecificationMoiety> moiety;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceSpecificationProperty> property;

	/**
	 * The cached value of the '{@link #getReferenceInformation() <em>Reference Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceInformation()
	 * @generated
	 * @ordered
	 */
	protected Reference referenceInformation;

	/**
	 * The cached value of the '{@link #getStructure() <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructure()
	 * @generated
	 * @ordered
	 */
	protected SubstanceSpecificationStructure structure;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceSpecificationCode> code;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceSpecificationName> name;

	/**
	 * The cached value of the '{@link #getMolecularWeight() <em>Molecular Weight</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMolecularWeight()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceSpecificationMolecularWeight> molecularWeight;

	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceSpecificationRelationship> relationship;

	/**
	 * The cached value of the '{@link #getNucleicAcid() <em>Nucleic Acid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNucleicAcid()
	 * @generated
	 * @ordered
	 */
	protected Reference nucleicAcid;

	/**
	 * The cached value of the '{@link #getPolymer() <em>Polymer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolymer()
	 * @generated
	 * @ordered
	 */
	protected Reference polymer;

	/**
	 * The cached value of the '{@link #getProtein() <em>Protein</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtein()
	 * @generated
	 * @ordered
	 */
	protected Reference protein;

	/**
	 * The cached value of the '{@link #getSourceMaterial() <em>Source Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceMaterial()
	 * @generated
	 * @ordered
	 */
	protected Reference sourceMaterial;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubstanceSpecification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION__IDENTIFIER, oldIdentifier, newIdentifier);
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
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION__IDENTIFIER, newIdentifier, newIdentifier));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(CodeableConcept newStatus, NotificationChain msgs) {
		CodeableConcept oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION__STATUS, oldStatus, newStatus);
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
	public void setStatus(CodeableConcept newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomain(CodeableConcept newDomain, NotificationChain msgs) {
		CodeableConcept oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION__DOMAIN, oldDomain, newDomain);
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
	public void setDomain(CodeableConcept newDomain) {
		if (newDomain != domain) {
			NotificationChain msgs = null;
			if (domain != null)
				msgs = ((InternalEObject)domain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION__DOMAIN, null, msgs);
			if (newDomain != null)
				msgs = ((InternalEObject)newDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION__DOMAIN, null, msgs);
			msgs = basicSetDomain(newDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION__DOMAIN, newDomain, newDomain));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSource() {
		if (source == null) {
			source = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.SUBSTANCE_SPECIFICATION__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComment(org.hl7.fhir.String newComment, NotificationChain msgs) {
		org.hl7.fhir.String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION__COMMENT, oldComment, newComment);
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
	public void setComment(org.hl7.fhir.String newComment) {
		if (newComment != comment) {
			NotificationChain msgs = null;
			if (comment != null)
				msgs = ((InternalEObject)comment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION__COMMENT, null, msgs);
			if (newComment != null)
				msgs = ((InternalEObject)newComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION__COMMENT, null, msgs);
			msgs = basicSetComment(newComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION__COMMENT, newComment, newComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstanceSpecificationMoiety> getMoiety() {
		if (moiety == null) {
			moiety = new EObjectContainmentEList<SubstanceSpecificationMoiety>(SubstanceSpecificationMoiety.class, this, FhirPackage.SUBSTANCE_SPECIFICATION__MOIETY);
		}
		return moiety;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstanceSpecificationProperty> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<SubstanceSpecificationProperty>(SubstanceSpecificationProperty.class, this, FhirPackage.SUBSTANCE_SPECIFICATION__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getReferenceInformation() {
		return referenceInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceInformation(Reference newReferenceInformation, NotificationChain msgs) {
		Reference oldReferenceInformation = referenceInformation;
		referenceInformation = newReferenceInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION__REFERENCE_INFORMATION, oldReferenceInformation, newReferenceInformation);
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
	public void setReferenceInformation(Reference newReferenceInformation) {
		if (newReferenceInformation != referenceInformation) {
			NotificationChain msgs = null;
			if (referenceInformation != null)
				msgs = ((InternalEObject)referenceInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION__REFERENCE_INFORMATION, null, msgs);
			if (newReferenceInformation != null)
				msgs = ((InternalEObject)newReferenceInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION__REFERENCE_INFORMATION, null, msgs);
			msgs = basicSetReferenceInformation(newReferenceInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION__REFERENCE_INFORMATION, newReferenceInformation, newReferenceInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceSpecificationStructure getStructure() {
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructure(SubstanceSpecificationStructure newStructure, NotificationChain msgs) {
		SubstanceSpecificationStructure oldStructure = structure;
		structure = newStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION__STRUCTURE, oldStructure, newStructure);
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
	public void setStructure(SubstanceSpecificationStructure newStructure) {
		if (newStructure != structure) {
			NotificationChain msgs = null;
			if (structure != null)
				msgs = ((InternalEObject)structure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION__STRUCTURE, null, msgs);
			if (newStructure != null)
				msgs = ((InternalEObject)newStructure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION__STRUCTURE, null, msgs);
			msgs = basicSetStructure(newStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION__STRUCTURE, newStructure, newStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstanceSpecificationCode> getCode() {
		if (code == null) {
			code = new EObjectContainmentEList<SubstanceSpecificationCode>(SubstanceSpecificationCode.class, this, FhirPackage.SUBSTANCE_SPECIFICATION__CODE);
		}
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstanceSpecificationName> getName() {
		if (name == null) {
			name = new EObjectContainmentEList<SubstanceSpecificationName>(SubstanceSpecificationName.class, this, FhirPackage.SUBSTANCE_SPECIFICATION__NAME);
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstanceSpecificationMolecularWeight> getMolecularWeight() {
		if (molecularWeight == null) {
			molecularWeight = new EObjectContainmentEList<SubstanceSpecificationMolecularWeight>(SubstanceSpecificationMolecularWeight.class, this, FhirPackage.SUBSTANCE_SPECIFICATION__MOLECULAR_WEIGHT);
		}
		return molecularWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstanceSpecificationRelationship> getRelationship() {
		if (relationship == null) {
			relationship = new EObjectContainmentEList<SubstanceSpecificationRelationship>(SubstanceSpecificationRelationship.class, this, FhirPackage.SUBSTANCE_SPECIFICATION__RELATIONSHIP);
		}
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getNucleicAcid() {
		return nucleicAcid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNucleicAcid(Reference newNucleicAcid, NotificationChain msgs) {
		Reference oldNucleicAcid = nucleicAcid;
		nucleicAcid = newNucleicAcid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION__NUCLEIC_ACID, oldNucleicAcid, newNucleicAcid);
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
	public void setNucleicAcid(Reference newNucleicAcid) {
		if (newNucleicAcid != nucleicAcid) {
			NotificationChain msgs = null;
			if (nucleicAcid != null)
				msgs = ((InternalEObject)nucleicAcid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION__NUCLEIC_ACID, null, msgs);
			if (newNucleicAcid != null)
				msgs = ((InternalEObject)newNucleicAcid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION__NUCLEIC_ACID, null, msgs);
			msgs = basicSetNucleicAcid(newNucleicAcid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION__NUCLEIC_ACID, newNucleicAcid, newNucleicAcid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getPolymer() {
		return polymer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolymer(Reference newPolymer, NotificationChain msgs) {
		Reference oldPolymer = polymer;
		polymer = newPolymer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION__POLYMER, oldPolymer, newPolymer);
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
	public void setPolymer(Reference newPolymer) {
		if (newPolymer != polymer) {
			NotificationChain msgs = null;
			if (polymer != null)
				msgs = ((InternalEObject)polymer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION__POLYMER, null, msgs);
			if (newPolymer != null)
				msgs = ((InternalEObject)newPolymer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION__POLYMER, null, msgs);
			msgs = basicSetPolymer(newPolymer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION__POLYMER, newPolymer, newPolymer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getProtein() {
		return protein;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProtein(Reference newProtein, NotificationChain msgs) {
		Reference oldProtein = protein;
		protein = newProtein;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION__PROTEIN, oldProtein, newProtein);
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
	public void setProtein(Reference newProtein) {
		if (newProtein != protein) {
			NotificationChain msgs = null;
			if (protein != null)
				msgs = ((InternalEObject)protein).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION__PROTEIN, null, msgs);
			if (newProtein != null)
				msgs = ((InternalEObject)newProtein).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION__PROTEIN, null, msgs);
			msgs = basicSetProtein(newProtein, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION__PROTEIN, newProtein, newProtein));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getSourceMaterial() {
		return sourceMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceMaterial(Reference newSourceMaterial, NotificationChain msgs) {
		Reference oldSourceMaterial = sourceMaterial;
		sourceMaterial = newSourceMaterial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION__SOURCE_MATERIAL, oldSourceMaterial, newSourceMaterial);
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
	public void setSourceMaterial(Reference newSourceMaterial) {
		if (newSourceMaterial != sourceMaterial) {
			NotificationChain msgs = null;
			if (sourceMaterial != null)
				msgs = ((InternalEObject)sourceMaterial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION__SOURCE_MATERIAL, null, msgs);
			if (newSourceMaterial != null)
				msgs = ((InternalEObject)newSourceMaterial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION__SOURCE_MATERIAL, null, msgs);
			msgs = basicSetSourceMaterial(newSourceMaterial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION__SOURCE_MATERIAL, newSourceMaterial, newSourceMaterial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUBSTANCE_SPECIFICATION__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION__DOMAIN:
				return basicSetDomain(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION__COMMENT:
				return basicSetComment(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION__MOIETY:
				return ((InternalEList<?>)getMoiety()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION__REFERENCE_INFORMATION:
				return basicSetReferenceInformation(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION__STRUCTURE:
				return basicSetStructure(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION__NAME:
				return ((InternalEList<?>)getName()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION__MOLECULAR_WEIGHT:
				return ((InternalEList<?>)getMolecularWeight()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION__RELATIONSHIP:
				return ((InternalEList<?>)getRelationship()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION__NUCLEIC_ACID:
				return basicSetNucleicAcid(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION__POLYMER:
				return basicSetPolymer(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION__PROTEIN:
				return basicSetProtein(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION__SOURCE_MATERIAL:
				return basicSetSourceMaterial(null, msgs);
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
			case FhirPackage.SUBSTANCE_SPECIFICATION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.SUBSTANCE_SPECIFICATION__TYPE:
				return getType();
			case FhirPackage.SUBSTANCE_SPECIFICATION__STATUS:
				return getStatus();
			case FhirPackage.SUBSTANCE_SPECIFICATION__DOMAIN:
				return getDomain();
			case FhirPackage.SUBSTANCE_SPECIFICATION__DESCRIPTION:
				return getDescription();
			case FhirPackage.SUBSTANCE_SPECIFICATION__SOURCE:
				return getSource();
			case FhirPackage.SUBSTANCE_SPECIFICATION__COMMENT:
				return getComment();
			case FhirPackage.SUBSTANCE_SPECIFICATION__MOIETY:
				return getMoiety();
			case FhirPackage.SUBSTANCE_SPECIFICATION__PROPERTY:
				return getProperty();
			case FhirPackage.SUBSTANCE_SPECIFICATION__REFERENCE_INFORMATION:
				return getReferenceInformation();
			case FhirPackage.SUBSTANCE_SPECIFICATION__STRUCTURE:
				return getStructure();
			case FhirPackage.SUBSTANCE_SPECIFICATION__CODE:
				return getCode();
			case FhirPackage.SUBSTANCE_SPECIFICATION__NAME:
				return getName();
			case FhirPackage.SUBSTANCE_SPECIFICATION__MOLECULAR_WEIGHT:
				return getMolecularWeight();
			case FhirPackage.SUBSTANCE_SPECIFICATION__RELATIONSHIP:
				return getRelationship();
			case FhirPackage.SUBSTANCE_SPECIFICATION__NUCLEIC_ACID:
				return getNucleicAcid();
			case FhirPackage.SUBSTANCE_SPECIFICATION__POLYMER:
				return getPolymer();
			case FhirPackage.SUBSTANCE_SPECIFICATION__PROTEIN:
				return getProtein();
			case FhirPackage.SUBSTANCE_SPECIFICATION__SOURCE_MATERIAL:
				return getSourceMaterial();
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
			case FhirPackage.SUBSTANCE_SPECIFICATION__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__STATUS:
				setStatus((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__DOMAIN:
				setDomain((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__COMMENT:
				setComment((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__MOIETY:
				getMoiety().clear();
				getMoiety().addAll((Collection<? extends SubstanceSpecificationMoiety>)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends SubstanceSpecificationProperty>)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__REFERENCE_INFORMATION:
				setReferenceInformation((Reference)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__STRUCTURE:
				setStructure((SubstanceSpecificationStructure)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends SubstanceSpecificationCode>)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__NAME:
				getName().clear();
				getName().addAll((Collection<? extends SubstanceSpecificationName>)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__MOLECULAR_WEIGHT:
				getMolecularWeight().clear();
				getMolecularWeight().addAll((Collection<? extends SubstanceSpecificationMolecularWeight>)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__RELATIONSHIP:
				getRelationship().clear();
				getRelationship().addAll((Collection<? extends SubstanceSpecificationRelationship>)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__NUCLEIC_ACID:
				setNucleicAcid((Reference)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__POLYMER:
				setPolymer((Reference)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__PROTEIN:
				setProtein((Reference)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__SOURCE_MATERIAL:
				setSourceMaterial((Reference)newValue);
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
			case FhirPackage.SUBSTANCE_SPECIFICATION__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__STATUS:
				setStatus((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__DOMAIN:
				setDomain((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__SOURCE:
				getSource().clear();
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__COMMENT:
				setComment((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__MOIETY:
				getMoiety().clear();
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__PROPERTY:
				getProperty().clear();
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__REFERENCE_INFORMATION:
				setReferenceInformation((Reference)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__STRUCTURE:
				setStructure((SubstanceSpecificationStructure)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__CODE:
				getCode().clear();
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__NAME:
				getName().clear();
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__MOLECULAR_WEIGHT:
				getMolecularWeight().clear();
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__RELATIONSHIP:
				getRelationship().clear();
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__NUCLEIC_ACID:
				setNucleicAcid((Reference)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__POLYMER:
				setPolymer((Reference)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__PROTEIN:
				setProtein((Reference)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION__SOURCE_MATERIAL:
				setSourceMaterial((Reference)null);
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
			case FhirPackage.SUBSTANCE_SPECIFICATION__IDENTIFIER:
				return identifier != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION__TYPE:
				return type != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION__STATUS:
				return status != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION__DOMAIN:
				return domain != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION__DESCRIPTION:
				return description != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION__SOURCE:
				return source != null && !source.isEmpty();
			case FhirPackage.SUBSTANCE_SPECIFICATION__COMMENT:
				return comment != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION__MOIETY:
				return moiety != null && !moiety.isEmpty();
			case FhirPackage.SUBSTANCE_SPECIFICATION__PROPERTY:
				return property != null && !property.isEmpty();
			case FhirPackage.SUBSTANCE_SPECIFICATION__REFERENCE_INFORMATION:
				return referenceInformation != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION__STRUCTURE:
				return structure != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION__CODE:
				return code != null && !code.isEmpty();
			case FhirPackage.SUBSTANCE_SPECIFICATION__NAME:
				return name != null && !name.isEmpty();
			case FhirPackage.SUBSTANCE_SPECIFICATION__MOLECULAR_WEIGHT:
				return molecularWeight != null && !molecularWeight.isEmpty();
			case FhirPackage.SUBSTANCE_SPECIFICATION__RELATIONSHIP:
				return relationship != null && !relationship.isEmpty();
			case FhirPackage.SUBSTANCE_SPECIFICATION__NUCLEIC_ACID:
				return nucleicAcid != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION__POLYMER:
				return polymer != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION__PROTEIN:
				return protein != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION__SOURCE_MATERIAL:
				return sourceMaterial != null;
		}
		return super.eIsSet(featureID);
	}

} //SubstanceSpecificationImpl
