/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Statement Supported Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.CapabilityStatementSupportedMessage#getMode <em>Mode</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatementSupportedMessage#getDefinition <em>Definition</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementSupportedMessage()
 * @model extendedMetaData="name='CapabilityStatement.SupportedMessage' kind='elementOnly'"
 * @generated
 */
public interface CapabilityStatementSupportedMessage extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The mode of this event declaration - whether application is sender or receiver.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mode</em>' containment reference.
	 * @see #setMode(EventCapabilityMode)
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementSupportedMessage_Mode()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mode' namespace='##targetNamespace'"
	 * @generated
	 */
	EventCapabilityMode getMode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CapabilityStatementSupportedMessage#getMode <em>Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' containment reference.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(EventCapabilityMode value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Points to a message definition that identifies the messaging event, message structure, allowed responses, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(Canonical)
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementSupportedMessage_Definition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='definition' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CapabilityStatementSupportedMessage#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(Canonical value);

} // CapabilityStatementSupportedMessage
