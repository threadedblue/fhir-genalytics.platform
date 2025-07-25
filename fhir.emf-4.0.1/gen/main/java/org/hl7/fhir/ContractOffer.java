/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract Offer</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ContractOffer#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractOffer#getParty <em>Party</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractOffer#getTopic <em>Topic</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractOffer#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractOffer#getDecision <em>Decision</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractOffer#getDecisionMode <em>Decision Mode</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractOffer#getAnswer <em>Answer</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractOffer#getText <em>Text</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractOffer#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractOffer#getSecurityLabelNumber <em>Security Label Number</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getContractOffer()
 * @model extendedMetaData="name='Contract.Offer' kind='elementOnly'"
 * @generated
 */
public interface ContractOffer extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique identifier for this particular Contract Provision.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContractOffer_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Party</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContractParty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Offer Recipient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Party</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContractOffer_Party()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='party' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContractParty> getParty();

	/**
	 * Returns the value of the '<em><b>Topic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The owner of an asset has the residual control rights over the asset: the right to decide all usages of the asset in any way not inconsistent with a prior contract, custom, or law (Hart, 1995, p. 30).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topic</em>' containment reference.
	 * @see #setTopic(Reference)
	 * @see org.hl7.fhir.FhirPackage#getContractOffer_Topic()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='topic' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getTopic();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractOffer#getTopic <em>Topic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic</em>' containment reference.
	 * @see #getTopic()
	 * @generated
	 */
	void setTopic(Reference value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of Contract Provision such as specific requirements, purposes for actions, obligations, prohibitions, e.g. life time maximum benefit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getContractOffer_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractOffer#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Decision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of choice made by accepting party with respect to an offer made by an offeror/ grantee.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Decision</em>' containment reference.
	 * @see #setDecision(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getContractOffer_Decision()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='decision' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDecision();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractOffer#getDecision <em>Decision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision</em>' containment reference.
	 * @see #getDecision()
	 * @generated
	 */
	void setDecision(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Decision Mode</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How the decision about a Contract was conveyed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Decision Mode</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContractOffer_DecisionMode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='decisionMode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getDecisionMode();

	/**
	 * Returns the value of the '<em><b>Answer</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContractAnswer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Response to offer text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Answer</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContractOffer_Answer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='answer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContractAnswer> getAnswer();

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Human readable form of this Contract Offer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getContractOffer_Text()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getText();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractOffer#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Link Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The id of the clause or question text of the offer in the referenced questionnaire/response.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link Id</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContractOffer_LinkId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='linkId' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getLinkId();

	/**
	 * Returns the value of the '<em><b>Security Label Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.UnsignedInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Security labels that protects the offer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security Label Number</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContractOffer_SecurityLabelNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='securityLabelNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UnsignedInt> getSecurityLabelNumber();

} // ContractOffer
