/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coverage Eligibility Response Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides eligibility and plan details from the processing of an CoverageEligibilityRequest resource.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.CoverageEligibilityResponseItem#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.CoverageEligibilityResponseItem#getProductOrService <em>Product Or Service</em>}</li>
 *   <li>{@link org.hl7.fhir.CoverageEligibilityResponseItem#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.hl7.fhir.CoverageEligibilityResponseItem#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.hl7.fhir.CoverageEligibilityResponseItem#getExcluded <em>Excluded</em>}</li>
 *   <li>{@link org.hl7.fhir.CoverageEligibilityResponseItem#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.CoverageEligibilityResponseItem#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.CoverageEligibilityResponseItem#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.hl7.fhir.CoverageEligibilityResponseItem#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.hl7.fhir.CoverageEligibilityResponseItem#getTerm <em>Term</em>}</li>
 *   <li>{@link org.hl7.fhir.CoverageEligibilityResponseItem#getBenefit <em>Benefit</em>}</li>
 *   <li>{@link org.hl7.fhir.CoverageEligibilityResponseItem#getAuthorizationRequired <em>Authorization Required</em>}</li>
 *   <li>{@link org.hl7.fhir.CoverageEligibilityResponseItem#getAuthorizationSupporting <em>Authorization Supporting</em>}</li>
 *   <li>{@link org.hl7.fhir.CoverageEligibilityResponseItem#getAuthorizationUrl <em>Authorization Url</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCoverageEligibilityResponseItem()
 * @model extendedMetaData="name='CoverageEligibilityResponse.Item' kind='elementOnly'"
 * @generated
 */
public interface CoverageEligibilityResponseItem extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code to identify the general type of benefits under which products and services are provided.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference.
	 * @see #setCategory(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getCoverageEligibilityResponseItem_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCategory();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CoverageEligibilityResponseItem#getCategory <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' containment reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Product Or Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This contains the product, service, drug or other billing code for the item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product Or Service</em>' containment reference.
	 * @see #setProductOrService(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getCoverageEligibilityResponseItem_ProductOrService()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='productOrService' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getProductOrService();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CoverageEligibilityResponseItem#getProductOrService <em>Product Or Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Or Service</em>' containment reference.
	 * @see #getProductOrService()
	 * @generated
	 */
	void setProductOrService(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Item typification or modifiers codes to convey additional context for the product or service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCoverageEligibilityResponseItem_Modifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getModifier();

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The practitioner who is eligible for the provision of the product or service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider</em>' containment reference.
	 * @see #setProvider(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCoverageEligibilityResponseItem_Provider()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='provider' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getProvider();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CoverageEligibilityResponseItem#getProvider <em>Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' containment reference.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(Reference value);

	/**
	 * Returns the value of the '<em><b>Excluded</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if the indicated class of service is excluded from the plan, missing or False indicates the product or service is included in the coverage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Excluded</em>' containment reference.
	 * @see #setExcluded(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getCoverageEligibilityResponseItem_Excluded()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='excluded' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getExcluded();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CoverageEligibilityResponseItem#getExcluded <em>Excluded</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Excluded</em>' containment reference.
	 * @see #getExcluded()
	 * @generated
	 */
	void setExcluded(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A short name or tag for the benefit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCoverageEligibilityResponseItem_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CoverageEligibilityResponseItem#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A richer description of the benefit or services covered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCoverageEligibilityResponseItem_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CoverageEligibilityResponseItem#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Is a flag to indicate whether the benefits refer to in-network providers or out-of-network providers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Network</em>' containment reference.
	 * @see #setNetwork(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getCoverageEligibilityResponseItem_Network()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='network' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getNetwork();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CoverageEligibilityResponseItem#getNetwork <em>Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' containment reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates if the benefits apply to an individual or to the family.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit</em>' containment reference.
	 * @see #setUnit(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getCoverageEligibilityResponseItem_Unit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unit' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getUnit();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CoverageEligibilityResponseItem#getUnit <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' containment reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The term or period of the values such as 'maximum lifetime benefit' or 'maximum annual visits'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Term</em>' containment reference.
	 * @see #setTerm(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getCoverageEligibilityResponseItem_Term()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='term' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getTerm();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CoverageEligibilityResponseItem#getTerm <em>Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term</em>' containment reference.
	 * @see #getTerm()
	 * @generated
	 */
	void setTerm(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Benefit</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CoverageEligibilityResponseBenefit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Benefits used to date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Benefit</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCoverageEligibilityResponseItem_Benefit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='benefit' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CoverageEligibilityResponseBenefit> getBenefit();

	/**
	 * Returns the value of the '<em><b>Authorization Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A boolean flag indicating whether a preauthorization is required prior to actual service delivery.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authorization Required</em>' containment reference.
	 * @see #setAuthorizationRequired(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getCoverageEligibilityResponseItem_AuthorizationRequired()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='authorizationRequired' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getAuthorizationRequired();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CoverageEligibilityResponseItem#getAuthorizationRequired <em>Authorization Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorization Required</em>' containment reference.
	 * @see #getAuthorizationRequired()
	 * @generated
	 */
	void setAuthorizationRequired(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Authorization Supporting</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Codes or comments regarding information or actions associated with the preauthorization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authorization Supporting</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCoverageEligibilityResponseItem_AuthorizationSupporting()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='authorizationSupporting' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getAuthorizationSupporting();

	/**
	 * Returns the value of the '<em><b>Authorization Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A web location for obtaining requirements or descriptive information regarding the preauthorization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authorization Url</em>' containment reference.
	 * @see #setAuthorizationUrl(Uri)
	 * @see org.hl7.fhir.FhirPackage#getCoverageEligibilityResponseItem_AuthorizationUrl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='authorizationUrl' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getAuthorizationUrl();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CoverageEligibilityResponseItem#getAuthorizationUrl <em>Authorization Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorization Url</em>' containment reference.
	 * @see #getAuthorizationUrl()
	 * @generated
	 */
	void setAuthorizationUrl(Uri value);

} // CoverageEligibilityResponseItem
