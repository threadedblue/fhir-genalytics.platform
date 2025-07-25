/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan Definition Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.PlanDefinitionTarget#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionTarget#getDetailQuantity <em>Detail Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionTarget#getDetailRange <em>Detail Range</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionTarget#getDetailCodeableConcept <em>Detail Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionTarget#getDue <em>Due</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionTarget()
 * @model extendedMetaData="name='PlanDefinition.Target' kind='elementOnly'"
 * @generated
 */
public interface PlanDefinitionTarget extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parameter whose value is to be tracked, e.g. body weight, blood pressure, or hemoglobin A1c level.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measure</em>' containment reference.
	 * @see #setMeasure(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionTarget_Measure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='measure' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getMeasure();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionTarget#getMeasure <em>Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure</em>' containment reference.
	 * @see #getMeasure()
	 * @generated
	 */
	void setMeasure(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Detail Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target value of the measure to be achieved to signify fulfillment of the goal, e.g. 150 pounds or 7.0%. Either the high or low or both values of the range can be specified. When a low value is missing, it indicates that the goal is achieved at any value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any value at or above the low value. (choose any one of detail*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detail Quantity</em>' containment reference.
	 * @see #setDetailQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionTarget_DetailQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='detailQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getDetailQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionTarget#getDetailQuantity <em>Detail Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail Quantity</em>' containment reference.
	 * @see #getDetailQuantity()
	 * @generated
	 */
	void setDetailQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Detail Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target value of the measure to be achieved to signify fulfillment of the goal, e.g. 150 pounds or 7.0%. Either the high or low or both values of the range can be specified. When a low value is missing, it indicates that the goal is achieved at any value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any value at or above the low value. (choose any one of detail*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detail Range</em>' containment reference.
	 * @see #setDetailRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionTarget_DetailRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='detailRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getDetailRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionTarget#getDetailRange <em>Detail Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail Range</em>' containment reference.
	 * @see #getDetailRange()
	 * @generated
	 */
	void setDetailRange(Range value);

	/**
	 * Returns the value of the '<em><b>Detail Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target value of the measure to be achieved to signify fulfillment of the goal, e.g. 150 pounds or 7.0%. Either the high or low or both values of the range can be specified. When a low value is missing, it indicates that the goal is achieved at any value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any value at or above the low value. (choose any one of detail*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detail Codeable Concept</em>' containment reference.
	 * @see #setDetailCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionTarget_DetailCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='detailCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDetailCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionTarget#getDetailCodeableConcept <em>Detail Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail Codeable Concept</em>' containment reference.
	 * @see #getDetailCodeableConcept()
	 * @generated
	 */
	void setDetailCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Due</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the timeframe after the start of the goal in which the goal should be met.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Due</em>' containment reference.
	 * @see #setDue(Duration)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionTarget_Due()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='due' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getDue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionTarget#getDue <em>Due</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Due</em>' containment reference.
	 * @see #getDue()
	 * @generated
	 */
	void setDue(Duration value);

} // PlanDefinitionTarget
