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
import org.hl7.fhir.SubstanceSourceMaterialOrganismGeneral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Source Material Organism General</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSourceMaterialOrganismGeneralImpl#getKingdom <em>Kingdom</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSourceMaterialOrganismGeneralImpl#getPhylum <em>Phylum</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSourceMaterialOrganismGeneralImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSourceMaterialOrganismGeneralImpl#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceSourceMaterialOrganismGeneralImpl extends BackboneElementImpl implements SubstanceSourceMaterialOrganismGeneral {
	/**
	 * The cached value of the '{@link #getKingdom() <em>Kingdom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKingdom()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept kingdom;

	/**
	 * The cached value of the '{@link #getPhylum() <em>Phylum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhylum()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept phylum;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept class_;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept order;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceSourceMaterialOrganismGeneralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubstanceSourceMaterialOrganismGeneral();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getKingdom() {
		return kingdom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKingdom(CodeableConcept newKingdom, NotificationChain msgs) {
		CodeableConcept oldKingdom = kingdom;
		kingdom = newKingdom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_GENERAL__KINGDOM, oldKingdom, newKingdom);
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
	public void setKingdom(CodeableConcept newKingdom) {
		if (newKingdom != kingdom) {
			NotificationChain msgs = null;
			if (kingdom != null)
				msgs = ((InternalEObject)kingdom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_GENERAL__KINGDOM, null, msgs);
			if (newKingdom != null)
				msgs = ((InternalEObject)newKingdom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_GENERAL__KINGDOM, null, msgs);
			msgs = basicSetKingdom(newKingdom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_GENERAL__KINGDOM, newKingdom, newKingdom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getPhylum() {
		return phylum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhylum(CodeableConcept newPhylum, NotificationChain msgs) {
		CodeableConcept oldPhylum = phylum;
		phylum = newPhylum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_GENERAL__PHYLUM, oldPhylum, newPhylum);
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
	public void setPhylum(CodeableConcept newPhylum) {
		if (newPhylum != phylum) {
			NotificationChain msgs = null;
			if (phylum != null)
				msgs = ((InternalEObject)phylum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_GENERAL__PHYLUM, null, msgs);
			if (newPhylum != null)
				msgs = ((InternalEObject)newPhylum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_GENERAL__PHYLUM, null, msgs);
			msgs = basicSetPhylum(newPhylum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_GENERAL__PHYLUM, newPhylum, newPhylum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClass(CodeableConcept newClass, NotificationChain msgs) {
		CodeableConcept oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_GENERAL__CLASS, oldClass, newClass);
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
	public void setClass(CodeableConcept newClass) {
		if (newClass != class_) {
			NotificationChain msgs = null;
			if (class_ != null)
				msgs = ((InternalEObject)class_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_GENERAL__CLASS, null, msgs);
			if (newClass != null)
				msgs = ((InternalEObject)newClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_GENERAL__CLASS, null, msgs);
			msgs = basicSetClass(newClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_GENERAL__CLASS, newClass, newClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrder(CodeableConcept newOrder, NotificationChain msgs) {
		CodeableConcept oldOrder = order;
		order = newOrder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_GENERAL__ORDER, oldOrder, newOrder);
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
	public void setOrder(CodeableConcept newOrder) {
		if (newOrder != order) {
			NotificationChain msgs = null;
			if (order != null)
				msgs = ((InternalEObject)order).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_GENERAL__ORDER, null, msgs);
			if (newOrder != null)
				msgs = ((InternalEObject)newOrder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_GENERAL__ORDER, null, msgs);
			msgs = basicSetOrder(newOrder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_GENERAL__ORDER, newOrder, newOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_GENERAL__KINGDOM:
				return basicSetKingdom(null, msgs);
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_GENERAL__PHYLUM:
				return basicSetPhylum(null, msgs);
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_GENERAL__CLASS:
				return basicSetClass(null, msgs);
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_GENERAL__ORDER:
				return basicSetOrder(null, msgs);
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
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_GENERAL__KINGDOM:
				return getKingdom();
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_GENERAL__PHYLUM:
				return getPhylum();
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_GENERAL__CLASS:
				return getClass_();
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_GENERAL__ORDER:
				return getOrder();
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
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_GENERAL__KINGDOM:
				setKingdom((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_GENERAL__PHYLUM:
				setPhylum((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_GENERAL__CLASS:
				setClass((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_GENERAL__ORDER:
				setOrder((CodeableConcept)newValue);
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
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_GENERAL__KINGDOM:
				setKingdom((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_GENERAL__PHYLUM:
				setPhylum((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_GENERAL__CLASS:
				setClass((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_GENERAL__ORDER:
				setOrder((CodeableConcept)null);
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
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_GENERAL__KINGDOM:
				return kingdom != null;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_GENERAL__PHYLUM:
				return phylum != null;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_GENERAL__CLASS:
				return class_ != null;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_GENERAL__ORDER:
				return order != null;
		}
		return super.eIsSet(featureID);
	}

} //SubstanceSourceMaterialOrganismGeneralImpl
