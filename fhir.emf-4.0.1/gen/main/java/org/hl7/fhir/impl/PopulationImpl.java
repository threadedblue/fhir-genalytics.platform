/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Population;
import org.hl7.fhir.Range;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Population</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.PopulationImpl#getAgeRange <em>Age Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PopulationImpl#getAgeCodeableConcept <em>Age Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PopulationImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PopulationImpl#getRace <em>Race</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PopulationImpl#getPhysiologicalCondition <em>Physiological Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PopulationImpl extends BackboneElementImpl implements Population {
	/**
	 * The cached value of the '{@link #getAgeRange() <em>Age Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgeRange()
	 * @generated
	 * @ordered
	 */
	protected Range ageRange;

	/**
	 * The cached value of the '{@link #getAgeCodeableConcept() <em>Age Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgeCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept ageCodeableConcept;

	/**
	 * The cached value of the '{@link #getGender() <em>Gender</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept gender;

	/**
	 * The cached value of the '{@link #getRace() <em>Race</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRace()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept race;

	/**
	 * The cached value of the '{@link #getPhysiologicalCondition() <em>Physiological Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysiologicalCondition()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept physiologicalCondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PopulationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getPopulation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Range getAgeRange() {
		return ageRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAgeRange(Range newAgeRange, NotificationChain msgs) {
		Range oldAgeRange = ageRange;
		ageRange = newAgeRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.POPULATION__AGE_RANGE, oldAgeRange, newAgeRange);
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
	public void setAgeRange(Range newAgeRange) {
		if (newAgeRange != ageRange) {
			NotificationChain msgs = null;
			if (ageRange != null)
				msgs = ((InternalEObject)ageRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.POPULATION__AGE_RANGE, null, msgs);
			if (newAgeRange != null)
				msgs = ((InternalEObject)newAgeRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.POPULATION__AGE_RANGE, null, msgs);
			msgs = basicSetAgeRange(newAgeRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.POPULATION__AGE_RANGE, newAgeRange, newAgeRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getAgeCodeableConcept() {
		return ageCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAgeCodeableConcept(CodeableConcept newAgeCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldAgeCodeableConcept = ageCodeableConcept;
		ageCodeableConcept = newAgeCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.POPULATION__AGE_CODEABLE_CONCEPT, oldAgeCodeableConcept, newAgeCodeableConcept);
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
	public void setAgeCodeableConcept(CodeableConcept newAgeCodeableConcept) {
		if (newAgeCodeableConcept != ageCodeableConcept) {
			NotificationChain msgs = null;
			if (ageCodeableConcept != null)
				msgs = ((InternalEObject)ageCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.POPULATION__AGE_CODEABLE_CONCEPT, null, msgs);
			if (newAgeCodeableConcept != null)
				msgs = ((InternalEObject)newAgeCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.POPULATION__AGE_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetAgeCodeableConcept(newAgeCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.POPULATION__AGE_CODEABLE_CONCEPT, newAgeCodeableConcept, newAgeCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getGender() {
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGender(CodeableConcept newGender, NotificationChain msgs) {
		CodeableConcept oldGender = gender;
		gender = newGender;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.POPULATION__GENDER, oldGender, newGender);
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
	public void setGender(CodeableConcept newGender) {
		if (newGender != gender) {
			NotificationChain msgs = null;
			if (gender != null)
				msgs = ((InternalEObject)gender).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.POPULATION__GENDER, null, msgs);
			if (newGender != null)
				msgs = ((InternalEObject)newGender).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.POPULATION__GENDER, null, msgs);
			msgs = basicSetGender(newGender, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.POPULATION__GENDER, newGender, newGender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getRace() {
		return race;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRace(CodeableConcept newRace, NotificationChain msgs) {
		CodeableConcept oldRace = race;
		race = newRace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.POPULATION__RACE, oldRace, newRace);
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
	public void setRace(CodeableConcept newRace) {
		if (newRace != race) {
			NotificationChain msgs = null;
			if (race != null)
				msgs = ((InternalEObject)race).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.POPULATION__RACE, null, msgs);
			if (newRace != null)
				msgs = ((InternalEObject)newRace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.POPULATION__RACE, null, msgs);
			msgs = basicSetRace(newRace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.POPULATION__RACE, newRace, newRace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getPhysiologicalCondition() {
		return physiologicalCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhysiologicalCondition(CodeableConcept newPhysiologicalCondition, NotificationChain msgs) {
		CodeableConcept oldPhysiologicalCondition = physiologicalCondition;
		physiologicalCondition = newPhysiologicalCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.POPULATION__PHYSIOLOGICAL_CONDITION, oldPhysiologicalCondition, newPhysiologicalCondition);
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
	public void setPhysiologicalCondition(CodeableConcept newPhysiologicalCondition) {
		if (newPhysiologicalCondition != physiologicalCondition) {
			NotificationChain msgs = null;
			if (physiologicalCondition != null)
				msgs = ((InternalEObject)physiologicalCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.POPULATION__PHYSIOLOGICAL_CONDITION, null, msgs);
			if (newPhysiologicalCondition != null)
				msgs = ((InternalEObject)newPhysiologicalCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.POPULATION__PHYSIOLOGICAL_CONDITION, null, msgs);
			msgs = basicSetPhysiologicalCondition(newPhysiologicalCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.POPULATION__PHYSIOLOGICAL_CONDITION, newPhysiologicalCondition, newPhysiologicalCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.POPULATION__AGE_RANGE:
				return basicSetAgeRange(null, msgs);
			case FhirPackage.POPULATION__AGE_CODEABLE_CONCEPT:
				return basicSetAgeCodeableConcept(null, msgs);
			case FhirPackage.POPULATION__GENDER:
				return basicSetGender(null, msgs);
			case FhirPackage.POPULATION__RACE:
				return basicSetRace(null, msgs);
			case FhirPackage.POPULATION__PHYSIOLOGICAL_CONDITION:
				return basicSetPhysiologicalCondition(null, msgs);
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
			case FhirPackage.POPULATION__AGE_RANGE:
				return getAgeRange();
			case FhirPackage.POPULATION__AGE_CODEABLE_CONCEPT:
				return getAgeCodeableConcept();
			case FhirPackage.POPULATION__GENDER:
				return getGender();
			case FhirPackage.POPULATION__RACE:
				return getRace();
			case FhirPackage.POPULATION__PHYSIOLOGICAL_CONDITION:
				return getPhysiologicalCondition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.POPULATION__AGE_RANGE:
				setAgeRange((Range)newValue);
				return;
			case FhirPackage.POPULATION__AGE_CODEABLE_CONCEPT:
				setAgeCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.POPULATION__GENDER:
				setGender((CodeableConcept)newValue);
				return;
			case FhirPackage.POPULATION__RACE:
				setRace((CodeableConcept)newValue);
				return;
			case FhirPackage.POPULATION__PHYSIOLOGICAL_CONDITION:
				setPhysiologicalCondition((CodeableConcept)newValue);
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
			case FhirPackage.POPULATION__AGE_RANGE:
				setAgeRange((Range)null);
				return;
			case FhirPackage.POPULATION__AGE_CODEABLE_CONCEPT:
				setAgeCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.POPULATION__GENDER:
				setGender((CodeableConcept)null);
				return;
			case FhirPackage.POPULATION__RACE:
				setRace((CodeableConcept)null);
				return;
			case FhirPackage.POPULATION__PHYSIOLOGICAL_CONDITION:
				setPhysiologicalCondition((CodeableConcept)null);
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
			case FhirPackage.POPULATION__AGE_RANGE:
				return ageRange != null;
			case FhirPackage.POPULATION__AGE_CODEABLE_CONCEPT:
				return ageCodeableConcept != null;
			case FhirPackage.POPULATION__GENDER:
				return gender != null;
			case FhirPackage.POPULATION__RACE:
				return race != null;
			case FhirPackage.POPULATION__PHYSIOLOGICAL_CONDITION:
				return physiologicalCondition != null;
		}
		return super.eIsSet(featureID);
	}

} //PopulationImpl
