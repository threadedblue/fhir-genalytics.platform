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
 * A representation of the literals of the enumeration '<em><b>Orientation Type List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getOrientationTypeList()
 * @model extendedMetaData="name='orientationType-list'"
 * @generated
 */
public enum OrientationTypeList implements Enumerator {
	/**
	 * The '<em><b>Sense</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sense orientation of referenceSeq
	 * <!-- end-model-doc -->
	 * @see #SENSE_VALUE
	 * @generated
	 * @ordered
	 */
	SENSE(0, "sense", "sense"),

	/**
	 * The '<em><b>Antisense</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Antisense orientation of referenceSeq
	 * <!-- end-model-doc -->
	 * @see #ANTISENSE_VALUE
	 * @generated
	 * @ordered
	 */
	ANTISENSE(1, "antisense", "antisense");

	/**
	 * The '<em><b>Sense</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sense orientation of referenceSeq
	 * <!-- end-model-doc -->
	 * @see #SENSE
	 * @model name="sense"
	 * @generated
	 * @ordered
	 */
	public static final int SENSE_VALUE = 0;

	/**
	 * The '<em><b>Antisense</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Antisense orientation of referenceSeq
	 * <!-- end-model-doc -->
	 * @see #ANTISENSE
	 * @model name="antisense"
	 * @generated
	 * @ordered
	 */
	public static final int ANTISENSE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Orientation Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OrientationTypeList[] VALUES_ARRAY =
		new OrientationTypeList[] {
			SENSE,
			ANTISENSE,
		};

	/**
	 * A public read-only list of all the '<em><b>Orientation Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OrientationTypeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Orientation Type List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrientationTypeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OrientationTypeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Orientation Type List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrientationTypeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OrientationTypeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Orientation Type List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrientationTypeList get(int value) {
		switch (value) {
			case SENSE_VALUE: return SENSE;
			case ANTISENSE_VALUE: return ANTISENSE;
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
	private OrientationTypeList(int value, String name, String literal) {
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
	
} //OrientationTypeList
