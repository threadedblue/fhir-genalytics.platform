/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Nucleic Acid Subunit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Nucleic acids are defined by three distinct elements: the base, sugar and linkage. Individual substance/moiety IDs will be created for each of these elements. The nucleotide sequence will be always entered in the 5’-3’ direction.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SubstanceNucleicAcidSubunit#getSubunit <em>Subunit</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceNucleicAcidSubunit#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceNucleicAcidSubunit#getLength <em>Length</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceNucleicAcidSubunit#getSequenceAttachment <em>Sequence Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceNucleicAcidSubunit#getFivePrime <em>Five Prime</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceNucleicAcidSubunit#getThreePrime <em>Three Prime</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceNucleicAcidSubunit#getLinkage <em>Linkage</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceNucleicAcidSubunit#getSugar <em>Sugar</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubstanceNucleicAcidSubunit()
 * @model extendedMetaData="name='SubstanceNucleicAcid.Subunit' kind='elementOnly'"
 * @generated
 */
public interface SubstanceNucleicAcidSubunit extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Subunit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Index of linear sequences of nucleic acids in order of decreasing length. Sequences of the same length will be ordered by molecular weight. Subunits that have identical sequences will be repeated and have sequential subscripts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subunit</em>' containment reference.
	 * @see #setSubunit(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceNucleicAcidSubunit_Subunit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subunit' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getSubunit();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceNucleicAcidSubunit#getSubunit <em>Subunit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subunit</em>' containment reference.
	 * @see #getSubunit()
	 * @generated
	 */
	void setSubunit(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Actual nucleotide sequence notation from 5' to 3' end using standard single letter codes. In addition to the base sequence, sugar and type of phosphate or non-phosphate linkage should also be captured.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceNucleicAcidSubunit_Sequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSequence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceNucleicAcidSubunit#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The length of the sequence shall be captured.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Length</em>' containment reference.
	 * @see #setLength(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceNucleicAcidSubunit_Length()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='length' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getLength();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceNucleicAcidSubunit#getLength <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' containment reference.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Sequence Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (TBC).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence Attachment</em>' containment reference.
	 * @see #setSequenceAttachment(Attachment)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceNucleicAcidSubunit_SequenceAttachment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sequenceAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getSequenceAttachment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceNucleicAcidSubunit#getSequenceAttachment <em>Sequence Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Attachment</em>' containment reference.
	 * @see #getSequenceAttachment()
	 * @generated
	 */
	void setSequenceAttachment(Attachment value);

	/**
	 * Returns the value of the '<em><b>Five Prime</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The nucleotide present at the 5’ terminal shall be specified based on a controlled vocabulary. Since the sequence is represented from the 5' to the 3' end, the 5’ prime nucleotide is the letter at the first position in the sequence. A separate representation would be redundant.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Five Prime</em>' containment reference.
	 * @see #setFivePrime(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceNucleicAcidSubunit_FivePrime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fivePrime' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getFivePrime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceNucleicAcidSubunit#getFivePrime <em>Five Prime</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Five Prime</em>' containment reference.
	 * @see #getFivePrime()
	 * @generated
	 */
	void setFivePrime(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Three Prime</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The nucleotide present at the 3’ terminal shall be specified based on a controlled vocabulary. Since the sequence is represented from the 5' to the 3' end, the 5’ prime nucleotide is the letter at the last position in the sequence. A separate representation would be redundant.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Three Prime</em>' containment reference.
	 * @see #setThreePrime(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceNucleicAcidSubunit_ThreePrime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='threePrime' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getThreePrime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceNucleicAcidSubunit#getThreePrime <em>Three Prime</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Three Prime</em>' containment reference.
	 * @see #getThreePrime()
	 * @generated
	 */
	void setThreePrime(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Linkage</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SubstanceNucleicAcidLinkage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The linkages between sugar residues will also be captured.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Linkage</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceNucleicAcidSubunit_Linkage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='linkage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstanceNucleicAcidLinkage> getLinkage();

	/**
	 * Returns the value of the '<em><b>Sugar</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SubstanceNucleicAcidSugar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 5.3.6.8.1 Sugar ID (Mandatory).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sugar</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceNucleicAcidSubunit_Sugar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sugar' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstanceNucleicAcidSugar> getSugar();

} // SubstanceNucleicAcidSubunit
