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
import org.hl7.fhir.SubstanceNucleicAcid;
import org.hl7.fhir.SubstanceNucleicAcidSubunit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Nucleic Acid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubstanceNucleicAcidImpl#getSequenceType <em>Sequence Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceNucleicAcidImpl#getNumberOfSubunits <em>Number Of Subunits</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceNucleicAcidImpl#getAreaOfHybridisation <em>Area Of Hybridisation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceNucleicAcidImpl#getOligoNucleotideType <em>Oligo Nucleotide Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceNucleicAcidImpl#getSubunit <em>Subunit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceNucleicAcidImpl extends DomainResourceImpl implements SubstanceNucleicAcid {
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
	 * The cached value of the '{@link #getAreaOfHybridisation() <em>Area Of Hybridisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreaOfHybridisation()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String areaOfHybridisation;

	/**
	 * The cached value of the '{@link #getOligoNucleotideType() <em>Oligo Nucleotide Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOligoNucleotideType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept oligoNucleotideType;

	/**
	 * The cached value of the '{@link #getSubunit() <em>Subunit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubunit()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceNucleicAcidSubunit> subunit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceNucleicAcidImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubstanceNucleicAcid();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_NUCLEIC_ACID__SEQUENCE_TYPE, oldSequenceType, newSequenceType);
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
				msgs = ((InternalEObject)sequenceType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_NUCLEIC_ACID__SEQUENCE_TYPE, null, msgs);
			if (newSequenceType != null)
				msgs = ((InternalEObject)newSequenceType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_NUCLEIC_ACID__SEQUENCE_TYPE, null, msgs);
			msgs = basicSetSequenceType(newSequenceType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_NUCLEIC_ACID__SEQUENCE_TYPE, newSequenceType, newSequenceType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_NUCLEIC_ACID__NUMBER_OF_SUBUNITS, oldNumberOfSubunits, newNumberOfSubunits);
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
				msgs = ((InternalEObject)numberOfSubunits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_NUCLEIC_ACID__NUMBER_OF_SUBUNITS, null, msgs);
			if (newNumberOfSubunits != null)
				msgs = ((InternalEObject)newNumberOfSubunits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_NUCLEIC_ACID__NUMBER_OF_SUBUNITS, null, msgs);
			msgs = basicSetNumberOfSubunits(newNumberOfSubunits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_NUCLEIC_ACID__NUMBER_OF_SUBUNITS, newNumberOfSubunits, newNumberOfSubunits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getAreaOfHybridisation() {
		return areaOfHybridisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAreaOfHybridisation(org.hl7.fhir.String newAreaOfHybridisation, NotificationChain msgs) {
		org.hl7.fhir.String oldAreaOfHybridisation = areaOfHybridisation;
		areaOfHybridisation = newAreaOfHybridisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_NUCLEIC_ACID__AREA_OF_HYBRIDISATION, oldAreaOfHybridisation, newAreaOfHybridisation);
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
	public void setAreaOfHybridisation(org.hl7.fhir.String newAreaOfHybridisation) {
		if (newAreaOfHybridisation != areaOfHybridisation) {
			NotificationChain msgs = null;
			if (areaOfHybridisation != null)
				msgs = ((InternalEObject)areaOfHybridisation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_NUCLEIC_ACID__AREA_OF_HYBRIDISATION, null, msgs);
			if (newAreaOfHybridisation != null)
				msgs = ((InternalEObject)newAreaOfHybridisation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_NUCLEIC_ACID__AREA_OF_HYBRIDISATION, null, msgs);
			msgs = basicSetAreaOfHybridisation(newAreaOfHybridisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_NUCLEIC_ACID__AREA_OF_HYBRIDISATION, newAreaOfHybridisation, newAreaOfHybridisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getOligoNucleotideType() {
		return oligoNucleotideType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOligoNucleotideType(CodeableConcept newOligoNucleotideType, NotificationChain msgs) {
		CodeableConcept oldOligoNucleotideType = oligoNucleotideType;
		oligoNucleotideType = newOligoNucleotideType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_NUCLEIC_ACID__OLIGO_NUCLEOTIDE_TYPE, oldOligoNucleotideType, newOligoNucleotideType);
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
	public void setOligoNucleotideType(CodeableConcept newOligoNucleotideType) {
		if (newOligoNucleotideType != oligoNucleotideType) {
			NotificationChain msgs = null;
			if (oligoNucleotideType != null)
				msgs = ((InternalEObject)oligoNucleotideType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_NUCLEIC_ACID__OLIGO_NUCLEOTIDE_TYPE, null, msgs);
			if (newOligoNucleotideType != null)
				msgs = ((InternalEObject)newOligoNucleotideType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_NUCLEIC_ACID__OLIGO_NUCLEOTIDE_TYPE, null, msgs);
			msgs = basicSetOligoNucleotideType(newOligoNucleotideType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_NUCLEIC_ACID__OLIGO_NUCLEOTIDE_TYPE, newOligoNucleotideType, newOligoNucleotideType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstanceNucleicAcidSubunit> getSubunit() {
		if (subunit == null) {
			subunit = new EObjectContainmentEList<SubstanceNucleicAcidSubunit>(SubstanceNucleicAcidSubunit.class, this, FhirPackage.SUBSTANCE_NUCLEIC_ACID__SUBUNIT);
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
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID__SEQUENCE_TYPE:
				return basicSetSequenceType(null, msgs);
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID__NUMBER_OF_SUBUNITS:
				return basicSetNumberOfSubunits(null, msgs);
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID__AREA_OF_HYBRIDISATION:
				return basicSetAreaOfHybridisation(null, msgs);
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID__OLIGO_NUCLEOTIDE_TYPE:
				return basicSetOligoNucleotideType(null, msgs);
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID__SUBUNIT:
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
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID__SEQUENCE_TYPE:
				return getSequenceType();
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID__NUMBER_OF_SUBUNITS:
				return getNumberOfSubunits();
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID__AREA_OF_HYBRIDISATION:
				return getAreaOfHybridisation();
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID__OLIGO_NUCLEOTIDE_TYPE:
				return getOligoNucleotideType();
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID__SUBUNIT:
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
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID__SEQUENCE_TYPE:
				setSequenceType((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID__NUMBER_OF_SUBUNITS:
				setNumberOfSubunits((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID__AREA_OF_HYBRIDISATION:
				setAreaOfHybridisation((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID__OLIGO_NUCLEOTIDE_TYPE:
				setOligoNucleotideType((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID__SUBUNIT:
				getSubunit().clear();
				getSubunit().addAll((Collection<? extends SubstanceNucleicAcidSubunit>)newValue);
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
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID__SEQUENCE_TYPE:
				setSequenceType((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID__NUMBER_OF_SUBUNITS:
				setNumberOfSubunits((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID__AREA_OF_HYBRIDISATION:
				setAreaOfHybridisation((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID__OLIGO_NUCLEOTIDE_TYPE:
				setOligoNucleotideType((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID__SUBUNIT:
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
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID__SEQUENCE_TYPE:
				return sequenceType != null;
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID__NUMBER_OF_SUBUNITS:
				return numberOfSubunits != null;
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID__AREA_OF_HYBRIDISATION:
				return areaOfHybridisation != null;
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID__OLIGO_NUCLEOTIDE_TYPE:
				return oligoNucleotideType != null;
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID__SUBUNIT:
				return subunit != null && !subunit.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubstanceNucleicAcidImpl
