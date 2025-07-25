/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Record details about an anatomical structure.  This resource may be used when a coded concept does not provide the necessary detail needed for the use case.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.BodyStructure#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.BodyStructure#getActive <em>Active</em>}</li>
 *   <li>{@link org.hl7.fhir.BodyStructure#getMorphology <em>Morphology</em>}</li>
 *   <li>{@link org.hl7.fhir.BodyStructure#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.BodyStructure#getLocationQualifier <em>Location Qualifier</em>}</li>
 *   <li>{@link org.hl7.fhir.BodyStructure#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.BodyStructure#getImage <em>Image</em>}</li>
 *   <li>{@link org.hl7.fhir.BodyStructure#getPatient <em>Patient</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getBodyStructure()
 * @model extendedMetaData="name='BodyStructure' kind='elementOnly'"
 * @generated
 */
public interface BodyStructure extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier for this instance of the anatomical structure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getBodyStructure_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether this body site is in active use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active</em>' containment reference.
	 * @see #setActive(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getBodyStructure_Active()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='active' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getActive();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BodyStructure#getActive <em>Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' containment reference.
	 * @see #getActive()
	 * @generated
	 */
	void setActive(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Morphology</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The kind of structure being represented by the body structure at `BodyStructure.location`.  This can define both normal and abnormal morphologies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Morphology</em>' containment reference.
	 * @see #setMorphology(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getBodyStructure_Morphology()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='morphology' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getMorphology();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BodyStructure#getMorphology <em>Morphology</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Morphology</em>' containment reference.
	 * @see #getMorphology()
	 * @generated
	 */
	void setMorphology(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The anatomical location or region of the specimen, lesion, or body structure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getBodyStructure_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getLocation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BodyStructure#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Location Qualifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Qualifier to refine the anatomical location.  These include qualifiers for laterality, relative location, directionality, number, and plane.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Qualifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getBodyStructure_LocationQualifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='locationQualifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getLocationQualifier();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A summary, characterization or explanation of the body structure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getBodyStructure_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BodyStructure#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Attachment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Image or images used to identify a location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getBodyStructure_Image()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='image' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Attachment> getImage();

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person to which the body site belongs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see org.hl7.fhir.FhirPackage#getBodyStructure_Patient()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BodyStructure#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

} // BodyStructure
