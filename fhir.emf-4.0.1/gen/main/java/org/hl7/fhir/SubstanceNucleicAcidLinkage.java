/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Nucleic Acid Linkage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Nucleic acids are defined by three distinct elements: the base, sugar and linkage. Individual substance/moiety IDs will be created for each of these elements. The nucleotide sequence will be always entered in the 5’-3’ direction.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SubstanceNucleicAcidLinkage#getConnectivity <em>Connectivity</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceNucleicAcidLinkage#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceNucleicAcidLinkage#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceNucleicAcidLinkage#getResidueSite <em>Residue Site</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubstanceNucleicAcidLinkage()
 * @model extendedMetaData="name='SubstanceNucleicAcid.Linkage' kind='elementOnly'"
 * @generated
 */
public interface SubstanceNucleicAcidLinkage extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Connectivity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The entity that links the sugar residues together should also be captured for nearly all naturally occurring nucleic acid the linkage is a phosphate group. For many synthetic oligonucleotides phosphorothioate linkages are often seen. Linkage connectivity is assumed to be 3’-5’. If the linkage is either 3’-3’ or 5’-5’ this should be specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connectivity</em>' containment reference.
	 * @see #setConnectivity(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceNucleicAcidLinkage_Connectivity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='connectivity' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getConnectivity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceNucleicAcidLinkage#getConnectivity <em>Connectivity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectivity</em>' containment reference.
	 * @see #getConnectivity()
	 * @generated
	 */
	void setConnectivity(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each linkage will be registered as a fragment and have an ID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceNucleicAcidLinkage_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceNucleicAcidLinkage#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each linkage will be registered as a fragment and have at least one name. A single name shall be assigned to each linkage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceNucleicAcidLinkage_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceNucleicAcidLinkage#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Residue Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Residues shall be captured as described in 5.3.6.8.3.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Residue Site</em>' containment reference.
	 * @see #setResidueSite(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceNucleicAcidLinkage_ResidueSite()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='residueSite' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getResidueSite();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceNucleicAcidLinkage#getResidueSite <em>Residue Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Residue Site</em>' containment reference.
	 * @see #getResidueSite()
	 * @generated
	 */
	void setResidueSite(org.hl7.fhir.String value);

} // SubstanceNucleicAcidLinkage
