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
 * A representation of the literals of the enumeration '<em><b>Expression Language List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getExpressionLanguageList()
 * @model extendedMetaData="name='ExpressionLanguage-list'"
 * @generated
 */
public enum ExpressionLanguageList implements Enumerator {
	/**
	 * The '<em><b>Text Cql</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CQL
	 * <!-- end-model-doc -->
	 * @see #TEXT_CQL_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT_CQL(0, "textCql", "text/cql"),

	/**
	 * The '<em><b>Text Fhirpath</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FHIRPath
	 * <!-- end-model-doc -->
	 * @see #TEXT_FHIRPATH_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT_FHIRPATH(1, "textFhirpath", "text/fhirpath"),

	/**
	 * The '<em><b>Application XFhir Query</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FHIR Query
	 * <!-- end-model-doc -->
	 * @see #APPLICATION_XFHIR_QUERY_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_XFHIR_QUERY(2, "applicationXFhirQuery", "application/x-fhir-query");

	/**
	 * The '<em><b>Text Cql</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CQL
	 * <!-- end-model-doc -->
	 * @see #TEXT_CQL
	 * @model name="textCql" literal="text/cql"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_CQL_VALUE = 0;

	/**
	 * The '<em><b>Text Fhirpath</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FHIRPath
	 * <!-- end-model-doc -->
	 * @see #TEXT_FHIRPATH
	 * @model name="textFhirpath" literal="text/fhirpath"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_FHIRPATH_VALUE = 1;

	/**
	 * The '<em><b>Application XFhir Query</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FHIR Query
	 * <!-- end-model-doc -->
	 * @see #APPLICATION_XFHIR_QUERY
	 * @model name="applicationXFhirQuery" literal="application/x-fhir-query"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_XFHIR_QUERY_VALUE = 2;

	/**
	 * An array of all the '<em><b>Expression Language List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ExpressionLanguageList[] VALUES_ARRAY =
		new ExpressionLanguageList[] {
			TEXT_CQL,
			TEXT_FHIRPATH,
			APPLICATION_XFHIR_QUERY,
		};

	/**
	 * A public read-only list of all the '<em><b>Expression Language List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ExpressionLanguageList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Expression Language List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExpressionLanguageList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExpressionLanguageList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Expression Language List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExpressionLanguageList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExpressionLanguageList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Expression Language List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExpressionLanguageList get(int value) {
		switch (value) {
			case TEXT_CQL_VALUE: return TEXT_CQL;
			case TEXT_FHIRPATH_VALUE: return TEXT_FHIRPATH;
			case APPLICATION_XFHIR_QUERY_VALUE: return APPLICATION_XFHIR_QUERY;
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
	private ExpressionLanguageList(int value, String name, String literal) {
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
	
} //ExpressionLanguageList
