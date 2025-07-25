/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Specification Structure</b></em>'.
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
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationStructure#getStereochemistry <em>Stereochemistry</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationStructure#getOpticalActivity <em>Optical Activity</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationStructure#getMolecularFormula <em>Molecular Formula</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationStructure#getMolecularFormulaByMoiety <em>Molecular Formula By Moiety</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationStructure#getIsotope <em>Isotope</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationStructure#getMolecularWeight <em>Molecular Weight</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationStructure#getSource <em>Source</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationStructure#getRepresentation <em>Representation</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationStructure()
 * @model extendedMetaData="name='SubstanceSpecification.Structure' kind='elementOnly'"
 * @generated
 */
public interface SubstanceSpecificationStructure extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Stereochemistry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stereochemistry type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stereochemistry</em>' containment reference.
	 * @see #setStereochemistry(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationStructure_Stereochemistry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stereochemistry' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getStereochemistry();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationStructure#getStereochemistry <em>Stereochemistry</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationStructure_OpticalActivity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='opticalActivity' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getOpticalActivity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationStructure#getOpticalActivity <em>Optical Activity</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationStructure_MolecularFormula()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='molecularFormula' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getMolecularFormula();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationStructure#getMolecularFormula <em>Molecular Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Molecular Formula</em>' containment reference.
	 * @see #getMolecularFormula()
	 * @generated
	 */
	void setMolecularFormula(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Molecular Formula By Moiety</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specified per moiety according to the Hill system, i.e. first C, then H, then alphabetical, each moiety separated by a dot.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Molecular Formula By Moiety</em>' containment reference.
	 * @see #setMolecularFormulaByMoiety(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationStructure_MolecularFormulaByMoiety()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='molecularFormulaByMoiety' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getMolecularFormulaByMoiety();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationStructure#getMolecularFormulaByMoiety <em>Molecular Formula By Moiety</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Molecular Formula By Moiety</em>' containment reference.
	 * @see #getMolecularFormulaByMoiety()
	 * @generated
	 */
	void setMolecularFormulaByMoiety(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Isotope</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SubstanceSpecificationIsotope}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Applicable for single substances that contain a radionuclide or a non-natural isotopic ratio.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Isotope</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationStructure_Isotope()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='isotope' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstanceSpecificationIsotope> getIsotope();

	/**
	 * Returns the value of the '<em><b>Molecular Weight</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The molecular weight or weight range (for proteins, polymers or nucleic acids).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Molecular Weight</em>' containment reference.
	 * @see #setMolecularWeight(SubstanceSpecificationMolecularWeight)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationStructure_MolecularWeight()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='molecularWeight' namespace='##targetNamespace'"
	 * @generated
	 */
	SubstanceSpecificationMolecularWeight getMolecularWeight();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationStructure#getMolecularWeight <em>Molecular Weight</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Molecular Weight</em>' containment reference.
	 * @see #getMolecularWeight()
	 * @generated
	 */
	void setMolecularWeight(SubstanceSpecificationMolecularWeight value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Supporting literature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationStructure_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSource();

	/**
	 * Returns the value of the '<em><b>Representation</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SubstanceSpecificationRepresentation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Molecular structural representation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Representation</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationStructure_Representation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='representation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstanceSpecificationRepresentation> getRepresentation();

} // SubstanceSpecificationStructure
