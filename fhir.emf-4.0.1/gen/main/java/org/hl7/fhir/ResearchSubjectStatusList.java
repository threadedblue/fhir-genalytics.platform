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
 * A representation of the literals of the enumeration '<em><b>Research Subject Status List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getResearchSubjectStatusList()
 * @model extendedMetaData="name='ResearchSubjectStatus-list'"
 * @generated
 */
public enum ResearchSubjectStatusList implements Enumerator {
	/**
	 * The '<em><b>Candidate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Candidate
	 * <!-- end-model-doc -->
	 * @see #CANDIDATE_VALUE
	 * @generated
	 * @ordered
	 */
	CANDIDATE(0, "candidate", "candidate"),

	/**
	 * The '<em><b>Eligible</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eligible
	 * <!-- end-model-doc -->
	 * @see #ELIGIBLE_VALUE
	 * @generated
	 * @ordered
	 */
	ELIGIBLE(1, "eligible", "eligible"),

	/**
	 * The '<em><b>Follow Up</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Follow-up
	 * <!-- end-model-doc -->
	 * @see #FOLLOW_UP_VALUE
	 * @generated
	 * @ordered
	 */
	FOLLOW_UP(2, "followUp", "follow-up"),

	/**
	 * The '<em><b>Ineligible</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ineligible
	 * <!-- end-model-doc -->
	 * @see #INELIGIBLE_VALUE
	 * @generated
	 * @ordered
	 */
	INELIGIBLE(3, "ineligible", "ineligible"),

	/**
	 * The '<em><b>Not Registered</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not Registered
	 * <!-- end-model-doc -->
	 * @see #NOT_REGISTERED_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_REGISTERED(4, "notRegistered", "not-registered"),

	/**
	 * The '<em><b>Off Study</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Off-study
	 * <!-- end-model-doc -->
	 * @see #OFF_STUDY_VALUE
	 * @generated
	 * @ordered
	 */
	OFF_STUDY(5, "offStudy", "off-study"),

	/**
	 * The '<em><b>On Study</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * On-study
	 * <!-- end-model-doc -->
	 * @see #ON_STUDY_VALUE
	 * @generated
	 * @ordered
	 */
	ON_STUDY(6, "onStudy", "on-study"),

	/**
	 * The '<em><b>On Study Intervention</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * On-study-intervention
	 * <!-- end-model-doc -->
	 * @see #ON_STUDY_INTERVENTION_VALUE
	 * @generated
	 * @ordered
	 */
	ON_STUDY_INTERVENTION(7, "onStudyIntervention", "on-study-intervention"),

	/**
	 * The '<em><b>On Study Observation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * On-study-observation
	 * <!-- end-model-doc -->
	 * @see #ON_STUDY_OBSERVATION_VALUE
	 * @generated
	 * @ordered
	 */
	ON_STUDY_OBSERVATION(8, "onStudyObservation", "on-study-observation"),

	/**
	 * The '<em><b>Pending On Study</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pending on-study
	 * <!-- end-model-doc -->
	 * @see #PENDING_ON_STUDY_VALUE
	 * @generated
	 * @ordered
	 */
	PENDING_ON_STUDY(9, "pendingOnStudy", "pending-on-study"),

	/**
	 * The '<em><b>Potential Candidate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Potential Candidate
	 * <!-- end-model-doc -->
	 * @see #POTENTIAL_CANDIDATE_VALUE
	 * @generated
	 * @ordered
	 */
	POTENTIAL_CANDIDATE(10, "potentialCandidate", "potential-candidate"),

	/**
	 * The '<em><b>Screening</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Screening
	 * <!-- end-model-doc -->
	 * @see #SCREENING_VALUE
	 * @generated
	 * @ordered
	 */
	SCREENING(11, "screening", "screening"),

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
	WITHDRAWN(12, "withdrawn", "withdrawn");

	/**
	 * The '<em><b>Candidate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Candidate
	 * <!-- end-model-doc -->
	 * @see #CANDIDATE
	 * @model name="candidate"
	 * @generated
	 * @ordered
	 */
	public static final int CANDIDATE_VALUE = 0;

	/**
	 * The '<em><b>Eligible</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eligible
	 * <!-- end-model-doc -->
	 * @see #ELIGIBLE
	 * @model name="eligible"
	 * @generated
	 * @ordered
	 */
	public static final int ELIGIBLE_VALUE = 1;

	/**
	 * The '<em><b>Follow Up</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Follow-up
	 * <!-- end-model-doc -->
	 * @see #FOLLOW_UP
	 * @model name="followUp" literal="follow-up"
	 * @generated
	 * @ordered
	 */
	public static final int FOLLOW_UP_VALUE = 2;

	/**
	 * The '<em><b>Ineligible</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ineligible
	 * <!-- end-model-doc -->
	 * @see #INELIGIBLE
	 * @model name="ineligible"
	 * @generated
	 * @ordered
	 */
	public static final int INELIGIBLE_VALUE = 3;

	/**
	 * The '<em><b>Not Registered</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not Registered
	 * <!-- end-model-doc -->
	 * @see #NOT_REGISTERED
	 * @model name="notRegistered" literal="not-registered"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_REGISTERED_VALUE = 4;

	/**
	 * The '<em><b>Off Study</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Off-study
	 * <!-- end-model-doc -->
	 * @see #OFF_STUDY
	 * @model name="offStudy" literal="off-study"
	 * @generated
	 * @ordered
	 */
	public static final int OFF_STUDY_VALUE = 5;

	/**
	 * The '<em><b>On Study</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * On-study
	 * <!-- end-model-doc -->
	 * @see #ON_STUDY
	 * @model name="onStudy" literal="on-study"
	 * @generated
	 * @ordered
	 */
	public static final int ON_STUDY_VALUE = 6;

	/**
	 * The '<em><b>On Study Intervention</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * On-study-intervention
	 * <!-- end-model-doc -->
	 * @see #ON_STUDY_INTERVENTION
	 * @model name="onStudyIntervention" literal="on-study-intervention"
	 * @generated
	 * @ordered
	 */
	public static final int ON_STUDY_INTERVENTION_VALUE = 7;

	/**
	 * The '<em><b>On Study Observation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * On-study-observation
	 * <!-- end-model-doc -->
	 * @see #ON_STUDY_OBSERVATION
	 * @model name="onStudyObservation" literal="on-study-observation"
	 * @generated
	 * @ordered
	 */
	public static final int ON_STUDY_OBSERVATION_VALUE = 8;

	/**
	 * The '<em><b>Pending On Study</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pending on-study
	 * <!-- end-model-doc -->
	 * @see #PENDING_ON_STUDY
	 * @model name="pendingOnStudy" literal="pending-on-study"
	 * @generated
	 * @ordered
	 */
	public static final int PENDING_ON_STUDY_VALUE = 9;

	/**
	 * The '<em><b>Potential Candidate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Potential Candidate
	 * <!-- end-model-doc -->
	 * @see #POTENTIAL_CANDIDATE
	 * @model name="potentialCandidate" literal="potential-candidate"
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_CANDIDATE_VALUE = 10;

	/**
	 * The '<em><b>Screening</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Screening
	 * <!-- end-model-doc -->
	 * @see #SCREENING
	 * @model name="screening"
	 * @generated
	 * @ordered
	 */
	public static final int SCREENING_VALUE = 11;

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
	public static final int WITHDRAWN_VALUE = 12;

	/**
	 * An array of all the '<em><b>Research Subject Status List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ResearchSubjectStatusList[] VALUES_ARRAY =
		new ResearchSubjectStatusList[] {
			CANDIDATE,
			ELIGIBLE,
			FOLLOW_UP,
			INELIGIBLE,
			NOT_REGISTERED,
			OFF_STUDY,
			ON_STUDY,
			ON_STUDY_INTERVENTION,
			ON_STUDY_OBSERVATION,
			PENDING_ON_STUDY,
			POTENTIAL_CANDIDATE,
			SCREENING,
			WITHDRAWN,
		};

	/**
	 * A public read-only list of all the '<em><b>Research Subject Status List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ResearchSubjectStatusList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Research Subject Status List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResearchSubjectStatusList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResearchSubjectStatusList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Research Subject Status List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResearchSubjectStatusList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResearchSubjectStatusList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Research Subject Status List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResearchSubjectStatusList get(int value) {
		switch (value) {
			case CANDIDATE_VALUE: return CANDIDATE;
			case ELIGIBLE_VALUE: return ELIGIBLE;
			case FOLLOW_UP_VALUE: return FOLLOW_UP;
			case INELIGIBLE_VALUE: return INELIGIBLE;
			case NOT_REGISTERED_VALUE: return NOT_REGISTERED;
			case OFF_STUDY_VALUE: return OFF_STUDY;
			case ON_STUDY_VALUE: return ON_STUDY;
			case ON_STUDY_INTERVENTION_VALUE: return ON_STUDY_INTERVENTION;
			case ON_STUDY_OBSERVATION_VALUE: return ON_STUDY_OBSERVATION;
			case PENDING_ON_STUDY_VALUE: return PENDING_ON_STUDY;
			case POTENTIAL_CANDIDATE_VALUE: return POTENTIAL_CANDIDATE;
			case SCREENING_VALUE: return SCREENING;
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
	private ResearchSubjectStatusList(int value, String name, String literal) {
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
	
} //ResearchSubjectStatusList
