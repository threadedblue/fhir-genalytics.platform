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
 * A representation of the literals of the enumeration '<em><b>Test Script Request Method Code List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getTestScriptRequestMethodCodeList()
 * @model extendedMetaData="name='TestScriptRequestMethodCode-list'"
 * @generated
 */
public enum TestScriptRequestMethodCodeList implements Enumerator {
	/**
	 * The '<em><b>Delete</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DELETE
	 * <!-- end-model-doc -->
	 * @see #DELETE_VALUE
	 * @generated
	 * @ordered
	 */
	DELETE(0, "delete", "delete"),

	/**
	 * The '<em><b>Get</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GET
	 * <!-- end-model-doc -->
	 * @see #GET_VALUE
	 * @generated
	 * @ordered
	 */
	GET(1, "get", "get"),

	/**
	 * The '<em><b>Options</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OPTIONS
	 * <!-- end-model-doc -->
	 * @see #OPTIONS_VALUE
	 * @generated
	 * @ordered
	 */
	OPTIONS(2, "options", "options"),

	/**
	 * The '<em><b>Patch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PATCH
	 * <!-- end-model-doc -->
	 * @see #PATCH_VALUE
	 * @generated
	 * @ordered
	 */
	PATCH(3, "patch", "patch"),

	/**
	 * The '<em><b>Post</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * POST
	 * <!-- end-model-doc -->
	 * @see #POST_VALUE
	 * @generated
	 * @ordered
	 */
	POST(4, "post", "post"),

	/**
	 * The '<em><b>Put</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PUT
	 * <!-- end-model-doc -->
	 * @see #PUT_VALUE
	 * @generated
	 * @ordered
	 */
	PUT(5, "put", "put"),

	/**
	 * The '<em><b>Head</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HEAD
	 * <!-- end-model-doc -->
	 * @see #HEAD_VALUE
	 * @generated
	 * @ordered
	 */
	HEAD(6, "head", "head");

	/**
	 * The '<em><b>Delete</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DELETE
	 * <!-- end-model-doc -->
	 * @see #DELETE
	 * @model name="delete"
	 * @generated
	 * @ordered
	 */
	public static final int DELETE_VALUE = 0;

	/**
	 * The '<em><b>Get</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GET
	 * <!-- end-model-doc -->
	 * @see #GET
	 * @model name="get"
	 * @generated
	 * @ordered
	 */
	public static final int GET_VALUE = 1;

	/**
	 * The '<em><b>Options</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OPTIONS
	 * <!-- end-model-doc -->
	 * @see #OPTIONS
	 * @model name="options"
	 * @generated
	 * @ordered
	 */
	public static final int OPTIONS_VALUE = 2;

	/**
	 * The '<em><b>Patch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PATCH
	 * <!-- end-model-doc -->
	 * @see #PATCH
	 * @model name="patch"
	 * @generated
	 * @ordered
	 */
	public static final int PATCH_VALUE = 3;

	/**
	 * The '<em><b>Post</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * POST
	 * <!-- end-model-doc -->
	 * @see #POST
	 * @model name="post"
	 * @generated
	 * @ordered
	 */
	public static final int POST_VALUE = 4;

	/**
	 * The '<em><b>Put</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PUT
	 * <!-- end-model-doc -->
	 * @see #PUT
	 * @model name="put"
	 * @generated
	 * @ordered
	 */
	public static final int PUT_VALUE = 5;

	/**
	 * The '<em><b>Head</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HEAD
	 * <!-- end-model-doc -->
	 * @see #HEAD
	 * @model name="head"
	 * @generated
	 * @ordered
	 */
	public static final int HEAD_VALUE = 6;

	/**
	 * An array of all the '<em><b>Test Script Request Method Code List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TestScriptRequestMethodCodeList[] VALUES_ARRAY =
		new TestScriptRequestMethodCodeList[] {
			DELETE,
			GET,
			OPTIONS,
			PATCH,
			POST,
			PUT,
			HEAD,
		};

	/**
	 * A public read-only list of all the '<em><b>Test Script Request Method Code List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TestScriptRequestMethodCodeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Test Script Request Method Code List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TestScriptRequestMethodCodeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TestScriptRequestMethodCodeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Test Script Request Method Code List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TestScriptRequestMethodCodeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TestScriptRequestMethodCodeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Test Script Request Method Code List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TestScriptRequestMethodCodeList get(int value) {
		switch (value) {
			case DELETE_VALUE: return DELETE;
			case GET_VALUE: return GET;
			case OPTIONS_VALUE: return OPTIONS;
			case PATCH_VALUE: return PATCH;
			case POST_VALUE: return POST;
			case PUT_VALUE: return PUT;
			case HEAD_VALUE: return HEAD;
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
	private TestScriptRequestMethodCodeList(int value, String name, String literal) {
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
	
} //TestScriptRequestMethodCodeList
