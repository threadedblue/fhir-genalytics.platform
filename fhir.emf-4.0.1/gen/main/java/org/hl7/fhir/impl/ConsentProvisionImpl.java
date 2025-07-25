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
import org.hl7.fhir.Coding;
import org.hl7.fhir.ConsentActor;
import org.hl7.fhir.ConsentData;
import org.hl7.fhir.ConsentProvision;
import org.hl7.fhir.ConsentProvisionType;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Period;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consent Provision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ConsentProvisionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentProvisionImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentProvisionImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentProvisionImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentProvisionImpl#getSecurityLabel <em>Security Label</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentProvisionImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentProvisionImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentProvisionImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentProvisionImpl#getDataPeriod <em>Data Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentProvisionImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentProvisionImpl#getProvision <em>Provision</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsentProvisionImpl extends BackboneElementImpl implements ConsentProvision {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ConsentProvisionType type;

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
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected EList<ConsentActor> actor;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> action;

	/**
	 * The cached value of the '{@link #getSecurityLabel() <em>Security Label</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLabel()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> securityLabel;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> purpose;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> class_;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> code;

	/**
	 * The cached value of the '{@link #getDataPeriod() <em>Data Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period dataPeriod;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<ConsentData> data;

	/**
	 * The cached value of the '{@link #getProvision() <em>Provision</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvision()
	 * @generated
	 * @ordered
	 */
	protected EList<ConsentProvision> provision;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsentProvisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getConsentProvision();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentProvisionType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(ConsentProvisionType newType, NotificationChain msgs) {
		ConsentProvisionType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT_PROVISION__TYPE, oldType, newType);
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
	public void setType(ConsentProvisionType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT_PROVISION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT_PROVISION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT_PROVISION__TYPE, newType, newType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT_PROVISION__PERIOD, oldPeriod, newPeriod);
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
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT_PROVISION__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT_PROVISION__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT_PROVISION__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConsentActor> getActor() {
		if (actor == null) {
			actor = new EObjectContainmentEList<ConsentActor>(ConsentActor.class, this, FhirPackage.CONSENT_PROVISION__ACTOR);
		}
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CONSENT_PROVISION__ACTION);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Coding> getSecurityLabel() {
		if (securityLabel == null) {
			securityLabel = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.CONSENT_PROVISION__SECURITY_LABEL);
		}
		return securityLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Coding> getPurpose() {
		if (purpose == null) {
			purpose = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.CONSENT_PROVISION__PURPOSE);
		}
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Coding> getClass_() {
		if (class_ == null) {
			class_ = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.CONSENT_PROVISION__CLASS);
		}
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCode() {
		if (code == null) {
			code = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CONSENT_PROVISION__CODE);
		}
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getDataPeriod() {
		return dataPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataPeriod(Period newDataPeriod, NotificationChain msgs) {
		Period oldDataPeriod = dataPeriod;
		dataPeriod = newDataPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT_PROVISION__DATA_PERIOD, oldDataPeriod, newDataPeriod);
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
	public void setDataPeriod(Period newDataPeriod) {
		if (newDataPeriod != dataPeriod) {
			NotificationChain msgs = null;
			if (dataPeriod != null)
				msgs = ((InternalEObject)dataPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT_PROVISION__DATA_PERIOD, null, msgs);
			if (newDataPeriod != null)
				msgs = ((InternalEObject)newDataPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT_PROVISION__DATA_PERIOD, null, msgs);
			msgs = basicSetDataPeriod(newDataPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT_PROVISION__DATA_PERIOD, newDataPeriod, newDataPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConsentData> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<ConsentData>(ConsentData.class, this, FhirPackage.CONSENT_PROVISION__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConsentProvision> getProvision() {
		if (provision == null) {
			provision = new EObjectContainmentEList<ConsentProvision>(ConsentProvision.class, this, FhirPackage.CONSENT_PROVISION__PROVISION);
		}
		return provision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CONSENT_PROVISION__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.CONSENT_PROVISION__PERIOD:
				return basicSetPeriod(null, msgs);
			case FhirPackage.CONSENT_PROVISION__ACTOR:
				return ((InternalEList<?>)getActor()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONSENT_PROVISION__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONSENT_PROVISION__SECURITY_LABEL:
				return ((InternalEList<?>)getSecurityLabel()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONSENT_PROVISION__PURPOSE:
				return ((InternalEList<?>)getPurpose()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONSENT_PROVISION__CLASS:
				return ((InternalEList<?>)getClass_()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONSENT_PROVISION__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONSENT_PROVISION__DATA_PERIOD:
				return basicSetDataPeriod(null, msgs);
			case FhirPackage.CONSENT_PROVISION__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONSENT_PROVISION__PROVISION:
				return ((InternalEList<?>)getProvision()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CONSENT_PROVISION__TYPE:
				return getType();
			case FhirPackage.CONSENT_PROVISION__PERIOD:
				return getPeriod();
			case FhirPackage.CONSENT_PROVISION__ACTOR:
				return getActor();
			case FhirPackage.CONSENT_PROVISION__ACTION:
				return getAction();
			case FhirPackage.CONSENT_PROVISION__SECURITY_LABEL:
				return getSecurityLabel();
			case FhirPackage.CONSENT_PROVISION__PURPOSE:
				return getPurpose();
			case FhirPackage.CONSENT_PROVISION__CLASS:
				return getClass_();
			case FhirPackage.CONSENT_PROVISION__CODE:
				return getCode();
			case FhirPackage.CONSENT_PROVISION__DATA_PERIOD:
				return getDataPeriod();
			case FhirPackage.CONSENT_PROVISION__DATA:
				return getData();
			case FhirPackage.CONSENT_PROVISION__PROVISION:
				return getProvision();
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
			case FhirPackage.CONSENT_PROVISION__TYPE:
				setType((ConsentProvisionType)newValue);
				return;
			case FhirPackage.CONSENT_PROVISION__PERIOD:
				setPeriod((Period)newValue);
				return;
			case FhirPackage.CONSENT_PROVISION__ACTOR:
				getActor().clear();
				getActor().addAll((Collection<? extends ConsentActor>)newValue);
				return;
			case FhirPackage.CONSENT_PROVISION__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CONSENT_PROVISION__SECURITY_LABEL:
				getSecurityLabel().clear();
				getSecurityLabel().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.CONSENT_PROVISION__PURPOSE:
				getPurpose().clear();
				getPurpose().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.CONSENT_PROVISION__CLASS:
				getClass_().clear();
				getClass_().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.CONSENT_PROVISION__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CONSENT_PROVISION__DATA_PERIOD:
				setDataPeriod((Period)newValue);
				return;
			case FhirPackage.CONSENT_PROVISION__DATA:
				getData().clear();
				getData().addAll((Collection<? extends ConsentData>)newValue);
				return;
			case FhirPackage.CONSENT_PROVISION__PROVISION:
				getProvision().clear();
				getProvision().addAll((Collection<? extends ConsentProvision>)newValue);
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
			case FhirPackage.CONSENT_PROVISION__TYPE:
				setType((ConsentProvisionType)null);
				return;
			case FhirPackage.CONSENT_PROVISION__PERIOD:
				setPeriod((Period)null);
				return;
			case FhirPackage.CONSENT_PROVISION__ACTOR:
				getActor().clear();
				return;
			case FhirPackage.CONSENT_PROVISION__ACTION:
				getAction().clear();
				return;
			case FhirPackage.CONSENT_PROVISION__SECURITY_LABEL:
				getSecurityLabel().clear();
				return;
			case FhirPackage.CONSENT_PROVISION__PURPOSE:
				getPurpose().clear();
				return;
			case FhirPackage.CONSENT_PROVISION__CLASS:
				getClass_().clear();
				return;
			case FhirPackage.CONSENT_PROVISION__CODE:
				getCode().clear();
				return;
			case FhirPackage.CONSENT_PROVISION__DATA_PERIOD:
				setDataPeriod((Period)null);
				return;
			case FhirPackage.CONSENT_PROVISION__DATA:
				getData().clear();
				return;
			case FhirPackage.CONSENT_PROVISION__PROVISION:
				getProvision().clear();
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
			case FhirPackage.CONSENT_PROVISION__TYPE:
				return type != null;
			case FhirPackage.CONSENT_PROVISION__PERIOD:
				return period != null;
			case FhirPackage.CONSENT_PROVISION__ACTOR:
				return actor != null && !actor.isEmpty();
			case FhirPackage.CONSENT_PROVISION__ACTION:
				return action != null && !action.isEmpty();
			case FhirPackage.CONSENT_PROVISION__SECURITY_LABEL:
				return securityLabel != null && !securityLabel.isEmpty();
			case FhirPackage.CONSENT_PROVISION__PURPOSE:
				return purpose != null && !purpose.isEmpty();
			case FhirPackage.CONSENT_PROVISION__CLASS:
				return class_ != null && !class_.isEmpty();
			case FhirPackage.CONSENT_PROVISION__CODE:
				return code != null && !code.isEmpty();
			case FhirPackage.CONSENT_PROVISION__DATA_PERIOD:
				return dataPeriod != null;
			case FhirPackage.CONSENT_PROVISION__DATA:
				return data != null && !data.isEmpty();
			case FhirPackage.CONSENT_PROVISION__PROVISION:
				return provision != null && !provision.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConsentProvisionImpl
