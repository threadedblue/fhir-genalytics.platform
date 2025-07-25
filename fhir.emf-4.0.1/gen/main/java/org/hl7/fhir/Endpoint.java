/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The technical details of an endpoint that can be used for electronic services, such as for web services providing XDS.b or a REST endpoint for another FHIR server. This may include any security context information.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Endpoint#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Endpoint#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Endpoint#getConnectionType <em>Connection Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Endpoint#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.Endpoint#getManagingOrganization <em>Managing Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.Endpoint#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.Endpoint#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.Endpoint#getPayloadType <em>Payload Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Endpoint#getPayloadMimeType <em>Payload Mime Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Endpoint#getAddress <em>Address</em>}</li>
 *   <li>{@link org.hl7.fhir.Endpoint#getHeader <em>Header</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getEndpoint()
 * @model extendedMetaData="name='Endpoint' kind='elementOnly'"
 * @generated
 */
public interface Endpoint extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier for the organization that is used to identify the endpoint across multiple disparate systems.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEndpoint_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * active | suspended | error | off | test.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(EndpointStatus)
	 * @see org.hl7.fhir.FhirPackage#getEndpoint_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	EndpointStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Endpoint#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(EndpointStatus value);

	/**
	 * Returns the value of the '<em><b>Connection Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A coded value that represents the technical details of the usage of this endpoint, such as what WSDLs should be used in what way. (e.g. XDS.b/DICOM/cds-hook).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection Type</em>' containment reference.
	 * @see #setConnectionType(Coding)
	 * @see org.hl7.fhir.FhirPackage#getEndpoint_ConnectionType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='connectionType' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getConnectionType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Endpoint#getConnectionType <em>Connection Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Type</em>' containment reference.
	 * @see #getConnectionType()
	 * @generated
	 */
	void setConnectionType(Coding value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A friendly name that this endpoint can be referred to with.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getEndpoint_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Endpoint#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Managing Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization that manages this endpoint (even if technically another organization is hosting this in the cloud, it is the organization associated with the data).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Managing Organization</em>' containment reference.
	 * @see #setManagingOrganization(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEndpoint_ManagingOrganization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='managingOrganization' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getManagingOrganization();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Endpoint#getManagingOrganization <em>Managing Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Managing Organization</em>' containment reference.
	 * @see #getManagingOrganization()
	 * @generated
	 */
	void setManagingOrganization(Reference value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContactPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contact details for a human to contact about the subscription. The primary use of this for system administrator troubleshooting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEndpoint_Contact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contact' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContactPoint> getContact();

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The interval during which the endpoint is expected to be operational.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getEndpoint_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Endpoint#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Payload Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The payload type describes the acceptable content that can be communicated on the endpoint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payload Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEndpoint_PayloadType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='payloadType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getPayloadType();

	/**
	 * Returns the value of the '<em><b>Payload Mime Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Code}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The mime type to send the payload in - e.g. application/fhir+xml, application/fhir+json. If the mime type is not specified, then the sender could send any content (including no content depending on the connectionType).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payload Mime Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEndpoint_PayloadMimeType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='payloadMimeType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Code> getPayloadMimeType();

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The uri that describes the actual end-point to connect to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(Url)
	 * @see org.hl7.fhir.FhirPackage#getEndpoint_Address()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace'"
	 * @generated
	 */
	Url getAddress();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Endpoint#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(Url value);

	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional headers / information to send as part of the notification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Header</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEndpoint_Header()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='header' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getHeader();

} // Endpoint
