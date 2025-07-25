/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.Address;
import org.hl7.fhir.Age;
import org.hl7.fhir.Annotation;
import org.hl7.fhir.Attachment;
import org.hl7.fhir.Base64Binary;
import org.hl7.fhir.Canonical;
import org.hl7.fhir.Code;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Coding;
import org.hl7.fhir.ContactDetail;
import org.hl7.fhir.ContactPoint;
import org.hl7.fhir.Contributor;
import org.hl7.fhir.Count;
import org.hl7.fhir.DataRequirement;
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.Distance;
import org.hl7.fhir.Dosage;
import org.hl7.fhir.Duration;
import org.hl7.fhir.Expression;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.HumanName;
import org.hl7.fhir.Id;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Instant;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.Meta;
import org.hl7.fhir.Money;
import org.hl7.fhir.Oid;
import org.hl7.fhir.ParameterDefinition;
import org.hl7.fhir.Period;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Range;
import org.hl7.fhir.Ratio;
import org.hl7.fhir.Reference;
import org.hl7.fhir.RelatedArtifact;
import org.hl7.fhir.SampledData;
import org.hl7.fhir.Signature;
import org.hl7.fhir.StructureMapSource;
import org.hl7.fhir.StructureMapSourceListMode;
import org.hl7.fhir.Time;
import org.hl7.fhir.Timing;
import org.hl7.fhir.TriggerDefinition;
import org.hl7.fhir.UnsignedInt;
import org.hl7.fhir.Uri;
import org.hl7.fhir.Url;
import org.hl7.fhir.UsageContext;
import org.hl7.fhir.Uuid;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structure Map Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getMin <em>Min</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getMax <em>Max</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueBase64Binary <em>Default Value Base64 Binary</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueBoolean <em>Default Value Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueCanonical <em>Default Value Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueCode <em>Default Value Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueDate <em>Default Value Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueDateTime <em>Default Value Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueDecimal <em>Default Value Decimal</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueId <em>Default Value Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueInstant <em>Default Value Instant</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueInteger <em>Default Value Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueMarkdown <em>Default Value Markdown</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueOid <em>Default Value Oid</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValuePositiveInt <em>Default Value Positive Int</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueString <em>Default Value String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueTime <em>Default Value Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueUnsignedInt <em>Default Value Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueUri <em>Default Value Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueUrl <em>Default Value Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueUuid <em>Default Value Uuid</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueAddress <em>Default Value Address</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueAge <em>Default Value Age</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueAnnotation <em>Default Value Annotation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueAttachment <em>Default Value Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueCodeableConcept <em>Default Value Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueCoding <em>Default Value Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueContactPoint <em>Default Value Contact Point</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueCount <em>Default Value Count</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueDistance <em>Default Value Distance</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueDuration <em>Default Value Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueHumanName <em>Default Value Human Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueIdentifier <em>Default Value Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueMoney <em>Default Value Money</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValuePeriod <em>Default Value Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueQuantity <em>Default Value Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueRange <em>Default Value Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueRatio <em>Default Value Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueReference <em>Default Value Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueSampledData <em>Default Value Sampled Data</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueSignature <em>Default Value Signature</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueTiming <em>Default Value Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueContactDetail <em>Default Value Contact Detail</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueContributor <em>Default Value Contributor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueDataRequirement <em>Default Value Data Requirement</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueExpression <em>Default Value Expression</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueParameterDefinition <em>Default Value Parameter Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueRelatedArtifact <em>Default Value Related Artifact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueTriggerDefinition <em>Default Value Trigger Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueUsageContext <em>Default Value Usage Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueDosage <em>Default Value Dosage</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getDefaultValueMeta <em>Default Value Meta</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getListMode <em>List Mode</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getCheck <em>Check</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getLogMessage <em>Log Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructureMapSourceImpl extends BackboneElementImpl implements StructureMapSource {
	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Id context;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer min;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String max;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String type;

	/**
	 * The cached value of the '{@link #getDefaultValueBase64Binary() <em>Default Value Base64 Binary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueBase64Binary()
	 * @generated
	 * @ordered
	 */
	protected Base64Binary defaultValueBase64Binary;

	/**
	 * The cached value of the '{@link #getDefaultValueBoolean() <em>Default Value Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueBoolean()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean defaultValueBoolean;

	/**
	 * The cached value of the '{@link #getDefaultValueCanonical() <em>Default Value Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueCanonical()
	 * @generated
	 * @ordered
	 */
	protected Canonical defaultValueCanonical;

	/**
	 * The cached value of the '{@link #getDefaultValueCode() <em>Default Value Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueCode()
	 * @generated
	 * @ordered
	 */
	protected Code defaultValueCode;

	/**
	 * The cached value of the '{@link #getDefaultValueDate() <em>Default Value Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueDate()
	 * @generated
	 * @ordered
	 */
	protected Date defaultValueDate;

	/**
	 * The cached value of the '{@link #getDefaultValueDateTime() <em>Default Value Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime defaultValueDateTime;

	/**
	 * The cached value of the '{@link #getDefaultValueDecimal() <em>Default Value Decimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueDecimal()
	 * @generated
	 * @ordered
	 */
	protected Decimal defaultValueDecimal;

	/**
	 * The cached value of the '{@link #getDefaultValueId() <em>Default Value Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueId()
	 * @generated
	 * @ordered
	 */
	protected Id defaultValueId;

	/**
	 * The cached value of the '{@link #getDefaultValueInstant() <em>Default Value Instant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueInstant()
	 * @generated
	 * @ordered
	 */
	protected Instant defaultValueInstant;

	/**
	 * The cached value of the '{@link #getDefaultValueInteger() <em>Default Value Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueInteger()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer defaultValueInteger;

	/**
	 * The cached value of the '{@link #getDefaultValueMarkdown() <em>Default Value Markdown</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueMarkdown()
	 * @generated
	 * @ordered
	 */
	protected Markdown defaultValueMarkdown;

	/**
	 * The cached value of the '{@link #getDefaultValueOid() <em>Default Value Oid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueOid()
	 * @generated
	 * @ordered
	 */
	protected Oid defaultValueOid;

	/**
	 * The cached value of the '{@link #getDefaultValuePositiveInt() <em>Default Value Positive Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValuePositiveInt()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt defaultValuePositiveInt;

	/**
	 * The cached value of the '{@link #getDefaultValueString() <em>Default Value String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String defaultValueString;

	/**
	 * The cached value of the '{@link #getDefaultValueTime() <em>Default Value Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueTime()
	 * @generated
	 * @ordered
	 */
	protected Time defaultValueTime;

	/**
	 * The cached value of the '{@link #getDefaultValueUnsignedInt() <em>Default Value Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueUnsignedInt()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt defaultValueUnsignedInt;

	/**
	 * The cached value of the '{@link #getDefaultValueUri() <em>Default Value Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueUri()
	 * @generated
	 * @ordered
	 */
	protected Uri defaultValueUri;

	/**
	 * The cached value of the '{@link #getDefaultValueUrl() <em>Default Value Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueUrl()
	 * @generated
	 * @ordered
	 */
	protected Url defaultValueUrl;

	/**
	 * The cached value of the '{@link #getDefaultValueUuid() <em>Default Value Uuid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueUuid()
	 * @generated
	 * @ordered
	 */
	protected Uuid defaultValueUuid;

	/**
	 * The cached value of the '{@link #getDefaultValueAddress() <em>Default Value Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueAddress()
	 * @generated
	 * @ordered
	 */
	protected Address defaultValueAddress;

	/**
	 * The cached value of the '{@link #getDefaultValueAge() <em>Default Value Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueAge()
	 * @generated
	 * @ordered
	 */
	protected Age defaultValueAge;

	/**
	 * The cached value of the '{@link #getDefaultValueAnnotation() <em>Default Value Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueAnnotation()
	 * @generated
	 * @ordered
	 */
	protected Annotation defaultValueAnnotation;

	/**
	 * The cached value of the '{@link #getDefaultValueAttachment() <em>Default Value Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueAttachment()
	 * @generated
	 * @ordered
	 */
	protected Attachment defaultValueAttachment;

	/**
	 * The cached value of the '{@link #getDefaultValueCodeableConcept() <em>Default Value Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept defaultValueCodeableConcept;

	/**
	 * The cached value of the '{@link #getDefaultValueCoding() <em>Default Value Coding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueCoding()
	 * @generated
	 * @ordered
	 */
	protected Coding defaultValueCoding;

	/**
	 * The cached value of the '{@link #getDefaultValueContactPoint() <em>Default Value Contact Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueContactPoint()
	 * @generated
	 * @ordered
	 */
	protected ContactPoint defaultValueContactPoint;

	/**
	 * The cached value of the '{@link #getDefaultValueCount() <em>Default Value Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueCount()
	 * @generated
	 * @ordered
	 */
	protected Count defaultValueCount;

	/**
	 * The cached value of the '{@link #getDefaultValueDistance() <em>Default Value Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueDistance()
	 * @generated
	 * @ordered
	 */
	protected Distance defaultValueDistance;

	/**
	 * The cached value of the '{@link #getDefaultValueDuration() <em>Default Value Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration defaultValueDuration;

	/**
	 * The cached value of the '{@link #getDefaultValueHumanName() <em>Default Value Human Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueHumanName()
	 * @generated
	 * @ordered
	 */
	protected HumanName defaultValueHumanName;

	/**
	 * The cached value of the '{@link #getDefaultValueIdentifier() <em>Default Value Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier defaultValueIdentifier;

	/**
	 * The cached value of the '{@link #getDefaultValueMoney() <em>Default Value Money</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueMoney()
	 * @generated
	 * @ordered
	 */
	protected Money defaultValueMoney;

	/**
	 * The cached value of the '{@link #getDefaultValuePeriod() <em>Default Value Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValuePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period defaultValuePeriod;

	/**
	 * The cached value of the '{@link #getDefaultValueQuantity() <em>Default Value Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity defaultValueQuantity;

	/**
	 * The cached value of the '{@link #getDefaultValueRange() <em>Default Value Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueRange()
	 * @generated
	 * @ordered
	 */
	protected Range defaultValueRange;

	/**
	 * The cached value of the '{@link #getDefaultValueRatio() <em>Default Value Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueRatio()
	 * @generated
	 * @ordered
	 */
	protected Ratio defaultValueRatio;

	/**
	 * The cached value of the '{@link #getDefaultValueReference() <em>Default Value Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueReference()
	 * @generated
	 * @ordered
	 */
	protected Reference defaultValueReference;

	/**
	 * The cached value of the '{@link #getDefaultValueSampledData() <em>Default Value Sampled Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueSampledData()
	 * @generated
	 * @ordered
	 */
	protected SampledData defaultValueSampledData;

	/**
	 * The cached value of the '{@link #getDefaultValueSignature() <em>Default Value Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueSignature()
	 * @generated
	 * @ordered
	 */
	protected Signature defaultValueSignature;

	/**
	 * The cached value of the '{@link #getDefaultValueTiming() <em>Default Value Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueTiming()
	 * @generated
	 * @ordered
	 */
	protected Timing defaultValueTiming;

	/**
	 * The cached value of the '{@link #getDefaultValueContactDetail() <em>Default Value Contact Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueContactDetail()
	 * @generated
	 * @ordered
	 */
	protected ContactDetail defaultValueContactDetail;

	/**
	 * The cached value of the '{@link #getDefaultValueContributor() <em>Default Value Contributor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueContributor()
	 * @generated
	 * @ordered
	 */
	protected Contributor defaultValueContributor;

	/**
	 * The cached value of the '{@link #getDefaultValueDataRequirement() <em>Default Value Data Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueDataRequirement()
	 * @generated
	 * @ordered
	 */
	protected DataRequirement defaultValueDataRequirement;

	/**
	 * The cached value of the '{@link #getDefaultValueExpression() <em>Default Value Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression defaultValueExpression;

	/**
	 * The cached value of the '{@link #getDefaultValueParameterDefinition() <em>Default Value Parameter Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueParameterDefinition()
	 * @generated
	 * @ordered
	 */
	protected ParameterDefinition defaultValueParameterDefinition;

	/**
	 * The cached value of the '{@link #getDefaultValueRelatedArtifact() <em>Default Value Related Artifact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueRelatedArtifact()
	 * @generated
	 * @ordered
	 */
	protected RelatedArtifact defaultValueRelatedArtifact;

	/**
	 * The cached value of the '{@link #getDefaultValueTriggerDefinition() <em>Default Value Trigger Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueTriggerDefinition()
	 * @generated
	 * @ordered
	 */
	protected TriggerDefinition defaultValueTriggerDefinition;

	/**
	 * The cached value of the '{@link #getDefaultValueUsageContext() <em>Default Value Usage Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueUsageContext()
	 * @generated
	 * @ordered
	 */
	protected UsageContext defaultValueUsageContext;

	/**
	 * The cached value of the '{@link #getDefaultValueDosage() <em>Default Value Dosage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueDosage()
	 * @generated
	 * @ordered
	 */
	protected Dosage defaultValueDosage;

	/**
	 * The cached value of the '{@link #getDefaultValueMeta() <em>Default Value Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueMeta()
	 * @generated
	 * @ordered
	 */
	protected Meta defaultValueMeta;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String element;

	/**
	 * The cached value of the '{@link #getListMode() <em>List Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListMode()
	 * @generated
	 * @ordered
	 */
	protected StructureMapSourceListMode listMode;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected Id variable;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String condition;

	/**
	 * The cached value of the '{@link #getCheck() <em>Check</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheck()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String check;

	/**
	 * The cached value of the '{@link #getLogMessage() <em>Log Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogMessage()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String logMessage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureMapSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getStructureMapSource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Id getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(Id newContext, NotificationChain msgs) {
		Id oldContext = context;
		context = newContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__CONTEXT, oldContext, newContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContext(Id newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Integer getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMin(org.hl7.fhir.Integer newMin, NotificationChain msgs) {
		org.hl7.fhir.Integer oldMin = min;
		min = newMin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__MIN, oldMin, newMin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMin(org.hl7.fhir.Integer newMin) {
		if (newMin != min) {
			NotificationChain msgs = null;
			if (min != null)
				msgs = ((InternalEObject)min).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__MIN, null, msgs);
			if (newMin != null)
				msgs = ((InternalEObject)newMin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__MIN, null, msgs);
			msgs = basicSetMin(newMin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__MIN, newMin, newMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMax(org.hl7.fhir.String newMax, NotificationChain msgs) {
		org.hl7.fhir.String oldMax = max;
		max = newMax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__MAX, oldMax, newMax);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMax(org.hl7.fhir.String newMax) {
		if (newMax != max) {
			NotificationChain msgs = null;
			if (max != null)
				msgs = ((InternalEObject)max).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__MAX, null, msgs);
			if (newMax != null)
				msgs = ((InternalEObject)newMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__MAX, null, msgs);
			msgs = basicSetMax(newMax, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__MAX, newMax, newMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(org.hl7.fhir.String newType, NotificationChain msgs) {
		org.hl7.fhir.String oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(org.hl7.fhir.String newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Base64Binary getDefaultValueBase64Binary() {
		return defaultValueBase64Binary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueBase64Binary(Base64Binary newDefaultValueBase64Binary, NotificationChain msgs) {
		Base64Binary oldDefaultValueBase64Binary = defaultValueBase64Binary;
		defaultValueBase64Binary = newDefaultValueBase64Binary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_BASE64_BINARY, oldDefaultValueBase64Binary, newDefaultValueBase64Binary);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueBase64Binary(Base64Binary newDefaultValueBase64Binary) {
		if (newDefaultValueBase64Binary != defaultValueBase64Binary) {
			NotificationChain msgs = null;
			if (defaultValueBase64Binary != null)
				msgs = ((InternalEObject)defaultValueBase64Binary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_BASE64_BINARY, null, msgs);
			if (newDefaultValueBase64Binary != null)
				msgs = ((InternalEObject)newDefaultValueBase64Binary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_BASE64_BINARY, null, msgs);
			msgs = basicSetDefaultValueBase64Binary(newDefaultValueBase64Binary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_BASE64_BINARY, newDefaultValueBase64Binary, newDefaultValueBase64Binary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getDefaultValueBoolean() {
		return defaultValueBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueBoolean(org.hl7.fhir.Boolean newDefaultValueBoolean, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldDefaultValueBoolean = defaultValueBoolean;
		defaultValueBoolean = newDefaultValueBoolean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_BOOLEAN, oldDefaultValueBoolean, newDefaultValueBoolean);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueBoolean(org.hl7.fhir.Boolean newDefaultValueBoolean) {
		if (newDefaultValueBoolean != defaultValueBoolean) {
			NotificationChain msgs = null;
			if (defaultValueBoolean != null)
				msgs = ((InternalEObject)defaultValueBoolean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_BOOLEAN, null, msgs);
			if (newDefaultValueBoolean != null)
				msgs = ((InternalEObject)newDefaultValueBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_BOOLEAN, null, msgs);
			msgs = basicSetDefaultValueBoolean(newDefaultValueBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_BOOLEAN, newDefaultValueBoolean, newDefaultValueBoolean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Canonical getDefaultValueCanonical() {
		return defaultValueCanonical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueCanonical(Canonical newDefaultValueCanonical, NotificationChain msgs) {
		Canonical oldDefaultValueCanonical = defaultValueCanonical;
		defaultValueCanonical = newDefaultValueCanonical;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CANONICAL, oldDefaultValueCanonical, newDefaultValueCanonical);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueCanonical(Canonical newDefaultValueCanonical) {
		if (newDefaultValueCanonical != defaultValueCanonical) {
			NotificationChain msgs = null;
			if (defaultValueCanonical != null)
				msgs = ((InternalEObject)defaultValueCanonical).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CANONICAL, null, msgs);
			if (newDefaultValueCanonical != null)
				msgs = ((InternalEObject)newDefaultValueCanonical).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CANONICAL, null, msgs);
			msgs = basicSetDefaultValueCanonical(newDefaultValueCanonical, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CANONICAL, newDefaultValueCanonical, newDefaultValueCanonical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getDefaultValueCode() {
		return defaultValueCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueCode(Code newDefaultValueCode, NotificationChain msgs) {
		Code oldDefaultValueCode = defaultValueCode;
		defaultValueCode = newDefaultValueCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CODE, oldDefaultValueCode, newDefaultValueCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueCode(Code newDefaultValueCode) {
		if (newDefaultValueCode != defaultValueCode) {
			NotificationChain msgs = null;
			if (defaultValueCode != null)
				msgs = ((InternalEObject)defaultValueCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CODE, null, msgs);
			if (newDefaultValueCode != null)
				msgs = ((InternalEObject)newDefaultValueCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CODE, null, msgs);
			msgs = basicSetDefaultValueCode(newDefaultValueCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CODE, newDefaultValueCode, newDefaultValueCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDefaultValueDate() {
		return defaultValueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueDate(Date newDefaultValueDate, NotificationChain msgs) {
		Date oldDefaultValueDate = defaultValueDate;
		defaultValueDate = newDefaultValueDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DATE, oldDefaultValueDate, newDefaultValueDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueDate(Date newDefaultValueDate) {
		if (newDefaultValueDate != defaultValueDate) {
			NotificationChain msgs = null;
			if (defaultValueDate != null)
				msgs = ((InternalEObject)defaultValueDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DATE, null, msgs);
			if (newDefaultValueDate != null)
				msgs = ((InternalEObject)newDefaultValueDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DATE, null, msgs);
			msgs = basicSetDefaultValueDate(newDefaultValueDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DATE, newDefaultValueDate, newDefaultValueDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getDefaultValueDateTime() {
		return defaultValueDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueDateTime(DateTime newDefaultValueDateTime, NotificationChain msgs) {
		DateTime oldDefaultValueDateTime = defaultValueDateTime;
		defaultValueDateTime = newDefaultValueDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DATE_TIME, oldDefaultValueDateTime, newDefaultValueDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueDateTime(DateTime newDefaultValueDateTime) {
		if (newDefaultValueDateTime != defaultValueDateTime) {
			NotificationChain msgs = null;
			if (defaultValueDateTime != null)
				msgs = ((InternalEObject)defaultValueDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DATE_TIME, null, msgs);
			if (newDefaultValueDateTime != null)
				msgs = ((InternalEObject)newDefaultValueDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DATE_TIME, null, msgs);
			msgs = basicSetDefaultValueDateTime(newDefaultValueDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DATE_TIME, newDefaultValueDateTime, newDefaultValueDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getDefaultValueDecimal() {
		return defaultValueDecimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueDecimal(Decimal newDefaultValueDecimal, NotificationChain msgs) {
		Decimal oldDefaultValueDecimal = defaultValueDecimal;
		defaultValueDecimal = newDefaultValueDecimal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DECIMAL, oldDefaultValueDecimal, newDefaultValueDecimal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueDecimal(Decimal newDefaultValueDecimal) {
		if (newDefaultValueDecimal != defaultValueDecimal) {
			NotificationChain msgs = null;
			if (defaultValueDecimal != null)
				msgs = ((InternalEObject)defaultValueDecimal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DECIMAL, null, msgs);
			if (newDefaultValueDecimal != null)
				msgs = ((InternalEObject)newDefaultValueDecimal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DECIMAL, null, msgs);
			msgs = basicSetDefaultValueDecimal(newDefaultValueDecimal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DECIMAL, newDefaultValueDecimal, newDefaultValueDecimal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Id getDefaultValueId() {
		return defaultValueId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueId(Id newDefaultValueId, NotificationChain msgs) {
		Id oldDefaultValueId = defaultValueId;
		defaultValueId = newDefaultValueId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_ID, oldDefaultValueId, newDefaultValueId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueId(Id newDefaultValueId) {
		if (newDefaultValueId != defaultValueId) {
			NotificationChain msgs = null;
			if (defaultValueId != null)
				msgs = ((InternalEObject)defaultValueId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_ID, null, msgs);
			if (newDefaultValueId != null)
				msgs = ((InternalEObject)newDefaultValueId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_ID, null, msgs);
			msgs = basicSetDefaultValueId(newDefaultValueId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_ID, newDefaultValueId, newDefaultValueId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instant getDefaultValueInstant() {
		return defaultValueInstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueInstant(Instant newDefaultValueInstant, NotificationChain msgs) {
		Instant oldDefaultValueInstant = defaultValueInstant;
		defaultValueInstant = newDefaultValueInstant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_INSTANT, oldDefaultValueInstant, newDefaultValueInstant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueInstant(Instant newDefaultValueInstant) {
		if (newDefaultValueInstant != defaultValueInstant) {
			NotificationChain msgs = null;
			if (defaultValueInstant != null)
				msgs = ((InternalEObject)defaultValueInstant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_INSTANT, null, msgs);
			if (newDefaultValueInstant != null)
				msgs = ((InternalEObject)newDefaultValueInstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_INSTANT, null, msgs);
			msgs = basicSetDefaultValueInstant(newDefaultValueInstant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_INSTANT, newDefaultValueInstant, newDefaultValueInstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Integer getDefaultValueInteger() {
		return defaultValueInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueInteger(org.hl7.fhir.Integer newDefaultValueInteger, NotificationChain msgs) {
		org.hl7.fhir.Integer oldDefaultValueInteger = defaultValueInteger;
		defaultValueInteger = newDefaultValueInteger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_INTEGER, oldDefaultValueInteger, newDefaultValueInteger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueInteger(org.hl7.fhir.Integer newDefaultValueInteger) {
		if (newDefaultValueInteger != defaultValueInteger) {
			NotificationChain msgs = null;
			if (defaultValueInteger != null)
				msgs = ((InternalEObject)defaultValueInteger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_INTEGER, null, msgs);
			if (newDefaultValueInteger != null)
				msgs = ((InternalEObject)newDefaultValueInteger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_INTEGER, null, msgs);
			msgs = basicSetDefaultValueInteger(newDefaultValueInteger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_INTEGER, newDefaultValueInteger, newDefaultValueInteger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getDefaultValueMarkdown() {
		return defaultValueMarkdown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueMarkdown(Markdown newDefaultValueMarkdown, NotificationChain msgs) {
		Markdown oldDefaultValueMarkdown = defaultValueMarkdown;
		defaultValueMarkdown = newDefaultValueMarkdown;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_MARKDOWN, oldDefaultValueMarkdown, newDefaultValueMarkdown);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueMarkdown(Markdown newDefaultValueMarkdown) {
		if (newDefaultValueMarkdown != defaultValueMarkdown) {
			NotificationChain msgs = null;
			if (defaultValueMarkdown != null)
				msgs = ((InternalEObject)defaultValueMarkdown).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_MARKDOWN, null, msgs);
			if (newDefaultValueMarkdown != null)
				msgs = ((InternalEObject)newDefaultValueMarkdown).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_MARKDOWN, null, msgs);
			msgs = basicSetDefaultValueMarkdown(newDefaultValueMarkdown, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_MARKDOWN, newDefaultValueMarkdown, newDefaultValueMarkdown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oid getDefaultValueOid() {
		return defaultValueOid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueOid(Oid newDefaultValueOid, NotificationChain msgs) {
		Oid oldDefaultValueOid = defaultValueOid;
		defaultValueOid = newDefaultValueOid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_OID, oldDefaultValueOid, newDefaultValueOid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueOid(Oid newDefaultValueOid) {
		if (newDefaultValueOid != defaultValueOid) {
			NotificationChain msgs = null;
			if (defaultValueOid != null)
				msgs = ((InternalEObject)defaultValueOid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_OID, null, msgs);
			if (newDefaultValueOid != null)
				msgs = ((InternalEObject)newDefaultValueOid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_OID, null, msgs);
			msgs = basicSetDefaultValueOid(newDefaultValueOid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_OID, newDefaultValueOid, newDefaultValueOid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getDefaultValuePositiveInt() {
		return defaultValuePositiveInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValuePositiveInt(PositiveInt newDefaultValuePositiveInt, NotificationChain msgs) {
		PositiveInt oldDefaultValuePositiveInt = defaultValuePositiveInt;
		defaultValuePositiveInt = newDefaultValuePositiveInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_POSITIVE_INT, oldDefaultValuePositiveInt, newDefaultValuePositiveInt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValuePositiveInt(PositiveInt newDefaultValuePositiveInt) {
		if (newDefaultValuePositiveInt != defaultValuePositiveInt) {
			NotificationChain msgs = null;
			if (defaultValuePositiveInt != null)
				msgs = ((InternalEObject)defaultValuePositiveInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_POSITIVE_INT, null, msgs);
			if (newDefaultValuePositiveInt != null)
				msgs = ((InternalEObject)newDefaultValuePositiveInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_POSITIVE_INT, null, msgs);
			msgs = basicSetDefaultValuePositiveInt(newDefaultValuePositiveInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_POSITIVE_INT, newDefaultValuePositiveInt, newDefaultValuePositiveInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getDefaultValueString() {
		return defaultValueString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueString(org.hl7.fhir.String newDefaultValueString, NotificationChain msgs) {
		org.hl7.fhir.String oldDefaultValueString = defaultValueString;
		defaultValueString = newDefaultValueString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_STRING, oldDefaultValueString, newDefaultValueString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueString(org.hl7.fhir.String newDefaultValueString) {
		if (newDefaultValueString != defaultValueString) {
			NotificationChain msgs = null;
			if (defaultValueString != null)
				msgs = ((InternalEObject)defaultValueString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_STRING, null, msgs);
			if (newDefaultValueString != null)
				msgs = ((InternalEObject)newDefaultValueString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_STRING, null, msgs);
			msgs = basicSetDefaultValueString(newDefaultValueString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_STRING, newDefaultValueString, newDefaultValueString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Time getDefaultValueTime() {
		return defaultValueTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueTime(Time newDefaultValueTime, NotificationChain msgs) {
		Time oldDefaultValueTime = defaultValueTime;
		defaultValueTime = newDefaultValueTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_TIME, oldDefaultValueTime, newDefaultValueTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueTime(Time newDefaultValueTime) {
		if (newDefaultValueTime != defaultValueTime) {
			NotificationChain msgs = null;
			if (defaultValueTime != null)
				msgs = ((InternalEObject)defaultValueTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_TIME, null, msgs);
			if (newDefaultValueTime != null)
				msgs = ((InternalEObject)newDefaultValueTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_TIME, null, msgs);
			msgs = basicSetDefaultValueTime(newDefaultValueTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_TIME, newDefaultValueTime, newDefaultValueTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnsignedInt getDefaultValueUnsignedInt() {
		return defaultValueUnsignedInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueUnsignedInt(UnsignedInt newDefaultValueUnsignedInt, NotificationChain msgs) {
		UnsignedInt oldDefaultValueUnsignedInt = defaultValueUnsignedInt;
		defaultValueUnsignedInt = newDefaultValueUnsignedInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_UNSIGNED_INT, oldDefaultValueUnsignedInt, newDefaultValueUnsignedInt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueUnsignedInt(UnsignedInt newDefaultValueUnsignedInt) {
		if (newDefaultValueUnsignedInt != defaultValueUnsignedInt) {
			NotificationChain msgs = null;
			if (defaultValueUnsignedInt != null)
				msgs = ((InternalEObject)defaultValueUnsignedInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_UNSIGNED_INT, null, msgs);
			if (newDefaultValueUnsignedInt != null)
				msgs = ((InternalEObject)newDefaultValueUnsignedInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_UNSIGNED_INT, null, msgs);
			msgs = basicSetDefaultValueUnsignedInt(newDefaultValueUnsignedInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_UNSIGNED_INT, newDefaultValueUnsignedInt, newDefaultValueUnsignedInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getDefaultValueUri() {
		return defaultValueUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueUri(Uri newDefaultValueUri, NotificationChain msgs) {
		Uri oldDefaultValueUri = defaultValueUri;
		defaultValueUri = newDefaultValueUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_URI, oldDefaultValueUri, newDefaultValueUri);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueUri(Uri newDefaultValueUri) {
		if (newDefaultValueUri != defaultValueUri) {
			NotificationChain msgs = null;
			if (defaultValueUri != null)
				msgs = ((InternalEObject)defaultValueUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_URI, null, msgs);
			if (newDefaultValueUri != null)
				msgs = ((InternalEObject)newDefaultValueUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_URI, null, msgs);
			msgs = basicSetDefaultValueUri(newDefaultValueUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_URI, newDefaultValueUri, newDefaultValueUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Url getDefaultValueUrl() {
		return defaultValueUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueUrl(Url newDefaultValueUrl, NotificationChain msgs) {
		Url oldDefaultValueUrl = defaultValueUrl;
		defaultValueUrl = newDefaultValueUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_URL, oldDefaultValueUrl, newDefaultValueUrl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueUrl(Url newDefaultValueUrl) {
		if (newDefaultValueUrl != defaultValueUrl) {
			NotificationChain msgs = null;
			if (defaultValueUrl != null)
				msgs = ((InternalEObject)defaultValueUrl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_URL, null, msgs);
			if (newDefaultValueUrl != null)
				msgs = ((InternalEObject)newDefaultValueUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_URL, null, msgs);
			msgs = basicSetDefaultValueUrl(newDefaultValueUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_URL, newDefaultValueUrl, newDefaultValueUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uuid getDefaultValueUuid() {
		return defaultValueUuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueUuid(Uuid newDefaultValueUuid, NotificationChain msgs) {
		Uuid oldDefaultValueUuid = defaultValueUuid;
		defaultValueUuid = newDefaultValueUuid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_UUID, oldDefaultValueUuid, newDefaultValueUuid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueUuid(Uuid newDefaultValueUuid) {
		if (newDefaultValueUuid != defaultValueUuid) {
			NotificationChain msgs = null;
			if (defaultValueUuid != null)
				msgs = ((InternalEObject)defaultValueUuid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_UUID, null, msgs);
			if (newDefaultValueUuid != null)
				msgs = ((InternalEObject)newDefaultValueUuid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_UUID, null, msgs);
			msgs = basicSetDefaultValueUuid(newDefaultValueUuid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_UUID, newDefaultValueUuid, newDefaultValueUuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Address getDefaultValueAddress() {
		return defaultValueAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueAddress(Address newDefaultValueAddress, NotificationChain msgs) {
		Address oldDefaultValueAddress = defaultValueAddress;
		defaultValueAddress = newDefaultValueAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_ADDRESS, oldDefaultValueAddress, newDefaultValueAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueAddress(Address newDefaultValueAddress) {
		if (newDefaultValueAddress != defaultValueAddress) {
			NotificationChain msgs = null;
			if (defaultValueAddress != null)
				msgs = ((InternalEObject)defaultValueAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_ADDRESS, null, msgs);
			if (newDefaultValueAddress != null)
				msgs = ((InternalEObject)newDefaultValueAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_ADDRESS, null, msgs);
			msgs = basicSetDefaultValueAddress(newDefaultValueAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_ADDRESS, newDefaultValueAddress, newDefaultValueAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Age getDefaultValueAge() {
		return defaultValueAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueAge(Age newDefaultValueAge, NotificationChain msgs) {
		Age oldDefaultValueAge = defaultValueAge;
		defaultValueAge = newDefaultValueAge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_AGE, oldDefaultValueAge, newDefaultValueAge);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueAge(Age newDefaultValueAge) {
		if (newDefaultValueAge != defaultValueAge) {
			NotificationChain msgs = null;
			if (defaultValueAge != null)
				msgs = ((InternalEObject)defaultValueAge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_AGE, null, msgs);
			if (newDefaultValueAge != null)
				msgs = ((InternalEObject)newDefaultValueAge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_AGE, null, msgs);
			msgs = basicSetDefaultValueAge(newDefaultValueAge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_AGE, newDefaultValueAge, newDefaultValueAge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Annotation getDefaultValueAnnotation() {
		return defaultValueAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueAnnotation(Annotation newDefaultValueAnnotation, NotificationChain msgs) {
		Annotation oldDefaultValueAnnotation = defaultValueAnnotation;
		defaultValueAnnotation = newDefaultValueAnnotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_ANNOTATION, oldDefaultValueAnnotation, newDefaultValueAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueAnnotation(Annotation newDefaultValueAnnotation) {
		if (newDefaultValueAnnotation != defaultValueAnnotation) {
			NotificationChain msgs = null;
			if (defaultValueAnnotation != null)
				msgs = ((InternalEObject)defaultValueAnnotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_ANNOTATION, null, msgs);
			if (newDefaultValueAnnotation != null)
				msgs = ((InternalEObject)newDefaultValueAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_ANNOTATION, null, msgs);
			msgs = basicSetDefaultValueAnnotation(newDefaultValueAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_ANNOTATION, newDefaultValueAnnotation, newDefaultValueAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attachment getDefaultValueAttachment() {
		return defaultValueAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueAttachment(Attachment newDefaultValueAttachment, NotificationChain msgs) {
		Attachment oldDefaultValueAttachment = defaultValueAttachment;
		defaultValueAttachment = newDefaultValueAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_ATTACHMENT, oldDefaultValueAttachment, newDefaultValueAttachment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueAttachment(Attachment newDefaultValueAttachment) {
		if (newDefaultValueAttachment != defaultValueAttachment) {
			NotificationChain msgs = null;
			if (defaultValueAttachment != null)
				msgs = ((InternalEObject)defaultValueAttachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_ATTACHMENT, null, msgs);
			if (newDefaultValueAttachment != null)
				msgs = ((InternalEObject)newDefaultValueAttachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_ATTACHMENT, null, msgs);
			msgs = basicSetDefaultValueAttachment(newDefaultValueAttachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_ATTACHMENT, newDefaultValueAttachment, newDefaultValueAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getDefaultValueCodeableConcept() {
		return defaultValueCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueCodeableConcept(CodeableConcept newDefaultValueCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldDefaultValueCodeableConcept = defaultValueCodeableConcept;
		defaultValueCodeableConcept = newDefaultValueCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CODEABLE_CONCEPT, oldDefaultValueCodeableConcept, newDefaultValueCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueCodeableConcept(CodeableConcept newDefaultValueCodeableConcept) {
		if (newDefaultValueCodeableConcept != defaultValueCodeableConcept) {
			NotificationChain msgs = null;
			if (defaultValueCodeableConcept != null)
				msgs = ((InternalEObject)defaultValueCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CODEABLE_CONCEPT, null, msgs);
			if (newDefaultValueCodeableConcept != null)
				msgs = ((InternalEObject)newDefaultValueCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetDefaultValueCodeableConcept(newDefaultValueCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CODEABLE_CONCEPT, newDefaultValueCodeableConcept, newDefaultValueCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coding getDefaultValueCoding() {
		return defaultValueCoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueCoding(Coding newDefaultValueCoding, NotificationChain msgs) {
		Coding oldDefaultValueCoding = defaultValueCoding;
		defaultValueCoding = newDefaultValueCoding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CODING, oldDefaultValueCoding, newDefaultValueCoding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueCoding(Coding newDefaultValueCoding) {
		if (newDefaultValueCoding != defaultValueCoding) {
			NotificationChain msgs = null;
			if (defaultValueCoding != null)
				msgs = ((InternalEObject)defaultValueCoding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CODING, null, msgs);
			if (newDefaultValueCoding != null)
				msgs = ((InternalEObject)newDefaultValueCoding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CODING, null, msgs);
			msgs = basicSetDefaultValueCoding(newDefaultValueCoding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CODING, newDefaultValueCoding, newDefaultValueCoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactPoint getDefaultValueContactPoint() {
		return defaultValueContactPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueContactPoint(ContactPoint newDefaultValueContactPoint, NotificationChain msgs) {
		ContactPoint oldDefaultValueContactPoint = defaultValueContactPoint;
		defaultValueContactPoint = newDefaultValueContactPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CONTACT_POINT, oldDefaultValueContactPoint, newDefaultValueContactPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueContactPoint(ContactPoint newDefaultValueContactPoint) {
		if (newDefaultValueContactPoint != defaultValueContactPoint) {
			NotificationChain msgs = null;
			if (defaultValueContactPoint != null)
				msgs = ((InternalEObject)defaultValueContactPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CONTACT_POINT, null, msgs);
			if (newDefaultValueContactPoint != null)
				msgs = ((InternalEObject)newDefaultValueContactPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CONTACT_POINT, null, msgs);
			msgs = basicSetDefaultValueContactPoint(newDefaultValueContactPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CONTACT_POINT, newDefaultValueContactPoint, newDefaultValueContactPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Count getDefaultValueCount() {
		return defaultValueCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueCount(Count newDefaultValueCount, NotificationChain msgs) {
		Count oldDefaultValueCount = defaultValueCount;
		defaultValueCount = newDefaultValueCount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_COUNT, oldDefaultValueCount, newDefaultValueCount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueCount(Count newDefaultValueCount) {
		if (newDefaultValueCount != defaultValueCount) {
			NotificationChain msgs = null;
			if (defaultValueCount != null)
				msgs = ((InternalEObject)defaultValueCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_COUNT, null, msgs);
			if (newDefaultValueCount != null)
				msgs = ((InternalEObject)newDefaultValueCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_COUNT, null, msgs);
			msgs = basicSetDefaultValueCount(newDefaultValueCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_COUNT, newDefaultValueCount, newDefaultValueCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Distance getDefaultValueDistance() {
		return defaultValueDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueDistance(Distance newDefaultValueDistance, NotificationChain msgs) {
		Distance oldDefaultValueDistance = defaultValueDistance;
		defaultValueDistance = newDefaultValueDistance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DISTANCE, oldDefaultValueDistance, newDefaultValueDistance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueDistance(Distance newDefaultValueDistance) {
		if (newDefaultValueDistance != defaultValueDistance) {
			NotificationChain msgs = null;
			if (defaultValueDistance != null)
				msgs = ((InternalEObject)defaultValueDistance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DISTANCE, null, msgs);
			if (newDefaultValueDistance != null)
				msgs = ((InternalEObject)newDefaultValueDistance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DISTANCE, null, msgs);
			msgs = basicSetDefaultValueDistance(newDefaultValueDistance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DISTANCE, newDefaultValueDistance, newDefaultValueDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getDefaultValueDuration() {
		return defaultValueDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueDuration(Duration newDefaultValueDuration, NotificationChain msgs) {
		Duration oldDefaultValueDuration = defaultValueDuration;
		defaultValueDuration = newDefaultValueDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DURATION, oldDefaultValueDuration, newDefaultValueDuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueDuration(Duration newDefaultValueDuration) {
		if (newDefaultValueDuration != defaultValueDuration) {
			NotificationChain msgs = null;
			if (defaultValueDuration != null)
				msgs = ((InternalEObject)defaultValueDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DURATION, null, msgs);
			if (newDefaultValueDuration != null)
				msgs = ((InternalEObject)newDefaultValueDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DURATION, null, msgs);
			msgs = basicSetDefaultValueDuration(newDefaultValueDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DURATION, newDefaultValueDuration, newDefaultValueDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HumanName getDefaultValueHumanName() {
		return defaultValueHumanName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueHumanName(HumanName newDefaultValueHumanName, NotificationChain msgs) {
		HumanName oldDefaultValueHumanName = defaultValueHumanName;
		defaultValueHumanName = newDefaultValueHumanName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_HUMAN_NAME, oldDefaultValueHumanName, newDefaultValueHumanName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueHumanName(HumanName newDefaultValueHumanName) {
		if (newDefaultValueHumanName != defaultValueHumanName) {
			NotificationChain msgs = null;
			if (defaultValueHumanName != null)
				msgs = ((InternalEObject)defaultValueHumanName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_HUMAN_NAME, null, msgs);
			if (newDefaultValueHumanName != null)
				msgs = ((InternalEObject)newDefaultValueHumanName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_HUMAN_NAME, null, msgs);
			msgs = basicSetDefaultValueHumanName(newDefaultValueHumanName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_HUMAN_NAME, newDefaultValueHumanName, newDefaultValueHumanName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getDefaultValueIdentifier() {
		return defaultValueIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueIdentifier(Identifier newDefaultValueIdentifier, NotificationChain msgs) {
		Identifier oldDefaultValueIdentifier = defaultValueIdentifier;
		defaultValueIdentifier = newDefaultValueIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_IDENTIFIER, oldDefaultValueIdentifier, newDefaultValueIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueIdentifier(Identifier newDefaultValueIdentifier) {
		if (newDefaultValueIdentifier != defaultValueIdentifier) {
			NotificationChain msgs = null;
			if (defaultValueIdentifier != null)
				msgs = ((InternalEObject)defaultValueIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_IDENTIFIER, null, msgs);
			if (newDefaultValueIdentifier != null)
				msgs = ((InternalEObject)newDefaultValueIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_IDENTIFIER, null, msgs);
			msgs = basicSetDefaultValueIdentifier(newDefaultValueIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_IDENTIFIER, newDefaultValueIdentifier, newDefaultValueIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Money getDefaultValueMoney() {
		return defaultValueMoney;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueMoney(Money newDefaultValueMoney, NotificationChain msgs) {
		Money oldDefaultValueMoney = defaultValueMoney;
		defaultValueMoney = newDefaultValueMoney;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_MONEY, oldDefaultValueMoney, newDefaultValueMoney);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueMoney(Money newDefaultValueMoney) {
		if (newDefaultValueMoney != defaultValueMoney) {
			NotificationChain msgs = null;
			if (defaultValueMoney != null)
				msgs = ((InternalEObject)defaultValueMoney).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_MONEY, null, msgs);
			if (newDefaultValueMoney != null)
				msgs = ((InternalEObject)newDefaultValueMoney).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_MONEY, null, msgs);
			msgs = basicSetDefaultValueMoney(newDefaultValueMoney, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_MONEY, newDefaultValueMoney, newDefaultValueMoney));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getDefaultValuePeriod() {
		return defaultValuePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValuePeriod(Period newDefaultValuePeriod, NotificationChain msgs) {
		Period oldDefaultValuePeriod = defaultValuePeriod;
		defaultValuePeriod = newDefaultValuePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_PERIOD, oldDefaultValuePeriod, newDefaultValuePeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValuePeriod(Period newDefaultValuePeriod) {
		if (newDefaultValuePeriod != defaultValuePeriod) {
			NotificationChain msgs = null;
			if (defaultValuePeriod != null)
				msgs = ((InternalEObject)defaultValuePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_PERIOD, null, msgs);
			if (newDefaultValuePeriod != null)
				msgs = ((InternalEObject)newDefaultValuePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_PERIOD, null, msgs);
			msgs = basicSetDefaultValuePeriod(newDefaultValuePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_PERIOD, newDefaultValuePeriod, newDefaultValuePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getDefaultValueQuantity() {
		return defaultValueQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueQuantity(Quantity newDefaultValueQuantity, NotificationChain msgs) {
		Quantity oldDefaultValueQuantity = defaultValueQuantity;
		defaultValueQuantity = newDefaultValueQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_QUANTITY, oldDefaultValueQuantity, newDefaultValueQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueQuantity(Quantity newDefaultValueQuantity) {
		if (newDefaultValueQuantity != defaultValueQuantity) {
			NotificationChain msgs = null;
			if (defaultValueQuantity != null)
				msgs = ((InternalEObject)defaultValueQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_QUANTITY, null, msgs);
			if (newDefaultValueQuantity != null)
				msgs = ((InternalEObject)newDefaultValueQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_QUANTITY, null, msgs);
			msgs = basicSetDefaultValueQuantity(newDefaultValueQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_QUANTITY, newDefaultValueQuantity, newDefaultValueQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Range getDefaultValueRange() {
		return defaultValueRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueRange(Range newDefaultValueRange, NotificationChain msgs) {
		Range oldDefaultValueRange = defaultValueRange;
		defaultValueRange = newDefaultValueRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_RANGE, oldDefaultValueRange, newDefaultValueRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueRange(Range newDefaultValueRange) {
		if (newDefaultValueRange != defaultValueRange) {
			NotificationChain msgs = null;
			if (defaultValueRange != null)
				msgs = ((InternalEObject)defaultValueRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_RANGE, null, msgs);
			if (newDefaultValueRange != null)
				msgs = ((InternalEObject)newDefaultValueRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_RANGE, null, msgs);
			msgs = basicSetDefaultValueRange(newDefaultValueRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_RANGE, newDefaultValueRange, newDefaultValueRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ratio getDefaultValueRatio() {
		return defaultValueRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueRatio(Ratio newDefaultValueRatio, NotificationChain msgs) {
		Ratio oldDefaultValueRatio = defaultValueRatio;
		defaultValueRatio = newDefaultValueRatio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_RATIO, oldDefaultValueRatio, newDefaultValueRatio);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueRatio(Ratio newDefaultValueRatio) {
		if (newDefaultValueRatio != defaultValueRatio) {
			NotificationChain msgs = null;
			if (defaultValueRatio != null)
				msgs = ((InternalEObject)defaultValueRatio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_RATIO, null, msgs);
			if (newDefaultValueRatio != null)
				msgs = ((InternalEObject)newDefaultValueRatio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_RATIO, null, msgs);
			msgs = basicSetDefaultValueRatio(newDefaultValueRatio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_RATIO, newDefaultValueRatio, newDefaultValueRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getDefaultValueReference() {
		return defaultValueReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueReference(Reference newDefaultValueReference, NotificationChain msgs) {
		Reference oldDefaultValueReference = defaultValueReference;
		defaultValueReference = newDefaultValueReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_REFERENCE, oldDefaultValueReference, newDefaultValueReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueReference(Reference newDefaultValueReference) {
		if (newDefaultValueReference != defaultValueReference) {
			NotificationChain msgs = null;
			if (defaultValueReference != null)
				msgs = ((InternalEObject)defaultValueReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_REFERENCE, null, msgs);
			if (newDefaultValueReference != null)
				msgs = ((InternalEObject)newDefaultValueReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_REFERENCE, null, msgs);
			msgs = basicSetDefaultValueReference(newDefaultValueReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_REFERENCE, newDefaultValueReference, newDefaultValueReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SampledData getDefaultValueSampledData() {
		return defaultValueSampledData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueSampledData(SampledData newDefaultValueSampledData, NotificationChain msgs) {
		SampledData oldDefaultValueSampledData = defaultValueSampledData;
		defaultValueSampledData = newDefaultValueSampledData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_SAMPLED_DATA, oldDefaultValueSampledData, newDefaultValueSampledData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueSampledData(SampledData newDefaultValueSampledData) {
		if (newDefaultValueSampledData != defaultValueSampledData) {
			NotificationChain msgs = null;
			if (defaultValueSampledData != null)
				msgs = ((InternalEObject)defaultValueSampledData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_SAMPLED_DATA, null, msgs);
			if (newDefaultValueSampledData != null)
				msgs = ((InternalEObject)newDefaultValueSampledData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_SAMPLED_DATA, null, msgs);
			msgs = basicSetDefaultValueSampledData(newDefaultValueSampledData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_SAMPLED_DATA, newDefaultValueSampledData, newDefaultValueSampledData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signature getDefaultValueSignature() {
		return defaultValueSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueSignature(Signature newDefaultValueSignature, NotificationChain msgs) {
		Signature oldDefaultValueSignature = defaultValueSignature;
		defaultValueSignature = newDefaultValueSignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_SIGNATURE, oldDefaultValueSignature, newDefaultValueSignature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueSignature(Signature newDefaultValueSignature) {
		if (newDefaultValueSignature != defaultValueSignature) {
			NotificationChain msgs = null;
			if (defaultValueSignature != null)
				msgs = ((InternalEObject)defaultValueSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_SIGNATURE, null, msgs);
			if (newDefaultValueSignature != null)
				msgs = ((InternalEObject)newDefaultValueSignature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_SIGNATURE, null, msgs);
			msgs = basicSetDefaultValueSignature(newDefaultValueSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_SIGNATURE, newDefaultValueSignature, newDefaultValueSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Timing getDefaultValueTiming() {
		return defaultValueTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueTiming(Timing newDefaultValueTiming, NotificationChain msgs) {
		Timing oldDefaultValueTiming = defaultValueTiming;
		defaultValueTiming = newDefaultValueTiming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_TIMING, oldDefaultValueTiming, newDefaultValueTiming);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueTiming(Timing newDefaultValueTiming) {
		if (newDefaultValueTiming != defaultValueTiming) {
			NotificationChain msgs = null;
			if (defaultValueTiming != null)
				msgs = ((InternalEObject)defaultValueTiming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_TIMING, null, msgs);
			if (newDefaultValueTiming != null)
				msgs = ((InternalEObject)newDefaultValueTiming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_TIMING, null, msgs);
			msgs = basicSetDefaultValueTiming(newDefaultValueTiming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_TIMING, newDefaultValueTiming, newDefaultValueTiming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactDetail getDefaultValueContactDetail() {
		return defaultValueContactDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueContactDetail(ContactDetail newDefaultValueContactDetail, NotificationChain msgs) {
		ContactDetail oldDefaultValueContactDetail = defaultValueContactDetail;
		defaultValueContactDetail = newDefaultValueContactDetail;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CONTACT_DETAIL, oldDefaultValueContactDetail, newDefaultValueContactDetail);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueContactDetail(ContactDetail newDefaultValueContactDetail) {
		if (newDefaultValueContactDetail != defaultValueContactDetail) {
			NotificationChain msgs = null;
			if (defaultValueContactDetail != null)
				msgs = ((InternalEObject)defaultValueContactDetail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CONTACT_DETAIL, null, msgs);
			if (newDefaultValueContactDetail != null)
				msgs = ((InternalEObject)newDefaultValueContactDetail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CONTACT_DETAIL, null, msgs);
			msgs = basicSetDefaultValueContactDetail(newDefaultValueContactDetail, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CONTACT_DETAIL, newDefaultValueContactDetail, newDefaultValueContactDetail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Contributor getDefaultValueContributor() {
		return defaultValueContributor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueContributor(Contributor newDefaultValueContributor, NotificationChain msgs) {
		Contributor oldDefaultValueContributor = defaultValueContributor;
		defaultValueContributor = newDefaultValueContributor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CONTRIBUTOR, oldDefaultValueContributor, newDefaultValueContributor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueContributor(Contributor newDefaultValueContributor) {
		if (newDefaultValueContributor != defaultValueContributor) {
			NotificationChain msgs = null;
			if (defaultValueContributor != null)
				msgs = ((InternalEObject)defaultValueContributor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CONTRIBUTOR, null, msgs);
			if (newDefaultValueContributor != null)
				msgs = ((InternalEObject)newDefaultValueContributor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CONTRIBUTOR, null, msgs);
			msgs = basicSetDefaultValueContributor(newDefaultValueContributor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CONTRIBUTOR, newDefaultValueContributor, newDefaultValueContributor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataRequirement getDefaultValueDataRequirement() {
		return defaultValueDataRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueDataRequirement(DataRequirement newDefaultValueDataRequirement, NotificationChain msgs) {
		DataRequirement oldDefaultValueDataRequirement = defaultValueDataRequirement;
		defaultValueDataRequirement = newDefaultValueDataRequirement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DATA_REQUIREMENT, oldDefaultValueDataRequirement, newDefaultValueDataRequirement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueDataRequirement(DataRequirement newDefaultValueDataRequirement) {
		if (newDefaultValueDataRequirement != defaultValueDataRequirement) {
			NotificationChain msgs = null;
			if (defaultValueDataRequirement != null)
				msgs = ((InternalEObject)defaultValueDataRequirement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DATA_REQUIREMENT, null, msgs);
			if (newDefaultValueDataRequirement != null)
				msgs = ((InternalEObject)newDefaultValueDataRequirement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DATA_REQUIREMENT, null, msgs);
			msgs = basicSetDefaultValueDataRequirement(newDefaultValueDataRequirement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DATA_REQUIREMENT, newDefaultValueDataRequirement, newDefaultValueDataRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getDefaultValueExpression() {
		return defaultValueExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueExpression(Expression newDefaultValueExpression, NotificationChain msgs) {
		Expression oldDefaultValueExpression = defaultValueExpression;
		defaultValueExpression = newDefaultValueExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_EXPRESSION, oldDefaultValueExpression, newDefaultValueExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueExpression(Expression newDefaultValueExpression) {
		if (newDefaultValueExpression != defaultValueExpression) {
			NotificationChain msgs = null;
			if (defaultValueExpression != null)
				msgs = ((InternalEObject)defaultValueExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_EXPRESSION, null, msgs);
			if (newDefaultValueExpression != null)
				msgs = ((InternalEObject)newDefaultValueExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_EXPRESSION, null, msgs);
			msgs = basicSetDefaultValueExpression(newDefaultValueExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_EXPRESSION, newDefaultValueExpression, newDefaultValueExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterDefinition getDefaultValueParameterDefinition() {
		return defaultValueParameterDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueParameterDefinition(ParameterDefinition newDefaultValueParameterDefinition, NotificationChain msgs) {
		ParameterDefinition oldDefaultValueParameterDefinition = defaultValueParameterDefinition;
		defaultValueParameterDefinition = newDefaultValueParameterDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_PARAMETER_DEFINITION, oldDefaultValueParameterDefinition, newDefaultValueParameterDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueParameterDefinition(ParameterDefinition newDefaultValueParameterDefinition) {
		if (newDefaultValueParameterDefinition != defaultValueParameterDefinition) {
			NotificationChain msgs = null;
			if (defaultValueParameterDefinition != null)
				msgs = ((InternalEObject)defaultValueParameterDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_PARAMETER_DEFINITION, null, msgs);
			if (newDefaultValueParameterDefinition != null)
				msgs = ((InternalEObject)newDefaultValueParameterDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_PARAMETER_DEFINITION, null, msgs);
			msgs = basicSetDefaultValueParameterDefinition(newDefaultValueParameterDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_PARAMETER_DEFINITION, newDefaultValueParameterDefinition, newDefaultValueParameterDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelatedArtifact getDefaultValueRelatedArtifact() {
		return defaultValueRelatedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueRelatedArtifact(RelatedArtifact newDefaultValueRelatedArtifact, NotificationChain msgs) {
		RelatedArtifact oldDefaultValueRelatedArtifact = defaultValueRelatedArtifact;
		defaultValueRelatedArtifact = newDefaultValueRelatedArtifact;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_RELATED_ARTIFACT, oldDefaultValueRelatedArtifact, newDefaultValueRelatedArtifact);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueRelatedArtifact(RelatedArtifact newDefaultValueRelatedArtifact) {
		if (newDefaultValueRelatedArtifact != defaultValueRelatedArtifact) {
			NotificationChain msgs = null;
			if (defaultValueRelatedArtifact != null)
				msgs = ((InternalEObject)defaultValueRelatedArtifact).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_RELATED_ARTIFACT, null, msgs);
			if (newDefaultValueRelatedArtifact != null)
				msgs = ((InternalEObject)newDefaultValueRelatedArtifact).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_RELATED_ARTIFACT, null, msgs);
			msgs = basicSetDefaultValueRelatedArtifact(newDefaultValueRelatedArtifact, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_RELATED_ARTIFACT, newDefaultValueRelatedArtifact, newDefaultValueRelatedArtifact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TriggerDefinition getDefaultValueTriggerDefinition() {
		return defaultValueTriggerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueTriggerDefinition(TriggerDefinition newDefaultValueTriggerDefinition, NotificationChain msgs) {
		TriggerDefinition oldDefaultValueTriggerDefinition = defaultValueTriggerDefinition;
		defaultValueTriggerDefinition = newDefaultValueTriggerDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_TRIGGER_DEFINITION, oldDefaultValueTriggerDefinition, newDefaultValueTriggerDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueTriggerDefinition(TriggerDefinition newDefaultValueTriggerDefinition) {
		if (newDefaultValueTriggerDefinition != defaultValueTriggerDefinition) {
			NotificationChain msgs = null;
			if (defaultValueTriggerDefinition != null)
				msgs = ((InternalEObject)defaultValueTriggerDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_TRIGGER_DEFINITION, null, msgs);
			if (newDefaultValueTriggerDefinition != null)
				msgs = ((InternalEObject)newDefaultValueTriggerDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_TRIGGER_DEFINITION, null, msgs);
			msgs = basicSetDefaultValueTriggerDefinition(newDefaultValueTriggerDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_TRIGGER_DEFINITION, newDefaultValueTriggerDefinition, newDefaultValueTriggerDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UsageContext getDefaultValueUsageContext() {
		return defaultValueUsageContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueUsageContext(UsageContext newDefaultValueUsageContext, NotificationChain msgs) {
		UsageContext oldDefaultValueUsageContext = defaultValueUsageContext;
		defaultValueUsageContext = newDefaultValueUsageContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_USAGE_CONTEXT, oldDefaultValueUsageContext, newDefaultValueUsageContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueUsageContext(UsageContext newDefaultValueUsageContext) {
		if (newDefaultValueUsageContext != defaultValueUsageContext) {
			NotificationChain msgs = null;
			if (defaultValueUsageContext != null)
				msgs = ((InternalEObject)defaultValueUsageContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_USAGE_CONTEXT, null, msgs);
			if (newDefaultValueUsageContext != null)
				msgs = ((InternalEObject)newDefaultValueUsageContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_USAGE_CONTEXT, null, msgs);
			msgs = basicSetDefaultValueUsageContext(newDefaultValueUsageContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_USAGE_CONTEXT, newDefaultValueUsageContext, newDefaultValueUsageContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dosage getDefaultValueDosage() {
		return defaultValueDosage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueDosage(Dosage newDefaultValueDosage, NotificationChain msgs) {
		Dosage oldDefaultValueDosage = defaultValueDosage;
		defaultValueDosage = newDefaultValueDosage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DOSAGE, oldDefaultValueDosage, newDefaultValueDosage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueDosage(Dosage newDefaultValueDosage) {
		if (newDefaultValueDosage != defaultValueDosage) {
			NotificationChain msgs = null;
			if (defaultValueDosage != null)
				msgs = ((InternalEObject)defaultValueDosage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DOSAGE, null, msgs);
			if (newDefaultValueDosage != null)
				msgs = ((InternalEObject)newDefaultValueDosage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DOSAGE, null, msgs);
			msgs = basicSetDefaultValueDosage(newDefaultValueDosage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DOSAGE, newDefaultValueDosage, newDefaultValueDosage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Meta getDefaultValueMeta() {
		return defaultValueMeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueMeta(Meta newDefaultValueMeta, NotificationChain msgs) {
		Meta oldDefaultValueMeta = defaultValueMeta;
		defaultValueMeta = newDefaultValueMeta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_META, oldDefaultValueMeta, newDefaultValueMeta);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueMeta(Meta newDefaultValueMeta) {
		if (newDefaultValueMeta != defaultValueMeta) {
			NotificationChain msgs = null;
			if (defaultValueMeta != null)
				msgs = ((InternalEObject)defaultValueMeta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_META, null, msgs);
			if (newDefaultValueMeta != null)
				msgs = ((InternalEObject)newDefaultValueMeta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_META, null, msgs);
			msgs = basicSetDefaultValueMeta(newDefaultValueMeta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_META, newDefaultValueMeta, newDefaultValueMeta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElement(org.hl7.fhir.String newElement, NotificationChain msgs) {
		org.hl7.fhir.String oldElement = element;
		element = newElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__ELEMENT, oldElement, newElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElement(org.hl7.fhir.String newElement) {
		if (newElement != element) {
			NotificationChain msgs = null;
			if (element != null)
				msgs = ((InternalEObject)element).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__ELEMENT, null, msgs);
			if (newElement != null)
				msgs = ((InternalEObject)newElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__ELEMENT, null, msgs);
			msgs = basicSetElement(newElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__ELEMENT, newElement, newElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructureMapSourceListMode getListMode() {
		return listMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListMode(StructureMapSourceListMode newListMode, NotificationChain msgs) {
		StructureMapSourceListMode oldListMode = listMode;
		listMode = newListMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__LIST_MODE, oldListMode, newListMode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setListMode(StructureMapSourceListMode newListMode) {
		if (newListMode != listMode) {
			NotificationChain msgs = null;
			if (listMode != null)
				msgs = ((InternalEObject)listMode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__LIST_MODE, null, msgs);
			if (newListMode != null)
				msgs = ((InternalEObject)newListMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__LIST_MODE, null, msgs);
			msgs = basicSetListMode(newListMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__LIST_MODE, newListMode, newListMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Id getVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariable(Id newVariable, NotificationChain msgs) {
		Id oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__VARIABLE, oldVariable, newVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariable(Id newVariable) {
		if (newVariable != variable) {
			NotificationChain msgs = null;
			if (variable != null)
				msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__VARIABLE, null, msgs);
			if (newVariable != null)
				msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__VARIABLE, null, msgs);
			msgs = basicSetVariable(newVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__VARIABLE, newVariable, newVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(org.hl7.fhir.String newCondition, NotificationChain msgs) {
		org.hl7.fhir.String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(org.hl7.fhir.String newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getCheck() {
		return check;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCheck(org.hl7.fhir.String newCheck, NotificationChain msgs) {
		org.hl7.fhir.String oldCheck = check;
		check = newCheck;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__CHECK, oldCheck, newCheck);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCheck(org.hl7.fhir.String newCheck) {
		if (newCheck != check) {
			NotificationChain msgs = null;
			if (check != null)
				msgs = ((InternalEObject)check).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__CHECK, null, msgs);
			if (newCheck != null)
				msgs = ((InternalEObject)newCheck).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__CHECK, null, msgs);
			msgs = basicSetCheck(newCheck, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__CHECK, newCheck, newCheck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getLogMessage() {
		return logMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogMessage(org.hl7.fhir.String newLogMessage, NotificationChain msgs) {
		org.hl7.fhir.String oldLogMessage = logMessage;
		logMessage = newLogMessage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__LOG_MESSAGE, oldLogMessage, newLogMessage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogMessage(org.hl7.fhir.String newLogMessage) {
		if (newLogMessage != logMessage) {
			NotificationChain msgs = null;
			if (logMessage != null)
				msgs = ((InternalEObject)logMessage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__LOG_MESSAGE, null, msgs);
			if (newLogMessage != null)
				msgs = ((InternalEObject)newLogMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__LOG_MESSAGE, null, msgs);
			msgs = basicSetLogMessage(newLogMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__LOG_MESSAGE, newLogMessage, newLogMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.STRUCTURE_MAP_SOURCE__CONTEXT:
				return basicSetContext(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__MIN:
				return basicSetMin(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__MAX:
				return basicSetMax(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_BASE64_BINARY:
				return basicSetDefaultValueBase64Binary(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_BOOLEAN:
				return basicSetDefaultValueBoolean(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CANONICAL:
				return basicSetDefaultValueCanonical(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CODE:
				return basicSetDefaultValueCode(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DATE:
				return basicSetDefaultValueDate(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DATE_TIME:
				return basicSetDefaultValueDateTime(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DECIMAL:
				return basicSetDefaultValueDecimal(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_ID:
				return basicSetDefaultValueId(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_INSTANT:
				return basicSetDefaultValueInstant(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_INTEGER:
				return basicSetDefaultValueInteger(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_MARKDOWN:
				return basicSetDefaultValueMarkdown(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_OID:
				return basicSetDefaultValueOid(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_POSITIVE_INT:
				return basicSetDefaultValuePositiveInt(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_STRING:
				return basicSetDefaultValueString(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_TIME:
				return basicSetDefaultValueTime(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_UNSIGNED_INT:
				return basicSetDefaultValueUnsignedInt(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_URI:
				return basicSetDefaultValueUri(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_URL:
				return basicSetDefaultValueUrl(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_UUID:
				return basicSetDefaultValueUuid(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_ADDRESS:
				return basicSetDefaultValueAddress(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_AGE:
				return basicSetDefaultValueAge(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_ANNOTATION:
				return basicSetDefaultValueAnnotation(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_ATTACHMENT:
				return basicSetDefaultValueAttachment(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CODEABLE_CONCEPT:
				return basicSetDefaultValueCodeableConcept(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CODING:
				return basicSetDefaultValueCoding(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CONTACT_POINT:
				return basicSetDefaultValueContactPoint(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_COUNT:
				return basicSetDefaultValueCount(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DISTANCE:
				return basicSetDefaultValueDistance(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DURATION:
				return basicSetDefaultValueDuration(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_HUMAN_NAME:
				return basicSetDefaultValueHumanName(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_IDENTIFIER:
				return basicSetDefaultValueIdentifier(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_MONEY:
				return basicSetDefaultValueMoney(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_PERIOD:
				return basicSetDefaultValuePeriod(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_QUANTITY:
				return basicSetDefaultValueQuantity(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_RANGE:
				return basicSetDefaultValueRange(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_RATIO:
				return basicSetDefaultValueRatio(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_REFERENCE:
				return basicSetDefaultValueReference(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_SAMPLED_DATA:
				return basicSetDefaultValueSampledData(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_SIGNATURE:
				return basicSetDefaultValueSignature(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_TIMING:
				return basicSetDefaultValueTiming(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CONTACT_DETAIL:
				return basicSetDefaultValueContactDetail(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CONTRIBUTOR:
				return basicSetDefaultValueContributor(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DATA_REQUIREMENT:
				return basicSetDefaultValueDataRequirement(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_EXPRESSION:
				return basicSetDefaultValueExpression(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_PARAMETER_DEFINITION:
				return basicSetDefaultValueParameterDefinition(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_RELATED_ARTIFACT:
				return basicSetDefaultValueRelatedArtifact(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_TRIGGER_DEFINITION:
				return basicSetDefaultValueTriggerDefinition(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_USAGE_CONTEXT:
				return basicSetDefaultValueUsageContext(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DOSAGE:
				return basicSetDefaultValueDosage(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_META:
				return basicSetDefaultValueMeta(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__ELEMENT:
				return basicSetElement(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__LIST_MODE:
				return basicSetListMode(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__VARIABLE:
				return basicSetVariable(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__CONDITION:
				return basicSetCondition(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__CHECK:
				return basicSetCheck(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__LOG_MESSAGE:
				return basicSetLogMessage(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirPackage.STRUCTURE_MAP_SOURCE__CONTEXT:
				return getContext();
			case FhirPackage.STRUCTURE_MAP_SOURCE__MIN:
				return getMin();
			case FhirPackage.STRUCTURE_MAP_SOURCE__MAX:
				return getMax();
			case FhirPackage.STRUCTURE_MAP_SOURCE__TYPE:
				return getType();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_BASE64_BINARY:
				return getDefaultValueBase64Binary();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_BOOLEAN:
				return getDefaultValueBoolean();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CANONICAL:
				return getDefaultValueCanonical();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CODE:
				return getDefaultValueCode();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DATE:
				return getDefaultValueDate();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DATE_TIME:
				return getDefaultValueDateTime();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DECIMAL:
				return getDefaultValueDecimal();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_ID:
				return getDefaultValueId();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_INSTANT:
				return getDefaultValueInstant();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_INTEGER:
				return getDefaultValueInteger();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_MARKDOWN:
				return getDefaultValueMarkdown();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_OID:
				return getDefaultValueOid();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_POSITIVE_INT:
				return getDefaultValuePositiveInt();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_STRING:
				return getDefaultValueString();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_TIME:
				return getDefaultValueTime();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_UNSIGNED_INT:
				return getDefaultValueUnsignedInt();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_URI:
				return getDefaultValueUri();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_URL:
				return getDefaultValueUrl();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_UUID:
				return getDefaultValueUuid();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_ADDRESS:
				return getDefaultValueAddress();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_AGE:
				return getDefaultValueAge();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_ANNOTATION:
				return getDefaultValueAnnotation();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_ATTACHMENT:
				return getDefaultValueAttachment();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CODEABLE_CONCEPT:
				return getDefaultValueCodeableConcept();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CODING:
				return getDefaultValueCoding();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CONTACT_POINT:
				return getDefaultValueContactPoint();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_COUNT:
				return getDefaultValueCount();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DISTANCE:
				return getDefaultValueDistance();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DURATION:
				return getDefaultValueDuration();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_HUMAN_NAME:
				return getDefaultValueHumanName();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_IDENTIFIER:
				return getDefaultValueIdentifier();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_MONEY:
				return getDefaultValueMoney();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_PERIOD:
				return getDefaultValuePeriod();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_QUANTITY:
				return getDefaultValueQuantity();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_RANGE:
				return getDefaultValueRange();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_RATIO:
				return getDefaultValueRatio();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_REFERENCE:
				return getDefaultValueReference();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_SAMPLED_DATA:
				return getDefaultValueSampledData();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_SIGNATURE:
				return getDefaultValueSignature();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_TIMING:
				return getDefaultValueTiming();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CONTACT_DETAIL:
				return getDefaultValueContactDetail();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CONTRIBUTOR:
				return getDefaultValueContributor();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DATA_REQUIREMENT:
				return getDefaultValueDataRequirement();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_EXPRESSION:
				return getDefaultValueExpression();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_PARAMETER_DEFINITION:
				return getDefaultValueParameterDefinition();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_RELATED_ARTIFACT:
				return getDefaultValueRelatedArtifact();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_TRIGGER_DEFINITION:
				return getDefaultValueTriggerDefinition();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_USAGE_CONTEXT:
				return getDefaultValueUsageContext();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DOSAGE:
				return getDefaultValueDosage();
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_META:
				return getDefaultValueMeta();
			case FhirPackage.STRUCTURE_MAP_SOURCE__ELEMENT:
				return getElement();
			case FhirPackage.STRUCTURE_MAP_SOURCE__LIST_MODE:
				return getListMode();
			case FhirPackage.STRUCTURE_MAP_SOURCE__VARIABLE:
				return getVariable();
			case FhirPackage.STRUCTURE_MAP_SOURCE__CONDITION:
				return getCondition();
			case FhirPackage.STRUCTURE_MAP_SOURCE__CHECK:
				return getCheck();
			case FhirPackage.STRUCTURE_MAP_SOURCE__LOG_MESSAGE:
				return getLogMessage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.STRUCTURE_MAP_SOURCE__CONTEXT:
				setContext((Id)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__MIN:
				setMin((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__MAX:
				setMax((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__TYPE:
				setType((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_BASE64_BINARY:
				setDefaultValueBase64Binary((Base64Binary)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_BOOLEAN:
				setDefaultValueBoolean((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CANONICAL:
				setDefaultValueCanonical((Canonical)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CODE:
				setDefaultValueCode((Code)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DATE:
				setDefaultValueDate((Date)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DATE_TIME:
				setDefaultValueDateTime((DateTime)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DECIMAL:
				setDefaultValueDecimal((Decimal)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_ID:
				setDefaultValueId((Id)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_INSTANT:
				setDefaultValueInstant((Instant)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_INTEGER:
				setDefaultValueInteger((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_MARKDOWN:
				setDefaultValueMarkdown((Markdown)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_OID:
				setDefaultValueOid((Oid)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_POSITIVE_INT:
				setDefaultValuePositiveInt((PositiveInt)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_STRING:
				setDefaultValueString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_TIME:
				setDefaultValueTime((Time)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_UNSIGNED_INT:
				setDefaultValueUnsignedInt((UnsignedInt)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_URI:
				setDefaultValueUri((Uri)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_URL:
				setDefaultValueUrl((Url)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_UUID:
				setDefaultValueUuid((Uuid)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_ADDRESS:
				setDefaultValueAddress((Address)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_AGE:
				setDefaultValueAge((Age)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_ANNOTATION:
				setDefaultValueAnnotation((Annotation)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_ATTACHMENT:
				setDefaultValueAttachment((Attachment)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CODEABLE_CONCEPT:
				setDefaultValueCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CODING:
				setDefaultValueCoding((Coding)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CONTACT_POINT:
				setDefaultValueContactPoint((ContactPoint)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_COUNT:
				setDefaultValueCount((Count)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DISTANCE:
				setDefaultValueDistance((Distance)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DURATION:
				setDefaultValueDuration((Duration)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_HUMAN_NAME:
				setDefaultValueHumanName((HumanName)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_IDENTIFIER:
				setDefaultValueIdentifier((Identifier)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_MONEY:
				setDefaultValueMoney((Money)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_PERIOD:
				setDefaultValuePeriod((Period)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_QUANTITY:
				setDefaultValueQuantity((Quantity)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_RANGE:
				setDefaultValueRange((Range)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_RATIO:
				setDefaultValueRatio((Ratio)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_REFERENCE:
				setDefaultValueReference((Reference)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_SAMPLED_DATA:
				setDefaultValueSampledData((SampledData)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_SIGNATURE:
				setDefaultValueSignature((Signature)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_TIMING:
				setDefaultValueTiming((Timing)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CONTACT_DETAIL:
				setDefaultValueContactDetail((ContactDetail)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CONTRIBUTOR:
				setDefaultValueContributor((Contributor)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DATA_REQUIREMENT:
				setDefaultValueDataRequirement((DataRequirement)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_EXPRESSION:
				setDefaultValueExpression((Expression)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_PARAMETER_DEFINITION:
				setDefaultValueParameterDefinition((ParameterDefinition)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_RELATED_ARTIFACT:
				setDefaultValueRelatedArtifact((RelatedArtifact)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_TRIGGER_DEFINITION:
				setDefaultValueTriggerDefinition((TriggerDefinition)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_USAGE_CONTEXT:
				setDefaultValueUsageContext((UsageContext)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DOSAGE:
				setDefaultValueDosage((Dosage)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_META:
				setDefaultValueMeta((Meta)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__ELEMENT:
				setElement((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__LIST_MODE:
				setListMode((StructureMapSourceListMode)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__VARIABLE:
				setVariable((Id)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__CONDITION:
				setCondition((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__CHECK:
				setCheck((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__LOG_MESSAGE:
				setLogMessage((org.hl7.fhir.String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FhirPackage.STRUCTURE_MAP_SOURCE__CONTEXT:
				setContext((Id)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__MIN:
				setMin((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__MAX:
				setMax((org.hl7.fhir.String)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__TYPE:
				setType((org.hl7.fhir.String)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_BASE64_BINARY:
				setDefaultValueBase64Binary((Base64Binary)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_BOOLEAN:
				setDefaultValueBoolean((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CANONICAL:
				setDefaultValueCanonical((Canonical)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CODE:
				setDefaultValueCode((Code)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DATE:
				setDefaultValueDate((Date)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DATE_TIME:
				setDefaultValueDateTime((DateTime)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DECIMAL:
				setDefaultValueDecimal((Decimal)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_ID:
				setDefaultValueId((Id)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_INSTANT:
				setDefaultValueInstant((Instant)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_INTEGER:
				setDefaultValueInteger((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_MARKDOWN:
				setDefaultValueMarkdown((Markdown)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_OID:
				setDefaultValueOid((Oid)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_POSITIVE_INT:
				setDefaultValuePositiveInt((PositiveInt)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_STRING:
				setDefaultValueString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_TIME:
				setDefaultValueTime((Time)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_UNSIGNED_INT:
				setDefaultValueUnsignedInt((UnsignedInt)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_URI:
				setDefaultValueUri((Uri)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_URL:
				setDefaultValueUrl((Url)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_UUID:
				setDefaultValueUuid((Uuid)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_ADDRESS:
				setDefaultValueAddress((Address)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_AGE:
				setDefaultValueAge((Age)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_ANNOTATION:
				setDefaultValueAnnotation((Annotation)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_ATTACHMENT:
				setDefaultValueAttachment((Attachment)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CODEABLE_CONCEPT:
				setDefaultValueCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CODING:
				setDefaultValueCoding((Coding)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CONTACT_POINT:
				setDefaultValueContactPoint((ContactPoint)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_COUNT:
				setDefaultValueCount((Count)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DISTANCE:
				setDefaultValueDistance((Distance)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DURATION:
				setDefaultValueDuration((Duration)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_HUMAN_NAME:
				setDefaultValueHumanName((HumanName)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_IDENTIFIER:
				setDefaultValueIdentifier((Identifier)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_MONEY:
				setDefaultValueMoney((Money)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_PERIOD:
				setDefaultValuePeriod((Period)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_QUANTITY:
				setDefaultValueQuantity((Quantity)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_RANGE:
				setDefaultValueRange((Range)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_RATIO:
				setDefaultValueRatio((Ratio)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_REFERENCE:
				setDefaultValueReference((Reference)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_SAMPLED_DATA:
				setDefaultValueSampledData((SampledData)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_SIGNATURE:
				setDefaultValueSignature((Signature)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_TIMING:
				setDefaultValueTiming((Timing)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CONTACT_DETAIL:
				setDefaultValueContactDetail((ContactDetail)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CONTRIBUTOR:
				setDefaultValueContributor((Contributor)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DATA_REQUIREMENT:
				setDefaultValueDataRequirement((DataRequirement)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_EXPRESSION:
				setDefaultValueExpression((Expression)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_PARAMETER_DEFINITION:
				setDefaultValueParameterDefinition((ParameterDefinition)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_RELATED_ARTIFACT:
				setDefaultValueRelatedArtifact((RelatedArtifact)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_TRIGGER_DEFINITION:
				setDefaultValueTriggerDefinition((TriggerDefinition)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_USAGE_CONTEXT:
				setDefaultValueUsageContext((UsageContext)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DOSAGE:
				setDefaultValueDosage((Dosage)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_META:
				setDefaultValueMeta((Meta)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__ELEMENT:
				setElement((org.hl7.fhir.String)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__LIST_MODE:
				setListMode((StructureMapSourceListMode)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__VARIABLE:
				setVariable((Id)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__CONDITION:
				setCondition((org.hl7.fhir.String)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__CHECK:
				setCheck((org.hl7.fhir.String)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__LOG_MESSAGE:
				setLogMessage((org.hl7.fhir.String)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FhirPackage.STRUCTURE_MAP_SOURCE__CONTEXT:
				return context != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__MIN:
				return min != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__MAX:
				return max != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__TYPE:
				return type != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_BASE64_BINARY:
				return defaultValueBase64Binary != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_BOOLEAN:
				return defaultValueBoolean != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CANONICAL:
				return defaultValueCanonical != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CODE:
				return defaultValueCode != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DATE:
				return defaultValueDate != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DATE_TIME:
				return defaultValueDateTime != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DECIMAL:
				return defaultValueDecimal != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_ID:
				return defaultValueId != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_INSTANT:
				return defaultValueInstant != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_INTEGER:
				return defaultValueInteger != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_MARKDOWN:
				return defaultValueMarkdown != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_OID:
				return defaultValueOid != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_POSITIVE_INT:
				return defaultValuePositiveInt != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_STRING:
				return defaultValueString != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_TIME:
				return defaultValueTime != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_UNSIGNED_INT:
				return defaultValueUnsignedInt != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_URI:
				return defaultValueUri != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_URL:
				return defaultValueUrl != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_UUID:
				return defaultValueUuid != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_ADDRESS:
				return defaultValueAddress != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_AGE:
				return defaultValueAge != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_ANNOTATION:
				return defaultValueAnnotation != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_ATTACHMENT:
				return defaultValueAttachment != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CODEABLE_CONCEPT:
				return defaultValueCodeableConcept != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CODING:
				return defaultValueCoding != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CONTACT_POINT:
				return defaultValueContactPoint != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_COUNT:
				return defaultValueCount != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DISTANCE:
				return defaultValueDistance != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DURATION:
				return defaultValueDuration != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_HUMAN_NAME:
				return defaultValueHumanName != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_IDENTIFIER:
				return defaultValueIdentifier != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_MONEY:
				return defaultValueMoney != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_PERIOD:
				return defaultValuePeriod != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_QUANTITY:
				return defaultValueQuantity != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_RANGE:
				return defaultValueRange != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_RATIO:
				return defaultValueRatio != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_REFERENCE:
				return defaultValueReference != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_SAMPLED_DATA:
				return defaultValueSampledData != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_SIGNATURE:
				return defaultValueSignature != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_TIMING:
				return defaultValueTiming != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CONTACT_DETAIL:
				return defaultValueContactDetail != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_CONTRIBUTOR:
				return defaultValueContributor != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DATA_REQUIREMENT:
				return defaultValueDataRequirement != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_EXPRESSION:
				return defaultValueExpression != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_PARAMETER_DEFINITION:
				return defaultValueParameterDefinition != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_RELATED_ARTIFACT:
				return defaultValueRelatedArtifact != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_TRIGGER_DEFINITION:
				return defaultValueTriggerDefinition != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_USAGE_CONTEXT:
				return defaultValueUsageContext != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_DOSAGE:
				return defaultValueDosage != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__DEFAULT_VALUE_META:
				return defaultValueMeta != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__ELEMENT:
				return element != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__LIST_MODE:
				return listMode != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__VARIABLE:
				return variable != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__CONDITION:
				return condition != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__CHECK:
				return check != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__LOG_MESSAGE:
				return logMessage != null;
		}
		return super.eIsSet(featureID);
	}

} //StructureMapSourceImpl
