/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Reconciliation Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides the details including amount of a payment and allocates the payment items being paid.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationDetail#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationDetail#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationDetail#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationDetail#getRequest <em>Request</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationDetail#getSubmitter <em>Submitter</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationDetail#getResponse <em>Response</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationDetail#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationDetail#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationDetail#getPayee <em>Payee</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationDetail#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationDetail()
 * @model extendedMetaData="name='PaymentReconciliation.Detail' kind='elementOnly'"
 * @generated
 */
public interface PaymentReconciliationDetail extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique identifier for the current payment item for the referenced payable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationDetail_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationDetail#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Predecessor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique identifier for the prior payment item for the referenced payable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Predecessor</em>' containment reference.
	 * @see #setPredecessor(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationDetail_Predecessor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='predecessor' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getPredecessor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationDetail#getPredecessor <em>Predecessor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predecessor</em>' containment reference.
	 * @see #getPredecessor()
	 * @generated
	 */
	void setPredecessor(Identifier value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code to indicate the nature of the payment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationDetail_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationDetail#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A resource, such as a Claim, the evaluation of which could lead to payment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request</em>' containment reference.
	 * @see #setRequest(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationDetail_Request()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='request' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRequest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationDetail#getRequest <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' containment reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(Reference value);

	/**
	 * Returns the value of the '<em><b>Submitter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The party which submitted the claim or financial transaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Submitter</em>' containment reference.
	 * @see #setSubmitter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationDetail_Submitter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='submitter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubmitter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationDetail#getSubmitter <em>Submitter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submitter</em>' containment reference.
	 * @see #getSubmitter()
	 * @generated
	 */
	void setSubmitter(Reference value);

	/**
	 * Returns the value of the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A resource, such as a ClaimResponse, which contains a commitment to payment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Response</em>' containment reference.
	 * @see #setResponse(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationDetail_Response()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='response' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getResponse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationDetail#getResponse <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' containment reference.
	 * @see #getResponse()
	 * @generated
	 */
	void setResponse(Reference value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date from the response resource containing a commitment to pay.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationDetail_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationDetail#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Responsible</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the individual who is responsible for inquiries regarding the response and its payment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Responsible</em>' containment reference.
	 * @see #setResponsible(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationDetail_Responsible()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='responsible' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getResponsible();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationDetail#getResponsible <em>Responsible</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible</em>' containment reference.
	 * @see #getResponsible()
	 * @generated
	 */
	void setResponsible(Reference value);

	/**
	 * Returns the value of the '<em><b>Payee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The party which is receiving the payment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payee</em>' containment reference.
	 * @see #setPayee(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationDetail_Payee()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='payee' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPayee();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationDetail#getPayee <em>Payee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payee</em>' containment reference.
	 * @see #getPayee()
	 * @generated
	 */
	void setPayee(Reference value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The monetary amount allocated from the total payment to the payable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount</em>' containment reference.
	 * @see #setAmount(Money)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationDetail_Amount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amount' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getAmount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationDetail#getAmount <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' containment reference.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(Money value);

} // PaymentReconciliationDetail
