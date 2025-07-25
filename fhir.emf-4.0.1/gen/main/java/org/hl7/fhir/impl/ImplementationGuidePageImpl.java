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
import org.hl7.fhir.GuidePageGeneration;
import org.hl7.fhir.ImplementationGuidePage;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Url;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation Guide Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuidePageImpl#getNameUrl <em>Name Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuidePageImpl#getNameReference <em>Name Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuidePageImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuidePageImpl#getGeneration <em>Generation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuidePageImpl#getPage <em>Page</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplementationGuidePageImpl extends BackboneElementImpl implements ImplementationGuidePage {
	/**
	 * The cached value of the '{@link #getNameUrl() <em>Name Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameUrl()
	 * @generated
	 * @ordered
	 */
	protected Url nameUrl;

	/**
	 * The cached value of the '{@link #getNameReference() <em>Name Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameReference()
	 * @generated
	 * @ordered
	 */
	protected Reference nameReference;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String title;

	/**
	 * The cached value of the '{@link #getGeneration() <em>Generation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneration()
	 * @generated
	 * @ordered
	 */
	protected GuidePageGeneration generation;

	/**
	 * The cached value of the '{@link #getPage() <em>Page</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPage()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationGuidePage> page;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationGuidePageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getImplementationGuidePage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Url getNameUrl() {
		return nameUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameUrl(Url newNameUrl, NotificationChain msgs) {
		Url oldNameUrl = nameUrl;
		nameUrl = newNameUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_PAGE__NAME_URL, oldNameUrl, newNameUrl);
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
	public void setNameUrl(Url newNameUrl) {
		if (newNameUrl != nameUrl) {
			NotificationChain msgs = null;
			if (nameUrl != null)
				msgs = ((InternalEObject)nameUrl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_PAGE__NAME_URL, null, msgs);
			if (newNameUrl != null)
				msgs = ((InternalEObject)newNameUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_PAGE__NAME_URL, null, msgs);
			msgs = basicSetNameUrl(newNameUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_PAGE__NAME_URL, newNameUrl, newNameUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getNameReference() {
		return nameReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameReference(Reference newNameReference, NotificationChain msgs) {
		Reference oldNameReference = nameReference;
		nameReference = newNameReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_PAGE__NAME_REFERENCE, oldNameReference, newNameReference);
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
	public void setNameReference(Reference newNameReference) {
		if (newNameReference != nameReference) {
			NotificationChain msgs = null;
			if (nameReference != null)
				msgs = ((InternalEObject)nameReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_PAGE__NAME_REFERENCE, null, msgs);
			if (newNameReference != null)
				msgs = ((InternalEObject)newNameReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_PAGE__NAME_REFERENCE, null, msgs);
			msgs = basicSetNameReference(newNameReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_PAGE__NAME_REFERENCE, newNameReference, newNameReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(org.hl7.fhir.String newTitle, NotificationChain msgs) {
		org.hl7.fhir.String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_PAGE__TITLE, oldTitle, newTitle);
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
	public void setTitle(org.hl7.fhir.String newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_PAGE__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_PAGE__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_PAGE__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GuidePageGeneration getGeneration() {
		return generation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneration(GuidePageGeneration newGeneration, NotificationChain msgs) {
		GuidePageGeneration oldGeneration = generation;
		generation = newGeneration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_PAGE__GENERATION, oldGeneration, newGeneration);
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
	public void setGeneration(GuidePageGeneration newGeneration) {
		if (newGeneration != generation) {
			NotificationChain msgs = null;
			if (generation != null)
				msgs = ((InternalEObject)generation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_PAGE__GENERATION, null, msgs);
			if (newGeneration != null)
				msgs = ((InternalEObject)newGeneration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_PAGE__GENERATION, null, msgs);
			msgs = basicSetGeneration(newGeneration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_PAGE__GENERATION, newGeneration, newGeneration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImplementationGuidePage> getPage() {
		if (page == null) {
			page = new EObjectContainmentEList<ImplementationGuidePage>(ImplementationGuidePage.class, this, FhirPackage.IMPLEMENTATION_GUIDE_PAGE__PAGE);
		}
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__NAME_URL:
				return basicSetNameUrl(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__NAME_REFERENCE:
				return basicSetNameReference(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__TITLE:
				return basicSetTitle(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__GENERATION:
				return basicSetGeneration(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__PAGE:
				return ((InternalEList<?>)getPage()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__NAME_URL:
				return getNameUrl();
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__NAME_REFERENCE:
				return getNameReference();
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__TITLE:
				return getTitle();
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__GENERATION:
				return getGeneration();
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__PAGE:
				return getPage();
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
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__NAME_URL:
				setNameUrl((Url)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__NAME_REFERENCE:
				setNameReference((Reference)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__TITLE:
				setTitle((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__GENERATION:
				setGeneration((GuidePageGeneration)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__PAGE:
				getPage().clear();
				getPage().addAll((Collection<? extends ImplementationGuidePage>)newValue);
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
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__NAME_URL:
				setNameUrl((Url)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__NAME_REFERENCE:
				setNameReference((Reference)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__TITLE:
				setTitle((org.hl7.fhir.String)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__GENERATION:
				setGeneration((GuidePageGeneration)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__PAGE:
				getPage().clear();
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
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__NAME_URL:
				return nameUrl != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__NAME_REFERENCE:
				return nameReference != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__TITLE:
				return title != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__GENERATION:
				return generation != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__PAGE:
				return page != null && !page.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImplementationGuidePageImpl
