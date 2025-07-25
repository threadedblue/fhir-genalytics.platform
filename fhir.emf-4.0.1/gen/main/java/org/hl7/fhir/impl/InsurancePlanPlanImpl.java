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
import org.hl7.fhir.InsurancePlanGeneralCost;
import org.hl7.fhir.InsurancePlanPlan;
import org.hl7.fhir.InsurancePlanSpecificCost;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Insurance Plan Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.InsurancePlanPlanImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InsurancePlanPlanImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InsurancePlanPlanImpl#getCoverageArea <em>Coverage Area</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InsurancePlanPlanImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InsurancePlanPlanImpl#getGeneralCost <em>General Cost</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.InsurancePlanPlanImpl#getSpecificCost <em>Specific Cost</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InsurancePlanPlanImpl extends BackboneElementImpl implements InsurancePlanPlan {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getCoverageArea() <em>Coverage Area</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverageArea()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> coverageArea;

	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> network;

	/**
	 * The cached value of the '{@link #getGeneralCost() <em>General Cost</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralCost()
	 * @generated
	 * @ordered
	 */
	protected EList<InsurancePlanGeneralCost> generalCost;

	/**
	 * The cached value of the '{@link #getSpecificCost() <em>Specific Cost</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificCost()
	 * @generated
	 * @ordered
	 */
	protected EList<InsurancePlanSpecificCost> specificCost;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InsurancePlanPlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getInsurancePlanPlan();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.INSURANCE_PLAN_PLAN__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INSURANCE_PLAN_PLAN__TYPE, oldType, newType);
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
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INSURANCE_PLAN_PLAN__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INSURANCE_PLAN_PLAN__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INSURANCE_PLAN_PLAN__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getCoverageArea() {
		if (coverageArea == null) {
			coverageArea = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.INSURANCE_PLAN_PLAN__COVERAGE_AREA);
		}
		return coverageArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getNetwork() {
		if (network == null) {
			network = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.INSURANCE_PLAN_PLAN__NETWORK);
		}
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InsurancePlanGeneralCost> getGeneralCost() {
		if (generalCost == null) {
			generalCost = new EObjectContainmentEList<InsurancePlanGeneralCost>(InsurancePlanGeneralCost.class, this, FhirPackage.INSURANCE_PLAN_PLAN__GENERAL_COST);
		}
		return generalCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InsurancePlanSpecificCost> getSpecificCost() {
		if (specificCost == null) {
			specificCost = new EObjectContainmentEList<InsurancePlanSpecificCost>(InsurancePlanSpecificCost.class, this, FhirPackage.INSURANCE_PLAN_PLAN__SPECIFIC_COST);
		}
		return specificCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.INSURANCE_PLAN_PLAN__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.INSURANCE_PLAN_PLAN__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.INSURANCE_PLAN_PLAN__COVERAGE_AREA:
				return ((InternalEList<?>)getCoverageArea()).basicRemove(otherEnd, msgs);
			case FhirPackage.INSURANCE_PLAN_PLAN__NETWORK:
				return ((InternalEList<?>)getNetwork()).basicRemove(otherEnd, msgs);
			case FhirPackage.INSURANCE_PLAN_PLAN__GENERAL_COST:
				return ((InternalEList<?>)getGeneralCost()).basicRemove(otherEnd, msgs);
			case FhirPackage.INSURANCE_PLAN_PLAN__SPECIFIC_COST:
				return ((InternalEList<?>)getSpecificCost()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.INSURANCE_PLAN_PLAN__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.INSURANCE_PLAN_PLAN__TYPE:
				return getType();
			case FhirPackage.INSURANCE_PLAN_PLAN__COVERAGE_AREA:
				return getCoverageArea();
			case FhirPackage.INSURANCE_PLAN_PLAN__NETWORK:
				return getNetwork();
			case FhirPackage.INSURANCE_PLAN_PLAN__GENERAL_COST:
				return getGeneralCost();
			case FhirPackage.INSURANCE_PLAN_PLAN__SPECIFIC_COST:
				return getSpecificCost();
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
			case FhirPackage.INSURANCE_PLAN_PLAN__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.INSURANCE_PLAN_PLAN__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.INSURANCE_PLAN_PLAN__COVERAGE_AREA:
				getCoverageArea().clear();
				getCoverageArea().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.INSURANCE_PLAN_PLAN__NETWORK:
				getNetwork().clear();
				getNetwork().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.INSURANCE_PLAN_PLAN__GENERAL_COST:
				getGeneralCost().clear();
				getGeneralCost().addAll((Collection<? extends InsurancePlanGeneralCost>)newValue);
				return;
			case FhirPackage.INSURANCE_PLAN_PLAN__SPECIFIC_COST:
				getSpecificCost().clear();
				getSpecificCost().addAll((Collection<? extends InsurancePlanSpecificCost>)newValue);
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
			case FhirPackage.INSURANCE_PLAN_PLAN__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.INSURANCE_PLAN_PLAN__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.INSURANCE_PLAN_PLAN__COVERAGE_AREA:
				getCoverageArea().clear();
				return;
			case FhirPackage.INSURANCE_PLAN_PLAN__NETWORK:
				getNetwork().clear();
				return;
			case FhirPackage.INSURANCE_PLAN_PLAN__GENERAL_COST:
				getGeneralCost().clear();
				return;
			case FhirPackage.INSURANCE_PLAN_PLAN__SPECIFIC_COST:
				getSpecificCost().clear();
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
			case FhirPackage.INSURANCE_PLAN_PLAN__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.INSURANCE_PLAN_PLAN__TYPE:
				return type != null;
			case FhirPackage.INSURANCE_PLAN_PLAN__COVERAGE_AREA:
				return coverageArea != null && !coverageArea.isEmpty();
			case FhirPackage.INSURANCE_PLAN_PLAN__NETWORK:
				return network != null && !network.isEmpty();
			case FhirPackage.INSURANCE_PLAN_PLAN__GENERAL_COST:
				return generalCost != null && !generalCost.isEmpty();
			case FhirPackage.INSURANCE_PLAN_PLAN__SPECIFIC_COST:
				return specificCost != null && !specificCost.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InsurancePlanPlanImpl
