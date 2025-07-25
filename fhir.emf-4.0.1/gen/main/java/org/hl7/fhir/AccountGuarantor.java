/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account Guarantor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A financial tool for tracking value accrued for a particular purpose.  In the healthcare field, used to track charges for a patient, cost centers, etc.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.AccountGuarantor#getParty <em>Party</em>}</li>
 *   <li>{@link org.hl7.fhir.AccountGuarantor#getOnHold <em>On Hold</em>}</li>
 *   <li>{@link org.hl7.fhir.AccountGuarantor#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getAccountGuarantor()
 * @model extendedMetaData="name='Account.Guarantor' kind='elementOnly'"
 * @generated
 */
public interface AccountGuarantor extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The entity who is responsible.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Party</em>' containment reference.
	 * @see #setParty(Reference)
	 * @see org.hl7.fhir.FhirPackage#getAccountGuarantor_Party()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='party' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getParty();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AccountGuarantor#getParty <em>Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' containment reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Reference value);

	/**
	 * Returns the value of the '<em><b>On Hold</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A guarantor may be placed on credit hold or otherwise have their role temporarily suspended.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>On Hold</em>' containment reference.
	 * @see #setOnHold(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getAccountGuarantor_OnHold()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onHold' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getOnHold();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AccountGuarantor#getOnHold <em>On Hold</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Hold</em>' containment reference.
	 * @see #getOnHold()
	 * @generated
	 */
	void setOnHold(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The timeframe during which the guarantor accepts responsibility for the account.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getAccountGuarantor_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AccountGuarantor#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

} // AccountGuarantor
