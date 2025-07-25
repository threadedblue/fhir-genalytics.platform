/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Reference Information Classification</b></em>'.
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
 *   <li>{@link org.hl7.fhir.SubstanceReferenceInformationClassification#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceReferenceInformationClassification#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceReferenceInformationClassification#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceReferenceInformationClassification#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubstanceReferenceInformationClassification()
 * @model extendedMetaData="name='SubstanceReferenceInformation.Classification' kind='elementOnly'"
 * @generated
 */
public interface SubstanceReferenceInformationClassification extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain</em>' containment reference.
	 * @see #setDomain(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceReferenceInformationClassification_Domain()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='domain' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDomain();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceReferenceInformationClassification#getDomain <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' containment reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classification</em>' containment reference.
	 * @see #setClassification(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceReferenceInformationClassification_Classification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='classification' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getClassification();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceReferenceInformationClassification#getClassification <em>Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification</em>' containment reference.
	 * @see #getClassification()
	 * @generated
	 */
	void setClassification(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Subtype</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subtype</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceReferenceInformationClassification_Subtype()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subtype' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getSubtype();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceReferenceInformationClassification_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSource();

} // SubstanceReferenceInformationClassification
