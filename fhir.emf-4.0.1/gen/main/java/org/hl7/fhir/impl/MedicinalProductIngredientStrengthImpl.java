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
import org.hl7.fhir.MedicinalProductIngredientReferenceStrength;
import org.hl7.fhir.MedicinalProductIngredientStrength;
import org.hl7.fhir.Ratio;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicinal Product Ingredient Strength</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductIngredientStrengthImpl#getPresentation <em>Presentation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductIngredientStrengthImpl#getPresentationLowLimit <em>Presentation Low Limit</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductIngredientStrengthImpl#getConcentration <em>Concentration</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductIngredientStrengthImpl#getConcentrationLowLimit <em>Concentration Low Limit</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductIngredientStrengthImpl#getMeasurementPoint <em>Measurement Point</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductIngredientStrengthImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductIngredientStrengthImpl#getReferenceStrength <em>Reference Strength</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductIngredientStrengthImpl extends BackboneElementImpl implements MedicinalProductIngredientStrength {
	/**
	 * The cached value of the '{@link #getPresentation() <em>Presentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentation()
	 * @generated
	 * @ordered
	 */
	protected Ratio presentation;

	/**
	 * The cached value of the '{@link #getPresentationLowLimit() <em>Presentation Low Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationLowLimit()
	 * @generated
	 * @ordered
	 */
	protected Ratio presentationLowLimit;

	/**
	 * The cached value of the '{@link #getConcentration() <em>Concentration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcentration()
	 * @generated
	 * @ordered
	 */
	protected Ratio concentration;

	/**
	 * The cached value of the '{@link #getConcentrationLowLimit() <em>Concentration Low Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcentrationLowLimit()
	 * @generated
	 * @ordered
	 */
	protected Ratio concentrationLowLimit;

	/**
	 * The cached value of the '{@link #getMeasurementPoint() <em>Measurement Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementPoint()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String measurementPoint;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> country;

	/**
	 * The cached value of the '{@link #getReferenceStrength() <em>Reference Strength</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceStrength()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductIngredientReferenceStrength> referenceStrength;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductIngredientStrengthImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicinalProductIngredientStrength();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ratio getPresentation() {
		return presentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPresentation(Ratio newPresentation, NotificationChain msgs) {
		Ratio oldPresentation = presentation;
		presentation = newPresentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__PRESENTATION, oldPresentation, newPresentation);
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
	public void setPresentation(Ratio newPresentation) {
		if (newPresentation != presentation) {
			NotificationChain msgs = null;
			if (presentation != null)
				msgs = ((InternalEObject)presentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__PRESENTATION, null, msgs);
			if (newPresentation != null)
				msgs = ((InternalEObject)newPresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__PRESENTATION, null, msgs);
			msgs = basicSetPresentation(newPresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__PRESENTATION, newPresentation, newPresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ratio getPresentationLowLimit() {
		return presentationLowLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPresentationLowLimit(Ratio newPresentationLowLimit, NotificationChain msgs) {
		Ratio oldPresentationLowLimit = presentationLowLimit;
		presentationLowLimit = newPresentationLowLimit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__PRESENTATION_LOW_LIMIT, oldPresentationLowLimit, newPresentationLowLimit);
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
	public void setPresentationLowLimit(Ratio newPresentationLowLimit) {
		if (newPresentationLowLimit != presentationLowLimit) {
			NotificationChain msgs = null;
			if (presentationLowLimit != null)
				msgs = ((InternalEObject)presentationLowLimit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__PRESENTATION_LOW_LIMIT, null, msgs);
			if (newPresentationLowLimit != null)
				msgs = ((InternalEObject)newPresentationLowLimit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__PRESENTATION_LOW_LIMIT, null, msgs);
			msgs = basicSetPresentationLowLimit(newPresentationLowLimit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__PRESENTATION_LOW_LIMIT, newPresentationLowLimit, newPresentationLowLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ratio getConcentration() {
		return concentration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcentration(Ratio newConcentration, NotificationChain msgs) {
		Ratio oldConcentration = concentration;
		concentration = newConcentration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__CONCENTRATION, oldConcentration, newConcentration);
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
	public void setConcentration(Ratio newConcentration) {
		if (newConcentration != concentration) {
			NotificationChain msgs = null;
			if (concentration != null)
				msgs = ((InternalEObject)concentration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__CONCENTRATION, null, msgs);
			if (newConcentration != null)
				msgs = ((InternalEObject)newConcentration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__CONCENTRATION, null, msgs);
			msgs = basicSetConcentration(newConcentration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__CONCENTRATION, newConcentration, newConcentration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ratio getConcentrationLowLimit() {
		return concentrationLowLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcentrationLowLimit(Ratio newConcentrationLowLimit, NotificationChain msgs) {
		Ratio oldConcentrationLowLimit = concentrationLowLimit;
		concentrationLowLimit = newConcentrationLowLimit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__CONCENTRATION_LOW_LIMIT, oldConcentrationLowLimit, newConcentrationLowLimit);
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
	public void setConcentrationLowLimit(Ratio newConcentrationLowLimit) {
		if (newConcentrationLowLimit != concentrationLowLimit) {
			NotificationChain msgs = null;
			if (concentrationLowLimit != null)
				msgs = ((InternalEObject)concentrationLowLimit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__CONCENTRATION_LOW_LIMIT, null, msgs);
			if (newConcentrationLowLimit != null)
				msgs = ((InternalEObject)newConcentrationLowLimit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__CONCENTRATION_LOW_LIMIT, null, msgs);
			msgs = basicSetConcentrationLowLimit(newConcentrationLowLimit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__CONCENTRATION_LOW_LIMIT, newConcentrationLowLimit, newConcentrationLowLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getMeasurementPoint() {
		return measurementPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasurementPoint(org.hl7.fhir.String newMeasurementPoint, NotificationChain msgs) {
		org.hl7.fhir.String oldMeasurementPoint = measurementPoint;
		measurementPoint = newMeasurementPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__MEASUREMENT_POINT, oldMeasurementPoint, newMeasurementPoint);
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
	public void setMeasurementPoint(org.hl7.fhir.String newMeasurementPoint) {
		if (newMeasurementPoint != measurementPoint) {
			NotificationChain msgs = null;
			if (measurementPoint != null)
				msgs = ((InternalEObject)measurementPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__MEASUREMENT_POINT, null, msgs);
			if (newMeasurementPoint != null)
				msgs = ((InternalEObject)newMeasurementPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__MEASUREMENT_POINT, null, msgs);
			msgs = basicSetMeasurementPoint(newMeasurementPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__MEASUREMENT_POINT, newMeasurementPoint, newMeasurementPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCountry() {
		if (country == null) {
			country = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__COUNTRY);
		}
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicinalProductIngredientReferenceStrength> getReferenceStrength() {
		if (referenceStrength == null) {
			referenceStrength = new EObjectContainmentEList<MedicinalProductIngredientReferenceStrength>(MedicinalProductIngredientReferenceStrength.class, this, FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__REFERENCE_STRENGTH);
		}
		return referenceStrength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__PRESENTATION:
				return basicSetPresentation(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__PRESENTATION_LOW_LIMIT:
				return basicSetPresentationLowLimit(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__CONCENTRATION:
				return basicSetConcentration(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__CONCENTRATION_LOW_LIMIT:
				return basicSetConcentrationLowLimit(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__MEASUREMENT_POINT:
				return basicSetMeasurementPoint(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__COUNTRY:
				return ((InternalEList<?>)getCountry()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__REFERENCE_STRENGTH:
				return ((InternalEList<?>)getReferenceStrength()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__PRESENTATION:
				return getPresentation();
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__PRESENTATION_LOW_LIMIT:
				return getPresentationLowLimit();
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__CONCENTRATION:
				return getConcentration();
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__CONCENTRATION_LOW_LIMIT:
				return getConcentrationLowLimit();
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__MEASUREMENT_POINT:
				return getMeasurementPoint();
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__COUNTRY:
				return getCountry();
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__REFERENCE_STRENGTH:
				return getReferenceStrength();
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
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__PRESENTATION:
				setPresentation((Ratio)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__PRESENTATION_LOW_LIMIT:
				setPresentationLowLimit((Ratio)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__CONCENTRATION:
				setConcentration((Ratio)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__CONCENTRATION_LOW_LIMIT:
				setConcentrationLowLimit((Ratio)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__MEASUREMENT_POINT:
				setMeasurementPoint((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__COUNTRY:
				getCountry().clear();
				getCountry().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__REFERENCE_STRENGTH:
				getReferenceStrength().clear();
				getReferenceStrength().addAll((Collection<? extends MedicinalProductIngredientReferenceStrength>)newValue);
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
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__PRESENTATION:
				setPresentation((Ratio)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__PRESENTATION_LOW_LIMIT:
				setPresentationLowLimit((Ratio)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__CONCENTRATION:
				setConcentration((Ratio)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__CONCENTRATION_LOW_LIMIT:
				setConcentrationLowLimit((Ratio)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__MEASUREMENT_POINT:
				setMeasurementPoint((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__COUNTRY:
				getCountry().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__REFERENCE_STRENGTH:
				getReferenceStrength().clear();
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
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__PRESENTATION:
				return presentation != null;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__PRESENTATION_LOW_LIMIT:
				return presentationLowLimit != null;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__CONCENTRATION:
				return concentration != null;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__CONCENTRATION_LOW_LIMIT:
				return concentrationLowLimit != null;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__MEASUREMENT_POINT:
				return measurementPoint != null;
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__COUNTRY:
				return country != null && !country.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH__REFERENCE_STRENGTH:
				return referenceStrength != null && !referenceStrength.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductIngredientStrengthImpl
