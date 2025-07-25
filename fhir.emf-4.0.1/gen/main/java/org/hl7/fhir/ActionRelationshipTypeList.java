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
 * A representation of the literals of the enumeration '<em><b>Action Relationship Type List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getActionRelationshipTypeList()
 * @model extendedMetaData="name='ActionRelationshipType-list'"
 * @generated
 */
public enum ActionRelationshipTypeList implements Enumerator {
	/**
	 * The '<em><b>Before Start</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Before Start
	 * <!-- end-model-doc -->
	 * @see #BEFORE_START_VALUE
	 * @generated
	 * @ordered
	 */
	BEFORE_START(0, "beforeStart", "before-start"),

	/**
	 * The '<em><b>Before</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Before
	 * <!-- end-model-doc -->
	 * @see #BEFORE_VALUE
	 * @generated
	 * @ordered
	 */
	BEFORE(1, "before", "before"),

	/**
	 * The '<em><b>Before End</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Before End
	 * <!-- end-model-doc -->
	 * @see #BEFORE_END_VALUE
	 * @generated
	 * @ordered
	 */
	BEFORE_END(2, "beforeEnd", "before-end"),

	/**
	 * The '<em><b>Concurrent With Start</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Concurrent With Start
	 * <!-- end-model-doc -->
	 * @see #CONCURRENT_WITH_START_VALUE
	 * @generated
	 * @ordered
	 */
	CONCURRENT_WITH_START(3, "concurrentWithStart", "concurrent-with-start"),

	/**
	 * The '<em><b>Concurrent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Concurrent
	 * <!-- end-model-doc -->
	 * @see #CONCURRENT_VALUE
	 * @generated
	 * @ordered
	 */
	CONCURRENT(4, "concurrent", "concurrent"),

	/**
	 * The '<em><b>Concurrent With End</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Concurrent With End
	 * <!-- end-model-doc -->
	 * @see #CONCURRENT_WITH_END_VALUE
	 * @generated
	 * @ordered
	 */
	CONCURRENT_WITH_END(5, "concurrentWithEnd", "concurrent-with-end"),

	/**
	 * The '<em><b>After Start</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * After Start
	 * <!-- end-model-doc -->
	 * @see #AFTER_START_VALUE
	 * @generated
	 * @ordered
	 */
	AFTER_START(6, "afterStart", "after-start"),

	/**
	 * The '<em><b>After</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * After
	 * <!-- end-model-doc -->
	 * @see #AFTER_VALUE
	 * @generated
	 * @ordered
	 */
	AFTER(7, "after", "after"),

	/**
	 * The '<em><b>After End</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * After End
	 * <!-- end-model-doc -->
	 * @see #AFTER_END_VALUE
	 * @generated
	 * @ordered
	 */
	AFTER_END(8, "afterEnd", "after-end");

	/**
	 * The '<em><b>Before Start</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Before Start
	 * <!-- end-model-doc -->
	 * @see #BEFORE_START
	 * @model name="beforeStart" literal="before-start"
	 * @generated
	 * @ordered
	 */
	public static final int BEFORE_START_VALUE = 0;

	/**
	 * The '<em><b>Before</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Before
	 * <!-- end-model-doc -->
	 * @see #BEFORE
	 * @model name="before"
	 * @generated
	 * @ordered
	 */
	public static final int BEFORE_VALUE = 1;

	/**
	 * The '<em><b>Before End</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Before End
	 * <!-- end-model-doc -->
	 * @see #BEFORE_END
	 * @model name="beforeEnd" literal="before-end"
	 * @generated
	 * @ordered
	 */
	public static final int BEFORE_END_VALUE = 2;

	/**
	 * The '<em><b>Concurrent With Start</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Concurrent With Start
	 * <!-- end-model-doc -->
	 * @see #CONCURRENT_WITH_START
	 * @model name="concurrentWithStart" literal="concurrent-with-start"
	 * @generated
	 * @ordered
	 */
	public static final int CONCURRENT_WITH_START_VALUE = 3;

	/**
	 * The '<em><b>Concurrent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Concurrent
	 * <!-- end-model-doc -->
	 * @see #CONCURRENT
	 * @model name="concurrent"
	 * @generated
	 * @ordered
	 */
	public static final int CONCURRENT_VALUE = 4;

	/**
	 * The '<em><b>Concurrent With End</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Concurrent With End
	 * <!-- end-model-doc -->
	 * @see #CONCURRENT_WITH_END
	 * @model name="concurrentWithEnd" literal="concurrent-with-end"
	 * @generated
	 * @ordered
	 */
	public static final int CONCURRENT_WITH_END_VALUE = 5;

	/**
	 * The '<em><b>After Start</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * After Start
	 * <!-- end-model-doc -->
	 * @see #AFTER_START
	 * @model name="afterStart" literal="after-start"
	 * @generated
	 * @ordered
	 */
	public static final int AFTER_START_VALUE = 6;

	/**
	 * The '<em><b>After</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * After
	 * <!-- end-model-doc -->
	 * @see #AFTER
	 * @model name="after"
	 * @generated
	 * @ordered
	 */
	public static final int AFTER_VALUE = 7;

	/**
	 * The '<em><b>After End</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * After End
	 * <!-- end-model-doc -->
	 * @see #AFTER_END
	 * @model name="afterEnd" literal="after-end"
	 * @generated
	 * @ordered
	 */
	public static final int AFTER_END_VALUE = 8;

	/**
	 * An array of all the '<em><b>Action Relationship Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ActionRelationshipTypeList[] VALUES_ARRAY =
		new ActionRelationshipTypeList[] {
			BEFORE_START,
			BEFORE,
			BEFORE_END,
			CONCURRENT_WITH_START,
			CONCURRENT,
			CONCURRENT_WITH_END,
			AFTER_START,
			AFTER,
			AFTER_END,
		};

	/**
	 * A public read-only list of all the '<em><b>Action Relationship Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ActionRelationshipTypeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Action Relationship Type List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActionRelationshipTypeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActionRelationshipTypeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Action Relationship Type List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActionRelationshipTypeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActionRelationshipTypeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Action Relationship Type List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActionRelationshipTypeList get(int value) {
		switch (value) {
			case BEFORE_START_VALUE: return BEFORE_START;
			case BEFORE_VALUE: return BEFORE;
			case BEFORE_END_VALUE: return BEFORE_END;
			case CONCURRENT_WITH_START_VALUE: return CONCURRENT_WITH_START;
			case CONCURRENT_VALUE: return CONCURRENT;
			case CONCURRENT_WITH_END_VALUE: return CONCURRENT_WITH_END;
			case AFTER_START_VALUE: return AFTER_START;
			case AFTER_VALUE: return AFTER;
			case AFTER_END_VALUE: return AFTER_END;
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
	private ActionRelationshipTypeList(int value, String name, String literal) {
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
	
} //ActionRelationshipTypeList
