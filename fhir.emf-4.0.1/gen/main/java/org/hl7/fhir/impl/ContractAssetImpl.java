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
import org.hl7.fhir.Coding;
import org.hl7.fhir.ContractAnswer;
import org.hl7.fhir.ContractAsset;
import org.hl7.fhir.ContractContext;
import org.hl7.fhir.ContractValuedItem;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;
import org.hl7.fhir.UnsignedInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contract Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ContractAssetImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractAssetImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractAssetImpl#getTypeReference <em>Type Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractAssetImpl#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractAssetImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractAssetImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractAssetImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractAssetImpl#getPeriodType <em>Period Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractAssetImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractAssetImpl#getUsePeriod <em>Use Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractAssetImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractAssetImpl#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractAssetImpl#getAnswer <em>Answer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractAssetImpl#getSecurityLabelNumber <em>Security Label Number</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractAssetImpl#getValuedItem <em>Valued Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContractAssetImpl extends BackboneElementImpl implements ContractAsset {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> type;

	/**
	 * The cached value of the '{@link #getTypeReference() <em>Type Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeReference()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> typeReference;

	/**
	 * The cached value of the '{@link #getSubtype() <em>Subtype</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtype()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> subtype;

	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected Coding relationship;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractContext> context;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String condition;

	/**
	 * The cached value of the '{@link #getPeriodType() <em>Period Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodType()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> periodType;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected EList<Period> period;

	/**
	 * The cached value of the '{@link #getUsePeriod() <em>Use Period</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsePeriod()
	 * @generated
	 * @ordered
	 */
	protected EList<Period> usePeriod;

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
	 * The cached value of the '{@link #getAnswer() <em>Answer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswer()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractAnswer> answer;

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
	 * The cached value of the '{@link #getValuedItem() <em>Valued Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuedItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractValuedItem> valuedItem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractAssetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getContractAsset();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_ASSET__SCOPE, oldScope, newScope);
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
				msgs = ((InternalEObject)scope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_ASSET__SCOPE, null, msgs);
			if (newScope != null)
				msgs = ((InternalEObject)newScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_ASSET__SCOPE, null, msgs);
			msgs = basicSetScope(newScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_ASSET__SCOPE, newScope, newScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getType() {
		if (type == null) {
			type = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CONTRACT_ASSET__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getTypeReference() {
		if (typeReference == null) {
			typeReference = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CONTRACT_ASSET__TYPE_REFERENCE);
		}
		return typeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getSubtype() {
		if (subtype == null) {
			subtype = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CONTRACT_ASSET__SUBTYPE);
		}
		return subtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coding getRelationship() {
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationship(Coding newRelationship, NotificationChain msgs) {
		Coding oldRelationship = relationship;
		relationship = newRelationship;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_ASSET__RELATIONSHIP, oldRelationship, newRelationship);
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
	public void setRelationship(Coding newRelationship) {
		if (newRelationship != relationship) {
			NotificationChain msgs = null;
			if (relationship != null)
				msgs = ((InternalEObject)relationship).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_ASSET__RELATIONSHIP, null, msgs);
			if (newRelationship != null)
				msgs = ((InternalEObject)newRelationship).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_ASSET__RELATIONSHIP, null, msgs);
			msgs = basicSetRelationship(newRelationship, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_ASSET__RELATIONSHIP, newRelationship, newRelationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContractContext> getContext() {
		if (context == null) {
			context = new EObjectContainmentEList<ContractContext>(ContractContext.class, this, FhirPackage.CONTRACT_ASSET__CONTEXT);
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(org.hl7.fhir.String newCondition, NotificationChain msgs) {
		org.hl7.fhir.String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_ASSET__CONDITION, oldCondition, newCondition);
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
	public void setCondition(org.hl7.fhir.String newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_ASSET__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_ASSET__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_ASSET__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getPeriodType() {
		if (periodType == null) {
			periodType = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CONTRACT_ASSET__PERIOD_TYPE);
		}
		return periodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Period> getPeriod() {
		if (period == null) {
			period = new EObjectContainmentEList<Period>(Period.class, this, FhirPackage.CONTRACT_ASSET__PERIOD);
		}
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Period> getUsePeriod() {
		if (usePeriod == null) {
			usePeriod = new EObjectContainmentEList<Period>(Period.class, this, FhirPackage.CONTRACT_ASSET__USE_PERIOD);
		}
		return usePeriod;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_ASSET__TEXT, oldText, newText);
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
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_ASSET__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_ASSET__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_ASSET__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.hl7.fhir.String> getLinkId() {
		if (linkId == null) {
			linkId = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.CONTRACT_ASSET__LINK_ID);
		}
		return linkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContractAnswer> getAnswer() {
		if (answer == null) {
			answer = new EObjectContainmentEList<ContractAnswer>(ContractAnswer.class, this, FhirPackage.CONTRACT_ASSET__ANSWER);
		}
		return answer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnsignedInt> getSecurityLabelNumber() {
		if (securityLabelNumber == null) {
			securityLabelNumber = new EObjectContainmentEList<UnsignedInt>(UnsignedInt.class, this, FhirPackage.CONTRACT_ASSET__SECURITY_LABEL_NUMBER);
		}
		return securityLabelNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContractValuedItem> getValuedItem() {
		if (valuedItem == null) {
			valuedItem = new EObjectContainmentEList<ContractValuedItem>(ContractValuedItem.class, this, FhirPackage.CONTRACT_ASSET__VALUED_ITEM);
		}
		return valuedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CONTRACT_ASSET__SCOPE:
				return basicSetScope(null, msgs);
			case FhirPackage.CONTRACT_ASSET__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT_ASSET__TYPE_REFERENCE:
				return ((InternalEList<?>)getTypeReference()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT_ASSET__SUBTYPE:
				return ((InternalEList<?>)getSubtype()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT_ASSET__RELATIONSHIP:
				return basicSetRelationship(null, msgs);
			case FhirPackage.CONTRACT_ASSET__CONTEXT:
				return ((InternalEList<?>)getContext()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT_ASSET__CONDITION:
				return basicSetCondition(null, msgs);
			case FhirPackage.CONTRACT_ASSET__PERIOD_TYPE:
				return ((InternalEList<?>)getPeriodType()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT_ASSET__PERIOD:
				return ((InternalEList<?>)getPeriod()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT_ASSET__USE_PERIOD:
				return ((InternalEList<?>)getUsePeriod()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT_ASSET__TEXT:
				return basicSetText(null, msgs);
			case FhirPackage.CONTRACT_ASSET__LINK_ID:
				return ((InternalEList<?>)getLinkId()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT_ASSET__ANSWER:
				return ((InternalEList<?>)getAnswer()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT_ASSET__SECURITY_LABEL_NUMBER:
				return ((InternalEList<?>)getSecurityLabelNumber()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT_ASSET__VALUED_ITEM:
				return ((InternalEList<?>)getValuedItem()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CONTRACT_ASSET__SCOPE:
				return getScope();
			case FhirPackage.CONTRACT_ASSET__TYPE:
				return getType();
			case FhirPackage.CONTRACT_ASSET__TYPE_REFERENCE:
				return getTypeReference();
			case FhirPackage.CONTRACT_ASSET__SUBTYPE:
				return getSubtype();
			case FhirPackage.CONTRACT_ASSET__RELATIONSHIP:
				return getRelationship();
			case FhirPackage.CONTRACT_ASSET__CONTEXT:
				return getContext();
			case FhirPackage.CONTRACT_ASSET__CONDITION:
				return getCondition();
			case FhirPackage.CONTRACT_ASSET__PERIOD_TYPE:
				return getPeriodType();
			case FhirPackage.CONTRACT_ASSET__PERIOD:
				return getPeriod();
			case FhirPackage.CONTRACT_ASSET__USE_PERIOD:
				return getUsePeriod();
			case FhirPackage.CONTRACT_ASSET__TEXT:
				return getText();
			case FhirPackage.CONTRACT_ASSET__LINK_ID:
				return getLinkId();
			case FhirPackage.CONTRACT_ASSET__ANSWER:
				return getAnswer();
			case FhirPackage.CONTRACT_ASSET__SECURITY_LABEL_NUMBER:
				return getSecurityLabelNumber();
			case FhirPackage.CONTRACT_ASSET__VALUED_ITEM:
				return getValuedItem();
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
			case FhirPackage.CONTRACT_ASSET__SCOPE:
				setScope((CodeableConcept)newValue);
				return;
			case FhirPackage.CONTRACT_ASSET__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CONTRACT_ASSET__TYPE_REFERENCE:
				getTypeReference().clear();
				getTypeReference().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CONTRACT_ASSET__SUBTYPE:
				getSubtype().clear();
				getSubtype().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CONTRACT_ASSET__RELATIONSHIP:
				setRelationship((Coding)newValue);
				return;
			case FhirPackage.CONTRACT_ASSET__CONTEXT:
				getContext().clear();
				getContext().addAll((Collection<? extends ContractContext>)newValue);
				return;
			case FhirPackage.CONTRACT_ASSET__CONDITION:
				setCondition((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CONTRACT_ASSET__PERIOD_TYPE:
				getPeriodType().clear();
				getPeriodType().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CONTRACT_ASSET__PERIOD:
				getPeriod().clear();
				getPeriod().addAll((Collection<? extends Period>)newValue);
				return;
			case FhirPackage.CONTRACT_ASSET__USE_PERIOD:
				getUsePeriod().clear();
				getUsePeriod().addAll((Collection<? extends Period>)newValue);
				return;
			case FhirPackage.CONTRACT_ASSET__TEXT:
				setText((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CONTRACT_ASSET__LINK_ID:
				getLinkId().clear();
				getLinkId().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.CONTRACT_ASSET__ANSWER:
				getAnswer().clear();
				getAnswer().addAll((Collection<? extends ContractAnswer>)newValue);
				return;
			case FhirPackage.CONTRACT_ASSET__SECURITY_LABEL_NUMBER:
				getSecurityLabelNumber().clear();
				getSecurityLabelNumber().addAll((Collection<? extends UnsignedInt>)newValue);
				return;
			case FhirPackage.CONTRACT_ASSET__VALUED_ITEM:
				getValuedItem().clear();
				getValuedItem().addAll((Collection<? extends ContractValuedItem>)newValue);
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
			case FhirPackage.CONTRACT_ASSET__SCOPE:
				setScope((CodeableConcept)null);
				return;
			case FhirPackage.CONTRACT_ASSET__TYPE:
				getType().clear();
				return;
			case FhirPackage.CONTRACT_ASSET__TYPE_REFERENCE:
				getTypeReference().clear();
				return;
			case FhirPackage.CONTRACT_ASSET__SUBTYPE:
				getSubtype().clear();
				return;
			case FhirPackage.CONTRACT_ASSET__RELATIONSHIP:
				setRelationship((Coding)null);
				return;
			case FhirPackage.CONTRACT_ASSET__CONTEXT:
				getContext().clear();
				return;
			case FhirPackage.CONTRACT_ASSET__CONDITION:
				setCondition((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CONTRACT_ASSET__PERIOD_TYPE:
				getPeriodType().clear();
				return;
			case FhirPackage.CONTRACT_ASSET__PERIOD:
				getPeriod().clear();
				return;
			case FhirPackage.CONTRACT_ASSET__USE_PERIOD:
				getUsePeriod().clear();
				return;
			case FhirPackage.CONTRACT_ASSET__TEXT:
				setText((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CONTRACT_ASSET__LINK_ID:
				getLinkId().clear();
				return;
			case FhirPackage.CONTRACT_ASSET__ANSWER:
				getAnswer().clear();
				return;
			case FhirPackage.CONTRACT_ASSET__SECURITY_LABEL_NUMBER:
				getSecurityLabelNumber().clear();
				return;
			case FhirPackage.CONTRACT_ASSET__VALUED_ITEM:
				getValuedItem().clear();
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
			case FhirPackage.CONTRACT_ASSET__SCOPE:
				return scope != null;
			case FhirPackage.CONTRACT_ASSET__TYPE:
				return type != null && !type.isEmpty();
			case FhirPackage.CONTRACT_ASSET__TYPE_REFERENCE:
				return typeReference != null && !typeReference.isEmpty();
			case FhirPackage.CONTRACT_ASSET__SUBTYPE:
				return subtype != null && !subtype.isEmpty();
			case FhirPackage.CONTRACT_ASSET__RELATIONSHIP:
				return relationship != null;
			case FhirPackage.CONTRACT_ASSET__CONTEXT:
				return context != null && !context.isEmpty();
			case FhirPackage.CONTRACT_ASSET__CONDITION:
				return condition != null;
			case FhirPackage.CONTRACT_ASSET__PERIOD_TYPE:
				return periodType != null && !periodType.isEmpty();
			case FhirPackage.CONTRACT_ASSET__PERIOD:
				return period != null && !period.isEmpty();
			case FhirPackage.CONTRACT_ASSET__USE_PERIOD:
				return usePeriod != null && !usePeriod.isEmpty();
			case FhirPackage.CONTRACT_ASSET__TEXT:
				return text != null;
			case FhirPackage.CONTRACT_ASSET__LINK_ID:
				return linkId != null && !linkId.isEmpty();
			case FhirPackage.CONTRACT_ASSET__ANSWER:
				return answer != null && !answer.isEmpty();
			case FhirPackage.CONTRACT_ASSET__SECURITY_LABEL_NUMBER:
				return securityLabelNumber != null && !securityLabelNumber.isEmpty();
			case FhirPackage.CONTRACT_ASSET__VALUED_ITEM:
				return valuedItem != null && !valuedItem.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContractAssetImpl
