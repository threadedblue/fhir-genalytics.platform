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
 * A representation of the literals of the enumeration '<em><b>Repository Type List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getRepositoryTypeList()
 * @model extendedMetaData="name='repositoryType-list'"
 * @generated
 */
public enum RepositoryTypeList implements Enumerator {
	/**
	 * The '<em><b>Directlink</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Click and see
	 * <!-- end-model-doc -->
	 * @see #DIRECTLINK_VALUE
	 * @generated
	 * @ordered
	 */
	DIRECTLINK(0, "directlink", "directlink"),

	/**
	 * The '<em><b>Openapi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URL is the RESTful or other kind of API that can access to the result.
	 * <!-- end-model-doc -->
	 * @see #OPENAPI_VALUE
	 * @generated
	 * @ordered
	 */
	OPENAPI(1, "openapi", "openapi"),

	/**
	 * The '<em><b>Login</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Result cannot be access unless an account is logged in
	 * <!-- end-model-doc -->
	 * @see #LOGIN_VALUE
	 * @generated
	 * @ordered
	 */
	LOGIN(2, "login", "login"),

	/**
	 * The '<em><b>Oauth</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Result need to be fetched with API and need LOGIN( or cookies are required when visiting the link of resource)
	 * <!-- end-model-doc -->
	 * @see #OAUTH_VALUE
	 * @generated
	 * @ordered
	 */
	OAUTH(3, "oauth", "oauth"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Some other complicated or particular way to get resource from URL.
	 * <!-- end-model-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(4, "other", "other");

	/**
	 * The '<em><b>Directlink</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Click and see
	 * <!-- end-model-doc -->
	 * @see #DIRECTLINK
	 * @model name="directlink"
	 * @generated
	 * @ordered
	 */
	public static final int DIRECTLINK_VALUE = 0;

	/**
	 * The '<em><b>Openapi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URL is the RESTful or other kind of API that can access to the result.
	 * <!-- end-model-doc -->
	 * @see #OPENAPI
	 * @model name="openapi"
	 * @generated
	 * @ordered
	 */
	public static final int OPENAPI_VALUE = 1;

	/**
	 * The '<em><b>Login</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Result cannot be access unless an account is logged in
	 * <!-- end-model-doc -->
	 * @see #LOGIN
	 * @model name="login"
	 * @generated
	 * @ordered
	 */
	public static final int LOGIN_VALUE = 2;

	/**
	 * The '<em><b>Oauth</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Result need to be fetched with API and need LOGIN( or cookies are required when visiting the link of resource)
	 * <!-- end-model-doc -->
	 * @see #OAUTH
	 * @model name="oauth"
	 * @generated
	 * @ordered
	 */
	public static final int OAUTH_VALUE = 3;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Some other complicated or particular way to get resource from URL.
	 * <!-- end-model-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 4;

	/**
	 * An array of all the '<em><b>Repository Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RepositoryTypeList[] VALUES_ARRAY =
		new RepositoryTypeList[] {
			DIRECTLINK,
			OPENAPI,
			LOGIN,
			OAUTH,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Repository Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RepositoryTypeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Repository Type List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RepositoryTypeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RepositoryTypeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Repository Type List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RepositoryTypeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RepositoryTypeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Repository Type List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RepositoryTypeList get(int value) {
		switch (value) {
			case DIRECTLINK_VALUE: return DIRECTLINK;
			case OPENAPI_VALUE: return OPENAPI;
			case LOGIN_VALUE: return LOGIN;
			case OAUTH_VALUE: return OAUTH;
			case OTHER_VALUE: return OTHER;
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
	private RepositoryTypeList(int value, String name, String literal) {
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
	
} //RepositoryTypeList
