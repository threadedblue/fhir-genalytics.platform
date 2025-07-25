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
 * A representation of the literals of the enumeration '<em><b>Research Study Status List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getResearchStudyStatusList()
 * @model extendedMetaData="name='ResearchStudyStatus-list'"
 * @generated
 */
public enum ResearchStudyStatusList implements Enumerator {
	/**
	 * The '<em><b>Active</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Active
	 * <!-- end-model-doc -->
	 * @see #ACTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	ACTIVE(0, "active", "active"),

	/**
	 * The '<em><b>Administratively Completed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Administratively Completed
	 * <!-- end-model-doc -->
	 * @see #ADMINISTRATIVELY_COMPLETED_VALUE
	 * @generated
	 * @ordered
	 */
	ADMINISTRATIVELY_COMPLETED(1, "administrativelyCompleted", "administratively-completed"),

	/**
	 * The '<em><b>Approved</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Approved
	 * <!-- end-model-doc -->
	 * @see #APPROVED_VALUE
	 * @generated
	 * @ordered
	 */
	APPROVED(2, "approved", "approved"),

	/**
	 * The '<em><b>Closed To Accrual</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Closed to Accrual
	 * <!-- end-model-doc -->
	 * @see #CLOSED_TO_ACCRUAL_VALUE
	 * @generated
	 * @ordered
	 */
	CLOSED_TO_ACCRUAL(3, "closedToAccrual", "closed-to-accrual"),

	/**
	 * The '<em><b>Closed To Accrual And Intervention</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Closed to Accrual and Intervention
	 * <!-- end-model-doc -->
	 * @see #CLOSED_TO_ACCRUAL_AND_INTERVENTION_VALUE
	 * @generated
	 * @ordered
	 */
	CLOSED_TO_ACCRUAL_AND_INTERVENTION(4, "closedToAccrualAndIntervention", "closed-to-accrual-and-intervention"),

	/**
	 * The '<em><b>Completed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Completed
	 * <!-- end-model-doc -->
	 * @see #COMPLETED_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETED(5, "completed", "completed"),

	/**
	 * The '<em><b>Disapproved</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Disapproved
	 * <!-- end-model-doc -->
	 * @see #DISAPPROVED_VALUE
	 * @generated
	 * @ordered
	 */
	DISAPPROVED(6, "disapproved", "disapproved"),

	/**
	 * The '<em><b>In Review</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In Review
	 * <!-- end-model-doc -->
	 * @see #IN_REVIEW_VALUE
	 * @generated
	 * @ordered
	 */
	IN_REVIEW(7, "inReview", "in-review"),

	/**
	 * The '<em><b>Temporarily Closed To Accrual</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Temporarily Closed to Accrual
	 * <!-- end-model-doc -->
	 * @see #TEMPORARILY_CLOSED_TO_ACCRUAL_VALUE
	 * @generated
	 * @ordered
	 */
	TEMPORARILY_CLOSED_TO_ACCRUAL(8, "temporarilyClosedToAccrual", "temporarily-closed-to-accrual"),

	/**
	 * The '<em><b>Temporarily Closed To Accrual And Intervention</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Temporarily Closed to Accrual and Intervention
	 * <!-- end-model-doc -->
	 * @see #TEMPORARILY_CLOSED_TO_ACCRUAL_AND_INTERVENTION_VALUE
	 * @generated
	 * @ordered
	 */
	TEMPORARILY_CLOSED_TO_ACCRUAL_AND_INTERVENTION(9, "temporarilyClosedToAccrualAndIntervention", "temporarily-closed-to-accrual-and-intervention"),

	/**
	 * The '<em><b>Withdrawn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Withdrawn
	 * <!-- end-model-doc -->
	 * @see #WITHDRAWN_VALUE
	 * @generated
	 * @ordered
	 */
	WITHDRAWN(10, "withdrawn", "withdrawn");

	/**
	 * The '<em><b>Active</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Active
	 * <!-- end-model-doc -->
	 * @see #ACTIVE
	 * @model name="active"
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVE_VALUE = 0;

	/**
	 * The '<em><b>Administratively Completed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Administratively Completed
	 * <!-- end-model-doc -->
	 * @see #ADMINISTRATIVELY_COMPLETED
	 * @model name="administrativelyCompleted" literal="administratively-completed"
	 * @generated
	 * @ordered
	 */
	public static final int ADMINISTRATIVELY_COMPLETED_VALUE = 1;

	/**
	 * The '<em><b>Approved</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Approved
	 * <!-- end-model-doc -->
	 * @see #APPROVED
	 * @model name="approved"
	 * @generated
	 * @ordered
	 */
	public static final int APPROVED_VALUE = 2;

	/**
	 * The '<em><b>Closed To Accrual</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Closed to Accrual
	 * <!-- end-model-doc -->
	 * @see #CLOSED_TO_ACCRUAL
	 * @model name="closedToAccrual" literal="closed-to-accrual"
	 * @generated
	 * @ordered
	 */
	public static final int CLOSED_TO_ACCRUAL_VALUE = 3;

	/**
	 * The '<em><b>Closed To Accrual And Intervention</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Closed to Accrual and Intervention
	 * <!-- end-model-doc -->
	 * @see #CLOSED_TO_ACCRUAL_AND_INTERVENTION
	 * @model name="closedToAccrualAndIntervention" literal="closed-to-accrual-and-intervention"
	 * @generated
	 * @ordered
	 */
	public static final int CLOSED_TO_ACCRUAL_AND_INTERVENTION_VALUE = 4;

	/**
	 * The '<em><b>Completed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Completed
	 * <!-- end-model-doc -->
	 * @see #COMPLETED
	 * @model name="completed"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETED_VALUE = 5;

	/**
	 * The '<em><b>Disapproved</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Disapproved
	 * <!-- end-model-doc -->
	 * @see #DISAPPROVED
	 * @model name="disapproved"
	 * @generated
	 * @ordered
	 */
	public static final int DISAPPROVED_VALUE = 6;

	/**
	 * The '<em><b>In Review</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In Review
	 * <!-- end-model-doc -->
	 * @see #IN_REVIEW
	 * @model name="inReview" literal="in-review"
	 * @generated
	 * @ordered
	 */
	public static final int IN_REVIEW_VALUE = 7;

	/**
	 * The '<em><b>Temporarily Closed To Accrual</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Temporarily Closed to Accrual
	 * <!-- end-model-doc -->
	 * @see #TEMPORARILY_CLOSED_TO_ACCRUAL
	 * @model name="temporarilyClosedToAccrual" literal="temporarily-closed-to-accrual"
	 * @generated
	 * @ordered
	 */
	public static final int TEMPORARILY_CLOSED_TO_ACCRUAL_VALUE = 8;

	/**
	 * The '<em><b>Temporarily Closed To Accrual And Intervention</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Temporarily Closed to Accrual and Intervention
	 * <!-- end-model-doc -->
	 * @see #TEMPORARILY_CLOSED_TO_ACCRUAL_AND_INTERVENTION
	 * @model name="temporarilyClosedToAccrualAndIntervention" literal="temporarily-closed-to-accrual-and-intervention"
	 * @generated
	 * @ordered
	 */
	public static final int TEMPORARILY_CLOSED_TO_ACCRUAL_AND_INTERVENTION_VALUE = 9;

	/**
	 * The '<em><b>Withdrawn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Withdrawn
	 * <!-- end-model-doc -->
	 * @see #WITHDRAWN
	 * @model name="withdrawn"
	 * @generated
	 * @ordered
	 */
	public static final int WITHDRAWN_VALUE = 10;

	/**
	 * An array of all the '<em><b>Research Study Status List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ResearchStudyStatusList[] VALUES_ARRAY =
		new ResearchStudyStatusList[] {
			ACTIVE,
			ADMINISTRATIVELY_COMPLETED,
			APPROVED,
			CLOSED_TO_ACCRUAL,
			CLOSED_TO_ACCRUAL_AND_INTERVENTION,
			COMPLETED,
			DISAPPROVED,
			IN_REVIEW,
			TEMPORARILY_CLOSED_TO_ACCRUAL,
			TEMPORARILY_CLOSED_TO_ACCRUAL_AND_INTERVENTION,
			WITHDRAWN,
		};

	/**
	 * A public read-only list of all the '<em><b>Research Study Status List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ResearchStudyStatusList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Research Study Status List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResearchStudyStatusList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResearchStudyStatusList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Research Study Status List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResearchStudyStatusList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResearchStudyStatusList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Research Study Status List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResearchStudyStatusList get(int value) {
		switch (value) {
			case ACTIVE_VALUE: return ACTIVE;
			case ADMINISTRATIVELY_COMPLETED_VALUE: return ADMINISTRATIVELY_COMPLETED;
			case APPROVED_VALUE: return APPROVED;
			case CLOSED_TO_ACCRUAL_VALUE: return CLOSED_TO_ACCRUAL;
			case CLOSED_TO_ACCRUAL_AND_INTERVENTION_VALUE: return CLOSED_TO_ACCRUAL_AND_INTERVENTION;
			case COMPLETED_VALUE: return COMPLETED;
			case DISAPPROVED_VALUE: return DISAPPROVED;
			case IN_REVIEW_VALUE: return IN_REVIEW;
			case TEMPORARILY_CLOSED_TO_ACCRUAL_VALUE: return TEMPORARILY_CLOSED_TO_ACCRUAL;
			case TEMPORARILY_CLOSED_TO_ACCRUAL_AND_INTERVENTION_VALUE: return TEMPORARILY_CLOSED_TO_ACCRUAL_AND_INTERVENTION;
			case WITHDRAWN_VALUE: return WITHDRAWN;
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
	private ResearchStudyStatusList(int value, String name, String literal) {
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
	
} //ResearchStudyStatusList
