/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Protein Subunit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A SubstanceProtein is defined as a single unit of a linear amino acid sequence, or a combination of subunits that are either covalently linked or have a defined invariant stoichiometric relationship. This includes all synthetic, recombinant and purified SubstanceProteins of defined sequence, whether the use is therapeutic or prophylactic. This set of elements will be used to describe albumins, coagulation factors, cytokines, growth factors, peptide/SubstanceProtein hormones, enzymes, toxins, toxoids, recombinant vaccines, and immunomodulators.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SubstanceProteinSubunit#getSubunit <em>Subunit</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceProteinSubunit#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceProteinSubunit#getLength <em>Length</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceProteinSubunit#getSequenceAttachment <em>Sequence Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceProteinSubunit#getNTerminalModificationId <em>NTerminal Modification Id</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceProteinSubunit#getNTerminalModification <em>NTerminal Modification</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceProteinSubunit#getCTerminalModificationId <em>CTerminal Modification Id</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceProteinSubunit#getCTerminalModification <em>CTerminal Modification</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubstanceProteinSubunit()
 * @model extendedMetaData="name='SubstanceProtein.Subunit' kind='elementOnly'"
 * @generated
 */
public interface SubstanceProteinSubunit extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Subunit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Index of primary sequences of amino acids linked through peptide bonds in order of decreasing length. Sequences of the same length will be ordered by molecular weight. Subunits that have identical sequences will be repeated and have sequential subscripts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subunit</em>' containment reference.
	 * @see #setSubunit(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceProteinSubunit_Subunit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subunit' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getSubunit();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceProteinSubunit#getSubunit <em>Subunit</em>}' containment reference.
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
	 * The sequence information shall be provided enumerating the amino acids from N- to C-terminal end using standard single-letter amino acid codes. Uppercase shall be used for L-amino acids and lowercase for D-amino acids. Transcribed SubstanceProteins will always be described using the translated sequence; for synthetic peptide containing amino acids that are not represented with a single letter code an X should be used within the sequence. The modified amino acids will be distinguished by their position in the sequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceProteinSubunit_Sequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSequence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceProteinSubunit#getSequence <em>Sequence</em>}' containment reference.
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
	 * Length of linear sequences of amino acids contained in the subunit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Length</em>' containment reference.
	 * @see #setLength(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceProteinSubunit_Length()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='length' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getLength();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceProteinSubunit#getLength <em>Length</em>}' containment reference.
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
	 * The sequence information shall be provided enumerating the amino acids from N- to C-terminal end using standard single-letter amino acid codes. Uppercase shall be used for L-amino acids and lowercase for D-amino acids. Transcribed SubstanceProteins will always be described using the translated sequence; for synthetic peptide containing amino acids that are not represented with a single letter code an X should be used within the sequence. The modified amino acids will be distinguished by their position in the sequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence Attachment</em>' containment reference.
	 * @see #setSequenceAttachment(Attachment)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceProteinSubunit_SequenceAttachment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sequenceAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getSequenceAttachment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceProteinSubunit#getSequenceAttachment <em>Sequence Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Attachment</em>' containment reference.
	 * @see #getSequenceAttachment()
	 * @generated
	 */
	void setSequenceAttachment(Attachment value);

	/**
	 * Returns the value of the '<em><b>NTerminal Modification Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique identifier for molecular fragment modification based on the ISO 11238 Substance ID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NTerminal Modification Id</em>' containment reference.
	 * @see #setNTerminalModificationId(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceProteinSubunit_NTerminalModificationId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nTerminalModificationId' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getNTerminalModificationId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceProteinSubunit#getNTerminalModificationId <em>NTerminal Modification Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NTerminal Modification Id</em>' containment reference.
	 * @see #getNTerminalModificationId()
	 * @generated
	 */
	void setNTerminalModificationId(Identifier value);

	/**
	 * Returns the value of the '<em><b>NTerminal Modification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the fragment modified at the N-terminal of the SubstanceProtein shall be specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NTerminal Modification</em>' containment reference.
	 * @see #setNTerminalModification(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceProteinSubunit_NTerminalModification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nTerminalModification' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getNTerminalModification();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceProteinSubunit#getNTerminalModification <em>NTerminal Modification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NTerminal Modification</em>' containment reference.
	 * @see #getNTerminalModification()
	 * @generated
	 */
	void setNTerminalModification(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>CTerminal Modification Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique identifier for molecular fragment modification based on the ISO 11238 Substance ID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CTerminal Modification Id</em>' containment reference.
	 * @see #setCTerminalModificationId(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceProteinSubunit_CTerminalModificationId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cTerminalModificationId' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getCTerminalModificationId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceProteinSubunit#getCTerminalModificationId <em>CTerminal Modification Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CTerminal Modification Id</em>' containment reference.
	 * @see #getCTerminalModificationId()
	 * @generated
	 */
	void setCTerminalModificationId(Identifier value);

	/**
	 * Returns the value of the '<em><b>CTerminal Modification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The modification at the C-terminal shall be specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CTerminal Modification</em>' containment reference.
	 * @see #setCTerminalModification(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceProteinSubunit_CTerminalModification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cTerminalModification' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getCTerminalModification();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceProteinSubunit#getCTerminalModification <em>CTerminal Modification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CTerminal Modification</em>' containment reference.
	 * @see #getCTerminalModification()
	 * @generated
	 */
	void setCTerminalModification(org.hl7.fhir.String value);

} // SubstanceProteinSubunit
