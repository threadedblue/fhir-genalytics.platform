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

import org.hl7.fhir.Code;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Coding;
import org.hl7.fhir.ContactPoint;
import org.hl7.fhir.Endpoint;
import org.hl7.fhir.EndpointStatus;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Url;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.EndpointImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EndpointImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EndpointImpl#getConnectionType <em>Connection Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EndpointImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EndpointImpl#getManagingOrganization <em>Managing Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EndpointImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EndpointImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EndpointImpl#getPayloadType <em>Payload Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EndpointImpl#getPayloadMimeType <em>Payload Mime Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EndpointImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EndpointImpl#getHeader <em>Header</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndpointImpl extends DomainResourceImpl implements Endpoint {
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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected EndpointStatus status;

	/**
	 * The cached value of the '{@link #getConnectionType() <em>Connection Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionType()
	 * @generated
	 * @ordered
	 */
	protected Coding connectionType;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String name;

	/**
	 * The cached value of the '{@link #getManagingOrganization() <em>Managing Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagingOrganization()
	 * @generated
	 * @ordered
	 */
	protected Reference managingOrganization;

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
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

	/**
	 * The cached value of the '{@link #getPayloadType() <em>Payload Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayloadType()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> payloadType;

	/**
	 * The cached value of the '{@link #getPayloadMimeType() <em>Payload Mime Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayloadMimeType()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> payloadMimeType;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected Url address;

	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> header;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getEndpoint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.ENDPOINT__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EndpointStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(EndpointStatus newStatus, NotificationChain msgs) {
		EndpointStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENDPOINT__STATUS, oldStatus, newStatus);
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
	public void setStatus(EndpointStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENDPOINT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENDPOINT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENDPOINT__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coding getConnectionType() {
		return connectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectionType(Coding newConnectionType, NotificationChain msgs) {
		Coding oldConnectionType = connectionType;
		connectionType = newConnectionType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENDPOINT__CONNECTION_TYPE, oldConnectionType, newConnectionType);
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
	public void setConnectionType(Coding newConnectionType) {
		if (newConnectionType != connectionType) {
			NotificationChain msgs = null;
			if (connectionType != null)
				msgs = ((InternalEObject)connectionType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENDPOINT__CONNECTION_TYPE, null, msgs);
			if (newConnectionType != null)
				msgs = ((InternalEObject)newConnectionType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENDPOINT__CONNECTION_TYPE, null, msgs);
			msgs = basicSetConnectionType(newConnectionType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENDPOINT__CONNECTION_TYPE, newConnectionType, newConnectionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.hl7.fhir.String newName, NotificationChain msgs) {
		org.hl7.fhir.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENDPOINT__NAME, oldName, newName);
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
	public void setName(org.hl7.fhir.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENDPOINT__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENDPOINT__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENDPOINT__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getManagingOrganization() {
		return managingOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManagingOrganization(Reference newManagingOrganization, NotificationChain msgs) {
		Reference oldManagingOrganization = managingOrganization;
		managingOrganization = newManagingOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENDPOINT__MANAGING_ORGANIZATION, oldManagingOrganization, newManagingOrganization);
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
	public void setManagingOrganization(Reference newManagingOrganization) {
		if (newManagingOrganization != managingOrganization) {
			NotificationChain msgs = null;
			if (managingOrganization != null)
				msgs = ((InternalEObject)managingOrganization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENDPOINT__MANAGING_ORGANIZATION, null, msgs);
			if (newManagingOrganization != null)
				msgs = ((InternalEObject)newManagingOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENDPOINT__MANAGING_ORGANIZATION, null, msgs);
			msgs = basicSetManagingOrganization(newManagingOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENDPOINT__MANAGING_ORGANIZATION, newManagingOrganization, newManagingOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactPoint> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<ContactPoint>(ContactPoint.class, this, FhirPackage.ENDPOINT__CONTACT);
		}
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(Period newPeriod, NotificationChain msgs) {
		Period oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENDPOINT__PERIOD, oldPeriod, newPeriod);
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
	public void setPeriod(Period newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENDPOINT__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENDPOINT__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENDPOINT__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getPayloadType() {
		if (payloadType == null) {
			payloadType = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.ENDPOINT__PAYLOAD_TYPE);
		}
		return payloadType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Code> getPayloadMimeType() {
		if (payloadMimeType == null) {
			payloadMimeType = new EObjectContainmentEList<Code>(Code.class, this, FhirPackage.ENDPOINT__PAYLOAD_MIME_TYPE);
		}
		return payloadMimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Url getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddress(Url newAddress, NotificationChain msgs) {
		Url oldAddress = address;
		address = newAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENDPOINT__ADDRESS, oldAddress, newAddress);
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
	public void setAddress(Url newAddress) {
		if (newAddress != address) {
			NotificationChain msgs = null;
			if (address != null)
				msgs = ((InternalEObject)address).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENDPOINT__ADDRESS, null, msgs);
			if (newAddress != null)
				msgs = ((InternalEObject)newAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENDPOINT__ADDRESS, null, msgs);
			msgs = basicSetAddress(newAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENDPOINT__ADDRESS, newAddress, newAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.hl7.fhir.String> getHeader() {
		if (header == null) {
			header = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.ENDPOINT__HEADER);
		}
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ENDPOINT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENDPOINT__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.ENDPOINT__CONNECTION_TYPE:
				return basicSetConnectionType(null, msgs);
			case FhirPackage.ENDPOINT__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.ENDPOINT__MANAGING_ORGANIZATION:
				return basicSetManagingOrganization(null, msgs);
			case FhirPackage.ENDPOINT__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENDPOINT__PERIOD:
				return basicSetPeriod(null, msgs);
			case FhirPackage.ENDPOINT__PAYLOAD_TYPE:
				return ((InternalEList<?>)getPayloadType()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENDPOINT__PAYLOAD_MIME_TYPE:
				return ((InternalEList<?>)getPayloadMimeType()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENDPOINT__ADDRESS:
				return basicSetAddress(null, msgs);
			case FhirPackage.ENDPOINT__HEADER:
				return ((InternalEList<?>)getHeader()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.ENDPOINT__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.ENDPOINT__STATUS:
				return getStatus();
			case FhirPackage.ENDPOINT__CONNECTION_TYPE:
				return getConnectionType();
			case FhirPackage.ENDPOINT__NAME:
				return getName();
			case FhirPackage.ENDPOINT__MANAGING_ORGANIZATION:
				return getManagingOrganization();
			case FhirPackage.ENDPOINT__CONTACT:
				return getContact();
			case FhirPackage.ENDPOINT__PERIOD:
				return getPeriod();
			case FhirPackage.ENDPOINT__PAYLOAD_TYPE:
				return getPayloadType();
			case FhirPackage.ENDPOINT__PAYLOAD_MIME_TYPE:
				return getPayloadMimeType();
			case FhirPackage.ENDPOINT__ADDRESS:
				return getAddress();
			case FhirPackage.ENDPOINT__HEADER:
				return getHeader();
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
			case FhirPackage.ENDPOINT__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.ENDPOINT__STATUS:
				setStatus((EndpointStatus)newValue);
				return;
			case FhirPackage.ENDPOINT__CONNECTION_TYPE:
				setConnectionType((Coding)newValue);
				return;
			case FhirPackage.ENDPOINT__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ENDPOINT__MANAGING_ORGANIZATION:
				setManagingOrganization((Reference)newValue);
				return;
			case FhirPackage.ENDPOINT__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends ContactPoint>)newValue);
				return;
			case FhirPackage.ENDPOINT__PERIOD:
				setPeriod((Period)newValue);
				return;
			case FhirPackage.ENDPOINT__PAYLOAD_TYPE:
				getPayloadType().clear();
				getPayloadType().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.ENDPOINT__PAYLOAD_MIME_TYPE:
				getPayloadMimeType().clear();
				getPayloadMimeType().addAll((Collection<? extends Code>)newValue);
				return;
			case FhirPackage.ENDPOINT__ADDRESS:
				setAddress((Url)newValue);
				return;
			case FhirPackage.ENDPOINT__HEADER:
				getHeader().clear();
				getHeader().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
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
			case FhirPackage.ENDPOINT__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.ENDPOINT__STATUS:
				setStatus((EndpointStatus)null);
				return;
			case FhirPackage.ENDPOINT__CONNECTION_TYPE:
				setConnectionType((Coding)null);
				return;
			case FhirPackage.ENDPOINT__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ENDPOINT__MANAGING_ORGANIZATION:
				setManagingOrganization((Reference)null);
				return;
			case FhirPackage.ENDPOINT__CONTACT:
				getContact().clear();
				return;
			case FhirPackage.ENDPOINT__PERIOD:
				setPeriod((Period)null);
				return;
			case FhirPackage.ENDPOINT__PAYLOAD_TYPE:
				getPayloadType().clear();
				return;
			case FhirPackage.ENDPOINT__PAYLOAD_MIME_TYPE:
				getPayloadMimeType().clear();
				return;
			case FhirPackage.ENDPOINT__ADDRESS:
				setAddress((Url)null);
				return;
			case FhirPackage.ENDPOINT__HEADER:
				getHeader().clear();
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
			case FhirPackage.ENDPOINT__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.ENDPOINT__STATUS:
				return status != null;
			case FhirPackage.ENDPOINT__CONNECTION_TYPE:
				return connectionType != null;
			case FhirPackage.ENDPOINT__NAME:
				return name != null;
			case FhirPackage.ENDPOINT__MANAGING_ORGANIZATION:
				return managingOrganization != null;
			case FhirPackage.ENDPOINT__CONTACT:
				return contact != null && !contact.isEmpty();
			case FhirPackage.ENDPOINT__PERIOD:
				return period != null;
			case FhirPackage.ENDPOINT__PAYLOAD_TYPE:
				return payloadType != null && !payloadType.isEmpty();
			case FhirPackage.ENDPOINT__PAYLOAD_MIME_TYPE:
				return payloadMimeType != null && !payloadMimeType.isEmpty();
			case FhirPackage.ENDPOINT__ADDRESS:
				return address != null;
			case FhirPackage.ENDPOINT__HEADER:
				return header != null && !header.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EndpointImpl
