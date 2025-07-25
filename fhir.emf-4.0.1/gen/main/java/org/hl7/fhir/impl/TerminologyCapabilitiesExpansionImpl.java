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
import org.hl7.fhir.Markdown;
import org.hl7.fhir.TerminologyCapabilitiesExpansion;
import org.hl7.fhir.TerminologyCapabilitiesParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminology Capabilities Expansion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.TerminologyCapabilitiesExpansionImpl#getHierarchical <em>Hierarchical</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TerminologyCapabilitiesExpansionImpl#getPaging <em>Paging</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TerminologyCapabilitiesExpansionImpl#getIncomplete <em>Incomplete</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TerminologyCapabilitiesExpansionImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TerminologyCapabilitiesExpansionImpl#getTextFilter <em>Text Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TerminologyCapabilitiesExpansionImpl extends BackboneElementImpl implements TerminologyCapabilitiesExpansion {
	/**
	 * The cached value of the '{@link #getHierarchical() <em>Hierarchical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHierarchical()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean hierarchical;

	/**
	 * The cached value of the '{@link #getPaging() <em>Paging</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaging()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean paging;

	/**
	 * The cached value of the '{@link #getIncomplete() <em>Incomplete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomplete()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean incomplete;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<TerminologyCapabilitiesParameter> parameter;

	/**
	 * The cached value of the '{@link #getTextFilter() <em>Text Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextFilter()
	 * @generated
	 * @ordered
	 */
	protected Markdown textFilter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminologyCapabilitiesExpansionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getTerminologyCapabilitiesExpansion();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getHierarchical() {
		return hierarchical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHierarchical(org.hl7.fhir.Boolean newHierarchical, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldHierarchical = hierarchical;
		hierarchical = newHierarchical;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__HIERARCHICAL, oldHierarchical, newHierarchical);
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
	public void setHierarchical(org.hl7.fhir.Boolean newHierarchical) {
		if (newHierarchical != hierarchical) {
			NotificationChain msgs = null;
			if (hierarchical != null)
				msgs = ((InternalEObject)hierarchical).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__HIERARCHICAL, null, msgs);
			if (newHierarchical != null)
				msgs = ((InternalEObject)newHierarchical).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__HIERARCHICAL, null, msgs);
			msgs = basicSetHierarchical(newHierarchical, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__HIERARCHICAL, newHierarchical, newHierarchical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getPaging() {
		return paging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaging(org.hl7.fhir.Boolean newPaging, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldPaging = paging;
		paging = newPaging;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__PAGING, oldPaging, newPaging);
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
	public void setPaging(org.hl7.fhir.Boolean newPaging) {
		if (newPaging != paging) {
			NotificationChain msgs = null;
			if (paging != null)
				msgs = ((InternalEObject)paging).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__PAGING, null, msgs);
			if (newPaging != null)
				msgs = ((InternalEObject)newPaging).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__PAGING, null, msgs);
			msgs = basicSetPaging(newPaging, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__PAGING, newPaging, newPaging));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getIncomplete() {
		return incomplete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncomplete(org.hl7.fhir.Boolean newIncomplete, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldIncomplete = incomplete;
		incomplete = newIncomplete;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__INCOMPLETE, oldIncomplete, newIncomplete);
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
	public void setIncomplete(org.hl7.fhir.Boolean newIncomplete) {
		if (newIncomplete != incomplete) {
			NotificationChain msgs = null;
			if (incomplete != null)
				msgs = ((InternalEObject)incomplete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__INCOMPLETE, null, msgs);
			if (newIncomplete != null)
				msgs = ((InternalEObject)newIncomplete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__INCOMPLETE, null, msgs);
			msgs = basicSetIncomplete(newIncomplete, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__INCOMPLETE, newIncomplete, newIncomplete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TerminologyCapabilitiesParameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<TerminologyCapabilitiesParameter>(TerminologyCapabilitiesParameter.class, this, FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getTextFilter() {
		return textFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextFilter(Markdown newTextFilter, NotificationChain msgs) {
		Markdown oldTextFilter = textFilter;
		textFilter = newTextFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__TEXT_FILTER, oldTextFilter, newTextFilter);
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
	public void setTextFilter(Markdown newTextFilter) {
		if (newTextFilter != textFilter) {
			NotificationChain msgs = null;
			if (textFilter != null)
				msgs = ((InternalEObject)textFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__TEXT_FILTER, null, msgs);
			if (newTextFilter != null)
				msgs = ((InternalEObject)newTextFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__TEXT_FILTER, null, msgs);
			msgs = basicSetTextFilter(newTextFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__TEXT_FILTER, newTextFilter, newTextFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__HIERARCHICAL:
				return basicSetHierarchical(null, msgs);
			case FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__PAGING:
				return basicSetPaging(null, msgs);
			case FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__INCOMPLETE:
				return basicSetIncomplete(null, msgs);
			case FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
			case FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__TEXT_FILTER:
				return basicSetTextFilter(null, msgs);
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
			case FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__HIERARCHICAL:
				return getHierarchical();
			case FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__PAGING:
				return getPaging();
			case FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__INCOMPLETE:
				return getIncomplete();
			case FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__PARAMETER:
				return getParameter();
			case FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__TEXT_FILTER:
				return getTextFilter();
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
			case FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__HIERARCHICAL:
				setHierarchical((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__PAGING:
				setPaging((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__INCOMPLETE:
				setIncomplete((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends TerminologyCapabilitiesParameter>)newValue);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__TEXT_FILTER:
				setTextFilter((Markdown)newValue);
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
			case FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__HIERARCHICAL:
				setHierarchical((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__PAGING:
				setPaging((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__INCOMPLETE:
				setIncomplete((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__PARAMETER:
				getParameter().clear();
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__TEXT_FILTER:
				setTextFilter((Markdown)null);
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
			case FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__HIERARCHICAL:
				return hierarchical != null;
			case FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__PAGING:
				return paging != null;
			case FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__INCOMPLETE:
				return incomplete != null;
			case FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION__TEXT_FILTER:
				return textFilter != null;
		}
		return super.eIsSet(featureID);
	}

} //TerminologyCapabilitiesExpansionImpl
