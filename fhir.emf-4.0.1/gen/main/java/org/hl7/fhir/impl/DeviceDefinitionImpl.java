/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.Annotation;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.ContactPoint;
import org.hl7.fhir.DeviceDefinition;
import org.hl7.fhir.DeviceDefinitionCapability;
import org.hl7.fhir.DeviceDefinitionDeviceName;
import org.hl7.fhir.DeviceDefinitionMaterial;
import org.hl7.fhir.DeviceDefinitionProperty;
import org.hl7.fhir.DeviceDefinitionSpecialization;
import org.hl7.fhir.DeviceDefinitionUdiDeviceIdentifier;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.ProdCharacteristic;
import org.hl7.fhir.ProductShelfLife;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionImpl#getUdiDeviceIdentifier <em>Udi Device Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionImpl#getManufacturerString <em>Manufacturer String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionImpl#getManufacturerReference <em>Manufacturer Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionImpl#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionImpl#getModelNumber <em>Model Number</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionImpl#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionImpl#getSafety <em>Safety</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionImpl#getShelfLifeStorage <em>Shelf Life Storage</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionImpl#getPhysicalCharacteristics <em>Physical Characteristics</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionImpl#getLanguageCode <em>Language Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionImpl#getCapability <em>Capability</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionImpl#getOnlineInformation <em>Online Information</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionImpl#getParentDevice <em>Parent Device</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceDefinitionImpl#getMaterial <em>Material</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceDefinitionImpl extends DomainResourceImpl implements DeviceDefinition {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

	/**
	 * The cached value of the '{@link #getUdiDeviceIdentifier() <em>Udi Device Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUdiDeviceIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceDefinitionUdiDeviceIdentifier> udiDeviceIdentifier;

	/**
	 * The cached value of the '{@link #getManufacturerString() <em>Manufacturer String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturerString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String manufacturerString;

	/**
	 * The cached value of the '{@link #getManufacturerReference() <em>Manufacturer Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturerReference()
	 * @generated
	 * @ordered
	 */
	protected Reference manufacturerReference;

	/**
	 * The cached value of the '{@link #getDeviceName() <em>Device Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceName()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceDefinitionDeviceName> deviceName;

	/**
	 * The cached value of the '{@link #getModelNumber() <em>Model Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelNumber()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String modelNumber;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getSpecialization() <em>Specialization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialization()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceDefinitionSpecialization> specialization;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> version;

	/**
	 * The cached value of the '{@link #getSafety() <em>Safety</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafety()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> safety;

	/**
	 * The cached value of the '{@link #getShelfLifeStorage() <em>Shelf Life Storage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShelfLifeStorage()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductShelfLife> shelfLifeStorage;

	/**
	 * The cached value of the '{@link #getPhysicalCharacteristics() <em>Physical Characteristics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected ProdCharacteristic physicalCharacteristics;

	/**
	 * The cached value of the '{@link #getLanguageCode() <em>Language Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> languageCode;

	/**
	 * The cached value of the '{@link #getCapability() <em>Capability</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapability()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceDefinitionCapability> capability;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceDefinitionProperty> property;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected Reference owner;

	/**
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactPoint> contact;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected Uri url;

	/**
	 * The cached value of the '{@link #getOnlineInformation() <em>Online Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnlineInformation()
	 * @generated
	 * @ordered
	 */
	protected Uri onlineInformation;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> note;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity quantity;

	/**
	 * The cached value of the '{@link #getParentDevice() <em>Parent Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentDevice()
	 * @generated
	 * @ordered
	 */
	protected Reference parentDevice;

	/**
	 * The cached value of the '{@link #getMaterial() <em>Material</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterial()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceDefinitionMaterial> material;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDeviceDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.DEVICE_DEFINITION__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceDefinitionUdiDeviceIdentifier> getUdiDeviceIdentifier() {
		if (udiDeviceIdentifier == null) {
			udiDeviceIdentifier = new EObjectContainmentEList<DeviceDefinitionUdiDeviceIdentifier>(DeviceDefinitionUdiDeviceIdentifier.class, this, FhirPackage.DEVICE_DEFINITION__UDI_DEVICE_IDENTIFIER);
		}
		return udiDeviceIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getManufacturerString() {
		return manufacturerString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManufacturerString(org.hl7.fhir.String newManufacturerString, NotificationChain msgs) {
		org.hl7.fhir.String oldManufacturerString = manufacturerString;
		manufacturerString = newManufacturerString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION__MANUFACTURER_STRING, oldManufacturerString, newManufacturerString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManufacturerString(org.hl7.fhir.String newManufacturerString) {
		if (newManufacturerString != manufacturerString) {
			NotificationChain msgs = null;
			if (manufacturerString != null)
				msgs = ((InternalEObject)manufacturerString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION__MANUFACTURER_STRING, null, msgs);
			if (newManufacturerString != null)
				msgs = ((InternalEObject)newManufacturerString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION__MANUFACTURER_STRING, null, msgs);
			msgs = basicSetManufacturerString(newManufacturerString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION__MANUFACTURER_STRING, newManufacturerString, newManufacturerString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getManufacturerReference() {
		return manufacturerReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManufacturerReference(Reference newManufacturerReference, NotificationChain msgs) {
		Reference oldManufacturerReference = manufacturerReference;
		manufacturerReference = newManufacturerReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION__MANUFACTURER_REFERENCE, oldManufacturerReference, newManufacturerReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManufacturerReference(Reference newManufacturerReference) {
		if (newManufacturerReference != manufacturerReference) {
			NotificationChain msgs = null;
			if (manufacturerReference != null)
				msgs = ((InternalEObject)manufacturerReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION__MANUFACTURER_REFERENCE, null, msgs);
			if (newManufacturerReference != null)
				msgs = ((InternalEObject)newManufacturerReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION__MANUFACTURER_REFERENCE, null, msgs);
			msgs = basicSetManufacturerReference(newManufacturerReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION__MANUFACTURER_REFERENCE, newManufacturerReference, newManufacturerReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceDefinitionDeviceName> getDeviceName() {
		if (deviceName == null) {
			deviceName = new EObjectContainmentEList<DeviceDefinitionDeviceName>(DeviceDefinitionDeviceName.class, this, FhirPackage.DEVICE_DEFINITION__DEVICE_NAME);
		}
		return deviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getModelNumber() {
		return modelNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelNumber(org.hl7.fhir.String newModelNumber, NotificationChain msgs) {
		org.hl7.fhir.String oldModelNumber = modelNumber;
		modelNumber = newModelNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION__MODEL_NUMBER, oldModelNumber, newModelNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModelNumber(org.hl7.fhir.String newModelNumber) {
		if (newModelNumber != modelNumber) {
			NotificationChain msgs = null;
			if (modelNumber != null)
				msgs = ((InternalEObject)modelNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION__MODEL_NUMBER, null, msgs);
			if (newModelNumber != null)
				msgs = ((InternalEObject)newModelNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION__MODEL_NUMBER, null, msgs);
			msgs = basicSetModelNumber(newModelNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION__MODEL_NUMBER, newModelNumber, newModelNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceDefinitionSpecialization> getSpecialization() {
		if (specialization == null) {
			specialization = new EObjectContainmentEList<DeviceDefinitionSpecialization>(DeviceDefinitionSpecialization.class, this, FhirPackage.DEVICE_DEFINITION__SPECIALIZATION);
		}
		return specialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.hl7.fhir.String> getVersion() {
		if (version == null) {
			version = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.DEVICE_DEFINITION__VERSION);
		}
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getSafety() {
		if (safety == null) {
			safety = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.DEVICE_DEFINITION__SAFETY);
		}
		return safety;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProductShelfLife> getShelfLifeStorage() {
		if (shelfLifeStorage == null) {
			shelfLifeStorage = new EObjectContainmentEList<ProductShelfLife>(ProductShelfLife.class, this, FhirPackage.DEVICE_DEFINITION__SHELF_LIFE_STORAGE);
		}
		return shelfLifeStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProdCharacteristic getPhysicalCharacteristics() {
		return physicalCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhysicalCharacteristics(ProdCharacteristic newPhysicalCharacteristics, NotificationChain msgs) {
		ProdCharacteristic oldPhysicalCharacteristics = physicalCharacteristics;
		physicalCharacteristics = newPhysicalCharacteristics;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION__PHYSICAL_CHARACTERISTICS, oldPhysicalCharacteristics, newPhysicalCharacteristics);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhysicalCharacteristics(ProdCharacteristic newPhysicalCharacteristics) {
		if (newPhysicalCharacteristics != physicalCharacteristics) {
			NotificationChain msgs = null;
			if (physicalCharacteristics != null)
				msgs = ((InternalEObject)physicalCharacteristics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION__PHYSICAL_CHARACTERISTICS, null, msgs);
			if (newPhysicalCharacteristics != null)
				msgs = ((InternalEObject)newPhysicalCharacteristics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION__PHYSICAL_CHARACTERISTICS, null, msgs);
			msgs = basicSetPhysicalCharacteristics(newPhysicalCharacteristics, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION__PHYSICAL_CHARACTERISTICS, newPhysicalCharacteristics, newPhysicalCharacteristics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getLanguageCode() {
		if (languageCode == null) {
			languageCode = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.DEVICE_DEFINITION__LANGUAGE_CODE);
		}
		return languageCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceDefinitionCapability> getCapability() {
		if (capability == null) {
			capability = new EObjectContainmentEList<DeviceDefinitionCapability>(DeviceDefinitionCapability.class, this, FhirPackage.DEVICE_DEFINITION__CAPABILITY);
		}
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceDefinitionProperty> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<DeviceDefinitionProperty>(DeviceDefinitionProperty.class, this, FhirPackage.DEVICE_DEFINITION__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(Reference newOwner, NotificationChain msgs) {
		Reference oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION__OWNER, oldOwner, newOwner);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwner(Reference newOwner) {
		if (newOwner != owner) {
			NotificationChain msgs = null;
			if (owner != null)
				msgs = ((InternalEObject)owner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION__OWNER, null, msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION__OWNER, null, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactPoint> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<ContactPoint>(ContactPoint.class, this, FhirPackage.DEVICE_DEFINITION__CONTACT);
		}
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrl(Uri newUrl, NotificationChain msgs) {
		Uri oldUrl = url;
		url = newUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION__URL, oldUrl, newUrl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(Uri newUrl) {
		if (newUrl != url) {
			NotificationChain msgs = null;
			if (url != null)
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getOnlineInformation() {
		return onlineInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnlineInformation(Uri newOnlineInformation, NotificationChain msgs) {
		Uri oldOnlineInformation = onlineInformation;
		onlineInformation = newOnlineInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION__ONLINE_INFORMATION, oldOnlineInformation, newOnlineInformation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnlineInformation(Uri newOnlineInformation) {
		if (newOnlineInformation != onlineInformation) {
			NotificationChain msgs = null;
			if (onlineInformation != null)
				msgs = ((InternalEObject)onlineInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION__ONLINE_INFORMATION, null, msgs);
			if (newOnlineInformation != null)
				msgs = ((InternalEObject)newOnlineInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION__ONLINE_INFORMATION, null, msgs);
			msgs = basicSetOnlineInformation(newOnlineInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION__ONLINE_INFORMATION, newOnlineInformation, newOnlineInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.DEVICE_DEFINITION__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(Quantity newQuantity, NotificationChain msgs) {
		Quantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION__QUANTITY, oldQuantity, newQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantity(Quantity newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getParentDevice() {
		return parentDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentDevice(Reference newParentDevice, NotificationChain msgs) {
		Reference oldParentDevice = parentDevice;
		parentDevice = newParentDevice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION__PARENT_DEVICE, oldParentDevice, newParentDevice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentDevice(Reference newParentDevice) {
		if (newParentDevice != parentDevice) {
			NotificationChain msgs = null;
			if (parentDevice != null)
				msgs = ((InternalEObject)parentDevice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION__PARENT_DEVICE, null, msgs);
			if (newParentDevice != null)
				msgs = ((InternalEObject)newParentDevice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_DEFINITION__PARENT_DEVICE, null, msgs);
			msgs = basicSetParentDevice(newParentDevice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_DEFINITION__PARENT_DEVICE, newParentDevice, newParentDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceDefinitionMaterial> getMaterial() {
		if (material == null) {
			material = new EObjectContainmentEList<DeviceDefinitionMaterial>(DeviceDefinitionMaterial.class, this, FhirPackage.DEVICE_DEFINITION__MATERIAL);
		}
		return material;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DEVICE_DEFINITION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_DEFINITION__UDI_DEVICE_IDENTIFIER:
				return ((InternalEList<?>)getUdiDeviceIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_DEFINITION__MANUFACTURER_STRING:
				return basicSetManufacturerString(null, msgs);
			case FhirPackage.DEVICE_DEFINITION__MANUFACTURER_REFERENCE:
				return basicSetManufacturerReference(null, msgs);
			case FhirPackage.DEVICE_DEFINITION__DEVICE_NAME:
				return ((InternalEList<?>)getDeviceName()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_DEFINITION__MODEL_NUMBER:
				return basicSetModelNumber(null, msgs);
			case FhirPackage.DEVICE_DEFINITION__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.DEVICE_DEFINITION__SPECIALIZATION:
				return ((InternalEList<?>)getSpecialization()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_DEFINITION__VERSION:
				return ((InternalEList<?>)getVersion()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_DEFINITION__SAFETY:
				return ((InternalEList<?>)getSafety()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_DEFINITION__SHELF_LIFE_STORAGE:
				return ((InternalEList<?>)getShelfLifeStorage()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_DEFINITION__PHYSICAL_CHARACTERISTICS:
				return basicSetPhysicalCharacteristics(null, msgs);
			case FhirPackage.DEVICE_DEFINITION__LANGUAGE_CODE:
				return ((InternalEList<?>)getLanguageCode()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_DEFINITION__CAPABILITY:
				return ((InternalEList<?>)getCapability()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_DEFINITION__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_DEFINITION__OWNER:
				return basicSetOwner(null, msgs);
			case FhirPackage.DEVICE_DEFINITION__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_DEFINITION__URL:
				return basicSetUrl(null, msgs);
			case FhirPackage.DEVICE_DEFINITION__ONLINE_INFORMATION:
				return basicSetOnlineInformation(null, msgs);
			case FhirPackage.DEVICE_DEFINITION__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_DEFINITION__QUANTITY:
				return basicSetQuantity(null, msgs);
			case FhirPackage.DEVICE_DEFINITION__PARENT_DEVICE:
				return basicSetParentDevice(null, msgs);
			case FhirPackage.DEVICE_DEFINITION__MATERIAL:
				return ((InternalEList<?>)getMaterial()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirPackage.DEVICE_DEFINITION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.DEVICE_DEFINITION__UDI_DEVICE_IDENTIFIER:
				return getUdiDeviceIdentifier();
			case FhirPackage.DEVICE_DEFINITION__MANUFACTURER_STRING:
				return getManufacturerString();
			case FhirPackage.DEVICE_DEFINITION__MANUFACTURER_REFERENCE:
				return getManufacturerReference();
			case FhirPackage.DEVICE_DEFINITION__DEVICE_NAME:
				return getDeviceName();
			case FhirPackage.DEVICE_DEFINITION__MODEL_NUMBER:
				return getModelNumber();
			case FhirPackage.DEVICE_DEFINITION__TYPE:
				return getType();
			case FhirPackage.DEVICE_DEFINITION__SPECIALIZATION:
				return getSpecialization();
			case FhirPackage.DEVICE_DEFINITION__VERSION:
				return getVersion();
			case FhirPackage.DEVICE_DEFINITION__SAFETY:
				return getSafety();
			case FhirPackage.DEVICE_DEFINITION__SHELF_LIFE_STORAGE:
				return getShelfLifeStorage();
			case FhirPackage.DEVICE_DEFINITION__PHYSICAL_CHARACTERISTICS:
				return getPhysicalCharacteristics();
			case FhirPackage.DEVICE_DEFINITION__LANGUAGE_CODE:
				return getLanguageCode();
			case FhirPackage.DEVICE_DEFINITION__CAPABILITY:
				return getCapability();
			case FhirPackage.DEVICE_DEFINITION__PROPERTY:
				return getProperty();
			case FhirPackage.DEVICE_DEFINITION__OWNER:
				return getOwner();
			case FhirPackage.DEVICE_DEFINITION__CONTACT:
				return getContact();
			case FhirPackage.DEVICE_DEFINITION__URL:
				return getUrl();
			case FhirPackage.DEVICE_DEFINITION__ONLINE_INFORMATION:
				return getOnlineInformation();
			case FhirPackage.DEVICE_DEFINITION__NOTE:
				return getNote();
			case FhirPackage.DEVICE_DEFINITION__QUANTITY:
				return getQuantity();
			case FhirPackage.DEVICE_DEFINITION__PARENT_DEVICE:
				return getParentDevice();
			case FhirPackage.DEVICE_DEFINITION__MATERIAL:
				return getMaterial();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.DEVICE_DEFINITION__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__UDI_DEVICE_IDENTIFIER:
				getUdiDeviceIdentifier().clear();
				getUdiDeviceIdentifier().addAll((Collection<? extends DeviceDefinitionUdiDeviceIdentifier>)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__MANUFACTURER_STRING:
				setManufacturerString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__MANUFACTURER_REFERENCE:
				setManufacturerReference((Reference)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__DEVICE_NAME:
				getDeviceName().clear();
				getDeviceName().addAll((Collection<? extends DeviceDefinitionDeviceName>)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__MODEL_NUMBER:
				setModelNumber((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__SPECIALIZATION:
				getSpecialization().clear();
				getSpecialization().addAll((Collection<? extends DeviceDefinitionSpecialization>)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__VERSION:
				getVersion().clear();
				getVersion().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__SAFETY:
				getSafety().clear();
				getSafety().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__SHELF_LIFE_STORAGE:
				getShelfLifeStorage().clear();
				getShelfLifeStorage().addAll((Collection<? extends ProductShelfLife>)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__PHYSICAL_CHARACTERISTICS:
				setPhysicalCharacteristics((ProdCharacteristic)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__LANGUAGE_CODE:
				getLanguageCode().clear();
				getLanguageCode().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__CAPABILITY:
				getCapability().clear();
				getCapability().addAll((Collection<? extends DeviceDefinitionCapability>)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends DeviceDefinitionProperty>)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__OWNER:
				setOwner((Reference)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends ContactPoint>)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__URL:
				setUrl((Uri)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__ONLINE_INFORMATION:
				setOnlineInformation((Uri)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__PARENT_DEVICE:
				setParentDevice((Reference)newValue);
				return;
			case FhirPackage.DEVICE_DEFINITION__MATERIAL:
				getMaterial().clear();
				getMaterial().addAll((Collection<? extends DeviceDefinitionMaterial>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FhirPackage.DEVICE_DEFINITION__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.DEVICE_DEFINITION__UDI_DEVICE_IDENTIFIER:
				getUdiDeviceIdentifier().clear();
				return;
			case FhirPackage.DEVICE_DEFINITION__MANUFACTURER_STRING:
				setManufacturerString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.DEVICE_DEFINITION__MANUFACTURER_REFERENCE:
				setManufacturerReference((Reference)null);
				return;
			case FhirPackage.DEVICE_DEFINITION__DEVICE_NAME:
				getDeviceName().clear();
				return;
			case FhirPackage.DEVICE_DEFINITION__MODEL_NUMBER:
				setModelNumber((org.hl7.fhir.String)null);
				return;
			case FhirPackage.DEVICE_DEFINITION__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.DEVICE_DEFINITION__SPECIALIZATION:
				getSpecialization().clear();
				return;
			case FhirPackage.DEVICE_DEFINITION__VERSION:
				getVersion().clear();
				return;
			case FhirPackage.DEVICE_DEFINITION__SAFETY:
				getSafety().clear();
				return;
			case FhirPackage.DEVICE_DEFINITION__SHELF_LIFE_STORAGE:
				getShelfLifeStorage().clear();
				return;
			case FhirPackage.DEVICE_DEFINITION__PHYSICAL_CHARACTERISTICS:
				setPhysicalCharacteristics((ProdCharacteristic)null);
				return;
			case FhirPackage.DEVICE_DEFINITION__LANGUAGE_CODE:
				getLanguageCode().clear();
				return;
			case FhirPackage.DEVICE_DEFINITION__CAPABILITY:
				getCapability().clear();
				return;
			case FhirPackage.DEVICE_DEFINITION__PROPERTY:
				getProperty().clear();
				return;
			case FhirPackage.DEVICE_DEFINITION__OWNER:
				setOwner((Reference)null);
				return;
			case FhirPackage.DEVICE_DEFINITION__CONTACT:
				getContact().clear();
				return;
			case FhirPackage.DEVICE_DEFINITION__URL:
				setUrl((Uri)null);
				return;
			case FhirPackage.DEVICE_DEFINITION__ONLINE_INFORMATION:
				setOnlineInformation((Uri)null);
				return;
			case FhirPackage.DEVICE_DEFINITION__NOTE:
				getNote().clear();
				return;
			case FhirPackage.DEVICE_DEFINITION__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case FhirPackage.DEVICE_DEFINITION__PARENT_DEVICE:
				setParentDevice((Reference)null);
				return;
			case FhirPackage.DEVICE_DEFINITION__MATERIAL:
				getMaterial().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FhirPackage.DEVICE_DEFINITION__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.DEVICE_DEFINITION__UDI_DEVICE_IDENTIFIER:
				return udiDeviceIdentifier != null && !udiDeviceIdentifier.isEmpty();
			case FhirPackage.DEVICE_DEFINITION__MANUFACTURER_STRING:
				return manufacturerString != null;
			case FhirPackage.DEVICE_DEFINITION__MANUFACTURER_REFERENCE:
				return manufacturerReference != null;
			case FhirPackage.DEVICE_DEFINITION__DEVICE_NAME:
				return deviceName != null && !deviceName.isEmpty();
			case FhirPackage.DEVICE_DEFINITION__MODEL_NUMBER:
				return modelNumber != null;
			case FhirPackage.DEVICE_DEFINITION__TYPE:
				return type != null;
			case FhirPackage.DEVICE_DEFINITION__SPECIALIZATION:
				return specialization != null && !specialization.isEmpty();
			case FhirPackage.DEVICE_DEFINITION__VERSION:
				return version != null && !version.isEmpty();
			case FhirPackage.DEVICE_DEFINITION__SAFETY:
				return safety != null && !safety.isEmpty();
			case FhirPackage.DEVICE_DEFINITION__SHELF_LIFE_STORAGE:
				return shelfLifeStorage != null && !shelfLifeStorage.isEmpty();
			case FhirPackage.DEVICE_DEFINITION__PHYSICAL_CHARACTERISTICS:
				return physicalCharacteristics != null;
			case FhirPackage.DEVICE_DEFINITION__LANGUAGE_CODE:
				return languageCode != null && !languageCode.isEmpty();
			case FhirPackage.DEVICE_DEFINITION__CAPABILITY:
				return capability != null && !capability.isEmpty();
			case FhirPackage.DEVICE_DEFINITION__PROPERTY:
				return property != null && !property.isEmpty();
			case FhirPackage.DEVICE_DEFINITION__OWNER:
				return owner != null;
			case FhirPackage.DEVICE_DEFINITION__CONTACT:
				return contact != null && !contact.isEmpty();
			case FhirPackage.DEVICE_DEFINITION__URL:
				return url != null;
			case FhirPackage.DEVICE_DEFINITION__ONLINE_INFORMATION:
				return onlineInformation != null;
			case FhirPackage.DEVICE_DEFINITION__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.DEVICE_DEFINITION__QUANTITY:
				return quantity != null;
			case FhirPackage.DEVICE_DEFINITION__PARENT_DEVICE:
				return parentDevice != null;
			case FhirPackage.DEVICE_DEFINITION__MATERIAL:
				return material != null && !material.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeviceDefinitionImpl
