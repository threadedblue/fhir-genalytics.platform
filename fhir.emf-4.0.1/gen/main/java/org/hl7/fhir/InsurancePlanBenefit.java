/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insurance Plan Benefit</b></em>'.
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
 *   <li>{@link org.hl7.fhir.InsurancePlanBenefit#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.InsurancePlanBenefit#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link org.hl7.fhir.InsurancePlanBenefit#getLimit <em>Limit</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getInsurancePlanBenefit()
 * @model extendedMetaData="name='InsurancePlan.Benefit' kind='elementOnly'"
 * @generated
 */
public interface InsurancePlanBenefit extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of benefit (primary care; speciality care; inpatient; outpatient).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getInsurancePlanBenefit_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InsurancePlanBenefit#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The referral requirements to have access/coverage for this benefit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requirement</em>' containment reference.
	 * @see #setRequirement(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getInsurancePlanBenefit_Requirement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requirement' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getRequirement();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InsurancePlanBenefit#getRequirement <em>Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement</em>' containment reference.
	 * @see #getRequirement()
	 * @generated
	 */
	void setRequirement(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Limit</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.InsurancePlanLimit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specific limits on the benefit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Limit</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getInsurancePlanBenefit_Limit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='limit' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InsurancePlanLimit> getLimit();

} // InsurancePlanBenefit
