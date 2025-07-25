/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MessageHeader#getEventCoding <em>Event Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.MessageHeader#getEventUri <em>Event Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.MessageHeader#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.hl7.fhir.MessageHeader#getSender <em>Sender</em>}</li>
 *   <li>{@link org.hl7.fhir.MessageHeader#getEnterer <em>Enterer</em>}</li>
 *   <li>{@link org.hl7.fhir.MessageHeader#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.fhir.MessageHeader#getSource <em>Source</em>}</li>
 *   <li>{@link org.hl7.fhir.MessageHeader#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link org.hl7.fhir.MessageHeader#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.MessageHeader#getResponse <em>Response</em>}</li>
 *   <li>{@link org.hl7.fhir.MessageHeader#getFocus <em>Focus</em>}</li>
 *   <li>{@link org.hl7.fhir.MessageHeader#getDefinition <em>Definition</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMessageHeader()
 * @model extendedMetaData="name='MessageHeader' kind='elementOnly'"
 * @generated
 */
public interface MessageHeader extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Event Coding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code that identifies the event this message represents and connects it with its definition. Events defined as part of the FHIR specification have the system value "http://terminology.hl7.org/CodeSystem/message-events".  Alternatively uri to the EventDefinition. (choose any one of event*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event Coding</em>' containment reference.
	 * @see #setEventCoding(Coding)
	 * @see org.hl7.fhir.FhirPackage#getMessageHeader_EventCoding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eventCoding' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getEventCoding();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MessageHeader#getEventCoding <em>Event Coding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Coding</em>' containment reference.
	 * @see #getEventCoding()
	 * @generated
	 */
	void setEventCoding(Coding value);

	/**
	 * Returns the value of the '<em><b>Event Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code that identifies the event this message represents and connects it with its definition. Events defined as part of the FHIR specification have the system value "http://terminology.hl7.org/CodeSystem/message-events".  Alternatively uri to the EventDefinition. (choose any one of event*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event Uri</em>' containment reference.
	 * @see #setEventUri(Uri)
	 * @see org.hl7.fhir.FhirPackage#getMessageHeader_EventUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eventUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getEventUri();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MessageHeader#getEventUri <em>Event Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Uri</em>' containment reference.
	 * @see #getEventUri()
	 * @generated
	 */
	void setEventUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MessageHeaderDestination}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The destination application which the message is intended for.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destination</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMessageHeader_Destination()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='destination' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MessageHeaderDestination> getDestination();

	/**
	 * Returns the value of the '<em><b>Sender</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the sending system to allow the use of a trust relationship.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sender</em>' containment reference.
	 * @see #setSender(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMessageHeader_Sender()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sender' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSender();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MessageHeader#getSender <em>Sender</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender</em>' containment reference.
	 * @see #getSender()
	 * @generated
	 */
	void setSender(Reference value);

	/**
	 * Returns the value of the '<em><b>Enterer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person or device that performed the data entry leading to this message. When there is more than one candidate, pick the most proximal to the message. Can provide other enterers in extensions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enterer</em>' containment reference.
	 * @see #setEnterer(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMessageHeader_Enterer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='enterer' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEnterer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MessageHeader#getEnterer <em>Enterer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enterer</em>' containment reference.
	 * @see #getEnterer()
	 * @generated
	 */
	void setEnterer(Reference value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The logical author of the message - the person or device that decided the described event should happen. When there is more than one candidate, pick the most proximal to the MessageHeader. Can provide other authors in extensions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author</em>' containment reference.
	 * @see #setAuthor(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMessageHeader_Author()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAuthor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MessageHeader#getAuthor <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' containment reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Reference value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source application from which this message originated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(MessageHeaderSource)
	 * @see org.hl7.fhir.FhirPackage#getMessageHeader_Source()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	MessageHeaderSource getSource();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MessageHeader#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(MessageHeaderSource value);

	/**
	 * Returns the value of the '<em><b>Responsible</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person or organization that accepts overall responsibility for the contents of the message. The implication is that the message event happened under the policies of the responsible party.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Responsible</em>' containment reference.
	 * @see #setResponsible(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMessageHeader_Responsible()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='responsible' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getResponsible();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MessageHeader#getResponsible <em>Responsible</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible</em>' containment reference.
	 * @see #getResponsible()
	 * @generated
	 */
	void setResponsible(Reference value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coded indication of the cause for the event - indicates  a reason for the occurrence of the event that is a focus of this message.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference.
	 * @see #setReason(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMessageHeader_Reason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getReason();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MessageHeader#getReason <em>Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' containment reference.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about the message that this message is a response to.  Only present if this message is a response.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Response</em>' containment reference.
	 * @see #setResponse(MessageHeaderResponse)
	 * @see org.hl7.fhir.FhirPackage#getMessageHeader_Response()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='response' namespace='##targetNamespace'"
	 * @generated
	 */
	MessageHeaderResponse getResponse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MessageHeader#getResponse <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' containment reference.
	 * @see #getResponse()
	 * @generated
	 */
	void setResponse(MessageHeaderResponse value);

	/**
	 * Returns the value of the '<em><b>Focus</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual data of the message - a reference to the root/focus class of the event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Focus</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMessageHeader_Focus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='focus' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getFocus();

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Permanent link to the MessageDefinition for this message.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(Canonical)
	 * @see org.hl7.fhir.FhirPackage#getMessageHeader_Definition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definition' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MessageHeader#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(Canonical value);

} // MessageHeader
