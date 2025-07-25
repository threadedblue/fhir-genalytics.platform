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
 * A representation of the literals of the enumeration '<em><b>Reference Handling Policy List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getReferenceHandlingPolicyList()
 * @model extendedMetaData="name='ReferenceHandlingPolicy-list'"
 * @generated
 */
public enum ReferenceHandlingPolicyList implements Enumerator {
	/**
	 * The '<em><b>Literal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Literal References
	 * <!-- end-model-doc -->
	 * @see #LITERAL_VALUE
	 * @generated
	 * @ordered
	 */
	LITERAL(0, "literal", "literal"),

	/**
	 * The '<em><b>Logical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Logical References
	 * <!-- end-model-doc -->
	 * @see #LOGICAL_VALUE
	 * @generated
	 * @ordered
	 */
	LOGICAL(1, "logical", "logical"),

	/**
	 * The '<em><b>Resolves</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resolves References
	 * <!-- end-model-doc -->
	 * @see #RESOLVES_VALUE
	 * @generated
	 * @ordered
	 */
	RESOLVES(2, "resolves", "resolves"),

	/**
	 * The '<em><b>Enforced</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference Integrity Enforced
	 * <!-- end-model-doc -->
	 * @see #ENFORCED_VALUE
	 * @generated
	 * @ordered
	 */
	ENFORCED(3, "enforced", "enforced"),

	/**
	 * The '<em><b>Local</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Local References Only
	 * <!-- end-model-doc -->
	 * @see #LOCAL_VALUE
	 * @generated
	 * @ordered
	 */
	LOCAL(4, "local", "local");

	/**
	 * The '<em><b>Literal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Literal References
	 * <!-- end-model-doc -->
	 * @see #LITERAL
	 * @model name="literal"
	 * @generated
	 * @ordered
	 */
	public static final int LITERAL_VALUE = 0;

	/**
	 * The '<em><b>Logical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Logical References
	 * <!-- end-model-doc -->
	 * @see #LOGICAL
	 * @model name="logical"
	 * @generated
	 * @ordered
	 */
	public static final int LOGICAL_VALUE = 1;

	/**
	 * The '<em><b>Resolves</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resolves References
	 * <!-- end-model-doc -->
	 * @see #RESOLVES
	 * @model name="resolves"
	 * @generated
	 * @ordered
	 */
	public static final int RESOLVES_VALUE = 2;

	/**
	 * The '<em><b>Enforced</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference Integrity Enforced
	 * <!-- end-model-doc -->
	 * @see #ENFORCED
	 * @model name="enforced"
	 * @generated
	 * @ordered
	 */
	public static final int ENFORCED_VALUE = 3;

	/**
	 * The '<em><b>Local</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Local References Only
	 * <!-- end-model-doc -->
	 * @see #LOCAL
	 * @model name="local"
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_VALUE = 4;

	/**
	 * An array of all the '<em><b>Reference Handling Policy List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ReferenceHandlingPolicyList[] VALUES_ARRAY =
		new ReferenceHandlingPolicyList[] {
			LITERAL,
			LOGICAL,
			RESOLVES,
			ENFORCED,
			LOCAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Reference Handling Policy List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ReferenceHandlingPolicyList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Reference Handling Policy List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReferenceHandlingPolicyList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReferenceHandlingPolicyList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reference Handling Policy List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReferenceHandlingPolicyList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReferenceHandlingPolicyList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reference Handling Policy List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReferenceHandlingPolicyList get(int value) {
		switch (value) {
			case LITERAL_VALUE: return LITERAL;
			case LOGICAL_VALUE: return LOGICAL;
			case RESOLVES_VALUE: return RESOLVES;
			case ENFORCED_VALUE: return ENFORCED;
			case LOCAL_VALUE: return LOCAL;
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
	private ReferenceHandlingPolicyList(int value, String name, String literal) {
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
	
} //ReferenceHandlingPolicyList
