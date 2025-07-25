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

import org.hl7.fhir.Canonical;
import org.hl7.fhir.FHIRVersion;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Id;
import org.hl7.fhir.ImplementationGuideResource;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation Guide Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideResourceImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideResourceImpl#getFhirVersion <em>Fhir Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideResourceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideResourceImpl#getExampleBoolean <em>Example Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideResourceImpl#getExampleCanonical <em>Example Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideResourceImpl#getGroupingId <em>Grouping Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplementationGuideResourceImpl extends BackboneElementImpl implements ImplementationGuideResource {
	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected Reference reference;

	/**
	 * The cached value of the '{@link #getFhirVersion() <em>Fhir Version</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFhirVersion()
	 * @generated
	 * @ordered
	 */
	protected EList<FHIRVersion> fhirVersion;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String name;

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
	 * The cached value of the '{@link #getExampleBoolean() <em>Example Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleBoolean()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean exampleBoolean;

	/**
	 * The cached value of the '{@link #getExampleCanonical() <em>Example Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleCanonical()
	 * @generated
	 * @ordered
	 */
	protected Canonical exampleCanonical;

	/**
	 * The cached value of the '{@link #getGroupingId() <em>Grouping Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupingId()
	 * @generated
	 * @ordered
	 */
	protected Id groupingId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationGuideResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getImplementationGuideResource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReference(Reference newReference, NotificationChain msgs) {
		Reference oldReference = reference;
		reference = newReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__REFERENCE, oldReference, newReference);
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
	public void setReference(Reference newReference) {
		if (newReference != reference) {
			NotificationChain msgs = null;
			if (reference != null)
				msgs = ((InternalEObject)reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__REFERENCE, null, msgs);
			if (newReference != null)
				msgs = ((InternalEObject)newReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__REFERENCE, null, msgs);
			msgs = basicSetReference(newReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__REFERENCE, newReference, newReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FHIRVersion> getFhirVersion() {
		if (fhirVersion == null) {
			fhirVersion = new EObjectContainmentEList<FHIRVersion>(FHIRVersion.class, this, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__FHIR_VERSION);
		}
		return fhirVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.hl7.fhir.String newName, NotificationChain msgs) {
		org.hl7.fhir.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__NAME, oldName, newName);
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
	public void setName(org.hl7.fhir.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__NAME, newName, newName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getExampleBoolean() {
		return exampleBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExampleBoolean(org.hl7.fhir.Boolean newExampleBoolean, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldExampleBoolean = exampleBoolean;
		exampleBoolean = newExampleBoolean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__EXAMPLE_BOOLEAN, oldExampleBoolean, newExampleBoolean);
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
	public void setExampleBoolean(org.hl7.fhir.Boolean newExampleBoolean) {
		if (newExampleBoolean != exampleBoolean) {
			NotificationChain msgs = null;
			if (exampleBoolean != null)
				msgs = ((InternalEObject)exampleBoolean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__EXAMPLE_BOOLEAN, null, msgs);
			if (newExampleBoolean != null)
				msgs = ((InternalEObject)newExampleBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__EXAMPLE_BOOLEAN, null, msgs);
			msgs = basicSetExampleBoolean(newExampleBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__EXAMPLE_BOOLEAN, newExampleBoolean, newExampleBoolean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Canonical getExampleCanonical() {
		return exampleCanonical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExampleCanonical(Canonical newExampleCanonical, NotificationChain msgs) {
		Canonical oldExampleCanonical = exampleCanonical;
		exampleCanonical = newExampleCanonical;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__EXAMPLE_CANONICAL, oldExampleCanonical, newExampleCanonical);
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
	public void setExampleCanonical(Canonical newExampleCanonical) {
		if (newExampleCanonical != exampleCanonical) {
			NotificationChain msgs = null;
			if (exampleCanonical != null)
				msgs = ((InternalEObject)exampleCanonical).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__EXAMPLE_CANONICAL, null, msgs);
			if (newExampleCanonical != null)
				msgs = ((InternalEObject)newExampleCanonical).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__EXAMPLE_CANONICAL, null, msgs);
			msgs = basicSetExampleCanonical(newExampleCanonical, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__EXAMPLE_CANONICAL, newExampleCanonical, newExampleCanonical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Id getGroupingId() {
		return groupingId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroupingId(Id newGroupingId, NotificationChain msgs) {
		Id oldGroupingId = groupingId;
		groupingId = newGroupingId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__GROUPING_ID, oldGroupingId, newGroupingId);
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
	public void setGroupingId(Id newGroupingId) {
		if (newGroupingId != groupingId) {
			NotificationChain msgs = null;
			if (groupingId != null)
				msgs = ((InternalEObject)groupingId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__GROUPING_ID, null, msgs);
			if (newGroupingId != null)
				msgs = ((InternalEObject)newGroupingId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__GROUPING_ID, null, msgs);
			msgs = basicSetGroupingId(newGroupingId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__GROUPING_ID, newGroupingId, newGroupingId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__REFERENCE:
				return basicSetReference(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__FHIR_VERSION:
				return ((InternalEList<?>)getFhirVersion()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__EXAMPLE_BOOLEAN:
				return basicSetExampleBoolean(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__EXAMPLE_CANONICAL:
				return basicSetExampleCanonical(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__GROUPING_ID:
				return basicSetGroupingId(null, msgs);
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
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__REFERENCE:
				return getReference();
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__FHIR_VERSION:
				return getFhirVersion();
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__NAME:
				return getName();
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__DESCRIPTION:
				return getDescription();
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__EXAMPLE_BOOLEAN:
				return getExampleBoolean();
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__EXAMPLE_CANONICAL:
				return getExampleCanonical();
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__GROUPING_ID:
				return getGroupingId();
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
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__REFERENCE:
				setReference((Reference)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__FHIR_VERSION:
				getFhirVersion().clear();
				getFhirVersion().addAll((Collection<? extends FHIRVersion>)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__EXAMPLE_BOOLEAN:
				setExampleBoolean((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__EXAMPLE_CANONICAL:
				setExampleCanonical((Canonical)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__GROUPING_ID:
				setGroupingId((Id)newValue);
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
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__REFERENCE:
				setReference((Reference)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__FHIR_VERSION:
				getFhirVersion().clear();
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__EXAMPLE_BOOLEAN:
				setExampleBoolean((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__EXAMPLE_CANONICAL:
				setExampleCanonical((Canonical)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__GROUPING_ID:
				setGroupingId((Id)null);
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
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__REFERENCE:
				return reference != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__FHIR_VERSION:
				return fhirVersion != null && !fhirVersion.isEmpty();
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__NAME:
				return name != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__DESCRIPTION:
				return description != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__EXAMPLE_BOOLEAN:
				return exampleBoolean != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__EXAMPLE_CANONICAL:
				return exampleCanonical != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__GROUPING_ID:
				return groupingId != null;
		}
		return super.eIsSet(featureID);
	}

} //ImplementationGuideResourceImpl
