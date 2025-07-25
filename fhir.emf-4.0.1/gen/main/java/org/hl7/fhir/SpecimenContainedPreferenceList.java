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
 * A representation of the literals of the enumeration '<em><b>Specimen Contained Preference List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getSpecimenContainedPreferenceList()
 * @model extendedMetaData="name='SpecimenContainedPreference-list'"
 * @generated
 */
public enum SpecimenContainedPreferenceList implements Enumerator {
	/**
	 * The '<em><b>Preferred</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Preferred
	 * <!-- end-model-doc -->
	 * @see #PREFERRED_VALUE
	 * @generated
	 * @ordered
	 */
	PREFERRED(0, "preferred", "preferred"),

	/**
	 * The '<em><b>Alternate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Alternate
	 * <!-- end-model-doc -->
	 * @see #ALTERNATE_VALUE
	 * @generated
	 * @ordered
	 */
	ALTERNATE(1, "alternate", "alternate");

	/**
	 * The '<em><b>Preferred</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Preferred
	 * <!-- end-model-doc -->
	 * @see #PREFERRED
	 * @model name="preferred"
	 * @generated
	 * @ordered
	 */
	public static final int PREFERRED_VALUE = 0;

	/**
	 * The '<em><b>Alternate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Alternate
	 * <!-- end-model-doc -->
	 * @see #ALTERNATE
	 * @model name="alternate"
	 * @generated
	 * @ordered
	 */
	public static final int ALTERNATE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Specimen Contained Preference List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SpecimenContainedPreferenceList[] VALUES_ARRAY =
		new SpecimenContainedPreferenceList[] {
			PREFERRED,
			ALTERNATE,
		};

	/**
	 * A public read-only list of all the '<em><b>Specimen Contained Preference List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SpecimenContainedPreferenceList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Specimen Contained Preference List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SpecimenContainedPreferenceList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SpecimenContainedPreferenceList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Specimen Contained Preference List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SpecimenContainedPreferenceList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SpecimenContainedPreferenceList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Specimen Contained Preference List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SpecimenContainedPreferenceList get(int value) {
		switch (value) {
			case PREFERRED_VALUE: return PREFERRED;
			case ALTERNATE_VALUE: return ALTERNATE;
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
	private SpecimenContainedPreferenceList(int value, String name, String literal) {
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
	
} //SpecimenContainedPreferenceList
