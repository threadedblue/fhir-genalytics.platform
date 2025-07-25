/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.SubstanceAmount;
import org.hl7.fhir.SubstancePolymerDegreeOfPolymerisation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Polymer Degree Of Polymerisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubstancePolymerDegreeOfPolymerisationImpl#getDegree <em>Degree</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstancePolymerDegreeOfPolymerisationImpl#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstancePolymerDegreeOfPolymerisationImpl extends BackboneElementImpl implements SubstancePolymerDegreeOfPolymerisation {
	/**
	 * The cached value of the '{@link #getDegree() <em>Degree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegree()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept degree;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected SubstanceAmount amount;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstancePolymerDegreeOfPolymerisationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubstancePolymerDegreeOfPolymerisation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getDegree() {
		return degree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDegree(CodeableConcept newDegree, NotificationChain msgs) {
		CodeableConcept oldDegree = degree;
		degree = newDegree;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__DEGREE, oldDegree, newDegree);
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
	public void setDegree(CodeableConcept newDegree) {
		if (newDegree != degree) {
			NotificationChain msgs = null;
			if (degree != null)
				msgs = ((InternalEObject)degree).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__DEGREE, null, msgs);
			if (newDegree != null)
				msgs = ((InternalEObject)newDegree).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__DEGREE, null, msgs);
			msgs = basicSetDegree(newDegree, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__DEGREE, newDegree, newDegree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceAmount getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmount(SubstanceAmount newAmount, NotificationChain msgs) {
		SubstanceAmount oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__AMOUNT, oldAmount, newAmount);
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
	public void setAmount(SubstanceAmount newAmount) {
		if (newAmount != amount) {
			NotificationChain msgs = null;
			if (amount != null)
				msgs = ((InternalEObject)amount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__AMOUNT, null, msgs);
			if (newAmount != null)
				msgs = ((InternalEObject)newAmount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__AMOUNT, null, msgs);
			msgs = basicSetAmount(newAmount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__AMOUNT, newAmount, newAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__DEGREE:
				return basicSetDegree(null, msgs);
			case FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__AMOUNT:
				return basicSetAmount(null, msgs);
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
			case FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__DEGREE:
				return getDegree();
			case FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__AMOUNT:
				return getAmount();
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
			case FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__DEGREE:
				setDegree((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__AMOUNT:
				setAmount((SubstanceAmount)newValue);
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
			case FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__DEGREE:
				setDegree((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__AMOUNT:
				setAmount((SubstanceAmount)null);
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
			case FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__DEGREE:
				return degree != null;
			case FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__AMOUNT:
				return amount != null;
		}
		return super.eIsSet(featureID);
	}

} //SubstancePolymerDegreeOfPolymerisationImpl
