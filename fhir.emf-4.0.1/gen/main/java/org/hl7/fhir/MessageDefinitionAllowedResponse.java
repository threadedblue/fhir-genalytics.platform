/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Definition Allowed Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the characteristics of a message that can be shared between systems, including the type of event that initiates the message, the content to be transmitted and what response(s), if any, are permitted.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MessageDefinitionAllowedResponse#getMessage <em>Message</em>}</li>
 *   <li>{@link org.hl7.fhir.MessageDefinitionAllowedResponse#getSituation <em>Situation</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMessageDefinitionAllowedResponse()
 * @model extendedMetaData="name='MessageDefinition.AllowedResponse' kind='elementOnly'"
 * @generated
 */
public interface MessageDefinitionAllowedResponse extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the message definition that must be adhered to by this supported response.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message</em>' containment reference.
	 * @see #setMessage(Canonical)
	 * @see org.hl7.fhir.FhirPackage#getMessageDefinitionAllowedResponse_Message()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='message' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getMessage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MessageDefinitionAllowedResponse#getMessage <em>Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' containment reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(Canonical value);

	/**
	 * Returns the value of the '<em><b>Situation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides a description of the circumstances in which this response should be used (as opposed to one of the alternative responses).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Situation</em>' containment reference.
	 * @see #setSituation(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getMessageDefinitionAllowedResponse_Situation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='situation' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getSituation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MessageDefinitionAllowedResponse#getSituation <em>Situation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Situation</em>' containment reference.
	 * @see #getSituation()
	 * @generated
	 */
	void setSituation(Markdown value);

} // MessageDefinitionAllowedResponse
