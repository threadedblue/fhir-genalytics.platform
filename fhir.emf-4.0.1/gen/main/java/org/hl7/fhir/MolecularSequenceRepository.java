/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Molecular Sequence Repository</b></em>'.
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
 *   <li>{@link org.hl7.fhir.MolecularSequenceRepository#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequenceRepository#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequenceRepository#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequenceRepository#getDatasetId <em>Dataset Id</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequenceRepository#getVariantsetId <em>Variantset Id</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequenceRepository#getReadsetId <em>Readset Id</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceRepository()
 * @model extendedMetaData="name='MolecularSequence.Repository' kind='elementOnly'"
 * @generated
 */
public interface MolecularSequenceRepository extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Click and see / RESTful API / Need login to see / RESTful API with authentication / Other ways to see resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(RepositoryType)
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceRepository_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	RepositoryType getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MolecularSequenceRepository#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(RepositoryType value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URI of an external repository which contains further details about the genetics data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Uri)
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceRepository_Url()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MolecularSequenceRepository#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Uri value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URI of an external repository which contains further details about the genetics data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceRepository_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MolecularSequenceRepository#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Dataset Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id of the variant in this external repository. The server will understand how to use this id to call for more info about datasets in external repository.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dataset Id</em>' containment reference.
	 * @see #setDatasetId(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceRepository_DatasetId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='datasetId' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDatasetId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MolecularSequenceRepository#getDatasetId <em>Dataset Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataset Id</em>' containment reference.
	 * @see #getDatasetId()
	 * @generated
	 */
	void setDatasetId(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Variantset Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id of the variantset in this external repository. The server will understand how to use this id to call for more info about variantsets in external repository.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variantset Id</em>' containment reference.
	 * @see #setVariantsetId(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceRepository_VariantsetId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='variantsetId' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getVariantsetId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MolecularSequenceRepository#getVariantsetId <em>Variantset Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variantset Id</em>' containment reference.
	 * @see #getVariantsetId()
	 * @generated
	 */
	void setVariantsetId(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Readset Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id of the read in this external repository.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Readset Id</em>' containment reference.
	 * @see #setReadsetId(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceRepository_ReadsetId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='readsetId' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getReadsetId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MolecularSequenceRepository#getReadsetId <em>Readset Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Readset Id</em>' containment reference.
	 * @see #getReadsetId()
	 * @generated
	 */
	void setReadsetId(org.hl7.fhir.String value);

} // MolecularSequenceRepository
