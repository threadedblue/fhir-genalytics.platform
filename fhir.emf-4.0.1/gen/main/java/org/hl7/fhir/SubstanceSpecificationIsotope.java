/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Specification Isotope</b></em>'.
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
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationIsotope#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationIsotope#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationIsotope#getSubstitution <em>Substitution</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationIsotope#getHalfLife <em>Half Life</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationIsotope#getMolecularWeight <em>Molecular Weight</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationIsotope()
 * @model extendedMetaData="name='SubstanceSpecification.Isotope' kind='elementOnly'"
 * @generated
 */
public interface SubstanceSpecificationIsotope extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Substance identifier for each non-natural or radioisotope.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationIsotope_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationIsotope#getIdentifier <em>Identifier</em>}' containment reference.
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
	 * Substance name for each non-natural or radioisotope.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationIsotope_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationIsotope#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Substitution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of isotopic substitution present in a single substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substitution</em>' containment reference.
	 * @see #setSubstitution(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationIsotope_Substitution()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='substitution' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSubstitution();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationIsotope#getSubstitution <em>Substitution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substitution</em>' containment reference.
	 * @see #getSubstitution()
	 * @generated
	 */
	void setSubstitution(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Half Life</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Half life - for a non-natural nuclide.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Half Life</em>' containment reference.
	 * @see #setHalfLife(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationIsotope_HalfLife()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='halfLife' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getHalfLife();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationIsotope#getHalfLife <em>Half Life</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Half Life</em>' containment reference.
	 * @see #getHalfLife()
	 * @generated
	 */
	void setHalfLife(Quantity value);

	/**
	 * Returns the value of the '<em><b>Molecular Weight</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The molecular weight or weight range (for proteins, polymers or nucleic acids).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Molecular Weight</em>' containment reference.
	 * @see #setMolecularWeight(SubstanceSpecificationMolecularWeight)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationIsotope_MolecularWeight()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='molecularWeight' namespace='##targetNamespace'"
	 * @generated
	 */
	SubstanceSpecificationMolecularWeight getMolecularWeight();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationIsotope#getMolecularWeight <em>Molecular Weight</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Molecular Weight</em>' containment reference.
	 * @see #getMolecularWeight()
	 * @generated
	 */
	void setMolecularWeight(SubstanceSpecificationMolecularWeight value);

} // SubstanceSpecificationIsotope
