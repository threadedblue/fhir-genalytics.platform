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

import org.hl7.fhir.AggregationMode;
import org.hl7.fhir.Canonical;
import org.hl7.fhir.ElementDefinitionType;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.ReferenceVersionRules;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Definition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionTypeImpl#getProfile <em>Profile</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionTypeImpl#getTargetProfile <em>Target Profile</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionTypeImpl#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionTypeImpl#getVersioning <em>Versioning</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementDefinitionTypeImpl extends BackboneElementImpl implements ElementDefinitionType {
	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected Uri code;

	/**
	 * The cached value of the '{@link #getProfile() <em>Profile</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfile()
	 * @generated
	 * @ordered
	 */
	protected EList<Canonical> profile;

	/**
	 * The cached value of the '{@link #getTargetProfile() <em>Target Profile</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetProfile()
	 * @generated
	 * @ordered
	 */
	protected EList<Canonical> targetProfile;

	/**
	 * The cached value of the '{@link #getAggregation() <em>Aggregation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregation()
	 * @generated
	 * @ordered
	 */
	protected EList<AggregationMode> aggregation;

	/**
	 * The cached value of the '{@link #getVersioning() <em>Versioning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersioning()
	 * @generated
	 * @ordered
	 */
	protected ReferenceVersionRules versioning;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementDefinitionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getElementDefinitionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(Uri newCode, NotificationChain msgs) {
		Uri oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_TYPE__CODE, oldCode, newCode);
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
	public void setCode(Uri newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_TYPE__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_TYPE__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_TYPE__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Canonical> getProfile() {
		if (profile == null) {
			profile = new EObjectContainmentEList<Canonical>(Canonical.class, this, FhirPackage.ELEMENT_DEFINITION_TYPE__PROFILE);
		}
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Canonical> getTargetProfile() {
		if (targetProfile == null) {
			targetProfile = new EObjectContainmentEList<Canonical>(Canonical.class, this, FhirPackage.ELEMENT_DEFINITION_TYPE__TARGET_PROFILE);
		}
		return targetProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AggregationMode> getAggregation() {
		if (aggregation == null) {
			aggregation = new EObjectContainmentEList<AggregationMode>(AggregationMode.class, this, FhirPackage.ELEMENT_DEFINITION_TYPE__AGGREGATION);
		}
		return aggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceVersionRules getVersioning() {
		return versioning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersioning(ReferenceVersionRules newVersioning, NotificationChain msgs) {
		ReferenceVersionRules oldVersioning = versioning;
		versioning = newVersioning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_TYPE__VERSIONING, oldVersioning, newVersioning);
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
	public void setVersioning(ReferenceVersionRules newVersioning) {
		if (newVersioning != versioning) {
			NotificationChain msgs = null;
			if (versioning != null)
				msgs = ((InternalEObject)versioning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_TYPE__VERSIONING, null, msgs);
			if (newVersioning != null)
				msgs = ((InternalEObject)newVersioning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_TYPE__VERSIONING, null, msgs);
			msgs = basicSetVersioning(newVersioning, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_TYPE__VERSIONING, newVersioning, newVersioning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ELEMENT_DEFINITION_TYPE__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_TYPE__PROFILE:
				return ((InternalEList<?>)getProfile()).basicRemove(otherEnd, msgs);
			case FhirPackage.ELEMENT_DEFINITION_TYPE__TARGET_PROFILE:
				return ((InternalEList<?>)getTargetProfile()).basicRemove(otherEnd, msgs);
			case FhirPackage.ELEMENT_DEFINITION_TYPE__AGGREGATION:
				return ((InternalEList<?>)getAggregation()).basicRemove(otherEnd, msgs);
			case FhirPackage.ELEMENT_DEFINITION_TYPE__VERSIONING:
				return basicSetVersioning(null, msgs);
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
			case FhirPackage.ELEMENT_DEFINITION_TYPE__CODE:
				return getCode();
			case FhirPackage.ELEMENT_DEFINITION_TYPE__PROFILE:
				return getProfile();
			case FhirPackage.ELEMENT_DEFINITION_TYPE__TARGET_PROFILE:
				return getTargetProfile();
			case FhirPackage.ELEMENT_DEFINITION_TYPE__AGGREGATION:
				return getAggregation();
			case FhirPackage.ELEMENT_DEFINITION_TYPE__VERSIONING:
				return getVersioning();
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
			case FhirPackage.ELEMENT_DEFINITION_TYPE__CODE:
				setCode((Uri)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_TYPE__PROFILE:
				getProfile().clear();
				getProfile().addAll((Collection<? extends Canonical>)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_TYPE__TARGET_PROFILE:
				getTargetProfile().clear();
				getTargetProfile().addAll((Collection<? extends Canonical>)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_TYPE__AGGREGATION:
				getAggregation().clear();
				getAggregation().addAll((Collection<? extends AggregationMode>)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_TYPE__VERSIONING:
				setVersioning((ReferenceVersionRules)newValue);
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
			case FhirPackage.ELEMENT_DEFINITION_TYPE__CODE:
				setCode((Uri)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_TYPE__PROFILE:
				getProfile().clear();
				return;
			case FhirPackage.ELEMENT_DEFINITION_TYPE__TARGET_PROFILE:
				getTargetProfile().clear();
				return;
			case FhirPackage.ELEMENT_DEFINITION_TYPE__AGGREGATION:
				getAggregation().clear();
				return;
			case FhirPackage.ELEMENT_DEFINITION_TYPE__VERSIONING:
				setVersioning((ReferenceVersionRules)null);
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
			case FhirPackage.ELEMENT_DEFINITION_TYPE__CODE:
				return code != null;
			case FhirPackage.ELEMENT_DEFINITION_TYPE__PROFILE:
				return profile != null && !profile.isEmpty();
			case FhirPackage.ELEMENT_DEFINITION_TYPE__TARGET_PROFILE:
				return targetProfile != null && !targetProfile.isEmpty();
			case FhirPackage.ELEMENT_DEFINITION_TYPE__AGGREGATION:
				return aggregation != null && !aggregation.isEmpty();
			case FhirPackage.ELEMENT_DEFINITION_TYPE__VERSIONING:
				return versioning != null;
		}
		return super.eIsSet(featureID);
	}

} //ElementDefinitionTypeImpl
