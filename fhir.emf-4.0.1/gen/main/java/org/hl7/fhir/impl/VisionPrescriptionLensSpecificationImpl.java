/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.Annotation;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.VisionEyes;
import org.hl7.fhir.VisionPrescriptionLensSpecification;
import org.hl7.fhir.VisionPrescriptionPrism;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vision Prescription Lens Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.VisionPrescriptionLensSpecificationImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VisionPrescriptionLensSpecificationImpl#getEye <em>Eye</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VisionPrescriptionLensSpecificationImpl#getSphere <em>Sphere</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VisionPrescriptionLensSpecificationImpl#getCylinder <em>Cylinder</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VisionPrescriptionLensSpecificationImpl#getAxis <em>Axis</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VisionPrescriptionLensSpecificationImpl#getPrism <em>Prism</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VisionPrescriptionLensSpecificationImpl#getAdd <em>Add</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VisionPrescriptionLensSpecificationImpl#getPower <em>Power</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VisionPrescriptionLensSpecificationImpl#getBackCurve <em>Back Curve</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VisionPrescriptionLensSpecificationImpl#getDiameter <em>Diameter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VisionPrescriptionLensSpecificationImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VisionPrescriptionLensSpecificationImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VisionPrescriptionLensSpecificationImpl#getBrand <em>Brand</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VisionPrescriptionLensSpecificationImpl#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VisionPrescriptionLensSpecificationImpl extends BackboneElementImpl implements VisionPrescriptionLensSpecification {
	/**
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept product;

	/**
	 * The cached value of the '{@link #getEye() <em>Eye</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEye()
	 * @generated
	 * @ordered
	 */
	protected VisionEyes eye;

	/**
	 * The cached value of the '{@link #getSphere() <em>Sphere</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSphere()
	 * @generated
	 * @ordered
	 */
	protected Decimal sphere;

	/**
	 * The cached value of the '{@link #getCylinder() <em>Cylinder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCylinder()
	 * @generated
	 * @ordered
	 */
	protected Decimal cylinder;

	/**
	 * The cached value of the '{@link #getAxis() <em>Axis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxis()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer axis;

	/**
	 * The cached value of the '{@link #getPrism() <em>Prism</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrism()
	 * @generated
	 * @ordered
	 */
	protected EList<VisionPrescriptionPrism> prism;

	/**
	 * The cached value of the '{@link #getAdd() <em>Add</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdd()
	 * @generated
	 * @ordered
	 */
	protected Decimal add;

	/**
	 * The cached value of the '{@link #getPower() <em>Power</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected Decimal power;

	/**
	 * The cached value of the '{@link #getBackCurve() <em>Back Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackCurve()
	 * @generated
	 * @ordered
	 */
	protected Decimal backCurve;

	/**
	 * The cached value of the '{@link #getDiameter() <em>Diameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiameter()
	 * @generated
	 * @ordered
	 */
	protected Decimal diameter;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected Quantity duration;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String color;

	/**
	 * The cached value of the '{@link #getBrand() <em>Brand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrand()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String brand;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> note;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisionPrescriptionLensSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getVisionPrescriptionLensSpecification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getProduct() {
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProduct(CodeableConcept newProduct, NotificationChain msgs) {
		CodeableConcept oldProduct = product;
		product = newProduct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__PRODUCT, oldProduct, newProduct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProduct(CodeableConcept newProduct) {
		if (newProduct != product) {
			NotificationChain msgs = null;
			if (product != null)
				msgs = ((InternalEObject)product).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__PRODUCT, null, msgs);
			if (newProduct != null)
				msgs = ((InternalEObject)newProduct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__PRODUCT, null, msgs);
			msgs = basicSetProduct(newProduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__PRODUCT, newProduct, newProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VisionEyes getEye() {
		return eye;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEye(VisionEyes newEye, NotificationChain msgs) {
		VisionEyes oldEye = eye;
		eye = newEye;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__EYE, oldEye, newEye);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEye(VisionEyes newEye) {
		if (newEye != eye) {
			NotificationChain msgs = null;
			if (eye != null)
				msgs = ((InternalEObject)eye).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__EYE, null, msgs);
			if (newEye != null)
				msgs = ((InternalEObject)newEye).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__EYE, null, msgs);
			msgs = basicSetEye(newEye, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__EYE, newEye, newEye));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getSphere() {
		return sphere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSphere(Decimal newSphere, NotificationChain msgs) {
		Decimal oldSphere = sphere;
		sphere = newSphere;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__SPHERE, oldSphere, newSphere);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSphere(Decimal newSphere) {
		if (newSphere != sphere) {
			NotificationChain msgs = null;
			if (sphere != null)
				msgs = ((InternalEObject)sphere).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__SPHERE, null, msgs);
			if (newSphere != null)
				msgs = ((InternalEObject)newSphere).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__SPHERE, null, msgs);
			msgs = basicSetSphere(newSphere, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__SPHERE, newSphere, newSphere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getCylinder() {
		return cylinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCylinder(Decimal newCylinder, NotificationChain msgs) {
		Decimal oldCylinder = cylinder;
		cylinder = newCylinder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__CYLINDER, oldCylinder, newCylinder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCylinder(Decimal newCylinder) {
		if (newCylinder != cylinder) {
			NotificationChain msgs = null;
			if (cylinder != null)
				msgs = ((InternalEObject)cylinder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__CYLINDER, null, msgs);
			if (newCylinder != null)
				msgs = ((InternalEObject)newCylinder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__CYLINDER, null, msgs);
			msgs = basicSetCylinder(newCylinder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__CYLINDER, newCylinder, newCylinder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Integer getAxis() {
		return axis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAxis(org.hl7.fhir.Integer newAxis, NotificationChain msgs) {
		org.hl7.fhir.Integer oldAxis = axis;
		axis = newAxis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__AXIS, oldAxis, newAxis);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAxis(org.hl7.fhir.Integer newAxis) {
		if (newAxis != axis) {
			NotificationChain msgs = null;
			if (axis != null)
				msgs = ((InternalEObject)axis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__AXIS, null, msgs);
			if (newAxis != null)
				msgs = ((InternalEObject)newAxis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__AXIS, null, msgs);
			msgs = basicSetAxis(newAxis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__AXIS, newAxis, newAxis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VisionPrescriptionPrism> getPrism() {
		if (prism == null) {
			prism = new EObjectContainmentEList<VisionPrescriptionPrism>(VisionPrescriptionPrism.class, this, FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__PRISM);
		}
		return prism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getAdd() {
		return add;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdd(Decimal newAdd, NotificationChain msgs) {
		Decimal oldAdd = add;
		add = newAdd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__ADD, oldAdd, newAdd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdd(Decimal newAdd) {
		if (newAdd != add) {
			NotificationChain msgs = null;
			if (add != null)
				msgs = ((InternalEObject)add).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__ADD, null, msgs);
			if (newAdd != null)
				msgs = ((InternalEObject)newAdd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__ADD, null, msgs);
			msgs = basicSetAdd(newAdd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__ADD, newAdd, newAdd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getPower() {
		return power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPower(Decimal newPower, NotificationChain msgs) {
		Decimal oldPower = power;
		power = newPower;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__POWER, oldPower, newPower);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPower(Decimal newPower) {
		if (newPower != power) {
			NotificationChain msgs = null;
			if (power != null)
				msgs = ((InternalEObject)power).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__POWER, null, msgs);
			if (newPower != null)
				msgs = ((InternalEObject)newPower).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__POWER, null, msgs);
			msgs = basicSetPower(newPower, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__POWER, newPower, newPower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getBackCurve() {
		return backCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBackCurve(Decimal newBackCurve, NotificationChain msgs) {
		Decimal oldBackCurve = backCurve;
		backCurve = newBackCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__BACK_CURVE, oldBackCurve, newBackCurve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBackCurve(Decimal newBackCurve) {
		if (newBackCurve != backCurve) {
			NotificationChain msgs = null;
			if (backCurve != null)
				msgs = ((InternalEObject)backCurve).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__BACK_CURVE, null, msgs);
			if (newBackCurve != null)
				msgs = ((InternalEObject)newBackCurve).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__BACK_CURVE, null, msgs);
			msgs = basicSetBackCurve(newBackCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__BACK_CURVE, newBackCurve, newBackCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getDiameter() {
		return diameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiameter(Decimal newDiameter, NotificationChain msgs) {
		Decimal oldDiameter = diameter;
		diameter = newDiameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__DIAMETER, oldDiameter, newDiameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiameter(Decimal newDiameter) {
		if (newDiameter != diameter) {
			NotificationChain msgs = null;
			if (diameter != null)
				msgs = ((InternalEObject)diameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__DIAMETER, null, msgs);
			if (newDiameter != null)
				msgs = ((InternalEObject)newDiameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__DIAMETER, null, msgs);
			msgs = basicSetDiameter(newDiameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__DIAMETER, newDiameter, newDiameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDuration(Quantity newDuration, NotificationChain msgs) {
		Quantity oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__DURATION, oldDuration, newDuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(Quantity newDuration) {
		if (newDuration != duration) {
			NotificationChain msgs = null;
			if (duration != null)
				msgs = ((InternalEObject)duration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__DURATION, null, msgs);
			if (newDuration != null)
				msgs = ((InternalEObject)newDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__DURATION, null, msgs);
			msgs = basicSetDuration(newDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__DURATION, newDuration, newDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColor(org.hl7.fhir.String newColor, NotificationChain msgs) {
		org.hl7.fhir.String oldColor = color;
		color = newColor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__COLOR, oldColor, newColor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColor(org.hl7.fhir.String newColor) {
		if (newColor != color) {
			NotificationChain msgs = null;
			if (color != null)
				msgs = ((InternalEObject)color).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__COLOR, null, msgs);
			if (newColor != null)
				msgs = ((InternalEObject)newColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__COLOR, null, msgs);
			msgs = basicSetColor(newColor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__COLOR, newColor, newColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getBrand() {
		return brand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBrand(org.hl7.fhir.String newBrand, NotificationChain msgs) {
		org.hl7.fhir.String oldBrand = brand;
		brand = newBrand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__BRAND, oldBrand, newBrand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBrand(org.hl7.fhir.String newBrand) {
		if (newBrand != brand) {
			NotificationChain msgs = null;
			if (brand != null)
				msgs = ((InternalEObject)brand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__BRAND, null, msgs);
			if (newBrand != null)
				msgs = ((InternalEObject)newBrand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__BRAND, null, msgs);
			msgs = basicSetBrand(newBrand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__BRAND, newBrand, newBrand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__PRODUCT:
				return basicSetProduct(null, msgs);
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__EYE:
				return basicSetEye(null, msgs);
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__SPHERE:
				return basicSetSphere(null, msgs);
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__CYLINDER:
				return basicSetCylinder(null, msgs);
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__AXIS:
				return basicSetAxis(null, msgs);
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__PRISM:
				return ((InternalEList<?>)getPrism()).basicRemove(otherEnd, msgs);
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__ADD:
				return basicSetAdd(null, msgs);
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__POWER:
				return basicSetPower(null, msgs);
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__BACK_CURVE:
				return basicSetBackCurve(null, msgs);
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__DIAMETER:
				return basicSetDiameter(null, msgs);
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__DURATION:
				return basicSetDuration(null, msgs);
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__COLOR:
				return basicSetColor(null, msgs);
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__BRAND:
				return basicSetBrand(null, msgs);
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__PRODUCT:
				return getProduct();
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__EYE:
				return getEye();
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__SPHERE:
				return getSphere();
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__CYLINDER:
				return getCylinder();
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__AXIS:
				return getAxis();
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__PRISM:
				return getPrism();
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__ADD:
				return getAdd();
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__POWER:
				return getPower();
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__BACK_CURVE:
				return getBackCurve();
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__DIAMETER:
				return getDiameter();
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__DURATION:
				return getDuration();
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__COLOR:
				return getColor();
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__BRAND:
				return getBrand();
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__NOTE:
				return getNote();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__PRODUCT:
				setProduct((CodeableConcept)newValue);
				return;
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__EYE:
				setEye((VisionEyes)newValue);
				return;
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__SPHERE:
				setSphere((Decimal)newValue);
				return;
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__CYLINDER:
				setCylinder((Decimal)newValue);
				return;
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__AXIS:
				setAxis((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__PRISM:
				getPrism().clear();
				getPrism().addAll((Collection<? extends VisionPrescriptionPrism>)newValue);
				return;
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__ADD:
				setAdd((Decimal)newValue);
				return;
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__POWER:
				setPower((Decimal)newValue);
				return;
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__BACK_CURVE:
				setBackCurve((Decimal)newValue);
				return;
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__DIAMETER:
				setDiameter((Decimal)newValue);
				return;
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__DURATION:
				setDuration((Quantity)newValue);
				return;
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__COLOR:
				setColor((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__BRAND:
				setBrand((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__PRODUCT:
				setProduct((CodeableConcept)null);
				return;
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__EYE:
				setEye((VisionEyes)null);
				return;
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__SPHERE:
				setSphere((Decimal)null);
				return;
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__CYLINDER:
				setCylinder((Decimal)null);
				return;
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__AXIS:
				setAxis((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__PRISM:
				getPrism().clear();
				return;
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__ADD:
				setAdd((Decimal)null);
				return;
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__POWER:
				setPower((Decimal)null);
				return;
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__BACK_CURVE:
				setBackCurve((Decimal)null);
				return;
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__DIAMETER:
				setDiameter((Decimal)null);
				return;
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__DURATION:
				setDuration((Quantity)null);
				return;
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__COLOR:
				setColor((org.hl7.fhir.String)null);
				return;
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__BRAND:
				setBrand((org.hl7.fhir.String)null);
				return;
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__NOTE:
				getNote().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__PRODUCT:
				return product != null;
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__EYE:
				return eye != null;
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__SPHERE:
				return sphere != null;
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__CYLINDER:
				return cylinder != null;
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__AXIS:
				return axis != null;
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__PRISM:
				return prism != null && !prism.isEmpty();
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__ADD:
				return add != null;
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__POWER:
				return power != null;
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__BACK_CURVE:
				return backCurve != null;
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__DIAMETER:
				return diameter != null;
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__DURATION:
				return duration != null;
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__COLOR:
				return color != null;
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__BRAND:
				return brand != null;
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION__NOTE:
				return note != null && !note.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VisionPrescriptionLensSpecificationImpl
