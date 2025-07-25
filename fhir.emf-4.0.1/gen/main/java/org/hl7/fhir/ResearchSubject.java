/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Research Subject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A physical entity which is the primary unit of operational and/or administrative interest in a study.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ResearchSubject#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchSubject#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchSubject#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchSubject#getStudy <em>Study</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchSubject#getIndividual <em>Individual</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchSubject#getAssignedArm <em>Assigned Arm</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchSubject#getActualArm <em>Actual Arm</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchSubject#getConsent <em>Consent</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getResearchSubject()
 * @model extendedMetaData="name='ResearchSubject' kind='elementOnly'"
 * @generated
 */
public interface ResearchSubject extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifiers assigned to this research subject for a study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getResearchSubject_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current state of the subject.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(ResearchSubjectStatus)
	 * @see org.hl7.fhir.FhirPackage#getResearchSubject_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	ResearchSubjectStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchSubject#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ResearchSubjectStatus value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The dates the subject began and ended their participation in the study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getResearchSubject_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchSubject#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Study</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the study the subject is participating in.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Study</em>' containment reference.
	 * @see #setStudy(Reference)
	 * @see org.hl7.fhir.FhirPackage#getResearchSubject_Study()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='study' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getStudy();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchSubject#getStudy <em>Study</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study</em>' containment reference.
	 * @see #getStudy()
	 * @generated
	 */
	void setStudy(Reference value);

	/**
	 * Returns the value of the '<em><b>Individual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The record of the person or animal who is involved in the study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Individual</em>' containment reference.
	 * @see #setIndividual(Reference)
	 * @see org.hl7.fhir.FhirPackage#getResearchSubject_Individual()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='individual' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getIndividual();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchSubject#getIndividual <em>Individual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Individual</em>' containment reference.
	 * @see #getIndividual()
	 * @generated
	 */
	void setIndividual(Reference value);

	/**
	 * Returns the value of the '<em><b>Assigned Arm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the arm in the study the subject is expected to follow as part of this study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assigned Arm</em>' containment reference.
	 * @see #setAssignedArm(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getResearchSubject_AssignedArm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='assignedArm' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getAssignedArm();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchSubject#getAssignedArm <em>Assigned Arm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned Arm</em>' containment reference.
	 * @see #getAssignedArm()
	 * @generated
	 */
	void setAssignedArm(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Actual Arm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the arm in the study the subject actually followed as part of this study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Arm</em>' containment reference.
	 * @see #setActualArm(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getResearchSubject_ActualArm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='actualArm' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getActualArm();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchSubject#getActualArm <em>Actual Arm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Arm</em>' containment reference.
	 * @see #getActualArm()
	 * @generated
	 */
	void setActualArm(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Consent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A record of the patient's informed agreement to participate in the study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consent</em>' containment reference.
	 * @see #setConsent(Reference)
	 * @see org.hl7.fhir.FhirPackage#getResearchSubject_Consent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='consent' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getConsent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchSubject#getConsent <em>Consent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consent</em>' containment reference.
	 * @see #getConsent()
	 * @generated
	 */
	void setConsent(Reference value);

} // ResearchSubject
