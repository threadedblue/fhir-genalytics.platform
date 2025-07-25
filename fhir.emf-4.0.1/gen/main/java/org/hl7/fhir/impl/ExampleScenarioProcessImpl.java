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

import org.hl7.fhir.ExampleScenarioProcess;
import org.hl7.fhir.ExampleScenarioStep;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Markdown;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Example Scenario Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioProcessImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioProcessImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioProcessImpl#getPreConditions <em>Pre Conditions</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioProcessImpl#getPostConditions <em>Post Conditions</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioProcessImpl#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExampleScenarioProcessImpl extends BackboneElementImpl implements ExampleScenarioProcess {
	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String title;

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
	 * The cached value of the '{@link #getPreConditions() <em>Pre Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreConditions()
	 * @generated
	 * @ordered
	 */
	protected Markdown preConditions;

	/**
	 * The cached value of the '{@link #getPostConditions() <em>Post Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostConditions()
	 * @generated
	 * @ordered
	 */
	protected Markdown postConditions;

	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected EList<ExampleScenarioStep> step;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExampleScenarioProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getExampleScenarioProcess();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(org.hl7.fhir.String newTitle, NotificationChain msgs) {
		org.hl7.fhir.String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_PROCESS__TITLE, oldTitle, newTitle);
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
	public void setTitle(org.hl7.fhir.String newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_PROCESS__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_PROCESS__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_PROCESS__TITLE, newTitle, newTitle));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_PROCESS__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_PROCESS__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_PROCESS__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_PROCESS__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getPreConditions() {
		return preConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreConditions(Markdown newPreConditions, NotificationChain msgs) {
		Markdown oldPreConditions = preConditions;
		preConditions = newPreConditions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_PROCESS__PRE_CONDITIONS, oldPreConditions, newPreConditions);
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
	public void setPreConditions(Markdown newPreConditions) {
		if (newPreConditions != preConditions) {
			NotificationChain msgs = null;
			if (preConditions != null)
				msgs = ((InternalEObject)preConditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_PROCESS__PRE_CONDITIONS, null, msgs);
			if (newPreConditions != null)
				msgs = ((InternalEObject)newPreConditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_PROCESS__PRE_CONDITIONS, null, msgs);
			msgs = basicSetPreConditions(newPreConditions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_PROCESS__PRE_CONDITIONS, newPreConditions, newPreConditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getPostConditions() {
		return postConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostConditions(Markdown newPostConditions, NotificationChain msgs) {
		Markdown oldPostConditions = postConditions;
		postConditions = newPostConditions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_PROCESS__POST_CONDITIONS, oldPostConditions, newPostConditions);
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
	public void setPostConditions(Markdown newPostConditions) {
		if (newPostConditions != postConditions) {
			NotificationChain msgs = null;
			if (postConditions != null)
				msgs = ((InternalEObject)postConditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_PROCESS__POST_CONDITIONS, null, msgs);
			if (newPostConditions != null)
				msgs = ((InternalEObject)newPostConditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_PROCESS__POST_CONDITIONS, null, msgs);
			msgs = basicSetPostConditions(newPostConditions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_PROCESS__POST_CONDITIONS, newPostConditions, newPostConditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExampleScenarioStep> getStep() {
		if (step == null) {
			step = new EObjectContainmentEList<ExampleScenarioStep>(ExampleScenarioStep.class, this, FhirPackage.EXAMPLE_SCENARIO_PROCESS__STEP);
		}
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.EXAMPLE_SCENARIO_PROCESS__TITLE:
				return basicSetTitle(null, msgs);
			case FhirPackage.EXAMPLE_SCENARIO_PROCESS__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.EXAMPLE_SCENARIO_PROCESS__PRE_CONDITIONS:
				return basicSetPreConditions(null, msgs);
			case FhirPackage.EXAMPLE_SCENARIO_PROCESS__POST_CONDITIONS:
				return basicSetPostConditions(null, msgs);
			case FhirPackage.EXAMPLE_SCENARIO_PROCESS__STEP:
				return ((InternalEList<?>)getStep()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.EXAMPLE_SCENARIO_PROCESS__TITLE:
				return getTitle();
			case FhirPackage.EXAMPLE_SCENARIO_PROCESS__DESCRIPTION:
				return getDescription();
			case FhirPackage.EXAMPLE_SCENARIO_PROCESS__PRE_CONDITIONS:
				return getPreConditions();
			case FhirPackage.EXAMPLE_SCENARIO_PROCESS__POST_CONDITIONS:
				return getPostConditions();
			case FhirPackage.EXAMPLE_SCENARIO_PROCESS__STEP:
				return getStep();
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
			case FhirPackage.EXAMPLE_SCENARIO_PROCESS__TITLE:
				setTitle((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_PROCESS__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_PROCESS__PRE_CONDITIONS:
				setPreConditions((Markdown)newValue);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_PROCESS__POST_CONDITIONS:
				setPostConditions((Markdown)newValue);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_PROCESS__STEP:
				getStep().clear();
				getStep().addAll((Collection<? extends ExampleScenarioStep>)newValue);
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
			case FhirPackage.EXAMPLE_SCENARIO_PROCESS__TITLE:
				setTitle((org.hl7.fhir.String)null);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_PROCESS__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_PROCESS__PRE_CONDITIONS:
				setPreConditions((Markdown)null);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_PROCESS__POST_CONDITIONS:
				setPostConditions((Markdown)null);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_PROCESS__STEP:
				getStep().clear();
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
			case FhirPackage.EXAMPLE_SCENARIO_PROCESS__TITLE:
				return title != null;
			case FhirPackage.EXAMPLE_SCENARIO_PROCESS__DESCRIPTION:
				return description != null;
			case FhirPackage.EXAMPLE_SCENARIO_PROCESS__PRE_CONDITIONS:
				return preConditions != null;
			case FhirPackage.EXAMPLE_SCENARIO_PROCESS__POST_CONDITIONS:
				return postConditions != null;
			case FhirPackage.EXAMPLE_SCENARIO_PROCESS__STEP:
				return step != null && !step.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExampleScenarioProcessImpl
