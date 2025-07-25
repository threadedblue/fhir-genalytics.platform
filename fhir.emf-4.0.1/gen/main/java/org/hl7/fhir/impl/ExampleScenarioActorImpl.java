/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.ExampleScenarioActor;
import org.hl7.fhir.ExampleScenarioActorType;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Markdown;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Example Scenario Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioActorImpl#getActorId <em>Actor Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioActorImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioActorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioActorImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExampleScenarioActorImpl extends BackboneElementImpl implements ExampleScenarioActor {
	/**
	 * The cached value of the '{@link #getActorId() <em>Actor Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActorId()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String actorId;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ExampleScenarioActorType type;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExampleScenarioActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getExampleScenarioActor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getActorId() {
		return actorId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActorId(org.hl7.fhir.String newActorId, NotificationChain msgs) {
		org.hl7.fhir.String oldActorId = actorId;
		actorId = newActorId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_ACTOR__ACTOR_ID, oldActorId, newActorId);
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
	public void setActorId(org.hl7.fhir.String newActorId) {
		if (newActorId != actorId) {
			NotificationChain msgs = null;
			if (actorId != null)
				msgs = ((InternalEObject)actorId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_ACTOR__ACTOR_ID, null, msgs);
			if (newActorId != null)
				msgs = ((InternalEObject)newActorId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_ACTOR__ACTOR_ID, null, msgs);
			msgs = basicSetActorId(newActorId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_ACTOR__ACTOR_ID, newActorId, newActorId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExampleScenarioActorType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(ExampleScenarioActorType newType, NotificationChain msgs) {
		ExampleScenarioActorType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_ACTOR__TYPE, oldType, newType);
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
	public void setType(ExampleScenarioActorType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_ACTOR__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_ACTOR__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_ACTOR__TYPE, newType, newType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_ACTOR__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_ACTOR__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_ACTOR__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_ACTOR__NAME, newName, newName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_ACTOR__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_ACTOR__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_ACTOR__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_ACTOR__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.EXAMPLE_SCENARIO_ACTOR__ACTOR_ID:
				return basicSetActorId(null, msgs);
			case FhirPackage.EXAMPLE_SCENARIO_ACTOR__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.EXAMPLE_SCENARIO_ACTOR__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.EXAMPLE_SCENARIO_ACTOR__DESCRIPTION:
				return basicSetDescription(null, msgs);
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
			case FhirPackage.EXAMPLE_SCENARIO_ACTOR__ACTOR_ID:
				return getActorId();
			case FhirPackage.EXAMPLE_SCENARIO_ACTOR__TYPE:
				return getType();
			case FhirPackage.EXAMPLE_SCENARIO_ACTOR__NAME:
				return getName();
			case FhirPackage.EXAMPLE_SCENARIO_ACTOR__DESCRIPTION:
				return getDescription();
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
			case FhirPackage.EXAMPLE_SCENARIO_ACTOR__ACTOR_ID:
				setActorId((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_ACTOR__TYPE:
				setType((ExampleScenarioActorType)newValue);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_ACTOR__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_ACTOR__DESCRIPTION:
				setDescription((Markdown)newValue);
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
			case FhirPackage.EXAMPLE_SCENARIO_ACTOR__ACTOR_ID:
				setActorId((org.hl7.fhir.String)null);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_ACTOR__TYPE:
				setType((ExampleScenarioActorType)null);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_ACTOR__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_ACTOR__DESCRIPTION:
				setDescription((Markdown)null);
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
			case FhirPackage.EXAMPLE_SCENARIO_ACTOR__ACTOR_ID:
				return actorId != null;
			case FhirPackage.EXAMPLE_SCENARIO_ACTOR__TYPE:
				return type != null;
			case FhirPackage.EXAMPLE_SCENARIO_ACTOR__NAME:
				return name != null;
			case FhirPackage.EXAMPLE_SCENARIO_ACTOR__DESCRIPTION:
				return description != null;
		}
		return super.eIsSet(featureID);
	}

} //ExampleScenarioActorImpl
