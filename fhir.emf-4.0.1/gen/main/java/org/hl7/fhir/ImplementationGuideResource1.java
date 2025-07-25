/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Guide Resource1</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ImplementationGuideResource1#getReference <em>Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ImplementationGuideResource1#getExampleBoolean <em>Example Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.ImplementationGuideResource1#getExampleCanonical <em>Example Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.ImplementationGuideResource1#getRelativePath <em>Relative Path</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getImplementationGuideResource1()
 * @model extendedMetaData="name='ImplementationGuide.Resource1' kind='elementOnly'"
 * @generated
 */
public interface ImplementationGuideResource1 extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where this resource is found.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getImplementationGuideResource1_Reference()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImplementationGuideResource1#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Example Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true or a reference, indicates the resource is an example instance.  If a reference is present, indicates that the example is an example of the specified profile. (choose any one of example*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Example Boolean</em>' containment reference.
	 * @see #setExampleBoolean(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getImplementationGuideResource1_ExampleBoolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exampleBoolean' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getExampleBoolean();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImplementationGuideResource1#getExampleBoolean <em>Example Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example Boolean</em>' containment reference.
	 * @see #getExampleBoolean()
	 * @generated
	 */
	void setExampleBoolean(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Example Canonical</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true or a reference, indicates the resource is an example instance.  If a reference is present, indicates that the example is an example of the specified profile. (choose any one of example*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Example Canonical</em>' containment reference.
	 * @see #setExampleCanonical(Canonical)
	 * @see org.hl7.fhir.FhirPackage#getImplementationGuideResource1_ExampleCanonical()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exampleCanonical' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getExampleCanonical();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImplementationGuideResource1#getExampleCanonical <em>Example Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example Canonical</em>' containment reference.
	 * @see #getExampleCanonical()
	 * @generated
	 */
	void setExampleCanonical(Canonical value);

	/**
	 * Returns the value of the '<em><b>Relative Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relative path for primary page for this resource within the IG.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relative Path</em>' containment reference.
	 * @see #setRelativePath(Url)
	 * @see org.hl7.fhir.FhirPackage#getImplementationGuideResource1_RelativePath()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relativePath' namespace='##targetNamespace'"
	 * @generated
	 */
	Url getRelativePath();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImplementationGuideResource1#getRelativePath <em>Relative Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Path</em>' containment reference.
	 * @see #getRelativePath()
	 * @generated
	 */
	void setRelativePath(Url value);

} // ImplementationGuideResource1
