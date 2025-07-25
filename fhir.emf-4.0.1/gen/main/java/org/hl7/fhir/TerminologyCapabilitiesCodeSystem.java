/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminology Capabilities Code System</b></em>'.
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
 *   <li>{@link org.hl7.fhir.TerminologyCapabilitiesCodeSystem#getUri <em>Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.TerminologyCapabilitiesCodeSystem#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.TerminologyCapabilitiesCodeSystem#getSubsumption <em>Subsumption</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getTerminologyCapabilitiesCodeSystem()
 * @model extendedMetaData="name='TerminologyCapabilities.CodeSystem' kind='elementOnly'"
 * @generated
 */
public interface TerminologyCapabilitiesCodeSystem extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URI for the Code System.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uri</em>' containment reference.
	 * @see #setUri(Canonical)
	 * @see org.hl7.fhir.FhirPackage#getTerminologyCapabilitiesCodeSystem_Uri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='uri' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getUri();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TerminologyCapabilitiesCodeSystem#getUri <em>Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' containment reference.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(Canonical value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.TerminologyCapabilitiesVersion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For the code system, a list of versions that are supported by the server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTerminologyCapabilitiesCodeSystem_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TerminologyCapabilitiesVersion> getVersion();

	/**
	 * Returns the value of the '<em><b>Subsumption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if subsumption is supported for this version of the code system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subsumption</em>' containment reference.
	 * @see #setSubsumption(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getTerminologyCapabilitiesCodeSystem_Subsumption()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subsumption' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getSubsumption();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TerminologyCapabilitiesCodeSystem#getSubsumption <em>Subsumption</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subsumption</em>' containment reference.
	 * @see #getSubsumption()
	 * @generated
	 */
	void setSubsumption(org.hl7.fhir.Boolean value);

} // TerminologyCapabilitiesCodeSystem
