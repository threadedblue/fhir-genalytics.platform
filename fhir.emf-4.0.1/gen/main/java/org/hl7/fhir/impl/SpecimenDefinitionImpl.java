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

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.SpecimenDefinition;
import org.hl7.fhir.SpecimenDefinitionTypeTested;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specimen Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionImpl#getTypeCollected <em>Type Collected</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionImpl#getPatientPreparation <em>Patient Preparation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionImpl#getTimeAspect <em>Time Aspect</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionImpl#getTypeTested <em>Type Tested</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecimenDefinitionImpl extends DomainResourceImpl implements SpecimenDefinition {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getTypeCollected() <em>Type Collected</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCollected()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept typeCollected;

	/**
	 * The cached value of the '{@link #getPatientPreparation() <em>Patient Preparation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientPreparation()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> patientPreparation;

	/**
	 * The cached value of the '{@link #getTimeAspect() <em>Time Aspect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeAspect()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String timeAspect;

	/**
	 * The cached value of the '{@link #getCollection() <em>Collection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollection()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> collection;

	/**
	 * The cached value of the '{@link #getTypeTested() <em>Type Tested</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeTested()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecimenDefinitionTypeTested> typeTested;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecimenDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSpecimenDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__IDENTIFIER, oldIdentifier, newIdentifier);
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
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getTypeCollected() {
		return typeCollected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeCollected(CodeableConcept newTypeCollected, NotificationChain msgs) {
		CodeableConcept oldTypeCollected = typeCollected;
		typeCollected = newTypeCollected;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__TYPE_COLLECTED, oldTypeCollected, newTypeCollected);
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
	public void setTypeCollected(CodeableConcept newTypeCollected) {
		if (newTypeCollected != typeCollected) {
			NotificationChain msgs = null;
			if (typeCollected != null)
				msgs = ((InternalEObject)typeCollected).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__TYPE_COLLECTED, null, msgs);
			if (newTypeCollected != null)
				msgs = ((InternalEObject)newTypeCollected).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__TYPE_COLLECTED, null, msgs);
			msgs = basicSetTypeCollected(newTypeCollected, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__TYPE_COLLECTED, newTypeCollected, newTypeCollected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getPatientPreparation() {
		if (patientPreparation == null) {
			patientPreparation = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.SPECIMEN_DEFINITION__PATIENT_PREPARATION);
		}
		return patientPreparation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getTimeAspect() {
		return timeAspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeAspect(org.hl7.fhir.String newTimeAspect, NotificationChain msgs) {
		org.hl7.fhir.String oldTimeAspect = timeAspect;
		timeAspect = newTimeAspect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__TIME_ASPECT, oldTimeAspect, newTimeAspect);
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
	public void setTimeAspect(org.hl7.fhir.String newTimeAspect) {
		if (newTimeAspect != timeAspect) {
			NotificationChain msgs = null;
			if (timeAspect != null)
				msgs = ((InternalEObject)timeAspect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__TIME_ASPECT, null, msgs);
			if (newTimeAspect != null)
				msgs = ((InternalEObject)newTimeAspect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION__TIME_ASPECT, null, msgs);
			msgs = basicSetTimeAspect(newTimeAspect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION__TIME_ASPECT, newTimeAspect, newTimeAspect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCollection() {
		if (collection == null) {
			collection = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.SPECIMEN_DEFINITION__COLLECTION);
		}
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpecimenDefinitionTypeTested> getTypeTested() {
		if (typeTested == null) {
			typeTested = new EObjectContainmentEList<SpecimenDefinitionTypeTested>(SpecimenDefinitionTypeTested.class, this, FhirPackage.SPECIMEN_DEFINITION__TYPE_TESTED);
		}
		return typeTested;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SPECIMEN_DEFINITION__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION__TYPE_COLLECTED:
				return basicSetTypeCollected(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION__PATIENT_PREPARATION:
				return ((InternalEList<?>)getPatientPreparation()).basicRemove(otherEnd, msgs);
			case FhirPackage.SPECIMEN_DEFINITION__TIME_ASPECT:
				return basicSetTimeAspect(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION__COLLECTION:
				return ((InternalEList<?>)getCollection()).basicRemove(otherEnd, msgs);
			case FhirPackage.SPECIMEN_DEFINITION__TYPE_TESTED:
				return ((InternalEList<?>)getTypeTested()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.SPECIMEN_DEFINITION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.SPECIMEN_DEFINITION__TYPE_COLLECTED:
				return getTypeCollected();
			case FhirPackage.SPECIMEN_DEFINITION__PATIENT_PREPARATION:
				return getPatientPreparation();
			case FhirPackage.SPECIMEN_DEFINITION__TIME_ASPECT:
				return getTimeAspect();
			case FhirPackage.SPECIMEN_DEFINITION__COLLECTION:
				return getCollection();
			case FhirPackage.SPECIMEN_DEFINITION__TYPE_TESTED:
				return getTypeTested();
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
			case FhirPackage.SPECIMEN_DEFINITION__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__TYPE_COLLECTED:
				setTypeCollected((CodeableConcept)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__PATIENT_PREPARATION:
				getPatientPreparation().clear();
				getPatientPreparation().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__TIME_ASPECT:
				setTimeAspect((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__COLLECTION:
				getCollection().clear();
				getCollection().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__TYPE_TESTED:
				getTypeTested().clear();
				getTypeTested().addAll((Collection<? extends SpecimenDefinitionTypeTested>)newValue);
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
			case FhirPackage.SPECIMEN_DEFINITION__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__TYPE_COLLECTED:
				setTypeCollected((CodeableConcept)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__PATIENT_PREPARATION:
				getPatientPreparation().clear();
				return;
			case FhirPackage.SPECIMEN_DEFINITION__TIME_ASPECT:
				setTimeAspect((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION__COLLECTION:
				getCollection().clear();
				return;
			case FhirPackage.SPECIMEN_DEFINITION__TYPE_TESTED:
				getTypeTested().clear();
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
			case FhirPackage.SPECIMEN_DEFINITION__IDENTIFIER:
				return identifier != null;
			case FhirPackage.SPECIMEN_DEFINITION__TYPE_COLLECTED:
				return typeCollected != null;
			case FhirPackage.SPECIMEN_DEFINITION__PATIENT_PREPARATION:
				return patientPreparation != null && !patientPreparation.isEmpty();
			case FhirPackage.SPECIMEN_DEFINITION__TIME_ASPECT:
				return timeAspect != null;
			case FhirPackage.SPECIMEN_DEFINITION__COLLECTION:
				return collection != null && !collection.isEmpty();
			case FhirPackage.SPECIMEN_DEFINITION__TYPE_TESTED:
				return typeTested != null && !typeTested.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpecimenDefinitionImpl
