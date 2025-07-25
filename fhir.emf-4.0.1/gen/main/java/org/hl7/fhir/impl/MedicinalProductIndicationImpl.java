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
import org.hl7.fhir.MedicinalProductIndication;
import org.hl7.fhir.MedicinalProductIndicationOtherTherapy;
import org.hl7.fhir.Population;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicinal Product Indication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductIndicationImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductIndicationImpl#getDiseaseSymptomProcedure <em>Disease Symptom Procedure</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductIndicationImpl#getDiseaseStatus <em>Disease Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductIndicationImpl#getComorbidity <em>Comorbidity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductIndicationImpl#getIntendedEffect <em>Intended Effect</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductIndicationImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductIndicationImpl#getOtherTherapy <em>Other Therapy</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductIndicationImpl#getUndesirableEffect <em>Undesirable Effect</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductIndicationImpl#getPopulation <em>Population</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductIndicationImpl extends DomainResourceImpl implements MedicinalProductIndication {
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
	 * The cached value of the '{@link #getDiseaseSymptomProcedure() <em>Disease Symptom Procedure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseaseSymptomProcedure()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept diseaseSymptomProcedure;

	/**
	 * The cached value of the '{@link #getDiseaseStatus() <em>Disease Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseaseStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept diseaseStatus;

	/**
	 * The cached value of the '{@link #getComorbidity() <em>Comorbidity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComorbidity()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> comorbidity;

	/**
	 * The cached value of the '{@link #getIntendedEffect() <em>Intended Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntendedEffect()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept intendedEffect;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected Quantity duration;

	/**
	 * The cached value of the '{@link #getOtherTherapy() <em>Other Therapy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTherapy()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductIndicationOtherTherapy> otherTherapy;

	/**
	 * The cached value of the '{@link #getUndesirableEffect() <em>Undesirable Effect</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUndesirableEffect()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> undesirableEffect;

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
	protected MedicinalProductIndicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicinalProductIndication();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSubject() {
		if (subject == null) {
			subject = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICINAL_PRODUCT_INDICATION__SUBJECT);
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getDiseaseSymptomProcedure() {
		return diseaseSymptomProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiseaseSymptomProcedure(CodeableConcept newDiseaseSymptomProcedure, NotificationChain msgs) {
		CodeableConcept oldDiseaseSymptomProcedure = diseaseSymptomProcedure;
		diseaseSymptomProcedure = newDiseaseSymptomProcedure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INDICATION__DISEASE_SYMPTOM_PROCEDURE, oldDiseaseSymptomProcedure, newDiseaseSymptomProcedure);
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
	public void setDiseaseSymptomProcedure(CodeableConcept newDiseaseSymptomProcedure) {
		if (newDiseaseSymptomProcedure != diseaseSymptomProcedure) {
			NotificationChain msgs = null;
			if (diseaseSymptomProcedure != null)
				msgs = ((InternalEObject)diseaseSymptomProcedure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INDICATION__DISEASE_SYMPTOM_PROCEDURE, null, msgs);
			if (newDiseaseSymptomProcedure != null)
				msgs = ((InternalEObject)newDiseaseSymptomProcedure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INDICATION__DISEASE_SYMPTOM_PROCEDURE, null, msgs);
			msgs = basicSetDiseaseSymptomProcedure(newDiseaseSymptomProcedure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INDICATION__DISEASE_SYMPTOM_PROCEDURE, newDiseaseSymptomProcedure, newDiseaseSymptomProcedure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getDiseaseStatus() {
		return diseaseStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiseaseStatus(CodeableConcept newDiseaseStatus, NotificationChain msgs) {
		CodeableConcept oldDiseaseStatus = diseaseStatus;
		diseaseStatus = newDiseaseStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INDICATION__DISEASE_STATUS, oldDiseaseStatus, newDiseaseStatus);
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
	public void setDiseaseStatus(CodeableConcept newDiseaseStatus) {
		if (newDiseaseStatus != diseaseStatus) {
			NotificationChain msgs = null;
			if (diseaseStatus != null)
				msgs = ((InternalEObject)diseaseStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INDICATION__DISEASE_STATUS, null, msgs);
			if (newDiseaseStatus != null)
				msgs = ((InternalEObject)newDiseaseStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INDICATION__DISEASE_STATUS, null, msgs);
			msgs = basicSetDiseaseStatus(newDiseaseStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INDICATION__DISEASE_STATUS, newDiseaseStatus, newDiseaseStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getComorbidity() {
		if (comorbidity == null) {
			comorbidity = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.MEDICINAL_PRODUCT_INDICATION__COMORBIDITY);
		}
		return comorbidity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getIntendedEffect() {
		return intendedEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntendedEffect(CodeableConcept newIntendedEffect, NotificationChain msgs) {
		CodeableConcept oldIntendedEffect = intendedEffect;
		intendedEffect = newIntendedEffect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INDICATION__INTENDED_EFFECT, oldIntendedEffect, newIntendedEffect);
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
	public void setIntendedEffect(CodeableConcept newIntendedEffect) {
		if (newIntendedEffect != intendedEffect) {
			NotificationChain msgs = null;
			if (intendedEffect != null)
				msgs = ((InternalEObject)intendedEffect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INDICATION__INTENDED_EFFECT, null, msgs);
			if (newIntendedEffect != null)
				msgs = ((InternalEObject)newIntendedEffect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INDICATION__INTENDED_EFFECT, null, msgs);
			msgs = basicSetIntendedEffect(newIntendedEffect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INDICATION__INTENDED_EFFECT, newIntendedEffect, newIntendedEffect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDuration(Quantity newDuration, NotificationChain msgs) {
		Quantity oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INDICATION__DURATION, oldDuration, newDuration);
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
	public void setDuration(Quantity newDuration) {
		if (newDuration != duration) {
			NotificationChain msgs = null;
			if (duration != null)
				msgs = ((InternalEObject)duration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INDICATION__DURATION, null, msgs);
			if (newDuration != null)
				msgs = ((InternalEObject)newDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INDICATION__DURATION, null, msgs);
			msgs = basicSetDuration(newDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INDICATION__DURATION, newDuration, newDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicinalProductIndicationOtherTherapy> getOtherTherapy() {
		if (otherTherapy == null) {
			otherTherapy = new EObjectContainmentEList<MedicinalProductIndicationOtherTherapy>(MedicinalProductIndicationOtherTherapy.class, this, FhirPackage.MEDICINAL_PRODUCT_INDICATION__OTHER_THERAPY);
		}
		return otherTherapy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getUndesirableEffect() {
		if (undesirableEffect == null) {
			undesirableEffect = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICINAL_PRODUCT_INDICATION__UNDESIRABLE_EFFECT);
		}
		return undesirableEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Population> getPopulation() {
		if (population == null) {
			population = new EObjectContainmentEList<Population>(Population.class, this, FhirPackage.MEDICINAL_PRODUCT_INDICATION__POPULATION);
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
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION__SUBJECT:
				return ((InternalEList<?>)getSubject()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION__DISEASE_SYMPTOM_PROCEDURE:
				return basicSetDiseaseSymptomProcedure(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION__DISEASE_STATUS:
				return basicSetDiseaseStatus(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION__COMORBIDITY:
				return ((InternalEList<?>)getComorbidity()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION__INTENDED_EFFECT:
				return basicSetIntendedEffect(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION__DURATION:
				return basicSetDuration(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION__OTHER_THERAPY:
				return ((InternalEList<?>)getOtherTherapy()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION__UNDESIRABLE_EFFECT:
				return ((InternalEList<?>)getUndesirableEffect()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION__POPULATION:
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
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION__SUBJECT:
				return getSubject();
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION__DISEASE_SYMPTOM_PROCEDURE:
				return getDiseaseSymptomProcedure();
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION__DISEASE_STATUS:
				return getDiseaseStatus();
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION__COMORBIDITY:
				return getComorbidity();
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION__INTENDED_EFFECT:
				return getIntendedEffect();
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION__DURATION:
				return getDuration();
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION__OTHER_THERAPY:
				return getOtherTherapy();
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION__UNDESIRABLE_EFFECT:
				return getUndesirableEffect();
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION__POPULATION:
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
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION__SUBJECT:
				getSubject().clear();
				getSubject().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION__DISEASE_SYMPTOM_PROCEDURE:
				setDiseaseSymptomProcedure((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION__DISEASE_STATUS:
				setDiseaseStatus((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION__COMORBIDITY:
				getComorbidity().clear();
				getComorbidity().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION__INTENDED_EFFECT:
				setIntendedEffect((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION__DURATION:
				setDuration((Quantity)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION__OTHER_THERAPY:
				getOtherTherapy().clear();
				getOtherTherapy().addAll((Collection<? extends MedicinalProductIndicationOtherTherapy>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION__UNDESIRABLE_EFFECT:
				getUndesirableEffect().clear();
				getUndesirableEffect().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION__POPULATION:
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
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION__SUBJECT:
				getSubject().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION__DISEASE_SYMPTOM_PROCEDURE:
				setDiseaseSymptomProcedure((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION__DISEASE_STATUS:
				setDiseaseStatus((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION__COMORBIDITY:
				getComorbidity().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION__INTENDED_EFFECT:
				setIntendedEffect((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION__DURATION:
				setDuration((Quantity)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION__OTHER_THERAPY:
				getOtherTherapy().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION__UNDESIRABLE_EFFECT:
				getUndesirableEffect().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION__POPULATION:
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
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION__SUBJECT:
				return subject != null && !subject.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION__DISEASE_SYMPTOM_PROCEDURE:
				return diseaseSymptomProcedure != null;
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION__DISEASE_STATUS:
				return diseaseStatus != null;
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION__COMORBIDITY:
				return comorbidity != null && !comorbidity.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION__INTENDED_EFFECT:
				return intendedEffect != null;
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION__DURATION:
				return duration != null;
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION__OTHER_THERAPY:
				return otherTherapy != null && !otherTherapy.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION__UNDESIRABLE_EFFECT:
				return undesirableEffect != null && !undesirableEffect.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION__POPULATION:
				return population != null && !population.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductIndicationImpl
