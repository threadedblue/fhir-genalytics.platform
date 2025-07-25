/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Invoice containing collected ChargeItems from an Account with calculated individual and total price for Billing purpose.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Invoice#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Invoice#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Invoice#getCancelledReason <em>Cancelled Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.Invoice#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Invoice#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.Invoice#getRecipient <em>Recipient</em>}</li>
 *   <li>{@link org.hl7.fhir.Invoice#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.Invoice#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.hl7.fhir.Invoice#getIssuer <em>Issuer</em>}</li>
 *   <li>{@link org.hl7.fhir.Invoice#getAccount <em>Account</em>}</li>
 *   <li>{@link org.hl7.fhir.Invoice#getLineItem <em>Line Item</em>}</li>
 *   <li>{@link org.hl7.fhir.Invoice#getTotalPriceComponent <em>Total Price Component</em>}</li>
 *   <li>{@link org.hl7.fhir.Invoice#getTotalNet <em>Total Net</em>}</li>
 *   <li>{@link org.hl7.fhir.Invoice#getTotalGross <em>Total Gross</em>}</li>
 *   <li>{@link org.hl7.fhir.Invoice#getPaymentTerms <em>Payment Terms</em>}</li>
 *   <li>{@link org.hl7.fhir.Invoice#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getInvoice()
 * @model extendedMetaData="name='Invoice' kind='elementOnly'"
 * @generated
 */
public interface Invoice extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier of this Invoice, often used for reference in correspondence about this invoice or for tracking of payments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getInvoice_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current state of the Invoice.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(InvoiceStatus)
	 * @see org.hl7.fhir.FhirPackage#getInvoice_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	InvoiceStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Invoice#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(InvoiceStatus value);

	/**
	 * Returns the value of the '<em><b>Cancelled Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In case of Invoice cancellation a reason must be given (entered in error, superseded by corrected invoice etc.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cancelled Reason</em>' containment reference.
	 * @see #setCancelledReason(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getInvoice_CancelledReason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cancelledReason' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getCancelledReason();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Invoice#getCancelledReason <em>Cancelled Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancelled Reason</em>' containment reference.
	 * @see #getCancelledReason()
	 * @generated
	 */
	void setCancelledReason(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of Invoice depending on domain, realm an usage (e.g. internal/external, dental, preliminary).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getInvoice_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Invoice#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The individual or set of individuals receiving the goods and services billed in this invoice.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getInvoice_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Invoice#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Recipient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The individual or Organization responsible for balancing of this invoice.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recipient</em>' containment reference.
	 * @see #setRecipient(Reference)
	 * @see org.hl7.fhir.FhirPackage#getInvoice_Recipient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='recipient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRecipient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Invoice#getRecipient <em>Recipient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recipient</em>' containment reference.
	 * @see #getRecipient()
	 * @generated
	 */
	void setRecipient(Reference value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date/time(s) of when this Invoice was posted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getInvoice_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Invoice#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Participant</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.InvoiceParticipant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates who or what performed or participated in the charged service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participant</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getInvoice_Participant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='participant' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InvoiceParticipant> getParticipant();

	/**
	 * Returns the value of the '<em><b>Issuer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organizationissuing the Invoice.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issuer</em>' containment reference.
	 * @see #setIssuer(Reference)
	 * @see org.hl7.fhir.FhirPackage#getInvoice_Issuer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='issuer' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getIssuer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Invoice#getIssuer <em>Issuer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issuer</em>' containment reference.
	 * @see #getIssuer()
	 * @generated
	 */
	void setIssuer(Reference value);

	/**
	 * Returns the value of the '<em><b>Account</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Account which is supposed to be balanced with this Invoice.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Account</em>' containment reference.
	 * @see #setAccount(Reference)
	 * @see org.hl7.fhir.FhirPackage#getInvoice_Account()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='account' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAccount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Invoice#getAccount <em>Account</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account</em>' containment reference.
	 * @see #getAccount()
	 * @generated
	 */
	void setAccount(Reference value);

	/**
	 * Returns the value of the '<em><b>Line Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.InvoiceLineItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each line item represents one charge for goods and services rendered. Details such as date, code and amount are found in the referenced ChargeItem resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line Item</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getInvoice_LineItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lineItem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InvoiceLineItem> getLineItem();

	/**
	 * Returns the value of the '<em><b>Total Price Component</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.InvoicePriceComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total amount for the Invoice may be calculated as the sum of the line items with surcharges/deductions that apply in certain conditions.  The priceComponent element can be used to offer transparency to the recipient of the Invoice of how the total price was calculated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Price Component</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getInvoice_TotalPriceComponent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='totalPriceComponent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InvoicePriceComponent> getTotalPriceComponent();

	/**
	 * Returns the value of the '<em><b>Total Net</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Invoice total , taxes excluded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Net</em>' containment reference.
	 * @see #setTotalNet(Money)
	 * @see org.hl7.fhir.FhirPackage#getInvoice_TotalNet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='totalNet' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getTotalNet();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Invoice#getTotalNet <em>Total Net</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Net</em>' containment reference.
	 * @see #getTotalNet()
	 * @generated
	 */
	void setTotalNet(Money value);

	/**
	 * Returns the value of the '<em><b>Total Gross</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Invoice total, tax included.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Gross</em>' containment reference.
	 * @see #setTotalGross(Money)
	 * @see org.hl7.fhir.FhirPackage#getInvoice_TotalGross()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='totalGross' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getTotalGross();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Invoice#getTotalGross <em>Total Gross</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Gross</em>' containment reference.
	 * @see #getTotalGross()
	 * @generated
	 */
	void setTotalGross(Money value);

	/**
	 * Returns the value of the '<em><b>Payment Terms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Payment details such as banking details, period of payment, deductibles, methods of payment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Terms</em>' containment reference.
	 * @see #setPaymentTerms(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getInvoice_PaymentTerms()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='paymentTerms' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getPaymentTerms();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Invoice#getPaymentTerms <em>Payment Terms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Terms</em>' containment reference.
	 * @see #getPaymentTerms()
	 * @generated
	 */
	void setPaymentTerms(Markdown value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Comments made about the invoice by the issuer, subject, or other participants.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getInvoice_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

} // Invoice
