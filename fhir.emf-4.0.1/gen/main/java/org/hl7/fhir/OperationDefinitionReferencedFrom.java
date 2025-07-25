/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Definition Referenced From</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.OperationDefinitionReferencedFrom#getSource <em>Source</em>}</li>
 *   <li>{@link org.hl7.fhir.OperationDefinitionReferencedFrom#getSourceId <em>Source Id</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getOperationDefinitionReferencedFrom()
 * @model extendedMetaData="name='OperationDefinition.ReferencedFrom' kind='elementOnly'"
 * @generated
 */
public interface OperationDefinitionReferencedFrom extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the parameter or dot-separated path of parameter names pointing to the resource parameter that is expected to contain a reference to this resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getOperationDefinitionReferencedFrom_Source()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSource();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.OperationDefinitionReferencedFrom#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Source Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The id of the element in the referencing resource that is expected to resolve to this resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Id</em>' containment reference.
	 * @see #setSourceId(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getOperationDefinitionReferencedFrom_SourceId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceId' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSourceId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.OperationDefinitionReferencedFrom#getSourceId <em>Source Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Id</em>' containment reference.
	 * @see #getSourceId()
	 * @generated
	 */
	void setSourceId(org.hl7.fhir.String value);

} // OperationDefinitionReferencedFrom
