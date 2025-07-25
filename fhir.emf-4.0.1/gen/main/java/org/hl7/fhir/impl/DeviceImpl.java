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
import org.hl7.fhir.DateTime;
import org.hl7.fhir.Device;
import org.hl7.fhir.DeviceDeviceName;
import org.hl7.fhir.DeviceProperty;
import org.hl7.fhir.DeviceSpecialization;
import org.hl7.fhir.DeviceUdiCarrier;
import org.hl7.fhir.DeviceVersion;
import org.hl7.fhir.FHIRDeviceStatus;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getUdiCarrier <em>Udi Carrier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getStatusReason <em>Status Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getDistinctIdentifier <em>Distinct Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getManufactureDate <em>Manufacture Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getLotNumber <em>Lot Number</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getModelNumber <em>Model Number</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getPartNumber <em>Part Number</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getSafety <em>Safety</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceImpl extends DomainResourceImpl implements Device {
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
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected Reference definition;

	/**
	 * The cached value of the '{@link #getUdiCarrier() <em>Udi Carrier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUdiCarrier()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceUdiCarrier> udiCarrier;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected FHIRDeviceStatus status;

	/**
	 * The cached value of the '{@link #getStatusReason() <em>Status Reason</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusReason()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> statusReason;

	/**
	 * The cached value of the '{@link #getDistinctIdentifier() <em>Distinct Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistinctIdentifier()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String distinctIdentifier;

	/**
	 * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String manufacturer;

	/**
	 * The cached value of the '{@link #getManufactureDate() <em>Manufacture Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufactureDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime manufactureDate;

	/**
	 * The cached value of the '{@link #getExpirationDate() <em>Expiration Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime expirationDate;

	/**
	 * The cached value of the '{@link #getLotNumber() <em>Lot Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLotNumber()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String lotNumber;

	/**
	 * The cached value of the '{@link #getSerialNumber() <em>Serial Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String serialNumber;

	/**
	 * The cached value of the '{@link #getDeviceName() <em>Device Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceName()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceDeviceName> deviceName;

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
	 * The cached value of the '{@link #getPartNumber() <em>Part Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartNumber()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String partNumber;

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
	protected EList<DeviceSpecialization> specialization;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceVersion> version;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceProperty> property;

	/**
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Reference patient;

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
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Reference location;

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
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> note;

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
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected Reference parent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDevice();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.DEVICE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinition(Reference newDefinition, NotificationChain msgs) {
		Reference oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE__DEFINITION, oldDefinition, newDefinition);
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
	public void setDefinition(Reference newDefinition) {
		if (newDefinition != definition) {
			NotificationChain msgs = null;
			if (definition != null)
				msgs = ((InternalEObject)definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE__DEFINITION, null, msgs);
			if (newDefinition != null)
				msgs = ((InternalEObject)newDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE__DEFINITION, null, msgs);
			msgs = basicSetDefinition(newDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE__DEFINITION, newDefinition, newDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceUdiCarrier> getUdiCarrier() {
		if (udiCarrier == null) {
			udiCarrier = new EObjectContainmentEList<DeviceUdiCarrier>(DeviceUdiCarrier.class, this, FhirPackage.DEVICE__UDI_CARRIER);
		}
		return udiCarrier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FHIRDeviceStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(FHIRDeviceStatus newStatus, NotificationChain msgs) {
		FHIRDeviceStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE__STATUS, oldStatus, newStatus);
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
	public void setStatus(FHIRDeviceStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getStatusReason() {
		if (statusReason == null) {
			statusReason = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.DEVICE__STATUS_REASON);
		}
		return statusReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getDistinctIdentifier() {
		return distinctIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistinctIdentifier(org.hl7.fhir.String newDistinctIdentifier, NotificationChain msgs) {
		org.hl7.fhir.String oldDistinctIdentifier = distinctIdentifier;
		distinctIdentifier = newDistinctIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE__DISTINCT_IDENTIFIER, oldDistinctIdentifier, newDistinctIdentifier);
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
	public void setDistinctIdentifier(org.hl7.fhir.String newDistinctIdentifier) {
		if (newDistinctIdentifier != distinctIdentifier) {
			NotificationChain msgs = null;
			if (distinctIdentifier != null)
				msgs = ((InternalEObject)distinctIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE__DISTINCT_IDENTIFIER, null, msgs);
			if (newDistinctIdentifier != null)
				msgs = ((InternalEObject)newDistinctIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE__DISTINCT_IDENTIFIER, null, msgs);
			msgs = basicSetDistinctIdentifier(newDistinctIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE__DISTINCT_IDENTIFIER, newDistinctIdentifier, newDistinctIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getManufacturer() {
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManufacturer(org.hl7.fhir.String newManufacturer, NotificationChain msgs) {
		org.hl7.fhir.String oldManufacturer = manufacturer;
		manufacturer = newManufacturer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE__MANUFACTURER, oldManufacturer, newManufacturer);
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
	public void setManufacturer(org.hl7.fhir.String newManufacturer) {
		if (newManufacturer != manufacturer) {
			NotificationChain msgs = null;
			if (manufacturer != null)
				msgs = ((InternalEObject)manufacturer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE__MANUFACTURER, null, msgs);
			if (newManufacturer != null)
				msgs = ((InternalEObject)newManufacturer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE__MANUFACTURER, null, msgs);
			msgs = basicSetManufacturer(newManufacturer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE__MANUFACTURER, newManufacturer, newManufacturer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getManufactureDate() {
		return manufactureDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManufactureDate(DateTime newManufactureDate, NotificationChain msgs) {
		DateTime oldManufactureDate = manufactureDate;
		manufactureDate = newManufactureDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE__MANUFACTURE_DATE, oldManufactureDate, newManufactureDate);
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
	public void setManufactureDate(DateTime newManufactureDate) {
		if (newManufactureDate != manufactureDate) {
			NotificationChain msgs = null;
			if (manufactureDate != null)
				msgs = ((InternalEObject)manufactureDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE__MANUFACTURE_DATE, null, msgs);
			if (newManufactureDate != null)
				msgs = ((InternalEObject)newManufactureDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE__MANUFACTURE_DATE, null, msgs);
			msgs = basicSetManufactureDate(newManufactureDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE__MANUFACTURE_DATE, newManufactureDate, newManufactureDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getExpirationDate() {
		return expirationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpirationDate(DateTime newExpirationDate, NotificationChain msgs) {
		DateTime oldExpirationDate = expirationDate;
		expirationDate = newExpirationDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE__EXPIRATION_DATE, oldExpirationDate, newExpirationDate);
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
	public void setExpirationDate(DateTime newExpirationDate) {
		if (newExpirationDate != expirationDate) {
			NotificationChain msgs = null;
			if (expirationDate != null)
				msgs = ((InternalEObject)expirationDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE__EXPIRATION_DATE, null, msgs);
			if (newExpirationDate != null)
				msgs = ((InternalEObject)newExpirationDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE__EXPIRATION_DATE, null, msgs);
			msgs = basicSetExpirationDate(newExpirationDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE__EXPIRATION_DATE, newExpirationDate, newExpirationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getLotNumber() {
		return lotNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLotNumber(org.hl7.fhir.String newLotNumber, NotificationChain msgs) {
		org.hl7.fhir.String oldLotNumber = lotNumber;
		lotNumber = newLotNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE__LOT_NUMBER, oldLotNumber, newLotNumber);
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
	public void setLotNumber(org.hl7.fhir.String newLotNumber) {
		if (newLotNumber != lotNumber) {
			NotificationChain msgs = null;
			if (lotNumber != null)
				msgs = ((InternalEObject)lotNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE__LOT_NUMBER, null, msgs);
			if (newLotNumber != null)
				msgs = ((InternalEObject)newLotNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE__LOT_NUMBER, null, msgs);
			msgs = basicSetLotNumber(newLotNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE__LOT_NUMBER, newLotNumber, newLotNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSerialNumber(org.hl7.fhir.String newSerialNumber, NotificationChain msgs) {
		org.hl7.fhir.String oldSerialNumber = serialNumber;
		serialNumber = newSerialNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE__SERIAL_NUMBER, oldSerialNumber, newSerialNumber);
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
	public void setSerialNumber(org.hl7.fhir.String newSerialNumber) {
		if (newSerialNumber != serialNumber) {
			NotificationChain msgs = null;
			if (serialNumber != null)
				msgs = ((InternalEObject)serialNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE__SERIAL_NUMBER, null, msgs);
			if (newSerialNumber != null)
				msgs = ((InternalEObject)newSerialNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE__SERIAL_NUMBER, null, msgs);
			msgs = basicSetSerialNumber(newSerialNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE__SERIAL_NUMBER, newSerialNumber, newSerialNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceDeviceName> getDeviceName() {
		if (deviceName == null) {
			deviceName = new EObjectContainmentEList<DeviceDeviceName>(DeviceDeviceName.class, this, FhirPackage.DEVICE__DEVICE_NAME);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE__MODEL_NUMBER, oldModelNumber, newModelNumber);
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
				msgs = ((InternalEObject)modelNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE__MODEL_NUMBER, null, msgs);
			if (newModelNumber != null)
				msgs = ((InternalEObject)newModelNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE__MODEL_NUMBER, null, msgs);
			msgs = basicSetModelNumber(newModelNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE__MODEL_NUMBER, newModelNumber, newModelNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getPartNumber() {
		return partNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartNumber(org.hl7.fhir.String newPartNumber, NotificationChain msgs) {
		org.hl7.fhir.String oldPartNumber = partNumber;
		partNumber = newPartNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE__PART_NUMBER, oldPartNumber, newPartNumber);
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
	public void setPartNumber(org.hl7.fhir.String newPartNumber) {
		if (newPartNumber != partNumber) {
			NotificationChain msgs = null;
			if (partNumber != null)
				msgs = ((InternalEObject)partNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE__PART_NUMBER, null, msgs);
			if (newPartNumber != null)
				msgs = ((InternalEObject)newPartNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE__PART_NUMBER, null, msgs);
			msgs = basicSetPartNumber(newPartNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE__PART_NUMBER, newPartNumber, newPartNumber));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceSpecialization> getSpecialization() {
		if (specialization == null) {
			specialization = new EObjectContainmentEList<DeviceSpecialization>(DeviceSpecialization.class, this, FhirPackage.DEVICE__SPECIALIZATION);
		}
		return specialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceVersion> getVersion() {
		if (version == null) {
			version = new EObjectContainmentEList<DeviceVersion>(DeviceVersion.class, this, FhirPackage.DEVICE__VERSION);
		}
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceProperty> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<DeviceProperty>(DeviceProperty.class, this, FhirPackage.DEVICE__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getPatient() {
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatient(Reference newPatient, NotificationChain msgs) {
		Reference oldPatient = patient;
		patient = newPatient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE__PATIENT, oldPatient, newPatient);
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
	public void setPatient(Reference newPatient) {
		if (newPatient != patient) {
			NotificationChain msgs = null;
			if (patient != null)
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE__PATIENT, newPatient, newPatient));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE__OWNER, oldOwner, newOwner);
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
				msgs = ((InternalEObject)owner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE__OWNER, null, msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE__OWNER, null, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactPoint> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<ContactPoint>(ContactPoint.class, this, FhirPackage.DEVICE__CONTACT);
		}
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Reference newLocation, NotificationChain msgs) {
		Reference oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE__LOCATION, oldLocation, newLocation);
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
	public void setLocation(Reference newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE__LOCATION, newLocation, newLocation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE__URL, oldUrl, newUrl);
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
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.DEVICE__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getSafety() {
		if (safety == null) {
			safety = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.DEVICE__SAFETY);
		}
		return safety;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Reference newParent, NotificationChain msgs) {
		Reference oldParent = parent;
		parent = newParent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE__PARENT, oldParent, newParent);
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
	public void setParent(Reference newParent) {
		if (newParent != parent) {
			NotificationChain msgs = null;
			if (parent != null)
				msgs = ((InternalEObject)parent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE__PARENT, null, msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE__PARENT, null, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DEVICE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE__DEFINITION:
				return basicSetDefinition(null, msgs);
			case FhirPackage.DEVICE__UDI_CARRIER:
				return ((InternalEList<?>)getUdiCarrier()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.DEVICE__STATUS_REASON:
				return ((InternalEList<?>)getStatusReason()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE__DISTINCT_IDENTIFIER:
				return basicSetDistinctIdentifier(null, msgs);
			case FhirPackage.DEVICE__MANUFACTURER:
				return basicSetManufacturer(null, msgs);
			case FhirPackage.DEVICE__MANUFACTURE_DATE:
				return basicSetManufactureDate(null, msgs);
			case FhirPackage.DEVICE__EXPIRATION_DATE:
				return basicSetExpirationDate(null, msgs);
			case FhirPackage.DEVICE__LOT_NUMBER:
				return basicSetLotNumber(null, msgs);
			case FhirPackage.DEVICE__SERIAL_NUMBER:
				return basicSetSerialNumber(null, msgs);
			case FhirPackage.DEVICE__DEVICE_NAME:
				return ((InternalEList<?>)getDeviceName()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE__MODEL_NUMBER:
				return basicSetModelNumber(null, msgs);
			case FhirPackage.DEVICE__PART_NUMBER:
				return basicSetPartNumber(null, msgs);
			case FhirPackage.DEVICE__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.DEVICE__SPECIALIZATION:
				return ((InternalEList<?>)getSpecialization()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE__VERSION:
				return ((InternalEList<?>)getVersion()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.DEVICE__OWNER:
				return basicSetOwner(null, msgs);
			case FhirPackage.DEVICE__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE__LOCATION:
				return basicSetLocation(null, msgs);
			case FhirPackage.DEVICE__URL:
				return basicSetUrl(null, msgs);
			case FhirPackage.DEVICE__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE__SAFETY:
				return ((InternalEList<?>)getSafety()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE__PARENT:
				return basicSetParent(null, msgs);
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
			case FhirPackage.DEVICE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.DEVICE__DEFINITION:
				return getDefinition();
			case FhirPackage.DEVICE__UDI_CARRIER:
				return getUdiCarrier();
			case FhirPackage.DEVICE__STATUS:
				return getStatus();
			case FhirPackage.DEVICE__STATUS_REASON:
				return getStatusReason();
			case FhirPackage.DEVICE__DISTINCT_IDENTIFIER:
				return getDistinctIdentifier();
			case FhirPackage.DEVICE__MANUFACTURER:
				return getManufacturer();
			case FhirPackage.DEVICE__MANUFACTURE_DATE:
				return getManufactureDate();
			case FhirPackage.DEVICE__EXPIRATION_DATE:
				return getExpirationDate();
			case FhirPackage.DEVICE__LOT_NUMBER:
				return getLotNumber();
			case FhirPackage.DEVICE__SERIAL_NUMBER:
				return getSerialNumber();
			case FhirPackage.DEVICE__DEVICE_NAME:
				return getDeviceName();
			case FhirPackage.DEVICE__MODEL_NUMBER:
				return getModelNumber();
			case FhirPackage.DEVICE__PART_NUMBER:
				return getPartNumber();
			case FhirPackage.DEVICE__TYPE:
				return getType();
			case FhirPackage.DEVICE__SPECIALIZATION:
				return getSpecialization();
			case FhirPackage.DEVICE__VERSION:
				return getVersion();
			case FhirPackage.DEVICE__PROPERTY:
				return getProperty();
			case FhirPackage.DEVICE__PATIENT:
				return getPatient();
			case FhirPackage.DEVICE__OWNER:
				return getOwner();
			case FhirPackage.DEVICE__CONTACT:
				return getContact();
			case FhirPackage.DEVICE__LOCATION:
				return getLocation();
			case FhirPackage.DEVICE__URL:
				return getUrl();
			case FhirPackage.DEVICE__NOTE:
				return getNote();
			case FhirPackage.DEVICE__SAFETY:
				return getSafety();
			case FhirPackage.DEVICE__PARENT:
				return getParent();
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
			case FhirPackage.DEVICE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.DEVICE__DEFINITION:
				setDefinition((Reference)newValue);
				return;
			case FhirPackage.DEVICE__UDI_CARRIER:
				getUdiCarrier().clear();
				getUdiCarrier().addAll((Collection<? extends DeviceUdiCarrier>)newValue);
				return;
			case FhirPackage.DEVICE__STATUS:
				setStatus((FHIRDeviceStatus)newValue);
				return;
			case FhirPackage.DEVICE__STATUS_REASON:
				getStatusReason().clear();
				getStatusReason().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.DEVICE__DISTINCT_IDENTIFIER:
				setDistinctIdentifier((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.DEVICE__MANUFACTURER:
				setManufacturer((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.DEVICE__MANUFACTURE_DATE:
				setManufactureDate((DateTime)newValue);
				return;
			case FhirPackage.DEVICE__EXPIRATION_DATE:
				setExpirationDate((DateTime)newValue);
				return;
			case FhirPackage.DEVICE__LOT_NUMBER:
				setLotNumber((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.DEVICE__SERIAL_NUMBER:
				setSerialNumber((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.DEVICE__DEVICE_NAME:
				getDeviceName().clear();
				getDeviceName().addAll((Collection<? extends DeviceDeviceName>)newValue);
				return;
			case FhirPackage.DEVICE__MODEL_NUMBER:
				setModelNumber((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.DEVICE__PART_NUMBER:
				setPartNumber((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.DEVICE__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.DEVICE__SPECIALIZATION:
				getSpecialization().clear();
				getSpecialization().addAll((Collection<? extends DeviceSpecialization>)newValue);
				return;
			case FhirPackage.DEVICE__VERSION:
				getVersion().clear();
				getVersion().addAll((Collection<? extends DeviceVersion>)newValue);
				return;
			case FhirPackage.DEVICE__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends DeviceProperty>)newValue);
				return;
			case FhirPackage.DEVICE__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FhirPackage.DEVICE__OWNER:
				setOwner((Reference)newValue);
				return;
			case FhirPackage.DEVICE__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends ContactPoint>)newValue);
				return;
			case FhirPackage.DEVICE__LOCATION:
				setLocation((Reference)newValue);
				return;
			case FhirPackage.DEVICE__URL:
				setUrl((Uri)newValue);
				return;
			case FhirPackage.DEVICE__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.DEVICE__SAFETY:
				getSafety().clear();
				getSafety().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.DEVICE__PARENT:
				setParent((Reference)newValue);
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
			case FhirPackage.DEVICE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.DEVICE__DEFINITION:
				setDefinition((Reference)null);
				return;
			case FhirPackage.DEVICE__UDI_CARRIER:
				getUdiCarrier().clear();
				return;
			case FhirPackage.DEVICE__STATUS:
				setStatus((FHIRDeviceStatus)null);
				return;
			case FhirPackage.DEVICE__STATUS_REASON:
				getStatusReason().clear();
				return;
			case FhirPackage.DEVICE__DISTINCT_IDENTIFIER:
				setDistinctIdentifier((org.hl7.fhir.String)null);
				return;
			case FhirPackage.DEVICE__MANUFACTURER:
				setManufacturer((org.hl7.fhir.String)null);
				return;
			case FhirPackage.DEVICE__MANUFACTURE_DATE:
				setManufactureDate((DateTime)null);
				return;
			case FhirPackage.DEVICE__EXPIRATION_DATE:
				setExpirationDate((DateTime)null);
				return;
			case FhirPackage.DEVICE__LOT_NUMBER:
				setLotNumber((org.hl7.fhir.String)null);
				return;
			case FhirPackage.DEVICE__SERIAL_NUMBER:
				setSerialNumber((org.hl7.fhir.String)null);
				return;
			case FhirPackage.DEVICE__DEVICE_NAME:
				getDeviceName().clear();
				return;
			case FhirPackage.DEVICE__MODEL_NUMBER:
				setModelNumber((org.hl7.fhir.String)null);
				return;
			case FhirPackage.DEVICE__PART_NUMBER:
				setPartNumber((org.hl7.fhir.String)null);
				return;
			case FhirPackage.DEVICE__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.DEVICE__SPECIALIZATION:
				getSpecialization().clear();
				return;
			case FhirPackage.DEVICE__VERSION:
				getVersion().clear();
				return;
			case FhirPackage.DEVICE__PROPERTY:
				getProperty().clear();
				return;
			case FhirPackage.DEVICE__PATIENT:
				setPatient((Reference)null);
				return;
			case FhirPackage.DEVICE__OWNER:
				setOwner((Reference)null);
				return;
			case FhirPackage.DEVICE__CONTACT:
				getContact().clear();
				return;
			case FhirPackage.DEVICE__LOCATION:
				setLocation((Reference)null);
				return;
			case FhirPackage.DEVICE__URL:
				setUrl((Uri)null);
				return;
			case FhirPackage.DEVICE__NOTE:
				getNote().clear();
				return;
			case FhirPackage.DEVICE__SAFETY:
				getSafety().clear();
				return;
			case FhirPackage.DEVICE__PARENT:
				setParent((Reference)null);
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
			case FhirPackage.DEVICE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.DEVICE__DEFINITION:
				return definition != null;
			case FhirPackage.DEVICE__UDI_CARRIER:
				return udiCarrier != null && !udiCarrier.isEmpty();
			case FhirPackage.DEVICE__STATUS:
				return status != null;
			case FhirPackage.DEVICE__STATUS_REASON:
				return statusReason != null && !statusReason.isEmpty();
			case FhirPackage.DEVICE__DISTINCT_IDENTIFIER:
				return distinctIdentifier != null;
			case FhirPackage.DEVICE__MANUFACTURER:
				return manufacturer != null;
			case FhirPackage.DEVICE__MANUFACTURE_DATE:
				return manufactureDate != null;
			case FhirPackage.DEVICE__EXPIRATION_DATE:
				return expirationDate != null;
			case FhirPackage.DEVICE__LOT_NUMBER:
				return lotNumber != null;
			case FhirPackage.DEVICE__SERIAL_NUMBER:
				return serialNumber != null;
			case FhirPackage.DEVICE__DEVICE_NAME:
				return deviceName != null && !deviceName.isEmpty();
			case FhirPackage.DEVICE__MODEL_NUMBER:
				return modelNumber != null;
			case FhirPackage.DEVICE__PART_NUMBER:
				return partNumber != null;
			case FhirPackage.DEVICE__TYPE:
				return type != null;
			case FhirPackage.DEVICE__SPECIALIZATION:
				return specialization != null && !specialization.isEmpty();
			case FhirPackage.DEVICE__VERSION:
				return version != null && !version.isEmpty();
			case FhirPackage.DEVICE__PROPERTY:
				return property != null && !property.isEmpty();
			case FhirPackage.DEVICE__PATIENT:
				return patient != null;
			case FhirPackage.DEVICE__OWNER:
				return owner != null;
			case FhirPackage.DEVICE__CONTACT:
				return contact != null && !contact.isEmpty();
			case FhirPackage.DEVICE__LOCATION:
				return location != null;
			case FhirPackage.DEVICE__URL:
				return url != null;
			case FhirPackage.DEVICE__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.DEVICE__SAFETY:
				return safety != null && !safety.isEmpty();
			case FhirPackage.DEVICE__PARENT:
				return parent != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceImpl
