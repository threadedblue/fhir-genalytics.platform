/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Manufacturing Business Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Detailed definition of a medicinal product, typically for uses other than direct patient care (e.g. regulatory use).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicinalProductManufacturingBusinessOperation#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductManufacturingBusinessOperation#getAuthorisationReferenceNumber <em>Authorisation Reference Number</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductManufacturingBusinessOperation#getEffectiveDate <em>Effective Date</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductManufacturingBusinessOperation#getConfidentialityIndicator <em>Confidentiality Indicator</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductManufacturingBusinessOperation#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductManufacturingBusinessOperation#getRegulator <em>Regulator</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicinalProductManufacturingBusinessOperation()
 * @model extendedMetaData="name='MedicinalProduct.ManufacturingBusinessOperation' kind='elementOnly'"
 * @generated
 */
public interface MedicinalProductManufacturingBusinessOperation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Operation Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of manufacturing operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation Type</em>' containment reference.
	 * @see #setOperationType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductManufacturingBusinessOperation_OperationType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='operationType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getOperationType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductManufacturingBusinessOperation#getOperationType <em>Operation Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Type</em>' containment reference.
	 * @see #getOperationType()
	 * @generated
	 */
	void setOperationType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Authorisation Reference Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Regulatory authorization reference number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authorisation Reference Number</em>' containment reference.
	 * @see #setAuthorisationReferenceNumber(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductManufacturingBusinessOperation_AuthorisationReferenceNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='authorisationReferenceNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getAuthorisationReferenceNumber();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductManufacturingBusinessOperation#getAuthorisationReferenceNumber <em>Authorisation Reference Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorisation Reference Number</em>' containment reference.
	 * @see #getAuthorisationReferenceNumber()
	 * @generated
	 */
	void setAuthorisationReferenceNumber(Identifier value);

	/**
	 * Returns the value of the '<em><b>Effective Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Regulatory authorization date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Effective Date</em>' containment reference.
	 * @see #setEffectiveDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductManufacturingBusinessOperation_EffectiveDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='effectiveDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getEffectiveDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductManufacturingBusinessOperation#getEffectiveDate <em>Effective Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Date</em>' containment reference.
	 * @see #getEffectiveDate()
	 * @generated
	 */
	void setEffectiveDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Confidentiality Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * To indicate if this proces is commercially confidential.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Confidentiality Indicator</em>' containment reference.
	 * @see #setConfidentialityIndicator(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductManufacturingBusinessOperation_ConfidentialityIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='confidentialityIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getConfidentialityIndicator();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductManufacturingBusinessOperation#getConfidentialityIndicator <em>Confidentiality Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidentiality Indicator</em>' containment reference.
	 * @see #getConfidentialityIndicator()
	 * @generated
	 */
	void setConfidentialityIndicator(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The manufacturer or establishment associated with the process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductManufacturingBusinessOperation_Manufacturer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='manufacturer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getManufacturer();

	/**
	 * Returns the value of the '<em><b>Regulator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A regulator which oversees the operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Regulator</em>' containment reference.
	 * @see #setRegulator(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductManufacturingBusinessOperation_Regulator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='regulator' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRegulator();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductManufacturingBusinessOperation#getRegulator <em>Regulator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regulator</em>' containment reference.
	 * @see #getRegulator()
	 * @generated
	 */
	void setRegulator(Reference value);

} // MedicinalProductManufacturingBusinessOperation
