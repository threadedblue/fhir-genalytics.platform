/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of a healthcare consumer’s  choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Consent#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getScope <em>Scope</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getSourceAttachment <em>Source Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getSourceReference <em>Source Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getPolicyRule <em>Policy Rule</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getVerification <em>Verification</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getProvision <em>Provision</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getConsent()
 * @model extendedMetaData="name='Consent' kind='elementOnly'"
 * @generated
 */
public interface Consent extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique identifier for this copy of the Consent Statement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsent_Identifier()
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
	 * Indicates the current state of this consent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(ConsentState)
	 * @see org.hl7.fhir.FhirPackage#getConsent_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	ConsentState getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Consent#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ConsentState value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A selector of the type of consent being presented: ADR, Privacy, Treatment, Research.  This list is now extensible.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scope</em>' containment reference.
	 * @see #setScope(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getConsent_Scope()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='scope' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getScope();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Consent#getScope <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' containment reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A classification of the type of consents found in the statement. This element supports indexing and retrieval of consent statements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsent_Category()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCategory();

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The patient/healthcare consumer to whom this consent applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see org.hl7.fhir.FhirPackage#getConsent_Patient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Consent#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When this  Consent was issued / created / indexed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Time</em>' containment reference.
	 * @see #setDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getConsent_DateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Consent#getDateTime <em>Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time</em>' containment reference.
	 * @see #getDateTime()
	 * @generated
	 */
	void setDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Either the Grantor, which is the entity responsible for granting the rights listed in a Consent Directive or the Grantee, which is the entity responsible for complying with the Consent Directive, including any obligations or limitations on authorizations and enforcement of prohibitions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsent_Performer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getPerformer();

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization that manages the consent, and the framework within which it is executed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsent_Organization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organization' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getOrganization();

	/**
	 * Returns the value of the '<em><b>Source Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source on which this consent statement is based. The source might be a scanned original paper form, or a reference to a consent that links back to such a source, a reference to a document repository (e.g. XDS) that stores the original consent document. (choose any one of source*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Attachment</em>' containment reference.
	 * @see #setSourceAttachment(Attachment)
	 * @see org.hl7.fhir.FhirPackage#getConsent_SourceAttachment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getSourceAttachment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Consent#getSourceAttachment <em>Source Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Attachment</em>' containment reference.
	 * @see #getSourceAttachment()
	 * @generated
	 */
	void setSourceAttachment(Attachment value);

	/**
	 * Returns the value of the '<em><b>Source Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source on which this consent statement is based. The source might be a scanned original paper form, or a reference to a consent that links back to such a source, a reference to a document repository (e.g. XDS) that stores the original consent document. (choose any one of source*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Reference</em>' containment reference.
	 * @see #setSourceReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getConsent_SourceReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSourceReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Consent#getSourceReference <em>Source Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Reference</em>' containment reference.
	 * @see #getSourceReference()
	 * @generated
	 */
	void setSourceReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Policy</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ConsentPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The references to the policies that are included in this consent scope. Policies may be organizational, but are often defined jurisdictionally, or in law.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Policy</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsent_Policy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='policy' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConsentPolicy> getPolicy();

	/**
	 * Returns the value of the '<em><b>Policy Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the specific base computable regulation or policy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Policy Rule</em>' containment reference.
	 * @see #setPolicyRule(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getConsent_PolicyRule()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='policyRule' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getPolicyRule();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Consent#getPolicyRule <em>Policy Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Rule</em>' containment reference.
	 * @see #getPolicyRule()
	 * @generated
	 */
	void setPolicyRule(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Verification</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ConsentVerification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether a treatment instruction (e.g. artificial respiration yes or no) was verified with the patient, his/her family or another authorized person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verification</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsent_Verification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='verification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConsentVerification> getVerification();

	/**
	 * Returns the value of the '<em><b>Provision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An exception to the base policy of this consent. An exception can be an addition or removal of access permissions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provision</em>' containment reference.
	 * @see #setProvision(ConsentProvision)
	 * @see org.hl7.fhir.FhirPackage#getConsent_Provision()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='provision' namespace='##targetNamespace'"
	 * @generated
	 */
	ConsentProvision getProvision();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Consent#getProvision <em>Provision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provision</em>' containment reference.
	 * @see #getProvision()
	 * @generated
	 */
	void setProvision(ConsentProvision value);

} // Consent
