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
 * A representation of the literals of the enumeration '<em><b>Guide Parameter Code List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getGuideParameterCodeList()
 * @model extendedMetaData="name='GuideParameterCode-list'"
 * @generated
 */
public enum GuideParameterCodeList implements Enumerator {
	/**
	 * The '<em><b>Apply</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Apply Metadata Value
	 * <!-- end-model-doc -->
	 * @see #APPLY_VALUE
	 * @generated
	 * @ordered
	 */
	APPLY(0, "apply", "apply"),

	/**
	 * The '<em><b>Path Resource</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resource Path
	 * <!-- end-model-doc -->
	 * @see #PATH_RESOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	PATH_RESOURCE(1, "pathResource", "path-resource"),

	/**
	 * The '<em><b>Path Pages</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pages Path
	 * <!-- end-model-doc -->
	 * @see #PATH_PAGES_VALUE
	 * @generated
	 * @ordered
	 */
	PATH_PAGES(2, "pathPages", "path-pages"),

	/**
	 * The '<em><b>Path Tx Cache</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Terminology Cache Path
	 * <!-- end-model-doc -->
	 * @see #PATH_TX_CACHE_VALUE
	 * @generated
	 * @ordered
	 */
	PATH_TX_CACHE(3, "pathTxCache", "path-tx-cache"),

	/**
	 * The '<em><b>Expansion Parameter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Expansion Profile
	 * <!-- end-model-doc -->
	 * @see #EXPANSION_PARAMETER_VALUE
	 * @generated
	 * @ordered
	 */
	EXPANSION_PARAMETER(4, "expansionParameter", "expansion-parameter"),

	/**
	 * The '<em><b>Rule Broken Links</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Broken Links Rule
	 * <!-- end-model-doc -->
	 * @see #RULE_BROKEN_LINKS_VALUE
	 * @generated
	 * @ordered
	 */
	RULE_BROKEN_LINKS(5, "ruleBrokenLinks", "rule-broken-links"),

	/**
	 * The '<em><b>Generate Xml</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generate XML
	 * <!-- end-model-doc -->
	 * @see #GENERATE_XML_VALUE
	 * @generated
	 * @ordered
	 */
	GENERATE_XML(6, "generateXml", "generate-xml"),

	/**
	 * The '<em><b>Generate Json</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generate JSON
	 * <!-- end-model-doc -->
	 * @see #GENERATE_JSON_VALUE
	 * @generated
	 * @ordered
	 */
	GENERATE_JSON(7, "generateJson", "generate-json"),

	/**
	 * The '<em><b>Generate Turtle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generate Turtle
	 * <!-- end-model-doc -->
	 * @see #GENERATE_TURTLE_VALUE
	 * @generated
	 * @ordered
	 */
	GENERATE_TURTLE(8, "generateTurtle", "generate-turtle"),

	/**
	 * The '<em><b>Html Template</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HTML Template
	 * <!-- end-model-doc -->
	 * @see #HTML_TEMPLATE_VALUE
	 * @generated
	 * @ordered
	 */
	HTML_TEMPLATE(9, "htmlTemplate", "html-template");

	/**
	 * The '<em><b>Apply</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Apply Metadata Value
	 * <!-- end-model-doc -->
	 * @see #APPLY
	 * @model name="apply"
	 * @generated
	 * @ordered
	 */
	public static final int APPLY_VALUE = 0;

	/**
	 * The '<em><b>Path Resource</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resource Path
	 * <!-- end-model-doc -->
	 * @see #PATH_RESOURCE
	 * @model name="pathResource" literal="path-resource"
	 * @generated
	 * @ordered
	 */
	public static final int PATH_RESOURCE_VALUE = 1;

	/**
	 * The '<em><b>Path Pages</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pages Path
	 * <!-- end-model-doc -->
	 * @see #PATH_PAGES
	 * @model name="pathPages" literal="path-pages"
	 * @generated
	 * @ordered
	 */
	public static final int PATH_PAGES_VALUE = 2;

	/**
	 * The '<em><b>Path Tx Cache</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Terminology Cache Path
	 * <!-- end-model-doc -->
	 * @see #PATH_TX_CACHE
	 * @model name="pathTxCache" literal="path-tx-cache"
	 * @generated
	 * @ordered
	 */
	public static final int PATH_TX_CACHE_VALUE = 3;

	/**
	 * The '<em><b>Expansion Parameter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Expansion Profile
	 * <!-- end-model-doc -->
	 * @see #EXPANSION_PARAMETER
	 * @model name="expansionParameter" literal="expansion-parameter"
	 * @generated
	 * @ordered
	 */
	public static final int EXPANSION_PARAMETER_VALUE = 4;

	/**
	 * The '<em><b>Rule Broken Links</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Broken Links Rule
	 * <!-- end-model-doc -->
	 * @see #RULE_BROKEN_LINKS
	 * @model name="ruleBrokenLinks" literal="rule-broken-links"
	 * @generated
	 * @ordered
	 */
	public static final int RULE_BROKEN_LINKS_VALUE = 5;

	/**
	 * The '<em><b>Generate Xml</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generate XML
	 * <!-- end-model-doc -->
	 * @see #GENERATE_XML
	 * @model name="generateXml" literal="generate-xml"
	 * @generated
	 * @ordered
	 */
	public static final int GENERATE_XML_VALUE = 6;

	/**
	 * The '<em><b>Generate Json</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generate JSON
	 * <!-- end-model-doc -->
	 * @see #GENERATE_JSON
	 * @model name="generateJson" literal="generate-json"
	 * @generated
	 * @ordered
	 */
	public static final int GENERATE_JSON_VALUE = 7;

	/**
	 * The '<em><b>Generate Turtle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generate Turtle
	 * <!-- end-model-doc -->
	 * @see #GENERATE_TURTLE
	 * @model name="generateTurtle" literal="generate-turtle"
	 * @generated
	 * @ordered
	 */
	public static final int GENERATE_TURTLE_VALUE = 8;

	/**
	 * The '<em><b>Html Template</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HTML Template
	 * <!-- end-model-doc -->
	 * @see #HTML_TEMPLATE
	 * @model name="htmlTemplate" literal="html-template"
	 * @generated
	 * @ordered
	 */
	public static final int HTML_TEMPLATE_VALUE = 9;

	/**
	 * An array of all the '<em><b>Guide Parameter Code List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GuideParameterCodeList[] VALUES_ARRAY =
		new GuideParameterCodeList[] {
			APPLY,
			PATH_RESOURCE,
			PATH_PAGES,
			PATH_TX_CACHE,
			EXPANSION_PARAMETER,
			RULE_BROKEN_LINKS,
			GENERATE_XML,
			GENERATE_JSON,
			GENERATE_TURTLE,
			HTML_TEMPLATE,
		};

	/**
	 * A public read-only list of all the '<em><b>Guide Parameter Code List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GuideParameterCodeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Guide Parameter Code List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GuideParameterCodeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GuideParameterCodeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Guide Parameter Code List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GuideParameterCodeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GuideParameterCodeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Guide Parameter Code List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GuideParameterCodeList get(int value) {
		switch (value) {
			case APPLY_VALUE: return APPLY;
			case PATH_RESOURCE_VALUE: return PATH_RESOURCE;
			case PATH_PAGES_VALUE: return PATH_PAGES;
			case PATH_TX_CACHE_VALUE: return PATH_TX_CACHE;
			case EXPANSION_PARAMETER_VALUE: return EXPANSION_PARAMETER;
			case RULE_BROKEN_LINKS_VALUE: return RULE_BROKEN_LINKS;
			case GENERATE_XML_VALUE: return GENERATE_XML;
			case GENERATE_JSON_VALUE: return GENERATE_JSON;
			case GENERATE_TURTLE_VALUE: return GENERATE_TURTLE;
			case HTML_TEMPLATE_VALUE: return HTML_TEMPLATE;
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
	private GuideParameterCodeList(int value, String name, String literal) {
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
	
} //GuideParameterCodeList
