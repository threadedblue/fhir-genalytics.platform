/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The characteristics, operational status and capabilities of a medical-related component of a medical device.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.DeviceDefinition#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDefinition#getUdiDeviceIdentifier <em>Udi Device Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDefinition#getManufacturerString <em>Manufacturer String</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDefinition#getManufacturerReference <em>Manufacturer Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDefinition#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDefinition#getModelNumber <em>Model Number</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDefinition#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDefinition#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDefinition#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDefinition#getSafety <em>Safety</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDefinition#getShelfLifeStorage <em>Shelf Life Storage</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDefinition#getPhysicalCharacteristics <em>Physical Characteristics</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDefinition#getLanguageCode <em>Language Code</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDefinition#getCapability <em>Capability</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDefinition#getProperty <em>Property</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDefinition#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDefinition#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDefinition#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDefinition#getOnlineInformation <em>Online Information</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDefinition#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDefinition#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDefinition#getParentDevice <em>Parent Device</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDefinition#getMaterial <em>Material</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDeviceDefinition()
 * @model extendedMetaData="name='DeviceDefinition' kind='elementOnly'"
 * @generated
 */
public interface DeviceDefinition extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique instance identifiers assigned to a device by the software, manufacturers, other organizations or owners. For example: handle ID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDeviceDefinition_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Udi Device Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DeviceDefinitionUdiDeviceIdentifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique device identifier (UDI) assigned to device label or package.  Note that the Device may include multiple udiCarriers as it either may include just the udiCarrier for the jurisdiction it is sold, or for multiple jurisdictions it could have been sold.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Udi Device Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDeviceDefinition_UdiDeviceIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='udiDeviceIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeviceDefinitionUdiDeviceIdentifier> getUdiDeviceIdentifier();

	/**
	 * Returns the value of the '<em><b>Manufacturer String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of the manufacturer. (choose any one of manufacturer*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer String</em>' containment reference.
	 * @see #setManufacturerString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getDeviceDefinition_ManufacturerString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='manufacturerString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getManufacturerString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceDefinition#getManufacturerString <em>Manufacturer String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer String</em>' containment reference.
	 * @see #getManufacturerString()
	 * @generated
	 */
	void setManufacturerString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Manufacturer Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of the manufacturer. (choose any one of manufacturer*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer Reference</em>' containment reference.
	 * @see #setManufacturerReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDeviceDefinition_ManufacturerReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='manufacturerReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getManufacturerReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceDefinition#getManufacturerReference <em>Manufacturer Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer Reference</em>' containment reference.
	 * @see #getManufacturerReference()
	 * @generated
	 */
	void setManufacturerReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Device Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DeviceDefinitionDeviceName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name given to the device to identify it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Name</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDeviceDefinition_DeviceName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deviceName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeviceDefinitionDeviceName> getDeviceName();

	/**
	 * Returns the value of the '<em><b>Model Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The model number for the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Number</em>' containment reference.
	 * @see #setModelNumber(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getDeviceDefinition_ModelNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modelNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getModelNumber();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceDefinition#getModelNumber <em>Model Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Number</em>' containment reference.
	 * @see #getModelNumber()
	 * @generated
	 */
	void setModelNumber(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * What kind of device or device system this is.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getDeviceDefinition_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceDefinition#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Specialization</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DeviceDefinitionSpecialization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The capabilities supported on a  device, the standards to which the device conforms for a particular purpose, and used for the communication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specialization</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDeviceDefinition_Specialization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specialization' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeviceDefinitionSpecialization> getSpecialization();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The available versions of the device, e.g., software versions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDeviceDefinition_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getVersion();

	/**
	 * Returns the value of the '<em><b>Safety</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Safety characteristics of the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Safety</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDeviceDefinition_Safety()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='safety' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getSafety();

	/**
	 * Returns the value of the '<em><b>Shelf Life Storage</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ProductShelfLife}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Shelf Life and storage information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shelf Life Storage</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDeviceDefinition_ShelfLifeStorage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='shelfLifeStorage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProductShelfLife> getShelfLifeStorage();

	/**
	 * Returns the value of the '<em><b>Physical Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dimensions, color etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Characteristics</em>' containment reference.
	 * @see #setPhysicalCharacteristics(ProdCharacteristic)
	 * @see org.hl7.fhir.FhirPackage#getDeviceDefinition_PhysicalCharacteristics()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='physicalCharacteristics' namespace='##targetNamespace'"
	 * @generated
	 */
	ProdCharacteristic getPhysicalCharacteristics();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceDefinition#getPhysicalCharacteristics <em>Physical Characteristics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Characteristics</em>' containment reference.
	 * @see #getPhysicalCharacteristics()
	 * @generated
	 */
	void setPhysicalCharacteristics(ProdCharacteristic value);

	/**
	 * Returns the value of the '<em><b>Language Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Language code for the human-readable text strings produced by the device (all supported).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language Code</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDeviceDefinition_LanguageCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='languageCode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getLanguageCode();

	/**
	 * Returns the value of the '<em><b>Capability</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DeviceDefinitionCapability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Device capabilities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capability</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDeviceDefinition_Capability()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='capability' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeviceDefinitionCapability> getCapability();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DeviceDefinitionProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual configuration settings of a device as it actually operates, e.g., regulation status, time properties.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDeviceDefinition_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeviceDefinitionProperty> getProperty();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An organization that is responsible for the provision and ongoing maintenance of the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owner</em>' containment reference.
	 * @see #setOwner(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDeviceDefinition_Owner()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='owner' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOwner();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceDefinition#getOwner <em>Owner</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getDeviceDefinition_Contact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contact' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContactPoint> getContact();

	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A network address on which the device may be contacted directly.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Uri)
	 * @see org.hl7.fhir.FhirPackage#getDeviceDefinition_Url()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceDefinition#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Uri value);

	/**
	 * Returns the value of the '<em><b>Online Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Access to on-line information about the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Online Information</em>' containment reference.
	 * @see #setOnlineInformation(Uri)
	 * @see org.hl7.fhir.FhirPackage#getDeviceDefinition_OnlineInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onlineInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getOnlineInformation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceDefinition#getOnlineInformation <em>Online Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Online Information</em>' containment reference.
	 * @see #getOnlineInformation()
	 * @generated
	 */
	void setOnlineInformation(Uri value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Descriptive information, usage information or implantation information that is not captured in an existing element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDeviceDefinition_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The quantity of the device present in the packaging (e.g. the number of devices present in a pack, or the number of devices in the same package of the medicinal product).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getDeviceDefinition_Quantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceDefinition#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Parent Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parent device it can be part of.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Device</em>' containment reference.
	 * @see #setParentDevice(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDeviceDefinition_ParentDevice()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parentDevice' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getParentDevice();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceDefinition#getParentDevice <em>Parent Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Device</em>' containment reference.
	 * @see #getParentDevice()
	 * @generated
	 */
	void setParentDevice(Reference value);

	/**
	 * Returns the value of the '<em><b>Material</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DeviceDefinitionMaterial}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A substance used to create the material(s) of which the device is made.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Material</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDeviceDefinition_Material()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='material' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeviceDefinitionMaterial> getMaterial();

} // DeviceDefinition
