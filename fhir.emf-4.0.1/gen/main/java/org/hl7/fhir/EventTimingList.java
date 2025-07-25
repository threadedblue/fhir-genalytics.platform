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
 * A representation of the literals of the enumeration '<em><b>Event Timing List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getEventTimingList()
 * @model extendedMetaData="name='EventTiming-list'"
 * @generated
 */
public enum EventTimingList implements Enumerator {
	/**
	 * The '<em><b>MORN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Morning
	 * <!-- end-model-doc -->
	 * @see #MORN_VALUE
	 * @generated
	 * @ordered
	 */
	MORN(0, "MORN", "MORN"),

	/**
	 * The '<em><b>MORN Early</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Early Morning
	 * <!-- end-model-doc -->
	 * @see #MORN_EARLY_VALUE
	 * @generated
	 * @ordered
	 */
	MORN_EARLY(1, "MORNEarly", "MORN.early"),

	/**
	 * The '<em><b>MORN Late</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Late Morning
	 * <!-- end-model-doc -->
	 * @see #MORN_LATE_VALUE
	 * @generated
	 * @ordered
	 */
	MORN_LATE(2, "MORNLate", "MORN.late"),

	/**
	 * The '<em><b>NOON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Noon
	 * <!-- end-model-doc -->
	 * @see #NOON_VALUE
	 * @generated
	 * @ordered
	 */
	NOON(3, "NOON", "NOON"),

	/**
	 * The '<em><b>AFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Afternoon
	 * <!-- end-model-doc -->
	 * @see #AFT_VALUE
	 * @generated
	 * @ordered
	 */
	AFT(4, "AFT", "AFT"),

	/**
	 * The '<em><b>AFT Early</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Early Afternoon
	 * <!-- end-model-doc -->
	 * @see #AFT_EARLY_VALUE
	 * @generated
	 * @ordered
	 */
	AFT_EARLY(5, "AFTEarly", "AFT.early"),

	/**
	 * The '<em><b>AFT Late</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Late Afternoon
	 * <!-- end-model-doc -->
	 * @see #AFT_LATE_VALUE
	 * @generated
	 * @ordered
	 */
	AFT_LATE(6, "AFTLate", "AFT.late"),

	/**
	 * The '<em><b>EVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Evening
	 * <!-- end-model-doc -->
	 * @see #EVE_VALUE
	 * @generated
	 * @ordered
	 */
	EVE(7, "EVE", "EVE"),

	/**
	 * The '<em><b>EVE Early</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Early Evening
	 * <!-- end-model-doc -->
	 * @see #EVE_EARLY_VALUE
	 * @generated
	 * @ordered
	 */
	EVE_EARLY(8, "EVEEarly", "EVE.early"),

	/**
	 * The '<em><b>EVE Late</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Late Evening
	 * <!-- end-model-doc -->
	 * @see #EVE_LATE_VALUE
	 * @generated
	 * @ordered
	 */
	EVE_LATE(9, "EVELate", "EVE.late"),

	/**
	 * The '<em><b>NIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Night
	 * <!-- end-model-doc -->
	 * @see #NIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	NIGHT(10, "NIGHT", "NIGHT"),

	/**
	 * The '<em><b>PHS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * After Sleep
	 * <!-- end-model-doc -->
	 * @see #PHS_VALUE
	 * @generated
	 * @ordered
	 */
	PHS(11, "PHS", "PHS"),

	/**
	 * The '<em><b>HS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HS
	 * <!-- end-model-doc -->
	 * @see #HS_VALUE
	 * @generated
	 * @ordered
	 */
	HS(12, "HS", "HS"),

	/**
	 * The '<em><b>WAKE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * WAKE
	 * <!-- end-model-doc -->
	 * @see #WAKE_VALUE
	 * @generated
	 * @ordered
	 */
	WAKE(13, "WAKE", "WAKE"),

	/**
	 * The '<em><b>C</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * C
	 * <!-- end-model-doc -->
	 * @see #C_VALUE
	 * @generated
	 * @ordered
	 */
	C(14, "C", "C"),

	/**
	 * The '<em><b>CM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CM
	 * <!-- end-model-doc -->
	 * @see #CM_VALUE
	 * @generated
	 * @ordered
	 */
	CM(15, "CM", "CM"),

	/**
	 * The '<em><b>CD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CD
	 * <!-- end-model-doc -->
	 * @see #CD_VALUE
	 * @generated
	 * @ordered
	 */
	CD(16, "CD", "CD"),

	/**
	 * The '<em><b>CV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CV
	 * <!-- end-model-doc -->
	 * @see #CV_VALUE
	 * @generated
	 * @ordered
	 */
	CV(17, "CV", "CV"),

	/**
	 * The '<em><b>AC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AC
	 * <!-- end-model-doc -->
	 * @see #AC_VALUE
	 * @generated
	 * @ordered
	 */
	AC(18, "AC", "AC"),

	/**
	 * The '<em><b>ACM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ACM
	 * <!-- end-model-doc -->
	 * @see #ACM_VALUE
	 * @generated
	 * @ordered
	 */
	ACM(19, "ACM", "ACM"),

	/**
	 * The '<em><b>ACD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ACD
	 * <!-- end-model-doc -->
	 * @see #ACD_VALUE
	 * @generated
	 * @ordered
	 */
	ACD(20, "ACD", "ACD"),

	/**
	 * The '<em><b>ACV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ACV
	 * <!-- end-model-doc -->
	 * @see #ACV_VALUE
	 * @generated
	 * @ordered
	 */
	ACV(21, "ACV", "ACV"),

	/**
	 * The '<em><b>PC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PC
	 * <!-- end-model-doc -->
	 * @see #PC_VALUE
	 * @generated
	 * @ordered
	 */
	PC(22, "PC", "PC"),

	/**
	 * The '<em><b>PCM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PCM
	 * <!-- end-model-doc -->
	 * @see #PCM_VALUE
	 * @generated
	 * @ordered
	 */
	PCM(23, "PCM", "PCM"),

	/**
	 * The '<em><b>PCD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PCD
	 * <!-- end-model-doc -->
	 * @see #PCD_VALUE
	 * @generated
	 * @ordered
	 */
	PCD(24, "PCD", "PCD"),

	/**
	 * The '<em><b>PCV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PCV
	 * <!-- end-model-doc -->
	 * @see #PCV_VALUE
	 * @generated
	 * @ordered
	 */
	PCV(25, "PCV", "PCV");

	/**
	 * The '<em><b>MORN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Morning
	 * <!-- end-model-doc -->
	 * @see #MORN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MORN_VALUE = 0;

	/**
	 * The '<em><b>MORN Early</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Early Morning
	 * <!-- end-model-doc -->
	 * @see #MORN_EARLY
	 * @model name="MORNEarly" literal="MORN.early"
	 * @generated
	 * @ordered
	 */
	public static final int MORN_EARLY_VALUE = 1;

	/**
	 * The '<em><b>MORN Late</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Late Morning
	 * <!-- end-model-doc -->
	 * @see #MORN_LATE
	 * @model name="MORNLate" literal="MORN.late"
	 * @generated
	 * @ordered
	 */
	public static final int MORN_LATE_VALUE = 2;

	/**
	 * The '<em><b>NOON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Noon
	 * <!-- end-model-doc -->
	 * @see #NOON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOON_VALUE = 3;

	/**
	 * The '<em><b>AFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Afternoon
	 * <!-- end-model-doc -->
	 * @see #AFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AFT_VALUE = 4;

	/**
	 * The '<em><b>AFT Early</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Early Afternoon
	 * <!-- end-model-doc -->
	 * @see #AFT_EARLY
	 * @model name="AFTEarly" literal="AFT.early"
	 * @generated
	 * @ordered
	 */
	public static final int AFT_EARLY_VALUE = 5;

	/**
	 * The '<em><b>AFT Late</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Late Afternoon
	 * <!-- end-model-doc -->
	 * @see #AFT_LATE
	 * @model name="AFTLate" literal="AFT.late"
	 * @generated
	 * @ordered
	 */
	public static final int AFT_LATE_VALUE = 6;

	/**
	 * The '<em><b>EVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Evening
	 * <!-- end-model-doc -->
	 * @see #EVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EVE_VALUE = 7;

	/**
	 * The '<em><b>EVE Early</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Early Evening
	 * <!-- end-model-doc -->
	 * @see #EVE_EARLY
	 * @model name="EVEEarly" literal="EVE.early"
	 * @generated
	 * @ordered
	 */
	public static final int EVE_EARLY_VALUE = 8;

	/**
	 * The '<em><b>EVE Late</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Late Evening
	 * <!-- end-model-doc -->
	 * @see #EVE_LATE
	 * @model name="EVELate" literal="EVE.late"
	 * @generated
	 * @ordered
	 */
	public static final int EVE_LATE_VALUE = 9;

	/**
	 * The '<em><b>NIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Night
	 * <!-- end-model-doc -->
	 * @see #NIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NIGHT_VALUE = 10;

	/**
	 * The '<em><b>PHS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * After Sleep
	 * <!-- end-model-doc -->
	 * @see #PHS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PHS_VALUE = 11;

	/**
	 * The '<em><b>HS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HS
	 * <!-- end-model-doc -->
	 * @see #HS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HS_VALUE = 12;

	/**
	 * The '<em><b>WAKE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * WAKE
	 * <!-- end-model-doc -->
	 * @see #WAKE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WAKE_VALUE = 13;

	/**
	 * The '<em><b>C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * C
	 * <!-- end-model-doc -->
	 * @see #C
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int C_VALUE = 14;

	/**
	 * The '<em><b>CM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CM
	 * <!-- end-model-doc -->
	 * @see #CM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CM_VALUE = 15;

	/**
	 * The '<em><b>CD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CD
	 * <!-- end-model-doc -->
	 * @see #CD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CD_VALUE = 16;

	/**
	 * The '<em><b>CV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CV
	 * <!-- end-model-doc -->
	 * @see #CV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CV_VALUE = 17;

	/**
	 * The '<em><b>AC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AC
	 * <!-- end-model-doc -->
	 * @see #AC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AC_VALUE = 18;

	/**
	 * The '<em><b>ACM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ACM
	 * <!-- end-model-doc -->
	 * @see #ACM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACM_VALUE = 19;

	/**
	 * The '<em><b>ACD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ACD
	 * <!-- end-model-doc -->
	 * @see #ACD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACD_VALUE = 20;

	/**
	 * The '<em><b>ACV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ACV
	 * <!-- end-model-doc -->
	 * @see #ACV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACV_VALUE = 21;

	/**
	 * The '<em><b>PC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PC
	 * <!-- end-model-doc -->
	 * @see #PC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PC_VALUE = 22;

	/**
	 * The '<em><b>PCM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PCM
	 * <!-- end-model-doc -->
	 * @see #PCM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PCM_VALUE = 23;

	/**
	 * The '<em><b>PCD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PCD
	 * <!-- end-model-doc -->
	 * @see #PCD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PCD_VALUE = 24;

	/**
	 * The '<em><b>PCV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PCV
	 * <!-- end-model-doc -->
	 * @see #PCV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PCV_VALUE = 25;

	/**
	 * An array of all the '<em><b>Event Timing List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EventTimingList[] VALUES_ARRAY =
		new EventTimingList[] {
			MORN,
			MORN_EARLY,
			MORN_LATE,
			NOON,
			AFT,
			AFT_EARLY,
			AFT_LATE,
			EVE,
			EVE_EARLY,
			EVE_LATE,
			NIGHT,
			PHS,
			HS,
			WAKE,
			C,
			CM,
			CD,
			CV,
			AC,
			ACM,
			ACD,
			ACV,
			PC,
			PCM,
			PCD,
			PCV,
		};

	/**
	 * A public read-only list of all the '<em><b>Event Timing List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EventTimingList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Event Timing List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EventTimingList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EventTimingList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Event Timing List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EventTimingList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EventTimingList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Event Timing List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EventTimingList get(int value) {
		switch (value) {
			case MORN_VALUE: return MORN;
			case MORN_EARLY_VALUE: return MORN_EARLY;
			case MORN_LATE_VALUE: return MORN_LATE;
			case NOON_VALUE: return NOON;
			case AFT_VALUE: return AFT;
			case AFT_EARLY_VALUE: return AFT_EARLY;
			case AFT_LATE_VALUE: return AFT_LATE;
			case EVE_VALUE: return EVE;
			case EVE_EARLY_VALUE: return EVE_EARLY;
			case EVE_LATE_VALUE: return EVE_LATE;
			case NIGHT_VALUE: return NIGHT;
			case PHS_VALUE: return PHS;
			case HS_VALUE: return HS;
			case WAKE_VALUE: return WAKE;
			case C_VALUE: return C;
			case CM_VALUE: return CM;
			case CD_VALUE: return CD;
			case CV_VALUE: return CV;
			case AC_VALUE: return AC;
			case ACM_VALUE: return ACM;
			case ACD_VALUE: return ACD;
			case ACV_VALUE: return ACV;
			case PC_VALUE: return PC;
			case PCM_VALUE: return PCM;
			case PCD_VALUE: return PCD;
			case PCV_VALUE: return PCV;
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
	private EventTimingList(int value, String name, String literal) {
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
	
} //EventTimingList
