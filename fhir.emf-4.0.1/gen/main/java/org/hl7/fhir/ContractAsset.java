/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract Asset</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ContractAsset#getScope <em>Scope</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAsset#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAsset#getTypeReference <em>Type Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAsset#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAsset#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAsset#getContext <em>Context</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAsset#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAsset#getPeriodType <em>Period Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAsset#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAsset#getUsePeriod <em>Use Period</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAsset#getText <em>Text</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAsset#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAsset#getAnswer <em>Answer</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAsset#getSecurityLabelNumber <em>Security Label Number</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAsset#getValuedItem <em>Valued Item</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getContractAsset()
 * @model extendedMetaData="name='Contract.Asset' kind='elementOnly'"
 * @generated
 */
public interface ContractAsset extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Differentiates the kind of the asset .
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scope</em>' containment reference.
	 * @see #setScope(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getContractAsset_Scope()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='scope' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getScope();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractAsset#getScope <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' containment reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Target entity type about which the term may be concerned.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContractAsset_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getType();

	/**
	 * Returns the value of the '<em><b>Type Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Associated entities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Reference</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContractAsset_TypeReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='typeReference' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getTypeReference();

	/**
	 * Returns the value of the '<em><b>Subtype</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * May be a subtype or part of an offered asset.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subtype</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContractAsset_Subtype()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subtype' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getSubtype();

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the applicability of the term to an asset resource instance, and instances it refers to orinstances that refer to it, and/or are owned by the offeree.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference.
	 * @see #setRelationship(Coding)
	 * @see org.hl7.fhir.FhirPackage#getContractAsset_Relationship()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relationship' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getRelationship();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractAsset#getRelationship <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' containment reference.
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(Coding value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContractContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Circumstance of the asset.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContractAsset_Context()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='context' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContractContext> getContext();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the quality and completeness of the asset that imay be a factor in its valuation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getContractAsset_Condition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='condition' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getCondition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractAsset#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Period Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of Asset availability for use or ownership.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContractAsset_PeriodType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='periodType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getPeriodType();

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Period}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Asset relevant contractual time period.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContractAsset_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Period> getPeriod();

	/**
	 * Returns the value of the '<em><b>Use Period</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Period}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time period of asset use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Period</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContractAsset_UsePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='usePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Period> getUsePeriod();

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Clause or question text (Prose Object) concerning the asset in a linked form, such as a QuestionnaireResponse used in the formation of the contract.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getContractAsset_Text()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getText();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractAsset#getText <em>Text</em>}' containment reference.
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
	 * Id [identifier??] of the clause or question text about the asset in the referenced form or QuestionnaireResponse.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link Id</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContractAsset_LinkId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='linkId' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getLinkId();

	/**
	 * Returns the value of the '<em><b>Answer</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContractAnswer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Response to assets.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Answer</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContractAsset_Answer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='answer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContractAnswer> getAnswer();

	/**
	 * Returns the value of the '<em><b>Security Label Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.UnsignedInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Security labels that protects the asset.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security Label Number</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContractAsset_SecurityLabelNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='securityLabelNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UnsignedInt> getSecurityLabelNumber();

	/**
	 * Returns the value of the '<em><b>Valued Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContractValuedItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contract Valued Item List.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Valued Item</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContractAsset_ValuedItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valuedItem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContractValuedItem> getValuedItem();

} // ContractAsset
