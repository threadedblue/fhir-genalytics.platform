/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coverage Cost To Beneficiary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Financial instrument which may be used to reimburse or pay for health care products and services. Includes both insurance and self-payment.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.CoverageCostToBeneficiary#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.CoverageCostToBeneficiary#getValueQuantity <em>Value Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.CoverageCostToBeneficiary#getValueMoney <em>Value Money</em>}</li>
 *   <li>{@link org.hl7.fhir.CoverageCostToBeneficiary#getException <em>Exception</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCoverageCostToBeneficiary()
 * @model extendedMetaData="name='Coverage.CostToBeneficiary' kind='elementOnly'"
 * @generated
 */
public interface CoverageCostToBeneficiary extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The category of patient centric costs associated with treatment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getCoverageCostToBeneficiary_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CoverageCostToBeneficiary#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Value Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount due from the patient for the cost category. (choose any one of value*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Quantity</em>' containment reference.
	 * @see #setValueQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getCoverageCostToBeneficiary_ValueQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getValueQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CoverageCostToBeneficiary#getValueQuantity <em>Value Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Quantity</em>' containment reference.
	 * @see #getValueQuantity()
	 * @generated
	 */
	void setValueQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Value Money</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount due from the patient for the cost category. (choose any one of value*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Money</em>' containment reference.
	 * @see #setValueMoney(Money)
	 * @see org.hl7.fhir.FhirPackage#getCoverageCostToBeneficiary_ValueMoney()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueMoney' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getValueMoney();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CoverageCostToBeneficiary#getValueMoney <em>Value Money</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Money</em>' containment reference.
	 * @see #getValueMoney()
	 * @generated
	 */
	void setValueMoney(Money value);

	/**
	 * Returns the value of the '<em><b>Exception</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CoverageException}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A suite of codes indicating exceptions or reductions to patient costs and their effective periods.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exception</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCoverageCostToBeneficiary_Exception()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exception' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CoverageException> getException();

} // CoverageCostToBeneficiary
