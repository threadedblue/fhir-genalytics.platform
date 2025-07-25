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

import org.hl7.fhir.Coding;
import org.hl7.fhir.ContractSecurityLabel;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.UnsignedInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contract Security Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ContractSecurityLabelImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractSecurityLabelImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractSecurityLabelImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractSecurityLabelImpl#getControl <em>Control</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContractSecurityLabelImpl extends BackboneElementImpl implements ContractSecurityLabel {
	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<UnsignedInt> number;

	/**
	 * The cached value of the '{@link #getClassification() <em>Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected Coding classification;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> category;

	/**
	 * The cached value of the '{@link #getControl() <em>Control</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControl()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> control;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractSecurityLabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getContractSecurityLabel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnsignedInt> getNumber() {
		if (number == null) {
			number = new EObjectContainmentEList<UnsignedInt>(UnsignedInt.class, this, FhirPackage.CONTRACT_SECURITY_LABEL__NUMBER);
		}
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coding getClassification() {
		return classification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassification(Coding newClassification, NotificationChain msgs) {
		Coding oldClassification = classification;
		classification = newClassification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_SECURITY_LABEL__CLASSIFICATION, oldClassification, newClassification);
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
	public void setClassification(Coding newClassification) {
		if (newClassification != classification) {
			NotificationChain msgs = null;
			if (classification != null)
				msgs = ((InternalEObject)classification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_SECURITY_LABEL__CLASSIFICATION, null, msgs);
			if (newClassification != null)
				msgs = ((InternalEObject)newClassification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_SECURITY_LABEL__CLASSIFICATION, null, msgs);
			msgs = basicSetClassification(newClassification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_SECURITY_LABEL__CLASSIFICATION, newClassification, newClassification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Coding> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.CONTRACT_SECURITY_LABEL__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Coding> getControl() {
		if (control == null) {
			control = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.CONTRACT_SECURITY_LABEL__CONTROL);
		}
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CONTRACT_SECURITY_LABEL__NUMBER:
				return ((InternalEList<?>)getNumber()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT_SECURITY_LABEL__CLASSIFICATION:
				return basicSetClassification(null, msgs);
			case FhirPackage.CONTRACT_SECURITY_LABEL__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT_SECURITY_LABEL__CONTROL:
				return ((InternalEList<?>)getControl()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CONTRACT_SECURITY_LABEL__NUMBER:
				return getNumber();
			case FhirPackage.CONTRACT_SECURITY_LABEL__CLASSIFICATION:
				return getClassification();
			case FhirPackage.CONTRACT_SECURITY_LABEL__CATEGORY:
				return getCategory();
			case FhirPackage.CONTRACT_SECURITY_LABEL__CONTROL:
				return getControl();
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
			case FhirPackage.CONTRACT_SECURITY_LABEL__NUMBER:
				getNumber().clear();
				getNumber().addAll((Collection<? extends UnsignedInt>)newValue);
				return;
			case FhirPackage.CONTRACT_SECURITY_LABEL__CLASSIFICATION:
				setClassification((Coding)newValue);
				return;
			case FhirPackage.CONTRACT_SECURITY_LABEL__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.CONTRACT_SECURITY_LABEL__CONTROL:
				getControl().clear();
				getControl().addAll((Collection<? extends Coding>)newValue);
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
			case FhirPackage.CONTRACT_SECURITY_LABEL__NUMBER:
				getNumber().clear();
				return;
			case FhirPackage.CONTRACT_SECURITY_LABEL__CLASSIFICATION:
				setClassification((Coding)null);
				return;
			case FhirPackage.CONTRACT_SECURITY_LABEL__CATEGORY:
				getCategory().clear();
				return;
			case FhirPackage.CONTRACT_SECURITY_LABEL__CONTROL:
				getControl().clear();
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
			case FhirPackage.CONTRACT_SECURITY_LABEL__NUMBER:
				return number != null && !number.isEmpty();
			case FhirPackage.CONTRACT_SECURITY_LABEL__CLASSIFICATION:
				return classification != null;
			case FhirPackage.CONTRACT_SECURITY_LABEL__CATEGORY:
				return category != null && !category.isEmpty();
			case FhirPackage.CONTRACT_SECURITY_LABEL__CONTROL:
				return control != null && !control.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContractSecurityLabelImpl
