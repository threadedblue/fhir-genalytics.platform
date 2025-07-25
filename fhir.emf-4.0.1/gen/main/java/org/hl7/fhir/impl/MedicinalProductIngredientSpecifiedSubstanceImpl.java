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

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.MedicinalProductIngredientSpecifiedSubstance;
import org.hl7.fhir.MedicinalProductIngredientStrength;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicinal Product Ingredient Specified Substance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductIngredientSpecifiedSubstanceImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductIngredientSpecifiedSubstanceImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductIngredientSpecifiedSubstanceImpl#getConfidentiality <em>Confidentiality</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductIngredientSpecifiedSubstanceImpl#getStrength <em>Strength</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductIngredientSpecifiedSubstanceImpl extends BackboneElementImpl implements MedicinalProductIngredientSpecifiedSubstance {
	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept group;

	/**
	 * The cached value of the '{@link #getConfidentiality() <em>Confidentiality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentiality()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept confidentiality;

	/**
	 * The cached value of the '{@link #getStrength() <em>Strength</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrength()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductIngredientStrength> strength;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductIngredientSpecifiedSubstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicinalProductIngredientSpecifiedSubstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CodeableConcept newCode, NotificationChain msgs) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE__CODE, oldCode, newCode);
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
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(CodeableConcept newGroup, NotificationChain msgs) {
		CodeableConcept oldGroup = group;
		group = newGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE__GROUP, oldGroup, newGroup);
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
	public void setGroup(CodeableConcept newGroup) {
		if (newGroup != group) {
			NotificationChain msgs = null;
			if (group != null)
				msgs = ((InternalEObject)group).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE__GROUP, null, msgs);
			if (newGroup != null)
				msgs = ((InternalEObject)newGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE__GROUP, null, msgs);
			msgs = basicSetGroup(newGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE__GROUP, newGroup, newGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getConfidentiality() {
		return confidentiality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfidentiality(CodeableConcept newConfidentiality, NotificationChain msgs) {
		CodeableConcept oldConfidentiality = confidentiality;
		confidentiality = newConfidentiality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE__CONFIDENTIALITY, oldConfidentiality, newConfidentiality);
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
	public void setConfidentiality(CodeableConcept newConfidentiality) {
		if (newConfidentiality != confidentiality) {
			NotificationChain msgs = null;
			if (confidentiality != null)
				msgs = ((InternalEObject)confidentiality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE__CONFIDENTIALITY, null, msgs);
			if (newConfidentiality != null)
				msgs = ((InternalEObject)newConfidentiality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE__CONFIDENTIALITY, null, msgs);
			msgs = basicSetConfidentiality(newConfidentiality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE__CONFIDENTIALITY, newConfidentiality, newConfidentiality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicinalProductIngredientStrength> getStrength() {
		if (strength == null) {
			strength = new EObjectContainmentEList<MedicinalProductIngredientStrength>(MedicinalProductIngredientStrength.class, this, FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE__STRENGTH);
		}
		return strength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE__GROUP:
				return basicSetGroup(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE__CONFIDENTIALITY:
				return basicSetConfidentiality(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE__STRENGTH:
				return ((InternalEList<?>)getStrength()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE__CODE:
				return getCode();
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE__GROUP:
				return getGroup();
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE__CONFIDENTIALITY:
				return getConfidentiality();
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE__STRENGTH:
				return getStrength();
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
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE__GROUP:
				setGroup((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE__CONFIDENTIALITY:
				setConfidentiality((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE__STRENGTH:
				getStrength().clear();
				getStrength().addAll((Collection<? extends MedicinalProductIngredientStrength>)newValue);
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
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE__GROUP:
				setGroup((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE__CONFIDENTIALITY:
				setConfidentiality((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE__STRENGTH:
				getStrength().clear();
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
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE__CODE:
				return code != null;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE__GROUP:
				return group != null;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE__CONFIDENTIALITY:
				return confidentiality != null;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE__STRENGTH:
				return strength != null && !strength.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductIngredientSpecifiedSubstanceImpl
