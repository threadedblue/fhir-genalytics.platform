/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Immunization Protocol Applied</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the event of a patient being administered a vaccine or a record of an immunization as reported by a patient, a clinician or another party.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ImmunizationProtocolApplied#getSeries <em>Series</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationProtocolApplied#getAuthority <em>Authority</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationProtocolApplied#getTargetDisease <em>Target Disease</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationProtocolApplied#getDoseNumberPositiveInt <em>Dose Number Positive Int</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationProtocolApplied#getDoseNumberString <em>Dose Number String</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationProtocolApplied#getSeriesDosesPositiveInt <em>Series Doses Positive Int</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationProtocolApplied#getSeriesDosesString <em>Series Doses String</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getImmunizationProtocolApplied()
 * @model extendedMetaData="name='Immunization.ProtocolApplied' kind='elementOnly'"
 * @generated
 */
public interface ImmunizationProtocolApplied extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Series</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One possible path to achieve presumed immunity against a disease - within the context of an authority.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Series</em>' containment reference.
	 * @see #setSeries(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationProtocolApplied_Series()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='series' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSeries();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationProtocolApplied#getSeries <em>Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series</em>' containment reference.
	 * @see #getSeries()
	 * @generated
	 */
	void setSeries(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Authority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the authority who published the protocol (e.g. ACIP) that is being followed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authority</em>' containment reference.
	 * @see #setAuthority(Reference)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationProtocolApplied_Authority()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='authority' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAuthority();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationProtocolApplied#getAuthority <em>Authority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authority</em>' containment reference.
	 * @see #getAuthority()
	 * @generated
	 */
	void setAuthority(Reference value);

	/**
	 * Returns the value of the '<em><b>Target Disease</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The vaccine preventable disease the dose is being administered against.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Disease</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImmunizationProtocolApplied_TargetDisease()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='targetDisease' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getTargetDisease();

	/**
	 * Returns the value of the '<em><b>Dose Number Positive Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nominal position in a series. (choose any one of doseNumber*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dose Number Positive Int</em>' containment reference.
	 * @see #setDoseNumberPositiveInt(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationProtocolApplied_DoseNumberPositiveInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='doseNumberPositiveInt' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getDoseNumberPositiveInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationProtocolApplied#getDoseNumberPositiveInt <em>Dose Number Positive Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dose Number Positive Int</em>' containment reference.
	 * @see #getDoseNumberPositiveInt()
	 * @generated
	 */
	void setDoseNumberPositiveInt(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Dose Number String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nominal position in a series. (choose any one of doseNumber*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dose Number String</em>' containment reference.
	 * @see #setDoseNumberString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationProtocolApplied_DoseNumberString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='doseNumberString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDoseNumberString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationProtocolApplied#getDoseNumberString <em>Dose Number String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dose Number String</em>' containment reference.
	 * @see #getDoseNumberString()
	 * @generated
	 */
	void setDoseNumberString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Series Doses Positive Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The recommended number of doses to achieve immunity. (choose any one of seriesDoses*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Series Doses Positive Int</em>' containment reference.
	 * @see #setSeriesDosesPositiveInt(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationProtocolApplied_SeriesDosesPositiveInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='seriesDosesPositiveInt' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getSeriesDosesPositiveInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationProtocolApplied#getSeriesDosesPositiveInt <em>Series Doses Positive Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series Doses Positive Int</em>' containment reference.
	 * @see #getSeriesDosesPositiveInt()
	 * @generated
	 */
	void setSeriesDosesPositiveInt(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Series Doses String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The recommended number of doses to achieve immunity. (choose any one of seriesDoses*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Series Doses String</em>' containment reference.
	 * @see #setSeriesDosesString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getImmunizationProtocolApplied_SeriesDosesString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='seriesDosesString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSeriesDosesString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationProtocolApplied#getSeriesDosesString <em>Series Doses String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series Doses String</em>' containment reference.
	 * @see #getSeriesDosesString()
	 * @generated
	 */
	void setSeriesDosesString(org.hl7.fhir.String value);

} // ImmunizationProtocolApplied
