/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Example Scenario Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Example of workflow instance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ExampleScenarioVersion#getVersionId <em>Version Id</em>}</li>
 *   <li>{@link org.hl7.fhir.ExampleScenarioVersion#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getExampleScenarioVersion()
 * @model extendedMetaData="name='ExampleScenario.Version' kind='elementOnly'"
 * @generated
 */
public interface ExampleScenarioVersion extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Version Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifier of a specific version of a resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version Id</em>' containment reference.
	 * @see #setVersionId(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getExampleScenarioVersion_VersionId()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='versionId' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getVersionId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExampleScenarioVersion#getVersionId <em>Version Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Id</em>' containment reference.
	 * @see #getVersionId()
	 * @generated
	 */
	void setVersionId(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The description of the resource version.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getExampleScenarioVersion_Description()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExampleScenarioVersion#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

} // ExampleScenarioVersion
