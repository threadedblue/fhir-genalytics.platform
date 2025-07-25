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
 * A representation of the literals of the enumeration '<em><b>Measure Report Type List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getMeasureReportTypeList()
 * @model extendedMetaData="name='MeasureReportType-list'"
 * @generated
 */
public enum MeasureReportTypeList implements Enumerator {
	/**
	 * The '<em><b>Individual</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Individual
	 * <!-- end-model-doc -->
	 * @see #INDIVIDUAL_VALUE
	 * @generated
	 * @ordered
	 */
	INDIVIDUAL(0, "individual", "individual"),

	/**
	 * The '<em><b>Subject List</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Subject List
	 * <!-- end-model-doc -->
	 * @see #SUBJECT_LIST_VALUE
	 * @generated
	 * @ordered
	 */
	SUBJECT_LIST(1, "subjectList", "subject-list"),

	/**
	 * The '<em><b>Summary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Summary
	 * <!-- end-model-doc -->
	 * @see #SUMMARY_VALUE
	 * @generated
	 * @ordered
	 */
	SUMMARY(2, "summary", "summary"),

	/**
	 * The '<em><b>Data Collection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data Collection
	 * <!-- end-model-doc -->
	 * @see #DATA_COLLECTION_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_COLLECTION(3, "dataCollection", "data-collection");

	/**
	 * The '<em><b>Individual</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Individual
	 * <!-- end-model-doc -->
	 * @see #INDIVIDUAL
	 * @model name="individual"
	 * @generated
	 * @ordered
	 */
	public static final int INDIVIDUAL_VALUE = 0;

	/**
	 * The '<em><b>Subject List</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Subject List
	 * <!-- end-model-doc -->
	 * @see #SUBJECT_LIST
	 * @model name="subjectList" literal="subject-list"
	 * @generated
	 * @ordered
	 */
	public static final int SUBJECT_LIST_VALUE = 1;

	/**
	 * The '<em><b>Summary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Summary
	 * <!-- end-model-doc -->
	 * @see #SUMMARY
	 * @model name="summary"
	 * @generated
	 * @ordered
	 */
	public static final int SUMMARY_VALUE = 2;

	/**
	 * The '<em><b>Data Collection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data Collection
	 * <!-- end-model-doc -->
	 * @see #DATA_COLLECTION
	 * @model name="dataCollection" literal="data-collection"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_COLLECTION_VALUE = 3;

	/**
	 * An array of all the '<em><b>Measure Report Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MeasureReportTypeList[] VALUES_ARRAY =
		new MeasureReportTypeList[] {
			INDIVIDUAL,
			SUBJECT_LIST,
			SUMMARY,
			DATA_COLLECTION,
		};

	/**
	 * A public read-only list of all the '<em><b>Measure Report Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MeasureReportTypeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Measure Report Type List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MeasureReportTypeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MeasureReportTypeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Measure Report Type List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MeasureReportTypeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MeasureReportTypeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Measure Report Type List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MeasureReportTypeList get(int value) {
		switch (value) {
			case INDIVIDUAL_VALUE: return INDIVIDUAL;
			case SUBJECT_LIST_VALUE: return SUBJECT_LIST;
			case SUMMARY_VALUE: return SUMMARY;
			case DATA_COLLECTION_VALUE: return DATA_COLLECTION;
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
	private MeasureReportTypeList(int value, String name, String literal) {
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
	
} //MeasureReportTypeList
