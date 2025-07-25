/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Charge Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The resource ChargeItem describes the provision of healthcare provider products for a certain patient, therefore referring not only to the product, but containing in addition details of the provision, like date, time, amounts and participating organizations and persons. Main Usage of the ChargeItem is to enable the billing process and internal cost allocation.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ChargeItem#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ChargeItem#getDefinitionUri <em>Definition Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.ChargeItem#getDefinitionCanonical <em>Definition Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.ChargeItem#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.ChargeItem#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link org.hl7.fhir.ChargeItem#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ChargeItem#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.ChargeItem#getContext <em>Context</em>}</li>
 *   <li>{@link org.hl7.fhir.ChargeItem#getOccurrenceDateTime <em>Occurrence Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.ChargeItem#getOccurrencePeriod <em>Occurrence Period</em>}</li>
 *   <li>{@link org.hl7.fhir.ChargeItem#getOccurrenceTiming <em>Occurrence Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.ChargeItem#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.ChargeItem#getPerformingOrganization <em>Performing Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.ChargeItem#getRequestingOrganization <em>Requesting Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.ChargeItem#getCostCenter <em>Cost Center</em>}</li>
 *   <li>{@link org.hl7.fhir.ChargeItem#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.ChargeItem#getBodysite <em>Bodysite</em>}</li>
 *   <li>{@link org.hl7.fhir.ChargeItem#getFactorOverride <em>Factor Override</em>}</li>
 *   <li>{@link org.hl7.fhir.ChargeItem#getPriceOverride <em>Price Override</em>}</li>
 *   <li>{@link org.hl7.fhir.ChargeItem#getOverrideReason <em>Override Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.ChargeItem#getEnterer <em>Enterer</em>}</li>
 *   <li>{@link org.hl7.fhir.ChargeItem#getEnteredDate <em>Entered Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ChargeItem#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.ChargeItem#getService <em>Service</em>}</li>
 *   <li>{@link org.hl7.fhir.ChargeItem#getProductReference <em>Product Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ChargeItem#getProductCodeableConcept <em>Product Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.ChargeItem#getAccount <em>Account</em>}</li>
 *   <li>{@link org.hl7.fhir.ChargeItem#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.ChargeItem#getSupportingInformation <em>Supporting Information</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getChargeItem()
 * @model extendedMetaData="name='ChargeItem' kind='elementOnly'"
 * @generated
 */
public interface ChargeItem extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifiers assigned to this event performer or other systems.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getChargeItem_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Definition Uri</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Uri}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the (external) source of pricing information, rules of application for the code this ChargeItem uses.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition Uri</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getChargeItem_DefinitionUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definitionUri' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Uri> getDefinitionUri();

	/**
	 * Returns the value of the '<em><b>Definition Canonical</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Canonical}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the source of pricing information, rules of application for the code this ChargeItem uses.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition Canonical</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getChargeItem_DefinitionCanonical()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definitionCanonical' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Canonical> getDefinitionCanonical();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current state of the ChargeItem.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(ChargeItemStatus)
	 * @see org.hl7.fhir.FhirPackage#getChargeItem_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	ChargeItemStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ChargeItem#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ChargeItemStatus value);

	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ChargeItems can be grouped to larger ChargeItems covering the whole set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part Of</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getChargeItem_PartOf()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='partOf' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getPartOf();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code that identifies the charge, like a billing code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getChargeItem_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ChargeItem#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The individual or set of individuals the action is being or was performed on.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getChargeItem_Subject()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ChargeItem#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The encounter or episode of care that establishes the context for this event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(Reference)
	 * @see org.hl7.fhir.FhirPackage#getChargeItem_Context()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='context' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getContext();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ChargeItem#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Reference value);

	/**
	 * Returns the value of the '<em><b>Occurrence Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date/time(s) or duration when the charged service was applied. (choose any one of occurrence*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occurrence Date Time</em>' containment reference.
	 * @see #setOccurrenceDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getChargeItem_OccurrenceDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='occurrenceDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getOccurrenceDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ChargeItem#getOccurrenceDateTime <em>Occurrence Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence Date Time</em>' containment reference.
	 * @see #getOccurrenceDateTime()
	 * @generated
	 */
	void setOccurrenceDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Occurrence Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date/time(s) or duration when the charged service was applied. (choose any one of occurrence*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occurrence Period</em>' containment reference.
	 * @see #setOccurrencePeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getChargeItem_OccurrencePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='occurrencePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getOccurrencePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ChargeItem#getOccurrencePeriod <em>Occurrence Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence Period</em>' containment reference.
	 * @see #getOccurrencePeriod()
	 * @generated
	 */
	void setOccurrencePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Occurrence Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date/time(s) or duration when the charged service was applied. (choose any one of occurrence*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occurrence Timing</em>' containment reference.
	 * @see #setOccurrenceTiming(Timing)
	 * @see org.hl7.fhir.FhirPackage#getChargeItem_OccurrenceTiming()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='occurrenceTiming' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getOccurrenceTiming();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ChargeItem#getOccurrenceTiming <em>Occurrence Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence Timing</em>' containment reference.
	 * @see #getOccurrenceTiming()
	 * @generated
	 */
	void setOccurrenceTiming(Timing value);

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ChargeItemPerformer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates who or what performed or participated in the charged service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getChargeItem_Performer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ChargeItemPerformer> getPerformer();

	/**
	 * Returns the value of the '<em><b>Performing Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization requesting the service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performing Organization</em>' containment reference.
	 * @see #setPerformingOrganization(Reference)
	 * @see org.hl7.fhir.FhirPackage#getChargeItem_PerformingOrganization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performingOrganization' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPerformingOrganization();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ChargeItem#getPerformingOrganization <em>Performing Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performing Organization</em>' containment reference.
	 * @see #getPerformingOrganization()
	 * @generated
	 */
	void setPerformingOrganization(Reference value);

	/**
	 * Returns the value of the '<em><b>Requesting Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization performing the service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requesting Organization</em>' containment reference.
	 * @see #setRequestingOrganization(Reference)
	 * @see org.hl7.fhir.FhirPackage#getChargeItem_RequestingOrganization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requestingOrganization' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRequestingOrganization();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ChargeItem#getRequestingOrganization <em>Requesting Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requesting Organization</em>' containment reference.
	 * @see #getRequestingOrganization()
	 * @generated
	 */
	void setRequestingOrganization(Reference value);

	/**
	 * Returns the value of the '<em><b>Cost Center</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The financial cost center permits the tracking of charge attribution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cost Center</em>' containment reference.
	 * @see #setCostCenter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getChargeItem_CostCenter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='costCenter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getCostCenter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ChargeItem#getCostCenter <em>Cost Center</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Center</em>' containment reference.
	 * @see #getCostCenter()
	 * @generated
	 */
	void setCostCenter(Reference value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Quantity of which the charge item has been serviced.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getChargeItem_Quantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ChargeItem#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Bodysite</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The anatomical location where the related service has been applied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bodysite</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getChargeItem_Bodysite()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bodysite' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getBodysite();

	/**
	 * Returns the value of the '<em><b>Factor Override</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Factor overriding the factor determined by the rules associated with the code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Factor Override</em>' containment reference.
	 * @see #setFactorOverride(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getChargeItem_FactorOverride()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='factorOverride' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getFactorOverride();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ChargeItem#getFactorOverride <em>Factor Override</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor Override</em>' containment reference.
	 * @see #getFactorOverride()
	 * @generated
	 */
	void setFactorOverride(Decimal value);

	/**
	 * Returns the value of the '<em><b>Price Override</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Total price of the charge overriding the list price associated with the code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Price Override</em>' containment reference.
	 * @see #setPriceOverride(Money)
	 * @see org.hl7.fhir.FhirPackage#getChargeItem_PriceOverride()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='priceOverride' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getPriceOverride();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ChargeItem#getPriceOverride <em>Price Override</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price Override</em>' containment reference.
	 * @see #getPriceOverride()
	 * @generated
	 */
	void setPriceOverride(Money value);

	/**
	 * Returns the value of the '<em><b>Override Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the list price or the rule-based factor associated with the code is overridden, this attribute can capture a text to indicate the  reason for this action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Override Reason</em>' containment reference.
	 * @see #setOverrideReason(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getChargeItem_OverrideReason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='overrideReason' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getOverrideReason();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ChargeItem#getOverrideReason <em>Override Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Override Reason</em>' containment reference.
	 * @see #getOverrideReason()
	 * @generated
	 */
	void setOverrideReason(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Enterer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The device, practitioner, etc. who entered the charge item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enterer</em>' containment reference.
	 * @see #setEnterer(Reference)
	 * @see org.hl7.fhir.FhirPackage#getChargeItem_Enterer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='enterer' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEnterer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ChargeItem#getEnterer <em>Enterer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enterer</em>' containment reference.
	 * @see #getEnterer()
	 * @generated
	 */
	void setEnterer(Reference value);

	/**
	 * Returns the value of the '<em><b>Entered Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date the charge item was entered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entered Date</em>' containment reference.
	 * @see #setEnteredDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getChargeItem_EnteredDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='enteredDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getEnteredDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ChargeItem#getEnteredDate <em>Entered Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entered Date</em>' containment reference.
	 * @see #getEnteredDate()
	 * @generated
	 */
	void setEnteredDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes why the event occurred in coded or textual form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getChargeItem_Reason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getReason();

	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicated the rendered service that caused this charge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getChargeItem_Service()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='service' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getService();

	/**
	 * Returns the value of the '<em><b>Product Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the device, food, drug or other product being charged either by type code or reference to an instance. (choose any one of product*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product Reference</em>' containment reference.
	 * @see #setProductReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getChargeItem_ProductReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='productReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getProductReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ChargeItem#getProductReference <em>Product Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Reference</em>' containment reference.
	 * @see #getProductReference()
	 * @generated
	 */
	void setProductReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Product Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the device, food, drug or other product being charged either by type code or reference to an instance. (choose any one of product*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product Codeable Concept</em>' containment reference.
	 * @see #setProductCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getChargeItem_ProductCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='productCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getProductCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ChargeItem#getProductCodeableConcept <em>Product Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Codeable Concept</em>' containment reference.
	 * @see #getProductCodeableConcept()
	 * @generated
	 */
	void setProductCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Account</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Account into which this ChargeItems belongs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Account</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getChargeItem_Account()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='account' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getAccount();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Comments made about the event by the performer, subject or other participants.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getChargeItem_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

	/**
	 * Returns the value of the '<em><b>Supporting Information</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Further information supporting this charge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supporting Information</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getChargeItem_SupportingInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supportingInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSupportingInformation();

} // ChargeItem
