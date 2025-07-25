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
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Reference;
import org.hl7.fhir.SubstanceSpecificationProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Specification Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationPropertyImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationPropertyImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationPropertyImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationPropertyImpl#getDefiningSubstanceReference <em>Defining Substance Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationPropertyImpl#getDefiningSubstanceCodeableConcept <em>Defining Substance Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationPropertyImpl#getAmountQuantity <em>Amount Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationPropertyImpl#getAmountString <em>Amount String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceSpecificationPropertyImpl extends BackboneElementImpl implements SubstanceSpecificationProperty {
	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept category;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String parameters;

	/**
	 * The cached value of the '{@link #getDefiningSubstanceReference() <em>Defining Substance Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefiningSubstanceReference()
	 * @generated
	 * @ordered
	 */
	protected Reference definingSubstanceReference;

	/**
	 * The cached value of the '{@link #getDefiningSubstanceCodeableConcept() <em>Defining Substance Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefiningSubstanceCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept definingSubstanceCodeableConcept;

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
	 * The cached value of the '{@link #getAmountString() <em>Amount String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String amountString;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceSpecificationPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubstanceSpecificationProperty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(CodeableConcept newCategory, NotificationChain msgs) {
		CodeableConcept oldCategory = category;
		category = newCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__CATEGORY, oldCategory, newCategory);
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
	public void setCategory(CodeableConcept newCategory) {
		if (newCategory != category) {
			NotificationChain msgs = null;
			if (category != null)
				msgs = ((InternalEObject)category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__CATEGORY, newCategory, newCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CodeableConcept newCode, NotificationChain msgs) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__CODE, oldCode, newCode);
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
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getParameters() {
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameters(org.hl7.fhir.String newParameters, NotificationChain msgs) {
		org.hl7.fhir.String oldParameters = parameters;
		parameters = newParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__PARAMETERS, oldParameters, newParameters);
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
	public void setParameters(org.hl7.fhir.String newParameters) {
		if (newParameters != parameters) {
			NotificationChain msgs = null;
			if (parameters != null)
				msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__PARAMETERS, null, msgs);
			if (newParameters != null)
				msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__PARAMETERS, null, msgs);
			msgs = basicSetParameters(newParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__PARAMETERS, newParameters, newParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getDefiningSubstanceReference() {
		return definingSubstanceReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefiningSubstanceReference(Reference newDefiningSubstanceReference, NotificationChain msgs) {
		Reference oldDefiningSubstanceReference = definingSubstanceReference;
		definingSubstanceReference = newDefiningSubstanceReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__DEFINING_SUBSTANCE_REFERENCE, oldDefiningSubstanceReference, newDefiningSubstanceReference);
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
	public void setDefiningSubstanceReference(Reference newDefiningSubstanceReference) {
		if (newDefiningSubstanceReference != definingSubstanceReference) {
			NotificationChain msgs = null;
			if (definingSubstanceReference != null)
				msgs = ((InternalEObject)definingSubstanceReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__DEFINING_SUBSTANCE_REFERENCE, null, msgs);
			if (newDefiningSubstanceReference != null)
				msgs = ((InternalEObject)newDefiningSubstanceReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__DEFINING_SUBSTANCE_REFERENCE, null, msgs);
			msgs = basicSetDefiningSubstanceReference(newDefiningSubstanceReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__DEFINING_SUBSTANCE_REFERENCE, newDefiningSubstanceReference, newDefiningSubstanceReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getDefiningSubstanceCodeableConcept() {
		return definingSubstanceCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefiningSubstanceCodeableConcept(CodeableConcept newDefiningSubstanceCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldDefiningSubstanceCodeableConcept = definingSubstanceCodeableConcept;
		definingSubstanceCodeableConcept = newDefiningSubstanceCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__DEFINING_SUBSTANCE_CODEABLE_CONCEPT, oldDefiningSubstanceCodeableConcept, newDefiningSubstanceCodeableConcept);
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
	public void setDefiningSubstanceCodeableConcept(CodeableConcept newDefiningSubstanceCodeableConcept) {
		if (newDefiningSubstanceCodeableConcept != definingSubstanceCodeableConcept) {
			NotificationChain msgs = null;
			if (definingSubstanceCodeableConcept != null)
				msgs = ((InternalEObject)definingSubstanceCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__DEFINING_SUBSTANCE_CODEABLE_CONCEPT, null, msgs);
			if (newDefiningSubstanceCodeableConcept != null)
				msgs = ((InternalEObject)newDefiningSubstanceCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__DEFINING_SUBSTANCE_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetDefiningSubstanceCodeableConcept(newDefiningSubstanceCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__DEFINING_SUBSTANCE_CODEABLE_CONCEPT, newDefiningSubstanceCodeableConcept, newDefiningSubstanceCodeableConcept));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__AMOUNT_QUANTITY, oldAmountQuantity, newAmountQuantity);
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
				msgs = ((InternalEObject)amountQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__AMOUNT_QUANTITY, null, msgs);
			if (newAmountQuantity != null)
				msgs = ((InternalEObject)newAmountQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__AMOUNT_QUANTITY, null, msgs);
			msgs = basicSetAmountQuantity(newAmountQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__AMOUNT_QUANTITY, newAmountQuantity, newAmountQuantity));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__AMOUNT_STRING, oldAmountString, newAmountString);
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
				msgs = ((InternalEObject)amountString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__AMOUNT_STRING, null, msgs);
			if (newAmountString != null)
				msgs = ((InternalEObject)newAmountString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__AMOUNT_STRING, null, msgs);
			msgs = basicSetAmountString(newAmountString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__AMOUNT_STRING, newAmountString, newAmountString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__CATEGORY:
				return basicSetCategory(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__PARAMETERS:
				return basicSetParameters(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__DEFINING_SUBSTANCE_REFERENCE:
				return basicSetDefiningSubstanceReference(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__DEFINING_SUBSTANCE_CODEABLE_CONCEPT:
				return basicSetDefiningSubstanceCodeableConcept(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__AMOUNT_QUANTITY:
				return basicSetAmountQuantity(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__AMOUNT_STRING:
				return basicSetAmountString(null, msgs);
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
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__CATEGORY:
				return getCategory();
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__CODE:
				return getCode();
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__PARAMETERS:
				return getParameters();
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__DEFINING_SUBSTANCE_REFERENCE:
				return getDefiningSubstanceReference();
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__DEFINING_SUBSTANCE_CODEABLE_CONCEPT:
				return getDefiningSubstanceCodeableConcept();
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__AMOUNT_QUANTITY:
				return getAmountQuantity();
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__AMOUNT_STRING:
				return getAmountString();
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
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__PARAMETERS:
				setParameters((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__DEFINING_SUBSTANCE_REFERENCE:
				setDefiningSubstanceReference((Reference)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__DEFINING_SUBSTANCE_CODEABLE_CONCEPT:
				setDefiningSubstanceCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__AMOUNT_QUANTITY:
				setAmountQuantity((Quantity)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__AMOUNT_STRING:
				setAmountString((org.hl7.fhir.String)newValue);
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
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__PARAMETERS:
				setParameters((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__DEFINING_SUBSTANCE_REFERENCE:
				setDefiningSubstanceReference((Reference)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__DEFINING_SUBSTANCE_CODEABLE_CONCEPT:
				setDefiningSubstanceCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__AMOUNT_QUANTITY:
				setAmountQuantity((Quantity)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__AMOUNT_STRING:
				setAmountString((org.hl7.fhir.String)null);
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
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__CATEGORY:
				return category != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__CODE:
				return code != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__PARAMETERS:
				return parameters != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__DEFINING_SUBSTANCE_REFERENCE:
				return definingSubstanceReference != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__DEFINING_SUBSTANCE_CODEABLE_CONCEPT:
				return definingSubstanceCodeableConcept != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__AMOUNT_QUANTITY:
				return amountQuantity != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__AMOUNT_STRING:
				return amountString != null;
		}
		return super.eIsSet(featureID);
	}

} //SubstanceSpecificationPropertyImpl
