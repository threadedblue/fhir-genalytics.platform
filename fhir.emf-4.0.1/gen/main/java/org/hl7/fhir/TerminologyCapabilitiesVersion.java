/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminology Capabilities Version</b></em>'.
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
 *   <li>{@link org.hl7.fhir.TerminologyCapabilitiesVersion#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.TerminologyCapabilitiesVersion#getIsDefault <em>Is Default</em>}</li>
 *   <li>{@link org.hl7.fhir.TerminologyCapabilitiesVersion#getCompositional <em>Compositional</em>}</li>
 *   <li>{@link org.hl7.fhir.TerminologyCapabilitiesVersion#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.hl7.fhir.TerminologyCapabilitiesVersion#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.hl7.fhir.TerminologyCapabilitiesVersion#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getTerminologyCapabilitiesVersion()
 * @model extendedMetaData="name='TerminologyCapabilities.Version' kind='elementOnly'"
 * @generated
 */
public interface TerminologyCapabilitiesVersion extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For version-less code systems, there should be a single version with no identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getTerminologyCapabilitiesVersion_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TerminologyCapabilitiesVersion#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Is Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this is the default version for this code system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Default</em>' containment reference.
	 * @see #setIsDefault(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getTerminologyCapabilitiesVersion_IsDefault()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='isDefault' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getIsDefault();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TerminologyCapabilitiesVersion#getIsDefault <em>Is Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Default</em>' containment reference.
	 * @see #getIsDefault()
	 * @generated
	 */
	void setIsDefault(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Compositional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the compositional grammar defined by the code system is supported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compositional</em>' containment reference.
	 * @see #setCompositional(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getTerminologyCapabilitiesVersion_Compositional()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='compositional' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getCompositional();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TerminologyCapabilitiesVersion#getCompositional <em>Compositional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compositional</em>' containment reference.
	 * @see #getCompositional()
	 * @generated
	 */
	void setCompositional(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Code}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Language Displays supported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTerminologyCapabilitiesVersion_Language()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='language' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Code> getLanguage();

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.TerminologyCapabilitiesFilter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Filter Properties supported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTerminologyCapabilitiesVersion_Filter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='filter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TerminologyCapabilitiesFilter> getFilter();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Code}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Properties supported for $lookup.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTerminologyCapabilitiesVersion_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Code> getProperty();

} // TerminologyCapabilitiesVersion
