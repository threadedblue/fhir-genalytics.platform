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

import org.hl7.fhir.Code;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.Duration;
import org.hl7.fhir.EventTiming;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Period;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Range;
import org.hl7.fhir.Time;
import org.hl7.fhir.TimingRepeat;
import org.hl7.fhir.UnitsOfTime;
import org.hl7.fhir.UnsignedInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timing Repeat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.TimingRepeatImpl#getBoundsDuration <em>Bounds Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TimingRepeatImpl#getBoundsRange <em>Bounds Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TimingRepeatImpl#getBoundsPeriod <em>Bounds Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TimingRepeatImpl#getCount <em>Count</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TimingRepeatImpl#getCountMax <em>Count Max</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TimingRepeatImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TimingRepeatImpl#getDurationMax <em>Duration Max</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TimingRepeatImpl#getDurationUnit <em>Duration Unit</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TimingRepeatImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TimingRepeatImpl#getFrequencyMax <em>Frequency Max</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TimingRepeatImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TimingRepeatImpl#getPeriodMax <em>Period Max</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TimingRepeatImpl#getPeriodUnit <em>Period Unit</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TimingRepeatImpl#getDayOfWeek <em>Day Of Week</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TimingRepeatImpl#getTimeOfDay <em>Time Of Day</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TimingRepeatImpl#getWhen <em>When</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TimingRepeatImpl#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimingRepeatImpl extends BackboneElementImpl implements TimingRepeat {
	/**
	 * The cached value of the '{@link #getBoundsDuration() <em>Bounds Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundsDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration boundsDuration;

	/**
	 * The cached value of the '{@link #getBoundsRange() <em>Bounds Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundsRange()
	 * @generated
	 * @ordered
	 */
	protected Range boundsRange;

	/**
	 * The cached value of the '{@link #getBoundsPeriod() <em>Bounds Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundsPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period boundsPeriod;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt count;

	/**
	 * The cached value of the '{@link #getCountMax() <em>Count Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountMax()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt countMax;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected Decimal duration;

	/**
	 * The cached value of the '{@link #getDurationMax() <em>Duration Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationMax()
	 * @generated
	 * @ordered
	 */
	protected Decimal durationMax;

	/**
	 * The cached value of the '{@link #getDurationUnit() <em>Duration Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitsOfTime durationUnit;

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt frequency;

	/**
	 * The cached value of the '{@link #getFrequencyMax() <em>Frequency Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequencyMax()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt frequencyMax;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Decimal period;

	/**
	 * The cached value of the '{@link #getPeriodMax() <em>Period Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodMax()
	 * @generated
	 * @ordered
	 */
	protected Decimal periodMax;

	/**
	 * The cached value of the '{@link #getPeriodUnit() <em>Period Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitsOfTime periodUnit;

	/**
	 * The cached value of the '{@link #getDayOfWeek() <em>Day Of Week</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayOfWeek()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> dayOfWeek;

	/**
	 * The cached value of the '{@link #getTimeOfDay() <em>Time Of Day</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOfDay()
	 * @generated
	 * @ordered
	 */
	protected EList<Time> timeOfDay;

	/**
	 * The cached value of the '{@link #getWhen() <em>When</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected EList<EventTiming> when;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt offset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimingRepeatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getTimingRepeat();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getBoundsDuration() {
		return boundsDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoundsDuration(Duration newBoundsDuration, NotificationChain msgs) {
		Duration oldBoundsDuration = boundsDuration;
		boundsDuration = newBoundsDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__BOUNDS_DURATION, oldBoundsDuration, newBoundsDuration);
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
	public void setBoundsDuration(Duration newBoundsDuration) {
		if (newBoundsDuration != boundsDuration) {
			NotificationChain msgs = null;
			if (boundsDuration != null)
				msgs = ((InternalEObject)boundsDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__BOUNDS_DURATION, null, msgs);
			if (newBoundsDuration != null)
				msgs = ((InternalEObject)newBoundsDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__BOUNDS_DURATION, null, msgs);
			msgs = basicSetBoundsDuration(newBoundsDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__BOUNDS_DURATION, newBoundsDuration, newBoundsDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Range getBoundsRange() {
		return boundsRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoundsRange(Range newBoundsRange, NotificationChain msgs) {
		Range oldBoundsRange = boundsRange;
		boundsRange = newBoundsRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__BOUNDS_RANGE, oldBoundsRange, newBoundsRange);
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
	public void setBoundsRange(Range newBoundsRange) {
		if (newBoundsRange != boundsRange) {
			NotificationChain msgs = null;
			if (boundsRange != null)
				msgs = ((InternalEObject)boundsRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__BOUNDS_RANGE, null, msgs);
			if (newBoundsRange != null)
				msgs = ((InternalEObject)newBoundsRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__BOUNDS_RANGE, null, msgs);
			msgs = basicSetBoundsRange(newBoundsRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__BOUNDS_RANGE, newBoundsRange, newBoundsRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getBoundsPeriod() {
		return boundsPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoundsPeriod(Period newBoundsPeriod, NotificationChain msgs) {
		Period oldBoundsPeriod = boundsPeriod;
		boundsPeriod = newBoundsPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__BOUNDS_PERIOD, oldBoundsPeriod, newBoundsPeriod);
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
	public void setBoundsPeriod(Period newBoundsPeriod) {
		if (newBoundsPeriod != boundsPeriod) {
			NotificationChain msgs = null;
			if (boundsPeriod != null)
				msgs = ((InternalEObject)boundsPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__BOUNDS_PERIOD, null, msgs);
			if (newBoundsPeriod != null)
				msgs = ((InternalEObject)newBoundsPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__BOUNDS_PERIOD, null, msgs);
			msgs = basicSetBoundsPeriod(newBoundsPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__BOUNDS_PERIOD, newBoundsPeriod, newBoundsPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCount(PositiveInt newCount, NotificationChain msgs) {
		PositiveInt oldCount = count;
		count = newCount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__COUNT, oldCount, newCount);
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
	public void setCount(PositiveInt newCount) {
		if (newCount != count) {
			NotificationChain msgs = null;
			if (count != null)
				msgs = ((InternalEObject)count).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__COUNT, null, msgs);
			if (newCount != null)
				msgs = ((InternalEObject)newCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__COUNT, null, msgs);
			msgs = basicSetCount(newCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__COUNT, newCount, newCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getCountMax() {
		return countMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCountMax(PositiveInt newCountMax, NotificationChain msgs) {
		PositiveInt oldCountMax = countMax;
		countMax = newCountMax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__COUNT_MAX, oldCountMax, newCountMax);
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
	public void setCountMax(PositiveInt newCountMax) {
		if (newCountMax != countMax) {
			NotificationChain msgs = null;
			if (countMax != null)
				msgs = ((InternalEObject)countMax).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__COUNT_MAX, null, msgs);
			if (newCountMax != null)
				msgs = ((InternalEObject)newCountMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__COUNT_MAX, null, msgs);
			msgs = basicSetCountMax(newCountMax, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__COUNT_MAX, newCountMax, newCountMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDuration(Decimal newDuration, NotificationChain msgs) {
		Decimal oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__DURATION, oldDuration, newDuration);
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
	public void setDuration(Decimal newDuration) {
		if (newDuration != duration) {
			NotificationChain msgs = null;
			if (duration != null)
				msgs = ((InternalEObject)duration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__DURATION, null, msgs);
			if (newDuration != null)
				msgs = ((InternalEObject)newDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__DURATION, null, msgs);
			msgs = basicSetDuration(newDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__DURATION, newDuration, newDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getDurationMax() {
		return durationMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDurationMax(Decimal newDurationMax, NotificationChain msgs) {
		Decimal oldDurationMax = durationMax;
		durationMax = newDurationMax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__DURATION_MAX, oldDurationMax, newDurationMax);
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
	public void setDurationMax(Decimal newDurationMax) {
		if (newDurationMax != durationMax) {
			NotificationChain msgs = null;
			if (durationMax != null)
				msgs = ((InternalEObject)durationMax).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__DURATION_MAX, null, msgs);
			if (newDurationMax != null)
				msgs = ((InternalEObject)newDurationMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__DURATION_MAX, null, msgs);
			msgs = basicSetDurationMax(newDurationMax, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__DURATION_MAX, newDurationMax, newDurationMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitsOfTime getDurationUnit() {
		return durationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDurationUnit(UnitsOfTime newDurationUnit, NotificationChain msgs) {
		UnitsOfTime oldDurationUnit = durationUnit;
		durationUnit = newDurationUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__DURATION_UNIT, oldDurationUnit, newDurationUnit);
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
	public void setDurationUnit(UnitsOfTime newDurationUnit) {
		if (newDurationUnit != durationUnit) {
			NotificationChain msgs = null;
			if (durationUnit != null)
				msgs = ((InternalEObject)durationUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__DURATION_UNIT, null, msgs);
			if (newDurationUnit != null)
				msgs = ((InternalEObject)newDurationUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__DURATION_UNIT, null, msgs);
			msgs = basicSetDurationUnit(newDurationUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__DURATION_UNIT, newDurationUnit, newDurationUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrequency(PositiveInt newFrequency, NotificationChain msgs) {
		PositiveInt oldFrequency = frequency;
		frequency = newFrequency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__FREQUENCY, oldFrequency, newFrequency);
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
	public void setFrequency(PositiveInt newFrequency) {
		if (newFrequency != frequency) {
			NotificationChain msgs = null;
			if (frequency != null)
				msgs = ((InternalEObject)frequency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__FREQUENCY, null, msgs);
			if (newFrequency != null)
				msgs = ((InternalEObject)newFrequency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__FREQUENCY, null, msgs);
			msgs = basicSetFrequency(newFrequency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__FREQUENCY, newFrequency, newFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getFrequencyMax() {
		return frequencyMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrequencyMax(PositiveInt newFrequencyMax, NotificationChain msgs) {
		PositiveInt oldFrequencyMax = frequencyMax;
		frequencyMax = newFrequencyMax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__FREQUENCY_MAX, oldFrequencyMax, newFrequencyMax);
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
	public void setFrequencyMax(PositiveInt newFrequencyMax) {
		if (newFrequencyMax != frequencyMax) {
			NotificationChain msgs = null;
			if (frequencyMax != null)
				msgs = ((InternalEObject)frequencyMax).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__FREQUENCY_MAX, null, msgs);
			if (newFrequencyMax != null)
				msgs = ((InternalEObject)newFrequencyMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__FREQUENCY_MAX, null, msgs);
			msgs = basicSetFrequencyMax(newFrequencyMax, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__FREQUENCY_MAX, newFrequencyMax, newFrequencyMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(Decimal newPeriod, NotificationChain msgs) {
		Decimal oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__PERIOD, oldPeriod, newPeriod);
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
	public void setPeriod(Decimal newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getPeriodMax() {
		return periodMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriodMax(Decimal newPeriodMax, NotificationChain msgs) {
		Decimal oldPeriodMax = periodMax;
		periodMax = newPeriodMax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__PERIOD_MAX, oldPeriodMax, newPeriodMax);
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
	public void setPeriodMax(Decimal newPeriodMax) {
		if (newPeriodMax != periodMax) {
			NotificationChain msgs = null;
			if (periodMax != null)
				msgs = ((InternalEObject)periodMax).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__PERIOD_MAX, null, msgs);
			if (newPeriodMax != null)
				msgs = ((InternalEObject)newPeriodMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__PERIOD_MAX, null, msgs);
			msgs = basicSetPeriodMax(newPeriodMax, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__PERIOD_MAX, newPeriodMax, newPeriodMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitsOfTime getPeriodUnit() {
		return periodUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriodUnit(UnitsOfTime newPeriodUnit, NotificationChain msgs) {
		UnitsOfTime oldPeriodUnit = periodUnit;
		periodUnit = newPeriodUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__PERIOD_UNIT, oldPeriodUnit, newPeriodUnit);
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
	public void setPeriodUnit(UnitsOfTime newPeriodUnit) {
		if (newPeriodUnit != periodUnit) {
			NotificationChain msgs = null;
			if (periodUnit != null)
				msgs = ((InternalEObject)periodUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__PERIOD_UNIT, null, msgs);
			if (newPeriodUnit != null)
				msgs = ((InternalEObject)newPeriodUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__PERIOD_UNIT, null, msgs);
			msgs = basicSetPeriodUnit(newPeriodUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__PERIOD_UNIT, newPeriodUnit, newPeriodUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Code> getDayOfWeek() {
		if (dayOfWeek == null) {
			dayOfWeek = new EObjectContainmentEList<Code>(Code.class, this, FhirPackage.TIMING_REPEAT__DAY_OF_WEEK);
		}
		return dayOfWeek;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Time> getTimeOfDay() {
		if (timeOfDay == null) {
			timeOfDay = new EObjectContainmentEList<Time>(Time.class, this, FhirPackage.TIMING_REPEAT__TIME_OF_DAY);
		}
		return timeOfDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EventTiming> getWhen() {
		if (when == null) {
			when = new EObjectContainmentEList<EventTiming>(EventTiming.class, this, FhirPackage.TIMING_REPEAT__WHEN);
		}
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnsignedInt getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffset(UnsignedInt newOffset, NotificationChain msgs) {
		UnsignedInt oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__OFFSET, oldOffset, newOffset);
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
	public void setOffset(UnsignedInt newOffset) {
		if (newOffset != offset) {
			NotificationChain msgs = null;
			if (offset != null)
				msgs = ((InternalEObject)offset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__OFFSET, null, msgs);
			if (newOffset != null)
				msgs = ((InternalEObject)newOffset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TIMING_REPEAT__OFFSET, null, msgs);
			msgs = basicSetOffset(newOffset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TIMING_REPEAT__OFFSET, newOffset, newOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.TIMING_REPEAT__BOUNDS_DURATION:
				return basicSetBoundsDuration(null, msgs);
			case FhirPackage.TIMING_REPEAT__BOUNDS_RANGE:
				return basicSetBoundsRange(null, msgs);
			case FhirPackage.TIMING_REPEAT__BOUNDS_PERIOD:
				return basicSetBoundsPeriod(null, msgs);
			case FhirPackage.TIMING_REPEAT__COUNT:
				return basicSetCount(null, msgs);
			case FhirPackage.TIMING_REPEAT__COUNT_MAX:
				return basicSetCountMax(null, msgs);
			case FhirPackage.TIMING_REPEAT__DURATION:
				return basicSetDuration(null, msgs);
			case FhirPackage.TIMING_REPEAT__DURATION_MAX:
				return basicSetDurationMax(null, msgs);
			case FhirPackage.TIMING_REPEAT__DURATION_UNIT:
				return basicSetDurationUnit(null, msgs);
			case FhirPackage.TIMING_REPEAT__FREQUENCY:
				return basicSetFrequency(null, msgs);
			case FhirPackage.TIMING_REPEAT__FREQUENCY_MAX:
				return basicSetFrequencyMax(null, msgs);
			case FhirPackage.TIMING_REPEAT__PERIOD:
				return basicSetPeriod(null, msgs);
			case FhirPackage.TIMING_REPEAT__PERIOD_MAX:
				return basicSetPeriodMax(null, msgs);
			case FhirPackage.TIMING_REPEAT__PERIOD_UNIT:
				return basicSetPeriodUnit(null, msgs);
			case FhirPackage.TIMING_REPEAT__DAY_OF_WEEK:
				return ((InternalEList<?>)getDayOfWeek()).basicRemove(otherEnd, msgs);
			case FhirPackage.TIMING_REPEAT__TIME_OF_DAY:
				return ((InternalEList<?>)getTimeOfDay()).basicRemove(otherEnd, msgs);
			case FhirPackage.TIMING_REPEAT__WHEN:
				return ((InternalEList<?>)getWhen()).basicRemove(otherEnd, msgs);
			case FhirPackage.TIMING_REPEAT__OFFSET:
				return basicSetOffset(null, msgs);
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
			case FhirPackage.TIMING_REPEAT__BOUNDS_DURATION:
				return getBoundsDuration();
			case FhirPackage.TIMING_REPEAT__BOUNDS_RANGE:
				return getBoundsRange();
			case FhirPackage.TIMING_REPEAT__BOUNDS_PERIOD:
				return getBoundsPeriod();
			case FhirPackage.TIMING_REPEAT__COUNT:
				return getCount();
			case FhirPackage.TIMING_REPEAT__COUNT_MAX:
				return getCountMax();
			case FhirPackage.TIMING_REPEAT__DURATION:
				return getDuration();
			case FhirPackage.TIMING_REPEAT__DURATION_MAX:
				return getDurationMax();
			case FhirPackage.TIMING_REPEAT__DURATION_UNIT:
				return getDurationUnit();
			case FhirPackage.TIMING_REPEAT__FREQUENCY:
				return getFrequency();
			case FhirPackage.TIMING_REPEAT__FREQUENCY_MAX:
				return getFrequencyMax();
			case FhirPackage.TIMING_REPEAT__PERIOD:
				return getPeriod();
			case FhirPackage.TIMING_REPEAT__PERIOD_MAX:
				return getPeriodMax();
			case FhirPackage.TIMING_REPEAT__PERIOD_UNIT:
				return getPeriodUnit();
			case FhirPackage.TIMING_REPEAT__DAY_OF_WEEK:
				return getDayOfWeek();
			case FhirPackage.TIMING_REPEAT__TIME_OF_DAY:
				return getTimeOfDay();
			case FhirPackage.TIMING_REPEAT__WHEN:
				return getWhen();
			case FhirPackage.TIMING_REPEAT__OFFSET:
				return getOffset();
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
			case FhirPackage.TIMING_REPEAT__BOUNDS_DURATION:
				setBoundsDuration((Duration)newValue);
				return;
			case FhirPackage.TIMING_REPEAT__BOUNDS_RANGE:
				setBoundsRange((Range)newValue);
				return;
			case FhirPackage.TIMING_REPEAT__BOUNDS_PERIOD:
				setBoundsPeriod((Period)newValue);
				return;
			case FhirPackage.TIMING_REPEAT__COUNT:
				setCount((PositiveInt)newValue);
				return;
			case FhirPackage.TIMING_REPEAT__COUNT_MAX:
				setCountMax((PositiveInt)newValue);
				return;
			case FhirPackage.TIMING_REPEAT__DURATION:
				setDuration((Decimal)newValue);
				return;
			case FhirPackage.TIMING_REPEAT__DURATION_MAX:
				setDurationMax((Decimal)newValue);
				return;
			case FhirPackage.TIMING_REPEAT__DURATION_UNIT:
				setDurationUnit((UnitsOfTime)newValue);
				return;
			case FhirPackage.TIMING_REPEAT__FREQUENCY:
				setFrequency((PositiveInt)newValue);
				return;
			case FhirPackage.TIMING_REPEAT__FREQUENCY_MAX:
				setFrequencyMax((PositiveInt)newValue);
				return;
			case FhirPackage.TIMING_REPEAT__PERIOD:
				setPeriod((Decimal)newValue);
				return;
			case FhirPackage.TIMING_REPEAT__PERIOD_MAX:
				setPeriodMax((Decimal)newValue);
				return;
			case FhirPackage.TIMING_REPEAT__PERIOD_UNIT:
				setPeriodUnit((UnitsOfTime)newValue);
				return;
			case FhirPackage.TIMING_REPEAT__DAY_OF_WEEK:
				getDayOfWeek().clear();
				getDayOfWeek().addAll((Collection<? extends Code>)newValue);
				return;
			case FhirPackage.TIMING_REPEAT__TIME_OF_DAY:
				getTimeOfDay().clear();
				getTimeOfDay().addAll((Collection<? extends Time>)newValue);
				return;
			case FhirPackage.TIMING_REPEAT__WHEN:
				getWhen().clear();
				getWhen().addAll((Collection<? extends EventTiming>)newValue);
				return;
			case FhirPackage.TIMING_REPEAT__OFFSET:
				setOffset((UnsignedInt)newValue);
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
			case FhirPackage.TIMING_REPEAT__BOUNDS_DURATION:
				setBoundsDuration((Duration)null);
				return;
			case FhirPackage.TIMING_REPEAT__BOUNDS_RANGE:
				setBoundsRange((Range)null);
				return;
			case FhirPackage.TIMING_REPEAT__BOUNDS_PERIOD:
				setBoundsPeriod((Period)null);
				return;
			case FhirPackage.TIMING_REPEAT__COUNT:
				setCount((PositiveInt)null);
				return;
			case FhirPackage.TIMING_REPEAT__COUNT_MAX:
				setCountMax((PositiveInt)null);
				return;
			case FhirPackage.TIMING_REPEAT__DURATION:
				setDuration((Decimal)null);
				return;
			case FhirPackage.TIMING_REPEAT__DURATION_MAX:
				setDurationMax((Decimal)null);
				return;
			case FhirPackage.TIMING_REPEAT__DURATION_UNIT:
				setDurationUnit((UnitsOfTime)null);
				return;
			case FhirPackage.TIMING_REPEAT__FREQUENCY:
				setFrequency((PositiveInt)null);
				return;
			case FhirPackage.TIMING_REPEAT__FREQUENCY_MAX:
				setFrequencyMax((PositiveInt)null);
				return;
			case FhirPackage.TIMING_REPEAT__PERIOD:
				setPeriod((Decimal)null);
				return;
			case FhirPackage.TIMING_REPEAT__PERIOD_MAX:
				setPeriodMax((Decimal)null);
				return;
			case FhirPackage.TIMING_REPEAT__PERIOD_UNIT:
				setPeriodUnit((UnitsOfTime)null);
				return;
			case FhirPackage.TIMING_REPEAT__DAY_OF_WEEK:
				getDayOfWeek().clear();
				return;
			case FhirPackage.TIMING_REPEAT__TIME_OF_DAY:
				getTimeOfDay().clear();
				return;
			case FhirPackage.TIMING_REPEAT__WHEN:
				getWhen().clear();
				return;
			case FhirPackage.TIMING_REPEAT__OFFSET:
				setOffset((UnsignedInt)null);
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
			case FhirPackage.TIMING_REPEAT__BOUNDS_DURATION:
				return boundsDuration != null;
			case FhirPackage.TIMING_REPEAT__BOUNDS_RANGE:
				return boundsRange != null;
			case FhirPackage.TIMING_REPEAT__BOUNDS_PERIOD:
				return boundsPeriod != null;
			case FhirPackage.TIMING_REPEAT__COUNT:
				return count != null;
			case FhirPackage.TIMING_REPEAT__COUNT_MAX:
				return countMax != null;
			case FhirPackage.TIMING_REPEAT__DURATION:
				return duration != null;
			case FhirPackage.TIMING_REPEAT__DURATION_MAX:
				return durationMax != null;
			case FhirPackage.TIMING_REPEAT__DURATION_UNIT:
				return durationUnit != null;
			case FhirPackage.TIMING_REPEAT__FREQUENCY:
				return frequency != null;
			case FhirPackage.TIMING_REPEAT__FREQUENCY_MAX:
				return frequencyMax != null;
			case FhirPackage.TIMING_REPEAT__PERIOD:
				return period != null;
			case FhirPackage.TIMING_REPEAT__PERIOD_MAX:
				return periodMax != null;
			case FhirPackage.TIMING_REPEAT__PERIOD_UNIT:
				return periodUnit != null;
			case FhirPackage.TIMING_REPEAT__DAY_OF_WEEK:
				return dayOfWeek != null && !dayOfWeek.isEmpty();
			case FhirPackage.TIMING_REPEAT__TIME_OF_DAY:
				return timeOfDay != null && !timeOfDay.isEmpty();
			case FhirPackage.TIMING_REPEAT__WHEN:
				return when != null && !when.isEmpty();
			case FhirPackage.TIMING_REPEAT__OFFSET:
				return offset != null;
		}
		return super.eIsSet(featureID);
	}

} //TimingRepeatImpl
