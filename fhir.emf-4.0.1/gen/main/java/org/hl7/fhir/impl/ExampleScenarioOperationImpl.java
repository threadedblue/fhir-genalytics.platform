/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.ExampleScenarioContainedInstance;
import org.hl7.fhir.ExampleScenarioOperation;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Markdown;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Example Scenario Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioOperationImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioOperationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioOperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioOperationImpl#getInitiator <em>Initiator</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioOperationImpl#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioOperationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioOperationImpl#getInitiatorActive <em>Initiator Active</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioOperationImpl#getReceiverActive <em>Receiver Active</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioOperationImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioOperationImpl#getResponse <em>Response</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExampleScenarioOperationImpl extends BackboneElementImpl implements ExampleScenarioOperation {
	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String number;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String type;

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
	 * The cached value of the '{@link #getInitiator() <em>Initiator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiator()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String initiator;

	/**
	 * The cached value of the '{@link #getReceiver() <em>Receiver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiver()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String receiver;

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
	 * The cached value of the '{@link #getInitiatorActive() <em>Initiator Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiatorActive()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean initiatorActive;

	/**
	 * The cached value of the '{@link #getReceiverActive() <em>Receiver Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverActive()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean receiverActive;

	/**
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected ExampleScenarioContainedInstance request;

	/**
	 * The cached value of the '{@link #getResponse() <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponse()
	 * @generated
	 * @ordered
	 */
	protected ExampleScenarioContainedInstance response;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExampleScenarioOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getExampleScenarioOperation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumber(org.hl7.fhir.String newNumber, NotificationChain msgs) {
		org.hl7.fhir.String oldNumber = number;
		number = newNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_OPERATION__NUMBER, oldNumber, newNumber);
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
	public void setNumber(org.hl7.fhir.String newNumber) {
		if (newNumber != number) {
			NotificationChain msgs = null;
			if (number != null)
				msgs = ((InternalEObject)number).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_OPERATION__NUMBER, null, msgs);
			if (newNumber != null)
				msgs = ((InternalEObject)newNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_OPERATION__NUMBER, null, msgs);
			msgs = basicSetNumber(newNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_OPERATION__NUMBER, newNumber, newNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(org.hl7.fhir.String newType, NotificationChain msgs) {
		org.hl7.fhir.String oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_OPERATION__TYPE, oldType, newType);
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
	public void setType(org.hl7.fhir.String newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_OPERATION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_OPERATION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_OPERATION__TYPE, newType, newType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_OPERATION__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_OPERATION__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_OPERATION__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_OPERATION__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getInitiator() {
		return initiator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitiator(org.hl7.fhir.String newInitiator, NotificationChain msgs) {
		org.hl7.fhir.String oldInitiator = initiator;
		initiator = newInitiator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_OPERATION__INITIATOR, oldInitiator, newInitiator);
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
	public void setInitiator(org.hl7.fhir.String newInitiator) {
		if (newInitiator != initiator) {
			NotificationChain msgs = null;
			if (initiator != null)
				msgs = ((InternalEObject)initiator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_OPERATION__INITIATOR, null, msgs);
			if (newInitiator != null)
				msgs = ((InternalEObject)newInitiator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_OPERATION__INITIATOR, null, msgs);
			msgs = basicSetInitiator(newInitiator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_OPERATION__INITIATOR, newInitiator, newInitiator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getReceiver() {
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceiver(org.hl7.fhir.String newReceiver, NotificationChain msgs) {
		org.hl7.fhir.String oldReceiver = receiver;
		receiver = newReceiver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_OPERATION__RECEIVER, oldReceiver, newReceiver);
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
	public void setReceiver(org.hl7.fhir.String newReceiver) {
		if (newReceiver != receiver) {
			NotificationChain msgs = null;
			if (receiver != null)
				msgs = ((InternalEObject)receiver).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_OPERATION__RECEIVER, null, msgs);
			if (newReceiver != null)
				msgs = ((InternalEObject)newReceiver).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_OPERATION__RECEIVER, null, msgs);
			msgs = basicSetReceiver(newReceiver, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_OPERATION__RECEIVER, newReceiver, newReceiver));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_OPERATION__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_OPERATION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_OPERATION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_OPERATION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getInitiatorActive() {
		return initiatorActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitiatorActive(org.hl7.fhir.Boolean newInitiatorActive, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldInitiatorActive = initiatorActive;
		initiatorActive = newInitiatorActive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_OPERATION__INITIATOR_ACTIVE, oldInitiatorActive, newInitiatorActive);
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
	public void setInitiatorActive(org.hl7.fhir.Boolean newInitiatorActive) {
		if (newInitiatorActive != initiatorActive) {
			NotificationChain msgs = null;
			if (initiatorActive != null)
				msgs = ((InternalEObject)initiatorActive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_OPERATION__INITIATOR_ACTIVE, null, msgs);
			if (newInitiatorActive != null)
				msgs = ((InternalEObject)newInitiatorActive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_OPERATION__INITIATOR_ACTIVE, null, msgs);
			msgs = basicSetInitiatorActive(newInitiatorActive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_OPERATION__INITIATOR_ACTIVE, newInitiatorActive, newInitiatorActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getReceiverActive() {
		return receiverActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceiverActive(org.hl7.fhir.Boolean newReceiverActive, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldReceiverActive = receiverActive;
		receiverActive = newReceiverActive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_OPERATION__RECEIVER_ACTIVE, oldReceiverActive, newReceiverActive);
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
	public void setReceiverActive(org.hl7.fhir.Boolean newReceiverActive) {
		if (newReceiverActive != receiverActive) {
			NotificationChain msgs = null;
			if (receiverActive != null)
				msgs = ((InternalEObject)receiverActive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_OPERATION__RECEIVER_ACTIVE, null, msgs);
			if (newReceiverActive != null)
				msgs = ((InternalEObject)newReceiverActive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_OPERATION__RECEIVER_ACTIVE, null, msgs);
			msgs = basicSetReceiverActive(newReceiverActive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_OPERATION__RECEIVER_ACTIVE, newReceiverActive, newReceiverActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExampleScenarioContainedInstance getRequest() {
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequest(ExampleScenarioContainedInstance newRequest, NotificationChain msgs) {
		ExampleScenarioContainedInstance oldRequest = request;
		request = newRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_OPERATION__REQUEST, oldRequest, newRequest);
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
	public void setRequest(ExampleScenarioContainedInstance newRequest) {
		if (newRequest != request) {
			NotificationChain msgs = null;
			if (request != null)
				msgs = ((InternalEObject)request).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_OPERATION__REQUEST, null, msgs);
			if (newRequest != null)
				msgs = ((InternalEObject)newRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_OPERATION__REQUEST, null, msgs);
			msgs = basicSetRequest(newRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_OPERATION__REQUEST, newRequest, newRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExampleScenarioContainedInstance getResponse() {
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponse(ExampleScenarioContainedInstance newResponse, NotificationChain msgs) {
		ExampleScenarioContainedInstance oldResponse = response;
		response = newResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_OPERATION__RESPONSE, oldResponse, newResponse);
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
	public void setResponse(ExampleScenarioContainedInstance newResponse) {
		if (newResponse != response) {
			NotificationChain msgs = null;
			if (response != null)
				msgs = ((InternalEObject)response).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_OPERATION__RESPONSE, null, msgs);
			if (newResponse != null)
				msgs = ((InternalEObject)newResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_OPERATION__RESPONSE, null, msgs);
			msgs = basicSetResponse(newResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_OPERATION__RESPONSE, newResponse, newResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__NUMBER:
				return basicSetNumber(null, msgs);
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__INITIATOR:
				return basicSetInitiator(null, msgs);
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__RECEIVER:
				return basicSetReceiver(null, msgs);
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__INITIATOR_ACTIVE:
				return basicSetInitiatorActive(null, msgs);
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__RECEIVER_ACTIVE:
				return basicSetReceiverActive(null, msgs);
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__REQUEST:
				return basicSetRequest(null, msgs);
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__RESPONSE:
				return basicSetResponse(null, msgs);
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
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__NUMBER:
				return getNumber();
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__TYPE:
				return getType();
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__NAME:
				return getName();
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__INITIATOR:
				return getInitiator();
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__RECEIVER:
				return getReceiver();
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__DESCRIPTION:
				return getDescription();
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__INITIATOR_ACTIVE:
				return getInitiatorActive();
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__RECEIVER_ACTIVE:
				return getReceiverActive();
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__REQUEST:
				return getRequest();
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__RESPONSE:
				return getResponse();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__NUMBER:
				setNumber((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__TYPE:
				setType((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__INITIATOR:
				setInitiator((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__RECEIVER:
				setReceiver((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__INITIATOR_ACTIVE:
				setInitiatorActive((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__RECEIVER_ACTIVE:
				setReceiverActive((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__REQUEST:
				setRequest((ExampleScenarioContainedInstance)newValue);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__RESPONSE:
				setResponse((ExampleScenarioContainedInstance)newValue);
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
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__NUMBER:
				setNumber((org.hl7.fhir.String)null);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__TYPE:
				setType((org.hl7.fhir.String)null);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__INITIATOR:
				setInitiator((org.hl7.fhir.String)null);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__RECEIVER:
				setReceiver((org.hl7.fhir.String)null);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__INITIATOR_ACTIVE:
				setInitiatorActive((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__RECEIVER_ACTIVE:
				setReceiverActive((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__REQUEST:
				setRequest((ExampleScenarioContainedInstance)null);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__RESPONSE:
				setResponse((ExampleScenarioContainedInstance)null);
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
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__NUMBER:
				return number != null;
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__TYPE:
				return type != null;
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__NAME:
				return name != null;
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__INITIATOR:
				return initiator != null;
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__RECEIVER:
				return receiver != null;
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__DESCRIPTION:
				return description != null;
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__INITIATOR_ACTIVE:
				return initiatorActive != null;
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__RECEIVER_ACTIVE:
				return receiverActive != null;
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__REQUEST:
				return request != null;
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION__RESPONSE:
				return response != null;
		}
		return super.eIsSet(featureID);
	}

} //ExampleScenarioOperationImpl
