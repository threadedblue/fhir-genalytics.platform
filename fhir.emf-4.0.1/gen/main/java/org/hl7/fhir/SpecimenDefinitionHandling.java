/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specimen Definition Handling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A kind of specimen with associated set of requirements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionHandling#getTemperatureQualifier <em>Temperature Qualifier</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionHandling#getTemperatureRange <em>Temperature Range</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionHandling#getMaxDuration <em>Max Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionHandling#getInstruction <em>Instruction</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinitionHandling()
 * @model extendedMetaData="name='SpecimenDefinition.Handling' kind='elementOnly'"
 * @generated
 */
public interface SpecimenDefinitionHandling extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Temperature Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * It qualifies the interval of temperature, which characterizes an occurrence of handling. Conditions that are not related to temperature may be handled in the instruction element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Temperature Qualifier</em>' containment reference.
	 * @see #setTemperatureQualifier(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinitionHandling_TemperatureQualifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='temperatureQualifier' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getTemperatureQualifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenDefinitionHandling#getTemperatureQualifier <em>Temperature Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature Qualifier</em>' containment reference.
	 * @see #getTemperatureQualifier()
	 * @generated
	 */
	void setTemperatureQualifier(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Temperature Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The temperature interval for this set of handling instructions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Temperature Range</em>' containment reference.
	 * @see #setTemperatureRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinitionHandling_TemperatureRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='temperatureRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getTemperatureRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenDefinitionHandling#getTemperatureRange <em>Temperature Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature Range</em>' containment reference.
	 * @see #getTemperatureRange()
	 * @generated
	 */
	void setTemperatureRange(Range value);

	/**
	 * Returns the value of the '<em><b>Max Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum time interval of preservation of the specimen with these conditions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Duration</em>' containment reference.
	 * @see #setMaxDuration(Duration)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinitionHandling_MaxDuration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getMaxDuration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenDefinitionHandling#getMaxDuration <em>Max Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Duration</em>' containment reference.
	 * @see #getMaxDuration()
	 * @generated
	 */
	void setMaxDuration(Duration value);

	/**
	 * Returns the value of the '<em><b>Instruction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional textual instructions for the preservation or transport of the specimen. For instance, 'Protect from light exposure'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instruction</em>' containment reference.
	 * @see #setInstruction(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinitionHandling_Instruction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instruction' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getInstruction();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenDefinitionHandling#getInstruction <em>Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instruction</em>' containment reference.
	 * @see #getInstruction()
	 * @generated
	 */
	void setInstruction(org.hl7.fhir.String value);

} // SpecimenDefinitionHandling
