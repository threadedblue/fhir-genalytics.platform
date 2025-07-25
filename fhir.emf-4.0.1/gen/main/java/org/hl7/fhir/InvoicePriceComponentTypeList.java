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
 * A representation of the literals of the enumeration '<em><b>Invoice Price Component Type List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getInvoicePriceComponentTypeList()
 * @model extendedMetaData="name='InvoicePriceComponentType-list'"
 * @generated
 */
public enum InvoicePriceComponentTypeList implements Enumerator {
	/**
	 * The '<em><b>Base</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * base price
	 * <!-- end-model-doc -->
	 * @see #BASE_VALUE
	 * @generated
	 * @ordered
	 */
	BASE(0, "base", "base"),

	/**
	 * The '<em><b>Surcharge</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * surcharge
	 * <!-- end-model-doc -->
	 * @see #SURCHARGE_VALUE
	 * @generated
	 * @ordered
	 */
	SURCHARGE(1, "surcharge", "surcharge"),

	/**
	 * The '<em><b>Deduction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * deduction
	 * <!-- end-model-doc -->
	 * @see #DEDUCTION_VALUE
	 * @generated
	 * @ordered
	 */
	DEDUCTION(2, "deduction", "deduction"),

	/**
	 * The '<em><b>Discount</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * discount
	 * <!-- end-model-doc -->
	 * @see #DISCOUNT_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOUNT(3, "discount", "discount"),

	/**
	 * The '<em><b>Tax</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * tax
	 * <!-- end-model-doc -->
	 * @see #TAX_VALUE
	 * @generated
	 * @ordered
	 */
	TAX(4, "tax", "tax"),

	/**
	 * The '<em><b>Informational</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * informational
	 * <!-- end-model-doc -->
	 * @see #INFORMATIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	INFORMATIONAL(5, "informational", "informational");

	/**
	 * The '<em><b>Base</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * base price
	 * <!-- end-model-doc -->
	 * @see #BASE
	 * @model name="base"
	 * @generated
	 * @ordered
	 */
	public static final int BASE_VALUE = 0;

	/**
	 * The '<em><b>Surcharge</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * surcharge
	 * <!-- end-model-doc -->
	 * @see #SURCHARGE
	 * @model name="surcharge"
	 * @generated
	 * @ordered
	 */
	public static final int SURCHARGE_VALUE = 1;

	/**
	 * The '<em><b>Deduction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * deduction
	 * <!-- end-model-doc -->
	 * @see #DEDUCTION
	 * @model name="deduction"
	 * @generated
	 * @ordered
	 */
	public static final int DEDUCTION_VALUE = 2;

	/**
	 * The '<em><b>Discount</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * discount
	 * <!-- end-model-doc -->
	 * @see #DISCOUNT
	 * @model name="discount"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOUNT_VALUE = 3;

	/**
	 * The '<em><b>Tax</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * tax
	 * <!-- end-model-doc -->
	 * @see #TAX
	 * @model name="tax"
	 * @generated
	 * @ordered
	 */
	public static final int TAX_VALUE = 4;

	/**
	 * The '<em><b>Informational</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * informational
	 * <!-- end-model-doc -->
	 * @see #INFORMATIONAL
	 * @model name="informational"
	 * @generated
	 * @ordered
	 */
	public static final int INFORMATIONAL_VALUE = 5;

	/**
	 * An array of all the '<em><b>Invoice Price Component Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InvoicePriceComponentTypeList[] VALUES_ARRAY =
		new InvoicePriceComponentTypeList[] {
			BASE,
			SURCHARGE,
			DEDUCTION,
			DISCOUNT,
			TAX,
			INFORMATIONAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Invoice Price Component Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<InvoicePriceComponentTypeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Invoice Price Component Type List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InvoicePriceComponentTypeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InvoicePriceComponentTypeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Invoice Price Component Type List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InvoicePriceComponentTypeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InvoicePriceComponentTypeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Invoice Price Component Type List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InvoicePriceComponentTypeList get(int value) {
		switch (value) {
			case BASE_VALUE: return BASE;
			case SURCHARGE_VALUE: return SURCHARGE;
			case DEDUCTION_VALUE: return DEDUCTION;
			case DISCOUNT_VALUE: return DISCOUNT;
			case TAX_VALUE: return TAX;
			case INFORMATIONAL_VALUE: return INFORMATIONAL;
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
	private InvoicePriceComponentTypeList(int value, String name, String literal) {
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
	
} //InvoicePriceComponentTypeList
