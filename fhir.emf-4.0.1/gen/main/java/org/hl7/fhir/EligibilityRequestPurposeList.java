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
 * A representation of the literals of the enumeration '<em><b>Eligibility Request Purpose List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getEligibilityRequestPurposeList()
 * @model extendedMetaData="name='EligibilityRequestPurpose-list'"
 * @generated
 */
public enum EligibilityRequestPurposeList implements Enumerator {
	/**
	 * The '<em><b>Auth Requirements</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coverage auth-requirements
	 * <!-- end-model-doc -->
	 * @see #AUTH_REQUIREMENTS_VALUE
	 * @generated
	 * @ordered
	 */
	AUTH_REQUIREMENTS(0, "authRequirements", "auth-requirements"),

	/**
	 * The '<em><b>Benefits</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coverage benefits
	 * <!-- end-model-doc -->
	 * @see #BENEFITS_VALUE
	 * @generated
	 * @ordered
	 */
	BENEFITS(1, "benefits", "benefits"),

	/**
	 * The '<em><b>Discovery</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coverage Discovery
	 * <!-- end-model-doc -->
	 * @see #DISCOVERY_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERY(2, "discovery", "discovery"),

	/**
	 * The '<em><b>Validation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coverage Validation
	 * <!-- end-model-doc -->
	 * @see #VALIDATION_VALUE
	 * @generated
	 * @ordered
	 */
	VALIDATION(3, "validation", "validation");

	/**
	 * The '<em><b>Auth Requirements</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coverage auth-requirements
	 * <!-- end-model-doc -->
	 * @see #AUTH_REQUIREMENTS
	 * @model name="authRequirements" literal="auth-requirements"
	 * @generated
	 * @ordered
	 */
	public static final int AUTH_REQUIREMENTS_VALUE = 0;

	/**
	 * The '<em><b>Benefits</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coverage benefits
	 * <!-- end-model-doc -->
	 * @see #BENEFITS
	 * @model name="benefits"
	 * @generated
	 * @ordered
	 */
	public static final int BENEFITS_VALUE = 1;

	/**
	 * The '<em><b>Discovery</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coverage Discovery
	 * <!-- end-model-doc -->
	 * @see #DISCOVERY
	 * @model name="discovery"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERY_VALUE = 2;

	/**
	 * The '<em><b>Validation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coverage Validation
	 * <!-- end-model-doc -->
	 * @see #VALIDATION
	 * @model name="validation"
	 * @generated
	 * @ordered
	 */
	public static final int VALIDATION_VALUE = 3;

	/**
	 * An array of all the '<em><b>Eligibility Request Purpose List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EligibilityRequestPurposeList[] VALUES_ARRAY =
		new EligibilityRequestPurposeList[] {
			AUTH_REQUIREMENTS,
			BENEFITS,
			DISCOVERY,
			VALIDATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Eligibility Request Purpose List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EligibilityRequestPurposeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Eligibility Request Purpose List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EligibilityRequestPurposeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EligibilityRequestPurposeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Eligibility Request Purpose List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EligibilityRequestPurposeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EligibilityRequestPurposeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Eligibility Request Purpose List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EligibilityRequestPurposeList get(int value) {
		switch (value) {
			case AUTH_REQUIREMENTS_VALUE: return AUTH_REQUIREMENTS;
			case BENEFITS_VALUE: return BENEFITS;
			case DISCOVERY_VALUE: return DISCOVERY;
			case VALIDATION_VALUE: return VALIDATION;
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
	private EligibilityRequestPurposeList(int value, String name, String literal) {
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
	
} //EligibilityRequestPurposeList
