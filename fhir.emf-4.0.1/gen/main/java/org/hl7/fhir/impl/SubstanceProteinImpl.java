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
import org.hl7.fhir.SubstanceProtein;
import org.hl7.fhir.SubstanceProteinSubunit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Protein</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubstanceProteinImpl#getSequenceType <em>Sequence Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceProteinImpl#getNumberOfSubunits <em>Number Of Subunits</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceProteinImpl#getDisulfideLinkage <em>Disulfide Linkage</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceProteinImpl#getSubunit <em>Subunit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceProteinImpl extends DomainResourceImpl implements SubstanceProtein {
	/**
	 * The cached value of the '{@link #getSequenceType() <em>Sequence Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept sequenceType;

	/**
	 * The cached value of the '{@link #getNumberOfSubunits() <em>Number Of Subunits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSubunits()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer numberOfSubunits;

	/**
	 * The cached value of the '{@link #getDisulfideLinkage() <em>Disulfide Linkage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisulfideLinkage()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> disulfideLinkage;

	/**
	 * The cached value of the '{@link #getSubunit() <em>Subunit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubunit()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceProteinSubunit> subunit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceProteinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubstanceProtein();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getSequenceType() {
		return sequenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequenceType(CodeableConcept newSequenceType, NotificationChain msgs) {
		CodeableConcept oldSequenceType = sequenceType;
		sequenceType = newSequenceType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_PROTEIN__SEQUENCE_TYPE, oldSequenceType, newSequenceType);
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
	public void setSequenceType(CodeableConcept newSequenceType) {
		if (newSequenceType != sequenceType) {
			NotificationChain msgs = null;
			if (sequenceType != null)
				msgs = ((InternalEObject)sequenceType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_PROTEIN__SEQUENCE_TYPE, null, msgs);
			if (newSequenceType != null)
				msgs = ((InternalEObject)newSequenceType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_PROTEIN__SEQUENCE_TYPE, null, msgs);
			msgs = basicSetSequenceType(newSequenceType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_PROTEIN__SEQUENCE_TYPE, newSequenceType, newSequenceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Integer getNumberOfSubunits() {
		return numberOfSubunits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberOfSubunits(org.hl7.fhir.Integer newNumberOfSubunits, NotificationChain msgs) {
		org.hl7.fhir.Integer oldNumberOfSubunits = numberOfSubunits;
		numberOfSubunits = newNumberOfSubunits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_PROTEIN__NUMBER_OF_SUBUNITS, oldNumberOfSubunits, newNumberOfSubunits);
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
	public void setNumberOfSubunits(org.hl7.fhir.Integer newNumberOfSubunits) {
		if (newNumberOfSubunits != numberOfSubunits) {
			NotificationChain msgs = null;
			if (numberOfSubunits != null)
				msgs = ((InternalEObject)numberOfSubunits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_PROTEIN__NUMBER_OF_SUBUNITS, null, msgs);
			if (newNumberOfSubunits != null)
				msgs = ((InternalEObject)newNumberOfSubunits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_PROTEIN__NUMBER_OF_SUBUNITS, null, msgs);
			msgs = basicSetNumberOfSubunits(newNumberOfSubunits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_PROTEIN__NUMBER_OF_SUBUNITS, newNumberOfSubunits, newNumberOfSubunits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.hl7.fhir.String> getDisulfideLinkage() {
		if (disulfideLinkage == null) {
			disulfideLinkage = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.SUBSTANCE_PROTEIN__DISULFIDE_LINKAGE);
		}
		return disulfideLinkage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstanceProteinSubunit> getSubunit() {
		if (subunit == null) {
			subunit = new EObjectContainmentEList<SubstanceProteinSubunit>(SubstanceProteinSubunit.class, this, FhirPackage.SUBSTANCE_PROTEIN__SUBUNIT);
		}
		return subunit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUBSTANCE_PROTEIN__SEQUENCE_TYPE:
				return basicSetSequenceType(null, msgs);
			case FhirPackage.SUBSTANCE_PROTEIN__NUMBER_OF_SUBUNITS:
				return basicSetNumberOfSubunits(null, msgs);
			case FhirPackage.SUBSTANCE_PROTEIN__DISULFIDE_LINKAGE:
				return ((InternalEList<?>)getDisulfideLinkage()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_PROTEIN__SUBUNIT:
				return ((InternalEList<?>)getSubunit()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.SUBSTANCE_PROTEIN__SEQUENCE_TYPE:
				return getSequenceType();
			case FhirPackage.SUBSTANCE_PROTEIN__NUMBER_OF_SUBUNITS:
				return getNumberOfSubunits();
			case FhirPackage.SUBSTANCE_PROTEIN__DISULFIDE_LINKAGE:
				return getDisulfideLinkage();
			case FhirPackage.SUBSTANCE_PROTEIN__SUBUNIT:
				return getSubunit();
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
			case FhirPackage.SUBSTANCE_PROTEIN__SEQUENCE_TYPE:
				setSequenceType((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_PROTEIN__NUMBER_OF_SUBUNITS:
				setNumberOfSubunits((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.SUBSTANCE_PROTEIN__DISULFIDE_LINKAGE:
				getDisulfideLinkage().clear();
				getDisulfideLinkage().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.SUBSTANCE_PROTEIN__SUBUNIT:
				getSubunit().clear();
				getSubunit().addAll((Collection<? extends SubstanceProteinSubunit>)newValue);
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
			case FhirPackage.SUBSTANCE_PROTEIN__SEQUENCE_TYPE:
				setSequenceType((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_PROTEIN__NUMBER_OF_SUBUNITS:
				setNumberOfSubunits((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.SUBSTANCE_PROTEIN__DISULFIDE_LINKAGE:
				getDisulfideLinkage().clear();
				return;
			case FhirPackage.SUBSTANCE_PROTEIN__SUBUNIT:
				getSubunit().clear();
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
			case FhirPackage.SUBSTANCE_PROTEIN__SEQUENCE_TYPE:
				return sequenceType != null;
			case FhirPackage.SUBSTANCE_PROTEIN__NUMBER_OF_SUBUNITS:
				return numberOfSubunits != null;
			case FhirPackage.SUBSTANCE_PROTEIN__DISULFIDE_LINKAGE:
				return disulfideLinkage != null && !disulfideLinkage.isEmpty();
			case FhirPackage.SUBSTANCE_PROTEIN__SUBUNIT:
				return subunit != null && !subunit.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubstanceProteinImpl
