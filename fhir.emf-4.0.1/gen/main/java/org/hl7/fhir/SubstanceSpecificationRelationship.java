/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Specification Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The detailed description of a substance, typically at a level beyond what is used for prescribing.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationRelationship#getSubstanceReference <em>Substance Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationRelationship#getSubstanceCodeableConcept <em>Substance Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationRelationship#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationRelationship#getIsDefining <em>Is Defining</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationRelationship#getAmountQuantity <em>Amount Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationRelationship#getAmountRange <em>Amount Range</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationRelationship#getAmountRatio <em>Amount Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationRelationship#getAmountString <em>Amount String</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationRelationship#getAmountRatioLowLimit <em>Amount Ratio Low Limit</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationRelationship#getAmountType <em>Amount Type</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationRelationship#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationRelationship()
 * @model extendedMetaData="name='SubstanceSpecification.Relationship' kind='elementOnly'"
 * @generated
 */
public interface SubstanceSpecificationRelationship extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Substance Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A pointer to another substance, as a resource or just a representational code. (choose any one of substance*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substance Reference</em>' containment reference.
	 * @see #setSubstanceReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationRelationship_SubstanceReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='substanceReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubstanceReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationRelationship#getSubstanceReference <em>Substance Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substance Reference</em>' containment reference.
	 * @see #getSubstanceReference()
	 * @generated
	 */
	void setSubstanceReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Substance Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A pointer to another substance, as a resource or just a representational code. (choose any one of substance*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substance Codeable Concept</em>' containment reference.
	 * @see #setSubstanceCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationRelationship_SubstanceCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='substanceCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSubstanceCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationRelationship#getSubstanceCodeableConcept <em>Substance Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substance Codeable Concept</em>' containment reference.
	 * @see #getSubstanceCodeableConcept()
	 * @generated
	 */
	void setSubstanceCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For example "salt to parent", "active moiety", "starting material".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference.
	 * @see #setRelationship(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationRelationship_Relationship()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relationship' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRelationship();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationRelationship#getRelationship <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' containment reference.
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Is Defining</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For example where an enzyme strongly bonds with a particular substance, this is a defining relationship for that enzyme, out of several possible substance relationships.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Defining</em>' containment reference.
	 * @see #setIsDefining(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationRelationship_IsDefining()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='isDefining' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getIsDefining();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationRelationship#getIsDefining <em>Is Defining</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Defining</em>' containment reference.
	 * @see #getIsDefining()
	 * @generated
	 */
	void setIsDefining(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Amount Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A numeric factor for the relationship, for instance to express that the salt of a substance has some percentage of the active substance in relation to some other. (choose any one of amount*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount Quantity</em>' containment reference.
	 * @see #setAmountQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationRelationship_AmountQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amountQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getAmountQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationRelationship#getAmountQuantity <em>Amount Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Quantity</em>' containment reference.
	 * @see #getAmountQuantity()
	 * @generated
	 */
	void setAmountQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Amount Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A numeric factor for the relationship, for instance to express that the salt of a substance has some percentage of the active substance in relation to some other. (choose any one of amount*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount Range</em>' containment reference.
	 * @see #setAmountRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationRelationship_AmountRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amountRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getAmountRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationRelationship#getAmountRange <em>Amount Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Range</em>' containment reference.
	 * @see #getAmountRange()
	 * @generated
	 */
	void setAmountRange(Range value);

	/**
	 * Returns the value of the '<em><b>Amount Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A numeric factor for the relationship, for instance to express that the salt of a substance has some percentage of the active substance in relation to some other. (choose any one of amount*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount Ratio</em>' containment reference.
	 * @see #setAmountRatio(Ratio)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationRelationship_AmountRatio()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amountRatio' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getAmountRatio();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationRelationship#getAmountRatio <em>Amount Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Ratio</em>' containment reference.
	 * @see #getAmountRatio()
	 * @generated
	 */
	void setAmountRatio(Ratio value);

	/**
	 * Returns the value of the '<em><b>Amount String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A numeric factor for the relationship, for instance to express that the salt of a substance has some percentage of the active substance in relation to some other. (choose any one of amount*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount String</em>' containment reference.
	 * @see #setAmountString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationRelationship_AmountString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amountString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getAmountString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationRelationship#getAmountString <em>Amount String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount String</em>' containment reference.
	 * @see #getAmountString()
	 * @generated
	 */
	void setAmountString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Amount Ratio Low Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For use when the numeric.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount Ratio Low Limit</em>' containment reference.
	 * @see #setAmountRatioLowLimit(Ratio)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationRelationship_AmountRatioLowLimit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amountRatioLowLimit' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getAmountRatioLowLimit();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationRelationship#getAmountRatioLowLimit <em>Amount Ratio Low Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Ratio Low Limit</em>' containment reference.
	 * @see #getAmountRatioLowLimit()
	 * @generated
	 */
	void setAmountRatioLowLimit(Ratio value);

	/**
	 * Returns the value of the '<em><b>Amount Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An operator for the amount, for example "average", "approximately", "less than".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount Type</em>' containment reference.
	 * @see #setAmountType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationRelationship_AmountType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amountType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getAmountType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationRelationship#getAmountType <em>Amount Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Type</em>' containment reference.
	 * @see #getAmountType()
	 * @generated
	 */
	void setAmountType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Supporting literature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationRelationship_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSource();

} // SubstanceSpecificationRelationship
