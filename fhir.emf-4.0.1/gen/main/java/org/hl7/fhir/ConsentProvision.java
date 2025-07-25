/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consent Provision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of a healthcare consumer’s  choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ConsentProvision#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ConsentProvision#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.ConsentProvision#getActor <em>Actor</em>}</li>
 *   <li>{@link org.hl7.fhir.ConsentProvision#getAction <em>Action</em>}</li>
 *   <li>{@link org.hl7.fhir.ConsentProvision#getSecurityLabel <em>Security Label</em>}</li>
 *   <li>{@link org.hl7.fhir.ConsentProvision#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.hl7.fhir.ConsentProvision#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.hl7.fhir.ConsentProvision#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ConsentProvision#getDataPeriod <em>Data Period</em>}</li>
 *   <li>{@link org.hl7.fhir.ConsentProvision#getData <em>Data</em>}</li>
 *   <li>{@link org.hl7.fhir.ConsentProvision#getProvision <em>Provision</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getConsentProvision()
 * @model extendedMetaData="name='Consent.Provision' kind='elementOnly'"
 * @generated
 */
public interface ConsentProvision extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Action  to take - permit or deny - when the rule conditions are met.  Not permitted in root rule, required in all nested rules.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(ConsentProvisionType)
	 * @see org.hl7.fhir.FhirPackage#getConsentProvision_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	ConsentProvisionType getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConsentProvision#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ConsentProvisionType value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The timeframe in this rule is valid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getConsentProvision_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConsentProvision#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ConsentActor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Who or what is controlled by this rule. Use group to identify a set of actors by some property they share (e.g. 'admitting officers').
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actor</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsentProvision_Actor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='actor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConsentActor> getActor();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Actions controlled by this Rule.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsentProvision_Action()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='action' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getAction();

	/**
	 * Returns the value of the '<em><b>Security Label</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A security label, comprised of 0..* security label fields (Privacy tags), which define which resources are controlled by this exception.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security Label</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsentProvision_SecurityLabel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='securityLabel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getSecurityLabel();

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The context of the activities a user is taking - why the user is accessing the data - that are controlled by this rule.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Purpose</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsentProvision_Purpose()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='purpose' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getPurpose();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The class of information covered by this rule. The type can be a FHIR resource type, a profile on a type, or a CDA document, or some other type that indicates what sort of information the consent relates to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsentProvision_Class()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='class' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getClass_();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this code is found in an instance, then the rule applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsentProvision_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCode();

	/**
	 * Returns the value of the '<em><b>Data Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Clinical or Operational Relevant period of time that bounds the data controlled by this rule.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Period</em>' containment reference.
	 * @see #setDataPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getConsentProvision_DataPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dataPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getDataPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConsentProvision#getDataPeriod <em>Data Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Period</em>' containment reference.
	 * @see #getDataPeriod()
	 * @generated
	 */
	void setDataPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ConsentData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resources controlled by this rule if specific resources are referenced.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsentProvision_Data()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='data' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConsentData> getData();

	/**
	 * Returns the value of the '<em><b>Provision</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ConsentProvision}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rules which provide exceptions to the base rule or subrules.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provision</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsentProvision_Provision()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='provision' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConsentProvision> getProvision();

} // ConsentProvision
