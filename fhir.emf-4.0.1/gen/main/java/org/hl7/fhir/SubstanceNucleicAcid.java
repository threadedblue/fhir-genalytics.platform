/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Nucleic Acid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Nucleic acids are defined by three distinct elements: the base, sugar and linkage. Individual substance/moiety IDs will be created for each of these elements. The nucleotide sequence will be always entered in the 5’-3’ direction.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SubstanceNucleicAcid#getSequenceType <em>Sequence Type</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceNucleicAcid#getNumberOfSubunits <em>Number Of Subunits</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceNucleicAcid#getAreaOfHybridisation <em>Area Of Hybridisation</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceNucleicAcid#getOligoNucleotideType <em>Oligo Nucleotide Type</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceNucleicAcid#getSubunit <em>Subunit</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubstanceNucleicAcid()
 * @model extendedMetaData="name='SubstanceNucleicAcid' kind='elementOnly'"
 * @generated
 */
public interface SubstanceNucleicAcid extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Sequence Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the sequence shall be specified based on a controlled vocabulary.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence Type</em>' containment reference.
	 * @see #setSequenceType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceNucleicAcid_SequenceType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sequenceType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSequenceType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceNucleicAcid#getSequenceType <em>Sequence Type</em>}' containment reference.
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
	 * The number of linear sequences of nucleotides linked through phosphodiester bonds shall be described. Subunits would be strands of nucleic acids that are tightly associated typically through Watson-Crick base pairing. NOTE: If not specified in the reference source, the assumption is that there is 1 subunit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Subunits</em>' containment reference.
	 * @see #setNumberOfSubunits(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceNucleicAcid_NumberOfSubunits()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='numberOfSubunits' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getNumberOfSubunits();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceNucleicAcid#getNumberOfSubunits <em>Number Of Subunits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Subunits</em>' containment reference.
	 * @see #getNumberOfSubunits()
	 * @generated
	 */
	void setNumberOfSubunits(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Area Of Hybridisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The area of hybridisation shall be described if applicable for double stranded RNA or DNA. The number associated with the subunit followed by the number associated to the residue shall be specified in increasing order. The underscore “” shall be used as separator as follows: “Subunitnumber Residue”.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Area Of Hybridisation</em>' containment reference.
	 * @see #setAreaOfHybridisation(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceNucleicAcid_AreaOfHybridisation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='areaOfHybridisation' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getAreaOfHybridisation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceNucleicAcid#getAreaOfHybridisation <em>Area Of Hybridisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area Of Hybridisation</em>' containment reference.
	 * @see #getAreaOfHybridisation()
	 * @generated
	 */
	void setAreaOfHybridisation(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Oligo Nucleotide Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (TBC).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Oligo Nucleotide Type</em>' containment reference.
	 * @see #setOligoNucleotideType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceNucleicAcid_OligoNucleotideType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='oligoNucleotideType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getOligoNucleotideType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceNucleicAcid#getOligoNucleotideType <em>Oligo Nucleotide Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oligo Nucleotide Type</em>' containment reference.
	 * @see #getOligoNucleotideType()
	 * @generated
	 */
	void setOligoNucleotideType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Subunit</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SubstanceNucleicAcidSubunit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Subunits are listed in order of decreasing length; sequences of the same length will be ordered by molecular weight; subunits that have identical sequences will be repeated multiple times.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subunit</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceNucleicAcid_Subunit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subunit' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstanceNucleicAcidSubunit> getSubunit();

} // SubstanceNucleicAcid
