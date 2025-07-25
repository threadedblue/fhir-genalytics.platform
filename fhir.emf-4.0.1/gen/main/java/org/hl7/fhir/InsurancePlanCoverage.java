/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insurance Plan Coverage</b></em>'.
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
 *   <li>{@link org.hl7.fhir.InsurancePlanCoverage#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.InsurancePlanCoverage#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.hl7.fhir.InsurancePlanCoverage#getBenefit <em>Benefit</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getInsurancePlanCoverage()
 * @model extendedMetaData="name='InsurancePlan.Coverage' kind='elementOnly'"
 * @generated
 */
public interface InsurancePlanCoverage extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of coverage  (Medical; Dental; Mental Health; Substance Abuse; Vision; Drug; Short Term; Long Term Care; Hospice; Home Health).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getInsurancePlanCoverage_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InsurancePlanCoverage#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Network</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the network that providing the type of coverage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Network</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getInsurancePlanCoverage_Network()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='network' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getNetwork();

	/**
	 * Returns the value of the '<em><b>Benefit</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.InsurancePlanBenefit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specific benefits under this type of coverage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Benefit</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getInsurancePlanCoverage_Benefit()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='benefit' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InsurancePlanBenefit> getBenefit();

} // InsurancePlanCoverage
