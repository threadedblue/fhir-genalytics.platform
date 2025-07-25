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
 * A representation of the literals of the enumeration '<em><b>Structure Map Source List Mode List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getStructureMapSourceListModeList()
 * @model extendedMetaData="name='StructureMapSourceListMode-list'"
 * @generated
 */
public enum StructureMapSourceListModeList implements Enumerator {
	/**
	 * The '<em><b>First</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * First
	 * <!-- end-model-doc -->
	 * @see #FIRST_VALUE
	 * @generated
	 * @ordered
	 */
	FIRST(0, "first", "first"),

	/**
	 * The '<em><b>Not First</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All but the first
	 * <!-- end-model-doc -->
	 * @see #NOT_FIRST_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_FIRST(1, "notFirst", "not_first"),

	/**
	 * The '<em><b>Last</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Last
	 * <!-- end-model-doc -->
	 * @see #LAST_VALUE
	 * @generated
	 * @ordered
	 */
	LAST(2, "last", "last"),

	/**
	 * The '<em><b>Not Last</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All but the last
	 * <!-- end-model-doc -->
	 * @see #NOT_LAST_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_LAST(3, "notLast", "not_last"),

	/**
	 * The '<em><b>Only One</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enforce only one
	 * <!-- end-model-doc -->
	 * @see #ONLY_ONE_VALUE
	 * @generated
	 * @ordered
	 */
	ONLY_ONE(4, "onlyOne", "only_one");

	/**
	 * The '<em><b>First</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * First
	 * <!-- end-model-doc -->
	 * @see #FIRST
	 * @model name="first"
	 * @generated
	 * @ordered
	 */
	public static final int FIRST_VALUE = 0;

	/**
	 * The '<em><b>Not First</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All but the first
	 * <!-- end-model-doc -->
	 * @see #NOT_FIRST
	 * @model name="notFirst" literal="not_first"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_FIRST_VALUE = 1;

	/**
	 * The '<em><b>Last</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Last
	 * <!-- end-model-doc -->
	 * @see #LAST
	 * @model name="last"
	 * @generated
	 * @ordered
	 */
	public static final int LAST_VALUE = 2;

	/**
	 * The '<em><b>Not Last</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All but the last
	 * <!-- end-model-doc -->
	 * @see #NOT_LAST
	 * @model name="notLast" literal="not_last"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_LAST_VALUE = 3;

	/**
	 * The '<em><b>Only One</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enforce only one
	 * <!-- end-model-doc -->
	 * @see #ONLY_ONE
	 * @model name="onlyOne" literal="only_one"
	 * @generated
	 * @ordered
	 */
	public static final int ONLY_ONE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Structure Map Source List Mode List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StructureMapSourceListModeList[] VALUES_ARRAY =
		new StructureMapSourceListModeList[] {
			FIRST,
			NOT_FIRST,
			LAST,
			NOT_LAST,
			ONLY_ONE,
		};

	/**
	 * A public read-only list of all the '<em><b>Structure Map Source List Mode List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StructureMapSourceListModeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Structure Map Source List Mode List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StructureMapSourceListModeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StructureMapSourceListModeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Structure Map Source List Mode List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StructureMapSourceListModeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StructureMapSourceListModeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Structure Map Source List Mode List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StructureMapSourceListModeList get(int value) {
		switch (value) {
			case FIRST_VALUE: return FIRST;
			case NOT_FIRST_VALUE: return NOT_FIRST;
			case LAST_VALUE: return LAST;
			case NOT_LAST_VALUE: return NOT_LAST;
			case ONLY_ONE_VALUE: return ONLY_ONE;
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
	private StructureMapSourceListModeList(int value, String name, String literal) {
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
	
} //StructureMapSourceListModeList
