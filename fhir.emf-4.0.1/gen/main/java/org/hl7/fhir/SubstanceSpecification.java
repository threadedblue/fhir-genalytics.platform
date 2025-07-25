/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The detailed description of a substance, typically at a level beyond what is used for prescribing.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SubstanceSpecification#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecification#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecification#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecification#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecification#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecification#getSource <em>Source</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecification#getComment <em>Comment</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecification#getMoiety <em>Moiety</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecification#getProperty <em>Property</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecification#getReferenceInformation <em>Reference Information</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecification#getStructure <em>Structure</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecification#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecification#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecification#getMolecularWeight <em>Molecular Weight</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecification#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecification#getNucleicAcid <em>Nucleic Acid</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecification#getPolymer <em>Polymer</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecification#getProtein <em>Protein</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecification#getSourceMaterial <em>Source Material</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecification()
 * @model extendedMetaData="name='SubstanceSpecification' kind='elementOnly'"
 * @generated
 */
public interface SubstanceSpecification extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier by which this substance is known.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecification_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecification#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * High level categorization, e.g. polymer or nucleic acid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecification_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecification#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Status of substance within the catalogue e.g. approved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecification_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecification#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the substance applies to only human or veterinary use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain</em>' containment reference.
	 * @see #setDomain(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecification_Domain()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='domain' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDomain();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecification#getDomain <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' containment reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Textual description of the substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecification_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecification#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Supporting literature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecification_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSource();

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Textual comment about this record of a substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference.
	 * @see #setComment(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecification_Comment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='comment' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getComment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecification#getComment <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' containment reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Moiety</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SubstanceSpecificationMoiety}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Moiety, for structural modifications.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Moiety</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecification_Moiety()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='moiety' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstanceSpecificationMoiety> getMoiety();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SubstanceSpecificationProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * General specifications for this substance, including how it is related to other substances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecification_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstanceSpecificationProperty> getProperty();

	/**
	 * Returns the value of the '<em><b>Reference Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * General information detailing this substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Information</em>' containment reference.
	 * @see #setReferenceInformation(Reference)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecification_ReferenceInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referenceInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReferenceInformation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecification#getReferenceInformation <em>Reference Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Information</em>' containment reference.
	 * @see #getReferenceInformation()
	 * @generated
	 */
	void setReferenceInformation(Reference value);

	/**
	 * Returns the value of the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Structural information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structure</em>' containment reference.
	 * @see #setStructure(SubstanceSpecificationStructure)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecification_Structure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='structure' namespace='##targetNamespace'"
	 * @generated
	 */
	SubstanceSpecificationStructure getStructure();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecification#getStructure <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure</em>' containment reference.
	 * @see #getStructure()
	 * @generated
	 */
	void setStructure(SubstanceSpecificationStructure value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SubstanceSpecificationCode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Codes associated with the substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecification_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstanceSpecificationCode> getCode();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SubstanceSpecificationName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Names applicable to this substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecification_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstanceSpecificationName> getName();

	/**
	 * Returns the value of the '<em><b>Molecular Weight</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SubstanceSpecificationMolecularWeight}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The molecular weight or weight range (for proteins, polymers or nucleic acids).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Molecular Weight</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecification_MolecularWeight()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='molecularWeight' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstanceSpecificationMolecularWeight> getMolecularWeight();

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SubstanceSpecificationRelationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A link between this substance and another, with details of the relationship.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecification_Relationship()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relationship' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstanceSpecificationRelationship> getRelationship();

	/**
	 * Returns the value of the '<em><b>Nucleic Acid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data items specific to nucleic acids.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nucleic Acid</em>' containment reference.
	 * @see #setNucleicAcid(Reference)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecification_NucleicAcid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nucleicAcid' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getNucleicAcid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecification#getNucleicAcid <em>Nucleic Acid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nucleic Acid</em>' containment reference.
	 * @see #getNucleicAcid()
	 * @generated
	 */
	void setNucleicAcid(Reference value);

	/**
	 * Returns the value of the '<em><b>Polymer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data items specific to polymers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Polymer</em>' containment reference.
	 * @see #setPolymer(Reference)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecification_Polymer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='polymer' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPolymer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecification#getPolymer <em>Polymer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polymer</em>' containment reference.
	 * @see #getPolymer()
	 * @generated
	 */
	void setPolymer(Reference value);

	/**
	 * Returns the value of the '<em><b>Protein</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data items specific to proteins.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protein</em>' containment reference.
	 * @see #setProtein(Reference)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecification_Protein()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='protein' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getProtein();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecification#getProtein <em>Protein</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protein</em>' containment reference.
	 * @see #getProtein()
	 * @generated
	 */
	void setProtein(Reference value);

	/**
	 * Returns the value of the '<em><b>Source Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Material or taxonomic/anatomical source for the substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Material</em>' containment reference.
	 * @see #setSourceMaterial(Reference)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecification_SourceMaterial()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceMaterial' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSourceMaterial();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecification#getSourceMaterial <em>Source Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Material</em>' containment reference.
	 * @see #getSourceMaterial()
	 * @generated
	 */
	void setSourceMaterial(Reference value);

} // SubstanceSpecification
