/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Duration;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Range;
import org.hl7.fhir.SpecimenDefinitionHandling;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specimen Definition Handling</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionHandlingImpl#getTemperatureQualifier <em>Temperature Qualifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionHandlingImpl#getTemperatureRange <em>Temperature Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionHandlingImpl#getMaxDuration <em>Max Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionHandlingImpl#getInstruction <em>Instruction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecimenDefinitionHandlingImpl extends BackboneElementImpl implements SpecimenDefinitionHandling {
	/**
	 * The cached value of the '{@link #getTemperatureQualifier() <em>Temperature Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperatureQualifier()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept temperatureQualifier;

	/**
	 * The cached value of the '{@link #getTemperatureRange() <em>Temperature Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperatureRange()
	 * @generated
	 * @ordered
	 */
	protected Range temperatureRange;

	/**
	 * The cached value of the '{@link #getMaxDuration() <em>Max Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration maxDuration;

	/**
	 * The cached value of the '{@link #getInstruction() <em>Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String instruction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecimenDefinitionHandlingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSpecimenDefinitionHandling();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getTemperatureQualifier() {
		return temperatureQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemperatureQualifier(CodeableConcept newTemperatureQualifier, NotificationChain msgs) {
		CodeableConcept oldTemperatureQualifier = temperatureQualifier;
		temperatureQualifier = newTemperatureQualifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_HANDLING__TEMPERATURE_QUALIFIER, oldTemperatureQualifier, newTemperatureQualifier);
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
	public void setTemperatureQualifier(CodeableConcept newTemperatureQualifier) {
		if (newTemperatureQualifier != temperatureQualifier) {
			NotificationChain msgs = null;
			if (temperatureQualifier != null)
				msgs = ((InternalEObject)temperatureQualifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_HANDLING__TEMPERATURE_QUALIFIER, null, msgs);
			if (newTemperatureQualifier != null)
				msgs = ((InternalEObject)newTemperatureQualifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_HANDLING__TEMPERATURE_QUALIFIER, null, msgs);
			msgs = basicSetTemperatureQualifier(newTemperatureQualifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_HANDLING__TEMPERATURE_QUALIFIER, newTemperatureQualifier, newTemperatureQualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Range getTemperatureRange() {
		return temperatureRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemperatureRange(Range newTemperatureRange, NotificationChain msgs) {
		Range oldTemperatureRange = temperatureRange;
		temperatureRange = newTemperatureRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_HANDLING__TEMPERATURE_RANGE, oldTemperatureRange, newTemperatureRange);
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
	public void setTemperatureRange(Range newTemperatureRange) {
		if (newTemperatureRange != temperatureRange) {
			NotificationChain msgs = null;
			if (temperatureRange != null)
				msgs = ((InternalEObject)temperatureRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_HANDLING__TEMPERATURE_RANGE, null, msgs);
			if (newTemperatureRange != null)
				msgs = ((InternalEObject)newTemperatureRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_HANDLING__TEMPERATURE_RANGE, null, msgs);
			msgs = basicSetTemperatureRange(newTemperatureRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_HANDLING__TEMPERATURE_RANGE, newTemperatureRange, newTemperatureRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getMaxDuration() {
		return maxDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxDuration(Duration newMaxDuration, NotificationChain msgs) {
		Duration oldMaxDuration = maxDuration;
		maxDuration = newMaxDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_HANDLING__MAX_DURATION, oldMaxDuration, newMaxDuration);
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
	public void setMaxDuration(Duration newMaxDuration) {
		if (newMaxDuration != maxDuration) {
			NotificationChain msgs = null;
			if (maxDuration != null)
				msgs = ((InternalEObject)maxDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_HANDLING__MAX_DURATION, null, msgs);
			if (newMaxDuration != null)
				msgs = ((InternalEObject)newMaxDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_HANDLING__MAX_DURATION, null, msgs);
			msgs = basicSetMaxDuration(newMaxDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_HANDLING__MAX_DURATION, newMaxDuration, newMaxDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getInstruction() {
		return instruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstruction(org.hl7.fhir.String newInstruction, NotificationChain msgs) {
		org.hl7.fhir.String oldInstruction = instruction;
		instruction = newInstruction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_HANDLING__INSTRUCTION, oldInstruction, newInstruction);
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
	public void setInstruction(org.hl7.fhir.String newInstruction) {
		if (newInstruction != instruction) {
			NotificationChain msgs = null;
			if (instruction != null)
				msgs = ((InternalEObject)instruction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_HANDLING__INSTRUCTION, null, msgs);
			if (newInstruction != null)
				msgs = ((InternalEObject)newInstruction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_HANDLING__INSTRUCTION, null, msgs);
			msgs = basicSetInstruction(newInstruction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_HANDLING__INSTRUCTION, newInstruction, newInstruction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING__TEMPERATURE_QUALIFIER:
				return basicSetTemperatureQualifier(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING__TEMPERATURE_RANGE:
				return basicSetTemperatureRange(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING__MAX_DURATION:
				return basicSetMaxDuration(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING__INSTRUCTION:
				return basicSetInstruction(null, msgs);
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
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING__TEMPERATURE_QUALIFIER:
				return getTemperatureQualifier();
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING__TEMPERATURE_RANGE:
				return getTemperatureRange();
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING__MAX_DURATION:
				return getMaxDuration();
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING__INSTRUCTION:
				return getInstruction();
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
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING__TEMPERATURE_QUALIFIER:
				setTemperatureQualifier((CodeableConcept)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING__TEMPERATURE_RANGE:
				setTemperatureRange((Range)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING__MAX_DURATION:
				setMaxDuration((Duration)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING__INSTRUCTION:
				setInstruction((org.hl7.fhir.String)newValue);
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
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING__TEMPERATURE_QUALIFIER:
				setTemperatureQualifier((CodeableConcept)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING__TEMPERATURE_RANGE:
				setTemperatureRange((Range)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING__MAX_DURATION:
				setMaxDuration((Duration)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING__INSTRUCTION:
				setInstruction((org.hl7.fhir.String)null);
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
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING__TEMPERATURE_QUALIFIER:
				return temperatureQualifier != null;
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING__TEMPERATURE_RANGE:
				return temperatureRange != null;
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING__MAX_DURATION:
				return maxDuration != null;
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING__INSTRUCTION:
				return instruction != null;
		}
		return super.eIsSet(featureID);
	}

} //SpecimenDefinitionHandlingImpl
