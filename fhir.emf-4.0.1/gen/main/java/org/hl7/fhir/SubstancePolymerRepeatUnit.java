/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Polymer Repeat Unit</b></em>'.
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
 *   <li>{@link org.hl7.fhir.SubstancePolymerRepeatUnit#getOrientationOfPolymerisation <em>Orientation Of Polymerisation</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstancePolymerRepeatUnit#getRepeatUnit <em>Repeat Unit</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstancePolymerRepeatUnit#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstancePolymerRepeatUnit#getDegreeOfPolymerisation <em>Degree Of Polymerisation</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstancePolymerRepeatUnit#getStructuralRepresentation <em>Structural Representation</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubstancePolymerRepeatUnit()
 * @model extendedMetaData="name='SubstancePolymer.RepeatUnit' kind='elementOnly'"
 * @generated
 */
public interface SubstancePolymerRepeatUnit extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Orientation Of Polymerisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Orientation Of Polymerisation</em>' containment reference.
	 * @see #setOrientationOfPolymerisation(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstancePolymerRepeatUnit_OrientationOfPolymerisation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='orientationOfPolymerisation' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getOrientationOfPolymerisation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstancePolymerRepeatUnit#getOrientationOfPolymerisation <em>Orientation Of Polymerisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation Of Polymerisation</em>' containment reference.
	 * @see #getOrientationOfPolymerisation()
	 * @generated
	 */
	void setOrientationOfPolymerisation(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Repeat Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repeat Unit</em>' containment reference.
	 * @see #setRepeatUnit(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubstancePolymerRepeatUnit_RepeatUnit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='repeatUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getRepeatUnit();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstancePolymerRepeatUnit#getRepeatUnit <em>Repeat Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat Unit</em>' containment reference.
	 * @see #getRepeatUnit()
	 * @generated
	 */
	void setRepeatUnit(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount</em>' containment reference.
	 * @see #setAmount(SubstanceAmount)
	 * @see org.hl7.fhir.FhirPackage#getSubstancePolymerRepeatUnit_Amount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amount' namespace='##targetNamespace'"
	 * @generated
	 */
	SubstanceAmount getAmount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstancePolymerRepeatUnit#getAmount <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' containment reference.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(SubstanceAmount value);

	/**
	 * Returns the value of the '<em><b>Degree Of Polymerisation</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SubstancePolymerDegreeOfPolymerisation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Degree Of Polymerisation</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstancePolymerRepeatUnit_DegreeOfPolymerisation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='degreeOfPolymerisation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstancePolymerDegreeOfPolymerisation> getDegreeOfPolymerisation();

	/**
	 * Returns the value of the '<em><b>Structural Representation</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SubstancePolymerStructuralRepresentation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structural Representation</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstancePolymerRepeatUnit_StructuralRepresentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='structuralRepresentation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstancePolymerStructuralRepresentation> getStructuralRepresentation();

} // SubstancePolymerRepeatUnit
