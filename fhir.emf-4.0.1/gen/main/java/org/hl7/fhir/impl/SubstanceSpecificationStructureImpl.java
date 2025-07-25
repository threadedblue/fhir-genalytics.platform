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
import org.hl7.fhir.Reference;
import org.hl7.fhir.SubstanceSpecificationIsotope;
import org.hl7.fhir.SubstanceSpecificationMolecularWeight;
import org.hl7.fhir.SubstanceSpecificationRepresentation;
import org.hl7.fhir.SubstanceSpecificationStructure;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Specification Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationStructureImpl#getStereochemistry <em>Stereochemistry</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationStructureImpl#getOpticalActivity <em>Optical Activity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationStructureImpl#getMolecularFormula <em>Molecular Formula</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationStructureImpl#getMolecularFormulaByMoiety <em>Molecular Formula By Moiety</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationStructureImpl#getIsotope <em>Isotope</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationStructureImpl#getMolecularWeight <em>Molecular Weight</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationStructureImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationStructureImpl#getRepresentation <em>Representation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceSpecificationStructureImpl extends BackboneElementImpl implements SubstanceSpecificationStructure {
	/**
	 * The cached value of the '{@link #getStereochemistry() <em>Stereochemistry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStereochemistry()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept stereochemistry;

	/**
	 * The cached value of the '{@link #getOpticalActivity() <em>Optical Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpticalActivity()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept opticalActivity;

	/**
	 * The cached value of the '{@link #getMolecularFormula() <em>Molecular Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMolecularFormula()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String molecularFormula;

	/**
	 * The cached value of the '{@link #getMolecularFormulaByMoiety() <em>Molecular Formula By Moiety</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMolecularFormulaByMoiety()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String molecularFormulaByMoiety;

	/**
	 * The cached value of the '{@link #getIsotope() <em>Isotope</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsotope()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceSpecificationIsotope> isotope;

	/**
	 * The cached value of the '{@link #getMolecularWeight() <em>Molecular Weight</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMolecularWeight()
	 * @generated
	 * @ordered
	 */
	protected SubstanceSpecificationMolecularWeight molecularWeight;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> source;

	/**
	 * The cached value of the '{@link #getRepresentation() <em>Representation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentation()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceSpecificationRepresentation> representation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceSpecificationStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubstanceSpecificationStructure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getStereochemistry() {
		return stereochemistry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStereochemistry(CodeableConcept newStereochemistry, NotificationChain msgs) {
		CodeableConcept oldStereochemistry = stereochemistry;
		stereochemistry = newStereochemistry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__STEREOCHEMISTRY, oldStereochemistry, newStereochemistry);
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
	public void setStereochemistry(CodeableConcept newStereochemistry) {
		if (newStereochemistry != stereochemistry) {
			NotificationChain msgs = null;
			if (stereochemistry != null)
				msgs = ((InternalEObject)stereochemistry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__STEREOCHEMISTRY, null, msgs);
			if (newStereochemistry != null)
				msgs = ((InternalEObject)newStereochemistry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__STEREOCHEMISTRY, null, msgs);
			msgs = basicSetStereochemistry(newStereochemistry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__STEREOCHEMISTRY, newStereochemistry, newStereochemistry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getOpticalActivity() {
		return opticalActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpticalActivity(CodeableConcept newOpticalActivity, NotificationChain msgs) {
		CodeableConcept oldOpticalActivity = opticalActivity;
		opticalActivity = newOpticalActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__OPTICAL_ACTIVITY, oldOpticalActivity, newOpticalActivity);
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
	public void setOpticalActivity(CodeableConcept newOpticalActivity) {
		if (newOpticalActivity != opticalActivity) {
			NotificationChain msgs = null;
			if (opticalActivity != null)
				msgs = ((InternalEObject)opticalActivity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__OPTICAL_ACTIVITY, null, msgs);
			if (newOpticalActivity != null)
				msgs = ((InternalEObject)newOpticalActivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__OPTICAL_ACTIVITY, null, msgs);
			msgs = basicSetOpticalActivity(newOpticalActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__OPTICAL_ACTIVITY, newOpticalActivity, newOpticalActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getMolecularFormula() {
		return molecularFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMolecularFormula(org.hl7.fhir.String newMolecularFormula, NotificationChain msgs) {
		org.hl7.fhir.String oldMolecularFormula = molecularFormula;
		molecularFormula = newMolecularFormula;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__MOLECULAR_FORMULA, oldMolecularFormula, newMolecularFormula);
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
	public void setMolecularFormula(org.hl7.fhir.String newMolecularFormula) {
		if (newMolecularFormula != molecularFormula) {
			NotificationChain msgs = null;
			if (molecularFormula != null)
				msgs = ((InternalEObject)molecularFormula).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__MOLECULAR_FORMULA, null, msgs);
			if (newMolecularFormula != null)
				msgs = ((InternalEObject)newMolecularFormula).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__MOLECULAR_FORMULA, null, msgs);
			msgs = basicSetMolecularFormula(newMolecularFormula, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__MOLECULAR_FORMULA, newMolecularFormula, newMolecularFormula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getMolecularFormulaByMoiety() {
		return molecularFormulaByMoiety;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMolecularFormulaByMoiety(org.hl7.fhir.String newMolecularFormulaByMoiety, NotificationChain msgs) {
		org.hl7.fhir.String oldMolecularFormulaByMoiety = molecularFormulaByMoiety;
		molecularFormulaByMoiety = newMolecularFormulaByMoiety;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__MOLECULAR_FORMULA_BY_MOIETY, oldMolecularFormulaByMoiety, newMolecularFormulaByMoiety);
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
	public void setMolecularFormulaByMoiety(org.hl7.fhir.String newMolecularFormulaByMoiety) {
		if (newMolecularFormulaByMoiety != molecularFormulaByMoiety) {
			NotificationChain msgs = null;
			if (molecularFormulaByMoiety != null)
				msgs = ((InternalEObject)molecularFormulaByMoiety).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__MOLECULAR_FORMULA_BY_MOIETY, null, msgs);
			if (newMolecularFormulaByMoiety != null)
				msgs = ((InternalEObject)newMolecularFormulaByMoiety).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__MOLECULAR_FORMULA_BY_MOIETY, null, msgs);
			msgs = basicSetMolecularFormulaByMoiety(newMolecularFormulaByMoiety, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__MOLECULAR_FORMULA_BY_MOIETY, newMolecularFormulaByMoiety, newMolecularFormulaByMoiety));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstanceSpecificationIsotope> getIsotope() {
		if (isotope == null) {
			isotope = new EObjectContainmentEList<SubstanceSpecificationIsotope>(SubstanceSpecificationIsotope.class, this, FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__ISOTOPE);
		}
		return isotope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceSpecificationMolecularWeight getMolecularWeight() {
		return molecularWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMolecularWeight(SubstanceSpecificationMolecularWeight newMolecularWeight, NotificationChain msgs) {
		SubstanceSpecificationMolecularWeight oldMolecularWeight = molecularWeight;
		molecularWeight = newMolecularWeight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__MOLECULAR_WEIGHT, oldMolecularWeight, newMolecularWeight);
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
	public void setMolecularWeight(SubstanceSpecificationMolecularWeight newMolecularWeight) {
		if (newMolecularWeight != molecularWeight) {
			NotificationChain msgs = null;
			if (molecularWeight != null)
				msgs = ((InternalEObject)molecularWeight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__MOLECULAR_WEIGHT, null, msgs);
			if (newMolecularWeight != null)
				msgs = ((InternalEObject)newMolecularWeight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__MOLECULAR_WEIGHT, null, msgs);
			msgs = basicSetMolecularWeight(newMolecularWeight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__MOLECULAR_WEIGHT, newMolecularWeight, newMolecularWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSource() {
		if (source == null) {
			source = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstanceSpecificationRepresentation> getRepresentation() {
		if (representation == null) {
			representation = new EObjectContainmentEList<SubstanceSpecificationRepresentation>(SubstanceSpecificationRepresentation.class, this, FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__REPRESENTATION);
		}
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__STEREOCHEMISTRY:
				return basicSetStereochemistry(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__OPTICAL_ACTIVITY:
				return basicSetOpticalActivity(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__MOLECULAR_FORMULA:
				return basicSetMolecularFormula(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__MOLECULAR_FORMULA_BY_MOIETY:
				return basicSetMolecularFormulaByMoiety(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__ISOTOPE:
				return ((InternalEList<?>)getIsotope()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__MOLECULAR_WEIGHT:
				return basicSetMolecularWeight(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__REPRESENTATION:
				return ((InternalEList<?>)getRepresentation()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__STEREOCHEMISTRY:
				return getStereochemistry();
			case FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__OPTICAL_ACTIVITY:
				return getOpticalActivity();
			case FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__MOLECULAR_FORMULA:
				return getMolecularFormula();
			case FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__MOLECULAR_FORMULA_BY_MOIETY:
				return getMolecularFormulaByMoiety();
			case FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__ISOTOPE:
				return getIsotope();
			case FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__MOLECULAR_WEIGHT:
				return getMolecularWeight();
			case FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__SOURCE:
				return getSource();
			case FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__REPRESENTATION:
				return getRepresentation();
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
			case FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__STEREOCHEMISTRY:
				setStereochemistry((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__OPTICAL_ACTIVITY:
				setOpticalActivity((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__MOLECULAR_FORMULA:
				setMolecularFormula((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__MOLECULAR_FORMULA_BY_MOIETY:
				setMolecularFormulaByMoiety((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__ISOTOPE:
				getIsotope().clear();
				getIsotope().addAll((Collection<? extends SubstanceSpecificationIsotope>)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__MOLECULAR_WEIGHT:
				setMolecularWeight((SubstanceSpecificationMolecularWeight)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__REPRESENTATION:
				getRepresentation().clear();
				getRepresentation().addAll((Collection<? extends SubstanceSpecificationRepresentation>)newValue);
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
			case FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__STEREOCHEMISTRY:
				setStereochemistry((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__OPTICAL_ACTIVITY:
				setOpticalActivity((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__MOLECULAR_FORMULA:
				setMolecularFormula((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__MOLECULAR_FORMULA_BY_MOIETY:
				setMolecularFormulaByMoiety((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__ISOTOPE:
				getIsotope().clear();
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__MOLECULAR_WEIGHT:
				setMolecularWeight((SubstanceSpecificationMolecularWeight)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__SOURCE:
				getSource().clear();
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__REPRESENTATION:
				getRepresentation().clear();
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
			case FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__STEREOCHEMISTRY:
				return stereochemistry != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__OPTICAL_ACTIVITY:
				return opticalActivity != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__MOLECULAR_FORMULA:
				return molecularFormula != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__MOLECULAR_FORMULA_BY_MOIETY:
				return molecularFormulaByMoiety != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__ISOTOPE:
				return isotope != null && !isotope.isEmpty();
			case FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__MOLECULAR_WEIGHT:
				return molecularWeight != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__SOURCE:
				return source != null && !source.isEmpty();
			case FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE__REPRESENTATION:
				return representation != null && !representation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubstanceSpecificationStructureImpl
