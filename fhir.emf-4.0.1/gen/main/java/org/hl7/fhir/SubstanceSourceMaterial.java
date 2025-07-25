/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Source Material</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Source material shall capture information on the taxonomic and anatomical origins as well as the fraction of a material that can result in or can be modified to form a substance. This set of data elements shall be used to define polymer substances isolated from biological matrices. Taxonomic and anatomical origins shall be described using a controlled vocabulary as required. This information is captured for naturally derived polymers ( . starch) and structurally diverse substances. For Organisms belonging to the Kingdom Plantae the Substance level defines the fresh material of a single species or infraspecies, the Herbal Drug and the Herbal preparation. For Herbal preparations, the fraction information will be captured at the Substance information level and additional information for herbal extracts will be captured at the Specified Substance Group 1 information level. See for further explanation the Substance Class: Structurally Diverse and the herbal annex.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SubstanceSourceMaterial#getSourceMaterialClass <em>Source Material Class</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSourceMaterial#getSourceMaterialType <em>Source Material Type</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSourceMaterial#getSourceMaterialState <em>Source Material State</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSourceMaterial#getOrganismId <em>Organism Id</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSourceMaterial#getOrganismName <em>Organism Name</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSourceMaterial#getParentSubstanceId <em>Parent Substance Id</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSourceMaterial#getParentSubstanceName <em>Parent Substance Name</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSourceMaterial#getCountryOfOrigin <em>Country Of Origin</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSourceMaterial#getGeographicalLocation <em>Geographical Location</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSourceMaterial#getDevelopmentStage <em>Development Stage</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSourceMaterial#getFractionDescription <em>Fraction Description</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSourceMaterial#getOrganism <em>Organism</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSourceMaterial#getPartDescription <em>Part Description</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubstanceSourceMaterial()
 * @model extendedMetaData="name='SubstanceSourceMaterial' kind='elementOnly'"
 * @generated
 */
public interface SubstanceSourceMaterial extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Source Material Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * General high level classification of the source material specific to the origin of the material.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Material Class</em>' containment reference.
	 * @see #setSourceMaterialClass(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSourceMaterial_SourceMaterialClass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceMaterialClass' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSourceMaterialClass();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSourceMaterial#getSourceMaterialClass <em>Source Material Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Material Class</em>' containment reference.
	 * @see #getSourceMaterialClass()
	 * @generated
	 */
	void setSourceMaterialClass(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Source Material Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the source material shall be specified based on a controlled vocabulary. For vaccines, this subclause refers to the class of infectious agent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Material Type</em>' containment reference.
	 * @see #setSourceMaterialType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSourceMaterial_SourceMaterialType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceMaterialType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSourceMaterialType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSourceMaterial#getSourceMaterialType <em>Source Material Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Material Type</em>' containment reference.
	 * @see #getSourceMaterialType()
	 * @generated
	 */
	void setSourceMaterialType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Source Material State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The state of the source material when extracted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Material State</em>' containment reference.
	 * @see #setSourceMaterialState(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSourceMaterial_SourceMaterialState()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceMaterialState' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSourceMaterialState();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSourceMaterial#getSourceMaterialState <em>Source Material State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Material State</em>' containment reference.
	 * @see #getSourceMaterialState()
	 * @generated
	 */
	void setSourceMaterialState(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Organism Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unique identifier associated with the source material parent organism shall be specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organism Id</em>' containment reference.
	 * @see #setOrganismId(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSourceMaterial_OrganismId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organismId' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getOrganismId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSourceMaterial#getOrganismId <em>Organism Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organism Id</em>' containment reference.
	 * @see #getOrganismId()
	 * @generated
	 */
	void setOrganismId(Identifier value);

	/**
	 * Returns the value of the '<em><b>Organism Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organism accepted Scientific name shall be provided based on the organism taxonomy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organism Name</em>' containment reference.
	 * @see #setOrganismName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSourceMaterial_OrganismName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organismName' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getOrganismName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSourceMaterial#getOrganismName <em>Organism Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organism Name</em>' containment reference.
	 * @see #getOrganismName()
	 * @generated
	 */
	void setOrganismName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Parent Substance Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parent of the herbal drug Ginkgo biloba, Leaf is the substance ID of the substance (fresh) of Ginkgo biloba L. or Ginkgo biloba L. (Whole plant).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Substance Id</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSourceMaterial_ParentSubstanceId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parentSubstanceId' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getParentSubstanceId();

	/**
	 * Returns the value of the '<em><b>Parent Substance Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parent substance of the Herbal Drug, or Herbal preparation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Substance Name</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSourceMaterial_ParentSubstanceName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parentSubstanceName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getParentSubstanceName();

	/**
	 * Returns the value of the '<em><b>Country Of Origin</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The country where the plant material is harvested or the countries where the plasma is sourced from as laid down in accordance with the Plasma Master File. For “Plasma-derived substances” the attribute country of origin provides information about the countries used for the manufacturing of the Cryopoor plama or Crioprecipitate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Country Of Origin</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSourceMaterial_CountryOfOrigin()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='countryOfOrigin' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCountryOfOrigin();

	/**
	 * Returns the value of the '<em><b>Geographical Location</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The place/region where the plant is harvested or the places/regions where the animal source material has its habitat.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geographical Location</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSourceMaterial_GeographicalLocation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='geographicalLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getGeographicalLocation();

	/**
	 * Returns the value of the '<em><b>Development Stage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stage of life for animals, plants, insects and microorganisms. This information shall be provided only when the substance is significantly different in these stages (e.g. foetal bovine serum).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Development Stage</em>' containment reference.
	 * @see #setDevelopmentStage(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSourceMaterial_DevelopmentStage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='developmentStage' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDevelopmentStage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSourceMaterial#getDevelopmentStage <em>Development Stage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Development Stage</em>' containment reference.
	 * @see #getDevelopmentStage()
	 * @generated
	 */
	void setDevelopmentStage(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Fraction Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SubstanceSourceMaterialFractionDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Many complex materials are fractions of parts of plants, animals, or minerals. Fraction elements are often necessary to define both Substances and Specified Group 1 Substances. For substances derived from Plants, fraction information will be captured at the Substance information level ( . Oils, Juices and Exudates). Additional information for Extracts, such as extraction solvent composition, will be captured at the Specified Substance Group 1 information level. For plasma-derived products fraction information will be captured at the Substance and the Specified Substance Group 1 levels.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fraction Description</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSourceMaterial_FractionDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fractionDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstanceSourceMaterialFractionDescription> getFractionDescription();

	/**
	 * Returns the value of the '<em><b>Organism</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This subclause describes the organism which the substance is derived from. For vaccines, the parent organism shall be specified based on these subclause elements. As an example, full taxonomy will be described for the Substance Name: ., Leaf.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organism</em>' containment reference.
	 * @see #setOrganism(SubstanceSourceMaterialOrganism)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSourceMaterial_Organism()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organism' namespace='##targetNamespace'"
	 * @generated
	 */
	SubstanceSourceMaterialOrganism getOrganism();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSourceMaterial#getOrganism <em>Organism</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organism</em>' containment reference.
	 * @see #getOrganism()
	 * @generated
	 */
	void setOrganism(SubstanceSourceMaterialOrganism value);

	/**
	 * Returns the value of the '<em><b>Part Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SubstanceSourceMaterialPartDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * To do.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part Description</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSourceMaterial_PartDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='partDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstanceSourceMaterialPartDescription> getPartDescription();

} // SubstanceSourceMaterial
