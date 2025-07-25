/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insurance Plan Cost</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Details of a Health Insurance product/plan provided by an organization.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.InsurancePlanCost#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.InsurancePlanCost#getApplicability <em>Applicability</em>}</li>
 *   <li>{@link org.hl7.fhir.InsurancePlanCost#getQualifiers <em>Qualifiers</em>}</li>
 *   <li>{@link org.hl7.fhir.InsurancePlanCost#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getInsurancePlanCost()
 * @model extendedMetaData="name='InsurancePlan.Cost' kind='elementOnly'"
 * @generated
 */
public interface InsurancePlanCost extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of cost (copay; individual cap; family cap; coinsurance; deductible).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getInsurancePlanCost_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InsurancePlanCost#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Applicability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the cost applies to in-network or out-of-network providers (in-network; out-of-network; other).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applicability</em>' containment reference.
	 * @see #setApplicability(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getInsurancePlanCost_Applicability()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='applicability' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getApplicability();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InsurancePlanCost#getApplicability <em>Applicability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicability</em>' containment reference.
	 * @see #getApplicability()
	 * @generated
	 */
	void setApplicability(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Qualifiers</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional information about the cost, such as information about funding sources (e.g. HSA, HRA, FSA, RRA).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualifiers</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getInsurancePlanCost_Qualifiers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='qualifiers' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getQualifiers();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual cost value. (some of the costs may be represented as percentages rather than currency, e.g. 10% coinsurance).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getInsurancePlanCost_Value()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InsurancePlanCost#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Quantity value);

} // InsurancePlanCost
