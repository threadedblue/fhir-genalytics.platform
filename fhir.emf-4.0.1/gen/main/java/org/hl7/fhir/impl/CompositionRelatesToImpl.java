/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CompositionRelatesTo;
import org.hl7.fhir.DocumentRelationshipType;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composition Relates To</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CompositionRelatesToImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CompositionRelatesToImpl#getTargetIdentifier <em>Target Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CompositionRelatesToImpl#getTargetReference <em>Target Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositionRelatesToImpl extends BackboneElementImpl implements CompositionRelatesTo {
	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected DocumentRelationshipType code;

	/**
	 * The cached value of the '{@link #getTargetIdentifier() <em>Target Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier targetIdentifier;

	/**
	 * The cached value of the '{@link #getTargetReference() <em>Target Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetReference()
	 * @generated
	 * @ordered
	 */
	protected Reference targetReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositionRelatesToImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCompositionRelatesTo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentRelationshipType getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(DocumentRelationshipType newCode, NotificationChain msgs) {
		DocumentRelationshipType oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMPOSITION_RELATES_TO__CODE, oldCode, newCode);
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
	public void setCode(DocumentRelationshipType newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMPOSITION_RELATES_TO__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMPOSITION_RELATES_TO__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMPOSITION_RELATES_TO__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getTargetIdentifier() {
		return targetIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetIdentifier(Identifier newTargetIdentifier, NotificationChain msgs) {
		Identifier oldTargetIdentifier = targetIdentifier;
		targetIdentifier = newTargetIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMPOSITION_RELATES_TO__TARGET_IDENTIFIER, oldTargetIdentifier, newTargetIdentifier);
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
	public void setTargetIdentifier(Identifier newTargetIdentifier) {
		if (newTargetIdentifier != targetIdentifier) {
			NotificationChain msgs = null;
			if (targetIdentifier != null)
				msgs = ((InternalEObject)targetIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMPOSITION_RELATES_TO__TARGET_IDENTIFIER, null, msgs);
			if (newTargetIdentifier != null)
				msgs = ((InternalEObject)newTargetIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMPOSITION_RELATES_TO__TARGET_IDENTIFIER, null, msgs);
			msgs = basicSetTargetIdentifier(newTargetIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMPOSITION_RELATES_TO__TARGET_IDENTIFIER, newTargetIdentifier, newTargetIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getTargetReference() {
		return targetReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetReference(Reference newTargetReference, NotificationChain msgs) {
		Reference oldTargetReference = targetReference;
		targetReference = newTargetReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMPOSITION_RELATES_TO__TARGET_REFERENCE, oldTargetReference, newTargetReference);
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
	public void setTargetReference(Reference newTargetReference) {
		if (newTargetReference != targetReference) {
			NotificationChain msgs = null;
			if (targetReference != null)
				msgs = ((InternalEObject)targetReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMPOSITION_RELATES_TO__TARGET_REFERENCE, null, msgs);
			if (newTargetReference != null)
				msgs = ((InternalEObject)newTargetReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMPOSITION_RELATES_TO__TARGET_REFERENCE, null, msgs);
			msgs = basicSetTargetReference(newTargetReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMPOSITION_RELATES_TO__TARGET_REFERENCE, newTargetReference, newTargetReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.COMPOSITION_RELATES_TO__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.COMPOSITION_RELATES_TO__TARGET_IDENTIFIER:
				return basicSetTargetIdentifier(null, msgs);
			case FhirPackage.COMPOSITION_RELATES_TO__TARGET_REFERENCE:
				return basicSetTargetReference(null, msgs);
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
			case FhirPackage.COMPOSITION_RELATES_TO__CODE:
				return getCode();
			case FhirPackage.COMPOSITION_RELATES_TO__TARGET_IDENTIFIER:
				return getTargetIdentifier();
			case FhirPackage.COMPOSITION_RELATES_TO__TARGET_REFERENCE:
				return getTargetReference();
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
			case FhirPackage.COMPOSITION_RELATES_TO__CODE:
				setCode((DocumentRelationshipType)newValue);
				return;
			case FhirPackage.COMPOSITION_RELATES_TO__TARGET_IDENTIFIER:
				setTargetIdentifier((Identifier)newValue);
				return;
			case FhirPackage.COMPOSITION_RELATES_TO__TARGET_REFERENCE:
				setTargetReference((Reference)newValue);
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
			case FhirPackage.COMPOSITION_RELATES_TO__CODE:
				setCode((DocumentRelationshipType)null);
				return;
			case FhirPackage.COMPOSITION_RELATES_TO__TARGET_IDENTIFIER:
				setTargetIdentifier((Identifier)null);
				return;
			case FhirPackage.COMPOSITION_RELATES_TO__TARGET_REFERENCE:
				setTargetReference((Reference)null);
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
			case FhirPackage.COMPOSITION_RELATES_TO__CODE:
				return code != null;
			case FhirPackage.COMPOSITION_RELATES_TO__TARGET_IDENTIFIER:
				return targetIdentifier != null;
			case FhirPackage.COMPOSITION_RELATES_TO__TARGET_REFERENCE:
				return targetReference != null;
		}
		return super.eIsSet(featureID);
	}

} //CompositionRelatesToImpl
