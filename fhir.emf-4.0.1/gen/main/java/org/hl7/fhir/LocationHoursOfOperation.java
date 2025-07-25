/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Hours Of Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Details and position information for a physical place where services are provided and resources and participants may be stored, found, contained, or accommodated.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.LocationHoursOfOperation#getDaysOfWeek <em>Days Of Week</em>}</li>
 *   <li>{@link org.hl7.fhir.LocationHoursOfOperation#getAllDay <em>All Day</em>}</li>
 *   <li>{@link org.hl7.fhir.LocationHoursOfOperation#getOpeningTime <em>Opening Time</em>}</li>
 *   <li>{@link org.hl7.fhir.LocationHoursOfOperation#getClosingTime <em>Closing Time</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getLocationHoursOfOperation()
 * @model extendedMetaData="name='Location.HoursOfOperation' kind='elementOnly'"
 * @generated
 */
public interface LocationHoursOfOperation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Days Of Week</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DaysOfWeek}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates which days of the week are available between the start and end Times.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Days Of Week</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getLocationHoursOfOperation_DaysOfWeek()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='daysOfWeek' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DaysOfWeek> getDaysOfWeek();

	/**
	 * Returns the value of the '<em><b>All Day</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Location is open all day.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Day</em>' containment reference.
	 * @see #setAllDay(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getLocationHoursOfOperation_AllDay()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='allDay' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getAllDay();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.LocationHoursOfOperation#getAllDay <em>All Day</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Day</em>' containment reference.
	 * @see #getAllDay()
	 * @generated
	 */
	void setAllDay(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Opening Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time that the Location opens.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Opening Time</em>' containment reference.
	 * @see #setOpeningTime(Time)
	 * @see org.hl7.fhir.FhirPackage#getLocationHoursOfOperation_OpeningTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='openingTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Time getOpeningTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.LocationHoursOfOperation#getOpeningTime <em>Opening Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opening Time</em>' containment reference.
	 * @see #getOpeningTime()
	 * @generated
	 */
	void setOpeningTime(Time value);

	/**
	 * Returns the value of the '<em><b>Closing Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time that the Location closes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Closing Time</em>' containment reference.
	 * @see #setClosingTime(Time)
	 * @see org.hl7.fhir.FhirPackage#getLocationHoursOfOperation_ClosingTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='closingTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Time getClosingTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.LocationHoursOfOperation#getClosingTime <em>Closing Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closing Time</em>' containment reference.
	 * @see #getClosingTime()
	 * @generated
	 */
	void setClosingTime(Time value);

} // LocationHoursOfOperation
