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
import org.hl7.fhir.ContractAction;
import org.hl7.fhir.ContractAsset;
import org.hl7.fhir.ContractOffer;
import org.hl7.fhir.ContractSecurityLabel;
import org.hl7.fhir.ContractTerm;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contract Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ContractTermImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractTermImpl#getIssued <em>Issued</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractTermImpl#getApplies <em>Applies</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractTermImpl#getTopicCodeableConcept <em>Topic Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractTermImpl#getTopicReference <em>Topic Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractTermImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractTermImpl#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractTermImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractTermImpl#getSecurityLabel <em>Security Label</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractTermImpl#getOffer <em>Offer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractTermImpl#getAsset <em>Asset</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractTermImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractTermImpl#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContractTermImpl extends BackboneElementImpl implements ContractTerm {
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
	 * The cached value of the '{@link #getSubType() <em>Sub Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept subType;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String text;

	/**
	 * The cached value of the '{@link #getSecurityLabel() <em>Security Label</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLabel()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractSecurityLabel> securityLabel;

	/**
	 * The cached value of the '{@link #getOffer() <em>Offer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffer()
	 * @generated
	 * @ordered
	 */
	protected ContractOffer offer;

	/**
	 * The cached value of the '{@link #getAsset() <em>Asset</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsset()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractAsset> asset;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractAction> action;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractTerm> group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getContractTerm();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_TERM__IDENTIFIER, oldIdentifier, newIdentifier);
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
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_TERM__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_TERM__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_TERM__IDENTIFIER, newIdentifier, newIdentifier));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_TERM__ISSUED, oldIssued, newIssued);
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
				msgs = ((InternalEObject)issued).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_TERM__ISSUED, null, msgs);
			if (newIssued != null)
				msgs = ((InternalEObject)newIssued).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_TERM__ISSUED, null, msgs);
			msgs = basicSetIssued(newIssued, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_TERM__ISSUED, newIssued, newIssued));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_TERM__APPLIES, oldApplies, newApplies);
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
				msgs = ((InternalEObject)applies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_TERM__APPLIES, null, msgs);
			if (newApplies != null)
				msgs = ((InternalEObject)newApplies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_TERM__APPLIES, null, msgs);
			msgs = basicSetApplies(newApplies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_TERM__APPLIES, newApplies, newApplies));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_TERM__TOPIC_CODEABLE_CONCEPT, oldTopicCodeableConcept, newTopicCodeableConcept);
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
				msgs = ((InternalEObject)topicCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_TERM__TOPIC_CODEABLE_CONCEPT, null, msgs);
			if (newTopicCodeableConcept != null)
				msgs = ((InternalEObject)newTopicCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_TERM__TOPIC_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetTopicCodeableConcept(newTopicCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_TERM__TOPIC_CODEABLE_CONCEPT, newTopicCodeableConcept, newTopicCodeableConcept));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_TERM__TOPIC_REFERENCE, oldTopicReference, newTopicReference);
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
				msgs = ((InternalEObject)topicReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_TERM__TOPIC_REFERENCE, null, msgs);
			if (newTopicReference != null)
				msgs = ((InternalEObject)newTopicReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_TERM__TOPIC_REFERENCE, null, msgs);
			msgs = basicSetTopicReference(newTopicReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_TERM__TOPIC_REFERENCE, newTopicReference, newTopicReference));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_TERM__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_TERM__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_TERM__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_TERM__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getSubType() {
		return subType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubType(CodeableConcept newSubType, NotificationChain msgs) {
		CodeableConcept oldSubType = subType;
		subType = newSubType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_TERM__SUB_TYPE, oldSubType, newSubType);
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
	public void setSubType(CodeableConcept newSubType) {
		if (newSubType != subType) {
			NotificationChain msgs = null;
			if (subType != null)
				msgs = ((InternalEObject)subType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_TERM__SUB_TYPE, null, msgs);
			if (newSubType != null)
				msgs = ((InternalEObject)newSubType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_TERM__SUB_TYPE, null, msgs);
			msgs = basicSetSubType(newSubType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_TERM__SUB_TYPE, newSubType, newSubType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(org.hl7.fhir.String newText, NotificationChain msgs) {
		org.hl7.fhir.String oldText = text;
		text = newText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_TERM__TEXT, oldText, newText);
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
	public void setText(org.hl7.fhir.String newText) {
		if (newText != text) {
			NotificationChain msgs = null;
			if (text != null)
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_TERM__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_TERM__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_TERM__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContractSecurityLabel> getSecurityLabel() {
		if (securityLabel == null) {
			securityLabel = new EObjectContainmentEList<ContractSecurityLabel>(ContractSecurityLabel.class, this, FhirPackage.CONTRACT_TERM__SECURITY_LABEL);
		}
		return securityLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractOffer getOffer() {
		return offer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffer(ContractOffer newOffer, NotificationChain msgs) {
		ContractOffer oldOffer = offer;
		offer = newOffer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_TERM__OFFER, oldOffer, newOffer);
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
	public void setOffer(ContractOffer newOffer) {
		if (newOffer != offer) {
			NotificationChain msgs = null;
			if (offer != null)
				msgs = ((InternalEObject)offer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_TERM__OFFER, null, msgs);
			if (newOffer != null)
				msgs = ((InternalEObject)newOffer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_TERM__OFFER, null, msgs);
			msgs = basicSetOffer(newOffer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_TERM__OFFER, newOffer, newOffer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContractAsset> getAsset() {
		if (asset == null) {
			asset = new EObjectContainmentEList<ContractAsset>(ContractAsset.class, this, FhirPackage.CONTRACT_TERM__ASSET);
		}
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContractAction> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<ContractAction>(ContractAction.class, this, FhirPackage.CONTRACT_TERM__ACTION);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContractTerm> getGroup() {
		if (group == null) {
			group = new EObjectContainmentEList<ContractTerm>(ContractTerm.class, this, FhirPackage.CONTRACT_TERM__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CONTRACT_TERM__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.CONTRACT_TERM__ISSUED:
				return basicSetIssued(null, msgs);
			case FhirPackage.CONTRACT_TERM__APPLIES:
				return basicSetApplies(null, msgs);
			case FhirPackage.CONTRACT_TERM__TOPIC_CODEABLE_CONCEPT:
				return basicSetTopicCodeableConcept(null, msgs);
			case FhirPackage.CONTRACT_TERM__TOPIC_REFERENCE:
				return basicSetTopicReference(null, msgs);
			case FhirPackage.CONTRACT_TERM__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.CONTRACT_TERM__SUB_TYPE:
				return basicSetSubType(null, msgs);
			case FhirPackage.CONTRACT_TERM__TEXT:
				return basicSetText(null, msgs);
			case FhirPackage.CONTRACT_TERM__SECURITY_LABEL:
				return ((InternalEList<?>)getSecurityLabel()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT_TERM__OFFER:
				return basicSetOffer(null, msgs);
			case FhirPackage.CONTRACT_TERM__ASSET:
				return ((InternalEList<?>)getAsset()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT_TERM__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT_TERM__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CONTRACT_TERM__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.CONTRACT_TERM__ISSUED:
				return getIssued();
			case FhirPackage.CONTRACT_TERM__APPLIES:
				return getApplies();
			case FhirPackage.CONTRACT_TERM__TOPIC_CODEABLE_CONCEPT:
				return getTopicCodeableConcept();
			case FhirPackage.CONTRACT_TERM__TOPIC_REFERENCE:
				return getTopicReference();
			case FhirPackage.CONTRACT_TERM__TYPE:
				return getType();
			case FhirPackage.CONTRACT_TERM__SUB_TYPE:
				return getSubType();
			case FhirPackage.CONTRACT_TERM__TEXT:
				return getText();
			case FhirPackage.CONTRACT_TERM__SECURITY_LABEL:
				return getSecurityLabel();
			case FhirPackage.CONTRACT_TERM__OFFER:
				return getOffer();
			case FhirPackage.CONTRACT_TERM__ASSET:
				return getAsset();
			case FhirPackage.CONTRACT_TERM__ACTION:
				return getAction();
			case FhirPackage.CONTRACT_TERM__GROUP:
				return getGroup();
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
			case FhirPackage.CONTRACT_TERM__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.CONTRACT_TERM__ISSUED:
				setIssued((DateTime)newValue);
				return;
			case FhirPackage.CONTRACT_TERM__APPLIES:
				setApplies((Period)newValue);
				return;
			case FhirPackage.CONTRACT_TERM__TOPIC_CODEABLE_CONCEPT:
				setTopicCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.CONTRACT_TERM__TOPIC_REFERENCE:
				setTopicReference((Reference)newValue);
				return;
			case FhirPackage.CONTRACT_TERM__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.CONTRACT_TERM__SUB_TYPE:
				setSubType((CodeableConcept)newValue);
				return;
			case FhirPackage.CONTRACT_TERM__TEXT:
				setText((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CONTRACT_TERM__SECURITY_LABEL:
				getSecurityLabel().clear();
				getSecurityLabel().addAll((Collection<? extends ContractSecurityLabel>)newValue);
				return;
			case FhirPackage.CONTRACT_TERM__OFFER:
				setOffer((ContractOffer)newValue);
				return;
			case FhirPackage.CONTRACT_TERM__ASSET:
				getAsset().clear();
				getAsset().addAll((Collection<? extends ContractAsset>)newValue);
				return;
			case FhirPackage.CONTRACT_TERM__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends ContractAction>)newValue);
				return;
			case FhirPackage.CONTRACT_TERM__GROUP:
				getGroup().clear();
				getGroup().addAll((Collection<? extends ContractTerm>)newValue);
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
			case FhirPackage.CONTRACT_TERM__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.CONTRACT_TERM__ISSUED:
				setIssued((DateTime)null);
				return;
			case FhirPackage.CONTRACT_TERM__APPLIES:
				setApplies((Period)null);
				return;
			case FhirPackage.CONTRACT_TERM__TOPIC_CODEABLE_CONCEPT:
				setTopicCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.CONTRACT_TERM__TOPIC_REFERENCE:
				setTopicReference((Reference)null);
				return;
			case FhirPackage.CONTRACT_TERM__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.CONTRACT_TERM__SUB_TYPE:
				setSubType((CodeableConcept)null);
				return;
			case FhirPackage.CONTRACT_TERM__TEXT:
				setText((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CONTRACT_TERM__SECURITY_LABEL:
				getSecurityLabel().clear();
				return;
			case FhirPackage.CONTRACT_TERM__OFFER:
				setOffer((ContractOffer)null);
				return;
			case FhirPackage.CONTRACT_TERM__ASSET:
				getAsset().clear();
				return;
			case FhirPackage.CONTRACT_TERM__ACTION:
				getAction().clear();
				return;
			case FhirPackage.CONTRACT_TERM__GROUP:
				getGroup().clear();
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
			case FhirPackage.CONTRACT_TERM__IDENTIFIER:
				return identifier != null;
			case FhirPackage.CONTRACT_TERM__ISSUED:
				return issued != null;
			case FhirPackage.CONTRACT_TERM__APPLIES:
				return applies != null;
			case FhirPackage.CONTRACT_TERM__TOPIC_CODEABLE_CONCEPT:
				return topicCodeableConcept != null;
			case FhirPackage.CONTRACT_TERM__TOPIC_REFERENCE:
				return topicReference != null;
			case FhirPackage.CONTRACT_TERM__TYPE:
				return type != null;
			case FhirPackage.CONTRACT_TERM__SUB_TYPE:
				return subType != null;
			case FhirPackage.CONTRACT_TERM__TEXT:
				return text != null;
			case FhirPackage.CONTRACT_TERM__SECURITY_LABEL:
				return securityLabel != null && !securityLabel.isEmpty();
			case FhirPackage.CONTRACT_TERM__OFFER:
				return offer != null;
			case FhirPackage.CONTRACT_TERM__ASSET:
				return asset != null && !asset.isEmpty();
			case FhirPackage.CONTRACT_TERM__ACTION:
				return action != null && !action.isEmpty();
			case FhirPackage.CONTRACT_TERM__GROUP:
				return group != null && !group.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContractTermImpl
