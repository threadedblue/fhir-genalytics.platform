/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Example Scenario Step</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ExampleScenarioStep#getProcess <em>Process</em>}</li>
 *   <li>{@link org.hl7.fhir.ExampleScenarioStep#getPause <em>Pause</em>}</li>
 *   <li>{@link org.hl7.fhir.ExampleScenarioStep#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.hl7.fhir.ExampleScenarioStep#getAlternative <em>Alternative</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getExampleScenarioStep()
 * @model extendedMetaData="name='ExampleScenario.Step' kind='elementOnly'"
 * @generated
 */
public interface ExampleScenarioStep extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Process</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExampleScenarioProcess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nested process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Process</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExampleScenarioStep_Process()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='process' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExampleScenarioProcess> getProcess();

	/**
	 * Returns the value of the '<em><b>Pause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If there is a pause in the flow.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pause</em>' containment reference.
	 * @see #setPause(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getExampleScenarioStep_Pause()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pause' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getPause();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExampleScenarioStep#getPause <em>Pause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pause</em>' containment reference.
	 * @see #getPause()
	 * @generated
	 */
	void setPause(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each interaction or action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference.
	 * @see #setOperation(ExampleScenarioOperation)
	 * @see org.hl7.fhir.FhirPackage#getExampleScenarioStep_Operation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='operation' namespace='##targetNamespace'"
	 * @generated
	 */
	ExampleScenarioOperation getOperation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExampleScenarioStep#getOperation <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' containment reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(ExampleScenarioOperation value);

	/**
	 * Returns the value of the '<em><b>Alternative</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExampleScenarioAlternative}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates an alternative step that can be taken instead of the operations on the base step in exceptional/atypical circumstances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alternative</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExampleScenarioStep_Alternative()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='alternative' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExampleScenarioAlternative> getAlternative();

} // ExampleScenarioStep
