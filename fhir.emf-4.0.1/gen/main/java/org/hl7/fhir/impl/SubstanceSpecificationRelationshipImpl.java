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
import org.hl7.fhir.Range;
import org.hl7.fhir.Ratio;
import org.hl7.fhir.Reference;
import org.hl7.fhir.SubstanceSpecificationRelationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Specification Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationRelationshipImpl#getSubstanceReference <em>Substance Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationRelationshipImpl#getSubstanceCodeableConcept <em>Substance Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationRelationshipImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationRelationshipImpl#getIsDefining <em>Is Defining</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationRelationshipImpl#getAmountQuantity <em>Amount Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationRelationshipImpl#getAmountRange <em>Amount Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationRelationshipImpl#getAmountRatio <em>Amount Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationRelationshipImpl#getAmountString <em>Amount String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationRelationshipImpl#getAmountRatioLowLimit <em>Amount Ratio Low Limit</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationRelationshipImpl#getAmountType <em>Amount Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationRelationshipImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceSpecificationRelationshipImpl extends BackboneElementImpl implements SubstanceSpecificationRelationship {
	/**
	 * The cached value of the '{@link #getSubstanceReference() <em>Substance Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstanceReference()
	 * @generated
	 * @ordered
	 */
	protected Reference substanceReference;

	/**
	 * The cached value of the '{@link #getSubstanceCodeableConcept() <em>Substance Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstanceCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept substanceCodeableConcept;

	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept relationship;

	/**
	 * The cached value of the '{@link #getIsDefining() <em>Is Defining</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDefining()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean isDefining;

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
	 * The cached value of the '{@link #getAmountRatio() <em>Amount Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountRatio()
	 * @generated
	 * @ordered
	 */
	protected Ratio amountRatio;

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
	 * The cached value of the '{@link #getAmountRatioLowLimit() <em>Amount Ratio Low Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountRatioLowLimit()
	 * @generated
	 * @ordered
	 */
	protected Ratio amountRatioLowLimit;

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
	protected SubstanceSpecificationRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubstanceSpecificationRelationship();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getSubstanceReference() {
		return substanceReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstanceReference(Reference newSubstanceReference, NotificationChain msgs) {
		Reference oldSubstanceReference = substanceReference;
		substanceReference = newSubstanceReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__SUBSTANCE_REFERENCE, oldSubstanceReference, newSubstanceReference);
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
	public void setSubstanceReference(Reference newSubstanceReference) {
		if (newSubstanceReference != substanceReference) {
			NotificationChain msgs = null;
			if (substanceReference != null)
				msgs = ((InternalEObject)substanceReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__SUBSTANCE_REFERENCE, null, msgs);
			if (newSubstanceReference != null)
				msgs = ((InternalEObject)newSubstanceReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__SUBSTANCE_REFERENCE, null, msgs);
			msgs = basicSetSubstanceReference(newSubstanceReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__SUBSTANCE_REFERENCE, newSubstanceReference, newSubstanceReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getSubstanceCodeableConcept() {
		return substanceCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstanceCodeableConcept(CodeableConcept newSubstanceCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldSubstanceCodeableConcept = substanceCodeableConcept;
		substanceCodeableConcept = newSubstanceCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__SUBSTANCE_CODEABLE_CONCEPT, oldSubstanceCodeableConcept, newSubstanceCodeableConcept);
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
	public void setSubstanceCodeableConcept(CodeableConcept newSubstanceCodeableConcept) {
		if (newSubstanceCodeableConcept != substanceCodeableConcept) {
			NotificationChain msgs = null;
			if (substanceCodeableConcept != null)
				msgs = ((InternalEObject)substanceCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__SUBSTANCE_CODEABLE_CONCEPT, null, msgs);
			if (newSubstanceCodeableConcept != null)
				msgs = ((InternalEObject)newSubstanceCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__SUBSTANCE_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetSubstanceCodeableConcept(newSubstanceCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__SUBSTANCE_CODEABLE_CONCEPT, newSubstanceCodeableConcept, newSubstanceCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getRelationship() {
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationship(CodeableConcept newRelationship, NotificationChain msgs) {
		CodeableConcept oldRelationship = relationship;
		relationship = newRelationship;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__RELATIONSHIP, oldRelationship, newRelationship);
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
	public void setRelationship(CodeableConcept newRelationship) {
		if (newRelationship != relationship) {
			NotificationChain msgs = null;
			if (relationship != null)
				msgs = ((InternalEObject)relationship).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__RELATIONSHIP, null, msgs);
			if (newRelationship != null)
				msgs = ((InternalEObject)newRelationship).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__RELATIONSHIP, null, msgs);
			msgs = basicSetRelationship(newRelationship, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__RELATIONSHIP, newRelationship, newRelationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getIsDefining() {
		return isDefining;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsDefining(org.hl7.fhir.Boolean newIsDefining, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldIsDefining = isDefining;
		isDefining = newIsDefining;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__IS_DEFINING, oldIsDefining, newIsDefining);
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
	public void setIsDefining(org.hl7.fhir.Boolean newIsDefining) {
		if (newIsDefining != isDefining) {
			NotificationChain msgs = null;
			if (isDefining != null)
				msgs = ((InternalEObject)isDefining).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__IS_DEFINING, null, msgs);
			if (newIsDefining != null)
				msgs = ((InternalEObject)newIsDefining).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__IS_DEFINING, null, msgs);
			msgs = basicSetIsDefining(newIsDefining, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__IS_DEFINING, newIsDefining, newIsDefining));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_QUANTITY, oldAmountQuantity, newAmountQuantity);
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
				msgs = ((InternalEObject)amountQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_QUANTITY, null, msgs);
			if (newAmountQuantity != null)
				msgs = ((InternalEObject)newAmountQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_QUANTITY, null, msgs);
			msgs = basicSetAmountQuantity(newAmountQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_QUANTITY, newAmountQuantity, newAmountQuantity));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_RANGE, oldAmountRange, newAmountRange);
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
				msgs = ((InternalEObject)amountRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_RANGE, null, msgs);
			if (newAmountRange != null)
				msgs = ((InternalEObject)newAmountRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_RANGE, null, msgs);
			msgs = basicSetAmountRange(newAmountRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_RANGE, newAmountRange, newAmountRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ratio getAmountRatio() {
		return amountRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmountRatio(Ratio newAmountRatio, NotificationChain msgs) {
		Ratio oldAmountRatio = amountRatio;
		amountRatio = newAmountRatio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_RATIO, oldAmountRatio, newAmountRatio);
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
	public void setAmountRatio(Ratio newAmountRatio) {
		if (newAmountRatio != amountRatio) {
			NotificationChain msgs = null;
			if (amountRatio != null)
				msgs = ((InternalEObject)amountRatio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_RATIO, null, msgs);
			if (newAmountRatio != null)
				msgs = ((InternalEObject)newAmountRatio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_RATIO, null, msgs);
			msgs = basicSetAmountRatio(newAmountRatio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_RATIO, newAmountRatio, newAmountRatio));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_STRING, oldAmountString, newAmountString);
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
				msgs = ((InternalEObject)amountString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_STRING, null, msgs);
			if (newAmountString != null)
				msgs = ((InternalEObject)newAmountString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_STRING, null, msgs);
			msgs = basicSetAmountString(newAmountString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_STRING, newAmountString, newAmountString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ratio getAmountRatioLowLimit() {
		return amountRatioLowLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmountRatioLowLimit(Ratio newAmountRatioLowLimit, NotificationChain msgs) {
		Ratio oldAmountRatioLowLimit = amountRatioLowLimit;
		amountRatioLowLimit = newAmountRatioLowLimit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_RATIO_LOW_LIMIT, oldAmountRatioLowLimit, newAmountRatioLowLimit);
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
	public void setAmountRatioLowLimit(Ratio newAmountRatioLowLimit) {
		if (newAmountRatioLowLimit != amountRatioLowLimit) {
			NotificationChain msgs = null;
			if (amountRatioLowLimit != null)
				msgs = ((InternalEObject)amountRatioLowLimit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_RATIO_LOW_LIMIT, null, msgs);
			if (newAmountRatioLowLimit != null)
				msgs = ((InternalEObject)newAmountRatioLowLimit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_RATIO_LOW_LIMIT, null, msgs);
			msgs = basicSetAmountRatioLowLimit(newAmountRatioLowLimit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_RATIO_LOW_LIMIT, newAmountRatioLowLimit, newAmountRatioLowLimit));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_TYPE, oldAmountType, newAmountType);
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
				msgs = ((InternalEObject)amountType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_TYPE, null, msgs);
			if (newAmountType != null)
				msgs = ((InternalEObject)newAmountType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_TYPE, null, msgs);
			msgs = basicSetAmountType(newAmountType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_TYPE, newAmountType, newAmountType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSource() {
		if (source == null) {
			source = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__SOURCE);
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
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__SUBSTANCE_REFERENCE:
				return basicSetSubstanceReference(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__SUBSTANCE_CODEABLE_CONCEPT:
				return basicSetSubstanceCodeableConcept(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__RELATIONSHIP:
				return basicSetRelationship(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__IS_DEFINING:
				return basicSetIsDefining(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_QUANTITY:
				return basicSetAmountQuantity(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_RANGE:
				return basicSetAmountRange(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_RATIO:
				return basicSetAmountRatio(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_STRING:
				return basicSetAmountString(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_RATIO_LOW_LIMIT:
				return basicSetAmountRatioLowLimit(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_TYPE:
				return basicSetAmountType(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__SOURCE:
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
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__SUBSTANCE_REFERENCE:
				return getSubstanceReference();
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__SUBSTANCE_CODEABLE_CONCEPT:
				return getSubstanceCodeableConcept();
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__RELATIONSHIP:
				return getRelationship();
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__IS_DEFINING:
				return getIsDefining();
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_QUANTITY:
				return getAmountQuantity();
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_RANGE:
				return getAmountRange();
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_RATIO:
				return getAmountRatio();
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_STRING:
				return getAmountString();
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_RATIO_LOW_LIMIT:
				return getAmountRatioLowLimit();
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_TYPE:
				return getAmountType();
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__SOURCE:
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
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__SUBSTANCE_REFERENCE:
				setSubstanceReference((Reference)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__SUBSTANCE_CODEABLE_CONCEPT:
				setSubstanceCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__RELATIONSHIP:
				setRelationship((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__IS_DEFINING:
				setIsDefining((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_QUANTITY:
				setAmountQuantity((Quantity)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_RANGE:
				setAmountRange((Range)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_RATIO:
				setAmountRatio((Ratio)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_STRING:
				setAmountString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_RATIO_LOW_LIMIT:
				setAmountRatioLowLimit((Ratio)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_TYPE:
				setAmountType((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__SOURCE:
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
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__SUBSTANCE_REFERENCE:
				setSubstanceReference((Reference)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__SUBSTANCE_CODEABLE_CONCEPT:
				setSubstanceCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__RELATIONSHIP:
				setRelationship((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__IS_DEFINING:
				setIsDefining((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_QUANTITY:
				setAmountQuantity((Quantity)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_RANGE:
				setAmountRange((Range)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_RATIO:
				setAmountRatio((Ratio)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_STRING:
				setAmountString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_RATIO_LOW_LIMIT:
				setAmountRatioLowLimit((Ratio)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_TYPE:
				setAmountType((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__SOURCE:
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
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__SUBSTANCE_REFERENCE:
				return substanceReference != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__SUBSTANCE_CODEABLE_CONCEPT:
				return substanceCodeableConcept != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__RELATIONSHIP:
				return relationship != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__IS_DEFINING:
				return isDefining != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_QUANTITY:
				return amountQuantity != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_RANGE:
				return amountRange != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_RATIO:
				return amountRatio != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_STRING:
				return amountString != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_RATIO_LOW_LIMIT:
				return amountRatioLowLimit != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__AMOUNT_TYPE:
				return amountType != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP__SOURCE:
				return source != null && !source.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubstanceSpecificationRelationshipImpl
