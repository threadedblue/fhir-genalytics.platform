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

import org.hl7.fhir.Attachment;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.ContactPoint;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.HealthcareService;
import org.hl7.fhir.HealthcareServiceAvailableTime;
import org.hl7.fhir.HealthcareServiceEligibility;
import org.hl7.fhir.HealthcareServiceNotAvailable;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Healthcare Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getActive <em>Active</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getProvidedBy <em>Provided By</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getSpecialty <em>Specialty</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getExtraDetails <em>Extra Details</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getPhoto <em>Photo</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getTelecom <em>Telecom</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getCoverageArea <em>Coverage Area</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getServiceProvisionCode <em>Service Provision Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getEligibility <em>Eligibility</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getProgram <em>Program</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getCharacteristic <em>Characteristic</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getCommunication <em>Communication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getReferralMethod <em>Referral Method</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getAppointmentRequired <em>Appointment Required</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getAvailableTime <em>Available Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getNotAvailable <em>Not Available</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getAvailabilityExceptions <em>Availability Exceptions</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.HealthcareServiceImpl#getEndpoint <em>Endpoint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HealthcareServiceImpl extends DomainResourceImpl implements HealthcareService {
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
	 * The cached value of the '{@link #getActive() <em>Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean active;

	/**
	 * The cached value of the '{@link #getProvidedBy() <em>Provided By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedBy()
	 * @generated
	 * @ordered
	 */
	protected Reference providedBy;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> category;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> type;

	/**
	 * The cached value of the '{@link #getSpecialty() <em>Specialty</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialty()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> specialty;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> location;

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
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String comment;

	/**
	 * The cached value of the '{@link #getExtraDetails() <em>Extra Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraDetails()
	 * @generated
	 * @ordered
	 */
	protected Markdown extraDetails;

	/**
	 * The cached value of the '{@link #getPhoto() <em>Photo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoto()
	 * @generated
	 * @ordered
	 */
	protected Attachment photo;

	/**
	 * The cached value of the '{@link #getTelecom() <em>Telecom</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelecom()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactPoint> telecom;

	/**
	 * The cached value of the '{@link #getCoverageArea() <em>Coverage Area</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverageArea()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> coverageArea;

	/**
	 * The cached value of the '{@link #getServiceProvisionCode() <em>Service Provision Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceProvisionCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> serviceProvisionCode;

	/**
	 * The cached value of the '{@link #getEligibility() <em>Eligibility</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEligibility()
	 * @generated
	 * @ordered
	 */
	protected EList<HealthcareServiceEligibility> eligibility;

	/**
	 * The cached value of the '{@link #getProgram() <em>Program</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgram()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> program;

	/**
	 * The cached value of the '{@link #getCharacteristic() <em>Characteristic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristic()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> characteristic;

	/**
	 * The cached value of the '{@link #getCommunication() <em>Communication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunication()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> communication;

	/**
	 * The cached value of the '{@link #getReferralMethod() <em>Referral Method</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferralMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> referralMethod;

	/**
	 * The cached value of the '{@link #getAppointmentRequired() <em>Appointment Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppointmentRequired()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean appointmentRequired;

	/**
	 * The cached value of the '{@link #getAvailableTime() <em>Available Time</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableTime()
	 * @generated
	 * @ordered
	 */
	protected EList<HealthcareServiceAvailableTime> availableTime;

	/**
	 * The cached value of the '{@link #getNotAvailable() <em>Not Available</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotAvailable()
	 * @generated
	 * @ordered
	 */
	protected EList<HealthcareServiceNotAvailable> notAvailable;

	/**
	 * The cached value of the '{@link #getAvailabilityExceptions() <em>Availability Exceptions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilityExceptions()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String availabilityExceptions;

	/**
	 * The cached value of the '{@link #getEndpoint() <em>Endpoint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> endpoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HealthcareServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getHealthcareService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.HEALTHCARE_SERVICE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActive(org.hl7.fhir.Boolean newActive, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE__ACTIVE, oldActive, newActive);
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
	public void setActive(org.hl7.fhir.Boolean newActive) {
		if (newActive != active) {
			NotificationChain msgs = null;
			if (active != null)
				msgs = ((InternalEObject)active).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE__ACTIVE, null, msgs);
			if (newActive != null)
				msgs = ((InternalEObject)newActive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE__ACTIVE, null, msgs);
			msgs = basicSetActive(newActive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE__ACTIVE, newActive, newActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getProvidedBy() {
		return providedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvidedBy(Reference newProvidedBy, NotificationChain msgs) {
		Reference oldProvidedBy = providedBy;
		providedBy = newProvidedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE__PROVIDED_BY, oldProvidedBy, newProvidedBy);
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
	public void setProvidedBy(Reference newProvidedBy) {
		if (newProvidedBy != providedBy) {
			NotificationChain msgs = null;
			if (providedBy != null)
				msgs = ((InternalEObject)providedBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE__PROVIDED_BY, null, msgs);
			if (newProvidedBy != null)
				msgs = ((InternalEObject)newProvidedBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE__PROVIDED_BY, null, msgs);
			msgs = basicSetProvidedBy(newProvidedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE__PROVIDED_BY, newProvidedBy, newProvidedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.HEALTHCARE_SERVICE__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getType() {
		if (type == null) {
			type = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.HEALTHCARE_SERVICE__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getSpecialty() {
		if (specialty == null) {
			specialty = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.HEALTHCARE_SERVICE__SPECIALTY);
		}
		return specialty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getLocation() {
		if (location == null) {
			location = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.HEALTHCARE_SERVICE__LOCATION);
		}
		return location;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComment(org.hl7.fhir.String newComment, NotificationChain msgs) {
		org.hl7.fhir.String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE__COMMENT, oldComment, newComment);
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
	public void setComment(org.hl7.fhir.String newComment) {
		if (newComment != comment) {
			NotificationChain msgs = null;
			if (comment != null)
				msgs = ((InternalEObject)comment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE__COMMENT, null, msgs);
			if (newComment != null)
				msgs = ((InternalEObject)newComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE__COMMENT, null, msgs);
			msgs = basicSetComment(newComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE__COMMENT, newComment, newComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getExtraDetails() {
		return extraDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtraDetails(Markdown newExtraDetails, NotificationChain msgs) {
		Markdown oldExtraDetails = extraDetails;
		extraDetails = newExtraDetails;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE__EXTRA_DETAILS, oldExtraDetails, newExtraDetails);
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
	public void setExtraDetails(Markdown newExtraDetails) {
		if (newExtraDetails != extraDetails) {
			NotificationChain msgs = null;
			if (extraDetails != null)
				msgs = ((InternalEObject)extraDetails).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE__EXTRA_DETAILS, null, msgs);
			if (newExtraDetails != null)
				msgs = ((InternalEObject)newExtraDetails).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE__EXTRA_DETAILS, null, msgs);
			msgs = basicSetExtraDetails(newExtraDetails, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE__EXTRA_DETAILS, newExtraDetails, newExtraDetails));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attachment getPhoto() {
		return photo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhoto(Attachment newPhoto, NotificationChain msgs) {
		Attachment oldPhoto = photo;
		photo = newPhoto;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE__PHOTO, oldPhoto, newPhoto);
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
	public void setPhoto(Attachment newPhoto) {
		if (newPhoto != photo) {
			NotificationChain msgs = null;
			if (photo != null)
				msgs = ((InternalEObject)photo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE__PHOTO, null, msgs);
			if (newPhoto != null)
				msgs = ((InternalEObject)newPhoto).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE__PHOTO, null, msgs);
			msgs = basicSetPhoto(newPhoto, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE__PHOTO, newPhoto, newPhoto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactPoint> getTelecom() {
		if (telecom == null) {
			telecom = new EObjectContainmentEList<ContactPoint>(ContactPoint.class, this, FhirPackage.HEALTHCARE_SERVICE__TELECOM);
		}
		return telecom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getCoverageArea() {
		if (coverageArea == null) {
			coverageArea = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.HEALTHCARE_SERVICE__COVERAGE_AREA);
		}
		return coverageArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getServiceProvisionCode() {
		if (serviceProvisionCode == null) {
			serviceProvisionCode = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.HEALTHCARE_SERVICE__SERVICE_PROVISION_CODE);
		}
		return serviceProvisionCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HealthcareServiceEligibility> getEligibility() {
		if (eligibility == null) {
			eligibility = new EObjectContainmentEList<HealthcareServiceEligibility>(HealthcareServiceEligibility.class, this, FhirPackage.HEALTHCARE_SERVICE__ELIGIBILITY);
		}
		return eligibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getProgram() {
		if (program == null) {
			program = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.HEALTHCARE_SERVICE__PROGRAM);
		}
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCharacteristic() {
		if (characteristic == null) {
			characteristic = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.HEALTHCARE_SERVICE__CHARACTERISTIC);
		}
		return characteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCommunication() {
		if (communication == null) {
			communication = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.HEALTHCARE_SERVICE__COMMUNICATION);
		}
		return communication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getReferralMethod() {
		if (referralMethod == null) {
			referralMethod = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.HEALTHCARE_SERVICE__REFERRAL_METHOD);
		}
		return referralMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getAppointmentRequired() {
		return appointmentRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppointmentRequired(org.hl7.fhir.Boolean newAppointmentRequired, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldAppointmentRequired = appointmentRequired;
		appointmentRequired = newAppointmentRequired;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE__APPOINTMENT_REQUIRED, oldAppointmentRequired, newAppointmentRequired);
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
	public void setAppointmentRequired(org.hl7.fhir.Boolean newAppointmentRequired) {
		if (newAppointmentRequired != appointmentRequired) {
			NotificationChain msgs = null;
			if (appointmentRequired != null)
				msgs = ((InternalEObject)appointmentRequired).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE__APPOINTMENT_REQUIRED, null, msgs);
			if (newAppointmentRequired != null)
				msgs = ((InternalEObject)newAppointmentRequired).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE__APPOINTMENT_REQUIRED, null, msgs);
			msgs = basicSetAppointmentRequired(newAppointmentRequired, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE__APPOINTMENT_REQUIRED, newAppointmentRequired, newAppointmentRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HealthcareServiceAvailableTime> getAvailableTime() {
		if (availableTime == null) {
			availableTime = new EObjectContainmentEList<HealthcareServiceAvailableTime>(HealthcareServiceAvailableTime.class, this, FhirPackage.HEALTHCARE_SERVICE__AVAILABLE_TIME);
		}
		return availableTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HealthcareServiceNotAvailable> getNotAvailable() {
		if (notAvailable == null) {
			notAvailable = new EObjectContainmentEList<HealthcareServiceNotAvailable>(HealthcareServiceNotAvailable.class, this, FhirPackage.HEALTHCARE_SERVICE__NOT_AVAILABLE);
		}
		return notAvailable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getAvailabilityExceptions() {
		return availabilityExceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAvailabilityExceptions(org.hl7.fhir.String newAvailabilityExceptions, NotificationChain msgs) {
		org.hl7.fhir.String oldAvailabilityExceptions = availabilityExceptions;
		availabilityExceptions = newAvailabilityExceptions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE__AVAILABILITY_EXCEPTIONS, oldAvailabilityExceptions, newAvailabilityExceptions);
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
	public void setAvailabilityExceptions(org.hl7.fhir.String newAvailabilityExceptions) {
		if (newAvailabilityExceptions != availabilityExceptions) {
			NotificationChain msgs = null;
			if (availabilityExceptions != null)
				msgs = ((InternalEObject)availabilityExceptions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE__AVAILABILITY_EXCEPTIONS, null, msgs);
			if (newAvailabilityExceptions != null)
				msgs = ((InternalEObject)newAvailabilityExceptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.HEALTHCARE_SERVICE__AVAILABILITY_EXCEPTIONS, null, msgs);
			msgs = basicSetAvailabilityExceptions(newAvailabilityExceptions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.HEALTHCARE_SERVICE__AVAILABILITY_EXCEPTIONS, newAvailabilityExceptions, newAvailabilityExceptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getEndpoint() {
		if (endpoint == null) {
			endpoint = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.HEALTHCARE_SERVICE__ENDPOINT);
		}
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.HEALTHCARE_SERVICE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.HEALTHCARE_SERVICE__ACTIVE:
				return basicSetActive(null, msgs);
			case FhirPackage.HEALTHCARE_SERVICE__PROVIDED_BY:
				return basicSetProvidedBy(null, msgs);
			case FhirPackage.HEALTHCARE_SERVICE__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case FhirPackage.HEALTHCARE_SERVICE__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case FhirPackage.HEALTHCARE_SERVICE__SPECIALTY:
				return ((InternalEList<?>)getSpecialty()).basicRemove(otherEnd, msgs);
			case FhirPackage.HEALTHCARE_SERVICE__LOCATION:
				return ((InternalEList<?>)getLocation()).basicRemove(otherEnd, msgs);
			case FhirPackage.HEALTHCARE_SERVICE__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.HEALTHCARE_SERVICE__COMMENT:
				return basicSetComment(null, msgs);
			case FhirPackage.HEALTHCARE_SERVICE__EXTRA_DETAILS:
				return basicSetExtraDetails(null, msgs);
			case FhirPackage.HEALTHCARE_SERVICE__PHOTO:
				return basicSetPhoto(null, msgs);
			case FhirPackage.HEALTHCARE_SERVICE__TELECOM:
				return ((InternalEList<?>)getTelecom()).basicRemove(otherEnd, msgs);
			case FhirPackage.HEALTHCARE_SERVICE__COVERAGE_AREA:
				return ((InternalEList<?>)getCoverageArea()).basicRemove(otherEnd, msgs);
			case FhirPackage.HEALTHCARE_SERVICE__SERVICE_PROVISION_CODE:
				return ((InternalEList<?>)getServiceProvisionCode()).basicRemove(otherEnd, msgs);
			case FhirPackage.HEALTHCARE_SERVICE__ELIGIBILITY:
				return ((InternalEList<?>)getEligibility()).basicRemove(otherEnd, msgs);
			case FhirPackage.HEALTHCARE_SERVICE__PROGRAM:
				return ((InternalEList<?>)getProgram()).basicRemove(otherEnd, msgs);
			case FhirPackage.HEALTHCARE_SERVICE__CHARACTERISTIC:
				return ((InternalEList<?>)getCharacteristic()).basicRemove(otherEnd, msgs);
			case FhirPackage.HEALTHCARE_SERVICE__COMMUNICATION:
				return ((InternalEList<?>)getCommunication()).basicRemove(otherEnd, msgs);
			case FhirPackage.HEALTHCARE_SERVICE__REFERRAL_METHOD:
				return ((InternalEList<?>)getReferralMethod()).basicRemove(otherEnd, msgs);
			case FhirPackage.HEALTHCARE_SERVICE__APPOINTMENT_REQUIRED:
				return basicSetAppointmentRequired(null, msgs);
			case FhirPackage.HEALTHCARE_SERVICE__AVAILABLE_TIME:
				return ((InternalEList<?>)getAvailableTime()).basicRemove(otherEnd, msgs);
			case FhirPackage.HEALTHCARE_SERVICE__NOT_AVAILABLE:
				return ((InternalEList<?>)getNotAvailable()).basicRemove(otherEnd, msgs);
			case FhirPackage.HEALTHCARE_SERVICE__AVAILABILITY_EXCEPTIONS:
				return basicSetAvailabilityExceptions(null, msgs);
			case FhirPackage.HEALTHCARE_SERVICE__ENDPOINT:
				return ((InternalEList<?>)getEndpoint()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.HEALTHCARE_SERVICE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.HEALTHCARE_SERVICE__ACTIVE:
				return getActive();
			case FhirPackage.HEALTHCARE_SERVICE__PROVIDED_BY:
				return getProvidedBy();
			case FhirPackage.HEALTHCARE_SERVICE__CATEGORY:
				return getCategory();
			case FhirPackage.HEALTHCARE_SERVICE__TYPE:
				return getType();
			case FhirPackage.HEALTHCARE_SERVICE__SPECIALTY:
				return getSpecialty();
			case FhirPackage.HEALTHCARE_SERVICE__LOCATION:
				return getLocation();
			case FhirPackage.HEALTHCARE_SERVICE__NAME:
				return getName();
			case FhirPackage.HEALTHCARE_SERVICE__COMMENT:
				return getComment();
			case FhirPackage.HEALTHCARE_SERVICE__EXTRA_DETAILS:
				return getExtraDetails();
			case FhirPackage.HEALTHCARE_SERVICE__PHOTO:
				return getPhoto();
			case FhirPackage.HEALTHCARE_SERVICE__TELECOM:
				return getTelecom();
			case FhirPackage.HEALTHCARE_SERVICE__COVERAGE_AREA:
				return getCoverageArea();
			case FhirPackage.HEALTHCARE_SERVICE__SERVICE_PROVISION_CODE:
				return getServiceProvisionCode();
			case FhirPackage.HEALTHCARE_SERVICE__ELIGIBILITY:
				return getEligibility();
			case FhirPackage.HEALTHCARE_SERVICE__PROGRAM:
				return getProgram();
			case FhirPackage.HEALTHCARE_SERVICE__CHARACTERISTIC:
				return getCharacteristic();
			case FhirPackage.HEALTHCARE_SERVICE__COMMUNICATION:
				return getCommunication();
			case FhirPackage.HEALTHCARE_SERVICE__REFERRAL_METHOD:
				return getReferralMethod();
			case FhirPackage.HEALTHCARE_SERVICE__APPOINTMENT_REQUIRED:
				return getAppointmentRequired();
			case FhirPackage.HEALTHCARE_SERVICE__AVAILABLE_TIME:
				return getAvailableTime();
			case FhirPackage.HEALTHCARE_SERVICE__NOT_AVAILABLE:
				return getNotAvailable();
			case FhirPackage.HEALTHCARE_SERVICE__AVAILABILITY_EXCEPTIONS:
				return getAvailabilityExceptions();
			case FhirPackage.HEALTHCARE_SERVICE__ENDPOINT:
				return getEndpoint();
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
			case FhirPackage.HEALTHCARE_SERVICE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__ACTIVE:
				setActive((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__PROVIDED_BY:
				setProvidedBy((Reference)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__SPECIALTY:
				getSpecialty().clear();
				getSpecialty().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__LOCATION:
				getLocation().clear();
				getLocation().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__COMMENT:
				setComment((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__EXTRA_DETAILS:
				setExtraDetails((Markdown)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__PHOTO:
				setPhoto((Attachment)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__TELECOM:
				getTelecom().clear();
				getTelecom().addAll((Collection<? extends ContactPoint>)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__COVERAGE_AREA:
				getCoverageArea().clear();
				getCoverageArea().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__SERVICE_PROVISION_CODE:
				getServiceProvisionCode().clear();
				getServiceProvisionCode().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__ELIGIBILITY:
				getEligibility().clear();
				getEligibility().addAll((Collection<? extends HealthcareServiceEligibility>)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__PROGRAM:
				getProgram().clear();
				getProgram().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__CHARACTERISTIC:
				getCharacteristic().clear();
				getCharacteristic().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__COMMUNICATION:
				getCommunication().clear();
				getCommunication().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__REFERRAL_METHOD:
				getReferralMethod().clear();
				getReferralMethod().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__APPOINTMENT_REQUIRED:
				setAppointmentRequired((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__AVAILABLE_TIME:
				getAvailableTime().clear();
				getAvailableTime().addAll((Collection<? extends HealthcareServiceAvailableTime>)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__NOT_AVAILABLE:
				getNotAvailable().clear();
				getNotAvailable().addAll((Collection<? extends HealthcareServiceNotAvailable>)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__AVAILABILITY_EXCEPTIONS:
				setAvailabilityExceptions((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__ENDPOINT:
				getEndpoint().clear();
				getEndpoint().addAll((Collection<? extends Reference>)newValue);
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
			case FhirPackage.HEALTHCARE_SERVICE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.HEALTHCARE_SERVICE__ACTIVE:
				setActive((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__PROVIDED_BY:
				setProvidedBy((Reference)null);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__CATEGORY:
				getCategory().clear();
				return;
			case FhirPackage.HEALTHCARE_SERVICE__TYPE:
				getType().clear();
				return;
			case FhirPackage.HEALTHCARE_SERVICE__SPECIALTY:
				getSpecialty().clear();
				return;
			case FhirPackage.HEALTHCARE_SERVICE__LOCATION:
				getLocation().clear();
				return;
			case FhirPackage.HEALTHCARE_SERVICE__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__COMMENT:
				setComment((org.hl7.fhir.String)null);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__EXTRA_DETAILS:
				setExtraDetails((Markdown)null);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__PHOTO:
				setPhoto((Attachment)null);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__TELECOM:
				getTelecom().clear();
				return;
			case FhirPackage.HEALTHCARE_SERVICE__COVERAGE_AREA:
				getCoverageArea().clear();
				return;
			case FhirPackage.HEALTHCARE_SERVICE__SERVICE_PROVISION_CODE:
				getServiceProvisionCode().clear();
				return;
			case FhirPackage.HEALTHCARE_SERVICE__ELIGIBILITY:
				getEligibility().clear();
				return;
			case FhirPackage.HEALTHCARE_SERVICE__PROGRAM:
				getProgram().clear();
				return;
			case FhirPackage.HEALTHCARE_SERVICE__CHARACTERISTIC:
				getCharacteristic().clear();
				return;
			case FhirPackage.HEALTHCARE_SERVICE__COMMUNICATION:
				getCommunication().clear();
				return;
			case FhirPackage.HEALTHCARE_SERVICE__REFERRAL_METHOD:
				getReferralMethod().clear();
				return;
			case FhirPackage.HEALTHCARE_SERVICE__APPOINTMENT_REQUIRED:
				setAppointmentRequired((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__AVAILABLE_TIME:
				getAvailableTime().clear();
				return;
			case FhirPackage.HEALTHCARE_SERVICE__NOT_AVAILABLE:
				getNotAvailable().clear();
				return;
			case FhirPackage.HEALTHCARE_SERVICE__AVAILABILITY_EXCEPTIONS:
				setAvailabilityExceptions((org.hl7.fhir.String)null);
				return;
			case FhirPackage.HEALTHCARE_SERVICE__ENDPOINT:
				getEndpoint().clear();
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
			case FhirPackage.HEALTHCARE_SERVICE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.HEALTHCARE_SERVICE__ACTIVE:
				return active != null;
			case FhirPackage.HEALTHCARE_SERVICE__PROVIDED_BY:
				return providedBy != null;
			case FhirPackage.HEALTHCARE_SERVICE__CATEGORY:
				return category != null && !category.isEmpty();
			case FhirPackage.HEALTHCARE_SERVICE__TYPE:
				return type != null && !type.isEmpty();
			case FhirPackage.HEALTHCARE_SERVICE__SPECIALTY:
				return specialty != null && !specialty.isEmpty();
			case FhirPackage.HEALTHCARE_SERVICE__LOCATION:
				return location != null && !location.isEmpty();
			case FhirPackage.HEALTHCARE_SERVICE__NAME:
				return name != null;
			case FhirPackage.HEALTHCARE_SERVICE__COMMENT:
				return comment != null;
			case FhirPackage.HEALTHCARE_SERVICE__EXTRA_DETAILS:
				return extraDetails != null;
			case FhirPackage.HEALTHCARE_SERVICE__PHOTO:
				return photo != null;
			case FhirPackage.HEALTHCARE_SERVICE__TELECOM:
				return telecom != null && !telecom.isEmpty();
			case FhirPackage.HEALTHCARE_SERVICE__COVERAGE_AREA:
				return coverageArea != null && !coverageArea.isEmpty();
			case FhirPackage.HEALTHCARE_SERVICE__SERVICE_PROVISION_CODE:
				return serviceProvisionCode != null && !serviceProvisionCode.isEmpty();
			case FhirPackage.HEALTHCARE_SERVICE__ELIGIBILITY:
				return eligibility != null && !eligibility.isEmpty();
			case FhirPackage.HEALTHCARE_SERVICE__PROGRAM:
				return program != null && !program.isEmpty();
			case FhirPackage.HEALTHCARE_SERVICE__CHARACTERISTIC:
				return characteristic != null && !characteristic.isEmpty();
			case FhirPackage.HEALTHCARE_SERVICE__COMMUNICATION:
				return communication != null && !communication.isEmpty();
			case FhirPackage.HEALTHCARE_SERVICE__REFERRAL_METHOD:
				return referralMethod != null && !referralMethod.isEmpty();
			case FhirPackage.HEALTHCARE_SERVICE__APPOINTMENT_REQUIRED:
				return appointmentRequired != null;
			case FhirPackage.HEALTHCARE_SERVICE__AVAILABLE_TIME:
				return availableTime != null && !availableTime.isEmpty();
			case FhirPackage.HEALTHCARE_SERVICE__NOT_AVAILABLE:
				return notAvailable != null && !notAvailable.isEmpty();
			case FhirPackage.HEALTHCARE_SERVICE__AVAILABILITY_EXCEPTIONS:
				return availabilityExceptions != null;
			case FhirPackage.HEALTHCARE_SERVICE__ENDPOINT:
				return endpoint != null && !endpoint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HealthcareServiceImpl
