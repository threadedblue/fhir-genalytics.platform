/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Ingredient Strength</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ingredient of a manufactured item or pharmaceutical product.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicinalProductIngredientStrength#getPresentation <em>Presentation</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductIngredientStrength#getPresentationLowLimit <em>Presentation Low Limit</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductIngredientStrength#getConcentration <em>Concentration</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductIngredientStrength#getConcentrationLowLimit <em>Concentration Low Limit</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductIngredientStrength#getMeasurementPoint <em>Measurement Point</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductIngredientStrength#getCountry <em>Country</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductIngredientStrength#getReferenceStrength <em>Reference Strength</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicinalProductIngredientStrength()
 * @model extendedMetaData="name='MedicinalProductIngredient.Strength' kind='elementOnly'"
 * @generated
 */
public interface MedicinalProductIngredientStrength extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Presentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The quantity of substance in the unit of presentation, or in the volume (or mass) of the single pharmaceutical product or manufactured item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Presentation</em>' containment reference.
	 * @see #setPresentation(Ratio)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductIngredientStrength_Presentation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='presentation' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getPresentation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductIngredientStrength#getPresentation <em>Presentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation</em>' containment reference.
	 * @see #getPresentation()
	 * @generated
	 */
	void setPresentation(Ratio value);

	/**
	 * Returns the value of the '<em><b>Presentation Low Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A lower limit for the quantity of substance in the unit of presentation. For use when there is a range of strengths, this is the lower limit, with the presentation attribute becoming the upper limit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Presentation Low Limit</em>' containment reference.
	 * @see #setPresentationLowLimit(Ratio)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductIngredientStrength_PresentationLowLimit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='presentationLowLimit' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getPresentationLowLimit();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductIngredientStrength#getPresentationLowLimit <em>Presentation Low Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation Low Limit</em>' containment reference.
	 * @see #getPresentationLowLimit()
	 * @generated
	 */
	void setPresentationLowLimit(Ratio value);

	/**
	 * Returns the value of the '<em><b>Concentration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The strength per unitary volume (or mass).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Concentration</em>' containment reference.
	 * @see #setConcentration(Ratio)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductIngredientStrength_Concentration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='concentration' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getConcentration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductIngredientStrength#getConcentration <em>Concentration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concentration</em>' containment reference.
	 * @see #getConcentration()
	 * @generated
	 */
	void setConcentration(Ratio value);

	/**
	 * Returns the value of the '<em><b>Concentration Low Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A lower limit for the strength per unitary volume (or mass), for when there is a range. The concentration attribute then becomes the upper limit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Concentration Low Limit</em>' containment reference.
	 * @see #setConcentrationLowLimit(Ratio)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductIngredientStrength_ConcentrationLowLimit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='concentrationLowLimit' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getConcentrationLowLimit();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductIngredientStrength#getConcentrationLowLimit <em>Concentration Low Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concentration Low Limit</em>' containment reference.
	 * @see #getConcentrationLowLimit()
	 * @generated
	 */
	void setConcentrationLowLimit(Ratio value);

	/**
	 * Returns the value of the '<em><b>Measurement Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For when strength is measured at a particular point or distance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measurement Point</em>' containment reference.
	 * @see #setMeasurementPoint(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductIngredientStrength_MeasurementPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='measurementPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getMeasurementPoint();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductIngredientStrength#getMeasurementPoint <em>Measurement Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Point</em>' containment reference.
	 * @see #getMeasurementPoint()
	 * @generated
	 */
	void setMeasurementPoint(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The country or countries for which the strength range applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Country</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductIngredientStrength_Country()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='country' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCountry();

	/**
	 * Returns the value of the '<em><b>Reference Strength</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicinalProductIngredientReferenceStrength}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Strength expressed in terms of a reference substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Strength</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductIngredientStrength_ReferenceStrength()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referenceStrength' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicinalProductIngredientReferenceStrength> getReferenceStrength();

} // MedicinalProductIngredientStrength
