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
 * A representation of the literals of the enumeration '<em><b>Contract Resource Publication Status Codes List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getContractResourcePublicationStatusCodesList()
 * @model extendedMetaData="name='ContractResourcePublicationStatusCodes-list'"
 * @generated
 */
public enum ContractResourcePublicationStatusCodesList implements Enumerator {
	/**
	 * The '<em><b>Amended</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Amended
	 * <!-- end-model-doc -->
	 * @see #AMENDED_VALUE
	 * @generated
	 * @ordered
	 */
	AMENDED(0, "amended", "amended"),

	/**
	 * The '<em><b>Appended</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Appended
	 * <!-- end-model-doc -->
	 * @see #APPENDED_VALUE
	 * @generated
	 * @ordered
	 */
	APPENDED(1, "appended", "appended"),

	/**
	 * The '<em><b>Cancelled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cancelled
	 * <!-- end-model-doc -->
	 * @see #CANCELLED_VALUE
	 * @generated
	 * @ordered
	 */
	CANCELLED(2, "cancelled", "cancelled"),

	/**
	 * The '<em><b>Disputed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Disputed
	 * <!-- end-model-doc -->
	 * @see #DISPUTED_VALUE
	 * @generated
	 * @ordered
	 */
	DISPUTED(3, "disputed", "disputed"),

	/**
	 * The '<em><b>Entered In Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Entered in Error
	 * <!-- end-model-doc -->
	 * @see #ENTERED_IN_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	ENTERED_IN_ERROR(4, "enteredInError", "entered-in-error"),

	/**
	 * The '<em><b>Executable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Executable
	 * <!-- end-model-doc -->
	 * @see #EXECUTABLE_VALUE
	 * @generated
	 * @ordered
	 */
	EXECUTABLE(5, "executable", "executable"),

	/**
	 * The '<em><b>Executed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Executed
	 * <!-- end-model-doc -->
	 * @see #EXECUTED_VALUE
	 * @generated
	 * @ordered
	 */
	EXECUTED(6, "executed", "executed"),

	/**
	 * The '<em><b>Negotiable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Negotiable
	 * <!-- end-model-doc -->
	 * @see #NEGOTIABLE_VALUE
	 * @generated
	 * @ordered
	 */
	NEGOTIABLE(7, "negotiable", "negotiable"),

	/**
	 * The '<em><b>Offered</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Offered
	 * <!-- end-model-doc -->
	 * @see #OFFERED_VALUE
	 * @generated
	 * @ordered
	 */
	OFFERED(8, "offered", "offered"),

	/**
	 * The '<em><b>Policy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Policy
	 * <!-- end-model-doc -->
	 * @see #POLICY_VALUE
	 * @generated
	 * @ordered
	 */
	POLICY(9, "policy", "policy"),

	/**
	 * The '<em><b>Rejected</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rejected
	 * <!-- end-model-doc -->
	 * @see #REJECTED_VALUE
	 * @generated
	 * @ordered
	 */
	REJECTED(10, "rejected", "rejected"),

	/**
	 * The '<em><b>Renewed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Renewed
	 * <!-- end-model-doc -->
	 * @see #RENEWED_VALUE
	 * @generated
	 * @ordered
	 */
	RENEWED(11, "renewed", "renewed"),

	/**
	 * The '<em><b>Revoked</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Revoked
	 * <!-- end-model-doc -->
	 * @see #REVOKED_VALUE
	 * @generated
	 * @ordered
	 */
	REVOKED(12, "revoked", "revoked"),

	/**
	 * The '<em><b>Resolved</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resolved
	 * <!-- end-model-doc -->
	 * @see #RESOLVED_VALUE
	 * @generated
	 * @ordered
	 */
	RESOLVED(13, "resolved", "resolved"),

	/**
	 * The '<em><b>Terminated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Terminated
	 * <!-- end-model-doc -->
	 * @see #TERMINATED_VALUE
	 * @generated
	 * @ordered
	 */
	TERMINATED(14, "terminated", "terminated");

	/**
	 * The '<em><b>Amended</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Amended
	 * <!-- end-model-doc -->
	 * @see #AMENDED
	 * @model name="amended"
	 * @generated
	 * @ordered
	 */
	public static final int AMENDED_VALUE = 0;

	/**
	 * The '<em><b>Appended</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Appended
	 * <!-- end-model-doc -->
	 * @see #APPENDED
	 * @model name="appended"
	 * @generated
	 * @ordered
	 */
	public static final int APPENDED_VALUE = 1;

	/**
	 * The '<em><b>Cancelled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cancelled
	 * <!-- end-model-doc -->
	 * @see #CANCELLED
	 * @model name="cancelled"
	 * @generated
	 * @ordered
	 */
	public static final int CANCELLED_VALUE = 2;

	/**
	 * The '<em><b>Disputed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Disputed
	 * <!-- end-model-doc -->
	 * @see #DISPUTED
	 * @model name="disputed"
	 * @generated
	 * @ordered
	 */
	public static final int DISPUTED_VALUE = 3;

	/**
	 * The '<em><b>Entered In Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Entered in Error
	 * <!-- end-model-doc -->
	 * @see #ENTERED_IN_ERROR
	 * @model name="enteredInError" literal="entered-in-error"
	 * @generated
	 * @ordered
	 */
	public static final int ENTERED_IN_ERROR_VALUE = 4;

	/**
	 * The '<em><b>Executable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Executable
	 * <!-- end-model-doc -->
	 * @see #EXECUTABLE
	 * @model name="executable"
	 * @generated
	 * @ordered
	 */
	public static final int EXECUTABLE_VALUE = 5;

	/**
	 * The '<em><b>Executed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Executed
	 * <!-- end-model-doc -->
	 * @see #EXECUTED
	 * @model name="executed"
	 * @generated
	 * @ordered
	 */
	public static final int EXECUTED_VALUE = 6;

	/**
	 * The '<em><b>Negotiable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Negotiable
	 * <!-- end-model-doc -->
	 * @see #NEGOTIABLE
	 * @model name="negotiable"
	 * @generated
	 * @ordered
	 */
	public static final int NEGOTIABLE_VALUE = 7;

	/**
	 * The '<em><b>Offered</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Offered
	 * <!-- end-model-doc -->
	 * @see #OFFERED
	 * @model name="offered"
	 * @generated
	 * @ordered
	 */
	public static final int OFFERED_VALUE = 8;

	/**
	 * The '<em><b>Policy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Policy
	 * <!-- end-model-doc -->
	 * @see #POLICY
	 * @model name="policy"
	 * @generated
	 * @ordered
	 */
	public static final int POLICY_VALUE = 9;

	/**
	 * The '<em><b>Rejected</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rejected
	 * <!-- end-model-doc -->
	 * @see #REJECTED
	 * @model name="rejected"
	 * @generated
	 * @ordered
	 */
	public static final int REJECTED_VALUE = 10;

	/**
	 * The '<em><b>Renewed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Renewed
	 * <!-- end-model-doc -->
	 * @see #RENEWED
	 * @model name="renewed"
	 * @generated
	 * @ordered
	 */
	public static final int RENEWED_VALUE = 11;

	/**
	 * The '<em><b>Revoked</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Revoked
	 * <!-- end-model-doc -->
	 * @see #REVOKED
	 * @model name="revoked"
	 * @generated
	 * @ordered
	 */
	public static final int REVOKED_VALUE = 12;

	/**
	 * The '<em><b>Resolved</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resolved
	 * <!-- end-model-doc -->
	 * @see #RESOLVED
	 * @model name="resolved"
	 * @generated
	 * @ordered
	 */
	public static final int RESOLVED_VALUE = 13;

	/**
	 * The '<em><b>Terminated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Terminated
	 * <!-- end-model-doc -->
	 * @see #TERMINATED
	 * @model name="terminated"
	 * @generated
	 * @ordered
	 */
	public static final int TERMINATED_VALUE = 14;

	/**
	 * An array of all the '<em><b>Contract Resource Publication Status Codes List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ContractResourcePublicationStatusCodesList[] VALUES_ARRAY =
		new ContractResourcePublicationStatusCodesList[] {
			AMENDED,
			APPENDED,
			CANCELLED,
			DISPUTED,
			ENTERED_IN_ERROR,
			EXECUTABLE,
			EXECUTED,
			NEGOTIABLE,
			OFFERED,
			POLICY,
			REJECTED,
			RENEWED,
			REVOKED,
			RESOLVED,
			TERMINATED,
		};

	/**
	 * A public read-only list of all the '<em><b>Contract Resource Publication Status Codes List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ContractResourcePublicationStatusCodesList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Contract Resource Publication Status Codes List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContractResourcePublicationStatusCodesList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContractResourcePublicationStatusCodesList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Contract Resource Publication Status Codes List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContractResourcePublicationStatusCodesList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContractResourcePublicationStatusCodesList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Contract Resource Publication Status Codes List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContractResourcePublicationStatusCodesList get(int value) {
		switch (value) {
			case AMENDED_VALUE: return AMENDED;
			case APPENDED_VALUE: return APPENDED;
			case CANCELLED_VALUE: return CANCELLED;
			case DISPUTED_VALUE: return DISPUTED;
			case ENTERED_IN_ERROR_VALUE: return ENTERED_IN_ERROR;
			case EXECUTABLE_VALUE: return EXECUTABLE;
			case EXECUTED_VALUE: return EXECUTED;
			case NEGOTIABLE_VALUE: return NEGOTIABLE;
			case OFFERED_VALUE: return OFFERED;
			case POLICY_VALUE: return POLICY;
			case REJECTED_VALUE: return REJECTED;
			case RENEWED_VALUE: return RENEWED;
			case REVOKED_VALUE: return REVOKED;
			case RESOLVED_VALUE: return RESOLVED;
			case TERMINATED_VALUE: return TERMINATED;
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
	private ContractResourcePublicationStatusCodesList(int value, String name, String literal) {
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
	
} //ContractResourcePublicationStatusCodesList
