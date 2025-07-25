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
 * A representation of the literals of the enumeration '<em><b>Messageheader Response Request List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getMessageheaderResponseRequestList()
 * @model extendedMetaData="name='messageheaderResponseRequest-list'"
 * @generated
 */
public enum MessageheaderResponseRequestList implements Enumerator {
	/**
	 * The '<em><b>Always</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Always
	 * <!-- end-model-doc -->
	 * @see #ALWAYS_VALUE
	 * @generated
	 * @ordered
	 */
	ALWAYS(0, "always", "always"),

	/**
	 * The '<em><b>On Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Error/reject conditions only
	 * <!-- end-model-doc -->
	 * @see #ON_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	ON_ERROR(1, "onError", "on-error"),

	/**
	 * The '<em><b>Never</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Never
	 * <!-- end-model-doc -->
	 * @see #NEVER_VALUE
	 * @generated
	 * @ordered
	 */
	NEVER(2, "never", "never"),

	/**
	 * The '<em><b>On Success</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Successful completion only
	 * <!-- end-model-doc -->
	 * @see #ON_SUCCESS_VALUE
	 * @generated
	 * @ordered
	 */
	ON_SUCCESS(3, "onSuccess", "on-success");

	/**
	 * The '<em><b>Always</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Always
	 * <!-- end-model-doc -->
	 * @see #ALWAYS
	 * @model name="always"
	 * @generated
	 * @ordered
	 */
	public static final int ALWAYS_VALUE = 0;

	/**
	 * The '<em><b>On Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Error/reject conditions only
	 * <!-- end-model-doc -->
	 * @see #ON_ERROR
	 * @model name="onError" literal="on-error"
	 * @generated
	 * @ordered
	 */
	public static final int ON_ERROR_VALUE = 1;

	/**
	 * The '<em><b>Never</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Never
	 * <!-- end-model-doc -->
	 * @see #NEVER
	 * @model name="never"
	 * @generated
	 * @ordered
	 */
	public static final int NEVER_VALUE = 2;

	/**
	 * The '<em><b>On Success</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Successful completion only
	 * <!-- end-model-doc -->
	 * @see #ON_SUCCESS
	 * @model name="onSuccess" literal="on-success"
	 * @generated
	 * @ordered
	 */
	public static final int ON_SUCCESS_VALUE = 3;

	/**
	 * An array of all the '<em><b>Messageheader Response Request List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MessageheaderResponseRequestList[] VALUES_ARRAY =
		new MessageheaderResponseRequestList[] {
			ALWAYS,
			ON_ERROR,
			NEVER,
			ON_SUCCESS,
		};

	/**
	 * A public read-only list of all the '<em><b>Messageheader Response Request List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MessageheaderResponseRequestList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Messageheader Response Request List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MessageheaderResponseRequestList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MessageheaderResponseRequestList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Messageheader Response Request List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MessageheaderResponseRequestList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MessageheaderResponseRequestList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Messageheader Response Request List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MessageheaderResponseRequestList get(int value) {
		switch (value) {
			case ALWAYS_VALUE: return ALWAYS;
			case ON_ERROR_VALUE: return ON_ERROR;
			case NEVER_VALUE: return NEVER;
			case ON_SUCCESS_VALUE: return ON_SUCCESS;
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
	private MessageheaderResponseRequestList(int value, String name, String literal) {
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
	
} //MessageheaderResponseRequestList
