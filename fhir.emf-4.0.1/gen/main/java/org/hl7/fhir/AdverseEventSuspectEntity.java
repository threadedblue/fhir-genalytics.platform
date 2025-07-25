/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adverse Event Suspect Entity</b></em>'.
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
 *   <li>{@link org.hl7.fhir.AdverseEventSuspectEntity#getInstance <em>Instance</em>}</li>
 *   <li>{@link org.hl7.fhir.AdverseEventSuspectEntity#getCausality <em>Causality</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getAdverseEventSuspectEntity()
 * @model extendedMetaData="name='AdverseEvent.SuspectEntity' kind='elementOnly'"
 * @generated
 */
public interface AdverseEventSuspectEntity extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the actual instance of what caused the adverse event.  May be a substance, medication, medication administration, medication statement or a device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance</em>' containment reference.
	 * @see #setInstance(Reference)
	 * @see org.hl7.fhir.FhirPackage#getAdverseEventSuspectEntity_Instance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='instance' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getInstance();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AdverseEventSuspectEntity#getInstance <em>Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' containment reference.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(Reference value);

	/**
	 * Returns the value of the '<em><b>Causality</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.AdverseEventCausality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information on the possible cause of the event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Causality</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAdverseEventSuspectEntity_Causality()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='causality' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AdverseEventCausality> getCausality();

} // AdverseEventSuspectEntity
