/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan Definition Related Action</b></em>'.
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
 *   <li>{@link org.hl7.fhir.PlanDefinitionRelatedAction#getActionId <em>Action Id</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionRelatedAction#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionRelatedAction#getOffsetDuration <em>Offset Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.PlanDefinitionRelatedAction#getOffsetRange <em>Offset Range</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionRelatedAction()
 * @model extendedMetaData="name='PlanDefinition.RelatedAction' kind='elementOnly'"
 * @generated
 */
public interface PlanDefinitionRelatedAction extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Action Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The element id of the related action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action Id</em>' containment reference.
	 * @see #setActionId(Id)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionRelatedAction_ActionId()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='actionId' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getActionId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionRelatedAction#getActionId <em>Action Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Id</em>' containment reference.
	 * @see #getActionId()
	 * @generated
	 */
	void setActionId(Id value);

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relationship of this action to the related action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference.
	 * @see #setRelationship(ActionRelationshipType)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionRelatedAction_Relationship()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='relationship' namespace='##targetNamespace'"
	 * @generated
	 */
	ActionRelationshipType getRelationship();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionRelatedAction#getRelationship <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' containment reference.
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(ActionRelationshipType value);

	/**
	 * Returns the value of the '<em><b>Offset Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A duration or range of durations to apply to the relationship. For example, 30-60 minutes before. (choose any one of offset*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Offset Duration</em>' containment reference.
	 * @see #setOffsetDuration(Duration)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionRelatedAction_OffsetDuration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='offsetDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getOffsetDuration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionRelatedAction#getOffsetDuration <em>Offset Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset Duration</em>' containment reference.
	 * @see #getOffsetDuration()
	 * @generated
	 */
	void setOffsetDuration(Duration value);

	/**
	 * Returns the value of the '<em><b>Offset Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A duration or range of durations to apply to the relationship. For example, 30-60 minutes before. (choose any one of offset*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Offset Range</em>' containment reference.
	 * @see #setOffsetRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getPlanDefinitionRelatedAction_OffsetRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='offsetRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getOffsetRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanDefinitionRelatedAction#getOffsetRange <em>Offset Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset Range</em>' containment reference.
	 * @see #getOffsetRange()
	 * @generated
	 */
	void setOffsetRange(Range value);

} // PlanDefinitionRelatedAction
