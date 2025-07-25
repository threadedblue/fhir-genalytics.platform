/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Contraindication Other Therapy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The clinical particulars - indications, contraindications etc. of a medicinal product, including for regulatory purposes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicinalProductContraindicationOtherTherapy#getTherapyRelationshipType <em>Therapy Relationship Type</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductContraindicationOtherTherapy#getMedicationCodeableConcept <em>Medication Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductContraindicationOtherTherapy#getMedicationReference <em>Medication Reference</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicinalProductContraindicationOtherTherapy()
 * @model extendedMetaData="name='MedicinalProductContraindication.OtherTherapy' kind='elementOnly'"
 * @generated
 */
public interface MedicinalProductContraindicationOtherTherapy extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Therapy Relationship Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of relationship between the medicinal product indication or contraindication and another therapy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Therapy Relationship Type</em>' containment reference.
	 * @see #setTherapyRelationshipType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductContraindicationOtherTherapy_TherapyRelationshipType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='therapyRelationshipType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getTherapyRelationshipType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductContraindicationOtherTherapy#getTherapyRelationshipType <em>Therapy Relationship Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Therapy Relationship Type</em>' containment reference.
	 * @see #getTherapyRelationshipType()
	 * @generated
	 */
	void setTherapyRelationshipType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Medication Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to a specific medication (active substance, medicinal product or class of products) as part of an indication or contraindication. (choose any one of medication*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medication Codeable Concept</em>' containment reference.
	 * @see #setMedicationCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductContraindicationOtherTherapy_MedicationCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='medicationCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getMedicationCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductContraindicationOtherTherapy#getMedicationCodeableConcept <em>Medication Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medication Codeable Concept</em>' containment reference.
	 * @see #getMedicationCodeableConcept()
	 * @generated
	 */
	void setMedicationCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Medication Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to a specific medication (active substance, medicinal product or class of products) as part of an indication or contraindication. (choose any one of medication*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medication Reference</em>' containment reference.
	 * @see #setMedicationReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductContraindicationOtherTherapy_MedicationReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='medicationReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getMedicationReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductContraindicationOtherTherapy#getMedicationReference <em>Medication Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medication Reference</em>' containment reference.
	 * @see #getMedicationReference()
	 * @generated
	 */
	void setMedicationReference(Reference value);

} // MedicinalProductContraindicationOtherTherapy
