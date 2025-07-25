/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Reconciliation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides the details including amount of a payment and allocates the payment items being paid.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.PaymentReconciliation#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliation#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliation#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliation#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliation#getPaymentIssuer <em>Payment Issuer</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliation#getRequest <em>Request</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliation#getRequestor <em>Requestor</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliation#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliation#getDisposition <em>Disposition</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliation#getPaymentDate <em>Payment Date</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliation#getPaymentAmount <em>Payment Amount</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliation#getPaymentIdentifier <em>Payment Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliation#getDetail <em>Detail</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliation#getFormCode <em>Form Code</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliation#getProcessNote <em>Process Note</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation()
 * @model extendedMetaData="name='PaymentReconciliation' kind='elementOnly'"
 * @generated
 */
public interface PaymentReconciliation extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier assigned to this payment reconciliation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation_Identifier()
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
	 * The status of the resource instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(FinancialResourceStatusCodes)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	FinancialResourceStatusCodes getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliation#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(FinancialResourceStatusCodes value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The period of time for which payments have been gathered into this bulk payment for settlement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliation#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Created</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date when the resource was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Created</em>' containment reference.
	 * @see #setCreated(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation_Created()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='created' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getCreated();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliation#getCreated <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' containment reference.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(DateTime value);

	/**
	 * Returns the value of the '<em><b>Payment Issuer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The party who generated the payment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Issuer</em>' containment reference.
	 * @see #setPaymentIssuer(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation_PaymentIssuer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='paymentIssuer' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPaymentIssuer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliation#getPaymentIssuer <em>Payment Issuer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Issuer</em>' containment reference.
	 * @see #getPaymentIssuer()
	 * @generated
	 */
	void setPaymentIssuer(Reference value);

	/**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Original request resource reference.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request</em>' containment reference.
	 * @see #setRequest(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation_Request()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='request' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRequest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliation#getRequest <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' containment reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(Reference value);

	/**
	 * Returns the value of the '<em><b>Requestor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The practitioner who is responsible for the services rendered to the patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requestor</em>' containment reference.
	 * @see #setRequestor(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation_Requestor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requestor' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRequestor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliation#getRequestor <em>Requestor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requestor</em>' containment reference.
	 * @see #getRequestor()
	 * @generated
	 */
	void setRequestor(Reference value);

	/**
	 * Returns the value of the '<em><b>Outcome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The outcome of a request for a reconciliation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outcome</em>' containment reference.
	 * @see #setOutcome(RemittanceOutcome)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation_Outcome()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outcome' namespace='##targetNamespace'"
	 * @generated
	 */
	RemittanceOutcome getOutcome();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliation#getOutcome <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcome</em>' containment reference.
	 * @see #getOutcome()
	 * @generated
	 */
	void setOutcome(RemittanceOutcome value);

	/**
	 * Returns the value of the '<em><b>Disposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human readable description of the status of the request for the reconciliation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disposition</em>' containment reference.
	 * @see #setDisposition(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation_Disposition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='disposition' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDisposition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliation#getDisposition <em>Disposition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disposition</em>' containment reference.
	 * @see #getDisposition()
	 * @generated
	 */
	void setDisposition(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Payment Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date of payment as indicated on the financial instrument.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Date</em>' containment reference.
	 * @see #setPaymentDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation_PaymentDate()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='paymentDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getPaymentDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliation#getPaymentDate <em>Payment Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Date</em>' containment reference.
	 * @see #getPaymentDate()
	 * @generated
	 */
	void setPaymentDate(Date value);

	/**
	 * Returns the value of the '<em><b>Payment Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Total payment amount as indicated on the financial instrument.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Amount</em>' containment reference.
	 * @see #setPaymentAmount(Money)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation_PaymentAmount()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='paymentAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getPaymentAmount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliation#getPaymentAmount <em>Payment Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Amount</em>' containment reference.
	 * @see #getPaymentAmount()
	 * @generated
	 */
	void setPaymentAmount(Money value);

	/**
	 * Returns the value of the '<em><b>Payment Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Issuer's unique identifier for the payment instrument.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Identifier</em>' containment reference.
	 * @see #setPaymentIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation_PaymentIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='paymentIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getPaymentIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliation#getPaymentIdentifier <em>Payment Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Identifier</em>' containment reference.
	 * @see #getPaymentIdentifier()
	 * @generated
	 */
	void setPaymentIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PaymentReconciliationDetail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Distribution of the payment amount for a previously acknowledged payable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detail</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation_Detail()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='detail' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PaymentReconciliationDetail> getDetail();

	/**
	 * Returns the value of the '<em><b>Form Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code for the form to be used for printing the content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Form Code</em>' containment reference.
	 * @see #setFormCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation_FormCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='formCode' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getFormCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliation#getFormCode <em>Form Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form Code</em>' containment reference.
	 * @see #getFormCode()
	 * @generated
	 */
	void setFormCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Process Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PaymentReconciliationProcessNote}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A note that describes or explains the processing in a human readable form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Process Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliation_ProcessNote()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='processNote' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PaymentReconciliationProcessNote> getProcessNote();

} // PaymentReconciliation
