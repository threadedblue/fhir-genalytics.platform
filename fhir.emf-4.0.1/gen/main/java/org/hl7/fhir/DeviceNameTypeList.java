/**
 */
package org.hl7.fhir;

import java.lang.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Device Name Type List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getDeviceNameTypeList()
 * @model extendedMetaData="name='DeviceNameType-list'"
 * @generated
 */
public enum DeviceNameTypeList implements Enumerator {
	/**
	 * The '<em><b>Udi Label Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UDI Label name
	 * <!-- end-model-doc -->
	 * @see #UDI_LABEL_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	UDI_LABEL_NAME(0, "udiLabelName", "udi-label-name"),

	/**
	 * The '<em><b>User Friendly Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * User Friendly name
	 * <!-- end-model-doc -->
	 * @see #USER_FRIENDLY_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	USER_FRIENDLY_NAME(1, "userFriendlyName", "user-friendly-name"),

	/**
	 * The '<em><b>Patient Reported Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Patient Reported name
	 * <!-- end-model-doc -->
	 * @see #PATIENT_REPORTED_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	PATIENT_REPORTED_NAME(2, "patientReportedName", "patient-reported-name"),

	/**
	 * The '<em><b>Manufacturer Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Manufacturer name
	 * <!-- end-model-doc -->
	 * @see #MANUFACTURER_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	MANUFACTURER_NAME(3, "manufacturerName", "manufacturer-name"),

	/**
	 * The '<em><b>Model Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Model name
	 * <!-- end-model-doc -->
	 * @see #MODEL_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	MODEL_NAME(4, "modelName", "model-name"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * other
	 * <!-- end-model-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(5, "other", "other");

	/**
	 * The '<em><b>Udi Label Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UDI Label name
	 * <!-- end-model-doc -->
	 * @see #UDI_LABEL_NAME
	 * @model name="udiLabelName" literal="udi-label-name"
	 * @generated
	 * @ordered
	 */
	public static final int UDI_LABEL_NAME_VALUE = 0;

	/**
	 * The '<em><b>User Friendly Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * User Friendly name
	 * <!-- end-model-doc -->
	 * @see #USER_FRIENDLY_NAME
	 * @model name="userFriendlyName" literal="user-friendly-name"
	 * @generated
	 * @ordered
	 */
	public static final int USER_FRIENDLY_NAME_VALUE = 1;

	/**
	 * The '<em><b>Patient Reported Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Patient Reported name
	 * <!-- end-model-doc -->
	 * @see #PATIENT_REPORTED_NAME
	 * @model name="patientReportedName" literal="patient-reported-name"
	 * @generated
	 * @ordered
	 */
	public static final int PATIENT_REPORTED_NAME_VALUE = 2;

	/**
	 * The '<em><b>Manufacturer Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Manufacturer name
	 * <!-- end-model-doc -->
	 * @see #MANUFACTURER_NAME
	 * @model name="manufacturerName" literal="manufacturer-name"
	 * @generated
	 * @ordered
	 */
	public static final int MANUFACTURER_NAME_VALUE = 3;

	/**
	 * The '<em><b>Model Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Model name
	 * <!-- end-model-doc -->
	 * @see #MODEL_NAME
	 * @model name="modelName" literal="model-name"
	 * @generated
	 * @ordered
	 */
	public static final int MODEL_NAME_VALUE = 4;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * other
	 * <!-- end-model-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 5;

	/**
	 * An array of all the '<em><b>Device Name Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DeviceNameTypeList[] VALUES_ARRAY =
		new DeviceNameTypeList[] {
			UDI_LABEL_NAME,
			USER_FRIENDLY_NAME,
			PATIENT_REPORTED_NAME,
			MANUFACTURER_NAME,
			MODEL_NAME,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Device Name Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DeviceNameTypeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Device Name Type List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeviceNameTypeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeviceNameTypeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Device Name Type List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeviceNameTypeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeviceNameTypeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Device Name Type List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeviceNameTypeList get(int value) {
		switch (value) {
			case UDI_LABEL_NAME_VALUE: return UDI_LABEL_NAME;
			case USER_FRIENDLY_NAME_VALUE: return USER_FRIENDLY_NAME;
			case PATIENT_REPORTED_NAME_VALUE: return PATIENT_REPORTED_NAME;
			case MANUFACTURER_NAME_VALUE: return MANUFACTURER_NAME;
			case MODEL_NAME_VALUE: return MODEL_NAME;
			case OTHER_VALUE: return OTHER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DeviceNameTypeList(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //DeviceNameTypeList
