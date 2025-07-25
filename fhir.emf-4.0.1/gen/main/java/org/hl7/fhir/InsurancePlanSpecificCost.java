/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insurance Plan Specific Cost</b></em>'.
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
 *   <li>{@link org.hl7.fhir.InsurancePlanSpecificCost#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.InsurancePlanSpecificCost#getBenefit <em>Benefit</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getInsurancePlanSpecificCost()
 * @model extendedMetaData="name='InsurancePlan.SpecificCost' kind='elementOnly'"
 * @generated
 */
public interface InsurancePlanSpecificCost extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * General category of benefit (Medical; Dental; Vision; Drug; Mental Health; Substance Abuse; Hospice, Home Health).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference.
	 * @see #setCategory(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getInsurancePlanSpecificCost_Category()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCategory();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InsurancePlanSpecificCost#getCategory <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' containment reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Benefit</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.InsurancePlanBenefit1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of the specific benefits under this category of benefit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Benefit</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getInsurancePlanSpecificCost_Benefit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='benefit' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InsurancePlanBenefit1> getBenefit();

} // InsurancePlanSpecificCost
