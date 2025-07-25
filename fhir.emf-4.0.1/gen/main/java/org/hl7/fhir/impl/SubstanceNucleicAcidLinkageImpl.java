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
import org.hl7.fhir.SubstanceNucleicAcidLinkage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Nucleic Acid Linkage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubstanceNucleicAcidLinkageImpl#getConnectivity <em>Connectivity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceNucleicAcidLinkageImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceNucleicAcidLinkageImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceNucleicAcidLinkageImpl#getResidueSite <em>Residue Site</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceNucleicAcidLinkageImpl extends BackboneElementImpl implements SubstanceNucleicAcidLinkage {
	/**
	 * The cached value of the '{@link #getConnectivity() <em>Connectivity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectivity()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String connectivity;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

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
	 * The cached value of the '{@link #getResidueSite() <em>Residue Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResidueSite()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String residueSite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceNucleicAcidLinkageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubstanceNucleicAcidLinkage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getConnectivity() {
		return connectivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectivity(org.hl7.fhir.String newConnectivity, NotificationChain msgs) {
		org.hl7.fhir.String oldConnectivity = connectivity;
		connectivity = newConnectivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_NUCLEIC_ACID_LINKAGE__CONNECTIVITY, oldConnectivity, newConnectivity);
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
	public void setConnectivity(org.hl7.fhir.String newConnectivity) {
		if (newConnectivity != connectivity) {
			NotificationChain msgs = null;
			if (connectivity != null)
				msgs = ((InternalEObject)connectivity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_NUCLEIC_ACID_LINKAGE__CONNECTIVITY, null, msgs);
			if (newConnectivity != null)
				msgs = ((InternalEObject)newConnectivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_NUCLEIC_ACID_LINKAGE__CONNECTIVITY, null, msgs);
			msgs = basicSetConnectivity(newConnectivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_NUCLEIC_ACID_LINKAGE__CONNECTIVITY, newConnectivity, newConnectivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_NUCLEIC_ACID_LINKAGE__IDENTIFIER, oldIdentifier, newIdentifier);
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
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_NUCLEIC_ACID_LINKAGE__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_NUCLEIC_ACID_LINKAGE__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_NUCLEIC_ACID_LINKAGE__IDENTIFIER, newIdentifier, newIdentifier));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_NUCLEIC_ACID_LINKAGE__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_NUCLEIC_ACID_LINKAGE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_NUCLEIC_ACID_LINKAGE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_NUCLEIC_ACID_LINKAGE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getResidueSite() {
		return residueSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResidueSite(org.hl7.fhir.String newResidueSite, NotificationChain msgs) {
		org.hl7.fhir.String oldResidueSite = residueSite;
		residueSite = newResidueSite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_NUCLEIC_ACID_LINKAGE__RESIDUE_SITE, oldResidueSite, newResidueSite);
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
	public void setResidueSite(org.hl7.fhir.String newResidueSite) {
		if (newResidueSite != residueSite) {
			NotificationChain msgs = null;
			if (residueSite != null)
				msgs = ((InternalEObject)residueSite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_NUCLEIC_ACID_LINKAGE__RESIDUE_SITE, null, msgs);
			if (newResidueSite != null)
				msgs = ((InternalEObject)newResidueSite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_NUCLEIC_ACID_LINKAGE__RESIDUE_SITE, null, msgs);
			msgs = basicSetResidueSite(newResidueSite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_NUCLEIC_ACID_LINKAGE__RESIDUE_SITE, newResidueSite, newResidueSite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_LINKAGE__CONNECTIVITY:
				return basicSetConnectivity(null, msgs);
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_LINKAGE__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_LINKAGE__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_LINKAGE__RESIDUE_SITE:
				return basicSetResidueSite(null, msgs);
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
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_LINKAGE__CONNECTIVITY:
				return getConnectivity();
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_LINKAGE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_LINKAGE__NAME:
				return getName();
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_LINKAGE__RESIDUE_SITE:
				return getResidueSite();
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
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_LINKAGE__CONNECTIVITY:
				setConnectivity((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_LINKAGE__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_LINKAGE__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_LINKAGE__RESIDUE_SITE:
				setResidueSite((org.hl7.fhir.String)newValue);
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
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_LINKAGE__CONNECTIVITY:
				setConnectivity((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_LINKAGE__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_LINKAGE__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_LINKAGE__RESIDUE_SITE:
				setResidueSite((org.hl7.fhir.String)null);
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
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_LINKAGE__CONNECTIVITY:
				return connectivity != null;
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_LINKAGE__IDENTIFIER:
				return identifier != null;
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_LINKAGE__NAME:
				return name != null;
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_LINKAGE__RESIDUE_SITE:
				return residueSite != null;
		}
		return super.eIsSet(featureID);
	}

} //SubstanceNucleicAcidLinkageImpl
