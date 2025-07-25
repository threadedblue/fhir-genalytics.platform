/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marketing Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The marketing status describes the date when a medicinal product is actually put on the market or the date as of which it is no longer available.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MarketingStatus#getCountry <em>Country</em>}</li>
 *   <li>{@link org.hl7.fhir.MarketingStatus#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link org.hl7.fhir.MarketingStatus#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.MarketingStatus#getDateRange <em>Date Range</em>}</li>
 *   <li>{@link org.hl7.fhir.MarketingStatus#getRestoreDate <em>Restore Date</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMarketingStatus()
 * @model extendedMetaData="name='MarketingStatus' kind='elementOnly'"
 * @generated
 */
public interface MarketingStatus extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Country</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The country in which the marketing authorisation has been granted shall be specified It should be specified using the ISO 3166 ‑ 1 alpha-2 code elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Country</em>' containment reference.
	 * @see #setCountry(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMarketingStatus_Country()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='country' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCountry();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MarketingStatus#getCountry <em>Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' containment reference.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Jurisdiction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where a Medicines Regulatory Agency has granted a marketing authorisation for which specific provisions within a jurisdiction apply, the jurisdiction can be specified using an appropriate controlled terminology The controlled term and the controlled term identifier shall be specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jurisdiction</em>' containment reference.
	 * @see #setJurisdiction(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMarketingStatus_Jurisdiction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='jurisdiction' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getJurisdiction();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MarketingStatus#getJurisdiction <em>Jurisdiction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jurisdiction</em>' containment reference.
	 * @see #getJurisdiction()
	 * @generated
	 */
	void setJurisdiction(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute provides information on the status of the marketing of the medicinal product See ISO/TS 20443 for more information and examples.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMarketingStatus_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MarketingStatus#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Date Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date when the Medicinal Product is placed on the market by the Marketing Authorisation Holder (or where applicable, the manufacturer/distributor) in a country and/or jurisdiction shall be provided A complete date consisting of day, month and year shall be specified using the ISO 8601 date format NOTE “Placed on the market” refers to the release of the Medicinal Product into the distribution chain.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Range</em>' containment reference.
	 * @see #setDateRange(Period)
	 * @see org.hl7.fhir.FhirPackage#getMarketingStatus_DateRange()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dateRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getDateRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MarketingStatus#getDateRange <em>Date Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Range</em>' containment reference.
	 * @see #getDateRange()
	 * @generated
	 */
	void setDateRange(Period value);

	/**
	 * Returns the value of the '<em><b>Restore Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date when the Medicinal Product is placed on the market by the Marketing Authorisation Holder (or where applicable, the manufacturer/distributor) in a country and/or jurisdiction shall be provided A complete date consisting of day, month and year shall be specified using the ISO 8601 date format NOTE “Placed on the market” refers to the release of the Medicinal Product into the distribution chain.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Restore Date</em>' containment reference.
	 * @see #setRestoreDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getMarketingStatus_RestoreDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='restoreDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getRestoreDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MarketingStatus#getRestoreDate <em>Restore Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restore Date</em>' containment reference.
	 * @see #getRestoreDate()
	 * @generated
	 */
	void setRestoreDate(DateTime value);

} // MarketingStatus
