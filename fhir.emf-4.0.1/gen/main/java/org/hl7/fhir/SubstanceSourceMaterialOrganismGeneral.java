/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Source Material Organism General</b></em>'.
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
 *   <li>{@link org.hl7.fhir.SubstanceSourceMaterialOrganismGeneral#getKingdom <em>Kingdom</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSourceMaterialOrganismGeneral#getPhylum <em>Phylum</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSourceMaterialOrganismGeneral#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSourceMaterialOrganismGeneral#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubstanceSourceMaterialOrganismGeneral()
 * @model extendedMetaData="name='SubstanceSourceMaterial.OrganismGeneral' kind='elementOnly'"
 * @generated
 */
public interface SubstanceSourceMaterialOrganismGeneral extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Kingdom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The kingdom of an organism shall be specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kingdom</em>' containment reference.
	 * @see #setKingdom(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSourceMaterialOrganismGeneral_Kingdom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='kingdom' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getKingdom();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSourceMaterialOrganismGeneral#getKingdom <em>Kingdom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kingdom</em>' containment reference.
	 * @see #getKingdom()
	 * @generated
	 */
	void setKingdom(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Phylum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The phylum of an organism shall be specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Phylum</em>' containment reference.
	 * @see #setPhylum(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSourceMaterialOrganismGeneral_Phylum()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='phylum' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getPhylum();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSourceMaterialOrganismGeneral#getPhylum <em>Phylum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phylum</em>' containment reference.
	 * @see #getPhylum()
	 * @generated
	 */
	void setPhylum(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The class of an organism shall be specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class</em>' containment reference.
	 * @see #setClass(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSourceMaterialOrganismGeneral_Class()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='class' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getClass_();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSourceMaterialOrganismGeneral#getClass_ <em>Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' containment reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The order of an organism shall be specified,.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order</em>' containment reference.
	 * @see #setOrder(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSourceMaterialOrganismGeneral_Order()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='order' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getOrder();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSourceMaterialOrganismGeneral#getOrder <em>Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' containment reference.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(CodeableConcept value);

} // SubstanceSourceMaterialOrganismGeneral
