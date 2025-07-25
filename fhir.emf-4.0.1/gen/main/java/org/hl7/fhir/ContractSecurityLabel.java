/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract Security Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ContractSecurityLabel#getNumber <em>Number</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractSecurityLabel#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractSecurityLabel#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractSecurityLabel#getControl <em>Control</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getContractSecurityLabel()
 * @model extendedMetaData="name='Contract.SecurityLabel' kind='elementOnly'"
 * @generated
 */
public interface ContractSecurityLabel extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.UnsignedInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number used to link this term or term element to the applicable Security Label.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContractSecurityLabel_Number()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='number' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UnsignedInt> getNumber();

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Security label privacy tag that species the level of confidentiality protection required for this term and/or term elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classification</em>' containment reference.
	 * @see #setClassification(Coding)
	 * @see org.hl7.fhir.FhirPackage#getContractSecurityLabel_Classification()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='classification' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getClassification();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractSecurityLabel#getClassification <em>Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification</em>' containment reference.
	 * @see #getClassification()
	 * @generated
	 */
	void setClassification(Coding value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Security label privacy tag that species the applicable privacy and security policies governing this term and/or term elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContractSecurityLabel_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getCategory();

	/**
	 * Returns the value of the '<em><b>Control</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Security label privacy tag that species the manner in which term and/or term elements are to be protected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Control</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContractSecurityLabel_Control()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='control' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getControl();

} // ContractSecurityLabel
