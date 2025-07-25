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
 * A representation of the literals of the enumeration '<em><b>Search Comparator List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getSearchComparatorList()
 * @model extendedMetaData="name='SearchComparator-list'"
 * @generated
 */
public enum SearchComparatorList implements Enumerator {
	/**
	 * The '<em><b>Eq</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Equals
	 * <!-- end-model-doc -->
	 * @see #EQ_VALUE
	 * @generated
	 * @ordered
	 */
	EQ(0, "eq", "eq"),

	/**
	 * The '<em><b>Ne</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not Equals
	 * <!-- end-model-doc -->
	 * @see #NE_VALUE
	 * @generated
	 * @ordered
	 */
	NE(1, "ne", "ne"),

	/**
	 * The '<em><b>Gt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Greater Than
	 * <!-- end-model-doc -->
	 * @see #GT_VALUE
	 * @generated
	 * @ordered
	 */
	GT(2, "gt", "gt"),

	/**
	 * The '<em><b>Lt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Less Than
	 * <!-- end-model-doc -->
	 * @see #LT_VALUE
	 * @generated
	 * @ordered
	 */
	LT(3, "lt", "lt"),

	/**
	 * The '<em><b>Ge</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Greater or Equals
	 * <!-- end-model-doc -->
	 * @see #GE_VALUE
	 * @generated
	 * @ordered
	 */
	GE(4, "ge", "ge"),

	/**
	 * The '<em><b>Le</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Less of Equal
	 * <!-- end-model-doc -->
	 * @see #LE_VALUE
	 * @generated
	 * @ordered
	 */
	LE(5, "le", "le"),

	/**
	 * The '<em><b>Sa</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Starts After
	 * <!-- end-model-doc -->
	 * @see #SA_VALUE
	 * @generated
	 * @ordered
	 */
	SA(6, "sa", "sa"),

	/**
	 * The '<em><b>Eb</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ends Before
	 * <!-- end-model-doc -->
	 * @see #EB_VALUE
	 * @generated
	 * @ordered
	 */
	EB(7, "eb", "eb"),

	/**
	 * The '<em><b>Ap</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Approximately
	 * <!-- end-model-doc -->
	 * @see #AP_VALUE
	 * @generated
	 * @ordered
	 */
	AP(8, "ap", "ap");

	/**
	 * The '<em><b>Eq</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Equals
	 * <!-- end-model-doc -->
	 * @see #EQ
	 * @model name="eq"
	 * @generated
	 * @ordered
	 */
	public static final int EQ_VALUE = 0;

	/**
	 * The '<em><b>Ne</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not Equals
	 * <!-- end-model-doc -->
	 * @see #NE
	 * @model name="ne"
	 * @generated
	 * @ordered
	 */
	public static final int NE_VALUE = 1;

	/**
	 * The '<em><b>Gt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Greater Than
	 * <!-- end-model-doc -->
	 * @see #GT
	 * @model name="gt"
	 * @generated
	 * @ordered
	 */
	public static final int GT_VALUE = 2;

	/**
	 * The '<em><b>Lt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Less Than
	 * <!-- end-model-doc -->
	 * @see #LT
	 * @model name="lt"
	 * @generated
	 * @ordered
	 */
	public static final int LT_VALUE = 3;

	/**
	 * The '<em><b>Ge</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Greater or Equals
	 * <!-- end-model-doc -->
	 * @see #GE
	 * @model name="ge"
	 * @generated
	 * @ordered
	 */
	public static final int GE_VALUE = 4;

	/**
	 * The '<em><b>Le</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Less of Equal
	 * <!-- end-model-doc -->
	 * @see #LE
	 * @model name="le"
	 * @generated
	 * @ordered
	 */
	public static final int LE_VALUE = 5;

	/**
	 * The '<em><b>Sa</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Starts After
	 * <!-- end-model-doc -->
	 * @see #SA
	 * @model name="sa"
	 * @generated
	 * @ordered
	 */
	public static final int SA_VALUE = 6;

	/**
	 * The '<em><b>Eb</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ends Before
	 * <!-- end-model-doc -->
	 * @see #EB
	 * @model name="eb"
	 * @generated
	 * @ordered
	 */
	public static final int EB_VALUE = 7;

	/**
	 * The '<em><b>Ap</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Approximately
	 * <!-- end-model-doc -->
	 * @see #AP
	 * @model name="ap"
	 * @generated
	 * @ordered
	 */
	public static final int AP_VALUE = 8;

	/**
	 * An array of all the '<em><b>Search Comparator List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SearchComparatorList[] VALUES_ARRAY =
		new SearchComparatorList[] {
			EQ,
			NE,
			GT,
			LT,
			GE,
			LE,
			SA,
			EB,
			AP,
		};

	/**
	 * A public read-only list of all the '<em><b>Search Comparator List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SearchComparatorList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Search Comparator List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SearchComparatorList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SearchComparatorList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Search Comparator List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SearchComparatorList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SearchComparatorList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Search Comparator List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SearchComparatorList get(int value) {
		switch (value) {
			case EQ_VALUE: return EQ;
			case NE_VALUE: return NE;
			case GT_VALUE: return GT;
			case LT_VALUE: return LT;
			case GE_VALUE: return GE;
			case LE_VALUE: return LE;
			case SA_VALUE: return SA;
			case EB_VALUE: return EB;
			case AP_VALUE: return AP;
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
	private SearchComparatorList(int value, String name, String literal) {
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
	
} //SearchComparatorList
