/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provenance Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ProvenanceEntity#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.ProvenanceEntity#getWhat <em>What</em>}</li>
 *   <li>{@link org.hl7.fhir.ProvenanceEntity#getAgent <em>Agent</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getProvenanceEntity()
 * @model extendedMetaData="name='Provenance.Entity' kind='elementOnly'"
 * @generated
 */
public interface ProvenanceEntity extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How the entity was used during the activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(ProvenanceEntityRole)
	 * @see org.hl7.fhir.FhirPackage#getProvenanceEntity_Role()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='role' namespace='##targetNamespace'"
	 * @generated
	 */
	ProvenanceEntityRole getRole();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProvenanceEntity#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(ProvenanceEntityRole value);

	/**
	 * Returns the value of the '<em><b>What</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identity of the  Entity used. May be a logical or physical uri and maybe absolute or relative.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>What</em>' containment reference.
	 * @see #setWhat(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProvenanceEntity_What()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='what' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getWhat();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProvenanceEntity#getWhat <em>What</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>What</em>' containment reference.
	 * @see #getWhat()
	 * @generated
	 */
	void setWhat(Reference value);

	/**
	 * Returns the value of the '<em><b>Agent</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ProvenanceAgent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The entity is attributed to an agent to express the agent's responsibility for that entity, possibly along with other agents. This description can be understood as shorthand for saying that the agent was responsible for the activity which generated the entity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Agent</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProvenanceEntity_Agent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='agent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProvenanceAgent> getAgent();

} // ProvenanceEntity
