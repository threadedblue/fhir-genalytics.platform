/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vision Prescription</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An authorization for the provision of glasses and/or contact lenses to a patient.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.VisionPrescription#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.VisionPrescription#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.VisionPrescription#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.VisionPrescription#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.VisionPrescription#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.VisionPrescription#getDateWritten <em>Date Written</em>}</li>
 *   <li>{@link org.hl7.fhir.VisionPrescription#getPrescriber <em>Prescriber</em>}</li>
 *   <li>{@link org.hl7.fhir.VisionPrescription#getLensSpecification <em>Lens Specification</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getVisionPrescription()
 * @model extendedMetaData="name='VisionPrescription' kind='elementOnly'"
 * @generated
 */
public interface VisionPrescription extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier assigned to this vision prescription.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getVisionPrescription_Identifier()
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
	 * The status of the resource instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(FinancialResourceStatusCodes)
	 * @see org.hl7.fhir.FhirPackage#getVisionPrescription_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	FinancialResourceStatusCodes getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VisionPrescription#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(FinancialResourceStatusCodes value);

	/**
	 * Returns the value of the '<em><b>Created</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date this resource was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Created</em>' containment reference.
	 * @see #setCreated(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getVisionPrescription_Created()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='created' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getCreated();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VisionPrescription#getCreated <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' containment reference.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(DateTime value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A resource reference to the person to whom the vision prescription applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see org.hl7.fhir.FhirPackage#getVisionPrescription_Patient()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VisionPrescription#getPatient <em>Patient</em>}' containment reference.
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
	 * A reference to a resource that identifies the particular occurrence of contact between patient and health care provider during which the prescription was issued.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getVisionPrescription_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VisionPrescription#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Date Written</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date (and perhaps time) when the prescription was written.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Written</em>' containment reference.
	 * @see #setDateWritten(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getVisionPrescription_DateWritten()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dateWritten' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDateWritten();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VisionPrescription#getDateWritten <em>Date Written</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Written</em>' containment reference.
	 * @see #getDateWritten()
	 * @generated
	 */
	void setDateWritten(DateTime value);

	/**
	 * Returns the value of the '<em><b>Prescriber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The healthcare professional responsible for authorizing the prescription.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prescriber</em>' containment reference.
	 * @see #setPrescriber(Reference)
	 * @see org.hl7.fhir.FhirPackage#getVisionPrescription_Prescriber()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='prescriber' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPrescriber();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VisionPrescription#getPrescriber <em>Prescriber</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prescriber</em>' containment reference.
	 * @see #getPrescriber()
	 * @generated
	 */
	void setPrescriber(Reference value);

	/**
	 * Returns the value of the '<em><b>Lens Specification</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.VisionPrescriptionLensSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contain the details of  the individual lens specifications and serves as the authorization for the fullfillment by certified professionals.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lens Specification</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getVisionPrescription_LensSpecification()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='lensSpecification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VisionPrescriptionLensSpecification> getLensSpecification();

} // VisionPrescription
