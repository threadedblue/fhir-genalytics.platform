/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explanation Of Benefit Insurance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitInsurance#getFocal <em>Focal</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitInsurance#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitInsurance#getPreAuthRef <em>Pre Auth Ref</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitInsurance()
 * @model extendedMetaData="name='ExplanationOfBenefit.Insurance' kind='elementOnly'"
 * @generated
 */
public interface ExplanationOfBenefitInsurance extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Focal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A flag to indicate that this Coverage is to be used for adjudication of this claim when set to true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Focal</em>' containment reference.
	 * @see #setFocal(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitInsurance_Focal()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='focal' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getFocal();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitInsurance#getFocal <em>Focal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Focal</em>' containment reference.
	 * @see #getFocal()
	 * @generated
	 */
	void setFocal(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the insurance card level information contained in the Coverage resource. The coverage issuing insurer will use these details to locate the patient's actual coverage within the insurer's information system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coverage</em>' containment reference.
	 * @see #setCoverage(Reference)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitInsurance_Coverage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='coverage' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getCoverage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitInsurance#getCoverage <em>Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage</em>' containment reference.
	 * @see #getCoverage()
	 * @generated
	 */
	void setCoverage(Reference value);

	/**
	 * Returns the value of the '<em><b>Pre Auth Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference numbers previously provided by the insurer to the provider to be quoted on subsequent claims containing services or products related to the prior authorization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pre Auth Ref</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitInsurance_PreAuthRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='preAuthRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getPreAuthRef();

} // ExplanationOfBenefitInsurance
