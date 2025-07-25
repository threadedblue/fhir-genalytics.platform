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
import org.hl7.fhir.ImmunizationRecommendationDateCriterion;
import org.hl7.fhir.ImmunizationRecommendationRecommendation;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immunization Recommendation Recommendation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationRecommendationRecommendationImpl#getVaccineCode <em>Vaccine Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationRecommendationRecommendationImpl#getTargetDisease <em>Target Disease</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationRecommendationRecommendationImpl#getContraindicatedVaccineCode <em>Contraindicated Vaccine Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationRecommendationRecommendationImpl#getForecastStatus <em>Forecast Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationRecommendationRecommendationImpl#getForecastReason <em>Forecast Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationRecommendationRecommendationImpl#getDateCriterion <em>Date Criterion</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationRecommendationRecommendationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationRecommendationRecommendationImpl#getSeries <em>Series</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationRecommendationRecommendationImpl#getDoseNumberPositiveInt <em>Dose Number Positive Int</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationRecommendationRecommendationImpl#getDoseNumberString <em>Dose Number String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationRecommendationRecommendationImpl#getSeriesDosesPositiveInt <em>Series Doses Positive Int</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationRecommendationRecommendationImpl#getSeriesDosesString <em>Series Doses String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationRecommendationRecommendationImpl#getSupportingImmunization <em>Supporting Immunization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationRecommendationRecommendationImpl#getSupportingPatientInformation <em>Supporting Patient Information</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImmunizationRecommendationRecommendationImpl extends BackboneElementImpl implements ImmunizationRecommendationRecommendation {
	/**
	 * The cached value of the '{@link #getVaccineCode() <em>Vaccine Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVaccineCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> vaccineCode;

	/**
	 * The cached value of the '{@link #getTargetDisease() <em>Target Disease</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDisease()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept targetDisease;

	/**
	 * The cached value of the '{@link #getContraindicatedVaccineCode() <em>Contraindicated Vaccine Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContraindicatedVaccineCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> contraindicatedVaccineCode;

	/**
	 * The cached value of the '{@link #getForecastStatus() <em>Forecast Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecastStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept forecastStatus;

	/**
	 * The cached value of the '{@link #getForecastReason() <em>Forecast Reason</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecastReason()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> forecastReason;

	/**
	 * The cached value of the '{@link #getDateCriterion() <em>Date Criterion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateCriterion()
	 * @generated
	 * @ordered
	 */
	protected EList<ImmunizationRecommendationDateCriterion> dateCriterion;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String description;

	/**
	 * The cached value of the '{@link #getSeries() <em>Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeries()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String series;

	/**
	 * The cached value of the '{@link #getDoseNumberPositiveInt() <em>Dose Number Positive Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseNumberPositiveInt()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt doseNumberPositiveInt;

	/**
	 * The cached value of the '{@link #getDoseNumberString() <em>Dose Number String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseNumberString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String doseNumberString;

	/**
	 * The cached value of the '{@link #getSeriesDosesPositiveInt() <em>Series Doses Positive Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriesDosesPositiveInt()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt seriesDosesPositiveInt;

	/**
	 * The cached value of the '{@link #getSeriesDosesString() <em>Series Doses String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriesDosesString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String seriesDosesString;

	/**
	 * The cached value of the '{@link #getSupportingImmunization() <em>Supporting Immunization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingImmunization()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> supportingImmunization;

	/**
	 * The cached value of the '{@link #getSupportingPatientInformation() <em>Supporting Patient Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingPatientInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> supportingPatientInformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmunizationRecommendationRecommendationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getImmunizationRecommendationRecommendation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getVaccineCode() {
		if (vaccineCode == null) {
			vaccineCode = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__VACCINE_CODE);
		}
		return vaccineCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getTargetDisease() {
		return targetDisease;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetDisease(CodeableConcept newTargetDisease, NotificationChain msgs) {
		CodeableConcept oldTargetDisease = targetDisease;
		targetDisease = newTargetDisease;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__TARGET_DISEASE, oldTargetDisease, newTargetDisease);
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
	public void setTargetDisease(CodeableConcept newTargetDisease) {
		if (newTargetDisease != targetDisease) {
			NotificationChain msgs = null;
			if (targetDisease != null)
				msgs = ((InternalEObject)targetDisease).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__TARGET_DISEASE, null, msgs);
			if (newTargetDisease != null)
				msgs = ((InternalEObject)newTargetDisease).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__TARGET_DISEASE, null, msgs);
			msgs = basicSetTargetDisease(newTargetDisease, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__TARGET_DISEASE, newTargetDisease, newTargetDisease));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getContraindicatedVaccineCode() {
		if (contraindicatedVaccineCode == null) {
			contraindicatedVaccineCode = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__CONTRAINDICATED_VACCINE_CODE);
		}
		return contraindicatedVaccineCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getForecastStatus() {
		return forecastStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForecastStatus(CodeableConcept newForecastStatus, NotificationChain msgs) {
		CodeableConcept oldForecastStatus = forecastStatus;
		forecastStatus = newForecastStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_STATUS, oldForecastStatus, newForecastStatus);
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
	public void setForecastStatus(CodeableConcept newForecastStatus) {
		if (newForecastStatus != forecastStatus) {
			NotificationChain msgs = null;
			if (forecastStatus != null)
				msgs = ((InternalEObject)forecastStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_STATUS, null, msgs);
			if (newForecastStatus != null)
				msgs = ((InternalEObject)newForecastStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_STATUS, null, msgs);
			msgs = basicSetForecastStatus(newForecastStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_STATUS, newForecastStatus, newForecastStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getForecastReason() {
		if (forecastReason == null) {
			forecastReason = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_REASON);
		}
		return forecastReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImmunizationRecommendationDateCriterion> getDateCriterion() {
		if (dateCriterion == null) {
			dateCriterion = new EObjectContainmentEList<ImmunizationRecommendationDateCriterion>(ImmunizationRecommendationDateCriterion.class, this, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE_CRITERION);
		}
		return dateCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.hl7.fhir.String newDescription, NotificationChain msgs) {
		org.hl7.fhir.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(org.hl7.fhir.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getSeries() {
		return series;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeries(org.hl7.fhir.String newSeries, NotificationChain msgs) {
		org.hl7.fhir.String oldSeries = series;
		series = newSeries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES, oldSeries, newSeries);
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
	public void setSeries(org.hl7.fhir.String newSeries) {
		if (newSeries != series) {
			NotificationChain msgs = null;
			if (series != null)
				msgs = ((InternalEObject)series).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES, null, msgs);
			if (newSeries != null)
				msgs = ((InternalEObject)newSeries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES, null, msgs);
			msgs = basicSetSeries(newSeries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES, newSeries, newSeries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getDoseNumberPositiveInt() {
		return doseNumberPositiveInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoseNumberPositiveInt(PositiveInt newDoseNumberPositiveInt, NotificationChain msgs) {
		PositiveInt oldDoseNumberPositiveInt = doseNumberPositiveInt;
		doseNumberPositiveInt = newDoseNumberPositiveInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBER_POSITIVE_INT, oldDoseNumberPositiveInt, newDoseNumberPositiveInt);
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
	public void setDoseNumberPositiveInt(PositiveInt newDoseNumberPositiveInt) {
		if (newDoseNumberPositiveInt != doseNumberPositiveInt) {
			NotificationChain msgs = null;
			if (doseNumberPositiveInt != null)
				msgs = ((InternalEObject)doseNumberPositiveInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBER_POSITIVE_INT, null, msgs);
			if (newDoseNumberPositiveInt != null)
				msgs = ((InternalEObject)newDoseNumberPositiveInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBER_POSITIVE_INT, null, msgs);
			msgs = basicSetDoseNumberPositiveInt(newDoseNumberPositiveInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBER_POSITIVE_INT, newDoseNumberPositiveInt, newDoseNumberPositiveInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getDoseNumberString() {
		return doseNumberString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoseNumberString(org.hl7.fhir.String newDoseNumberString, NotificationChain msgs) {
		org.hl7.fhir.String oldDoseNumberString = doseNumberString;
		doseNumberString = newDoseNumberString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBER_STRING, oldDoseNumberString, newDoseNumberString);
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
	public void setDoseNumberString(org.hl7.fhir.String newDoseNumberString) {
		if (newDoseNumberString != doseNumberString) {
			NotificationChain msgs = null;
			if (doseNumberString != null)
				msgs = ((InternalEObject)doseNumberString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBER_STRING, null, msgs);
			if (newDoseNumberString != null)
				msgs = ((InternalEObject)newDoseNumberString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBER_STRING, null, msgs);
			msgs = basicSetDoseNumberString(newDoseNumberString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBER_STRING, newDoseNumberString, newDoseNumberString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getSeriesDosesPositiveInt() {
		return seriesDosesPositiveInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeriesDosesPositiveInt(PositiveInt newSeriesDosesPositiveInt, NotificationChain msgs) {
		PositiveInt oldSeriesDosesPositiveInt = seriesDosesPositiveInt;
		seriesDosesPositiveInt = newSeriesDosesPositiveInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES_DOSES_POSITIVE_INT, oldSeriesDosesPositiveInt, newSeriesDosesPositiveInt);
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
	public void setSeriesDosesPositiveInt(PositiveInt newSeriesDosesPositiveInt) {
		if (newSeriesDosesPositiveInt != seriesDosesPositiveInt) {
			NotificationChain msgs = null;
			if (seriesDosesPositiveInt != null)
				msgs = ((InternalEObject)seriesDosesPositiveInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES_DOSES_POSITIVE_INT, null, msgs);
			if (newSeriesDosesPositiveInt != null)
				msgs = ((InternalEObject)newSeriesDosesPositiveInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES_DOSES_POSITIVE_INT, null, msgs);
			msgs = basicSetSeriesDosesPositiveInt(newSeriesDosesPositiveInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES_DOSES_POSITIVE_INT, newSeriesDosesPositiveInt, newSeriesDosesPositiveInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getSeriesDosesString() {
		return seriesDosesString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeriesDosesString(org.hl7.fhir.String newSeriesDosesString, NotificationChain msgs) {
		org.hl7.fhir.String oldSeriesDosesString = seriesDosesString;
		seriesDosesString = newSeriesDosesString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES_DOSES_STRING, oldSeriesDosesString, newSeriesDosesString);
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
	public void setSeriesDosesString(org.hl7.fhir.String newSeriesDosesString) {
		if (newSeriesDosesString != seriesDosesString) {
			NotificationChain msgs = null;
			if (seriesDosesString != null)
				msgs = ((InternalEObject)seriesDosesString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES_DOSES_STRING, null, msgs);
			if (newSeriesDosesString != null)
				msgs = ((InternalEObject)newSeriesDosesString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES_DOSES_STRING, null, msgs);
			msgs = basicSetSeriesDosesString(newSeriesDosesString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES_DOSES_STRING, newSeriesDosesString, newSeriesDosesString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSupportingImmunization() {
		if (supportingImmunization == null) {
			supportingImmunization = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_IMMUNIZATION);
		}
		return supportingImmunization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSupportingPatientInformation() {
		if (supportingPatientInformation == null) {
			supportingPatientInformation = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_PATIENT_INFORMATION);
		}
		return supportingPatientInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__VACCINE_CODE:
				return ((InternalEList<?>)getVaccineCode()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__TARGET_DISEASE:
				return basicSetTargetDisease(null, msgs);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__CONTRAINDICATED_VACCINE_CODE:
				return ((InternalEList<?>)getContraindicatedVaccineCode()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_STATUS:
				return basicSetForecastStatus(null, msgs);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_REASON:
				return ((InternalEList<?>)getForecastReason()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE_CRITERION:
				return ((InternalEList<?>)getDateCriterion()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES:
				return basicSetSeries(null, msgs);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBER_POSITIVE_INT:
				return basicSetDoseNumberPositiveInt(null, msgs);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBER_STRING:
				return basicSetDoseNumberString(null, msgs);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES_DOSES_POSITIVE_INT:
				return basicSetSeriesDosesPositiveInt(null, msgs);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES_DOSES_STRING:
				return basicSetSeriesDosesString(null, msgs);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_IMMUNIZATION:
				return ((InternalEList<?>)getSupportingImmunization()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_PATIENT_INFORMATION:
				return ((InternalEList<?>)getSupportingPatientInformation()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__VACCINE_CODE:
				return getVaccineCode();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__TARGET_DISEASE:
				return getTargetDisease();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__CONTRAINDICATED_VACCINE_CODE:
				return getContraindicatedVaccineCode();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_STATUS:
				return getForecastStatus();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_REASON:
				return getForecastReason();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE_CRITERION:
				return getDateCriterion();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DESCRIPTION:
				return getDescription();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES:
				return getSeries();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBER_POSITIVE_INT:
				return getDoseNumberPositiveInt();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBER_STRING:
				return getDoseNumberString();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES_DOSES_POSITIVE_INT:
				return getSeriesDosesPositiveInt();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES_DOSES_STRING:
				return getSeriesDosesString();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_IMMUNIZATION:
				return getSupportingImmunization();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_PATIENT_INFORMATION:
				return getSupportingPatientInformation();
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
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__VACCINE_CODE:
				getVaccineCode().clear();
				getVaccineCode().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__TARGET_DISEASE:
				setTargetDisease((CodeableConcept)newValue);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__CONTRAINDICATED_VACCINE_CODE:
				getContraindicatedVaccineCode().clear();
				getContraindicatedVaccineCode().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_STATUS:
				setForecastStatus((CodeableConcept)newValue);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_REASON:
				getForecastReason().clear();
				getForecastReason().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE_CRITERION:
				getDateCriterion().clear();
				getDateCriterion().addAll((Collection<? extends ImmunizationRecommendationDateCriterion>)newValue);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES:
				setSeries((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBER_POSITIVE_INT:
				setDoseNumberPositiveInt((PositiveInt)newValue);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBER_STRING:
				setDoseNumberString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES_DOSES_POSITIVE_INT:
				setSeriesDosesPositiveInt((PositiveInt)newValue);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES_DOSES_STRING:
				setSeriesDosesString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_IMMUNIZATION:
				getSupportingImmunization().clear();
				getSupportingImmunization().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_PATIENT_INFORMATION:
				getSupportingPatientInformation().clear();
				getSupportingPatientInformation().addAll((Collection<? extends Reference>)newValue);
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
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__VACCINE_CODE:
				getVaccineCode().clear();
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__TARGET_DISEASE:
				setTargetDisease((CodeableConcept)null);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__CONTRAINDICATED_VACCINE_CODE:
				getContraindicatedVaccineCode().clear();
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_STATUS:
				setForecastStatus((CodeableConcept)null);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_REASON:
				getForecastReason().clear();
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE_CRITERION:
				getDateCriterion().clear();
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES:
				setSeries((org.hl7.fhir.String)null);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBER_POSITIVE_INT:
				setDoseNumberPositiveInt((PositiveInt)null);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBER_STRING:
				setDoseNumberString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES_DOSES_POSITIVE_INT:
				setSeriesDosesPositiveInt((PositiveInt)null);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES_DOSES_STRING:
				setSeriesDosesString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_IMMUNIZATION:
				getSupportingImmunization().clear();
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_PATIENT_INFORMATION:
				getSupportingPatientInformation().clear();
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
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__VACCINE_CODE:
				return vaccineCode != null && !vaccineCode.isEmpty();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__TARGET_DISEASE:
				return targetDisease != null;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__CONTRAINDICATED_VACCINE_CODE:
				return contraindicatedVaccineCode != null && !contraindicatedVaccineCode.isEmpty();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_STATUS:
				return forecastStatus != null;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_REASON:
				return forecastReason != null && !forecastReason.isEmpty();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE_CRITERION:
				return dateCriterion != null && !dateCriterion.isEmpty();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DESCRIPTION:
				return description != null;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES:
				return series != null;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBER_POSITIVE_INT:
				return doseNumberPositiveInt != null;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBER_STRING:
				return doseNumberString != null;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES_DOSES_POSITIVE_INT:
				return seriesDosesPositiveInt != null;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES_DOSES_STRING:
				return seriesDosesString != null;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_IMMUNIZATION:
				return supportingImmunization != null && !supportingImmunization.isEmpty();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_PATIENT_INFORMATION:
				return supportingPatientInformation != null && !supportingPatientInformation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImmunizationRecommendationRecommendationImpl
