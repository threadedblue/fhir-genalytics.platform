/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Guide Resource</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ImplementationGuideResource#getReference <em>Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ImplementationGuideResource#getFhirVersion <em>Fhir Version</em>}</li>
 *   <li>{@link org.hl7.fhir.ImplementationGuideResource#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.ImplementationGuideResource#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.ImplementationGuideResource#getExampleBoolean <em>Example Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.ImplementationGuideResource#getExampleCanonical <em>Example Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.ImplementationGuideResource#getGroupingId <em>Grouping Id</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getImplementationGuideResource()
 * @model extendedMetaData="name='ImplementationGuide.Resource' kind='elementOnly'"
 * @generated
 */
public interface ImplementationGuideResource extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where this resource is found.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getImplementationGuideResource_Reference()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImplementationGuideResource#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Fhir Version</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.FHIRVersion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the FHIR Version(s) this artifact is intended to apply to. If no versions are specified, the resource is assumed to apply to all the versions stated in ImplementationGuide.fhirVersion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fhir Version</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImplementationGuideResource_FhirVersion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fhirVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FHIRVersion> getFhirVersion();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human assigned name for the resource. All resources SHOULD have a name, but the name may be extracted from the resource (e.g. ValueSet.name).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getImplementationGuideResource_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImplementationGuideResource#getName <em>Name</em>}' containment reference.
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
	 * A description of the reason that a resource has been included in the implementation guide.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getImplementationGuideResource_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImplementationGuideResource#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Example Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true or a reference, indicates the resource is an example instance.  If a reference is present, indicates that the example is an example of the specified profile. (choose any one of example*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Example Boolean</em>' containment reference.
	 * @see #setExampleBoolean(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getImplementationGuideResource_ExampleBoolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exampleBoolean' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getExampleBoolean();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImplementationGuideResource#getExampleBoolean <em>Example Boolean</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getImplementationGuideResource_ExampleCanonical()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exampleCanonical' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getExampleCanonical();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImplementationGuideResource#getExampleCanonical <em>Example Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example Canonical</em>' containment reference.
	 * @see #getExampleCanonical()
	 * @generated
	 */
	void setExampleCanonical(Canonical value);

	/**
	 * Returns the value of the '<em><b>Grouping Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the id of the grouping this resource appears in.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Grouping Id</em>' containment reference.
	 * @see #setGroupingId(Id)
	 * @see org.hl7.fhir.FhirPackage#getImplementationGuideResource_GroupingId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='groupingId' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getGroupingId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImplementationGuideResource#getGroupingId <em>Grouping Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grouping Id</em>' containment reference.
	 * @see #getGroupingId()
	 * @generated
	 */
	void setGroupingId(Id value);

} // ImplementationGuideResource
