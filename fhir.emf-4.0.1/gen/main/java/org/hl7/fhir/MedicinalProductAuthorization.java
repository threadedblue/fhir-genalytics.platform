/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Authorization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The regulatory authorization of a medicinal product.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicinalProductAuthorization#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductAuthorization#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductAuthorization#getCountry <em>Country</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductAuthorization#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductAuthorization#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductAuthorization#getStatusDate <em>Status Date</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductAuthorization#getRestoreDate <em>Restore Date</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductAuthorization#getValidityPeriod <em>Validity Period</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductAuthorization#getDataExclusivityPeriod <em>Data Exclusivity Period</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductAuthorization#getDateOfFirstAuthorization <em>Date Of First Authorization</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductAuthorization#getInternationalBirthDate <em>International Birth Date</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductAuthorization#getLegalBasis <em>Legal Basis</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductAuthorization#getJurisdictionalAuthorization <em>Jurisdictional Authorization</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductAuthorization#getHolder <em>Holder</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductAuthorization#getRegulator <em>Regulator</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductAuthorization#getProcedure <em>Procedure</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicinalProductAuthorization()
 * @model extendedMetaData="name='MedicinalProductAuthorization' kind='elementOnly'"
 * @generated
 */
public interface MedicinalProductAuthorization extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Business identifier for the marketing authorization, as assigned by a regulator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductAuthorization_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The medicinal product that is being authorized.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductAuthorization_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductAuthorization#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The country in which the marketing authorization has been granted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Country</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductAuthorization_Country()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='country' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCountry();

	/**
	 * Returns the value of the '<em><b>Jurisdiction</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Jurisdiction within a country.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jurisdiction</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductAuthorization_Jurisdiction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='jurisdiction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getJurisdiction();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of the marketing authorization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductAuthorization_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductAuthorization#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Status Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date at which the given status has become applicable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Date</em>' containment reference.
	 * @see #setStatusDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductAuthorization_StatusDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='statusDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getStatusDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductAuthorization#getStatusDate <em>Status Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Date</em>' containment reference.
	 * @see #getStatusDate()
	 * @generated
	 */
	void setStatusDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Restore Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date when a suspended the marketing or the marketing authorization of the product is anticipated to be restored.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Restore Date</em>' containment reference.
	 * @see #setRestoreDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductAuthorization_RestoreDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='restoreDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getRestoreDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductAuthorization#getRestoreDate <em>Restore Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restore Date</em>' containment reference.
	 * @see #getRestoreDate()
	 * @generated
	 */
	void setRestoreDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Validity Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The beginning of the time period in which the marketing authorization is in the specific status shall be specified A complete date consisting of day, month and year shall be specified using the ISO 8601 date format.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validity Period</em>' containment reference.
	 * @see #setValidityPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductAuthorization_ValidityPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='validityPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getValidityPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductAuthorization#getValidityPeriod <em>Validity Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validity Period</em>' containment reference.
	 * @see #getValidityPeriod()
	 * @generated
	 */
	void setValidityPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Data Exclusivity Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A period of time after authorization before generic product applicatiosn can be submitted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Exclusivity Period</em>' containment reference.
	 * @see #setDataExclusivityPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductAuthorization_DataExclusivityPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dataExclusivityPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getDataExclusivityPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductAuthorization#getDataExclusivityPeriod <em>Data Exclusivity Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Exclusivity Period</em>' containment reference.
	 * @see #getDataExclusivityPeriod()
	 * @generated
	 */
	void setDataExclusivityPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Date Of First Authorization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date when the first authorization was granted by a Medicines Regulatory Agency.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Of First Authorization</em>' containment reference.
	 * @see #setDateOfFirstAuthorization(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductAuthorization_DateOfFirstAuthorization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dateOfFirstAuthorization' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDateOfFirstAuthorization();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductAuthorization#getDateOfFirstAuthorization <em>Date Of First Authorization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Of First Authorization</em>' containment reference.
	 * @see #getDateOfFirstAuthorization()
	 * @generated
	 */
	void setDateOfFirstAuthorization(DateTime value);

	/**
	 * Returns the value of the '<em><b>International Birth Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date of first marketing authorization for a company's new medicinal product in any country in the World.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>International Birth Date</em>' containment reference.
	 * @see #setInternationalBirthDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductAuthorization_InternationalBirthDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='internationalBirthDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getInternationalBirthDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductAuthorization#getInternationalBirthDate <em>International Birth Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>International Birth Date</em>' containment reference.
	 * @see #getInternationalBirthDate()
	 * @generated
	 */
	void setInternationalBirthDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Legal Basis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The legal framework against which this authorization is granted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Legal Basis</em>' containment reference.
	 * @see #setLegalBasis(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductAuthorization_LegalBasis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='legalBasis' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getLegalBasis();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductAuthorization#getLegalBasis <em>Legal Basis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legal Basis</em>' containment reference.
	 * @see #getLegalBasis()
	 * @generated
	 */
	void setLegalBasis(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Jurisdictional Authorization</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicinalProductAuthorizationJurisdictionalAuthorization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Authorization in areas within a country.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jurisdictional Authorization</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductAuthorization_JurisdictionalAuthorization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='jurisdictionalAuthorization' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicinalProductAuthorizationJurisdictionalAuthorization> getJurisdictionalAuthorization();

	/**
	 * Returns the value of the '<em><b>Holder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Marketing Authorization Holder.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Holder</em>' containment reference.
	 * @see #setHolder(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductAuthorization_Holder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='holder' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getHolder();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductAuthorization#getHolder <em>Holder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Holder</em>' containment reference.
	 * @see #getHolder()
	 * @generated
	 */
	void setHolder(Reference value);

	/**
	 * Returns the value of the '<em><b>Regulator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Medicines Regulatory Agency.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Regulator</em>' containment reference.
	 * @see #setRegulator(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductAuthorization_Regulator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='regulator' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRegulator();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductAuthorization#getRegulator <em>Regulator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regulator</em>' containment reference.
	 * @see #getRegulator()
	 * @generated
	 */
	void setRegulator(Reference value);

	/**
	 * Returns the value of the '<em><b>Procedure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The regulatory procedure for granting or amending a marketing authorization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Procedure</em>' containment reference.
	 * @see #setProcedure(MedicinalProductAuthorizationProcedure)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductAuthorization_Procedure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='procedure' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicinalProductAuthorizationProcedure getProcedure();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductAuthorization#getProcedure <em>Procedure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedure</em>' containment reference.
	 * @see #getProcedure()
	 * @generated
	 */
	void setProcedure(MedicinalProductAuthorizationProcedure value);

} // MedicinalProductAuthorization
