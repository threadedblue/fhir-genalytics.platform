/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account Coverage</b></em>'.
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
 *   <li>{@link org.hl7.fhir.AccountCoverage#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.hl7.fhir.AccountCoverage#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getAccountCoverage()
 * @model extendedMetaData="name='Account.Coverage' kind='elementOnly'"
 * @generated
 */
public interface AccountCoverage extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The party(s) that contribute to payment (or part of) of the charges applied to this account (including self-pay).
	 * 
	 * A coverage may only be responsible for specific types of charges, and the sequence of the coverages in the account could be important when processing billing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coverage</em>' containment reference.
	 * @see #setCoverage(Reference)
	 * @see org.hl7.fhir.FhirPackage#getAccountCoverage_Coverage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='coverage' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getCoverage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AccountCoverage#getCoverage <em>Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage</em>' containment reference.
	 * @see #getCoverage()
	 * @generated
	 */
	void setCoverage(Reference value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The priority of the coverage in the context of this account.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' containment reference.
	 * @see #setPriority(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getAccountCoverage_Priority()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='priority' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getPriority();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AccountCoverage#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(PositiveInt value);

} // AccountCoverage
