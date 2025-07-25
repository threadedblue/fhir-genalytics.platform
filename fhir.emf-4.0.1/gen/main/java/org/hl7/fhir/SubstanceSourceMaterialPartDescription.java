/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Source Material Part Description</b></em>'.
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
 *   <li>{@link org.hl7.fhir.SubstanceSourceMaterialPartDescription#getPart <em>Part</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSourceMaterialPartDescription#getPartLocation <em>Part Location</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubstanceSourceMaterialPartDescription()
 * @model extendedMetaData="name='SubstanceSourceMaterial.PartDescription' kind='elementOnly'"
 * @generated
 */
public interface SubstanceSourceMaterialPartDescription extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Entity of anatomical origin of source material within an organism.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part</em>' containment reference.
	 * @see #setPart(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSourceMaterialPartDescription_Part()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='part' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getPart();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSourceMaterialPartDescription#getPart <em>Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part</em>' containment reference.
	 * @see #getPart()
	 * @generated
	 */
	void setPart(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Part Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The detailed anatomic location when the part can be extracted from different anatomical locations of the organism. Multiple alternative locations may apply.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part Location</em>' containment reference.
	 * @see #setPartLocation(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSourceMaterialPartDescription_PartLocation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='partLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getPartLocation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSourceMaterialPartDescription#getPartLocation <em>Part Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Location</em>' containment reference.
	 * @see #getPartLocation()
	 * @generated
	 */
	void setPartLocation(CodeableConcept value);

} // SubstanceSourceMaterialPartDescription
