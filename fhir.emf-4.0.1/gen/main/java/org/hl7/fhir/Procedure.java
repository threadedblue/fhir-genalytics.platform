/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An action that is or was performed on or for a patient. This can be a physical intervention like an operation, or less invasive like long term services, counseling, or hypnotherapy.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Procedure#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getInstantiatesCanonical <em>Instantiates Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getInstantiatesUri <em>Instantiates Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getStatusReason <em>Status Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getPerformedDateTime <em>Performed Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getPerformedPeriod <em>Performed Period</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getPerformedString <em>Performed String</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getPerformedAge <em>Performed Age</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getPerformedRange <em>Performed Range</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getRecorder <em>Recorder</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getAsserter <em>Asserter</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getReasonCode <em>Reason Code</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getReasonReference <em>Reason Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getReport <em>Report</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getComplication <em>Complication</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getComplicationDetail <em>Complication Detail</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getFollowUp <em>Follow Up</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getFocalDevice <em>Focal Device</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getUsedReference <em>Used Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.Procedure#getUsedCode <em>Used Code</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getProcedure()
 * @model extendedMetaData="name='Procedure' kind='elementOnly'"
 * @generated
 */
public interface Procedure extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Business identifiers assigned to this procedure by the performer or other systems which remain constant as the resource is updated and is propagated from server to server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcedure_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Instantiates Canonical</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Canonical}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URL pointing to a FHIR-defined protocol, guideline, order set or other definition that is adhered to in whole or in part by this Procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instantiates Canonical</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcedure_InstantiatesCanonical()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instantiatesCanonical' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Canonical> getInstantiatesCanonical();

	/**
	 * Returns the value of the '<em><b>Instantiates Uri</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Uri}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URL pointing to an externally maintained protocol, guideline, order set or other definition that is adhered to in whole or in part by this Procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instantiates Uri</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcedure_InstantiatesUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instantiatesUri' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Uri> getInstantiatesUri();

	/**
	 * Returns the value of the '<em><b>Based On</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a resource that contains details of the request for this procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Based On</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcedure_BasedOn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='basedOn' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getBasedOn();

	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A larger event of which this particular procedure is a component or step.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part Of</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcedure_PartOf()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='partOf' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getPartOf();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code specifying the state of the procedure. Generally, this will be the in-progress or completed state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(EventStatus)
	 * @see org.hl7.fhir.FhirPackage#getProcedure_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	EventStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Procedure#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(EventStatus value);

	/**
	 * Returns the value of the '<em><b>Status Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Captures the reason for the current state of the procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Reason</em>' containment reference.
	 * @see #setStatusReason(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getProcedure_StatusReason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='statusReason' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getStatusReason();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Procedure#getStatusReason <em>Status Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Reason</em>' containment reference.
	 * @see #getStatusReason()
	 * @generated
	 */
	void setStatusReason(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code that classifies the procedure for searching, sorting and display purposes (e.g. "Surgical Procedure").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference.
	 * @see #setCategory(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getProcedure_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCategory();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Procedure#getCategory <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' containment reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specific procedure that is performed. Use text if the exact nature of the procedure cannot be coded (e.g. "Laparoscopic Appendectomy").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getProcedure_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Procedure#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person, animal or group on which the procedure was performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProcedure_Subject()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Procedure#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Encounter during which this Procedure was created or performed or to which the creation of this record is tightly associated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProcedure_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Procedure#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Performed Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Estimated or actual date, date-time, period, or age when the procedure was performed.  Allows a period to support complex procedures that span more than one date, and also allows for the length of the procedure to be captured. (choose any one of performed*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performed Date Time</em>' containment reference.
	 * @see #setPerformedDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getProcedure_PerformedDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performedDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getPerformedDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Procedure#getPerformedDateTime <em>Performed Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performed Date Time</em>' containment reference.
	 * @see #getPerformedDateTime()
	 * @generated
	 */
	void setPerformedDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Performed Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Estimated or actual date, date-time, period, or age when the procedure was performed.  Allows a period to support complex procedures that span more than one date, and also allows for the length of the procedure to be captured. (choose any one of performed*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performed Period</em>' containment reference.
	 * @see #setPerformedPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getProcedure_PerformedPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performedPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPerformedPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Procedure#getPerformedPeriod <em>Performed Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performed Period</em>' containment reference.
	 * @see #getPerformedPeriod()
	 * @generated
	 */
	void setPerformedPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Performed String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Estimated or actual date, date-time, period, or age when the procedure was performed.  Allows a period to support complex procedures that span more than one date, and also allows for the length of the procedure to be captured. (choose any one of performed*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performed String</em>' containment reference.
	 * @see #setPerformedString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getProcedure_PerformedString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performedString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPerformedString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Procedure#getPerformedString <em>Performed String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performed String</em>' containment reference.
	 * @see #getPerformedString()
	 * @generated
	 */
	void setPerformedString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Performed Age</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Estimated or actual date, date-time, period, or age when the procedure was performed.  Allows a period to support complex procedures that span more than one date, and also allows for the length of the procedure to be captured. (choose any one of performed*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performed Age</em>' containment reference.
	 * @see #setPerformedAge(Age)
	 * @see org.hl7.fhir.FhirPackage#getProcedure_PerformedAge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performedAge' namespace='##targetNamespace'"
	 * @generated
	 */
	Age getPerformedAge();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Procedure#getPerformedAge <em>Performed Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performed Age</em>' containment reference.
	 * @see #getPerformedAge()
	 * @generated
	 */
	void setPerformedAge(Age value);

	/**
	 * Returns the value of the '<em><b>Performed Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Estimated or actual date, date-time, period, or age when the procedure was performed.  Allows a period to support complex procedures that span more than one date, and also allows for the length of the procedure to be captured. (choose any one of performed*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performed Range</em>' containment reference.
	 * @see #setPerformedRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getProcedure_PerformedRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performedRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getPerformedRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Procedure#getPerformedRange <em>Performed Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performed Range</em>' containment reference.
	 * @see #getPerformedRange()
	 * @generated
	 */
	void setPerformedRange(Range value);

	/**
	 * Returns the value of the '<em><b>Recorder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Individual who recorded the record and takes responsibility for its content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recorder</em>' containment reference.
	 * @see #setRecorder(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProcedure_Recorder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='recorder' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRecorder();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Procedure#getRecorder <em>Recorder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorder</em>' containment reference.
	 * @see #getRecorder()
	 * @generated
	 */
	void setRecorder(Reference value);

	/**
	 * Returns the value of the '<em><b>Asserter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Individual who is making the procedure statement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Asserter</em>' containment reference.
	 * @see #setAsserter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProcedure_Asserter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='asserter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAsserter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Procedure#getAsserter <em>Asserter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asserter</em>' containment reference.
	 * @see #getAsserter()
	 * @generated
	 */
	void setAsserter(Reference value);

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ProcedurePerformer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Limited to "real" people rather than equipment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcedure_Performer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProcedurePerformer> getPerformer();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The location where the procedure actually happened.  E.g. a newborn at home, a tracheostomy at a restaurant.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProcedure_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getLocation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Procedure#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Reference value);

	/**
	 * Returns the value of the '<em><b>Reason Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The coded reason why the procedure was performed. This may be a coded entity of some type, or may simply be present as text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason Code</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcedure_ReasonCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reasonCode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getReasonCode();

	/**
	 * Returns the value of the '<em><b>Reason Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The justification of why the procedure was performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason Reference</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcedure_ReasonReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reasonReference' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getReasonReference();

	/**
	 * Returns the value of the '<em><b>Body Site</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Detailed and structured anatomical location information. Multiple locations are allowed - e.g. multiple punch biopsies of a lesion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Site</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcedure_BodySite()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bodySite' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getBodySite();

	/**
	 * Returns the value of the '<em><b>Outcome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The outcome of the procedure - did it resolve the reasons for the procedure being performed?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outcome</em>' containment reference.
	 * @see #setOutcome(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getProcedure_Outcome()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outcome' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getOutcome();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Procedure#getOutcome <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcome</em>' containment reference.
	 * @see #getOutcome()
	 * @generated
	 */
	void setOutcome(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Report</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This could be a histology result, pathology report, surgical report, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Report</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcedure_Report()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='report' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getReport();

	/**
	 * Returns the value of the '<em><b>Complication</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any complications that occurred during the procedure, or in the immediate post-performance period. These are generally tracked separately from the notes, which will typically describe the procedure itself rather than any 'post procedure' issues.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Complication</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcedure_Complication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='complication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getComplication();

	/**
	 * Returns the value of the '<em><b>Complication Detail</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any complications that occurred during the procedure, or in the immediate post-performance period.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Complication Detail</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcedure_ComplicationDetail()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='complicationDetail' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getComplicationDetail();

	/**
	 * Returns the value of the '<em><b>Follow Up</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the procedure required specific follow up - e.g. removal of sutures. The follow up may be represented as a simple note or could potentially be more complex, in which case the CarePlan resource can be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Follow Up</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcedure_FollowUp()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='followUp' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getFollowUp();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any other notes and comments about the procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcedure_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

	/**
	 * Returns the value of the '<em><b>Focal Device</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ProcedureFocalDevice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A device that is implanted, removed or otherwise manipulated (calibration, battery replacement, fitting a prosthesis, attaching a wound-vac, etc.) as a focal portion of the Procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Focal Device</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcedure_FocalDevice()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='focalDevice' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProcedureFocalDevice> getFocalDevice();

	/**
	 * Returns the value of the '<em><b>Used Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies medications, devices and any other substance used as part of the procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Used Reference</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcedure_UsedReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='usedReference' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getUsedReference();

	/**
	 * Returns the value of the '<em><b>Used Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies coded items that were used as part of the procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Used Code</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcedure_UsedCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='usedCode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getUsedCode();

} // Procedure
