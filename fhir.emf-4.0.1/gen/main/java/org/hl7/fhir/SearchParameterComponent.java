/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Search Parameter Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A search parameter that defines a named search item that can be used to search/filter on a resource.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SearchParameterComponent#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.SearchParameterComponent#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSearchParameterComponent()
 * @model extendedMetaData="name='SearchParameter.Component' kind='elementOnly'"
 * @generated
 */
public interface SearchParameterComponent extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The definition of the search parameter that describes this part.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(Canonical)
	 * @see org.hl7.fhir.FhirPackage#getSearchParameterComponent_Definition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='definition' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SearchParameterComponent#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(Canonical value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A sub-expression that defines how to extract values for this component from the output of the main SearchParameter.expression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSearchParameterComponent_Expression()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='expression' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getExpression();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SearchParameterComponent#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(org.hl7.fhir.String value);

} // SearchParameterComponent
