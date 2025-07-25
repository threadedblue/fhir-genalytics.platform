/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Ingredient Reference Strength</b></em>'.
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
 *   <li>{@link org.hl7.fhir.MedicinalProductIngredientReferenceStrength#getSubstance <em>Substance</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductIngredientReferenceStrength#getStrength <em>Strength</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductIngredientReferenceStrength#getStrengthLowLimit <em>Strength Low Limit</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductIngredientReferenceStrength#getMeasurementPoint <em>Measurement Point</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductIngredientReferenceStrength#getCountry <em>Country</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicinalProductIngredientReferenceStrength()
 * @model extendedMetaData="name='MedicinalProductIngredient.ReferenceStrength' kind='elementOnly'"
 * @generated
 */
public interface MedicinalProductIngredientReferenceStrength extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Substance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relevant reference substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substance</em>' containment reference.
	 * @see #setSubstance(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductIngredientReferenceStrength_Substance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='substance' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSubstance();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductIngredientReferenceStrength#getSubstance <em>Substance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substance</em>' containment reference.
	 * @see #getSubstance()
	 * @generated
	 */
	void setSubstance(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Strength</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Strength expressed in terms of a reference substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strength</em>' containment reference.
	 * @see #setStrength(Ratio)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductIngredientReferenceStrength_Strength()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='strength' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getStrength();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductIngredientReferenceStrength#getStrength <em>Strength</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strength</em>' containment reference.
	 * @see #getStrength()
	 * @generated
	 */
	void setStrength(Ratio value);

	/**
	 * Returns the value of the '<em><b>Strength Low Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Strength expressed in terms of a reference substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strength Low Limit</em>' containment reference.
	 * @see #setStrengthLowLimit(Ratio)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductIngredientReferenceStrength_StrengthLowLimit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='strengthLowLimit' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getStrengthLowLimit();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductIngredientReferenceStrength#getStrengthLowLimit <em>Strength Low Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strength Low Limit</em>' containment reference.
	 * @see #getStrengthLowLimit()
	 * @generated
	 */
	void setStrengthLowLimit(Ratio value);

	/**
	 * Returns the value of the '<em><b>Measurement Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For when strength is measured at a particular point or distance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measurement Point</em>' containment reference.
	 * @see #setMeasurementPoint(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductIngredientReferenceStrength_MeasurementPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='measurementPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getMeasurementPoint();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductIngredientReferenceStrength#getMeasurementPoint <em>Measurement Point</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductIngredientReferenceStrength_Country()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='country' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCountry();

} // MedicinalProductIngredientReferenceStrength
