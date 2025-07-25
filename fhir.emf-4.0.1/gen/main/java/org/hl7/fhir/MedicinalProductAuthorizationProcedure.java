/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Authorization Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The regulatory authorization of a medicinal product.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicinalProductAuthorizationProcedure#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductAuthorizationProcedure#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductAuthorizationProcedure#getDatePeriod <em>Date Period</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductAuthorizationProcedure#getDateDateTime <em>Date Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductAuthorizationProcedure#getApplication <em>Application</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicinalProductAuthorizationProcedure()
 * @model extendedMetaData="name='MedicinalProductAuthorization.Procedure' kind='elementOnly'"
 * @generated
 */
public interface MedicinalProductAuthorizationProcedure extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier for this procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductAuthorizationProcedure_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductAuthorizationProcedure#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductAuthorizationProcedure_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductAuthorizationProcedure#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Date Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date of procedure. (choose any one of date*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Period</em>' containment reference.
	 * @see #setDatePeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductAuthorizationProcedure_DatePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='datePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getDatePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductAuthorizationProcedure#getDatePeriod <em>Date Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Period</em>' containment reference.
	 * @see #getDatePeriod()
	 * @generated
	 */
	void setDatePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Date Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date of procedure. (choose any one of date*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Date Time</em>' containment reference.
	 * @see #setDateDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductAuthorizationProcedure_DateDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dateDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDateDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductAuthorizationProcedure#getDateDateTime <em>Date Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Date Time</em>' containment reference.
	 * @see #getDateDateTime()
	 * @generated
	 */
	void setDateDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Application</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicinalProductAuthorizationProcedure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Applcations submitted to obtain a marketing authorization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Application</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductAuthorizationProcedure_Application()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='application' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicinalProductAuthorizationProcedure> getApplication();

} // MedicinalProductAuthorizationProcedure
