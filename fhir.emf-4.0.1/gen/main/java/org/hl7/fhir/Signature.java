/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A signature along with supporting context. The signature may be a digital signature that is cryptographic in nature, or some other signature acceptable to the domain. This other signature may be as simple as a graphical image representing a hand-written signature, or a signature ceremony Different signature approaches have different utilities.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Signature#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Signature#getWhen <em>When</em>}</li>
 *   <li>{@link org.hl7.fhir.Signature#getWho <em>Who</em>}</li>
 *   <li>{@link org.hl7.fhir.Signature#getOnBehalfOf <em>On Behalf Of</em>}</li>
 *   <li>{@link org.hl7.fhir.Signature#getTargetFormat <em>Target Format</em>}</li>
 *   <li>{@link org.hl7.fhir.Signature#getSigFormat <em>Sig Format</em>}</li>
 *   <li>{@link org.hl7.fhir.Signature#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSignature()
 * @model extendedMetaData="name='Signature' kind='elementOnly'"
 * @generated
 */
public interface Signature extends Element {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An indication of the reason that the entity signed this document. This may be explicitly included as part of the signature information and can be used when determining accountability for various actions concerning the document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSignature_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getType();

	/**
	 * Returns the value of the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the digital signature was signed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>When</em>' containment reference.
	 * @see #setWhen(Instant)
	 * @see org.hl7.fhir.FhirPackage#getSignature_When()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='when' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getWhen();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Signature#getWhen <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' containment reference.
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(Instant value);

	/**
	 * Returns the value of the '<em><b>Who</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to an application-usable description of the identity that signed  (e.g. the signature used their private key).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Who</em>' containment reference.
	 * @see #setWho(Reference)
	 * @see org.hl7.fhir.FhirPackage#getSignature_Who()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='who' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getWho();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Signature#getWho <em>Who</em>}' containment reference.
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
	 * A reference to an application-usable description of the identity that is represented by the signature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>On Behalf Of</em>' containment reference.
	 * @see #setOnBehalfOf(Reference)
	 * @see org.hl7.fhir.FhirPackage#getSignature_OnBehalfOf()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onBehalfOf' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOnBehalfOf();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Signature#getOnBehalfOf <em>On Behalf Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Behalf Of</em>' containment reference.
	 * @see #getOnBehalfOf()
	 * @generated
	 */
	void setOnBehalfOf(Reference value);

	/**
	 * Returns the value of the '<em><b>Target Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A mime type that indicates the technical format of the target resources signed by the signature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Format</em>' containment reference.
	 * @see #setTargetFormat(Code)
	 * @see org.hl7.fhir.FhirPackage#getSignature_TargetFormat()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='targetFormat' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getTargetFormat();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Signature#getTargetFormat <em>Target Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Format</em>' containment reference.
	 * @see #getTargetFormat()
	 * @generated
	 */
	void setTargetFormat(Code value);

	/**
	 * Returns the value of the '<em><b>Sig Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A mime type that indicates the technical format of the signature. Important mime types are application/signature+xml for X ML DigSig, application/jose for JWS, and image/* for a graphical image of a signature, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sig Format</em>' containment reference.
	 * @see #setSigFormat(Code)
	 * @see org.hl7.fhir.FhirPackage#getSignature_SigFormat()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sigFormat' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getSigFormat();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Signature#getSigFormat <em>Sig Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sig Format</em>' containment reference.
	 * @see #getSigFormat()
	 * @generated
	 */
	void setSigFormat(Code value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The base64 encoding of the Signature content. When signature is not recorded electronically this element would be empty.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data</em>' containment reference.
	 * @see #setData(Base64Binary)
	 * @see org.hl7.fhir.FhirPackage#getSignature_Data()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='data' namespace='##targetNamespace'"
	 * @generated
	 */
	Base64Binary getData();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Signature#getData <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' containment reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(Base64Binary value);

} // Signature
