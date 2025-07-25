/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.ExampleScenarioContainedInstance;
import org.hl7.fhir.FhirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Example Scenario Contained Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioContainedInstanceImpl#getResourceId <em>Resource Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioContainedInstanceImpl#getVersionId <em>Version Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExampleScenarioContainedInstanceImpl extends BackboneElementImpl implements ExampleScenarioContainedInstance {
	/**
	 * The cached value of the '{@link #getResourceId() <em>Resource Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceId()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String resourceId;

	/**
	 * The cached value of the '{@link #getVersionId() <em>Version Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionId()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String versionId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExampleScenarioContainedInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getExampleScenarioContainedInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getResourceId() {
		return resourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceId(org.hl7.fhir.String newResourceId, NotificationChain msgs) {
		org.hl7.fhir.String oldResourceId = resourceId;
		resourceId = newResourceId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_CONTAINED_INSTANCE__RESOURCE_ID, oldResourceId, newResourceId);
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
	public void setResourceId(org.hl7.fhir.String newResourceId) {
		if (newResourceId != resourceId) {
			NotificationChain msgs = null;
			if (resourceId != null)
				msgs = ((InternalEObject)resourceId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_CONTAINED_INSTANCE__RESOURCE_ID, null, msgs);
			if (newResourceId != null)
				msgs = ((InternalEObject)newResourceId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_CONTAINED_INSTANCE__RESOURCE_ID, null, msgs);
			msgs = basicSetResourceId(newResourceId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_CONTAINED_INSTANCE__RESOURCE_ID, newResourceId, newResourceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getVersionId() {
		return versionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersionId(org.hl7.fhir.String newVersionId, NotificationChain msgs) {
		org.hl7.fhir.String oldVersionId = versionId;
		versionId = newVersionId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_CONTAINED_INSTANCE__VERSION_ID, oldVersionId, newVersionId);
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
	public void setVersionId(org.hl7.fhir.String newVersionId) {
		if (newVersionId != versionId) {
			NotificationChain msgs = null;
			if (versionId != null)
				msgs = ((InternalEObject)versionId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_CONTAINED_INSTANCE__VERSION_ID, null, msgs);
			if (newVersionId != null)
				msgs = ((InternalEObject)newVersionId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_CONTAINED_INSTANCE__VERSION_ID, null, msgs);
			msgs = basicSetVersionId(newVersionId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_CONTAINED_INSTANCE__VERSION_ID, newVersionId, newVersionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.EXAMPLE_SCENARIO_CONTAINED_INSTANCE__RESOURCE_ID:
				return basicSetResourceId(null, msgs);
			case FhirPackage.EXAMPLE_SCENARIO_CONTAINED_INSTANCE__VERSION_ID:
				return basicSetVersionId(null, msgs);
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
			case FhirPackage.EXAMPLE_SCENARIO_CONTAINED_INSTANCE__RESOURCE_ID:
				return getResourceId();
			case FhirPackage.EXAMPLE_SCENARIO_CONTAINED_INSTANCE__VERSION_ID:
				return getVersionId();
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
			case FhirPackage.EXAMPLE_SCENARIO_CONTAINED_INSTANCE__RESOURCE_ID:
				setResourceId((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_CONTAINED_INSTANCE__VERSION_ID:
				setVersionId((org.hl7.fhir.String)newValue);
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
			case FhirPackage.EXAMPLE_SCENARIO_CONTAINED_INSTANCE__RESOURCE_ID:
				setResourceId((org.hl7.fhir.String)null);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_CONTAINED_INSTANCE__VERSION_ID:
				setVersionId((org.hl7.fhir.String)null);
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
			case FhirPackage.EXAMPLE_SCENARIO_CONTAINED_INSTANCE__RESOURCE_ID:
				return resourceId != null;
			case FhirPackage.EXAMPLE_SCENARIO_CONTAINED_INSTANCE__VERSION_ID:
				return versionId != null;
		}
		return super.eIsSet(featureID);
	}

} //ExampleScenarioContainedInstanceImpl
