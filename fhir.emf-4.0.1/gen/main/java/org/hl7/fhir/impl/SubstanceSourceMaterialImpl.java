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
import org.hl7.fhir.SubstanceSourceMaterial;
import org.hl7.fhir.SubstanceSourceMaterialFractionDescription;
import org.hl7.fhir.SubstanceSourceMaterialOrganism;
import org.hl7.fhir.SubstanceSourceMaterialPartDescription;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Source Material</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSourceMaterialImpl#getSourceMaterialClass <em>Source Material Class</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSourceMaterialImpl#getSourceMaterialType <em>Source Material Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSourceMaterialImpl#getSourceMaterialState <em>Source Material State</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSourceMaterialImpl#getOrganismId <em>Organism Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSourceMaterialImpl#getOrganismName <em>Organism Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSourceMaterialImpl#getParentSubstanceId <em>Parent Substance Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSourceMaterialImpl#getParentSubstanceName <em>Parent Substance Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSourceMaterialImpl#getCountryOfOrigin <em>Country Of Origin</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSourceMaterialImpl#getGeographicalLocation <em>Geographical Location</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSourceMaterialImpl#getDevelopmentStage <em>Development Stage</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSourceMaterialImpl#getFractionDescription <em>Fraction Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSourceMaterialImpl#getOrganism <em>Organism</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSourceMaterialImpl#getPartDescription <em>Part Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceSourceMaterialImpl extends DomainResourceImpl implements SubstanceSourceMaterial {
	/**
	 * The cached value of the '{@link #getSourceMaterialClass() <em>Source Material Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceMaterialClass()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept sourceMaterialClass;

	/**
	 * The cached value of the '{@link #getSourceMaterialType() <em>Source Material Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceMaterialType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept sourceMaterialType;

	/**
	 * The cached value of the '{@link #getSourceMaterialState() <em>Source Material State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceMaterialState()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept sourceMaterialState;

	/**
	 * The cached value of the '{@link #getOrganismId() <em>Organism Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganismId()
	 * @generated
	 * @ordered
	 */
	protected Identifier organismId;

	/**
	 * The cached value of the '{@link #getOrganismName() <em>Organism Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganismName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String organismName;

	/**
	 * The cached value of the '{@link #getParentSubstanceId() <em>Parent Substance Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentSubstanceId()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> parentSubstanceId;

	/**
	 * The cached value of the '{@link #getParentSubstanceName() <em>Parent Substance Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentSubstanceName()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> parentSubstanceName;

	/**
	 * The cached value of the '{@link #getCountryOfOrigin() <em>Country Of Origin</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryOfOrigin()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> countryOfOrigin;

	/**
	 * The cached value of the '{@link #getGeographicalLocation() <em>Geographical Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeographicalLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> geographicalLocation;

	/**
	 * The cached value of the '{@link #getDevelopmentStage() <em>Development Stage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevelopmentStage()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept developmentStage;

	/**
	 * The cached value of the '{@link #getFractionDescription() <em>Fraction Description</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFractionDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceSourceMaterialFractionDescription> fractionDescription;

	/**
	 * The cached value of the '{@link #getOrganism() <em>Organism</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganism()
	 * @generated
	 * @ordered
	 */
	protected SubstanceSourceMaterialOrganism organism;

	/**
	 * The cached value of the '{@link #getPartDescription() <em>Part Description</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceSourceMaterialPartDescription> partDescription;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceSourceMaterialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubstanceSourceMaterial();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getSourceMaterialClass() {
		return sourceMaterialClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceMaterialClass(CodeableConcept newSourceMaterialClass, NotificationChain msgs) {
		CodeableConcept oldSourceMaterialClass = sourceMaterialClass;
		sourceMaterialClass = newSourceMaterialClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_CLASS, oldSourceMaterialClass, newSourceMaterialClass);
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
	public void setSourceMaterialClass(CodeableConcept newSourceMaterialClass) {
		if (newSourceMaterialClass != sourceMaterialClass) {
			NotificationChain msgs = null;
			if (sourceMaterialClass != null)
				msgs = ((InternalEObject)sourceMaterialClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_CLASS, null, msgs);
			if (newSourceMaterialClass != null)
				msgs = ((InternalEObject)newSourceMaterialClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_CLASS, null, msgs);
			msgs = basicSetSourceMaterialClass(newSourceMaterialClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_CLASS, newSourceMaterialClass, newSourceMaterialClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getSourceMaterialType() {
		return sourceMaterialType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceMaterialType(CodeableConcept newSourceMaterialType, NotificationChain msgs) {
		CodeableConcept oldSourceMaterialType = sourceMaterialType;
		sourceMaterialType = newSourceMaterialType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_TYPE, oldSourceMaterialType, newSourceMaterialType);
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
	public void setSourceMaterialType(CodeableConcept newSourceMaterialType) {
		if (newSourceMaterialType != sourceMaterialType) {
			NotificationChain msgs = null;
			if (sourceMaterialType != null)
				msgs = ((InternalEObject)sourceMaterialType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_TYPE, null, msgs);
			if (newSourceMaterialType != null)
				msgs = ((InternalEObject)newSourceMaterialType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_TYPE, null, msgs);
			msgs = basicSetSourceMaterialType(newSourceMaterialType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_TYPE, newSourceMaterialType, newSourceMaterialType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getSourceMaterialState() {
		return sourceMaterialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceMaterialState(CodeableConcept newSourceMaterialState, NotificationChain msgs) {
		CodeableConcept oldSourceMaterialState = sourceMaterialState;
		sourceMaterialState = newSourceMaterialState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_STATE, oldSourceMaterialState, newSourceMaterialState);
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
	public void setSourceMaterialState(CodeableConcept newSourceMaterialState) {
		if (newSourceMaterialState != sourceMaterialState) {
			NotificationChain msgs = null;
			if (sourceMaterialState != null)
				msgs = ((InternalEObject)sourceMaterialState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_STATE, null, msgs);
			if (newSourceMaterialState != null)
				msgs = ((InternalEObject)newSourceMaterialState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_STATE, null, msgs);
			msgs = basicSetSourceMaterialState(newSourceMaterialState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_STATE, newSourceMaterialState, newSourceMaterialState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getOrganismId() {
		return organismId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganismId(Identifier newOrganismId, NotificationChain msgs) {
		Identifier oldOrganismId = organismId;
		organismId = newOrganismId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM_ID, oldOrganismId, newOrganismId);
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
	public void setOrganismId(Identifier newOrganismId) {
		if (newOrganismId != organismId) {
			NotificationChain msgs = null;
			if (organismId != null)
				msgs = ((InternalEObject)organismId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM_ID, null, msgs);
			if (newOrganismId != null)
				msgs = ((InternalEObject)newOrganismId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM_ID, null, msgs);
			msgs = basicSetOrganismId(newOrganismId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM_ID, newOrganismId, newOrganismId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getOrganismName() {
		return organismName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganismName(org.hl7.fhir.String newOrganismName, NotificationChain msgs) {
		org.hl7.fhir.String oldOrganismName = organismName;
		organismName = newOrganismName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM_NAME, oldOrganismName, newOrganismName);
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
	public void setOrganismName(org.hl7.fhir.String newOrganismName) {
		if (newOrganismName != organismName) {
			NotificationChain msgs = null;
			if (organismName != null)
				msgs = ((InternalEObject)organismName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM_NAME, null, msgs);
			if (newOrganismName != null)
				msgs = ((InternalEObject)newOrganismName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM_NAME, null, msgs);
			msgs = basicSetOrganismName(newOrganismName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM_NAME, newOrganismName, newOrganismName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getParentSubstanceId() {
		if (parentSubstanceId == null) {
			parentSubstanceId = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.SUBSTANCE_SOURCE_MATERIAL__PARENT_SUBSTANCE_ID);
		}
		return parentSubstanceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.hl7.fhir.String> getParentSubstanceName() {
		if (parentSubstanceName == null) {
			parentSubstanceName = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.SUBSTANCE_SOURCE_MATERIAL__PARENT_SUBSTANCE_NAME);
		}
		return parentSubstanceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCountryOfOrigin() {
		if (countryOfOrigin == null) {
			countryOfOrigin = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.SUBSTANCE_SOURCE_MATERIAL__COUNTRY_OF_ORIGIN);
		}
		return countryOfOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.hl7.fhir.String> getGeographicalLocation() {
		if (geographicalLocation == null) {
			geographicalLocation = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.SUBSTANCE_SOURCE_MATERIAL__GEOGRAPHICAL_LOCATION);
		}
		return geographicalLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getDevelopmentStage() {
		return developmentStage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevelopmentStage(CodeableConcept newDevelopmentStage, NotificationChain msgs) {
		CodeableConcept oldDevelopmentStage = developmentStage;
		developmentStage = newDevelopmentStage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SOURCE_MATERIAL__DEVELOPMENT_STAGE, oldDevelopmentStage, newDevelopmentStage);
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
	public void setDevelopmentStage(CodeableConcept newDevelopmentStage) {
		if (newDevelopmentStage != developmentStage) {
			NotificationChain msgs = null;
			if (developmentStage != null)
				msgs = ((InternalEObject)developmentStage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SOURCE_MATERIAL__DEVELOPMENT_STAGE, null, msgs);
			if (newDevelopmentStage != null)
				msgs = ((InternalEObject)newDevelopmentStage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SOURCE_MATERIAL__DEVELOPMENT_STAGE, null, msgs);
			msgs = basicSetDevelopmentStage(newDevelopmentStage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SOURCE_MATERIAL__DEVELOPMENT_STAGE, newDevelopmentStage, newDevelopmentStage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstanceSourceMaterialFractionDescription> getFractionDescription() {
		if (fractionDescription == null) {
			fractionDescription = new EObjectContainmentEList<SubstanceSourceMaterialFractionDescription>(SubstanceSourceMaterialFractionDescription.class, this, FhirPackage.SUBSTANCE_SOURCE_MATERIAL__FRACTION_DESCRIPTION);
		}
		return fractionDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceSourceMaterialOrganism getOrganism() {
		return organism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganism(SubstanceSourceMaterialOrganism newOrganism, NotificationChain msgs) {
		SubstanceSourceMaterialOrganism oldOrganism = organism;
		organism = newOrganism;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM, oldOrganism, newOrganism);
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
	public void setOrganism(SubstanceSourceMaterialOrganism newOrganism) {
		if (newOrganism != organism) {
			NotificationChain msgs = null;
			if (organism != null)
				msgs = ((InternalEObject)organism).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM, null, msgs);
			if (newOrganism != null)
				msgs = ((InternalEObject)newOrganism).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM, null, msgs);
			msgs = basicSetOrganism(newOrganism, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM, newOrganism, newOrganism));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstanceSourceMaterialPartDescription> getPartDescription() {
		if (partDescription == null) {
			partDescription = new EObjectContainmentEList<SubstanceSourceMaterialPartDescription>(SubstanceSourceMaterialPartDescription.class, this, FhirPackage.SUBSTANCE_SOURCE_MATERIAL__PART_DESCRIPTION);
		}
		return partDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_CLASS:
				return basicSetSourceMaterialClass(null, msgs);
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_TYPE:
				return basicSetSourceMaterialType(null, msgs);
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_STATE:
				return basicSetSourceMaterialState(null, msgs);
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM_ID:
				return basicSetOrganismId(null, msgs);
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM_NAME:
				return basicSetOrganismName(null, msgs);
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__PARENT_SUBSTANCE_ID:
				return ((InternalEList<?>)getParentSubstanceId()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__PARENT_SUBSTANCE_NAME:
				return ((InternalEList<?>)getParentSubstanceName()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__COUNTRY_OF_ORIGIN:
				return ((InternalEList<?>)getCountryOfOrigin()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__GEOGRAPHICAL_LOCATION:
				return ((InternalEList<?>)getGeographicalLocation()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__DEVELOPMENT_STAGE:
				return basicSetDevelopmentStage(null, msgs);
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__FRACTION_DESCRIPTION:
				return ((InternalEList<?>)getFractionDescription()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM:
				return basicSetOrganism(null, msgs);
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__PART_DESCRIPTION:
				return ((InternalEList<?>)getPartDescription()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_CLASS:
				return getSourceMaterialClass();
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_TYPE:
				return getSourceMaterialType();
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_STATE:
				return getSourceMaterialState();
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM_ID:
				return getOrganismId();
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM_NAME:
				return getOrganismName();
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__PARENT_SUBSTANCE_ID:
				return getParentSubstanceId();
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__PARENT_SUBSTANCE_NAME:
				return getParentSubstanceName();
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__COUNTRY_OF_ORIGIN:
				return getCountryOfOrigin();
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__GEOGRAPHICAL_LOCATION:
				return getGeographicalLocation();
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__DEVELOPMENT_STAGE:
				return getDevelopmentStage();
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__FRACTION_DESCRIPTION:
				return getFractionDescription();
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM:
				return getOrganism();
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__PART_DESCRIPTION:
				return getPartDescription();
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
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_CLASS:
				setSourceMaterialClass((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_TYPE:
				setSourceMaterialType((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_STATE:
				setSourceMaterialState((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM_ID:
				setOrganismId((Identifier)newValue);
				return;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM_NAME:
				setOrganismName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__PARENT_SUBSTANCE_ID:
				getParentSubstanceId().clear();
				getParentSubstanceId().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__PARENT_SUBSTANCE_NAME:
				getParentSubstanceName().clear();
				getParentSubstanceName().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__COUNTRY_OF_ORIGIN:
				getCountryOfOrigin().clear();
				getCountryOfOrigin().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__GEOGRAPHICAL_LOCATION:
				getGeographicalLocation().clear();
				getGeographicalLocation().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__DEVELOPMENT_STAGE:
				setDevelopmentStage((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__FRACTION_DESCRIPTION:
				getFractionDescription().clear();
				getFractionDescription().addAll((Collection<? extends SubstanceSourceMaterialFractionDescription>)newValue);
				return;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM:
				setOrganism((SubstanceSourceMaterialOrganism)newValue);
				return;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__PART_DESCRIPTION:
				getPartDescription().clear();
				getPartDescription().addAll((Collection<? extends SubstanceSourceMaterialPartDescription>)newValue);
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
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_CLASS:
				setSourceMaterialClass((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_TYPE:
				setSourceMaterialType((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_STATE:
				setSourceMaterialState((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM_ID:
				setOrganismId((Identifier)null);
				return;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM_NAME:
				setOrganismName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__PARENT_SUBSTANCE_ID:
				getParentSubstanceId().clear();
				return;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__PARENT_SUBSTANCE_NAME:
				getParentSubstanceName().clear();
				return;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__COUNTRY_OF_ORIGIN:
				getCountryOfOrigin().clear();
				return;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__GEOGRAPHICAL_LOCATION:
				getGeographicalLocation().clear();
				return;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__DEVELOPMENT_STAGE:
				setDevelopmentStage((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__FRACTION_DESCRIPTION:
				getFractionDescription().clear();
				return;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM:
				setOrganism((SubstanceSourceMaterialOrganism)null);
				return;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__PART_DESCRIPTION:
				getPartDescription().clear();
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
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_CLASS:
				return sourceMaterialClass != null;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_TYPE:
				return sourceMaterialType != null;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__SOURCE_MATERIAL_STATE:
				return sourceMaterialState != null;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM_ID:
				return organismId != null;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM_NAME:
				return organismName != null;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__PARENT_SUBSTANCE_ID:
				return parentSubstanceId != null && !parentSubstanceId.isEmpty();
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__PARENT_SUBSTANCE_NAME:
				return parentSubstanceName != null && !parentSubstanceName.isEmpty();
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__COUNTRY_OF_ORIGIN:
				return countryOfOrigin != null && !countryOfOrigin.isEmpty();
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__GEOGRAPHICAL_LOCATION:
				return geographicalLocation != null && !geographicalLocation.isEmpty();
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__DEVELOPMENT_STAGE:
				return developmentStage != null;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__FRACTION_DESCRIPTION:
				return fractionDescription != null && !fractionDescription.isEmpty();
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__ORGANISM:
				return organism != null;
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL__PART_DESCRIPTION:
				return partDescription != null && !partDescription.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubstanceSourceMaterialImpl
