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
 * A representation of the literals of the enumeration '<em><b>Exposure State List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getExposureStateList()
 * @model extendedMetaData="name='ExposureState-list'"
 * @generated
 */
public enum ExposureStateList implements Enumerator {
	/**
	 * The '<em><b>Exposure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exposure
	 * <!-- end-model-doc -->
	 * @see #EXPOSURE_VALUE
	 * @generated
	 * @ordered
	 */
	EXPOSURE(0, "exposure", "exposure"),

	/**
	 * The '<em><b>Exposure Alternative</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exposure Alternative
	 * <!-- end-model-doc -->
	 * @see #EXPOSURE_ALTERNATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	EXPOSURE_ALTERNATIVE(1, "exposureAlternative", "exposure-alternative");

	/**
	 * The '<em><b>Exposure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exposure
	 * <!-- end-model-doc -->
	 * @see #EXPOSURE
	 * @model name="exposure"
	 * @generated
	 * @ordered
	 */
	public static final int EXPOSURE_VALUE = 0;

	/**
	 * The '<em><b>Exposure Alternative</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exposure Alternative
	 * <!-- end-model-doc -->
	 * @see #EXPOSURE_ALTERNATIVE
	 * @model name="exposureAlternative" literal="exposure-alternative"
	 * @generated
	 * @ordered
	 */
	public static final int EXPOSURE_ALTERNATIVE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Exposure State List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ExposureStateList[] VALUES_ARRAY =
		new ExposureStateList[] {
			EXPOSURE,
			EXPOSURE_ALTERNATIVE,
		};

	/**
	 * A public read-only list of all the '<em><b>Exposure State List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ExposureStateList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Exposure State List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExposureStateList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExposureStateList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Exposure State List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExposureStateList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExposureStateList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Exposure State List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExposureStateList get(int value) {
		switch (value) {
			case EXPOSURE_VALUE: return EXPOSURE;
			case EXPOSURE_ALTERNATIVE_VALUE: return EXPOSURE_ALTERNATIVE;
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
	private ExposureStateList(int value, String name, String literal) {
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
	
} //ExposureStateList
