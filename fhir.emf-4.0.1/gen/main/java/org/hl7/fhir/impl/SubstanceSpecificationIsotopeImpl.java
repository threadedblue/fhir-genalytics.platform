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
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.SubstanceSpecificationIsotope;
import org.hl7.fhir.SubstanceSpecificationMolecularWeight;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Specification Isotope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationIsotopeImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationIsotopeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationIsotopeImpl#getSubstitution <em>Substitution</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationIsotopeImpl#getHalfLife <em>Half Life</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationIsotopeImpl#getMolecularWeight <em>Molecular Weight</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceSpecificationIsotopeImpl extends BackboneElementImpl implements SubstanceSpecificationIsotope {
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
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept name;

	/**
	 * The cached value of the '{@link #getSubstitution() <em>Substitution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitution()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept substitution;

	/**
	 * The cached value of the '{@link #getHalfLife() <em>Half Life</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHalfLife()
	 * @generated
	 * @ordered
	 */
	protected Quantity halfLife;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceSpecificationIsotopeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubstanceSpecificationIsotope();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__IDENTIFIER, oldIdentifier, newIdentifier);
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
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(CodeableConcept newName, NotificationChain msgs) {
		CodeableConcept oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__NAME, oldName, newName);
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
	public void setName(CodeableConcept newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getSubstitution() {
		return substitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstitution(CodeableConcept newSubstitution, NotificationChain msgs) {
		CodeableConcept oldSubstitution = substitution;
		substitution = newSubstitution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__SUBSTITUTION, oldSubstitution, newSubstitution);
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
	public void setSubstitution(CodeableConcept newSubstitution) {
		if (newSubstitution != substitution) {
			NotificationChain msgs = null;
			if (substitution != null)
				msgs = ((InternalEObject)substitution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__SUBSTITUTION, null, msgs);
			if (newSubstitution != null)
				msgs = ((InternalEObject)newSubstitution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__SUBSTITUTION, null, msgs);
			msgs = basicSetSubstitution(newSubstitution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__SUBSTITUTION, newSubstitution, newSubstitution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getHalfLife() {
		return halfLife;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHalfLife(Quantity newHalfLife, NotificationChain msgs) {
		Quantity oldHalfLife = halfLife;
		halfLife = newHalfLife;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__HALF_LIFE, oldHalfLife, newHalfLife);
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
	public void setHalfLife(Quantity newHalfLife) {
		if (newHalfLife != halfLife) {
			NotificationChain msgs = null;
			if (halfLife != null)
				msgs = ((InternalEObject)halfLife).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__HALF_LIFE, null, msgs);
			if (newHalfLife != null)
				msgs = ((InternalEObject)newHalfLife).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__HALF_LIFE, null, msgs);
			msgs = basicSetHalfLife(newHalfLife, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__HALF_LIFE, newHalfLife, newHalfLife));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__MOLECULAR_WEIGHT, oldMolecularWeight, newMolecularWeight);
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
				msgs = ((InternalEObject)molecularWeight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__MOLECULAR_WEIGHT, null, msgs);
			if (newMolecularWeight != null)
				msgs = ((InternalEObject)newMolecularWeight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__MOLECULAR_WEIGHT, null, msgs);
			msgs = basicSetMolecularWeight(newMolecularWeight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__MOLECULAR_WEIGHT, newMolecularWeight, newMolecularWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__SUBSTITUTION:
				return basicSetSubstitution(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__HALF_LIFE:
				return basicSetHalfLife(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__MOLECULAR_WEIGHT:
				return basicSetMolecularWeight(null, msgs);
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
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__NAME:
				return getName();
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__SUBSTITUTION:
				return getSubstitution();
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__HALF_LIFE:
				return getHalfLife();
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__MOLECULAR_WEIGHT:
				return getMolecularWeight();
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
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__NAME:
				setName((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__SUBSTITUTION:
				setSubstitution((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__HALF_LIFE:
				setHalfLife((Quantity)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__MOLECULAR_WEIGHT:
				setMolecularWeight((SubstanceSpecificationMolecularWeight)newValue);
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
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__NAME:
				setName((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__SUBSTITUTION:
				setSubstitution((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__HALF_LIFE:
				setHalfLife((Quantity)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__MOLECULAR_WEIGHT:
				setMolecularWeight((SubstanceSpecificationMolecularWeight)null);
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
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__IDENTIFIER:
				return identifier != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__NAME:
				return name != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__SUBSTITUTION:
				return substitution != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__HALF_LIFE:
				return halfLife != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE__MOLECULAR_WEIGHT:
				return molecularWeight != null;
		}
		return super.eIsSet(featureID);
	}

} //SubstanceSpecificationIsotopeImpl
