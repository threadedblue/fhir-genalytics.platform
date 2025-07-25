/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Property</b></em>'.
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
 *   <li>{@link org.hl7.fhir.DeviceProperty#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceProperty#getValueQuantity <em>Value Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceProperty#getValueCode <em>Value Code</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDeviceProperty()
 * @model extendedMetaData="name='Device.Property' kind='elementOnly'"
 * @generated
 */
public interface DeviceProperty extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code that specifies the property DeviceDefinitionPropetyCode (Extensible).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getDeviceProperty_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceProperty#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Value Quantity</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Quantity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Property value as a quantity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Quantity</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDeviceProperty_ValueQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Quantity> getValueQuantity();

	/**
	 * Returns the value of the '<em><b>Value Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Property value as a code, e.g., NTP4 (synced to NTP).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Code</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDeviceProperty_ValueCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueCode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getValueCode();

} // DeviceProperty
