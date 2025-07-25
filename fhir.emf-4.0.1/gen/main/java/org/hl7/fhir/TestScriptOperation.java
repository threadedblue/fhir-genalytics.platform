/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Script Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A structured set of tests against a FHIR server or client implementation to determine compliance against the FHIR specification.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.TestScriptOperation#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScriptOperation#getResource <em>Resource</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScriptOperation#getLabel <em>Label</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScriptOperation#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScriptOperation#getAccept <em>Accept</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScriptOperation#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScriptOperation#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScriptOperation#getEncodeRequestUrl <em>Encode Request Url</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScriptOperation#getMethod <em>Method</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScriptOperation#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScriptOperation#getParams <em>Params</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScriptOperation#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScriptOperation#getRequestId <em>Request Id</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScriptOperation#getResponseId <em>Response Id</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScriptOperation#getSourceId <em>Source Id</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScriptOperation#getTargetId <em>Target Id</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScriptOperation#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getTestScriptOperation()
 * @model extendedMetaData="name='TestScript.Operation' kind='elementOnly'"
 * @generated
 */
public interface TestScriptOperation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Server interaction or operation type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Coding)
	 * @see org.hl7.fhir.FhirPackage#getTestScriptOperation_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScriptOperation#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Coding value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the resource.  See http://build.fhir.org/resourcelist.html.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference.
	 * @see #setResource(Code)
	 * @see org.hl7.fhir.FhirPackage#getTestScriptOperation_Resource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resource' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getResource();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScriptOperation#getResource <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' containment reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Code value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The label would be used for tracking/logging purposes by test engines.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getTestScriptOperation_Label()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='label' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getLabel();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScriptOperation#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The description would be used by test engines for tracking and reporting purposes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getTestScriptOperation_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScriptOperation#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Accept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The mime-type to use for RESTful operation in the 'Accept' header.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accept</em>' containment reference.
	 * @see #setAccept(Code)
	 * @see org.hl7.fhir.FhirPackage#getTestScriptOperation_Accept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='accept' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getAccept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScriptOperation#getAccept <em>Accept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accept</em>' containment reference.
	 * @see #getAccept()
	 * @generated
	 */
	void setAccept(Code value);

	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The mime-type to use for RESTful operation in the 'Content-Type' header.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content Type</em>' containment reference.
	 * @see #setContentType(Code)
	 * @see org.hl7.fhir.FhirPackage#getTestScriptOperation_ContentType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contentType' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getContentType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScriptOperation#getContentType <em>Content Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' containment reference.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(Code value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The server where the request message is destined for.  Must be one of the server numbers listed in TestScript.destination section.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destination</em>' containment reference.
	 * @see #setDestination(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getTestScriptOperation_Destination()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='destination' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getDestination();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScriptOperation#getDestination <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' containment reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Encode Request Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not to implicitly send the request url in encoded format. The default is true to match the standard RESTful client behavior. Set to false when communicating with a server that does not support encoded url paths.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encode Request Url</em>' containment reference.
	 * @see #setEncodeRequestUrl(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getTestScriptOperation_EncodeRequestUrl()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='encodeRequestUrl' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getEncodeRequestUrl();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScriptOperation#getEncodeRequestUrl <em>Encode Request Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encode Request Url</em>' containment reference.
	 * @see #getEncodeRequestUrl()
	 * @generated
	 */
	void setEncodeRequestUrl(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The HTTP method the test engine MUST use for this operation regardless of any other operation details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(TestScriptRequestMethodCode)
	 * @see org.hl7.fhir.FhirPackage#getTestScriptOperation_Method()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='method' namespace='##targetNamespace'"
	 * @generated
	 */
	TestScriptRequestMethodCode getMethod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScriptOperation#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(TestScriptRequestMethodCode value);

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The server where the request message originates from.  Must be one of the server numbers listed in TestScript.origin section.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Origin</em>' containment reference.
	 * @see #setOrigin(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getTestScriptOperation_Origin()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='origin' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getOrigin();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScriptOperation#getOrigin <em>Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' containment reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Path plus parameters after [type].  Used to set parts of the request URL explicitly.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Params</em>' containment reference.
	 * @see #setParams(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getTestScriptOperation_Params()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='params' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getParams();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScriptOperation#getParams <em>Params</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Params</em>' containment reference.
	 * @see #getParams()
	 * @generated
	 */
	void setParams(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Request Header</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.TestScriptRequestHeader}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Header elements would be used to set HTTP headers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request Header</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTestScriptOperation_RequestHeader()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requestHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TestScriptRequestHeader> getRequestHeader();

	/**
	 * Returns the value of the '<em><b>Request Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The fixture id (maybe new) to map to the request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request Id</em>' containment reference.
	 * @see #setRequestId(Id)
	 * @see org.hl7.fhir.FhirPackage#getTestScriptOperation_RequestId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requestId' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getRequestId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScriptOperation#getRequestId <em>Request Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Id</em>' containment reference.
	 * @see #getRequestId()
	 * @generated
	 */
	void setRequestId(Id value);

	/**
	 * Returns the value of the '<em><b>Response Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The fixture id (maybe new) to map to the response.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Response Id</em>' containment reference.
	 * @see #setResponseId(Id)
	 * @see org.hl7.fhir.FhirPackage#getTestScriptOperation_ResponseId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='responseId' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getResponseId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScriptOperation#getResponseId <em>Response Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Id</em>' containment reference.
	 * @see #getResponseId()
	 * @generated
	 */
	void setResponseId(Id value);

	/**
	 * Returns the value of the '<em><b>Source Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The id of the fixture used as the body of a PUT or POST request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Id</em>' containment reference.
	 * @see #setSourceId(Id)
	 * @see org.hl7.fhir.FhirPackage#getTestScriptOperation_SourceId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceId' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getSourceId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScriptOperation#getSourceId <em>Source Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Id</em>' containment reference.
	 * @see #getSourceId()
	 * @generated
	 */
	void setSourceId(Id value);

	/**
	 * Returns the value of the '<em><b>Target Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id of fixture used for extracting the [id],  [type], and [vid] for GET requests.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Id</em>' containment reference.
	 * @see #setTargetId(Id)
	 * @see org.hl7.fhir.FhirPackage#getTestScriptOperation_TargetId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='targetId' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getTargetId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScriptOperation#getTargetId <em>Target Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Id</em>' containment reference.
	 * @see #getTargetId()
	 * @generated
	 */
	void setTargetId(Id value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Complete request URL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getTestScriptOperation_Url()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getUrl();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScriptOperation#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(org.hl7.fhir.String value);

} // TestScriptOperation
