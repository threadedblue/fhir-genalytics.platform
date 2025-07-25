/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insurance Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Details of a Health Insurance product/plan provided by an organization.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.InsurancePlan#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.InsurancePlan#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.InsurancePlan#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.InsurancePlan#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.InsurancePlan#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.hl7.fhir.InsurancePlan#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.InsurancePlan#getOwnedBy <em>Owned By</em>}</li>
 *   <li>{@link org.hl7.fhir.InsurancePlan#getAdministeredBy <em>Administered By</em>}</li>
 *   <li>{@link org.hl7.fhir.InsurancePlan#getCoverageArea <em>Coverage Area</em>}</li>
 *   <li>{@link org.hl7.fhir.InsurancePlan#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.InsurancePlan#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.hl7.fhir.InsurancePlan#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.hl7.fhir.InsurancePlan#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.hl7.fhir.InsurancePlan#getPlan <em>Plan</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getInsurancePlan()
 * @model extendedMetaData="name='InsurancePlan' kind='elementOnly'"
 * @generated
 */
public interface InsurancePlan extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Business identifiers assigned to this health insurance product which remain constant as the resource is updated and propagates from server to server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getInsurancePlan_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current state of the health insurance product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(PublicationStatus)
	 * @see org.hl7.fhir.FhirPackage#getInsurancePlan_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	PublicationStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InsurancePlan#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(PublicationStatus value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The kind of health insurance product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getInsurancePlan_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getType();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Official name of the health insurance product as designated by the owner.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getInsurancePlan_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InsurancePlan#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of alternate names that the product is known as, or was known as in the past.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alias</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getInsurancePlan_Alias()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='alias' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getAlias();

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The period of time that the health insurance product is available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getInsurancePlan_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InsurancePlan#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Owned By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The entity that is providing  the health insurance product and underwriting the risk.  This is typically an insurance carriers, other third-party payers, or health plan sponsors comonly referred to as 'payers'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned By</em>' containment reference.
	 * @see #setOwnedBy(Reference)
	 * @see org.hl7.fhir.FhirPackage#getInsurancePlan_OwnedBy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ownedBy' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOwnedBy();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InsurancePlan#getOwnedBy <em>Owned By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By</em>' containment reference.
	 * @see #getOwnedBy()
	 * @generated
	 */
	void setOwnedBy(Reference value);

	/**
	 * Returns the value of the '<em><b>Administered By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An organization which administer other services such as underwriting, customer service and/or claims processing on behalf of the health insurance product owner.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Administered By</em>' containment reference.
	 * @see #setAdministeredBy(Reference)
	 * @see org.hl7.fhir.FhirPackage#getInsurancePlan_AdministeredBy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='administeredBy' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAdministeredBy();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InsurancePlan#getAdministeredBy <em>Administered By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Administered By</em>' containment reference.
	 * @see #getAdministeredBy()
	 * @generated
	 */
	void setAdministeredBy(Reference value);

	/**
	 * Returns the value of the '<em><b>Coverage Area</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The geographic region in which a health insurance product's benefits apply.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coverage Area</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getInsurancePlan_CoverageArea()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='coverageArea' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getCoverageArea();

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.InsurancePlanContact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The contact for the health insurance product for a certain purpose.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getInsurancePlan_Contact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contact' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InsurancePlanContact> getContact();

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The technical endpoints providing access to services operated for the health insurance product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endpoint</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getInsurancePlan_Endpoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endpoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getEndpoint();

	/**
	 * Returns the value of the '<em><b>Network</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the network included in the health insurance product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Network</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getInsurancePlan_Network()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='network' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getNetwork();

	/**
	 * Returns the value of the '<em><b>Coverage</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.InsurancePlanCoverage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Details about the coverage offered by the insurance product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coverage</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getInsurancePlan_Coverage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='coverage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InsurancePlanCoverage> getCoverage();

	/**
	 * Returns the value of the '<em><b>Plan</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.InsurancePlanPlan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Details about an insurance plan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plan</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getInsurancePlan_Plan()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='plan' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InsurancePlanPlan> getPlan();

} // InsurancePlan
