/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Protein</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A SubstanceProtein is defined as a single unit of a linear amino acid sequence, or a combination of subunits that are either covalently linked or have a defined invariant stoichiometric relationship. This includes all synthetic, recombinant and purified SubstanceProteins of defined sequence, whether the use is therapeutic or prophylactic. This set of elements will be used to describe albumins, coagulation factors, cytokines, growth factors, peptide/SubstanceProtein hormones, enzymes, toxins, toxoids, recombinant vaccines, and immunomodulators.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SubstanceProtein#getSequenceType <em>Sequence Type</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceProtein#getNumberOfSubunits <em>Number Of Subunits</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceProtein#getDisulfideLinkage <em>Disulfide Linkage</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceProtein#getSubunit <em>Subunit</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubstanceProtein()
 * @model extendedMetaData="name='SubstanceProtein' kind='elementOnly'"
 * @generated
 */
public interface SubstanceProtein extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Sequence Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SubstanceProtein descriptive elements will only be used when a complete or partial amino acid sequence is available or derivable from a nucleic acid sequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence Type</em>' containment reference.
	 * @see #setSequenceType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceProtein_SequenceType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sequenceType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSequenceType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceProtein#getSequenceType <em>Sequence Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Type</em>' containment reference.
	 * @see #getSequenceType()
	 * @generated
	 */
	void setSequenceType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Number Of Subunits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of linear sequences of amino acids linked through peptide bonds. The number of subunits constituting the SubstanceProtein shall be described. It is possible that the number of subunits can be variable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Subunits</em>' containment reference.
	 * @see #setNumberOfSubunits(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceProtein_NumberOfSubunits()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='numberOfSubunits' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getNumberOfSubunits();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceProtein#getNumberOfSubunits <em>Number Of Subunits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Subunits</em>' containment reference.
	 * @see #getNumberOfSubunits()
	 * @generated
	 */
	void setNumberOfSubunits(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Disulfide Linkage</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The disulphide bond between two cysteine residues either on the same subunit or on two different subunits shall be described. The position of the disulfide bonds in the SubstanceProtein shall be listed in increasing order of subunit number and position within subunit followed by the abbreviation of the amino acids involved. The disulfide linkage positions shall actually contain the amino acid Cysteine at the respective positions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disulfide Linkage</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceProtein_DisulfideLinkage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='disulfideLinkage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getDisulfideLinkage();

	/**
	 * Returns the value of the '<em><b>Subunit</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SubstanceProteinSubunit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This subclause refers to the description of each subunit constituting the SubstanceProtein. A subunit is a linear sequence of amino acids linked through peptide bonds. The Subunit information shall be provided when the finished SubstanceProtein is a complex of multiple sequences; subunits are not used to delineate domains within a single sequence. Subunits are listed in order of decreasing length; sequences of the same length will be ordered by decreasing molecular weight; subunits that have identical sequences will be repeated multiple times.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subunit</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceProtein_Subunit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subunit' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstanceProteinSubunit> getSubunit();

} // SubstanceProtein
