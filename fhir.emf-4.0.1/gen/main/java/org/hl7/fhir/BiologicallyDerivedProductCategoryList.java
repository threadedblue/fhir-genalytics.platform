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
 * A representation of the literals of the enumeration '<em><b>Biologically Derived Product Category List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProductCategoryList()
 * @model extendedMetaData="name='BiologicallyDerivedProductCategory-list'"
 * @generated
 */
public enum BiologicallyDerivedProductCategoryList implements Enumerator {
	/**
	 * The '<em><b>Organ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Organ
	 * <!-- end-model-doc -->
	 * @see #ORGAN_VALUE
	 * @generated
	 * @ordered
	 */
	ORGAN(0, "organ", "organ"),

	/**
	 * The '<em><b>Tissue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tissue
	 * <!-- end-model-doc -->
	 * @see #TISSUE_VALUE
	 * @generated
	 * @ordered
	 */
	TISSUE(1, "tissue", "tissue"),

	/**
	 * The '<em><b>Fluid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fluid
	 * <!-- end-model-doc -->
	 * @see #FLUID_VALUE
	 * @generated
	 * @ordered
	 */
	FLUID(2, "fluid", "fluid"),

	/**
	 * The '<em><b>Cells</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cells
	 * <!-- end-model-doc -->
	 * @see #CELLS_VALUE
	 * @generated
	 * @ordered
	 */
	CELLS(3, "cells", "cells"),

	/**
	 * The '<em><b>Biological Agent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BiologicalAgent
	 * <!-- end-model-doc -->
	 * @see #BIOLOGICAL_AGENT_VALUE
	 * @generated
	 * @ordered
	 */
	BIOLOGICAL_AGENT(4, "biologicalAgent", "biologicalAgent");

	/**
	 * The '<em><b>Organ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Organ
	 * <!-- end-model-doc -->
	 * @see #ORGAN
	 * @model name="organ"
	 * @generated
	 * @ordered
	 */
	public static final int ORGAN_VALUE = 0;

	/**
	 * The '<em><b>Tissue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tissue
	 * <!-- end-model-doc -->
	 * @see #TISSUE
	 * @model name="tissue"
	 * @generated
	 * @ordered
	 */
	public static final int TISSUE_VALUE = 1;

	/**
	 * The '<em><b>Fluid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fluid
	 * <!-- end-model-doc -->
	 * @see #FLUID
	 * @model name="fluid"
	 * @generated
	 * @ordered
	 */
	public static final int FLUID_VALUE = 2;

	/**
	 * The '<em><b>Cells</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cells
	 * <!-- end-model-doc -->
	 * @see #CELLS
	 * @model name="cells"
	 * @generated
	 * @ordered
	 */
	public static final int CELLS_VALUE = 3;

	/**
	 * The '<em><b>Biological Agent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BiologicalAgent
	 * <!-- end-model-doc -->
	 * @see #BIOLOGICAL_AGENT
	 * @model name="biologicalAgent"
	 * @generated
	 * @ordered
	 */
	public static final int BIOLOGICAL_AGENT_VALUE = 4;

	/**
	 * An array of all the '<em><b>Biologically Derived Product Category List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BiologicallyDerivedProductCategoryList[] VALUES_ARRAY =
		new BiologicallyDerivedProductCategoryList[] {
			ORGAN,
			TISSUE,
			FLUID,
			CELLS,
			BIOLOGICAL_AGENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Biologically Derived Product Category List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BiologicallyDerivedProductCategoryList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Biologically Derived Product Category List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BiologicallyDerivedProductCategoryList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BiologicallyDerivedProductCategoryList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Biologically Derived Product Category List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BiologicallyDerivedProductCategoryList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BiologicallyDerivedProductCategoryList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Biologically Derived Product Category List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BiologicallyDerivedProductCategoryList get(int value) {
		switch (value) {
			case ORGAN_VALUE: return ORGAN;
			case TISSUE_VALUE: return TISSUE;
			case FLUID_VALUE: return FLUID;
			case CELLS_VALUE: return CELLS;
			case BIOLOGICAL_AGENT_VALUE: return BIOLOGICAL_AGENT;
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
	private BiologicallyDerivedProductCategoryList(int value, String name, String literal) {
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
	
} //BiologicallyDerivedProductCategoryList
