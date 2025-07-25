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

import org.hl7.fhir.ExampleScenarioAlternative;
import org.hl7.fhir.ExampleScenarioOperation;
import org.hl7.fhir.ExampleScenarioProcess;
import org.hl7.fhir.ExampleScenarioStep;
import org.hl7.fhir.FhirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Example Scenario Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioStepImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioStepImpl#getPause <em>Pause</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioStepImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioStepImpl#getAlternative <em>Alternative</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExampleScenarioStepImpl extends BackboneElementImpl implements ExampleScenarioStep {
	/**
	 * The cached value of the '{@link #getProcess() <em>Process</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
	protected EList<ExampleScenarioProcess> process;

	/**
	 * The cached value of the '{@link #getPause() <em>Pause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPause()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean pause;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected ExampleScenarioOperation operation;

	/**
	 * The cached value of the '{@link #getAlternative() <em>Alternative</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternative()
	 * @generated
	 * @ordered
	 */
	protected EList<ExampleScenarioAlternative> alternative;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExampleScenarioStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getExampleScenarioStep();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExampleScenarioProcess> getProcess() {
		if (process == null) {
			process = new EObjectContainmentEList<ExampleScenarioProcess>(ExampleScenarioProcess.class, this, FhirPackage.EXAMPLE_SCENARIO_STEP__PROCESS);
		}
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getPause() {
		return pause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPause(org.hl7.fhir.Boolean newPause, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldPause = pause;
		pause = newPause;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_STEP__PAUSE, oldPause, newPause);
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
	public void setPause(org.hl7.fhir.Boolean newPause) {
		if (newPause != pause) {
			NotificationChain msgs = null;
			if (pause != null)
				msgs = ((InternalEObject)pause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_STEP__PAUSE, null, msgs);
			if (newPause != null)
				msgs = ((InternalEObject)newPause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_STEP__PAUSE, null, msgs);
			msgs = basicSetPause(newPause, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_STEP__PAUSE, newPause, newPause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExampleScenarioOperation getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperation(ExampleScenarioOperation newOperation, NotificationChain msgs) {
		ExampleScenarioOperation oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_STEP__OPERATION, oldOperation, newOperation);
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
	public void setOperation(ExampleScenarioOperation newOperation) {
		if (newOperation != operation) {
			NotificationChain msgs = null;
			if (operation != null)
				msgs = ((InternalEObject)operation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_STEP__OPERATION, null, msgs);
			if (newOperation != null)
				msgs = ((InternalEObject)newOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_STEP__OPERATION, null, msgs);
			msgs = basicSetOperation(newOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_STEP__OPERATION, newOperation, newOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExampleScenarioAlternative> getAlternative() {
		if (alternative == null) {
			alternative = new EObjectContainmentEList<ExampleScenarioAlternative>(ExampleScenarioAlternative.class, this, FhirPackage.EXAMPLE_SCENARIO_STEP__ALTERNATIVE);
		}
		return alternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.EXAMPLE_SCENARIO_STEP__PROCESS:
				return ((InternalEList<?>)getProcess()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXAMPLE_SCENARIO_STEP__PAUSE:
				return basicSetPause(null, msgs);
			case FhirPackage.EXAMPLE_SCENARIO_STEP__OPERATION:
				return basicSetOperation(null, msgs);
			case FhirPackage.EXAMPLE_SCENARIO_STEP__ALTERNATIVE:
				return ((InternalEList<?>)getAlternative()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.EXAMPLE_SCENARIO_STEP__PROCESS:
				return getProcess();
			case FhirPackage.EXAMPLE_SCENARIO_STEP__PAUSE:
				return getPause();
			case FhirPackage.EXAMPLE_SCENARIO_STEP__OPERATION:
				return getOperation();
			case FhirPackage.EXAMPLE_SCENARIO_STEP__ALTERNATIVE:
				return getAlternative();
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
			case FhirPackage.EXAMPLE_SCENARIO_STEP__PROCESS:
				getProcess().clear();
				getProcess().addAll((Collection<? extends ExampleScenarioProcess>)newValue);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_STEP__PAUSE:
				setPause((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_STEP__OPERATION:
				setOperation((ExampleScenarioOperation)newValue);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_STEP__ALTERNATIVE:
				getAlternative().clear();
				getAlternative().addAll((Collection<? extends ExampleScenarioAlternative>)newValue);
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
			case FhirPackage.EXAMPLE_SCENARIO_STEP__PROCESS:
				getProcess().clear();
				return;
			case FhirPackage.EXAMPLE_SCENARIO_STEP__PAUSE:
				setPause((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_STEP__OPERATION:
				setOperation((ExampleScenarioOperation)null);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_STEP__ALTERNATIVE:
				getAlternative().clear();
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
			case FhirPackage.EXAMPLE_SCENARIO_STEP__PROCESS:
				return process != null && !process.isEmpty();
			case FhirPackage.EXAMPLE_SCENARIO_STEP__PAUSE:
				return pause != null;
			case FhirPackage.EXAMPLE_SCENARIO_STEP__OPERATION:
				return operation != null;
			case FhirPackage.EXAMPLE_SCENARIO_STEP__ALTERNATIVE:
				return alternative != null && !alternative.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExampleScenarioStepImpl
