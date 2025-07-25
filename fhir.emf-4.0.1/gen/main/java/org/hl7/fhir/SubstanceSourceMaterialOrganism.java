/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Source Material Organism</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Source material shall capture information on the taxonomic and anatomical origins as well as the fraction of a material that can result in or can be modified to form a substance. This set of data elements shall be used to define polymer substances isolated from biological matrices. Taxonomic and anatomical origins shall be described using a controlled vocabulary as required. This information is captured for naturally derived polymers ( . starch) and structurally diverse substances. For Organisms belonging to the Kingdom Plantae the Substance level defines the fresh material of a single species or infraspecies, the Herbal Drug and the Herbal preparation. For Herbal preparations, the fraction information will be captured at the Substance information level and additional information for herbal extracts will be captured at the Specified Substance Group 1 information level. See for further explanation the Substance Class: Structurally Diverse and the herbal annex.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SubstanceSourceMaterialOrganism#getFamily <em>Family</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSourceMaterialOrganism#getGenus <em>Genus</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSourceMaterialOrganism#getSpecies <em>Species</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSourceMaterialOrganism#getIntraspecificType <em>Intraspecific Type</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSourceMaterialOrganism#getIntraspecificDescription <em>Intraspecific Description</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSourceMaterialOrganism#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSourceMaterialOrganism#getHybrid <em>Hybrid</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSourceMaterialOrganism#getOrganismGeneral <em>Organism General</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubstanceSourceMaterialOrganism()
 * @model extendedMetaData="name='SubstanceSourceMaterial.Organism' kind='elementOnly'"
 * @generated
 */
public interface SubstanceSourceMaterialOrganism extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Family</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The family of an organism shall be specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Family</em>' containment reference.
	 * @see #setFamily(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSourceMaterialOrganism_Family()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='family' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getFamily();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSourceMaterialOrganism#getFamily <em>Family</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family</em>' containment reference.
	 * @see #getFamily()
	 * @generated
	 */
	void setFamily(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Genus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The genus of an organism shall be specified; refers to the Latin epithet of the genus element of the plant/animal scientific name; it is present in names for genera, species and infraspecies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Genus</em>' containment reference.
	 * @see #setGenus(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSourceMaterialOrganism_Genus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='genus' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getGenus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSourceMaterialOrganism#getGenus <em>Genus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Genus</em>' containment reference.
	 * @see #getGenus()
	 * @generated
	 */
	void setGenus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Species</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The species of an organism shall be specified; refers to the Latin epithet of the species of the plant/animal; it is present in names for species and infraspecies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Species</em>' containment reference.
	 * @see #setSpecies(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSourceMaterialOrganism_Species()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='species' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSpecies();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSourceMaterialOrganism#getSpecies <em>Species</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Species</em>' containment reference.
	 * @see #getSpecies()
	 * @generated
	 */
	void setSpecies(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Intraspecific Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Intraspecific type of an organism shall be specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intraspecific Type</em>' containment reference.
	 * @see #setIntraspecificType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSourceMaterialOrganism_IntraspecificType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='intraspecificType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getIntraspecificType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSourceMaterialOrganism#getIntraspecificType <em>Intraspecific Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intraspecific Type</em>' containment reference.
	 * @see #getIntraspecificType()
	 * @generated
	 */
	void setIntraspecificType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Intraspecific Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The intraspecific description of an organism shall be specified based on a controlled vocabulary. For Influenza Vaccine, the intraspecific description shall contain the syntax of the antigen in line with the WHO convention.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intraspecific Description</em>' containment reference.
	 * @see #setIntraspecificDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSourceMaterialOrganism_IntraspecificDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='intraspecificDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getIntraspecificDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSourceMaterialOrganism#getIntraspecificDescription <em>Intraspecific Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intraspecific Description</em>' containment reference.
	 * @see #getIntraspecificDescription()
	 * @generated
	 */
	void setIntraspecificDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SubstanceSourceMaterialAuthor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.9.13.6.1 Author type (Conditional).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSourceMaterialOrganism_Author()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstanceSourceMaterialAuthor> getAuthor();

	/**
	 * Returns the value of the '<em><b>Hybrid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.9.13.8.1 Hybrid species maternal organism ID (Optional).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hybrid</em>' containment reference.
	 * @see #setHybrid(SubstanceSourceMaterialHybrid)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSourceMaterialOrganism_Hybrid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hybrid' namespace='##targetNamespace'"
	 * @generated
	 */
	SubstanceSourceMaterialHybrid getHybrid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSourceMaterialOrganism#getHybrid <em>Hybrid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hybrid</em>' containment reference.
	 * @see #getHybrid()
	 * @generated
	 */
	void setHybrid(SubstanceSourceMaterialHybrid value);

	/**
	 * Returns the value of the '<em><b>Organism General</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.9.13.7.1 Kingdom (Conditional).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organism General</em>' containment reference.
	 * @see #setOrganismGeneral(SubstanceSourceMaterialOrganismGeneral)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSourceMaterialOrganism_OrganismGeneral()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organismGeneral' namespace='##targetNamespace'"
	 * @generated
	 */
	SubstanceSourceMaterialOrganismGeneral getOrganismGeneral();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSourceMaterialOrganism#getOrganismGeneral <em>Organism General</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organism General</em>' containment reference.
	 * @see #getOrganismGeneral()
	 * @generated
	 */
	void setOrganismGeneral(SubstanceSourceMaterialOrganismGeneral value);

} // SubstanceSourceMaterialOrganism
