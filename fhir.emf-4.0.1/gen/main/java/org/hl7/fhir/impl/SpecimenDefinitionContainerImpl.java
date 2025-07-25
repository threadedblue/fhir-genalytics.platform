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
import org.hl7.fhir.Quantity;
import org.hl7.fhir.SpecimenDefinitionAdditive;
import org.hl7.fhir.SpecimenDefinitionContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specimen Definition Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionContainerImpl#getMaterial <em>Material</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionContainerImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionContainerImpl#getCap <em>Cap</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionContainerImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionContainerImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionContainerImpl#getMinimumVolumeQuantity <em>Minimum Volume Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionContainerImpl#getMinimumVolumeString <em>Minimum Volume String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionContainerImpl#getAdditive <em>Additive</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionContainerImpl#getPreparation <em>Preparation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecimenDefinitionContainerImpl extends BackboneElementImpl implements SpecimenDefinitionContainer {
	/**
	 * The cached value of the '{@link #getMaterial() <em>Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterial()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept material;

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
	 * The cached value of the '{@link #getCap() <em>Cap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCap()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept cap;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String description;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected Quantity capacity;

	/**
	 * The cached value of the '{@link #getMinimumVolumeQuantity() <em>Minimum Volume Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumVolumeQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity minimumVolumeQuantity;

	/**
	 * The cached value of the '{@link #getMinimumVolumeString() <em>Minimum Volume String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumVolumeString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String minimumVolumeString;

	/**
	 * The cached value of the '{@link #getAdditive() <em>Additive</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditive()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecimenDefinitionAdditive> additive;

	/**
	 * The cached value of the '{@link #getPreparation() <em>Preparation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreparation()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String preparation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecimenDefinitionContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSpecimenDefinitionContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getMaterial() {
		return material;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaterial(CodeableConcept newMaterial, NotificationChain msgs) {
		CodeableConcept oldMaterial = material;
		material = newMaterial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_CONTAINER__MATERIAL, oldMaterial, newMaterial);
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
	public void setMaterial(CodeableConcept newMaterial) {
		if (newMaterial != material) {
			NotificationChain msgs = null;
			if (material != null)
				msgs = ((InternalEObject)material).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_CONTAINER__MATERIAL, null, msgs);
			if (newMaterial != null)
				msgs = ((InternalEObject)newMaterial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_CONTAINER__MATERIAL, null, msgs);
			msgs = basicSetMaterial(newMaterial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_CONTAINER__MATERIAL, newMaterial, newMaterial));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_CONTAINER__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_CONTAINER__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_CONTAINER__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_CONTAINER__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCap() {
		return cap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCap(CodeableConcept newCap, NotificationChain msgs) {
		CodeableConcept oldCap = cap;
		cap = newCap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_CONTAINER__CAP, oldCap, newCap);
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
	public void setCap(CodeableConcept newCap) {
		if (newCap != cap) {
			NotificationChain msgs = null;
			if (cap != null)
				msgs = ((InternalEObject)cap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_CONTAINER__CAP, null, msgs);
			if (newCap != null)
				msgs = ((InternalEObject)newCap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_CONTAINER__CAP, null, msgs);
			msgs = basicSetCap(newCap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_CONTAINER__CAP, newCap, newCap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.hl7.fhir.String newDescription, NotificationChain msgs) {
		org.hl7.fhir.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_CONTAINER__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(org.hl7.fhir.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_CONTAINER__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_CONTAINER__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_CONTAINER__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapacity(Quantity newCapacity, NotificationChain msgs) {
		Quantity oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_CONTAINER__CAPACITY, oldCapacity, newCapacity);
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
	public void setCapacity(Quantity newCapacity) {
		if (newCapacity != capacity) {
			NotificationChain msgs = null;
			if (capacity != null)
				msgs = ((InternalEObject)capacity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_CONTAINER__CAPACITY, null, msgs);
			if (newCapacity != null)
				msgs = ((InternalEObject)newCapacity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_CONTAINER__CAPACITY, null, msgs);
			msgs = basicSetCapacity(newCapacity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_CONTAINER__CAPACITY, newCapacity, newCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getMinimumVolumeQuantity() {
		return minimumVolumeQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinimumVolumeQuantity(Quantity newMinimumVolumeQuantity, NotificationChain msgs) {
		Quantity oldMinimumVolumeQuantity = minimumVolumeQuantity;
		minimumVolumeQuantity = newMinimumVolumeQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_CONTAINER__MINIMUM_VOLUME_QUANTITY, oldMinimumVolumeQuantity, newMinimumVolumeQuantity);
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
	public void setMinimumVolumeQuantity(Quantity newMinimumVolumeQuantity) {
		if (newMinimumVolumeQuantity != minimumVolumeQuantity) {
			NotificationChain msgs = null;
			if (minimumVolumeQuantity != null)
				msgs = ((InternalEObject)minimumVolumeQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_CONTAINER__MINIMUM_VOLUME_QUANTITY, null, msgs);
			if (newMinimumVolumeQuantity != null)
				msgs = ((InternalEObject)newMinimumVolumeQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_CONTAINER__MINIMUM_VOLUME_QUANTITY, null, msgs);
			msgs = basicSetMinimumVolumeQuantity(newMinimumVolumeQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_CONTAINER__MINIMUM_VOLUME_QUANTITY, newMinimumVolumeQuantity, newMinimumVolumeQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getMinimumVolumeString() {
		return minimumVolumeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinimumVolumeString(org.hl7.fhir.String newMinimumVolumeString, NotificationChain msgs) {
		org.hl7.fhir.String oldMinimumVolumeString = minimumVolumeString;
		minimumVolumeString = newMinimumVolumeString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_CONTAINER__MINIMUM_VOLUME_STRING, oldMinimumVolumeString, newMinimumVolumeString);
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
	public void setMinimumVolumeString(org.hl7.fhir.String newMinimumVolumeString) {
		if (newMinimumVolumeString != minimumVolumeString) {
			NotificationChain msgs = null;
			if (minimumVolumeString != null)
				msgs = ((InternalEObject)minimumVolumeString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_CONTAINER__MINIMUM_VOLUME_STRING, null, msgs);
			if (newMinimumVolumeString != null)
				msgs = ((InternalEObject)newMinimumVolumeString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_CONTAINER__MINIMUM_VOLUME_STRING, null, msgs);
			msgs = basicSetMinimumVolumeString(newMinimumVolumeString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_CONTAINER__MINIMUM_VOLUME_STRING, newMinimumVolumeString, newMinimumVolumeString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpecimenDefinitionAdditive> getAdditive() {
		if (additive == null) {
			additive = new EObjectContainmentEList<SpecimenDefinitionAdditive>(SpecimenDefinitionAdditive.class, this, FhirPackage.SPECIMEN_DEFINITION_CONTAINER__ADDITIVE);
		}
		return additive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getPreparation() {
		return preparation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreparation(org.hl7.fhir.String newPreparation, NotificationChain msgs) {
		org.hl7.fhir.String oldPreparation = preparation;
		preparation = newPreparation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_CONTAINER__PREPARATION, oldPreparation, newPreparation);
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
	public void setPreparation(org.hl7.fhir.String newPreparation) {
		if (newPreparation != preparation) {
			NotificationChain msgs = null;
			if (preparation != null)
				msgs = ((InternalEObject)preparation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_CONTAINER__PREPARATION, null, msgs);
			if (newPreparation != null)
				msgs = ((InternalEObject)newPreparation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_CONTAINER__PREPARATION, null, msgs);
			msgs = basicSetPreparation(newPreparation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_CONTAINER__PREPARATION, newPreparation, newPreparation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER__MATERIAL:
				return basicSetMaterial(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER__CAP:
				return basicSetCap(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER__CAPACITY:
				return basicSetCapacity(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER__MINIMUM_VOLUME_QUANTITY:
				return basicSetMinimumVolumeQuantity(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER__MINIMUM_VOLUME_STRING:
				return basicSetMinimumVolumeString(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER__ADDITIVE:
				return ((InternalEList<?>)getAdditive()).basicRemove(otherEnd, msgs);
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER__PREPARATION:
				return basicSetPreparation(null, msgs);
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
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER__MATERIAL:
				return getMaterial();
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER__TYPE:
				return getType();
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER__CAP:
				return getCap();
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER__DESCRIPTION:
				return getDescription();
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER__CAPACITY:
				return getCapacity();
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER__MINIMUM_VOLUME_QUANTITY:
				return getMinimumVolumeQuantity();
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER__MINIMUM_VOLUME_STRING:
				return getMinimumVolumeString();
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER__ADDITIVE:
				return getAdditive();
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER__PREPARATION:
				return getPreparation();
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
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER__MATERIAL:
				setMaterial((CodeableConcept)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER__CAP:
				setCap((CodeableConcept)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER__CAPACITY:
				setCapacity((Quantity)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER__MINIMUM_VOLUME_QUANTITY:
				setMinimumVolumeQuantity((Quantity)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER__MINIMUM_VOLUME_STRING:
				setMinimumVolumeString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER__ADDITIVE:
				getAdditive().clear();
				getAdditive().addAll((Collection<? extends SpecimenDefinitionAdditive>)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER__PREPARATION:
				setPreparation((org.hl7.fhir.String)newValue);
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
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER__MATERIAL:
				setMaterial((CodeableConcept)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER__CAP:
				setCap((CodeableConcept)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER__CAPACITY:
				setCapacity((Quantity)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER__MINIMUM_VOLUME_QUANTITY:
				setMinimumVolumeQuantity((Quantity)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER__MINIMUM_VOLUME_STRING:
				setMinimumVolumeString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER__ADDITIVE:
				getAdditive().clear();
				return;
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER__PREPARATION:
				setPreparation((org.hl7.fhir.String)null);
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
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER__MATERIAL:
				return material != null;
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER__TYPE:
				return type != null;
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER__CAP:
				return cap != null;
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER__DESCRIPTION:
				return description != null;
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER__CAPACITY:
				return capacity != null;
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER__MINIMUM_VOLUME_QUANTITY:
				return minimumVolumeQuantity != null;
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER__MINIMUM_VOLUME_STRING:
				return minimumVolumeString != null;
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER__ADDITIVE:
				return additive != null && !additive.isEmpty();
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER__PREPARATION:
				return preparation != null;
		}
		return super.eIsSet(featureID);
	}

} //SpecimenDefinitionContainerImpl
