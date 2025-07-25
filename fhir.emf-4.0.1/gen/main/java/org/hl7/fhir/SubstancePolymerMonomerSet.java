/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Polymer Monomer Set</b></em>'.
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
 *   <li>{@link org.hl7.fhir.SubstancePolymerMonomerSet#getRatioType <em>Ratio Type</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstancePolymerMonomerSet#getStartingMaterial <em>Starting Material</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubstancePolymerMonomerSet()
 * @model extendedMetaData="name='SubstancePolymer.MonomerSet' kind='elementOnly'"
 * @generated
 */
public interface SubstancePolymerMonomerSet extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Ratio Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ratio Type</em>' containment reference.
	 * @see #setRatioType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstancePolymerMonomerSet_RatioType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ratioType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRatioType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstancePolymerMonomerSet#getRatioType <em>Ratio Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ratio Type</em>' containment reference.
	 * @see #getRatioType()
	 * @generated
	 */
	void setRatioType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Starting Material</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SubstancePolymerStartingMaterial}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Starting Material</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstancePolymerMonomerSet_StartingMaterial()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='startingMaterial' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstancePolymerStartingMaterial> getStartingMaterial();

} // SubstancePolymerMonomerSet
