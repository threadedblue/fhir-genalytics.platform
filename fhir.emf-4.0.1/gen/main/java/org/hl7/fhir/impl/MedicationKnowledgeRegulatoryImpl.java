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

import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.MedicationKnowledgeMaxDispense;
import org.hl7.fhir.MedicationKnowledgeRegulatory;
import org.hl7.fhir.MedicationKnowledgeSchedule;
import org.hl7.fhir.MedicationKnowledgeSubstitution;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Knowledge Regulatory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeRegulatoryImpl#getRegulatoryAuthority <em>Regulatory Authority</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeRegulatoryImpl#getSubstitution <em>Substitution</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeRegulatoryImpl#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeRegulatoryImpl#getMaxDispense <em>Max Dispense</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationKnowledgeRegulatoryImpl extends BackboneElementImpl implements MedicationKnowledgeRegulatory {
	/**
	 * The cached value of the '{@link #getRegulatoryAuthority() <em>Regulatory Authority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulatoryAuthority()
	 * @generated
	 * @ordered
	 */
	protected Reference regulatoryAuthority;

	/**
	 * The cached value of the '{@link #getSubstitution() <em>Substitution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitution()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationKnowledgeSubstitution> substitution;

	/**
	 * The cached value of the '{@link #getSchedule() <em>Schedule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedule()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationKnowledgeSchedule> schedule;

	/**
	 * The cached value of the '{@link #getMaxDispense() <em>Max Dispense</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDispense()
	 * @generated
	 * @ordered
	 */
	protected MedicationKnowledgeMaxDispense maxDispense;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationKnowledgeRegulatoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicationKnowledgeRegulatory();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getRegulatoryAuthority() {
		return regulatoryAuthority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegulatoryAuthority(Reference newRegulatoryAuthority, NotificationChain msgs) {
		Reference oldRegulatoryAuthority = regulatoryAuthority;
		regulatoryAuthority = newRegulatoryAuthority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE_REGULATORY__REGULATORY_AUTHORITY, oldRegulatoryAuthority, newRegulatoryAuthority);
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
	public void setRegulatoryAuthority(Reference newRegulatoryAuthority) {
		if (newRegulatoryAuthority != regulatoryAuthority) {
			NotificationChain msgs = null;
			if (regulatoryAuthority != null)
				msgs = ((InternalEObject)regulatoryAuthority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE_REGULATORY__REGULATORY_AUTHORITY, null, msgs);
			if (newRegulatoryAuthority != null)
				msgs = ((InternalEObject)newRegulatoryAuthority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE_REGULATORY__REGULATORY_AUTHORITY, null, msgs);
			msgs = basicSetRegulatoryAuthority(newRegulatoryAuthority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE_REGULATORY__REGULATORY_AUTHORITY, newRegulatoryAuthority, newRegulatoryAuthority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicationKnowledgeSubstitution> getSubstitution() {
		if (substitution == null) {
			substitution = new EObjectContainmentEList<MedicationKnowledgeSubstitution>(MedicationKnowledgeSubstitution.class, this, FhirPackage.MEDICATION_KNOWLEDGE_REGULATORY__SUBSTITUTION);
		}
		return substitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicationKnowledgeSchedule> getSchedule() {
		if (schedule == null) {
			schedule = new EObjectContainmentEList<MedicationKnowledgeSchedule>(MedicationKnowledgeSchedule.class, this, FhirPackage.MEDICATION_KNOWLEDGE_REGULATORY__SCHEDULE);
		}
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationKnowledgeMaxDispense getMaxDispense() {
		return maxDispense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxDispense(MedicationKnowledgeMaxDispense newMaxDispense, NotificationChain msgs) {
		MedicationKnowledgeMaxDispense oldMaxDispense = maxDispense;
		maxDispense = newMaxDispense;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE_REGULATORY__MAX_DISPENSE, oldMaxDispense, newMaxDispense);
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
	public void setMaxDispense(MedicationKnowledgeMaxDispense newMaxDispense) {
		if (newMaxDispense != maxDispense) {
			NotificationChain msgs = null;
			if (maxDispense != null)
				msgs = ((InternalEObject)maxDispense).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE_REGULATORY__MAX_DISPENSE, null, msgs);
			if (newMaxDispense != null)
				msgs = ((InternalEObject)newMaxDispense).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE_REGULATORY__MAX_DISPENSE, null, msgs);
			msgs = basicSetMaxDispense(newMaxDispense, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE_REGULATORY__MAX_DISPENSE, newMaxDispense, newMaxDispense));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICATION_KNOWLEDGE_REGULATORY__REGULATORY_AUTHORITY:
				return basicSetRegulatoryAuthority(null, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE_REGULATORY__SUBSTITUTION:
				return ((InternalEList<?>)getSubstitution()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE_REGULATORY__SCHEDULE:
				return ((InternalEList<?>)getSchedule()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE_REGULATORY__MAX_DISPENSE:
				return basicSetMaxDispense(null, msgs);
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
			case FhirPackage.MEDICATION_KNOWLEDGE_REGULATORY__REGULATORY_AUTHORITY:
				return getRegulatoryAuthority();
			case FhirPackage.MEDICATION_KNOWLEDGE_REGULATORY__SUBSTITUTION:
				return getSubstitution();
			case FhirPackage.MEDICATION_KNOWLEDGE_REGULATORY__SCHEDULE:
				return getSchedule();
			case FhirPackage.MEDICATION_KNOWLEDGE_REGULATORY__MAX_DISPENSE:
				return getMaxDispense();
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
			case FhirPackage.MEDICATION_KNOWLEDGE_REGULATORY__REGULATORY_AUTHORITY:
				setRegulatoryAuthority((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_REGULATORY__SUBSTITUTION:
				getSubstitution().clear();
				getSubstitution().addAll((Collection<? extends MedicationKnowledgeSubstitution>)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_REGULATORY__SCHEDULE:
				getSchedule().clear();
				getSchedule().addAll((Collection<? extends MedicationKnowledgeSchedule>)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_REGULATORY__MAX_DISPENSE:
				setMaxDispense((MedicationKnowledgeMaxDispense)newValue);
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
			case FhirPackage.MEDICATION_KNOWLEDGE_REGULATORY__REGULATORY_AUTHORITY:
				setRegulatoryAuthority((Reference)null);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_REGULATORY__SUBSTITUTION:
				getSubstitution().clear();
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_REGULATORY__SCHEDULE:
				getSchedule().clear();
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_REGULATORY__MAX_DISPENSE:
				setMaxDispense((MedicationKnowledgeMaxDispense)null);
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
			case FhirPackage.MEDICATION_KNOWLEDGE_REGULATORY__REGULATORY_AUTHORITY:
				return regulatoryAuthority != null;
			case FhirPackage.MEDICATION_KNOWLEDGE_REGULATORY__SUBSTITUTION:
				return substitution != null && !substitution.isEmpty();
			case FhirPackage.MEDICATION_KNOWLEDGE_REGULATORY__SCHEDULE:
				return schedule != null && !schedule.isEmpty();
			case FhirPackage.MEDICATION_KNOWLEDGE_REGULATORY__MAX_DISPENSE:
				return maxDispense != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicationKnowledgeRegulatoryImpl
