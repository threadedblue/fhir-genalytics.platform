/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract Content Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ContractContentDefinition#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractContentDefinition#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractContentDefinition#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractContentDefinition#getPublicationDate <em>Publication Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractContentDefinition#getPublicationStatus <em>Publication Status</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractContentDefinition#getCopyright <em>Copyright</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getContractContentDefinition()
 * @model extendedMetaData="name='Contract.ContentDefinition' kind='elementOnly'"
 * @generated
 */
public interface ContractContentDefinition extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Precusory content structure and use, i.e., a boilerplate, template, application for a contract such as an insurance policy or benefits under a program, e.g., workers compensation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getContractContentDefinition_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractContentDefinition#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Sub Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Detailed Precusory content type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Type</em>' containment reference.
	 * @see #setSubType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getContractContentDefinition_SubType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSubType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractContentDefinition#getSubType <em>Sub Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Type</em>' containment reference.
	 * @see #getSubType()
	 * @generated
	 */
	void setSubType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The  individual or organization that published the Contract precursor content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher</em>' containment reference.
	 * @see #setPublisher(Reference)
	 * @see org.hl7.fhir.FhirPackage#getContractContentDefinition_Publisher()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='publisher' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPublisher();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractContentDefinition#getPublisher <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' containment reference.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(Reference value);

	/**
	 * Returns the value of the '<em><b>Publication Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date (and optionally time) when the contract was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the contract changes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publication Date</em>' containment reference.
	 * @see #setPublicationDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getContractContentDefinition_PublicationDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='publicationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getPublicationDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractContentDefinition#getPublicationDate <em>Publication Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publication Date</em>' containment reference.
	 * @see #getPublicationDate()
	 * @generated
	 */
	void setPublicationDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Publication Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * amended | appended | cancelled | disputed | entered-in-error | executable | executed | negotiable | offered | policy | rejected | renewed | revoked | resolved | terminated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publication Status</em>' containment reference.
	 * @see #setPublicationStatus(ContractResourcePublicationStatusCodes)
	 * @see org.hl7.fhir.FhirPackage#getContractContentDefinition_PublicationStatus()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='publicationStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	ContractResourcePublicationStatusCodes getPublicationStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractContentDefinition#getPublicationStatus <em>Publication Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publication Status</em>' containment reference.
	 * @see #getPublicationStatus()
	 * @generated
	 */
	void setPublicationStatus(ContractResourcePublicationStatusCodes value);

	/**
	 * Returns the value of the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A copyright statement relating to Contract precursor content. Copyright statements are generally legal restrictions on the use and publishing of the Contract precursor content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copyright</em>' containment reference.
	 * @see #setCopyright(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getContractContentDefinition_Copyright()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='copyright' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getCopyright();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractContentDefinition#getCopyright <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright</em>' containment reference.
	 * @see #getCopyright()
	 * @generated
	 */
	void setCopyright(Markdown value);

} // ContractContentDefinition
