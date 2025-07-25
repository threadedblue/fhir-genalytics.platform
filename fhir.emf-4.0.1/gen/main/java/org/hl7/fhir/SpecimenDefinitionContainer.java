/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specimen Definition Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A kind of specimen with associated set of requirements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionContainer#getMaterial <em>Material</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionContainer#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionContainer#getCap <em>Cap</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionContainer#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionContainer#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionContainer#getMinimumVolumeQuantity <em>Minimum Volume Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionContainer#getMinimumVolumeString <em>Minimum Volume String</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionContainer#getAdditive <em>Additive</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionContainer#getPreparation <em>Preparation</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinitionContainer()
 * @model extendedMetaData="name='SpecimenDefinition.Container' kind='elementOnly'"
 * @generated
 */
public interface SpecimenDefinitionContainer extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of material of the container.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Material</em>' containment reference.
	 * @see #setMaterial(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinitionContainer_Material()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='material' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getMaterial();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenDefinitionContainer#getMaterial <em>Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material</em>' containment reference.
	 * @see #getMaterial()
	 * @generated
	 */
	void setMaterial(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of container used to contain this kind of specimen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinitionContainer_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenDefinitionContainer#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Cap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Color of container cap.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cap</em>' containment reference.
	 * @see #setCap(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinitionContainer_Cap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cap' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCap();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenDefinitionContainer#getCap <em>Cap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cap</em>' containment reference.
	 * @see #getCap()
	 * @generated
	 */
	void setCap(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The textual description of the kind of container.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinitionContainer_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenDefinitionContainer#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The capacity (volume or other measure) of this kind of container.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capacity</em>' containment reference.
	 * @see #setCapacity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinitionContainer_Capacity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='capacity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getCapacity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenDefinitionContainer#getCapacity <em>Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' containment reference.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Minimum Volume Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum volume to be conditioned in the container. (choose any one of minimumVolume*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Volume Quantity</em>' containment reference.
	 * @see #setMinimumVolumeQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinitionContainer_MinimumVolumeQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minimumVolumeQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getMinimumVolumeQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenDefinitionContainer#getMinimumVolumeQuantity <em>Minimum Volume Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Volume Quantity</em>' containment reference.
	 * @see #getMinimumVolumeQuantity()
	 * @generated
	 */
	void setMinimumVolumeQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Minimum Volume String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum volume to be conditioned in the container. (choose any one of minimumVolume*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Volume String</em>' containment reference.
	 * @see #setMinimumVolumeString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinitionContainer_MinimumVolumeString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minimumVolumeString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getMinimumVolumeString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenDefinitionContainer#getMinimumVolumeString <em>Minimum Volume String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Volume String</em>' containment reference.
	 * @see #getMinimumVolumeString()
	 * @generated
	 */
	void setMinimumVolumeString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Additive</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SpecimenDefinitionAdditive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Substance introduced in the kind of container to preserve, maintain or enhance the specimen. Examples: Formalin, Citrate, EDTA.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additive</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinitionContainer_Additive()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='additive' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SpecimenDefinitionAdditive> getAdditive();

	/**
	 * Returns the value of the '<em><b>Preparation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Special processing that should be applied to the container for this kind of specimen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Preparation</em>' containment reference.
	 * @see #setPreparation(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinitionContainer_Preparation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='preparation' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPreparation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenDefinitionContainer#getPreparation <em>Preparation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preparation</em>' containment reference.
	 * @see #getPreparation()
	 * @generated
	 */
	void setPreparation(org.hl7.fhir.String value);

} // SpecimenDefinitionContainer
