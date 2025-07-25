/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Example Scenario Actor</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ExampleScenarioActor#getActorId <em>Actor Id</em>}</li>
 *   <li>{@link org.hl7.fhir.ExampleScenarioActor#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ExampleScenarioActor#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.ExampleScenarioActor#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getExampleScenarioActor()
 * @model extendedMetaData="name='ExampleScenario.Actor' kind='elementOnly'"
 * @generated
 */
public interface ExampleScenarioActor extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Actor Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ID or acronym of actor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actor Id</em>' containment reference.
	 * @see #setActorId(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getExampleScenarioActor_ActorId()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='actorId' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getActorId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExampleScenarioActor#getActorId <em>Actor Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor Id</em>' containment reference.
	 * @see #getActorId()
	 * @generated
	 */
	void setActorId(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of actor - person or system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(ExampleScenarioActorType)
	 * @see org.hl7.fhir.FhirPackage#getExampleScenarioActor_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	ExampleScenarioActorType getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExampleScenarioActor#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ExampleScenarioActorType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the actor as shown in the page.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getExampleScenarioActor_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExampleScenarioActor#getName <em>Name</em>}' containment reference.
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
	 * The description of the actor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getExampleScenarioActor_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExampleScenarioActor#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

} // ExampleScenarioActor
