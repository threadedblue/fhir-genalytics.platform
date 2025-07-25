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
 * A representation of the literals of the enumeration '<em><b>UDI Entry Type List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getUDIEntryTypeList()
 * @model extendedMetaData="name='UDIEntryType-list'"
 * @generated
 */
public enum UDIEntryTypeList implements Enumerator {
	/**
	 * The '<em><b>Barcode</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Barcode
	 * <!-- end-model-doc -->
	 * @see #BARCODE_VALUE
	 * @generated
	 * @ordered
	 */
	BARCODE(0, "barcode", "barcode"),

	/**
	 * The '<em><b>Rfid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RFID
	 * <!-- end-model-doc -->
	 * @see #RFID_VALUE
	 * @generated
	 * @ordered
	 */
	RFID(1, "rfid", "rfid"),

	/**
	 * The '<em><b>Manual</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Manual
	 * <!-- end-model-doc -->
	 * @see #MANUAL_VALUE
	 * @generated
	 * @ordered
	 */
	MANUAL(2, "manual", "manual"),

	/**
	 * The '<em><b>Card</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Card
	 * <!-- end-model-doc -->
	 * @see #CARD_VALUE
	 * @generated
	 * @ordered
	 */
	CARD(3, "card", "card"),

	/**
	 * The '<em><b>Self Reported</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Self Reported
	 * <!-- end-model-doc -->
	 * @see #SELF_REPORTED_VALUE
	 * @generated
	 * @ordered
	 */
	SELF_REPORTED(4, "selfReported", "self-reported"),

	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unknown
	 * <!-- end-model-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(5, "unknown", "unknown");

	/**
	 * The '<em><b>Barcode</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Barcode
	 * <!-- end-model-doc -->
	 * @see #BARCODE
	 * @model name="barcode"
	 * @generated
	 * @ordered
	 */
	public static final int BARCODE_VALUE = 0;

	/**
	 * The '<em><b>Rfid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RFID
	 * <!-- end-model-doc -->
	 * @see #RFID
	 * @model name="rfid"
	 * @generated
	 * @ordered
	 */
	public static final int RFID_VALUE = 1;

	/**
	 * The '<em><b>Manual</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Manual
	 * <!-- end-model-doc -->
	 * @see #MANUAL
	 * @model name="manual"
	 * @generated
	 * @ordered
	 */
	public static final int MANUAL_VALUE = 2;

	/**
	 * The '<em><b>Card</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Card
	 * <!-- end-model-doc -->
	 * @see #CARD
	 * @model name="card"
	 * @generated
	 * @ordered
	 */
	public static final int CARD_VALUE = 3;

	/**
	 * The '<em><b>Self Reported</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Self Reported
	 * <!-- end-model-doc -->
	 * @see #SELF_REPORTED
	 * @model name="selfReported" literal="self-reported"
	 * @generated
	 * @ordered
	 */
	public static final int SELF_REPORTED_VALUE = 4;

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unknown
	 * <!-- end-model-doc -->
	 * @see #UNKNOWN
	 * @model name="unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 5;

	/**
	 * An array of all the '<em><b>UDI Entry Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UDIEntryTypeList[] VALUES_ARRAY =
		new UDIEntryTypeList[] {
			BARCODE,
			RFID,
			MANUAL,
			CARD,
			SELF_REPORTED,
			UNKNOWN,
		};

	/**
	 * A public read-only list of all the '<em><b>UDI Entry Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UDIEntryTypeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>UDI Entry Type List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UDIEntryTypeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UDIEntryTypeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>UDI Entry Type List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UDIEntryTypeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UDIEntryTypeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>UDI Entry Type List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UDIEntryTypeList get(int value) {
		switch (value) {
			case BARCODE_VALUE: return BARCODE;
			case RFID_VALUE: return RFID;
			case MANUAL_VALUE: return MANUAL;
			case CARD_VALUE: return CARD;
			case SELF_REPORTED_VALUE: return SELF_REPORTED;
			case UNKNOWN_VALUE: return UNKNOWN;
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
	private UDIEntryTypeList(int value, String name, String literal) {
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
	
} //UDIEntryTypeList
