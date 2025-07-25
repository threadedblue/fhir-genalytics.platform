/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coverage Eligibility Request Supporting Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CoverageEligibilityRequest provides patient and insurance coverage information to an insurer for them to respond, in the form of an CoverageEligibilityResponse, with information regarding whether the stated coverage is valid and in-force and optionally to provide the insurance details of the policy.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.CoverageEligibilityRequestSupportingInfo#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.CoverageEligibilityRequestSupportingInfo#getInformation <em>Information</em>}</li>
 *   <li>{@link org.hl7.fhir.CoverageEligibilityRequestSupportingInfo#getAppliesToAll <em>Applies To All</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCoverageEligibilityRequestSupportingInfo()
 * @model extendedMetaData="name='CoverageEligibilityRequest.SupportingInfo' kind='elementOnly'"
 * @generated
 */
public interface CoverageEligibilityRequestSupportingInfo extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A number to uniquely identify supporting information entries.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getCoverageEligibilityRequestSupportingInfo_Sequence()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getSequence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CoverageEligibilityRequestSupportingInfo#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional data or information such as resources, documents, images etc. including references to the data or the actual inclusion of the data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Information</em>' containment reference.
	 * @see #setInformation(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCoverageEligibilityRequestSupportingInfo_Information()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='information' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getInformation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CoverageEligibilityRequestSupportingInfo#getInformation <em>Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information</em>' containment reference.
	 * @see #getInformation()
	 * @generated
	 */
	void setInformation(Reference value);

	/**
	 * Returns the value of the '<em><b>Applies To All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The supporting materials are applicable for all detail items, product/servce categories and specific billing codes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applies To All</em>' containment reference.
	 * @see #setAppliesToAll(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getCoverageEligibilityRequestSupportingInfo_AppliesToAll()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='appliesToAll' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getAppliesToAll();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CoverageEligibilityRequestSupportingInfo#getAppliesToAll <em>Applies To All</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applies To All</em>' containment reference.
	 * @see #getAppliesToAll()
	 * @generated
	 */
	void setAppliesToAll(org.hl7.fhir.Boolean value);

} // CoverageEligibilityRequestSupportingInfo
