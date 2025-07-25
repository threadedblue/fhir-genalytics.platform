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
import org.hl7.fhir.Identifier;
import org.hl7.fhir.MedicinalProductPharmaceutical;
import org.hl7.fhir.MedicinalProductPharmaceuticalCharacteristics;
import org.hl7.fhir.MedicinalProductPharmaceuticalRouteOfAdministration;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicinal Product Pharmaceutical</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductPharmaceuticalImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductPharmaceuticalImpl#getAdministrableDoseForm <em>Administrable Dose Form</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductPharmaceuticalImpl#getUnitOfPresentation <em>Unit Of Presentation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductPharmaceuticalImpl#getIngredient <em>Ingredient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductPharmaceuticalImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductPharmaceuticalImpl#getCharacteristics <em>Characteristics</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductPharmaceuticalImpl#getRouteOfAdministration <em>Route Of Administration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductPharmaceuticalImpl extends DomainResourceImpl implements MedicinalProductPharmaceutical {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

	/**
	 * The cached value of the '{@link #getAdministrableDoseForm() <em>Administrable Dose Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdministrableDoseForm()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept administrableDoseForm;

	/**
	 * The cached value of the '{@link #getUnitOfPresentation() <em>Unit Of Presentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitOfPresentation()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept unitOfPresentation;

	/**
	 * The cached value of the '{@link #getIngredient() <em>Ingredient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIngredient()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> ingredient;

	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> device;

	/**
	 * The cached value of the '{@link #getCharacteristics() <em>Characteristics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductPharmaceuticalCharacteristics> characteristics;

	/**
	 * The cached value of the '{@link #getRouteOfAdministration() <em>Route Of Administration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteOfAdministration()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductPharmaceuticalRouteOfAdministration> routeOfAdministration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductPharmaceuticalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicinalProductPharmaceutical();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getAdministrableDoseForm() {
		return administrableDoseForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdministrableDoseForm(CodeableConcept newAdministrableDoseForm, NotificationChain msgs) {
		CodeableConcept oldAdministrableDoseForm = administrableDoseForm;
		administrableDoseForm = newAdministrableDoseForm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__ADMINISTRABLE_DOSE_FORM, oldAdministrableDoseForm, newAdministrableDoseForm);
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
	public void setAdministrableDoseForm(CodeableConcept newAdministrableDoseForm) {
		if (newAdministrableDoseForm != administrableDoseForm) {
			NotificationChain msgs = null;
			if (administrableDoseForm != null)
				msgs = ((InternalEObject)administrableDoseForm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__ADMINISTRABLE_DOSE_FORM, null, msgs);
			if (newAdministrableDoseForm != null)
				msgs = ((InternalEObject)newAdministrableDoseForm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__ADMINISTRABLE_DOSE_FORM, null, msgs);
			msgs = basicSetAdministrableDoseForm(newAdministrableDoseForm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__ADMINISTRABLE_DOSE_FORM, newAdministrableDoseForm, newAdministrableDoseForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getUnitOfPresentation() {
		return unitOfPresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnitOfPresentation(CodeableConcept newUnitOfPresentation, NotificationChain msgs) {
		CodeableConcept oldUnitOfPresentation = unitOfPresentation;
		unitOfPresentation = newUnitOfPresentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__UNIT_OF_PRESENTATION, oldUnitOfPresentation, newUnitOfPresentation);
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
	public void setUnitOfPresentation(CodeableConcept newUnitOfPresentation) {
		if (newUnitOfPresentation != unitOfPresentation) {
			NotificationChain msgs = null;
			if (unitOfPresentation != null)
				msgs = ((InternalEObject)unitOfPresentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__UNIT_OF_PRESENTATION, null, msgs);
			if (newUnitOfPresentation != null)
				msgs = ((InternalEObject)newUnitOfPresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__UNIT_OF_PRESENTATION, null, msgs);
			msgs = basicSetUnitOfPresentation(newUnitOfPresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__UNIT_OF_PRESENTATION, newUnitOfPresentation, newUnitOfPresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getIngredient() {
		if (ingredient == null) {
			ingredient = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__INGREDIENT);
		}
		return ingredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getDevice() {
		if (device == null) {
			device = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__DEVICE);
		}
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicinalProductPharmaceuticalCharacteristics> getCharacteristics() {
		if (characteristics == null) {
			characteristics = new EObjectContainmentEList<MedicinalProductPharmaceuticalCharacteristics>(MedicinalProductPharmaceuticalCharacteristics.class, this, FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__CHARACTERISTICS);
		}
		return characteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicinalProductPharmaceuticalRouteOfAdministration> getRouteOfAdministration() {
		if (routeOfAdministration == null) {
			routeOfAdministration = new EObjectContainmentEList<MedicinalProductPharmaceuticalRouteOfAdministration>(MedicinalProductPharmaceuticalRouteOfAdministration.class, this, FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__ROUTE_OF_ADMINISTRATION);
		}
		return routeOfAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__ADMINISTRABLE_DOSE_FORM:
				return basicSetAdministrableDoseForm(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__UNIT_OF_PRESENTATION:
				return basicSetUnitOfPresentation(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__INGREDIENT:
				return ((InternalEList<?>)getIngredient()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__DEVICE:
				return ((InternalEList<?>)getDevice()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__CHARACTERISTICS:
				return ((InternalEList<?>)getCharacteristics()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__ROUTE_OF_ADMINISTRATION:
				return ((InternalEList<?>)getRouteOfAdministration()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__ADMINISTRABLE_DOSE_FORM:
				return getAdministrableDoseForm();
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__UNIT_OF_PRESENTATION:
				return getUnitOfPresentation();
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__INGREDIENT:
				return getIngredient();
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__DEVICE:
				return getDevice();
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__CHARACTERISTICS:
				return getCharacteristics();
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__ROUTE_OF_ADMINISTRATION:
				return getRouteOfAdministration();
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
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__ADMINISTRABLE_DOSE_FORM:
				setAdministrableDoseForm((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__UNIT_OF_PRESENTATION:
				setUnitOfPresentation((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__INGREDIENT:
				getIngredient().clear();
				getIngredient().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__DEVICE:
				getDevice().clear();
				getDevice().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__CHARACTERISTICS:
				getCharacteristics().clear();
				getCharacteristics().addAll((Collection<? extends MedicinalProductPharmaceuticalCharacteristics>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__ROUTE_OF_ADMINISTRATION:
				getRouteOfAdministration().clear();
				getRouteOfAdministration().addAll((Collection<? extends MedicinalProductPharmaceuticalRouteOfAdministration>)newValue);
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
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__ADMINISTRABLE_DOSE_FORM:
				setAdministrableDoseForm((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__UNIT_OF_PRESENTATION:
				setUnitOfPresentation((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__INGREDIENT:
				getIngredient().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__DEVICE:
				getDevice().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__CHARACTERISTICS:
				getCharacteristics().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__ROUTE_OF_ADMINISTRATION:
				getRouteOfAdministration().clear();
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
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__ADMINISTRABLE_DOSE_FORM:
				return administrableDoseForm != null;
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__UNIT_OF_PRESENTATION:
				return unitOfPresentation != null;
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__INGREDIENT:
				return ingredient != null && !ingredient.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__DEVICE:
				return device != null && !device.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__CHARACTERISTICS:
				return characteristics != null && !characteristics.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__ROUTE_OF_ADMINISTRATION:
				return routeOfAdministration != null && !routeOfAdministration.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductPharmaceuticalImpl
