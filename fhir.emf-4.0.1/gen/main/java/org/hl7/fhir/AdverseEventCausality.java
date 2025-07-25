/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adverse Event Causality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Actual or  potential/avoided event causing unintended physical injury resulting from or contributed to by medical care, a research study or other healthcare setting factors that requires additional monitoring, treatment, or hospitalization, or that results in death.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.AdverseEventCausality#getAssessment <em>Assessment</em>}</li>
 *   <li>{@link org.hl7.fhir.AdverseEventCausality#getProductRelatedness <em>Product Relatedness</em>}</li>
 *   <li>{@link org.hl7.fhir.AdverseEventCausality#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.fhir.AdverseEventCausality#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getAdverseEventCausality()
 * @model extendedMetaData="name='AdverseEvent.Causality' kind='elementOnly'"
 * @generated
 */
public interface AdverseEventCausality extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Assessment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Assessment of if the entity caused the event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assessment</em>' containment reference.
	 * @see #setAssessment(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getAdverseEventCausality_Assessment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='assessment' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getAssessment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AdverseEventCausality#getAssessment <em>Assessment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assessment</em>' containment reference.
	 * @see #getAssessment()
	 * @generated
	 */
	void setAssessment(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Product Relatedness</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AdverseEvent.suspectEntity.causalityProductRelatedness.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product Relatedness</em>' containment reference.
	 * @see #setProductRelatedness(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getAdverseEventCausality_ProductRelatedness()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='productRelatedness' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getProductRelatedness();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AdverseEventCausality#getProductRelatedness <em>Product Relatedness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Relatedness</em>' containment reference.
	 * @see #getProductRelatedness()
	 * @generated
	 */
	void setProductRelatedness(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AdverseEvent.suspectEntity.causalityAuthor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author</em>' containment reference.
	 * @see #setAuthor(Reference)
	 * @see org.hl7.fhir.FhirPackage#getAdverseEventCausality_Author()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAuthor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AdverseEventCausality#getAuthor <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' containment reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Reference value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ProbabilityScale | Bayesian | Checklist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getAdverseEventCausality_Method()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='method' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getMethod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AdverseEventCausality#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(CodeableConcept value);

} // AdverseEventCausality
