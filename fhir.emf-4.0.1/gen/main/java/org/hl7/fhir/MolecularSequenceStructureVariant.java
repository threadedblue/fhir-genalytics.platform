/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Molecular Sequence Structure Variant</b></em>'.
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
 *   <li>{@link org.hl7.fhir.MolecularSequenceStructureVariant#getVariantType <em>Variant Type</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequenceStructureVariant#getExact <em>Exact</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequenceStructureVariant#getLength <em>Length</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequenceStructureVariant#getOuter <em>Outer</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequenceStructureVariant#getInner <em>Inner</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceStructureVariant()
 * @model extendedMetaData="name='MolecularSequence.StructureVariant' kind='elementOnly'"
 * @generated
 */
public interface MolecularSequenceStructureVariant extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Variant Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about chromosome structure variation DNA change type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variant Type</em>' containment reference.
	 * @see #setVariantType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceStructureVariant_VariantType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='variantType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getVariantType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MolecularSequenceStructureVariant#getVariantType <em>Variant Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variant Type</em>' containment reference.
	 * @see #getVariantType()
	 * @generated
	 */
	void setVariantType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Exact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to indicate if the outer and inner start-end values have the same meaning.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exact</em>' containment reference.
	 * @see #setExact(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceStructureVariant_Exact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exact' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getExact();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MolecularSequenceStructureVariant#getExact <em>Exact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exact</em>' containment reference.
	 * @see #getExact()
	 * @generated
	 */
	void setExact(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Length of the variant chromosome.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Length</em>' containment reference.
	 * @see #setLength(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceStructureVariant_Length()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='length' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getLength();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MolecularSequenceStructureVariant#getLength <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' containment reference.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Outer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Structural variant outer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outer</em>' containment reference.
	 * @see #setOuter(MolecularSequenceOuter)
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceStructureVariant_Outer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outer' namespace='##targetNamespace'"
	 * @generated
	 */
	MolecularSequenceOuter getOuter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MolecularSequenceStructureVariant#getOuter <em>Outer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer</em>' containment reference.
	 * @see #getOuter()
	 * @generated
	 */
	void setOuter(MolecularSequenceOuter value);

	/**
	 * Returns the value of the '<em><b>Inner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Structural variant inner.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inner</em>' containment reference.
	 * @see #setInner(MolecularSequenceInner)
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceStructureVariant_Inner()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inner' namespace='##targetNamespace'"
	 * @generated
	 */
	MolecularSequenceInner getInner();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MolecularSequenceStructureVariant#getInner <em>Inner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner</em>' containment reference.
	 * @see #getInner()
	 * @generated
	 */
	void setInner(MolecularSequenceInner value);

} // MolecularSequenceStructureVariant
