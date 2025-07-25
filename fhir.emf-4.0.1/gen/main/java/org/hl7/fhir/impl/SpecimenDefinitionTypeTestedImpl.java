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
import org.hl7.fhir.Duration;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.SpecimenContainedPreference;
import org.hl7.fhir.SpecimenDefinitionContainer;
import org.hl7.fhir.SpecimenDefinitionHandling;
import org.hl7.fhir.SpecimenDefinitionTypeTested;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specimen Definition Type Tested</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionTypeTestedImpl#getIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionTypeTestedImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionTypeTestedImpl#getPreference <em>Preference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionTypeTestedImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionTypeTestedImpl#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionTypeTestedImpl#getRetentionTime <em>Retention Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionTypeTestedImpl#getRejectionCriterion <em>Rejection Criterion</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionTypeTestedImpl#getHandling <em>Handling</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecimenDefinitionTypeTestedImpl extends BackboneElementImpl implements SpecimenDefinitionTypeTested {
	/**
	 * The cached value of the '{@link #getIsDerived() <em>Is Derived</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDerived()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean isDerived;

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
	 * The cached value of the '{@link #getPreference() <em>Preference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreference()
	 * @generated
	 * @ordered
	 */
	protected SpecimenContainedPreference preference;

	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected SpecimenDefinitionContainer container;

	/**
	 * The cached value of the '{@link #getRequirement() <em>Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirement()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String requirement;

	/**
	 * The cached value of the '{@link #getRetentionTime() <em>Retention Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetentionTime()
	 * @generated
	 * @ordered
	 */
	protected Duration retentionTime;

	/**
	 * The cached value of the '{@link #getRejectionCriterion() <em>Rejection Criterion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRejectionCriterion()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> rejectionCriterion;

	/**
	 * The cached value of the '{@link #getHandling() <em>Handling</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandling()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecimenDefinitionHandling> handling;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecimenDefinitionTypeTestedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSpecimenDefinitionTypeTested();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getIsDerived() {
		return isDerived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsDerived(org.hl7.fhir.Boolean newIsDerived, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldIsDerived = isDerived;
		isDerived = newIsDerived;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__IS_DERIVED, oldIsDerived, newIsDerived);
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
	public void setIsDerived(org.hl7.fhir.Boolean newIsDerived) {
		if (newIsDerived != isDerived) {
			NotificationChain msgs = null;
			if (isDerived != null)
				msgs = ((InternalEObject)isDerived).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__IS_DERIVED, null, msgs);
			if (newIsDerived != null)
				msgs = ((InternalEObject)newIsDerived).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__IS_DERIVED, null, msgs);
			msgs = basicSetIsDerived(newIsDerived, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__IS_DERIVED, newIsDerived, newIsDerived));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecimenContainedPreference getPreference() {
		return preference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreference(SpecimenContainedPreference newPreference, NotificationChain msgs) {
		SpecimenContainedPreference oldPreference = preference;
		preference = newPreference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__PREFERENCE, oldPreference, newPreference);
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
	public void setPreference(SpecimenContainedPreference newPreference) {
		if (newPreference != preference) {
			NotificationChain msgs = null;
			if (preference != null)
				msgs = ((InternalEObject)preference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__PREFERENCE, null, msgs);
			if (newPreference != null)
				msgs = ((InternalEObject)newPreference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__PREFERENCE, null, msgs);
			msgs = basicSetPreference(newPreference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__PREFERENCE, newPreference, newPreference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecimenDefinitionContainer getContainer() {
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(SpecimenDefinitionContainer newContainer, NotificationChain msgs) {
		SpecimenDefinitionContainer oldContainer = container;
		container = newContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__CONTAINER, oldContainer, newContainer);
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
	public void setContainer(SpecimenDefinitionContainer newContainer) {
		if (newContainer != container) {
			NotificationChain msgs = null;
			if (container != null)
				msgs = ((InternalEObject)container).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__CONTAINER, null, msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__CONTAINER, null, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__CONTAINER, newContainer, newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getRequirement() {
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirement(org.hl7.fhir.String newRequirement, NotificationChain msgs) {
		org.hl7.fhir.String oldRequirement = requirement;
		requirement = newRequirement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__REQUIREMENT, oldRequirement, newRequirement);
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
	public void setRequirement(org.hl7.fhir.String newRequirement) {
		if (newRequirement != requirement) {
			NotificationChain msgs = null;
			if (requirement != null)
				msgs = ((InternalEObject)requirement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__REQUIREMENT, null, msgs);
			if (newRequirement != null)
				msgs = ((InternalEObject)newRequirement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__REQUIREMENT, null, msgs);
			msgs = basicSetRequirement(newRequirement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__REQUIREMENT, newRequirement, newRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getRetentionTime() {
		return retentionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRetentionTime(Duration newRetentionTime, NotificationChain msgs) {
		Duration oldRetentionTime = retentionTime;
		retentionTime = newRetentionTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__RETENTION_TIME, oldRetentionTime, newRetentionTime);
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
	public void setRetentionTime(Duration newRetentionTime) {
		if (newRetentionTime != retentionTime) {
			NotificationChain msgs = null;
			if (retentionTime != null)
				msgs = ((InternalEObject)retentionTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__RETENTION_TIME, null, msgs);
			if (newRetentionTime != null)
				msgs = ((InternalEObject)newRetentionTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__RETENTION_TIME, null, msgs);
			msgs = basicSetRetentionTime(newRetentionTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__RETENTION_TIME, newRetentionTime, newRetentionTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getRejectionCriterion() {
		if (rejectionCriterion == null) {
			rejectionCriterion = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__REJECTION_CRITERION);
		}
		return rejectionCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpecimenDefinitionHandling> getHandling() {
		if (handling == null) {
			handling = new EObjectContainmentEList<SpecimenDefinitionHandling>(SpecimenDefinitionHandling.class, this, FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__HANDLING);
		}
		return handling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__IS_DERIVED:
				return basicSetIsDerived(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__PREFERENCE:
				return basicSetPreference(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__CONTAINER:
				return basicSetContainer(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__REQUIREMENT:
				return basicSetRequirement(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__RETENTION_TIME:
				return basicSetRetentionTime(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__REJECTION_CRITERION:
				return ((InternalEList<?>)getRejectionCriterion()).basicRemove(otherEnd, msgs);
			case FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__HANDLING:
				return ((InternalEList<?>)getHandling()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__IS_DERIVED:
				return getIsDerived();
			case FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__TYPE:
				return getType();
			case FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__PREFERENCE:
				return getPreference();
			case FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__CONTAINER:
				return getContainer();
			case FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__REQUIREMENT:
				return getRequirement();
			case FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__RETENTION_TIME:
				return getRetentionTime();
			case FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__REJECTION_CRITERION:
				return getRejectionCriterion();
			case FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__HANDLING:
				return getHandling();
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
			case FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__IS_DERIVED:
				setIsDerived((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__PREFERENCE:
				setPreference((SpecimenContainedPreference)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__CONTAINER:
				setContainer((SpecimenDefinitionContainer)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__REQUIREMENT:
				setRequirement((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__RETENTION_TIME:
				setRetentionTime((Duration)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__REJECTION_CRITERION:
				getRejectionCriterion().clear();
				getRejectionCriterion().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__HANDLING:
				getHandling().clear();
				getHandling().addAll((Collection<? extends SpecimenDefinitionHandling>)newValue);
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
			case FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__IS_DERIVED:
				setIsDerived((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__PREFERENCE:
				setPreference((SpecimenContainedPreference)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__CONTAINER:
				setContainer((SpecimenDefinitionContainer)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__REQUIREMENT:
				setRequirement((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__RETENTION_TIME:
				setRetentionTime((Duration)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__REJECTION_CRITERION:
				getRejectionCriterion().clear();
				return;
			case FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__HANDLING:
				getHandling().clear();
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
			case FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__IS_DERIVED:
				return isDerived != null;
			case FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__TYPE:
				return type != null;
			case FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__PREFERENCE:
				return preference != null;
			case FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__CONTAINER:
				return container != null;
			case FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__REQUIREMENT:
				return requirement != null;
			case FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__RETENTION_TIME:
				return retentionTime != null;
			case FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__REJECTION_CRITERION:
				return rejectionCriterion != null && !rejectionCriterion.isEmpty();
			case FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED__HANDLING:
				return handling != null && !handling.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpecimenDefinitionTypeTestedImpl
