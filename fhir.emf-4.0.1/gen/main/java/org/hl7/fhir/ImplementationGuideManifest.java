/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Guide Manifest</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ImplementationGuideManifest#getRendering <em>Rendering</em>}</li>
 *   <li>{@link org.hl7.fhir.ImplementationGuideManifest#getResource <em>Resource</em>}</li>
 *   <li>{@link org.hl7.fhir.ImplementationGuideManifest#getPage <em>Page</em>}</li>
 *   <li>{@link org.hl7.fhir.ImplementationGuideManifest#getImage <em>Image</em>}</li>
 *   <li>{@link org.hl7.fhir.ImplementationGuideManifest#getOther <em>Other</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getImplementationGuideManifest()
 * @model extendedMetaData="name='ImplementationGuide.Manifest' kind='elementOnly'"
 * @generated
 */
public interface ImplementationGuideManifest extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Rendering</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A pointer to official web page, PDF or other rendering of the implementation guide.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rendering</em>' containment reference.
	 * @see #setRendering(Url)
	 * @see org.hl7.fhir.FhirPackage#getImplementationGuideManifest_Rendering()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rendering' namespace='##targetNamespace'"
	 * @generated
	 */
	Url getRendering();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImplementationGuideManifest#getRendering <em>Rendering</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rendering</em>' containment reference.
	 * @see #getRendering()
	 * @generated
	 */
	void setRendering(Url value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ImplementationGuideResource1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A resource that is part of the implementation guide. Conformance resources (value set, structure definition, capability statements etc.) are obvious candidates for inclusion, but any kind of resource can be included as an example resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImplementationGuideManifest_Resource()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='resource' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImplementationGuideResource1> getResource();

	/**
	 * Returns the value of the '<em><b>Page</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ImplementationGuidePage1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about a page within the IG.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Page</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImplementationGuideManifest_Page()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='page' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImplementationGuidePage1> getPage();

	/**
	 * Returns the value of the '<em><b>Image</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates a relative path to an image that exists within the IG.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImplementationGuideManifest_Image()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='image' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getImage();

	/**
	 * Returns the value of the '<em><b>Other</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the relative path of an additional non-page, non-image file that is part of the IG - e.g. zip, jar and similar files that could be the target of a hyperlink in a derived IG.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImplementationGuideManifest_Other()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='other' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getOther();

} // ImplementationGuideManifest
