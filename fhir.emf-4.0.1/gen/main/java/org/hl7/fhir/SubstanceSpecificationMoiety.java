/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Specification Moiety</b></em>'.
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
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationMoiety#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationMoiety#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationMoiety#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationMoiety#getStereochemistry <em>Stereochemistry</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationMoiety#getOpticalActivity <em>Optical Activity</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationMoiety#getMolecularFormula <em>Molecular Formula</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationMoiety#getAmountQuantity <em>Amount Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationMoiety#getAmountString <em>Amount String</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationMoiety()
 * @model extendedMetaData="name='SubstanceSpecification.Moiety' kind='elementOnly'"
 * @generated
 */
public interface SubstanceSpecificationMoiety extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Role that the moiety is playing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationMoiety_Role()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='role' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRole();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationMoiety#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier by which this moiety substance is known.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationMoiety_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationMoiety#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Textual name for this moiety substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationMoiety_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationMoiety#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Stereochemistry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stereochemistry type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stereochemistry</em>' containment reference.
	 * @see #setStereochemistry(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationMoiety_Stereochemistry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stereochemistry' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getStereochemistry();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationMoiety#getStereochemistry <em>Stereochemistry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stereochemistry</em>' containment reference.
	 * @see #getStereochemistry()
	 * @generated
	 */
	void setStereochemistry(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Optical Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optical activity type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Optical Activity</em>' containment reference.
	 * @see #setOpticalActivity(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationMoiety_OpticalActivity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='opticalActivity' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getOpticalActivity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationMoiety#getOpticalActivity <em>Optical Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optical Activity</em>' containment reference.
	 * @see #getOpticalActivity()
	 * @generated
	 */
	void setOpticalActivity(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Molecular Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Molecular formula.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Molecular Formula</em>' containment reference.
	 * @see #setMolecularFormula(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationMoiety_MolecularFormula()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='molecularFormula' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getMolecularFormula();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationMoiety#getMolecularFormula <em>Molecular Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Molecular Formula</em>' containment reference.
	 * @see #getMolecularFormula()
	 * @generated
	 */
	void setMolecularFormula(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Amount Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Quantitative value for this moiety. (choose any one of amount*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount Quantity</em>' containment reference.
	 * @see #setAmountQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationMoiety_AmountQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amountQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getAmountQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationMoiety#getAmountQuantity <em>Amount Quantity</em>}' containment reference.
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
	 * Quantitative value for this moiety. (choose any one of amount*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount String</em>' containment reference.
	 * @see #setAmountString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationMoiety_AmountString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amountString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getAmountString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationMoiety#getAmountString <em>Amount String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount String</em>' containment reference.
	 * @see #getAmountString()
	 * @generated
	 */
	void setAmountString(org.hl7.fhir.String value);

} // SubstanceSpecificationMoiety
