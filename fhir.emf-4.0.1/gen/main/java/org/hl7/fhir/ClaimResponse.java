/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides the adjudication details from the processing of a Claim resource.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getUse <em>Use</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getInsurer <em>Insurer</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getRequestor <em>Requestor</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getRequest <em>Request</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getDisposition <em>Disposition</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getPreAuthRef <em>Pre Auth Ref</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getPreAuthPeriod <em>Pre Auth Period</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getPayeeType <em>Payee Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getItem <em>Item</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getAddItem <em>Add Item</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getAdjudication <em>Adjudication</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getTotal <em>Total</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getPayment <em>Payment</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getFundsReserve <em>Funds Reserve</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getFormCode <em>Form Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getForm <em>Form</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getProcessNote <em>Process Note</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getCommunicationRequest <em>Communication Request</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getInsurance <em>Insurance</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponse#getError <em>Error</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getClaimResponse()
 * @model extendedMetaData="name='ClaimResponse' kind='elementOnly'"
 * @generated
 */
public interface ClaimResponse extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier assigned to this claim response.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_Identifier()
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
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	FinancialResourceStatusCodes getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(FinancialResourceStatusCodes value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A finer grained suite of claim type codes which may convey additional information such as Inpatient vs Outpatient and/or a specialty service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Sub Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A finer grained suite of claim type codes which may convey additional information such as Inpatient vs Outpatient and/or a specialty service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Type</em>' containment reference.
	 * @see #setSubType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_SubType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSubType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getSubType <em>Sub Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Type</em>' containment reference.
	 * @see #getSubType()
	 * @generated
	 */
	void setSubType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code to indicate whether the nature of the request is: to request adjudication of products and services previously rendered; or requesting authorization and adjudication for provision in the future; or requesting the non-binding adjudication of the listed products and services which could be provided in the future.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use</em>' containment reference.
	 * @see #setUse(Use)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_Use()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='use' namespace='##targetNamespace'"
	 * @generated
	 */
	Use getUse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getUse <em>Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use</em>' containment reference.
	 * @see #getUse()
	 * @generated
	 */
	void setUse(Use value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The party to whom the professional services and/or products have been supplied or are being considered and for whom actual for facast reimbursement is sought.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_Patient()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Created</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date this resource was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Created</em>' containment reference.
	 * @see #setCreated(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_Created()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='created' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getCreated();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getCreated <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' containment reference.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(DateTime value);

	/**
	 * Returns the value of the '<em><b>Insurer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The party responsible for authorization, adjudication and reimbursement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insurer</em>' containment reference.
	 * @see #setInsurer(Reference)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_Insurer()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='insurer' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getInsurer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getInsurer <em>Insurer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insurer</em>' containment reference.
	 * @see #getInsurer()
	 * @generated
	 */
	void setInsurer(Reference value);

	/**
	 * Returns the value of the '<em><b>Requestor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The provider which is responsible for the claim, predetermination or preauthorization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requestor</em>' containment reference.
	 * @see #setRequestor(Reference)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_Requestor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requestor' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRequestor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getRequestor <em>Requestor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requestor</em>' containment reference.
	 * @see #getRequestor()
	 * @generated
	 */
	void setRequestor(Reference value);

	/**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Original request resource reference.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request</em>' containment reference.
	 * @see #setRequest(Reference)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_Request()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='request' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRequest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getRequest <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' containment reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(Reference value);

	/**
	 * Returns the value of the '<em><b>Outcome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The outcome of the claim, predetermination, or preauthorization processing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outcome</em>' containment reference.
	 * @see #setOutcome(ClaimProcessingCodes)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_Outcome()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='outcome' namespace='##targetNamespace'"
	 * @generated
	 */
	ClaimProcessingCodes getOutcome();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getOutcome <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcome</em>' containment reference.
	 * @see #getOutcome()
	 * @generated
	 */
	void setOutcome(ClaimProcessingCodes value);

	/**
	 * Returns the value of the '<em><b>Disposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human readable description of the status of the adjudication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disposition</em>' containment reference.
	 * @see #setDisposition(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_Disposition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='disposition' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDisposition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getDisposition <em>Disposition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disposition</em>' containment reference.
	 * @see #getDisposition()
	 * @generated
	 */
	void setDisposition(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Pre Auth Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference from the Insurer which is used in later communications which refers to this adjudication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pre Auth Ref</em>' containment reference.
	 * @see #setPreAuthRef(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_PreAuthRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='preAuthRef' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPreAuthRef();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getPreAuthRef <em>Pre Auth Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Auth Ref</em>' containment reference.
	 * @see #getPreAuthRef()
	 * @generated
	 */
	void setPreAuthRef(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Pre Auth Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time frame during which this authorization is effective.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pre Auth Period</em>' containment reference.
	 * @see #setPreAuthPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_PreAuthPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='preAuthPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPreAuthPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getPreAuthPeriod <em>Pre Auth Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Auth Period</em>' containment reference.
	 * @see #getPreAuthPeriod()
	 * @generated
	 */
	void setPreAuthPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Payee Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of Party to be reimbursed: subscriber, provider, other.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payee Type</em>' containment reference.
	 * @see #setPayeeType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_PayeeType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='payeeType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getPayeeType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getPayeeType <em>Payee Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payee Type</em>' containment reference.
	 * @see #getPayeeType()
	 * @generated
	 */
	void setPayeeType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ClaimResponseItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A claim line. Either a simple (a product or service) or a 'group' of details which can also be a simple items or groups of sub-details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_Item()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='item' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClaimResponseItem> getItem();

	/**
	 * Returns the value of the '<em><b>Add Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ClaimResponseAddItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The first-tier service adjudications for payor added product or service lines.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Add Item</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_AddItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='addItem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClaimResponseAddItem> getAddItem();

	/**
	 * Returns the value of the '<em><b>Adjudication</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ClaimResponseAdjudication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The adjudication results which are presented at the header level rather than at the line-item or add-item levels.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adjudication</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_Adjudication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='adjudication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClaimResponseAdjudication> getAdjudication();

	/**
	 * Returns the value of the '<em><b>Total</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ClaimResponseTotal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Categorized monetary totals for the adjudication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_Total()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='total' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClaimResponseTotal> getTotal();

	/**
	 * Returns the value of the '<em><b>Payment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Payment details for the adjudication of the claim.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment</em>' containment reference.
	 * @see #setPayment(ClaimResponsePayment)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_Payment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='payment' namespace='##targetNamespace'"
	 * @generated
	 */
	ClaimResponsePayment getPayment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getPayment <em>Payment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment</em>' containment reference.
	 * @see #getPayment()
	 * @generated
	 */
	void setPayment(ClaimResponsePayment value);

	/**
	 * Returns the value of the '<em><b>Funds Reserve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code, used only on a response to a preauthorization, to indicate whether the benefits payable have been reserved and for whom.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Funds Reserve</em>' containment reference.
	 * @see #setFundsReserve(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_FundsReserve()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fundsReserve' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getFundsReserve();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getFundsReserve <em>Funds Reserve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Funds Reserve</em>' containment reference.
	 * @see #getFundsReserve()
	 * @generated
	 */
	void setFundsReserve(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Form Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code for the form to be used for printing the content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Form Code</em>' containment reference.
	 * @see #setFormCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_FormCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='formCode' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getFormCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getFormCode <em>Form Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form Code</em>' containment reference.
	 * @see #getFormCode()
	 * @generated
	 */
	void setFormCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual form, by reference or inclusion, for printing the content or an EOB.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Form</em>' containment reference.
	 * @see #setForm(Attachment)
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_Form()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='form' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getForm();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponse#getForm <em>Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form</em>' containment reference.
	 * @see #getForm()
	 * @generated
	 */
	void setForm(Attachment value);

	/**
	 * Returns the value of the '<em><b>Process Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ClaimResponseProcessNote}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A note that describes or explains adjudication results in a human readable form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Process Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_ProcessNote()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='processNote' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClaimResponseProcessNote> getProcessNote();

	/**
	 * Returns the value of the '<em><b>Communication Request</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Request for additional supporting or authorizing information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Communication Request</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_CommunicationRequest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='communicationRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getCommunicationRequest();

	/**
	 * Returns the value of the '<em><b>Insurance</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ClaimResponseInsurance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Financial instruments for reimbursement for the health care products and services specified on the claim.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insurance</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_Insurance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='insurance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClaimResponseInsurance> getInsurance();

	/**
	 * Returns the value of the '<em><b>Error</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ClaimResponseError}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Errors encountered during the processing of the adjudication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimResponse_Error()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='error' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClaimResponseError> getError();

} // ClaimResponse
