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
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;
import org.hl7.fhir.ResearchSubject;
import org.hl7.fhir.ResearchSubjectStatus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Research Subject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ResearchSubjectImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchSubjectImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchSubjectImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchSubjectImpl#getStudy <em>Study</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchSubjectImpl#getIndividual <em>Individual</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchSubjectImpl#getAssignedArm <em>Assigned Arm</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchSubjectImpl#getActualArm <em>Actual Arm</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResearchSubjectImpl#getConsent <em>Consent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResearchSubjectImpl extends DomainResourceImpl implements ResearchSubject {
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
	protected ResearchSubjectStatus status;

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
	 * The cached value of the '{@link #getStudy() <em>Study</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudy()
	 * @generated
	 * @ordered
	 */
	protected Reference study;

	/**
	 * The cached value of the '{@link #getIndividual() <em>Individual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividual()
	 * @generated
	 * @ordered
	 */
	protected Reference individual;

	/**
	 * The cached value of the '{@link #getAssignedArm() <em>Assigned Arm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedArm()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String assignedArm;

	/**
	 * The cached value of the '{@link #getActualArm() <em>Actual Arm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualArm()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String actualArm;

	/**
	 * The cached value of the '{@link #getConsent() <em>Consent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsent()
	 * @generated
	 * @ordered
	 */
	protected Reference consent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResearchSubjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getResearchSubject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.RESEARCH_SUBJECT__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResearchSubjectStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(ResearchSubjectStatus newStatus, NotificationChain msgs) {
		ResearchSubjectStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_SUBJECT__STATUS, oldStatus, newStatus);
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
	public void setStatus(ResearchSubjectStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_SUBJECT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_SUBJECT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_SUBJECT__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_SUBJECT__PERIOD, oldPeriod, newPeriod);
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
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_SUBJECT__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_SUBJECT__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_SUBJECT__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getStudy() {
		return study;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudy(Reference newStudy, NotificationChain msgs) {
		Reference oldStudy = study;
		study = newStudy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_SUBJECT__STUDY, oldStudy, newStudy);
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
	public void setStudy(Reference newStudy) {
		if (newStudy != study) {
			NotificationChain msgs = null;
			if (study != null)
				msgs = ((InternalEObject)study).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_SUBJECT__STUDY, null, msgs);
			if (newStudy != null)
				msgs = ((InternalEObject)newStudy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_SUBJECT__STUDY, null, msgs);
			msgs = basicSetStudy(newStudy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_SUBJECT__STUDY, newStudy, newStudy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getIndividual() {
		return individual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndividual(Reference newIndividual, NotificationChain msgs) {
		Reference oldIndividual = individual;
		individual = newIndividual;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_SUBJECT__INDIVIDUAL, oldIndividual, newIndividual);
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
	public void setIndividual(Reference newIndividual) {
		if (newIndividual != individual) {
			NotificationChain msgs = null;
			if (individual != null)
				msgs = ((InternalEObject)individual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_SUBJECT__INDIVIDUAL, null, msgs);
			if (newIndividual != null)
				msgs = ((InternalEObject)newIndividual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_SUBJECT__INDIVIDUAL, null, msgs);
			msgs = basicSetIndividual(newIndividual, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_SUBJECT__INDIVIDUAL, newIndividual, newIndividual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getAssignedArm() {
		return assignedArm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssignedArm(org.hl7.fhir.String newAssignedArm, NotificationChain msgs) {
		org.hl7.fhir.String oldAssignedArm = assignedArm;
		assignedArm = newAssignedArm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_SUBJECT__ASSIGNED_ARM, oldAssignedArm, newAssignedArm);
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
	public void setAssignedArm(org.hl7.fhir.String newAssignedArm) {
		if (newAssignedArm != assignedArm) {
			NotificationChain msgs = null;
			if (assignedArm != null)
				msgs = ((InternalEObject)assignedArm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_SUBJECT__ASSIGNED_ARM, null, msgs);
			if (newAssignedArm != null)
				msgs = ((InternalEObject)newAssignedArm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_SUBJECT__ASSIGNED_ARM, null, msgs);
			msgs = basicSetAssignedArm(newAssignedArm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_SUBJECT__ASSIGNED_ARM, newAssignedArm, newAssignedArm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getActualArm() {
		return actualArm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActualArm(org.hl7.fhir.String newActualArm, NotificationChain msgs) {
		org.hl7.fhir.String oldActualArm = actualArm;
		actualArm = newActualArm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_SUBJECT__ACTUAL_ARM, oldActualArm, newActualArm);
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
	public void setActualArm(org.hl7.fhir.String newActualArm) {
		if (newActualArm != actualArm) {
			NotificationChain msgs = null;
			if (actualArm != null)
				msgs = ((InternalEObject)actualArm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_SUBJECT__ACTUAL_ARM, null, msgs);
			if (newActualArm != null)
				msgs = ((InternalEObject)newActualArm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_SUBJECT__ACTUAL_ARM, null, msgs);
			msgs = basicSetActualArm(newActualArm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_SUBJECT__ACTUAL_ARM, newActualArm, newActualArm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getConsent() {
		return consent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConsent(Reference newConsent, NotificationChain msgs) {
		Reference oldConsent = consent;
		consent = newConsent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_SUBJECT__CONSENT, oldConsent, newConsent);
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
	public void setConsent(Reference newConsent) {
		if (newConsent != consent) {
			NotificationChain msgs = null;
			if (consent != null)
				msgs = ((InternalEObject)consent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_SUBJECT__CONSENT, null, msgs);
			if (newConsent != null)
				msgs = ((InternalEObject)newConsent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESEARCH_SUBJECT__CONSENT, null, msgs);
			msgs = basicSetConsent(newConsent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESEARCH_SUBJECT__CONSENT, newConsent, newConsent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.RESEARCH_SUBJECT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.RESEARCH_SUBJECT__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.RESEARCH_SUBJECT__PERIOD:
				return basicSetPeriod(null, msgs);
			case FhirPackage.RESEARCH_SUBJECT__STUDY:
				return basicSetStudy(null, msgs);
			case FhirPackage.RESEARCH_SUBJECT__INDIVIDUAL:
				return basicSetIndividual(null, msgs);
			case FhirPackage.RESEARCH_SUBJECT__ASSIGNED_ARM:
				return basicSetAssignedArm(null, msgs);
			case FhirPackage.RESEARCH_SUBJECT__ACTUAL_ARM:
				return basicSetActualArm(null, msgs);
			case FhirPackage.RESEARCH_SUBJECT__CONSENT:
				return basicSetConsent(null, msgs);
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
			case FhirPackage.RESEARCH_SUBJECT__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.RESEARCH_SUBJECT__STATUS:
				return getStatus();
			case FhirPackage.RESEARCH_SUBJECT__PERIOD:
				return getPeriod();
			case FhirPackage.RESEARCH_SUBJECT__STUDY:
				return getStudy();
			case FhirPackage.RESEARCH_SUBJECT__INDIVIDUAL:
				return getIndividual();
			case FhirPackage.RESEARCH_SUBJECT__ASSIGNED_ARM:
				return getAssignedArm();
			case FhirPackage.RESEARCH_SUBJECT__ACTUAL_ARM:
				return getActualArm();
			case FhirPackage.RESEARCH_SUBJECT__CONSENT:
				return getConsent();
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
			case FhirPackage.RESEARCH_SUBJECT__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.RESEARCH_SUBJECT__STATUS:
				setStatus((ResearchSubjectStatus)newValue);
				return;
			case FhirPackage.RESEARCH_SUBJECT__PERIOD:
				setPeriod((Period)newValue);
				return;
			case FhirPackage.RESEARCH_SUBJECT__STUDY:
				setStudy((Reference)newValue);
				return;
			case FhirPackage.RESEARCH_SUBJECT__INDIVIDUAL:
				setIndividual((Reference)newValue);
				return;
			case FhirPackage.RESEARCH_SUBJECT__ASSIGNED_ARM:
				setAssignedArm((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.RESEARCH_SUBJECT__ACTUAL_ARM:
				setActualArm((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.RESEARCH_SUBJECT__CONSENT:
				setConsent((Reference)newValue);
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
			case FhirPackage.RESEARCH_SUBJECT__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.RESEARCH_SUBJECT__STATUS:
				setStatus((ResearchSubjectStatus)null);
				return;
			case FhirPackage.RESEARCH_SUBJECT__PERIOD:
				setPeriod((Period)null);
				return;
			case FhirPackage.RESEARCH_SUBJECT__STUDY:
				setStudy((Reference)null);
				return;
			case FhirPackage.RESEARCH_SUBJECT__INDIVIDUAL:
				setIndividual((Reference)null);
				return;
			case FhirPackage.RESEARCH_SUBJECT__ASSIGNED_ARM:
				setAssignedArm((org.hl7.fhir.String)null);
				return;
			case FhirPackage.RESEARCH_SUBJECT__ACTUAL_ARM:
				setActualArm((org.hl7.fhir.String)null);
				return;
			case FhirPackage.RESEARCH_SUBJECT__CONSENT:
				setConsent((Reference)null);
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
			case FhirPackage.RESEARCH_SUBJECT__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.RESEARCH_SUBJECT__STATUS:
				return status != null;
			case FhirPackage.RESEARCH_SUBJECT__PERIOD:
				return period != null;
			case FhirPackage.RESEARCH_SUBJECT__STUDY:
				return study != null;
			case FhirPackage.RESEARCH_SUBJECT__INDIVIDUAL:
				return individual != null;
			case FhirPackage.RESEARCH_SUBJECT__ASSIGNED_ARM:
				return assignedArm != null;
			case FhirPackage.RESEARCH_SUBJECT__ACTUAL_ARM:
				return actualArm != null;
			case FhirPackage.RESEARCH_SUBJECT__CONSENT:
				return consent != null;
		}
		return super.eIsSet(featureID);
	}

} //ResearchSubjectImpl
