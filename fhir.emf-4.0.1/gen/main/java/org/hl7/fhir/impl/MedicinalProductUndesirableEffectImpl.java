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
import org.hl7.fhir.MedicinalProductUndesirableEffect;
import org.hl7.fhir.Population;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicinal Product Undesirable Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductUndesirableEffectImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductUndesirableEffectImpl#getSymptomConditionEffect <em>Symptom Condition Effect</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductUndesirableEffectImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductUndesirableEffectImpl#getFrequencyOfOccurrence <em>Frequency Of Occurrence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductUndesirableEffectImpl#getPopulation <em>Population</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductUndesirableEffectImpl extends DomainResourceImpl implements MedicinalProductUndesirableEffect {
	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> subject;

	/**
	 * The cached value of the '{@link #getSymptomConditionEffect() <em>Symptom Condition Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymptomConditionEffect()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept symptomConditionEffect;

	/**
	 * The cached value of the '{@link #getClassification() <em>Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept classification;

	/**
	 * The cached value of the '{@link #getFrequencyOfOccurrence() <em>Frequency Of Occurrence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequencyOfOccurrence()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept frequencyOfOccurrence;

	/**
	 * The cached value of the '{@link #getPopulation() <em>Population</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulation()
	 * @generated
	 * @ordered
	 */
	protected EList<Population> population;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductUndesirableEffectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicinalProductUndesirableEffect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSubject() {
		if (subject == null) {
			subject = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__SUBJECT);
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getSymptomConditionEffect() {
		return symptomConditionEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSymptomConditionEffect(CodeableConcept newSymptomConditionEffect, NotificationChain msgs) {
		CodeableConcept oldSymptomConditionEffect = symptomConditionEffect;
		symptomConditionEffect = newSymptomConditionEffect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__SYMPTOM_CONDITION_EFFECT, oldSymptomConditionEffect, newSymptomConditionEffect);
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
	public void setSymptomConditionEffect(CodeableConcept newSymptomConditionEffect) {
		if (newSymptomConditionEffect != symptomConditionEffect) {
			NotificationChain msgs = null;
			if (symptomConditionEffect != null)
				msgs = ((InternalEObject)symptomConditionEffect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__SYMPTOM_CONDITION_EFFECT, null, msgs);
			if (newSymptomConditionEffect != null)
				msgs = ((InternalEObject)newSymptomConditionEffect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__SYMPTOM_CONDITION_EFFECT, null, msgs);
			msgs = basicSetSymptomConditionEffect(newSymptomConditionEffect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__SYMPTOM_CONDITION_EFFECT, newSymptomConditionEffect, newSymptomConditionEffect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getClassification() {
		return classification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassification(CodeableConcept newClassification, NotificationChain msgs) {
		CodeableConcept oldClassification = classification;
		classification = newClassification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__CLASSIFICATION, oldClassification, newClassification);
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
	public void setClassification(CodeableConcept newClassification) {
		if (newClassification != classification) {
			NotificationChain msgs = null;
			if (classification != null)
				msgs = ((InternalEObject)classification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__CLASSIFICATION, null, msgs);
			if (newClassification != null)
				msgs = ((InternalEObject)newClassification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__CLASSIFICATION, null, msgs);
			msgs = basicSetClassification(newClassification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__CLASSIFICATION, newClassification, newClassification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getFrequencyOfOccurrence() {
		return frequencyOfOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrequencyOfOccurrence(CodeableConcept newFrequencyOfOccurrence, NotificationChain msgs) {
		CodeableConcept oldFrequencyOfOccurrence = frequencyOfOccurrence;
		frequencyOfOccurrence = newFrequencyOfOccurrence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__FREQUENCY_OF_OCCURRENCE, oldFrequencyOfOccurrence, newFrequencyOfOccurrence);
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
	public void setFrequencyOfOccurrence(CodeableConcept newFrequencyOfOccurrence) {
		if (newFrequencyOfOccurrence != frequencyOfOccurrence) {
			NotificationChain msgs = null;
			if (frequencyOfOccurrence != null)
				msgs = ((InternalEObject)frequencyOfOccurrence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__FREQUENCY_OF_OCCURRENCE, null, msgs);
			if (newFrequencyOfOccurrence != null)
				msgs = ((InternalEObject)newFrequencyOfOccurrence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__FREQUENCY_OF_OCCURRENCE, null, msgs);
			msgs = basicSetFrequencyOfOccurrence(newFrequencyOfOccurrence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__FREQUENCY_OF_OCCURRENCE, newFrequencyOfOccurrence, newFrequencyOfOccurrence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Population> getPopulation() {
		if (population == null) {
			population = new EObjectContainmentEList<Population>(Population.class, this, FhirPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__POPULATION);
		}
		return population;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__SUBJECT:
				return ((InternalEList<?>)getSubject()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__SYMPTOM_CONDITION_EFFECT:
				return basicSetSymptomConditionEffect(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__CLASSIFICATION:
				return basicSetClassification(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__FREQUENCY_OF_OCCURRENCE:
				return basicSetFrequencyOfOccurrence(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__POPULATION:
				return ((InternalEList<?>)getPopulation()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__SUBJECT:
				return getSubject();
			case FhirPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__SYMPTOM_CONDITION_EFFECT:
				return getSymptomConditionEffect();
			case FhirPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__CLASSIFICATION:
				return getClassification();
			case FhirPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__FREQUENCY_OF_OCCURRENCE:
				return getFrequencyOfOccurrence();
			case FhirPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__POPULATION:
				return getPopulation();
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
			case FhirPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__SUBJECT:
				getSubject().clear();
				getSubject().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__SYMPTOM_CONDITION_EFFECT:
				setSymptomConditionEffect((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__CLASSIFICATION:
				setClassification((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__FREQUENCY_OF_OCCURRENCE:
				setFrequencyOfOccurrence((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__POPULATION:
				getPopulation().clear();
				getPopulation().addAll((Collection<? extends Population>)newValue);
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
			case FhirPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__SUBJECT:
				getSubject().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__SYMPTOM_CONDITION_EFFECT:
				setSymptomConditionEffect((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__CLASSIFICATION:
				setClassification((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__FREQUENCY_OF_OCCURRENCE:
				setFrequencyOfOccurrence((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__POPULATION:
				getPopulation().clear();
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
			case FhirPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__SUBJECT:
				return subject != null && !subject.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__SYMPTOM_CONDITION_EFFECT:
				return symptomConditionEffect != null;
			case FhirPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__CLASSIFICATION:
				return classification != null;
			case FhirPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__FREQUENCY_OF_OCCURRENCE:
				return frequencyOfOccurrence != null;
			case FhirPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__POPULATION:
				return population != null && !population.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductUndesirableEffectImpl
