/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Polymer Repeat</b></em>'.
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
 *   <li>{@link org.hl7.fhir.SubstancePolymerRepeat#getNumberOfUnits <em>Number Of Units</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstancePolymerRepeat#getAverageMolecularFormula <em>Average Molecular Formula</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstancePolymerRepeat#getRepeatUnitAmountType <em>Repeat Unit Amount Type</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstancePolymerRepeat#getRepeatUnit <em>Repeat Unit</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubstancePolymerRepeat()
 * @model extendedMetaData="name='SubstancePolymer.Repeat' kind='elementOnly'"
 * @generated
 */
public interface SubstancePolymerRepeat extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Number Of Units</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Units</em>' containment reference.
	 * @see #setNumberOfUnits(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getSubstancePolymerRepeat_NumberOfUnits()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='numberOfUnits' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getNumberOfUnits();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstancePolymerRepeat#getNumberOfUnits <em>Number Of Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Units</em>' containment reference.
	 * @see #getNumberOfUnits()
	 * @generated
	 */
	void setNumberOfUnits(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Average Molecular Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Average Molecular Formula</em>' containment reference.
	 * @see #setAverageMolecularFormula(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubstancePolymerRepeat_AverageMolecularFormula()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='averageMolecularFormula' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getAverageMolecularFormula();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstancePolymerRepeat#getAverageMolecularFormula <em>Average Molecular Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average Molecular Formula</em>' containment reference.
	 * @see #getAverageMolecularFormula()
	 * @generated
	 */
	void setAverageMolecularFormula(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Repeat Unit Amount Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repeat Unit Amount Type</em>' containment reference.
	 * @see #setRepeatUnitAmountType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstancePolymerRepeat_RepeatUnitAmountType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='repeatUnitAmountType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRepeatUnitAmountType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstancePolymerRepeat#getRepeatUnitAmountType <em>Repeat Unit Amount Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat Unit Amount Type</em>' containment reference.
	 * @see #getRepeatUnitAmountType()
	 * @generated
	 */
	void setRepeatUnitAmountType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Repeat Unit</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SubstancePolymerRepeatUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repeat Unit</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstancePolymerRepeat_RepeatUnit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='repeatUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstancePolymerRepeatUnit> getRepeatUnit();

} // SubstancePolymerRepeat
