/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Knowledge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Information about a medication that is used to support knowledge.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicationKnowledge#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledge#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledge#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledge#getDoseForm <em>Dose Form</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledge#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledge#getSynonym <em>Synonym</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledge#getRelatedMedicationKnowledge <em>Related Medication Knowledge</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledge#getAssociatedMedication <em>Associated Medication</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledge#getProductType <em>Product Type</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledge#getMonograph <em>Monograph</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledge#getIngredient <em>Ingredient</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledge#getPreparationInstruction <em>Preparation Instruction</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledge#getIntendedRoute <em>Intended Route</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledge#getCost <em>Cost</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledge#getMonitoringProgram <em>Monitoring Program</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledge#getAdministrationGuidelines <em>Administration Guidelines</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledge#getMedicineClassification <em>Medicine Classification</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledge#getPackaging <em>Packaging</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledge#getDrugCharacteristic <em>Drug Characteristic</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledge#getContraindication <em>Contraindication</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledge#getRegulatory <em>Regulatory</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledge#getKinetics <em>Kinetics</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledge()
 * @model extendedMetaData="name='MedicationKnowledge' kind='elementOnly'"
 * @generated
 */
public interface MedicationKnowledge extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code that specifies this medication, or a textual description if no code is available. Usage note: This could be a standard medication code such as a code from RxNorm, SNOMED CT, IDMP etc. It could also be a national or local formulary code, optionally with translations to other code systems.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledge_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationKnowledge#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code to indicate if the medication is in active use.  The status refers to the validity about the information of the medication and not to its medicinal properties.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(Code)
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledge_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationKnowledge#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the details of the manufacturer of the medication product.  This is not intended to represent the distributor of a medication product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer</em>' containment reference.
	 * @see #setManufacturer(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledge_Manufacturer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='manufacturer' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getManufacturer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationKnowledge#getManufacturer <em>Manufacturer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' containment reference.
	 * @see #getManufacturer()
	 * @generated
	 */
	void setManufacturer(Reference value);

	/**
	 * Returns the value of the '<em><b>Dose Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the form of the item.  Powder; tablets; capsule.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dose Form</em>' containment reference.
	 * @see #setDoseForm(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledge_DoseForm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='doseForm' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDoseForm();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationKnowledge#getDoseForm <em>Dose Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dose Form</em>' containment reference.
	 * @see #getDoseForm()
	 * @generated
	 */
	void setDoseForm(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specific amount of the drug in the packaged product.  For example, when specifying a product that has the same strength (For example, Insulin glargine 100 unit per mL solution for injection), this attribute provides additional clarification of the package amount (For example, 3 mL, 10mL, etc.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount</em>' containment reference.
	 * @see #setAmount(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledge_Amount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amount' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getAmount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationKnowledge#getAmount <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' containment reference.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(Quantity value);

	/**
	 * Returns the value of the '<em><b>Synonym</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional names for a medication, for example, the name(s) given to a medication in different countries.  For example, acetaminophen and paracetamol or salbutamol and albuterol.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Synonym</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledge_Synonym()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='synonym' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getSynonym();

	/**
	 * Returns the value of the '<em><b>Related Medication Knowledge</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicationKnowledgeRelatedMedicationKnowledge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Associated or related knowledge about a medication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Medication Knowledge</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledge_RelatedMedicationKnowledge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relatedMedicationKnowledge' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicationKnowledgeRelatedMedicationKnowledge> getRelatedMedicationKnowledge();

	/**
	 * Returns the value of the '<em><b>Associated Medication</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Associated or related medications.  For example, if the medication is a branded product (e.g. Crestor), this is the Therapeutic Moeity (e.g. Rosuvastatin) or if this is a generic medication (e.g. Rosuvastatin), this would link to a branded product (e.g. Crestor).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Associated Medication</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledge_AssociatedMedication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='associatedMedication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getAssociatedMedication();

	/**
	 * Returns the value of the '<em><b>Product Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Category of the medication or product (e.g. branded product, therapeutic moeity, generic product, innovator product, etc.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledge_ProductType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='productType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getProductType();

	/**
	 * Returns the value of the '<em><b>Monograph</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicationKnowledgeMonograph}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Associated documentation about the medication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Monograph</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledge_Monograph()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='monograph' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicationKnowledgeMonograph> getMonograph();

	/**
	 * Returns the value of the '<em><b>Ingredient</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicationKnowledgeIngredient}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a particular constituent of interest in the product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ingredient</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledge_Ingredient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ingredient' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicationKnowledgeIngredient> getIngredient();

	/**
	 * Returns the value of the '<em><b>Preparation Instruction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The instructions for preparing the medication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Preparation Instruction</em>' containment reference.
	 * @see #setPreparationInstruction(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledge_PreparationInstruction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='preparationInstruction' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getPreparationInstruction();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationKnowledge#getPreparationInstruction <em>Preparation Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preparation Instruction</em>' containment reference.
	 * @see #getPreparationInstruction()
	 * @generated
	 */
	void setPreparationInstruction(Markdown value);

	/**
	 * Returns the value of the '<em><b>Intended Route</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The intended or approved route of administration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intended Route</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledge_IntendedRoute()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='intendedRoute' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getIntendedRoute();

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicationKnowledgeCost}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The price of the medication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cost</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledge_Cost()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cost' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicationKnowledgeCost> getCost();

	/**
	 * Returns the value of the '<em><b>Monitoring Program</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicationKnowledgeMonitoringProgram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The program under which the medication is reviewed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Monitoring Program</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledge_MonitoringProgram()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='monitoringProgram' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicationKnowledgeMonitoringProgram> getMonitoringProgram();

	/**
	 * Returns the value of the '<em><b>Administration Guidelines</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicationKnowledgeAdministrationGuidelines}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Guidelines for the administration of the medication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Administration Guidelines</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledge_AdministrationGuidelines()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='administrationGuidelines' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicationKnowledgeAdministrationGuidelines> getAdministrationGuidelines();

	/**
	 * Returns the value of the '<em><b>Medicine Classification</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicationKnowledgeMedicineClassification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Categorization of the medication within a formulary or classification system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medicine Classification</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledge_MedicineClassification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='medicineClassification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicationKnowledgeMedicineClassification> getMedicineClassification();

	/**
	 * Returns the value of the '<em><b>Packaging</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information that only applies to packages (not products).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packaging</em>' containment reference.
	 * @see #setPackaging(MedicationKnowledgePackaging)
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledge_Packaging()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='packaging' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationKnowledgePackaging getPackaging();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationKnowledge#getPackaging <em>Packaging</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packaging</em>' containment reference.
	 * @see #getPackaging()
	 * @generated
	 */
	void setPackaging(MedicationKnowledgePackaging value);

	/**
	 * Returns the value of the '<em><b>Drug Characteristic</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicationKnowledgeDrugCharacteristic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies descriptive properties of the medicine, such as color, shape, imprints, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Drug Characteristic</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledge_DrugCharacteristic()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='drugCharacteristic' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicationKnowledgeDrugCharacteristic> getDrugCharacteristic();

	/**
	 * Returns the value of the '<em><b>Contraindication</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Potential clinical issue with or between medication(s) (for example, drug-drug interaction, drug-disease contraindication, drug-allergy interaction, etc.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contraindication</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledge_Contraindication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contraindication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getContraindication();

	/**
	 * Returns the value of the '<em><b>Regulatory</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicationKnowledgeRegulatory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Regulatory information about a medication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Regulatory</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledge_Regulatory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='regulatory' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicationKnowledgeRegulatory> getRegulatory();

	/**
	 * Returns the value of the '<em><b>Kinetics</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicationKnowledgeKinetics}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time course of drug absorption, distribution, metabolism and excretion of a medication from the body.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kinetics</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationKnowledge_Kinetics()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='kinetics' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicationKnowledgeKinetics> getKinetics();

} // MedicationKnowledge
