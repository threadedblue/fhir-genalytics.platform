/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vision Prescription Lens Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An authorization for the provision of glasses and/or contact lenses to a patient.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.VisionPrescriptionLensSpecification#getProduct <em>Product</em>}</li>
 *   <li>{@link org.hl7.fhir.VisionPrescriptionLensSpecification#getEye <em>Eye</em>}</li>
 *   <li>{@link org.hl7.fhir.VisionPrescriptionLensSpecification#getSphere <em>Sphere</em>}</li>
 *   <li>{@link org.hl7.fhir.VisionPrescriptionLensSpecification#getCylinder <em>Cylinder</em>}</li>
 *   <li>{@link org.hl7.fhir.VisionPrescriptionLensSpecification#getAxis <em>Axis</em>}</li>
 *   <li>{@link org.hl7.fhir.VisionPrescriptionLensSpecification#getPrism <em>Prism</em>}</li>
 *   <li>{@link org.hl7.fhir.VisionPrescriptionLensSpecification#getAdd <em>Add</em>}</li>
 *   <li>{@link org.hl7.fhir.VisionPrescriptionLensSpecification#getPower <em>Power</em>}</li>
 *   <li>{@link org.hl7.fhir.VisionPrescriptionLensSpecification#getBackCurve <em>Back Curve</em>}</li>
 *   <li>{@link org.hl7.fhir.VisionPrescriptionLensSpecification#getDiameter <em>Diameter</em>}</li>
 *   <li>{@link org.hl7.fhir.VisionPrescriptionLensSpecification#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.VisionPrescriptionLensSpecification#getColor <em>Color</em>}</li>
 *   <li>{@link org.hl7.fhir.VisionPrescriptionLensSpecification#getBrand <em>Brand</em>}</li>
 *   <li>{@link org.hl7.fhir.VisionPrescriptionLensSpecification#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getVisionPrescriptionLensSpecification()
 * @model extendedMetaData="name='VisionPrescription.LensSpecification' kind='elementOnly'"
 * @generated
 */
public interface VisionPrescriptionLensSpecification extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Product</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the type of vision correction product which is required for the patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product</em>' containment reference.
	 * @see #setProduct(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getVisionPrescriptionLensSpecification_Product()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='product' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getProduct();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VisionPrescriptionLensSpecification#getProduct <em>Product</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' containment reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Eye</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The eye for which the lens specification applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eye</em>' containment reference.
	 * @see #setEye(VisionEyes)
	 * @see org.hl7.fhir.FhirPackage#getVisionPrescriptionLensSpecification_Eye()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='eye' namespace='##targetNamespace'"
	 * @generated
	 */
	VisionEyes getEye();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VisionPrescriptionLensSpecification#getEye <em>Eye</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eye</em>' containment reference.
	 * @see #getEye()
	 * @generated
	 */
	void setEye(VisionEyes value);

	/**
	 * Returns the value of the '<em><b>Sphere</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lens power measured in dioptres (0.25 units).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sphere</em>' containment reference.
	 * @see #setSphere(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getVisionPrescriptionLensSpecification_Sphere()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sphere' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getSphere();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VisionPrescriptionLensSpecification#getSphere <em>Sphere</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sphere</em>' containment reference.
	 * @see #getSphere()
	 * @generated
	 */
	void setSphere(Decimal value);

	/**
	 * Returns the value of the '<em><b>Cylinder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Power adjustment for astigmatism measured in dioptres (0.25 units).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cylinder</em>' containment reference.
	 * @see #setCylinder(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getVisionPrescriptionLensSpecification_Cylinder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cylinder' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getCylinder();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VisionPrescriptionLensSpecification#getCylinder <em>Cylinder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cylinder</em>' containment reference.
	 * @see #getCylinder()
	 * @generated
	 */
	void setCylinder(Decimal value);

	/**
	 * Returns the value of the '<em><b>Axis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adjustment for astigmatism measured in integer degrees.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Axis</em>' containment reference.
	 * @see #setAxis(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getVisionPrescriptionLensSpecification_Axis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='axis' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getAxis();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VisionPrescriptionLensSpecification#getAxis <em>Axis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis</em>' containment reference.
	 * @see #getAxis()
	 * @generated
	 */
	void setAxis(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Prism</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.VisionPrescriptionPrism}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allows for adjustment on two axis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prism</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getVisionPrescriptionLensSpecification_Prism()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='prism' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VisionPrescriptionPrism> getPrism();

	/**
	 * Returns the value of the '<em><b>Add</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Power adjustment for multifocal lenses measured in dioptres (0.25 units).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Add</em>' containment reference.
	 * @see #setAdd(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getVisionPrescriptionLensSpecification_Add()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='add' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getAdd();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VisionPrescriptionLensSpecification#getAdd <em>Add</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add</em>' containment reference.
	 * @see #getAdd()
	 * @generated
	 */
	void setAdd(Decimal value);

	/**
	 * Returns the value of the '<em><b>Power</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contact lens power measured in dioptres (0.25 units).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Power</em>' containment reference.
	 * @see #setPower(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getVisionPrescriptionLensSpecification_Power()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='power' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getPower();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VisionPrescriptionLensSpecification#getPower <em>Power</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power</em>' containment reference.
	 * @see #getPower()
	 * @generated
	 */
	void setPower(Decimal value);

	/**
	 * Returns the value of the '<em><b>Back Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Back curvature measured in millimetres.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Back Curve</em>' containment reference.
	 * @see #setBackCurve(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getVisionPrescriptionLensSpecification_BackCurve()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='backCurve' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getBackCurve();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VisionPrescriptionLensSpecification#getBackCurve <em>Back Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Back Curve</em>' containment reference.
	 * @see #getBackCurve()
	 * @generated
	 */
	void setBackCurve(Decimal value);

	/**
	 * Returns the value of the '<em><b>Diameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contact lens diameter measured in millimetres.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diameter</em>' containment reference.
	 * @see #setDiameter(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getVisionPrescriptionLensSpecification_Diameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='diameter' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getDiameter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VisionPrescriptionLensSpecification#getDiameter <em>Diameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diameter</em>' containment reference.
	 * @see #getDiameter()
	 * @generated
	 */
	void setDiameter(Decimal value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The recommended maximum wear period for the lens.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration</em>' containment reference.
	 * @see #setDuration(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getVisionPrescriptionLensSpecification_Duration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='duration' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getDuration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VisionPrescriptionLensSpecification#getDuration <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' containment reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Quantity value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Special color or pattern.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Color</em>' containment reference.
	 * @see #setColor(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getVisionPrescriptionLensSpecification_Color()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='color' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getColor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VisionPrescriptionLensSpecification#getColor <em>Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' containment reference.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Brand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Brand recommendations or restrictions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Brand</em>' containment reference.
	 * @see #setBrand(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getVisionPrescriptionLensSpecification_Brand()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='brand' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getBrand();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VisionPrescriptionLensSpecification#getBrand <em>Brand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brand</em>' containment reference.
	 * @see #getBrand()
	 * @generated
	 */
	void setBrand(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Notes for special requirements such as coatings and lens materials.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getVisionPrescriptionLensSpecification_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

} // VisionPrescriptionLensSpecification
