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
import org.hl7.fhir.MedicinalProductInteractionInteractant;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicinal Product Interaction Interactant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductInteractionInteractantImpl#getItemReference <em>Item Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductInteractionInteractantImpl#getItemCodeableConcept <em>Item Codeable Concept</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductInteractionInteractantImpl extends BackboneElementImpl implements MedicinalProductInteractionInteractant {
	/**
	 * The cached value of the '{@link #getItemReference() <em>Item Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemReference()
	 * @generated
	 * @ordered
	 */
	protected Reference itemReference;

	/**
	 * The cached value of the '{@link #getItemCodeableConcept() <em>Item Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept itemCodeableConcept;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductInteractionInteractantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicinalProductInteractionInteractant();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getItemReference() {
		return itemReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItemReference(Reference newItemReference, NotificationChain msgs) {
		Reference oldItemReference = itemReference;
		itemReference = newItemReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INTERACTION_INTERACTANT__ITEM_REFERENCE, oldItemReference, newItemReference);
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
	public void setItemReference(Reference newItemReference) {
		if (newItemReference != itemReference) {
			NotificationChain msgs = null;
			if (itemReference != null)
				msgs = ((InternalEObject)itemReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INTERACTION_INTERACTANT__ITEM_REFERENCE, null, msgs);
			if (newItemReference != null)
				msgs = ((InternalEObject)newItemReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INTERACTION_INTERACTANT__ITEM_REFERENCE, null, msgs);
			msgs = basicSetItemReference(newItemReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INTERACTION_INTERACTANT__ITEM_REFERENCE, newItemReference, newItemReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getItemCodeableConcept() {
		return itemCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItemCodeableConcept(CodeableConcept newItemCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldItemCodeableConcept = itemCodeableConcept;
		itemCodeableConcept = newItemCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INTERACTION_INTERACTANT__ITEM_CODEABLE_CONCEPT, oldItemCodeableConcept, newItemCodeableConcept);
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
	public void setItemCodeableConcept(CodeableConcept newItemCodeableConcept) {
		if (newItemCodeableConcept != itemCodeableConcept) {
			NotificationChain msgs = null;
			if (itemCodeableConcept != null)
				msgs = ((InternalEObject)itemCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INTERACTION_INTERACTANT__ITEM_CODEABLE_CONCEPT, null, msgs);
			if (newItemCodeableConcept != null)
				msgs = ((InternalEObject)newItemCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INTERACTION_INTERACTANT__ITEM_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetItemCodeableConcept(newItemCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INTERACTION_INTERACTANT__ITEM_CODEABLE_CONCEPT, newItemCodeableConcept, newItemCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION_INTERACTANT__ITEM_REFERENCE:
				return basicSetItemReference(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION_INTERACTANT__ITEM_CODEABLE_CONCEPT:
				return basicSetItemCodeableConcept(null, msgs);
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
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION_INTERACTANT__ITEM_REFERENCE:
				return getItemReference();
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION_INTERACTANT__ITEM_CODEABLE_CONCEPT:
				return getItemCodeableConcept();
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
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION_INTERACTANT__ITEM_REFERENCE:
				setItemReference((Reference)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION_INTERACTANT__ITEM_CODEABLE_CONCEPT:
				setItemCodeableConcept((CodeableConcept)newValue);
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
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION_INTERACTANT__ITEM_REFERENCE:
				setItemReference((Reference)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION_INTERACTANT__ITEM_CODEABLE_CONCEPT:
				setItemCodeableConcept((CodeableConcept)null);
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
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION_INTERACTANT__ITEM_REFERENCE:
				return itemReference != null;
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION_INTERACTANT__ITEM_CODEABLE_CONCEPT:
				return itemCodeableConcept != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductInteractionInteractantImpl
