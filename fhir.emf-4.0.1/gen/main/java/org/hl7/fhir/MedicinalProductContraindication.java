/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Contraindication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The clinical particulars - indications, contraindications etc. of a medicinal product, including for regulatory purposes.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicinalProductContraindication#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductContraindication#getDisease <em>Disease</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductContraindication#getDiseaseStatus <em>Disease Status</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductContraindication#getComorbidity <em>Comorbidity</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductContraindication#getTherapeuticIndication <em>Therapeutic Indication</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductContraindication#getOtherTherapy <em>Other Therapy</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductContraindication#getPopulation <em>Population</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicinalProductContraindication()
 * @model extendedMetaData="name='MedicinalProductContraindication' kind='elementOnly'"
 * @generated
 */
public interface MedicinalProductContraindication extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The medication for which this is an indication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductContraindication_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSubject();

	/**
	 * Returns the value of the '<em><b>Disease</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The disease, symptom or procedure for the contraindication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disease</em>' containment reference.
	 * @see #setDisease(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductContraindication_Disease()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='disease' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDisease();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductContraindication#getDisease <em>Disease</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disease</em>' containment reference.
	 * @see #getDisease()
	 * @generated
	 */
	void setDisease(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Disease Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of the disease or symptom for the contraindication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disease Status</em>' containment reference.
	 * @see #setDiseaseStatus(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductContraindication_DiseaseStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='diseaseStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDiseaseStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductContraindication#getDiseaseStatus <em>Disease Status</em>}' containment reference.
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
	 * A comorbidity (concurrent condition) or coinfection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comorbidity</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductContraindication_Comorbidity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='comorbidity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getComorbidity();

	/**
	 * Returns the value of the '<em><b>Therapeutic Indication</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about the use of the medicinal product in relation to other therapies as part of the indication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Therapeutic Indication</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductContraindication_TherapeuticIndication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='therapeuticIndication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getTherapeuticIndication();

	/**
	 * Returns the value of the '<em><b>Other Therapy</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicinalProductContraindicationOtherTherapy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about the use of the medicinal product in relation to other therapies described as part of the indication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Therapy</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductContraindication_OtherTherapy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='otherTherapy' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicinalProductContraindicationOtherTherapy> getOtherTherapy();

	/**
	 * Returns the value of the '<em><b>Population</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Population}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The population group to which this applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Population</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductContraindication_Population()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='population' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Population> getPopulation();

} // MedicinalProductContraindication
