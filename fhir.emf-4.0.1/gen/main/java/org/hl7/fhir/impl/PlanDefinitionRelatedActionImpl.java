/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.ActionRelationshipType;
import org.hl7.fhir.Duration;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Id;
import org.hl7.fhir.PlanDefinitionRelatedAction;
import org.hl7.fhir.Range;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plan Definition Related Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.PlanDefinitionRelatedActionImpl#getActionId <em>Action Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PlanDefinitionRelatedActionImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PlanDefinitionRelatedActionImpl#getOffsetDuration <em>Offset Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PlanDefinitionRelatedActionImpl#getOffsetRange <em>Offset Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlanDefinitionRelatedActionImpl extends BackboneElementImpl implements PlanDefinitionRelatedAction {
	/**
	 * The cached value of the '{@link #getActionId() <em>Action Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionId()
	 * @generated
	 * @ordered
	 */
	protected Id actionId;

	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected ActionRelationshipType relationship;

	/**
	 * The cached value of the '{@link #getOffsetDuration() <em>Offset Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration offsetDuration;

	/**
	 * The cached value of the '{@link #getOffsetRange() <em>Offset Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetRange()
	 * @generated
	 * @ordered
	 */
	protected Range offsetRange;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanDefinitionRelatedActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getPlanDefinitionRelatedAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Id getActionId() {
		return actionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActionId(Id newActionId, NotificationChain msgs) {
		Id oldActionId = actionId;
		actionId = newActionId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_RELATED_ACTION__ACTION_ID, oldActionId, newActionId);
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
	public void setActionId(Id newActionId) {
		if (newActionId != actionId) {
			NotificationChain msgs = null;
			if (actionId != null)
				msgs = ((InternalEObject)actionId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_RELATED_ACTION__ACTION_ID, null, msgs);
			if (newActionId != null)
				msgs = ((InternalEObject)newActionId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_RELATED_ACTION__ACTION_ID, null, msgs);
			msgs = basicSetActionId(newActionId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_RELATED_ACTION__ACTION_ID, newActionId, newActionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionRelationshipType getRelationship() {
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationship(ActionRelationshipType newRelationship, NotificationChain msgs) {
		ActionRelationshipType oldRelationship = relationship;
		relationship = newRelationship;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_RELATED_ACTION__RELATIONSHIP, oldRelationship, newRelationship);
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
	public void setRelationship(ActionRelationshipType newRelationship) {
		if (newRelationship != relationship) {
			NotificationChain msgs = null;
			if (relationship != null)
				msgs = ((InternalEObject)relationship).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_RELATED_ACTION__RELATIONSHIP, null, msgs);
			if (newRelationship != null)
				msgs = ((InternalEObject)newRelationship).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_RELATED_ACTION__RELATIONSHIP, null, msgs);
			msgs = basicSetRelationship(newRelationship, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_RELATED_ACTION__RELATIONSHIP, newRelationship, newRelationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getOffsetDuration() {
		return offsetDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffsetDuration(Duration newOffsetDuration, NotificationChain msgs) {
		Duration oldOffsetDuration = offsetDuration;
		offsetDuration = newOffsetDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_RELATED_ACTION__OFFSET_DURATION, oldOffsetDuration, newOffsetDuration);
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
	public void setOffsetDuration(Duration newOffsetDuration) {
		if (newOffsetDuration != offsetDuration) {
			NotificationChain msgs = null;
			if (offsetDuration != null)
				msgs = ((InternalEObject)offsetDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_RELATED_ACTION__OFFSET_DURATION, null, msgs);
			if (newOffsetDuration != null)
				msgs = ((InternalEObject)newOffsetDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_RELATED_ACTION__OFFSET_DURATION, null, msgs);
			msgs = basicSetOffsetDuration(newOffsetDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_RELATED_ACTION__OFFSET_DURATION, newOffsetDuration, newOffsetDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Range getOffsetRange() {
		return offsetRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffsetRange(Range newOffsetRange, NotificationChain msgs) {
		Range oldOffsetRange = offsetRange;
		offsetRange = newOffsetRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_RELATED_ACTION__OFFSET_RANGE, oldOffsetRange, newOffsetRange);
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
	public void setOffsetRange(Range newOffsetRange) {
		if (newOffsetRange != offsetRange) {
			NotificationChain msgs = null;
			if (offsetRange != null)
				msgs = ((InternalEObject)offsetRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_RELATED_ACTION__OFFSET_RANGE, null, msgs);
			if (newOffsetRange != null)
				msgs = ((InternalEObject)newOffsetRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PLAN_DEFINITION_RELATED_ACTION__OFFSET_RANGE, null, msgs);
			msgs = basicSetOffsetRange(newOffsetRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PLAN_DEFINITION_RELATED_ACTION__OFFSET_RANGE, newOffsetRange, newOffsetRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PLAN_DEFINITION_RELATED_ACTION__ACTION_ID:
				return basicSetActionId(null, msgs);
			case FhirPackage.PLAN_DEFINITION_RELATED_ACTION__RELATIONSHIP:
				return basicSetRelationship(null, msgs);
			case FhirPackage.PLAN_DEFINITION_RELATED_ACTION__OFFSET_DURATION:
				return basicSetOffsetDuration(null, msgs);
			case FhirPackage.PLAN_DEFINITION_RELATED_ACTION__OFFSET_RANGE:
				return basicSetOffsetRange(null, msgs);
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
			case FhirPackage.PLAN_DEFINITION_RELATED_ACTION__ACTION_ID:
				return getActionId();
			case FhirPackage.PLAN_DEFINITION_RELATED_ACTION__RELATIONSHIP:
				return getRelationship();
			case FhirPackage.PLAN_DEFINITION_RELATED_ACTION__OFFSET_DURATION:
				return getOffsetDuration();
			case FhirPackage.PLAN_DEFINITION_RELATED_ACTION__OFFSET_RANGE:
				return getOffsetRange();
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
			case FhirPackage.PLAN_DEFINITION_RELATED_ACTION__ACTION_ID:
				setActionId((Id)newValue);
				return;
			case FhirPackage.PLAN_DEFINITION_RELATED_ACTION__RELATIONSHIP:
				setRelationship((ActionRelationshipType)newValue);
				return;
			case FhirPackage.PLAN_DEFINITION_RELATED_ACTION__OFFSET_DURATION:
				setOffsetDuration((Duration)newValue);
				return;
			case FhirPackage.PLAN_DEFINITION_RELATED_ACTION__OFFSET_RANGE:
				setOffsetRange((Range)newValue);
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
			case FhirPackage.PLAN_DEFINITION_RELATED_ACTION__ACTION_ID:
				setActionId((Id)null);
				return;
			case FhirPackage.PLAN_DEFINITION_RELATED_ACTION__RELATIONSHIP:
				setRelationship((ActionRelationshipType)null);
				return;
			case FhirPackage.PLAN_DEFINITION_RELATED_ACTION__OFFSET_DURATION:
				setOffsetDuration((Duration)null);
				return;
			case FhirPackage.PLAN_DEFINITION_RELATED_ACTION__OFFSET_RANGE:
				setOffsetRange((Range)null);
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
			case FhirPackage.PLAN_DEFINITION_RELATED_ACTION__ACTION_ID:
				return actionId != null;
			case FhirPackage.PLAN_DEFINITION_RELATED_ACTION__RELATIONSHIP:
				return relationship != null;
			case FhirPackage.PLAN_DEFINITION_RELATED_ACTION__OFFSET_DURATION:
				return offsetDuration != null;
			case FhirPackage.PLAN_DEFINITION_RELATED_ACTION__OFFSET_RANGE:
				return offsetRange != null;
		}
		return super.eIsSet(featureID);
	}

} //PlanDefinitionRelatedActionImpl
