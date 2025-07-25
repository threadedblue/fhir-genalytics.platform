/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminology Capabilities Closure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A TerminologyCapabilities resource documents a set of capabilities (behaviors) of a FHIR Terminology Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.TerminologyCapabilitiesClosure#getTranslation <em>Translation</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getTerminologyCapabilitiesClosure()
 * @model extendedMetaData="name='TerminologyCapabilities.Closure' kind='elementOnly'"
 * @generated
 */
public interface TerminologyCapabilitiesClosure extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Translation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If cross-system closure is supported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Translation</em>' containment reference.
	 * @see #setTranslation(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getTerminologyCapabilitiesClosure_Translation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='translation' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getTranslation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TerminologyCapabilitiesClosure#getTranslation <em>Translation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translation</em>' containment reference.
	 * @see #getTranslation()
	 * @generated
	 */
	void setTranslation(org.hl7.fhir.Boolean value);

} // TerminologyCapabilitiesClosure
