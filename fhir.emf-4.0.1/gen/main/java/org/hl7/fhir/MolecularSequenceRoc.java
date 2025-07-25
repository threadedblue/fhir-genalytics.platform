/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Molecular Sequence Roc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Raw data describing a biological sequence.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MolecularSequenceRoc#getScore <em>Score</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequenceRoc#getNumTP <em>Num TP</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequenceRoc#getNumFP <em>Num FP</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequenceRoc#getNumFN <em>Num FN</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequenceRoc#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequenceRoc#getSensitivity <em>Sensitivity</em>}</li>
 *   <li>{@link org.hl7.fhir.MolecularSequenceRoc#getFMeasure <em>FMeasure</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceRoc()
 * @model extendedMetaData="name='MolecularSequence.Roc' kind='elementOnly'"
 * @generated
 */
public interface MolecularSequenceRoc extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Score</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Invidual data point representing the GQ (genotype quality) score threshold.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Score</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceRoc_Score()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='score' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.Integer> getScore();

	/**
	 * Returns the value of the '<em><b>Num TP</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of true positives if the GQ score threshold was set to "score" field value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Num TP</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceRoc_NumTP()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='numTP' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.Integer> getNumTP();

	/**
	 * Returns the value of the '<em><b>Num FP</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of false positives if the GQ score threshold was set to "score" field value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Num FP</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceRoc_NumFP()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='numFP' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.Integer> getNumFP();

	/**
	 * Returns the value of the '<em><b>Num FN</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of false negatives if the GQ score threshold was set to "score" field value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Num FN</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceRoc_NumFN()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='numFN' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.Integer> getNumFN();

	/**
	 * Returns the value of the '<em><b>Precision</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Decimal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Calculated precision if the GQ score threshold was set to "score" field value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Precision</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceRoc_Precision()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='precision' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Decimal> getPrecision();

	/**
	 * Returns the value of the '<em><b>Sensitivity</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Decimal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Calculated sensitivity if the GQ score threshold was set to "score" field value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sensitivity</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceRoc_Sensitivity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sensitivity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Decimal> getSensitivity();

	/**
	 * Returns the value of the '<em><b>FMeasure</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Decimal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Calculated fScore if the GQ score threshold was set to "score" field value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FMeasure</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMolecularSequenceRoc_FMeasure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fMeasure' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Decimal> getFMeasure();

} // MolecularSequenceRoc
