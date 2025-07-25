/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Statement Messaging</b></em>'.
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
 *   <li>{@link org.hl7.fhir.CapabilityStatementMessaging#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatementMessaging#getReliableCache <em>Reliable Cache</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatementMessaging#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatementMessaging#getSupportedMessage <em>Supported Message</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementMessaging()
 * @model extendedMetaData="name='CapabilityStatement.Messaging' kind='elementOnly'"
 * @generated
 */
public interface CapabilityStatementMessaging extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CapabilityStatementEndpoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An endpoint (network accessible address) to which messages and/or replies are to be sent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endpoint</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementMessaging_Endpoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endpoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CapabilityStatementEndpoint> getEndpoint();

	/**
	 * Returns the value of the '<em><b>Reliable Cache</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Length if the receiver's reliable messaging cache in minutes (if a receiver) or how long the cache length on the receiver should be (if a sender).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reliable Cache</em>' containment reference.
	 * @see #setReliableCache(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementMessaging_ReliableCache()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reliableCache' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getReliableCache();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CapabilityStatementMessaging#getReliableCache <em>Reliable Cache</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reliable Cache</em>' containment reference.
	 * @see #getReliableCache()
	 * @generated
	 */
	void setReliableCache(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Documentation about the system's messaging capabilities for this endpoint not otherwise documented by the capability statement.  For example, the process for becoming an authorized messaging exchange partner.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementMessaging_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDocumentation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CapabilityStatementMessaging#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(Markdown value);

	/**
	 * Returns the value of the '<em><b>Supported Message</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CapabilityStatementSupportedMessage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References to message definitions for messages this system can send or receive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Message</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementMessaging_SupportedMessage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supportedMessage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CapabilityStatementSupportedMessage> getSupportedMessage();

} // CapabilityStatementMessaging
