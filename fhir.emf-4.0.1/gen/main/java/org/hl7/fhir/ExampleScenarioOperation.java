/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Example Scenario Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Example of workflow instance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ExampleScenarioOperation#getNumber <em>Number</em>}</li>
 *   <li>{@link org.hl7.fhir.ExampleScenarioOperation#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ExampleScenarioOperation#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.ExampleScenarioOperation#getInitiator <em>Initiator</em>}</li>
 *   <li>{@link org.hl7.fhir.ExampleScenarioOperation#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.hl7.fhir.ExampleScenarioOperation#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.ExampleScenarioOperation#getInitiatorActive <em>Initiator Active</em>}</li>
 *   <li>{@link org.hl7.fhir.ExampleScenarioOperation#getReceiverActive <em>Receiver Active</em>}</li>
 *   <li>{@link org.hl7.fhir.ExampleScenarioOperation#getRequest <em>Request</em>}</li>
 *   <li>{@link org.hl7.fhir.ExampleScenarioOperation#getResponse <em>Response</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getExampleScenarioOperation()
 * @model extendedMetaData="name='ExampleScenario.Operation' kind='elementOnly'"
 * @generated
 */
public interface ExampleScenarioOperation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sequential number of the interaction, e.g. 1.2.5.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number</em>' containment reference.
	 * @see #setNumber(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getExampleScenarioOperation_Number()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='number' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getNumber();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExampleScenarioOperation#getNumber <em>Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' containment reference.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of operation - CRUD.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getExampleScenarioOperation_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExampleScenarioOperation#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The human-friendly name of the interaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getExampleScenarioOperation_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExampleScenarioOperation#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Initiator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Who starts the transaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initiator</em>' containment reference.
	 * @see #setInitiator(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getExampleScenarioOperation_Initiator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='initiator' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getInitiator();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExampleScenarioOperation#getInitiator <em>Initiator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiator</em>' containment reference.
	 * @see #getInitiator()
	 * @generated
	 */
	void setInitiator(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Receiver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Who receives the transaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receiver</em>' containment reference.
	 * @see #setReceiver(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getExampleScenarioOperation_Receiver()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='receiver' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getReceiver();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExampleScenarioOperation#getReceiver <em>Receiver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver</em>' containment reference.
	 * @see #getReceiver()
	 * @generated
	 */
	void setReceiver(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A comment to be inserted in the diagram.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getExampleScenarioOperation_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExampleScenarioOperation#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

	/**
	 * Returns the value of the '<em><b>Initiator Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the initiator is deactivated right after the transaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initiator Active</em>' containment reference.
	 * @see #setInitiatorActive(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getExampleScenarioOperation_InitiatorActive()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='initiatorActive' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getInitiatorActive();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExampleScenarioOperation#getInitiatorActive <em>Initiator Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiator Active</em>' containment reference.
	 * @see #getInitiatorActive()
	 * @generated
	 */
	void setInitiatorActive(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Receiver Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the receiver is deactivated right after the transaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receiver Active</em>' containment reference.
	 * @see #setReceiverActive(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getExampleScenarioOperation_ReceiverActive()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='receiverActive' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getReceiverActive();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExampleScenarioOperation#getReceiverActive <em>Receiver Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver Active</em>' containment reference.
	 * @see #getReceiverActive()
	 * @generated
	 */
	void setReceiverActive(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each resource instance used by the initiator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request</em>' containment reference.
	 * @see #setRequest(ExampleScenarioContainedInstance)
	 * @see org.hl7.fhir.FhirPackage#getExampleScenarioOperation_Request()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='request' namespace='##targetNamespace'"
	 * @generated
	 */
	ExampleScenarioContainedInstance getRequest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExampleScenarioOperation#getRequest <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' containment reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(ExampleScenarioContainedInstance value);

	/**
	 * Returns the value of the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each resource instance used by the responder.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Response</em>' containment reference.
	 * @see #setResponse(ExampleScenarioContainedInstance)
	 * @see org.hl7.fhir.FhirPackage#getExampleScenarioOperation_Response()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='response' namespace='##targetNamespace'"
	 * @generated
	 */
	ExampleScenarioContainedInstance getResponse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExampleScenarioOperation#getResponse <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' containment reference.
	 * @see #getResponse()
	 * @generated
	 */
	void setResponse(ExampleScenarioContainedInstance value);

} // ExampleScenarioOperation
