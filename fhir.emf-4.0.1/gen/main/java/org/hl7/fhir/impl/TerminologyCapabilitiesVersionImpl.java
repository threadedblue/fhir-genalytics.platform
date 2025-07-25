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
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.TerminologyCapabilitiesFilter;
import org.hl7.fhir.TerminologyCapabilitiesVersion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminology Capabilities Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.TerminologyCapabilitiesVersionImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TerminologyCapabilitiesVersionImpl#getIsDefault <em>Is Default</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TerminologyCapabilitiesVersionImpl#getCompositional <em>Compositional</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TerminologyCapabilitiesVersionImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TerminologyCapabilitiesVersionImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TerminologyCapabilitiesVersionImpl#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TerminologyCapabilitiesVersionImpl extends BackboneElementImpl implements TerminologyCapabilitiesVersion {
	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String code;

	/**
	 * The cached value of the '{@link #getIsDefault() <em>Is Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDefault()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean isDefault;

	/**
	 * The cached value of the '{@link #getCompositional() <em>Compositional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositional()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean compositional;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> language;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected EList<TerminologyCapabilitiesFilter> filter;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> property;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminologyCapabilitiesVersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getTerminologyCapabilitiesVersion();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(org.hl7.fhir.String newCode, NotificationChain msgs) {
		org.hl7.fhir.String oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION__CODE, oldCode, newCode);
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
	public void setCode(org.hl7.fhir.String newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getIsDefault() {
		return isDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsDefault(org.hl7.fhir.Boolean newIsDefault, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldIsDefault = isDefault;
		isDefault = newIsDefault;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION__IS_DEFAULT, oldIsDefault, newIsDefault);
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
	public void setIsDefault(org.hl7.fhir.Boolean newIsDefault) {
		if (newIsDefault != isDefault) {
			NotificationChain msgs = null;
			if (isDefault != null)
				msgs = ((InternalEObject)isDefault).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION__IS_DEFAULT, null, msgs);
			if (newIsDefault != null)
				msgs = ((InternalEObject)newIsDefault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION__IS_DEFAULT, null, msgs);
			msgs = basicSetIsDefault(newIsDefault, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION__IS_DEFAULT, newIsDefault, newIsDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getCompositional() {
		return compositional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompositional(org.hl7.fhir.Boolean newCompositional, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldCompositional = compositional;
		compositional = newCompositional;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION__COMPOSITIONAL, oldCompositional, newCompositional);
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
	public void setCompositional(org.hl7.fhir.Boolean newCompositional) {
		if (newCompositional != compositional) {
			NotificationChain msgs = null;
			if (compositional != null)
				msgs = ((InternalEObject)compositional).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION__COMPOSITIONAL, null, msgs);
			if (newCompositional != null)
				msgs = ((InternalEObject)newCompositional).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION__COMPOSITIONAL, null, msgs);
			msgs = basicSetCompositional(newCompositional, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION__COMPOSITIONAL, newCompositional, newCompositional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Code> getLanguage() {
		if (language == null) {
			language = new EObjectContainmentEList<Code>(Code.class, this, FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION__LANGUAGE);
		}
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TerminologyCapabilitiesFilter> getFilter() {
		if (filter == null) {
			filter = new EObjectContainmentEList<TerminologyCapabilitiesFilter>(TerminologyCapabilitiesFilter.class, this, FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION__FILTER);
		}
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Code> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<Code>(Code.class, this, FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION__IS_DEFAULT:
				return basicSetIsDefault(null, msgs);
			case FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION__COMPOSITIONAL:
				return basicSetCompositional(null, msgs);
			case FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION__LANGUAGE:
				return ((InternalEList<?>)getLanguage()).basicRemove(otherEnd, msgs);
			case FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION__FILTER:
				return ((InternalEList<?>)getFilter()).basicRemove(otherEnd, msgs);
			case FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION__CODE:
				return getCode();
			case FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION__IS_DEFAULT:
				return getIsDefault();
			case FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION__COMPOSITIONAL:
				return getCompositional();
			case FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION__LANGUAGE:
				return getLanguage();
			case FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION__FILTER:
				return getFilter();
			case FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION__PROPERTY:
				return getProperty();
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
			case FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION__CODE:
				setCode((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION__IS_DEFAULT:
				setIsDefault((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION__COMPOSITIONAL:
				setCompositional((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION__LANGUAGE:
				getLanguage().clear();
				getLanguage().addAll((Collection<? extends Code>)newValue);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION__FILTER:
				getFilter().clear();
				getFilter().addAll((Collection<? extends TerminologyCapabilitiesFilter>)newValue);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends Code>)newValue);
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
			case FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION__CODE:
				setCode((org.hl7.fhir.String)null);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION__IS_DEFAULT:
				setIsDefault((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION__COMPOSITIONAL:
				setCompositional((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION__LANGUAGE:
				getLanguage().clear();
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION__FILTER:
				getFilter().clear();
				return;
			case FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION__PROPERTY:
				getProperty().clear();
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
			case FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION__CODE:
				return code != null;
			case FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION__IS_DEFAULT:
				return isDefault != null;
			case FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION__COMPOSITIONAL:
				return compositional != null;
			case FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION__LANGUAGE:
				return language != null && !language.isEmpty();
			case FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION__FILTER:
				return filter != null && !filter.isEmpty();
			case FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION__PROPERTY:
				return property != null && !property.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TerminologyCapabilitiesVersionImpl
