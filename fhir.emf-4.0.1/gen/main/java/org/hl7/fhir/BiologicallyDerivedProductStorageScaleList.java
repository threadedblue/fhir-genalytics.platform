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
 * A representation of the literals of the enumeration '<em><b>Biologically Derived Product Storage Scale List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProductStorageScaleList()
 * @model extendedMetaData="name='BiologicallyDerivedProductStorageScale-list'"
 * @generated
 */
public enum BiologicallyDerivedProductStorageScaleList implements Enumerator {
	/**
	 * The '<em><b>Farenheit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fahrenheit
	 * <!-- end-model-doc -->
	 * @see #FARENHEIT_VALUE
	 * @generated
	 * @ordered
	 */
	FARENHEIT(0, "farenheit", "farenheit"),

	/**
	 * The '<em><b>Celsius</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Celsius
	 * <!-- end-model-doc -->
	 * @see #CELSIUS_VALUE
	 * @generated
	 * @ordered
	 */
	CELSIUS(1, "celsius", "celsius"),

	/**
	 * The '<em><b>Kelvin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kelvin
	 * <!-- end-model-doc -->
	 * @see #KELVIN_VALUE
	 * @generated
	 * @ordered
	 */
	KELVIN(2, "kelvin", "kelvin");

	/**
	 * The '<em><b>Farenheit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fahrenheit
	 * <!-- end-model-doc -->
	 * @see #FARENHEIT
	 * @model name="farenheit"
	 * @generated
	 * @ordered
	 */
	public static final int FARENHEIT_VALUE = 0;

	/**
	 * The '<em><b>Celsius</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Celsius
	 * <!-- end-model-doc -->
	 * @see #CELSIUS
	 * @model name="celsius"
	 * @generated
	 * @ordered
	 */
	public static final int CELSIUS_VALUE = 1;

	/**
	 * The '<em><b>Kelvin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kelvin
	 * <!-- end-model-doc -->
	 * @see #KELVIN
	 * @model name="kelvin"
	 * @generated
	 * @ordered
	 */
	public static final int KELVIN_VALUE = 2;

	/**
	 * An array of all the '<em><b>Biologically Derived Product Storage Scale List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BiologicallyDerivedProductStorageScaleList[] VALUES_ARRAY =
		new BiologicallyDerivedProductStorageScaleList[] {
			FARENHEIT,
			CELSIUS,
			KELVIN,
		};

	/**
	 * A public read-only list of all the '<em><b>Biologically Derived Product Storage Scale List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BiologicallyDerivedProductStorageScaleList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Biologically Derived Product Storage Scale List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BiologicallyDerivedProductStorageScaleList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BiologicallyDerivedProductStorageScaleList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Biologically Derived Product Storage Scale List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BiologicallyDerivedProductStorageScaleList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BiologicallyDerivedProductStorageScaleList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Biologically Derived Product Storage Scale List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BiologicallyDerivedProductStorageScaleList get(int value) {
		switch (value) {
			case FARENHEIT_VALUE: return FARENHEIT;
			case CELSIUS_VALUE: return CELSIUS;
			case KELVIN_VALUE: return KELVIN;
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
	private BiologicallyDerivedProductStorageScaleList(int value, String name, String literal) {
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
	
} //BiologicallyDerivedProductStorageScaleList
