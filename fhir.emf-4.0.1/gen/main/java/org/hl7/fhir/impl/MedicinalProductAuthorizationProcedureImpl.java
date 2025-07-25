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
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.MedicinalProductAuthorizationProcedure;
import org.hl7.fhir.Period;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicinal Product Authorization Procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductAuthorizationProcedureImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductAuthorizationProcedureImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductAuthorizationProcedureImpl#getDatePeriod <em>Date Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductAuthorizationProcedureImpl#getDateDateTime <em>Date Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductAuthorizationProcedureImpl#getApplication <em>Application</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductAuthorizationProcedureImpl extends BackboneElementImpl implements MedicinalProductAuthorizationProcedure {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getDatePeriod() <em>Date Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period datePeriod;

	/**
	 * The cached value of the '{@link #getDateDateTime() <em>Date Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime dateDateTime;

	/**
	 * The cached value of the '{@link #getApplication() <em>Application</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductAuthorizationProcedure> application;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductAuthorizationProcedureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicinalProductAuthorizationProcedure();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__IDENTIFIER, oldIdentifier, newIdentifier);
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
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__TYPE, oldType, newType);
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
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getDatePeriod() {
		return datePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatePeriod(Period newDatePeriod, NotificationChain msgs) {
		Period oldDatePeriod = datePeriod;
		datePeriod = newDatePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__DATE_PERIOD, oldDatePeriod, newDatePeriod);
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
	public void setDatePeriod(Period newDatePeriod) {
		if (newDatePeriod != datePeriod) {
			NotificationChain msgs = null;
			if (datePeriod != null)
				msgs = ((InternalEObject)datePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__DATE_PERIOD, null, msgs);
			if (newDatePeriod != null)
				msgs = ((InternalEObject)newDatePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__DATE_PERIOD, null, msgs);
			msgs = basicSetDatePeriod(newDatePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__DATE_PERIOD, newDatePeriod, newDatePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getDateDateTime() {
		return dateDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateDateTime(DateTime newDateDateTime, NotificationChain msgs) {
		DateTime oldDateDateTime = dateDateTime;
		dateDateTime = newDateDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__DATE_DATE_TIME, oldDateDateTime, newDateDateTime);
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
	public void setDateDateTime(DateTime newDateDateTime) {
		if (newDateDateTime != dateDateTime) {
			NotificationChain msgs = null;
			if (dateDateTime != null)
				msgs = ((InternalEObject)dateDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__DATE_DATE_TIME, null, msgs);
			if (newDateDateTime != null)
				msgs = ((InternalEObject)newDateDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__DATE_DATE_TIME, null, msgs);
			msgs = basicSetDateDateTime(newDateDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__DATE_DATE_TIME, newDateDateTime, newDateDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicinalProductAuthorizationProcedure> getApplication() {
		if (application == null) {
			application = new EObjectContainmentEList<MedicinalProductAuthorizationProcedure>(MedicinalProductAuthorizationProcedure.class, this, FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__APPLICATION);
		}
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__DATE_PERIOD:
				return basicSetDatePeriod(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__DATE_DATE_TIME:
				return basicSetDateDateTime(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__APPLICATION:
				return ((InternalEList<?>)getApplication()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__TYPE:
				return getType();
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__DATE_PERIOD:
				return getDatePeriod();
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__DATE_DATE_TIME:
				return getDateDateTime();
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__APPLICATION:
				return getApplication();
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
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__DATE_PERIOD:
				setDatePeriod((Period)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__DATE_DATE_TIME:
				setDateDateTime((DateTime)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__APPLICATION:
				getApplication().clear();
				getApplication().addAll((Collection<? extends MedicinalProductAuthorizationProcedure>)newValue);
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
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__DATE_PERIOD:
				setDatePeriod((Period)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__DATE_DATE_TIME:
				setDateDateTime((DateTime)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__APPLICATION:
				getApplication().clear();
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
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__IDENTIFIER:
				return identifier != null;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__TYPE:
				return type != null;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__DATE_PERIOD:
				return datePeriod != null;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__DATE_DATE_TIME:
				return dateDateTime != null;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__APPLICATION:
				return application != null && !application.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductAuthorizationProcedureImpl
