/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Charge Item Definition Property Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ChargeItemDefinition resource provides the properties that apply to the (billing) codes necessary to calculate costs and prices. The properties may differ largely depending on type and realm, therefore this resource gives only a rough structure and requires profiling for each type of billing code system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ChargeItemDefinitionPropertyGroup#getApplicability <em>Applicability</em>}</li>
 *   <li>{@link org.hl7.fhir.ChargeItemDefinitionPropertyGroup#getPriceComponent <em>Price Component</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getChargeItemDefinitionPropertyGroup()
 * @model extendedMetaData="name='ChargeItemDefinition.PropertyGroup' kind='elementOnly'"
 * @generated
 */
public interface ChargeItemDefinitionPropertyGroup extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Applicability</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ChargeItemDefinitionApplicability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Expressions that describe applicability criteria for the priceComponent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applicability</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getChargeItemDefinitionPropertyGroup_Applicability()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='applicability' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ChargeItemDefinitionApplicability> getApplicability();

	/**
	 * Returns the value of the '<em><b>Price Component</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ChargeItemDefinitionPriceComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The price for a ChargeItem may be calculated as a base price with surcharges/deductions that apply in certain conditions. A ChargeItemDefinition resource that defines the prices, factors and conditions that apply to a billing code is currently under development. The priceComponent element can be used to offer transparency to the recipient of the Invoice of how the prices have been calculated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Price Component</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getChargeItemDefinitionPropertyGroup_PriceComponent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='priceComponent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ChargeItemDefinitionPriceComponent> getPriceComponent();

} // ChargeItemDefinitionPropertyGroup
