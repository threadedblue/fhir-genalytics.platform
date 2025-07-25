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

import org.hl7.fhir.Base64Binary;
import org.hl7.fhir.Code;
import org.hl7.fhir.Coding;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Instant;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Signature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getWhen <em>When</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getWho <em>Who</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getOnBehalfOf <em>On Behalf Of</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getTargetFormat <em>Target Format</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getSigFormat <em>Sig Format</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getData <em>Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignatureImpl extends ElementImpl implements Signature {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> type;

	/**
	 * The cached value of the '{@link #getWhen() <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected Instant when;

	/**
	 * The cached value of the '{@link #getWho() <em>Who</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWho()
	 * @generated
	 * @ordered
	 */
	protected Reference who;

	/**
	 * The cached value of the '{@link #getOnBehalfOf() <em>On Behalf Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnBehalfOf()
	 * @generated
	 * @ordered
	 */
	protected Reference onBehalfOf;

	/**
	 * The cached value of the '{@link #getTargetFormat() <em>Target Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFormat()
	 * @generated
	 * @ordered
	 */
	protected Code targetFormat;

	/**
	 * The cached value of the '{@link #getSigFormat() <em>Sig Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSigFormat()
	 * @generated
	 * @ordered
	 */
	protected Code sigFormat;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected Base64Binary data;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSignature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Coding> getType() {
		if (type == null) {
			type = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.SIGNATURE__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instant getWhen() {
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhen(Instant newWhen, NotificationChain msgs) {
		Instant oldWhen = when;
		when = newWhen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHEN, oldWhen, newWhen);
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
	public void setWhen(Instant newWhen) {
		if (newWhen != when) {
			NotificationChain msgs = null;
			if (when != null)
				msgs = ((InternalEObject)when).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHEN, null, msgs);
			if (newWhen != null)
				msgs = ((InternalEObject)newWhen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHEN, null, msgs);
			msgs = basicSetWhen(newWhen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHEN, newWhen, newWhen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getWho() {
		return who;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWho(Reference newWho, NotificationChain msgs) {
		Reference oldWho = who;
		who = newWho;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO, oldWho, newWho);
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
	public void setWho(Reference newWho) {
		if (newWho != who) {
			NotificationChain msgs = null;
			if (who != null)
				msgs = ((InternalEObject)who).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO, null, msgs);
			if (newWho != null)
				msgs = ((InternalEObject)newWho).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO, null, msgs);
			msgs = basicSetWho(newWho, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO, newWho, newWho));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getOnBehalfOf() {
		return onBehalfOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnBehalfOf(Reference newOnBehalfOf, NotificationChain msgs) {
		Reference oldOnBehalfOf = onBehalfOf;
		onBehalfOf = newOnBehalfOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__ON_BEHALF_OF, oldOnBehalfOf, newOnBehalfOf);
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
	public void setOnBehalfOf(Reference newOnBehalfOf) {
		if (newOnBehalfOf != onBehalfOf) {
			NotificationChain msgs = null;
			if (onBehalfOf != null)
				msgs = ((InternalEObject)onBehalfOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__ON_BEHALF_OF, null, msgs);
			if (newOnBehalfOf != null)
				msgs = ((InternalEObject)newOnBehalfOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__ON_BEHALF_OF, null, msgs);
			msgs = basicSetOnBehalfOf(newOnBehalfOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__ON_BEHALF_OF, newOnBehalfOf, newOnBehalfOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getTargetFormat() {
		return targetFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetFormat(Code newTargetFormat, NotificationChain msgs) {
		Code oldTargetFormat = targetFormat;
		targetFormat = newTargetFormat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__TARGET_FORMAT, oldTargetFormat, newTargetFormat);
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
	public void setTargetFormat(Code newTargetFormat) {
		if (newTargetFormat != targetFormat) {
			NotificationChain msgs = null;
			if (targetFormat != null)
				msgs = ((InternalEObject)targetFormat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__TARGET_FORMAT, null, msgs);
			if (newTargetFormat != null)
				msgs = ((InternalEObject)newTargetFormat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__TARGET_FORMAT, null, msgs);
			msgs = basicSetTargetFormat(newTargetFormat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__TARGET_FORMAT, newTargetFormat, newTargetFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getSigFormat() {
		return sigFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSigFormat(Code newSigFormat, NotificationChain msgs) {
		Code oldSigFormat = sigFormat;
		sigFormat = newSigFormat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__SIG_FORMAT, oldSigFormat, newSigFormat);
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
	public void setSigFormat(Code newSigFormat) {
		if (newSigFormat != sigFormat) {
			NotificationChain msgs = null;
			if (sigFormat != null)
				msgs = ((InternalEObject)sigFormat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__SIG_FORMAT, null, msgs);
			if (newSigFormat != null)
				msgs = ((InternalEObject)newSigFormat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__SIG_FORMAT, null, msgs);
			msgs = basicSetSigFormat(newSigFormat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__SIG_FORMAT, newSigFormat, newSigFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Base64Binary getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetData(Base64Binary newData, NotificationChain msgs) {
		Base64Binary oldData = data;
		data = newData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__DATA, oldData, newData);
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
	public void setData(Base64Binary newData) {
		if (newData != data) {
			NotificationChain msgs = null;
			if (data != null)
				msgs = ((InternalEObject)data).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__DATA, null, msgs);
			if (newData != null)
				msgs = ((InternalEObject)newData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__DATA, null, msgs);
			msgs = basicSetData(newData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__DATA, newData, newData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SIGNATURE__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case FhirPackage.SIGNATURE__WHEN:
				return basicSetWhen(null, msgs);
			case FhirPackage.SIGNATURE__WHO:
				return basicSetWho(null, msgs);
			case FhirPackage.SIGNATURE__ON_BEHALF_OF:
				return basicSetOnBehalfOf(null, msgs);
			case FhirPackage.SIGNATURE__TARGET_FORMAT:
				return basicSetTargetFormat(null, msgs);
			case FhirPackage.SIGNATURE__SIG_FORMAT:
				return basicSetSigFormat(null, msgs);
			case FhirPackage.SIGNATURE__DATA:
				return basicSetData(null, msgs);
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
			case FhirPackage.SIGNATURE__TYPE:
				return getType();
			case FhirPackage.SIGNATURE__WHEN:
				return getWhen();
			case FhirPackage.SIGNATURE__WHO:
				return getWho();
			case FhirPackage.SIGNATURE__ON_BEHALF_OF:
				return getOnBehalfOf();
			case FhirPackage.SIGNATURE__TARGET_FORMAT:
				return getTargetFormat();
			case FhirPackage.SIGNATURE__SIG_FORMAT:
				return getSigFormat();
			case FhirPackage.SIGNATURE__DATA:
				return getData();
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
			case FhirPackage.SIGNATURE__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.SIGNATURE__WHEN:
				setWhen((Instant)newValue);
				return;
			case FhirPackage.SIGNATURE__WHO:
				setWho((Reference)newValue);
				return;
			case FhirPackage.SIGNATURE__ON_BEHALF_OF:
				setOnBehalfOf((Reference)newValue);
				return;
			case FhirPackage.SIGNATURE__TARGET_FORMAT:
				setTargetFormat((Code)newValue);
				return;
			case FhirPackage.SIGNATURE__SIG_FORMAT:
				setSigFormat((Code)newValue);
				return;
			case FhirPackage.SIGNATURE__DATA:
				setData((Base64Binary)newValue);
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
			case FhirPackage.SIGNATURE__TYPE:
				getType().clear();
				return;
			case FhirPackage.SIGNATURE__WHEN:
				setWhen((Instant)null);
				return;
			case FhirPackage.SIGNATURE__WHO:
				setWho((Reference)null);
				return;
			case FhirPackage.SIGNATURE__ON_BEHALF_OF:
				setOnBehalfOf((Reference)null);
				return;
			case FhirPackage.SIGNATURE__TARGET_FORMAT:
				setTargetFormat((Code)null);
				return;
			case FhirPackage.SIGNATURE__SIG_FORMAT:
				setSigFormat((Code)null);
				return;
			case FhirPackage.SIGNATURE__DATA:
				setData((Base64Binary)null);
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
			case FhirPackage.SIGNATURE__TYPE:
				return type != null && !type.isEmpty();
			case FhirPackage.SIGNATURE__WHEN:
				return when != null;
			case FhirPackage.SIGNATURE__WHO:
				return who != null;
			case FhirPackage.SIGNATURE__ON_BEHALF_OF:
				return onBehalfOf != null;
			case FhirPackage.SIGNATURE__TARGET_FORMAT:
				return targetFormat != null;
			case FhirPackage.SIGNATURE__SIG_FORMAT:
				return sigFormat != null;
			case FhirPackage.SIGNATURE__DATA:
				return data != null;
		}
		return super.eIsSet(featureID);
	}

} //SignatureImpl
