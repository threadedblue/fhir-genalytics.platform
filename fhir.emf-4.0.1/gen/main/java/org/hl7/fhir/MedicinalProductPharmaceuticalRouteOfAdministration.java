/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Pharmaceutical Route Of Administration</b></em>'.
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
 *   <li>{@link org.hl7.fhir.MedicinalProductPharmaceuticalRouteOfAdministration#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductPharmaceuticalRouteOfAdministration#getFirstDose <em>First Dose</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductPharmaceuticalRouteOfAdministration#getMaxSingleDose <em>Max Single Dose</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductPharmaceuticalRouteOfAdministration#getMaxDosePerDay <em>Max Dose Per Day</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductPharmaceuticalRouteOfAdministration#getMaxDosePerTreatmentPeriod <em>Max Dose Per Treatment Period</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductPharmaceuticalRouteOfAdministration#getMaxTreatmentPeriod <em>Max Treatment Period</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductPharmaceuticalRouteOfAdministration#getTargetSpecies <em>Target Species</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPharmaceuticalRouteOfAdministration()
 * @model extendedMetaData="name='MedicinalProductPharmaceutical.RouteOfAdministration' kind='elementOnly'"
 * @generated
 */
public interface MedicinalProductPharmaceuticalRouteOfAdministration extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coded expression for the route.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPharmaceuticalRouteOfAdministration_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductPharmaceuticalRouteOfAdministration#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>First Dose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The first dose (dose quantity) administered in humans can be specified, for a product under investigation, using a numerical value and its unit of measurement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>First Dose</em>' containment reference.
	 * @see #setFirstDose(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPharmaceuticalRouteOfAdministration_FirstDose()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='firstDose' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getFirstDose();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductPharmaceuticalRouteOfAdministration#getFirstDose <em>First Dose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Dose</em>' containment reference.
	 * @see #getFirstDose()
	 * @generated
	 */
	void setFirstDose(Quantity value);

	/**
	 * Returns the value of the '<em><b>Max Single Dose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum single dose that can be administered as per the protocol of a clinical trial can be specified using a numerical value and its unit of measurement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Single Dose</em>' containment reference.
	 * @see #setMaxSingleDose(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPharmaceuticalRouteOfAdministration_MaxSingleDose()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxSingleDose' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getMaxSingleDose();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductPharmaceuticalRouteOfAdministration#getMaxSingleDose <em>Max Single Dose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Single Dose</em>' containment reference.
	 * @see #getMaxSingleDose()
	 * @generated
	 */
	void setMaxSingleDose(Quantity value);

	/**
	 * Returns the value of the '<em><b>Max Dose Per Day</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum dose per day (maximum dose quantity to be administered in any one 24-h period) that can be administered as per the protocol referenced in the clinical trial authorisation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Dose Per Day</em>' containment reference.
	 * @see #setMaxDosePerDay(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPharmaceuticalRouteOfAdministration_MaxDosePerDay()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxDosePerDay' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getMaxDosePerDay();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductPharmaceuticalRouteOfAdministration#getMaxDosePerDay <em>Max Dose Per Day</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Dose Per Day</em>' containment reference.
	 * @see #getMaxDosePerDay()
	 * @generated
	 */
	void setMaxDosePerDay(Quantity value);

	/**
	 * Returns the value of the '<em><b>Max Dose Per Treatment Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum dose per treatment period that can be administered as per the protocol referenced in the clinical trial authorisation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Dose Per Treatment Period</em>' containment reference.
	 * @see #setMaxDosePerTreatmentPeriod(Ratio)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPharmaceuticalRouteOfAdministration_MaxDosePerTreatmentPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxDosePerTreatmentPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getMaxDosePerTreatmentPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductPharmaceuticalRouteOfAdministration#getMaxDosePerTreatmentPeriod <em>Max Dose Per Treatment Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Dose Per Treatment Period</em>' containment reference.
	 * @see #getMaxDosePerTreatmentPeriod()
	 * @generated
	 */
	void setMaxDosePerTreatmentPeriod(Ratio value);

	/**
	 * Returns the value of the '<em><b>Max Treatment Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum treatment period during which an Investigational Medicinal Product can be administered as per the protocol referenced in the clinical trial authorisation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Treatment Period</em>' containment reference.
	 * @see #setMaxTreatmentPeriod(Duration)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPharmaceuticalRouteOfAdministration_MaxTreatmentPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxTreatmentPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getMaxTreatmentPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductPharmaceuticalRouteOfAdministration#getMaxTreatmentPeriod <em>Max Treatment Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Treatment Period</em>' containment reference.
	 * @see #getMaxTreatmentPeriod()
	 * @generated
	 */
	void setMaxTreatmentPeriod(Duration value);

	/**
	 * Returns the value of the '<em><b>Target Species</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicinalProductPharmaceuticalTargetSpecies}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A species for which this route applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Species</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductPharmaceuticalRouteOfAdministration_TargetSpecies()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='targetSpecies' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicinalProductPharmaceuticalTargetSpecies> getTargetSpecies();

} // MedicinalProductPharmaceuticalRouteOfAdministration
