/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Contract#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getLegalState <em>Legal State</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getInstantiatesCanonical <em>Instantiates Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getInstantiatesUri <em>Instantiates Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getContentDerivative <em>Content Derivative</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getIssued <em>Issued</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getApplies <em>Applies</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getExpirationType <em>Expiration Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getAuthority <em>Authority</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getSite <em>Site</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getScope <em>Scope</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getTopicCodeableConcept <em>Topic Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getTopicReference <em>Topic Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getContentDefinition <em>Content Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getTerm <em>Term</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getSupportingInfo <em>Supporting Info</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getRelevantHistory <em>Relevant History</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getSigner <em>Signer</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getFriendly <em>Friendly</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getLegal <em>Legal</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getRule <em>Rule</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getLegallyBindingAttachment <em>Legally Binding Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getLegallyBindingReference <em>Legally Binding Reference</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getContract()
 * @model extendedMetaData="name='Contract' kind='elementOnly'"
 * @generated
 */
public interface Contract extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique identifier for this Contract or a derivative that references a Source Contract.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContract_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Canonical identifier for this contract, represented as a URI (globally unique).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Uri)
	 * @see org.hl7.fhir.FhirPackage#getContract_Url()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Contract#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Uri value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An edition identifier used for business purposes to label business significant variants.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getContract_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getVersion();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Contract#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of the resource instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(ContractResourceStatusCodes)
	 * @see org.hl7.fhir.FhirPackage#getContract_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	ContractResourceStatusCodes getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Contract#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ContractResourceStatusCodes value);

	/**
	 * Returns the value of the '<em><b>Legal State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Legal states of the formation of a legal instrument, which is a formally executed written document that can be formally attributed to its author, records and formally expresses a legally enforceable act, process, or contractual duty, obligation, or right, and therefore evidences that act, process, or agreement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Legal State</em>' containment reference.
	 * @see #setLegalState(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getContract_LegalState()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='legalState' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getLegalState();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Contract#getLegalState <em>Legal State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legal State</em>' containment reference.
	 * @see #getLegalState()
	 * @generated
	 */
	void setLegalState(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Instantiates Canonical</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URL pointing to a FHIR-defined Contract Definition that is adhered to in whole or part by this Contract.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instantiates Canonical</em>' containment reference.
	 * @see #setInstantiatesCanonical(Reference)
	 * @see org.hl7.fhir.FhirPackage#getContract_InstantiatesCanonical()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instantiatesCanonical' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getInstantiatesCanonical();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Contract#getInstantiatesCanonical <em>Instantiates Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiates Canonical</em>' containment reference.
	 * @see #getInstantiatesCanonical()
	 * @generated
	 */
	void setInstantiatesCanonical(Reference value);

	/**
	 * Returns the value of the '<em><b>Instantiates Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URL pointing to an externally maintained definition that is adhered to in whole or in part by this Contract.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instantiates Uri</em>' containment reference.
	 * @see #setInstantiatesUri(Uri)
	 * @see org.hl7.fhir.FhirPackage#getContract_InstantiatesUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instantiatesUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getInstantiatesUri();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Contract#getInstantiatesUri <em>Instantiates Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiates Uri</em>' containment reference.
	 * @see #getInstantiatesUri()
	 * @generated
	 */
	void setInstantiatesUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Content Derivative</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimal content derived from the basal information source at a specific stage in its lifecycle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content Derivative</em>' containment reference.
	 * @see #setContentDerivative(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getContract_ContentDerivative()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contentDerivative' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getContentDerivative();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Contract#getContentDerivative <em>Content Derivative</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Derivative</em>' containment reference.
	 * @see #getContentDerivative()
	 * @generated
	 */
	void setContentDerivative(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When this  Contract was issued.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issued</em>' containment reference.
	 * @see #setIssued(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getContract_Issued()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='issued' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getIssued();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Contract#getIssued <em>Issued</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issued</em>' containment reference.
	 * @see #getIssued()
	 * @generated
	 */
	void setIssued(DateTime value);

	/**
	 * Returns the value of the '<em><b>Applies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relevant time or time-period when this Contract is applicable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applies</em>' containment reference.
	 * @see #setApplies(Period)
	 * @see org.hl7.fhir.FhirPackage#getContract_Applies()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='applies' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getApplies();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Contract#getApplies <em>Applies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applies</em>' containment reference.
	 * @see #getApplies()
	 * @generated
	 */
	void setApplies(Period value);

	/**
	 * Returns the value of the '<em><b>Expiration Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Event resulting in discontinuation or termination of this Contract instance by one or more parties to the contract.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expiration Type</em>' containment reference.
	 * @see #setExpirationType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getContract_ExpirationType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='expirationType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getExpirationType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Contract#getExpirationType <em>Expiration Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration Type</em>' containment reference.
	 * @see #getExpirationType()
	 * @generated
	 */
	void setExpirationType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target entity impacted by or of interest to parties to the agreement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContract_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSubject();

	/**
	 * Returns the value of the '<em><b>Authority</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A formally or informally recognized grouping of people, principals, organizations, or jurisdictions formed for the purpose of achieving some form of collective action such as the promulgation, administration and enforcement of contracts and policies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authority</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContract_Authority()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='authority' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getAuthority();

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Recognized governance framework or system operating with a circumscribed scope in accordance with specified principles, policies, processes or procedures for managing rights, actions, or behaviors of parties or principals relative to resources.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContract_Domain()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='domain' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getDomain();

	/**
	 * Returns the value of the '<em><b>Site</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sites in which the contract is complied with,  exercised, or in force.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Site</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContract_Site()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='site' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSite();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A natural language name identifying this Contract definition, derivative, or instance in any legal state. Provides additional information about its content. This name should be usable as an identifier for the module by machine processing applications such as code generation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getContract_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Contract#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A short, descriptive, user-friendly title for this Contract definition, derivative, or instance in any legal state.t giving additional information about its content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getContract_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getTitle();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Contract#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Subtitle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An explanatory or alternate user-friendly title for this Contract definition, derivative, or instance in any legal state.t giving additional information about its content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subtitle</em>' containment reference.
	 * @see #setSubtitle(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getContract_Subtitle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subtitle' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSubtitle();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Contract#getSubtitle <em>Subtitle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtitle</em>' containment reference.
	 * @see #getSubtitle()
	 * @generated
	 */
	void setSubtitle(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Alternative representation of the title for this Contract definition, derivative, or instance in any legal state., e.g., a domain specific contract number related to legislation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alias</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContract_Alias()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='alias' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getAlias();

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The individual or organization that authored the Contract definition, derivative, or instance in any legal state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author</em>' containment reference.
	 * @see #setAuthor(Reference)
	 * @see org.hl7.fhir.FhirPackage#getContract_Author()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAuthor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Contract#getAuthor <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' containment reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Reference value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A selector of legal concerns for this Contract definition, derivative, or instance in any legal state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scope</em>' containment reference.
	 * @see #setScope(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getContract_Scope()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='scope' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getScope();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Contract#getScope <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' containment reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Topic Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Narrows the range of legal concerns to focus on the achievement of specific contractual objectives. (choose any one of topic*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topic Codeable Concept</em>' containment reference.
	 * @see #setTopicCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getContract_TopicCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='topicCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getTopicCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Contract#getTopicCodeableConcept <em>Topic Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic Codeable Concept</em>' containment reference.
	 * @see #getTopicCodeableConcept()
	 * @generated
	 */
	void setTopicCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Topic Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Narrows the range of legal concerns to focus on the achievement of specific contractual objectives. (choose any one of topic*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topic Reference</em>' containment reference.
	 * @see #setTopicReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getContract_TopicReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='topicReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getTopicReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Contract#getTopicReference <em>Topic Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic Reference</em>' containment reference.
	 * @see #getTopicReference()
	 * @generated
	 */
	void setTopicReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A high-level category for the legal instrument, whether constructed as a Contract definition, derivative, or instance in any legal state.  Provides additional information about its content within the context of the Contract's scope to distinguish the kinds of systems that would be interested in the contract.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getContract_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Contract#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Sub Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sub-category for the Contract that distinguishes the kinds of systems that would be interested in the Contract within the context of the Contract's scope.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContract_SubType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getSubType();

	/**
	 * Returns the value of the '<em><b>Content Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Precusory content developed with a focus and intent of supporting the formation a Contract instance, which may be associated with and transformable into a Contract.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content Definition</em>' containment reference.
	 * @see #setContentDefinition(ContractContentDefinition)
	 * @see org.hl7.fhir.FhirPackage#getContract_ContentDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contentDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	ContractContentDefinition getContentDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Contract#getContentDefinition <em>Content Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Definition</em>' containment reference.
	 * @see #getContentDefinition()
	 * @generated
	 */
	void setContentDefinition(ContractContentDefinition value);

	/**
	 * Returns the value of the '<em><b>Term</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContractTerm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One or more Contract Provisions, which may be related and conveyed as a group, and may contain nested groups.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Term</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContract_Term()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='term' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContractTerm> getTerm();

	/**
	 * Returns the value of the '<em><b>Supporting Info</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information that may be needed by/relevant to the performer in their execution of this term action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supporting Info</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContract_SupportingInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supportingInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSupportingInfo();

	/**
	 * Returns the value of the '<em><b>Relevant History</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Links to Provenance records for past versions of this Contract definition, derivative, or instance, which identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the Contract.  The Provence.entity indicates the target that was changed in the update. http://build.fhir.org/provenance-definitions.html#Provenance.entity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relevant History</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContract_RelevantHistory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relevantHistory' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getRelevantHistory();

	/**
	 * Returns the value of the '<em><b>Signer</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContractSigner}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parties with legal standing in the Contract, including the principal parties, the grantor(s) and grantee(s), which are any person or organization bound by the contract, and any ancillary parties, which facilitate the execution of the contract such as a notary or witness.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signer</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContract_Signer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='signer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContractSigner> getSigner();

	/**
	 * Returns the value of the '<em><b>Friendly</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContractFriendly}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The "patient friendly language" versionof the Contract in whole or in parts. "Patient friendly language" means the representation of the Contract and Contract Provisions in a manner that is readily accessible and understandable by a layperson in accordance with best practices for communication styles that ensure that those agreeing to or signing the Contract understand the roles, actions, obligations, responsibilities, and implication of the agreement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Friendly</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContract_Friendly()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='friendly' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContractFriendly> getFriendly();

	/**
	 * Returns the value of the '<em><b>Legal</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContractLegal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of Legal expressions or representations of this Contract.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Legal</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContract_Legal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='legal' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContractLegal> getLegal();

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContractRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of Computable Policy Rule Language Representations of this Contract.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContract_Rule()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rule' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContractRule> getRule();

	/**
	 * Returns the value of the '<em><b>Legally Binding Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Legally binding Contract: This is the signed and legally recognized representation of the Contract, which is considered the "source of truth" and which would be the basis for legal action related to enforcement of this Contract. (choose any one of legallyBinding*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Legally Binding Attachment</em>' containment reference.
	 * @see #setLegallyBindingAttachment(Attachment)
	 * @see org.hl7.fhir.FhirPackage#getContract_LegallyBindingAttachment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='legallyBindingAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getLegallyBindingAttachment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Contract#getLegallyBindingAttachment <em>Legally Binding Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legally Binding Attachment</em>' containment reference.
	 * @see #getLegallyBindingAttachment()
	 * @generated
	 */
	void setLegallyBindingAttachment(Attachment value);

	/**
	 * Returns the value of the '<em><b>Legally Binding Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Legally binding Contract: This is the signed and legally recognized representation of the Contract, which is considered the "source of truth" and which would be the basis for legal action related to enforcement of this Contract. (choose any one of legallyBinding*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Legally Binding Reference</em>' containment reference.
	 * @see #setLegallyBindingReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getContract_LegallyBindingReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='legallyBindingReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getLegallyBindingReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Contract#getLegallyBindingReference <em>Legally Binding Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legally Binding Reference</em>' containment reference.
	 * @see #getLegallyBindingReference()
	 * @generated
	 */
	void setLegallyBindingReference(Reference value);

} // Contract
