/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A resource that represents the data of a single raw artifact as digital content accessible in its native format.  A Binary resource can contain any content, whether text, image, pdf, zip archive, etc.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Binary#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Binary#getSecurityContext <em>Security Context</em>}</li>
 *   <li>{@link org.hl7.fhir.Binary#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getBinary()
 * @model extendedMetaData="name='Binary' kind='elementOnly'"
 * @generated
 */
public interface Binary extends Resource {
	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MimeType of the binary content represented as a standard MimeType (BCP 13).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content Type</em>' containment reference.
	 * @see #setContentType(Code)
	 * @see org.hl7.fhir.FhirPackage#getBinary_ContentType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='contentType' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getContentType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Binary#getContentType <em>Content Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' containment reference.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(Code value);

	/**
	 * Returns the value of the '<em><b>Security Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element identifies another resource that can be used as a proxy of the security sensitivity to use when deciding and enforcing access control rules for the Binary resource. Given that the Binary resource contains very few elements that can be used to determine the sensitivity of the data and relationships to individuals, the referenced resource stands in as a proxy equivalent for this purpose. This referenced resource may be related to the Binary (e.g. Media, DocumentReference), or may be some non-related Resource purely as a security proxy. E.g. to identify that the binary resource relates to a patient, and access should only be granted to applications that have access to the patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security Context</em>' containment reference.
	 * @see #setSecurityContext(Reference)
	 * @see org.hl7.fhir.FhirPackage#getBinary_SecurityContext()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='securityContext' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSecurityContext();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Binary#getSecurityContext <em>Security Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Context</em>' containment reference.
	 * @see #getSecurityContext()
	 * @generated
	 */
	void setSecurityContext(Reference value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual content, base64 encoded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data</em>' containment reference.
	 * @see #setData(Base64Binary)
	 * @see org.hl7.fhir.FhirPackage#getBinary_Data()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='data' namespace='##targetNamespace'"
	 * @generated
	 */
	Base64Binary getData();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Binary#getData <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' containment reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(Base64Binary value);

} // Binary
