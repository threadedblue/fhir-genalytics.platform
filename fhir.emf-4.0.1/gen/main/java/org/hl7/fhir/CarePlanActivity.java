/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Care Plan Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.CarePlanActivity#getOutcomeCodeableConcept <em>Outcome Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.CarePlanActivity#getOutcomeReference <em>Outcome Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.CarePlanActivity#getProgress <em>Progress</em>}</li>
 *   <li>{@link org.hl7.fhir.CarePlanActivity#getReference <em>Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.CarePlanActivity#getDetail <em>Detail</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCarePlanActivity()
 * @model extendedMetaData="name='CarePlan.Activity' kind='elementOnly'"
 * @generated
 */
public interface CarePlanActivity extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Outcome Codeable Concept</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the outcome at the point when the status of the activity is assessed.  For example, the outcome of an education activity could be patient understands (or not).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outcome Codeable Concept</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCarePlanActivity_OutcomeCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outcomeCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getOutcomeCodeableConcept();

	/**
	 * Returns the value of the '<em><b>Outcome Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Details of the outcome or action resulting from the activity.  The reference to an "event" resource, such as Procedure or Encounter or Observation, is the result/outcome of the activity itself.  The activity can be conveyed using CarePlan.activity.detail OR using the CarePlan.activity.reference (a reference to a “request” resource).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outcome Reference</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCarePlanActivity_OutcomeReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outcomeReference' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getOutcomeReference();

	/**
	 * Returns the value of the '<em><b>Progress</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Notes about the adherence/status/progress of the activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Progress</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCarePlanActivity_Progress()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='progress' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getProgress();

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The details of the proposed activity represented in a specific resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCarePlanActivity_Reference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CarePlanActivity#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A simple summary of a planned activity suitable for a general care plan system (e.g. form driven) that doesn't know about specific resources such as procedure etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detail</em>' containment reference.
	 * @see #setDetail(CarePlanDetail)
	 * @see org.hl7.fhir.FhirPackage#getCarePlanActivity_Detail()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='detail' namespace='##targetNamespace'"
	 * @generated
	 */
	CarePlanDetail getDetail();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CarePlanActivity#getDetail <em>Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail</em>' containment reference.
	 * @see #getDetail()
	 * @generated
	 */
	void setDetail(CarePlanDetail value);

} // CarePlanActivity
