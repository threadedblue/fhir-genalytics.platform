/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Source Material Fraction Description</b></em>'.
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
 *   <li>{@link org.hl7.fhir.SubstanceSourceMaterialFractionDescription#getFraction <em>Fraction</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSourceMaterialFractionDescription#getMaterialType <em>Material Type</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubstanceSourceMaterialFractionDescription()
 * @model extendedMetaData="name='SubstanceSourceMaterial.FractionDescription' kind='elementOnly'"
 * @generated
 */
public interface SubstanceSourceMaterialFractionDescription extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Fraction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element is capturing information about the fraction of a plant part, or human plasma for fractionation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fraction</em>' containment reference.
	 * @see #setFraction(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSourceMaterialFractionDescription_Fraction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fraction' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getFraction();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSourceMaterialFractionDescription#getFraction <em>Fraction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fraction</em>' containment reference.
	 * @see #getFraction()
	 * @generated
	 */
	void setFraction(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Material Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specific type of the material constituting the component. For Herbal preparations the particulars of the extracts (liquid/dry) is described in Specified Substance Group 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Material Type</em>' containment reference.
	 * @see #setMaterialType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSourceMaterialFractionDescription_MaterialType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='materialType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getMaterialType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSourceMaterialFractionDescription#getMaterialType <em>Material Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material Type</em>' containment reference.
	 * @see #getMaterialType()
	 * @generated
	 */
	void setMaterialType(CodeableConcept value);

} // SubstanceSourceMaterialFractionDescription
