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

import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.GraphDefinitionLink;
import org.hl7.fhir.GraphDefinitionTarget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph Definition Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.GraphDefinitionLinkImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GraphDefinitionLinkImpl#getSliceName <em>Slice Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GraphDefinitionLinkImpl#getMin <em>Min</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GraphDefinitionLinkImpl#getMax <em>Max</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GraphDefinitionLinkImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GraphDefinitionLinkImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphDefinitionLinkImpl extends BackboneElementImpl implements GraphDefinitionLink {
	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String path;

	/**
	 * The cached value of the '{@link #getSliceName() <em>Slice Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSliceName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String sliceName;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer min;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String max;

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
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphDefinitionTarget> target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphDefinitionLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getGraphDefinitionLink();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPath(org.hl7.fhir.String newPath, NotificationChain msgs) {
		org.hl7.fhir.String oldPath = path;
		path = newPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GRAPH_DEFINITION_LINK__PATH, oldPath, newPath);
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
	public void setPath(org.hl7.fhir.String newPath) {
		if (newPath != path) {
			NotificationChain msgs = null;
			if (path != null)
				msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GRAPH_DEFINITION_LINK__PATH, null, msgs);
			if (newPath != null)
				msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GRAPH_DEFINITION_LINK__PATH, null, msgs);
			msgs = basicSetPath(newPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GRAPH_DEFINITION_LINK__PATH, newPath, newPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getSliceName() {
		return sliceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSliceName(org.hl7.fhir.String newSliceName, NotificationChain msgs) {
		org.hl7.fhir.String oldSliceName = sliceName;
		sliceName = newSliceName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GRAPH_DEFINITION_LINK__SLICE_NAME, oldSliceName, newSliceName);
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
	public void setSliceName(org.hl7.fhir.String newSliceName) {
		if (newSliceName != sliceName) {
			NotificationChain msgs = null;
			if (sliceName != null)
				msgs = ((InternalEObject)sliceName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GRAPH_DEFINITION_LINK__SLICE_NAME, null, msgs);
			if (newSliceName != null)
				msgs = ((InternalEObject)newSliceName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GRAPH_DEFINITION_LINK__SLICE_NAME, null, msgs);
			msgs = basicSetSliceName(newSliceName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GRAPH_DEFINITION_LINK__SLICE_NAME, newSliceName, newSliceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Integer getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMin(org.hl7.fhir.Integer newMin, NotificationChain msgs) {
		org.hl7.fhir.Integer oldMin = min;
		min = newMin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GRAPH_DEFINITION_LINK__MIN, oldMin, newMin);
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
	public void setMin(org.hl7.fhir.Integer newMin) {
		if (newMin != min) {
			NotificationChain msgs = null;
			if (min != null)
				msgs = ((InternalEObject)min).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GRAPH_DEFINITION_LINK__MIN, null, msgs);
			if (newMin != null)
				msgs = ((InternalEObject)newMin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GRAPH_DEFINITION_LINK__MIN, null, msgs);
			msgs = basicSetMin(newMin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GRAPH_DEFINITION_LINK__MIN, newMin, newMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMax(org.hl7.fhir.String newMax, NotificationChain msgs) {
		org.hl7.fhir.String oldMax = max;
		max = newMax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GRAPH_DEFINITION_LINK__MAX, oldMax, newMax);
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
	public void setMax(org.hl7.fhir.String newMax) {
		if (newMax != max) {
			NotificationChain msgs = null;
			if (max != null)
				msgs = ((InternalEObject)max).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GRAPH_DEFINITION_LINK__MAX, null, msgs);
			if (newMax != null)
				msgs = ((InternalEObject)newMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GRAPH_DEFINITION_LINK__MAX, null, msgs);
			msgs = basicSetMax(newMax, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GRAPH_DEFINITION_LINK__MAX, newMax, newMax));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GRAPH_DEFINITION_LINK__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GRAPH_DEFINITION_LINK__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GRAPH_DEFINITION_LINK__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GRAPH_DEFINITION_LINK__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GraphDefinitionTarget> getTarget() {
		if (target == null) {
			target = new EObjectContainmentEList<GraphDefinitionTarget>(GraphDefinitionTarget.class, this, FhirPackage.GRAPH_DEFINITION_LINK__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.GRAPH_DEFINITION_LINK__PATH:
				return basicSetPath(null, msgs);
			case FhirPackage.GRAPH_DEFINITION_LINK__SLICE_NAME:
				return basicSetSliceName(null, msgs);
			case FhirPackage.GRAPH_DEFINITION_LINK__MIN:
				return basicSetMin(null, msgs);
			case FhirPackage.GRAPH_DEFINITION_LINK__MAX:
				return basicSetMax(null, msgs);
			case FhirPackage.GRAPH_DEFINITION_LINK__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.GRAPH_DEFINITION_LINK__TARGET:
				return ((InternalEList<?>)getTarget()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.GRAPH_DEFINITION_LINK__PATH:
				return getPath();
			case FhirPackage.GRAPH_DEFINITION_LINK__SLICE_NAME:
				return getSliceName();
			case FhirPackage.GRAPH_DEFINITION_LINK__MIN:
				return getMin();
			case FhirPackage.GRAPH_DEFINITION_LINK__MAX:
				return getMax();
			case FhirPackage.GRAPH_DEFINITION_LINK__DESCRIPTION:
				return getDescription();
			case FhirPackage.GRAPH_DEFINITION_LINK__TARGET:
				return getTarget();
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
			case FhirPackage.GRAPH_DEFINITION_LINK__PATH:
				setPath((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.GRAPH_DEFINITION_LINK__SLICE_NAME:
				setSliceName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.GRAPH_DEFINITION_LINK__MIN:
				setMin((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.GRAPH_DEFINITION_LINK__MAX:
				setMax((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.GRAPH_DEFINITION_LINK__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.GRAPH_DEFINITION_LINK__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends GraphDefinitionTarget>)newValue);
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
			case FhirPackage.GRAPH_DEFINITION_LINK__PATH:
				setPath((org.hl7.fhir.String)null);
				return;
			case FhirPackage.GRAPH_DEFINITION_LINK__SLICE_NAME:
				setSliceName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.GRAPH_DEFINITION_LINK__MIN:
				setMin((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.GRAPH_DEFINITION_LINK__MAX:
				setMax((org.hl7.fhir.String)null);
				return;
			case FhirPackage.GRAPH_DEFINITION_LINK__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.GRAPH_DEFINITION_LINK__TARGET:
				getTarget().clear();
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
			case FhirPackage.GRAPH_DEFINITION_LINK__PATH:
				return path != null;
			case FhirPackage.GRAPH_DEFINITION_LINK__SLICE_NAME:
				return sliceName != null;
			case FhirPackage.GRAPH_DEFINITION_LINK__MIN:
				return min != null;
			case FhirPackage.GRAPH_DEFINITION_LINK__MAX:
				return max != null;
			case FhirPackage.GRAPH_DEFINITION_LINK__DESCRIPTION:
				return description != null;
			case FhirPackage.GRAPH_DEFINITION_LINK__TARGET:
				return target != null && !target.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GraphDefinitionLinkImpl
