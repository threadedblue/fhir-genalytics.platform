/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Immunization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the event of a patient being administered a vaccine or a record of an immunization as reported by a patient, a clinician or another party.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Immunization#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getStatusReason <em>Status Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getVaccineCode <em>Vaccine Code</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getOccurrenceDateTime <em>Occurrence Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getOccurrenceString <em>Occurrence String</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getRecorded <em>Recorded</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getPrimarySource <em>Primary Source</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getReportOrigin <em>Report Origin</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getLotNumber <em>Lot Number</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getSite <em>Site</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getRoute <em>Route</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getDoseQuantity <em>Dose Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getReasonCode <em>Reason Code</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getReasonReference <em>Reason Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getIsSubpotent <em>Is Subpotent</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getSubpotentReason <em>Subpotent Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getEducation <em>Education</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getProgramEligibility <em>Program Eligibility</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getFundingSource <em>Funding Source</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getReaction <em>Reaction</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getProtocolApplied <em>Protocol Applied</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getImmunization()
 * @model extendedMetaData="name='Immunization' kind='elementOnly'"
 * @generated
 */
public interface Immunization extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier assigned to this immunization record.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImmunization_Identifier()
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
	 * Indicates the current status of the immunization event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(ImmunizationStatusCodes)
	 * @see org.hl7.fhir.FhirPackage#getImmunization_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	ImmunizationStatusCodes getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Immunization#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ImmunizationStatusCodes value);

	/**
	 * Returns the value of the '<em><b>Status Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the reason the immunization event was not performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Reason</em>' containment reference.
	 * @see #setStatusReason(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getImmunization_StatusReason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='statusReason' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getStatusReason();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Immunization#getStatusReason <em>Status Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Reason</em>' containment reference.
	 * @see #getStatusReason()
	 * @generated
	 */
	void setStatusReason(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Vaccine Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vaccine that was administered or was to be administered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vaccine Code</em>' containment reference.
	 * @see #setVaccineCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getImmunization_VaccineCode()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='vaccineCode' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getVaccineCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Immunization#getVaccineCode <em>Vaccine Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vaccine Code</em>' containment reference.
	 * @see #getVaccineCode()
	 * @generated
	 */
	void setVaccineCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The patient who either received or did not receive the immunization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see org.hl7.fhir.FhirPackage#getImmunization_Patient()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Immunization#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The visit or admission or other contact between patient and health care provider the immunization was performed as part of.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getImmunization_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Immunization#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Occurrence Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date vaccine administered or was to be administered. (choose any one of occurrence*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occurrence Date Time</em>' containment reference.
	 * @see #setOccurrenceDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getImmunization_OccurrenceDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='occurrenceDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getOccurrenceDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Immunization#getOccurrenceDateTime <em>Occurrence Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence Date Time</em>' containment reference.
	 * @see #getOccurrenceDateTime()
	 * @generated
	 */
	void setOccurrenceDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Occurrence String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date vaccine administered or was to be administered. (choose any one of occurrence*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occurrence String</em>' containment reference.
	 * @see #setOccurrenceString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getImmunization_OccurrenceString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='occurrenceString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getOccurrenceString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Immunization#getOccurrenceString <em>Occurrence String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence String</em>' containment reference.
	 * @see #getOccurrenceString()
	 * @generated
	 */
	void setOccurrenceString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Recorded</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date the occurrence of the immunization was first captured in the record - potentially significantly after the occurrence of the event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recorded</em>' containment reference.
	 * @see #setRecorded(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getImmunization_Recorded()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='recorded' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getRecorded();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Immunization#getRecorded <em>Recorded</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorded</em>' containment reference.
	 * @see #getRecorded()
	 * @generated
	 */
	void setRecorded(DateTime value);

	/**
	 * Returns the value of the '<em><b>Primary Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An indication that the content of the record is based on information from the person who administered the vaccine. This reflects the context under which the data was originally recorded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Primary Source</em>' containment reference.
	 * @see #setPrimarySource(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getImmunization_PrimarySource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='primarySource' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getPrimarySource();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Immunization#getPrimarySource <em>Primary Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Source</em>' containment reference.
	 * @see #getPrimarySource()
	 * @generated
	 */
	void setPrimarySource(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Report Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source of the data when the report of the immunization event is not based on information from the person who administered the vaccine.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Report Origin</em>' containment reference.
	 * @see #setReportOrigin(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getImmunization_ReportOrigin()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reportOrigin' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getReportOrigin();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Immunization#getReportOrigin <em>Report Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Report Origin</em>' containment reference.
	 * @see #getReportOrigin()
	 * @generated
	 */
	void setReportOrigin(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The service delivery location where the vaccine administration occurred.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Reference)
	 * @see org.hl7.fhir.FhirPackage#getImmunization_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getLocation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Immunization#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Reference value);

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of vaccine manufacturer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer</em>' containment reference.
	 * @see #setManufacturer(Reference)
	 * @see org.hl7.fhir.FhirPackage#getImmunization_Manufacturer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='manufacturer' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getManufacturer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Immunization#getManufacturer <em>Manufacturer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' containment reference.
	 * @see #getManufacturer()
	 * @generated
	 */
	void setManufacturer(Reference value);

	/**
	 * Returns the value of the '<em><b>Lot Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lot number of the  vaccine product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lot Number</em>' containment reference.
	 * @see #setLotNumber(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getImmunization_LotNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lotNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getLotNumber();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Immunization#getLotNumber <em>Lot Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lot Number</em>' containment reference.
	 * @see #getLotNumber()
	 * @generated
	 */
	void setLotNumber(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Expiration Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date vaccine batch expires.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expiration Date</em>' containment reference.
	 * @see #setExpirationDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getImmunization_ExpirationDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='expirationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getExpirationDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Immunization#getExpirationDate <em>Expiration Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration Date</em>' containment reference.
	 * @see #getExpirationDate()
	 * @generated
	 */
	void setExpirationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Body site where vaccine was administered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Site</em>' containment reference.
	 * @see #setSite(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getImmunization_Site()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='site' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSite();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Immunization#getSite <em>Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site</em>' containment reference.
	 * @see #getSite()
	 * @generated
	 */
	void setSite(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The path by which the vaccine product is taken into the body.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route</em>' containment reference.
	 * @see #setRoute(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getImmunization_Route()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='route' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRoute();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Immunization#getRoute <em>Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route</em>' containment reference.
	 * @see #getRoute()
	 * @generated
	 */
	void setRoute(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The quantity of vaccine product that was administered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dose Quantity</em>' containment reference.
	 * @see #setDoseQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getImmunization_DoseQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='doseQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getDoseQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Immunization#getDoseQuantity <em>Dose Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dose Quantity</em>' containment reference.
	 * @see #getDoseQuantity()
	 * @generated
	 */
	void setDoseQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ImmunizationPerformer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates who performed the immunization event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImmunization_Performer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImmunizationPerformer> getPerformer();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Extra information about the immunization that is not conveyed by the other attributes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImmunization_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

	/**
	 * Returns the value of the '<em><b>Reason Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reasons why the vaccine was administered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason Code</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImmunization_ReasonCode()
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
	 * Condition, Observation or DiagnosticReport that supports why the immunization was administered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason Reference</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImmunization_ReasonReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reasonReference' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getReasonReference();

	/**
	 * Returns the value of the '<em><b>Is Subpotent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indication if a dose is considered to be subpotent. By default, a dose should be considered to be potent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Subpotent</em>' containment reference.
	 * @see #setIsSubpotent(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getImmunization_IsSubpotent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='isSubpotent' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getIsSubpotent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Immunization#getIsSubpotent <em>Is Subpotent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Subpotent</em>' containment reference.
	 * @see #getIsSubpotent()
	 * @generated
	 */
	void setIsSubpotent(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Subpotent Reason</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reason why a dose is considered to be subpotent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subpotent Reason</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImmunization_SubpotentReason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subpotentReason' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getSubpotentReason();

	/**
	 * Returns the value of the '<em><b>Education</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ImmunizationEducation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Educational material presented to the patient (or guardian) at the time of vaccine administration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Education</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImmunization_Education()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='education' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImmunizationEducation> getEducation();

	/**
	 * Returns the value of the '<em><b>Program Eligibility</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates a patient's eligibility for a funding program.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program Eligibility</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImmunization_ProgramEligibility()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='programEligibility' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getProgramEligibility();

	/**
	 * Returns the value of the '<em><b>Funding Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the source of the vaccine actually administered. This may be different than the patient eligibility (e.g. the patient may be eligible for a publically purchased vaccine but due to inventory issues, vaccine purchased with private funds was actually administered).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Funding Source</em>' containment reference.
	 * @see #setFundingSource(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getImmunization_FundingSource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fundingSource' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getFundingSource();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Immunization#getFundingSource <em>Funding Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Funding Source</em>' containment reference.
	 * @see #getFundingSource()
	 * @generated
	 */
	void setFundingSource(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Reaction</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ImmunizationReaction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Categorical data indicating that an adverse event is associated in time to an immunization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reaction</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImmunization_Reaction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reaction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImmunizationReaction> getReaction();

	/**
	 * Returns the value of the '<em><b>Protocol Applied</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ImmunizationProtocolApplied}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The protocol (set of recommendations) being followed by the provider who administered the dose.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol Applied</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImmunization_ProtocolApplied()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='protocolApplied' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImmunizationProtocolApplied> getProtocolApplied();

} // Immunization
