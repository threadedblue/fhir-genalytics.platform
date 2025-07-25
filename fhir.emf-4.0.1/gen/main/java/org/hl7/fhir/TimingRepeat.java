/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timing Repeat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.TimingRepeat#getBoundsDuration <em>Bounds Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.TimingRepeat#getBoundsRange <em>Bounds Range</em>}</li>
 *   <li>{@link org.hl7.fhir.TimingRepeat#getBoundsPeriod <em>Bounds Period</em>}</li>
 *   <li>{@link org.hl7.fhir.TimingRepeat#getCount <em>Count</em>}</li>
 *   <li>{@link org.hl7.fhir.TimingRepeat#getCountMax <em>Count Max</em>}</li>
 *   <li>{@link org.hl7.fhir.TimingRepeat#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.TimingRepeat#getDurationMax <em>Duration Max</em>}</li>
 *   <li>{@link org.hl7.fhir.TimingRepeat#getDurationUnit <em>Duration Unit</em>}</li>
 *   <li>{@link org.hl7.fhir.TimingRepeat#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link org.hl7.fhir.TimingRepeat#getFrequencyMax <em>Frequency Max</em>}</li>
 *   <li>{@link org.hl7.fhir.TimingRepeat#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.TimingRepeat#getPeriodMax <em>Period Max</em>}</li>
 *   <li>{@link org.hl7.fhir.TimingRepeat#getPeriodUnit <em>Period Unit</em>}</li>
 *   <li>{@link org.hl7.fhir.TimingRepeat#getDayOfWeek <em>Day Of Week</em>}</li>
 *   <li>{@link org.hl7.fhir.TimingRepeat#getTimeOfDay <em>Time Of Day</em>}</li>
 *   <li>{@link org.hl7.fhir.TimingRepeat#getWhen <em>When</em>}</li>
 *   <li>{@link org.hl7.fhir.TimingRepeat#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getTimingRepeat()
 * @model extendedMetaData="name='Timing.Repeat' kind='elementOnly'"
 * @generated
 */
public interface TimingRepeat extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Bounds Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Either a duration for the length of the timing schedule, a range of possible length, or outer bounds for start and/or end limits of the timing schedule. (choose any one of bounds*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bounds Duration</em>' containment reference.
	 * @see #setBoundsDuration(Duration)
	 * @see org.hl7.fhir.FhirPackage#getTimingRepeat_BoundsDuration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='boundsDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getBoundsDuration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TimingRepeat#getBoundsDuration <em>Bounds Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounds Duration</em>' containment reference.
	 * @see #getBoundsDuration()
	 * @generated
	 */
	void setBoundsDuration(Duration value);

	/**
	 * Returns the value of the '<em><b>Bounds Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Either a duration for the length of the timing schedule, a range of possible length, or outer bounds for start and/or end limits of the timing schedule. (choose any one of bounds*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bounds Range</em>' containment reference.
	 * @see #setBoundsRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getTimingRepeat_BoundsRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='boundsRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getBoundsRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TimingRepeat#getBoundsRange <em>Bounds Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounds Range</em>' containment reference.
	 * @see #getBoundsRange()
	 * @generated
	 */
	void setBoundsRange(Range value);

	/**
	 * Returns the value of the '<em><b>Bounds Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Either a duration for the length of the timing schedule, a range of possible length, or outer bounds for start and/or end limits of the timing schedule. (choose any one of bounds*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bounds Period</em>' containment reference.
	 * @see #setBoundsPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getTimingRepeat_BoundsPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='boundsPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getBoundsPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TimingRepeat#getBoundsPeriod <em>Bounds Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounds Period</em>' containment reference.
	 * @see #getBoundsPeriod()
	 * @generated
	 */
	void setBoundsPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A total count of the desired number of repetitions across the duration of the entire timing specification. If countMax is present, this element indicates the lower bound of the allowed range of count values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Count</em>' containment reference.
	 * @see #setCount(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getTimingRepeat_Count()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='count' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getCount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TimingRepeat#getCount <em>Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' containment reference.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Count Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If present, indicates that the count is a range - so to perform the action between [count] and [countMax] times.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Count Max</em>' containment reference.
	 * @see #setCountMax(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getTimingRepeat_CountMax()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='countMax' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getCountMax();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TimingRepeat#getCountMax <em>Count Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count Max</em>' containment reference.
	 * @see #getCountMax()
	 * @generated
	 */
	void setCountMax(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How long this thing happens for when it happens. If durationMax is present, this element indicates the lower bound of the allowed range of the duration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration</em>' containment reference.
	 * @see #setDuration(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getTimingRepeat_Duration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='duration' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getDuration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TimingRepeat#getDuration <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' containment reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Decimal value);

	/**
	 * Returns the value of the '<em><b>Duration Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If present, indicates that the duration is a range - so to perform the action between [duration] and [durationMax] time length.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration Max</em>' containment reference.
	 * @see #setDurationMax(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getTimingRepeat_DurationMax()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='durationMax' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getDurationMax();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TimingRepeat#getDurationMax <em>Duration Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Max</em>' containment reference.
	 * @see #getDurationMax()
	 * @generated
	 */
	void setDurationMax(Decimal value);

	/**
	 * Returns the value of the '<em><b>Duration Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The units of time for the duration, in UCUM units.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration Unit</em>' containment reference.
	 * @see #setDurationUnit(UnitsOfTime)
	 * @see org.hl7.fhir.FhirPackage#getTimingRepeat_DurationUnit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='durationUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	UnitsOfTime getDurationUnit();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TimingRepeat#getDurationUnit <em>Duration Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Unit</em>' containment reference.
	 * @see #getDurationUnit()
	 * @generated
	 */
	void setDurationUnit(UnitsOfTime value);

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of times to repeat the action within the specified period. If frequencyMax is present, this element indicates the lower bound of the allowed range of the frequency.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frequency</em>' containment reference.
	 * @see #setFrequency(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getTimingRepeat_Frequency()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='frequency' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getFrequency();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TimingRepeat#getFrequency <em>Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' containment reference.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Frequency Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If present, indicates that the frequency is a range - so to repeat between [frequency] and [frequencyMax] times within the period or period range.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frequency Max</em>' containment reference.
	 * @see #setFrequencyMax(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getTimingRepeat_FrequencyMax()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='frequencyMax' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getFrequencyMax();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TimingRepeat#getFrequencyMax <em>Frequency Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency Max</em>' containment reference.
	 * @see #getFrequencyMax()
	 * @generated
	 */
	void setFrequencyMax(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the duration of time over which repetitions are to occur; e.g. to express "3 times per day", 3 would be the frequency and "1 day" would be the period. If periodMax is present, this element indicates the lower bound of the allowed range of the period length.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getTimingRepeat_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TimingRepeat#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Decimal value);

	/**
	 * Returns the value of the '<em><b>Period Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If present, indicates that the period is a range from [period] to [periodMax], allowing expressing concepts such as "do this once every 3-5 days.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period Max</em>' containment reference.
	 * @see #setPeriodMax(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getTimingRepeat_PeriodMax()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='periodMax' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getPeriodMax();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TimingRepeat#getPeriodMax <em>Period Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period Max</em>' containment reference.
	 * @see #getPeriodMax()
	 * @generated
	 */
	void setPeriodMax(Decimal value);

	/**
	 * Returns the value of the '<em><b>Period Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The units of time for the period in UCUM units.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period Unit</em>' containment reference.
	 * @see #setPeriodUnit(UnitsOfTime)
	 * @see org.hl7.fhir.FhirPackage#getTimingRepeat_PeriodUnit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='periodUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	UnitsOfTime getPeriodUnit();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TimingRepeat#getPeriodUnit <em>Period Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period Unit</em>' containment reference.
	 * @see #getPeriodUnit()
	 * @generated
	 */
	void setPeriodUnit(UnitsOfTime value);

	/**
	 * Returns the value of the '<em><b>Day Of Week</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Code}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If one or more days of week is provided, then the action happens only on the specified day(s).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Day Of Week</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTimingRepeat_DayOfWeek()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dayOfWeek' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Code> getDayOfWeek();

	/**
	 * Returns the value of the '<em><b>Time Of Day</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Time}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specified time of day for action to take place.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Of Day</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTimingRepeat_TimeOfDay()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timeOfDay' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Time> getTimeOfDay();

	/**
	 * Returns the value of the '<em><b>When</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.EventTiming}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An approximate time period during the day, potentially linked to an event of daily living that indicates when the action should occur.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>When</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTimingRepeat_When()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='when' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EventTiming> getWhen();

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of minutes from the event. If the event code does not indicate whether the minutes is before or after the event, then the offset is assumed to be after the event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Offset</em>' containment reference.
	 * @see #setOffset(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getTimingRepeat_Offset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='offset' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getOffset();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TimingRepeat#getOffset <em>Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' containment reference.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(UnsignedInt value);

} // TimingRepeat
