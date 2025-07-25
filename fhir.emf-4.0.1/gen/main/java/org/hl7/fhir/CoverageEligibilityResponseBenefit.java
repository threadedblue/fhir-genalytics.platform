/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coverage Eligibility Response Benefit</b></em>'.
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
 *   <li>{@link org.hl7.fhir.CoverageEligibilityResponseBenefit#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.CoverageEligibilityResponseBenefit#getAllowedUnsignedInt <em>Allowed Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.CoverageEligibilityResponseBenefit#getAllowedString <em>Allowed String</em>}</li>
 *   <li>{@link org.hl7.fhir.CoverageEligibilityResponseBenefit#getAllowedMoney <em>Allowed Money</em>}</li>
 *   <li>{@link org.hl7.fhir.CoverageEligibilityResponseBenefit#getUsedUnsignedInt <em>Used Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.CoverageEligibilityResponseBenefit#getUsedString <em>Used String</em>}</li>
 *   <li>{@link org.hl7.fhir.CoverageEligibilityResponseBenefit#getUsedMoney <em>Used Money</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCoverageEligibilityResponseBenefit()
 * @model extendedMetaData="name='CoverageEligibilityResponse.Benefit' kind='elementOnly'"
 * @generated
 */
public interface CoverageEligibilityResponseBenefit extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Classification of benefit being provided.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getCoverageEligibilityResponseBenefit_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CoverageEligibilityResponseBenefit#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Allowed Unsigned Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The quantity of the benefit which is permitted under the coverage. (choose any one of allowed*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allowed Unsigned Int</em>' containment reference.
	 * @see #setAllowedUnsignedInt(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getCoverageEligibilityResponseBenefit_AllowedUnsignedInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='allowedUnsignedInt' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getAllowedUnsignedInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CoverageEligibilityResponseBenefit#getAllowedUnsignedInt <em>Allowed Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed Unsigned Int</em>' containment reference.
	 * @see #getAllowedUnsignedInt()
	 * @generated
	 */
	void setAllowedUnsignedInt(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Allowed String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The quantity of the benefit which is permitted under the coverage. (choose any one of allowed*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allowed String</em>' containment reference.
	 * @see #setAllowedString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCoverageEligibilityResponseBenefit_AllowedString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='allowedString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getAllowedString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CoverageEligibilityResponseBenefit#getAllowedString <em>Allowed String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed String</em>' containment reference.
	 * @see #getAllowedString()
	 * @generated
	 */
	void setAllowedString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Allowed Money</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The quantity of the benefit which is permitted under the coverage. (choose any one of allowed*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allowed Money</em>' containment reference.
	 * @see #setAllowedMoney(Money)
	 * @see org.hl7.fhir.FhirPackage#getCoverageEligibilityResponseBenefit_AllowedMoney()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='allowedMoney' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getAllowedMoney();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CoverageEligibilityResponseBenefit#getAllowedMoney <em>Allowed Money</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed Money</em>' containment reference.
	 * @see #getAllowedMoney()
	 * @generated
	 */
	void setAllowedMoney(Money value);

	/**
	 * Returns the value of the '<em><b>Used Unsigned Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The quantity of the benefit which have been consumed to date. (choose any one of used*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Used Unsigned Int</em>' containment reference.
	 * @see #setUsedUnsignedInt(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getCoverageEligibilityResponseBenefit_UsedUnsignedInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='usedUnsignedInt' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getUsedUnsignedInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CoverageEligibilityResponseBenefit#getUsedUnsignedInt <em>Used Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used Unsigned Int</em>' containment reference.
	 * @see #getUsedUnsignedInt()
	 * @generated
	 */
	void setUsedUnsignedInt(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Used String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The quantity of the benefit which have been consumed to date. (choose any one of used*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Used String</em>' containment reference.
	 * @see #setUsedString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCoverageEligibilityResponseBenefit_UsedString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='usedString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getUsedString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CoverageEligibilityResponseBenefit#getUsedString <em>Used String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used String</em>' containment reference.
	 * @see #getUsedString()
	 * @generated
	 */
	void setUsedString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Used Money</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The quantity of the benefit which have been consumed to date. (choose any one of used*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Used Money</em>' containment reference.
	 * @see #setUsedMoney(Money)
	 * @see org.hl7.fhir.FhirPackage#getCoverageEligibilityResponseBenefit_UsedMoney()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='usedMoney' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getUsedMoney();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CoverageEligibilityResponseBenefit#getUsedMoney <em>Used Money</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used Money</em>' containment reference.
	 * @see #getUsedMoney()
	 * @generated
	 */
	void setUsedMoney(Money value);

} // CoverageEligibilityResponseBenefit
