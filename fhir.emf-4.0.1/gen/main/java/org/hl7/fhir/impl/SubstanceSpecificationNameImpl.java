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

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Reference;
import org.hl7.fhir.SubstanceSpecificationName;
import org.hl7.fhir.SubstanceSpecificationOfficial;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Specification Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationNameImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationNameImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationNameImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationNameImpl#getPreferred <em>Preferred</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationNameImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationNameImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationNameImpl#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationNameImpl#getSynonym <em>Synonym</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationNameImpl#getTranslation <em>Translation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationNameImpl#getOfficial <em>Official</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationNameImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceSpecificationNameImpl extends BackboneElementImpl implements SubstanceSpecificationName {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String name;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept status;

	/**
	 * The cached value of the '{@link #getPreferred() <em>Preferred</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferred()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean preferred;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> language;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> domain;

	/**
	 * The cached value of the '{@link #getJurisdiction() <em>Jurisdiction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJurisdiction()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> jurisdiction;

	/**
	 * The cached value of the '{@link #getSynonym() <em>Synonym</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynonym()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceSpecificationName> synonym;

	/**
	 * The cached value of the '{@link #getTranslation() <em>Translation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslation()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceSpecificationName> translation;

	/**
	 * The cached value of the '{@link #getOfficial() <em>Official</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfficial()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceSpecificationOfficial> official;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceSpecificationNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubstanceSpecificationName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.hl7.fhir.String newName, NotificationChain msgs) {
		org.hl7.fhir.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_NAME__NAME, oldName, newName);
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
	public void setName(org.hl7.fhir.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_NAME__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_NAME__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_NAME__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_NAME__TYPE, oldType, newType);
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
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_NAME__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_NAME__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_NAME__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(CodeableConcept newStatus, NotificationChain msgs) {
		CodeableConcept oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_NAME__STATUS, oldStatus, newStatus);
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
	public void setStatus(CodeableConcept newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_NAME__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_NAME__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_NAME__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getPreferred() {
		return preferred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreferred(org.hl7.fhir.Boolean newPreferred, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldPreferred = preferred;
		preferred = newPreferred;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_NAME__PREFERRED, oldPreferred, newPreferred);
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
	public void setPreferred(org.hl7.fhir.Boolean newPreferred) {
		if (newPreferred != preferred) {
			NotificationChain msgs = null;
			if (preferred != null)
				msgs = ((InternalEObject)preferred).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_NAME__PREFERRED, null, msgs);
			if (newPreferred != null)
				msgs = ((InternalEObject)newPreferred).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_NAME__PREFERRED, null, msgs);
			msgs = basicSetPreferred(newPreferred, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_NAME__PREFERRED, newPreferred, newPreferred));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getLanguage() {
		if (language == null) {
			language = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.SUBSTANCE_SPECIFICATION_NAME__LANGUAGE);
		}
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getDomain() {
		if (domain == null) {
			domain = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.SUBSTANCE_SPECIFICATION_NAME__DOMAIN);
		}
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getJurisdiction() {
		if (jurisdiction == null) {
			jurisdiction = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.SUBSTANCE_SPECIFICATION_NAME__JURISDICTION);
		}
		return jurisdiction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstanceSpecificationName> getSynonym() {
		if (synonym == null) {
			synonym = new EObjectContainmentEList<SubstanceSpecificationName>(SubstanceSpecificationName.class, this, FhirPackage.SUBSTANCE_SPECIFICATION_NAME__SYNONYM);
		}
		return synonym;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstanceSpecificationName> getTranslation() {
		if (translation == null) {
			translation = new EObjectContainmentEList<SubstanceSpecificationName>(SubstanceSpecificationName.class, this, FhirPackage.SUBSTANCE_SPECIFICATION_NAME__TRANSLATION);
		}
		return translation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstanceSpecificationOfficial> getOfficial() {
		if (official == null) {
			official = new EObjectContainmentEList<SubstanceSpecificationOfficial>(SubstanceSpecificationOfficial.class, this, FhirPackage.SUBSTANCE_SPECIFICATION_NAME__OFFICIAL);
		}
		return official;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSource() {
		if (source == null) {
			source = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.SUBSTANCE_SPECIFICATION_NAME__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__PREFERRED:
				return basicSetPreferred(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__LANGUAGE:
				return ((InternalEList<?>)getLanguage()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__DOMAIN:
				return ((InternalEList<?>)getDomain()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__JURISDICTION:
				return ((InternalEList<?>)getJurisdiction()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__SYNONYM:
				return ((InternalEList<?>)getSynonym()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__TRANSLATION:
				return ((InternalEList<?>)getTranslation()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__OFFICIAL:
				return ((InternalEList<?>)getOfficial()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__NAME:
				return getName();
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__TYPE:
				return getType();
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__STATUS:
				return getStatus();
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__PREFERRED:
				return getPreferred();
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__LANGUAGE:
				return getLanguage();
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__DOMAIN:
				return getDomain();
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__JURISDICTION:
				return getJurisdiction();
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__SYNONYM:
				return getSynonym();
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__TRANSLATION:
				return getTranslation();
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__OFFICIAL:
				return getOfficial();
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__SOURCE:
				return getSource();
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
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__STATUS:
				setStatus((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__PREFERRED:
				setPreferred((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__LANGUAGE:
				getLanguage().clear();
				getLanguage().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__DOMAIN:
				getDomain().clear();
				getDomain().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__JURISDICTION:
				getJurisdiction().clear();
				getJurisdiction().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__SYNONYM:
				getSynonym().clear();
				getSynonym().addAll((Collection<? extends SubstanceSpecificationName>)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__TRANSLATION:
				getTranslation().clear();
				getTranslation().addAll((Collection<? extends SubstanceSpecificationName>)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__OFFICIAL:
				getOfficial().clear();
				getOfficial().addAll((Collection<? extends SubstanceSpecificationOfficial>)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends Reference>)newValue);
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
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__STATUS:
				setStatus((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__PREFERRED:
				setPreferred((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__LANGUAGE:
				getLanguage().clear();
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__DOMAIN:
				getDomain().clear();
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__JURISDICTION:
				getJurisdiction().clear();
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__SYNONYM:
				getSynonym().clear();
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__TRANSLATION:
				getTranslation().clear();
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__OFFICIAL:
				getOfficial().clear();
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__SOURCE:
				getSource().clear();
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
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__NAME:
				return name != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__TYPE:
				return type != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__STATUS:
				return status != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__PREFERRED:
				return preferred != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__LANGUAGE:
				return language != null && !language.isEmpty();
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__DOMAIN:
				return domain != null && !domain.isEmpty();
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__JURISDICTION:
				return jurisdiction != null && !jurisdiction.isEmpty();
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__SYNONYM:
				return synonym != null && !synonym.isEmpty();
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__TRANSLATION:
				return translation != null && !translation.isEmpty();
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__OFFICIAL:
				return official != null && !official.isEmpty();
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME__SOURCE:
				return source != null && !source.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubstanceSpecificationNameImpl
