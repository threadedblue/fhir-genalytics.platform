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
import org.hl7.fhir.BodyStructure;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.BodyStructureImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.BodyStructureImpl#getActive <em>Active</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.BodyStructureImpl#getMorphology <em>Morphology</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.BodyStructureImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.BodyStructureImpl#getLocationQualifier <em>Location Qualifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.BodyStructureImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.BodyStructureImpl#getImage <em>Image</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.BodyStructureImpl#getPatient <em>Patient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BodyStructureImpl extends DomainResourceImpl implements BodyStructure {
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
	 * The cached value of the '{@link #getMorphology() <em>Morphology</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMorphology()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept morphology;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept location;

	/**
	 * The cached value of the '{@link #getLocationQualifier() <em>Location Qualifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> locationQualifier;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String description;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachment> image;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BodyStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getBodyStructure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.BODY_STRUCTURE__IDENTIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BODY_STRUCTURE__ACTIVE, oldActive, newActive);
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
				msgs = ((InternalEObject)active).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BODY_STRUCTURE__ACTIVE, null, msgs);
			if (newActive != null)
				msgs = ((InternalEObject)newActive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BODY_STRUCTURE__ACTIVE, null, msgs);
			msgs = basicSetActive(newActive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BODY_STRUCTURE__ACTIVE, newActive, newActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getMorphology() {
		return morphology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMorphology(CodeableConcept newMorphology, NotificationChain msgs) {
		CodeableConcept oldMorphology = morphology;
		morphology = newMorphology;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BODY_STRUCTURE__MORPHOLOGY, oldMorphology, newMorphology);
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
	public void setMorphology(CodeableConcept newMorphology) {
		if (newMorphology != morphology) {
			NotificationChain msgs = null;
			if (morphology != null)
				msgs = ((InternalEObject)morphology).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BODY_STRUCTURE__MORPHOLOGY, null, msgs);
			if (newMorphology != null)
				msgs = ((InternalEObject)newMorphology).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BODY_STRUCTURE__MORPHOLOGY, null, msgs);
			msgs = basicSetMorphology(newMorphology, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BODY_STRUCTURE__MORPHOLOGY, newMorphology, newMorphology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(CodeableConcept newLocation, NotificationChain msgs) {
		CodeableConcept oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BODY_STRUCTURE__LOCATION, oldLocation, newLocation);
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
	public void setLocation(CodeableConcept newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BODY_STRUCTURE__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BODY_STRUCTURE__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BODY_STRUCTURE__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getLocationQualifier() {
		if (locationQualifier == null) {
			locationQualifier = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.BODY_STRUCTURE__LOCATION_QUALIFIER);
		}
		return locationQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.hl7.fhir.String newDescription, NotificationChain msgs) {
		org.hl7.fhir.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BODY_STRUCTURE__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(org.hl7.fhir.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BODY_STRUCTURE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BODY_STRUCTURE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BODY_STRUCTURE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attachment> getImage() {
		if (image == null) {
			image = new EObjectContainmentEList<Attachment>(Attachment.class, this, FhirPackage.BODY_STRUCTURE__IMAGE);
		}
		return image;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BODY_STRUCTURE__PATIENT, oldPatient, newPatient);
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
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BODY_STRUCTURE__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BODY_STRUCTURE__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BODY_STRUCTURE__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.BODY_STRUCTURE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.BODY_STRUCTURE__ACTIVE:
				return basicSetActive(null, msgs);
			case FhirPackage.BODY_STRUCTURE__MORPHOLOGY:
				return basicSetMorphology(null, msgs);
			case FhirPackage.BODY_STRUCTURE__LOCATION:
				return basicSetLocation(null, msgs);
			case FhirPackage.BODY_STRUCTURE__LOCATION_QUALIFIER:
				return ((InternalEList<?>)getLocationQualifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.BODY_STRUCTURE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.BODY_STRUCTURE__IMAGE:
				return ((InternalEList<?>)getImage()).basicRemove(otherEnd, msgs);
			case FhirPackage.BODY_STRUCTURE__PATIENT:
				return basicSetPatient(null, msgs);
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
			case FhirPackage.BODY_STRUCTURE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.BODY_STRUCTURE__ACTIVE:
				return getActive();
			case FhirPackage.BODY_STRUCTURE__MORPHOLOGY:
				return getMorphology();
			case FhirPackage.BODY_STRUCTURE__LOCATION:
				return getLocation();
			case FhirPackage.BODY_STRUCTURE__LOCATION_QUALIFIER:
				return getLocationQualifier();
			case FhirPackage.BODY_STRUCTURE__DESCRIPTION:
				return getDescription();
			case FhirPackage.BODY_STRUCTURE__IMAGE:
				return getImage();
			case FhirPackage.BODY_STRUCTURE__PATIENT:
				return getPatient();
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
			case FhirPackage.BODY_STRUCTURE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.BODY_STRUCTURE__ACTIVE:
				setActive((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.BODY_STRUCTURE__MORPHOLOGY:
				setMorphology((CodeableConcept)newValue);
				return;
			case FhirPackage.BODY_STRUCTURE__LOCATION:
				setLocation((CodeableConcept)newValue);
				return;
			case FhirPackage.BODY_STRUCTURE__LOCATION_QUALIFIER:
				getLocationQualifier().clear();
				getLocationQualifier().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.BODY_STRUCTURE__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.BODY_STRUCTURE__IMAGE:
				getImage().clear();
				getImage().addAll((Collection<? extends Attachment>)newValue);
				return;
			case FhirPackage.BODY_STRUCTURE__PATIENT:
				setPatient((Reference)newValue);
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
			case FhirPackage.BODY_STRUCTURE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.BODY_STRUCTURE__ACTIVE:
				setActive((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.BODY_STRUCTURE__MORPHOLOGY:
				setMorphology((CodeableConcept)null);
				return;
			case FhirPackage.BODY_STRUCTURE__LOCATION:
				setLocation((CodeableConcept)null);
				return;
			case FhirPackage.BODY_STRUCTURE__LOCATION_QUALIFIER:
				getLocationQualifier().clear();
				return;
			case FhirPackage.BODY_STRUCTURE__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.BODY_STRUCTURE__IMAGE:
				getImage().clear();
				return;
			case FhirPackage.BODY_STRUCTURE__PATIENT:
				setPatient((Reference)null);
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
			case FhirPackage.BODY_STRUCTURE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.BODY_STRUCTURE__ACTIVE:
				return active != null;
			case FhirPackage.BODY_STRUCTURE__MORPHOLOGY:
				return morphology != null;
			case FhirPackage.BODY_STRUCTURE__LOCATION:
				return location != null;
			case FhirPackage.BODY_STRUCTURE__LOCATION_QUALIFIER:
				return locationQualifier != null && !locationQualifier.isEmpty();
			case FhirPackage.BODY_STRUCTURE__DESCRIPTION:
				return description != null;
			case FhirPackage.BODY_STRUCTURE__IMAGE:
				return image != null && !image.isEmpty();
			case FhirPackage.BODY_STRUCTURE__PATIENT:
				return patient != null;
		}
		return super.eIsSet(featureID);
	}

} //BodyStructureImpl
