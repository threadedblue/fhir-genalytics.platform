/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Molecular Sequence Reference Seq</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Raw data describing a biological sequence.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MolecularSequenceReferenceSeq#getChromosome <em>Chromosome</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequenceReferenceSeq#getGenomeBuild <em>Genome Build</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequenceReferenceSeq#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequenceReferenceSeq#getReferenceSeqId <em>Reference Seq Id</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequenceReferenceSeq#getReferenceSeqPointer <em>Reference Seq Pointer</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequenceReferenceSeq#getReferenceSeqString <em>Reference Seq String</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequenceReferenceSeq#getStrand <em>Strand</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequenceReferenceSeq#getWindowStart <em>Window Start</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequenceReferenceSeq#getWindowEnd <em>Window End</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceReferenceSeq()
 * @model extendedMetaData="name='MolecularSequence.ReferenceSeq' kind='elementOnly'"
 * @generated
 */
public interface MolecularSequenceReferenceSeq extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Chromosome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Structural unit composed of a nucleic acid molecule which controls its own replication through the interaction of specific proteins at one or more origins of replication ([SO:0000340](http://www.sequenceontology.org/browser/current_svn/term/SO:0000340)).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Chromosome</em>' containment reference.
	 * @see #setChromosome(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceReferenceSeq_Chromosome()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='chromosome' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getChromosome();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MolecularSequenceReferenceSeq#getChromosome <em>Chromosome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chromosome</em>' containment reference.
	 * @see #getChromosome()
	 * @generated
	 */
	void setChromosome(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Genome Build</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Genome Build used for reference, following GRCh build versions e.g. 'GRCh 37'.  Version number must be included if a versioned release of a primary build was used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Genome Build</em>' containment reference.
	 * @see #setGenomeBuild(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceReferenceSeq_GenomeBuild()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='genomeBuild' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getGenomeBuild();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MolecularSequenceReferenceSeq#getGenomeBuild <em>Genome Build</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Genome Build</em>' containment reference.
	 * @see #getGenomeBuild()
	 * @generated
	 */
	void setGenomeBuild(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A relative reference to a DNA strand based on gene orientation. The strand that contains the open reading frame of the gene is the "sense" strand, and the opposite complementary strand is the "antisense" strand.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Orientation</em>' containment reference.
	 * @see #setOrientation(OrientationType)
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceReferenceSeq_Orientation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='orientation' namespace='##targetNamespace'"
	 * @generated
	 */
	OrientationType getOrientation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MolecularSequenceReferenceSeq#getOrientation <em>Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' containment reference.
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(OrientationType value);

	/**
	 * Returns the value of the '<em><b>Reference Seq Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference identifier of reference sequence submitted to NCBI. It must match the type in the MolecularSequence.type field. For example, the prefix, “NG_” identifies reference sequence for genes, “NM_” for messenger RNA transcripts, and “NP_” for amino acid sequences.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Seq Id</em>' containment reference.
	 * @see #setReferenceSeqId(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceReferenceSeq_ReferenceSeqId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referenceSeqId' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getReferenceSeqId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MolecularSequenceReferenceSeq#getReferenceSeqId <em>Reference Seq Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Seq Id</em>' containment reference.
	 * @see #getReferenceSeqId()
	 * @generated
	 */
	void setReferenceSeqId(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Reference Seq Pointer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A pointer to another MolecularSequence entity as reference sequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Seq Pointer</em>' containment reference.
	 * @see #setReferenceSeqPointer(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceReferenceSeq_ReferenceSeqPointer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referenceSeqPointer' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReferenceSeqPointer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MolecularSequenceReferenceSeq#getReferenceSeqPointer <em>Reference Seq Pointer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Seq Pointer</em>' containment reference.
	 * @see #getReferenceSeqPointer()
	 * @generated
	 */
	void setReferenceSeqPointer(Reference value);

	/**
	 * Returns the value of the '<em><b>Reference Seq String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string like "ACGT".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Seq String</em>' containment reference.
	 * @see #setReferenceSeqString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceReferenceSeq_ReferenceSeqString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referenceSeqString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getReferenceSeqString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MolecularSequenceReferenceSeq#getReferenceSeqString <em>Reference Seq String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Seq String</em>' containment reference.
	 * @see #getReferenceSeqString()
	 * @generated
	 */
	void setReferenceSeqString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Strand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute reference to a strand. The Watson strand is the strand whose 5'-end is on the short arm of the chromosome, and the Crick strand as the one whose 5'-end is on the long arm.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strand</em>' containment reference.
	 * @see #setStrand(StrandType)
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceReferenceSeq_Strand()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='strand' namespace='##targetNamespace'"
	 * @generated
	 */
	StrandType getStrand();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MolecularSequenceReferenceSeq#getStrand <em>Strand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strand</em>' containment reference.
	 * @see #getStrand()
	 * @generated
	 */
	void setStrand(StrandType value);

	/**
	 * Returns the value of the '<em><b>Window Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start position of the window on the reference sequence. If the coordinate system is either 0-based or 1-based, then start position is inclusive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Window Start</em>' containment reference.
	 * @see #setWindowStart(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceReferenceSeq_WindowStart()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='windowStart' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getWindowStart();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MolecularSequenceReferenceSeq#getWindowStart <em>Window Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Window Start</em>' containment reference.
	 * @see #getWindowStart()
	 * @generated
	 */
	void setWindowStart(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Window End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * End position of the window on the reference sequence. If the coordinate system is 0-based then end is exclusive and does not include the last position. If the coordinate system is 1-base, then end is inclusive and includes the last position.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Window End</em>' containment reference.
	 * @see #setWindowEnd(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceReferenceSeq_WindowEnd()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='windowEnd' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getWindowEnd();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MolecularSequenceReferenceSeq#getWindowEnd <em>Window End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Window End</em>' containment reference.
	 * @see #getWindowEnd()
	 * @generated
	 */
	void setWindowEnd(org.hl7.fhir.Integer value);

} // MolecularSequenceReferenceSeq
