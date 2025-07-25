/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Indication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Indication for the Medicinal Product.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicinalProductIndication#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductIndication#getDiseaseSymptomProcedure <em>Disease Symptom Procedure</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductIndication#getDiseaseStatus <em>Disease Status</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductIndication#getComorbidity <em>Comorbidity</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductIndication#getIntendedEffect <em>Intended Effect</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductIndication#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductIndication#getOtherTherapy <em>Other Therapy</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductIndication#getUndesirableEffect <em>Undesirable Effect</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductIndication#getPopulation <em>Population</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicinalProductIndication()
 * @model extendedMetaData="name='MedicinalProductIndication' kind='elementOnly'"
 * @generated
 */
public interface MedicinalProductIndication extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The medication for which this is an indication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductIndication_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSubject();

	/**
	 * Returns the value of the '<em><b>Disease Symptom Procedure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The disease, symptom or procedure that is the indication for treatment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disease Symptom Procedure</em>' containment reference.
	 * @see #setDiseaseSymptomProcedure(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductIndication_DiseaseSymptomProcedure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='diseaseSymptomProcedure' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDiseaseSymptomProcedure();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductIndication#getDiseaseSymptomProcedure <em>Disease Symptom Procedure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disease Symptom Procedure</em>' containment reference.
	 * @see #getDiseaseSymptomProcedure()
	 * @generated
	 */
	void setDiseaseSymptomProcedure(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Disease Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of the disease or symptom for which the indication applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disease Status</em>' containment reference.
	 * @see #setDiseaseStatus(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductIndication_DiseaseStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='diseaseStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDiseaseStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductIndication#getDiseaseStatus <em>Disease Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disease Status</em>' containment reference.
	 * @see #getDiseaseStatus()
	 * @generated
	 */
	void setDiseaseStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Comorbidity</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Comorbidity (concurrent condition) or co-infection as part of the indication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comorbidity</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductIndication_Comorbidity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='comorbidity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getComorbidity();

	/**
	 * Returns the value of the '<em><b>Intended Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The intended effect, aim or strategy to be achieved by the indication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intended Effect</em>' containment reference.
	 * @see #setIntendedEffect(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductIndication_IntendedEffect()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='intendedEffect' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getIntendedEffect();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductIndication#getIntendedEffect <em>Intended Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intended Effect</em>' containment reference.
	 * @see #getIntendedEffect()
	 * @generated
	 */
	void setIntendedEffect(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Timing or duration information as part of the indication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration</em>' containment reference.
	 * @see #setDuration(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductIndication_Duration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='duration' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getDuration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductIndication#getDuration <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' containment reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Quantity value);

	/**
	 * Returns the value of the '<em><b>Other Therapy</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicinalProductIndicationOtherTherapy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about the use of the medicinal product in relation to other therapies described as part of the indication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Therapy</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductIndication_OtherTherapy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='otherTherapy' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicinalProductIndicationOtherTherapy> getOtherTherapy();

	/**
	 * Returns the value of the '<em><b>Undesirable Effect</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describe the undesirable effects of the medicinal product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Undesirable Effect</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductIndication_UndesirableEffect()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='undesirableEffect' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getUndesirableEffect();

	/**
	 * Returns the value of the '<em><b>Population</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Population}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The population group to which this applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Population</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductIndication_Population()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='population' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Population> getPopulation();

} // MedicinalProductIndication
