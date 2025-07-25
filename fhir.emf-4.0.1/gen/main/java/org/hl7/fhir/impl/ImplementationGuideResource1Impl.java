/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.Canonical;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.ImplementationGuideResource1;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Url;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation Guide Resource1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideResource1Impl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideResource1Impl#getExampleBoolean <em>Example Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideResource1Impl#getExampleCanonical <em>Example Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideResource1Impl#getRelativePath <em>Relative Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplementationGuideResource1Impl extends BackboneElementImpl implements ImplementationGuideResource1 {
	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected Reference reference;

	/**
	 * The cached value of the '{@link #getExampleBoolean() <em>Example Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleBoolean()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean exampleBoolean;

	/**
	 * The cached value of the '{@link #getExampleCanonical() <em>Example Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleCanonical()
	 * @generated
	 * @ordered
	 */
	protected Canonical exampleCanonical;

	/**
	 * The cached value of the '{@link #getRelativePath() <em>Relative Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePath()
	 * @generated
	 * @ordered
	 */
	protected Url relativePath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationGuideResource1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getImplementationGuideResource1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReference(Reference newReference, NotificationChain msgs) {
		Reference oldReference = reference;
		reference = newReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__REFERENCE, oldReference, newReference);
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
	public void setReference(Reference newReference) {
		if (newReference != reference) {
			NotificationChain msgs = null;
			if (reference != null)
				msgs = ((InternalEObject)reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__REFERENCE, null, msgs);
			if (newReference != null)
				msgs = ((InternalEObject)newReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__REFERENCE, null, msgs);
			msgs = basicSetReference(newReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__REFERENCE, newReference, newReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getExampleBoolean() {
		return exampleBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExampleBoolean(org.hl7.fhir.Boolean newExampleBoolean, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldExampleBoolean = exampleBoolean;
		exampleBoolean = newExampleBoolean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__EXAMPLE_BOOLEAN, oldExampleBoolean, newExampleBoolean);
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
	public void setExampleBoolean(org.hl7.fhir.Boolean newExampleBoolean) {
		if (newExampleBoolean != exampleBoolean) {
			NotificationChain msgs = null;
			if (exampleBoolean != null)
				msgs = ((InternalEObject)exampleBoolean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__EXAMPLE_BOOLEAN, null, msgs);
			if (newExampleBoolean != null)
				msgs = ((InternalEObject)newExampleBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__EXAMPLE_BOOLEAN, null, msgs);
			msgs = basicSetExampleBoolean(newExampleBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__EXAMPLE_BOOLEAN, newExampleBoolean, newExampleBoolean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Canonical getExampleCanonical() {
		return exampleCanonical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExampleCanonical(Canonical newExampleCanonical, NotificationChain msgs) {
		Canonical oldExampleCanonical = exampleCanonical;
		exampleCanonical = newExampleCanonical;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__EXAMPLE_CANONICAL, oldExampleCanonical, newExampleCanonical);
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
	public void setExampleCanonical(Canonical newExampleCanonical) {
		if (newExampleCanonical != exampleCanonical) {
			NotificationChain msgs = null;
			if (exampleCanonical != null)
				msgs = ((InternalEObject)exampleCanonical).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__EXAMPLE_CANONICAL, null, msgs);
			if (newExampleCanonical != null)
				msgs = ((InternalEObject)newExampleCanonical).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__EXAMPLE_CANONICAL, null, msgs);
			msgs = basicSetExampleCanonical(newExampleCanonical, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__EXAMPLE_CANONICAL, newExampleCanonical, newExampleCanonical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Url getRelativePath() {
		return relativePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelativePath(Url newRelativePath, NotificationChain msgs) {
		Url oldRelativePath = relativePath;
		relativePath = newRelativePath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__RELATIVE_PATH, oldRelativePath, newRelativePath);
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
	public void setRelativePath(Url newRelativePath) {
		if (newRelativePath != relativePath) {
			NotificationChain msgs = null;
			if (relativePath != null)
				msgs = ((InternalEObject)relativePath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__RELATIVE_PATH, null, msgs);
			if (newRelativePath != null)
				msgs = ((InternalEObject)newRelativePath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__RELATIVE_PATH, null, msgs);
			msgs = basicSetRelativePath(newRelativePath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__RELATIVE_PATH, newRelativePath, newRelativePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__REFERENCE:
				return basicSetReference(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__EXAMPLE_BOOLEAN:
				return basicSetExampleBoolean(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__EXAMPLE_CANONICAL:
				return basicSetExampleCanonical(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__RELATIVE_PATH:
				return basicSetRelativePath(null, msgs);
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
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__REFERENCE:
				return getReference();
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__EXAMPLE_BOOLEAN:
				return getExampleBoolean();
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__EXAMPLE_CANONICAL:
				return getExampleCanonical();
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__RELATIVE_PATH:
				return getRelativePath();
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
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__REFERENCE:
				setReference((Reference)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__EXAMPLE_BOOLEAN:
				setExampleBoolean((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__EXAMPLE_CANONICAL:
				setExampleCanonical((Canonical)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__RELATIVE_PATH:
				setRelativePath((Url)newValue);
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
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__REFERENCE:
				setReference((Reference)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__EXAMPLE_BOOLEAN:
				setExampleBoolean((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__EXAMPLE_CANONICAL:
				setExampleCanonical((Canonical)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__RELATIVE_PATH:
				setRelativePath((Url)null);
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
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__REFERENCE:
				return reference != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__EXAMPLE_BOOLEAN:
				return exampleBoolean != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__EXAMPLE_CANONICAL:
				return exampleCanonical != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1__RELATIVE_PATH:
				return relativePath != null;
		}
		return super.eIsSet(featureID);
	}

} //ImplementationGuideResource1Impl
