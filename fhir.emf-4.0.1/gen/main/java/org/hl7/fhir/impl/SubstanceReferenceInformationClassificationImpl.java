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
import org.hl7.fhir.SubstanceReferenceInformationClassification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Reference Information Classification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubstanceReferenceInformationClassificationImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceReferenceInformationClassificationImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceReferenceInformationClassificationImpl#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceReferenceInformationClassificationImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceReferenceInformationClassificationImpl extends BackboneElementImpl implements SubstanceReferenceInformationClassification {
	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept domain;

	/**
	 * The cached value of the '{@link #getClassification() <em>Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept classification;

	/**
	 * The cached value of the '{@link #getSubtype() <em>Subtype</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtype()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> subtype;

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
	protected SubstanceReferenceInformationClassificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubstanceReferenceInformationClassification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomain(CodeableConcept newDomain, NotificationChain msgs) {
		CodeableConcept oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__DOMAIN, oldDomain, newDomain);
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
	public void setDomain(CodeableConcept newDomain) {
		if (newDomain != domain) {
			NotificationChain msgs = null;
			if (domain != null)
				msgs = ((InternalEObject)domain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__DOMAIN, null, msgs);
			if (newDomain != null)
				msgs = ((InternalEObject)newDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__DOMAIN, null, msgs);
			msgs = basicSetDomain(newDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__DOMAIN, newDomain, newDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getClassification() {
		return classification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassification(CodeableConcept newClassification, NotificationChain msgs) {
		CodeableConcept oldClassification = classification;
		classification = newClassification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__CLASSIFICATION, oldClassification, newClassification);
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
	public void setClassification(CodeableConcept newClassification) {
		if (newClassification != classification) {
			NotificationChain msgs = null;
			if (classification != null)
				msgs = ((InternalEObject)classification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__CLASSIFICATION, null, msgs);
			if (newClassification != null)
				msgs = ((InternalEObject)newClassification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__CLASSIFICATION, null, msgs);
			msgs = basicSetClassification(newClassification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__CLASSIFICATION, newClassification, newClassification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getSubtype() {
		if (subtype == null) {
			subtype = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__SUBTYPE);
		}
		return subtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSource() {
		if (source == null) {
			source = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__SOURCE);
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
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__DOMAIN:
				return basicSetDomain(null, msgs);
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__CLASSIFICATION:
				return basicSetClassification(null, msgs);
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__SUBTYPE:
				return ((InternalEList<?>)getSubtype()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__SOURCE:
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
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__DOMAIN:
				return getDomain();
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__CLASSIFICATION:
				return getClassification();
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__SUBTYPE:
				return getSubtype();
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__SOURCE:
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
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__DOMAIN:
				setDomain((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__CLASSIFICATION:
				setClassification((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__SUBTYPE:
				getSubtype().clear();
				getSubtype().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__SOURCE:
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
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__DOMAIN:
				setDomain((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__CLASSIFICATION:
				setClassification((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__SUBTYPE:
				getSubtype().clear();
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__SOURCE:
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
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__DOMAIN:
				return domain != null;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__CLASSIFICATION:
				return classification != null;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__SUBTYPE:
				return subtype != null && !subtype.isEmpty();
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__SOURCE:
				return source != null && !source.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubstanceReferenceInformationClassificationImpl
