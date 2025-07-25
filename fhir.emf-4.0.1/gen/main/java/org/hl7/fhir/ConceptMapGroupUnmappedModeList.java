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
 * A representation of the literals of the enumeration '<em><b>Concept Map Group Unmapped Mode List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getConceptMapGroupUnmappedModeList()
 * @model extendedMetaData="name='ConceptMapGroupUnmappedMode-list'"
 * @generated
 */
public enum ConceptMapGroupUnmappedModeList implements Enumerator {
	/**
	 * The '<em><b>Provided</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provided Code
	 * <!-- end-model-doc -->
	 * @see #PROVIDED_VALUE
	 * @generated
	 * @ordered
	 */
	PROVIDED(0, "provided", "provided"),

	/**
	 * The '<em><b>Fixed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fixed Code
	 * <!-- end-model-doc -->
	 * @see #FIXED_VALUE
	 * @generated
	 * @ordered
	 */
	FIXED(1, "fixed", "fixed"),

	/**
	 * The '<em><b>Other Map</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Other Map
	 * <!-- end-model-doc -->
	 * @see #OTHER_MAP_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER_MAP(2, "otherMap", "other-map");

	/**
	 * The '<em><b>Provided</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provided Code
	 * <!-- end-model-doc -->
	 * @see #PROVIDED
	 * @model name="provided"
	 * @generated
	 * @ordered
	 */
	public static final int PROVIDED_VALUE = 0;

	/**
	 * The '<em><b>Fixed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fixed Code
	 * <!-- end-model-doc -->
	 * @see #FIXED
	 * @model name="fixed"
	 * @generated
	 * @ordered
	 */
	public static final int FIXED_VALUE = 1;

	/**
	 * The '<em><b>Other Map</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Other Map
	 * <!-- end-model-doc -->
	 * @see #OTHER_MAP
	 * @model name="otherMap" literal="other-map"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_MAP_VALUE = 2;

	/**
	 * An array of all the '<em><b>Concept Map Group Unmapped Mode List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConceptMapGroupUnmappedModeList[] VALUES_ARRAY =
		new ConceptMapGroupUnmappedModeList[] {
			PROVIDED,
			FIXED,
			OTHER_MAP,
		};

	/**
	 * A public read-only list of all the '<em><b>Concept Map Group Unmapped Mode List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConceptMapGroupUnmappedModeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Concept Map Group Unmapped Mode List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConceptMapGroupUnmappedModeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConceptMapGroupUnmappedModeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Concept Map Group Unmapped Mode List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConceptMapGroupUnmappedModeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConceptMapGroupUnmappedModeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Concept Map Group Unmapped Mode List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConceptMapGroupUnmappedModeList get(int value) {
		switch (value) {
			case PROVIDED_VALUE: return PROVIDED;
			case FIXED_VALUE: return FIXED;
			case OTHER_MAP_VALUE: return OTHER_MAP;
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
	private ConceptMapGroupUnmappedModeList(int value, String name, String literal) {
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
	
} //ConceptMapGroupUnmappedModeList
