/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Manufactured</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The manufactured item as contained in the packaged medicinal product.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicinalProductManufactured#getManufacturedDoseForm <em>Manufactured Dose Form</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductManufactured#getUnitOfPresentation <em>Unit Of Presentation</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductManufactured#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductManufactured#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductManufactured#getIngredient <em>Ingredient</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductManufactured#getPhysicalCharacteristics <em>Physical Characteristics</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductManufactured#getOtherCharacteristics <em>Other Characteristics</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicinalProductManufactured()
 * @model extendedMetaData="name='MedicinalProductManufactured' kind='elementOnly'"
 * @generated
 */
public interface MedicinalProductManufactured extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Manufactured Dose Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dose form as manufactured and before any transformation into the pharmaceutical product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufactured Dose Form</em>' containment reference.
	 * @see #setManufacturedDoseForm(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductManufactured_ManufacturedDoseForm()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='manufacturedDoseForm' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getManufacturedDoseForm();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductManufactured#getManufacturedDoseForm <em>Manufactured Dose Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufactured Dose Form</em>' containment reference.
	 * @see #getManufacturedDoseForm()
	 * @generated
	 */
	void setManufacturedDoseForm(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Unit Of Presentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The “real world” units in which the quantity of the manufactured item is described.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit Of Presentation</em>' containment reference.
	 * @see #setUnitOfPresentation(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductManufactured_UnitOfPresentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unitOfPresentation' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getUnitOfPresentation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductManufactured#getUnitOfPresentation <em>Unit Of Presentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Of Presentation</em>' containment reference.
	 * @see #getUnitOfPresentation()
	 * @generated
	 */
	void setUnitOfPresentation(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The quantity or "count number" of the manufactured item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductManufactured_Quantity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductManufactured#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Manufacturer of the item (Note that this should be named "manufacturer" but it currently causes technical issues).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductManufactured_Manufacturer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='manufacturer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getManufacturer();

	/**
	 * Returns the value of the '<em><b>Ingredient</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ingredient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ingredient</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductManufactured_Ingredient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ingredient' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getIngredient();

	/**
	 * Returns the value of the '<em><b>Physical Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dimensions, color etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Characteristics</em>' containment reference.
	 * @see #setPhysicalCharacteristics(ProdCharacteristic)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductManufactured_PhysicalCharacteristics()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='physicalCharacteristics' namespace='##targetNamespace'"
	 * @generated
	 */
	ProdCharacteristic getPhysicalCharacteristics();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductManufactured#getPhysicalCharacteristics <em>Physical Characteristics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Characteristics</em>' containment reference.
	 * @see #getPhysicalCharacteristics()
	 * @generated
	 */
	void setPhysicalCharacteristics(ProdCharacteristic value);

	/**
	 * Returns the value of the '<em><b>Other Characteristics</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Other codeable characteristics.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Characteristics</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductManufactured_OtherCharacteristics()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='otherCharacteristics' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getOtherCharacteristics();

} // MedicinalProductManufactured
