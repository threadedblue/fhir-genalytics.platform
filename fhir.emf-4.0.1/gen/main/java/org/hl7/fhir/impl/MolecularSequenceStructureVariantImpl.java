/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.MolecularSequenceInner;
import org.hl7.fhir.MolecularSequenceOuter;
import org.hl7.fhir.MolecularSequenceStructureVariant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Molecular Sequence Structure Variant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceStructureVariantImpl#getVariantType <em>Variant Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceStructureVariantImpl#getExact <em>Exact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceStructureVariantImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceStructureVariantImpl#getOuter <em>Outer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceStructureVariantImpl#getInner <em>Inner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MolecularSequenceStructureVariantImpl extends BackboneElementImpl implements MolecularSequenceStructureVariant {
	/**
	 * The cached value of the '{@link #getVariantType() <em>Variant Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariantType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept variantType;

	/**
	 * The cached value of the '{@link #getExact() <em>Exact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExact()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean exact;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer length;

	/**
	 * The cached value of the '{@link #getOuter() <em>Outer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuter()
	 * @generated
	 * @ordered
	 */
	protected MolecularSequenceOuter outer;

	/**
	 * The cached value of the '{@link #getInner() <em>Inner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInner()
	 * @generated
	 * @ordered
	 */
	protected MolecularSequenceInner inner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MolecularSequenceStructureVariantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMolecularSequenceStructureVariant();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getVariantType() {
		return variantType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariantType(CodeableConcept newVariantType, NotificationChain msgs) {
		CodeableConcept oldVariantType = variantType;
		variantType = newVariantType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__VARIANT_TYPE, oldVariantType, newVariantType);
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
	public void setVariantType(CodeableConcept newVariantType) {
		if (newVariantType != variantType) {
			NotificationChain msgs = null;
			if (variantType != null)
				msgs = ((InternalEObject)variantType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__VARIANT_TYPE, null, msgs);
			if (newVariantType != null)
				msgs = ((InternalEObject)newVariantType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__VARIANT_TYPE, null, msgs);
			msgs = basicSetVariantType(newVariantType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__VARIANT_TYPE, newVariantType, newVariantType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getExact() {
		return exact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExact(org.hl7.fhir.Boolean newExact, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldExact = exact;
		exact = newExact;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__EXACT, oldExact, newExact);
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
	public void setExact(org.hl7.fhir.Boolean newExact) {
		if (newExact != exact) {
			NotificationChain msgs = null;
			if (exact != null)
				msgs = ((InternalEObject)exact).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__EXACT, null, msgs);
			if (newExact != null)
				msgs = ((InternalEObject)newExact).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__EXACT, null, msgs);
			msgs = basicSetExact(newExact, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__EXACT, newExact, newExact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Integer getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLength(org.hl7.fhir.Integer newLength, NotificationChain msgs) {
		org.hl7.fhir.Integer oldLength = length;
		length = newLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__LENGTH, oldLength, newLength);
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
	public void setLength(org.hl7.fhir.Integer newLength) {
		if (newLength != length) {
			NotificationChain msgs = null;
			if (length != null)
				msgs = ((InternalEObject)length).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__LENGTH, null, msgs);
			if (newLength != null)
				msgs = ((InternalEObject)newLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__LENGTH, null, msgs);
			msgs = basicSetLength(newLength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__LENGTH, newLength, newLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MolecularSequenceOuter getOuter() {
		return outer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOuter(MolecularSequenceOuter newOuter, NotificationChain msgs) {
		MolecularSequenceOuter oldOuter = outer;
		outer = newOuter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__OUTER, oldOuter, newOuter);
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
	public void setOuter(MolecularSequenceOuter newOuter) {
		if (newOuter != outer) {
			NotificationChain msgs = null;
			if (outer != null)
				msgs = ((InternalEObject)outer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__OUTER, null, msgs);
			if (newOuter != null)
				msgs = ((InternalEObject)newOuter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__OUTER, null, msgs);
			msgs = basicSetOuter(newOuter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__OUTER, newOuter, newOuter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MolecularSequenceInner getInner() {
		return inner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInner(MolecularSequenceInner newInner, NotificationChain msgs) {
		MolecularSequenceInner oldInner = inner;
		inner = newInner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__INNER, oldInner, newInner);
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
	public void setInner(MolecularSequenceInner newInner) {
		if (newInner != inner) {
			NotificationChain msgs = null;
			if (inner != null)
				msgs = ((InternalEObject)inner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__INNER, null, msgs);
			if (newInner != null)
				msgs = ((InternalEObject)newInner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__INNER, null, msgs);
			msgs = basicSetInner(newInner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__INNER, newInner, newInner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__VARIANT_TYPE:
				return basicSetVariantType(null, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__EXACT:
				return basicSetExact(null, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__LENGTH:
				return basicSetLength(null, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__OUTER:
				return basicSetOuter(null, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__INNER:
				return basicSetInner(null, msgs);
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
			case FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__VARIANT_TYPE:
				return getVariantType();
			case FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__EXACT:
				return getExact();
			case FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__LENGTH:
				return getLength();
			case FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__OUTER:
				return getOuter();
			case FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__INNER:
				return getInner();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__VARIANT_TYPE:
				setVariantType((CodeableConcept)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__EXACT:
				setExact((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__LENGTH:
				setLength((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__OUTER:
				setOuter((MolecularSequenceOuter)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__INNER:
				setInner((MolecularSequenceInner)newValue);
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
			case FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__VARIANT_TYPE:
				setVariantType((CodeableConcept)null);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__EXACT:
				setExact((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__LENGTH:
				setLength((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__OUTER:
				setOuter((MolecularSequenceOuter)null);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__INNER:
				setInner((MolecularSequenceInner)null);
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
			case FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__VARIANT_TYPE:
				return variantType != null;
			case FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__EXACT:
				return exact != null;
			case FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__LENGTH:
				return length != null;
			case FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__OUTER:
				return outer != null;
			case FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT__INNER:
				return inner != null;
		}
		return super.eIsSet(featureID);
	}

} //MolecularSequenceStructureVariantImpl
