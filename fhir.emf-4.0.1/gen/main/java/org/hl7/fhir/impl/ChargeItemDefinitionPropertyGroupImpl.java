/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.ChargeItemDefinitionApplicability;
import org.hl7.fhir.ChargeItemDefinitionPriceComponent;
import org.hl7.fhir.ChargeItemDefinitionPropertyGroup;
import org.hl7.fhir.FhirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Charge Item Definition Property Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ChargeItemDefinitionPropertyGroupImpl#getApplicability <em>Applicability</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ChargeItemDefinitionPropertyGroupImpl#getPriceComponent <em>Price Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChargeItemDefinitionPropertyGroupImpl extends BackboneElementImpl implements ChargeItemDefinitionPropertyGroup {
	/**
	 * The cached value of the '{@link #getApplicability() <em>Applicability</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicability()
	 * @generated
	 * @ordered
	 */
	protected EList<ChargeItemDefinitionApplicability> applicability;

	/**
	 * The cached value of the '{@link #getPriceComponent() <em>Price Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriceComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<ChargeItemDefinitionPriceComponent> priceComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChargeItemDefinitionPropertyGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getChargeItemDefinitionPropertyGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChargeItemDefinitionApplicability> getApplicability() {
		if (applicability == null) {
			applicability = new EObjectContainmentEList<ChargeItemDefinitionApplicability>(ChargeItemDefinitionApplicability.class, this, FhirPackage.CHARGE_ITEM_DEFINITION_PROPERTY_GROUP__APPLICABILITY);
		}
		return applicability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChargeItemDefinitionPriceComponent> getPriceComponent() {
		if (priceComponent == null) {
			priceComponent = new EObjectContainmentEList<ChargeItemDefinitionPriceComponent>(ChargeItemDefinitionPriceComponent.class, this, FhirPackage.CHARGE_ITEM_DEFINITION_PROPERTY_GROUP__PRICE_COMPONENT);
		}
		return priceComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CHARGE_ITEM_DEFINITION_PROPERTY_GROUP__APPLICABILITY:
				return ((InternalEList<?>)getApplicability()).basicRemove(otherEnd, msgs);
			case FhirPackage.CHARGE_ITEM_DEFINITION_PROPERTY_GROUP__PRICE_COMPONENT:
				return ((InternalEList<?>)getPriceComponent()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CHARGE_ITEM_DEFINITION_PROPERTY_GROUP__APPLICABILITY:
				return getApplicability();
			case FhirPackage.CHARGE_ITEM_DEFINITION_PROPERTY_GROUP__PRICE_COMPONENT:
				return getPriceComponent();
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
			case FhirPackage.CHARGE_ITEM_DEFINITION_PROPERTY_GROUP__APPLICABILITY:
				getApplicability().clear();
				getApplicability().addAll((Collection<? extends ChargeItemDefinitionApplicability>)newValue);
				return;
			case FhirPackage.CHARGE_ITEM_DEFINITION_PROPERTY_GROUP__PRICE_COMPONENT:
				getPriceComponent().clear();
				getPriceComponent().addAll((Collection<? extends ChargeItemDefinitionPriceComponent>)newValue);
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
			case FhirPackage.CHARGE_ITEM_DEFINITION_PROPERTY_GROUP__APPLICABILITY:
				getApplicability().clear();
				return;
			case FhirPackage.CHARGE_ITEM_DEFINITION_PROPERTY_GROUP__PRICE_COMPONENT:
				getPriceComponent().clear();
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
			case FhirPackage.CHARGE_ITEM_DEFINITION_PROPERTY_GROUP__APPLICABILITY:
				return applicability != null && !applicability.isEmpty();
			case FhirPackage.CHARGE_ITEM_DEFINITION_PROPERTY_GROUP__PRICE_COMPONENT:
				return priceComponent != null && !priceComponent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ChargeItemDefinitionPropertyGroupImpl
