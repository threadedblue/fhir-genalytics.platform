/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Source Material Author</b></em>'.
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
 *   <li>{@link org.hl7.fhir.SubstanceSourceMaterialAuthor#getAuthorType <em>Author Type</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSourceMaterialAuthor#getAuthorDescription <em>Author Description</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubstanceSourceMaterialAuthor()
 * @model extendedMetaData="name='SubstanceSourceMaterial.Author' kind='elementOnly'"
 * @generated
 */
public interface SubstanceSourceMaterialAuthor extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Author Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of author of an organism species shall be specified. The parenthetical author of an organism species refers to the first author who published the plant/animal name (of any rank). The primary author of an organism species refers to the first author(s), who validly published the plant/animal name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author Type</em>' containment reference.
	 * @see #setAuthorType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSourceMaterialAuthor_AuthorType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='authorType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getAuthorType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSourceMaterialAuthor#getAuthorType <em>Author Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author Type</em>' containment reference.
	 * @see #getAuthorType()
	 * @generated
	 */
	void setAuthorType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Author Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The author of an organism species shall be specified. The author year of an organism shall also be specified when applicable; refers to the year in which the first author(s) published the infraspecific plant/animal name (of any rank).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author Description</em>' containment reference.
	 * @see #setAuthorDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSourceMaterialAuthor_AuthorDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='authorDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getAuthorDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSourceMaterialAuthor#getAuthorDescription <em>Author Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author Description</em>' containment reference.
	 * @see #getAuthorDescription()
	 * @generated
	 */
	void setAuthorDescription(org.hl7.fhir.String value);

} // SubstanceSourceMaterialAuthor
