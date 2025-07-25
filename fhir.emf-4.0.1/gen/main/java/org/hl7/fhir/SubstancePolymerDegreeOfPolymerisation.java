/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Polymer Degree Of Polymerisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Todo.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SubstancePolymerDegreeOfPolymerisation#getDegree <em>Degree</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstancePolymerDegreeOfPolymerisation#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubstancePolymerDegreeOfPolymerisation()
 * @model extendedMetaData="name='SubstancePolymer.DegreeOfPolymerisation' kind='elementOnly'"
 * @generated
 */
public interface SubstancePolymerDegreeOfPolymerisation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Degree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Degree</em>' containment reference.
	 * @see #setDegree(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstancePolymerDegreeOfPolymerisation_Degree()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='degree' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDegree();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstancePolymerDegreeOfPolymerisation#getDegree <em>Degree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degree</em>' containment reference.
	 * @see #getDegree()
	 * @generated
	 */
	void setDegree(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount</em>' containment reference.
	 * @see #setAmount(SubstanceAmount)
	 * @see org.hl7.fhir.FhirPackage#getSubstancePolymerDegreeOfPolymerisation_Amount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amount' namespace='##targetNamespace'"
	 * @generated
	 */
	SubstanceAmount getAmount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstancePolymerDegreeOfPolymerisation#getAmount <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' containment reference.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(SubstanceAmount value);

} // SubstancePolymerDegreeOfPolymerisation
