/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coverage Eligibility Response Insurance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides eligibility and plan details from the processing of an CoverageEligibilityRequest resource.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.CoverageEligibilityResponseInsurance#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.hl7.fhir.CoverageEligibilityResponseInsurance#getInforce <em>Inforce</em>}</li>
 *   <li>{@link org.hl7.fhir.CoverageEligibilityResponseInsurance#getBenefitPeriod <em>Benefit Period</em>}</li>
 *   <li>{@link org.hl7.fhir.CoverageEligibilityResponseInsurance#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCoverageEligibilityResponseInsurance()
 * @model extendedMetaData="name='CoverageEligibilityResponse.Insurance' kind='elementOnly'"
 * @generated
 */
public interface CoverageEligibilityResponseInsurance extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the insurance card level information contained in the Coverage resource. The coverage issuing insurer will use these details to locate the patient's actual coverage within the insurer's information system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coverage</em>' containment reference.
	 * @see #setCoverage(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCoverageEligibilityResponseInsurance_Coverage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='coverage' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getCoverage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CoverageEligibilityResponseInsurance#getCoverage <em>Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage</em>' containment reference.
	 * @see #getCoverage()
	 * @generated
	 */
	void setCoverage(Reference value);

	/**
	 * Returns the value of the '<em><b>Inforce</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Flag indicating if the coverage provided is inforce currently if no service date(s) specified or for the whole duration of the service dates.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inforce</em>' containment reference.
	 * @see #setInforce(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getCoverageEligibilityResponseInsurance_Inforce()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inforce' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getInforce();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CoverageEligibilityResponseInsurance#getInforce <em>Inforce</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inforce</em>' containment reference.
	 * @see #getInforce()
	 * @generated
	 */
	void setInforce(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Benefit Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The term of the benefits documented in this response.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Benefit Period</em>' containment reference.
	 * @see #setBenefitPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getCoverageEligibilityResponseInsurance_BenefitPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='benefitPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getBenefitPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CoverageEligibilityResponseInsurance#getBenefitPeriod <em>Benefit Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Benefit Period</em>' containment reference.
	 * @see #getBenefitPeriod()
	 * @generated
	 */
	void setBenefitPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CoverageEligibilityResponseItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Benefits and optionally current balances, and authorization details by category or service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCoverageEligibilityResponseInsurance_Item()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='item' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CoverageEligibilityResponseItem> getItem();

} // CoverageEligibilityResponseInsurance
