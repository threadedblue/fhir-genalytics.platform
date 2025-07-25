/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Polymer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Todo.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SubstancePolymer#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstancePolymer#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstancePolymer#getCopolymerConnectivity <em>Copolymer Connectivity</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstancePolymer#getModification <em>Modification</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstancePolymer#getMonomerSet <em>Monomer Set</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstancePolymer#getRepeat <em>Repeat</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubstancePolymer()
 * @model extendedMetaData="name='SubstancePolymer' kind='elementOnly'"
 * @generated
 */
public interface SubstancePolymer extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class</em>' containment reference.
	 * @see #setClass(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstancePolymer_Class()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='class' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getClass_();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstancePolymer#getClass_ <em>Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' containment reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geometry</em>' containment reference.
	 * @see #setGeometry(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstancePolymer_Geometry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='geometry' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getGeometry();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstancePolymer#getGeometry <em>Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry</em>' containment reference.
	 * @see #getGeometry()
	 * @generated
	 */
	void setGeometry(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Copolymer Connectivity</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copolymer Connectivity</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstancePolymer_CopolymerConnectivity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='copolymerConnectivity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCopolymerConnectivity();

	/**
	 * Returns the value of the '<em><b>Modification</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modification</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstancePolymer_Modification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getModification();

	/**
	 * Returns the value of the '<em><b>Monomer Set</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SubstancePolymerMonomerSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Monomer Set</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstancePolymer_MonomerSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='monomerSet' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstancePolymerMonomerSet> getMonomerSet();

	/**
	 * Returns the value of the '<em><b>Repeat</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SubstancePolymerRepeat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repeat</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstancePolymer_Repeat()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='repeat' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstancePolymerRepeat> getRepeat();

} // SubstancePolymer
