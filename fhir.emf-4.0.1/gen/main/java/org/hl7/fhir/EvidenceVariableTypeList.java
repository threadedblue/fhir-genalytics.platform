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
 * A representation of the literals of the enumeration '<em><b>Evidence Variable Type List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableTypeList()
 * @model extendedMetaData="name='EvidenceVariableType-list'"
 * @generated
 */
public enum EvidenceVariableTypeList implements Enumerator {
	/**
	 * The '<em><b>Dichotomous</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dichotomous
	 * <!-- end-model-doc -->
	 * @see #DICHOTOMOUS_VALUE
	 * @generated
	 * @ordered
	 */
	DICHOTOMOUS(0, "dichotomous", "dichotomous"),

	/**
	 * The '<em><b>Continuous</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Continuous
	 * <!-- end-model-doc -->
	 * @see #CONTINUOUS_VALUE
	 * @generated
	 * @ordered
	 */
	CONTINUOUS(1, "continuous", "continuous"),

	/**
	 * The '<em><b>Descriptive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Descriptive
	 * <!-- end-model-doc -->
	 * @see #DESCRIPTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	DESCRIPTIVE(2, "descriptive", "descriptive");

	/**
	 * The '<em><b>Dichotomous</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dichotomous
	 * <!-- end-model-doc -->
	 * @see #DICHOTOMOUS
	 * @model name="dichotomous"
	 * @generated
	 * @ordered
	 */
	public static final int DICHOTOMOUS_VALUE = 0;

	/**
	 * The '<em><b>Continuous</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Continuous
	 * <!-- end-model-doc -->
	 * @see #CONTINUOUS
	 * @model name="continuous"
	 * @generated
	 * @ordered
	 */
	public static final int CONTINUOUS_VALUE = 1;

	/**
	 * The '<em><b>Descriptive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Descriptive
	 * <!-- end-model-doc -->
	 * @see #DESCRIPTIVE
	 * @model name="descriptive"
	 * @generated
	 * @ordered
	 */
	public static final int DESCRIPTIVE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Evidence Variable Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EvidenceVariableTypeList[] VALUES_ARRAY =
		new EvidenceVariableTypeList[] {
			DICHOTOMOUS,
			CONTINUOUS,
			DESCRIPTIVE,
		};

	/**
	 * A public read-only list of all the '<em><b>Evidence Variable Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EvidenceVariableTypeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Evidence Variable Type List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EvidenceVariableTypeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EvidenceVariableTypeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Evidence Variable Type List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EvidenceVariableTypeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EvidenceVariableTypeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Evidence Variable Type List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EvidenceVariableTypeList get(int value) {
		switch (value) {
			case DICHOTOMOUS_VALUE: return DICHOTOMOUS;
			case CONTINUOUS_VALUE: return CONTINUOUS;
			case DESCRIPTIVE_VALUE: return DESCRIPTIVE;
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
	private EvidenceVariableTypeList(int value, String name, String literal) {
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
	
} //EvidenceVariableTypeList
