/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Udi Carrier</b></em>'.
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
 *   <li>{@link org.hl7.fhir.DeviceUdiCarrier#getDeviceIdentifier <em>Device Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceUdiCarrier#getIssuer <em>Issuer</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceUdiCarrier#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceUdiCarrier#getCarrierAIDC <em>Carrier AIDC</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceUdiCarrier#getCarrierHRF <em>Carrier HRF</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceUdiCarrier#getEntryType <em>Entry Type</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDeviceUdiCarrier()
 * @model extendedMetaData="name='Device.UdiCarrier' kind='elementOnly'"
 * @generated
 */
public interface DeviceUdiCarrier extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Device Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The device identifier (DI) is a mandatory, fixed portion of a UDI that identifies the labeler and the specific version or model of a device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Identifier</em>' containment reference.
	 * @see #setDeviceIdentifier(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getDeviceUdiCarrier_DeviceIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deviceIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDeviceIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceUdiCarrier#getDeviceIdentifier <em>Device Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Identifier</em>' containment reference.
	 * @see #getDeviceIdentifier()
	 * @generated
	 */
	void setDeviceIdentifier(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Issuer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Organization that is charged with issuing UDIs for devices.  For example, the US FDA issuers include :
	 * 1) GS1: 
	 * http://hl7.org/fhir/NamingSystem/gs1-di, 
	 * 2) HIBCC:
	 * http://hl7.org/fhir/NamingSystem/hibcc-dI, 
	 * 3) ICCBBA for blood containers:
	 * http://hl7.org/fhir/NamingSystem/iccbba-blood-di, 
	 * 4) ICCBA for other devices:
	 * http://hl7.org/fhir/NamingSystem/iccbba-other-di.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issuer</em>' containment reference.
	 * @see #setIssuer(Uri)
	 * @see org.hl7.fhir.FhirPackage#getDeviceUdiCarrier_Issuer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='issuer' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getIssuer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceUdiCarrier#getIssuer <em>Issuer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issuer</em>' containment reference.
	 * @see #getIssuer()
	 * @generated
	 */
	void setIssuer(Uri value);

	/**
	 * Returns the value of the '<em><b>Jurisdiction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identity of the authoritative source for UDI generation within a  jurisdiction.  All UDIs are globally unique within a single namespace with the appropriate repository uri as the system.  For example,  UDIs of devices managed in the U.S. by the FDA, the value is  http://hl7.org/fhir/NamingSystem/fda-udi.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jurisdiction</em>' containment reference.
	 * @see #setJurisdiction(Uri)
	 * @see org.hl7.fhir.FhirPackage#getDeviceUdiCarrier_Jurisdiction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='jurisdiction' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getJurisdiction();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceUdiCarrier#getJurisdiction <em>Jurisdiction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jurisdiction</em>' containment reference.
	 * @see #getJurisdiction()
	 * @generated
	 */
	void setJurisdiction(Uri value);

	/**
	 * Returns the value of the '<em><b>Carrier AIDC</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The full UDI carrier of the Automatic Identification and Data Capture (AIDC) technology representation of the barcode string as printed on the packaging of the device - e.g., a barcode or RFID.   Because of limitations on character sets in XML and the need to round-trip JSON data through XML, AIDC Formats *SHALL* be base64 encoded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Carrier AIDC</em>' containment reference.
	 * @see #setCarrierAIDC(Base64Binary)
	 * @see org.hl7.fhir.FhirPackage#getDeviceUdiCarrier_CarrierAIDC()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='carrierAIDC' namespace='##targetNamespace'"
	 * @generated
	 */
	Base64Binary getCarrierAIDC();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceUdiCarrier#getCarrierAIDC <em>Carrier AIDC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier AIDC</em>' containment reference.
	 * @see #getCarrierAIDC()
	 * @generated
	 */
	void setCarrierAIDC(Base64Binary value);

	/**
	 * Returns the value of the '<em><b>Carrier HRF</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The full UDI carrier as the human readable form (HRF) representation of the barcode string as printed on the packaging of the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Carrier HRF</em>' containment reference.
	 * @see #setCarrierHRF(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getDeviceUdiCarrier_CarrierHRF()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='carrierHRF' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getCarrierHRF();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceUdiCarrier#getCarrierHRF <em>Carrier HRF</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier HRF</em>' containment reference.
	 * @see #getCarrierHRF()
	 * @generated
	 */
	void setCarrierHRF(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Entry Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A coded entry to indicate how the data was entered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entry Type</em>' containment reference.
	 * @see #setEntryType(UDIEntryType)
	 * @see org.hl7.fhir.FhirPackage#getDeviceUdiCarrier_EntryType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='entryType' namespace='##targetNamespace'"
	 * @generated
	 */
	UDIEntryType getEntryType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceUdiCarrier#getEntryType <em>Entry Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Type</em>' containment reference.
	 * @see #getEntryType()
	 * @generated
	 */
	void setEntryType(UDIEntryType value);

} // DeviceUdiCarrier
