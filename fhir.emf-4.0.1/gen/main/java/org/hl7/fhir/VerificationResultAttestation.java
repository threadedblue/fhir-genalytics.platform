/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verification Result Attestation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes validation requirements, source(s), status and dates for one or more elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.VerificationResultAttestation#getWho <em>Who</em>}</li>
 *   <li>{@link org.hl7.fhir.VerificationResultAttestation#getOnBehalfOf <em>On Behalf Of</em>}</li>
 *   <li>{@link org.hl7.fhir.VerificationResultAttestation#getCommunicationMethod <em>Communication Method</em>}</li>
 *   <li>{@link org.hl7.fhir.VerificationResultAttestation#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.VerificationResultAttestation#getSourceIdentityCertificate <em>Source Identity Certificate</em>}</li>
 *   <li>{@link org.hl7.fhir.VerificationResultAttestation#getProxyIdentityCertificate <em>Proxy Identity Certificate</em>}</li>
 *   <li>{@link org.hl7.fhir.VerificationResultAttestation#getProxySignature <em>Proxy Signature</em>}</li>
 *   <li>{@link org.hl7.fhir.VerificationResultAttestation#getSourceSignature <em>Source Signature</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getVerificationResultAttestation()
 * @model extendedMetaData="name='VerificationResult.Attestation' kind='elementOnly'"
 * @generated
 */
public interface VerificationResultAttestation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Who</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The individual or organization attesting to information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Who</em>' containment reference.
	 * @see #setWho(Reference)
	 * @see org.hl7.fhir.FhirPackage#getVerificationResultAttestation_Who()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='who' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getWho();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VerificationResultAttestation#getWho <em>Who</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who</em>' containment reference.
	 * @see #getWho()
	 * @generated
	 */
	void setWho(Reference value);

	/**
	 * Returns the value of the '<em><b>On Behalf Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the who is asserting on behalf of another (organization or individual).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>On Behalf Of</em>' containment reference.
	 * @see #setOnBehalfOf(Reference)
	 * @see org.hl7.fhir.FhirPackage#getVerificationResultAttestation_OnBehalfOf()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onBehalfOf' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOnBehalfOf();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VerificationResultAttestation#getOnBehalfOf <em>On Behalf Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Behalf Of</em>' containment reference.
	 * @see #getOnBehalfOf()
	 * @generated
	 */
	void setOnBehalfOf(Reference value);

	/**
	 * Returns the value of the '<em><b>Communication Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The method by which attested information was submitted/retrieved (manual; API; Push).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Communication Method</em>' containment reference.
	 * @see #setCommunicationMethod(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getVerificationResultAttestation_CommunicationMethod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='communicationMethod' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCommunicationMethod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VerificationResultAttestation#getCommunicationMethod <em>Communication Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Method</em>' containment reference.
	 * @see #getCommunicationMethod()
	 * @generated
	 */
	void setCommunicationMethod(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date the information was attested to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getVerificationResultAttestation_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VerificationResultAttestation#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Source Identity Certificate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A digital identity certificate associated with the attestation source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Identity Certificate</em>' containment reference.
	 * @see #setSourceIdentityCertificate(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getVerificationResultAttestation_SourceIdentityCertificate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceIdentityCertificate' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSourceIdentityCertificate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VerificationResultAttestation#getSourceIdentityCertificate <em>Source Identity Certificate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Identity Certificate</em>' containment reference.
	 * @see #getSourceIdentityCertificate()
	 * @generated
	 */
	void setSourceIdentityCertificate(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Proxy Identity Certificate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A digital identity certificate associated with the proxy entity submitting attested information on behalf of the attestation source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Proxy Identity Certificate</em>' containment reference.
	 * @see #setProxyIdentityCertificate(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getVerificationResultAttestation_ProxyIdentityCertificate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='proxyIdentityCertificate' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getProxyIdentityCertificate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VerificationResultAttestation#getProxyIdentityCertificate <em>Proxy Identity Certificate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy Identity Certificate</em>' containment reference.
	 * @see #getProxyIdentityCertificate()
	 * @generated
	 */
	void setProxyIdentityCertificate(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Proxy Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Signed assertion by the proxy entity indicating that they have the right to submit attested information on behalf of the attestation source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Proxy Signature</em>' containment reference.
	 * @see #setProxySignature(Signature)
	 * @see org.hl7.fhir.FhirPackage#getVerificationResultAttestation_ProxySignature()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='proxySignature' namespace='##targetNamespace'"
	 * @generated
	 */
	Signature getProxySignature();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VerificationResultAttestation#getProxySignature <em>Proxy Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy Signature</em>' containment reference.
	 * @see #getProxySignature()
	 * @generated
	 */
	void setProxySignature(Signature value);

	/**
	 * Returns the value of the '<em><b>Source Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Signed assertion by the attestation source that they have attested to the information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Signature</em>' containment reference.
	 * @see #setSourceSignature(Signature)
	 * @see org.hl7.fhir.FhirPackage#getVerificationResultAttestation_SourceSignature()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceSignature' namespace='##targetNamespace'"
	 * @generated
	 */
	Signature getSourceSignature();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VerificationResultAttestation#getSourceSignature <em>Source Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Signature</em>' containment reference.
	 * @see #getSourceSignature()
	 * @generated
	 */
	void setSourceSignature(Signature value);

} // VerificationResultAttestation
