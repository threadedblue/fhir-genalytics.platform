/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminology Capabilities Translation</b></em>'.
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
 *   <li>{@link org.hl7.fhir.TerminologyCapabilitiesTranslation#getNeedsMap <em>Needs Map</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getTerminologyCapabilitiesTranslation()
 * @model extendedMetaData="name='TerminologyCapabilities.Translation' kind='elementOnly'"
 * @generated
 */
public interface TerminologyCapabilitiesTranslation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Needs Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the client must identify the map.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Needs Map</em>' containment reference.
	 * @see #setNeedsMap(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getTerminologyCapabilitiesTranslation_NeedsMap()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='needsMap' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getNeedsMap();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TerminologyCapabilitiesTranslation#getNeedsMap <em>Needs Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Needs Map</em>' containment reference.
	 * @see #getNeedsMap()
	 * @generated
	 */
	void setNeedsMap(org.hl7.fhir.Boolean value);

} // TerminologyCapabilitiesTranslation
