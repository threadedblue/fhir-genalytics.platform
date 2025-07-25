/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Special Designation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Detailed definition of a medicinal product, typically for uses other than direct patient care (e.g. regulatory use).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicinalProductSpecialDesignation#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductSpecialDesignation#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductSpecialDesignation#getIntendedUse <em>Intended Use</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductSpecialDesignation#getIndicationCodeableConcept <em>Indication Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductSpecialDesignation#getIndicationReference <em>Indication Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductSpecialDesignation#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductSpecialDesignation#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductSpecialDesignation#getSpecies <em>Species</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicinalProductSpecialDesignation()
 * @model extendedMetaData="name='MedicinalProduct.SpecialDesignation' kind='elementOnly'"
 * @generated
 */
public interface MedicinalProductSpecialDesignation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier for the designation, or procedure number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductSpecialDesignation_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of special designation, e.g. orphan drug, minor use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductSpecialDesignation_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductSpecialDesignation#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Intended Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The intended use of the product, e.g. prevention, treatment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intended Use</em>' containment reference.
	 * @see #setIntendedUse(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductSpecialDesignation_IntendedUse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='intendedUse' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getIntendedUse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductSpecialDesignation#getIntendedUse <em>Intended Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intended Use</em>' containment reference.
	 * @see #getIntendedUse()
	 * @generated
	 */
	void setIntendedUse(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Indication Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Condition for which the medicinal use applies. (choose any one of indication*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Indication Codeable Concept</em>' containment reference.
	 * @see #setIndicationCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductSpecialDesignation_IndicationCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='indicationCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getIndicationCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductSpecialDesignation#getIndicationCodeableConcept <em>Indication Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indication Codeable Concept</em>' containment reference.
	 * @see #getIndicationCodeableConcept()
	 * @generated
	 */
	void setIndicationCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Indication Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Condition for which the medicinal use applies. (choose any one of indication*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Indication Reference</em>' containment reference.
	 * @see #setIndicationReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductSpecialDesignation_IndicationReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='indicationReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getIndicationReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductSpecialDesignation#getIndicationReference <em>Indication Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indication Reference</em>' containment reference.
	 * @see #getIndicationReference()
	 * @generated
	 */
	void setIndicationReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For example granted, pending, expired or withdrawn.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductSpecialDesignation_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductSpecialDesignation#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date when the designation was granted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductSpecialDesignation_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductSpecialDesignation#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Species</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Animal species for which this applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Species</em>' containment reference.
	 * @see #setSpecies(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductSpecialDesignation_Species()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='species' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSpecies();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductSpecialDesignation#getSpecies <em>Species</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Species</em>' containment reference.
	 * @see #getSpecies()
	 * @generated
	 */
	void setSpecies(CodeableConcept value);

} // MedicinalProductSpecialDesignation
