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
import org.hl7.fhir.Identifier;
import org.hl7.fhir.MedicinalProductIngredient;
import org.hl7.fhir.MedicinalProductIngredientSpecifiedSubstance;
import org.hl7.fhir.MedicinalProductIngredientSubstance;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicinal Product Ingredient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductIngredientImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductIngredientImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductIngredientImpl#getAllergenicIndicator <em>Allergenic Indicator</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductIngredientImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductIngredientImpl#getSpecifiedSubstance <em>Specified Substance</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductIngredientImpl#getSubstance <em>Substance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductIngredientImpl extends DomainResourceImpl implements MedicinalProductIngredient {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept role;

	/**
	 * The cached value of the '{@link #getAllergenicIndicator() <em>Allergenic Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergenicIndicator()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean allergenicIndicator;

	/**
	 * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> manufacturer;

	/**
	 * The cached value of the '{@link #getSpecifiedSubstance() <em>Specified Substance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecifiedSubstance()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductIngredientSpecifiedSubstance> specifiedSubstance;

	/**
	 * The cached value of the '{@link #getSubstance() <em>Substance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstance()
	 * @generated
	 * @ordered
	 */
	protected MedicinalProductIngredientSubstance substance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductIngredientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicinalProductIngredient();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__IDENTIFIER, oldIdentifier, newIdentifier);
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
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(CodeableConcept newRole, NotificationChain msgs) {
		CodeableConcept oldRole = role;
		role = newRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__ROLE, oldRole, newRole);
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
	public void setRole(CodeableConcept newRole) {
		if (newRole != role) {
			NotificationChain msgs = null;
			if (role != null)
				msgs = ((InternalEObject)role).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__ROLE, null, msgs);
			if (newRole != null)
				msgs = ((InternalEObject)newRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__ROLE, null, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__ROLE, newRole, newRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getAllergenicIndicator() {
		return allergenicIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllergenicIndicator(org.hl7.fhir.Boolean newAllergenicIndicator, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldAllergenicIndicator = allergenicIndicator;
		allergenicIndicator = newAllergenicIndicator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__ALLERGENIC_INDICATOR, oldAllergenicIndicator, newAllergenicIndicator);
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
	public void setAllergenicIndicator(org.hl7.fhir.Boolean newAllergenicIndicator) {
		if (newAllergenicIndicator != allergenicIndicator) {
			NotificationChain msgs = null;
			if (allergenicIndicator != null)
				msgs = ((InternalEObject)allergenicIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__ALLERGENIC_INDICATOR, null, msgs);
			if (newAllergenicIndicator != null)
				msgs = ((InternalEObject)newAllergenicIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__ALLERGENIC_INDICATOR, null, msgs);
			msgs = basicSetAllergenicIndicator(newAllergenicIndicator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__ALLERGENIC_INDICATOR, newAllergenicIndicator, newAllergenicIndicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getManufacturer() {
		if (manufacturer == null) {
			manufacturer = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__MANUFACTURER);
		}
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicinalProductIngredientSpecifiedSubstance> getSpecifiedSubstance() {
		if (specifiedSubstance == null) {
			specifiedSubstance = new EObjectContainmentEList<MedicinalProductIngredientSpecifiedSubstance>(MedicinalProductIngredientSpecifiedSubstance.class, this, FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__SPECIFIED_SUBSTANCE);
		}
		return specifiedSubstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductIngredientSubstance getSubstance() {
		return substance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstance(MedicinalProductIngredientSubstance newSubstance, NotificationChain msgs) {
		MedicinalProductIngredientSubstance oldSubstance = substance;
		substance = newSubstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__SUBSTANCE, oldSubstance, newSubstance);
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
	public void setSubstance(MedicinalProductIngredientSubstance newSubstance) {
		if (newSubstance != substance) {
			NotificationChain msgs = null;
			if (substance != null)
				msgs = ((InternalEObject)substance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__SUBSTANCE, null, msgs);
			if (newSubstance != null)
				msgs = ((InternalEObject)newSubstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__SUBSTANCE, null, msgs);
			msgs = basicSetSubstance(newSubstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__SUBSTANCE, newSubstance, newSubstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__ROLE:
				return basicSetRole(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__ALLERGENIC_INDICATOR:
				return basicSetAllergenicIndicator(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__MANUFACTURER:
				return ((InternalEList<?>)getManufacturer()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__SPECIFIED_SUBSTANCE:
				return ((InternalEList<?>)getSpecifiedSubstance()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__SUBSTANCE:
				return basicSetSubstance(null, msgs);
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
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__ROLE:
				return getRole();
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__ALLERGENIC_INDICATOR:
				return getAllergenicIndicator();
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__MANUFACTURER:
				return getManufacturer();
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__SPECIFIED_SUBSTANCE:
				return getSpecifiedSubstance();
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__SUBSTANCE:
				return getSubstance();
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
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__ROLE:
				setRole((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__ALLERGENIC_INDICATOR:
				setAllergenicIndicator((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__MANUFACTURER:
				getManufacturer().clear();
				getManufacturer().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__SPECIFIED_SUBSTANCE:
				getSpecifiedSubstance().clear();
				getSpecifiedSubstance().addAll((Collection<? extends MedicinalProductIngredientSpecifiedSubstance>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__SUBSTANCE:
				setSubstance((MedicinalProductIngredientSubstance)newValue);
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
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__ROLE:
				setRole((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__ALLERGENIC_INDICATOR:
				setAllergenicIndicator((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__MANUFACTURER:
				getManufacturer().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__SPECIFIED_SUBSTANCE:
				getSpecifiedSubstance().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__SUBSTANCE:
				setSubstance((MedicinalProductIngredientSubstance)null);
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
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__IDENTIFIER:
				return identifier != null;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__ROLE:
				return role != null;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__ALLERGENIC_INDICATOR:
				return allergenicIndicator != null;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__MANUFACTURER:
				return manufacturer != null && !manufacturer.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__SPECIFIED_SUBSTANCE:
				return specifiedSubstance != null && !specifiedSubstance.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT__SUBSTANCE:
				return substance != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductIngredientImpl
