/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Guide Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ImplementationGuideDefinition#getGrouping <em>Grouping</em>}</li>
 *   <li>{@link org.hl7.fhir.ImplementationGuideDefinition#getResource <em>Resource</em>}</li>
 *   <li>{@link org.hl7.fhir.ImplementationGuideDefinition#getPage <em>Page</em>}</li>
 *   <li>{@link org.hl7.fhir.ImplementationGuideDefinition#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.hl7.fhir.ImplementationGuideDefinition#getTemplate <em>Template</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getImplementationGuideDefinition()
 * @model extendedMetaData="name='ImplementationGuide.Definition' kind='elementOnly'"
 * @generated
 */
public interface ImplementationGuideDefinition extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Grouping</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ImplementationGuideGrouping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A logical group of resources. Logical groups can be used when building pages.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Grouping</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImplementationGuideDefinition_Grouping()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='grouping' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImplementationGuideGrouping> getGrouping();

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ImplementationGuideResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A resource that is part of the implementation guide. Conformance resources (value set, structure definition, capability statements etc.) are obvious candidates for inclusion, but any kind of resource can be included as an example resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImplementationGuideDefinition_Resource()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='resource' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImplementationGuideResource> getResource();

	/**
	 * Returns the value of the '<em><b>Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A page / section in the implementation guide. The root page is the implementation guide home page.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Page</em>' containment reference.
	 * @see #setPage(ImplementationGuidePage)
	 * @see org.hl7.fhir.FhirPackage#getImplementationGuideDefinition_Page()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='page' namespace='##targetNamespace'"
	 * @generated
	 */
	ImplementationGuidePage getPage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImplementationGuideDefinition#getPage <em>Page</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page</em>' containment reference.
	 * @see #getPage()
	 * @generated
	 */
	void setPage(ImplementationGuidePage value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ImplementationGuideParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines how IG is built by tools.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImplementationGuideDefinition_Parameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImplementationGuideParameter> getParameter();

	/**
	 * Returns the value of the '<em><b>Template</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ImplementationGuideTemplate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A template for building resources.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Template</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImplementationGuideDefinition_Template()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='template' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImplementationGuideTemplate> getTemplate();

} // ImplementationGuideDefinition
