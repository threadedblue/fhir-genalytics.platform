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
import org.hl7.fhir.ContractAnswer;
import org.hl7.fhir.ContractOffer;
import org.hl7.fhir.ContractParty;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;
import org.hl7.fhir.UnsignedInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contract Offer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ContractOfferImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractOfferImpl#getParty <em>Party</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractOfferImpl#getTopic <em>Topic</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractOfferImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractOfferImpl#getDecision <em>Decision</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractOfferImpl#getDecisionMode <em>Decision Mode</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractOfferImpl#getAnswer <em>Answer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractOfferImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractOfferImpl#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractOfferImpl#getSecurityLabelNumber <em>Security Label Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContractOfferImpl extends BackboneElementImpl implements ContractOffer {
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
	 * The cached value of the '{@link #getParty() <em>Party</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParty()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractParty> party;

	/**
	 * The cached value of the '{@link #getTopic() <em>Topic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic()
	 * @generated
	 * @ordered
	 */
	protected Reference topic;

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
	 * The cached value of the '{@link #getDecision() <em>Decision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecision()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept decision;

	/**
	 * The cached value of the '{@link #getDecisionMode() <em>Decision Mode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionMode()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> decisionMode;

	/**
	 * The cached value of the '{@link #getAnswer() <em>Answer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswer()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractAnswer> answer;

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
	 * The cached value of the '{@link #getLinkId() <em>Link Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkId()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> linkId;

	/**
	 * The cached value of the '{@link #getSecurityLabelNumber() <em>Security Label Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLabelNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<UnsignedInt> securityLabelNumber;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractOfferImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getContractOffer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.CONTRACT_OFFER__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContractParty> getParty() {
		if (party == null) {
			party = new EObjectContainmentEList<ContractParty>(ContractParty.class, this, FhirPackage.CONTRACT_OFFER__PARTY);
		}
		return party;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getTopic() {
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopic(Reference newTopic, NotificationChain msgs) {
		Reference oldTopic = topic;
		topic = newTopic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_OFFER__TOPIC, oldTopic, newTopic);
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
	public void setTopic(Reference newTopic) {
		if (newTopic != topic) {
			NotificationChain msgs = null;
			if (topic != null)
				msgs = ((InternalEObject)topic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_OFFER__TOPIC, null, msgs);
			if (newTopic != null)
				msgs = ((InternalEObject)newTopic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_OFFER__TOPIC, null, msgs);
			msgs = basicSetTopic(newTopic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_OFFER__TOPIC, newTopic, newTopic));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_OFFER__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_OFFER__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_OFFER__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_OFFER__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getDecision() {
		return decision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDecision(CodeableConcept newDecision, NotificationChain msgs) {
		CodeableConcept oldDecision = decision;
		decision = newDecision;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_OFFER__DECISION, oldDecision, newDecision);
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
	public void setDecision(CodeableConcept newDecision) {
		if (newDecision != decision) {
			NotificationChain msgs = null;
			if (decision != null)
				msgs = ((InternalEObject)decision).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_OFFER__DECISION, null, msgs);
			if (newDecision != null)
				msgs = ((InternalEObject)newDecision).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_OFFER__DECISION, null, msgs);
			msgs = basicSetDecision(newDecision, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_OFFER__DECISION, newDecision, newDecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getDecisionMode() {
		if (decisionMode == null) {
			decisionMode = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CONTRACT_OFFER__DECISION_MODE);
		}
		return decisionMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContractAnswer> getAnswer() {
		if (answer == null) {
			answer = new EObjectContainmentEList<ContractAnswer>(ContractAnswer.class, this, FhirPackage.CONTRACT_OFFER__ANSWER);
		}
		return answer;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_OFFER__TEXT, oldText, newText);
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
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_OFFER__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_OFFER__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_OFFER__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.hl7.fhir.String> getLinkId() {
		if (linkId == null) {
			linkId = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.CONTRACT_OFFER__LINK_ID);
		}
		return linkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnsignedInt> getSecurityLabelNumber() {
		if (securityLabelNumber == null) {
			securityLabelNumber = new EObjectContainmentEList<UnsignedInt>(UnsignedInt.class, this, FhirPackage.CONTRACT_OFFER__SECURITY_LABEL_NUMBER);
		}
		return securityLabelNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CONTRACT_OFFER__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT_OFFER__PARTY:
				return ((InternalEList<?>)getParty()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT_OFFER__TOPIC:
				return basicSetTopic(null, msgs);
			case FhirPackage.CONTRACT_OFFER__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.CONTRACT_OFFER__DECISION:
				return basicSetDecision(null, msgs);
			case FhirPackage.CONTRACT_OFFER__DECISION_MODE:
				return ((InternalEList<?>)getDecisionMode()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT_OFFER__ANSWER:
				return ((InternalEList<?>)getAnswer()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT_OFFER__TEXT:
				return basicSetText(null, msgs);
			case FhirPackage.CONTRACT_OFFER__LINK_ID:
				return ((InternalEList<?>)getLinkId()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT_OFFER__SECURITY_LABEL_NUMBER:
				return ((InternalEList<?>)getSecurityLabelNumber()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CONTRACT_OFFER__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.CONTRACT_OFFER__PARTY:
				return getParty();
			case FhirPackage.CONTRACT_OFFER__TOPIC:
				return getTopic();
			case FhirPackage.CONTRACT_OFFER__TYPE:
				return getType();
			case FhirPackage.CONTRACT_OFFER__DECISION:
				return getDecision();
			case FhirPackage.CONTRACT_OFFER__DECISION_MODE:
				return getDecisionMode();
			case FhirPackage.CONTRACT_OFFER__ANSWER:
				return getAnswer();
			case FhirPackage.CONTRACT_OFFER__TEXT:
				return getText();
			case FhirPackage.CONTRACT_OFFER__LINK_ID:
				return getLinkId();
			case FhirPackage.CONTRACT_OFFER__SECURITY_LABEL_NUMBER:
				return getSecurityLabelNumber();
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
			case FhirPackage.CONTRACT_OFFER__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.CONTRACT_OFFER__PARTY:
				getParty().clear();
				getParty().addAll((Collection<? extends ContractParty>)newValue);
				return;
			case FhirPackage.CONTRACT_OFFER__TOPIC:
				setTopic((Reference)newValue);
				return;
			case FhirPackage.CONTRACT_OFFER__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.CONTRACT_OFFER__DECISION:
				setDecision((CodeableConcept)newValue);
				return;
			case FhirPackage.CONTRACT_OFFER__DECISION_MODE:
				getDecisionMode().clear();
				getDecisionMode().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CONTRACT_OFFER__ANSWER:
				getAnswer().clear();
				getAnswer().addAll((Collection<? extends ContractAnswer>)newValue);
				return;
			case FhirPackage.CONTRACT_OFFER__TEXT:
				setText((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CONTRACT_OFFER__LINK_ID:
				getLinkId().clear();
				getLinkId().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.CONTRACT_OFFER__SECURITY_LABEL_NUMBER:
				getSecurityLabelNumber().clear();
				getSecurityLabelNumber().addAll((Collection<? extends UnsignedInt>)newValue);
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
			case FhirPackage.CONTRACT_OFFER__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.CONTRACT_OFFER__PARTY:
				getParty().clear();
				return;
			case FhirPackage.CONTRACT_OFFER__TOPIC:
				setTopic((Reference)null);
				return;
			case FhirPackage.CONTRACT_OFFER__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.CONTRACT_OFFER__DECISION:
				setDecision((CodeableConcept)null);
				return;
			case FhirPackage.CONTRACT_OFFER__DECISION_MODE:
				getDecisionMode().clear();
				return;
			case FhirPackage.CONTRACT_OFFER__ANSWER:
				getAnswer().clear();
				return;
			case FhirPackage.CONTRACT_OFFER__TEXT:
				setText((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CONTRACT_OFFER__LINK_ID:
				getLinkId().clear();
				return;
			case FhirPackage.CONTRACT_OFFER__SECURITY_LABEL_NUMBER:
				getSecurityLabelNumber().clear();
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
			case FhirPackage.CONTRACT_OFFER__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.CONTRACT_OFFER__PARTY:
				return party != null && !party.isEmpty();
			case FhirPackage.CONTRACT_OFFER__TOPIC:
				return topic != null;
			case FhirPackage.CONTRACT_OFFER__TYPE:
				return type != null;
			case FhirPackage.CONTRACT_OFFER__DECISION:
				return decision != null;
			case FhirPackage.CONTRACT_OFFER__DECISION_MODE:
				return decisionMode != null && !decisionMode.isEmpty();
			case FhirPackage.CONTRACT_OFFER__ANSWER:
				return answer != null && !answer.isEmpty();
			case FhirPackage.CONTRACT_OFFER__TEXT:
				return text != null;
			case FhirPackage.CONTRACT_OFFER__LINK_ID:
				return linkId != null && !linkId.isEmpty();
			case FhirPackage.CONTRACT_OFFER__SECURITY_LABEL_NUMBER:
				return securityLabelNumber != null && !securityLabelNumber.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContractOfferImpl
