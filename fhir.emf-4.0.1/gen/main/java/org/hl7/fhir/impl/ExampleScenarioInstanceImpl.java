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

import org.hl7.fhir.ExampleScenarioContainedInstance;
import org.hl7.fhir.ExampleScenarioInstance;
import org.hl7.fhir.ExampleScenarioVersion;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.ResourceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Example Scenario Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioInstanceImpl#getResourceId <em>Resource Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioInstanceImpl#getResourceType <em>Resource Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioInstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioInstanceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioInstanceImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioInstanceImpl#getContainedInstance <em>Contained Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExampleScenarioInstanceImpl extends BackboneElementImpl implements ExampleScenarioInstance {
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
	 * The cached value of the '{@link #getResourceType() <em>Resource Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceType()
	 * @generated
	 * @ordered
	 */
	protected ResourceType resourceType;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String name;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Markdown description;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected EList<ExampleScenarioVersion> version;

	/**
	 * The cached value of the '{@link #getContainedInstance() <em>Contained Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<ExampleScenarioContainedInstance> containedInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExampleScenarioInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getExampleScenarioInstance();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_INSTANCE__RESOURCE_ID, oldResourceId, newResourceId);
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
				msgs = ((InternalEObject)resourceId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_INSTANCE__RESOURCE_ID, null, msgs);
			if (newResourceId != null)
				msgs = ((InternalEObject)newResourceId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_INSTANCE__RESOURCE_ID, null, msgs);
			msgs = basicSetResourceId(newResourceId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_INSTANCE__RESOURCE_ID, newResourceId, newResourceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceType getResourceType() {
		return resourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceType(ResourceType newResourceType, NotificationChain msgs) {
		ResourceType oldResourceType = resourceType;
		resourceType = newResourceType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_INSTANCE__RESOURCE_TYPE, oldResourceType, newResourceType);
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
	public void setResourceType(ResourceType newResourceType) {
		if (newResourceType != resourceType) {
			NotificationChain msgs = null;
			if (resourceType != null)
				msgs = ((InternalEObject)resourceType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_INSTANCE__RESOURCE_TYPE, null, msgs);
			if (newResourceType != null)
				msgs = ((InternalEObject)newResourceType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_INSTANCE__RESOURCE_TYPE, null, msgs);
			msgs = basicSetResourceType(newResourceType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_INSTANCE__RESOURCE_TYPE, newResourceType, newResourceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.hl7.fhir.String newName, NotificationChain msgs) {
		org.hl7.fhir.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_INSTANCE__NAME, oldName, newName);
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
	public void setName(org.hl7.fhir.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_INSTANCE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_INSTANCE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_INSTANCE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(Markdown newDescription, NotificationChain msgs) {
		Markdown oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_INSTANCE__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(Markdown newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_INSTANCE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_INSTANCE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_INSTANCE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExampleScenarioVersion> getVersion() {
		if (version == null) {
			version = new EObjectContainmentEList<ExampleScenarioVersion>(ExampleScenarioVersion.class, this, FhirPackage.EXAMPLE_SCENARIO_INSTANCE__VERSION);
		}
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExampleScenarioContainedInstance> getContainedInstance() {
		if (containedInstance == null) {
			containedInstance = new EObjectContainmentEList<ExampleScenarioContainedInstance>(ExampleScenarioContainedInstance.class, this, FhirPackage.EXAMPLE_SCENARIO_INSTANCE__CONTAINED_INSTANCE);
		}
		return containedInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__RESOURCE_ID:
				return basicSetResourceId(null, msgs);
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__RESOURCE_TYPE:
				return basicSetResourceType(null, msgs);
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__VERSION:
				return ((InternalEList<?>)getVersion()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__CONTAINED_INSTANCE:
				return ((InternalEList<?>)getContainedInstance()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__RESOURCE_ID:
				return getResourceId();
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__RESOURCE_TYPE:
				return getResourceType();
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__NAME:
				return getName();
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__DESCRIPTION:
				return getDescription();
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__VERSION:
				return getVersion();
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__CONTAINED_INSTANCE:
				return getContainedInstance();
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
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__RESOURCE_ID:
				setResourceId((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__RESOURCE_TYPE:
				setResourceType((ResourceType)newValue);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__VERSION:
				getVersion().clear();
				getVersion().addAll((Collection<? extends ExampleScenarioVersion>)newValue);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__CONTAINED_INSTANCE:
				getContainedInstance().clear();
				getContainedInstance().addAll((Collection<? extends ExampleScenarioContainedInstance>)newValue);
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
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__RESOURCE_ID:
				setResourceId((org.hl7.fhir.String)null);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__RESOURCE_TYPE:
				setResourceType((ResourceType)null);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__VERSION:
				getVersion().clear();
				return;
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__CONTAINED_INSTANCE:
				getContainedInstance().clear();
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
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__RESOURCE_ID:
				return resourceId != null;
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__RESOURCE_TYPE:
				return resourceType != null;
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__NAME:
				return name != null;
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__DESCRIPTION:
				return description != null;
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__VERSION:
				return version != null && !version.isEmpty();
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE__CONTAINED_INSTANCE:
				return containedInstance != null && !containedInstance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExampleScenarioInstanceImpl
