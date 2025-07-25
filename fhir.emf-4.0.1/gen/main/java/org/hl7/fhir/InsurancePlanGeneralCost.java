/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insurance Plan General Cost</b></em>'.
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
 *   <li>{@link org.hl7.fhir.InsurancePlanGeneralCost#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.InsurancePlanGeneralCost#getGroupSize <em>Group Size</em>}</li>
 *   <li>{@link org.hl7.fhir.InsurancePlanGeneralCost#getCost <em>Cost</em>}</li>
 *   <li>{@link org.hl7.fhir.InsurancePlanGeneralCost#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getInsurancePlanGeneralCost()
 * @model extendedMetaData="name='InsurancePlan.GeneralCost' kind='elementOnly'"
 * @generated
 */
public interface InsurancePlanGeneralCost extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of cost.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getInsurancePlanGeneralCost_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InsurancePlanGeneralCost#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Group Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of participants enrolled in the plan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group Size</em>' containment reference.
	 * @see #setGroupSize(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getInsurancePlanGeneralCost_GroupSize()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='groupSize' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getGroupSize();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InsurancePlanGeneralCost#getGroupSize <em>Group Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Size</em>' containment reference.
	 * @see #getGroupSize()
	 * @generated
	 */
	void setGroupSize(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Value of the cost.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cost</em>' containment reference.
	 * @see #setCost(Money)
	 * @see org.hl7.fhir.FhirPackage#getInsurancePlanGeneralCost_Cost()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cost' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getCost();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InsurancePlanGeneralCost#getCost <em>Cost</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' containment reference.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(Money value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional information about the general costs associated with this plan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference.
	 * @see #setComment(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getInsurancePlanGeneralCost_Comment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='comment' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getComment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InsurancePlanGeneralCost#getComment <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' containment reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(org.hl7.fhir.String value);

} // InsurancePlanGeneralCost
