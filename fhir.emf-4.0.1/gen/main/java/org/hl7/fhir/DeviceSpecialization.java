/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Specialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A type of a manufactured item that is used in the provision of healthcare without being substantially changed through that activity. The device may be a medical or non-medical device.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.DeviceSpecialization#getSystemType <em>System Type</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceSpecialization#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDeviceSpecialization()
 * @model extendedMetaData="name='Device.Specialization' kind='elementOnly'"
 * @generated
 */
public interface DeviceSpecialization extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>System Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The standard that is used to operate and communicate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Type</em>' containment reference.
	 * @see #setSystemType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getDeviceSpecialization_SystemType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='systemType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSystemType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceSpecialization#getSystemType <em>System Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Type</em>' containment reference.
	 * @see #getSystemType()
	 * @generated
	 */
	void setSystemType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version of the standard that is used to operate and communicate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getDeviceSpecialization_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getVersion();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceSpecialization#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(org.hl7.fhir.String value);

} // DeviceSpecialization
