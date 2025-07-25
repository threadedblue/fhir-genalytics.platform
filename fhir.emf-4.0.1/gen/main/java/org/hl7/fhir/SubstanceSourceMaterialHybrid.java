/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Source Material Hybrid</b></em>'.
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
 *   <li>{@link org.hl7.fhir.SubstanceSourceMaterialHybrid#getMaternalOrganismId <em>Maternal Organism Id</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSourceMaterialHybrid#getMaternalOrganismName <em>Maternal Organism Name</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSourceMaterialHybrid#getPaternalOrganismId <em>Paternal Organism Id</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSourceMaterialHybrid#getPaternalOrganismName <em>Paternal Organism Name</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSourceMaterialHybrid#getHybridType <em>Hybrid Type</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubstanceSourceMaterialHybrid()
 * @model extendedMetaData="name='SubstanceSourceMaterial.Hybrid' kind='elementOnly'"
 * @generated
 */
public interface SubstanceSourceMaterialHybrid extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Maternal Organism Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifier of the maternal species constituting the hybrid organism shall be specified based on a controlled vocabulary. For plants, the parents aren’t always known, and it is unlikely that it will be known which is maternal and which is paternal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maternal Organism Id</em>' containment reference.
	 * @see #setMaternalOrganismId(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSourceMaterialHybrid_MaternalOrganismId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maternalOrganismId' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getMaternalOrganismId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSourceMaterialHybrid#getMaternalOrganismId <em>Maternal Organism Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maternal Organism Id</em>' containment reference.
	 * @see #getMaternalOrganismId()
	 * @generated
	 */
	void setMaternalOrganismId(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Maternal Organism Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the maternal species constituting the hybrid organism shall be specified. For plants, the parents aren’t always known, and it is unlikely that it will be known which is maternal and which is paternal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maternal Organism Name</em>' containment reference.
	 * @see #setMaternalOrganismName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSourceMaterialHybrid_MaternalOrganismName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maternalOrganismName' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getMaternalOrganismName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSourceMaterialHybrid#getMaternalOrganismName <em>Maternal Organism Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maternal Organism Name</em>' containment reference.
	 * @see #getMaternalOrganismName()
	 * @generated
	 */
	void setMaternalOrganismName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Paternal Organism Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifier of the paternal species constituting the hybrid organism shall be specified based on a controlled vocabulary.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Paternal Organism Id</em>' containment reference.
	 * @see #setPaternalOrganismId(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSourceMaterialHybrid_PaternalOrganismId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='paternalOrganismId' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPaternalOrganismId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSourceMaterialHybrid#getPaternalOrganismId <em>Paternal Organism Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paternal Organism Id</em>' containment reference.
	 * @see #getPaternalOrganismId()
	 * @generated
	 */
	void setPaternalOrganismId(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Paternal Organism Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the paternal species constituting the hybrid organism shall be specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Paternal Organism Name</em>' containment reference.
	 * @see #setPaternalOrganismName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSourceMaterialHybrid_PaternalOrganismName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='paternalOrganismName' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPaternalOrganismName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSourceMaterialHybrid#getPaternalOrganismName <em>Paternal Organism Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paternal Organism Name</em>' containment reference.
	 * @see #getPaternalOrganismName()
	 * @generated
	 */
	void setPaternalOrganismName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Hybrid Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The hybrid type of an organism shall be specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hybrid Type</em>' containment reference.
	 * @see #setHybridType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSourceMaterialHybrid_HybridType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hybridType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getHybridType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSourceMaterialHybrid#getHybridType <em>Hybrid Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hybrid Type</em>' containment reference.
	 * @see #getHybridType()
	 * @generated
	 */
	void setHybridType(CodeableConcept value);

} // SubstanceSourceMaterialHybrid
