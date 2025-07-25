/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Definition Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A formal computable definition of a graph of resources - that is, a coherent set of resources that form a graph by following references. The Graph Definition resource defines a set and makes rules about the set.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.GraphDefinitionTarget#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.GraphDefinitionTarget#getParams <em>Params</em>}</li>
 *   <li>{@link org.hl7.fhir.GraphDefinitionTarget#getProfile <em>Profile</em>}</li>
 *   <li>{@link org.hl7.fhir.GraphDefinitionTarget#getCompartment <em>Compartment</em>}</li>
 *   <li>{@link org.hl7.fhir.GraphDefinitionTarget#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getGraphDefinitionTarget()
 * @model extendedMetaData="name='GraphDefinition.Target' kind='elementOnly'"
 * @generated
 */
public interface GraphDefinitionTarget extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of resource this link refers to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Code)
	 * @see org.hl7.fhir.FhirPackage#getGraphDefinitionTarget_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GraphDefinitionTarget#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Code value);

	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of parameters to look up.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Params</em>' containment reference.
	 * @see #setParams(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getGraphDefinitionTarget_Params()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='params' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getParams();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GraphDefinitionTarget#getParams <em>Params</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Params</em>' containment reference.
	 * @see #getParams()
	 * @generated
	 */
	void setParams(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Profile for the target resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Profile</em>' containment reference.
	 * @see #setProfile(Canonical)
	 * @see org.hl7.fhir.FhirPackage#getGraphDefinitionTarget_Profile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='profile' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getProfile();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GraphDefinitionTarget#getProfile <em>Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile</em>' containment reference.
	 * @see #getProfile()
	 * @generated
	 */
	void setProfile(Canonical value);

	/**
	 * Returns the value of the '<em><b>Compartment</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.GraphDefinitionCompartment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Compartment Consistency Rules.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compartment</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGraphDefinitionTarget_Compartment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='compartment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GraphDefinitionCompartment> getCompartment();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.GraphDefinitionLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional links from target resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getGraphDefinitionTarget_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GraphDefinitionLink> getLink();

} // GraphDefinitionTarget
