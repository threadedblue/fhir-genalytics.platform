/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Statement Resource</b></em>'.
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
 *   <li>{@link org.hl7.fhir.CapabilityStatementResource#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatementResource#getProfile <em>Profile</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatementResource#getSupportedProfile <em>Supported Profile</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatementResource#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatementResource#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatementResource#getVersioning <em>Versioning</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatementResource#getReadHistory <em>Read History</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatementResource#getUpdateCreate <em>Update Create</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatementResource#getConditionalCreate <em>Conditional Create</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatementResource#getConditionalRead <em>Conditional Read</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatementResource#getConditionalUpdate <em>Conditional Update</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatementResource#getConditionalDelete <em>Conditional Delete</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatementResource#getReferencePolicy <em>Reference Policy</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatementResource#getSearchInclude <em>Search Include</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatementResource#getSearchRevInclude <em>Search Rev Include</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatementResource#getSearchParam <em>Search Param</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatementResource#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementResource()
 * @model extendedMetaData="name='CapabilityStatement.Resource' kind='elementOnly'"
 * @generated
 */
public interface CapabilityStatementResource extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A type of resource exposed via the restful interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Code)
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementResource_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CapabilityStatementResource#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Code value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A specification of the profile that describes the solution's overall support for the resource, including any constraints on cardinality, bindings, lengths or other limitations. See further discussion in [Using Profiles](profiling.html#profile-uses).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Profile</em>' containment reference.
	 * @see #setProfile(Canonical)
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementResource_Profile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='profile' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getProfile();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CapabilityStatementResource#getProfile <em>Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile</em>' containment reference.
	 * @see #getProfile()
	 * @generated
	 */
	void setProfile(Canonical value);

	/**
	 * Returns the value of the '<em><b>Supported Profile</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Canonical}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of profiles that represent different use cases supported by the system. For a server, "supported by the system" means the system hosts/produces a set of resources that are conformant to a particular profile, and allows clients that use its services to search using this profile and to find appropriate data. For a client, it means the system will search by this profile and process data according to the guidance implicit in the profile. See further discussion in [Using Profiles](profiling.html#profile-uses).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Profile</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementResource_SupportedProfile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supportedProfile' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Canonical> getSupportedProfile();

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional information about the resource type used by the system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementResource_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDocumentation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CapabilityStatementResource#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(Markdown value);

	/**
	 * Returns the value of the '<em><b>Interaction</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CapabilityStatementInteraction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a restful operation supported by the solution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interaction</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementResource_Interaction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interaction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CapabilityStatementInteraction> getInteraction();

	/**
	 * Returns the value of the '<em><b>Versioning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This field is set to no-version to specify that the system does not support (server) or use (client) versioning for this resource type. If this has some other value, the server must at least correctly track and populate the versionId meta-property on resources. If the value is 'versioned-update', then the server supports all the versioning features, including using e-tags for version integrity in the API.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Versioning</em>' containment reference.
	 * @see #setVersioning(ResourceVersionPolicy)
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementResource_Versioning()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='versioning' namespace='##targetNamespace'"
	 * @generated
	 */
	ResourceVersionPolicy getVersioning();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CapabilityStatementResource#getVersioning <em>Versioning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Versioning</em>' containment reference.
	 * @see #getVersioning()
	 * @generated
	 */
	void setVersioning(ResourceVersionPolicy value);

	/**
	 * Returns the value of the '<em><b>Read History</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A flag for whether the server is able to return past versions as part of the vRead operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read History</em>' containment reference.
	 * @see #setReadHistory(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementResource_ReadHistory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='readHistory' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getReadHistory();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CapabilityStatementResource#getReadHistory <em>Read History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read History</em>' containment reference.
	 * @see #getReadHistory()
	 * @generated
	 */
	void setReadHistory(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Update Create</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A flag to indicate that the server allows or needs to allow the client to create new identities on the server (that is, the client PUTs to a location where there is no existing resource). Allowing this operation means that the server allows the client to create new identities on the server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Update Create</em>' containment reference.
	 * @see #setUpdateCreate(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementResource_UpdateCreate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='updateCreate' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getUpdateCreate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CapabilityStatementResource#getUpdateCreate <em>Update Create</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Create</em>' containment reference.
	 * @see #getUpdateCreate()
	 * @generated
	 */
	void setUpdateCreate(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Conditional Create</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A flag that indicates that the server supports conditional create.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conditional Create</em>' containment reference.
	 * @see #setConditionalCreate(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementResource_ConditionalCreate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='conditionalCreate' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getConditionalCreate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CapabilityStatementResource#getConditionalCreate <em>Conditional Create</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditional Create</em>' containment reference.
	 * @see #getConditionalCreate()
	 * @generated
	 */
	void setConditionalCreate(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Conditional Read</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code that indicates how the server supports conditional read.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conditional Read</em>' containment reference.
	 * @see #setConditionalRead(ConditionalReadStatus)
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementResource_ConditionalRead()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='conditionalRead' namespace='##targetNamespace'"
	 * @generated
	 */
	ConditionalReadStatus getConditionalRead();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CapabilityStatementResource#getConditionalRead <em>Conditional Read</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditional Read</em>' containment reference.
	 * @see #getConditionalRead()
	 * @generated
	 */
	void setConditionalRead(ConditionalReadStatus value);

	/**
	 * Returns the value of the '<em><b>Conditional Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A flag that indicates that the server supports conditional update.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conditional Update</em>' containment reference.
	 * @see #setConditionalUpdate(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementResource_ConditionalUpdate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='conditionalUpdate' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getConditionalUpdate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CapabilityStatementResource#getConditionalUpdate <em>Conditional Update</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditional Update</em>' containment reference.
	 * @see #getConditionalUpdate()
	 * @generated
	 */
	void setConditionalUpdate(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Conditional Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code that indicates how the server supports conditional delete.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conditional Delete</em>' containment reference.
	 * @see #setConditionalDelete(ConditionalDeleteStatus)
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementResource_ConditionalDelete()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='conditionalDelete' namespace='##targetNamespace'"
	 * @generated
	 */
	ConditionalDeleteStatus getConditionalDelete();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CapabilityStatementResource#getConditionalDelete <em>Conditional Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditional Delete</em>' containment reference.
	 * @see #getConditionalDelete()
	 * @generated
	 */
	void setConditionalDelete(ConditionalDeleteStatus value);

	/**
	 * Returns the value of the '<em><b>Reference Policy</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ReferenceHandlingPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of flags that defines how references are supported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Policy</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementResource_ReferencePolicy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referencePolicy' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ReferenceHandlingPolicy> getReferencePolicy();

	/**
	 * Returns the value of the '<em><b>Search Include</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of _include values supported by the server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Search Include</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementResource_SearchInclude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='searchInclude' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getSearchInclude();

	/**
	 * Returns the value of the '<em><b>Search Rev Include</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of _revinclude (reverse include) values supported by the server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Search Rev Include</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementResource_SearchRevInclude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='searchRevInclude' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getSearchRevInclude();

	/**
	 * Returns the value of the '<em><b>Search Param</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CapabilityStatementSearchParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Search parameters for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Search Param</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementResource_SearchParam()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='searchParam' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CapabilityStatementSearchParam> getSearchParam();

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CapabilityStatementOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of an operation or a named query together with its parameters and their meaning and type. Consult the definition of the operation for details about how to invoke the operation, and the parameters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementResource_Operation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='operation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CapabilityStatementOperation> getOperation();

} // CapabilityStatementResource
