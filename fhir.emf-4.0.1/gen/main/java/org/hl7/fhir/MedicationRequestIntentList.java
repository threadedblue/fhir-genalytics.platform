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
 * A representation of the literals of the enumeration '<em><b>Medication Request Intent List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getMedicationRequestIntentList()
 * @model extendedMetaData="name='medicationRequestIntent-list'"
 * @generated
 */
public enum MedicationRequestIntentList implements Enumerator {
	/**
	 * The '<em><b>Proposal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Proposal
	 * <!-- end-model-doc -->
	 * @see #PROPOSAL_VALUE
	 * @generated
	 * @ordered
	 */
	PROPOSAL(0, "proposal", "proposal"),

	/**
	 * The '<em><b>Plan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Plan
	 * <!-- end-model-doc -->
	 * @see #PLAN_VALUE
	 * @generated
	 * @ordered
	 */
	PLAN(1, "plan", "plan"),

	/**
	 * The '<em><b>Order</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Order
	 * <!-- end-model-doc -->
	 * @see #ORDER_VALUE
	 * @generated
	 * @ordered
	 */
	ORDER(2, "order", "order"),

	/**
	 * The '<em><b>Original Order</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Original Order
	 * <!-- end-model-doc -->
	 * @see #ORIGINAL_ORDER_VALUE
	 * @generated
	 * @ordered
	 */
	ORIGINAL_ORDER(3, "originalOrder", "original-order"),

	/**
	 * The '<em><b>Reflex Order</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reflex Order
	 * <!-- end-model-doc -->
	 * @see #REFLEX_ORDER_VALUE
	 * @generated
	 * @ordered
	 */
	REFLEX_ORDER(4, "reflexOrder", "reflex-order"),

	/**
	 * The '<em><b>Filler Order</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Filler Order
	 * <!-- end-model-doc -->
	 * @see #FILLER_ORDER_VALUE
	 * @generated
	 * @ordered
	 */
	FILLER_ORDER(5, "fillerOrder", "filler-order"),

	/**
	 * The '<em><b>Instance Order</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Instance Order
	 * <!-- end-model-doc -->
	 * @see #INSTANCE_ORDER_VALUE
	 * @generated
	 * @ordered
	 */
	INSTANCE_ORDER(6, "instanceOrder", "instance-order"),

	/**
	 * The '<em><b>Option</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Option
	 * <!-- end-model-doc -->
	 * @see #OPTION_VALUE
	 * @generated
	 * @ordered
	 */
	OPTION(7, "option", "option");

	/**
	 * The '<em><b>Proposal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Proposal
	 * <!-- end-model-doc -->
	 * @see #PROPOSAL
	 * @model name="proposal"
	 * @generated
	 * @ordered
	 */
	public static final int PROPOSAL_VALUE = 0;

	/**
	 * The '<em><b>Plan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Plan
	 * <!-- end-model-doc -->
	 * @see #PLAN
	 * @model name="plan"
	 * @generated
	 * @ordered
	 */
	public static final int PLAN_VALUE = 1;

	/**
	 * The '<em><b>Order</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Order
	 * <!-- end-model-doc -->
	 * @see #ORDER
	 * @model name="order"
	 * @generated
	 * @ordered
	 */
	public static final int ORDER_VALUE = 2;

	/**
	 * The '<em><b>Original Order</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Original Order
	 * <!-- end-model-doc -->
	 * @see #ORIGINAL_ORDER
	 * @model name="originalOrder" literal="original-order"
	 * @generated
	 * @ordered
	 */
	public static final int ORIGINAL_ORDER_VALUE = 3;

	/**
	 * The '<em><b>Reflex Order</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reflex Order
	 * <!-- end-model-doc -->
	 * @see #REFLEX_ORDER
	 * @model name="reflexOrder" literal="reflex-order"
	 * @generated
	 * @ordered
	 */
	public static final int REFLEX_ORDER_VALUE = 4;

	/**
	 * The '<em><b>Filler Order</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Filler Order
	 * <!-- end-model-doc -->
	 * @see #FILLER_ORDER
	 * @model name="fillerOrder" literal="filler-order"
	 * @generated
	 * @ordered
	 */
	public static final int FILLER_ORDER_VALUE = 5;

	/**
	 * The '<em><b>Instance Order</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Instance Order
	 * <!-- end-model-doc -->
	 * @see #INSTANCE_ORDER
	 * @model name="instanceOrder" literal="instance-order"
	 * @generated
	 * @ordered
	 */
	public static final int INSTANCE_ORDER_VALUE = 6;

	/**
	 * The '<em><b>Option</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Option
	 * <!-- end-model-doc -->
	 * @see #OPTION
	 * @model name="option"
	 * @generated
	 * @ordered
	 */
	public static final int OPTION_VALUE = 7;

	/**
	 * An array of all the '<em><b>Medication Request Intent List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MedicationRequestIntentList[] VALUES_ARRAY =
		new MedicationRequestIntentList[] {
			PROPOSAL,
			PLAN,
			ORDER,
			ORIGINAL_ORDER,
			REFLEX_ORDER,
			FILLER_ORDER,
			INSTANCE_ORDER,
			OPTION,
		};

	/**
	 * A public read-only list of all the '<em><b>Medication Request Intent List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MedicationRequestIntentList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Medication Request Intent List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MedicationRequestIntentList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MedicationRequestIntentList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Medication Request Intent List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MedicationRequestIntentList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MedicationRequestIntentList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Medication Request Intent List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MedicationRequestIntentList get(int value) {
		switch (value) {
			case PROPOSAL_VALUE: return PROPOSAL;
			case PLAN_VALUE: return PLAN;
			case ORDER_VALUE: return ORDER;
			case ORIGINAL_ORDER_VALUE: return ORIGINAL_ORDER;
			case REFLEX_ORDER_VALUE: return REFLEX_ORDER;
			case FILLER_ORDER_VALUE: return FILLER_ORDER;
			case INSTANCE_ORDER_VALUE: return INSTANCE_ORDER;
			case OPTION_VALUE: return OPTION;
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
	private MedicationRequestIntentList(int value, String name, String literal) {
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
	
} //MedicationRequestIntentList
