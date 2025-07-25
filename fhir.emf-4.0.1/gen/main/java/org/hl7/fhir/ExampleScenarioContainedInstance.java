/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Example Scenario Contained Instance</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ExampleScenarioContainedInstance#getResourceId <em>Resource Id</em>}</li>
 *   <li>{@link org.hl7.fhir.ExampleScenarioContainedInstance#getVersionId <em>Version Id</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getExampleScenarioContainedInstance()
 * @model extendedMetaData="name='ExampleScenario.ContainedInstance' kind='elementOnly'"
 * @generated
 */
public interface ExampleScenarioContainedInstance extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Resource Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each resource contained in the instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Id</em>' containment reference.
	 * @see #setResourceId(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getExampleScenarioContainedInstance_ResourceId()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='resourceId' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getResourceId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExampleScenarioContainedInstance#getResourceId <em>Resource Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Id</em>' containment reference.
	 * @see #getResourceId()
	 * @generated
	 */
	void setResourceId(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Version Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A specific version of a resource contained in the instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version Id</em>' containment reference.
	 * @see #setVersionId(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getExampleScenarioContainedInstance_VersionId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='versionId' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getVersionId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExampleScenarioContainedInstance#getVersionId <em>Version Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Id</em>' containment reference.
	 * @see #getVersionId()
	 * @generated
	 */
	void setVersionId(org.hl7.fhir.String value);

} // ExampleScenarioContainedInstance
