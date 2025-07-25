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

import org.hl7.fhir.Canonical;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.MeasureReport;
import org.hl7.fhir.MeasureReportGroup;
import org.hl7.fhir.MeasureReportStatus;
import org.hl7.fhir.MeasureReportType;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MeasureReportImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureReportImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureReportImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureReportImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureReportImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureReportImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureReportImpl#getReporter <em>Reporter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureReportImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureReportImpl#getImprovementNotation <em>Improvement Notation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureReportImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureReportImpl#getEvaluatedResource <em>Evaluated Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasureReportImpl extends DomainResourceImpl implements MeasureReport {
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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected MeasureReportStatus status;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected MeasureReportType type;

	/**
	 * The cached value of the '{@link #getMeasure() <em>Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasure()
	 * @generated
	 * @ordered
	 */
	protected Canonical measure;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Reference subject;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime date;

	/**
	 * The cached value of the '{@link #getReporter() <em>Reporter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReporter()
	 * @generated
	 * @ordered
	 */
	protected Reference reporter;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

	/**
	 * The cached value of the '{@link #getImprovementNotation() <em>Improvement Notation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImprovementNotation()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept improvementNotation;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureReportGroup> group;

	/**
	 * The cached value of the '{@link #getEvaluatedResource() <em>Evaluated Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluatedResource()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> evaluatedResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureReportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMeasureReport();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.MEASURE_REPORT__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureReportStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(MeasureReportStatus newStatus, NotificationChain msgs) {
		MeasureReportStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT__STATUS, oldStatus, newStatus);
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
	public void setStatus(MeasureReportStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureReportType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(MeasureReportType newType, NotificationChain msgs) {
		MeasureReportType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT__TYPE, oldType, newType);
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
	public void setType(MeasureReportType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Canonical getMeasure() {
		return measure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasure(Canonical newMeasure, NotificationChain msgs) {
		Canonical oldMeasure = measure;
		measure = newMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT__MEASURE, oldMeasure, newMeasure);
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
	public void setMeasure(Canonical newMeasure) {
		if (newMeasure != measure) {
			NotificationChain msgs = null;
			if (measure != null)
				msgs = ((InternalEObject)measure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT__MEASURE, null, msgs);
			if (newMeasure != null)
				msgs = ((InternalEObject)newMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT__MEASURE, null, msgs);
			msgs = basicSetMeasure(newMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT__MEASURE, newMeasure, newMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(Reference newSubject, NotificationChain msgs) {
		Reference oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT__SUBJECT, oldSubject, newSubject);
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
	public void setSubject(Reference newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null)
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(DateTime newDate, NotificationChain msgs) {
		DateTime oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT__DATE, oldDate, newDate);
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
	public void setDate(DateTime newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getReporter() {
		return reporter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReporter(Reference newReporter, NotificationChain msgs) {
		Reference oldReporter = reporter;
		reporter = newReporter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT__REPORTER, oldReporter, newReporter);
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
	public void setReporter(Reference newReporter) {
		if (newReporter != reporter) {
			NotificationChain msgs = null;
			if (reporter != null)
				msgs = ((InternalEObject)reporter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT__REPORTER, null, msgs);
			if (newReporter != null)
				msgs = ((InternalEObject)newReporter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT__REPORTER, null, msgs);
			msgs = basicSetReporter(newReporter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT__REPORTER, newReporter, newReporter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(Period newPeriod, NotificationChain msgs) {
		Period oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT__PERIOD, oldPeriod, newPeriod);
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
	public void setPeriod(Period newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getImprovementNotation() {
		return improvementNotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImprovementNotation(CodeableConcept newImprovementNotation, NotificationChain msgs) {
		CodeableConcept oldImprovementNotation = improvementNotation;
		improvementNotation = newImprovementNotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT__IMPROVEMENT_NOTATION, oldImprovementNotation, newImprovementNotation);
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
	public void setImprovementNotation(CodeableConcept newImprovementNotation) {
		if (newImprovementNotation != improvementNotation) {
			NotificationChain msgs = null;
			if (improvementNotation != null)
				msgs = ((InternalEObject)improvementNotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT__IMPROVEMENT_NOTATION, null, msgs);
			if (newImprovementNotation != null)
				msgs = ((InternalEObject)newImprovementNotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT__IMPROVEMENT_NOTATION, null, msgs);
			msgs = basicSetImprovementNotation(newImprovementNotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT__IMPROVEMENT_NOTATION, newImprovementNotation, newImprovementNotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MeasureReportGroup> getGroup() {
		if (group == null) {
			group = new EObjectContainmentEList<MeasureReportGroup>(MeasureReportGroup.class, this, FhirPackage.MEASURE_REPORT__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getEvaluatedResource() {
		if (evaluatedResource == null) {
			evaluatedResource = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEASURE_REPORT__EVALUATED_RESOURCE);
		}
		return evaluatedResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEASURE_REPORT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEASURE_REPORT__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.MEASURE_REPORT__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.MEASURE_REPORT__MEASURE:
				return basicSetMeasure(null, msgs);
			case FhirPackage.MEASURE_REPORT__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.MEASURE_REPORT__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.MEASURE_REPORT__REPORTER:
				return basicSetReporter(null, msgs);
			case FhirPackage.MEASURE_REPORT__PERIOD:
				return basicSetPeriod(null, msgs);
			case FhirPackage.MEASURE_REPORT__IMPROVEMENT_NOTATION:
				return basicSetImprovementNotation(null, msgs);
			case FhirPackage.MEASURE_REPORT__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEASURE_REPORT__EVALUATED_RESOURCE:
				return ((InternalEList<?>)getEvaluatedResource()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MEASURE_REPORT__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.MEASURE_REPORT__STATUS:
				return getStatus();
			case FhirPackage.MEASURE_REPORT__TYPE:
				return getType();
			case FhirPackage.MEASURE_REPORT__MEASURE:
				return getMeasure();
			case FhirPackage.MEASURE_REPORT__SUBJECT:
				return getSubject();
			case FhirPackage.MEASURE_REPORT__DATE:
				return getDate();
			case FhirPackage.MEASURE_REPORT__REPORTER:
				return getReporter();
			case FhirPackage.MEASURE_REPORT__PERIOD:
				return getPeriod();
			case FhirPackage.MEASURE_REPORT__IMPROVEMENT_NOTATION:
				return getImprovementNotation();
			case FhirPackage.MEASURE_REPORT__GROUP:
				return getGroup();
			case FhirPackage.MEASURE_REPORT__EVALUATED_RESOURCE:
				return getEvaluatedResource();
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
			case FhirPackage.MEASURE_REPORT__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.MEASURE_REPORT__STATUS:
				setStatus((MeasureReportStatus)newValue);
				return;
			case FhirPackage.MEASURE_REPORT__TYPE:
				setType((MeasureReportType)newValue);
				return;
			case FhirPackage.MEASURE_REPORT__MEASURE:
				setMeasure((Canonical)newValue);
				return;
			case FhirPackage.MEASURE_REPORT__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.MEASURE_REPORT__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.MEASURE_REPORT__REPORTER:
				setReporter((Reference)newValue);
				return;
			case FhirPackage.MEASURE_REPORT__PERIOD:
				setPeriod((Period)newValue);
				return;
			case FhirPackage.MEASURE_REPORT__IMPROVEMENT_NOTATION:
				setImprovementNotation((CodeableConcept)newValue);
				return;
			case FhirPackage.MEASURE_REPORT__GROUP:
				getGroup().clear();
				getGroup().addAll((Collection<? extends MeasureReportGroup>)newValue);
				return;
			case FhirPackage.MEASURE_REPORT__EVALUATED_RESOURCE:
				getEvaluatedResource().clear();
				getEvaluatedResource().addAll((Collection<? extends Reference>)newValue);
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
			case FhirPackage.MEASURE_REPORT__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.MEASURE_REPORT__STATUS:
				setStatus((MeasureReportStatus)null);
				return;
			case FhirPackage.MEASURE_REPORT__TYPE:
				setType((MeasureReportType)null);
				return;
			case FhirPackage.MEASURE_REPORT__MEASURE:
				setMeasure((Canonical)null);
				return;
			case FhirPackage.MEASURE_REPORT__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.MEASURE_REPORT__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.MEASURE_REPORT__REPORTER:
				setReporter((Reference)null);
				return;
			case FhirPackage.MEASURE_REPORT__PERIOD:
				setPeriod((Period)null);
				return;
			case FhirPackage.MEASURE_REPORT__IMPROVEMENT_NOTATION:
				setImprovementNotation((CodeableConcept)null);
				return;
			case FhirPackage.MEASURE_REPORT__GROUP:
				getGroup().clear();
				return;
			case FhirPackage.MEASURE_REPORT__EVALUATED_RESOURCE:
				getEvaluatedResource().clear();
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
			case FhirPackage.MEASURE_REPORT__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.MEASURE_REPORT__STATUS:
				return status != null;
			case FhirPackage.MEASURE_REPORT__TYPE:
				return type != null;
			case FhirPackage.MEASURE_REPORT__MEASURE:
				return measure != null;
			case FhirPackage.MEASURE_REPORT__SUBJECT:
				return subject != null;
			case FhirPackage.MEASURE_REPORT__DATE:
				return date != null;
			case FhirPackage.MEASURE_REPORT__REPORTER:
				return reporter != null;
			case FhirPackage.MEASURE_REPORT__PERIOD:
				return period != null;
			case FhirPackage.MEASURE_REPORT__IMPROVEMENT_NOTATION:
				return improvementNotation != null;
			case FhirPackage.MEASURE_REPORT__GROUP:
				return group != null && !group.isEmpty();
			case FhirPackage.MEASURE_REPORT__EVALUATED_RESOURCE:
				return evaluatedResource != null && !evaluatedResource.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MeasureReportImpl
