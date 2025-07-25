/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.BiologicallyDerivedProductStorage;
import org.hl7.fhir.BiologicallyDerivedProductStorageScale;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Period;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Biologically Derived Product Storage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.BiologicallyDerivedProductStorageImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.BiologicallyDerivedProductStorageImpl#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.BiologicallyDerivedProductStorageImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.BiologicallyDerivedProductStorageImpl#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BiologicallyDerivedProductStorageImpl extends BackboneElementImpl implements BiologicallyDerivedProductStorage {
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
	 * The cached value of the '{@link #getTemperature() <em>Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected Decimal temperature;

	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected BiologicallyDerivedProductStorageScale scale;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected Period duration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BiologicallyDerivedProductStorageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getBiologicallyDerivedProductStorage();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getTemperature() {
		return temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemperature(Decimal newTemperature, NotificationChain msgs) {
		Decimal oldTemperature = temperature;
		temperature = newTemperature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__TEMPERATURE, oldTemperature, newTemperature);
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
	public void setTemperature(Decimal newTemperature) {
		if (newTemperature != temperature) {
			NotificationChain msgs = null;
			if (temperature != null)
				msgs = ((InternalEObject)temperature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__TEMPERATURE, null, msgs);
			if (newTemperature != null)
				msgs = ((InternalEObject)newTemperature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__TEMPERATURE, null, msgs);
			msgs = basicSetTemperature(newTemperature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__TEMPERATURE, newTemperature, newTemperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BiologicallyDerivedProductStorageScale getScale() {
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScale(BiologicallyDerivedProductStorageScale newScale, NotificationChain msgs) {
		BiologicallyDerivedProductStorageScale oldScale = scale;
		scale = newScale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__SCALE, oldScale, newScale);
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
	public void setScale(BiologicallyDerivedProductStorageScale newScale) {
		if (newScale != scale) {
			NotificationChain msgs = null;
			if (scale != null)
				msgs = ((InternalEObject)scale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__SCALE, null, msgs);
			if (newScale != null)
				msgs = ((InternalEObject)newScale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__SCALE, null, msgs);
			msgs = basicSetScale(newScale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__SCALE, newScale, newScale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDuration(Period newDuration, NotificationChain msgs) {
		Period oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__DURATION, oldDuration, newDuration);
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
	public void setDuration(Period newDuration) {
		if (newDuration != duration) {
			NotificationChain msgs = null;
			if (duration != null)
				msgs = ((InternalEObject)duration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__DURATION, null, msgs);
			if (newDuration != null)
				msgs = ((InternalEObject)newDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__DURATION, null, msgs);
			msgs = basicSetDuration(newDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__DURATION, newDuration, newDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__TEMPERATURE:
				return basicSetTemperature(null, msgs);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__SCALE:
				return basicSetScale(null, msgs);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__DURATION:
				return basicSetDuration(null, msgs);
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
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__DESCRIPTION:
				return getDescription();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__TEMPERATURE:
				return getTemperature();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__SCALE:
				return getScale();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__DURATION:
				return getDuration();
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
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__TEMPERATURE:
				setTemperature((Decimal)newValue);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__SCALE:
				setScale((BiologicallyDerivedProductStorageScale)newValue);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__DURATION:
				setDuration((Period)newValue);
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
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__TEMPERATURE:
				setTemperature((Decimal)null);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__SCALE:
				setScale((BiologicallyDerivedProductStorageScale)null);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__DURATION:
				setDuration((Period)null);
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
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__DESCRIPTION:
				return description != null;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__TEMPERATURE:
				return temperature != null;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__SCALE:
				return scale != null;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__DURATION:
				return duration != null;
		}
		return super.eIsSet(featureID);
	}

} //BiologicallyDerivedProductStorageImpl
