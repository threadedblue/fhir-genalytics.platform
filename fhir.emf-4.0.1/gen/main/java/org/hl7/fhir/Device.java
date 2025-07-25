/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A type of a manufactured item that is used in the provision of healthcare without being substantially changed through that activity. The device may be a medical or non-medical device.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Device#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getUdiCarrier <em>Udi Carrier</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getStatusReason <em>Status Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getDistinctIdentifier <em>Distinct Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getManufactureDate <em>Manufacture Date</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getLotNumber <em>Lot Number</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getModelNumber <em>Model Number</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getPartNumber <em>Part Number</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getProperty <em>Property</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getSafety <em>Safety</em>}</li>
 *   <li>{@link org.hl7.fhir.Device#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDevice()
 * @model extendedMetaData="name='Device' kind='elementOnly'"
 * @generated
 */
public interface Device extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique instance identifiers assigned to a device by manufacturers other organizations or owners.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDevice_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reference to the definition for the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDevice_Definition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definition' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(Reference value);

	/**
	 * Returns the value of the '<em><b>Udi Carrier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DeviceUdiCarrier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique device identifier (UDI) assigned to device label or package.  Note that the Device may include multiple udiCarriers as it either may include just the udiCarrier for the jurisdiction it is sold, or for multiple jurisdictions it could have been sold.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Udi Carrier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDevice_UdiCarrier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='udiCarrier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeviceUdiCarrier> getUdiCarrier();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Status of the Device availability.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(FHIRDeviceStatus)
	 * @see org.hl7.fhir.FhirPackage#getDevice_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	FHIRDeviceStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(FHIRDeviceStatus value);

	/**
	 * Returns the value of the '<em><b>Status Reason</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reason for the dtatus of the Device availability.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Reason</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDevice_StatusReason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='statusReason' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getStatusReason();

	/**
	 * Returns the value of the '<em><b>Distinct Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The distinct identification string as required by regulation for a human cell, tissue, or cellular and tissue-based product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Distinct Identifier</em>' containment reference.
	 * @see #setDistinctIdentifier(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getDevice_DistinctIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='distinctIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDistinctIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getDistinctIdentifier <em>Distinct Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distinct Identifier</em>' containment reference.
	 * @see #getDistinctIdentifier()
	 * @generated
	 */
	void setDistinctIdentifier(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of the manufacturer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer</em>' containment reference.
	 * @see #setManufacturer(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getDevice_Manufacturer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='manufacturer' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getManufacturer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getManufacturer <em>Manufacturer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' containment reference.
	 * @see #getManufacturer()
	 * @generated
	 */
	void setManufacturer(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Manufacture Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date and time when the device was manufactured.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacture Date</em>' containment reference.
	 * @see #setManufactureDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getDevice_ManufactureDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='manufactureDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getManufactureDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getManufactureDate <em>Manufacture Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacture Date</em>' containment reference.
	 * @see #getManufactureDate()
	 * @generated
	 */
	void setManufactureDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Expiration Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date and time beyond which this device is no longer valid or should not be used (if applicable).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expiration Date</em>' containment reference.
	 * @see #setExpirationDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getDevice_ExpirationDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='expirationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getExpirationDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getExpirationDate <em>Expiration Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration Date</em>' containment reference.
	 * @see #getExpirationDate()
	 * @generated
	 */
	void setExpirationDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Lot Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lot number assigned by the manufacturer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lot Number</em>' containment reference.
	 * @see #setLotNumber(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getDevice_LotNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lotNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getLotNumber();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getLotNumber <em>Lot Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lot Number</em>' containment reference.
	 * @see #getLotNumber()
	 * @generated
	 */
	void setLotNumber(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Serial Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The serial number assigned by the organization when the device was manufactured.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Serial Number</em>' containment reference.
	 * @see #setSerialNumber(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getDevice_SerialNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='serialNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSerialNumber();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getSerialNumber <em>Serial Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serial Number</em>' containment reference.
	 * @see #getSerialNumber()
	 * @generated
	 */
	void setSerialNumber(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Device Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DeviceDeviceName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This represents the manufacturer's name of the device as provided by the device, from a UDI label, or by a person describing the Device.  This typically would be used when a person provides the name(s) or when the device represents one of the names available from DeviceDefinition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Name</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDevice_DeviceName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deviceName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeviceDeviceName> getDeviceName();

	/**
	 * Returns the value of the '<em><b>Model Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The model number for the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Number</em>' containment reference.
	 * @see #setModelNumber(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getDevice_ModelNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modelNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getModelNumber();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getModelNumber <em>Model Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Number</em>' containment reference.
	 * @see #getModelNumber()
	 * @generated
	 */
	void setModelNumber(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Part Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The part number of the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part Number</em>' containment reference.
	 * @see #setPartNumber(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getDevice_PartNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='partNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPartNumber();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getPartNumber <em>Part Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Number</em>' containment reference.
	 * @see #getPartNumber()
	 * @generated
	 */
	void setPartNumber(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The kind or type of device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getDevice_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Specialization</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DeviceSpecialization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The capabilities supported on a  device, the standards to which the device conforms for a particular purpose, and used for the communication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specialization</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDevice_Specialization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specialization' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeviceSpecialization> getSpecialization();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DeviceVersion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual design of the device or software version running on the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDevice_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeviceVersion> getVersion();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DeviceProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual configuration settings of a device as it actually operates, e.g., regulation status, time properties.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDevice_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeviceProperty> getProperty();

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Patient information, If the device is affixed to a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDevice_Patient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An organization that is responsible for the provision and ongoing maintenance of the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owner</em>' containment reference.
	 * @see #setOwner(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDevice_Owner()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='owner' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOwner();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getOwner <em>Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' containment reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Reference value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContactPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contact details for an organization or a particular human that is responsible for the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDevice_Contact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contact' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContactPoint> getContact();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The place where the device can be found.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDevice_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getLocation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Reference value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A network address on which the device may be contacted directly.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Uri)
	 * @see org.hl7.fhir.FhirPackage#getDevice_Url()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Uri value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Descriptive information, usage information or implantation information that is not captured in an existing element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDevice_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

	/**
	 * Returns the value of the '<em><b>Safety</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides additional safety characteristics about a medical device.  For example devices containing latex.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Safety</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDevice_Safety()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='safety' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getSafety();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parent device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent</em>' containment reference.
	 * @see #setParent(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDevice_Parent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parent' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getParent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Device#getParent <em>Parent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' containment reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Reference value);

} // Device
