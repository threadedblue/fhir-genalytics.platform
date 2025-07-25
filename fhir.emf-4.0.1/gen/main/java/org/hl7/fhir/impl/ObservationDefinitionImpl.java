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
import org.hl7.fhir.ObservationDataType;
import org.hl7.fhir.ObservationDefinition;
import org.hl7.fhir.ObservationDefinitionQualifiedInterval;
import org.hl7.fhir.ObservationDefinitionQuantitativeDetails;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observation Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getPermittedDataType <em>Permitted Data Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getMultipleResultsAllowed <em>Multiple Results Allowed</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getPreferredReportName <em>Preferred Report Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getQuantitativeDetails <em>Quantitative Details</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getQualifiedInterval <em>Qualified Interval</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getValidCodedValueSet <em>Valid Coded Value Set</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getNormalCodedValueSet <em>Normal Coded Value Set</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getAbnormalCodedValueSet <em>Abnormal Coded Value Set</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionImpl#getCriticalCodedValueSet <em>Critical Coded Value Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObservationDefinitionImpl extends DomainResourceImpl implements ObservationDefinition {
	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> category;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

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
	 * The cached value of the '{@link #getPermittedDataType() <em>Permitted Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermittedDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<ObservationDataType> permittedDataType;

	/**
	 * The cached value of the '{@link #getMultipleResultsAllowed() <em>Multiple Results Allowed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleResultsAllowed()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean multipleResultsAllowed;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept method;

	/**
	 * The cached value of the '{@link #getPreferredReportName() <em>Preferred Report Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredReportName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String preferredReportName;

	/**
	 * The cached value of the '{@link #getQuantitativeDetails() <em>Quantitative Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantitativeDetails()
	 * @generated
	 * @ordered
	 */
	protected ObservationDefinitionQuantitativeDetails quantitativeDetails;

	/**
	 * The cached value of the '{@link #getQualifiedInterval() <em>Qualified Interval</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedInterval()
	 * @generated
	 * @ordered
	 */
	protected EList<ObservationDefinitionQualifiedInterval> qualifiedInterval;

	/**
	 * The cached value of the '{@link #getValidCodedValueSet() <em>Valid Coded Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidCodedValueSet()
	 * @generated
	 * @ordered
	 */
	protected Reference validCodedValueSet;

	/**
	 * The cached value of the '{@link #getNormalCodedValueSet() <em>Normal Coded Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalCodedValueSet()
	 * @generated
	 * @ordered
	 */
	protected Reference normalCodedValueSet;

	/**
	 * The cached value of the '{@link #getAbnormalCodedValueSet() <em>Abnormal Coded Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbnormalCodedValueSet()
	 * @generated
	 * @ordered
	 */
	protected Reference abnormalCodedValueSet;

	/**
	 * The cached value of the '{@link #getCriticalCodedValueSet() <em>Critical Coded Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticalCodedValueSet()
	 * @generated
	 * @ordered
	 */
	protected Reference criticalCodedValueSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObservationDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getObservationDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.OBSERVATION_DEFINITION__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CodeableConcept newCode, NotificationChain msgs) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__CODE, oldCode, newCode);
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
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.OBSERVATION_DEFINITION__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ObservationDataType> getPermittedDataType() {
		if (permittedDataType == null) {
			permittedDataType = new EObjectContainmentEList<ObservationDataType>(ObservationDataType.class, this, FhirPackage.OBSERVATION_DEFINITION__PERMITTED_DATA_TYPE);
		}
		return permittedDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getMultipleResultsAllowed() {
		return multipleResultsAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultipleResultsAllowed(org.hl7.fhir.Boolean newMultipleResultsAllowed, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldMultipleResultsAllowed = multipleResultsAllowed;
		multipleResultsAllowed = newMultipleResultsAllowed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__MULTIPLE_RESULTS_ALLOWED, oldMultipleResultsAllowed, newMultipleResultsAllowed);
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
	public void setMultipleResultsAllowed(org.hl7.fhir.Boolean newMultipleResultsAllowed) {
		if (newMultipleResultsAllowed != multipleResultsAllowed) {
			NotificationChain msgs = null;
			if (multipleResultsAllowed != null)
				msgs = ((InternalEObject)multipleResultsAllowed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__MULTIPLE_RESULTS_ALLOWED, null, msgs);
			if (newMultipleResultsAllowed != null)
				msgs = ((InternalEObject)newMultipleResultsAllowed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__MULTIPLE_RESULTS_ALLOWED, null, msgs);
			msgs = basicSetMultipleResultsAllowed(newMultipleResultsAllowed, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__MULTIPLE_RESULTS_ALLOWED, newMultipleResultsAllowed, newMultipleResultsAllowed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(CodeableConcept newMethod, NotificationChain msgs) {
		CodeableConcept oldMethod = method;
		method = newMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__METHOD, oldMethod, newMethod);
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
	public void setMethod(CodeableConcept newMethod) {
		if (newMethod != method) {
			NotificationChain msgs = null;
			if (method != null)
				msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__METHOD, null, msgs);
			if (newMethod != null)
				msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__METHOD, null, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__METHOD, newMethod, newMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getPreferredReportName() {
		return preferredReportName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreferredReportName(org.hl7.fhir.String newPreferredReportName, NotificationChain msgs) {
		org.hl7.fhir.String oldPreferredReportName = preferredReportName;
		preferredReportName = newPreferredReportName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__PREFERRED_REPORT_NAME, oldPreferredReportName, newPreferredReportName);
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
	public void setPreferredReportName(org.hl7.fhir.String newPreferredReportName) {
		if (newPreferredReportName != preferredReportName) {
			NotificationChain msgs = null;
			if (preferredReportName != null)
				msgs = ((InternalEObject)preferredReportName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__PREFERRED_REPORT_NAME, null, msgs);
			if (newPreferredReportName != null)
				msgs = ((InternalEObject)newPreferredReportName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__PREFERRED_REPORT_NAME, null, msgs);
			msgs = basicSetPreferredReportName(newPreferredReportName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__PREFERRED_REPORT_NAME, newPreferredReportName, newPreferredReportName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObservationDefinitionQuantitativeDetails getQuantitativeDetails() {
		return quantitativeDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantitativeDetails(ObservationDefinitionQuantitativeDetails newQuantitativeDetails, NotificationChain msgs) {
		ObservationDefinitionQuantitativeDetails oldQuantitativeDetails = quantitativeDetails;
		quantitativeDetails = newQuantitativeDetails;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__QUANTITATIVE_DETAILS, oldQuantitativeDetails, newQuantitativeDetails);
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
	public void setQuantitativeDetails(ObservationDefinitionQuantitativeDetails newQuantitativeDetails) {
		if (newQuantitativeDetails != quantitativeDetails) {
			NotificationChain msgs = null;
			if (quantitativeDetails != null)
				msgs = ((InternalEObject)quantitativeDetails).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__QUANTITATIVE_DETAILS, null, msgs);
			if (newQuantitativeDetails != null)
				msgs = ((InternalEObject)newQuantitativeDetails).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__QUANTITATIVE_DETAILS, null, msgs);
			msgs = basicSetQuantitativeDetails(newQuantitativeDetails, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__QUANTITATIVE_DETAILS, newQuantitativeDetails, newQuantitativeDetails));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ObservationDefinitionQualifiedInterval> getQualifiedInterval() {
		if (qualifiedInterval == null) {
			qualifiedInterval = new EObjectContainmentEList<ObservationDefinitionQualifiedInterval>(ObservationDefinitionQualifiedInterval.class, this, FhirPackage.OBSERVATION_DEFINITION__QUALIFIED_INTERVAL);
		}
		return qualifiedInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getValidCodedValueSet() {
		return validCodedValueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidCodedValueSet(Reference newValidCodedValueSet, NotificationChain msgs) {
		Reference oldValidCodedValueSet = validCodedValueSet;
		validCodedValueSet = newValidCodedValueSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__VALID_CODED_VALUE_SET, oldValidCodedValueSet, newValidCodedValueSet);
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
	public void setValidCodedValueSet(Reference newValidCodedValueSet) {
		if (newValidCodedValueSet != validCodedValueSet) {
			NotificationChain msgs = null;
			if (validCodedValueSet != null)
				msgs = ((InternalEObject)validCodedValueSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__VALID_CODED_VALUE_SET, null, msgs);
			if (newValidCodedValueSet != null)
				msgs = ((InternalEObject)newValidCodedValueSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__VALID_CODED_VALUE_SET, null, msgs);
			msgs = basicSetValidCodedValueSet(newValidCodedValueSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__VALID_CODED_VALUE_SET, newValidCodedValueSet, newValidCodedValueSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getNormalCodedValueSet() {
		return normalCodedValueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNormalCodedValueSet(Reference newNormalCodedValueSet, NotificationChain msgs) {
		Reference oldNormalCodedValueSet = normalCodedValueSet;
		normalCodedValueSet = newNormalCodedValueSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__NORMAL_CODED_VALUE_SET, oldNormalCodedValueSet, newNormalCodedValueSet);
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
	public void setNormalCodedValueSet(Reference newNormalCodedValueSet) {
		if (newNormalCodedValueSet != normalCodedValueSet) {
			NotificationChain msgs = null;
			if (normalCodedValueSet != null)
				msgs = ((InternalEObject)normalCodedValueSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__NORMAL_CODED_VALUE_SET, null, msgs);
			if (newNormalCodedValueSet != null)
				msgs = ((InternalEObject)newNormalCodedValueSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__NORMAL_CODED_VALUE_SET, null, msgs);
			msgs = basicSetNormalCodedValueSet(newNormalCodedValueSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__NORMAL_CODED_VALUE_SET, newNormalCodedValueSet, newNormalCodedValueSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getAbnormalCodedValueSet() {
		return abnormalCodedValueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbnormalCodedValueSet(Reference newAbnormalCodedValueSet, NotificationChain msgs) {
		Reference oldAbnormalCodedValueSet = abnormalCodedValueSet;
		abnormalCodedValueSet = newAbnormalCodedValueSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__ABNORMAL_CODED_VALUE_SET, oldAbnormalCodedValueSet, newAbnormalCodedValueSet);
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
	public void setAbnormalCodedValueSet(Reference newAbnormalCodedValueSet) {
		if (newAbnormalCodedValueSet != abnormalCodedValueSet) {
			NotificationChain msgs = null;
			if (abnormalCodedValueSet != null)
				msgs = ((InternalEObject)abnormalCodedValueSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__ABNORMAL_CODED_VALUE_SET, null, msgs);
			if (newAbnormalCodedValueSet != null)
				msgs = ((InternalEObject)newAbnormalCodedValueSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__ABNORMAL_CODED_VALUE_SET, null, msgs);
			msgs = basicSetAbnormalCodedValueSet(newAbnormalCodedValueSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__ABNORMAL_CODED_VALUE_SET, newAbnormalCodedValueSet, newAbnormalCodedValueSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getCriticalCodedValueSet() {
		return criticalCodedValueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCriticalCodedValueSet(Reference newCriticalCodedValueSet, NotificationChain msgs) {
		Reference oldCriticalCodedValueSet = criticalCodedValueSet;
		criticalCodedValueSet = newCriticalCodedValueSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__CRITICAL_CODED_VALUE_SET, oldCriticalCodedValueSet, newCriticalCodedValueSet);
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
	public void setCriticalCodedValueSet(Reference newCriticalCodedValueSet) {
		if (newCriticalCodedValueSet != criticalCodedValueSet) {
			NotificationChain msgs = null;
			if (criticalCodedValueSet != null)
				msgs = ((InternalEObject)criticalCodedValueSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__CRITICAL_CODED_VALUE_SET, null, msgs);
			if (newCriticalCodedValueSet != null)
				msgs = ((InternalEObject)newCriticalCodedValueSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION__CRITICAL_CODED_VALUE_SET, null, msgs);
			msgs = basicSetCriticalCodedValueSet(newCriticalCodedValueSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION__CRITICAL_CODED_VALUE_SET, newCriticalCodedValueSet, newCriticalCodedValueSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.OBSERVATION_DEFINITION__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__PERMITTED_DATA_TYPE:
				return ((InternalEList<?>)getPermittedDataType()).basicRemove(otherEnd, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__MULTIPLE_RESULTS_ALLOWED:
				return basicSetMultipleResultsAllowed(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__METHOD:
				return basicSetMethod(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__PREFERRED_REPORT_NAME:
				return basicSetPreferredReportName(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__QUANTITATIVE_DETAILS:
				return basicSetQuantitativeDetails(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__QUALIFIED_INTERVAL:
				return ((InternalEList<?>)getQualifiedInterval()).basicRemove(otherEnd, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__VALID_CODED_VALUE_SET:
				return basicSetValidCodedValueSet(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__NORMAL_CODED_VALUE_SET:
				return basicSetNormalCodedValueSet(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__ABNORMAL_CODED_VALUE_SET:
				return basicSetAbnormalCodedValueSet(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION__CRITICAL_CODED_VALUE_SET:
				return basicSetCriticalCodedValueSet(null, msgs);
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
			case FhirPackage.OBSERVATION_DEFINITION__CATEGORY:
				return getCategory();
			case FhirPackage.OBSERVATION_DEFINITION__CODE:
				return getCode();
			case FhirPackage.OBSERVATION_DEFINITION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.OBSERVATION_DEFINITION__PERMITTED_DATA_TYPE:
				return getPermittedDataType();
			case FhirPackage.OBSERVATION_DEFINITION__MULTIPLE_RESULTS_ALLOWED:
				return getMultipleResultsAllowed();
			case FhirPackage.OBSERVATION_DEFINITION__METHOD:
				return getMethod();
			case FhirPackage.OBSERVATION_DEFINITION__PREFERRED_REPORT_NAME:
				return getPreferredReportName();
			case FhirPackage.OBSERVATION_DEFINITION__QUANTITATIVE_DETAILS:
				return getQuantitativeDetails();
			case FhirPackage.OBSERVATION_DEFINITION__QUALIFIED_INTERVAL:
				return getQualifiedInterval();
			case FhirPackage.OBSERVATION_DEFINITION__VALID_CODED_VALUE_SET:
				return getValidCodedValueSet();
			case FhirPackage.OBSERVATION_DEFINITION__NORMAL_CODED_VALUE_SET:
				return getNormalCodedValueSet();
			case FhirPackage.OBSERVATION_DEFINITION__ABNORMAL_CODED_VALUE_SET:
				return getAbnormalCodedValueSet();
			case FhirPackage.OBSERVATION_DEFINITION__CRITICAL_CODED_VALUE_SET:
				return getCriticalCodedValueSet();
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
			case FhirPackage.OBSERVATION_DEFINITION__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__PERMITTED_DATA_TYPE:
				getPermittedDataType().clear();
				getPermittedDataType().addAll((Collection<? extends ObservationDataType>)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__MULTIPLE_RESULTS_ALLOWED:
				setMultipleResultsAllowed((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__METHOD:
				setMethod((CodeableConcept)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__PREFERRED_REPORT_NAME:
				setPreferredReportName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__QUANTITATIVE_DETAILS:
				setQuantitativeDetails((ObservationDefinitionQuantitativeDetails)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__QUALIFIED_INTERVAL:
				getQualifiedInterval().clear();
				getQualifiedInterval().addAll((Collection<? extends ObservationDefinitionQualifiedInterval>)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__VALID_CODED_VALUE_SET:
				setValidCodedValueSet((Reference)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__NORMAL_CODED_VALUE_SET:
				setNormalCodedValueSet((Reference)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__ABNORMAL_CODED_VALUE_SET:
				setAbnormalCodedValueSet((Reference)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__CRITICAL_CODED_VALUE_SET:
				setCriticalCodedValueSet((Reference)newValue);
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
			case FhirPackage.OBSERVATION_DEFINITION__CATEGORY:
				getCategory().clear();
				return;
			case FhirPackage.OBSERVATION_DEFINITION__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.OBSERVATION_DEFINITION__PERMITTED_DATA_TYPE:
				getPermittedDataType().clear();
				return;
			case FhirPackage.OBSERVATION_DEFINITION__MULTIPLE_RESULTS_ALLOWED:
				setMultipleResultsAllowed((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__METHOD:
				setMethod((CodeableConcept)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__PREFERRED_REPORT_NAME:
				setPreferredReportName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__QUANTITATIVE_DETAILS:
				setQuantitativeDetails((ObservationDefinitionQuantitativeDetails)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__QUALIFIED_INTERVAL:
				getQualifiedInterval().clear();
				return;
			case FhirPackage.OBSERVATION_DEFINITION__VALID_CODED_VALUE_SET:
				setValidCodedValueSet((Reference)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__NORMAL_CODED_VALUE_SET:
				setNormalCodedValueSet((Reference)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__ABNORMAL_CODED_VALUE_SET:
				setAbnormalCodedValueSet((Reference)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION__CRITICAL_CODED_VALUE_SET:
				setCriticalCodedValueSet((Reference)null);
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
			case FhirPackage.OBSERVATION_DEFINITION__CATEGORY:
				return category != null && !category.isEmpty();
			case FhirPackage.OBSERVATION_DEFINITION__CODE:
				return code != null;
			case FhirPackage.OBSERVATION_DEFINITION__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.OBSERVATION_DEFINITION__PERMITTED_DATA_TYPE:
				return permittedDataType != null && !permittedDataType.isEmpty();
			case FhirPackage.OBSERVATION_DEFINITION__MULTIPLE_RESULTS_ALLOWED:
				return multipleResultsAllowed != null;
			case FhirPackage.OBSERVATION_DEFINITION__METHOD:
				return method != null;
			case FhirPackage.OBSERVATION_DEFINITION__PREFERRED_REPORT_NAME:
				return preferredReportName != null;
			case FhirPackage.OBSERVATION_DEFINITION__QUANTITATIVE_DETAILS:
				return quantitativeDetails != null;
			case FhirPackage.OBSERVATION_DEFINITION__QUALIFIED_INTERVAL:
				return qualifiedInterval != null && !qualifiedInterval.isEmpty();
			case FhirPackage.OBSERVATION_DEFINITION__VALID_CODED_VALUE_SET:
				return validCodedValueSet != null;
			case FhirPackage.OBSERVATION_DEFINITION__NORMAL_CODED_VALUE_SET:
				return normalCodedValueSet != null;
			case FhirPackage.OBSERVATION_DEFINITION__ABNORMAL_CODED_VALUE_SET:
				return abnormalCodedValueSet != null;
			case FhirPackage.OBSERVATION_DEFINITION__CRITICAL_CODED_VALUE_SET:
				return criticalCodedValueSet != null;
		}
		return super.eIsSet(featureID);
	}

} //ObservationDefinitionImpl
