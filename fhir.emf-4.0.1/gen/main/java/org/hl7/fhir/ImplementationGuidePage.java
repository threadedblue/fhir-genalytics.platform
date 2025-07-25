/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Guide Page</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ImplementationGuidePage#getNameUrl <em>Name Url</em>}</li>
 *   <li>{@link org.hl7.fhir.ImplementationGuidePage#getNameReference <em>Name Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ImplementationGuidePage#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.ImplementationGuidePage#getGeneration <em>Generation</em>}</li>
 *   <li>{@link org.hl7.fhir.ImplementationGuidePage#getPage <em>Page</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getImplementationGuidePage()
 * @model extendedMetaData="name='ImplementationGuide.Page' kind='elementOnly'"
 * @generated
 */
public interface ImplementationGuidePage extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Name Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source address for the page. (choose any one of name*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Url</em>' containment reference.
	 * @see #setNameUrl(Url)
	 * @see org.hl7.fhir.FhirPackage#getImplementationGuidePage_NameUrl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nameUrl' namespace='##targetNamespace'"
	 * @generated
	 */
	Url getNameUrl();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImplementationGuidePage#getNameUrl <em>Name Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Url</em>' containment reference.
	 * @see #getNameUrl()
	 * @generated
	 */
	void setNameUrl(Url value);

	/**
	 * Returns the value of the '<em><b>Name Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source address for the page. (choose any one of name*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Reference</em>' containment reference.
	 * @see #setNameReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getImplementationGuidePage_NameReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nameReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getNameReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImplementationGuidePage#getNameReference <em>Name Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Reference</em>' containment reference.
	 * @see #getNameReference()
	 * @generated
	 */
	void setNameReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A short title used to represent this page in navigational structures such as table of contents, bread crumbs, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getImplementationGuidePage_Title()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getTitle();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImplementationGuidePage#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Generation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code that indicates how the page is generated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generation</em>' containment reference.
	 * @see #setGeneration(GuidePageGeneration)
	 * @see org.hl7.fhir.FhirPackage#getImplementationGuidePage_Generation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='generation' namespace='##targetNamespace'"
	 * @generated
	 */
	GuidePageGeneration getGeneration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImplementationGuidePage#getGeneration <em>Generation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generation</em>' containment reference.
	 * @see #getGeneration()
	 * @generated
	 */
	void setGeneration(GuidePageGeneration value);

	/**
	 * Returns the value of the '<em><b>Page</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ImplementationGuidePage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nested Pages/Sections under this page.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Page</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImplementationGuidePage_Page()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='page' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImplementationGuidePage> getPage();

} // ImplementationGuidePage
