/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Specification Property</b></em>'.
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
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationProperty#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationProperty#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationProperty#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationProperty#getDefiningSubstanceReference <em>Defining Substance Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationProperty#getDefiningSubstanceCodeableConcept <em>Defining Substance Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationProperty#getAmountQuantity <em>Amount Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationProperty#getAmountString <em>Amount String</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationProperty()
 * @model extendedMetaData="name='SubstanceSpecification.Property' kind='elementOnly'"
 * @generated
 */
public interface SubstanceSpecificationProperty extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A category for this property, e.g. Physical, Chemical, Enzymatic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference.
	 * @see #setCategory(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationProperty_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCategory();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationProperty#getCategory <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' containment reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Property type e.g. viscosity, pH, isoelectric point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationProperty_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationProperty#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameters that were used in the measurement of a property (e.g. for viscosity: measured at 20C with a pH of 7.1).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference.
	 * @see #setParameters(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationProperty_Parameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameters' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getParameters();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationProperty#getParameters <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' containment reference.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Defining Substance Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A substance upon which a defining property depends (e.g. for solubility: in water, in alcohol). (choose any one of definingSubstance*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Defining Substance Reference</em>' containment reference.
	 * @see #setDefiningSubstanceReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationProperty_DefiningSubstanceReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definingSubstanceReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getDefiningSubstanceReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationProperty#getDefiningSubstanceReference <em>Defining Substance Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defining Substance Reference</em>' containment reference.
	 * @see #getDefiningSubstanceReference()
	 * @generated
	 */
	void setDefiningSubstanceReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Defining Substance Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A substance upon which a defining property depends (e.g. for solubility: in water, in alcohol). (choose any one of definingSubstance*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Defining Substance Codeable Concept</em>' containment reference.
	 * @see #setDefiningSubstanceCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationProperty_DefiningSubstanceCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definingSubstanceCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDefiningSubstanceCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationProperty#getDefiningSubstanceCodeableConcept <em>Defining Substance Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defining Substance Codeable Concept</em>' containment reference.
	 * @see #getDefiningSubstanceCodeableConcept()
	 * @generated
	 */
	void setDefiningSubstanceCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Amount Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Quantitative value for this property. (choose any one of amount*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount Quantity</em>' containment reference.
	 * @see #setAmountQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationProperty_AmountQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amountQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getAmountQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationProperty#getAmountQuantity <em>Amount Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Quantity</em>' containment reference.
	 * @see #getAmountQuantity()
	 * @generated
	 */
	void setAmountQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Amount String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Quantitative value for this property. (choose any one of amount*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount String</em>' containment reference.
	 * @see #setAmountString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationProperty_AmountString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amountString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getAmountString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationProperty#getAmountString <em>Amount String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount String</em>' containment reference.
	 * @see #getAmountString()
	 * @generated
	 */
	void setAmountString(org.hl7.fhir.String value);

} // SubstanceSpecificationProperty
