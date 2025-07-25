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

import org.hl7.fhir.Coding;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Id;
import org.hl7.fhir.ImagingStudyInstance;
import org.hl7.fhir.ImagingStudyPerformer;
import org.hl7.fhir.ImagingStudySeries;
import org.hl7.fhir.Reference;
import org.hl7.fhir.UnsignedInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imaging Study Series</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudySeriesImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudySeriesImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudySeriesImpl#getModality <em>Modality</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudySeriesImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudySeriesImpl#getNumberOfInstances <em>Number Of Instances</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudySeriesImpl#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudySeriesImpl#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudySeriesImpl#getLaterality <em>Laterality</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudySeriesImpl#getSpecimen <em>Specimen</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudySeriesImpl#getStarted <em>Started</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudySeriesImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudySeriesImpl#getInstance <em>Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImagingStudySeriesImpl extends BackboneElementImpl implements ImagingStudySeries {
	/**
	 * The cached value of the '{@link #getUid() <em>Uid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected Id uid;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt number;

	/**
	 * The cached value of the '{@link #getModality() <em>Modality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModality()
	 * @generated
	 * @ordered
	 */
	protected Coding modality;

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
	 * The cached value of the '{@link #getNumberOfInstances() <em>Number Of Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfInstances()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt numberOfInstances;

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
	 * The cached value of the '{@link #getBodySite() <em>Body Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySite()
	 * @generated
	 * @ordered
	 */
	protected Coding bodySite;

	/**
	 * The cached value of the '{@link #getLaterality() <em>Laterality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaterality()
	 * @generated
	 * @ordered
	 */
	protected Coding laterality;

	/**
	 * The cached value of the '{@link #getSpecimen() <em>Specimen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimen()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> specimen;

	/**
	 * The cached value of the '{@link #getStarted() <em>Started</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStarted()
	 * @generated
	 * @ordered
	 */
	protected DateTime started;

	/**
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected EList<ImagingStudyPerformer> performer;

	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<ImagingStudyInstance> instance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImagingStudySeriesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getImagingStudySeries();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Id getUid() {
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUid(Id newUid, NotificationChain msgs) {
		Id oldUid = uid;
		uid = newUid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_SERIES__UID, oldUid, newUid);
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
	public void setUid(Id newUid) {
		if (newUid != uid) {
			NotificationChain msgs = null;
			if (uid != null)
				msgs = ((InternalEObject)uid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_SERIES__UID, null, msgs);
			if (newUid != null)
				msgs = ((InternalEObject)newUid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_SERIES__UID, null, msgs);
			msgs = basicSetUid(newUid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_SERIES__UID, newUid, newUid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnsignedInt getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumber(UnsignedInt newNumber, NotificationChain msgs) {
		UnsignedInt oldNumber = number;
		number = newNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_SERIES__NUMBER, oldNumber, newNumber);
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
	public void setNumber(UnsignedInt newNumber) {
		if (newNumber != number) {
			NotificationChain msgs = null;
			if (number != null)
				msgs = ((InternalEObject)number).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_SERIES__NUMBER, null, msgs);
			if (newNumber != null)
				msgs = ((InternalEObject)newNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_SERIES__NUMBER, null, msgs);
			msgs = basicSetNumber(newNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_SERIES__NUMBER, newNumber, newNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coding getModality() {
		return modality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModality(Coding newModality, NotificationChain msgs) {
		Coding oldModality = modality;
		modality = newModality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_SERIES__MODALITY, oldModality, newModality);
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
	public void setModality(Coding newModality) {
		if (newModality != modality) {
			NotificationChain msgs = null;
			if (modality != null)
				msgs = ((InternalEObject)modality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_SERIES__MODALITY, null, msgs);
			if (newModality != null)
				msgs = ((InternalEObject)newModality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_SERIES__MODALITY, null, msgs);
			msgs = basicSetModality(newModality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_SERIES__MODALITY, newModality, newModality));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_SERIES__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_SERIES__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_SERIES__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_SERIES__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnsignedInt getNumberOfInstances() {
		return numberOfInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberOfInstances(UnsignedInt newNumberOfInstances, NotificationChain msgs) {
		UnsignedInt oldNumberOfInstances = numberOfInstances;
		numberOfInstances = newNumberOfInstances;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_SERIES__NUMBER_OF_INSTANCES, oldNumberOfInstances, newNumberOfInstances);
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
	public void setNumberOfInstances(UnsignedInt newNumberOfInstances) {
		if (newNumberOfInstances != numberOfInstances) {
			NotificationChain msgs = null;
			if (numberOfInstances != null)
				msgs = ((InternalEObject)numberOfInstances).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_SERIES__NUMBER_OF_INSTANCES, null, msgs);
			if (newNumberOfInstances != null)
				msgs = ((InternalEObject)newNumberOfInstances).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_SERIES__NUMBER_OF_INSTANCES, null, msgs);
			msgs = basicSetNumberOfInstances(newNumberOfInstances, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_SERIES__NUMBER_OF_INSTANCES, newNumberOfInstances, newNumberOfInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getEndpoint() {
		if (endpoint == null) {
			endpoint = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.IMAGING_STUDY_SERIES__ENDPOINT);
		}
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coding getBodySite() {
		return bodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBodySite(Coding newBodySite, NotificationChain msgs) {
		Coding oldBodySite = bodySite;
		bodySite = newBodySite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_SERIES__BODY_SITE, oldBodySite, newBodySite);
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
	public void setBodySite(Coding newBodySite) {
		if (newBodySite != bodySite) {
			NotificationChain msgs = null;
			if (bodySite != null)
				msgs = ((InternalEObject)bodySite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_SERIES__BODY_SITE, null, msgs);
			if (newBodySite != null)
				msgs = ((InternalEObject)newBodySite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_SERIES__BODY_SITE, null, msgs);
			msgs = basicSetBodySite(newBodySite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_SERIES__BODY_SITE, newBodySite, newBodySite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coding getLaterality() {
		return laterality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLaterality(Coding newLaterality, NotificationChain msgs) {
		Coding oldLaterality = laterality;
		laterality = newLaterality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_SERIES__LATERALITY, oldLaterality, newLaterality);
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
	public void setLaterality(Coding newLaterality) {
		if (newLaterality != laterality) {
			NotificationChain msgs = null;
			if (laterality != null)
				msgs = ((InternalEObject)laterality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_SERIES__LATERALITY, null, msgs);
			if (newLaterality != null)
				msgs = ((InternalEObject)newLaterality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_SERIES__LATERALITY, null, msgs);
			msgs = basicSetLaterality(newLaterality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_SERIES__LATERALITY, newLaterality, newLaterality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSpecimen() {
		if (specimen == null) {
			specimen = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.IMAGING_STUDY_SERIES__SPECIMEN);
		}
		return specimen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getStarted() {
		return started;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStarted(DateTime newStarted, NotificationChain msgs) {
		DateTime oldStarted = started;
		started = newStarted;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_SERIES__STARTED, oldStarted, newStarted);
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
	public void setStarted(DateTime newStarted) {
		if (newStarted != started) {
			NotificationChain msgs = null;
			if (started != null)
				msgs = ((InternalEObject)started).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_SERIES__STARTED, null, msgs);
			if (newStarted != null)
				msgs = ((InternalEObject)newStarted).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_SERIES__STARTED, null, msgs);
			msgs = basicSetStarted(newStarted, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_SERIES__STARTED, newStarted, newStarted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImagingStudyPerformer> getPerformer() {
		if (performer == null) {
			performer = new EObjectContainmentEList<ImagingStudyPerformer>(ImagingStudyPerformer.class, this, FhirPackage.IMAGING_STUDY_SERIES__PERFORMER);
		}
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImagingStudyInstance> getInstance() {
		if (instance == null) {
			instance = new EObjectContainmentEList<ImagingStudyInstance>(ImagingStudyInstance.class, this, FhirPackage.IMAGING_STUDY_SERIES__INSTANCE);
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.IMAGING_STUDY_SERIES__UID:
				return basicSetUid(null, msgs);
			case FhirPackage.IMAGING_STUDY_SERIES__NUMBER:
				return basicSetNumber(null, msgs);
			case FhirPackage.IMAGING_STUDY_SERIES__MODALITY:
				return basicSetModality(null, msgs);
			case FhirPackage.IMAGING_STUDY_SERIES__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.IMAGING_STUDY_SERIES__NUMBER_OF_INSTANCES:
				return basicSetNumberOfInstances(null, msgs);
			case FhirPackage.IMAGING_STUDY_SERIES__ENDPOINT:
				return ((InternalEList<?>)getEndpoint()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMAGING_STUDY_SERIES__BODY_SITE:
				return basicSetBodySite(null, msgs);
			case FhirPackage.IMAGING_STUDY_SERIES__LATERALITY:
				return basicSetLaterality(null, msgs);
			case FhirPackage.IMAGING_STUDY_SERIES__SPECIMEN:
				return ((InternalEList<?>)getSpecimen()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMAGING_STUDY_SERIES__STARTED:
				return basicSetStarted(null, msgs);
			case FhirPackage.IMAGING_STUDY_SERIES__PERFORMER:
				return ((InternalEList<?>)getPerformer()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMAGING_STUDY_SERIES__INSTANCE:
				return ((InternalEList<?>)getInstance()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.IMAGING_STUDY_SERIES__UID:
				return getUid();
			case FhirPackage.IMAGING_STUDY_SERIES__NUMBER:
				return getNumber();
			case FhirPackage.IMAGING_STUDY_SERIES__MODALITY:
				return getModality();
			case FhirPackage.IMAGING_STUDY_SERIES__DESCRIPTION:
				return getDescription();
			case FhirPackage.IMAGING_STUDY_SERIES__NUMBER_OF_INSTANCES:
				return getNumberOfInstances();
			case FhirPackage.IMAGING_STUDY_SERIES__ENDPOINT:
				return getEndpoint();
			case FhirPackage.IMAGING_STUDY_SERIES__BODY_SITE:
				return getBodySite();
			case FhirPackage.IMAGING_STUDY_SERIES__LATERALITY:
				return getLaterality();
			case FhirPackage.IMAGING_STUDY_SERIES__SPECIMEN:
				return getSpecimen();
			case FhirPackage.IMAGING_STUDY_SERIES__STARTED:
				return getStarted();
			case FhirPackage.IMAGING_STUDY_SERIES__PERFORMER:
				return getPerformer();
			case FhirPackage.IMAGING_STUDY_SERIES__INSTANCE:
				return getInstance();
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
			case FhirPackage.IMAGING_STUDY_SERIES__UID:
				setUid((Id)newValue);
				return;
			case FhirPackage.IMAGING_STUDY_SERIES__NUMBER:
				setNumber((UnsignedInt)newValue);
				return;
			case FhirPackage.IMAGING_STUDY_SERIES__MODALITY:
				setModality((Coding)newValue);
				return;
			case FhirPackage.IMAGING_STUDY_SERIES__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.IMAGING_STUDY_SERIES__NUMBER_OF_INSTANCES:
				setNumberOfInstances((UnsignedInt)newValue);
				return;
			case FhirPackage.IMAGING_STUDY_SERIES__ENDPOINT:
				getEndpoint().clear();
				getEndpoint().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.IMAGING_STUDY_SERIES__BODY_SITE:
				setBodySite((Coding)newValue);
				return;
			case FhirPackage.IMAGING_STUDY_SERIES__LATERALITY:
				setLaterality((Coding)newValue);
				return;
			case FhirPackage.IMAGING_STUDY_SERIES__SPECIMEN:
				getSpecimen().clear();
				getSpecimen().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.IMAGING_STUDY_SERIES__STARTED:
				setStarted((DateTime)newValue);
				return;
			case FhirPackage.IMAGING_STUDY_SERIES__PERFORMER:
				getPerformer().clear();
				getPerformer().addAll((Collection<? extends ImagingStudyPerformer>)newValue);
				return;
			case FhirPackage.IMAGING_STUDY_SERIES__INSTANCE:
				getInstance().clear();
				getInstance().addAll((Collection<? extends ImagingStudyInstance>)newValue);
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
			case FhirPackage.IMAGING_STUDY_SERIES__UID:
				setUid((Id)null);
				return;
			case FhirPackage.IMAGING_STUDY_SERIES__NUMBER:
				setNumber((UnsignedInt)null);
				return;
			case FhirPackage.IMAGING_STUDY_SERIES__MODALITY:
				setModality((Coding)null);
				return;
			case FhirPackage.IMAGING_STUDY_SERIES__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.IMAGING_STUDY_SERIES__NUMBER_OF_INSTANCES:
				setNumberOfInstances((UnsignedInt)null);
				return;
			case FhirPackage.IMAGING_STUDY_SERIES__ENDPOINT:
				getEndpoint().clear();
				return;
			case FhirPackage.IMAGING_STUDY_SERIES__BODY_SITE:
				setBodySite((Coding)null);
				return;
			case FhirPackage.IMAGING_STUDY_SERIES__LATERALITY:
				setLaterality((Coding)null);
				return;
			case FhirPackage.IMAGING_STUDY_SERIES__SPECIMEN:
				getSpecimen().clear();
				return;
			case FhirPackage.IMAGING_STUDY_SERIES__STARTED:
				setStarted((DateTime)null);
				return;
			case FhirPackage.IMAGING_STUDY_SERIES__PERFORMER:
				getPerformer().clear();
				return;
			case FhirPackage.IMAGING_STUDY_SERIES__INSTANCE:
				getInstance().clear();
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
			case FhirPackage.IMAGING_STUDY_SERIES__UID:
				return uid != null;
			case FhirPackage.IMAGING_STUDY_SERIES__NUMBER:
				return number != null;
			case FhirPackage.IMAGING_STUDY_SERIES__MODALITY:
				return modality != null;
			case FhirPackage.IMAGING_STUDY_SERIES__DESCRIPTION:
				return description != null;
			case FhirPackage.IMAGING_STUDY_SERIES__NUMBER_OF_INSTANCES:
				return numberOfInstances != null;
			case FhirPackage.IMAGING_STUDY_SERIES__ENDPOINT:
				return endpoint != null && !endpoint.isEmpty();
			case FhirPackage.IMAGING_STUDY_SERIES__BODY_SITE:
				return bodySite != null;
			case FhirPackage.IMAGING_STUDY_SERIES__LATERALITY:
				return laterality != null;
			case FhirPackage.IMAGING_STUDY_SERIES__SPECIMEN:
				return specimen != null && !specimen.isEmpty();
			case FhirPackage.IMAGING_STUDY_SERIES__STARTED:
				return started != null;
			case FhirPackage.IMAGING_STUDY_SERIES__PERFORMER:
				return performer != null && !performer.isEmpty();
			case FhirPackage.IMAGING_STUDY_SERIES__INSTANCE:
				return instance != null && !instance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImagingStudySeriesImpl
