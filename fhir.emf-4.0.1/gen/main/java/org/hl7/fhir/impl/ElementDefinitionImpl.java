/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
import org.hl7.fhir.ElementDefinition;
import org.hl7.fhir.ElementDefinitionBase;
import org.hl7.fhir.ElementDefinitionBinding;
import org.hl7.fhir.ElementDefinitionConstraint;
import org.hl7.fhir.ElementDefinitionExample;
import org.hl7.fhir.ElementDefinitionMapping;
import org.hl7.fhir.ElementDefinitionSlicing;
import org.hl7.fhir.ElementDefinitionType;
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
import org.hl7.fhir.PropertyRepresentation;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Range;
import org.hl7.fhir.Ratio;
import org.hl7.fhir.Reference;
import org.hl7.fhir.RelatedArtifact;
import org.hl7.fhir.SampledData;
import org.hl7.fhir.Signature;
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
 * An implementation of the model object '<em><b>Element Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getSliceName <em>Slice Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getSliceIsConstraining <em>Slice Is Constraining</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getSlicing <em>Slicing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getShort <em>Short</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMin <em>Min</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMax <em>Max</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getContentReference <em>Content Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueBase64Binary <em>Default Value Base64 Binary</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueBoolean <em>Default Value Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueCanonical <em>Default Value Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueCode <em>Default Value Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueDate <em>Default Value Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueDateTime <em>Default Value Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueDecimal <em>Default Value Decimal</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueId <em>Default Value Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueInstant <em>Default Value Instant</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueInteger <em>Default Value Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueMarkdown <em>Default Value Markdown</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueOid <em>Default Value Oid</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValuePositiveInt <em>Default Value Positive Int</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueString <em>Default Value String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueTime <em>Default Value Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueUnsignedInt <em>Default Value Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueUri <em>Default Value Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueUrl <em>Default Value Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueUuid <em>Default Value Uuid</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueAddress <em>Default Value Address</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueAge <em>Default Value Age</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueAnnotation <em>Default Value Annotation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueAttachment <em>Default Value Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueCodeableConcept <em>Default Value Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueCoding <em>Default Value Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueContactPoint <em>Default Value Contact Point</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueCount <em>Default Value Count</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueDistance <em>Default Value Distance</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueDuration <em>Default Value Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueHumanName <em>Default Value Human Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueIdentifier <em>Default Value Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueMoney <em>Default Value Money</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValuePeriod <em>Default Value Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueQuantity <em>Default Value Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueRange <em>Default Value Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueRatio <em>Default Value Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueReference <em>Default Value Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueSampledData <em>Default Value Sampled Data</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueSignature <em>Default Value Signature</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueTiming <em>Default Value Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueContactDetail <em>Default Value Contact Detail</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueContributor <em>Default Value Contributor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueDataRequirement <em>Default Value Data Requirement</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueExpression <em>Default Value Expression</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueParameterDefinition <em>Default Value Parameter Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueRelatedArtifact <em>Default Value Related Artifact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueTriggerDefinition <em>Default Value Trigger Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueUsageContext <em>Default Value Usage Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueDosage <em>Default Value Dosage</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueMeta <em>Default Value Meta</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMeaningWhenMissing <em>Meaning When Missing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getOrderMeaning <em>Order Meaning</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedBase64Binary <em>Fixed Base64 Binary</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedBoolean <em>Fixed Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedCanonical <em>Fixed Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedCode <em>Fixed Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedDate <em>Fixed Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedDateTime <em>Fixed Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedDecimal <em>Fixed Decimal</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedId <em>Fixed Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedInstant <em>Fixed Instant</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedInteger <em>Fixed Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedMarkdown <em>Fixed Markdown</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedOid <em>Fixed Oid</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedPositiveInt <em>Fixed Positive Int</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedString <em>Fixed String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedTime <em>Fixed Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedUnsignedInt <em>Fixed Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedUri <em>Fixed Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedUrl <em>Fixed Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedUuid <em>Fixed Uuid</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedAddress <em>Fixed Address</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedAge <em>Fixed Age</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedAnnotation <em>Fixed Annotation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedAttachment <em>Fixed Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedCodeableConcept <em>Fixed Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedCoding <em>Fixed Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedContactPoint <em>Fixed Contact Point</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedCount <em>Fixed Count</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedDistance <em>Fixed Distance</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedDuration <em>Fixed Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedHumanName <em>Fixed Human Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedIdentifier <em>Fixed Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedMoney <em>Fixed Money</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedPeriod <em>Fixed Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedQuantity <em>Fixed Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedRange <em>Fixed Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedRatio <em>Fixed Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedReference <em>Fixed Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedSampledData <em>Fixed Sampled Data</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedSignature <em>Fixed Signature</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedTiming <em>Fixed Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedContactDetail <em>Fixed Contact Detail</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedContributor <em>Fixed Contributor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedDataRequirement <em>Fixed Data Requirement</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedExpression <em>Fixed Expression</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedParameterDefinition <em>Fixed Parameter Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedRelatedArtifact <em>Fixed Related Artifact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedTriggerDefinition <em>Fixed Trigger Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedUsageContext <em>Fixed Usage Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedDosage <em>Fixed Dosage</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedMeta <em>Fixed Meta</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternBase64Binary <em>Pattern Base64 Binary</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternBoolean <em>Pattern Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternCanonical <em>Pattern Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternCode <em>Pattern Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternDate <em>Pattern Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternDateTime <em>Pattern Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternDecimal <em>Pattern Decimal</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternId <em>Pattern Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternInstant <em>Pattern Instant</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternInteger <em>Pattern Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternMarkdown <em>Pattern Markdown</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternOid <em>Pattern Oid</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternPositiveInt <em>Pattern Positive Int</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternString <em>Pattern String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternTime <em>Pattern Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternUnsignedInt <em>Pattern Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternUri <em>Pattern Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternUrl <em>Pattern Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternUuid <em>Pattern Uuid</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternAddress <em>Pattern Address</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternAge <em>Pattern Age</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternAnnotation <em>Pattern Annotation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternAttachment <em>Pattern Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternCodeableConcept <em>Pattern Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternCoding <em>Pattern Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternContactPoint <em>Pattern Contact Point</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternCount <em>Pattern Count</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternDistance <em>Pattern Distance</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternDuration <em>Pattern Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternHumanName <em>Pattern Human Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternIdentifier <em>Pattern Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternMoney <em>Pattern Money</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternPeriod <em>Pattern Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternQuantity <em>Pattern Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternRange <em>Pattern Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternRatio <em>Pattern Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternReference <em>Pattern Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternSampledData <em>Pattern Sampled Data</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternSignature <em>Pattern Signature</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternTiming <em>Pattern Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternContactDetail <em>Pattern Contact Detail</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternContributor <em>Pattern Contributor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternDataRequirement <em>Pattern Data Requirement</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternExpression <em>Pattern Expression</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternParameterDefinition <em>Pattern Parameter Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternRelatedArtifact <em>Pattern Related Artifact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternTriggerDefinition <em>Pattern Trigger Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternUsageContext <em>Pattern Usage Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternDosage <em>Pattern Dosage</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternMeta <em>Pattern Meta</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getExample <em>Example</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMinValueDate <em>Min Value Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMinValueDateTime <em>Min Value Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMinValueInstant <em>Min Value Instant</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMinValueTime <em>Min Value Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMinValueDecimal <em>Min Value Decimal</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMinValueInteger <em>Min Value Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMinValuePositiveInt <em>Min Value Positive Int</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMinValueUnsignedInt <em>Min Value Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMinValueQuantity <em>Min Value Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMaxValueDate <em>Max Value Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMaxValueDateTime <em>Max Value Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMaxValueInstant <em>Max Value Instant</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMaxValueTime <em>Max Value Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMaxValueDecimal <em>Max Value Decimal</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMaxValueInteger <em>Max Value Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMaxValuePositiveInt <em>Max Value Positive Int</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMaxValueUnsignedInt <em>Max Value Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMaxValueQuantity <em>Max Value Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMustSupport <em>Must Support</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getIsModifier <em>Is Modifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getIsModifierReason <em>Is Modifier Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getIsSummary <em>Is Summary</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMapping <em>Mapping</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementDefinitionImpl extends BackboneElementImpl implements ElementDefinition {
	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String path;

	/**
	 * The cached value of the '{@link #getRepresentation() <em>Representation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentation()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyRepresentation> representation;

	/**
	 * The cached value of the '{@link #getSliceName() <em>Slice Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSliceName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String sliceName;

	/**
	 * The cached value of the '{@link #getSliceIsConstraining() <em>Slice Is Constraining</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSliceIsConstraining()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean sliceIsConstraining;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String label;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> code;

	/**
	 * The cached value of the '{@link #getSlicing() <em>Slicing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlicing()
	 * @generated
	 * @ordered
	 */
	protected ElementDefinitionSlicing slicing;

	/**
	 * The cached value of the '{@link #getShort() <em>Short</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShort()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String short_;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected Markdown definition;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected Markdown comment;

	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected Markdown requirements;

	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> alias;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt min;

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
	 * The cached value of the '{@link #getBase() <em>Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected ElementDefinitionBase base;

	/**
	 * The cached value of the '{@link #getContentReference() <em>Content Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentReference()
	 * @generated
	 * @ordered
	 */
	protected Uri contentReference;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementDefinitionType> type;

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
	 * The cached value of the '{@link #getMeaningWhenMissing() <em>Meaning When Missing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeaningWhenMissing()
	 * @generated
	 * @ordered
	 */
	protected Markdown meaningWhenMissing;

	/**
	 * The cached value of the '{@link #getOrderMeaning() <em>Order Meaning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderMeaning()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String orderMeaning;

	/**
	 * The cached value of the '{@link #getFixedBase64Binary() <em>Fixed Base64 Binary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedBase64Binary()
	 * @generated
	 * @ordered
	 */
	protected Base64Binary fixedBase64Binary;

	/**
	 * The cached value of the '{@link #getFixedBoolean() <em>Fixed Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedBoolean()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean fixedBoolean;

	/**
	 * The cached value of the '{@link #getFixedCanonical() <em>Fixed Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedCanonical()
	 * @generated
	 * @ordered
	 */
	protected Canonical fixedCanonical;

	/**
	 * The cached value of the '{@link #getFixedCode() <em>Fixed Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedCode()
	 * @generated
	 * @ordered
	 */
	protected Code fixedCode;

	/**
	 * The cached value of the '{@link #getFixedDate() <em>Fixed Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedDate()
	 * @generated
	 * @ordered
	 */
	protected Date fixedDate;

	/**
	 * The cached value of the '{@link #getFixedDateTime() <em>Fixed Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime fixedDateTime;

	/**
	 * The cached value of the '{@link #getFixedDecimal() <em>Fixed Decimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedDecimal()
	 * @generated
	 * @ordered
	 */
	protected Decimal fixedDecimal;

	/**
	 * The cached value of the '{@link #getFixedId() <em>Fixed Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedId()
	 * @generated
	 * @ordered
	 */
	protected Id fixedId;

	/**
	 * The cached value of the '{@link #getFixedInstant() <em>Fixed Instant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedInstant()
	 * @generated
	 * @ordered
	 */
	protected Instant fixedInstant;

	/**
	 * The cached value of the '{@link #getFixedInteger() <em>Fixed Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedInteger()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer fixedInteger;

	/**
	 * The cached value of the '{@link #getFixedMarkdown() <em>Fixed Markdown</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedMarkdown()
	 * @generated
	 * @ordered
	 */
	protected Markdown fixedMarkdown;

	/**
	 * The cached value of the '{@link #getFixedOid() <em>Fixed Oid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedOid()
	 * @generated
	 * @ordered
	 */
	protected Oid fixedOid;

	/**
	 * The cached value of the '{@link #getFixedPositiveInt() <em>Fixed Positive Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedPositiveInt()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt fixedPositiveInt;

	/**
	 * The cached value of the '{@link #getFixedString() <em>Fixed String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String fixedString;

	/**
	 * The cached value of the '{@link #getFixedTime() <em>Fixed Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedTime()
	 * @generated
	 * @ordered
	 */
	protected Time fixedTime;

	/**
	 * The cached value of the '{@link #getFixedUnsignedInt() <em>Fixed Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedUnsignedInt()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt fixedUnsignedInt;

	/**
	 * The cached value of the '{@link #getFixedUri() <em>Fixed Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedUri()
	 * @generated
	 * @ordered
	 */
	protected Uri fixedUri;

	/**
	 * The cached value of the '{@link #getFixedUrl() <em>Fixed Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedUrl()
	 * @generated
	 * @ordered
	 */
	protected Url fixedUrl;

	/**
	 * The cached value of the '{@link #getFixedUuid() <em>Fixed Uuid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedUuid()
	 * @generated
	 * @ordered
	 */
	protected Uuid fixedUuid;

	/**
	 * The cached value of the '{@link #getFixedAddress() <em>Fixed Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAddress()
	 * @generated
	 * @ordered
	 */
	protected Address fixedAddress;

	/**
	 * The cached value of the '{@link #getFixedAge() <em>Fixed Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAge()
	 * @generated
	 * @ordered
	 */
	protected Age fixedAge;

	/**
	 * The cached value of the '{@link #getFixedAnnotation() <em>Fixed Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAnnotation()
	 * @generated
	 * @ordered
	 */
	protected Annotation fixedAnnotation;

	/**
	 * The cached value of the '{@link #getFixedAttachment() <em>Fixed Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAttachment()
	 * @generated
	 * @ordered
	 */
	protected Attachment fixedAttachment;

	/**
	 * The cached value of the '{@link #getFixedCodeableConcept() <em>Fixed Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept fixedCodeableConcept;

	/**
	 * The cached value of the '{@link #getFixedCoding() <em>Fixed Coding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedCoding()
	 * @generated
	 * @ordered
	 */
	protected Coding fixedCoding;

	/**
	 * The cached value of the '{@link #getFixedContactPoint() <em>Fixed Contact Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedContactPoint()
	 * @generated
	 * @ordered
	 */
	protected ContactPoint fixedContactPoint;

	/**
	 * The cached value of the '{@link #getFixedCount() <em>Fixed Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedCount()
	 * @generated
	 * @ordered
	 */
	protected Count fixedCount;

	/**
	 * The cached value of the '{@link #getFixedDistance() <em>Fixed Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedDistance()
	 * @generated
	 * @ordered
	 */
	protected Distance fixedDistance;

	/**
	 * The cached value of the '{@link #getFixedDuration() <em>Fixed Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration fixedDuration;

	/**
	 * The cached value of the '{@link #getFixedHumanName() <em>Fixed Human Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedHumanName()
	 * @generated
	 * @ordered
	 */
	protected HumanName fixedHumanName;

	/**
	 * The cached value of the '{@link #getFixedIdentifier() <em>Fixed Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier fixedIdentifier;

	/**
	 * The cached value of the '{@link #getFixedMoney() <em>Fixed Money</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedMoney()
	 * @generated
	 * @ordered
	 */
	protected Money fixedMoney;

	/**
	 * The cached value of the '{@link #getFixedPeriod() <em>Fixed Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period fixedPeriod;

	/**
	 * The cached value of the '{@link #getFixedQuantity() <em>Fixed Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity fixedQuantity;

	/**
	 * The cached value of the '{@link #getFixedRange() <em>Fixed Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedRange()
	 * @generated
	 * @ordered
	 */
	protected Range fixedRange;

	/**
	 * The cached value of the '{@link #getFixedRatio() <em>Fixed Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedRatio()
	 * @generated
	 * @ordered
	 */
	protected Ratio fixedRatio;

	/**
	 * The cached value of the '{@link #getFixedReference() <em>Fixed Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedReference()
	 * @generated
	 * @ordered
	 */
	protected Reference fixedReference;

	/**
	 * The cached value of the '{@link #getFixedSampledData() <em>Fixed Sampled Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedSampledData()
	 * @generated
	 * @ordered
	 */
	protected SampledData fixedSampledData;

	/**
	 * The cached value of the '{@link #getFixedSignature() <em>Fixed Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedSignature()
	 * @generated
	 * @ordered
	 */
	protected Signature fixedSignature;

	/**
	 * The cached value of the '{@link #getFixedTiming() <em>Fixed Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedTiming()
	 * @generated
	 * @ordered
	 */
	protected Timing fixedTiming;

	/**
	 * The cached value of the '{@link #getFixedContactDetail() <em>Fixed Contact Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedContactDetail()
	 * @generated
	 * @ordered
	 */
	protected ContactDetail fixedContactDetail;

	/**
	 * The cached value of the '{@link #getFixedContributor() <em>Fixed Contributor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedContributor()
	 * @generated
	 * @ordered
	 */
	protected Contributor fixedContributor;

	/**
	 * The cached value of the '{@link #getFixedDataRequirement() <em>Fixed Data Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedDataRequirement()
	 * @generated
	 * @ordered
	 */
	protected DataRequirement fixedDataRequirement;

	/**
	 * The cached value of the '{@link #getFixedExpression() <em>Fixed Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression fixedExpression;

	/**
	 * The cached value of the '{@link #getFixedParameterDefinition() <em>Fixed Parameter Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedParameterDefinition()
	 * @generated
	 * @ordered
	 */
	protected ParameterDefinition fixedParameterDefinition;

	/**
	 * The cached value of the '{@link #getFixedRelatedArtifact() <em>Fixed Related Artifact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedRelatedArtifact()
	 * @generated
	 * @ordered
	 */
	protected RelatedArtifact fixedRelatedArtifact;

	/**
	 * The cached value of the '{@link #getFixedTriggerDefinition() <em>Fixed Trigger Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedTriggerDefinition()
	 * @generated
	 * @ordered
	 */
	protected TriggerDefinition fixedTriggerDefinition;

	/**
	 * The cached value of the '{@link #getFixedUsageContext() <em>Fixed Usage Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedUsageContext()
	 * @generated
	 * @ordered
	 */
	protected UsageContext fixedUsageContext;

	/**
	 * The cached value of the '{@link #getFixedDosage() <em>Fixed Dosage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedDosage()
	 * @generated
	 * @ordered
	 */
	protected Dosage fixedDosage;

	/**
	 * The cached value of the '{@link #getFixedMeta() <em>Fixed Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedMeta()
	 * @generated
	 * @ordered
	 */
	protected Meta fixedMeta;

	/**
	 * The cached value of the '{@link #getPatternBase64Binary() <em>Pattern Base64 Binary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternBase64Binary()
	 * @generated
	 * @ordered
	 */
	protected Base64Binary patternBase64Binary;

	/**
	 * The cached value of the '{@link #getPatternBoolean() <em>Pattern Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternBoolean()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean patternBoolean;

	/**
	 * The cached value of the '{@link #getPatternCanonical() <em>Pattern Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternCanonical()
	 * @generated
	 * @ordered
	 */
	protected Canonical patternCanonical;

	/**
	 * The cached value of the '{@link #getPatternCode() <em>Pattern Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternCode()
	 * @generated
	 * @ordered
	 */
	protected Code patternCode;

	/**
	 * The cached value of the '{@link #getPatternDate() <em>Pattern Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternDate()
	 * @generated
	 * @ordered
	 */
	protected Date patternDate;

	/**
	 * The cached value of the '{@link #getPatternDateTime() <em>Pattern Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime patternDateTime;

	/**
	 * The cached value of the '{@link #getPatternDecimal() <em>Pattern Decimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternDecimal()
	 * @generated
	 * @ordered
	 */
	protected Decimal patternDecimal;

	/**
	 * The cached value of the '{@link #getPatternId() <em>Pattern Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternId()
	 * @generated
	 * @ordered
	 */
	protected Id patternId;

	/**
	 * The cached value of the '{@link #getPatternInstant() <em>Pattern Instant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternInstant()
	 * @generated
	 * @ordered
	 */
	protected Instant patternInstant;

	/**
	 * The cached value of the '{@link #getPatternInteger() <em>Pattern Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternInteger()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer patternInteger;

	/**
	 * The cached value of the '{@link #getPatternMarkdown() <em>Pattern Markdown</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternMarkdown()
	 * @generated
	 * @ordered
	 */
	protected Markdown patternMarkdown;

	/**
	 * The cached value of the '{@link #getPatternOid() <em>Pattern Oid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternOid()
	 * @generated
	 * @ordered
	 */
	protected Oid patternOid;

	/**
	 * The cached value of the '{@link #getPatternPositiveInt() <em>Pattern Positive Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternPositiveInt()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt patternPositiveInt;

	/**
	 * The cached value of the '{@link #getPatternString() <em>Pattern String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String patternString;

	/**
	 * The cached value of the '{@link #getPatternTime() <em>Pattern Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternTime()
	 * @generated
	 * @ordered
	 */
	protected Time patternTime;

	/**
	 * The cached value of the '{@link #getPatternUnsignedInt() <em>Pattern Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternUnsignedInt()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt patternUnsignedInt;

	/**
	 * The cached value of the '{@link #getPatternUri() <em>Pattern Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternUri()
	 * @generated
	 * @ordered
	 */
	protected Uri patternUri;

	/**
	 * The cached value of the '{@link #getPatternUrl() <em>Pattern Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternUrl()
	 * @generated
	 * @ordered
	 */
	protected Url patternUrl;

	/**
	 * The cached value of the '{@link #getPatternUuid() <em>Pattern Uuid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternUuid()
	 * @generated
	 * @ordered
	 */
	protected Uuid patternUuid;

	/**
	 * The cached value of the '{@link #getPatternAddress() <em>Pattern Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternAddress()
	 * @generated
	 * @ordered
	 */
	protected Address patternAddress;

	/**
	 * The cached value of the '{@link #getPatternAge() <em>Pattern Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternAge()
	 * @generated
	 * @ordered
	 */
	protected Age patternAge;

	/**
	 * The cached value of the '{@link #getPatternAnnotation() <em>Pattern Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternAnnotation()
	 * @generated
	 * @ordered
	 */
	protected Annotation patternAnnotation;

	/**
	 * The cached value of the '{@link #getPatternAttachment() <em>Pattern Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternAttachment()
	 * @generated
	 * @ordered
	 */
	protected Attachment patternAttachment;

	/**
	 * The cached value of the '{@link #getPatternCodeableConcept() <em>Pattern Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept patternCodeableConcept;

	/**
	 * The cached value of the '{@link #getPatternCoding() <em>Pattern Coding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternCoding()
	 * @generated
	 * @ordered
	 */
	protected Coding patternCoding;

	/**
	 * The cached value of the '{@link #getPatternContactPoint() <em>Pattern Contact Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternContactPoint()
	 * @generated
	 * @ordered
	 */
	protected ContactPoint patternContactPoint;

	/**
	 * The cached value of the '{@link #getPatternCount() <em>Pattern Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternCount()
	 * @generated
	 * @ordered
	 */
	protected Count patternCount;

	/**
	 * The cached value of the '{@link #getPatternDistance() <em>Pattern Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternDistance()
	 * @generated
	 * @ordered
	 */
	protected Distance patternDistance;

	/**
	 * The cached value of the '{@link #getPatternDuration() <em>Pattern Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration patternDuration;

	/**
	 * The cached value of the '{@link #getPatternHumanName() <em>Pattern Human Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternHumanName()
	 * @generated
	 * @ordered
	 */
	protected HumanName patternHumanName;

	/**
	 * The cached value of the '{@link #getPatternIdentifier() <em>Pattern Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier patternIdentifier;

	/**
	 * The cached value of the '{@link #getPatternMoney() <em>Pattern Money</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternMoney()
	 * @generated
	 * @ordered
	 */
	protected Money patternMoney;

	/**
	 * The cached value of the '{@link #getPatternPeriod() <em>Pattern Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period patternPeriod;

	/**
	 * The cached value of the '{@link #getPatternQuantity() <em>Pattern Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity patternQuantity;

	/**
	 * The cached value of the '{@link #getPatternRange() <em>Pattern Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternRange()
	 * @generated
	 * @ordered
	 */
	protected Range patternRange;

	/**
	 * The cached value of the '{@link #getPatternRatio() <em>Pattern Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternRatio()
	 * @generated
	 * @ordered
	 */
	protected Ratio patternRatio;

	/**
	 * The cached value of the '{@link #getPatternReference() <em>Pattern Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternReference()
	 * @generated
	 * @ordered
	 */
	protected Reference patternReference;

	/**
	 * The cached value of the '{@link #getPatternSampledData() <em>Pattern Sampled Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternSampledData()
	 * @generated
	 * @ordered
	 */
	protected SampledData patternSampledData;

	/**
	 * The cached value of the '{@link #getPatternSignature() <em>Pattern Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternSignature()
	 * @generated
	 * @ordered
	 */
	protected Signature patternSignature;

	/**
	 * The cached value of the '{@link #getPatternTiming() <em>Pattern Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternTiming()
	 * @generated
	 * @ordered
	 */
	protected Timing patternTiming;

	/**
	 * The cached value of the '{@link #getPatternContactDetail() <em>Pattern Contact Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternContactDetail()
	 * @generated
	 * @ordered
	 */
	protected ContactDetail patternContactDetail;

	/**
	 * The cached value of the '{@link #getPatternContributor() <em>Pattern Contributor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternContributor()
	 * @generated
	 * @ordered
	 */
	protected Contributor patternContributor;

	/**
	 * The cached value of the '{@link #getPatternDataRequirement() <em>Pattern Data Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternDataRequirement()
	 * @generated
	 * @ordered
	 */
	protected DataRequirement patternDataRequirement;

	/**
	 * The cached value of the '{@link #getPatternExpression() <em>Pattern Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression patternExpression;

	/**
	 * The cached value of the '{@link #getPatternParameterDefinition() <em>Pattern Parameter Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternParameterDefinition()
	 * @generated
	 * @ordered
	 */
	protected ParameterDefinition patternParameterDefinition;

	/**
	 * The cached value of the '{@link #getPatternRelatedArtifact() <em>Pattern Related Artifact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternRelatedArtifact()
	 * @generated
	 * @ordered
	 */
	protected RelatedArtifact patternRelatedArtifact;

	/**
	 * The cached value of the '{@link #getPatternTriggerDefinition() <em>Pattern Trigger Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternTriggerDefinition()
	 * @generated
	 * @ordered
	 */
	protected TriggerDefinition patternTriggerDefinition;

	/**
	 * The cached value of the '{@link #getPatternUsageContext() <em>Pattern Usage Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternUsageContext()
	 * @generated
	 * @ordered
	 */
	protected UsageContext patternUsageContext;

	/**
	 * The cached value of the '{@link #getPatternDosage() <em>Pattern Dosage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternDosage()
	 * @generated
	 * @ordered
	 */
	protected Dosage patternDosage;

	/**
	 * The cached value of the '{@link #getPatternMeta() <em>Pattern Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternMeta()
	 * @generated
	 * @ordered
	 */
	protected Meta patternMeta;

	/**
	 * The cached value of the '{@link #getExample() <em>Example</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExample()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementDefinitionExample> example;

	/**
	 * The cached value of the '{@link #getMinValueDate() <em>Min Value Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValueDate()
	 * @generated
	 * @ordered
	 */
	protected Date minValueDate;

	/**
	 * The cached value of the '{@link #getMinValueDateTime() <em>Min Value Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValueDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime minValueDateTime;

	/**
	 * The cached value of the '{@link #getMinValueInstant() <em>Min Value Instant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValueInstant()
	 * @generated
	 * @ordered
	 */
	protected Instant minValueInstant;

	/**
	 * The cached value of the '{@link #getMinValueTime() <em>Min Value Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValueTime()
	 * @generated
	 * @ordered
	 */
	protected Time minValueTime;

	/**
	 * The cached value of the '{@link #getMinValueDecimal() <em>Min Value Decimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValueDecimal()
	 * @generated
	 * @ordered
	 */
	protected Decimal minValueDecimal;

	/**
	 * The cached value of the '{@link #getMinValueInteger() <em>Min Value Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValueInteger()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer minValueInteger;

	/**
	 * The cached value of the '{@link #getMinValuePositiveInt() <em>Min Value Positive Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValuePositiveInt()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt minValuePositiveInt;

	/**
	 * The cached value of the '{@link #getMinValueUnsignedInt() <em>Min Value Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValueUnsignedInt()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt minValueUnsignedInt;

	/**
	 * The cached value of the '{@link #getMinValueQuantity() <em>Min Value Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValueQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity minValueQuantity;

	/**
	 * The cached value of the '{@link #getMaxValueDate() <em>Max Value Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValueDate()
	 * @generated
	 * @ordered
	 */
	protected Date maxValueDate;

	/**
	 * The cached value of the '{@link #getMaxValueDateTime() <em>Max Value Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValueDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime maxValueDateTime;

	/**
	 * The cached value of the '{@link #getMaxValueInstant() <em>Max Value Instant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValueInstant()
	 * @generated
	 * @ordered
	 */
	protected Instant maxValueInstant;

	/**
	 * The cached value of the '{@link #getMaxValueTime() <em>Max Value Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValueTime()
	 * @generated
	 * @ordered
	 */
	protected Time maxValueTime;

	/**
	 * The cached value of the '{@link #getMaxValueDecimal() <em>Max Value Decimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValueDecimal()
	 * @generated
	 * @ordered
	 */
	protected Decimal maxValueDecimal;

	/**
	 * The cached value of the '{@link #getMaxValueInteger() <em>Max Value Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValueInteger()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer maxValueInteger;

	/**
	 * The cached value of the '{@link #getMaxValuePositiveInt() <em>Max Value Positive Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValuePositiveInt()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt maxValuePositiveInt;

	/**
	 * The cached value of the '{@link #getMaxValueUnsignedInt() <em>Max Value Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValueUnsignedInt()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt maxValueUnsignedInt;

	/**
	 * The cached value of the '{@link #getMaxValueQuantity() <em>Max Value Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValueQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity maxValueQuantity;

	/**
	 * The cached value of the '{@link #getMaxLength() <em>Max Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer maxLength;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Id> condition;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementDefinitionConstraint> constraint;

	/**
	 * The cached value of the '{@link #getMustSupport() <em>Must Support</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMustSupport()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean mustSupport;

	/**
	 * The cached value of the '{@link #getIsModifier() <em>Is Modifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsModifier()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean isModifier;

	/**
	 * The cached value of the '{@link #getIsModifierReason() <em>Is Modifier Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsModifierReason()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String isModifierReason;

	/**
	 * The cached value of the '{@link #getIsSummary() <em>Is Summary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSummary()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean isSummary;

	/**
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected ElementDefinitionBinding binding;

	/**
	 * The cached value of the '{@link #getMapping() <em>Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementDefinitionMapping> mapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getElementDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPath(org.hl7.fhir.String newPath, NotificationChain msgs) {
		org.hl7.fhir.String oldPath = path;
		path = newPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATH, oldPath, newPath);
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
	public void setPath(org.hl7.fhir.String newPath) {
		if (newPath != path) {
			NotificationChain msgs = null;
			if (path != null)
				msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATH, null, msgs);
			if (newPath != null)
				msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATH, null, msgs);
			msgs = basicSetPath(newPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATH, newPath, newPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PropertyRepresentation> getRepresentation() {
		if (representation == null) {
			representation = new EObjectContainmentEList<PropertyRepresentation>(PropertyRepresentation.class, this, FhirPackage.ELEMENT_DEFINITION__REPRESENTATION);
		}
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getSliceName() {
		return sliceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSliceName(org.hl7.fhir.String newSliceName, NotificationChain msgs) {
		org.hl7.fhir.String oldSliceName = sliceName;
		sliceName = newSliceName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__SLICE_NAME, oldSliceName, newSliceName);
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
	public void setSliceName(org.hl7.fhir.String newSliceName) {
		if (newSliceName != sliceName) {
			NotificationChain msgs = null;
			if (sliceName != null)
				msgs = ((InternalEObject)sliceName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__SLICE_NAME, null, msgs);
			if (newSliceName != null)
				msgs = ((InternalEObject)newSliceName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__SLICE_NAME, null, msgs);
			msgs = basicSetSliceName(newSliceName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__SLICE_NAME, newSliceName, newSliceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getSliceIsConstraining() {
		return sliceIsConstraining;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSliceIsConstraining(org.hl7.fhir.Boolean newSliceIsConstraining, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldSliceIsConstraining = sliceIsConstraining;
		sliceIsConstraining = newSliceIsConstraining;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__SLICE_IS_CONSTRAINING, oldSliceIsConstraining, newSliceIsConstraining);
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
	public void setSliceIsConstraining(org.hl7.fhir.Boolean newSliceIsConstraining) {
		if (newSliceIsConstraining != sliceIsConstraining) {
			NotificationChain msgs = null;
			if (sliceIsConstraining != null)
				msgs = ((InternalEObject)sliceIsConstraining).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__SLICE_IS_CONSTRAINING, null, msgs);
			if (newSliceIsConstraining != null)
				msgs = ((InternalEObject)newSliceIsConstraining).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__SLICE_IS_CONSTRAINING, null, msgs);
			msgs = basicSetSliceIsConstraining(newSliceIsConstraining, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__SLICE_IS_CONSTRAINING, newSliceIsConstraining, newSliceIsConstraining));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(org.hl7.fhir.String newLabel, NotificationChain msgs) {
		org.hl7.fhir.String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__LABEL, oldLabel, newLabel);
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
	public void setLabel(org.hl7.fhir.String newLabel) {
		if (newLabel != label) {
			NotificationChain msgs = null;
			if (label != null)
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__LABEL, newLabel, newLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Coding> getCode() {
		if (code == null) {
			code = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.ELEMENT_DEFINITION__CODE);
		}
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementDefinitionSlicing getSlicing() {
		return slicing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSlicing(ElementDefinitionSlicing newSlicing, NotificationChain msgs) {
		ElementDefinitionSlicing oldSlicing = slicing;
		slicing = newSlicing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__SLICING, oldSlicing, newSlicing);
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
	public void setSlicing(ElementDefinitionSlicing newSlicing) {
		if (newSlicing != slicing) {
			NotificationChain msgs = null;
			if (slicing != null)
				msgs = ((InternalEObject)slicing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__SLICING, null, msgs);
			if (newSlicing != null)
				msgs = ((InternalEObject)newSlicing).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__SLICING, null, msgs);
			msgs = basicSetSlicing(newSlicing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__SLICING, newSlicing, newSlicing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getShort() {
		return short_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShort(org.hl7.fhir.String newShort, NotificationChain msgs) {
		org.hl7.fhir.String oldShort = short_;
		short_ = newShort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__SHORT, oldShort, newShort);
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
	public void setShort(org.hl7.fhir.String newShort) {
		if (newShort != short_) {
			NotificationChain msgs = null;
			if (short_ != null)
				msgs = ((InternalEObject)short_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__SHORT, null, msgs);
			if (newShort != null)
				msgs = ((InternalEObject)newShort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__SHORT, null, msgs);
			msgs = basicSetShort(newShort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__SHORT, newShort, newShort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinition(Markdown newDefinition, NotificationChain msgs) {
		Markdown oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFINITION, oldDefinition, newDefinition);
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
	public void setDefinition(Markdown newDefinition) {
		if (newDefinition != definition) {
			NotificationChain msgs = null;
			if (definition != null)
				msgs = ((InternalEObject)definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFINITION, null, msgs);
			if (newDefinition != null)
				msgs = ((InternalEObject)newDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFINITION, null, msgs);
			msgs = basicSetDefinition(newDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFINITION, newDefinition, newDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComment(Markdown newComment, NotificationChain msgs) {
		Markdown oldComment = comment;
		comment = newComment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__COMMENT, oldComment, newComment);
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
	public void setComment(Markdown newComment) {
		if (newComment != comment) {
			NotificationChain msgs = null;
			if (comment != null)
				msgs = ((InternalEObject)comment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__COMMENT, null, msgs);
			if (newComment != null)
				msgs = ((InternalEObject)newComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__COMMENT, null, msgs);
			msgs = basicSetComment(newComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__COMMENT, newComment, newComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getRequirements() {
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirements(Markdown newRequirements, NotificationChain msgs) {
		Markdown oldRequirements = requirements;
		requirements = newRequirements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__REQUIREMENTS, oldRequirements, newRequirements);
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
	public void setRequirements(Markdown newRequirements) {
		if (newRequirements != requirements) {
			NotificationChain msgs = null;
			if (requirements != null)
				msgs = ((InternalEObject)requirements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__REQUIREMENTS, null, msgs);
			if (newRequirements != null)
				msgs = ((InternalEObject)newRequirements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__REQUIREMENTS, null, msgs);
			msgs = basicSetRequirements(newRequirements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__REQUIREMENTS, newRequirements, newRequirements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.hl7.fhir.String> getAlias() {
		if (alias == null) {
			alias = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.ELEMENT_DEFINITION__ALIAS);
		}
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnsignedInt getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMin(UnsignedInt newMin, NotificationChain msgs) {
		UnsignedInt oldMin = min;
		min = newMin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN, oldMin, newMin);
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
	public void setMin(UnsignedInt newMin) {
		if (newMin != min) {
			NotificationChain msgs = null;
			if (min != null)
				msgs = ((InternalEObject)min).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN, null, msgs);
			if (newMin != null)
				msgs = ((InternalEObject)newMin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN, null, msgs);
			msgs = basicSetMin(newMin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN, newMin, newMin));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX, oldMax, newMax);
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
				msgs = ((InternalEObject)max).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX, null, msgs);
			if (newMax != null)
				msgs = ((InternalEObject)newMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX, null, msgs);
			msgs = basicSetMax(newMax, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX, newMax, newMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementDefinitionBase getBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBase(ElementDefinitionBase newBase, NotificationChain msgs) {
		ElementDefinitionBase oldBase = base;
		base = newBase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__BASE, oldBase, newBase);
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
	public void setBase(ElementDefinitionBase newBase) {
		if (newBase != base) {
			NotificationChain msgs = null;
			if (base != null)
				msgs = ((InternalEObject)base).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__BASE, null, msgs);
			if (newBase != null)
				msgs = ((InternalEObject)newBase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__BASE, null, msgs);
			msgs = basicSetBase(newBase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__BASE, newBase, newBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getContentReference() {
		return contentReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentReference(Uri newContentReference, NotificationChain msgs) {
		Uri oldContentReference = contentReference;
		contentReference = newContentReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__CONTENT_REFERENCE, oldContentReference, newContentReference);
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
	public void setContentReference(Uri newContentReference) {
		if (newContentReference != contentReference) {
			NotificationChain msgs = null;
			if (contentReference != null)
				msgs = ((InternalEObject)contentReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__CONTENT_REFERENCE, null, msgs);
			if (newContentReference != null)
				msgs = ((InternalEObject)newContentReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__CONTENT_REFERENCE, null, msgs);
			msgs = basicSetContentReference(newContentReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__CONTENT_REFERENCE, newContentReference, newContentReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ElementDefinitionType> getType() {
		if (type == null) {
			type = new EObjectContainmentEList<ElementDefinitionType>(ElementDefinitionType.class, this, FhirPackage.ELEMENT_DEFINITION__TYPE);
		}
		return type;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_BASE64_BINARY, oldDefaultValueBase64Binary, newDefaultValueBase64Binary);
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
				msgs = ((InternalEObject)defaultValueBase64Binary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_BASE64_BINARY, null, msgs);
			if (newDefaultValueBase64Binary != null)
				msgs = ((InternalEObject)newDefaultValueBase64Binary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_BASE64_BINARY, null, msgs);
			msgs = basicSetDefaultValueBase64Binary(newDefaultValueBase64Binary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_BASE64_BINARY, newDefaultValueBase64Binary, newDefaultValueBase64Binary));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_BOOLEAN, oldDefaultValueBoolean, newDefaultValueBoolean);
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
				msgs = ((InternalEObject)defaultValueBoolean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_BOOLEAN, null, msgs);
			if (newDefaultValueBoolean != null)
				msgs = ((InternalEObject)newDefaultValueBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_BOOLEAN, null, msgs);
			msgs = basicSetDefaultValueBoolean(newDefaultValueBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_BOOLEAN, newDefaultValueBoolean, newDefaultValueBoolean));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CANONICAL, oldDefaultValueCanonical, newDefaultValueCanonical);
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
				msgs = ((InternalEObject)defaultValueCanonical).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CANONICAL, null, msgs);
			if (newDefaultValueCanonical != null)
				msgs = ((InternalEObject)newDefaultValueCanonical).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CANONICAL, null, msgs);
			msgs = basicSetDefaultValueCanonical(newDefaultValueCanonical, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CANONICAL, newDefaultValueCanonical, newDefaultValueCanonical));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODE, oldDefaultValueCode, newDefaultValueCode);
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
				msgs = ((InternalEObject)defaultValueCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODE, null, msgs);
			if (newDefaultValueCode != null)
				msgs = ((InternalEObject)newDefaultValueCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODE, null, msgs);
			msgs = basicSetDefaultValueCode(newDefaultValueCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODE, newDefaultValueCode, newDefaultValueCode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DATE, oldDefaultValueDate, newDefaultValueDate);
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
				msgs = ((InternalEObject)defaultValueDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DATE, null, msgs);
			if (newDefaultValueDate != null)
				msgs = ((InternalEObject)newDefaultValueDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DATE, null, msgs);
			msgs = basicSetDefaultValueDate(newDefaultValueDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DATE, newDefaultValueDate, newDefaultValueDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DATE_TIME, oldDefaultValueDateTime, newDefaultValueDateTime);
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
				msgs = ((InternalEObject)defaultValueDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DATE_TIME, null, msgs);
			if (newDefaultValueDateTime != null)
				msgs = ((InternalEObject)newDefaultValueDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DATE_TIME, null, msgs);
			msgs = basicSetDefaultValueDateTime(newDefaultValueDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DATE_TIME, newDefaultValueDateTime, newDefaultValueDateTime));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DECIMAL, oldDefaultValueDecimal, newDefaultValueDecimal);
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
				msgs = ((InternalEObject)defaultValueDecimal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DECIMAL, null, msgs);
			if (newDefaultValueDecimal != null)
				msgs = ((InternalEObject)newDefaultValueDecimal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DECIMAL, null, msgs);
			msgs = basicSetDefaultValueDecimal(newDefaultValueDecimal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DECIMAL, newDefaultValueDecimal, newDefaultValueDecimal));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ID, oldDefaultValueId, newDefaultValueId);
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
				msgs = ((InternalEObject)defaultValueId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ID, null, msgs);
			if (newDefaultValueId != null)
				msgs = ((InternalEObject)newDefaultValueId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ID, null, msgs);
			msgs = basicSetDefaultValueId(newDefaultValueId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ID, newDefaultValueId, newDefaultValueId));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_INSTANT, oldDefaultValueInstant, newDefaultValueInstant);
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
				msgs = ((InternalEObject)defaultValueInstant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_INSTANT, null, msgs);
			if (newDefaultValueInstant != null)
				msgs = ((InternalEObject)newDefaultValueInstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_INSTANT, null, msgs);
			msgs = basicSetDefaultValueInstant(newDefaultValueInstant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_INSTANT, newDefaultValueInstant, newDefaultValueInstant));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_INTEGER, oldDefaultValueInteger, newDefaultValueInteger);
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
				msgs = ((InternalEObject)defaultValueInteger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_INTEGER, null, msgs);
			if (newDefaultValueInteger != null)
				msgs = ((InternalEObject)newDefaultValueInteger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_INTEGER, null, msgs);
			msgs = basicSetDefaultValueInteger(newDefaultValueInteger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_INTEGER, newDefaultValueInteger, newDefaultValueInteger));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_MARKDOWN, oldDefaultValueMarkdown, newDefaultValueMarkdown);
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
				msgs = ((InternalEObject)defaultValueMarkdown).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_MARKDOWN, null, msgs);
			if (newDefaultValueMarkdown != null)
				msgs = ((InternalEObject)newDefaultValueMarkdown).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_MARKDOWN, null, msgs);
			msgs = basicSetDefaultValueMarkdown(newDefaultValueMarkdown, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_MARKDOWN, newDefaultValueMarkdown, newDefaultValueMarkdown));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_OID, oldDefaultValueOid, newDefaultValueOid);
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
				msgs = ((InternalEObject)defaultValueOid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_OID, null, msgs);
			if (newDefaultValueOid != null)
				msgs = ((InternalEObject)newDefaultValueOid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_OID, null, msgs);
			msgs = basicSetDefaultValueOid(newDefaultValueOid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_OID, newDefaultValueOid, newDefaultValueOid));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_POSITIVE_INT, oldDefaultValuePositiveInt, newDefaultValuePositiveInt);
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
				msgs = ((InternalEObject)defaultValuePositiveInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_POSITIVE_INT, null, msgs);
			if (newDefaultValuePositiveInt != null)
				msgs = ((InternalEObject)newDefaultValuePositiveInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_POSITIVE_INT, null, msgs);
			msgs = basicSetDefaultValuePositiveInt(newDefaultValuePositiveInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_POSITIVE_INT, newDefaultValuePositiveInt, newDefaultValuePositiveInt));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_STRING, oldDefaultValueString, newDefaultValueString);
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
				msgs = ((InternalEObject)defaultValueString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_STRING, null, msgs);
			if (newDefaultValueString != null)
				msgs = ((InternalEObject)newDefaultValueString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_STRING, null, msgs);
			msgs = basicSetDefaultValueString(newDefaultValueString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_STRING, newDefaultValueString, newDefaultValueString));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_TIME, oldDefaultValueTime, newDefaultValueTime);
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
				msgs = ((InternalEObject)defaultValueTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_TIME, null, msgs);
			if (newDefaultValueTime != null)
				msgs = ((InternalEObject)newDefaultValueTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_TIME, null, msgs);
			msgs = basicSetDefaultValueTime(newDefaultValueTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_TIME, newDefaultValueTime, newDefaultValueTime));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_UNSIGNED_INT, oldDefaultValueUnsignedInt, newDefaultValueUnsignedInt);
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
				msgs = ((InternalEObject)defaultValueUnsignedInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_UNSIGNED_INT, null, msgs);
			if (newDefaultValueUnsignedInt != null)
				msgs = ((InternalEObject)newDefaultValueUnsignedInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_UNSIGNED_INT, null, msgs);
			msgs = basicSetDefaultValueUnsignedInt(newDefaultValueUnsignedInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_UNSIGNED_INT, newDefaultValueUnsignedInt, newDefaultValueUnsignedInt));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_URI, oldDefaultValueUri, newDefaultValueUri);
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
				msgs = ((InternalEObject)defaultValueUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_URI, null, msgs);
			if (newDefaultValueUri != null)
				msgs = ((InternalEObject)newDefaultValueUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_URI, null, msgs);
			msgs = basicSetDefaultValueUri(newDefaultValueUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_URI, newDefaultValueUri, newDefaultValueUri));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_URL, oldDefaultValueUrl, newDefaultValueUrl);
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
				msgs = ((InternalEObject)defaultValueUrl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_URL, null, msgs);
			if (newDefaultValueUrl != null)
				msgs = ((InternalEObject)newDefaultValueUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_URL, null, msgs);
			msgs = basicSetDefaultValueUrl(newDefaultValueUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_URL, newDefaultValueUrl, newDefaultValueUrl));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_UUID, oldDefaultValueUuid, newDefaultValueUuid);
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
				msgs = ((InternalEObject)defaultValueUuid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_UUID, null, msgs);
			if (newDefaultValueUuid != null)
				msgs = ((InternalEObject)newDefaultValueUuid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_UUID, null, msgs);
			msgs = basicSetDefaultValueUuid(newDefaultValueUuid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_UUID, newDefaultValueUuid, newDefaultValueUuid));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ADDRESS, oldDefaultValueAddress, newDefaultValueAddress);
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
				msgs = ((InternalEObject)defaultValueAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ADDRESS, null, msgs);
			if (newDefaultValueAddress != null)
				msgs = ((InternalEObject)newDefaultValueAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ADDRESS, null, msgs);
			msgs = basicSetDefaultValueAddress(newDefaultValueAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ADDRESS, newDefaultValueAddress, newDefaultValueAddress));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_AGE, oldDefaultValueAge, newDefaultValueAge);
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
				msgs = ((InternalEObject)defaultValueAge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_AGE, null, msgs);
			if (newDefaultValueAge != null)
				msgs = ((InternalEObject)newDefaultValueAge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_AGE, null, msgs);
			msgs = basicSetDefaultValueAge(newDefaultValueAge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_AGE, newDefaultValueAge, newDefaultValueAge));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ANNOTATION, oldDefaultValueAnnotation, newDefaultValueAnnotation);
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
				msgs = ((InternalEObject)defaultValueAnnotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ANNOTATION, null, msgs);
			if (newDefaultValueAnnotation != null)
				msgs = ((InternalEObject)newDefaultValueAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ANNOTATION, null, msgs);
			msgs = basicSetDefaultValueAnnotation(newDefaultValueAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ANNOTATION, newDefaultValueAnnotation, newDefaultValueAnnotation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ATTACHMENT, oldDefaultValueAttachment, newDefaultValueAttachment);
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
				msgs = ((InternalEObject)defaultValueAttachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ATTACHMENT, null, msgs);
			if (newDefaultValueAttachment != null)
				msgs = ((InternalEObject)newDefaultValueAttachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ATTACHMENT, null, msgs);
			msgs = basicSetDefaultValueAttachment(newDefaultValueAttachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ATTACHMENT, newDefaultValueAttachment, newDefaultValueAttachment));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODEABLE_CONCEPT, oldDefaultValueCodeableConcept, newDefaultValueCodeableConcept);
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
				msgs = ((InternalEObject)defaultValueCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODEABLE_CONCEPT, null, msgs);
			if (newDefaultValueCodeableConcept != null)
				msgs = ((InternalEObject)newDefaultValueCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetDefaultValueCodeableConcept(newDefaultValueCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODEABLE_CONCEPT, newDefaultValueCodeableConcept, newDefaultValueCodeableConcept));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODING, oldDefaultValueCoding, newDefaultValueCoding);
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
				msgs = ((InternalEObject)defaultValueCoding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODING, null, msgs);
			if (newDefaultValueCoding != null)
				msgs = ((InternalEObject)newDefaultValueCoding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODING, null, msgs);
			msgs = basicSetDefaultValueCoding(newDefaultValueCoding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODING, newDefaultValueCoding, newDefaultValueCoding));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CONTACT_POINT, oldDefaultValueContactPoint, newDefaultValueContactPoint);
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
				msgs = ((InternalEObject)defaultValueContactPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CONTACT_POINT, null, msgs);
			if (newDefaultValueContactPoint != null)
				msgs = ((InternalEObject)newDefaultValueContactPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CONTACT_POINT, null, msgs);
			msgs = basicSetDefaultValueContactPoint(newDefaultValueContactPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CONTACT_POINT, newDefaultValueContactPoint, newDefaultValueContactPoint));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_COUNT, oldDefaultValueCount, newDefaultValueCount);
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
				msgs = ((InternalEObject)defaultValueCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_COUNT, null, msgs);
			if (newDefaultValueCount != null)
				msgs = ((InternalEObject)newDefaultValueCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_COUNT, null, msgs);
			msgs = basicSetDefaultValueCount(newDefaultValueCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_COUNT, newDefaultValueCount, newDefaultValueCount));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DISTANCE, oldDefaultValueDistance, newDefaultValueDistance);
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
				msgs = ((InternalEObject)defaultValueDistance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DISTANCE, null, msgs);
			if (newDefaultValueDistance != null)
				msgs = ((InternalEObject)newDefaultValueDistance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DISTANCE, null, msgs);
			msgs = basicSetDefaultValueDistance(newDefaultValueDistance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DISTANCE, newDefaultValueDistance, newDefaultValueDistance));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DURATION, oldDefaultValueDuration, newDefaultValueDuration);
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
				msgs = ((InternalEObject)defaultValueDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DURATION, null, msgs);
			if (newDefaultValueDuration != null)
				msgs = ((InternalEObject)newDefaultValueDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DURATION, null, msgs);
			msgs = basicSetDefaultValueDuration(newDefaultValueDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DURATION, newDefaultValueDuration, newDefaultValueDuration));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_HUMAN_NAME, oldDefaultValueHumanName, newDefaultValueHumanName);
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
				msgs = ((InternalEObject)defaultValueHumanName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_HUMAN_NAME, null, msgs);
			if (newDefaultValueHumanName != null)
				msgs = ((InternalEObject)newDefaultValueHumanName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_HUMAN_NAME, null, msgs);
			msgs = basicSetDefaultValueHumanName(newDefaultValueHumanName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_HUMAN_NAME, newDefaultValueHumanName, newDefaultValueHumanName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_IDENTIFIER, oldDefaultValueIdentifier, newDefaultValueIdentifier);
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
				msgs = ((InternalEObject)defaultValueIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_IDENTIFIER, null, msgs);
			if (newDefaultValueIdentifier != null)
				msgs = ((InternalEObject)newDefaultValueIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_IDENTIFIER, null, msgs);
			msgs = basicSetDefaultValueIdentifier(newDefaultValueIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_IDENTIFIER, newDefaultValueIdentifier, newDefaultValueIdentifier));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_MONEY, oldDefaultValueMoney, newDefaultValueMoney);
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
				msgs = ((InternalEObject)defaultValueMoney).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_MONEY, null, msgs);
			if (newDefaultValueMoney != null)
				msgs = ((InternalEObject)newDefaultValueMoney).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_MONEY, null, msgs);
			msgs = basicSetDefaultValueMoney(newDefaultValueMoney, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_MONEY, newDefaultValueMoney, newDefaultValueMoney));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_PERIOD, oldDefaultValuePeriod, newDefaultValuePeriod);
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
				msgs = ((InternalEObject)defaultValuePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_PERIOD, null, msgs);
			if (newDefaultValuePeriod != null)
				msgs = ((InternalEObject)newDefaultValuePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_PERIOD, null, msgs);
			msgs = basicSetDefaultValuePeriod(newDefaultValuePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_PERIOD, newDefaultValuePeriod, newDefaultValuePeriod));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_QUANTITY, oldDefaultValueQuantity, newDefaultValueQuantity);
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
				msgs = ((InternalEObject)defaultValueQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_QUANTITY, null, msgs);
			if (newDefaultValueQuantity != null)
				msgs = ((InternalEObject)newDefaultValueQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_QUANTITY, null, msgs);
			msgs = basicSetDefaultValueQuantity(newDefaultValueQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_QUANTITY, newDefaultValueQuantity, newDefaultValueQuantity));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_RANGE, oldDefaultValueRange, newDefaultValueRange);
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
				msgs = ((InternalEObject)defaultValueRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_RANGE, null, msgs);
			if (newDefaultValueRange != null)
				msgs = ((InternalEObject)newDefaultValueRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_RANGE, null, msgs);
			msgs = basicSetDefaultValueRange(newDefaultValueRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_RANGE, newDefaultValueRange, newDefaultValueRange));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_RATIO, oldDefaultValueRatio, newDefaultValueRatio);
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
				msgs = ((InternalEObject)defaultValueRatio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_RATIO, null, msgs);
			if (newDefaultValueRatio != null)
				msgs = ((InternalEObject)newDefaultValueRatio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_RATIO, null, msgs);
			msgs = basicSetDefaultValueRatio(newDefaultValueRatio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_RATIO, newDefaultValueRatio, newDefaultValueRatio));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_REFERENCE, oldDefaultValueReference, newDefaultValueReference);
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
				msgs = ((InternalEObject)defaultValueReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_REFERENCE, null, msgs);
			if (newDefaultValueReference != null)
				msgs = ((InternalEObject)newDefaultValueReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_REFERENCE, null, msgs);
			msgs = basicSetDefaultValueReference(newDefaultValueReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_REFERENCE, newDefaultValueReference, newDefaultValueReference));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_SAMPLED_DATA, oldDefaultValueSampledData, newDefaultValueSampledData);
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
				msgs = ((InternalEObject)defaultValueSampledData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_SAMPLED_DATA, null, msgs);
			if (newDefaultValueSampledData != null)
				msgs = ((InternalEObject)newDefaultValueSampledData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_SAMPLED_DATA, null, msgs);
			msgs = basicSetDefaultValueSampledData(newDefaultValueSampledData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_SAMPLED_DATA, newDefaultValueSampledData, newDefaultValueSampledData));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_SIGNATURE, oldDefaultValueSignature, newDefaultValueSignature);
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
				msgs = ((InternalEObject)defaultValueSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_SIGNATURE, null, msgs);
			if (newDefaultValueSignature != null)
				msgs = ((InternalEObject)newDefaultValueSignature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_SIGNATURE, null, msgs);
			msgs = basicSetDefaultValueSignature(newDefaultValueSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_SIGNATURE, newDefaultValueSignature, newDefaultValueSignature));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_TIMING, oldDefaultValueTiming, newDefaultValueTiming);
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
				msgs = ((InternalEObject)defaultValueTiming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_TIMING, null, msgs);
			if (newDefaultValueTiming != null)
				msgs = ((InternalEObject)newDefaultValueTiming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_TIMING, null, msgs);
			msgs = basicSetDefaultValueTiming(newDefaultValueTiming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_TIMING, newDefaultValueTiming, newDefaultValueTiming));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CONTACT_DETAIL, oldDefaultValueContactDetail, newDefaultValueContactDetail);
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
				msgs = ((InternalEObject)defaultValueContactDetail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CONTACT_DETAIL, null, msgs);
			if (newDefaultValueContactDetail != null)
				msgs = ((InternalEObject)newDefaultValueContactDetail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CONTACT_DETAIL, null, msgs);
			msgs = basicSetDefaultValueContactDetail(newDefaultValueContactDetail, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CONTACT_DETAIL, newDefaultValueContactDetail, newDefaultValueContactDetail));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CONTRIBUTOR, oldDefaultValueContributor, newDefaultValueContributor);
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
				msgs = ((InternalEObject)defaultValueContributor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CONTRIBUTOR, null, msgs);
			if (newDefaultValueContributor != null)
				msgs = ((InternalEObject)newDefaultValueContributor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CONTRIBUTOR, null, msgs);
			msgs = basicSetDefaultValueContributor(newDefaultValueContributor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CONTRIBUTOR, newDefaultValueContributor, newDefaultValueContributor));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DATA_REQUIREMENT, oldDefaultValueDataRequirement, newDefaultValueDataRequirement);
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
				msgs = ((InternalEObject)defaultValueDataRequirement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DATA_REQUIREMENT, null, msgs);
			if (newDefaultValueDataRequirement != null)
				msgs = ((InternalEObject)newDefaultValueDataRequirement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DATA_REQUIREMENT, null, msgs);
			msgs = basicSetDefaultValueDataRequirement(newDefaultValueDataRequirement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DATA_REQUIREMENT, newDefaultValueDataRequirement, newDefaultValueDataRequirement));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_EXPRESSION, oldDefaultValueExpression, newDefaultValueExpression);
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
				msgs = ((InternalEObject)defaultValueExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_EXPRESSION, null, msgs);
			if (newDefaultValueExpression != null)
				msgs = ((InternalEObject)newDefaultValueExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_EXPRESSION, null, msgs);
			msgs = basicSetDefaultValueExpression(newDefaultValueExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_EXPRESSION, newDefaultValueExpression, newDefaultValueExpression));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_PARAMETER_DEFINITION, oldDefaultValueParameterDefinition, newDefaultValueParameterDefinition);
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
				msgs = ((InternalEObject)defaultValueParameterDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_PARAMETER_DEFINITION, null, msgs);
			if (newDefaultValueParameterDefinition != null)
				msgs = ((InternalEObject)newDefaultValueParameterDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_PARAMETER_DEFINITION, null, msgs);
			msgs = basicSetDefaultValueParameterDefinition(newDefaultValueParameterDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_PARAMETER_DEFINITION, newDefaultValueParameterDefinition, newDefaultValueParameterDefinition));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_RELATED_ARTIFACT, oldDefaultValueRelatedArtifact, newDefaultValueRelatedArtifact);
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
				msgs = ((InternalEObject)defaultValueRelatedArtifact).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_RELATED_ARTIFACT, null, msgs);
			if (newDefaultValueRelatedArtifact != null)
				msgs = ((InternalEObject)newDefaultValueRelatedArtifact).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_RELATED_ARTIFACT, null, msgs);
			msgs = basicSetDefaultValueRelatedArtifact(newDefaultValueRelatedArtifact, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_RELATED_ARTIFACT, newDefaultValueRelatedArtifact, newDefaultValueRelatedArtifact));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_TRIGGER_DEFINITION, oldDefaultValueTriggerDefinition, newDefaultValueTriggerDefinition);
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
				msgs = ((InternalEObject)defaultValueTriggerDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_TRIGGER_DEFINITION, null, msgs);
			if (newDefaultValueTriggerDefinition != null)
				msgs = ((InternalEObject)newDefaultValueTriggerDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_TRIGGER_DEFINITION, null, msgs);
			msgs = basicSetDefaultValueTriggerDefinition(newDefaultValueTriggerDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_TRIGGER_DEFINITION, newDefaultValueTriggerDefinition, newDefaultValueTriggerDefinition));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_USAGE_CONTEXT, oldDefaultValueUsageContext, newDefaultValueUsageContext);
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
				msgs = ((InternalEObject)defaultValueUsageContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_USAGE_CONTEXT, null, msgs);
			if (newDefaultValueUsageContext != null)
				msgs = ((InternalEObject)newDefaultValueUsageContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_USAGE_CONTEXT, null, msgs);
			msgs = basicSetDefaultValueUsageContext(newDefaultValueUsageContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_USAGE_CONTEXT, newDefaultValueUsageContext, newDefaultValueUsageContext));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DOSAGE, oldDefaultValueDosage, newDefaultValueDosage);
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
				msgs = ((InternalEObject)defaultValueDosage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DOSAGE, null, msgs);
			if (newDefaultValueDosage != null)
				msgs = ((InternalEObject)newDefaultValueDosage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DOSAGE, null, msgs);
			msgs = basicSetDefaultValueDosage(newDefaultValueDosage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DOSAGE, newDefaultValueDosage, newDefaultValueDosage));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_META, oldDefaultValueMeta, newDefaultValueMeta);
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
				msgs = ((InternalEObject)defaultValueMeta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_META, null, msgs);
			if (newDefaultValueMeta != null)
				msgs = ((InternalEObject)newDefaultValueMeta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_META, null, msgs);
			msgs = basicSetDefaultValueMeta(newDefaultValueMeta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_META, newDefaultValueMeta, newDefaultValueMeta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getMeaningWhenMissing() {
		return meaningWhenMissing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeaningWhenMissing(Markdown newMeaningWhenMissing, NotificationChain msgs) {
		Markdown oldMeaningWhenMissing = meaningWhenMissing;
		meaningWhenMissing = newMeaningWhenMissing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MEANING_WHEN_MISSING, oldMeaningWhenMissing, newMeaningWhenMissing);
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
	public void setMeaningWhenMissing(Markdown newMeaningWhenMissing) {
		if (newMeaningWhenMissing != meaningWhenMissing) {
			NotificationChain msgs = null;
			if (meaningWhenMissing != null)
				msgs = ((InternalEObject)meaningWhenMissing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MEANING_WHEN_MISSING, null, msgs);
			if (newMeaningWhenMissing != null)
				msgs = ((InternalEObject)newMeaningWhenMissing).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MEANING_WHEN_MISSING, null, msgs);
			msgs = basicSetMeaningWhenMissing(newMeaningWhenMissing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MEANING_WHEN_MISSING, newMeaningWhenMissing, newMeaningWhenMissing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getOrderMeaning() {
		return orderMeaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrderMeaning(org.hl7.fhir.String newOrderMeaning, NotificationChain msgs) {
		org.hl7.fhir.String oldOrderMeaning = orderMeaning;
		orderMeaning = newOrderMeaning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__ORDER_MEANING, oldOrderMeaning, newOrderMeaning);
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
	public void setOrderMeaning(org.hl7.fhir.String newOrderMeaning) {
		if (newOrderMeaning != orderMeaning) {
			NotificationChain msgs = null;
			if (orderMeaning != null)
				msgs = ((InternalEObject)orderMeaning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__ORDER_MEANING, null, msgs);
			if (newOrderMeaning != null)
				msgs = ((InternalEObject)newOrderMeaning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__ORDER_MEANING, null, msgs);
			msgs = basicSetOrderMeaning(newOrderMeaning, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__ORDER_MEANING, newOrderMeaning, newOrderMeaning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Base64Binary getFixedBase64Binary() {
		return fixedBase64Binary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedBase64Binary(Base64Binary newFixedBase64Binary, NotificationChain msgs) {
		Base64Binary oldFixedBase64Binary = fixedBase64Binary;
		fixedBase64Binary = newFixedBase64Binary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_BASE64_BINARY, oldFixedBase64Binary, newFixedBase64Binary);
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
	public void setFixedBase64Binary(Base64Binary newFixedBase64Binary) {
		if (newFixedBase64Binary != fixedBase64Binary) {
			NotificationChain msgs = null;
			if (fixedBase64Binary != null)
				msgs = ((InternalEObject)fixedBase64Binary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_BASE64_BINARY, null, msgs);
			if (newFixedBase64Binary != null)
				msgs = ((InternalEObject)newFixedBase64Binary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_BASE64_BINARY, null, msgs);
			msgs = basicSetFixedBase64Binary(newFixedBase64Binary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_BASE64_BINARY, newFixedBase64Binary, newFixedBase64Binary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getFixedBoolean() {
		return fixedBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedBoolean(org.hl7.fhir.Boolean newFixedBoolean, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldFixedBoolean = fixedBoolean;
		fixedBoolean = newFixedBoolean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_BOOLEAN, oldFixedBoolean, newFixedBoolean);
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
	public void setFixedBoolean(org.hl7.fhir.Boolean newFixedBoolean) {
		if (newFixedBoolean != fixedBoolean) {
			NotificationChain msgs = null;
			if (fixedBoolean != null)
				msgs = ((InternalEObject)fixedBoolean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_BOOLEAN, null, msgs);
			if (newFixedBoolean != null)
				msgs = ((InternalEObject)newFixedBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_BOOLEAN, null, msgs);
			msgs = basicSetFixedBoolean(newFixedBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_BOOLEAN, newFixedBoolean, newFixedBoolean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Canonical getFixedCanonical() {
		return fixedCanonical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedCanonical(Canonical newFixedCanonical, NotificationChain msgs) {
		Canonical oldFixedCanonical = fixedCanonical;
		fixedCanonical = newFixedCanonical;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_CANONICAL, oldFixedCanonical, newFixedCanonical);
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
	public void setFixedCanonical(Canonical newFixedCanonical) {
		if (newFixedCanonical != fixedCanonical) {
			NotificationChain msgs = null;
			if (fixedCanonical != null)
				msgs = ((InternalEObject)fixedCanonical).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_CANONICAL, null, msgs);
			if (newFixedCanonical != null)
				msgs = ((InternalEObject)newFixedCanonical).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_CANONICAL, null, msgs);
			msgs = basicSetFixedCanonical(newFixedCanonical, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_CANONICAL, newFixedCanonical, newFixedCanonical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getFixedCode() {
		return fixedCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedCode(Code newFixedCode, NotificationChain msgs) {
		Code oldFixedCode = fixedCode;
		fixedCode = newFixedCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_CODE, oldFixedCode, newFixedCode);
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
	public void setFixedCode(Code newFixedCode) {
		if (newFixedCode != fixedCode) {
			NotificationChain msgs = null;
			if (fixedCode != null)
				msgs = ((InternalEObject)fixedCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_CODE, null, msgs);
			if (newFixedCode != null)
				msgs = ((InternalEObject)newFixedCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_CODE, null, msgs);
			msgs = basicSetFixedCode(newFixedCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_CODE, newFixedCode, newFixedCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFixedDate() {
		return fixedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedDate(Date newFixedDate, NotificationChain msgs) {
		Date oldFixedDate = fixedDate;
		fixedDate = newFixedDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_DATE, oldFixedDate, newFixedDate);
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
	public void setFixedDate(Date newFixedDate) {
		if (newFixedDate != fixedDate) {
			NotificationChain msgs = null;
			if (fixedDate != null)
				msgs = ((InternalEObject)fixedDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_DATE, null, msgs);
			if (newFixedDate != null)
				msgs = ((InternalEObject)newFixedDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_DATE, null, msgs);
			msgs = basicSetFixedDate(newFixedDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_DATE, newFixedDate, newFixedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getFixedDateTime() {
		return fixedDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedDateTime(DateTime newFixedDateTime, NotificationChain msgs) {
		DateTime oldFixedDateTime = fixedDateTime;
		fixedDateTime = newFixedDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_DATE_TIME, oldFixedDateTime, newFixedDateTime);
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
	public void setFixedDateTime(DateTime newFixedDateTime) {
		if (newFixedDateTime != fixedDateTime) {
			NotificationChain msgs = null;
			if (fixedDateTime != null)
				msgs = ((InternalEObject)fixedDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_DATE_TIME, null, msgs);
			if (newFixedDateTime != null)
				msgs = ((InternalEObject)newFixedDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_DATE_TIME, null, msgs);
			msgs = basicSetFixedDateTime(newFixedDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_DATE_TIME, newFixedDateTime, newFixedDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getFixedDecimal() {
		return fixedDecimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedDecimal(Decimal newFixedDecimal, NotificationChain msgs) {
		Decimal oldFixedDecimal = fixedDecimal;
		fixedDecimal = newFixedDecimal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_DECIMAL, oldFixedDecimal, newFixedDecimal);
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
	public void setFixedDecimal(Decimal newFixedDecimal) {
		if (newFixedDecimal != fixedDecimal) {
			NotificationChain msgs = null;
			if (fixedDecimal != null)
				msgs = ((InternalEObject)fixedDecimal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_DECIMAL, null, msgs);
			if (newFixedDecimal != null)
				msgs = ((InternalEObject)newFixedDecimal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_DECIMAL, null, msgs);
			msgs = basicSetFixedDecimal(newFixedDecimal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_DECIMAL, newFixedDecimal, newFixedDecimal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Id getFixedId() {
		return fixedId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedId(Id newFixedId, NotificationChain msgs) {
		Id oldFixedId = fixedId;
		fixedId = newFixedId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_ID, oldFixedId, newFixedId);
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
	public void setFixedId(Id newFixedId) {
		if (newFixedId != fixedId) {
			NotificationChain msgs = null;
			if (fixedId != null)
				msgs = ((InternalEObject)fixedId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_ID, null, msgs);
			if (newFixedId != null)
				msgs = ((InternalEObject)newFixedId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_ID, null, msgs);
			msgs = basicSetFixedId(newFixedId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_ID, newFixedId, newFixedId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instant getFixedInstant() {
		return fixedInstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedInstant(Instant newFixedInstant, NotificationChain msgs) {
		Instant oldFixedInstant = fixedInstant;
		fixedInstant = newFixedInstant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_INSTANT, oldFixedInstant, newFixedInstant);
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
	public void setFixedInstant(Instant newFixedInstant) {
		if (newFixedInstant != fixedInstant) {
			NotificationChain msgs = null;
			if (fixedInstant != null)
				msgs = ((InternalEObject)fixedInstant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_INSTANT, null, msgs);
			if (newFixedInstant != null)
				msgs = ((InternalEObject)newFixedInstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_INSTANT, null, msgs);
			msgs = basicSetFixedInstant(newFixedInstant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_INSTANT, newFixedInstant, newFixedInstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Integer getFixedInteger() {
		return fixedInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedInteger(org.hl7.fhir.Integer newFixedInteger, NotificationChain msgs) {
		org.hl7.fhir.Integer oldFixedInteger = fixedInteger;
		fixedInteger = newFixedInteger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_INTEGER, oldFixedInteger, newFixedInteger);
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
	public void setFixedInteger(org.hl7.fhir.Integer newFixedInteger) {
		if (newFixedInteger != fixedInteger) {
			NotificationChain msgs = null;
			if (fixedInteger != null)
				msgs = ((InternalEObject)fixedInteger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_INTEGER, null, msgs);
			if (newFixedInteger != null)
				msgs = ((InternalEObject)newFixedInteger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_INTEGER, null, msgs);
			msgs = basicSetFixedInteger(newFixedInteger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_INTEGER, newFixedInteger, newFixedInteger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getFixedMarkdown() {
		return fixedMarkdown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedMarkdown(Markdown newFixedMarkdown, NotificationChain msgs) {
		Markdown oldFixedMarkdown = fixedMarkdown;
		fixedMarkdown = newFixedMarkdown;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_MARKDOWN, oldFixedMarkdown, newFixedMarkdown);
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
	public void setFixedMarkdown(Markdown newFixedMarkdown) {
		if (newFixedMarkdown != fixedMarkdown) {
			NotificationChain msgs = null;
			if (fixedMarkdown != null)
				msgs = ((InternalEObject)fixedMarkdown).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_MARKDOWN, null, msgs);
			if (newFixedMarkdown != null)
				msgs = ((InternalEObject)newFixedMarkdown).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_MARKDOWN, null, msgs);
			msgs = basicSetFixedMarkdown(newFixedMarkdown, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_MARKDOWN, newFixedMarkdown, newFixedMarkdown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oid getFixedOid() {
		return fixedOid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedOid(Oid newFixedOid, NotificationChain msgs) {
		Oid oldFixedOid = fixedOid;
		fixedOid = newFixedOid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_OID, oldFixedOid, newFixedOid);
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
	public void setFixedOid(Oid newFixedOid) {
		if (newFixedOid != fixedOid) {
			NotificationChain msgs = null;
			if (fixedOid != null)
				msgs = ((InternalEObject)fixedOid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_OID, null, msgs);
			if (newFixedOid != null)
				msgs = ((InternalEObject)newFixedOid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_OID, null, msgs);
			msgs = basicSetFixedOid(newFixedOid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_OID, newFixedOid, newFixedOid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getFixedPositiveInt() {
		return fixedPositiveInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedPositiveInt(PositiveInt newFixedPositiveInt, NotificationChain msgs) {
		PositiveInt oldFixedPositiveInt = fixedPositiveInt;
		fixedPositiveInt = newFixedPositiveInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_POSITIVE_INT, oldFixedPositiveInt, newFixedPositiveInt);
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
	public void setFixedPositiveInt(PositiveInt newFixedPositiveInt) {
		if (newFixedPositiveInt != fixedPositiveInt) {
			NotificationChain msgs = null;
			if (fixedPositiveInt != null)
				msgs = ((InternalEObject)fixedPositiveInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_POSITIVE_INT, null, msgs);
			if (newFixedPositiveInt != null)
				msgs = ((InternalEObject)newFixedPositiveInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_POSITIVE_INT, null, msgs);
			msgs = basicSetFixedPositiveInt(newFixedPositiveInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_POSITIVE_INT, newFixedPositiveInt, newFixedPositiveInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getFixedString() {
		return fixedString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedString(org.hl7.fhir.String newFixedString, NotificationChain msgs) {
		org.hl7.fhir.String oldFixedString = fixedString;
		fixedString = newFixedString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_STRING, oldFixedString, newFixedString);
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
	public void setFixedString(org.hl7.fhir.String newFixedString) {
		if (newFixedString != fixedString) {
			NotificationChain msgs = null;
			if (fixedString != null)
				msgs = ((InternalEObject)fixedString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_STRING, null, msgs);
			if (newFixedString != null)
				msgs = ((InternalEObject)newFixedString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_STRING, null, msgs);
			msgs = basicSetFixedString(newFixedString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_STRING, newFixedString, newFixedString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Time getFixedTime() {
		return fixedTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedTime(Time newFixedTime, NotificationChain msgs) {
		Time oldFixedTime = fixedTime;
		fixedTime = newFixedTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_TIME, oldFixedTime, newFixedTime);
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
	public void setFixedTime(Time newFixedTime) {
		if (newFixedTime != fixedTime) {
			NotificationChain msgs = null;
			if (fixedTime != null)
				msgs = ((InternalEObject)fixedTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_TIME, null, msgs);
			if (newFixedTime != null)
				msgs = ((InternalEObject)newFixedTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_TIME, null, msgs);
			msgs = basicSetFixedTime(newFixedTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_TIME, newFixedTime, newFixedTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnsignedInt getFixedUnsignedInt() {
		return fixedUnsignedInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedUnsignedInt(UnsignedInt newFixedUnsignedInt, NotificationChain msgs) {
		UnsignedInt oldFixedUnsignedInt = fixedUnsignedInt;
		fixedUnsignedInt = newFixedUnsignedInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_UNSIGNED_INT, oldFixedUnsignedInt, newFixedUnsignedInt);
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
	public void setFixedUnsignedInt(UnsignedInt newFixedUnsignedInt) {
		if (newFixedUnsignedInt != fixedUnsignedInt) {
			NotificationChain msgs = null;
			if (fixedUnsignedInt != null)
				msgs = ((InternalEObject)fixedUnsignedInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_UNSIGNED_INT, null, msgs);
			if (newFixedUnsignedInt != null)
				msgs = ((InternalEObject)newFixedUnsignedInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_UNSIGNED_INT, null, msgs);
			msgs = basicSetFixedUnsignedInt(newFixedUnsignedInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_UNSIGNED_INT, newFixedUnsignedInt, newFixedUnsignedInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getFixedUri() {
		return fixedUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedUri(Uri newFixedUri, NotificationChain msgs) {
		Uri oldFixedUri = fixedUri;
		fixedUri = newFixedUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_URI, oldFixedUri, newFixedUri);
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
	public void setFixedUri(Uri newFixedUri) {
		if (newFixedUri != fixedUri) {
			NotificationChain msgs = null;
			if (fixedUri != null)
				msgs = ((InternalEObject)fixedUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_URI, null, msgs);
			if (newFixedUri != null)
				msgs = ((InternalEObject)newFixedUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_URI, null, msgs);
			msgs = basicSetFixedUri(newFixedUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_URI, newFixedUri, newFixedUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Url getFixedUrl() {
		return fixedUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedUrl(Url newFixedUrl, NotificationChain msgs) {
		Url oldFixedUrl = fixedUrl;
		fixedUrl = newFixedUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_URL, oldFixedUrl, newFixedUrl);
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
	public void setFixedUrl(Url newFixedUrl) {
		if (newFixedUrl != fixedUrl) {
			NotificationChain msgs = null;
			if (fixedUrl != null)
				msgs = ((InternalEObject)fixedUrl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_URL, null, msgs);
			if (newFixedUrl != null)
				msgs = ((InternalEObject)newFixedUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_URL, null, msgs);
			msgs = basicSetFixedUrl(newFixedUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_URL, newFixedUrl, newFixedUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uuid getFixedUuid() {
		return fixedUuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedUuid(Uuid newFixedUuid, NotificationChain msgs) {
		Uuid oldFixedUuid = fixedUuid;
		fixedUuid = newFixedUuid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_UUID, oldFixedUuid, newFixedUuid);
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
	public void setFixedUuid(Uuid newFixedUuid) {
		if (newFixedUuid != fixedUuid) {
			NotificationChain msgs = null;
			if (fixedUuid != null)
				msgs = ((InternalEObject)fixedUuid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_UUID, null, msgs);
			if (newFixedUuid != null)
				msgs = ((InternalEObject)newFixedUuid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_UUID, null, msgs);
			msgs = basicSetFixedUuid(newFixedUuid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_UUID, newFixedUuid, newFixedUuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Address getFixedAddress() {
		return fixedAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedAddress(Address newFixedAddress, NotificationChain msgs) {
		Address oldFixedAddress = fixedAddress;
		fixedAddress = newFixedAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_ADDRESS, oldFixedAddress, newFixedAddress);
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
	public void setFixedAddress(Address newFixedAddress) {
		if (newFixedAddress != fixedAddress) {
			NotificationChain msgs = null;
			if (fixedAddress != null)
				msgs = ((InternalEObject)fixedAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_ADDRESS, null, msgs);
			if (newFixedAddress != null)
				msgs = ((InternalEObject)newFixedAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_ADDRESS, null, msgs);
			msgs = basicSetFixedAddress(newFixedAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_ADDRESS, newFixedAddress, newFixedAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Age getFixedAge() {
		return fixedAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedAge(Age newFixedAge, NotificationChain msgs) {
		Age oldFixedAge = fixedAge;
		fixedAge = newFixedAge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_AGE, oldFixedAge, newFixedAge);
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
	public void setFixedAge(Age newFixedAge) {
		if (newFixedAge != fixedAge) {
			NotificationChain msgs = null;
			if (fixedAge != null)
				msgs = ((InternalEObject)fixedAge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_AGE, null, msgs);
			if (newFixedAge != null)
				msgs = ((InternalEObject)newFixedAge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_AGE, null, msgs);
			msgs = basicSetFixedAge(newFixedAge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_AGE, newFixedAge, newFixedAge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Annotation getFixedAnnotation() {
		return fixedAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedAnnotation(Annotation newFixedAnnotation, NotificationChain msgs) {
		Annotation oldFixedAnnotation = fixedAnnotation;
		fixedAnnotation = newFixedAnnotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_ANNOTATION, oldFixedAnnotation, newFixedAnnotation);
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
	public void setFixedAnnotation(Annotation newFixedAnnotation) {
		if (newFixedAnnotation != fixedAnnotation) {
			NotificationChain msgs = null;
			if (fixedAnnotation != null)
				msgs = ((InternalEObject)fixedAnnotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_ANNOTATION, null, msgs);
			if (newFixedAnnotation != null)
				msgs = ((InternalEObject)newFixedAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_ANNOTATION, null, msgs);
			msgs = basicSetFixedAnnotation(newFixedAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_ANNOTATION, newFixedAnnotation, newFixedAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attachment getFixedAttachment() {
		return fixedAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedAttachment(Attachment newFixedAttachment, NotificationChain msgs) {
		Attachment oldFixedAttachment = fixedAttachment;
		fixedAttachment = newFixedAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_ATTACHMENT, oldFixedAttachment, newFixedAttachment);
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
	public void setFixedAttachment(Attachment newFixedAttachment) {
		if (newFixedAttachment != fixedAttachment) {
			NotificationChain msgs = null;
			if (fixedAttachment != null)
				msgs = ((InternalEObject)fixedAttachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_ATTACHMENT, null, msgs);
			if (newFixedAttachment != null)
				msgs = ((InternalEObject)newFixedAttachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_ATTACHMENT, null, msgs);
			msgs = basicSetFixedAttachment(newFixedAttachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_ATTACHMENT, newFixedAttachment, newFixedAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getFixedCodeableConcept() {
		return fixedCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedCodeableConcept(CodeableConcept newFixedCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldFixedCodeableConcept = fixedCodeableConcept;
		fixedCodeableConcept = newFixedCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_CODEABLE_CONCEPT, oldFixedCodeableConcept, newFixedCodeableConcept);
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
	public void setFixedCodeableConcept(CodeableConcept newFixedCodeableConcept) {
		if (newFixedCodeableConcept != fixedCodeableConcept) {
			NotificationChain msgs = null;
			if (fixedCodeableConcept != null)
				msgs = ((InternalEObject)fixedCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_CODEABLE_CONCEPT, null, msgs);
			if (newFixedCodeableConcept != null)
				msgs = ((InternalEObject)newFixedCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetFixedCodeableConcept(newFixedCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_CODEABLE_CONCEPT, newFixedCodeableConcept, newFixedCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coding getFixedCoding() {
		return fixedCoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedCoding(Coding newFixedCoding, NotificationChain msgs) {
		Coding oldFixedCoding = fixedCoding;
		fixedCoding = newFixedCoding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_CODING, oldFixedCoding, newFixedCoding);
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
	public void setFixedCoding(Coding newFixedCoding) {
		if (newFixedCoding != fixedCoding) {
			NotificationChain msgs = null;
			if (fixedCoding != null)
				msgs = ((InternalEObject)fixedCoding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_CODING, null, msgs);
			if (newFixedCoding != null)
				msgs = ((InternalEObject)newFixedCoding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_CODING, null, msgs);
			msgs = basicSetFixedCoding(newFixedCoding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_CODING, newFixedCoding, newFixedCoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactPoint getFixedContactPoint() {
		return fixedContactPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedContactPoint(ContactPoint newFixedContactPoint, NotificationChain msgs) {
		ContactPoint oldFixedContactPoint = fixedContactPoint;
		fixedContactPoint = newFixedContactPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_CONTACT_POINT, oldFixedContactPoint, newFixedContactPoint);
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
	public void setFixedContactPoint(ContactPoint newFixedContactPoint) {
		if (newFixedContactPoint != fixedContactPoint) {
			NotificationChain msgs = null;
			if (fixedContactPoint != null)
				msgs = ((InternalEObject)fixedContactPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_CONTACT_POINT, null, msgs);
			if (newFixedContactPoint != null)
				msgs = ((InternalEObject)newFixedContactPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_CONTACT_POINT, null, msgs);
			msgs = basicSetFixedContactPoint(newFixedContactPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_CONTACT_POINT, newFixedContactPoint, newFixedContactPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Count getFixedCount() {
		return fixedCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedCount(Count newFixedCount, NotificationChain msgs) {
		Count oldFixedCount = fixedCount;
		fixedCount = newFixedCount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_COUNT, oldFixedCount, newFixedCount);
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
	public void setFixedCount(Count newFixedCount) {
		if (newFixedCount != fixedCount) {
			NotificationChain msgs = null;
			if (fixedCount != null)
				msgs = ((InternalEObject)fixedCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_COUNT, null, msgs);
			if (newFixedCount != null)
				msgs = ((InternalEObject)newFixedCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_COUNT, null, msgs);
			msgs = basicSetFixedCount(newFixedCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_COUNT, newFixedCount, newFixedCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Distance getFixedDistance() {
		return fixedDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedDistance(Distance newFixedDistance, NotificationChain msgs) {
		Distance oldFixedDistance = fixedDistance;
		fixedDistance = newFixedDistance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_DISTANCE, oldFixedDistance, newFixedDistance);
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
	public void setFixedDistance(Distance newFixedDistance) {
		if (newFixedDistance != fixedDistance) {
			NotificationChain msgs = null;
			if (fixedDistance != null)
				msgs = ((InternalEObject)fixedDistance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_DISTANCE, null, msgs);
			if (newFixedDistance != null)
				msgs = ((InternalEObject)newFixedDistance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_DISTANCE, null, msgs);
			msgs = basicSetFixedDistance(newFixedDistance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_DISTANCE, newFixedDistance, newFixedDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getFixedDuration() {
		return fixedDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedDuration(Duration newFixedDuration, NotificationChain msgs) {
		Duration oldFixedDuration = fixedDuration;
		fixedDuration = newFixedDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_DURATION, oldFixedDuration, newFixedDuration);
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
	public void setFixedDuration(Duration newFixedDuration) {
		if (newFixedDuration != fixedDuration) {
			NotificationChain msgs = null;
			if (fixedDuration != null)
				msgs = ((InternalEObject)fixedDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_DURATION, null, msgs);
			if (newFixedDuration != null)
				msgs = ((InternalEObject)newFixedDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_DURATION, null, msgs);
			msgs = basicSetFixedDuration(newFixedDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_DURATION, newFixedDuration, newFixedDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HumanName getFixedHumanName() {
		return fixedHumanName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedHumanName(HumanName newFixedHumanName, NotificationChain msgs) {
		HumanName oldFixedHumanName = fixedHumanName;
		fixedHumanName = newFixedHumanName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_HUMAN_NAME, oldFixedHumanName, newFixedHumanName);
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
	public void setFixedHumanName(HumanName newFixedHumanName) {
		if (newFixedHumanName != fixedHumanName) {
			NotificationChain msgs = null;
			if (fixedHumanName != null)
				msgs = ((InternalEObject)fixedHumanName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_HUMAN_NAME, null, msgs);
			if (newFixedHumanName != null)
				msgs = ((InternalEObject)newFixedHumanName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_HUMAN_NAME, null, msgs);
			msgs = basicSetFixedHumanName(newFixedHumanName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_HUMAN_NAME, newFixedHumanName, newFixedHumanName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getFixedIdentifier() {
		return fixedIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedIdentifier(Identifier newFixedIdentifier, NotificationChain msgs) {
		Identifier oldFixedIdentifier = fixedIdentifier;
		fixedIdentifier = newFixedIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_IDENTIFIER, oldFixedIdentifier, newFixedIdentifier);
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
	public void setFixedIdentifier(Identifier newFixedIdentifier) {
		if (newFixedIdentifier != fixedIdentifier) {
			NotificationChain msgs = null;
			if (fixedIdentifier != null)
				msgs = ((InternalEObject)fixedIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_IDENTIFIER, null, msgs);
			if (newFixedIdentifier != null)
				msgs = ((InternalEObject)newFixedIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_IDENTIFIER, null, msgs);
			msgs = basicSetFixedIdentifier(newFixedIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_IDENTIFIER, newFixedIdentifier, newFixedIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Money getFixedMoney() {
		return fixedMoney;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedMoney(Money newFixedMoney, NotificationChain msgs) {
		Money oldFixedMoney = fixedMoney;
		fixedMoney = newFixedMoney;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_MONEY, oldFixedMoney, newFixedMoney);
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
	public void setFixedMoney(Money newFixedMoney) {
		if (newFixedMoney != fixedMoney) {
			NotificationChain msgs = null;
			if (fixedMoney != null)
				msgs = ((InternalEObject)fixedMoney).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_MONEY, null, msgs);
			if (newFixedMoney != null)
				msgs = ((InternalEObject)newFixedMoney).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_MONEY, null, msgs);
			msgs = basicSetFixedMoney(newFixedMoney, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_MONEY, newFixedMoney, newFixedMoney));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getFixedPeriod() {
		return fixedPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedPeriod(Period newFixedPeriod, NotificationChain msgs) {
		Period oldFixedPeriod = fixedPeriod;
		fixedPeriod = newFixedPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_PERIOD, oldFixedPeriod, newFixedPeriod);
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
	public void setFixedPeriod(Period newFixedPeriod) {
		if (newFixedPeriod != fixedPeriod) {
			NotificationChain msgs = null;
			if (fixedPeriod != null)
				msgs = ((InternalEObject)fixedPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_PERIOD, null, msgs);
			if (newFixedPeriod != null)
				msgs = ((InternalEObject)newFixedPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_PERIOD, null, msgs);
			msgs = basicSetFixedPeriod(newFixedPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_PERIOD, newFixedPeriod, newFixedPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getFixedQuantity() {
		return fixedQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedQuantity(Quantity newFixedQuantity, NotificationChain msgs) {
		Quantity oldFixedQuantity = fixedQuantity;
		fixedQuantity = newFixedQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_QUANTITY, oldFixedQuantity, newFixedQuantity);
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
	public void setFixedQuantity(Quantity newFixedQuantity) {
		if (newFixedQuantity != fixedQuantity) {
			NotificationChain msgs = null;
			if (fixedQuantity != null)
				msgs = ((InternalEObject)fixedQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_QUANTITY, null, msgs);
			if (newFixedQuantity != null)
				msgs = ((InternalEObject)newFixedQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_QUANTITY, null, msgs);
			msgs = basicSetFixedQuantity(newFixedQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_QUANTITY, newFixedQuantity, newFixedQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Range getFixedRange() {
		return fixedRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedRange(Range newFixedRange, NotificationChain msgs) {
		Range oldFixedRange = fixedRange;
		fixedRange = newFixedRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_RANGE, oldFixedRange, newFixedRange);
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
	public void setFixedRange(Range newFixedRange) {
		if (newFixedRange != fixedRange) {
			NotificationChain msgs = null;
			if (fixedRange != null)
				msgs = ((InternalEObject)fixedRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_RANGE, null, msgs);
			if (newFixedRange != null)
				msgs = ((InternalEObject)newFixedRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_RANGE, null, msgs);
			msgs = basicSetFixedRange(newFixedRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_RANGE, newFixedRange, newFixedRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ratio getFixedRatio() {
		return fixedRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedRatio(Ratio newFixedRatio, NotificationChain msgs) {
		Ratio oldFixedRatio = fixedRatio;
		fixedRatio = newFixedRatio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_RATIO, oldFixedRatio, newFixedRatio);
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
	public void setFixedRatio(Ratio newFixedRatio) {
		if (newFixedRatio != fixedRatio) {
			NotificationChain msgs = null;
			if (fixedRatio != null)
				msgs = ((InternalEObject)fixedRatio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_RATIO, null, msgs);
			if (newFixedRatio != null)
				msgs = ((InternalEObject)newFixedRatio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_RATIO, null, msgs);
			msgs = basicSetFixedRatio(newFixedRatio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_RATIO, newFixedRatio, newFixedRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getFixedReference() {
		return fixedReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedReference(Reference newFixedReference, NotificationChain msgs) {
		Reference oldFixedReference = fixedReference;
		fixedReference = newFixedReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_REFERENCE, oldFixedReference, newFixedReference);
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
	public void setFixedReference(Reference newFixedReference) {
		if (newFixedReference != fixedReference) {
			NotificationChain msgs = null;
			if (fixedReference != null)
				msgs = ((InternalEObject)fixedReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_REFERENCE, null, msgs);
			if (newFixedReference != null)
				msgs = ((InternalEObject)newFixedReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_REFERENCE, null, msgs);
			msgs = basicSetFixedReference(newFixedReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_REFERENCE, newFixedReference, newFixedReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SampledData getFixedSampledData() {
		return fixedSampledData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedSampledData(SampledData newFixedSampledData, NotificationChain msgs) {
		SampledData oldFixedSampledData = fixedSampledData;
		fixedSampledData = newFixedSampledData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_SAMPLED_DATA, oldFixedSampledData, newFixedSampledData);
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
	public void setFixedSampledData(SampledData newFixedSampledData) {
		if (newFixedSampledData != fixedSampledData) {
			NotificationChain msgs = null;
			if (fixedSampledData != null)
				msgs = ((InternalEObject)fixedSampledData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_SAMPLED_DATA, null, msgs);
			if (newFixedSampledData != null)
				msgs = ((InternalEObject)newFixedSampledData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_SAMPLED_DATA, null, msgs);
			msgs = basicSetFixedSampledData(newFixedSampledData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_SAMPLED_DATA, newFixedSampledData, newFixedSampledData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signature getFixedSignature() {
		return fixedSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedSignature(Signature newFixedSignature, NotificationChain msgs) {
		Signature oldFixedSignature = fixedSignature;
		fixedSignature = newFixedSignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_SIGNATURE, oldFixedSignature, newFixedSignature);
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
	public void setFixedSignature(Signature newFixedSignature) {
		if (newFixedSignature != fixedSignature) {
			NotificationChain msgs = null;
			if (fixedSignature != null)
				msgs = ((InternalEObject)fixedSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_SIGNATURE, null, msgs);
			if (newFixedSignature != null)
				msgs = ((InternalEObject)newFixedSignature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_SIGNATURE, null, msgs);
			msgs = basicSetFixedSignature(newFixedSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_SIGNATURE, newFixedSignature, newFixedSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Timing getFixedTiming() {
		return fixedTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedTiming(Timing newFixedTiming, NotificationChain msgs) {
		Timing oldFixedTiming = fixedTiming;
		fixedTiming = newFixedTiming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_TIMING, oldFixedTiming, newFixedTiming);
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
	public void setFixedTiming(Timing newFixedTiming) {
		if (newFixedTiming != fixedTiming) {
			NotificationChain msgs = null;
			if (fixedTiming != null)
				msgs = ((InternalEObject)fixedTiming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_TIMING, null, msgs);
			if (newFixedTiming != null)
				msgs = ((InternalEObject)newFixedTiming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_TIMING, null, msgs);
			msgs = basicSetFixedTiming(newFixedTiming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_TIMING, newFixedTiming, newFixedTiming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactDetail getFixedContactDetail() {
		return fixedContactDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedContactDetail(ContactDetail newFixedContactDetail, NotificationChain msgs) {
		ContactDetail oldFixedContactDetail = fixedContactDetail;
		fixedContactDetail = newFixedContactDetail;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_CONTACT_DETAIL, oldFixedContactDetail, newFixedContactDetail);
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
	public void setFixedContactDetail(ContactDetail newFixedContactDetail) {
		if (newFixedContactDetail != fixedContactDetail) {
			NotificationChain msgs = null;
			if (fixedContactDetail != null)
				msgs = ((InternalEObject)fixedContactDetail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_CONTACT_DETAIL, null, msgs);
			if (newFixedContactDetail != null)
				msgs = ((InternalEObject)newFixedContactDetail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_CONTACT_DETAIL, null, msgs);
			msgs = basicSetFixedContactDetail(newFixedContactDetail, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_CONTACT_DETAIL, newFixedContactDetail, newFixedContactDetail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Contributor getFixedContributor() {
		return fixedContributor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedContributor(Contributor newFixedContributor, NotificationChain msgs) {
		Contributor oldFixedContributor = fixedContributor;
		fixedContributor = newFixedContributor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_CONTRIBUTOR, oldFixedContributor, newFixedContributor);
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
	public void setFixedContributor(Contributor newFixedContributor) {
		if (newFixedContributor != fixedContributor) {
			NotificationChain msgs = null;
			if (fixedContributor != null)
				msgs = ((InternalEObject)fixedContributor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_CONTRIBUTOR, null, msgs);
			if (newFixedContributor != null)
				msgs = ((InternalEObject)newFixedContributor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_CONTRIBUTOR, null, msgs);
			msgs = basicSetFixedContributor(newFixedContributor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_CONTRIBUTOR, newFixedContributor, newFixedContributor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataRequirement getFixedDataRequirement() {
		return fixedDataRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedDataRequirement(DataRequirement newFixedDataRequirement, NotificationChain msgs) {
		DataRequirement oldFixedDataRequirement = fixedDataRequirement;
		fixedDataRequirement = newFixedDataRequirement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_DATA_REQUIREMENT, oldFixedDataRequirement, newFixedDataRequirement);
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
	public void setFixedDataRequirement(DataRequirement newFixedDataRequirement) {
		if (newFixedDataRequirement != fixedDataRequirement) {
			NotificationChain msgs = null;
			if (fixedDataRequirement != null)
				msgs = ((InternalEObject)fixedDataRequirement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_DATA_REQUIREMENT, null, msgs);
			if (newFixedDataRequirement != null)
				msgs = ((InternalEObject)newFixedDataRequirement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_DATA_REQUIREMENT, null, msgs);
			msgs = basicSetFixedDataRequirement(newFixedDataRequirement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_DATA_REQUIREMENT, newFixedDataRequirement, newFixedDataRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getFixedExpression() {
		return fixedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedExpression(Expression newFixedExpression, NotificationChain msgs) {
		Expression oldFixedExpression = fixedExpression;
		fixedExpression = newFixedExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_EXPRESSION, oldFixedExpression, newFixedExpression);
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
	public void setFixedExpression(Expression newFixedExpression) {
		if (newFixedExpression != fixedExpression) {
			NotificationChain msgs = null;
			if (fixedExpression != null)
				msgs = ((InternalEObject)fixedExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_EXPRESSION, null, msgs);
			if (newFixedExpression != null)
				msgs = ((InternalEObject)newFixedExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_EXPRESSION, null, msgs);
			msgs = basicSetFixedExpression(newFixedExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_EXPRESSION, newFixedExpression, newFixedExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterDefinition getFixedParameterDefinition() {
		return fixedParameterDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedParameterDefinition(ParameterDefinition newFixedParameterDefinition, NotificationChain msgs) {
		ParameterDefinition oldFixedParameterDefinition = fixedParameterDefinition;
		fixedParameterDefinition = newFixedParameterDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_PARAMETER_DEFINITION, oldFixedParameterDefinition, newFixedParameterDefinition);
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
	public void setFixedParameterDefinition(ParameterDefinition newFixedParameterDefinition) {
		if (newFixedParameterDefinition != fixedParameterDefinition) {
			NotificationChain msgs = null;
			if (fixedParameterDefinition != null)
				msgs = ((InternalEObject)fixedParameterDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_PARAMETER_DEFINITION, null, msgs);
			if (newFixedParameterDefinition != null)
				msgs = ((InternalEObject)newFixedParameterDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_PARAMETER_DEFINITION, null, msgs);
			msgs = basicSetFixedParameterDefinition(newFixedParameterDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_PARAMETER_DEFINITION, newFixedParameterDefinition, newFixedParameterDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelatedArtifact getFixedRelatedArtifact() {
		return fixedRelatedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedRelatedArtifact(RelatedArtifact newFixedRelatedArtifact, NotificationChain msgs) {
		RelatedArtifact oldFixedRelatedArtifact = fixedRelatedArtifact;
		fixedRelatedArtifact = newFixedRelatedArtifact;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_RELATED_ARTIFACT, oldFixedRelatedArtifact, newFixedRelatedArtifact);
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
	public void setFixedRelatedArtifact(RelatedArtifact newFixedRelatedArtifact) {
		if (newFixedRelatedArtifact != fixedRelatedArtifact) {
			NotificationChain msgs = null;
			if (fixedRelatedArtifact != null)
				msgs = ((InternalEObject)fixedRelatedArtifact).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_RELATED_ARTIFACT, null, msgs);
			if (newFixedRelatedArtifact != null)
				msgs = ((InternalEObject)newFixedRelatedArtifact).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_RELATED_ARTIFACT, null, msgs);
			msgs = basicSetFixedRelatedArtifact(newFixedRelatedArtifact, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_RELATED_ARTIFACT, newFixedRelatedArtifact, newFixedRelatedArtifact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TriggerDefinition getFixedTriggerDefinition() {
		return fixedTriggerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedTriggerDefinition(TriggerDefinition newFixedTriggerDefinition, NotificationChain msgs) {
		TriggerDefinition oldFixedTriggerDefinition = fixedTriggerDefinition;
		fixedTriggerDefinition = newFixedTriggerDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_TRIGGER_DEFINITION, oldFixedTriggerDefinition, newFixedTriggerDefinition);
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
	public void setFixedTriggerDefinition(TriggerDefinition newFixedTriggerDefinition) {
		if (newFixedTriggerDefinition != fixedTriggerDefinition) {
			NotificationChain msgs = null;
			if (fixedTriggerDefinition != null)
				msgs = ((InternalEObject)fixedTriggerDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_TRIGGER_DEFINITION, null, msgs);
			if (newFixedTriggerDefinition != null)
				msgs = ((InternalEObject)newFixedTriggerDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_TRIGGER_DEFINITION, null, msgs);
			msgs = basicSetFixedTriggerDefinition(newFixedTriggerDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_TRIGGER_DEFINITION, newFixedTriggerDefinition, newFixedTriggerDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UsageContext getFixedUsageContext() {
		return fixedUsageContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedUsageContext(UsageContext newFixedUsageContext, NotificationChain msgs) {
		UsageContext oldFixedUsageContext = fixedUsageContext;
		fixedUsageContext = newFixedUsageContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_USAGE_CONTEXT, oldFixedUsageContext, newFixedUsageContext);
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
	public void setFixedUsageContext(UsageContext newFixedUsageContext) {
		if (newFixedUsageContext != fixedUsageContext) {
			NotificationChain msgs = null;
			if (fixedUsageContext != null)
				msgs = ((InternalEObject)fixedUsageContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_USAGE_CONTEXT, null, msgs);
			if (newFixedUsageContext != null)
				msgs = ((InternalEObject)newFixedUsageContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_USAGE_CONTEXT, null, msgs);
			msgs = basicSetFixedUsageContext(newFixedUsageContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_USAGE_CONTEXT, newFixedUsageContext, newFixedUsageContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dosage getFixedDosage() {
		return fixedDosage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedDosage(Dosage newFixedDosage, NotificationChain msgs) {
		Dosage oldFixedDosage = fixedDosage;
		fixedDosage = newFixedDosage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_DOSAGE, oldFixedDosage, newFixedDosage);
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
	public void setFixedDosage(Dosage newFixedDosage) {
		if (newFixedDosage != fixedDosage) {
			NotificationChain msgs = null;
			if (fixedDosage != null)
				msgs = ((InternalEObject)fixedDosage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_DOSAGE, null, msgs);
			if (newFixedDosage != null)
				msgs = ((InternalEObject)newFixedDosage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_DOSAGE, null, msgs);
			msgs = basicSetFixedDosage(newFixedDosage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_DOSAGE, newFixedDosage, newFixedDosage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Meta getFixedMeta() {
		return fixedMeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedMeta(Meta newFixedMeta, NotificationChain msgs) {
		Meta oldFixedMeta = fixedMeta;
		fixedMeta = newFixedMeta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_META, oldFixedMeta, newFixedMeta);
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
	public void setFixedMeta(Meta newFixedMeta) {
		if (newFixedMeta != fixedMeta) {
			NotificationChain msgs = null;
			if (fixedMeta != null)
				msgs = ((InternalEObject)fixedMeta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_META, null, msgs);
			if (newFixedMeta != null)
				msgs = ((InternalEObject)newFixedMeta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_META, null, msgs);
			msgs = basicSetFixedMeta(newFixedMeta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_META, newFixedMeta, newFixedMeta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Base64Binary getPatternBase64Binary() {
		return patternBase64Binary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternBase64Binary(Base64Binary newPatternBase64Binary, NotificationChain msgs) {
		Base64Binary oldPatternBase64Binary = patternBase64Binary;
		patternBase64Binary = newPatternBase64Binary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_BASE64_BINARY, oldPatternBase64Binary, newPatternBase64Binary);
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
	public void setPatternBase64Binary(Base64Binary newPatternBase64Binary) {
		if (newPatternBase64Binary != patternBase64Binary) {
			NotificationChain msgs = null;
			if (patternBase64Binary != null)
				msgs = ((InternalEObject)patternBase64Binary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_BASE64_BINARY, null, msgs);
			if (newPatternBase64Binary != null)
				msgs = ((InternalEObject)newPatternBase64Binary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_BASE64_BINARY, null, msgs);
			msgs = basicSetPatternBase64Binary(newPatternBase64Binary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_BASE64_BINARY, newPatternBase64Binary, newPatternBase64Binary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getPatternBoolean() {
		return patternBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternBoolean(org.hl7.fhir.Boolean newPatternBoolean, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldPatternBoolean = patternBoolean;
		patternBoolean = newPatternBoolean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_BOOLEAN, oldPatternBoolean, newPatternBoolean);
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
	public void setPatternBoolean(org.hl7.fhir.Boolean newPatternBoolean) {
		if (newPatternBoolean != patternBoolean) {
			NotificationChain msgs = null;
			if (patternBoolean != null)
				msgs = ((InternalEObject)patternBoolean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_BOOLEAN, null, msgs);
			if (newPatternBoolean != null)
				msgs = ((InternalEObject)newPatternBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_BOOLEAN, null, msgs);
			msgs = basicSetPatternBoolean(newPatternBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_BOOLEAN, newPatternBoolean, newPatternBoolean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Canonical getPatternCanonical() {
		return patternCanonical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternCanonical(Canonical newPatternCanonical, NotificationChain msgs) {
		Canonical oldPatternCanonical = patternCanonical;
		patternCanonical = newPatternCanonical;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_CANONICAL, oldPatternCanonical, newPatternCanonical);
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
	public void setPatternCanonical(Canonical newPatternCanonical) {
		if (newPatternCanonical != patternCanonical) {
			NotificationChain msgs = null;
			if (patternCanonical != null)
				msgs = ((InternalEObject)patternCanonical).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_CANONICAL, null, msgs);
			if (newPatternCanonical != null)
				msgs = ((InternalEObject)newPatternCanonical).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_CANONICAL, null, msgs);
			msgs = basicSetPatternCanonical(newPatternCanonical, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_CANONICAL, newPatternCanonical, newPatternCanonical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getPatternCode() {
		return patternCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternCode(Code newPatternCode, NotificationChain msgs) {
		Code oldPatternCode = patternCode;
		patternCode = newPatternCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_CODE, oldPatternCode, newPatternCode);
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
	public void setPatternCode(Code newPatternCode) {
		if (newPatternCode != patternCode) {
			NotificationChain msgs = null;
			if (patternCode != null)
				msgs = ((InternalEObject)patternCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_CODE, null, msgs);
			if (newPatternCode != null)
				msgs = ((InternalEObject)newPatternCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_CODE, null, msgs);
			msgs = basicSetPatternCode(newPatternCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_CODE, newPatternCode, newPatternCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getPatternDate() {
		return patternDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternDate(Date newPatternDate, NotificationChain msgs) {
		Date oldPatternDate = patternDate;
		patternDate = newPatternDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_DATE, oldPatternDate, newPatternDate);
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
	public void setPatternDate(Date newPatternDate) {
		if (newPatternDate != patternDate) {
			NotificationChain msgs = null;
			if (patternDate != null)
				msgs = ((InternalEObject)patternDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_DATE, null, msgs);
			if (newPatternDate != null)
				msgs = ((InternalEObject)newPatternDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_DATE, null, msgs);
			msgs = basicSetPatternDate(newPatternDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_DATE, newPatternDate, newPatternDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getPatternDateTime() {
		return patternDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternDateTime(DateTime newPatternDateTime, NotificationChain msgs) {
		DateTime oldPatternDateTime = patternDateTime;
		patternDateTime = newPatternDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_DATE_TIME, oldPatternDateTime, newPatternDateTime);
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
	public void setPatternDateTime(DateTime newPatternDateTime) {
		if (newPatternDateTime != patternDateTime) {
			NotificationChain msgs = null;
			if (patternDateTime != null)
				msgs = ((InternalEObject)patternDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_DATE_TIME, null, msgs);
			if (newPatternDateTime != null)
				msgs = ((InternalEObject)newPatternDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_DATE_TIME, null, msgs);
			msgs = basicSetPatternDateTime(newPatternDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_DATE_TIME, newPatternDateTime, newPatternDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getPatternDecimal() {
		return patternDecimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternDecimal(Decimal newPatternDecimal, NotificationChain msgs) {
		Decimal oldPatternDecimal = patternDecimal;
		patternDecimal = newPatternDecimal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_DECIMAL, oldPatternDecimal, newPatternDecimal);
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
	public void setPatternDecimal(Decimal newPatternDecimal) {
		if (newPatternDecimal != patternDecimal) {
			NotificationChain msgs = null;
			if (patternDecimal != null)
				msgs = ((InternalEObject)patternDecimal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_DECIMAL, null, msgs);
			if (newPatternDecimal != null)
				msgs = ((InternalEObject)newPatternDecimal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_DECIMAL, null, msgs);
			msgs = basicSetPatternDecimal(newPatternDecimal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_DECIMAL, newPatternDecimal, newPatternDecimal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Id getPatternId() {
		return patternId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternId(Id newPatternId, NotificationChain msgs) {
		Id oldPatternId = patternId;
		patternId = newPatternId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_ID, oldPatternId, newPatternId);
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
	public void setPatternId(Id newPatternId) {
		if (newPatternId != patternId) {
			NotificationChain msgs = null;
			if (patternId != null)
				msgs = ((InternalEObject)patternId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_ID, null, msgs);
			if (newPatternId != null)
				msgs = ((InternalEObject)newPatternId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_ID, null, msgs);
			msgs = basicSetPatternId(newPatternId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_ID, newPatternId, newPatternId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instant getPatternInstant() {
		return patternInstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternInstant(Instant newPatternInstant, NotificationChain msgs) {
		Instant oldPatternInstant = patternInstant;
		patternInstant = newPatternInstant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_INSTANT, oldPatternInstant, newPatternInstant);
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
	public void setPatternInstant(Instant newPatternInstant) {
		if (newPatternInstant != patternInstant) {
			NotificationChain msgs = null;
			if (patternInstant != null)
				msgs = ((InternalEObject)patternInstant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_INSTANT, null, msgs);
			if (newPatternInstant != null)
				msgs = ((InternalEObject)newPatternInstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_INSTANT, null, msgs);
			msgs = basicSetPatternInstant(newPatternInstant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_INSTANT, newPatternInstant, newPatternInstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Integer getPatternInteger() {
		return patternInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternInteger(org.hl7.fhir.Integer newPatternInteger, NotificationChain msgs) {
		org.hl7.fhir.Integer oldPatternInteger = patternInteger;
		patternInteger = newPatternInteger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_INTEGER, oldPatternInteger, newPatternInteger);
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
	public void setPatternInteger(org.hl7.fhir.Integer newPatternInteger) {
		if (newPatternInteger != patternInteger) {
			NotificationChain msgs = null;
			if (patternInteger != null)
				msgs = ((InternalEObject)patternInteger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_INTEGER, null, msgs);
			if (newPatternInteger != null)
				msgs = ((InternalEObject)newPatternInteger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_INTEGER, null, msgs);
			msgs = basicSetPatternInteger(newPatternInteger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_INTEGER, newPatternInteger, newPatternInteger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getPatternMarkdown() {
		return patternMarkdown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternMarkdown(Markdown newPatternMarkdown, NotificationChain msgs) {
		Markdown oldPatternMarkdown = patternMarkdown;
		patternMarkdown = newPatternMarkdown;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_MARKDOWN, oldPatternMarkdown, newPatternMarkdown);
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
	public void setPatternMarkdown(Markdown newPatternMarkdown) {
		if (newPatternMarkdown != patternMarkdown) {
			NotificationChain msgs = null;
			if (patternMarkdown != null)
				msgs = ((InternalEObject)patternMarkdown).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_MARKDOWN, null, msgs);
			if (newPatternMarkdown != null)
				msgs = ((InternalEObject)newPatternMarkdown).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_MARKDOWN, null, msgs);
			msgs = basicSetPatternMarkdown(newPatternMarkdown, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_MARKDOWN, newPatternMarkdown, newPatternMarkdown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oid getPatternOid() {
		return patternOid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternOid(Oid newPatternOid, NotificationChain msgs) {
		Oid oldPatternOid = patternOid;
		patternOid = newPatternOid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_OID, oldPatternOid, newPatternOid);
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
	public void setPatternOid(Oid newPatternOid) {
		if (newPatternOid != patternOid) {
			NotificationChain msgs = null;
			if (patternOid != null)
				msgs = ((InternalEObject)patternOid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_OID, null, msgs);
			if (newPatternOid != null)
				msgs = ((InternalEObject)newPatternOid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_OID, null, msgs);
			msgs = basicSetPatternOid(newPatternOid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_OID, newPatternOid, newPatternOid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getPatternPositiveInt() {
		return patternPositiveInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternPositiveInt(PositiveInt newPatternPositiveInt, NotificationChain msgs) {
		PositiveInt oldPatternPositiveInt = patternPositiveInt;
		patternPositiveInt = newPatternPositiveInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_POSITIVE_INT, oldPatternPositiveInt, newPatternPositiveInt);
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
	public void setPatternPositiveInt(PositiveInt newPatternPositiveInt) {
		if (newPatternPositiveInt != patternPositiveInt) {
			NotificationChain msgs = null;
			if (patternPositiveInt != null)
				msgs = ((InternalEObject)patternPositiveInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_POSITIVE_INT, null, msgs);
			if (newPatternPositiveInt != null)
				msgs = ((InternalEObject)newPatternPositiveInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_POSITIVE_INT, null, msgs);
			msgs = basicSetPatternPositiveInt(newPatternPositiveInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_POSITIVE_INT, newPatternPositiveInt, newPatternPositiveInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getPatternString() {
		return patternString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternString(org.hl7.fhir.String newPatternString, NotificationChain msgs) {
		org.hl7.fhir.String oldPatternString = patternString;
		patternString = newPatternString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_STRING, oldPatternString, newPatternString);
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
	public void setPatternString(org.hl7.fhir.String newPatternString) {
		if (newPatternString != patternString) {
			NotificationChain msgs = null;
			if (patternString != null)
				msgs = ((InternalEObject)patternString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_STRING, null, msgs);
			if (newPatternString != null)
				msgs = ((InternalEObject)newPatternString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_STRING, null, msgs);
			msgs = basicSetPatternString(newPatternString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_STRING, newPatternString, newPatternString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Time getPatternTime() {
		return patternTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternTime(Time newPatternTime, NotificationChain msgs) {
		Time oldPatternTime = patternTime;
		patternTime = newPatternTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_TIME, oldPatternTime, newPatternTime);
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
	public void setPatternTime(Time newPatternTime) {
		if (newPatternTime != patternTime) {
			NotificationChain msgs = null;
			if (patternTime != null)
				msgs = ((InternalEObject)patternTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_TIME, null, msgs);
			if (newPatternTime != null)
				msgs = ((InternalEObject)newPatternTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_TIME, null, msgs);
			msgs = basicSetPatternTime(newPatternTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_TIME, newPatternTime, newPatternTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnsignedInt getPatternUnsignedInt() {
		return patternUnsignedInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternUnsignedInt(UnsignedInt newPatternUnsignedInt, NotificationChain msgs) {
		UnsignedInt oldPatternUnsignedInt = patternUnsignedInt;
		patternUnsignedInt = newPatternUnsignedInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_UNSIGNED_INT, oldPatternUnsignedInt, newPatternUnsignedInt);
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
	public void setPatternUnsignedInt(UnsignedInt newPatternUnsignedInt) {
		if (newPatternUnsignedInt != patternUnsignedInt) {
			NotificationChain msgs = null;
			if (patternUnsignedInt != null)
				msgs = ((InternalEObject)patternUnsignedInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_UNSIGNED_INT, null, msgs);
			if (newPatternUnsignedInt != null)
				msgs = ((InternalEObject)newPatternUnsignedInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_UNSIGNED_INT, null, msgs);
			msgs = basicSetPatternUnsignedInt(newPatternUnsignedInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_UNSIGNED_INT, newPatternUnsignedInt, newPatternUnsignedInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getPatternUri() {
		return patternUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternUri(Uri newPatternUri, NotificationChain msgs) {
		Uri oldPatternUri = patternUri;
		patternUri = newPatternUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_URI, oldPatternUri, newPatternUri);
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
	public void setPatternUri(Uri newPatternUri) {
		if (newPatternUri != patternUri) {
			NotificationChain msgs = null;
			if (patternUri != null)
				msgs = ((InternalEObject)patternUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_URI, null, msgs);
			if (newPatternUri != null)
				msgs = ((InternalEObject)newPatternUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_URI, null, msgs);
			msgs = basicSetPatternUri(newPatternUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_URI, newPatternUri, newPatternUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Url getPatternUrl() {
		return patternUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternUrl(Url newPatternUrl, NotificationChain msgs) {
		Url oldPatternUrl = patternUrl;
		patternUrl = newPatternUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_URL, oldPatternUrl, newPatternUrl);
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
	public void setPatternUrl(Url newPatternUrl) {
		if (newPatternUrl != patternUrl) {
			NotificationChain msgs = null;
			if (patternUrl != null)
				msgs = ((InternalEObject)patternUrl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_URL, null, msgs);
			if (newPatternUrl != null)
				msgs = ((InternalEObject)newPatternUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_URL, null, msgs);
			msgs = basicSetPatternUrl(newPatternUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_URL, newPatternUrl, newPatternUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uuid getPatternUuid() {
		return patternUuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternUuid(Uuid newPatternUuid, NotificationChain msgs) {
		Uuid oldPatternUuid = patternUuid;
		patternUuid = newPatternUuid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_UUID, oldPatternUuid, newPatternUuid);
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
	public void setPatternUuid(Uuid newPatternUuid) {
		if (newPatternUuid != patternUuid) {
			NotificationChain msgs = null;
			if (patternUuid != null)
				msgs = ((InternalEObject)patternUuid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_UUID, null, msgs);
			if (newPatternUuid != null)
				msgs = ((InternalEObject)newPatternUuid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_UUID, null, msgs);
			msgs = basicSetPatternUuid(newPatternUuid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_UUID, newPatternUuid, newPatternUuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Address getPatternAddress() {
		return patternAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternAddress(Address newPatternAddress, NotificationChain msgs) {
		Address oldPatternAddress = patternAddress;
		patternAddress = newPatternAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_ADDRESS, oldPatternAddress, newPatternAddress);
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
	public void setPatternAddress(Address newPatternAddress) {
		if (newPatternAddress != patternAddress) {
			NotificationChain msgs = null;
			if (patternAddress != null)
				msgs = ((InternalEObject)patternAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_ADDRESS, null, msgs);
			if (newPatternAddress != null)
				msgs = ((InternalEObject)newPatternAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_ADDRESS, null, msgs);
			msgs = basicSetPatternAddress(newPatternAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_ADDRESS, newPatternAddress, newPatternAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Age getPatternAge() {
		return patternAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternAge(Age newPatternAge, NotificationChain msgs) {
		Age oldPatternAge = patternAge;
		patternAge = newPatternAge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_AGE, oldPatternAge, newPatternAge);
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
	public void setPatternAge(Age newPatternAge) {
		if (newPatternAge != patternAge) {
			NotificationChain msgs = null;
			if (patternAge != null)
				msgs = ((InternalEObject)patternAge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_AGE, null, msgs);
			if (newPatternAge != null)
				msgs = ((InternalEObject)newPatternAge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_AGE, null, msgs);
			msgs = basicSetPatternAge(newPatternAge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_AGE, newPatternAge, newPatternAge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Annotation getPatternAnnotation() {
		return patternAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternAnnotation(Annotation newPatternAnnotation, NotificationChain msgs) {
		Annotation oldPatternAnnotation = patternAnnotation;
		patternAnnotation = newPatternAnnotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_ANNOTATION, oldPatternAnnotation, newPatternAnnotation);
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
	public void setPatternAnnotation(Annotation newPatternAnnotation) {
		if (newPatternAnnotation != patternAnnotation) {
			NotificationChain msgs = null;
			if (patternAnnotation != null)
				msgs = ((InternalEObject)patternAnnotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_ANNOTATION, null, msgs);
			if (newPatternAnnotation != null)
				msgs = ((InternalEObject)newPatternAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_ANNOTATION, null, msgs);
			msgs = basicSetPatternAnnotation(newPatternAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_ANNOTATION, newPatternAnnotation, newPatternAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attachment getPatternAttachment() {
		return patternAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternAttachment(Attachment newPatternAttachment, NotificationChain msgs) {
		Attachment oldPatternAttachment = patternAttachment;
		patternAttachment = newPatternAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_ATTACHMENT, oldPatternAttachment, newPatternAttachment);
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
	public void setPatternAttachment(Attachment newPatternAttachment) {
		if (newPatternAttachment != patternAttachment) {
			NotificationChain msgs = null;
			if (patternAttachment != null)
				msgs = ((InternalEObject)patternAttachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_ATTACHMENT, null, msgs);
			if (newPatternAttachment != null)
				msgs = ((InternalEObject)newPatternAttachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_ATTACHMENT, null, msgs);
			msgs = basicSetPatternAttachment(newPatternAttachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_ATTACHMENT, newPatternAttachment, newPatternAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getPatternCodeableConcept() {
		return patternCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternCodeableConcept(CodeableConcept newPatternCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldPatternCodeableConcept = patternCodeableConcept;
		patternCodeableConcept = newPatternCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_CODEABLE_CONCEPT, oldPatternCodeableConcept, newPatternCodeableConcept);
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
	public void setPatternCodeableConcept(CodeableConcept newPatternCodeableConcept) {
		if (newPatternCodeableConcept != patternCodeableConcept) {
			NotificationChain msgs = null;
			if (patternCodeableConcept != null)
				msgs = ((InternalEObject)patternCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_CODEABLE_CONCEPT, null, msgs);
			if (newPatternCodeableConcept != null)
				msgs = ((InternalEObject)newPatternCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetPatternCodeableConcept(newPatternCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_CODEABLE_CONCEPT, newPatternCodeableConcept, newPatternCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coding getPatternCoding() {
		return patternCoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternCoding(Coding newPatternCoding, NotificationChain msgs) {
		Coding oldPatternCoding = patternCoding;
		patternCoding = newPatternCoding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_CODING, oldPatternCoding, newPatternCoding);
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
	public void setPatternCoding(Coding newPatternCoding) {
		if (newPatternCoding != patternCoding) {
			NotificationChain msgs = null;
			if (patternCoding != null)
				msgs = ((InternalEObject)patternCoding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_CODING, null, msgs);
			if (newPatternCoding != null)
				msgs = ((InternalEObject)newPatternCoding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_CODING, null, msgs);
			msgs = basicSetPatternCoding(newPatternCoding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_CODING, newPatternCoding, newPatternCoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactPoint getPatternContactPoint() {
		return patternContactPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternContactPoint(ContactPoint newPatternContactPoint, NotificationChain msgs) {
		ContactPoint oldPatternContactPoint = patternContactPoint;
		patternContactPoint = newPatternContactPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_CONTACT_POINT, oldPatternContactPoint, newPatternContactPoint);
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
	public void setPatternContactPoint(ContactPoint newPatternContactPoint) {
		if (newPatternContactPoint != patternContactPoint) {
			NotificationChain msgs = null;
			if (patternContactPoint != null)
				msgs = ((InternalEObject)patternContactPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_CONTACT_POINT, null, msgs);
			if (newPatternContactPoint != null)
				msgs = ((InternalEObject)newPatternContactPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_CONTACT_POINT, null, msgs);
			msgs = basicSetPatternContactPoint(newPatternContactPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_CONTACT_POINT, newPatternContactPoint, newPatternContactPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Count getPatternCount() {
		return patternCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternCount(Count newPatternCount, NotificationChain msgs) {
		Count oldPatternCount = patternCount;
		patternCount = newPatternCount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_COUNT, oldPatternCount, newPatternCount);
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
	public void setPatternCount(Count newPatternCount) {
		if (newPatternCount != patternCount) {
			NotificationChain msgs = null;
			if (patternCount != null)
				msgs = ((InternalEObject)patternCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_COUNT, null, msgs);
			if (newPatternCount != null)
				msgs = ((InternalEObject)newPatternCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_COUNT, null, msgs);
			msgs = basicSetPatternCount(newPatternCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_COUNT, newPatternCount, newPatternCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Distance getPatternDistance() {
		return patternDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternDistance(Distance newPatternDistance, NotificationChain msgs) {
		Distance oldPatternDistance = patternDistance;
		patternDistance = newPatternDistance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_DISTANCE, oldPatternDistance, newPatternDistance);
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
	public void setPatternDistance(Distance newPatternDistance) {
		if (newPatternDistance != patternDistance) {
			NotificationChain msgs = null;
			if (patternDistance != null)
				msgs = ((InternalEObject)patternDistance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_DISTANCE, null, msgs);
			if (newPatternDistance != null)
				msgs = ((InternalEObject)newPatternDistance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_DISTANCE, null, msgs);
			msgs = basicSetPatternDistance(newPatternDistance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_DISTANCE, newPatternDistance, newPatternDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getPatternDuration() {
		return patternDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternDuration(Duration newPatternDuration, NotificationChain msgs) {
		Duration oldPatternDuration = patternDuration;
		patternDuration = newPatternDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_DURATION, oldPatternDuration, newPatternDuration);
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
	public void setPatternDuration(Duration newPatternDuration) {
		if (newPatternDuration != patternDuration) {
			NotificationChain msgs = null;
			if (patternDuration != null)
				msgs = ((InternalEObject)patternDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_DURATION, null, msgs);
			if (newPatternDuration != null)
				msgs = ((InternalEObject)newPatternDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_DURATION, null, msgs);
			msgs = basicSetPatternDuration(newPatternDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_DURATION, newPatternDuration, newPatternDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HumanName getPatternHumanName() {
		return patternHumanName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternHumanName(HumanName newPatternHumanName, NotificationChain msgs) {
		HumanName oldPatternHumanName = patternHumanName;
		patternHumanName = newPatternHumanName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_HUMAN_NAME, oldPatternHumanName, newPatternHumanName);
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
	public void setPatternHumanName(HumanName newPatternHumanName) {
		if (newPatternHumanName != patternHumanName) {
			NotificationChain msgs = null;
			if (patternHumanName != null)
				msgs = ((InternalEObject)patternHumanName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_HUMAN_NAME, null, msgs);
			if (newPatternHumanName != null)
				msgs = ((InternalEObject)newPatternHumanName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_HUMAN_NAME, null, msgs);
			msgs = basicSetPatternHumanName(newPatternHumanName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_HUMAN_NAME, newPatternHumanName, newPatternHumanName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getPatternIdentifier() {
		return patternIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternIdentifier(Identifier newPatternIdentifier, NotificationChain msgs) {
		Identifier oldPatternIdentifier = patternIdentifier;
		patternIdentifier = newPatternIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_IDENTIFIER, oldPatternIdentifier, newPatternIdentifier);
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
	public void setPatternIdentifier(Identifier newPatternIdentifier) {
		if (newPatternIdentifier != patternIdentifier) {
			NotificationChain msgs = null;
			if (patternIdentifier != null)
				msgs = ((InternalEObject)patternIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_IDENTIFIER, null, msgs);
			if (newPatternIdentifier != null)
				msgs = ((InternalEObject)newPatternIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_IDENTIFIER, null, msgs);
			msgs = basicSetPatternIdentifier(newPatternIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_IDENTIFIER, newPatternIdentifier, newPatternIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Money getPatternMoney() {
		return patternMoney;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternMoney(Money newPatternMoney, NotificationChain msgs) {
		Money oldPatternMoney = patternMoney;
		patternMoney = newPatternMoney;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_MONEY, oldPatternMoney, newPatternMoney);
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
	public void setPatternMoney(Money newPatternMoney) {
		if (newPatternMoney != patternMoney) {
			NotificationChain msgs = null;
			if (patternMoney != null)
				msgs = ((InternalEObject)patternMoney).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_MONEY, null, msgs);
			if (newPatternMoney != null)
				msgs = ((InternalEObject)newPatternMoney).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_MONEY, null, msgs);
			msgs = basicSetPatternMoney(newPatternMoney, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_MONEY, newPatternMoney, newPatternMoney));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getPatternPeriod() {
		return patternPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternPeriod(Period newPatternPeriod, NotificationChain msgs) {
		Period oldPatternPeriod = patternPeriod;
		patternPeriod = newPatternPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_PERIOD, oldPatternPeriod, newPatternPeriod);
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
	public void setPatternPeriod(Period newPatternPeriod) {
		if (newPatternPeriod != patternPeriod) {
			NotificationChain msgs = null;
			if (patternPeriod != null)
				msgs = ((InternalEObject)patternPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_PERIOD, null, msgs);
			if (newPatternPeriod != null)
				msgs = ((InternalEObject)newPatternPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_PERIOD, null, msgs);
			msgs = basicSetPatternPeriod(newPatternPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_PERIOD, newPatternPeriod, newPatternPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getPatternQuantity() {
		return patternQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternQuantity(Quantity newPatternQuantity, NotificationChain msgs) {
		Quantity oldPatternQuantity = patternQuantity;
		patternQuantity = newPatternQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_QUANTITY, oldPatternQuantity, newPatternQuantity);
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
	public void setPatternQuantity(Quantity newPatternQuantity) {
		if (newPatternQuantity != patternQuantity) {
			NotificationChain msgs = null;
			if (patternQuantity != null)
				msgs = ((InternalEObject)patternQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_QUANTITY, null, msgs);
			if (newPatternQuantity != null)
				msgs = ((InternalEObject)newPatternQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_QUANTITY, null, msgs);
			msgs = basicSetPatternQuantity(newPatternQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_QUANTITY, newPatternQuantity, newPatternQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Range getPatternRange() {
		return patternRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternRange(Range newPatternRange, NotificationChain msgs) {
		Range oldPatternRange = patternRange;
		patternRange = newPatternRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_RANGE, oldPatternRange, newPatternRange);
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
	public void setPatternRange(Range newPatternRange) {
		if (newPatternRange != patternRange) {
			NotificationChain msgs = null;
			if (patternRange != null)
				msgs = ((InternalEObject)patternRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_RANGE, null, msgs);
			if (newPatternRange != null)
				msgs = ((InternalEObject)newPatternRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_RANGE, null, msgs);
			msgs = basicSetPatternRange(newPatternRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_RANGE, newPatternRange, newPatternRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ratio getPatternRatio() {
		return patternRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternRatio(Ratio newPatternRatio, NotificationChain msgs) {
		Ratio oldPatternRatio = patternRatio;
		patternRatio = newPatternRatio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_RATIO, oldPatternRatio, newPatternRatio);
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
	public void setPatternRatio(Ratio newPatternRatio) {
		if (newPatternRatio != patternRatio) {
			NotificationChain msgs = null;
			if (patternRatio != null)
				msgs = ((InternalEObject)patternRatio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_RATIO, null, msgs);
			if (newPatternRatio != null)
				msgs = ((InternalEObject)newPatternRatio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_RATIO, null, msgs);
			msgs = basicSetPatternRatio(newPatternRatio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_RATIO, newPatternRatio, newPatternRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getPatternReference() {
		return patternReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternReference(Reference newPatternReference, NotificationChain msgs) {
		Reference oldPatternReference = patternReference;
		patternReference = newPatternReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_REFERENCE, oldPatternReference, newPatternReference);
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
	public void setPatternReference(Reference newPatternReference) {
		if (newPatternReference != patternReference) {
			NotificationChain msgs = null;
			if (patternReference != null)
				msgs = ((InternalEObject)patternReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_REFERENCE, null, msgs);
			if (newPatternReference != null)
				msgs = ((InternalEObject)newPatternReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_REFERENCE, null, msgs);
			msgs = basicSetPatternReference(newPatternReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_REFERENCE, newPatternReference, newPatternReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SampledData getPatternSampledData() {
		return patternSampledData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternSampledData(SampledData newPatternSampledData, NotificationChain msgs) {
		SampledData oldPatternSampledData = patternSampledData;
		patternSampledData = newPatternSampledData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_SAMPLED_DATA, oldPatternSampledData, newPatternSampledData);
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
	public void setPatternSampledData(SampledData newPatternSampledData) {
		if (newPatternSampledData != patternSampledData) {
			NotificationChain msgs = null;
			if (patternSampledData != null)
				msgs = ((InternalEObject)patternSampledData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_SAMPLED_DATA, null, msgs);
			if (newPatternSampledData != null)
				msgs = ((InternalEObject)newPatternSampledData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_SAMPLED_DATA, null, msgs);
			msgs = basicSetPatternSampledData(newPatternSampledData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_SAMPLED_DATA, newPatternSampledData, newPatternSampledData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signature getPatternSignature() {
		return patternSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternSignature(Signature newPatternSignature, NotificationChain msgs) {
		Signature oldPatternSignature = patternSignature;
		patternSignature = newPatternSignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_SIGNATURE, oldPatternSignature, newPatternSignature);
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
	public void setPatternSignature(Signature newPatternSignature) {
		if (newPatternSignature != patternSignature) {
			NotificationChain msgs = null;
			if (patternSignature != null)
				msgs = ((InternalEObject)patternSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_SIGNATURE, null, msgs);
			if (newPatternSignature != null)
				msgs = ((InternalEObject)newPatternSignature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_SIGNATURE, null, msgs);
			msgs = basicSetPatternSignature(newPatternSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_SIGNATURE, newPatternSignature, newPatternSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Timing getPatternTiming() {
		return patternTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternTiming(Timing newPatternTiming, NotificationChain msgs) {
		Timing oldPatternTiming = patternTiming;
		patternTiming = newPatternTiming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_TIMING, oldPatternTiming, newPatternTiming);
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
	public void setPatternTiming(Timing newPatternTiming) {
		if (newPatternTiming != patternTiming) {
			NotificationChain msgs = null;
			if (patternTiming != null)
				msgs = ((InternalEObject)patternTiming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_TIMING, null, msgs);
			if (newPatternTiming != null)
				msgs = ((InternalEObject)newPatternTiming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_TIMING, null, msgs);
			msgs = basicSetPatternTiming(newPatternTiming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_TIMING, newPatternTiming, newPatternTiming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactDetail getPatternContactDetail() {
		return patternContactDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternContactDetail(ContactDetail newPatternContactDetail, NotificationChain msgs) {
		ContactDetail oldPatternContactDetail = patternContactDetail;
		patternContactDetail = newPatternContactDetail;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_CONTACT_DETAIL, oldPatternContactDetail, newPatternContactDetail);
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
	public void setPatternContactDetail(ContactDetail newPatternContactDetail) {
		if (newPatternContactDetail != patternContactDetail) {
			NotificationChain msgs = null;
			if (patternContactDetail != null)
				msgs = ((InternalEObject)patternContactDetail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_CONTACT_DETAIL, null, msgs);
			if (newPatternContactDetail != null)
				msgs = ((InternalEObject)newPatternContactDetail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_CONTACT_DETAIL, null, msgs);
			msgs = basicSetPatternContactDetail(newPatternContactDetail, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_CONTACT_DETAIL, newPatternContactDetail, newPatternContactDetail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Contributor getPatternContributor() {
		return patternContributor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternContributor(Contributor newPatternContributor, NotificationChain msgs) {
		Contributor oldPatternContributor = patternContributor;
		patternContributor = newPatternContributor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_CONTRIBUTOR, oldPatternContributor, newPatternContributor);
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
	public void setPatternContributor(Contributor newPatternContributor) {
		if (newPatternContributor != patternContributor) {
			NotificationChain msgs = null;
			if (patternContributor != null)
				msgs = ((InternalEObject)patternContributor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_CONTRIBUTOR, null, msgs);
			if (newPatternContributor != null)
				msgs = ((InternalEObject)newPatternContributor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_CONTRIBUTOR, null, msgs);
			msgs = basicSetPatternContributor(newPatternContributor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_CONTRIBUTOR, newPatternContributor, newPatternContributor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataRequirement getPatternDataRequirement() {
		return patternDataRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternDataRequirement(DataRequirement newPatternDataRequirement, NotificationChain msgs) {
		DataRequirement oldPatternDataRequirement = patternDataRequirement;
		patternDataRequirement = newPatternDataRequirement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_DATA_REQUIREMENT, oldPatternDataRequirement, newPatternDataRequirement);
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
	public void setPatternDataRequirement(DataRequirement newPatternDataRequirement) {
		if (newPatternDataRequirement != patternDataRequirement) {
			NotificationChain msgs = null;
			if (patternDataRequirement != null)
				msgs = ((InternalEObject)patternDataRequirement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_DATA_REQUIREMENT, null, msgs);
			if (newPatternDataRequirement != null)
				msgs = ((InternalEObject)newPatternDataRequirement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_DATA_REQUIREMENT, null, msgs);
			msgs = basicSetPatternDataRequirement(newPatternDataRequirement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_DATA_REQUIREMENT, newPatternDataRequirement, newPatternDataRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getPatternExpression() {
		return patternExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternExpression(Expression newPatternExpression, NotificationChain msgs) {
		Expression oldPatternExpression = patternExpression;
		patternExpression = newPatternExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_EXPRESSION, oldPatternExpression, newPatternExpression);
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
	public void setPatternExpression(Expression newPatternExpression) {
		if (newPatternExpression != patternExpression) {
			NotificationChain msgs = null;
			if (patternExpression != null)
				msgs = ((InternalEObject)patternExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_EXPRESSION, null, msgs);
			if (newPatternExpression != null)
				msgs = ((InternalEObject)newPatternExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_EXPRESSION, null, msgs);
			msgs = basicSetPatternExpression(newPatternExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_EXPRESSION, newPatternExpression, newPatternExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterDefinition getPatternParameterDefinition() {
		return patternParameterDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternParameterDefinition(ParameterDefinition newPatternParameterDefinition, NotificationChain msgs) {
		ParameterDefinition oldPatternParameterDefinition = patternParameterDefinition;
		patternParameterDefinition = newPatternParameterDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_PARAMETER_DEFINITION, oldPatternParameterDefinition, newPatternParameterDefinition);
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
	public void setPatternParameterDefinition(ParameterDefinition newPatternParameterDefinition) {
		if (newPatternParameterDefinition != patternParameterDefinition) {
			NotificationChain msgs = null;
			if (patternParameterDefinition != null)
				msgs = ((InternalEObject)patternParameterDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_PARAMETER_DEFINITION, null, msgs);
			if (newPatternParameterDefinition != null)
				msgs = ((InternalEObject)newPatternParameterDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_PARAMETER_DEFINITION, null, msgs);
			msgs = basicSetPatternParameterDefinition(newPatternParameterDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_PARAMETER_DEFINITION, newPatternParameterDefinition, newPatternParameterDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelatedArtifact getPatternRelatedArtifact() {
		return patternRelatedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternRelatedArtifact(RelatedArtifact newPatternRelatedArtifact, NotificationChain msgs) {
		RelatedArtifact oldPatternRelatedArtifact = patternRelatedArtifact;
		patternRelatedArtifact = newPatternRelatedArtifact;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_RELATED_ARTIFACT, oldPatternRelatedArtifact, newPatternRelatedArtifact);
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
	public void setPatternRelatedArtifact(RelatedArtifact newPatternRelatedArtifact) {
		if (newPatternRelatedArtifact != patternRelatedArtifact) {
			NotificationChain msgs = null;
			if (patternRelatedArtifact != null)
				msgs = ((InternalEObject)patternRelatedArtifact).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_RELATED_ARTIFACT, null, msgs);
			if (newPatternRelatedArtifact != null)
				msgs = ((InternalEObject)newPatternRelatedArtifact).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_RELATED_ARTIFACT, null, msgs);
			msgs = basicSetPatternRelatedArtifact(newPatternRelatedArtifact, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_RELATED_ARTIFACT, newPatternRelatedArtifact, newPatternRelatedArtifact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TriggerDefinition getPatternTriggerDefinition() {
		return patternTriggerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternTriggerDefinition(TriggerDefinition newPatternTriggerDefinition, NotificationChain msgs) {
		TriggerDefinition oldPatternTriggerDefinition = patternTriggerDefinition;
		patternTriggerDefinition = newPatternTriggerDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_TRIGGER_DEFINITION, oldPatternTriggerDefinition, newPatternTriggerDefinition);
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
	public void setPatternTriggerDefinition(TriggerDefinition newPatternTriggerDefinition) {
		if (newPatternTriggerDefinition != patternTriggerDefinition) {
			NotificationChain msgs = null;
			if (patternTriggerDefinition != null)
				msgs = ((InternalEObject)patternTriggerDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_TRIGGER_DEFINITION, null, msgs);
			if (newPatternTriggerDefinition != null)
				msgs = ((InternalEObject)newPatternTriggerDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_TRIGGER_DEFINITION, null, msgs);
			msgs = basicSetPatternTriggerDefinition(newPatternTriggerDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_TRIGGER_DEFINITION, newPatternTriggerDefinition, newPatternTriggerDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UsageContext getPatternUsageContext() {
		return patternUsageContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternUsageContext(UsageContext newPatternUsageContext, NotificationChain msgs) {
		UsageContext oldPatternUsageContext = patternUsageContext;
		patternUsageContext = newPatternUsageContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_USAGE_CONTEXT, oldPatternUsageContext, newPatternUsageContext);
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
	public void setPatternUsageContext(UsageContext newPatternUsageContext) {
		if (newPatternUsageContext != patternUsageContext) {
			NotificationChain msgs = null;
			if (patternUsageContext != null)
				msgs = ((InternalEObject)patternUsageContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_USAGE_CONTEXT, null, msgs);
			if (newPatternUsageContext != null)
				msgs = ((InternalEObject)newPatternUsageContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_USAGE_CONTEXT, null, msgs);
			msgs = basicSetPatternUsageContext(newPatternUsageContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_USAGE_CONTEXT, newPatternUsageContext, newPatternUsageContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dosage getPatternDosage() {
		return patternDosage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternDosage(Dosage newPatternDosage, NotificationChain msgs) {
		Dosage oldPatternDosage = patternDosage;
		patternDosage = newPatternDosage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_DOSAGE, oldPatternDosage, newPatternDosage);
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
	public void setPatternDosage(Dosage newPatternDosage) {
		if (newPatternDosage != patternDosage) {
			NotificationChain msgs = null;
			if (patternDosage != null)
				msgs = ((InternalEObject)patternDosage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_DOSAGE, null, msgs);
			if (newPatternDosage != null)
				msgs = ((InternalEObject)newPatternDosage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_DOSAGE, null, msgs);
			msgs = basicSetPatternDosage(newPatternDosage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_DOSAGE, newPatternDosage, newPatternDosage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Meta getPatternMeta() {
		return patternMeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternMeta(Meta newPatternMeta, NotificationChain msgs) {
		Meta oldPatternMeta = patternMeta;
		patternMeta = newPatternMeta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_META, oldPatternMeta, newPatternMeta);
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
	public void setPatternMeta(Meta newPatternMeta) {
		if (newPatternMeta != patternMeta) {
			NotificationChain msgs = null;
			if (patternMeta != null)
				msgs = ((InternalEObject)patternMeta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_META, null, msgs);
			if (newPatternMeta != null)
				msgs = ((InternalEObject)newPatternMeta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_META, null, msgs);
			msgs = basicSetPatternMeta(newPatternMeta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_META, newPatternMeta, newPatternMeta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ElementDefinitionExample> getExample() {
		if (example == null) {
			example = new EObjectContainmentEList<ElementDefinitionExample>(ElementDefinitionExample.class, this, FhirPackage.ELEMENT_DEFINITION__EXAMPLE);
		}
		return example;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getMinValueDate() {
		return minValueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinValueDate(Date newMinValueDate, NotificationChain msgs) {
		Date oldMinValueDate = minValueDate;
		minValueDate = newMinValueDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DATE, oldMinValueDate, newMinValueDate);
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
	public void setMinValueDate(Date newMinValueDate) {
		if (newMinValueDate != minValueDate) {
			NotificationChain msgs = null;
			if (minValueDate != null)
				msgs = ((InternalEObject)minValueDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DATE, null, msgs);
			if (newMinValueDate != null)
				msgs = ((InternalEObject)newMinValueDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DATE, null, msgs);
			msgs = basicSetMinValueDate(newMinValueDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DATE, newMinValueDate, newMinValueDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getMinValueDateTime() {
		return minValueDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinValueDateTime(DateTime newMinValueDateTime, NotificationChain msgs) {
		DateTime oldMinValueDateTime = minValueDateTime;
		minValueDateTime = newMinValueDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DATE_TIME, oldMinValueDateTime, newMinValueDateTime);
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
	public void setMinValueDateTime(DateTime newMinValueDateTime) {
		if (newMinValueDateTime != minValueDateTime) {
			NotificationChain msgs = null;
			if (minValueDateTime != null)
				msgs = ((InternalEObject)minValueDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DATE_TIME, null, msgs);
			if (newMinValueDateTime != null)
				msgs = ((InternalEObject)newMinValueDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DATE_TIME, null, msgs);
			msgs = basicSetMinValueDateTime(newMinValueDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DATE_TIME, newMinValueDateTime, newMinValueDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instant getMinValueInstant() {
		return minValueInstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinValueInstant(Instant newMinValueInstant, NotificationChain msgs) {
		Instant oldMinValueInstant = minValueInstant;
		minValueInstant = newMinValueInstant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_INSTANT, oldMinValueInstant, newMinValueInstant);
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
	public void setMinValueInstant(Instant newMinValueInstant) {
		if (newMinValueInstant != minValueInstant) {
			NotificationChain msgs = null;
			if (minValueInstant != null)
				msgs = ((InternalEObject)minValueInstant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_INSTANT, null, msgs);
			if (newMinValueInstant != null)
				msgs = ((InternalEObject)newMinValueInstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_INSTANT, null, msgs);
			msgs = basicSetMinValueInstant(newMinValueInstant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_INSTANT, newMinValueInstant, newMinValueInstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Time getMinValueTime() {
		return minValueTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinValueTime(Time newMinValueTime, NotificationChain msgs) {
		Time oldMinValueTime = minValueTime;
		minValueTime = newMinValueTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_TIME, oldMinValueTime, newMinValueTime);
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
	public void setMinValueTime(Time newMinValueTime) {
		if (newMinValueTime != minValueTime) {
			NotificationChain msgs = null;
			if (minValueTime != null)
				msgs = ((InternalEObject)minValueTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_TIME, null, msgs);
			if (newMinValueTime != null)
				msgs = ((InternalEObject)newMinValueTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_TIME, null, msgs);
			msgs = basicSetMinValueTime(newMinValueTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_TIME, newMinValueTime, newMinValueTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getMinValueDecimal() {
		return minValueDecimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinValueDecimal(Decimal newMinValueDecimal, NotificationChain msgs) {
		Decimal oldMinValueDecimal = minValueDecimal;
		minValueDecimal = newMinValueDecimal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DECIMAL, oldMinValueDecimal, newMinValueDecimal);
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
	public void setMinValueDecimal(Decimal newMinValueDecimal) {
		if (newMinValueDecimal != minValueDecimal) {
			NotificationChain msgs = null;
			if (minValueDecimal != null)
				msgs = ((InternalEObject)minValueDecimal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DECIMAL, null, msgs);
			if (newMinValueDecimal != null)
				msgs = ((InternalEObject)newMinValueDecimal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DECIMAL, null, msgs);
			msgs = basicSetMinValueDecimal(newMinValueDecimal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DECIMAL, newMinValueDecimal, newMinValueDecimal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Integer getMinValueInteger() {
		return minValueInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinValueInteger(org.hl7.fhir.Integer newMinValueInteger, NotificationChain msgs) {
		org.hl7.fhir.Integer oldMinValueInteger = minValueInteger;
		minValueInteger = newMinValueInteger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_INTEGER, oldMinValueInteger, newMinValueInteger);
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
	public void setMinValueInteger(org.hl7.fhir.Integer newMinValueInteger) {
		if (newMinValueInteger != minValueInteger) {
			NotificationChain msgs = null;
			if (minValueInteger != null)
				msgs = ((InternalEObject)minValueInteger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_INTEGER, null, msgs);
			if (newMinValueInteger != null)
				msgs = ((InternalEObject)newMinValueInteger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_INTEGER, null, msgs);
			msgs = basicSetMinValueInteger(newMinValueInteger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_INTEGER, newMinValueInteger, newMinValueInteger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getMinValuePositiveInt() {
		return minValuePositiveInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinValuePositiveInt(PositiveInt newMinValuePositiveInt, NotificationChain msgs) {
		PositiveInt oldMinValuePositiveInt = minValuePositiveInt;
		minValuePositiveInt = newMinValuePositiveInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_POSITIVE_INT, oldMinValuePositiveInt, newMinValuePositiveInt);
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
	public void setMinValuePositiveInt(PositiveInt newMinValuePositiveInt) {
		if (newMinValuePositiveInt != minValuePositiveInt) {
			NotificationChain msgs = null;
			if (minValuePositiveInt != null)
				msgs = ((InternalEObject)minValuePositiveInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_POSITIVE_INT, null, msgs);
			if (newMinValuePositiveInt != null)
				msgs = ((InternalEObject)newMinValuePositiveInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_POSITIVE_INT, null, msgs);
			msgs = basicSetMinValuePositiveInt(newMinValuePositiveInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_POSITIVE_INT, newMinValuePositiveInt, newMinValuePositiveInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnsignedInt getMinValueUnsignedInt() {
		return minValueUnsignedInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinValueUnsignedInt(UnsignedInt newMinValueUnsignedInt, NotificationChain msgs) {
		UnsignedInt oldMinValueUnsignedInt = minValueUnsignedInt;
		minValueUnsignedInt = newMinValueUnsignedInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_UNSIGNED_INT, oldMinValueUnsignedInt, newMinValueUnsignedInt);
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
	public void setMinValueUnsignedInt(UnsignedInt newMinValueUnsignedInt) {
		if (newMinValueUnsignedInt != minValueUnsignedInt) {
			NotificationChain msgs = null;
			if (minValueUnsignedInt != null)
				msgs = ((InternalEObject)minValueUnsignedInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_UNSIGNED_INT, null, msgs);
			if (newMinValueUnsignedInt != null)
				msgs = ((InternalEObject)newMinValueUnsignedInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_UNSIGNED_INT, null, msgs);
			msgs = basicSetMinValueUnsignedInt(newMinValueUnsignedInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_UNSIGNED_INT, newMinValueUnsignedInt, newMinValueUnsignedInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getMinValueQuantity() {
		return minValueQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinValueQuantity(Quantity newMinValueQuantity, NotificationChain msgs) {
		Quantity oldMinValueQuantity = minValueQuantity;
		minValueQuantity = newMinValueQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_QUANTITY, oldMinValueQuantity, newMinValueQuantity);
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
	public void setMinValueQuantity(Quantity newMinValueQuantity) {
		if (newMinValueQuantity != minValueQuantity) {
			NotificationChain msgs = null;
			if (minValueQuantity != null)
				msgs = ((InternalEObject)minValueQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_QUANTITY, null, msgs);
			if (newMinValueQuantity != null)
				msgs = ((InternalEObject)newMinValueQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_QUANTITY, null, msgs);
			msgs = basicSetMinValueQuantity(newMinValueQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_QUANTITY, newMinValueQuantity, newMinValueQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getMaxValueDate() {
		return maxValueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxValueDate(Date newMaxValueDate, NotificationChain msgs) {
		Date oldMaxValueDate = maxValueDate;
		maxValueDate = newMaxValueDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DATE, oldMaxValueDate, newMaxValueDate);
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
	public void setMaxValueDate(Date newMaxValueDate) {
		if (newMaxValueDate != maxValueDate) {
			NotificationChain msgs = null;
			if (maxValueDate != null)
				msgs = ((InternalEObject)maxValueDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DATE, null, msgs);
			if (newMaxValueDate != null)
				msgs = ((InternalEObject)newMaxValueDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DATE, null, msgs);
			msgs = basicSetMaxValueDate(newMaxValueDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DATE, newMaxValueDate, newMaxValueDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getMaxValueDateTime() {
		return maxValueDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxValueDateTime(DateTime newMaxValueDateTime, NotificationChain msgs) {
		DateTime oldMaxValueDateTime = maxValueDateTime;
		maxValueDateTime = newMaxValueDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DATE_TIME, oldMaxValueDateTime, newMaxValueDateTime);
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
	public void setMaxValueDateTime(DateTime newMaxValueDateTime) {
		if (newMaxValueDateTime != maxValueDateTime) {
			NotificationChain msgs = null;
			if (maxValueDateTime != null)
				msgs = ((InternalEObject)maxValueDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DATE_TIME, null, msgs);
			if (newMaxValueDateTime != null)
				msgs = ((InternalEObject)newMaxValueDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DATE_TIME, null, msgs);
			msgs = basicSetMaxValueDateTime(newMaxValueDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DATE_TIME, newMaxValueDateTime, newMaxValueDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instant getMaxValueInstant() {
		return maxValueInstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxValueInstant(Instant newMaxValueInstant, NotificationChain msgs) {
		Instant oldMaxValueInstant = maxValueInstant;
		maxValueInstant = newMaxValueInstant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_INSTANT, oldMaxValueInstant, newMaxValueInstant);
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
	public void setMaxValueInstant(Instant newMaxValueInstant) {
		if (newMaxValueInstant != maxValueInstant) {
			NotificationChain msgs = null;
			if (maxValueInstant != null)
				msgs = ((InternalEObject)maxValueInstant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_INSTANT, null, msgs);
			if (newMaxValueInstant != null)
				msgs = ((InternalEObject)newMaxValueInstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_INSTANT, null, msgs);
			msgs = basicSetMaxValueInstant(newMaxValueInstant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_INSTANT, newMaxValueInstant, newMaxValueInstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Time getMaxValueTime() {
		return maxValueTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxValueTime(Time newMaxValueTime, NotificationChain msgs) {
		Time oldMaxValueTime = maxValueTime;
		maxValueTime = newMaxValueTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_TIME, oldMaxValueTime, newMaxValueTime);
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
	public void setMaxValueTime(Time newMaxValueTime) {
		if (newMaxValueTime != maxValueTime) {
			NotificationChain msgs = null;
			if (maxValueTime != null)
				msgs = ((InternalEObject)maxValueTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_TIME, null, msgs);
			if (newMaxValueTime != null)
				msgs = ((InternalEObject)newMaxValueTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_TIME, null, msgs);
			msgs = basicSetMaxValueTime(newMaxValueTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_TIME, newMaxValueTime, newMaxValueTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getMaxValueDecimal() {
		return maxValueDecimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxValueDecimal(Decimal newMaxValueDecimal, NotificationChain msgs) {
		Decimal oldMaxValueDecimal = maxValueDecimal;
		maxValueDecimal = newMaxValueDecimal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DECIMAL, oldMaxValueDecimal, newMaxValueDecimal);
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
	public void setMaxValueDecimal(Decimal newMaxValueDecimal) {
		if (newMaxValueDecimal != maxValueDecimal) {
			NotificationChain msgs = null;
			if (maxValueDecimal != null)
				msgs = ((InternalEObject)maxValueDecimal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DECIMAL, null, msgs);
			if (newMaxValueDecimal != null)
				msgs = ((InternalEObject)newMaxValueDecimal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DECIMAL, null, msgs);
			msgs = basicSetMaxValueDecimal(newMaxValueDecimal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DECIMAL, newMaxValueDecimal, newMaxValueDecimal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Integer getMaxValueInteger() {
		return maxValueInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxValueInteger(org.hl7.fhir.Integer newMaxValueInteger, NotificationChain msgs) {
		org.hl7.fhir.Integer oldMaxValueInteger = maxValueInteger;
		maxValueInteger = newMaxValueInteger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_INTEGER, oldMaxValueInteger, newMaxValueInteger);
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
	public void setMaxValueInteger(org.hl7.fhir.Integer newMaxValueInteger) {
		if (newMaxValueInteger != maxValueInteger) {
			NotificationChain msgs = null;
			if (maxValueInteger != null)
				msgs = ((InternalEObject)maxValueInteger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_INTEGER, null, msgs);
			if (newMaxValueInteger != null)
				msgs = ((InternalEObject)newMaxValueInteger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_INTEGER, null, msgs);
			msgs = basicSetMaxValueInteger(newMaxValueInteger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_INTEGER, newMaxValueInteger, newMaxValueInteger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getMaxValuePositiveInt() {
		return maxValuePositiveInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxValuePositiveInt(PositiveInt newMaxValuePositiveInt, NotificationChain msgs) {
		PositiveInt oldMaxValuePositiveInt = maxValuePositiveInt;
		maxValuePositiveInt = newMaxValuePositiveInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_POSITIVE_INT, oldMaxValuePositiveInt, newMaxValuePositiveInt);
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
	public void setMaxValuePositiveInt(PositiveInt newMaxValuePositiveInt) {
		if (newMaxValuePositiveInt != maxValuePositiveInt) {
			NotificationChain msgs = null;
			if (maxValuePositiveInt != null)
				msgs = ((InternalEObject)maxValuePositiveInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_POSITIVE_INT, null, msgs);
			if (newMaxValuePositiveInt != null)
				msgs = ((InternalEObject)newMaxValuePositiveInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_POSITIVE_INT, null, msgs);
			msgs = basicSetMaxValuePositiveInt(newMaxValuePositiveInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_POSITIVE_INT, newMaxValuePositiveInt, newMaxValuePositiveInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnsignedInt getMaxValueUnsignedInt() {
		return maxValueUnsignedInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxValueUnsignedInt(UnsignedInt newMaxValueUnsignedInt, NotificationChain msgs) {
		UnsignedInt oldMaxValueUnsignedInt = maxValueUnsignedInt;
		maxValueUnsignedInt = newMaxValueUnsignedInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_UNSIGNED_INT, oldMaxValueUnsignedInt, newMaxValueUnsignedInt);
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
	public void setMaxValueUnsignedInt(UnsignedInt newMaxValueUnsignedInt) {
		if (newMaxValueUnsignedInt != maxValueUnsignedInt) {
			NotificationChain msgs = null;
			if (maxValueUnsignedInt != null)
				msgs = ((InternalEObject)maxValueUnsignedInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_UNSIGNED_INT, null, msgs);
			if (newMaxValueUnsignedInt != null)
				msgs = ((InternalEObject)newMaxValueUnsignedInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_UNSIGNED_INT, null, msgs);
			msgs = basicSetMaxValueUnsignedInt(newMaxValueUnsignedInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_UNSIGNED_INT, newMaxValueUnsignedInt, newMaxValueUnsignedInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getMaxValueQuantity() {
		return maxValueQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxValueQuantity(Quantity newMaxValueQuantity, NotificationChain msgs) {
		Quantity oldMaxValueQuantity = maxValueQuantity;
		maxValueQuantity = newMaxValueQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_QUANTITY, oldMaxValueQuantity, newMaxValueQuantity);
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
	public void setMaxValueQuantity(Quantity newMaxValueQuantity) {
		if (newMaxValueQuantity != maxValueQuantity) {
			NotificationChain msgs = null;
			if (maxValueQuantity != null)
				msgs = ((InternalEObject)maxValueQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_QUANTITY, null, msgs);
			if (newMaxValueQuantity != null)
				msgs = ((InternalEObject)newMaxValueQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_QUANTITY, null, msgs);
			msgs = basicSetMaxValueQuantity(newMaxValueQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_QUANTITY, newMaxValueQuantity, newMaxValueQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Integer getMaxLength() {
		return maxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxLength(org.hl7.fhir.Integer newMaxLength, NotificationChain msgs) {
		org.hl7.fhir.Integer oldMaxLength = maxLength;
		maxLength = newMaxLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_LENGTH, oldMaxLength, newMaxLength);
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
	public void setMaxLength(org.hl7.fhir.Integer newMaxLength) {
		if (newMaxLength != maxLength) {
			NotificationChain msgs = null;
			if (maxLength != null)
				msgs = ((InternalEObject)maxLength).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_LENGTH, null, msgs);
			if (newMaxLength != null)
				msgs = ((InternalEObject)newMaxLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_LENGTH, null, msgs);
			msgs = basicSetMaxLength(newMaxLength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_LENGTH, newMaxLength, newMaxLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Id> getCondition() {
		if (condition == null) {
			condition = new EObjectContainmentEList<Id>(Id.class, this, FhirPackage.ELEMENT_DEFINITION__CONDITION);
		}
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ElementDefinitionConstraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectContainmentEList<ElementDefinitionConstraint>(ElementDefinitionConstraint.class, this, FhirPackage.ELEMENT_DEFINITION__CONSTRAINT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getMustSupport() {
		return mustSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMustSupport(org.hl7.fhir.Boolean newMustSupport, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldMustSupport = mustSupport;
		mustSupport = newMustSupport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MUST_SUPPORT, oldMustSupport, newMustSupport);
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
	public void setMustSupport(org.hl7.fhir.Boolean newMustSupport) {
		if (newMustSupport != mustSupport) {
			NotificationChain msgs = null;
			if (mustSupport != null)
				msgs = ((InternalEObject)mustSupport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MUST_SUPPORT, null, msgs);
			if (newMustSupport != null)
				msgs = ((InternalEObject)newMustSupport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MUST_SUPPORT, null, msgs);
			msgs = basicSetMustSupport(newMustSupport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MUST_SUPPORT, newMustSupport, newMustSupport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getIsModifier() {
		return isModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsModifier(org.hl7.fhir.Boolean newIsModifier, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldIsModifier = isModifier;
		isModifier = newIsModifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__IS_MODIFIER, oldIsModifier, newIsModifier);
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
	public void setIsModifier(org.hl7.fhir.Boolean newIsModifier) {
		if (newIsModifier != isModifier) {
			NotificationChain msgs = null;
			if (isModifier != null)
				msgs = ((InternalEObject)isModifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__IS_MODIFIER, null, msgs);
			if (newIsModifier != null)
				msgs = ((InternalEObject)newIsModifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__IS_MODIFIER, null, msgs);
			msgs = basicSetIsModifier(newIsModifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__IS_MODIFIER, newIsModifier, newIsModifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getIsModifierReason() {
		return isModifierReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsModifierReason(org.hl7.fhir.String newIsModifierReason, NotificationChain msgs) {
		org.hl7.fhir.String oldIsModifierReason = isModifierReason;
		isModifierReason = newIsModifierReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__IS_MODIFIER_REASON, oldIsModifierReason, newIsModifierReason);
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
	public void setIsModifierReason(org.hl7.fhir.String newIsModifierReason) {
		if (newIsModifierReason != isModifierReason) {
			NotificationChain msgs = null;
			if (isModifierReason != null)
				msgs = ((InternalEObject)isModifierReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__IS_MODIFIER_REASON, null, msgs);
			if (newIsModifierReason != null)
				msgs = ((InternalEObject)newIsModifierReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__IS_MODIFIER_REASON, null, msgs);
			msgs = basicSetIsModifierReason(newIsModifierReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__IS_MODIFIER_REASON, newIsModifierReason, newIsModifierReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getIsSummary() {
		return isSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsSummary(org.hl7.fhir.Boolean newIsSummary, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldIsSummary = isSummary;
		isSummary = newIsSummary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__IS_SUMMARY, oldIsSummary, newIsSummary);
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
	public void setIsSummary(org.hl7.fhir.Boolean newIsSummary) {
		if (newIsSummary != isSummary) {
			NotificationChain msgs = null;
			if (isSummary != null)
				msgs = ((InternalEObject)isSummary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__IS_SUMMARY, null, msgs);
			if (newIsSummary != null)
				msgs = ((InternalEObject)newIsSummary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__IS_SUMMARY, null, msgs);
			msgs = basicSetIsSummary(newIsSummary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__IS_SUMMARY, newIsSummary, newIsSummary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementDefinitionBinding getBinding() {
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinding(ElementDefinitionBinding newBinding, NotificationChain msgs) {
		ElementDefinitionBinding oldBinding = binding;
		binding = newBinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__BINDING, oldBinding, newBinding);
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
	public void setBinding(ElementDefinitionBinding newBinding) {
		if (newBinding != binding) {
			NotificationChain msgs = null;
			if (binding != null)
				msgs = ((InternalEObject)binding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__BINDING, null, msgs);
			if (newBinding != null)
				msgs = ((InternalEObject)newBinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__BINDING, null, msgs);
			msgs = basicSetBinding(newBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__BINDING, newBinding, newBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ElementDefinitionMapping> getMapping() {
		if (mapping == null) {
			mapping = new EObjectContainmentEList<ElementDefinitionMapping>(ElementDefinitionMapping.class, this, FhirPackage.ELEMENT_DEFINITION__MAPPING);
		}
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ELEMENT_DEFINITION__PATH:
				return basicSetPath(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__REPRESENTATION:
				return ((InternalEList<?>)getRepresentation()).basicRemove(otherEnd, msgs);
			case FhirPackage.ELEMENT_DEFINITION__SLICE_NAME:
				return basicSetSliceName(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__SLICE_IS_CONSTRAINING:
				return basicSetSliceIsConstraining(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__LABEL:
				return basicSetLabel(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case FhirPackage.ELEMENT_DEFINITION__SLICING:
				return basicSetSlicing(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__SHORT:
				return basicSetShort(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFINITION:
				return basicSetDefinition(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__COMMENT:
				return basicSetComment(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__REQUIREMENTS:
				return basicSetRequirements(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__ALIAS:
				return ((InternalEList<?>)getAlias()).basicRemove(otherEnd, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MIN:
				return basicSetMin(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX:
				return basicSetMax(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__BASE:
				return basicSetBase(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__CONTENT_REFERENCE:
				return basicSetContentReference(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_BASE64_BINARY:
				return basicSetDefaultValueBase64Binary(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_BOOLEAN:
				return basicSetDefaultValueBoolean(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CANONICAL:
				return basicSetDefaultValueCanonical(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODE:
				return basicSetDefaultValueCode(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DATE:
				return basicSetDefaultValueDate(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DATE_TIME:
				return basicSetDefaultValueDateTime(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DECIMAL:
				return basicSetDefaultValueDecimal(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ID:
				return basicSetDefaultValueId(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_INSTANT:
				return basicSetDefaultValueInstant(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_INTEGER:
				return basicSetDefaultValueInteger(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_MARKDOWN:
				return basicSetDefaultValueMarkdown(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_OID:
				return basicSetDefaultValueOid(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_POSITIVE_INT:
				return basicSetDefaultValuePositiveInt(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_STRING:
				return basicSetDefaultValueString(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_TIME:
				return basicSetDefaultValueTime(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_UNSIGNED_INT:
				return basicSetDefaultValueUnsignedInt(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_URI:
				return basicSetDefaultValueUri(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_URL:
				return basicSetDefaultValueUrl(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_UUID:
				return basicSetDefaultValueUuid(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ADDRESS:
				return basicSetDefaultValueAddress(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_AGE:
				return basicSetDefaultValueAge(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ANNOTATION:
				return basicSetDefaultValueAnnotation(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ATTACHMENT:
				return basicSetDefaultValueAttachment(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODEABLE_CONCEPT:
				return basicSetDefaultValueCodeableConcept(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODING:
				return basicSetDefaultValueCoding(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CONTACT_POINT:
				return basicSetDefaultValueContactPoint(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_COUNT:
				return basicSetDefaultValueCount(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DISTANCE:
				return basicSetDefaultValueDistance(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DURATION:
				return basicSetDefaultValueDuration(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_HUMAN_NAME:
				return basicSetDefaultValueHumanName(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_IDENTIFIER:
				return basicSetDefaultValueIdentifier(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_MONEY:
				return basicSetDefaultValueMoney(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_PERIOD:
				return basicSetDefaultValuePeriod(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_QUANTITY:
				return basicSetDefaultValueQuantity(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_RANGE:
				return basicSetDefaultValueRange(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_RATIO:
				return basicSetDefaultValueRatio(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_REFERENCE:
				return basicSetDefaultValueReference(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_SAMPLED_DATA:
				return basicSetDefaultValueSampledData(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_SIGNATURE:
				return basicSetDefaultValueSignature(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_TIMING:
				return basicSetDefaultValueTiming(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CONTACT_DETAIL:
				return basicSetDefaultValueContactDetail(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CONTRIBUTOR:
				return basicSetDefaultValueContributor(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DATA_REQUIREMENT:
				return basicSetDefaultValueDataRequirement(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_EXPRESSION:
				return basicSetDefaultValueExpression(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_PARAMETER_DEFINITION:
				return basicSetDefaultValueParameterDefinition(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_RELATED_ARTIFACT:
				return basicSetDefaultValueRelatedArtifact(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_TRIGGER_DEFINITION:
				return basicSetDefaultValueTriggerDefinition(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_USAGE_CONTEXT:
				return basicSetDefaultValueUsageContext(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DOSAGE:
				return basicSetDefaultValueDosage(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_META:
				return basicSetDefaultValueMeta(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MEANING_WHEN_MISSING:
				return basicSetMeaningWhenMissing(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__ORDER_MEANING:
				return basicSetOrderMeaning(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_BASE64_BINARY:
				return basicSetFixedBase64Binary(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_BOOLEAN:
				return basicSetFixedBoolean(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CANONICAL:
				return basicSetFixedCanonical(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CODE:
				return basicSetFixedCode(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DATE:
				return basicSetFixedDate(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DATE_TIME:
				return basicSetFixedDateTime(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DECIMAL:
				return basicSetFixedDecimal(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_ID:
				return basicSetFixedId(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_INSTANT:
				return basicSetFixedInstant(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_INTEGER:
				return basicSetFixedInteger(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_MARKDOWN:
				return basicSetFixedMarkdown(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_OID:
				return basicSetFixedOid(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_POSITIVE_INT:
				return basicSetFixedPositiveInt(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_STRING:
				return basicSetFixedString(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_TIME:
				return basicSetFixedTime(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_UNSIGNED_INT:
				return basicSetFixedUnsignedInt(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_URI:
				return basicSetFixedUri(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_URL:
				return basicSetFixedUrl(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_UUID:
				return basicSetFixedUuid(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_ADDRESS:
				return basicSetFixedAddress(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_AGE:
				return basicSetFixedAge(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_ANNOTATION:
				return basicSetFixedAnnotation(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_ATTACHMENT:
				return basicSetFixedAttachment(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CODEABLE_CONCEPT:
				return basicSetFixedCodeableConcept(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CODING:
				return basicSetFixedCoding(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CONTACT_POINT:
				return basicSetFixedContactPoint(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_COUNT:
				return basicSetFixedCount(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DISTANCE:
				return basicSetFixedDistance(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DURATION:
				return basicSetFixedDuration(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_HUMAN_NAME:
				return basicSetFixedHumanName(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_IDENTIFIER:
				return basicSetFixedIdentifier(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_MONEY:
				return basicSetFixedMoney(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_PERIOD:
				return basicSetFixedPeriod(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_QUANTITY:
				return basicSetFixedQuantity(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_RANGE:
				return basicSetFixedRange(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_RATIO:
				return basicSetFixedRatio(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_REFERENCE:
				return basicSetFixedReference(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_SAMPLED_DATA:
				return basicSetFixedSampledData(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_SIGNATURE:
				return basicSetFixedSignature(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_TIMING:
				return basicSetFixedTiming(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CONTACT_DETAIL:
				return basicSetFixedContactDetail(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CONTRIBUTOR:
				return basicSetFixedContributor(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DATA_REQUIREMENT:
				return basicSetFixedDataRequirement(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_EXPRESSION:
				return basicSetFixedExpression(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_PARAMETER_DEFINITION:
				return basicSetFixedParameterDefinition(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_RELATED_ARTIFACT:
				return basicSetFixedRelatedArtifact(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_TRIGGER_DEFINITION:
				return basicSetFixedTriggerDefinition(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_USAGE_CONTEXT:
				return basicSetFixedUsageContext(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DOSAGE:
				return basicSetFixedDosage(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_META:
				return basicSetFixedMeta(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_BASE64_BINARY:
				return basicSetPatternBase64Binary(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_BOOLEAN:
				return basicSetPatternBoolean(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CANONICAL:
				return basicSetPatternCanonical(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CODE:
				return basicSetPatternCode(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DATE:
				return basicSetPatternDate(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DATE_TIME:
				return basicSetPatternDateTime(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DECIMAL:
				return basicSetPatternDecimal(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_ID:
				return basicSetPatternId(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_INSTANT:
				return basicSetPatternInstant(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_INTEGER:
				return basicSetPatternInteger(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_MARKDOWN:
				return basicSetPatternMarkdown(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_OID:
				return basicSetPatternOid(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_POSITIVE_INT:
				return basicSetPatternPositiveInt(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_STRING:
				return basicSetPatternString(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_TIME:
				return basicSetPatternTime(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_UNSIGNED_INT:
				return basicSetPatternUnsignedInt(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_URI:
				return basicSetPatternUri(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_URL:
				return basicSetPatternUrl(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_UUID:
				return basicSetPatternUuid(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_ADDRESS:
				return basicSetPatternAddress(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_AGE:
				return basicSetPatternAge(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_ANNOTATION:
				return basicSetPatternAnnotation(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_ATTACHMENT:
				return basicSetPatternAttachment(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CODEABLE_CONCEPT:
				return basicSetPatternCodeableConcept(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CODING:
				return basicSetPatternCoding(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CONTACT_POINT:
				return basicSetPatternContactPoint(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_COUNT:
				return basicSetPatternCount(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DISTANCE:
				return basicSetPatternDistance(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DURATION:
				return basicSetPatternDuration(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_HUMAN_NAME:
				return basicSetPatternHumanName(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_IDENTIFIER:
				return basicSetPatternIdentifier(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_MONEY:
				return basicSetPatternMoney(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_PERIOD:
				return basicSetPatternPeriod(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_QUANTITY:
				return basicSetPatternQuantity(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_RANGE:
				return basicSetPatternRange(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_RATIO:
				return basicSetPatternRatio(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_REFERENCE:
				return basicSetPatternReference(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_SAMPLED_DATA:
				return basicSetPatternSampledData(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_SIGNATURE:
				return basicSetPatternSignature(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_TIMING:
				return basicSetPatternTiming(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CONTACT_DETAIL:
				return basicSetPatternContactDetail(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CONTRIBUTOR:
				return basicSetPatternContributor(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DATA_REQUIREMENT:
				return basicSetPatternDataRequirement(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_EXPRESSION:
				return basicSetPatternExpression(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_PARAMETER_DEFINITION:
				return basicSetPatternParameterDefinition(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_RELATED_ARTIFACT:
				return basicSetPatternRelatedArtifact(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_TRIGGER_DEFINITION:
				return basicSetPatternTriggerDefinition(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_USAGE_CONTEXT:
				return basicSetPatternUsageContext(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DOSAGE:
				return basicSetPatternDosage(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_META:
				return basicSetPatternMeta(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE:
				return ((InternalEList<?>)getExample()).basicRemove(otherEnd, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DATE:
				return basicSetMinValueDate(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DATE_TIME:
				return basicSetMinValueDateTime(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_INSTANT:
				return basicSetMinValueInstant(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_TIME:
				return basicSetMinValueTime(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DECIMAL:
				return basicSetMinValueDecimal(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_INTEGER:
				return basicSetMinValueInteger(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_POSITIVE_INT:
				return basicSetMinValuePositiveInt(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_UNSIGNED_INT:
				return basicSetMinValueUnsignedInt(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_QUANTITY:
				return basicSetMinValueQuantity(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DATE:
				return basicSetMaxValueDate(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DATE_TIME:
				return basicSetMaxValueDateTime(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_INSTANT:
				return basicSetMaxValueInstant(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_TIME:
				return basicSetMaxValueTime(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DECIMAL:
				return basicSetMaxValueDecimal(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_INTEGER:
				return basicSetMaxValueInteger(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_POSITIVE_INT:
				return basicSetMaxValuePositiveInt(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_UNSIGNED_INT:
				return basicSetMaxValueUnsignedInt(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_QUANTITY:
				return basicSetMaxValueQuantity(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX_LENGTH:
				return basicSetMaxLength(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__CONDITION:
				return ((InternalEList<?>)getCondition()).basicRemove(otherEnd, msgs);
			case FhirPackage.ELEMENT_DEFINITION__CONSTRAINT:
				return ((InternalEList<?>)getConstraint()).basicRemove(otherEnd, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MUST_SUPPORT:
				return basicSetMustSupport(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__IS_MODIFIER:
				return basicSetIsModifier(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__IS_MODIFIER_REASON:
				return basicSetIsModifierReason(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__IS_SUMMARY:
				return basicSetIsSummary(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__BINDING:
				return basicSetBinding(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAPPING:
				return ((InternalEList<?>)getMapping()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.ELEMENT_DEFINITION__PATH:
				return getPath();
			case FhirPackage.ELEMENT_DEFINITION__REPRESENTATION:
				return getRepresentation();
			case FhirPackage.ELEMENT_DEFINITION__SLICE_NAME:
				return getSliceName();
			case FhirPackage.ELEMENT_DEFINITION__SLICE_IS_CONSTRAINING:
				return getSliceIsConstraining();
			case FhirPackage.ELEMENT_DEFINITION__LABEL:
				return getLabel();
			case FhirPackage.ELEMENT_DEFINITION__CODE:
				return getCode();
			case FhirPackage.ELEMENT_DEFINITION__SLICING:
				return getSlicing();
			case FhirPackage.ELEMENT_DEFINITION__SHORT:
				return getShort();
			case FhirPackage.ELEMENT_DEFINITION__DEFINITION:
				return getDefinition();
			case FhirPackage.ELEMENT_DEFINITION__COMMENT:
				return getComment();
			case FhirPackage.ELEMENT_DEFINITION__REQUIREMENTS:
				return getRequirements();
			case FhirPackage.ELEMENT_DEFINITION__ALIAS:
				return getAlias();
			case FhirPackage.ELEMENT_DEFINITION__MIN:
				return getMin();
			case FhirPackage.ELEMENT_DEFINITION__MAX:
				return getMax();
			case FhirPackage.ELEMENT_DEFINITION__BASE:
				return getBase();
			case FhirPackage.ELEMENT_DEFINITION__CONTENT_REFERENCE:
				return getContentReference();
			case FhirPackage.ELEMENT_DEFINITION__TYPE:
				return getType();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_BASE64_BINARY:
				return getDefaultValueBase64Binary();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_BOOLEAN:
				return getDefaultValueBoolean();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CANONICAL:
				return getDefaultValueCanonical();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODE:
				return getDefaultValueCode();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DATE:
				return getDefaultValueDate();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DATE_TIME:
				return getDefaultValueDateTime();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DECIMAL:
				return getDefaultValueDecimal();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ID:
				return getDefaultValueId();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_INSTANT:
				return getDefaultValueInstant();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_INTEGER:
				return getDefaultValueInteger();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_MARKDOWN:
				return getDefaultValueMarkdown();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_OID:
				return getDefaultValueOid();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_POSITIVE_INT:
				return getDefaultValuePositiveInt();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_STRING:
				return getDefaultValueString();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_TIME:
				return getDefaultValueTime();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_UNSIGNED_INT:
				return getDefaultValueUnsignedInt();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_URI:
				return getDefaultValueUri();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_URL:
				return getDefaultValueUrl();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_UUID:
				return getDefaultValueUuid();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ADDRESS:
				return getDefaultValueAddress();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_AGE:
				return getDefaultValueAge();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ANNOTATION:
				return getDefaultValueAnnotation();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ATTACHMENT:
				return getDefaultValueAttachment();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODEABLE_CONCEPT:
				return getDefaultValueCodeableConcept();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODING:
				return getDefaultValueCoding();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CONTACT_POINT:
				return getDefaultValueContactPoint();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_COUNT:
				return getDefaultValueCount();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DISTANCE:
				return getDefaultValueDistance();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DURATION:
				return getDefaultValueDuration();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_HUMAN_NAME:
				return getDefaultValueHumanName();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_IDENTIFIER:
				return getDefaultValueIdentifier();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_MONEY:
				return getDefaultValueMoney();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_PERIOD:
				return getDefaultValuePeriod();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_QUANTITY:
				return getDefaultValueQuantity();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_RANGE:
				return getDefaultValueRange();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_RATIO:
				return getDefaultValueRatio();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_REFERENCE:
				return getDefaultValueReference();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_SAMPLED_DATA:
				return getDefaultValueSampledData();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_SIGNATURE:
				return getDefaultValueSignature();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_TIMING:
				return getDefaultValueTiming();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CONTACT_DETAIL:
				return getDefaultValueContactDetail();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CONTRIBUTOR:
				return getDefaultValueContributor();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DATA_REQUIREMENT:
				return getDefaultValueDataRequirement();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_EXPRESSION:
				return getDefaultValueExpression();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_PARAMETER_DEFINITION:
				return getDefaultValueParameterDefinition();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_RELATED_ARTIFACT:
				return getDefaultValueRelatedArtifact();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_TRIGGER_DEFINITION:
				return getDefaultValueTriggerDefinition();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_USAGE_CONTEXT:
				return getDefaultValueUsageContext();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DOSAGE:
				return getDefaultValueDosage();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_META:
				return getDefaultValueMeta();
			case FhirPackage.ELEMENT_DEFINITION__MEANING_WHEN_MISSING:
				return getMeaningWhenMissing();
			case FhirPackage.ELEMENT_DEFINITION__ORDER_MEANING:
				return getOrderMeaning();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_BASE64_BINARY:
				return getFixedBase64Binary();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_BOOLEAN:
				return getFixedBoolean();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CANONICAL:
				return getFixedCanonical();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CODE:
				return getFixedCode();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DATE:
				return getFixedDate();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DATE_TIME:
				return getFixedDateTime();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DECIMAL:
				return getFixedDecimal();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_ID:
				return getFixedId();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_INSTANT:
				return getFixedInstant();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_INTEGER:
				return getFixedInteger();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_MARKDOWN:
				return getFixedMarkdown();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_OID:
				return getFixedOid();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_POSITIVE_INT:
				return getFixedPositiveInt();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_STRING:
				return getFixedString();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_TIME:
				return getFixedTime();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_UNSIGNED_INT:
				return getFixedUnsignedInt();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_URI:
				return getFixedUri();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_URL:
				return getFixedUrl();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_UUID:
				return getFixedUuid();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_ADDRESS:
				return getFixedAddress();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_AGE:
				return getFixedAge();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_ANNOTATION:
				return getFixedAnnotation();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_ATTACHMENT:
				return getFixedAttachment();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CODEABLE_CONCEPT:
				return getFixedCodeableConcept();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CODING:
				return getFixedCoding();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CONTACT_POINT:
				return getFixedContactPoint();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_COUNT:
				return getFixedCount();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DISTANCE:
				return getFixedDistance();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DURATION:
				return getFixedDuration();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_HUMAN_NAME:
				return getFixedHumanName();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_IDENTIFIER:
				return getFixedIdentifier();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_MONEY:
				return getFixedMoney();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_PERIOD:
				return getFixedPeriod();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_QUANTITY:
				return getFixedQuantity();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_RANGE:
				return getFixedRange();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_RATIO:
				return getFixedRatio();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_REFERENCE:
				return getFixedReference();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_SAMPLED_DATA:
				return getFixedSampledData();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_SIGNATURE:
				return getFixedSignature();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_TIMING:
				return getFixedTiming();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CONTACT_DETAIL:
				return getFixedContactDetail();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CONTRIBUTOR:
				return getFixedContributor();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DATA_REQUIREMENT:
				return getFixedDataRequirement();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_EXPRESSION:
				return getFixedExpression();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_PARAMETER_DEFINITION:
				return getFixedParameterDefinition();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_RELATED_ARTIFACT:
				return getFixedRelatedArtifact();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_TRIGGER_DEFINITION:
				return getFixedTriggerDefinition();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_USAGE_CONTEXT:
				return getFixedUsageContext();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DOSAGE:
				return getFixedDosage();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_META:
				return getFixedMeta();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_BASE64_BINARY:
				return getPatternBase64Binary();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_BOOLEAN:
				return getPatternBoolean();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CANONICAL:
				return getPatternCanonical();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CODE:
				return getPatternCode();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DATE:
				return getPatternDate();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DATE_TIME:
				return getPatternDateTime();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DECIMAL:
				return getPatternDecimal();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_ID:
				return getPatternId();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_INSTANT:
				return getPatternInstant();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_INTEGER:
				return getPatternInteger();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_MARKDOWN:
				return getPatternMarkdown();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_OID:
				return getPatternOid();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_POSITIVE_INT:
				return getPatternPositiveInt();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_STRING:
				return getPatternString();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_TIME:
				return getPatternTime();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_UNSIGNED_INT:
				return getPatternUnsignedInt();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_URI:
				return getPatternUri();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_URL:
				return getPatternUrl();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_UUID:
				return getPatternUuid();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_ADDRESS:
				return getPatternAddress();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_AGE:
				return getPatternAge();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_ANNOTATION:
				return getPatternAnnotation();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_ATTACHMENT:
				return getPatternAttachment();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CODEABLE_CONCEPT:
				return getPatternCodeableConcept();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CODING:
				return getPatternCoding();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CONTACT_POINT:
				return getPatternContactPoint();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_COUNT:
				return getPatternCount();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DISTANCE:
				return getPatternDistance();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DURATION:
				return getPatternDuration();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_HUMAN_NAME:
				return getPatternHumanName();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_IDENTIFIER:
				return getPatternIdentifier();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_MONEY:
				return getPatternMoney();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_PERIOD:
				return getPatternPeriod();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_QUANTITY:
				return getPatternQuantity();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_RANGE:
				return getPatternRange();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_RATIO:
				return getPatternRatio();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_REFERENCE:
				return getPatternReference();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_SAMPLED_DATA:
				return getPatternSampledData();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_SIGNATURE:
				return getPatternSignature();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_TIMING:
				return getPatternTiming();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CONTACT_DETAIL:
				return getPatternContactDetail();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CONTRIBUTOR:
				return getPatternContributor();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DATA_REQUIREMENT:
				return getPatternDataRequirement();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_EXPRESSION:
				return getPatternExpression();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_PARAMETER_DEFINITION:
				return getPatternParameterDefinition();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_RELATED_ARTIFACT:
				return getPatternRelatedArtifact();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_TRIGGER_DEFINITION:
				return getPatternTriggerDefinition();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_USAGE_CONTEXT:
				return getPatternUsageContext();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DOSAGE:
				return getPatternDosage();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_META:
				return getPatternMeta();
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE:
				return getExample();
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DATE:
				return getMinValueDate();
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DATE_TIME:
				return getMinValueDateTime();
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_INSTANT:
				return getMinValueInstant();
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_TIME:
				return getMinValueTime();
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DECIMAL:
				return getMinValueDecimal();
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_INTEGER:
				return getMinValueInteger();
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_POSITIVE_INT:
				return getMinValuePositiveInt();
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_UNSIGNED_INT:
				return getMinValueUnsignedInt();
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_QUANTITY:
				return getMinValueQuantity();
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DATE:
				return getMaxValueDate();
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DATE_TIME:
				return getMaxValueDateTime();
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_INSTANT:
				return getMaxValueInstant();
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_TIME:
				return getMaxValueTime();
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DECIMAL:
				return getMaxValueDecimal();
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_INTEGER:
				return getMaxValueInteger();
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_POSITIVE_INT:
				return getMaxValuePositiveInt();
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_UNSIGNED_INT:
				return getMaxValueUnsignedInt();
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_QUANTITY:
				return getMaxValueQuantity();
			case FhirPackage.ELEMENT_DEFINITION__MAX_LENGTH:
				return getMaxLength();
			case FhirPackage.ELEMENT_DEFINITION__CONDITION:
				return getCondition();
			case FhirPackage.ELEMENT_DEFINITION__CONSTRAINT:
				return getConstraint();
			case FhirPackage.ELEMENT_DEFINITION__MUST_SUPPORT:
				return getMustSupport();
			case FhirPackage.ELEMENT_DEFINITION__IS_MODIFIER:
				return getIsModifier();
			case FhirPackage.ELEMENT_DEFINITION__IS_MODIFIER_REASON:
				return getIsModifierReason();
			case FhirPackage.ELEMENT_DEFINITION__IS_SUMMARY:
				return getIsSummary();
			case FhirPackage.ELEMENT_DEFINITION__BINDING:
				return getBinding();
			case FhirPackage.ELEMENT_DEFINITION__MAPPING:
				return getMapping();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.ELEMENT_DEFINITION__PATH:
				setPath((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__REPRESENTATION:
				getRepresentation().clear();
				getRepresentation().addAll((Collection<? extends PropertyRepresentation>)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__SLICE_NAME:
				setSliceName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__SLICE_IS_CONSTRAINING:
				setSliceIsConstraining((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__LABEL:
				setLabel((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__SLICING:
				setSlicing((ElementDefinitionSlicing)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__SHORT:
				setShort((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFINITION:
				setDefinition((Markdown)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__COMMENT:
				setComment((Markdown)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__REQUIREMENTS:
				setRequirements((Markdown)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__ALIAS:
				getAlias().clear();
				getAlias().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN:
				setMin((UnsignedInt)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX:
				setMax((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__BASE:
				setBase((ElementDefinitionBase)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__CONTENT_REFERENCE:
				setContentReference((Uri)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends ElementDefinitionType>)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_BASE64_BINARY:
				setDefaultValueBase64Binary((Base64Binary)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_BOOLEAN:
				setDefaultValueBoolean((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CANONICAL:
				setDefaultValueCanonical((Canonical)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODE:
				setDefaultValueCode((Code)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DATE:
				setDefaultValueDate((Date)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DATE_TIME:
				setDefaultValueDateTime((DateTime)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DECIMAL:
				setDefaultValueDecimal((Decimal)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ID:
				setDefaultValueId((Id)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_INSTANT:
				setDefaultValueInstant((Instant)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_INTEGER:
				setDefaultValueInteger((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_MARKDOWN:
				setDefaultValueMarkdown((Markdown)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_OID:
				setDefaultValueOid((Oid)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_POSITIVE_INT:
				setDefaultValuePositiveInt((PositiveInt)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_STRING:
				setDefaultValueString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_TIME:
				setDefaultValueTime((Time)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_UNSIGNED_INT:
				setDefaultValueUnsignedInt((UnsignedInt)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_URI:
				setDefaultValueUri((Uri)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_URL:
				setDefaultValueUrl((Url)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_UUID:
				setDefaultValueUuid((Uuid)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ADDRESS:
				setDefaultValueAddress((Address)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_AGE:
				setDefaultValueAge((Age)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ANNOTATION:
				setDefaultValueAnnotation((Annotation)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ATTACHMENT:
				setDefaultValueAttachment((Attachment)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODEABLE_CONCEPT:
				setDefaultValueCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODING:
				setDefaultValueCoding((Coding)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CONTACT_POINT:
				setDefaultValueContactPoint((ContactPoint)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_COUNT:
				setDefaultValueCount((Count)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DISTANCE:
				setDefaultValueDistance((Distance)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DURATION:
				setDefaultValueDuration((Duration)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_HUMAN_NAME:
				setDefaultValueHumanName((HumanName)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_IDENTIFIER:
				setDefaultValueIdentifier((Identifier)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_MONEY:
				setDefaultValueMoney((Money)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_PERIOD:
				setDefaultValuePeriod((Period)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_QUANTITY:
				setDefaultValueQuantity((Quantity)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_RANGE:
				setDefaultValueRange((Range)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_RATIO:
				setDefaultValueRatio((Ratio)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_REFERENCE:
				setDefaultValueReference((Reference)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_SAMPLED_DATA:
				setDefaultValueSampledData((SampledData)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_SIGNATURE:
				setDefaultValueSignature((Signature)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_TIMING:
				setDefaultValueTiming((Timing)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CONTACT_DETAIL:
				setDefaultValueContactDetail((ContactDetail)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CONTRIBUTOR:
				setDefaultValueContributor((Contributor)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DATA_REQUIREMENT:
				setDefaultValueDataRequirement((DataRequirement)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_EXPRESSION:
				setDefaultValueExpression((Expression)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_PARAMETER_DEFINITION:
				setDefaultValueParameterDefinition((ParameterDefinition)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_RELATED_ARTIFACT:
				setDefaultValueRelatedArtifact((RelatedArtifact)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_TRIGGER_DEFINITION:
				setDefaultValueTriggerDefinition((TriggerDefinition)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_USAGE_CONTEXT:
				setDefaultValueUsageContext((UsageContext)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DOSAGE:
				setDefaultValueDosage((Dosage)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_META:
				setDefaultValueMeta((Meta)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MEANING_WHEN_MISSING:
				setMeaningWhenMissing((Markdown)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__ORDER_MEANING:
				setOrderMeaning((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_BASE64_BINARY:
				setFixedBase64Binary((Base64Binary)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_BOOLEAN:
				setFixedBoolean((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CANONICAL:
				setFixedCanonical((Canonical)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CODE:
				setFixedCode((Code)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DATE:
				setFixedDate((Date)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DATE_TIME:
				setFixedDateTime((DateTime)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DECIMAL:
				setFixedDecimal((Decimal)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_ID:
				setFixedId((Id)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_INSTANT:
				setFixedInstant((Instant)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_INTEGER:
				setFixedInteger((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_MARKDOWN:
				setFixedMarkdown((Markdown)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_OID:
				setFixedOid((Oid)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_POSITIVE_INT:
				setFixedPositiveInt((PositiveInt)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_STRING:
				setFixedString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_TIME:
				setFixedTime((Time)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_UNSIGNED_INT:
				setFixedUnsignedInt((UnsignedInt)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_URI:
				setFixedUri((Uri)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_URL:
				setFixedUrl((Url)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_UUID:
				setFixedUuid((Uuid)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_ADDRESS:
				setFixedAddress((Address)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_AGE:
				setFixedAge((Age)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_ANNOTATION:
				setFixedAnnotation((Annotation)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_ATTACHMENT:
				setFixedAttachment((Attachment)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CODEABLE_CONCEPT:
				setFixedCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CODING:
				setFixedCoding((Coding)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CONTACT_POINT:
				setFixedContactPoint((ContactPoint)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_COUNT:
				setFixedCount((Count)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DISTANCE:
				setFixedDistance((Distance)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DURATION:
				setFixedDuration((Duration)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_HUMAN_NAME:
				setFixedHumanName((HumanName)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_IDENTIFIER:
				setFixedIdentifier((Identifier)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_MONEY:
				setFixedMoney((Money)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_PERIOD:
				setFixedPeriod((Period)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_QUANTITY:
				setFixedQuantity((Quantity)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_RANGE:
				setFixedRange((Range)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_RATIO:
				setFixedRatio((Ratio)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_REFERENCE:
				setFixedReference((Reference)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_SAMPLED_DATA:
				setFixedSampledData((SampledData)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_SIGNATURE:
				setFixedSignature((Signature)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_TIMING:
				setFixedTiming((Timing)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CONTACT_DETAIL:
				setFixedContactDetail((ContactDetail)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CONTRIBUTOR:
				setFixedContributor((Contributor)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DATA_REQUIREMENT:
				setFixedDataRequirement((DataRequirement)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_EXPRESSION:
				setFixedExpression((Expression)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_PARAMETER_DEFINITION:
				setFixedParameterDefinition((ParameterDefinition)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_RELATED_ARTIFACT:
				setFixedRelatedArtifact((RelatedArtifact)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_TRIGGER_DEFINITION:
				setFixedTriggerDefinition((TriggerDefinition)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_USAGE_CONTEXT:
				setFixedUsageContext((UsageContext)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DOSAGE:
				setFixedDosage((Dosage)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_META:
				setFixedMeta((Meta)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_BASE64_BINARY:
				setPatternBase64Binary((Base64Binary)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_BOOLEAN:
				setPatternBoolean((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CANONICAL:
				setPatternCanonical((Canonical)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CODE:
				setPatternCode((Code)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DATE:
				setPatternDate((Date)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DATE_TIME:
				setPatternDateTime((DateTime)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DECIMAL:
				setPatternDecimal((Decimal)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_ID:
				setPatternId((Id)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_INSTANT:
				setPatternInstant((Instant)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_INTEGER:
				setPatternInteger((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_MARKDOWN:
				setPatternMarkdown((Markdown)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_OID:
				setPatternOid((Oid)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_POSITIVE_INT:
				setPatternPositiveInt((PositiveInt)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_STRING:
				setPatternString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_TIME:
				setPatternTime((Time)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_UNSIGNED_INT:
				setPatternUnsignedInt((UnsignedInt)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_URI:
				setPatternUri((Uri)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_URL:
				setPatternUrl((Url)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_UUID:
				setPatternUuid((Uuid)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_ADDRESS:
				setPatternAddress((Address)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_AGE:
				setPatternAge((Age)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_ANNOTATION:
				setPatternAnnotation((Annotation)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_ATTACHMENT:
				setPatternAttachment((Attachment)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CODEABLE_CONCEPT:
				setPatternCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CODING:
				setPatternCoding((Coding)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CONTACT_POINT:
				setPatternContactPoint((ContactPoint)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_COUNT:
				setPatternCount((Count)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DISTANCE:
				setPatternDistance((Distance)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DURATION:
				setPatternDuration((Duration)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_HUMAN_NAME:
				setPatternHumanName((HumanName)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_IDENTIFIER:
				setPatternIdentifier((Identifier)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_MONEY:
				setPatternMoney((Money)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_PERIOD:
				setPatternPeriod((Period)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_QUANTITY:
				setPatternQuantity((Quantity)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_RANGE:
				setPatternRange((Range)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_RATIO:
				setPatternRatio((Ratio)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_REFERENCE:
				setPatternReference((Reference)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_SAMPLED_DATA:
				setPatternSampledData((SampledData)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_SIGNATURE:
				setPatternSignature((Signature)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_TIMING:
				setPatternTiming((Timing)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CONTACT_DETAIL:
				setPatternContactDetail((ContactDetail)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CONTRIBUTOR:
				setPatternContributor((Contributor)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DATA_REQUIREMENT:
				setPatternDataRequirement((DataRequirement)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_EXPRESSION:
				setPatternExpression((Expression)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_PARAMETER_DEFINITION:
				setPatternParameterDefinition((ParameterDefinition)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_RELATED_ARTIFACT:
				setPatternRelatedArtifact((RelatedArtifact)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_TRIGGER_DEFINITION:
				setPatternTriggerDefinition((TriggerDefinition)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_USAGE_CONTEXT:
				setPatternUsageContext((UsageContext)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DOSAGE:
				setPatternDosage((Dosage)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_META:
				setPatternMeta((Meta)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE:
				getExample().clear();
				getExample().addAll((Collection<? extends ElementDefinitionExample>)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DATE:
				setMinValueDate((Date)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DATE_TIME:
				setMinValueDateTime((DateTime)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_INSTANT:
				setMinValueInstant((Instant)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_TIME:
				setMinValueTime((Time)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DECIMAL:
				setMinValueDecimal((Decimal)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_INTEGER:
				setMinValueInteger((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_POSITIVE_INT:
				setMinValuePositiveInt((PositiveInt)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_UNSIGNED_INT:
				setMinValueUnsignedInt((UnsignedInt)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_QUANTITY:
				setMinValueQuantity((Quantity)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DATE:
				setMaxValueDate((Date)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DATE_TIME:
				setMaxValueDateTime((DateTime)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_INSTANT:
				setMaxValueInstant((Instant)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_TIME:
				setMaxValueTime((Time)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DECIMAL:
				setMaxValueDecimal((Decimal)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_INTEGER:
				setMaxValueInteger((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_POSITIVE_INT:
				setMaxValuePositiveInt((PositiveInt)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_UNSIGNED_INT:
				setMaxValueUnsignedInt((UnsignedInt)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_QUANTITY:
				setMaxValueQuantity((Quantity)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_LENGTH:
				setMaxLength((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__CONDITION:
				getCondition().clear();
				getCondition().addAll((Collection<? extends Id>)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__CONSTRAINT:
				getConstraint().clear();
				getConstraint().addAll((Collection<? extends ElementDefinitionConstraint>)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MUST_SUPPORT:
				setMustSupport((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__IS_MODIFIER:
				setIsModifier((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__IS_MODIFIER_REASON:
				setIsModifierReason((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__IS_SUMMARY:
				setIsSummary((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__BINDING:
				setBinding((ElementDefinitionBinding)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAPPING:
				getMapping().clear();
				getMapping().addAll((Collection<? extends ElementDefinitionMapping>)newValue);
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
			case FhirPackage.ELEMENT_DEFINITION__PATH:
				setPath((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__REPRESENTATION:
				getRepresentation().clear();
				return;
			case FhirPackage.ELEMENT_DEFINITION__SLICE_NAME:
				setSliceName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__SLICE_IS_CONSTRAINING:
				setSliceIsConstraining((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__LABEL:
				setLabel((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__CODE:
				getCode().clear();
				return;
			case FhirPackage.ELEMENT_DEFINITION__SLICING:
				setSlicing((ElementDefinitionSlicing)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__SHORT:
				setShort((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFINITION:
				setDefinition((Markdown)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__COMMENT:
				setComment((Markdown)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__REQUIREMENTS:
				setRequirements((Markdown)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__ALIAS:
				getAlias().clear();
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN:
				setMin((UnsignedInt)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX:
				setMax((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__BASE:
				setBase((ElementDefinitionBase)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__CONTENT_REFERENCE:
				setContentReference((Uri)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__TYPE:
				getType().clear();
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_BASE64_BINARY:
				setDefaultValueBase64Binary((Base64Binary)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_BOOLEAN:
				setDefaultValueBoolean((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CANONICAL:
				setDefaultValueCanonical((Canonical)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODE:
				setDefaultValueCode((Code)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DATE:
				setDefaultValueDate((Date)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DATE_TIME:
				setDefaultValueDateTime((DateTime)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DECIMAL:
				setDefaultValueDecimal((Decimal)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ID:
				setDefaultValueId((Id)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_INSTANT:
				setDefaultValueInstant((Instant)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_INTEGER:
				setDefaultValueInteger((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_MARKDOWN:
				setDefaultValueMarkdown((Markdown)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_OID:
				setDefaultValueOid((Oid)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_POSITIVE_INT:
				setDefaultValuePositiveInt((PositiveInt)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_STRING:
				setDefaultValueString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_TIME:
				setDefaultValueTime((Time)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_UNSIGNED_INT:
				setDefaultValueUnsignedInt((UnsignedInt)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_URI:
				setDefaultValueUri((Uri)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_URL:
				setDefaultValueUrl((Url)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_UUID:
				setDefaultValueUuid((Uuid)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ADDRESS:
				setDefaultValueAddress((Address)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_AGE:
				setDefaultValueAge((Age)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ANNOTATION:
				setDefaultValueAnnotation((Annotation)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ATTACHMENT:
				setDefaultValueAttachment((Attachment)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODEABLE_CONCEPT:
				setDefaultValueCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODING:
				setDefaultValueCoding((Coding)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CONTACT_POINT:
				setDefaultValueContactPoint((ContactPoint)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_COUNT:
				setDefaultValueCount((Count)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DISTANCE:
				setDefaultValueDistance((Distance)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DURATION:
				setDefaultValueDuration((Duration)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_HUMAN_NAME:
				setDefaultValueHumanName((HumanName)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_IDENTIFIER:
				setDefaultValueIdentifier((Identifier)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_MONEY:
				setDefaultValueMoney((Money)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_PERIOD:
				setDefaultValuePeriod((Period)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_QUANTITY:
				setDefaultValueQuantity((Quantity)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_RANGE:
				setDefaultValueRange((Range)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_RATIO:
				setDefaultValueRatio((Ratio)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_REFERENCE:
				setDefaultValueReference((Reference)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_SAMPLED_DATA:
				setDefaultValueSampledData((SampledData)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_SIGNATURE:
				setDefaultValueSignature((Signature)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_TIMING:
				setDefaultValueTiming((Timing)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CONTACT_DETAIL:
				setDefaultValueContactDetail((ContactDetail)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CONTRIBUTOR:
				setDefaultValueContributor((Contributor)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DATA_REQUIREMENT:
				setDefaultValueDataRequirement((DataRequirement)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_EXPRESSION:
				setDefaultValueExpression((Expression)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_PARAMETER_DEFINITION:
				setDefaultValueParameterDefinition((ParameterDefinition)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_RELATED_ARTIFACT:
				setDefaultValueRelatedArtifact((RelatedArtifact)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_TRIGGER_DEFINITION:
				setDefaultValueTriggerDefinition((TriggerDefinition)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_USAGE_CONTEXT:
				setDefaultValueUsageContext((UsageContext)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DOSAGE:
				setDefaultValueDosage((Dosage)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_META:
				setDefaultValueMeta((Meta)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MEANING_WHEN_MISSING:
				setMeaningWhenMissing((Markdown)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__ORDER_MEANING:
				setOrderMeaning((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_BASE64_BINARY:
				setFixedBase64Binary((Base64Binary)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_BOOLEAN:
				setFixedBoolean((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CANONICAL:
				setFixedCanonical((Canonical)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CODE:
				setFixedCode((Code)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DATE:
				setFixedDate((Date)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DATE_TIME:
				setFixedDateTime((DateTime)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DECIMAL:
				setFixedDecimal((Decimal)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_ID:
				setFixedId((Id)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_INSTANT:
				setFixedInstant((Instant)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_INTEGER:
				setFixedInteger((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_MARKDOWN:
				setFixedMarkdown((Markdown)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_OID:
				setFixedOid((Oid)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_POSITIVE_INT:
				setFixedPositiveInt((PositiveInt)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_STRING:
				setFixedString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_TIME:
				setFixedTime((Time)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_UNSIGNED_INT:
				setFixedUnsignedInt((UnsignedInt)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_URI:
				setFixedUri((Uri)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_URL:
				setFixedUrl((Url)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_UUID:
				setFixedUuid((Uuid)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_ADDRESS:
				setFixedAddress((Address)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_AGE:
				setFixedAge((Age)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_ANNOTATION:
				setFixedAnnotation((Annotation)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_ATTACHMENT:
				setFixedAttachment((Attachment)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CODEABLE_CONCEPT:
				setFixedCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CODING:
				setFixedCoding((Coding)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CONTACT_POINT:
				setFixedContactPoint((ContactPoint)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_COUNT:
				setFixedCount((Count)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DISTANCE:
				setFixedDistance((Distance)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DURATION:
				setFixedDuration((Duration)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_HUMAN_NAME:
				setFixedHumanName((HumanName)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_IDENTIFIER:
				setFixedIdentifier((Identifier)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_MONEY:
				setFixedMoney((Money)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_PERIOD:
				setFixedPeriod((Period)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_QUANTITY:
				setFixedQuantity((Quantity)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_RANGE:
				setFixedRange((Range)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_RATIO:
				setFixedRatio((Ratio)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_REFERENCE:
				setFixedReference((Reference)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_SAMPLED_DATA:
				setFixedSampledData((SampledData)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_SIGNATURE:
				setFixedSignature((Signature)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_TIMING:
				setFixedTiming((Timing)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CONTACT_DETAIL:
				setFixedContactDetail((ContactDetail)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CONTRIBUTOR:
				setFixedContributor((Contributor)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DATA_REQUIREMENT:
				setFixedDataRequirement((DataRequirement)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_EXPRESSION:
				setFixedExpression((Expression)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_PARAMETER_DEFINITION:
				setFixedParameterDefinition((ParameterDefinition)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_RELATED_ARTIFACT:
				setFixedRelatedArtifact((RelatedArtifact)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_TRIGGER_DEFINITION:
				setFixedTriggerDefinition((TriggerDefinition)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_USAGE_CONTEXT:
				setFixedUsageContext((UsageContext)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DOSAGE:
				setFixedDosage((Dosage)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_META:
				setFixedMeta((Meta)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_BASE64_BINARY:
				setPatternBase64Binary((Base64Binary)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_BOOLEAN:
				setPatternBoolean((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CANONICAL:
				setPatternCanonical((Canonical)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CODE:
				setPatternCode((Code)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DATE:
				setPatternDate((Date)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DATE_TIME:
				setPatternDateTime((DateTime)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DECIMAL:
				setPatternDecimal((Decimal)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_ID:
				setPatternId((Id)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_INSTANT:
				setPatternInstant((Instant)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_INTEGER:
				setPatternInteger((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_MARKDOWN:
				setPatternMarkdown((Markdown)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_OID:
				setPatternOid((Oid)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_POSITIVE_INT:
				setPatternPositiveInt((PositiveInt)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_STRING:
				setPatternString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_TIME:
				setPatternTime((Time)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_UNSIGNED_INT:
				setPatternUnsignedInt((UnsignedInt)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_URI:
				setPatternUri((Uri)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_URL:
				setPatternUrl((Url)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_UUID:
				setPatternUuid((Uuid)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_ADDRESS:
				setPatternAddress((Address)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_AGE:
				setPatternAge((Age)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_ANNOTATION:
				setPatternAnnotation((Annotation)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_ATTACHMENT:
				setPatternAttachment((Attachment)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CODEABLE_CONCEPT:
				setPatternCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CODING:
				setPatternCoding((Coding)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CONTACT_POINT:
				setPatternContactPoint((ContactPoint)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_COUNT:
				setPatternCount((Count)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DISTANCE:
				setPatternDistance((Distance)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DURATION:
				setPatternDuration((Duration)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_HUMAN_NAME:
				setPatternHumanName((HumanName)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_IDENTIFIER:
				setPatternIdentifier((Identifier)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_MONEY:
				setPatternMoney((Money)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_PERIOD:
				setPatternPeriod((Period)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_QUANTITY:
				setPatternQuantity((Quantity)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_RANGE:
				setPatternRange((Range)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_RATIO:
				setPatternRatio((Ratio)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_REFERENCE:
				setPatternReference((Reference)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_SAMPLED_DATA:
				setPatternSampledData((SampledData)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_SIGNATURE:
				setPatternSignature((Signature)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_TIMING:
				setPatternTiming((Timing)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CONTACT_DETAIL:
				setPatternContactDetail((ContactDetail)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CONTRIBUTOR:
				setPatternContributor((Contributor)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DATA_REQUIREMENT:
				setPatternDataRequirement((DataRequirement)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_EXPRESSION:
				setPatternExpression((Expression)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_PARAMETER_DEFINITION:
				setPatternParameterDefinition((ParameterDefinition)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_RELATED_ARTIFACT:
				setPatternRelatedArtifact((RelatedArtifact)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_TRIGGER_DEFINITION:
				setPatternTriggerDefinition((TriggerDefinition)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_USAGE_CONTEXT:
				setPatternUsageContext((UsageContext)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DOSAGE:
				setPatternDosage((Dosage)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_META:
				setPatternMeta((Meta)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE:
				getExample().clear();
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DATE:
				setMinValueDate((Date)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DATE_TIME:
				setMinValueDateTime((DateTime)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_INSTANT:
				setMinValueInstant((Instant)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_TIME:
				setMinValueTime((Time)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DECIMAL:
				setMinValueDecimal((Decimal)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_INTEGER:
				setMinValueInteger((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_POSITIVE_INT:
				setMinValuePositiveInt((PositiveInt)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_UNSIGNED_INT:
				setMinValueUnsignedInt((UnsignedInt)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_QUANTITY:
				setMinValueQuantity((Quantity)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DATE:
				setMaxValueDate((Date)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DATE_TIME:
				setMaxValueDateTime((DateTime)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_INSTANT:
				setMaxValueInstant((Instant)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_TIME:
				setMaxValueTime((Time)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DECIMAL:
				setMaxValueDecimal((Decimal)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_INTEGER:
				setMaxValueInteger((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_POSITIVE_INT:
				setMaxValuePositiveInt((PositiveInt)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_UNSIGNED_INT:
				setMaxValueUnsignedInt((UnsignedInt)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_QUANTITY:
				setMaxValueQuantity((Quantity)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_LENGTH:
				setMaxLength((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__CONDITION:
				getCondition().clear();
				return;
			case FhirPackage.ELEMENT_DEFINITION__CONSTRAINT:
				getConstraint().clear();
				return;
			case FhirPackage.ELEMENT_DEFINITION__MUST_SUPPORT:
				setMustSupport((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__IS_MODIFIER:
				setIsModifier((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__IS_MODIFIER_REASON:
				setIsModifierReason((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__IS_SUMMARY:
				setIsSummary((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__BINDING:
				setBinding((ElementDefinitionBinding)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAPPING:
				getMapping().clear();
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
			case FhirPackage.ELEMENT_DEFINITION__PATH:
				return path != null;
			case FhirPackage.ELEMENT_DEFINITION__REPRESENTATION:
				return representation != null && !representation.isEmpty();
			case FhirPackage.ELEMENT_DEFINITION__SLICE_NAME:
				return sliceName != null;
			case FhirPackage.ELEMENT_DEFINITION__SLICE_IS_CONSTRAINING:
				return sliceIsConstraining != null;
			case FhirPackage.ELEMENT_DEFINITION__LABEL:
				return label != null;
			case FhirPackage.ELEMENT_DEFINITION__CODE:
				return code != null && !code.isEmpty();
			case FhirPackage.ELEMENT_DEFINITION__SLICING:
				return slicing != null;
			case FhirPackage.ELEMENT_DEFINITION__SHORT:
				return short_ != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFINITION:
				return definition != null;
			case FhirPackage.ELEMENT_DEFINITION__COMMENT:
				return comment != null;
			case FhirPackage.ELEMENT_DEFINITION__REQUIREMENTS:
				return requirements != null;
			case FhirPackage.ELEMENT_DEFINITION__ALIAS:
				return alias != null && !alias.isEmpty();
			case FhirPackage.ELEMENT_DEFINITION__MIN:
				return min != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX:
				return max != null;
			case FhirPackage.ELEMENT_DEFINITION__BASE:
				return base != null;
			case FhirPackage.ELEMENT_DEFINITION__CONTENT_REFERENCE:
				return contentReference != null;
			case FhirPackage.ELEMENT_DEFINITION__TYPE:
				return type != null && !type.isEmpty();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_BASE64_BINARY:
				return defaultValueBase64Binary != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_BOOLEAN:
				return defaultValueBoolean != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CANONICAL:
				return defaultValueCanonical != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODE:
				return defaultValueCode != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DATE:
				return defaultValueDate != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DATE_TIME:
				return defaultValueDateTime != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DECIMAL:
				return defaultValueDecimal != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ID:
				return defaultValueId != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_INSTANT:
				return defaultValueInstant != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_INTEGER:
				return defaultValueInteger != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_MARKDOWN:
				return defaultValueMarkdown != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_OID:
				return defaultValueOid != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_POSITIVE_INT:
				return defaultValuePositiveInt != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_STRING:
				return defaultValueString != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_TIME:
				return defaultValueTime != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_UNSIGNED_INT:
				return defaultValueUnsignedInt != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_URI:
				return defaultValueUri != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_URL:
				return defaultValueUrl != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_UUID:
				return defaultValueUuid != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ADDRESS:
				return defaultValueAddress != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_AGE:
				return defaultValueAge != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ANNOTATION:
				return defaultValueAnnotation != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ATTACHMENT:
				return defaultValueAttachment != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODEABLE_CONCEPT:
				return defaultValueCodeableConcept != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODING:
				return defaultValueCoding != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CONTACT_POINT:
				return defaultValueContactPoint != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_COUNT:
				return defaultValueCount != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DISTANCE:
				return defaultValueDistance != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DURATION:
				return defaultValueDuration != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_HUMAN_NAME:
				return defaultValueHumanName != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_IDENTIFIER:
				return defaultValueIdentifier != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_MONEY:
				return defaultValueMoney != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_PERIOD:
				return defaultValuePeriod != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_QUANTITY:
				return defaultValueQuantity != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_RANGE:
				return defaultValueRange != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_RATIO:
				return defaultValueRatio != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_REFERENCE:
				return defaultValueReference != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_SAMPLED_DATA:
				return defaultValueSampledData != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_SIGNATURE:
				return defaultValueSignature != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_TIMING:
				return defaultValueTiming != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CONTACT_DETAIL:
				return defaultValueContactDetail != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CONTRIBUTOR:
				return defaultValueContributor != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DATA_REQUIREMENT:
				return defaultValueDataRequirement != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_EXPRESSION:
				return defaultValueExpression != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_PARAMETER_DEFINITION:
				return defaultValueParameterDefinition != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_RELATED_ARTIFACT:
				return defaultValueRelatedArtifact != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_TRIGGER_DEFINITION:
				return defaultValueTriggerDefinition != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_USAGE_CONTEXT:
				return defaultValueUsageContext != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DOSAGE:
				return defaultValueDosage != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_META:
				return defaultValueMeta != null;
			case FhirPackage.ELEMENT_DEFINITION__MEANING_WHEN_MISSING:
				return meaningWhenMissing != null;
			case FhirPackage.ELEMENT_DEFINITION__ORDER_MEANING:
				return orderMeaning != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_BASE64_BINARY:
				return fixedBase64Binary != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_BOOLEAN:
				return fixedBoolean != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CANONICAL:
				return fixedCanonical != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CODE:
				return fixedCode != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DATE:
				return fixedDate != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DATE_TIME:
				return fixedDateTime != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DECIMAL:
				return fixedDecimal != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_ID:
				return fixedId != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_INSTANT:
				return fixedInstant != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_INTEGER:
				return fixedInteger != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_MARKDOWN:
				return fixedMarkdown != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_OID:
				return fixedOid != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_POSITIVE_INT:
				return fixedPositiveInt != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_STRING:
				return fixedString != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_TIME:
				return fixedTime != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_UNSIGNED_INT:
				return fixedUnsignedInt != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_URI:
				return fixedUri != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_URL:
				return fixedUrl != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_UUID:
				return fixedUuid != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_ADDRESS:
				return fixedAddress != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_AGE:
				return fixedAge != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_ANNOTATION:
				return fixedAnnotation != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_ATTACHMENT:
				return fixedAttachment != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CODEABLE_CONCEPT:
				return fixedCodeableConcept != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CODING:
				return fixedCoding != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CONTACT_POINT:
				return fixedContactPoint != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_COUNT:
				return fixedCount != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DISTANCE:
				return fixedDistance != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DURATION:
				return fixedDuration != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_HUMAN_NAME:
				return fixedHumanName != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_IDENTIFIER:
				return fixedIdentifier != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_MONEY:
				return fixedMoney != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_PERIOD:
				return fixedPeriod != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_QUANTITY:
				return fixedQuantity != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_RANGE:
				return fixedRange != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_RATIO:
				return fixedRatio != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_REFERENCE:
				return fixedReference != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_SAMPLED_DATA:
				return fixedSampledData != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_SIGNATURE:
				return fixedSignature != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_TIMING:
				return fixedTiming != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CONTACT_DETAIL:
				return fixedContactDetail != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CONTRIBUTOR:
				return fixedContributor != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DATA_REQUIREMENT:
				return fixedDataRequirement != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_EXPRESSION:
				return fixedExpression != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_PARAMETER_DEFINITION:
				return fixedParameterDefinition != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_RELATED_ARTIFACT:
				return fixedRelatedArtifact != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_TRIGGER_DEFINITION:
				return fixedTriggerDefinition != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_USAGE_CONTEXT:
				return fixedUsageContext != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DOSAGE:
				return fixedDosage != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_META:
				return fixedMeta != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_BASE64_BINARY:
				return patternBase64Binary != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_BOOLEAN:
				return patternBoolean != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CANONICAL:
				return patternCanonical != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CODE:
				return patternCode != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DATE:
				return patternDate != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DATE_TIME:
				return patternDateTime != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DECIMAL:
				return patternDecimal != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_ID:
				return patternId != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_INSTANT:
				return patternInstant != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_INTEGER:
				return patternInteger != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_MARKDOWN:
				return patternMarkdown != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_OID:
				return patternOid != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_POSITIVE_INT:
				return patternPositiveInt != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_STRING:
				return patternString != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_TIME:
				return patternTime != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_UNSIGNED_INT:
				return patternUnsignedInt != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_URI:
				return patternUri != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_URL:
				return patternUrl != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_UUID:
				return patternUuid != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_ADDRESS:
				return patternAddress != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_AGE:
				return patternAge != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_ANNOTATION:
				return patternAnnotation != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_ATTACHMENT:
				return patternAttachment != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CODEABLE_CONCEPT:
				return patternCodeableConcept != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CODING:
				return patternCoding != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CONTACT_POINT:
				return patternContactPoint != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_COUNT:
				return patternCount != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DISTANCE:
				return patternDistance != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DURATION:
				return patternDuration != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_HUMAN_NAME:
				return patternHumanName != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_IDENTIFIER:
				return patternIdentifier != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_MONEY:
				return patternMoney != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_PERIOD:
				return patternPeriod != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_QUANTITY:
				return patternQuantity != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_RANGE:
				return patternRange != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_RATIO:
				return patternRatio != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_REFERENCE:
				return patternReference != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_SAMPLED_DATA:
				return patternSampledData != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_SIGNATURE:
				return patternSignature != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_TIMING:
				return patternTiming != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CONTACT_DETAIL:
				return patternContactDetail != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CONTRIBUTOR:
				return patternContributor != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DATA_REQUIREMENT:
				return patternDataRequirement != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_EXPRESSION:
				return patternExpression != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_PARAMETER_DEFINITION:
				return patternParameterDefinition != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_RELATED_ARTIFACT:
				return patternRelatedArtifact != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_TRIGGER_DEFINITION:
				return patternTriggerDefinition != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_USAGE_CONTEXT:
				return patternUsageContext != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DOSAGE:
				return patternDosage != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_META:
				return patternMeta != null;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE:
				return example != null && !example.isEmpty();
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DATE:
				return minValueDate != null;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DATE_TIME:
				return minValueDateTime != null;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_INSTANT:
				return minValueInstant != null;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_TIME:
				return minValueTime != null;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DECIMAL:
				return minValueDecimal != null;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_INTEGER:
				return minValueInteger != null;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_POSITIVE_INT:
				return minValuePositiveInt != null;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_UNSIGNED_INT:
				return minValueUnsignedInt != null;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_QUANTITY:
				return minValueQuantity != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DATE:
				return maxValueDate != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DATE_TIME:
				return maxValueDateTime != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_INSTANT:
				return maxValueInstant != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_TIME:
				return maxValueTime != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DECIMAL:
				return maxValueDecimal != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_INTEGER:
				return maxValueInteger != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_POSITIVE_INT:
				return maxValuePositiveInt != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_UNSIGNED_INT:
				return maxValueUnsignedInt != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_QUANTITY:
				return maxValueQuantity != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX_LENGTH:
				return maxLength != null;
			case FhirPackage.ELEMENT_DEFINITION__CONDITION:
				return condition != null && !condition.isEmpty();
			case FhirPackage.ELEMENT_DEFINITION__CONSTRAINT:
				return constraint != null && !constraint.isEmpty();
			case FhirPackage.ELEMENT_DEFINITION__MUST_SUPPORT:
				return mustSupport != null;
			case FhirPackage.ELEMENT_DEFINITION__IS_MODIFIER:
				return isModifier != null;
			case FhirPackage.ELEMENT_DEFINITION__IS_MODIFIER_REASON:
				return isModifierReason != null;
			case FhirPackage.ELEMENT_DEFINITION__IS_SUMMARY:
				return isSummary != null;
			case FhirPackage.ELEMENT_DEFINITION__BINDING:
				return binding != null;
			case FhirPackage.ELEMENT_DEFINITION__MAPPING:
				return mapping != null && !mapping.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ElementDefinitionImpl
