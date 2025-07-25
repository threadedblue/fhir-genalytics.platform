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
import org.hl7.fhir.ImplementationGuideDefinition;
import org.hl7.fhir.ImplementationGuideGrouping;
import org.hl7.fhir.ImplementationGuidePage;
import org.hl7.fhir.ImplementationGuideParameter;
import org.hl7.fhir.ImplementationGuideResource;
import org.hl7.fhir.ImplementationGuideTemplate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation Guide Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideDefinitionImpl#getGrouping <em>Grouping</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideDefinitionImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideDefinitionImpl#getPage <em>Page</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideDefinitionImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideDefinitionImpl#getTemplate <em>Template</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplementationGuideDefinitionImpl extends BackboneElementImpl implements ImplementationGuideDefinition {
	/**
	 * The cached value of the '{@link #getGrouping() <em>Grouping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrouping()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationGuideGrouping> grouping;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationGuideResource> resource;

	/**
	 * The cached value of the '{@link #getPage() <em>Page</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPage()
	 * @generated
	 * @ordered
	 */
	protected ImplementationGuidePage page;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationGuideParameter> parameter;

	/**
	 * The cached value of the '{@link #getTemplate() <em>Template</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplate()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationGuideTemplate> template;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationGuideDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getImplementationGuideDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImplementationGuideGrouping> getGrouping() {
		if (grouping == null) {
			grouping = new EObjectContainmentEList<ImplementationGuideGrouping>(ImplementationGuideGrouping.class, this, FhirPackage.IMPLEMENTATION_GUIDE_DEFINITION__GROUPING);
		}
		return grouping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImplementationGuideResource> getResource() {
		if (resource == null) {
			resource = new EObjectContainmentEList<ImplementationGuideResource>(ImplementationGuideResource.class, this, FhirPackage.IMPLEMENTATION_GUIDE_DEFINITION__RESOURCE);
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImplementationGuidePage getPage() {
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPage(ImplementationGuidePage newPage, NotificationChain msgs) {
		ImplementationGuidePage oldPage = page;
		page = newPage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_DEFINITION__PAGE, oldPage, newPage);
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
	public void setPage(ImplementationGuidePage newPage) {
		if (newPage != page) {
			NotificationChain msgs = null;
			if (page != null)
				msgs = ((InternalEObject)page).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_DEFINITION__PAGE, null, msgs);
			if (newPage != null)
				msgs = ((InternalEObject)newPage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_DEFINITION__PAGE, null, msgs);
			msgs = basicSetPage(newPage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_DEFINITION__PAGE, newPage, newPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImplementationGuideParameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<ImplementationGuideParameter>(ImplementationGuideParameter.class, this, FhirPackage.IMPLEMENTATION_GUIDE_DEFINITION__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImplementationGuideTemplate> getTemplate() {
		if (template == null) {
			template = new EObjectContainmentEList<ImplementationGuideTemplate>(ImplementationGuideTemplate.class, this, FhirPackage.IMPLEMENTATION_GUIDE_DEFINITION__TEMPLATE);
		}
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.IMPLEMENTATION_GUIDE_DEFINITION__GROUPING:
				return ((InternalEList<?>)getGrouping()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_DEFINITION__RESOURCE:
				return ((InternalEList<?>)getResource()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_DEFINITION__PAGE:
				return basicSetPage(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_DEFINITION__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_DEFINITION__TEMPLATE:
				return ((InternalEList<?>)getTemplate()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.IMPLEMENTATION_GUIDE_DEFINITION__GROUPING:
				return getGrouping();
			case FhirPackage.IMPLEMENTATION_GUIDE_DEFINITION__RESOURCE:
				return getResource();
			case FhirPackage.IMPLEMENTATION_GUIDE_DEFINITION__PAGE:
				return getPage();
			case FhirPackage.IMPLEMENTATION_GUIDE_DEFINITION__PARAMETER:
				return getParameter();
			case FhirPackage.IMPLEMENTATION_GUIDE_DEFINITION__TEMPLATE:
				return getTemplate();
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
			case FhirPackage.IMPLEMENTATION_GUIDE_DEFINITION__GROUPING:
				getGrouping().clear();
				getGrouping().addAll((Collection<? extends ImplementationGuideGrouping>)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_DEFINITION__RESOURCE:
				getResource().clear();
				getResource().addAll((Collection<? extends ImplementationGuideResource>)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_DEFINITION__PAGE:
				setPage((ImplementationGuidePage)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_DEFINITION__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends ImplementationGuideParameter>)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_DEFINITION__TEMPLATE:
				getTemplate().clear();
				getTemplate().addAll((Collection<? extends ImplementationGuideTemplate>)newValue);
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
			case FhirPackage.IMPLEMENTATION_GUIDE_DEFINITION__GROUPING:
				getGrouping().clear();
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_DEFINITION__RESOURCE:
				getResource().clear();
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_DEFINITION__PAGE:
				setPage((ImplementationGuidePage)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_DEFINITION__PARAMETER:
				getParameter().clear();
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_DEFINITION__TEMPLATE:
				getTemplate().clear();
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
			case FhirPackage.IMPLEMENTATION_GUIDE_DEFINITION__GROUPING:
				return grouping != null && !grouping.isEmpty();
			case FhirPackage.IMPLEMENTATION_GUIDE_DEFINITION__RESOURCE:
				return resource != null && !resource.isEmpty();
			case FhirPackage.IMPLEMENTATION_GUIDE_DEFINITION__PAGE:
				return page != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_DEFINITION__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case FhirPackage.IMPLEMENTATION_GUIDE_DEFINITION__TEMPLATE:
				return template != null && !template.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImplementationGuideDefinitionImpl
