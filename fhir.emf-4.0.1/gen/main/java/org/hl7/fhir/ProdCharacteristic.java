/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prod Characteristic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The marketing status describes the date when a medicinal product is actually put on the market or the date as of which it is no longer available.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ProdCharacteristic#getHeight <em>Height</em>}</li>
 *   <li>{@link org.hl7.fhir.ProdCharacteristic#getWidth <em>Width</em>}</li>
 *   <li>{@link org.hl7.fhir.ProdCharacteristic#getDepth <em>Depth</em>}</li>
 *   <li>{@link org.hl7.fhir.ProdCharacteristic#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.hl7.fhir.ProdCharacteristic#getNominalVolume <em>Nominal Volume</em>}</li>
 *   <li>{@link org.hl7.fhir.ProdCharacteristic#getExternalDiameter <em>External Diameter</em>}</li>
 *   <li>{@link org.hl7.fhir.ProdCharacteristic#getShape <em>Shape</em>}</li>
 *   <li>{@link org.hl7.fhir.ProdCharacteristic#getColor <em>Color</em>}</li>
 *   <li>{@link org.hl7.fhir.ProdCharacteristic#getImprint <em>Imprint</em>}</li>
 *   <li>{@link org.hl7.fhir.ProdCharacteristic#getImage <em>Image</em>}</li>
 *   <li>{@link org.hl7.fhir.ProdCharacteristic#getScoring <em>Scoring</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getProdCharacteristic()
 * @model extendedMetaData="name='ProdCharacteristic' kind='elementOnly'"
 * @generated
 */
public interface ProdCharacteristic extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where applicable, the height can be specified using a numerical value and its unit of measurement The unit of measurement shall be specified in accordance with ISO 11240 and the resulting terminology The symbol and the symbol identifier shall be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Height</em>' containment reference.
	 * @see #setHeight(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getProdCharacteristic_Height()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='height' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getHeight();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProdCharacteristic#getHeight <em>Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' containment reference.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(Quantity value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where applicable, the width can be specified using a numerical value and its unit of measurement The unit of measurement shall be specified in accordance with ISO 11240 and the resulting terminology The symbol and the symbol identifier shall be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Width</em>' containment reference.
	 * @see #setWidth(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getProdCharacteristic_Width()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='width' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getWidth();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProdCharacteristic#getWidth <em>Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' containment reference.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(Quantity value);

	/**
	 * Returns the value of the '<em><b>Depth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where applicable, the depth can be specified using a numerical value and its unit of measurement The unit of measurement shall be specified in accordance with ISO 11240 and the resulting terminology The symbol and the symbol identifier shall be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Depth</em>' containment reference.
	 * @see #setDepth(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getProdCharacteristic_Depth()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='depth' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getDepth();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProdCharacteristic#getDepth <em>Depth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth</em>' containment reference.
	 * @see #getDepth()
	 * @generated
	 */
	void setDepth(Quantity value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where applicable, the weight can be specified using a numerical value and its unit of measurement The unit of measurement shall be specified in accordance with ISO 11240 and the resulting terminology The symbol and the symbol identifier shall be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weight</em>' containment reference.
	 * @see #setWeight(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getProdCharacteristic_Weight()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='weight' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getWeight();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProdCharacteristic#getWeight <em>Weight</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' containment reference.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(Quantity value);

	/**
	 * Returns the value of the '<em><b>Nominal Volume</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where applicable, the nominal volume can be specified using a numerical value and its unit of measurement The unit of measurement shall be specified in accordance with ISO 11240 and the resulting terminology The symbol and the symbol identifier shall be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nominal Volume</em>' containment reference.
	 * @see #setNominalVolume(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getProdCharacteristic_NominalVolume()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nominalVolume' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getNominalVolume();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProdCharacteristic#getNominalVolume <em>Nominal Volume</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal Volume</em>' containment reference.
	 * @see #getNominalVolume()
	 * @generated
	 */
	void setNominalVolume(Quantity value);

	/**
	 * Returns the value of the '<em><b>External Diameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where applicable, the external diameter can be specified using a numerical value and its unit of measurement The unit of measurement shall be specified in accordance with ISO 11240 and the resulting terminology The symbol and the symbol identifier shall be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External Diameter</em>' containment reference.
	 * @see #setExternalDiameter(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getProdCharacteristic_ExternalDiameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='externalDiameter' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getExternalDiameter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProdCharacteristic#getExternalDiameter <em>External Diameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Diameter</em>' containment reference.
	 * @see #getExternalDiameter()
	 * @generated
	 */
	void setExternalDiameter(Quantity value);

	/**
	 * Returns the value of the '<em><b>Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where applicable, the shape can be specified An appropriate controlled vocabulary shall be used The term and the term identifier shall be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shape</em>' containment reference.
	 * @see #setShape(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getProdCharacteristic_Shape()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='shape' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getShape();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProdCharacteristic#getShape <em>Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape</em>' containment reference.
	 * @see #getShape()
	 * @generated
	 */
	void setShape(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where applicable, the color can be specified An appropriate controlled vocabulary shall be used The term and the term identifier shall be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Color</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProdCharacteristic_Color()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='color' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getColor();

	/**
	 * Returns the value of the '<em><b>Imprint</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where applicable, the imprint can be specified as text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imprint</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProdCharacteristic_Imprint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='imprint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getImprint();

	/**
	 * Returns the value of the '<em><b>Image</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Attachment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where applicable, the image can be provided The format of the image attachment shall be specified by regional implementations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProdCharacteristic_Image()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='image' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Attachment> getImage();

	/**
	 * Returns the value of the '<em><b>Scoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where applicable, the scoring can be specified An appropriate controlled vocabulary shall be used The term and the term identifier shall be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scoring</em>' containment reference.
	 * @see #setScoring(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getProdCharacteristic_Scoring()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='scoring' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getScoring();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProdCharacteristic#getScoring <em>Scoring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scoring</em>' containment reference.
	 * @see #getScoring()
	 * @generated
	 */
	void setScoring(CodeableConcept value);

} // ProdCharacteristic
