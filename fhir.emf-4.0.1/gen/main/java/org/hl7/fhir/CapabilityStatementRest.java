/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Statement Rest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.CapabilityStatementRest#getMode <em>Mode</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatementRest#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatementRest#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatementRest#getResource <em>Resource</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatementRest#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatementRest#getSearchParam <em>Search Param</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatementRest#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatementRest#getCompartment <em>Compartment</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementRest()
 * @model extendedMetaData="name='CapabilityStatement.Rest' kind='elementOnly'"
 * @generated
 */
public interface CapabilityStatementRest extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies whether this portion of the statement is describing the ability to initiate or receive restful operations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mode</em>' containment reference.
	 * @see #setMode(RestfulCapabilityMode)
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementRest_Mode()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mode' namespace='##targetNamespace'"
	 * @generated
	 */
	RestfulCapabilityMode getMode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CapabilityStatementRest#getMode <em>Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' containment reference.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(RestfulCapabilityMode value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about the system's restful capabilities that apply across all applications, such as security.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementRest_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDocumentation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CapabilityStatementRest#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(Markdown value);

	/**
	 * Returns the value of the '<em><b>Security</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about security implementation from an interface perspective - what a client needs to know.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security</em>' containment reference.
	 * @see #setSecurity(CapabilityStatementSecurity)
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementRest_Security()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='security' namespace='##targetNamespace'"
	 * @generated
	 */
	CapabilityStatementSecurity getSecurity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CapabilityStatementRest#getSecurity <em>Security</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security</em>' containment reference.
	 * @see #getSecurity()
	 * @generated
	 */
	void setSecurity(CapabilityStatementSecurity value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CapabilityStatementResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A specification of the restful capabilities of the solution for a specific resource type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementRest_Resource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resource' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CapabilityStatementResource> getResource();

	/**
	 * Returns the value of the '<em><b>Interaction</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CapabilityStatementInteraction1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A specification of restful operations supported by the system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interaction</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementRest_Interaction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interaction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CapabilityStatementInteraction1> getInteraction();

	/**
	 * Returns the value of the '<em><b>Search Param</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CapabilityStatementSearchParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Search parameters that are supported for searching all resources for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Search Param</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementRest_SearchParam()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='searchParam' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CapabilityStatementSearchParam> getSearchParam();

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CapabilityStatementOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of an operation or a named query together with its parameters and their meaning and type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementRest_Operation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='operation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CapabilityStatementOperation> getOperation();

	/**
	 * Returns the value of the '<em><b>Compartment</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Canonical}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute URI which is a reference to the definition of a compartment that the system supports. The reference is to a CompartmentDefinition resource by its canonical URL .
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compartment</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementRest_Compartment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='compartment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Canonical> getCompartment();

} // CapabilityStatementRest
