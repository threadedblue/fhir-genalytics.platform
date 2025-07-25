/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observation Definition Quantitative Details</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Set of definitional characteristics for a kind of observation or measurement produced or consumed by an orderable health care service.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ObservationDefinitionQuantitativeDetails#getCustomaryUnit <em>Customary Unit</em>}</li>
 *   <li>{@link org.hl7.fhir.ObservationDefinitionQuantitativeDetails#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.hl7.fhir.ObservationDefinitionQuantitativeDetails#getConversionFactor <em>Conversion Factor</em>}</li>
 *   <li>{@link org.hl7.fhir.ObservationDefinitionQuantitativeDetails#getDecimalPrecision <em>Decimal Precision</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getObservationDefinitionQuantitativeDetails()
 * @model extendedMetaData="name='ObservationDefinition.QuantitativeDetails' kind='elementOnly'"
 * @generated
 */
public interface ObservationDefinitionQuantitativeDetails extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Customary Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Customary unit used to report quantitative results of observations conforming to this ObservationDefinition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Customary Unit</em>' containment reference.
	 * @see #setCustomaryUnit(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getObservationDefinitionQuantitativeDetails_CustomaryUnit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='customaryUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCustomaryUnit();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ObservationDefinitionQuantitativeDetails#getCustomaryUnit <em>Customary Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customary Unit</em>' containment reference.
	 * @see #getCustomaryUnit()
	 * @generated
	 */
	void setCustomaryUnit(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SI unit used to report quantitative results of observations conforming to this ObservationDefinition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit</em>' containment reference.
	 * @see #setUnit(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getObservationDefinitionQuantitativeDetails_Unit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unit' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getUnit();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ObservationDefinitionQuantitativeDetails#getUnit <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' containment reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Conversion Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Factor for converting value expressed with SI unit to value expressed with customary unit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conversion Factor</em>' containment reference.
	 * @see #setConversionFactor(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getObservationDefinitionQuantitativeDetails_ConversionFactor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='conversionFactor' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getConversionFactor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ObservationDefinitionQuantitativeDetails#getConversionFactor <em>Conversion Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conversion Factor</em>' containment reference.
	 * @see #getConversionFactor()
	 * @generated
	 */
	void setConversionFactor(Decimal value);

	/**
	 * Returns the value of the '<em><b>Decimal Precision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of digits after decimal separator when the results of such observations are of type Quantity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Decimal Precision</em>' containment reference.
	 * @see #setDecimalPrecision(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getObservationDefinitionQuantitativeDetails_DecimalPrecision()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='decimalPrecision' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getDecimalPrecision();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ObservationDefinitionQuantitativeDetails#getDecimalPrecision <em>Decimal Precision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimal Precision</em>' containment reference.
	 * @see #getDecimalPrecision()
	 * @generated
	 */
	void setDecimalPrecision(org.hl7.fhir.Integer value);

} // ObservationDefinitionQuantitativeDetails
