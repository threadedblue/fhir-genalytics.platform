/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal Lifecycle Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Codes that reflect the current state of a goal and whether the goal is still being targeted.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.GoalLifecycleStatus#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getGoalLifecycleStatus()
 * @model extendedMetaData="name='GoalLifecycleStatus' kind='elementOnly'"
 * @generated
 */
public interface GoalLifecycleStatus extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.fhir.GoalLifecycleStatusList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.GoalLifecycleStatusList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(GoalLifecycleStatusList)
	 * @see org.hl7.fhir.FhirPackage#getGoalLifecycleStatus_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	GoalLifecycleStatusList getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.GoalLifecycleStatus#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.GoalLifecycleStatusList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(GoalLifecycleStatusList value);

	/**
	 * Unsets the value of the '{@link org.hl7.fhir.GoalLifecycleStatus#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(GoalLifecycleStatusList)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.fhir.GoalLifecycleStatus#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(GoalLifecycleStatusList)
	 * @generated
	 */
	boolean isSetValue();

} // GoalLifecycleStatus
