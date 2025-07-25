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
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Range;
import org.hl7.fhir.Reference;
import org.hl7.fhir.SubstanceReferenceInformationTarget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Reference Information Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubstanceReferenceInformationTargetImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceReferenceInformationTargetImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceReferenceInformationTargetImpl#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceReferenceInformationTargetImpl#getOrganism <em>Organism</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceReferenceInformationTargetImpl#getOrganismType <em>Organism Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceReferenceInformationTargetImpl#getAmountQuantity <em>Amount Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceReferenceInformationTargetImpl#getAmountRange <em>Amount Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceReferenceInformationTargetImpl#getAmountString <em>Amount String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceReferenceInformationTargetImpl#getAmountType <em>Amount Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceReferenceInformationTargetImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceReferenceInformationTargetImpl extends BackboneElementImpl implements SubstanceReferenceInformationTarget {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Identifier target;

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
	 * The cached value of the '{@link #getInteraction() <em>Interaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteraction()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept interaction;

	/**
	 * The cached value of the '{@link #getOrganism() <em>Organism</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganism()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept organism;

	/**
	 * The cached value of the '{@link #getOrganismType() <em>Organism Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganismType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept organismType;

	/**
	 * The cached value of the '{@link #getAmountQuantity() <em>Amount Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity amountQuantity;

	/**
	 * The cached value of the '{@link #getAmountRange() <em>Amount Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountRange()
	 * @generated
	 * @ordered
	 */
	protected Range amountRange;

	/**
	 * The cached value of the '{@link #getAmountString() <em>Amount String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String amountString;

	/**
	 * The cached value of the '{@link #getAmountType() <em>Amount Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept amountType;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceReferenceInformationTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubstanceReferenceInformationTarget();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Identifier newTarget, NotificationChain msgs) {
		Identifier oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__TARGET, oldTarget, newTarget);
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
	public void setTarget(Identifier newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__TARGET, newTarget, newTarget));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getInteraction() {
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInteraction(CodeableConcept newInteraction, NotificationChain msgs) {
		CodeableConcept oldInteraction = interaction;
		interaction = newInteraction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__INTERACTION, oldInteraction, newInteraction);
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
	public void setInteraction(CodeableConcept newInteraction) {
		if (newInteraction != interaction) {
			NotificationChain msgs = null;
			if (interaction != null)
				msgs = ((InternalEObject)interaction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__INTERACTION, null, msgs);
			if (newInteraction != null)
				msgs = ((InternalEObject)newInteraction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__INTERACTION, null, msgs);
			msgs = basicSetInteraction(newInteraction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__INTERACTION, newInteraction, newInteraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getOrganism() {
		return organism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganism(CodeableConcept newOrganism, NotificationChain msgs) {
		CodeableConcept oldOrganism = organism;
		organism = newOrganism;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__ORGANISM, oldOrganism, newOrganism);
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
	public void setOrganism(CodeableConcept newOrganism) {
		if (newOrganism != organism) {
			NotificationChain msgs = null;
			if (organism != null)
				msgs = ((InternalEObject)organism).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__ORGANISM, null, msgs);
			if (newOrganism != null)
				msgs = ((InternalEObject)newOrganism).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__ORGANISM, null, msgs);
			msgs = basicSetOrganism(newOrganism, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__ORGANISM, newOrganism, newOrganism));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getOrganismType() {
		return organismType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganismType(CodeableConcept newOrganismType, NotificationChain msgs) {
		CodeableConcept oldOrganismType = organismType;
		organismType = newOrganismType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__ORGANISM_TYPE, oldOrganismType, newOrganismType);
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
	public void setOrganismType(CodeableConcept newOrganismType) {
		if (newOrganismType != organismType) {
			NotificationChain msgs = null;
			if (organismType != null)
				msgs = ((InternalEObject)organismType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__ORGANISM_TYPE, null, msgs);
			if (newOrganismType != null)
				msgs = ((InternalEObject)newOrganismType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__ORGANISM_TYPE, null, msgs);
			msgs = basicSetOrganismType(newOrganismType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__ORGANISM_TYPE, newOrganismType, newOrganismType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getAmountQuantity() {
		return amountQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmountQuantity(Quantity newAmountQuantity, NotificationChain msgs) {
		Quantity oldAmountQuantity = amountQuantity;
		amountQuantity = newAmountQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__AMOUNT_QUANTITY, oldAmountQuantity, newAmountQuantity);
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
	public void setAmountQuantity(Quantity newAmountQuantity) {
		if (newAmountQuantity != amountQuantity) {
			NotificationChain msgs = null;
			if (amountQuantity != null)
				msgs = ((InternalEObject)amountQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__AMOUNT_QUANTITY, null, msgs);
			if (newAmountQuantity != null)
				msgs = ((InternalEObject)newAmountQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__AMOUNT_QUANTITY, null, msgs);
			msgs = basicSetAmountQuantity(newAmountQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__AMOUNT_QUANTITY, newAmountQuantity, newAmountQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Range getAmountRange() {
		return amountRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmountRange(Range newAmountRange, NotificationChain msgs) {
		Range oldAmountRange = amountRange;
		amountRange = newAmountRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__AMOUNT_RANGE, oldAmountRange, newAmountRange);
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
	public void setAmountRange(Range newAmountRange) {
		if (newAmountRange != amountRange) {
			NotificationChain msgs = null;
			if (amountRange != null)
				msgs = ((InternalEObject)amountRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__AMOUNT_RANGE, null, msgs);
			if (newAmountRange != null)
				msgs = ((InternalEObject)newAmountRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__AMOUNT_RANGE, null, msgs);
			msgs = basicSetAmountRange(newAmountRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__AMOUNT_RANGE, newAmountRange, newAmountRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getAmountString() {
		return amountString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmountString(org.hl7.fhir.String newAmountString, NotificationChain msgs) {
		org.hl7.fhir.String oldAmountString = amountString;
		amountString = newAmountString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__AMOUNT_STRING, oldAmountString, newAmountString);
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
	public void setAmountString(org.hl7.fhir.String newAmountString) {
		if (newAmountString != amountString) {
			NotificationChain msgs = null;
			if (amountString != null)
				msgs = ((InternalEObject)amountString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__AMOUNT_STRING, null, msgs);
			if (newAmountString != null)
				msgs = ((InternalEObject)newAmountString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__AMOUNT_STRING, null, msgs);
			msgs = basicSetAmountString(newAmountString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__AMOUNT_STRING, newAmountString, newAmountString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getAmountType() {
		return amountType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmountType(CodeableConcept newAmountType, NotificationChain msgs) {
		CodeableConcept oldAmountType = amountType;
		amountType = newAmountType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__AMOUNT_TYPE, oldAmountType, newAmountType);
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
	public void setAmountType(CodeableConcept newAmountType) {
		if (newAmountType != amountType) {
			NotificationChain msgs = null;
			if (amountType != null)
				msgs = ((InternalEObject)amountType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__AMOUNT_TYPE, null, msgs);
			if (newAmountType != null)
				msgs = ((InternalEObject)newAmountType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__AMOUNT_TYPE, null, msgs);
			msgs = basicSetAmountType(newAmountType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__AMOUNT_TYPE, newAmountType, newAmountType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSource() {
		if (source == null) {
			source = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__TARGET:
				return basicSetTarget(null, msgs);
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__INTERACTION:
				return basicSetInteraction(null, msgs);
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__ORGANISM:
				return basicSetOrganism(null, msgs);
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__ORGANISM_TYPE:
				return basicSetOrganismType(null, msgs);
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__AMOUNT_QUANTITY:
				return basicSetAmountQuantity(null, msgs);
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__AMOUNT_RANGE:
				return basicSetAmountRange(null, msgs);
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__AMOUNT_STRING:
				return basicSetAmountString(null, msgs);
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__AMOUNT_TYPE:
				return basicSetAmountType(null, msgs);
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__TARGET:
				return getTarget();
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__TYPE:
				return getType();
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__INTERACTION:
				return getInteraction();
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__ORGANISM:
				return getOrganism();
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__ORGANISM_TYPE:
				return getOrganismType();
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__AMOUNT_QUANTITY:
				return getAmountQuantity();
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__AMOUNT_RANGE:
				return getAmountRange();
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__AMOUNT_STRING:
				return getAmountString();
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__AMOUNT_TYPE:
				return getAmountType();
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__SOURCE:
				return getSource();
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
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__TARGET:
				setTarget((Identifier)newValue);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__INTERACTION:
				setInteraction((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__ORGANISM:
				setOrganism((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__ORGANISM_TYPE:
				setOrganismType((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__AMOUNT_QUANTITY:
				setAmountQuantity((Quantity)newValue);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__AMOUNT_RANGE:
				setAmountRange((Range)newValue);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__AMOUNT_STRING:
				setAmountString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__AMOUNT_TYPE:
				setAmountType((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends Reference>)newValue);
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
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__TARGET:
				setTarget((Identifier)null);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__INTERACTION:
				setInteraction((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__ORGANISM:
				setOrganism((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__ORGANISM_TYPE:
				setOrganismType((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__AMOUNT_QUANTITY:
				setAmountQuantity((Quantity)null);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__AMOUNT_RANGE:
				setAmountRange((Range)null);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__AMOUNT_STRING:
				setAmountString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__AMOUNT_TYPE:
				setAmountType((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__SOURCE:
				getSource().clear();
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
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__TARGET:
				return target != null;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__TYPE:
				return type != null;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__INTERACTION:
				return interaction != null;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__ORGANISM:
				return organism != null;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__ORGANISM_TYPE:
				return organismType != null;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__AMOUNT_QUANTITY:
				return amountQuantity != null;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__AMOUNT_RANGE:
				return amountRange != null;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__AMOUNT_STRING:
				return amountString != null;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__AMOUNT_TYPE:
				return amountType != null;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET__SOURCE:
				return source != null && !source.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubstanceReferenceInformationTargetImpl
