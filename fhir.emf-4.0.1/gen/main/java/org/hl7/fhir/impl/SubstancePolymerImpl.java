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
import org.hl7.fhir.SubstancePolymer;
import org.hl7.fhir.SubstancePolymerMonomerSet;
import org.hl7.fhir.SubstancePolymerRepeat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Polymer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubstancePolymerImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstancePolymerImpl#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstancePolymerImpl#getCopolymerConnectivity <em>Copolymer Connectivity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstancePolymerImpl#getModification <em>Modification</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstancePolymerImpl#getMonomerSet <em>Monomer Set</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstancePolymerImpl#getRepeat <em>Repeat</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstancePolymerImpl extends DomainResourceImpl implements SubstancePolymer {
	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept class_;

	/**
	 * The cached value of the '{@link #getGeometry() <em>Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometry()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept geometry;

	/**
	 * The cached value of the '{@link #getCopolymerConnectivity() <em>Copolymer Connectivity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopolymerConnectivity()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> copolymerConnectivity;

	/**
	 * The cached value of the '{@link #getModification() <em>Modification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModification()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> modification;

	/**
	 * The cached value of the '{@link #getMonomerSet() <em>Monomer Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonomerSet()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstancePolymerMonomerSet> monomerSet;

	/**
	 * The cached value of the '{@link #getRepeat() <em>Repeat</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeat()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstancePolymerRepeat> repeat;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstancePolymerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubstancePolymer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClass(CodeableConcept newClass, NotificationChain msgs) {
		CodeableConcept oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_POLYMER__CLASS, oldClass, newClass);
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
	public void setClass(CodeableConcept newClass) {
		if (newClass != class_) {
			NotificationChain msgs = null;
			if (class_ != null)
				msgs = ((InternalEObject)class_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_POLYMER__CLASS, null, msgs);
			if (newClass != null)
				msgs = ((InternalEObject)newClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_POLYMER__CLASS, null, msgs);
			msgs = basicSetClass(newClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_POLYMER__CLASS, newClass, newClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getGeometry() {
		return geometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeometry(CodeableConcept newGeometry, NotificationChain msgs) {
		CodeableConcept oldGeometry = geometry;
		geometry = newGeometry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_POLYMER__GEOMETRY, oldGeometry, newGeometry);
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
	public void setGeometry(CodeableConcept newGeometry) {
		if (newGeometry != geometry) {
			NotificationChain msgs = null;
			if (geometry != null)
				msgs = ((InternalEObject)geometry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_POLYMER__GEOMETRY, null, msgs);
			if (newGeometry != null)
				msgs = ((InternalEObject)newGeometry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_POLYMER__GEOMETRY, null, msgs);
			msgs = basicSetGeometry(newGeometry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_POLYMER__GEOMETRY, newGeometry, newGeometry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCopolymerConnectivity() {
		if (copolymerConnectivity == null) {
			copolymerConnectivity = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.SUBSTANCE_POLYMER__COPOLYMER_CONNECTIVITY);
		}
		return copolymerConnectivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.hl7.fhir.String> getModification() {
		if (modification == null) {
			modification = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.SUBSTANCE_POLYMER__MODIFICATION);
		}
		return modification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstancePolymerMonomerSet> getMonomerSet() {
		if (monomerSet == null) {
			monomerSet = new EObjectContainmentEList<SubstancePolymerMonomerSet>(SubstancePolymerMonomerSet.class, this, FhirPackage.SUBSTANCE_POLYMER__MONOMER_SET);
		}
		return monomerSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstancePolymerRepeat> getRepeat() {
		if (repeat == null) {
			repeat = new EObjectContainmentEList<SubstancePolymerRepeat>(SubstancePolymerRepeat.class, this, FhirPackage.SUBSTANCE_POLYMER__REPEAT);
		}
		return repeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUBSTANCE_POLYMER__CLASS:
				return basicSetClass(null, msgs);
			case FhirPackage.SUBSTANCE_POLYMER__GEOMETRY:
				return basicSetGeometry(null, msgs);
			case FhirPackage.SUBSTANCE_POLYMER__COPOLYMER_CONNECTIVITY:
				return ((InternalEList<?>)getCopolymerConnectivity()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_POLYMER__MODIFICATION:
				return ((InternalEList<?>)getModification()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_POLYMER__MONOMER_SET:
				return ((InternalEList<?>)getMonomerSet()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_POLYMER__REPEAT:
				return ((InternalEList<?>)getRepeat()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.SUBSTANCE_POLYMER__CLASS:
				return getClass_();
			case FhirPackage.SUBSTANCE_POLYMER__GEOMETRY:
				return getGeometry();
			case FhirPackage.SUBSTANCE_POLYMER__COPOLYMER_CONNECTIVITY:
				return getCopolymerConnectivity();
			case FhirPackage.SUBSTANCE_POLYMER__MODIFICATION:
				return getModification();
			case FhirPackage.SUBSTANCE_POLYMER__MONOMER_SET:
				return getMonomerSet();
			case FhirPackage.SUBSTANCE_POLYMER__REPEAT:
				return getRepeat();
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
			case FhirPackage.SUBSTANCE_POLYMER__CLASS:
				setClass((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_POLYMER__GEOMETRY:
				setGeometry((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_POLYMER__COPOLYMER_CONNECTIVITY:
				getCopolymerConnectivity().clear();
				getCopolymerConnectivity().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.SUBSTANCE_POLYMER__MODIFICATION:
				getModification().clear();
				getModification().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.SUBSTANCE_POLYMER__MONOMER_SET:
				getMonomerSet().clear();
				getMonomerSet().addAll((Collection<? extends SubstancePolymerMonomerSet>)newValue);
				return;
			case FhirPackage.SUBSTANCE_POLYMER__REPEAT:
				getRepeat().clear();
				getRepeat().addAll((Collection<? extends SubstancePolymerRepeat>)newValue);
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
			case FhirPackage.SUBSTANCE_POLYMER__CLASS:
				setClass((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_POLYMER__GEOMETRY:
				setGeometry((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_POLYMER__COPOLYMER_CONNECTIVITY:
				getCopolymerConnectivity().clear();
				return;
			case FhirPackage.SUBSTANCE_POLYMER__MODIFICATION:
				getModification().clear();
				return;
			case FhirPackage.SUBSTANCE_POLYMER__MONOMER_SET:
				getMonomerSet().clear();
				return;
			case FhirPackage.SUBSTANCE_POLYMER__REPEAT:
				getRepeat().clear();
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
			case FhirPackage.SUBSTANCE_POLYMER__CLASS:
				return class_ != null;
			case FhirPackage.SUBSTANCE_POLYMER__GEOMETRY:
				return geometry != null;
			case FhirPackage.SUBSTANCE_POLYMER__COPOLYMER_CONNECTIVITY:
				return copolymerConnectivity != null && !copolymerConnectivity.isEmpty();
			case FhirPackage.SUBSTANCE_POLYMER__MODIFICATION:
				return modification != null && !modification.isEmpty();
			case FhirPackage.SUBSTANCE_POLYMER__MONOMER_SET:
				return monomerSet != null && !monomerSet.isEmpty();
			case FhirPackage.SUBSTANCE_POLYMER__REPEAT:
				return repeat != null && !repeat.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubstancePolymerImpl
