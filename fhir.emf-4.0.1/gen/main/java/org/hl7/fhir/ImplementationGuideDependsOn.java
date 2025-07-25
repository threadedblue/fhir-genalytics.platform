/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Guide Depends On</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ImplementationGuideDependsOn#getUri <em>Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.ImplementationGuideDependsOn#getPackageId <em>Package Id</em>}</li>
 *   <li>{@link org.hl7.fhir.ImplementationGuideDependsOn#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getImplementationGuideDependsOn()
 * @model extendedMetaData="name='ImplementationGuide.DependsOn' kind='elementOnly'"
 * @generated
 */
public interface ImplementationGuideDependsOn extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A canonical reference to the Implementation guide for the dependency.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uri</em>' containment reference.
	 * @see #setUri(Canonical)
	 * @see org.hl7.fhir.FhirPackage#getImplementationGuideDependsOn_Uri()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='uri' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getUri();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImplementationGuideDependsOn#getUri <em>Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' containment reference.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(Canonical value);

	/**
	 * Returns the value of the '<em><b>Package Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The NPM package name for the Implementation Guide that this IG depends on.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package Id</em>' containment reference.
	 * @see #setPackageId(Id)
	 * @see org.hl7.fhir.FhirPackage#getImplementationGuideDependsOn_PackageId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='packageId' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getPackageId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImplementationGuideDependsOn#getPackageId <em>Package Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Id</em>' containment reference.
	 * @see #getPackageId()
	 * @generated
	 */
	void setPackageId(Id value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version of the IG that is depended on, when the correct version is required to understand the IG correctly.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getImplementationGuideDependsOn_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getVersion();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImplementationGuideDependsOn#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(org.hl7.fhir.String value);

} // ImplementationGuideDependsOn
