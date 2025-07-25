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
import org.hl7.fhir.MedicinalProductInteraction;
import org.hl7.fhir.MedicinalProductInteractionInteractant;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicinal Product Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductInteractionImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductInteractionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductInteractionImpl#getInteractant <em>Interactant</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductInteractionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductInteractionImpl#getEffect <em>Effect</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductInteractionImpl#getIncidence <em>Incidence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductInteractionImpl#getManagement <em>Management</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductInteractionImpl extends DomainResourceImpl implements MedicinalProductInteraction {
	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> subject;

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
	 * The cached value of the '{@link #getInteractant() <em>Interactant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractant()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductInteractionInteractant> interactant;

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
	 * The cached value of the '{@link #getEffect() <em>Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept effect;

	/**
	 * The cached value of the '{@link #getIncidence() <em>Incidence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidence()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept incidence;

	/**
	 * The cached value of the '{@link #getManagement() <em>Management</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagement()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept management;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductInteractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicinalProductInteraction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSubject() {
		if (subject == null) {
			subject = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICINAL_PRODUCT_INTERACTION__SUBJECT);
		}
		return subject;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INTERACTION__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INTERACTION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INTERACTION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INTERACTION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicinalProductInteractionInteractant> getInteractant() {
		if (interactant == null) {
			interactant = new EObjectContainmentEList<MedicinalProductInteractionInteractant>(MedicinalProductInteractionInteractant.class, this, FhirPackage.MEDICINAL_PRODUCT_INTERACTION__INTERACTANT);
		}
		return interactant;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INTERACTION__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INTERACTION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INTERACTION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INTERACTION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getEffect() {
		return effect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffect(CodeableConcept newEffect, NotificationChain msgs) {
		CodeableConcept oldEffect = effect;
		effect = newEffect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INTERACTION__EFFECT, oldEffect, newEffect);
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
	public void setEffect(CodeableConcept newEffect) {
		if (newEffect != effect) {
			NotificationChain msgs = null;
			if (effect != null)
				msgs = ((InternalEObject)effect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INTERACTION__EFFECT, null, msgs);
			if (newEffect != null)
				msgs = ((InternalEObject)newEffect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INTERACTION__EFFECT, null, msgs);
			msgs = basicSetEffect(newEffect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INTERACTION__EFFECT, newEffect, newEffect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getIncidence() {
		return incidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncidence(CodeableConcept newIncidence, NotificationChain msgs) {
		CodeableConcept oldIncidence = incidence;
		incidence = newIncidence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INTERACTION__INCIDENCE, oldIncidence, newIncidence);
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
	public void setIncidence(CodeableConcept newIncidence) {
		if (newIncidence != incidence) {
			NotificationChain msgs = null;
			if (incidence != null)
				msgs = ((InternalEObject)incidence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INTERACTION__INCIDENCE, null, msgs);
			if (newIncidence != null)
				msgs = ((InternalEObject)newIncidence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INTERACTION__INCIDENCE, null, msgs);
			msgs = basicSetIncidence(newIncidence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INTERACTION__INCIDENCE, newIncidence, newIncidence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getManagement() {
		return management;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManagement(CodeableConcept newManagement, NotificationChain msgs) {
		CodeableConcept oldManagement = management;
		management = newManagement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INTERACTION__MANAGEMENT, oldManagement, newManagement);
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
	public void setManagement(CodeableConcept newManagement) {
		if (newManagement != management) {
			NotificationChain msgs = null;
			if (management != null)
				msgs = ((InternalEObject)management).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INTERACTION__MANAGEMENT, null, msgs);
			if (newManagement != null)
				msgs = ((InternalEObject)newManagement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INTERACTION__MANAGEMENT, null, msgs);
			msgs = basicSetManagement(newManagement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INTERACTION__MANAGEMENT, newManagement, newManagement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION__SUBJECT:
				return ((InternalEList<?>)getSubject()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION__INTERACTANT:
				return ((InternalEList<?>)getInteractant()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION__EFFECT:
				return basicSetEffect(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION__INCIDENCE:
				return basicSetIncidence(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION__MANAGEMENT:
				return basicSetManagement(null, msgs);
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
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION__SUBJECT:
				return getSubject();
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION__DESCRIPTION:
				return getDescription();
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION__INTERACTANT:
				return getInteractant();
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION__TYPE:
				return getType();
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION__EFFECT:
				return getEffect();
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION__INCIDENCE:
				return getIncidence();
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION__MANAGEMENT:
				return getManagement();
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
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION__SUBJECT:
				getSubject().clear();
				getSubject().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION__INTERACTANT:
				getInteractant().clear();
				getInteractant().addAll((Collection<? extends MedicinalProductInteractionInteractant>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION__EFFECT:
				setEffect((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION__INCIDENCE:
				setIncidence((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION__MANAGEMENT:
				setManagement((CodeableConcept)newValue);
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
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION__SUBJECT:
				getSubject().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION__INTERACTANT:
				getInteractant().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION__EFFECT:
				setEffect((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION__INCIDENCE:
				setIncidence((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION__MANAGEMENT:
				setManagement((CodeableConcept)null);
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
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION__SUBJECT:
				return subject != null && !subject.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION__DESCRIPTION:
				return description != null;
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION__INTERACTANT:
				return interactant != null && !interactant.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION__TYPE:
				return type != null;
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION__EFFECT:
				return effect != null;
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION__INCIDENCE:
				return incidence != null;
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION__MANAGEMENT:
				return management != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductInteractionImpl
