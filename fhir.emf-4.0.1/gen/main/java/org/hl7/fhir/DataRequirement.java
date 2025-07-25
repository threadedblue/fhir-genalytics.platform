/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.DataRequirement#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.DataRequirement#getProfile <em>Profile</em>}</li>
 *   <li>{@link org.hl7.fhir.DataRequirement#getSubjectCodeableConcept <em>Subject Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.DataRequirement#getSubjectReference <em>Subject Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.DataRequirement#getMustSupport <em>Must Support</em>}</li>
 *   <li>{@link org.hl7.fhir.DataRequirement#getCodeFilter <em>Code Filter</em>}</li>
 *   <li>{@link org.hl7.fhir.DataRequirement#getDateFilter <em>Date Filter</em>}</li>
 *   <li>{@link org.hl7.fhir.DataRequirement#getLimit <em>Limit</em>}</li>
 *   <li>{@link org.hl7.fhir.DataRequirement#getSort <em>Sort</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDataRequirement()
 * @model extendedMetaData="name='DataRequirement' kind='elementOnly'"
 * @generated
 */
public interface DataRequirement extends Element {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the required data, specified as the type name of a resource. For profiles, this value is set to the type of the base resource of the profile.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Code)
	 * @see org.hl7.fhir.FhirPackage#getDataRequirement_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DataRequirement#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Code value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Canonical}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The profile of the required data, specified as the uri of the profile definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Profile</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDataRequirement_Profile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='profile' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Canonical> getProfile();

	/**
	 * Returns the value of the '<em><b>Subject Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The intended subjects of the data requirement. If this element is not provided, a Patient subject is assumed. (choose any one of subject*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject Codeable Concept</em>' containment reference.
	 * @see #setSubjectCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getDataRequirement_SubjectCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subjectCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSubjectCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DataRequirement#getSubjectCodeableConcept <em>Subject Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject Codeable Concept</em>' containment reference.
	 * @see #getSubjectCodeableConcept()
	 * @generated
	 */
	void setSubjectCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Subject Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The intended subjects of the data requirement. If this element is not provided, a Patient subject is assumed. (choose any one of subject*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject Reference</em>' containment reference.
	 * @see #setSubjectReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDataRequirement_SubjectReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subjectReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubjectReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DataRequirement#getSubjectReference <em>Subject Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject Reference</em>' containment reference.
	 * @see #getSubjectReference()
	 * @generated
	 */
	void setSubjectReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Must Support</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that specific elements of the type are referenced by the knowledge module and must be supported by the consumer in order to obtain an effective evaluation. This does not mean that a value is required for this element, only that the consuming system must understand the element and be able to provide values for it if they are available. 
	 * 
	 * The value of mustSupport SHALL be a FHIRPath resolveable on the type of the DataRequirement. The path SHALL consist only of identifiers, constant indexers, and .resolve() (see the [Simple FHIRPath Profile](fhirpath.html#simple) for full details).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Must Support</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDataRequirement_MustSupport()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mustSupport' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getMustSupport();

	/**
	 * Returns the value of the '<em><b>Code Filter</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DataRequirementCodeFilter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code filters specify additional constraints on the data, specifying the value set of interest for a particular element of the data. Each code filter defines an additional constraint on the data, i.e. code filters are AND'ed, not OR'ed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code Filter</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDataRequirement_CodeFilter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='codeFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DataRequirementCodeFilter> getCodeFilter();

	/**
	 * Returns the value of the '<em><b>Date Filter</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DataRequirementDateFilter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date filters specify additional constraints on the data in terms of the applicable date range for specific elements. Each date filter specifies an additional constraint on the data, i.e. date filters are AND'ed, not OR'ed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Filter</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDataRequirement_DateFilter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dateFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DataRequirementDateFilter> getDateFilter();

	/**
	 * Returns the value of the '<em><b>Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a maximum number of results that are required (uses the _count search parameter).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Limit</em>' containment reference.
	 * @see #setLimit(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getDataRequirement_Limit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='limit' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getLimit();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DataRequirement#getLimit <em>Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limit</em>' containment reference.
	 * @see #getLimit()
	 * @generated
	 */
	void setLimit(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Sort</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DataRequirementSort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the order of the results to be returned.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sort</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDataRequirement_Sort()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sort' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DataRequirementSort> getSort();

} // DataRequirement
