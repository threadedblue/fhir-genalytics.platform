/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Pharmaceutical Target Species</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A pharmaceutical product described in terms of its composition and dose form.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicinalProductPharmaceuticalTargetSpecies#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductPharmaceuticalTargetSpecies#getWithdrawalPeriod <em>Withdrawal Period</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPharmaceuticalTargetSpecies()
 * @model extendedMetaData="name='MedicinalProductPharmaceutical.TargetSpecies' kind='elementOnly'"
 * @generated
 */
public interface MedicinalProductPharmaceuticalTargetSpecies extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coded expression for the species.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPharmaceuticalTargetSpecies_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductPharmaceuticalTargetSpecies#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Withdrawal Period</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicinalProductPharmaceuticalWithdrawalPeriod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A species specific time during which consumption of animal product is not appropriate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Withdrawal Period</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPharmaceuticalTargetSpecies_WithdrawalPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='withdrawalPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicinalProductPharmaceuticalWithdrawalPeriod> getWithdrawalPeriod();

} // MedicinalProductPharmaceuticalTargetSpecies
