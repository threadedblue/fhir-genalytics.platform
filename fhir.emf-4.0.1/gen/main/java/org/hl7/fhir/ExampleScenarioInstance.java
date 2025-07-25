/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Example Scenario Instance</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ExampleScenarioInstance#getResourceId <em>Resource Id</em>}</li>
 *   <li>{@link org.hl7.fhir.ExampleScenarioInstance#getResourceType <em>Resource Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ExampleScenarioInstance#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.ExampleScenarioInstance#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.ExampleScenarioInstance#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.ExampleScenarioInstance#getContainedInstance <em>Contained Instance</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getExampleScenarioInstance()
 * @model extendedMetaData="name='ExampleScenario.Instance' kind='elementOnly'"
 * @generated
 */
public interface ExampleScenarioInstance extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Resource Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The id of the resource for referencing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Id</em>' containment reference.
	 * @see #setResourceId(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getExampleScenarioInstance_ResourceId()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='resourceId' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getResourceId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExampleScenarioInstance#getResourceId <em>Resource Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Id</em>' containment reference.
	 * @see #getResourceId()
	 * @generated
	 */
	void setResourceId(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Resource Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Type</em>' containment reference.
	 * @see #setResourceType(ResourceType)
	 * @see org.hl7.fhir.FhirPackage#getExampleScenarioInstance_ResourceType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='resourceType' namespace='##targetNamespace'"
	 * @generated
	 */
	ResourceType getResourceType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExampleScenarioInstance#getResourceType <em>Resource Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Type</em>' containment reference.
	 * @see #getResourceType()
	 * @generated
	 */
	void setResourceType(ResourceType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A short name for the resource instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getExampleScenarioInstance_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExampleScenarioInstance#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Human-friendly description of the resource instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getExampleScenarioInstance_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExampleScenarioInstance#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExampleScenarioVersion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A specific version of the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExampleScenarioInstance_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExampleScenarioVersion> getVersion();

	/**
	 * Returns the value of the '<em><b>Contained Instance</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExampleScenarioContainedInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resources contained in the instance (e.g. the observations contained in a bundle).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contained Instance</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExampleScenarioInstance_ContainedInstance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='containedInstance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExampleScenarioContainedInstance> getContainedInstance();

} // ExampleScenarioInstance
