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
import org.hl7.fhir.SubstanceSourceMaterialHybrid;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Source Material Hybrid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSourceMaterialHybridImpl#getMaternalOrganismId <em>Maternal Organism Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSourceMaterialHybridImpl#getMaternalOrganismName <em>Maternal Organism Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSourceMaterialHybridImpl#getPaternalOrganismId <em>Paternal Organism Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSourceMaterialHybridImpl#getPaternalOrganismName <em>Paternal Organism Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSourceMaterialHybridImpl#getHybridType <em>Hybrid Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceSourceMaterialHybridImpl extends BackboneElementImpl implements SubstanceSourceMaterialHybrid {
	/**
	 * The cached value of the '{@link #getMaternalOrganismId() <em>Maternal Organism Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaternalOrganismId()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String maternalOrganismId;

	/**
	 * The cached value of the '{@link #getMaternalOrganismName() <em>Maternal Organism Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaternalOrganismName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String maternalOrganismName;

	/**
	 * The cached value of the '{@link #getPaternalOrganismId() <em>Paternal Organism Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaternalOrganismId()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String paternalOrganismId;

	/**
	 * The cached value of the '{@link #getPaternalOrganismName() <em>Paternal Organism Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaternalOrganismName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String paternalOrganismName;

	/**
	 * The cached value of the '{@link #getHybridType() <em>Hybrid Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHybridType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept hybridType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceSourceMaterialHybridImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubstanceSourceMaterialHybrid();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getMaternalOrganismId() {
		return maternalOrganismId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaternalOrganismId(org.hl7.fhir.String newMaternalOrganismId, NotificationChain msgs) {
		org.hl7.fhir.String oldMaternalOrganismId = maternalOrganismId;
		maternalOrganismId = newMaternalOrganismId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID__MATERNAL_ORGANISM_ID, oldMaternalOrganismId, newMaternalOrganismId);
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
	public void setMaternalOrganismId(org.hl7.fhir.String newMaternalOrganismId) {
		if (newMaternalOrganismId != maternalOrganismId) {
			NotificationChain msgs = null;
			if (maternalOrganismId != null)
				msgs = ((InternalEObject)maternalOrganismId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID__MATERNAL_ORGANISM_ID, null, msgs);
			if (newMaternalOrganismId != null)
				msgs = ((InternalEObject)newMaternalOrganismId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID__MATERNAL_ORGANISM_ID, null, msgs);
			msgs = basicSetMaternalOrganismId(newMaternalOrganismId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID__MATERNAL_ORGANISM_ID, newMaternalOrganismId, newMaternalOrganismId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getMaternalOrganismName() {
		return maternalOrganismName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaternalOrganismName(org.hl7.fhir.String newMaternalOrganismName, NotificationChain msgs) {
		org.hl7.fhir.String oldMaternalOrganismName = maternalOrganismName;
		maternalOrganismName = newMaternalOrganismName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID__MATERNAL_ORGANISM_NAME, oldMaternalOrganismName, newMaternalOrganismName);
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
	public void setMaternalOrganismName(org.hl7.fhir.String newMaternalOrganismName) {
		if (newMaternalOrganismName != maternalOrganismName) {
			NotificationChain msgs = null;
			if (maternalOrganismName != null)
				msgs = ((InternalEObject)maternalOrganismName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID__MATERNAL_ORGANISM_NAME, null, msgs);
			if (newMaternalOrganismName != null)
				msgs = ((InternalEObject)newMaternalOrganismName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID__MATERNAL_ORGANISM_NAME, null, msgs);
			msgs = basicSetMaternalOrganismName(newMaternalOrganismName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID__MATERNAL_ORGANISM_NAME, newMaternalOrganismName, newMaternalOrganismName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getPaternalOrganismId() {
		return paternalOrganismId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaternalOrganismId(org.hl7.fhir.String newPaternalOrganismId, NotificationChain msgs) {
		org.hl7.fhir.String oldPaternalOrganismId = paternalOrganismId;
		paternalOrganismId = newPaternalOrganismId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID__PATERNAL_ORGANISM_ID, oldPaternalOrganismId, newPaternalOrganismId);
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
	public void setPaternalOrganismId(org.hl7.fhir.String newPaternalOrganismId) {
		if (newPaternalOrganismId != paternalOrganismId) {
			NotificationChain msgs = null;
			if (paternalOrganismId != null)
				msgs = ((InternalEObject)paternalOrganismId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID__PATERNAL_ORGANISM_ID, null, msgs);
			if (newPaternalOrganismId != null)
				msgs = ((InternalEObject)newPaternalOrganismId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID__PATERNAL_ORGANISM_ID, null, msgs);
			msgs = basicSetPaternalOrganismId(newPaternalOrganismId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID__PATERNAL_ORGANISM_ID, newPaternalOrganismId, newPaternalOrganismId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getPaternalOrganismName() {
		return paternalOrganismName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaternalOrganismName(org.hl7.fhir.String newPaternalOrganismName, NotificationChain msgs) {
		org.hl7.fhir.String oldPaternalOrganismName = paternalOrganismName;
		paternalOrganismName = newPaternalOrganismName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID__PATERNAL_ORGANISM_NAME, oldPaternalOrganismName, newPaternalOrganismName);
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
	public void setPaternalOrganismName(org.hl7.fhir.String newPaternalOrganismName) {
		if (newPaternalOrganismName != paternalOrganismName) {
			NotificationChain msgs = null;
			if (paternalOrganismName != null)
				msgs = ((InternalEObject)paternalOrganismName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID__PATERNAL_ORGANISM_NAME, null, msgs);
			if (newPaternalOrganismName != null)
				msgs = ((InternalEObject)newPaternalOrganismName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID__PATERNAL_ORGANISM_NAME, null, msgs);
			msgs = basicSetPaternalOrganismName(newPaternalOrganismName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID__PATERNAL_ORGANISM_NAME, newPaternalOrganismName, newPaternalOrganismName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getHybridType() {
		return hybridType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHybridType(CodeableConcept newHybridType, NotificationChain msgs) {
		CodeableConcept oldHybridType = hybridType;
		hybridType = newHybridType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID__HYBRID_TYPE, oldHybridType, newHybridType);
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
	public void setHybridType(CodeableConcept newHybridType) {
		if (newHybridType != hybridType) {
			NotificationChain msgs = null;
			if (hybridType != null)
				msgs = ((InternalEObject)hybridType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID__HYBRID_TYPE, null, msgs);
			if (newHybridType != null)
				msgs = ((InternalEObject)newHybridType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID__HYBRID_TYPE, null, msgs);
			msgs = basicSetHybridType(newHybridType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID__HYBRID_TYPE, newHybridType, newHybridType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID__MATERNAL_ORGANISM_ID:
				return basicSetMaternalOrganismId(null, msgs);
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID__MATERNAL_ORGANISM_NAME:
				return basicSetMaternalOrganismName(null, msgs);
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID__PATERNAL_ORGANISM_ID:
				return basicSetPaternalOrganismId(null, msgs);
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID__PATERNAL_ORGANISM_NAME:
				return basicSetPaternalOrganismName(null, msgs);
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID__HYBRID_TYPE:
				return basicSetHybridType(null, msgs);
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
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID__MATERNAL_ORGANISM_ID:
				return getMaternalOrganismId();
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID__MATERNAL_ORGANISM_NAME:
				return getMaternalOrganismName();
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID__PATERNAL_ORGANISM_ID:
				return getPaternalOrganismId();
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID__PATERNAL_ORGANISM_NAME:
				return getPaternalOrganismName();
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID__HYBRID_TYPE:
				return getHybridType();
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
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID__MATERNAL_ORGANISM_ID:
				setMaternalOrganismId((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID__MATERNAL_ORGANISM_NAME:
				setMaternalOrganismName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID__PATERNAL_ORGANISM_ID:
				setPaternalOrganismId((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID__PATERNAL_ORGANISM_NAME:
				setPaternalOrganismName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID__HYBRID_TYPE:
				setHybridType((CodeableConcept)newValue);
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
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID__MATERNAL_ORGANISM_ID:
				setMaternalOrganismId((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID__MATERNAL_ORGANISM_NAME:
				setMaternalOrganismName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID__PATERNAL_ORGANISM_ID:
				setPaternalOrganismId((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID__PATERNAL_ORGANISM_NAME:
				setPaternalOrganismName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID__HYBRID_TYPE:
				setHybridType((CodeableConcept)null);
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
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID__MATERNAL_ORGANISM_ID:
				return maternalOrganismId != null;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID__MATERNAL_ORGANISM_NAME:
				return maternalOrganismName != null;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID__PATERNAL_ORGANISM_ID:
				return paternalOrganismId != null;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID__PATERNAL_ORGANISM_NAME:
				return paternalOrganismName != null;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID__HYBRID_TYPE:
				return hybridType != null;
		}
		return super.eIsSet(featureID);
	}

} //SubstanceSourceMaterialHybridImpl
