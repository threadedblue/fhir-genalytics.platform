/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consent Verification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of a healthcare consumer’s  choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ConsentVerification#getVerified <em>Verified</em>}</li>
 *   <li>{@link org.hl7.fhir.ConsentVerification#getVerifiedWith <em>Verified With</em>}</li>
 *   <li>{@link org.hl7.fhir.ConsentVerification#getVerificationDate <em>Verification Date</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getConsentVerification()
 * @model extendedMetaData="name='Consent.Verification' kind='elementOnly'"
 * @generated
 */
public interface ConsentVerification extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Verified</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Has the instruction been verified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verified</em>' containment reference.
	 * @see #setVerified(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getConsentVerification_Verified()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='verified' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getVerified();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConsentVerification#getVerified <em>Verified</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verified</em>' containment reference.
	 * @see #getVerified()
	 * @generated
	 */
	void setVerified(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Verified With</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Who verified the instruction (Patient, Relative or other Authorized Person).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verified With</em>' containment reference.
	 * @see #setVerifiedWith(Reference)
	 * @see org.hl7.fhir.FhirPackage#getConsentVerification_VerifiedWith()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='verifiedWith' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getVerifiedWith();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConsentVerification#getVerifiedWith <em>Verified With</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verified With</em>' containment reference.
	 * @see #getVerifiedWith()
	 * @generated
	 */
	void setVerifiedWith(Reference value);

	/**
	 * Returns the value of the '<em><b>Verification Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date verification was collected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verification Date</em>' containment reference.
	 * @see #setVerificationDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getConsentVerification_VerificationDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='verificationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getVerificationDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConsentVerification#getVerificationDate <em>Verification Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verification Date</em>' containment reference.
	 * @see #getVerificationDate()
	 * @generated
	 */
	void setVerificationDate(DateTime value);

} // ConsentVerification
