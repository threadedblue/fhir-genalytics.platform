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
 * A representation of the literals of the enumeration '<em><b>Questionnaire Item Operator List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItemOperatorList()
 * @model extendedMetaData="name='QuestionnaireItemOperator-list'"
 * @generated
 */
public enum QuestionnaireItemOperatorList implements Enumerator {
	/**
	 * The '<em><b>Exists</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exists
	 * <!-- end-model-doc -->
	 * @see #EXISTS_VALUE
	 * @generated
	 * @ordered
	 */
	EXISTS(0, "exists", "exists"),

	/**
	 * The '<em><b></b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Equals
	 * <!-- end-model-doc -->
	 * @see #___VALUE
	 * @generated
	 * @ordered
	 */
	__(1, "__", "="),

	/**
	 * The '<em><b>1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not Equals
	 * <!-- end-model-doc -->
	 * @see #_1_VALUE
	 * @generated
	 * @ordered
	 */
	_1(2, "_1", "!="),

	/**
	 * The '<em><b>2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Greater Than
	 * <!-- end-model-doc -->
	 * @see #_2_VALUE
	 * @generated
	 * @ordered
	 */
	_2(3, "_2", ">"),

	/**
	 * The '<em><b>3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Less Than
	 * <!-- end-model-doc -->
	 * @see #_3_VALUE
	 * @generated
	 * @ordered
	 */
	_3(4, "_3", "<"),

	/**
	 * The '<em><b>4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Greater or Equals
	 * <!-- end-model-doc -->
	 * @see #_4_VALUE
	 * @generated
	 * @ordered
	 */
	_4(5, "_4", ">="),

	/**
	 * The '<em><b>5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Less or Equals
	 * <!-- end-model-doc -->
	 * @see #_5_VALUE
	 * @generated
	 * @ordered
	 */
	_5(6, "_5", "<=");

	/**
	 * The '<em><b>Exists</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exists
	 * <!-- end-model-doc -->
	 * @see #EXISTS
	 * @model name="exists"
	 * @generated
	 * @ordered
	 */
	public static final int EXISTS_VALUE = 0;

	/**
	 * The '<em><b></b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Equals
	 * <!-- end-model-doc -->
	 * @see #__
	 * @model literal="="
	 * @generated
	 * @ordered
	 */
	public static final int ___VALUE = 1;

	/**
	 * The '<em><b>1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not Equals
	 * <!-- end-model-doc -->
	 * @see #_1
	 * @model literal="!="
	 * @generated
	 * @ordered
	 */
	public static final int _1_VALUE = 2;

	/**
	 * The '<em><b>2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Greater Than
	 * <!-- end-model-doc -->
	 * @see #_2
	 * @model literal="&gt;"
	 * @generated
	 * @ordered
	 */
	public static final int _2_VALUE = 3;

	/**
	 * The '<em><b>3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Less Than
	 * <!-- end-model-doc -->
	 * @see #_3
	 * @model literal="&lt;"
	 * @generated
	 * @ordered
	 */
	public static final int _3_VALUE = 4;

	/**
	 * The '<em><b>4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Greater or Equals
	 * <!-- end-model-doc -->
	 * @see #_4
	 * @model literal="&gt;="
	 * @generated
	 * @ordered
	 */
	public static final int _4_VALUE = 5;

	/**
	 * The '<em><b>5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Less or Equals
	 * <!-- end-model-doc -->
	 * @see #_5
	 * @model literal="&lt;="
	 * @generated
	 * @ordered
	 */
	public static final int _5_VALUE = 6;

	/**
	 * An array of all the '<em><b>Questionnaire Item Operator List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final QuestionnaireItemOperatorList[] VALUES_ARRAY =
		new QuestionnaireItemOperatorList[] {
			EXISTS,
			__,
			_1,
			_2,
			_3,
			_4,
			_5,
		};

	/**
	 * A public read-only list of all the '<em><b>Questionnaire Item Operator List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<QuestionnaireItemOperatorList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Questionnaire Item Operator List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QuestionnaireItemOperatorList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QuestionnaireItemOperatorList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Questionnaire Item Operator List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QuestionnaireItemOperatorList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QuestionnaireItemOperatorList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Questionnaire Item Operator List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QuestionnaireItemOperatorList get(int value) {
		switch (value) {
			case EXISTS_VALUE: return EXISTS;
			case ___VALUE: return __;
			case _1_VALUE: return _1;
			case _2_VALUE: return _2;
			case _3_VALUE: return _3;
			case _4_VALUE: return _4;
			case _5_VALUE: return _5;
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
	private QuestionnaireItemOperatorList(int value, String name, String literal) {
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
	
} //QuestionnaireItemOperatorList
