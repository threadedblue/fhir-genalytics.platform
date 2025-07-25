/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.MedicinalProductPackagedBatchIdentifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicinal Product Packaged Batch Identifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductPackagedBatchIdentifierImpl#getOuterPackaging <em>Outer Packaging</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductPackagedBatchIdentifierImpl#getImmediatePackaging <em>Immediate Packaging</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductPackagedBatchIdentifierImpl extends BackboneElementImpl implements MedicinalProductPackagedBatchIdentifier {
	/**
	 * The cached value of the '{@link #getOuterPackaging() <em>Outer Packaging</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterPackaging()
	 * @generated
	 * @ordered
	 */
	protected Identifier outerPackaging;

	/**
	 * The cached value of the '{@link #getImmediatePackaging() <em>Immediate Packaging</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmediatePackaging()
	 * @generated
	 * @ordered
	 */
	protected Identifier immediatePackaging;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductPackagedBatchIdentifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicinalProductPackagedBatchIdentifier();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getOuterPackaging() {
		return outerPackaging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOuterPackaging(Identifier newOuterPackaging, NotificationChain msgs) {
		Identifier oldOuterPackaging = outerPackaging;
		outerPackaging = newOuterPackaging;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_PACKAGED_BATCH_IDENTIFIER__OUTER_PACKAGING, oldOuterPackaging, newOuterPackaging);
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
	public void setOuterPackaging(Identifier newOuterPackaging) {
		if (newOuterPackaging != outerPackaging) {
			NotificationChain msgs = null;
			if (outerPackaging != null)
				msgs = ((InternalEObject)outerPackaging).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_PACKAGED_BATCH_IDENTIFIER__OUTER_PACKAGING, null, msgs);
			if (newOuterPackaging != null)
				msgs = ((InternalEObject)newOuterPackaging).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_PACKAGED_BATCH_IDENTIFIER__OUTER_PACKAGING, null, msgs);
			msgs = basicSetOuterPackaging(newOuterPackaging, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_PACKAGED_BATCH_IDENTIFIER__OUTER_PACKAGING, newOuterPackaging, newOuterPackaging));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getImmediatePackaging() {
		return immediatePackaging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImmediatePackaging(Identifier newImmediatePackaging, NotificationChain msgs) {
		Identifier oldImmediatePackaging = immediatePackaging;
		immediatePackaging = newImmediatePackaging;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_PACKAGED_BATCH_IDENTIFIER__IMMEDIATE_PACKAGING, oldImmediatePackaging, newImmediatePackaging);
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
	public void setImmediatePackaging(Identifier newImmediatePackaging) {
		if (newImmediatePackaging != immediatePackaging) {
			NotificationChain msgs = null;
			if (immediatePackaging != null)
				msgs = ((InternalEObject)immediatePackaging).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_PACKAGED_BATCH_IDENTIFIER__IMMEDIATE_PACKAGING, null, msgs);
			if (newImmediatePackaging != null)
				msgs = ((InternalEObject)newImmediatePackaging).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_PACKAGED_BATCH_IDENTIFIER__IMMEDIATE_PACKAGING, null, msgs);
			msgs = basicSetImmediatePackaging(newImmediatePackaging, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_PACKAGED_BATCH_IDENTIFIER__IMMEDIATE_PACKAGING, newImmediatePackaging, newImmediatePackaging));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_BATCH_IDENTIFIER__OUTER_PACKAGING:
				return basicSetOuterPackaging(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_BATCH_IDENTIFIER__IMMEDIATE_PACKAGING:
				return basicSetImmediatePackaging(null, msgs);
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
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_BATCH_IDENTIFIER__OUTER_PACKAGING:
				return getOuterPackaging();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_BATCH_IDENTIFIER__IMMEDIATE_PACKAGING:
				return getImmediatePackaging();
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
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_BATCH_IDENTIFIER__OUTER_PACKAGING:
				setOuterPackaging((Identifier)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_BATCH_IDENTIFIER__IMMEDIATE_PACKAGING:
				setImmediatePackaging((Identifier)newValue);
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
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_BATCH_IDENTIFIER__OUTER_PACKAGING:
				setOuterPackaging((Identifier)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_BATCH_IDENTIFIER__IMMEDIATE_PACKAGING:
				setImmediatePackaging((Identifier)null);
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
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_BATCH_IDENTIFIER__OUTER_PACKAGING:
				return outerPackaging != null;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_BATCH_IDENTIFIER__IMMEDIATE_PACKAGING:
				return immediatePackaging != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductPackagedBatchIdentifierImpl
