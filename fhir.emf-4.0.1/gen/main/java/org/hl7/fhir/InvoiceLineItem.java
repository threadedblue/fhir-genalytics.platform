/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoice Line Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Invoice containing collected ChargeItems from an Account with calculated individual and total price for Billing purpose.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.InvoiceLineItem#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.InvoiceLineItem#getChargeItemReference <em>Charge Item Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.InvoiceLineItem#getChargeItemCodeableConcept <em>Charge Item Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.InvoiceLineItem#getPriceComponent <em>Price Component</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getInvoiceLineItem()
 * @model extendedMetaData="name='Invoice.LineItem' kind='elementOnly'"
 * @generated
 */
public interface InvoiceLineItem extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sequence in which the items appear on the invoice.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getInvoiceLineItem_Sequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getSequence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InvoiceLineItem#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Charge Item Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ChargeItem contains information such as the billing code, date, amount etc. If no further details are required for the lineItem, inline billing codes can be added using the CodeableConcept data type instead of the Reference. (choose any one of chargeItem*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Charge Item Reference</em>' containment reference.
	 * @see #setChargeItemReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getInvoiceLineItem_ChargeItemReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='chargeItemReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getChargeItemReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InvoiceLineItem#getChargeItemReference <em>Charge Item Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge Item Reference</em>' containment reference.
	 * @see #getChargeItemReference()
	 * @generated
	 */
	void setChargeItemReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Charge Item Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ChargeItem contains information such as the billing code, date, amount etc. If no further details are required for the lineItem, inline billing codes can be added using the CodeableConcept data type instead of the Reference. (choose any one of chargeItem*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Charge Item Codeable Concept</em>' containment reference.
	 * @see #setChargeItemCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getInvoiceLineItem_ChargeItemCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='chargeItemCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getChargeItemCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InvoiceLineItem#getChargeItemCodeableConcept <em>Charge Item Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge Item Codeable Concept</em>' containment reference.
	 * @see #getChargeItemCodeableConcept()
	 * @generated
	 */
	void setChargeItemCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Price Component</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.InvoicePriceComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The price for a ChargeItem may be calculated as a base price with surcharges/deductions that apply in certain conditions. A ChargeItemDefinition resource that defines the prices, factors and conditions that apply to a billing code is currently under development. The priceComponent element can be used to offer transparency to the recipient of the Invoice as to how the prices have been calculated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Price Component</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getInvoiceLineItem_PriceComponent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='priceComponent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InvoicePriceComponent> getPriceComponent();

} // InvoiceLineItem
