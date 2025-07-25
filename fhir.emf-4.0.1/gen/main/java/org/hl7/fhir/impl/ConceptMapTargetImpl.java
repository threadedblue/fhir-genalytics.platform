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

import org.hl7.fhir.Code;
import org.hl7.fhir.ConceptMapDependsOn;
import org.hl7.fhir.ConceptMapEquivalence;
import org.hl7.fhir.ConceptMapTarget;
import org.hl7.fhir.FhirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept Map Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ConceptMapTargetImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConceptMapTargetImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConceptMapTargetImpl#getEquivalence <em>Equivalence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConceptMapTargetImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConceptMapTargetImpl#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConceptMapTargetImpl#getProduct <em>Product</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConceptMapTargetImpl extends BackboneElementImpl implements ConceptMapTarget {
	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected Code code;

	/**
	 * The cached value of the '{@link #getDisplay() <em>Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String display;

	/**
	 * The cached value of the '{@link #getEquivalence() <em>Equivalence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquivalence()
	 * @generated
	 * @ordered
	 */
	protected ConceptMapEquivalence equivalence;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String comment;

	/**
	 * The cached value of the '{@link #getDependsOn() <em>Depends On</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependsOn()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptMapDependsOn> dependsOn;

	/**
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptMapDependsOn> product;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptMapTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getConceptMapTarget();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(Code newCode, NotificationChain msgs) {
		Code oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_TARGET__CODE, oldCode, newCode);
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
	public void setCode(Code newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_TARGET__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_TARGET__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_TARGET__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getDisplay() {
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplay(org.hl7.fhir.String newDisplay, NotificationChain msgs) {
		org.hl7.fhir.String oldDisplay = display;
		display = newDisplay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_TARGET__DISPLAY, oldDisplay, newDisplay);
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
	public void setDisplay(org.hl7.fhir.String newDisplay) {
		if (newDisplay != display) {
			NotificationChain msgs = null;
			if (display != null)
				msgs = ((InternalEObject)display).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_TARGET__DISPLAY, null, msgs);
			if (newDisplay != null)
				msgs = ((InternalEObject)newDisplay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_TARGET__DISPLAY, null, msgs);
			msgs = basicSetDisplay(newDisplay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_TARGET__DISPLAY, newDisplay, newDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConceptMapEquivalence getEquivalence() {
		return equivalence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEquivalence(ConceptMapEquivalence newEquivalence, NotificationChain msgs) {
		ConceptMapEquivalence oldEquivalence = equivalence;
		equivalence = newEquivalence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_TARGET__EQUIVALENCE, oldEquivalence, newEquivalence);
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
	public void setEquivalence(ConceptMapEquivalence newEquivalence) {
		if (newEquivalence != equivalence) {
			NotificationChain msgs = null;
			if (equivalence != null)
				msgs = ((InternalEObject)equivalence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_TARGET__EQUIVALENCE, null, msgs);
			if (newEquivalence != null)
				msgs = ((InternalEObject)newEquivalence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_TARGET__EQUIVALENCE, null, msgs);
			msgs = basicSetEquivalence(newEquivalence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_TARGET__EQUIVALENCE, newEquivalence, newEquivalence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComment(org.hl7.fhir.String newComment, NotificationChain msgs) {
		org.hl7.fhir.String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_TARGET__COMMENT, oldComment, newComment);
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
	public void setComment(org.hl7.fhir.String newComment) {
		if (newComment != comment) {
			NotificationChain msgs = null;
			if (comment != null)
				msgs = ((InternalEObject)comment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_TARGET__COMMENT, null, msgs);
			if (newComment != null)
				msgs = ((InternalEObject)newComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_TARGET__COMMENT, null, msgs);
			msgs = basicSetComment(newComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_TARGET__COMMENT, newComment, newComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConceptMapDependsOn> getDependsOn() {
		if (dependsOn == null) {
			dependsOn = new EObjectContainmentEList<ConceptMapDependsOn>(ConceptMapDependsOn.class, this, FhirPackage.CONCEPT_MAP_TARGET__DEPENDS_ON);
		}
		return dependsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConceptMapDependsOn> getProduct() {
		if (product == null) {
			product = new EObjectContainmentEList<ConceptMapDependsOn>(ConceptMapDependsOn.class, this, FhirPackage.CONCEPT_MAP_TARGET__PRODUCT);
		}
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CONCEPT_MAP_TARGET__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.CONCEPT_MAP_TARGET__DISPLAY:
				return basicSetDisplay(null, msgs);
			case FhirPackage.CONCEPT_MAP_TARGET__EQUIVALENCE:
				return basicSetEquivalence(null, msgs);
			case FhirPackage.CONCEPT_MAP_TARGET__COMMENT:
				return basicSetComment(null, msgs);
			case FhirPackage.CONCEPT_MAP_TARGET__DEPENDS_ON:
				return ((InternalEList<?>)getDependsOn()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONCEPT_MAP_TARGET__PRODUCT:
				return ((InternalEList<?>)getProduct()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CONCEPT_MAP_TARGET__CODE:
				return getCode();
			case FhirPackage.CONCEPT_MAP_TARGET__DISPLAY:
				return getDisplay();
			case FhirPackage.CONCEPT_MAP_TARGET__EQUIVALENCE:
				return getEquivalence();
			case FhirPackage.CONCEPT_MAP_TARGET__COMMENT:
				return getComment();
			case FhirPackage.CONCEPT_MAP_TARGET__DEPENDS_ON:
				return getDependsOn();
			case FhirPackage.CONCEPT_MAP_TARGET__PRODUCT:
				return getProduct();
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
			case FhirPackage.CONCEPT_MAP_TARGET__CODE:
				setCode((Code)newValue);
				return;
			case FhirPackage.CONCEPT_MAP_TARGET__DISPLAY:
				setDisplay((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CONCEPT_MAP_TARGET__EQUIVALENCE:
				setEquivalence((ConceptMapEquivalence)newValue);
				return;
			case FhirPackage.CONCEPT_MAP_TARGET__COMMENT:
				setComment((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CONCEPT_MAP_TARGET__DEPENDS_ON:
				getDependsOn().clear();
				getDependsOn().addAll((Collection<? extends ConceptMapDependsOn>)newValue);
				return;
			case FhirPackage.CONCEPT_MAP_TARGET__PRODUCT:
				getProduct().clear();
				getProduct().addAll((Collection<? extends ConceptMapDependsOn>)newValue);
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
			case FhirPackage.CONCEPT_MAP_TARGET__CODE:
				setCode((Code)null);
				return;
			case FhirPackage.CONCEPT_MAP_TARGET__DISPLAY:
				setDisplay((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CONCEPT_MAP_TARGET__EQUIVALENCE:
				setEquivalence((ConceptMapEquivalence)null);
				return;
			case FhirPackage.CONCEPT_MAP_TARGET__COMMENT:
				setComment((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CONCEPT_MAP_TARGET__DEPENDS_ON:
				getDependsOn().clear();
				return;
			case FhirPackage.CONCEPT_MAP_TARGET__PRODUCT:
				getProduct().clear();
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
			case FhirPackage.CONCEPT_MAP_TARGET__CODE:
				return code != null;
			case FhirPackage.CONCEPT_MAP_TARGET__DISPLAY:
				return display != null;
			case FhirPackage.CONCEPT_MAP_TARGET__EQUIVALENCE:
				return equivalence != null;
			case FhirPackage.CONCEPT_MAP_TARGET__COMMENT:
				return comment != null;
			case FhirPackage.CONCEPT_MAP_TARGET__DEPENDS_ON:
				return dependsOn != null && !dependsOn.isEmpty();
			case FhirPackage.CONCEPT_MAP_TARGET__PRODUCT:
				return product != null && !product.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConceptMapTargetImpl
