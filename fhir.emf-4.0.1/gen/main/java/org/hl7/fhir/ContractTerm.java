/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract Term</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ContractTerm#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractTerm#getIssued <em>Issued</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractTerm#getApplies <em>Applies</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractTerm#getTopicCodeableConcept <em>Topic Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractTerm#getTopicReference <em>Topic Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractTerm#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractTerm#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractTerm#getText <em>Text</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractTerm#getSecurityLabel <em>Security Label</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractTerm#getOffer <em>Offer</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractTerm#getAsset <em>Asset</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractTerm#getAction <em>Action</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractTerm#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getContractTerm()
 * @model extendedMetaData="name='Contract.Term' kind='elementOnly'"
 * @generated
 */
public interface ContractTerm extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique identifier for this particular Contract Provision.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getContractTerm_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractTerm#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When this Contract Provision was issued.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issued</em>' containment reference.
	 * @see #setIssued(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getContractTerm_Issued()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='issued' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getIssued();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractTerm#getIssued <em>Issued</em>}' containment reference.
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
	 * Relevant time or time-period when this Contract Provision is applicable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applies</em>' containment reference.
	 * @see #setApplies(Period)
	 * @see org.hl7.fhir.FhirPackage#getContractTerm_Applies()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='applies' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getApplies();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractTerm#getApplies <em>Applies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applies</em>' containment reference.
	 * @see #getApplies()
	 * @generated
	 */
	void setApplies(Period value);

	/**
	 * Returns the value of the '<em><b>Topic Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The entity that the term applies to. (choose any one of topic*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topic Codeable Concept</em>' containment reference.
	 * @see #setTopicCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getContractTerm_TopicCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='topicCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getTopicCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractTerm#getTopicCodeableConcept <em>Topic Codeable Concept</em>}' containment reference.
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
	 * The entity that the term applies to. (choose any one of topic*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topic Reference</em>' containment reference.
	 * @see #setTopicReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getContractTerm_TopicReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='topicReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getTopicReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractTerm#getTopicReference <em>Topic Reference</em>}' containment reference.
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
	 * A legal clause or condition contained within a contract that requires one or both parties to perform a particular requirement by some specified time or prevents one or both parties from performing a particular requirement by some specified time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getContractTerm_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractTerm#getType <em>Type</em>}' containment reference.
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
	 * A specialized legal clause or condition based on overarching contract type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Type</em>' containment reference.
	 * @see #setSubType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getContractTerm_SubType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSubType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractTerm#getSubType <em>Sub Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Type</em>' containment reference.
	 * @see #getSubType()
	 * @generated
	 */
	void setSubType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Statement of a provision in a policy or a contract.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getContractTerm_Text()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getText();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractTerm#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Security Label</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContractSecurityLabel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Security labels that protect the handling of information about the term and its elements, which may be specifically identified..
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security Label</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContractTerm_SecurityLabel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='securityLabel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContractSecurityLabel> getSecurityLabel();

	/**
	 * Returns the value of the '<em><b>Offer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The matter of concern in the context of this provision of the agrement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Offer</em>' containment reference.
	 * @see #setOffer(ContractOffer)
	 * @see org.hl7.fhir.FhirPackage#getContractTerm_Offer()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='offer' namespace='##targetNamespace'"
	 * @generated
	 */
	ContractOffer getOffer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractTerm#getOffer <em>Offer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offer</em>' containment reference.
	 * @see #getOffer()
	 * @generated
	 */
	void setOffer(ContractOffer value);

	/**
	 * Returns the value of the '<em><b>Asset</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContractAsset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contract Term Asset List.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Asset</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContractTerm_Asset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='asset' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContractAsset> getAsset();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContractAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An actor taking a role in an activity for which it can be assigned some degree of responsibility for the activity taking place.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContractTerm_Action()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='action' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContractAction> getAction();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContractTerm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nested group of Contract Provisions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContractTerm_Group()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='group' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContractTerm> getGroup();

} // ContractTerm
