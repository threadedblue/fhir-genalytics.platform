/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Request Dispense Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called "MedicationRequest" rather than "MedicationPrescription" or "MedicationOrder" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicationRequestDispenseRequest#getInitialFill <em>Initial Fill</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationRequestDispenseRequest#getDispenseInterval <em>Dispense Interval</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationRequestDispenseRequest#getValidityPeriod <em>Validity Period</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationRequestDispenseRequest#getNumberOfRepeatsAllowed <em>Number Of Repeats Allowed</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationRequestDispenseRequest#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationRequestDispenseRequest#getExpectedSupplyDuration <em>Expected Supply Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationRequestDispenseRequest#getPerformer <em>Performer</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicationRequestDispenseRequest()
 * @model extendedMetaData="name='MedicationRequest.DispenseRequest' kind='elementOnly'"
 * @generated
 */
public interface MedicationRequestDispenseRequest extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Initial Fill</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the quantity or duration for the first dispense of the medication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial Fill</em>' containment reference.
	 * @see #setInitialFill(MedicationRequestInitialFill)
	 * @see org.hl7.fhir.FhirPackage#getMedicationRequestDispenseRequest_InitialFill()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='initialFill' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationRequestInitialFill getInitialFill();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationRequestDispenseRequest#getInitialFill <em>Initial Fill</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Fill</em>' containment reference.
	 * @see #getInitialFill()
	 * @generated
	 */
	void setInitialFill(MedicationRequestInitialFill value);

	/**
	 * Returns the value of the '<em><b>Dispense Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum period of time that must occur between dispenses of the medication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dispense Interval</em>' containment reference.
	 * @see #setDispenseInterval(Duration)
	 * @see org.hl7.fhir.FhirPackage#getMedicationRequestDispenseRequest_DispenseInterval()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dispenseInterval' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getDispenseInterval();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationRequestDispenseRequest#getDispenseInterval <em>Dispense Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dispense Interval</em>' containment reference.
	 * @see #getDispenseInterval()
	 * @generated
	 */
	void setDispenseInterval(Duration value);

	/**
	 * Returns the value of the '<em><b>Validity Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This indicates the validity period of a prescription (stale dating the Prescription).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validity Period</em>' containment reference.
	 * @see #setValidityPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getMedicationRequestDispenseRequest_ValidityPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='validityPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getValidityPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationRequestDispenseRequest#getValidityPeriod <em>Validity Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validity Period</em>' containment reference.
	 * @see #getValidityPeriod()
	 * @generated
	 */
	void setValidityPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Number Of Repeats Allowed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An integer indicating the number of times, in addition to the original dispense, (aka refills or repeats) that the patient can receive the prescribed medication. Usage Notes: This integer does not include the original order dispense. This means that if an order indicates dispense 30 tablets plus "3 repeats", then the order can be dispensed a total of 4 times and the patient can receive a total of 120 tablets.  A prescriber may explicitly say that zero refills are permitted after the initial dispense.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Repeats Allowed</em>' containment reference.
	 * @see #setNumberOfRepeatsAllowed(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getMedicationRequestDispenseRequest_NumberOfRepeatsAllowed()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='numberOfRepeatsAllowed' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getNumberOfRepeatsAllowed();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationRequestDispenseRequest#getNumberOfRepeatsAllowed <em>Number Of Repeats Allowed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Repeats Allowed</em>' containment reference.
	 * @see #getNumberOfRepeatsAllowed()
	 * @generated
	 */
	void setNumberOfRepeatsAllowed(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount that is to be dispensed for one fill.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getMedicationRequestDispenseRequest_Quantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationRequestDispenseRequest#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Expected Supply Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the period time over which the supplied product is expected to be used, or the length of time the dispense is expected to last.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expected Supply Duration</em>' containment reference.
	 * @see #setExpectedSupplyDuration(Duration)
	 * @see org.hl7.fhir.FhirPackage#getMedicationRequestDispenseRequest_ExpectedSupplyDuration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='expectedSupplyDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getExpectedSupplyDuration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationRequestDispenseRequest#getExpectedSupplyDuration <em>Expected Supply Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Supply Duration</em>' containment reference.
	 * @see #getExpectedSupplyDuration()
	 * @generated
	 */
	void setExpectedSupplyDuration(Duration value);

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the intended dispensing Organization specified by the prescriber.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference.
	 * @see #setPerformer(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicationRequestDispenseRequest_Performer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performer' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPerformer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationRequestDispenseRequest#getPerformer <em>Performer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performer</em>' containment reference.
	 * @see #getPerformer()
	 * @generated
	 */
	void setPerformer(Reference value);

} // MedicationRequestDispenseRequest
