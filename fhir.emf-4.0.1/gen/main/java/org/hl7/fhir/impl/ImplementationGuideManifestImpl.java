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

import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.ImplementationGuideManifest;
import org.hl7.fhir.ImplementationGuidePage1;
import org.hl7.fhir.ImplementationGuideResource1;
import org.hl7.fhir.Url;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation Guide Manifest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideManifestImpl#getRendering <em>Rendering</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideManifestImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideManifestImpl#getPage <em>Page</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideManifestImpl#getImage <em>Image</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideManifestImpl#getOther <em>Other</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplementationGuideManifestImpl extends BackboneElementImpl implements ImplementationGuideManifest {
	/**
	 * The cached value of the '{@link #getRendering() <em>Rendering</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRendering()
	 * @generated
	 * @ordered
	 */
	protected Url rendering;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationGuideResource1> resource;

	/**
	 * The cached value of the '{@link #getPage() <em>Page</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPage()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationGuidePage1> page;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> image;

	/**
	 * The cached value of the '{@link #getOther() <em>Other</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOther()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> other;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationGuideManifestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getImplementationGuideManifest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Url getRendering() {
		return rendering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRendering(Url newRendering, NotificationChain msgs) {
		Url oldRendering = rendering;
		rendering = newRendering;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_MANIFEST__RENDERING, oldRendering, newRendering);
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
	public void setRendering(Url newRendering) {
		if (newRendering != rendering) {
			NotificationChain msgs = null;
			if (rendering != null)
				msgs = ((InternalEObject)rendering).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_MANIFEST__RENDERING, null, msgs);
			if (newRendering != null)
				msgs = ((InternalEObject)newRendering).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_MANIFEST__RENDERING, null, msgs);
			msgs = basicSetRendering(newRendering, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_MANIFEST__RENDERING, newRendering, newRendering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImplementationGuideResource1> getResource() {
		if (resource == null) {
			resource = new EObjectContainmentEList<ImplementationGuideResource1>(ImplementationGuideResource1.class, this, FhirPackage.IMPLEMENTATION_GUIDE_MANIFEST__RESOURCE);
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImplementationGuidePage1> getPage() {
		if (page == null) {
			page = new EObjectContainmentEList<ImplementationGuidePage1>(ImplementationGuidePage1.class, this, FhirPackage.IMPLEMENTATION_GUIDE_MANIFEST__PAGE);
		}
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.hl7.fhir.String> getImage() {
		if (image == null) {
			image = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.IMPLEMENTATION_GUIDE_MANIFEST__IMAGE);
		}
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.hl7.fhir.String> getOther() {
		if (other == null) {
			other = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.IMPLEMENTATION_GUIDE_MANIFEST__OTHER);
		}
		return other;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.IMPLEMENTATION_GUIDE_MANIFEST__RENDERING:
				return basicSetRendering(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_MANIFEST__RESOURCE:
				return ((InternalEList<?>)getResource()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_MANIFEST__PAGE:
				return ((InternalEList<?>)getPage()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_MANIFEST__IMAGE:
				return ((InternalEList<?>)getImage()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_MANIFEST__OTHER:
				return ((InternalEList<?>)getOther()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.IMPLEMENTATION_GUIDE_MANIFEST__RENDERING:
				return getRendering();
			case FhirPackage.IMPLEMENTATION_GUIDE_MANIFEST__RESOURCE:
				return getResource();
			case FhirPackage.IMPLEMENTATION_GUIDE_MANIFEST__PAGE:
				return getPage();
			case FhirPackage.IMPLEMENTATION_GUIDE_MANIFEST__IMAGE:
				return getImage();
			case FhirPackage.IMPLEMENTATION_GUIDE_MANIFEST__OTHER:
				return getOther();
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
			case FhirPackage.IMPLEMENTATION_GUIDE_MANIFEST__RENDERING:
				setRendering((Url)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_MANIFEST__RESOURCE:
				getResource().clear();
				getResource().addAll((Collection<? extends ImplementationGuideResource1>)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_MANIFEST__PAGE:
				getPage().clear();
				getPage().addAll((Collection<? extends ImplementationGuidePage1>)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_MANIFEST__IMAGE:
				getImage().clear();
				getImage().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_MANIFEST__OTHER:
				getOther().clear();
				getOther().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
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
			case FhirPackage.IMPLEMENTATION_GUIDE_MANIFEST__RENDERING:
				setRendering((Url)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_MANIFEST__RESOURCE:
				getResource().clear();
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_MANIFEST__PAGE:
				getPage().clear();
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_MANIFEST__IMAGE:
				getImage().clear();
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_MANIFEST__OTHER:
				getOther().clear();
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
			case FhirPackage.IMPLEMENTATION_GUIDE_MANIFEST__RENDERING:
				return rendering != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_MANIFEST__RESOURCE:
				return resource != null && !resource.isEmpty();
			case FhirPackage.IMPLEMENTATION_GUIDE_MANIFEST__PAGE:
				return page != null && !page.isEmpty();
			case FhirPackage.IMPLEMENTATION_GUIDE_MANIFEST__IMAGE:
				return image != null && !image.isEmpty();
			case FhirPackage.IMPLEMENTATION_GUIDE_MANIFEST__OTHER:
				return other != null && !other.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImplementationGuideManifestImpl
