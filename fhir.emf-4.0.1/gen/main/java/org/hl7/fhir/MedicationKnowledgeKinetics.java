/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Knowledge Kinetics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Information about a medication that is used to support knowledge.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicationKnowledgeKinetics#getAreaUnderCurve <em>Area Under Curve</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledgeKinetics#getLethalDose50 <em>Lethal Dose50</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledgeKinetics#getHalfLifePeriod <em>Half Life Period</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgeKinetics()
 * @model extendedMetaData="name='MedicationKnowledge.Kinetics' kind='elementOnly'"
 * @generated
 */
public interface MedicationKnowledgeKinetics extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Area Under Curve</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Quantity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The drug concentration measured at certain discrete points in time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Area Under Curve</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgeKinetics_AreaUnderCurve()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='areaUnderCurve' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Quantity> getAreaUnderCurve();

	/**
	 * Returns the value of the '<em><b>Lethal Dose50</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Quantity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The median lethal dose of a drug.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lethal Dose50</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgeKinetics_LethalDose50()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lethalDose50' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Quantity> getLethalDose50();

	/**
	 * Returns the value of the '<em><b>Half Life Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time required for any specified property (e.g., the concentration of a substance in the body) to decrease by half.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Half Life Period</em>' containment reference.
	 * @see #setHalfLifePeriod(Duration)
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledgeKinetics_HalfLifePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='halfLifePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getHalfLifePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationKnowledgeKinetics#getHalfLifePeriod <em>Half Life Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Half Life Period</em>' containment reference.
	 * @see #getHalfLifePeriod()
	 * @generated
	 */
	void setHalfLifePeriod(Duration value);

} // MedicationKnowledgeKinetics
